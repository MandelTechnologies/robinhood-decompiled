package com.robinhood.android.retirement.p239ui.funded;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.retirement.lib.UninvestedSection3;
import com.robinhood.android.retirement.lib.UninvestedSectionState;
import com.robinhood.android.retirement.p239ui.PostChartSection4;
import com.robinhood.android.retirement.p239ui.funded.RetirementDashboardChartFooter;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RetirementDashboardChartFooter.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\b\u001a\u001a\u0010\t\u001a\u00020\u0005*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"ChartFooterPlaceholderTag", "", "ChartFooterPlaceholderText", "ChartFooterPlaceholderMetaText", "DashboardChartFooterPlaceholder", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "chartFooterSection", "Landroidx/compose/foundation/lazy/LazyListScope;", "state", "Lcom/robinhood/android/retirement/ui/funded/ChartFooter;", "callbacks", "Lcom/robinhood/android/retirement/ui/funded/ChartFooterCallbacks;", "feature-retirement-tab_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.retirement.ui.funded.RetirementDashboardChartFooterKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RetirementDashboardChartFooter6 {
    private static final String ChartFooterPlaceholderMetaText = "$X,XXX.XX";
    public static final String ChartFooterPlaceholderTag = "chart_footer_placeholder";
    private static final String ChartFooterPlaceholderText = "Buying power";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DashboardChartFooterPlaceholder$lambda$0(Modifier modifier, int i, int i2, Composer composer, int i3) {
        DashboardChartFooterPlaceholder(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DashboardChartFooterPlaceholder(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1492976392);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1492976392, i3, -1, "com.robinhood.android.retirement.ui.funded.DashboardChartFooterPlaceholder (RetirementDashboardChartFooter.kt:46)");
            }
            LocalShowPlaceholder.Loadable(true, TestTag3.testTag(modifier, ChartFooterPlaceholderTag), null, RetirementDashboardChartFooter3.INSTANCE.m18212getLambda$713875832$feature_retirement_tab_externalDebug(), composerStartRestartGroup, 3078, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.ui.funded.RetirementDashboardChartFooterKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RetirementDashboardChartFooter6.DashboardChartFooterPlaceholder$lambda$0(modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void chartFooterSection(LazyListScope lazyListScope, final RetirementDashboardChartFooter state, final RetirementDashboardChartFooter2 callbacks) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        if (!(state instanceof RetirementDashboardChartFooter.InvestmentAndTrade)) {
            if (state instanceof RetirementDashboardChartFooter.Loading) {
                LazyListScope.item$default(lazyListScope, DashboardSectionKey.ChartFooter, null, RetirementDashboardChartFooter3.INSTANCE.getLambda$219444843$feature_retirement_tab_externalDebug(), 2, null);
                return;
            } else {
                if (!(state instanceof RetirementDashboardChartFooter.Uninvested)) {
                    throw new NoWhenBranchMatchedException();
                }
                LazyListScope.item$default(lazyListScope, DashboardSectionKey.ChartFooter, null, ComposableLambda3.composableLambdaInstance(-484418132, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.ui.funded.RetirementDashboardChartFooterKt.chartFooterSection.2
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
                            ComposerKt.traceEventStart(-484418132, i, -1, "com.robinhood.android.retirement.ui.funded.chartFooterSection.<anonymous> (RetirementDashboardChartFooter.kt:79)");
                        }
                        RetirementDashboardChartFooter retirementDashboardChartFooter = state;
                        RetirementDashboardChartFooter2 retirementDashboardChartFooter2 = callbacks;
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
                        RetirementDashboardChartFooter.Uninvested uninvested = (RetirementDashboardChartFooter.Uninvested) retirementDashboardChartFooter;
                        PostChartSection4.RetirementDashboardPostChartSection(uninvested.getAccountNumber(), uninvested.getSectionState().getAccountType(), null, composer, 0, 4);
                        UninvestedSection3.UninvestedSection(null, uninvested.getSectionState(), retirementDashboardChartFooter2, composer, UninvestedSectionState.$stable << 3, 1);
                        composer.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), 2, null);
                return;
            }
        }
        SduiColumns.sduiItems(lazyListScope, ((RetirementDashboardChartFooter.InvestmentAndTrade) state).getComponents(), GenericAction.class, null, callbacks, HorizontalPadding.Default);
        LazyListScope.item$default(lazyListScope, DashboardSectionKey.ChartFooter, null, ComposableLambda3.composableLambdaInstance(-1811135308, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.ui.funded.RetirementDashboardChartFooterKt.chartFooterSection.1
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
                    ComposerKt.traceEventStart(-1811135308, i, -1, "com.robinhood.android.retirement.ui.funded.chartFooterSection.<anonymous> (RetirementDashboardChartFooter.kt:67)");
                }
                PostChartSection4.RetirementDashboardPostChartSection(((RetirementDashboardChartFooter.InvestmentAndTrade) state).getAccountNumber(), ((RetirementDashboardChartFooter.InvestmentAndTrade) state).getBrokerageAccountType(), null, composer, 0, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 2, null);
    }
}
