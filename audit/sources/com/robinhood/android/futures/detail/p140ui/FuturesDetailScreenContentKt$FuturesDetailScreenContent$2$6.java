package com.robinhood.android.futures.detail.p140ui;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FuturesDetailScreenContent.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class FuturesDetailScreenContentKt$FuturesDetailScreenContent$2$6 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ FuturesDetailScreenCallbacks $fdpCallbacks;
    final /* synthetic */ SnapshotState<Boolean> $tradeBarExpanded$delegate;

    FuturesDetailScreenContentKt$FuturesDetailScreenContent$2$6(FuturesDetailScreenCallbacks futuresDetailScreenCallbacks, SnapshotState<Boolean> snapshotState) {
        this.$fdpCallbacks = futuresDetailScreenCallbacks;
        this.$tradeBarExpanded$delegate = snapshotState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2077115432, i, -1, "com.robinhood.android.futures.detail.ui.FuturesDetailScreenContent.<anonymous>.<anonymous> (FuturesDetailScreenContent.kt:107)");
        }
        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Color.m6705copywmQWz5c$default(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = InteractionSource2.MutableInteractionSource();
            composer.updateRememberedValue(objRememberedValue);
        }
        InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(this.$fdpCallbacks);
        final FuturesDetailScreenCallbacks futuresDetailScreenCallbacks = this.$fdpCallbacks;
        final SnapshotState<Boolean> snapshotState = this.$tradeBarExpanded$delegate;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.futures.detail.ui.FuturesDetailScreenContentKt$FuturesDetailScreenContent$2$6$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FuturesDetailScreenContentKt$FuturesDetailScreenContent$2$6.invoke$lambda$2$lambda$1(futuresDetailScreenCallbacks, snapshotState);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        BoxKt.Box(ClickableKt.m4891clickableO2vRcR0$default(modifierM4872backgroundbw27NRU$default, interactionSource3, null, false, null, null, (Function0) objRememberedValue2, 28, null), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(FuturesDetailScreenCallbacks futuresDetailScreenCallbacks, SnapshotState snapshotState) {
        FuturesDetailScreenContentKt.FuturesDetailScreenContent$lambda$21$lambda$7(snapshotState, false);
        futuresDetailScreenCallbacks.onTradeBarExpanded(false);
        return Unit.INSTANCE;
    }
}
