package com.robinhood.android.markdown.elements;

import io.noties.markwon.AbstractMarkwonPlugin;
import io.noties.markwon.MarkwonVisitor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.commonmark.node.Heading;
import org.commonmark.node.Node;

/* compiled from: NoNewlineAfterHeaderMarkwonPlugin.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/markdown/elements/NoNewlineAfterHeaderMarkwonPlugin;", "Lio/noties/markwon/AbstractMarkwonPlugin;", "<init>", "()V", "configureVisitor", "", "builder", "Lio/noties/markwon/MarkwonVisitor$Builder;", "BlockHandlerNoAdditionalNewLines", "lib-markdown_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class NoNewlineAfterHeaderMarkwonPlugin extends AbstractMarkwonPlugin {
    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public void configureVisitor(MarkwonVisitor.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.blockHandler(new BlockHandlerNoAdditionalNewLines());
    }

    /* compiled from: NoNewlineAfterHeaderMarkwonPlugin.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/markdown/elements/NoNewlineAfterHeaderMarkwonPlugin$BlockHandlerNoAdditionalNewLines;", "Lio/noties/markwon/MarkwonVisitor$BlockHandler;", "<init>", "()V", "blockStart", "", "visitor", "Lio/noties/markwon/MarkwonVisitor;", "node", "Lorg/commonmark/node/Node;", "blockEnd", "lib-markdown_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class BlockHandlerNoAdditionalNewLines implements MarkwonVisitor.BlockHandler {
        @Override // io.noties.markwon.MarkwonVisitor.BlockHandler
        public void blockStart(MarkwonVisitor visitor, Node node) {
            Intrinsics.checkNotNullParameter(visitor, "visitor");
            Intrinsics.checkNotNullParameter(node, "node");
            visitor.ensureNewLine();
        }

        @Override // io.noties.markwon.MarkwonVisitor.BlockHandler
        public void blockEnd(MarkwonVisitor visitor, Node node) {
            Intrinsics.checkNotNullParameter(visitor, "visitor");
            Intrinsics.checkNotNullParameter(node, "node");
            if (visitor.hasNext(node)) {
                visitor.ensureNewLine();
                if (node instanceof Heading) {
                    return;
                }
                visitor.forceNewLine();
            }
        }
    }
}
