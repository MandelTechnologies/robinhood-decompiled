package com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusManager;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.text.TextStyle;
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
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorParameterDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.InputOptionsDto;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.SelectionBottomSheet3;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.SelectionRow5;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ParameterDropDownRow;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: ParameterDropDownRow.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\u001aS\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\tH\u0001¢\u0006\u0002\u0010\f¨\u0006\r²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u008e\u0002"}, m3636d2 = {"ParameterDropDownRow", "", "selection", "Lblack_widow/contracts/mobile_app_chart/proto/v1/InputOptionsDto;", "selectionItems", "Lkotlinx/collections/immutable/ImmutableList;", "parameter", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterDto;", "showKeyboard", "Lkotlin/Function1;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/composables/indicators/settings/SettingsKeyboardState;", "onSelection", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/InputOptionsDto;Lkotlinx/collections/immutable/ImmutableList;Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterDto;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "feature-black-widow-advanced-chart_externalDebug", "expanded", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ParameterDropDownRowKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class ParameterDropDownRow {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ParameterDropDownRow$lambda$5(InputOptionsDto inputOptionsDto, ImmutableList immutableList, IndicatorParameterDto indicatorParameterDto, Function1 function1, Function1 function12, int i, Composer composer, int i2) {
        ParameterDropDownRow(inputOptionsDto, immutableList, indicatorParameterDto, function1, function12, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ParameterDropDownRow(final InputOptionsDto selection, final ImmutableList<InputOptionsDto> selectionItems, final IndicatorParameterDto parameter, final Function1<? super SettingsKeyboardState, Unit> showKeyboard, final Function1<? super InputOptionsDto, Unit> onSelection, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(selection, "selection");
        Intrinsics.checkNotNullParameter(selectionItems, "selectionItems");
        Intrinsics.checkNotNullParameter(parameter, "parameter");
        Intrinsics.checkNotNullParameter(showKeyboard, "showKeyboard");
        Intrinsics.checkNotNullParameter(onSelection, "onSelection");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1270279812);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(selection) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(selectionItems) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(parameter) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(showKeyboard) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSelection) ? 16384 : 8192;
        }
        int i3 = i2;
        if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1270279812, i3, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ParameterDropDownRow (ParameterDropDownRow.kt:35)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            FocusManager focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            HapticFeedback hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
            BentoBaseRowLayout.BentoBaseRowLayout(null, null, null, ComposableLambda3.rememberComposableLambda(-47405921, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ParameterDropDownRowKt.ParameterDropDownRow.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i4) {
                    if ((i4 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-47405921, i4, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ParameterDropDownRow.<anonymous> (ParameterDropDownRow.kt:42)");
                    }
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion2, 0.0f, bentoTheme.getSpacing(composer3, i5).m21590getDefaultD9Ej5fM(), 1, null);
                    BentoText2.m20747BentoText38GnDrw(parameter.getLabel(), modifierM5144paddingVpY3zN4$default, Color.m6701boximpl(bentoTheme.getColors(composer3, i5).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i5).getTextM(), composer3, 0, 0, 8184);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, ComposableLambda3.rememberComposableLambda(-559924292, true, new C108512(hapticFeedback, focusManager, showKeyboard, snapshotState, selection), composerStartRestartGroup, 54), false, true, true, null, composerStartRestartGroup, 907545600, 0, 1207);
            if (ParameterDropDownRow$lambda$1(snapshotState)) {
                String label = parameter.getLabel();
                composerStartRestartGroup.startReplaceGroup(5004770);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ParameterDropDownRowKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ParameterDropDownRow.ParameterDropDownRow$lambda$4$lambda$3(snapshotState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                SelectionBottomSheet3.SelectionBottomSheet(label, (Function0<Unit>) objRememberedValue2, (ImmutableList) selectionItems, (Function4) ComposableLambda3.rememberComposableLambda(-2029615257, true, new C108524(selection, hapticFeedback, onSelection), composerStartRestartGroup, 54), (Modifier) null, false, composer2, ((i3 << 3) & 896) | 3120, 48);
            } else {
                composer2 = composerStartRestartGroup;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ParameterDropDownRowKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ParameterDropDownRow.ParameterDropDownRow$lambda$5(selection, selectionItems, parameter, showKeyboard, onSelection, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ParameterDropDownRow$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: ParameterDropDownRow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ParameterDropDownRowKt$ParameterDropDownRow$2 */
    static final class C108512 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<Boolean> $expanded$delegate;
        final /* synthetic */ FocusManager $focusManager;
        final /* synthetic */ HapticFeedback $hapticFeedback;
        final /* synthetic */ InputOptionsDto $selection;
        final /* synthetic */ Function1<SettingsKeyboardState, Unit> $showKeyboard;

        /* JADX WARN: Multi-variable type inference failed */
        C108512(HapticFeedback hapticFeedback, FocusManager focusManager, Function1<? super SettingsKeyboardState, Unit> function1, SnapshotState<Boolean> snapshotState, InputOptionsDto inputOptionsDto) {
            this.$hapticFeedback = hapticFeedback;
            this.$focusManager = focusManager;
            this.$showKeyboard = function1;
            this.$expanded$delegate = snapshotState;
            this.$selection = inputOptionsDto;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(HapticFeedback hapticFeedback, FocusManager focusManager, Function1 function1, SnapshotState snapshotState) {
            hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
            focusManager.clearFocus(true);
            function1.invoke(Closed.INSTANCE);
            ParameterDropDownRow.ParameterDropDownRow$lambda$2(snapshotState, true ^ ParameterDropDownRow.ParameterDropDownRow$lambda$1(snapshotState));
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-559924292, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ParameterDropDownRow.<anonymous> (ParameterDropDownRow.kt:50)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM());
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composer.changedInstance(this.$hapticFeedback) | composer.changedInstance(this.$focusManager) | composer.changed(this.$showKeyboard);
            final HapticFeedback hapticFeedback = this.$hapticFeedback;
            final FocusManager focusManager = this.$focusManager;
            final Function1<SettingsKeyboardState, Unit> function1 = this.$showKeyboard;
            final SnapshotState<Boolean> snapshotState = this.$expanded$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ParameterDropDownRowKt$ParameterDropDownRow$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ParameterDropDownRow.C108512.invoke$lambda$1$lambda$0(hapticFeedback, focusManager, function1, snapshotState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierM5142padding3ABfNKs, false, null, null, (Function0) objRememberedValue, 7, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            InputOptionsDto inputOptionsDto = this.$selection;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM4893clickableXHw0xAI$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(inputOptionsDto.getLabel(), companion, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextM(), composer, 48, 0, 8184);
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.DROPDOWN_16), null, bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer, i2).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), null, false, composer, BentoIcon4.Size16.$stable | 48, 48);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ParameterDropDownRow$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ParameterDropDownRow$lambda$4$lambda$3(SnapshotState snapshotState) {
        ParameterDropDownRow$lambda$2(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* compiled from: ParameterDropDownRow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ParameterDropDownRowKt$ParameterDropDownRow$4 */
    static final class C108524 implements Function4<RhModalBottomSheet5, InputOptionsDto, Composer, Integer, Unit> {
        final /* synthetic */ HapticFeedback $hapticFeedback;
        final /* synthetic */ Function1<InputOptionsDto, Unit> $onSelection;
        final /* synthetic */ InputOptionsDto $selection;

        /* JADX WARN: Multi-variable type inference failed */
        C108524(InputOptionsDto inputOptionsDto, HapticFeedback hapticFeedback, Function1<? super InputOptionsDto, Unit> function1) {
            this.$selection = inputOptionsDto;
            this.$hapticFeedback = hapticFeedback;
            this.$onSelection = function1;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, InputOptionsDto inputOptionsDto, Composer composer, Integer num) {
            invoke(rhModalBottomSheet5, inputOptionsDto, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(final RhModalBottomSheet5 SelectionBottomSheet, final InputOptionsDto it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(SelectionBottomSheet, "$this$SelectionBottomSheet");
            Intrinsics.checkNotNullParameter(it, "it");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2029615257, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ParameterDropDownRow.<anonymous> (ParameterDropDownRow.kt:88)");
            }
            boolean zAreEqual = Intrinsics.areEqual(it, this.$selection);
            boolean z = !it.is_disabled();
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance = ((((i & 14) ^ 6) > 4 && composer.changedInstance(SelectionBottomSheet)) || (i & 6) == 4) | composer.changedInstance(this.$hapticFeedback) | composer.changed(this.$onSelection) | composer.changedInstance(it);
            final HapticFeedback hapticFeedback = this.$hapticFeedback;
            final Function1<InputOptionsDto, Unit> function1 = this.$onSelection;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ParameterDropDownRowKt$ParameterDropDownRow$4$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ParameterDropDownRow.C108524.invoke$lambda$1$lambda$0(hapticFeedback, function1, it, SelectionBottomSheet);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            SelectionRow5.SelectionRow(zAreEqual, (Function0) objRememberedValue, ComposableLambda3.rememberComposableLambda(-225115764, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ParameterDropDownRowKt.ParameterDropDownRow.4.2
                public final void invoke(Row5 SelectionRow, Composer composer2, int i2) {
                    long jM21426getFg20d7_KjU;
                    long jM21426getFg20d7_KjU2;
                    Intrinsics.checkNotNullParameter(SelectionRow, "$this$SelectionRow");
                    if ((i2 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-225115764, i2, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.settings.ParameterDropDownRow.<anonymous>.<anonymous> (ParameterDropDownRow.kt:97)");
                    }
                    InputOptionsDto inputOptionsDto = it;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    String label = inputOptionsDto.getLabel();
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i3 = BentoTheme.$stable;
                    TextStyle textM = bentoTheme.getTypography(composer2, i3).getTextM();
                    if (inputOptionsDto.is_disabled()) {
                        composer2.startReplaceGroup(1506645967);
                        jM21426getFg20d7_KjU = bentoTheme.getColors(composer2, i3).m21426getFg20d7_KjU();
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(1506548720);
                        jM21426getFg20d7_KjU = bentoTheme.getColors(composer2, i3).m21425getFg0d7_KjU();
                        composer2.endReplaceGroup();
                    }
                    BentoText2.m20747BentoText38GnDrw(label, companion, Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textM, composer2, 48, 0, 8184);
                    composer2.startReplaceGroup(325701554);
                    if (!StringsKt.isBlank(inputOptionsDto.getDescription())) {
                        String description = inputOptionsDto.getDescription();
                        TextStyle textM2 = bentoTheme.getTypography(composer2, i3).getTextM();
                        if (inputOptionsDto.is_disabled()) {
                            composer2.startReplaceGroup(1507232487);
                            jM21426getFg20d7_KjU2 = bentoTheme.getColors(composer2, i3).m21426getFg20d7_KjU();
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(1507127304);
                            jM21426getFg20d7_KjU2 = bentoTheme.getColors(composer2, i3).m21425getFg0d7_KjU();
                            composer2.endReplaceGroup();
                        }
                        BentoText2.m20747BentoText38GnDrw(description, companion, Color.m6701boximpl(jM21426getFg20d7_KjU2), null, null, null, null, 0, false, 0, 0, null, 0, textM2, composer2, 48, 0, 8184);
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer2, Integer num) {
                    invoke(row5, composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composer, 54), null, z, null, composer, 384, 40);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(HapticFeedback hapticFeedback, Function1 function1, InputOptionsDto inputOptionsDto, RhModalBottomSheet5 rhModalBottomSheet5) {
            hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7050getTextHandleMove5zf0vsI());
            function1.invoke(inputOptionsDto);
            RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
            return Unit.INSTANCE;
        }
    }
}
