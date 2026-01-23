package org.commonmark.internal.inline;

import org.commonmark.node.Node;
import org.commonmark.parser.beta.Position;

/* loaded from: classes23.dex */
public abstract class ParsedInline {
    public static ParsedInline none() {
        return null;
    }

    protected ParsedInline() {
    }

    /* renamed from: of */
    public static ParsedInline m3982of(Node node, Position position) {
        if (node == null) {
            throw new NullPointerException("node must not be null");
        }
        if (position == null) {
            throw new NullPointerException("position must not be null");
        }
        return new ParsedInlineImpl(node, position);
    }
}
