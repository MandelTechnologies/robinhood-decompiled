package com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings;

import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.chart.equityadvancedchart.MacEquityOrderState;
import com.robinhood.shared.trading.orderstate.InstrumentOrderState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DisplayChartSetting.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.DisplayChartSettingKt$DisplayChartSetting$9$1, reason: use source file name */
/* loaded from: classes7.dex */
final class DisplayChartSetting2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ HapticFeedback $hapticFeedback;
    final /* synthetic */ Function1<Boolean, Unit> $onAutoSendToggled;
    final /* synthetic */ InstrumentOrderState $orderState;

    /* JADX WARN: Multi-variable type inference failed */
    DisplayChartSetting2(InstrumentOrderState instrumentOrderState, HapticFeedback hapticFeedback, Function1<? super Boolean, Unit> function1) {
        this.$orderState = instrumentOrderState;
        this.$hapticFeedback = hapticFeedback;
        this.$onAutoSendToggled = function1;
    }

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
            ComposerKt.traceEventStart(394064794, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.DisplayChartSetting.<anonymous>.<anonymous> (DisplayChartSetting.kt:224)");
        }
        boolean autoSendOrders = ((MacEquityOrderState) this.$orderState).getAutoSendOrders();
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(this.$hapticFeedback) | composer.changed(this.$onAutoSendToggled);
        final HapticFeedback hapticFeedback = this.$hapticFeedback;
        final Function1<Boolean, Unit> function1 = this.$onAutoSendToggled;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.DisplayChartSettingKt$DisplayChartSetting$9$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DisplayChartSetting2.invoke$lambda$1$lambda$0(hapticFeedback, function1, ((Boolean) obj).booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        AutoSendToggleRow.AutoSendToggleRow(autoSendOrders, (Function1) objRememberedValue, null, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(HapticFeedback hapticFeedback, Function1 function1, boolean z) {
        hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
        function1.invoke(Boolean.valueOf(z));
        return Unit.INSTANCE;
    }
}
