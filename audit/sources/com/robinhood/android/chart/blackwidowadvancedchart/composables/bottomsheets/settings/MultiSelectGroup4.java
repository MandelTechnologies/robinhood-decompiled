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
import com.robinhood.android.chart.blackwidowadvancedchart.composables.SelectionRow6;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: MultiSelectGroup.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aS\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\b\u001a\u00020\t2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000bH\u0001¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000e¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\tX\u008a\u008e\u0002"}, m3636d2 = {"MultiSelectGroup", "", "title", "", "selectedOptions", "Lkotlinx/collections/immutable/ImmutableList;", "options", "Lblack_widow/contracts/mobile_app_chart/proto/v1/ChartSettingSelectionOptionDto;", "enabled", "", "onOptionSelected", "Lkotlin/Function2;", "(Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "PreviewMultiSelectGroup", "(Landroidx/compose/runtime/Composer;I)V", "feature-black-widow-advanced-chart_externalDebug", "selected"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.MultiSelectGroupKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class MultiSelectGroup4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultiSelectGroup$lambda$7(String str, ImmutableList immutableList, ImmutableList immutableList2, boolean z, Function2 function2, int i, Composer composer, int i2) {
        MultiSelectGroup(str, immutableList, immutableList2, z, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewMultiSelectGroup$lambda$8(int i, Composer composer, int i2) {
        PreviewMultiSelectGroup(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void MultiSelectGroup(final String title, ImmutableList<String> selectedOptions, final ImmutableList<ChartSettingSelectionOptionDto> options, final boolean z, final Function2<? super String, ? super Boolean, Unit> onOptionSelected, Composer composer, final int i) {
        int i2;
        boolean z2;
        ImmutableList<String> immutableList;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(selectedOptions, "selectedOptions");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(onOptionSelected, "onOptionSelected");
        Composer composerStartRestartGroup = composer.startRestartGroup(247581480);
        int i3 = (i & 6) == 0 ? (composerStartRestartGroup.changed(title) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(selectedOptions) ? 32 : 16;
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
                ComposerKt.traceEventStart(247581480, i3, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.MultiSelectGroup (MultiSelectGroup.kt:28)");
            }
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
            composerStartRestartGroup.startReplaceGroup(1433160002);
            if (StringsKt.isBlank(title)) {
                i2 = i3;
                z2 = false;
            } else {
                z2 = false;
                i2 = i3;
                BentoText2.m20747BentoText38GnDrw(title, PaddingKt.m5146paddingqDBjuR0$default(companion, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, (i3 & 14) | 24576, 0, 16364);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1433168429);
            for (final ChartSettingSelectionOptionDto chartSettingSelectionOptionDto : options) {
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean z3 = (i2 & 112) == 32 ? true : z2;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.valueOf(selectedOptions.contains(chartSettingSelectionOptionDto.getValue())), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                boolean zMultiSelectGroup$lambda$6$lambda$5$lambda$1 = MultiSelectGroup$lambda$6$lambda$5$lambda$1(snapshotState);
                SelectionRow6 selectionRow6 = SelectionRow6.CHECK;
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                boolean zChanged = composerStartRestartGroup.changed(snapshotState) | ((i2 & 57344) == 16384 ? true : z2) | composerStartRestartGroup.changedInstance(chartSettingSelectionOptionDto);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.MultiSelectGroupKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MultiSelectGroup4.MultiSelectGroup$lambda$6$lambda$5$lambda$4$lambda$3(onOptionSelected, chartSettingSelectionOptionDto, snapshotState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                SelectionRow5.SelectionRow(zMultiSelectGroup$lambda$6$lambda$5$lambda$1, (Function0) objRememberedValue2, ComposableLambda3.rememberComposableLambda(-176016504, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.MultiSelectGroupKt$MultiSelectGroup$1$1$2
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
                            ComposerKt.traceEventStart(-176016504, i4, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.MultiSelectGroup.<anonymous>.<anonymous>.<anonymous> (MultiSelectGroup.kt:48)");
                        }
                        String label = chartSettingSelectionOptionDto.getLabel();
                        if (z) {
                            composer2.startReplaceGroup(447522126);
                            jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21425getFg0d7_KjU();
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(447603501);
                            jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21427getFg30d7_KjU();
                            composer2.endReplaceGroup();
                        }
                        BentoText2.m20747BentoText38GnDrw(label, null, Color.m6701boximpl(jM21427getFg30d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16378);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, z, selectionRow6, composerStartRestartGroup, ((i2 << 3) & 57344) | 196992, 8);
            }
            immutableList = selectedOptions;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            immutableList = selectedOptions;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final ImmutableList<String> immutableList2 = immutableList;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.MultiSelectGroupKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MultiSelectGroup4.MultiSelectGroup$lambda$7(title, immutableList2, options, z, onOptionSelected, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void MultiSelectGroup$lambda$6$lambda$5$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultiSelectGroup$lambda$6$lambda$5$lambda$4$lambda$3(Function2 function2, ChartSettingSelectionOptionDto chartSettingSelectionOptionDto, SnapshotState snapshotState) {
        MultiSelectGroup$lambda$6$lambda$5$lambda$2(snapshotState, !MultiSelectGroup$lambda$6$lambda$5$lambda$1(snapshotState));
        function2.invoke(chartSettingSelectionOptionDto.getValue(), Boolean.valueOf(MultiSelectGroup$lambda$6$lambda$5$lambda$1(snapshotState)));
        return Unit.INSTANCE;
    }

    private static final void PreviewMultiSelectGroup(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(254494873);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(254494873, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.PreviewMultiSelectGroup (MultiSelectGroup.kt:64)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, MultiSelectGroup2.INSTANCE.m1767xafcce129(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets.settings.MultiSelectGroupKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MultiSelectGroup4.PreviewMultiSelectGroup$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean MultiSelectGroup$lambda$6$lambda$5$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }
}
