package org.commonmark.node;

/* loaded from: classes23.dex */
public class StrongEmphasis extends Node {
    private String delimiter;

    public StrongEmphasis() {
    }

    public StrongEmphasis(String str) {
        this.delimiter = str;
    }

    @Override // org.commonmark.node.Node
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
