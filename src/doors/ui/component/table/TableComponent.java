package doors.ui.component.table;

import java.util.Collection;

import doors.graphics.spritebatch.SpriteBatch;
import doors.ui.component.IComponent;
import doors.ui.component.border.DialogBorderComponent;
import doors.ui.component.border.DialogState;
import doors.ui.component.layout.BoxComponent;
import doors.ui.component.layout.PaddingComponent;
import doors.ui.component.layout.RowComponent;
import doors.ui.root.UIRoot;
import doors.utility.vector.Vector2in;

public class TableComponent<T extends IComponent> implements IComponent {

    private static int CONTENT_PADDING = 2;

    private TableRowsComponent<T> tableRowsComponent;
    private TableScrollBarComponent<T> tableScrollBarComponent;
    private DialogBorderComponent borderComponent;
    private TableState<T> tableState;

    public TableComponent(int numRows, int cellHeight) {
        this.tableState = new TableState<>(numRows);
        this.tableRowsComponent = new TableRowsComponent<>(this.tableState, cellHeight);
        this.tableScrollBarComponent = new TableScrollBarComponent<T>(this.tableState);

        var layoutComponent = new RowComponent(0);
        layoutComponent.children.add(new PaddingComponent(this.tableRowsComponent, CONTENT_PADDING));
        layoutComponent.children.add(this.tableScrollBarComponent);

        var spaceComponent = new BoxComponent(Vector2in.ZERO, Vector2in.MAX_X);
        spaceComponent.child = layoutComponent;
        this.borderComponent = new DialogBorderComponent(spaceComponent);
        this.borderComponent.state = DialogState.FOCUSED;
    }

    public Collection<T> getRows() {
        return this.tableState.rows;
    }

    @Override
    public Vector2in getDimensions() {
        return this.borderComponent.getDimensions();
    }

    @Override
    public Vector2in getPosition() {
        return this.borderComponent.getPosition();
    }

    @Override
    public void calculateDimensions() {
        this.borderComponent.calculateDimensions();
    }

    @Override
    public void adjustDimensions(Vector2in availableSpace) {
        this.borderComponent.adjustDimensions(availableSpace);
    }

    @Override
    public void calculatePosition(Vector2in origin) {
        this.borderComponent.calculatePosition(origin);
    }

    @Override
    public void update(UIRoot root) {
        this.borderComponent.update(root);
    }

    @Override
    public void writeComponentToSpriteBatch(SpriteBatch spriteBatch) {
        this.borderComponent.writeComponentToSpriteBatch(spriteBatch);
    }
    
}
