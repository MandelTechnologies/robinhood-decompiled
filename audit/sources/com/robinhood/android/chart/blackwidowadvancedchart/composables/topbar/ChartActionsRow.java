package com.robinhood.android.chart.blackwidowadvancedchart.composables.topbar;

import android.content.Context;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.IconKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.chart.blackwidowadvancedchart.C10614R;
import com.robinhood.android.chart.blackwidowadvancedchart.LowerTopBarState;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderViewState;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.OptionChainState;
import com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderViewState;
import com.robinhood.android.chart.libblackwidowadvancedchart.C10963R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ChartActionsRow.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aS\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0011\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0012\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"OPTION_CHAIN_ENTRY_POINT", "", "INDICATORS", "CHART_SETTINGS", "ChartActionsRow", "", "lowerTopBarDisplayStatus", "Lcom/robinhood/android/chart/blackwidowadvancedchart/LowerTopBarState$DisplayStatus;", "orderViewState", "Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/AdvanceChartOrderViewState;", "onIndicatorsClicked", "Lkotlin/Function0;", "showBottomSheet", "onOptionChainClicked", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/chart/blackwidowadvancedchart/LowerTopBarState$DisplayStatus;Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/AdvanceChartOrderViewState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewChartActionsRow", "(Landroidx/compose/runtime/Composer;I)V", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.topbar.ChartActionsRowKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class ChartActionsRow {
    public static final String CHART_SETTINGS = "ChartSettings";
    public static final String INDICATORS = "Indicators";
    public static final String OPTION_CHAIN_ENTRY_POINT = "OptionChainEntryPoint";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartActionsRow$lambda$12(LowerTopBarState.DisplayStatus displayStatus, AdvanceChartOrderViewState advanceChartOrderViewState, Function0 function0, Function0 function02, Function0 function03, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ChartActionsRow(displayStatus, advanceChartOrderViewState, function0, function02, function03, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewChartActionsRow$lambda$13(int i, Composer composer, int i2) {
        PreviewChartActionsRow(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0196  */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChartActionsRow(final LowerTopBarState.DisplayStatus lowerTopBarDisplayStatus, final AdvanceChartOrderViewState advanceChartOrderViewState, final Function0<Unit> onIndicatorsClicked, Function0<Unit> showBottomSheet, final Function0<Unit> onOptionChainClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int i4;
        final HapticFeedback hapticFeedback;
        ?? r0;
        int i5;
        boolean zChangedInstance;
        Object objRememberedValue;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        final Function0<Unit> function0;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(lowerTopBarDisplayStatus, "lowerTopBarDisplayStatus");
        Intrinsics.checkNotNullParameter(onIndicatorsClicked, "onIndicatorsClicked");
        Intrinsics.checkNotNullParameter(showBottomSheet, "showBottomSheet");
        Intrinsics.checkNotNullParameter(onOptionChainClicked, "onOptionChainClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(13921482);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(lowerTopBarDisplayStatus) : composerStartRestartGroup.changedInstance(lowerTopBarDisplayStatus) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(advanceChartOrderViewState) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onIndicatorsClicked) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(showBottomSheet) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onOptionChainClicked) ? 16384 : 8192;
        }
        int i6 = i2 & 32;
        if (i6 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(13921482, i3, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.topbar.ChartActionsRow (ChartActionsRow.kt:47)");
                }
                final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                HapticFeedback hapticFeedback2 = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Modifier modifier5 = modifier4;
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(421177505);
                if (advanceChartOrderViewState instanceof EquityAdvanceChartOrderViewState) {
                    i4 = 36;
                    hapticFeedback = hapticFeedback2;
                    r0 = 0;
                    i5 = 256;
                    Unit unit = Unit.INSTANCE;
                } else {
                    final OptionChainState optionChainState = ((EquityAdvanceChartOrderViewState) advanceChartOrderViewState).getOptionChainState();
                    if (optionChainState == null) {
                        i4 = 36;
                        hapticFeedback = hapticFeedback2;
                        r0 = 0;
                        i5 = 256;
                    } else {
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        Modifier modifierM5169size3ABfNKs = SizeKt.m5169size3ABfNKs(Clip.clip(companion3, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i7).m21593getSmallD9Ej5fM())), C2002Dp.m7995constructorimpl(36));
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
                        int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5169size3ABfNKs);
                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor2);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier2, companion2.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(SizeKt.m5169size3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM()), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, OPTION_CHAIN_ENTRY_POINT, null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null);
                        BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.TUNER_24);
                        String strStringResource = StringResources_androidKt.stringResource(C10963R.string.gated_options_chart_action_options, composerStartRestartGroup, 0);
                        long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i7).m21425getFg0d7_KjU();
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        boolean zChangedInstance3 = ((57344 & i3) == 16384) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(optionChainState);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.topbar.ChartActionsRowKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ChartActionsRow.ChartActionsRow$lambda$11$lambda$3$lambda$2$lambda$1$lambda$0(onOptionChainClicked, navigator, context, optionChainState);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        r0 = 0;
                        hapticFeedback = hapticFeedback2;
                        i5 = 256;
                        i4 = 36;
                        BentoIcon2.m20644BentoIconFU0evQE(size24, strStringResource, jM21425getFg0d7_KjU, modifierAutoLogEvents$default, (Function0) objRememberedValue3, false, composerStartRestartGroup, BentoIcon4.Size24.$stable, 32);
                        composerStartRestartGroup.endNode();
                        Unit unit2 = Unit.INSTANCE;
                    }
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(421253476);
                Modifier.Companion companion4 = Modifier.INSTANCE;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i8 = BentoTheme.$stable;
                Modifier modifierClip = Clip.clip(companion4, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i8).m21593getSmallD9Ej5fM()));
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = ((i3 & 896) != i5 ? true : r0) | composerStartRestartGroup.changedInstance(hapticFeedback);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.topbar.ChartActionsRowKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ChartActionsRow.ChartActionsRow$lambda$11$lambda$5$lambda$4(hapticFeedback, onIndicatorsClicked);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierClip, false, null, null, (Function0) objRememberedValue, 7, null);
                UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                Component.ComponentType componentType = Component.ComponentType.BUTTON;
                Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(modifierM4893clickableXHw0xAI$default, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(componentType, INDICATORS, null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null);
                if (Intrinsics.areEqual(lowerTopBarDisplayStatus, LowerTopBarState.DisplayStatus.Indicators.INSTANCE)) {
                    modifierAutoLogEvents$default2 = Background3.m4872backgroundbw27NRU$default(modifierAutoLogEvents$default2, bentoTheme2.getColors(composerStartRestartGroup, i8).m21372getBg20d7_KjU(), null, 2, null);
                }
                composerStartRestartGroup.endReplaceGroup();
                float f = i4;
                Modifier modifierM5169size3ABfNKs2 = SizeKt.m5169size3ABfNKs(modifierAutoLogEvents$default2, C2002Dp.m7995constructorimpl(f));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), r0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, r0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5169size3ABfNKs2);
                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor3);
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier3, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                IconKt.m5871Iconww6aTOc(PainterResources_androidKt.painterResource(C10614R.drawable.bw_indicator_icon, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C10963R.string.bw_indicators_icon_desc, composerStartRestartGroup, 0), SizeKt.m5169size3ABfNKs(companion4, bentoTheme2.getSpacing(composerStartRestartGroup, i8).m21592getMediumD9Ej5fM()), bentoTheme2.getColors(composerStartRestartGroup, i8).m21425getFg0d7_KjU(), composerStartRestartGroup, 0, 0);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                Modifier modifierClip2 = Clip.clip(companion4, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i8).m21593getSmallD9Ej5fM()));
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(hapticFeedback) | ((i3 & 7168) != 2048);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    function0 = showBottomSheet;
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.topbar.ChartActionsRowKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ChartActionsRow.ChartActionsRow$lambda$11$lambda$9$lambda$8(hapticFeedback, function0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    function0 = showBottomSheet;
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM5169size3ABfNKs3 = SizeKt.m5169size3ABfNKs(ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(modifierClip2, false, null, null, (Function0) objRememberedValue2, 7, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(componentType, CHART_SETTINGS, null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null), C2002Dp.m7995constructorimpl(f));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
                currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5169size3ABfNKs3);
                Function0<ComposeUiNode> constructor4 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor4);
                }
                composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy3, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap4, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier4, companion2.getSetModifier());
                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.DOTS_24), StringResources_androidKt.stringResource(C10963R.string.bw_settings_icon_desc, composerStartRestartGroup, 0), bentoTheme2.getColors(composerStartRestartGroup, i8).m21425getFg0d7_KjU(), SizeKt.m5169size3ABfNKs(companion4, bentoTheme2.getSpacing(composerStartRestartGroup, i8).m21592getMediumD9Ej5fM()), null, false, composerStartRestartGroup, BentoIcon4.Size24.$stable, 48);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                function0 = showBottomSheet;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Function0<Unit> function02 = function0;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.topbar.ChartActionsRowKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ChartActionsRow.ChartActionsRow$lambda$12(lowerTopBarDisplayStatus, advanceChartOrderViewState, onIndicatorsClicked, function02, onOptionChainClicked, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        if ((74899 & i3) == 74898) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            HapticFeedback hapticFeedback22 = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
            Alignment.Companion companion5 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion5.getCenterVertically(), composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor5 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Modifier modifier52 = modifier4;
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap5, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier5, companion22.getSetModifier());
                Row6 row62 = Row6.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(421177505);
                if (advanceChartOrderViewState instanceof EquityAdvanceChartOrderViewState) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(421253476);
                Modifier.Companion companion42 = Modifier.INSTANCE;
                BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                int i82 = BentoTheme.$stable;
                Modifier modifierClip3 = Clip.clip(companion42, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme22.getSpacing(composerStartRestartGroup, i82).m21593getSmallD9Ej5fM()));
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = ((i3 & 896) != i5 ? true : r0) | composerStartRestartGroup.changedInstance(hapticFeedback);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.topbar.ChartActionsRowKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ChartActionsRow.ChartActionsRow$lambda$11$lambda$5$lambda$4(hapticFeedback, onIndicatorsClicked);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM4893clickableXHw0xAI$default2 = ClickableKt.m4893clickableXHw0xAI$default(modifierClip3, false, null, null, (Function0) objRememberedValue, 7, null);
                    UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                    Component.ComponentType componentType2 = Component.ComponentType.BUTTON;
                    Modifier modifierAutoLogEvents$default22 = ModifiersKt.autoLogEvents$default(modifierM4893clickableXHw0xAI$default2, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor2, null, null, null, null, new Component(componentType2, INDICATORS, null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null);
                    if (Intrinsics.areEqual(lowerTopBarDisplayStatus, LowerTopBarState.DisplayStatus.Indicators.INSTANCE)) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    float f2 = i4;
                    Modifier modifierM5169size3ABfNKs22 = SizeKt.m5169size3ABfNKs(modifierAutoLogEvents$default22, C2002Dp.m7995constructorimpl(f2));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getCenter(), r0);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, r0);
                    CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5169size3ABfNKs22);
                    Function0<ComposeUiNode> constructor32 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy22, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap32, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting()) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier32, companion22.getSetModifier());
                        BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                        IconKt.m5871Iconww6aTOc(PainterResources_androidKt.painterResource(C10614R.drawable.bw_indicator_icon, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C10963R.string.bw_indicators_icon_desc, composerStartRestartGroup, 0), SizeKt.m5169size3ABfNKs(companion42, bentoTheme22.getSpacing(composerStartRestartGroup, i82).m21592getMediumD9Ej5fM()), bentoTheme22.getColors(composerStartRestartGroup, i82).m21425getFg0d7_KjU(), composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endNode();
                        Modifier modifierClip22 = Clip.clip(companion42, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme22.getSpacing(composerStartRestartGroup, i82).m21593getSmallD9Ej5fM()));
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        zChangedInstance2 = composerStartRestartGroup.changedInstance(hapticFeedback) | ((i3 & 7168) != 2048);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2) {
                            function0 = showBottomSheet;
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.topbar.ChartActionsRowKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ChartActionsRow.ChartActionsRow$lambda$11$lambda$9$lambda$8(hapticFeedback, function0);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierM5169size3ABfNKs32 = SizeKt.m5169size3ABfNKs(ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(modifierClip22, false, null, null, (Function0) objRememberedValue2, 7, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(componentType2, CHART_SETTINGS, null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null), C2002Dp.m7995constructorimpl(f2));
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy32 = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getCenter(), false);
                            currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap42 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier42 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5169size3ABfNKs32);
                            Function0<ComposeUiNode> constructor42 = companion22.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy32, companion22.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap42, companion22.getSetResolvedCompositionLocals());
                            setCompositeKeyHash3 = companion22.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl3.getInserting()) {
                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier42, companion22.getSetModifier());
                                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.DOTS_24), StringResources_androidKt.stringResource(C10963R.string.bw_settings_icon_desc, composerStartRestartGroup, 0), bentoTheme22.getColors(composerStartRestartGroup, i82).m21425getFg0d7_KjU(), SizeKt.m5169size3ABfNKs(companion42, bentoTheme22.getSpacing(composerStartRestartGroup, i82).m21592getMediumD9Ej5fM()), null, false, composerStartRestartGroup, BentoIcon4.Size24.$stable, 48);
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier3 = modifier52;
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartActionsRow$lambda$11$lambda$3$lambda$2$lambda$1$lambda$0(Function0 function0, Navigator navigator, Context context, OptionChainState optionChainState) {
        function0.invoke();
        Navigator.DefaultImpls.startActivity$default(navigator, context, optionChainState.getIntentKey(), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartActionsRow$lambda$11$lambda$5$lambda$4(HapticFeedback hapticFeedback, Function0 function0) {
        hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartActionsRow$lambda$11$lambda$9$lambda$8(HapticFeedback hapticFeedback, Function0 function0) {
        hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
        function0.invoke();
        return Unit.INSTANCE;
    }

    private static final void PreviewChartActionsRow(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1285227553);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1285227553, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.topbar.PreviewChartActionsRow (ChartActionsRow.kt:154)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ChartActionsRow2.INSTANCE.m1802x6fb5798d(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.topbar.ChartActionsRowKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChartActionsRow.PreviewChartActionsRow$lambda$13(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
