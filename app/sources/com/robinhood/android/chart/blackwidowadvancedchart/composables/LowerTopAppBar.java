package com.robinhood.android.chart.blackwidowadvancedchart.composables;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorAction;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorStateDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.ToggleIndicatorVisibilityAction;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvanceChartCallbacks;
import com.robinhood.android.chart.blackwidowadvancedchart.IndicatorQuickAccessState;
import com.robinhood.android.chart.blackwidowadvancedchart.LowerTopBarState;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.LowerTopAppBar;
import com.robinhood.android.chart.blackwidowadvancedchart.composables.indicators.IndicatorQuickAccessRowKt;
import com.robinhood.android.chart.blackwidowadvancedchart.models.AddIndicator;
import com.robinhood.android.chart.blackwidowadvancedchart.models.CreateTemplate;
import com.robinhood.android.chart.blackwidowadvancedchart.models.IndicatorSettings;
import com.robinhood.android.chart.blackwidowadvancedchart.models.SelectTemplate;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LowerTopAppBar.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"LowerTopAppBar", "", "state", "Lcom/robinhood/android/chart/blackwidowadvancedchart/LowerTopBarState;", "chartCallbacks", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvanceChartCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/chart/blackwidowadvancedchart/LowerTopBarState;Lcom/robinhood/android/chart/blackwidowadvancedchart/BlackWidowAdvanceChartCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.LowerTopAppBarKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class LowerTopAppBar {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int LowerTopAppBar$lambda$3$lambda$2$lambda$0(int i) {
        return -i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int LowerTopAppBar$lambda$3$lambda$2$lambda$1(int i) {
        return -i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LowerTopAppBar$lambda$4(LowerTopBarState lowerTopBarState, BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LowerTopAppBar(lowerTopBarState, blackWidowAdvanceChartCallbacks, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LowerTopAppBar(final LowerTopBarState state, final BlackWidowAdvanceChartCallbacks chartCallbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(chartCallbacks, "chartCallbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(251671599);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(chartCallbacks) : composerStartRestartGroup.changedInstance(chartCallbacks) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(251671599, i3, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.LowerTopAppBar (LowerTopAppBar.kt:26)");
                }
                LowerTopBarState.DisplayStatus displayStatus = state.getDisplayStatus();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.LowerTopAppBarKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LowerTopAppBar.LowerTopAppBar$lambda$3$lambda$2((AnimatedContentTransitionScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                AnimatedContentKt.AnimatedContent(displayStatus, modifier4, (Function1) objRememberedValue, null, null, null, ComposableLambda3.rememberComposableLambda(-1263667424, true, new C106342(state, chartCallbacks), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 3) & 112) | 1573248, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.LowerTopAppBarKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LowerTopAppBar.LowerTopAppBar$lambda$4(state, chartCallbacks, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            LowerTopBarState.DisplayStatus displayStatus2 = state.getDisplayStatus();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            AnimatedContentKt.AnimatedContent(displayStatus2, modifier4, (Function1) objRememberedValue, null, null, null, ComposableLambda3.rememberComposableLambda(-1263667424, true, new C106342(state, chartCallbacks), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 3) & 112) | 1573248, 56);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentTransform LowerTopAppBar$lambda$3$lambda$2(AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInVertically$default(null, new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.LowerTopAppBarKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(LowerTopAppBar.LowerTopAppBar$lambda$3$lambda$2$lambda$0(((Integer) obj).intValue()));
            }
        }, 1, null), EnterExitTransitionKt.slideOutVertically$default(null, new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.LowerTopAppBarKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(LowerTopAppBar.LowerTopAppBar$lambda$3$lambda$2$lambda$1(((Integer) obj).intValue()));
            }
        }, 1, null));
    }

    /* compiled from: LowerTopAppBar.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.composables.LowerTopAppBarKt$LowerTopAppBar$2 */
    static final class C106342 implements Function4<AnimatedContentScope, LowerTopBarState.DisplayStatus, Composer, Integer, Unit> {
        final /* synthetic */ BlackWidowAdvanceChartCallbacks $chartCallbacks;
        final /* synthetic */ LowerTopBarState $state;

        C106342(LowerTopBarState lowerTopBarState, BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks) {
            this.$state = lowerTopBarState;
            this.$chartCallbacks = blackWidowAdvanceChartCallbacks;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, LowerTopBarState.DisplayStatus displayStatus, Composer composer, Integer num) {
            invoke(animatedContentScope, displayStatus, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedContentScope AnimatedContent, LowerTopBarState.DisplayStatus targetState, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            Intrinsics.checkNotNullParameter(targetState, "targetState");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1263667424, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.composables.LowerTopAppBar.<anonymous> (LowerTopAppBar.kt:34)");
            }
            LowerTopBarState lowerTopBarState = this.$state;
            final BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks = this.$chartCallbacks;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU(), 0.0f, composer, 0, 5);
            composer.startReplaceGroup(2032385914);
            if (Intrinsics.areEqual(targetState, LowerTopBarState.DisplayStatus.Indicators.INSTANCE)) {
                IndicatorQuickAccessState indicatorQuickAccessState = lowerTopBarState.getIndicatorQuickAccessState();
                if (indicatorQuickAccessState != null) {
                    BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU(), 0.0f, composer, 0, 5);
                    composer.startReplaceGroup(5004770);
                    boolean zChangedInstance = composer.changedInstance(blackWidowAdvanceChartCallbacks);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.LowerTopAppBarKt$LowerTopAppBar$2$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return LowerTopAppBar.C106342.invoke$lambda$11$lambda$10$lambda$1$lambda$0(blackWidowAdvanceChartCallbacks);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    Function0 function0 = (Function0) objRememberedValue;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(5004770);
                    boolean zChangedInstance2 = composer.changedInstance(blackWidowAdvanceChartCallbacks);
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.LowerTopAppBarKt$LowerTopAppBar$2$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return LowerTopAppBar.C106342.invoke$lambda$11$lambda$10$lambda$3$lambda$2(blackWidowAdvanceChartCallbacks, (IndicatorStateDto) obj);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    Function1 function1 = (Function1) objRememberedValue2;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(5004770);
                    boolean zChangedInstance3 = composer.changedInstance(blackWidowAdvanceChartCallbacks);
                    Object objRememberedValue3 = composer.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.LowerTopAppBarKt$LowerTopAppBar$2$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return LowerTopAppBar.C106342.invoke$lambda$11$lambda$10$lambda$5$lambda$4(blackWidowAdvanceChartCallbacks, (IndicatorStateDto) obj);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    Function1 function12 = (Function1) objRememberedValue3;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(5004770);
                    boolean zChangedInstance4 = composer.changedInstance(blackWidowAdvanceChartCallbacks);
                    Object objRememberedValue4 = composer.rememberedValue();
                    if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.LowerTopAppBarKt$LowerTopAppBar$2$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return LowerTopAppBar.C106342.invoke$lambda$11$lambda$10$lambda$7$lambda$6(blackWidowAdvanceChartCallbacks);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue4);
                    }
                    Function0 function02 = (Function0) objRememberedValue4;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(5004770);
                    boolean zChangedInstance5 = composer.changedInstance(blackWidowAdvanceChartCallbacks);
                    Object objRememberedValue5 = composer.rememberedValue();
                    if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new Function0() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.composables.LowerTopAppBarKt$LowerTopAppBar$2$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return LowerTopAppBar.C106342.invoke$lambda$11$lambda$10$lambda$9$lambda$8(blackWidowAdvanceChartCallbacks);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue5);
                    }
                    composer.endReplaceGroup();
                    IndicatorQuickAccessRowKt.IndicatorQuickAccessRow(indicatorQuickAccessState, function0, function1, function12, function02, (Function0) objRememberedValue5, null, composer, 0, 64);
                    BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU(), 0.0f, composer, 0, 5);
                }
            } else if (!Intrinsics.areEqual(targetState, LowerTopBarState.DisplayStatus.Gone.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$11$lambda$10$lambda$1$lambda$0(BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks) {
            BlackWidowAdvanceChartCallbacks.DefaultImpls.setScreenState$default(blackWidowAdvanceChartCallbacks, AddIndicator.INSTANCE, false, 2, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$11$lambda$10$lambda$3$lambda$2(BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks, IndicatorStateDto indicator) {
            Intrinsics.checkNotNullParameter(indicator, "indicator");
            blackWidowAdvanceChartCallbacks.updateIndicator(indicator.getUuid(), new IndicatorAction(null, null, null, new ToggleIndicatorVisibilityAction(null, 1, null), null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, null));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$11$lambda$10$lambda$5$lambda$4(BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks, IndicatorStateDto indicator) {
            Intrinsics.checkNotNullParameter(indicator, "indicator");
            BlackWidowAdvanceChartCallbacks.DefaultImpls.setScreenState$default(blackWidowAdvanceChartCallbacks, new IndicatorSettings(indicator), false, 2, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$11$lambda$10$lambda$9$lambda$8(BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks) {
            BlackWidowAdvanceChartCallbacks.DefaultImpls.setScreenState$default(blackWidowAdvanceChartCallbacks, new CreateTemplate(false, true, false, null, 12, null), false, 2, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$11$lambda$10$lambda$7$lambda$6(BlackWidowAdvanceChartCallbacks blackWidowAdvanceChartCallbacks) {
            BlackWidowAdvanceChartCallbacks.DefaultImpls.setScreenState$default(blackWidowAdvanceChartCallbacks, new SelectTemplate(false, null, 3, null), false, 2, null);
            return Unit.INSTANCE;
        }
    }
}
