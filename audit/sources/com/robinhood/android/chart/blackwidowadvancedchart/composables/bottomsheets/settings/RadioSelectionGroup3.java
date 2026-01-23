package com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import black_widow.contracts.mobile_app_chart.proto.p024v1.ChartSettingSelectionOptionDto;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.SelectionRow5;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: RadioSelectionGroup.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aG\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000bH\u0001¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000e¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\u0003X\u008a\u008e\u0002"}, m3636d2 = {"RadioSelectionGroup", "", "title", "", "selectedOption", "options", "Lkotlinx/collections/immutable/ImmutableList;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingSelectionOptionDto;", "enabled", "", "onOptionSelected", "Lkotlin/Function1;", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "PreviewRadioSelectionGroup", "(Landroidx/compose/runtime/Composer;I)V", "feature-black-widow-advanced-chart_externalDebug", "internalSelectedOption"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.RadioSelectionGroupKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class RadioSelectionGroup3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewRadioSelectionGroup$lambda$8(int i, Composer composer, int i2) {
        PreviewRadioSelectionGroup(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RadioSelectionGroup$lambda$7(String str, String str2, ImmutableList immutableList, boolean z, Function1 function1, int i, Composer composer, int i2) {
        RadioSelectionGroup(str, str2, immutableList, z, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void RadioSelectionGroup(final String title, String selectedOption, final ImmutableList<ChartSettingSelectionOptionDto> options, final boolean z, final Function1<? super String, Unit> onOptionSelected, Composer composer, final int i) {
        SnapshotState snapshotState;
        int i2;
        boolean z2;
        String str;
        Function1<? super String, Unit> function1;
        final SnapshotState snapshotState2;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(selectedOption, "selectedOption");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(onOptionSelected, "onOptionSelected");
        Composer composerStartRestartGroup = composer.startRestartGroup(1711219488);
        int i3 = (i & 6) == 0 ? (composerStartRestartGroup.changed(title) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(selectedOption) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(options) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onOptionSelected) ? 16384 : 8192;
        }
        if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1711219488, i3, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.RadioSelectionGroup (RadioSelectionGroup.kt:26)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(selectedOption, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotState snapshotState3 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(332046478);
            if (StringsKt.isBlank(title)) {
                snapshotState = snapshotState3;
                i2 = i3;
                z2 = false;
            } else {
                i2 = i3;
                snapshotState = snapshotState3;
                z2 = false;
                BentoText2.m20747BentoText38GnDrw(title, PaddingKt.m5146paddingqDBjuR0$default(companion, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, (i3 & 14) | 24576, 0, 16364);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(332054760);
            for (final ChartSettingSelectionOptionDto chartSettingSelectionOptionDto : options) {
                boolean zAreEqual = Intrinsics.areEqual(chartSettingSelectionOptionDto.getValue(), selectedOption);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(chartSettingSelectionOptionDto) | ((i2 & 57344) == 16384 ? true : z2);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    snapshotState2 = snapshotState;
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.RadioSelectionGroupKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RadioSelectionGroup3.RadioSelectionGroup$lambda$6$lambda$5$lambda$4$lambda$3(chartSettingSelectionOptionDto, onOptionSelected, snapshotState2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    snapshotState2 = snapshotState;
                }
                composerStartRestartGroup.endReplaceGroup();
                SelectionRow5.SelectionRow(zAreEqual, (Function0) objRememberedValue2, ComposableLambda3.rememberComposableLambda(727723712, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.RadioSelectionGroupKt$RadioSelectionGroup$1$1$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer2, Integer num) {
                        invoke(row5, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Row5 SelectionRow, Composer composer2, int i4) {
                        long jM21427getFg30d7_KjU;
                        Intrinsics.checkNotNullParameter(SelectionRow, "$this$SelectionRow");
                        if ((i4 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(727723712, i4, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.RadioSelectionGroup.<anonymous>.<anonymous>.<anonymous> (RadioSelectionGroup.kt:45)");
                        }
                        String label = chartSettingSelectionOptionDto.getLabel();
                        if (z) {
                            composer2.startReplaceGroup(-1377681642);
                            jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21425getFg0d7_KjU();
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(-1377600267);
                            jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21427getFg30d7_KjU();
                            composer2.endReplaceGroup();
                        }
                        BentoText2.m20747BentoText38GnDrw(label, null, Color.m6701boximpl(jM21427getFg30d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16378);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, z, null, composerStartRestartGroup, ((i2 << 3) & 57344) | 384, 40);
                snapshotState = snapshotState2;
            }
            str = selectedOption;
            function1 = onOptionSelected;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            str = selectedOption;
            function1 = onOptionSelected;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final String str2 = str;
            final Function1<? super String, Unit> function12 = function1;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.RadioSelectionGroupKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RadioSelectionGroup3.RadioSelectionGroup$lambda$7(title, str2, options, z, function12, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RadioSelectionGroup$lambda$6$lambda$5$lambda$4$lambda$3(ChartSettingSelectionOptionDto chartSettingSelectionOptionDto, Function1 function1, SnapshotState snapshotState) {
        snapshotState.setValue(chartSettingSelectionOptionDto.getValue());
        function1.invoke(chartSettingSelectionOptionDto.getValue());
        return Unit.INSTANCE;
    }

    private static final void PreviewRadioSelectionGroup(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1819934733);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1819934733, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.PreviewRadioSelectionGroup (RadioSelectionGroup.kt:61)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, RadioSelectionGroup.INSTANCE.m1769x332953f1(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.RadioSelectionGroupKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RadioSelectionGroup3.PreviewRadioSelectionGroup$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
