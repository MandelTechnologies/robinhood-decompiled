package org.commonmark.node;

/* loaded from: classes23.dex */
public class HtmlBlock extends Block {
    private String literal;

    @Override // org.commonmark.node.Node
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void setLiteral(String str) {
        this.literal = str;
    }
}
