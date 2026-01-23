package com.robinhood.android.markdown.elements;

import io.noties.markwon.MarkwonVisitor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UnderlineNodeVisitor.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/markdown/elements/UnderlineNodeVisitor;", "Lio/noties/markwon/MarkwonVisitor$NodeVisitor;", "Lcom/robinhood/android/markdown/elements/Underline;", "<init>", "()V", "visit", "", "visitor", "Lio/noties/markwon/MarkwonVisitor;", "node", "lib-markdown_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class UnderlineNodeVisitor implements MarkwonVisitor.NodeVisitor<Underline> {
    public static final UnderlineNodeVisitor INSTANCE = new UnderlineNodeVisitor();

    private UnderlineNodeVisitor() {
    }

    @Override // io.noties.markwon.MarkwonVisitor.NodeVisitor
    public void visit(MarkwonVisitor visitor, Underline node) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        Intrinsics.checkNotNullParameter(node, "node");
        int length = visitor.length();
        visitor.visitChildren(node);
        visitor.setSpansForNodeOptional(node, length);
    }
}
