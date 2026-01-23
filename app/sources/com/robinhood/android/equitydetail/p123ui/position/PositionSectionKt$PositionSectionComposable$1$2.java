package com.robinhood.android.equitydetail.p123ui.position;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.portfolio.pnl.C25673R;
import com.robinhood.android.portfolio.pnl.Tooltips;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PositionSection.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class PositionSectionKt$PositionSectionComposable$1$2 implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ Function0<Unit> $onTooltipAppear;
    final /* synthetic */ Screen $screen;
    final /* synthetic */ SnapshotState<Boolean> $showTooltip$delegate;

    PositionSectionKt$PositionSectionComposable$1$2(Screen screen, Function0<Unit> function0, SnapshotState<Boolean> snapshotState) {
        this.$screen = screen;
        this.$onTooltipAppear = function0;
        this.$showTooltip$delegate = snapshotState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    public final Modifier invoke(Modifier to, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(to, "$this$to");
        composer.startReplaceGroup(26824318);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(26824318, i, -1, "com.robinhood.android.equitydetail.ui.position.PositionSectionComposable.<anonymous>.<anonymous> (PositionSection.kt:131)");
        }
        Boolean boolPositionSectionComposable$lambda$9 = PositionSectionKt.PositionSectionComposable$lambda$9(this.$showTooltip$delegate);
        Screen screen = this.$screen;
        Screen screen2 = screen == null ? new Screen(Screen.Name.STOCK_DETAIL_PAGE, null, null, null, 14, null) : screen;
        int i2 = C25673R.string.pnl_average_cost_tooltip_sdp;
        composer.startReplaceGroup(5004770);
        final SnapshotState<Boolean> snapshotState = this.$showTooltip$delegate;
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.equitydetail.ui.position.PositionSectionKt$PositionSectionComposable$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PositionSectionKt$PositionSectionComposable$1$2.invoke$lambda$1$lambda$0(snapshotState);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Modifier modifierProfitAndLossAverageCostTooltip$default = Tooltips.profitAndLossAverageCostTooltip$default(to, boolPositionSectionComposable$lambda$9, (Function0) objRememberedValue, this.$onTooltipAppear, screen2, i2, null, 32, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierProfitAndLossAverageCostTooltip$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState) {
        snapshotState.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }
}
