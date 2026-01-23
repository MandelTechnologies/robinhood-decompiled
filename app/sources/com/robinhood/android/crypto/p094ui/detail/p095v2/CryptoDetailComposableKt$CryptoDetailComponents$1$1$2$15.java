package com.robinhood.android.crypto.p094ui.detail.p095v2;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.crypto.p094ui.detail.cards.CryptoDetailCardComposable;
import com.robinhood.android.crypto.p094ui.detail.cards.CryptoDetailCardDuxo;
import com.robinhood.compose.bento.theme.BentoTheme4;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoDetailComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class CryptoDetailComposableKt$CryptoDetailComponents$1$1$2$15 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ UUID $currencyPairId;
    final /* synthetic */ BentoTheme4 $direction;
    final /* synthetic */ float $visibleComponentPadding;

    CryptoDetailComposableKt$CryptoDetailComponents$1$1$2$15(UUID uuid, BentoTheme4 bentoTheme4, float f) {
        this.$currencyPairId = uuid;
        this.$direction = bentoTheme4;
        this.$visibleComponentPadding = f;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
        invoke(lazyItemScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope item, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-971911275, i, -1, "com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComponents.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoDetailComposable.kt:447)");
        }
        CryptoDetailCardDuxo.Args args = new CryptoDetailCardDuxo.Args(this.$currencyPairId);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$CryptoDetailComponents$1$1$2$15$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function0 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$CryptoDetailComponents$1$1$2$15$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        CryptoDetailCardComposable.CryptoDetailCardComposable(args, function0, (Function0) objRememberedValue2, this.$direction, CryptoDetailComposableKt.CryptoDetailComponents$visibleComponentPadding(Modifier.INSTANCE, this.$visibleComponentPadding), null, composer, 432, 32);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
