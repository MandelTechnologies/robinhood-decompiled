package com.robinhood.compose.bento.theme;

import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: BentoSpacing.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"LocalBentoSpacing", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/robinhood/compose/bento/theme/BentoSpacing;", "getLocalBentoSpacing", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.bento.theme.BentoSpacingKt, reason: use source file name */
/* loaded from: classes20.dex */
public final class BentoSpacing2 {
    private static final CompositionLocal6<BentoSpacing> LocalBentoSpacing = CompositionLocal3.staticCompositionLocalOf(new Function0() { // from class: com.robinhood.compose.bento.theme.BentoSpacingKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BentoSpacing2.LocalBentoSpacing$lambda$0();
        }
    });

    public static final CompositionLocal6<BentoSpacing> getLocalBentoSpacing() {
        return LocalBentoSpacing;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BentoSpacing LocalBentoSpacing$lambda$0() {
        throw new IllegalStateException("No BentoSpacing provided. Wrap composable in BentoTheme.");
    }
}
