package com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: IndicatorQuickAccessRow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
final class IndicatorQuickAccessRowKt$IndicatorQuickAccessRow$2$1$1$5 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ HapticFeedback $hapticFeedback;
    final /* synthetic */ Function0<Unit> $onSaveAsSetClicked;

    IndicatorQuickAccessRowKt$IndicatorQuickAccessRow$2$1$1$5(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, HapticFeedback hapticFeedback, Function0<Unit> function0) {
        this.$eventLogger = eventLogger;
        this.$eventDescriptor = userInteractionEventDescriptor;
        this.$hapticFeedback = hapticFeedback;
        this.$onSaveAsSetClicked = function0;
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
            ComposerKt.traceEventStart(-122273946, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.IndicatorQuickAccessRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IndicatorQuickAccessRow.kt:336)");
        }
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        long jM21373getBg30d7_KjU = bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU();
        long jM21371getBg0d7_KjU = bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU();
        composer.startReplaceGroup(-1224400529);
        boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$eventDescriptor) | composer.changedInstance(this.$hapticFeedback) | composer.changed(this.$onSaveAsSetClicked);
        final EventLogger eventLogger = this.$eventLogger;
        final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventDescriptor;
        final HapticFeedback hapticFeedback = this.$hapticFeedback;
        final Function0<Unit> function0 = this.$onSaveAsSetClicked;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.IndicatorQuickAccessRowKt$IndicatorQuickAccessRow$2$1$1$5$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return IndicatorQuickAccessRowKt$IndicatorQuickAccessRow$2$1$1$5.invoke$lambda$1$lambda$0(eventLogger, userInteractionEventDescriptor, hapticFeedback, function0);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        IndicatorQuickAccessRowKt.m11905IndicatorPill1Kfb2uI(jM21373getBg30d7_KjU, jM21371getBg0d7_KjU, (Function0) objRememberedValue, ComposableSingletons$IndicatorQuickAccessRowKt.INSTANCE.m1782xd91cc50(), null, null, composer, 3072, 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, HapticFeedback hapticFeedback, Function0 function0) {
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.PILL, IndicatorQuickAccessRowKt.INDICATORS_ROW_SAVE_AS_SET, null, 4, null), null, userInteractionEventDescriptor.getContext(), false, 41, null);
        hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
        function0.invoke();
        return Unit.INSTANCE;
    }
}
