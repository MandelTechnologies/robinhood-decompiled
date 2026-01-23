package com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.chart.blackwidowadvancedchart.IndicatorQuickAccessState;
import com.robinhood.android.chart.libblackwidowadvancedchart.C10963R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
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
final class IndicatorQuickAccessRowKt$IndicatorQuickAccessRow$2$1$1$4 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ HapticFeedback $hapticFeedback;
    final /* synthetic */ Function0<Unit> $onAddIndicators;
    final /* synthetic */ IndicatorQuickAccessState $state;

    IndicatorQuickAccessRowKt$IndicatorQuickAccessRow$2$1$1$4(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, IndicatorQuickAccessState indicatorQuickAccessState, HapticFeedback hapticFeedback, Function0<Unit> function0) {
        this.$eventLogger = eventLogger;
        this.$eventDescriptor = userInteractionEventDescriptor;
        this.$state = indicatorQuickAccessState;
        this.$hapticFeedback = hapticFeedback;
        this.$onAddIndicators = function0;
    }

    private static final boolean invoke$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
        invoke(lazyItemScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    private static final void invoke$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, IndicatorQuickAccessState indicatorQuickAccessState, HapticFeedback hapticFeedback, Function0 function0, SnapshotState snapshotState) {
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.PILL, IndicatorQuickAccessRowKt.INDICATORS_ROW_ADD, null, 4, null), null, userInteractionEventDescriptor.getContext(), false, 41, null);
        if (indicatorQuickAccessState.getSelectedIndicators().size() >= 10) {
            invoke$lambda$2(snapshotState, true);
        } else {
            hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope item, Composer composer, int i) {
        final SnapshotState snapshotState;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1385274741, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.IndicatorQuickAccessRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IndicatorQuickAccessRow.kt:284)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
        composer.endReplaceGroup();
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        long jM21373getBg30d7_KjU = bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU();
        long jM21371getBg0d7_KjU = bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU();
        composer.startReplaceGroup(-1224400529);
        boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$eventDescriptor) | composer.changedInstance(this.$state) | composer.changedInstance(this.$hapticFeedback) | composer.changed(this.$onAddIndicators);
        final EventLogger eventLogger = this.$eventLogger;
        final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventDescriptor;
        final IndicatorQuickAccessState indicatorQuickAccessState = this.$state;
        final HapticFeedback hapticFeedback = this.$hapticFeedback;
        final Function0<Unit> function0 = this.$onAddIndicators;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.IndicatorQuickAccessRowKt$IndicatorQuickAccessRow$2$1$1$4$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return IndicatorQuickAccessRowKt$IndicatorQuickAccessRow$2$1$1$4.invoke$lambda$4$lambda$3(eventLogger, userInteractionEventDescriptor, indicatorQuickAccessState, hapticFeedback, function0, snapshotState2);
                }
            };
            snapshotState = snapshotState2;
            composer.updateRememberedValue(objRememberedValue2);
        } else {
            snapshotState = snapshotState2;
        }
        Function0 function02 = (Function0) objRememberedValue2;
        composer.endReplaceGroup();
        final IndicatorQuickAccessState indicatorQuickAccessState2 = this.$state;
        IndicatorQuickAccessRowKt.m11905IndicatorPill1Kfb2uI(jM21373getBg30d7_KjU, jM21371getBg0d7_KjU, function02, ComposableLambda3.rememberComposableLambda(-1934963011, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.IndicatorQuickAccessRowKt$IndicatorQuickAccessRow$2$1$1$4.2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer2, Integer num) {
                invoke(row5, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Row5 IndicatorPill, Composer composer2, int i3) {
                String strStringResource;
                Intrinsics.checkNotNullParameter(IndicatorPill, "$this$IndicatorPill");
                if ((i3 & 17) == 16 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1934963011, i3, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.IndicatorQuickAccessRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IndicatorQuickAccessRow.kt:305)");
                }
                Modifier.Companion companion2 = Modifier.INSTANCE;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i4 = BentoTheme.$stable;
                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.PLUS_16), null, bentoTheme2.getColors(composer2, i4).m21425getFg0d7_KjU(), PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, bentoTheme2.getSpacing(composer2, i4).m21593getSmallD9Ej5fM(), 0.0f, 11, null), null, false, composer2, BentoIcon4.Size16.$stable | 48, 48);
                if (indicatorQuickAccessState2.getSelectedTemplate() == null) {
                    composer2.startReplaceGroup(-1726404111);
                    strStringResource = StringResources_androidKt.stringResource(C10963R.string.indicators_quick_access_add, composer2, 0);
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(-1726282963);
                    strStringResource = StringResources_androidKt.stringResource(C10963R.string.indicators_quick_access_add_set, composer2, 0);
                    composer2.endReplaceGroup();
                }
                String str = strStringResource;
                BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(bentoTheme2.getColors(composer2, i4).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i4).getTextS(), composer2, 0, 0, 8186);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), null, null, composer, 3072, 48);
        if (invoke$lambda$1(snapshotState)) {
            composer.startReplaceGroup(5004770);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.IndicatorQuickAccessRowKt$IndicatorQuickAccessRow$2$1$1$4$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return IndicatorQuickAccessRowKt$IndicatorQuickAccessRow$2$1$1$4.invoke$lambda$6$lambda$5(snapshotState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            IndicatorAlerts.MaxIndicatorsAlert((Function0) objRememberedValue3, composer, 6);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$5(SnapshotState snapshotState) {
        invoke$lambda$2(snapshotState, false);
        return Unit.INSTANCE;
    }
}
