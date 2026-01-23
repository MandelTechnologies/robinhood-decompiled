package org.commonmark.node;

/* loaded from: classes25.dex */
public class HtmlInline extends Node {
    private String literal;

    @Override // org.commonmark.node.Node
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void setLiteral(String str) {
        this.literal = str;
    }
}
