package org.commonmark.node;

/* loaded from: classes23.dex */
public class Emphasis extends Node {
    private String delimiter;

    public Emphasis() {
    }

    public Emphasis(String str) {
        this.delimiter = str;
    }

    @Override // org.commonmark.node.Node
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
