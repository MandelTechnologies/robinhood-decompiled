package org.commonmark.node;

/* loaded from: classes23.dex */
public class ListItem extends Block {
    private Integer contentIndent;
    private Integer markerIndent;

    @Override // org.commonmark.node.Node
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void setMarkerIndent(Integer num) {
        this.markerIndent = num;
    }

    public void setContentIndent(Integer num) {
        this.contentIndent = num;
    }
}
