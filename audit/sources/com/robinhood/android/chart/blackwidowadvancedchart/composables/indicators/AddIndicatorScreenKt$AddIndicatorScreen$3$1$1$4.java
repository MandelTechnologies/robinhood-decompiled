package com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusManager;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.chart.libblackwidowadvancedchart.C10963R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AddIndicatorScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
final class AddIndicatorScreenKt$AddIndicatorScreen$3$1$1$4 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ FocusManager $focusManager;
    final /* synthetic */ SnapshotState<String> $searchIndicator$delegate;
    final /* synthetic */ Row5 $this_Row;

    AddIndicatorScreenKt$AddIndicatorScreen$3$1$1$4(Row5 row5, FocusManager focusManager, SnapshotState<String> snapshotState) {
        this.$this_Row = row5;
        this.$focusManager = focusManager;
        this.$searchIndicator$delegate = snapshotState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-561904053, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddIndicatorScreen.kt:249)");
        }
        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(this.$this_Row.weight(Modifier.INSTANCE, 1.0f, false), BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(this.$focusManager);
        final FocusManager focusManager = this.$focusManager;
        final SnapshotState<String> snapshotState = this.$searchIndicator$delegate;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.AddIndicatorScreenKt$AddIndicatorScreen$3$1$1$4$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AddIndicatorScreenKt$AddIndicatorScreen$3$1$1$4.invoke$lambda$1$lambda$0(focusManager, snapshotState);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C10963R.string.indicator_add_search_cancel, composer, 0), ClickableKt.m4893clickableXHw0xAI$default(modifierM5146paddingqDBjuR0$default, false, null, null, (Function0) objRememberedValue, 7, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16380);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(FocusManager focusManager, SnapshotState snapshotState) {
        focusManager.clearFocus(true);
        AddIndicatorScreenKt.AddIndicatorScreen$lambda$5(snapshotState, "");
        return Unit.INSTANCE;
    }
}
