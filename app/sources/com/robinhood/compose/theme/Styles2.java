package com.robinhood.compose.theme;

import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: Styles.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"LocalStyles", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/robinhood/compose/theme/Styles;", "getLocalStyles", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "lib-compose-theme_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.theme.StylesKt, reason: use source file name */
/* loaded from: classes20.dex */
public final class Styles2 {
    private static final CompositionLocal6<Styles> LocalStyles = CompositionLocal3.staticCompositionLocalOf(new Function0() { // from class: com.robinhood.compose.theme.StylesKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Styles2.LocalStyles$lambda$0();
        }
    });

    public static final CompositionLocal6<Styles> getLocalStyles() {
        return LocalStyles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Styles LocalStyles$lambda$0() {
        throw new IllegalStateException("No Styles provided in the theme.");
    }
}
