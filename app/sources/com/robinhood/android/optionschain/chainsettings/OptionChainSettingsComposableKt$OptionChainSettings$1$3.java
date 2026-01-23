package com.robinhood.android.optionschain.chainsettings;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotFloatState2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

/* compiled from: OptionChainSettingsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
final class OptionChainSettingsComposableKt$OptionChainSettings$1$3 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ SnapshotFloatState2 $overlayStartY$delegate;
    final /* synthetic */ Function0<Unit> $switchToSbsTooltipOnClick;

    OptionChainSettingsComposableKt$OptionChainSettings$1$3(Function0<Unit> function0, SnapshotFloatState2 snapshotFloatState2) {
        this.$switchToSbsTooltipOnClick = function0;
        this.$overlayStartY$delegate = snapshotFloatState2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(88187258, i, -1, "com.robinhood.android.optionschain.chainsettings.OptionChainSettings.<anonymous>.<anonymous>.<anonymous> (OptionChainSettingsComposable.kt:221)");
        }
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        composer.startReplaceGroup(5004770);
        final SnapshotFloatState2 snapshotFloatState2 = this.$overlayStartY$delegate;
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsComposableKt$OptionChainSettings$1$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionChainSettingsComposableKt$OptionChainSettings$1$3.invoke$lambda$1$lambda$0(snapshotFloatState2, (Density) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxHeight$default(OffsetKt.offset(modifierFillMaxWidth$default, (Function1) objRememberedValue), 0.0f, 1, null), Color.m6705copywmQWz5c$default(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(this.$switchToSbsTooltipOnClick);
        final Function0<Unit> function0 = this.$switchToSbsTooltipOnClick;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsComposableKt$OptionChainSettings$1$3$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OptionChainSettingsComposableKt$OptionChainSettings$1$3.invoke$lambda$3$lambda$2(function0);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        BoxKt.Box(ClickableKt.m4893clickableXHw0xAI$default(modifierM4872backgroundbw27NRU$default, false, null, null, (Function0) objRememberedValue2, 7, null), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntOffset invoke$lambda$1$lambda$0(SnapshotFloatState2 snapshotFloatState2, Density offset) {
        Intrinsics.checkNotNullParameter(offset, "$this$offset");
        return IntOffset.m8030boximpl(IntOffset.m8033constructorimpl((MathKt.roundToInt(snapshotFloatState2.getFloatValue()) & 4294967295L) | (0 << 32)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
