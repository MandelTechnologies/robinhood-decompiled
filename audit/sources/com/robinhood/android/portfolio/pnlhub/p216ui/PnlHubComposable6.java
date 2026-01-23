package com.robinhood.android.portfolio.pnlhub.p216ui;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossChart;
import com.robinhood.android.portfolio.pnlhub.PnlHubDataState2;
import com.robinhood.android.portfolio.pnlhub.PnlHubViewState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PnlHubComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.portfolio.pnlhub.ui.PnlHubComposableKt$PnlHubComposable$2$1$4$1$1, reason: use source file name */
/* loaded from: classes11.dex */
final class PnlHubComposable6 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ Function1<PnlHubDataState2, Unit> $onBottomSheetStateChange;
    final /* synthetic */ Function1<Boolean, Unit> $onChartVisibilityChanged;
    final /* synthetic */ PnlHubViewState $viewState;

    /* JADX WARN: Multi-variable type inference failed */
    PnlHubComposable6(PnlHubViewState pnlHubViewState, Function1<? super Boolean, Unit> function1, Function1<? super PnlHubDataState2, Unit> function12) {
        this.$viewState = pnlHubViewState;
        this.$onChartVisibilityChanged = function1;
        this.$onBottomSheetStateChange = function12;
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
            ComposerKt.traceEventStart(-1140846832, i, -1, "com.robinhood.android.portfolio.pnlhub.ui.PnlHubComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PnlHubComposable.kt:171)");
        }
        Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, PnlHubComposable5.PNL_HUB_CHART_TEST_TAG);
        ProfitAndLossChart chartData = ((PnlHubViewState.Ready) this.$viewState).getChartData();
        boolean showChartHeaderSecondaryTextTrailingIcon = ((PnlHubViewState.Ready) this.$viewState).getShowChartHeaderSecondaryTextTrailingIcon();
        boolean showDisplayCurrencyLabel = ((PnlHubViewState.Ready) this.$viewState).getShowDisplayCurrencyLabel();
        Function1<Boolean, Unit> function1 = this.$onChartVisibilityChanged;
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(this.$onBottomSheetStateChange);
        final Function1<PnlHubDataState2, Unit> function12 = this.$onBottomSheetStateChange;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.portfolio.pnlhub.ui.PnlHubComposableKt$PnlHubComposable$2$1$4$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PnlHubComposable6.invoke$lambda$1$lambda$0(function12);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        PnlHubChartKt.PnlHubChart(chartData, showChartHeaderSecondaryTextTrailingIcon, showDisplayCurrencyLabel, function1, (Function0) objRememberedValue, modifierTestTag, null, composer, 196608, 64);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function1 function1) {
        function1.invoke(PnlHubDataState2.DataAvailability.INSTANCE);
        return Unit.INSTANCE;
    }
}
