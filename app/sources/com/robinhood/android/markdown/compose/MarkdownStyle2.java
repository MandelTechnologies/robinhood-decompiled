package com.robinhood.android.markdown.compose;

import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: MarkdownStyle.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"LocalMarkdownStyle", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/robinhood/android/markdown/compose/MarkdownStyle;", "getLocalMarkdownStyle", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "lib-markdown-compose_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.markdown.compose.MarkdownStyleKt, reason: use source file name */
/* loaded from: classes17.dex */
public final class MarkdownStyle2 {
    private static final CompositionLocal6<MarkdownStyle> LocalMarkdownStyle = CompositionLocal3.staticCompositionLocalOf(new Function0() { // from class: com.robinhood.android.markdown.compose.MarkdownStyleKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarkdownStyle2.LocalMarkdownStyle$lambda$0();
        }
    });

    public static final CompositionLocal6<MarkdownStyle> getLocalMarkdownStyle() {
        return LocalMarkdownStyle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarkdownStyle LocalMarkdownStyle$lambda$0() {
        throw new IllegalStateException("No MarkdownStyle provided.");
    }
}
