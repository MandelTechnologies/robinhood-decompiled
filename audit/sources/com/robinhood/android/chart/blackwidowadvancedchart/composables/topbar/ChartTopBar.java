package com.robinhood.android.chart.blackwidowadvancedchart.composables.topbar;

import android.content.Context;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.IconButton5;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvanceChartCallbacks;
import com.robinhood.android.chart.blackwidowadvancedchart.LowerTopBarState;
import com.robinhood.android.chart.blackwidowadvancedchart.TopBarState;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.Helpers3;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderViewState;
import com.robinhood.android.chart.blackwidowadvancedchart.models.ChartSettings;
import com.robinhood.android.chart.blackwidowadvancedchart.models.InstrumentSearch;
import com.robinhood.android.chart.blackwidowadvancedchart.utils.HapticEvents;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.compose.bento.component.BentoAppBarDefaults;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ChartTopBar.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a]\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"ChartTopBar", "", "state", "Lcom/robinhood/android/chart/blackwidowadvancedchart/TopBarState;", "orderViewState", "Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/AdvanceChartOrderViewState;", "showTopBar", "", "webViewVersionUnsupported", "chartCallbacks", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvanceChartCallbacks;", "onBackPressed", "Lkotlin/Function0;", "onIndicatorsClicked", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/chart/blackwidowadvancedchart/TopBarState;Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/AdvanceChartOrderViewState;ZZLcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvanceChartCallbacks;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TopAppBarPreview", "(Landroidx/compose/runtime/Composer;I)V", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.topbar.ChartTopBarKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class ChartTopBar {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartTopBar$lambda$11(TopBarState topBarState, AdvanceChartOrderViewState advanceChartOrderViewState, boolean z, boolean z2, BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ChartTopBar(topBarState, advanceChartOrderViewState, z, z2, blackWidowAdvanceChartCallbacks, function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopAppBarPreview$lambda$12(int i, Composer composer, int i2) {
        TopAppBarPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ChartTopBar(final TopBarState state, final AdvanceChartOrderViewState advanceChartOrderViewState, final boolean z, final boolean z2, final BlackWidowAdvanceChartCallbacks chartCallbacks, final Function0<Unit> onBackPressed, final Function0<Unit> onIndicatorsClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Composer composer2;
        int i5;
        int i6;
        Composer composer3;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(chartCallbacks, "chartCallbacks");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        Intrinsics.checkNotNullParameter(onIndicatorsClicked, "onIndicatorsClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(179853970);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
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
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= (i & 32768) == 0 ? composerStartRestartGroup.changed(chartCallbacks) : composerStartRestartGroup.changedInstance(chartCallbacks) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackPressed) ? 131072 : 65536;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onIndicatorsClicked) ? 1048576 : 524288;
        }
        int i7 = i2 & 128;
        if (i7 != 0) {
            i3 |= 12582912;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            if ((i & 12582912) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier2) ? 8388608 : 4194304;
            }
        }
        if ((i3 & 4793491) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer3 = composerStartRestartGroup;
            modifier3 = modifier2;
        } else {
            if (i7 != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            Modifier modifier4 = modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(179853970, i3, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.topbar.ChartTopBar (ChartTopBar.kt:54)");
            }
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i8 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Background3.m4872backgroundbw27NRU$default(modifier4, bentoTheme.getColors(composerStartRestartGroup, i8).m21371getBg0d7_KjU(), null, 2, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i8).m21597getXxsmallD9Ej5fM(), 7, null);
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            IconButton5.IconButton(onBackPressed, ModifiersKt.autoLogEvents$default(TestTag3.testTag(Background3.m4872backgroundbw27NRU$default(companion3, bentoTheme.getColors(composerStartRestartGroup, i8).m21371getBg0d7_KjU(), null, 2, null), BentoAppBarDefaults.NavIconTestTag), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BACK_BUTTON, null, null, 6, null), null, 47, null), false, false, false, true, false, null, 110, null), false, null, null, ChartTopBar2.INSTANCE.m1804xb699aa4d(), composerStartRestartGroup, ((i3 >> 15) & 14) | 196608, 28);
            composerStartRestartGroup.startReplaceGroup(-2058949802);
            boolean z3 = true;
            if (z2) {
                i4 = 16384;
                composer2 = composerStartRestartGroup;
                i5 = 57344;
                i6 = i3;
            } else {
                composerStartRestartGroup.startReplaceGroup(-2058946624);
                Modifier modifierWeight$default = Row5.weight$default(row6, companion3, 1.0f, false, 2, null);
                if (z) {
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    i5 = 57344;
                    boolean zChangedInstance = ((i3 & 57344) == 16384 || ((i3 & 32768) != 0 && composerStartRestartGroup.changedInstance(chartCallbacks))) | composerStartRestartGroup.changedInstance(context);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.topbar.ChartTopBarKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ChartTopBar.ChartTopBar$lambda$10$lambda$2$lambda$1$lambda$0(context, chartCallbacks);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    modifierWeight$default = ClickableKt.m4893clickableXHw0xAI$default(modifierWeight$default, false, null, null, (Function0) objRememberedValue, 7, null);
                } else {
                    i5 = 57344;
                }
                Modifier modifier5 = modifierWeight$default;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM5158heightInVpY3zN4$default = SizeKt.m5158heightInVpY3zN4$default(Background3.m4871backgroundbw27NRU(ModifiersKt.autoLogEvents$default(modifier5, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.SEARCH_BAR, null, null, 6, null), null, 47, null), false, false, false, true, false, null, 110, null), bentoTheme.getColors(composerStartRestartGroup, i8).m21372getBg20d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i8).m21593getSmallD9Ej5fM())), C2002Dp.m7995constructorimpl(36), 0.0f, 2, null);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.topbar.ChartTopBarKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ChartTopBar.ChartTopBar$lambda$10$lambda$4$lambda$3((SemanticsPropertyReceiver) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(modifierM5158heightInVpY3zN4$default, false, (Function1) objRememberedValue2, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierSemantics$default);
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
                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                composer2 = composerStartRestartGroup;
                i4 = 16384;
                i6 = i3;
                TopBarQuoteRow.TopBarQuoteRow(state.getQuoteState(), advanceChartOrderViewState != null ? advanceChartOrderViewState.getSymbol() : null, z, PaddingKt.m5146paddingqDBjuR0$default(companion3, Helpers3.getBW_ADVANCE_CHART_STANDARD_PADDING(), 0.0f, 0.0f, 0.0f, 14, null), composer2, StringResource.$stable | 3072 | (i3 & 896), 0);
                composer2.endNode();
            }
            composer2.endReplaceGroup();
            Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion3, bentoTheme.getSpacing(composer2, i8).m21593getSmallD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer2, i8).m21590getDefaultD9Ej5fM(), 0.0f, 10, null);
            LowerTopBarState.DisplayStatus lowerTopBarDisplayStatus = state.getLowerTopBarDisplayStatus();
            composer2.startReplaceGroup(5004770);
            int i9 = i6 & i5;
            boolean z4 = i9 == i4 || ((i6 & 32768) != 0 && composer2.changedInstance(chartCallbacks));
            Object objRememberedValue3 = composer2.rememberedValue();
            if (z4 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.topbar.ChartTopBarKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ChartTopBar.ChartTopBar$lambda$10$lambda$7$lambda$6(chartCallbacks);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue3);
            }
            Function0 function0 = (Function0) objRememberedValue3;
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(5004770);
            if (i9 != i4 && ((i6 & 32768) == 0 || !composer2.changedInstance(chartCallbacks))) {
                z3 = false;
            }
            Object objRememberedValue4 = composer2.rememberedValue();
            if (z3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.topbar.ChartTopBarKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ChartTopBar.ChartTopBar$lambda$10$lambda$9$lambda$8(chartCallbacks);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue4);
            }
            composer2.endReplaceGroup();
            Composer composer4 = composer2;
            ChartActionsRow.ChartActionsRow(lowerTopBarDisplayStatus, advanceChartOrderViewState, onIndicatorsClicked, function0, (Function0) objRememberedValue4, modifierM5146paddingqDBjuR0$default2, composer4, (i6 & 112) | ((i6 >> 12) & 896), 0);
            composer3 = composer4;
            composer3.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.topbar.ChartTopBarKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChartTopBar.ChartTopBar$lambda$11(state, advanceChartOrderViewState, z, z2, chartCallbacks, onBackPressed, onIndicatorsClicked, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartTopBar$lambda$10$lambda$2$lambda$1$lambda$0(Context context, BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks) {
        HapticEvents.mediumHapticEvent(context);
        BlackWidowAdvanceChartCallbacks.DefaultImpls.setScreenState$default(blackWidowAdvanceChartCallbacks, InstrumentSearch.INSTANCE, false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartTopBar$lambda$10$lambda$4$lambda$3(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
        SemanticsPropertiesKt.setTestTag(semantics, "instrument_search_bar");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartTopBar$lambda$10$lambda$7$lambda$6(BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks) {
        BlackWidowAdvanceChartCallbacks.DefaultImpls.setScreenState$default(blackWidowAdvanceChartCallbacks, new ChartSettings(false, null, 3, null), false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartTopBar$lambda$10$lambda$9$lambda$8(BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks) {
        blackWidowAdvanceChartCallbacks.hideIndicatorsRow();
        return Unit.INSTANCE;
    }

    private static final void TopAppBarPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(459605360);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(459605360, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.topbar.TopAppBarPreview (ChartTopBar.kt:142)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ChartTopBar2.INSTANCE.m1803x16c8fadc(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.topbar.ChartTopBarKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChartTopBar.TopAppBarPreview$lambda$12(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
