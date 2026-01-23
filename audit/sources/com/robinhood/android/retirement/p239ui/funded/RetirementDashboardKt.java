package com.robinhood.android.retirement.p239ui.funded;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier7;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.dashboard.insights.InsightsRow;
import com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverview;
import com.robinhood.android.advisory.dashboard.portfolio.holdings.PortfolioHoldings;
import com.robinhood.android.common.portfolio.C11511R;
import com.robinhood.android.common.portfolio.positionsList.ReorderablePositionsList;
import com.robinhood.android.common.portfolio.positionsList.ReorderablePositionsList2;
import com.robinhood.android.dashboard.lib.Positions2;
import com.robinhood.android.dashboard.lib.appbar.DashboardAppBar3;
import com.robinhood.android.dashboard.lib.footer.FooterVisibilityState;
import com.robinhood.android.dashboard.lib.footer.FooterVisibilityState2;
import com.robinhood.android.dashboard.recurring.DashboardRecurringSection;
import com.robinhood.android.designsystem.tooltip.RdsTooltipView;
import com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureComposable3;
import com.robinhood.android.home.contracts.HomeDashboardType;
import com.robinhood.android.lib.performancechart.PerformanceChartComposable;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDecoratorKt;
import com.robinhood.android.models.portfolio.api.PerformanceChartType;
import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
import com.robinhood.android.models.retirement.p194db.MatchRateBreakdown;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.retirement.dashboard.contribution.ContributionsSummaryCard2;
import com.robinhood.android.retirement.dashboard.header.GoldMatchInfoTag;
import com.robinhood.android.retirement.dashboard.header.RetirementDashboardHeader2;
import com.robinhood.android.retirement.dashboard.header.RetirementDashboardHeader3;
import com.robinhood.android.retirement.p239ui.funded.RetirementDashboardKt;
import com.robinhood.compose.bento.component.TopBarScrollState;
import com.robinhood.compose.bento.component.TopBarScrollState3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.api.FeatureDiscoveryLocation;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.home.component.DashboardComponent;
import com.robinhood.models.p320db.IacInfoBannerLocation;
import com.robinhood.shared.feature.discovery.p382ui.FeatureDiscoveryComponent;
import com.robinhood.shared.iac.infobanner.InfoBannerComponent;
import com.robinhood.tooltips.ModifiersKt;
import com.robinhood.tooltips.TooltipData;
import com.robinhood.utils.compose.reorderable.ReorderableLazyColumnKt;
import com.robinhood.utils.compose.reorderable.ReorderableLazyListScope;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RetirementDashboard.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u001a/\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a/\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\"\u0010\u0010\u000b\u001a\u00020\f8\u0000X\u0081T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"RetirementDashboard", "", "modifier", "Landroidx/compose/ui/Modifier;", "viewState", "Lcom/robinhood/android/retirement/ui/funded/RetirementDashboardViewState;", "listState", "Landroidx/compose/foundation/lazy/LazyListState;", "callbacks", "Lcom/robinhood/android/retirement/ui/funded/FundedDashboardCallbacks;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/retirement/ui/funded/RetirementDashboardViewState;Landroidx/compose/foundation/lazy/LazyListState;Lcom/robinhood/android/retirement/ui/funded/FundedDashboardCallbacks;Landroidx/compose/runtime/Composer;II)V", "FundedDashboardLazyColumnTag", "", "RetirementDashboardScrollContent", "LAZY_COLUMN_TAG", "RETIREMENT_OPTIONS_ASSET_HOME_HEADER_TAG", "", "feature-retirement-tab_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RetirementDashboardKt {
    public static final String FundedDashboardLazyColumnTag = "funded_dashboard_lazy_column";
    private static final String LAZY_COLUMN_TAG = "retirement_dashboard_lazy_column";
    private static final int RETIREMENT_OPTIONS_ASSET_HOME_HEADER_TAG = 20240503;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RetirementDashboard$lambda$0(Modifier modifier, RetirementDashboardViewState retirementDashboardViewState, LazyListState lazyListState, FundedDashboardCallbacks fundedDashboardCallbacks, int i, int i2, Composer composer, int i3) {
        RetirementDashboard(modifier, retirementDashboardViewState, lazyListState, fundedDashboardCallbacks, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RetirementDashboardScrollContent$lambda$3(Modifier modifier, RetirementDashboardViewState retirementDashboardViewState, LazyListState lazyListState, FundedDashboardCallbacks fundedDashboardCallbacks, int i, int i2, Composer composer, int i3) {
        RetirementDashboardScrollContent(modifier, retirementDashboardViewState, lazyListState, fundedDashboardCallbacks, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void RetirementDashboard(Modifier modifier, final RetirementDashboardViewState viewState, final LazyListState listState, final FundedDashboardCallbacks callbacks, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Composer composer2;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(listState, "listState");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(972553098);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(viewState) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(listState) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(callbacks) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(972553098, i3, -1, "com.robinhood.android.retirement.ui.funded.RetirementDashboard (RetirementDashboard.kt:80)");
            }
            final TopBarScrollState topBarScrollStateRememberTopBarScrollState = TopBarScrollState3.rememberTopBarScrollState(0.0f, composerStartRestartGroup, 0, 1);
            FooterVisibilityState footerVisibilityStateRememberFooterVisibilityState = FooterVisibilityState2.rememberFooterVisibilityState(false, composerStartRestartGroup, 0, 1);
            String activeAccountNumber = viewState.getActiveAccountNumber();
            final HomeDashboardType.Account account = (viewState.getActiveBrokerageAccountType() == null || activeAccountNumber == null) ? null : new HomeDashboardType.Account(activeAccountNumber);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            composer2 = composerStartRestartGroup;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier4, ComposableLambda3.rememberComposableLambda(1527470150, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.ui.funded.RetirementDashboardKt.RetirementDashboard.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i6) {
                    if ((i6 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1527470150, i6, -1, "com.robinhood.android.retirement.ui.funded.RetirementDashboard.<anonymous> (RetirementDashboard.kt:99)");
                    }
                    if (account != null && !viewState.isEmbedded()) {
                        DashboardAppBar3.DashboardAppBar(account, topBarScrollStateRememberTopBarScrollState, TopBarScrollState3.scrollableTopBarState(Modifier.INSTANCE, listState, topBarScrollStateRememberTopBarScrollState), null, null, false, composer3, TopBarScrollState.$stable << 3, 56);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, null, 0, bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(1055007643, true, new C272262(viewState, callbacks, footerVisibilityStateRememberFooterVisibilityState, listState), composerStartRestartGroup, 54), composer2, (i3 & 14) | 805306416, 316);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.ui.funded.RetirementDashboardKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RetirementDashboardKt.RetirementDashboard$lambda$0(modifier3, viewState, listState, callbacks, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: RetirementDashboard.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.retirement.ui.funded.RetirementDashboardKt$RetirementDashboard$2 */
    static final class C272262 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ FundedDashboardCallbacks $callbacks;
        final /* synthetic */ FooterVisibilityState $footerVisibilityState;
        final /* synthetic */ LazyListState $listState;
        final /* synthetic */ RetirementDashboardViewState $viewState;

        C272262(RetirementDashboardViewState retirementDashboardViewState, FundedDashboardCallbacks fundedDashboardCallbacks, FooterVisibilityState footerVisibilityState, LazyListState lazyListState) {
            this.$viewState = retirementDashboardViewState;
            this.$callbacks = fundedDashboardCallbacks;
            this.$footerVisibilityState = footerVisibilityState;
            this.$listState = lazyListState;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(paddingValues) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1055007643, i2, -1, "com.robinhood.android.retirement.ui.funded.RetirementDashboard.<anonymous> (RetirementDashboard.kt:111)");
            }
            Modifier modifierM4893clickableXHw0xAI$default = Modifier.INSTANCE;
            Modifier modifierPadding = PaddingKt.padding(modifierM4893clickableXHw0xAI$default, paddingValues);
            final RetirementDashboardViewState retirementDashboardViewState = this.$viewState;
            final FundedDashboardCallbacks fundedDashboardCallbacks = this.$callbacks;
            final FooterVisibilityState footerVisibilityState = this.$footerVisibilityState;
            final LazyListState lazyListState = this.$listState;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierPadding);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            final Column6 column6 = Column6.INSTANCE;
            Integer numValueOf = Integer.valueOf(RetirementDashboardKt.RETIREMENT_OPTIONS_ASSET_HOME_HEADER_TAG);
            composer.startReplaceGroup(-1944416473);
            if (retirementDashboardViewState.getShouldShowRetirementOptionsAssetHomeTooltip()) {
                String strStringResource = StringResources_androidKt.stringResource(C11511R.string.asset_header_tooltip, composer, 0);
                TooltipData.Layout layout = new TooltipData.Layout(RdsTooltipView.NibDirection.f4107UP, 0.0f, null, RetirementDashboardKt.LAZY_COLUMN_TAG, 6, null);
                composer.startReplaceGroup(5004770);
                boolean zChanged = composer.changed(fundedDashboardCallbacks);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.retirement.ui.funded.RetirementDashboardKt$RetirementDashboard$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return RetirementDashboardKt.C272262.invoke$lambda$6$lambda$1$lambda$0(fundedDashboardCallbacks, (View) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function1 function1 = (Function1) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean zChanged2 = composer.changed(fundedDashboardCallbacks);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.retirement.ui.funded.RetirementDashboardKt$RetirementDashboard$2$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RetirementDashboardKt.C272262.invoke$lambda$6$lambda$3$lambda$2(fundedDashboardCallbacks);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                Modifier modifier = ModifiersKt.tooltip$default(modifierM4893clickableXHw0xAI$default, strStringResource, layout, new TooltipData.Behavior(null, null, function1, (Function0) objRememberedValue2, 3, null), null, true, 8, null);
                composer.startReplaceGroup(5004770);
                boolean zChanged3 = composer.changed(fundedDashboardCallbacks);
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.retirement.ui.funded.RetirementDashboardKt$RetirementDashboard$2$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RetirementDashboardKt.C272262.invoke$lambda$6$lambda$5$lambda$4(fundedDashboardCallbacks);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifier, false, null, null, (Function0) objRememberedValue3, 7, null);
            }
            composer.endReplaceGroup();
            SduiDecoratorKt.ProvideSduiTagBasedModifiers(new Tuples2[]{Tuples4.m3642to(numValueOf, modifierM4893clickableXHw0xAI$default)}, ComposableLambda3.rememberComposableLambda(1243106012, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.ui.funded.RetirementDashboardKt$RetirementDashboard$2$1$4
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1243106012, i3, -1, "com.robinhood.android.retirement.ui.funded.RetirementDashboard.<anonymous>.<anonymous>.<anonymous> (RetirementDashboard.kt:135)");
                    }
                    RetirementDashboardKt.RetirementDashboardScrollContent(NestedScrollModifier7.nestedScroll$default(Column5.weight$default(column6, Modifier.INSTANCE, 1.0f, false, 2, null), footerVisibilityState, null, 2, null), retirementDashboardViewState, lazyListState, fundedDashboardCallbacks, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), composer, 48);
            RetirementContributeFooterButton3.ContributeFooterButton(retirementDashboardViewState.getFooterButtonState(), footerVisibilityState.getShowFooterButton(), fundedDashboardCallbacks, null, composer, 0, 8);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$1$lambda$0(FundedDashboardCallbacks fundedDashboardCallbacks, View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            fundedDashboardCallbacks.onRetirementOptionsAssetHomeTooltipSeen();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$3$lambda$2(FundedDashboardCallbacks fundedDashboardCallbacks) {
            fundedDashboardCallbacks.onRetirementOptionsAssetHomeOrTooltipClicked();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$5$lambda$4(FundedDashboardCallbacks fundedDashboardCallbacks) {
            fundedDashboardCallbacks.onRetirementOptionsAssetHomeOrTooltipClicked();
            return Unit.INSTANCE;
        }
    }

    public static final void RetirementDashboardScrollContent(Modifier modifier, final RetirementDashboardViewState viewState, final LazyListState listState, final FundedDashboardCallbacks callbacks, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(listState, "listState");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1566193352);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(viewState) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(listState) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(callbacks) ? 2048 : 1024;
        }
        int i5 = i3;
        if ((i5 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1566193352, i5, -1, "com.robinhood.android.retirement.ui.funded.RetirementDashboardScrollContent (RetirementDashboard.kt:163)");
            }
            final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            final String activeAccountNumber = viewState.getActiveAccountNumber();
            final Map<PositionInstrumentType, ReorderablePositionsList> mapCreatePositionsSections = Positions2.createPositionsSections(viewState.getPositionsSections(), composerStartRestartGroup, 0);
            Modifier modifierUpdateTooltipCanvas = ModifiersKt.updateTooltipCanvas(TestTag3.testTag(modifier4, FundedDashboardLazyColumnTag), LAZY_COLUMN_TAG);
            PaddingValues paddingValuesM5139PaddingValuesa9UjIt4$default = PaddingKt.m5139PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 7, null);
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChanged = ((i5 & 7168) == 2048) | composerStartRestartGroup.changed(activeAccountNumber) | composerStartRestartGroup.changedInstance(viewState) | composerStartRestartGroup.changedInstance(mapCreatePositionsSections) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Function1 function1 = new Function1() { // from class: com.robinhood.android.retirement.ui.funded.RetirementDashboardKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RetirementDashboardKt.RetirementDashboardScrollContent$lambda$2$lambda$1(activeAccountNumber, viewState, callbacks, mapCreatePositionsSections, navigator, context, (ReorderableLazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function1);
                objRememberedValue = function1;
            }
            composerStartRestartGroup.endReplaceGroup();
            ReorderableLazyColumnKt.ReorderableLazyColumn(modifierUpdateTooltipCanvas, listState, paddingValuesM5139PaddingValuesa9UjIt4$default, false, null, null, null, false, (Function1) objRememberedValue, composerStartRestartGroup, (i5 >> 3) & 112, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.ui.funded.RetirementDashboardKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RetirementDashboardKt.RetirementDashboardScrollContent$lambda$3(modifier3, viewState, listState, callbacks, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RetirementDashboardScrollContent$lambda$2$lambda$1(String str, final RetirementDashboardViewState retirementDashboardViewState, final FundedDashboardCallbacks fundedDashboardCallbacks, Map map, Navigator navigator, Context context, ReorderableLazyListScope ReorderableLazyColumn) {
        final String str2;
        boolean z;
        Intrinsics.checkNotNullParameter(ReorderableLazyColumn, "$this$ReorderableLazyColumn");
        if (str != null) {
            InfoBannerComponent.infoBanner$default(ReorderableLazyColumn, null, str, IacInfoBannerLocation.INFO_BANNER_RETIREMENT_TAB_TOP_LEVEL, null, 9, null);
            str2 = str;
        } else {
            str2 = str;
        }
        boolean z2 = true;
        if (!retirementDashboardViewState.isEmbedded()) {
            LazyListScope.item$default(ReorderableLazyColumn, DashboardSectionKey.Header, null, ComposableLambda3.composableLambdaInstance(1803936444, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.ui.funded.RetirementDashboardKt$RetirementDashboardScrollContent$1$1$1
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
                        ComposerKt.traceEventStart(1803936444, i, -1, "com.robinhood.android.retirement.ui.funded.RetirementDashboardScrollContent.<anonymous>.<anonymous>.<anonymous> (RetirementDashboard.kt:190)");
                    }
                    RetirementDashboardHeader2.RetirementDashboardHeader(retirementDashboardViewState.getHeaderState(), fundedDashboardCallbacks, null, composer, RetirementDashboardHeader3.$stable, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 2, null);
        }
        LazyListScope.item$default(ReorderableLazyColumn, DashboardSectionKey.Chart, null, ComposableLambda3.composableLambdaInstance(-1748714134, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.ui.funded.RetirementDashboardKt$RetirementDashboardScrollContent$1$1$2
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
                    ComposerKt.traceEventStart(-1748714134, i, -1, "com.robinhood.android.retirement.ui.funded.RetirementDashboardScrollContent.<anonymous>.<anonymous>.<anonymous> (RetirementDashboard.kt:198)");
                }
                if (retirementDashboardViewState.getActiveManagementType() == ManagementType.MANAGED) {
                    composer.startReplaceGroup(2010614778);
                    String activeAccountNumber = retirementDashboardViewState.getActiveAccountNumber();
                    if (activeAccountNumber == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    ManagedDashboardOverview.ManagedDashboardOverview(activeAccountNumber, null, null, composer, 0, 6);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(2010807102);
                    final MatchRateBreakdown activeMatchBreakdown = retirementDashboardViewState.isEmbedded() ? retirementDashboardViewState.getHeaderState().getActiveMatchBreakdown() : null;
                    String activeAccountNumber2 = retirementDashboardViewState.getActiveAccountNumber();
                    PerformanceChartType performanceChartType = PerformanceChartType.HISTORICAL_PORTFOLIO;
                    composer.startReplaceGroup(-1182038492);
                    ComposableLambda composableLambdaRememberComposableLambda = activeMatchBreakdown != null ? ComposableLambda3.rememberComposableLambda(1021207953, true, new Function4<Row5, String, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.ui.funded.RetirementDashboardKt$RetirementDashboardScrollContent$1$1$2.1
                        @Override // kotlin.jvm.functions.Function4
                        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, String str3, Composer composer2, Integer num) throws Resources.NotFoundException {
                            invoke(row5, str3, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Row5 PerformanceChartComposable, String str3, Composer composer2, int i2) throws Resources.NotFoundException {
                            Intrinsics.checkNotNullParameter(PerformanceChartComposable, "$this$PerformanceChartComposable");
                            if ((i2 & EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) == 128 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1021207953, i2, -1, "com.robinhood.android.retirement.ui.funded.RetirementDashboardScrollContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RetirementDashboard.kt:219)");
                            }
                            GoldMatchInfoTag.MatchInfoTag(activeMatchBreakdown, null, composer2, 0, 2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer, 54) : null;
                    composer.endReplaceGroup();
                    PerformanceChartComposable.PerformanceChartComposable(activeAccountNumber2, performanceChartType, null, null, false, null, null, null, false, composableLambdaRememberComposableLambda, null, null, null, null, null, null, composer, 25008, 0, 65000);
                    composer.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 2, null);
        if (retirementDashboardViewState.getChartFooter() != null) {
            RetirementDashboardChartFooter6.chartFooterSection(ReorderableLazyColumn, retirementDashboardViewState.getChartFooter(), fundedDashboardCallbacks);
        }
        ManagementType activeManagementType = retirementDashboardViewState.getActiveManagementType();
        ManagementType managementType = ManagementType.MANAGED;
        if (activeManagementType == managementType) {
            LazyListScope.item$default(ReorderableLazyColumn, DashboardSectionKey.InsightsSections, null, ComposableLambda3.composableLambdaInstance(2019976766, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.ui.funded.RetirementDashboardKt$RetirementDashboardScrollContent$1$1$3
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
                        ComposerKt.traceEventStart(2019976766, i, -1, "com.robinhood.android.retirement.ui.funded.RetirementDashboardScrollContent.<anonymous>.<anonymous>.<anonymous> (RetirementDashboard.kt:241)");
                    }
                    String activeAccountNumber = retirementDashboardViewState.getActiveAccountNumber();
                    if (activeAccountNumber == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    InsightsRow.InsightsRow(activeAccountNumber, null, null, composer, 0, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 2, null);
        }
        if (str2 != null) {
            ContributionsSummaryCard2.contributionSummaryCard(ReorderableLazyColumn, str2);
        }
        if (retirementDashboardViewState.getActiveManagementType() == managementType) {
            LazyListScope.item$default(ReorderableLazyColumn, DashboardSectionKey.PortfolioHoldings, null, ComposableLambda3.composableLambdaInstance(-2058950208, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.ui.funded.RetirementDashboardKt$RetirementDashboardScrollContent$1$1$4
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
                        ComposerKt.traceEventStart(-2058950208, i, -1, "com.robinhood.android.retirement.ui.funded.RetirementDashboardScrollContent.<anonymous>.<anonymous>.<anonymous> (RetirementDashboard.kt:255)");
                    }
                    String activeAccountNumber = retirementDashboardViewState.getActiveAccountNumber();
                    if (activeAccountNumber == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    PortfolioHoldings.PortfolioHoldings(activeAccountNumber, null, null, composer, 0, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 2, null);
        }
        for (DashboardComponent.Positions positions : retirementDashboardViewState.getPositionsSections()) {
            ReorderablePositionsList reorderablePositionsList = (ReorderablePositionsList) map.get(positions.getPositionsType());
            if (reorderablePositionsList != null) {
                ReorderablePositionsList2.positionsList$default(ReorderableLazyColumn, positions.getKeyPrefix(), reorderablePositionsList, false, null, null, null, 60, null);
                z2 = z2;
            }
        }
        boolean z3 = z2;
        if (retirementDashboardViewState.getSettingsRowKey() != null) {
            z = z3;
            LazyListScope.item$default(ReorderableLazyColumn, retirementDashboardViewState.getSettingsRowKey(), null, ComposableLambda3.composableLambdaInstance(196553601, z3, new RetirementDashboardKt$RetirementDashboardScrollContent$1$1$5(navigator, context, retirementDashboardViewState)), 2, null);
        } else {
            z = z3;
        }
        if (str2 != null && retirementDashboardViewState.getActiveManagementType() == ManagementType.SELF_DIRECTED) {
            LazyListScope.item$default(ReorderableLazyColumn, DashboardSectionKey.FeatureDiscovery, null, ComposableLambda3.composableLambdaInstance(-1842909886, z, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.ui.funded.RetirementDashboardKt$RetirementDashboardScrollContent$1$1$6
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    float fM21594getXlargeD9Ej5fM;
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1842909886, i, -1, "com.robinhood.android.retirement.ui.funded.RetirementDashboardScrollContent.<anonymous>.<anonymous>.<anonymous> (RetirementDashboard.kt:290)");
                    }
                    FeatureDiscoveryLocation featureDiscoveryLocation = FeatureDiscoveryLocation.RETIREMENT_DASHBOARD;
                    String str3 = str2;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    if (retirementDashboardViewState.getSettingsRowKey() != null) {
                        composer.startReplaceGroup(438894543);
                        fM21594getXlargeD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM();
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(438980847);
                        fM21594getXlargeD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21594getXlargeD9Ej5fM();
                        composer.endReplaceGroup();
                    }
                    FeatureDiscoveryComponent.FeatureDiscoveryComponent(featureDiscoveryLocation, str3, PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, fM21594getXlargeD9Ej5fM, 0.0f, 0.0f, 13, null), null, composer, 6, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 2, null);
            LazyListScope.item$default(ReorderableLazyColumn, DashboardSectionKey.RecurringSection, null, ComposableLambda3.composableLambdaInstance(-1417875911, z, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.ui.funded.RetirementDashboardKt$RetirementDashboardScrollContent$1$1$7
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
                        ComposerKt.traceEventStart(-1417875911, i, -1, "com.robinhood.android.retirement.ui.funded.RetirementDashboardScrollContent.<anonymous>.<anonymous>.<anonymous> (RetirementDashboard.kt:305)");
                    }
                    DashboardRecurringSection.DashboardRecurringSection(str2, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21594getXlargeD9Ej5fM(), 0.0f, 0.0f, 13, null), null, composer, 0, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 2, null);
        }
        if (str2 != null) {
            LazyListScope.item$default(ReorderableLazyColumn, DashboardSectionKey.Disclosure, null, ComposableLambda3.composableLambdaInstance(412593923, z, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.ui.funded.RetirementDashboardKt$RetirementDashboardScrollContent$1$1$8
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
                        ComposerKt.traceEventStart(412593923, i, -1, "com.robinhood.android.retirement.ui.funded.RetirementDashboardScrollContent.<anonymous>.<anonymous>.<anonymous> (RetirementDashboard.kt:316)");
                    }
                    HomescreenDisclosureComposable3.DashboardDisclosureComponent(str2, null, null, composer, 0, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 2, null);
        }
        return Unit.INSTANCE;
    }
}
