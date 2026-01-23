package com.robinhood.android.markdown.compose;

import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.commonmark.node.Link;
import org.commonmark.node.Node;

/* compiled from: CustomMarkdownParser.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH'¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/markdown/compose/CustomMarkdownParser;", "", "<init>", "()V", "annotate", "", "node", "Lorg/commonmark/node/Node;", "builder", "Landroidx/compose/ui/text/AnnotatedString$Builder;", "markdownStyle", "Lcom/robinhood/android/markdown/compose/MarkdownStyle;", "annotate$lib_markdown_compose_externalDebug", "(Lorg/commonmark/node/Node;Landroidx/compose/ui/text/AnnotatedString$Builder;Lcom/robinhood/android/markdown/compose/MarkdownStyle;Landroidx/compose/runtime/Composer;I)Z", "link", "Lorg/commonmark/node/Link;", "(Lorg/commonmark/node/Link;Landroidx/compose/ui/text/AnnotatedString$Builder;Lcom/robinhood/android/markdown/compose/MarkdownStyle;Landroidx/compose/runtime/Composer;I)Z", "lib-markdown-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public abstract class CustomMarkdownParser {
    public static final int $stable = 0;

    public abstract boolean link(Link link, AnnotatedString.Builder builder, MarkdownStyle markdownStyle, Composer composer, int i);

    public final boolean annotate$lib_markdown_compose_externalDebug(Node node, AnnotatedString.Builder builder, MarkdownStyle markdownStyle, Composer composer, int i) {
        Composer composer2;
        boolean zLink;
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(markdownStyle, "markdownStyle");
        composer.startReplaceGroup(1328056302);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1328056302, i, -1, "com.robinhood.android.markdown.compose.CustomMarkdownParser.annotate (CustomMarkdownParser.kt:27)");
        }
        if (node instanceof Link) {
            composer2 = composer;
            zLink = link((Link) node, builder, markdownStyle, composer2, (AnnotatedString.Builder.$stable << 3) | (i & 112) | (i & 896) | (i & 7168));
        } else {
            composer2 = composer;
            zLink = false;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer2.endReplaceGroup();
        return zLink;
    }
}
