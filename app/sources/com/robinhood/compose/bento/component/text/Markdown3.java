package com.robinhood.compose.bento.component.text;

import android.text.Spanned;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import io.noties.markwon.Markwon;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Markdown.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\"\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"rememberMarkdown", "Landroid/text/Spanned;", "rawMarkdownText", "", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroid/text/Spanned;", "LocalMarkwon", "Lcom/robinhood/compose/bento/component/text/MarkwonCompositionLocal;", "getLocalMarkwon", "()Lcom/robinhood/compose/bento/component/text/MarkwonCompositionLocal;", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.text.MarkdownKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class Markdown3 {
    private static final Markdown4 LocalMarkwon = new Markdown4(null, 1, 0 == true ? 1 : 0);

    public static final Spanned rememberMarkdown(String rawMarkdownText, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rawMarkdownText, "rawMarkdownText");
        composer.startReplaceGroup(-1556517976);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1556517976, i, -1, "com.robinhood.compose.bento.component.text.rememberMarkdown (Markdown.kt:21)");
        }
        Markwon current = LocalMarkwon.getCurrent(composer, 6);
        composer.startReplaceGroup(5004770);
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(rawMarkdownText)) || (i & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = current.toMarkdown(rawMarkdownText);
            composer.updateRememberedValue(objRememberedValue);
        }
        Spanned spanned = (Spanned) objRememberedValue;
        composer.endReplaceGroup();
        Intrinsics.checkNotNull(spanned);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return spanned;
    }

    public static final Markdown4 getLocalMarkwon() {
        return LocalMarkwon;
    }
}
