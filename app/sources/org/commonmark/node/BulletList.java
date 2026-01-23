package org.commonmark.node;

/* loaded from: classes23.dex */
public class BulletList extends ListBlock {
    private String marker;

    @Override // org.commonmark.node.Node
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getMarker() {
        return this.marker;
    }

    public void setMarker(String str) {
        this.marker = str;
    }
}
