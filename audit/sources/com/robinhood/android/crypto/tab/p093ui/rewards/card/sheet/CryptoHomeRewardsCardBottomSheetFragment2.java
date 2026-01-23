package com.robinhood.android.crypto.tab.p093ui.rewards.card.sheet;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoHomeRewardsCardBottomSheetFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.tab.ui.rewards.card.sheet.ComposableSingletons$CryptoHomeRewardsCardBottomSheetFragmentKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoHomeRewardsCardBottomSheetFragment2 {
    public static final CryptoHomeRewardsCardBottomSheetFragment2 INSTANCE = new CryptoHomeRewardsCardBottomSheetFragment2();

    /* renamed from: lambda$-1989558374, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8843lambda$1989558374 = ComposableLambda3.composableLambdaInstance(-1989558374, false, CryptoHomeRewardsCardBottomSheetFragment3.INSTANCE);

    /* renamed from: lambda$-599436114, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8844lambda$599436114 = ComposableLambda3.composableLambdaInstance(-599436114, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.rewards.card.sheet.ComposableSingletons$CryptoHomeRewardsCardBottomSheetFragmentKt$lambda$-599436114$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-599436114, i, -1, "com.robinhood.android.crypto.tab.ui.rewards.card.sheet.ComposableSingletons$CryptoHomeRewardsCardBottomSheetFragmentKt.lambda$-599436114.<anonymous> (CryptoHomeRewardsCardBottomSheetFragment.kt:103)");
            }
            CryptoHomeRewardsCardBottomSheetFragment6.LoadingState(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1989558374$feature_crypto_tab_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13051getLambda$1989558374$feature_crypto_tab_externalDebug() {
        return f8843lambda$1989558374;
    }

    /* renamed from: getLambda$-599436114$feature_crypto_tab_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13052getLambda$599436114$feature_crypto_tab_externalDebug() {
        return f8844lambda$599436114;
    }
}
