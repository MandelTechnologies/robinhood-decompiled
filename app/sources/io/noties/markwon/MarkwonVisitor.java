package io.noties.markwon;

import org.commonmark.node.Node;
import org.commonmark.node.Visitor;

/* loaded from: classes14.dex */
public interface MarkwonVisitor extends Visitor {

    public interface BlockHandler {
        void blockEnd(MarkwonVisitor markwonVisitor, Node node);

        void blockStart(MarkwonVisitor markwonVisitor, Node node);
    }

    public interface Builder {
        Builder blockHandler(BlockHandler blockHandler);

        MarkwonVisitor build(MarkwonConfiguration markwonConfiguration, RenderProps renderProps);

        /* renamed from: on */
        <N extends Node> Builder mo3341on(Class<N> cls, NodeVisitor<? super N> nodeVisitor);
    }

    public interface NodeVisitor<N extends Node> {
        void visit(MarkwonVisitor markwonVisitor, N n);
    }

    void blockEnd(Node node);

    void blockStart(Node node);

    SpannableBuilder builder();

    MarkwonConfiguration configuration();

    void ensureNewLine();

    void forceNewLine();

    boolean hasNext(Node node);

    int length();

    RenderProps renderProps();

    void setSpans(int i, Object obj);

    <N extends Node> void setSpansForNodeOptional(N n, int i);

    void visitChildren(Node node);
}
