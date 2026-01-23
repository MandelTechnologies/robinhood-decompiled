package com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.SwitchKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusManager;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorParameterDto;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.CheckRow;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.component.rows.BentoToggleRow;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.compose.theme.style.ToggleRowStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CheckRow.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\n\u0010\n\u001a\u00020\u0003X\u008a\u008e\u0002"}, m3636d2 = {"CheckRow", "", "value", "", "parameter", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterDto;", "onToggle", "Lkotlin/Function1;", "(ZLblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterDto;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "feature-black-widow-advanced-chart_externalDebug", "checked"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.CheckRowKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class CheckRow {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CheckRow$lambda$3(boolean z, IndicatorParameterDto indicatorParameterDto, Function1 function1, int i, Composer composer, int i2) {
        CheckRow(z, indicatorParameterDto, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void CheckRow(final boolean z, final IndicatorParameterDto parameter, final Function1<? super Boolean, Unit> onToggle, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(parameter, "parameter");
        Intrinsics.checkNotNullParameter(onToggle, "onToggle");
        Composer composerStartRestartGroup = composer.startRestartGroup(-241045224);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(parameter) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onToggle) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-241045224, i2, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.CheckRow (CheckRow.kt:21)");
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z2 = (i2 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            BentoBaseRowLayout.BentoBaseRowLayout(null, null, null, ComposableLambda3.rememberComposableLambda(909134139, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.CheckRowKt.CheckRow.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(909134139, i3, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.CheckRow.<anonymous> (CheckRow.kt:28)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer3, i4).m21590getDefaultD9Ej5fM(), 1, null);
                    BentoText2.m20747BentoText38GnDrw(parameter.getLabel(), modifierM5144paddingVpY3zN4$default, Color.m6701boximpl(bentoTheme.getColors(composer3, i4).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i4).getTextM(), composer3, 0, 0, 8184);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, ComposableLambda3.rememberComposableLambda(2092751704, true, new C108032((HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback()), (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager()), (SnapshotState) objRememberedValue, onToggle), composerStartRestartGroup, 54), false, true, true, null, composer2, 907545600, 0, 1207);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.CheckRowKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CheckRow.CheckRow$lambda$3(z, parameter, onToggle, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CheckRow$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: CheckRow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.CheckRowKt$CheckRow$2 */
    static final class C108032 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<Boolean> $checked$delegate;
        final /* synthetic */ FocusManager $focusManager;
        final /* synthetic */ HapticFeedback $hapticFeedback;
        final /* synthetic */ Function1<Boolean, Unit> $onToggle;

        /* JADX WARN: Multi-variable type inference failed */
        C108032(HapticFeedback hapticFeedback, FocusManager focusManager, SnapshotState<Boolean> snapshotState, Function1<? super Boolean, Unit> function1) {
            this.$hapticFeedback = hapticFeedback;
            this.$focusManager = focusManager;
            this.$checked$delegate = snapshotState;
            this.$onToggle = function1;
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
                ComposerKt.traceEventStart(2092751704, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.CheckRow.<anonymous> (CheckRow.kt:36)");
            }
            boolean zCheckRow$lambda$1 = CheckRow.CheckRow$lambda$1(this.$checked$delegate);
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composer.changedInstance(this.$hapticFeedback) | composer.changedInstance(this.$focusManager) | composer.changed(this.$checked$delegate) | composer.changed(this.$onToggle);
            final HapticFeedback hapticFeedback = this.$hapticFeedback;
            final FocusManager focusManager = this.$focusManager;
            final Function1<Boolean, Unit> function1 = this.$onToggle;
            final SnapshotState<Boolean> snapshotState = this.$checked$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.CheckRowKt$CheckRow$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CheckRow.C108032.invoke$lambda$1$lambda$0(hapticFeedback, focusManager, function1, snapshotState, ((Boolean) obj).booleanValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            SwitchKt.Switch(zCheckRow$lambda$1, (Function1) objRememberedValue, null, null, false, BentoToggleRow.INSTANCE.create(true, ToggleRowStyle.m22032copydaRQuJA$default(((Styles) composer.consume(Styles2.getLocalStyles())).getToggleRow(composer, 0), 0L, 0L, 0L, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21456getPositive0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 8183, null), composer, (ToggleRowStyle.$stable << 3) | 390).switchColors(composer, BentoToggleRow.$stable), null, composer, 0, 92);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(HapticFeedback hapticFeedback, FocusManager focusManager, Function1 function1, SnapshotState snapshotState, boolean z) {
            hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
            focusManager.clearFocus(true);
            CheckRow.CheckRow$lambda$2(snapshotState, z);
            function1.invoke(Boolean.valueOf(z));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CheckRow$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }
}
