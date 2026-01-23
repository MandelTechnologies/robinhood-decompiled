package com.robinhood.android.dashboard.lib;

import android.content.Context;
import androidx.compose.animation.AnimationModifier;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.LifecycleEffectKt;
import androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult;
import androidx.lifecycle.compose.LifecycleResumePauseEffectScope;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsSection;
import com.robinhood.android.advisory.dashboard.insights.InsightsRow;
import com.robinhood.android.advisory.dashboard.portfolio.holdings.PortfolioHoldings;
import com.robinhood.android.common.portfolio.pnl.PnlHubSectionComposable5;
import com.robinhood.android.common.portfolio.positionsList.ReorderablePositionsList;
import com.robinhood.android.common.portfolio.positionsList.ReorderablePositionsList2;
import com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPowerRow3;
import com.robinhood.android.dashboard.lib.chart.DashboardChart4;
import com.robinhood.android.dashboard.lib.chart.ManagedAccountOverview2;
import com.robinhood.android.dashboard.lib.settings.AccountSettingsRow;
import com.robinhood.android.dashboard.recurring.DashboardRecurringSection;
import com.robinhood.android.dashboard.sweep.DashboardSweepSection;
import com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureComposable3;
import com.robinhood.android.isa.contributions.IsaContributionSection;
import com.robinhood.android.mcw.homesection.DashboardMcwSection;
import com.robinhood.android.microgramsdui.MicrogramEmbeddedSection3;
import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
import com.robinhood.android.portfolio.curatedlist.createScreenerOrList.CreateScreenerOrWatchListRow2;
import com.robinhood.android.redesigninvesting.highlights.p231ui.HighlightsCarouselComposable;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.crypto.p314db.home.CryptoHomeCtaButtons;
import com.robinhood.models.home.component.DashboardComponent;
import com.robinhood.models.p320db.IacInfoBannerLocation;
import com.robinhood.shared.cards.p371v3.CardStackComposable;
import com.robinhood.shared.feature.discovery.p382ui.FeatureDiscoveryComponent;
import com.robinhood.shared.iac.infobanner.DashboardInfoBannerCoordinatorDuxo;
import com.robinhood.shared.iac.infobanner.InfoBannerComponent;
import com.robinhood.shared.portfolio.lists.p391ui.CuratedListComposable5;
import com.robinhood.shared.portfolio.lists.p391ui.CuratedListState;
import com.robinhood.utils.compose.reorderable.ReorderableLazyColumnKt;
import com.robinhood.utils.compose.reorderable.ReorderableLazyListScope;
import com.robinhood.utils.p409ui.context.BaseContexts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.Job;
import microgram.android.RemoteMicrogramApplication;

/* compiled from: LoadedDashboard.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a?\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0001¢\u0006\u0002\u0010\u001c\u001a\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0003¢\u0006\u0002\u0010\u001f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"LoadedDashboardTestTag", "", "FirstTradeUpsellKey", "DashboardChartKey", "BuyingPowerKey", "DisclosureKey", "CardStackKey", "RecurringSectionKey", "DepositsSectionKey", "ManagedHoldingsKey", "ManagedInsightsKey", "InvestingHighlightsKey", "MultiCurrencyBalancesKey", "ContributionsKey", "AccountSettingsKey", "DashboardComponentColumn", "", "isEmbedded", "", "components", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/home/component/DashboardComponent;", "pageDirection", "Lcom/robinhood/compose/bento/theme/Direction;", "listState", "Landroidx/compose/foundation/lazy/LazyListState;", "modifier", "Landroidx/compose/ui/Modifier;", "(ZLkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/compose/bento/theme/Direction;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "createInfoBannerCoordinator", "Lcom/robinhood/shared/iac/infobanner/DashboardInfoBannerCoordinatorDuxo;", "(Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/shared/iac/infobanner/DashboardInfoBannerCoordinatorDuxo;", "lib-account-home_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LoadedDashboardKt {
    private static final String AccountSettingsKey = "dashboard_account_settings";
    private static final String BuyingPowerKey = "dashboard_buying_power";
    private static final String CardStackKey = "dashboard_card_stack";
    private static final String ContributionsKey = "dashboard_contributions_section";
    private static final String DashboardChartKey = "dashboard_chart";
    private static final String DepositsSectionKey = "dashboard_deposits_section";
    private static final String DisclosureKey = "dashboard_disclosure";
    private static final String FirstTradeUpsellKey = "dashboard_first_trade_upsell";
    private static final String InvestingHighlightsKey = "dashboard_investing_highlights_section";
    private static final String LoadedDashboardTestTag = "loaded_dashboard";
    private static final String ManagedHoldingsKey = "dashboard_managed_holdings_section";
    private static final String ManagedInsightsKey = "dashboard_managed_insights_section";
    private static final String MultiCurrencyBalancesKey = "dashboard_multi_currency_balances_section";
    private static final String RecurringSectionKey = "dashboard_recurring_section";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DashboardComponentColumn$lambda$2(boolean z, ImmutableList immutableList, BentoTheme4 bentoTheme4, LazyListState lazyListState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        DashboardComponentColumn(z, immutableList, bentoTheme4, lazyListState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DashboardComponentColumn(final boolean z, final ImmutableList<? extends DashboardComponent> components, final BentoTheme4 bentoTheme4, final LazyListState listState, Modifier modifier, Composer composer, final int i, final int i2) {
        final boolean z2;
        int i3;
        Modifier modifier2;
        int i4;
        final Map<PositionInstrumentType, ReorderablePositionsList> mapCreatePositionsSections;
        final CuratedListState curatedListStateCreateCuratedListSection;
        final DashboardInfoBannerCoordinatorDuxo dashboardInfoBannerCoordinatorDuxoCreateInfoBannerCoordinator;
        boolean zChangedInstance;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(listState, "listState");
        Composer composerStartRestartGroup = composer.startRestartGroup(1802211874);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(z2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(components) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(bentoTheme4 == null ? -1 : bentoTheme4.ordinal()) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(listState) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i4 = i3;
            if ((i4 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1802211874, i4, -1, "com.robinhood.android.dashboard.lib.DashboardComponentColumn (LoadedDashboard.kt:76)");
                }
                int i6 = (i4 >> 3) & 14;
                mapCreatePositionsSections = Positions2.createPositionsSections(components, composerStartRestartGroup, i6);
                curatedListStateCreateCuratedListSection = CuratedList2.createCuratedListSection(components, composerStartRestartGroup, i6);
                dashboardInfoBannerCoordinatorDuxoCreateInfoBannerCoordinator = createInfoBannerCoordinator(components, composerStartRestartGroup, i6);
                Modifier modifierLogScreenTransitions$default = com.robinhood.android.compose.autoeventlogging.ModifiersKt.logScreenTransitions$default(TestTag3.testTag(modifier4, LoadedDashboardTestTag), null, 1, null);
                PaddingValues paddingValuesM5139PaddingValuesa9UjIt4$default = PaddingKt.m5139PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 7, null);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance = ((i4 & 14) != 4) | composerStartRestartGroup.changedInstance(components) | composerStartRestartGroup.changedInstance(mapCreatePositionsSections) | composerStartRestartGroup.changedInstance(dashboardInfoBannerCoordinatorDuxoCreateInfoBannerCoordinator) | ((i4 & 896) != 256) | composerStartRestartGroup.changedInstance(curatedListStateCreateCuratedListSection);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Function1 function1 = new Function1() { // from class: com.robinhood.android.dashboard.lib.LoadedDashboardKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LoadedDashboardKt.DashboardComponentColumn$lambda$1$lambda$0(components, mapCreatePositionsSections, dashboardInfoBannerCoordinatorDuxoCreateInfoBannerCoordinator, curatedListStateCreateCuratedListSection, z2, bentoTheme4, (ReorderableLazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function1);
                    objRememberedValue = function1;
                }
                composerStartRestartGroup.endReplaceGroup();
                ReorderableLazyColumnKt.ReorderableLazyColumn(modifierLogScreenTransitions$default, listState, paddingValuesM5139PaddingValuesa9UjIt4$default, false, null, null, null, false, (Function1) objRememberedValue, composerStartRestartGroup, (i4 >> 6) & 112, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.dashboard.lib.LoadedDashboardKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LoadedDashboardKt.DashboardComponentColumn$lambda$2(z, components, bentoTheme4, listState, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 9363) == 9362) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i62 = (i4 >> 3) & 14;
            mapCreatePositionsSections = Positions2.createPositionsSections(components, composerStartRestartGroup, i62);
            curatedListStateCreateCuratedListSection = CuratedList2.createCuratedListSection(components, composerStartRestartGroup, i62);
            dashboardInfoBannerCoordinatorDuxoCreateInfoBannerCoordinator = createInfoBannerCoordinator(components, composerStartRestartGroup, i62);
            Modifier modifierLogScreenTransitions$default2 = com.robinhood.android.compose.autoeventlogging.ModifiersKt.logScreenTransitions$default(TestTag3.testTag(modifier4, LoadedDashboardTestTag), null, 1, null);
            PaddingValues paddingValuesM5139PaddingValuesa9UjIt4$default2 = PaddingKt.m5139PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 7, null);
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            zChangedInstance = ((i4 & 14) != 4) | composerStartRestartGroup.changedInstance(components) | composerStartRestartGroup.changedInstance(mapCreatePositionsSections) | composerStartRestartGroup.changedInstance(dashboardInfoBannerCoordinatorDuxoCreateInfoBannerCoordinator) | ((i4 & 896) != 256) | composerStartRestartGroup.changedInstance(curatedListStateCreateCuratedListSection);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                Function1 function12 = new Function1() { // from class: com.robinhood.android.dashboard.lib.LoadedDashboardKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LoadedDashboardKt.DashboardComponentColumn$lambda$1$lambda$0(components, mapCreatePositionsSections, dashboardInfoBannerCoordinatorDuxoCreateInfoBannerCoordinator, curatedListStateCreateCuratedListSection, z2, bentoTheme4, (ReorderableLazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function12);
                objRememberedValue = function12;
                composerStartRestartGroup.endReplaceGroup();
                ReorderableLazyColumnKt.ReorderableLazyColumn(modifierLogScreenTransitions$default2, listState, paddingValuesM5139PaddingValuesa9UjIt4$default2, false, null, null, null, false, (Function1) objRememberedValue, composerStartRestartGroup, (i4 >> 6) & 112, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DashboardComponentColumn$lambda$1$lambda$0(ImmutableList immutableList, Map map, DashboardInfoBannerCoordinatorDuxo dashboardInfoBannerCoordinatorDuxo, CuratedListState curatedListState, final boolean z, final BentoTheme4 bentoTheme4, ReorderableLazyListScope reorderableLazyListScope) {
        CuratedListState curatedListState2 = curatedListState;
        ReorderableLazyListScope ReorderableLazyColumn = reorderableLazyListScope;
        Intrinsics.checkNotNullParameter(ReorderableLazyColumn, "$this$ReorderableLazyColumn");
        Iterator<E> it = immutableList.iterator();
        while (it.hasNext()) {
            final DashboardComponent dashboardComponent = (DashboardComponent) it.next();
            if (dashboardComponent instanceof DashboardComponent.FirstTradeUpsellSection) {
                LazyListScope.item$default(ReorderableLazyColumn, FirstTradeUpsellKey, null, ComposableLambda3.composableLambdaInstance(-1642400426, true, new LoadedDashboardKt$DashboardComponentColumn$1$1$1(dashboardComponent)), 2, null);
            } else if (dashboardComponent instanceof DashboardComponent.Chart) {
                ReorderableLazyColumn = reorderableLazyListScope;
                LazyListScope.item$default(ReorderableLazyColumn, DashboardChartKey, null, ComposableLambda3.composableLambdaInstance(324636493, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.LoadedDashboardKt$DashboardComponentColumn$1$1$2
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
                            ComposerKt.traceEventStart(324636493, i, -1, "com.robinhood.android.dashboard.lib.DashboardComponentColumn.<anonymous>.<anonymous>.<anonymous> (LoadedDashboard.kt:109)");
                        }
                        DashboardChart4.DashboardChart((DashboardComponent.Chart) dashboardComponent, z, null, null, null, null, composer, 0, 60);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), 2, null);
            } else if (dashboardComponent instanceof DashboardComponent.BuyingPower) {
                ReorderableLazyColumn = reorderableLazyListScope;
                LazyListScope.item$default(ReorderableLazyColumn, BuyingPowerKey, null, ComposableLambda3.composableLambdaInstance(211025998, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.LoadedDashboardKt$DashboardComponentColumn$1$1$3
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
                            ComposerKt.traceEventStart(211025998, i, -1, "com.robinhood.android.dashboard.lib.DashboardComponentColumn.<anonymous>.<anonymous>.<anonymous> (LoadedDashboard.kt:116)");
                        }
                        PortfolioBuyingPowerRow3.PortfolioBuyingPowerRow(((DashboardComponent.BuyingPower) dashboardComponent).getAccountNumber(), null, null, composer, 0, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), 2, null);
            } else if (dashboardComponent instanceof DashboardComponent.PostChartSection) {
                DashboardComponent.PostChartSection postChartSection = (DashboardComponent.PostChartSection) dashboardComponent;
                String accountNumber = postChartSection.getAccountNumber();
                BrokerageAccountType brokerageAccountType = postChartSection.getBrokerageAccountType();
                ReorderableLazyColumn = reorderableLazyListScope;
                LazyListScope.item$default(ReorderableLazyColumn, accountNumber + "_" + brokerageAccountType + "_post_chart_section", null, ComposableLambda3.composableLambdaInstance(97415503, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.LoadedDashboardKt$DashboardComponentColumn$1$1$4
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
                            ComposerKt.traceEventStart(97415503, i, -1, "com.robinhood.android.dashboard.lib.DashboardComponentColumn.<anonymous>.<anonymous>.<anonymous> (LoadedDashboard.kt:124)");
                        }
                        Modifier modifierAnimateContentSize$default = AnimationModifier.animateContentSize$default(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, 3, null);
                        RemoteMicrogramApplication remoteMicrogramApplication = new RemoteMicrogramApplication("app-accounts-post-chart-section", null, 2, null);
                        String launchArgument = ((DashboardComponent.PostChartSection) dashboardComponent).getLaunchArgument();
                        FragmentManager supportFragmentManager = BaseContexts.requireActivityBaseContext((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                        MicrogramEmbeddedSection3.MicrogramEmbeddedSection(remoteMicrogramApplication, supportFragmentManager, modifierAnimateContentSize$default, launchArgument, ComposableSingletons$LoadedDashboardKt.INSTANCE.getLambda$1781005566$lib_account_home_externalDebug(), null, null, false, null, composer, 24576, 480);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), 2, null);
            } else if (dashboardComponent instanceof DashboardComponent.Positions) {
                DashboardComponent.Positions positions = (DashboardComponent.Positions) dashboardComponent;
                ReorderablePositionsList reorderablePositionsList = (ReorderablePositionsList) map.get(positions.getPositionsType());
                if (reorderablePositionsList != null) {
                    ReorderablePositionsList reorderablePositionsList2 = (ReorderablePositionsList) map.get(PositionInstrumentType.EVENT_CONTRACT_PENDING);
                    if (positions.getPositionsType() == PositionInstrumentType.EVENT_CONTRACT && (reorderablePositionsList instanceof ReorderablePositionsList.Empty) && (reorderablePositionsList2 == null || (reorderablePositionsList2 instanceof ReorderablePositionsList.Empty))) {
                        ReorderableLazyColumn = reorderableLazyListScope;
                        LazyListScope.item$default(ReorderableLazyColumn, "dashboard_event_topics_section_" + positions.getAccountNumber(), null, ComposableSingletons$LoadedDashboardKt.INSTANCE.getLambda$1075652693$lib_account_home_externalDebug(), 2, null);
                    } else {
                        ReorderablePositionsList2.positionsList$default(reorderableLazyListScope, positions.getKeyPrefix(), reorderablePositionsList, false, null, null, null, 60, null);
                    }
                }
            } else if (dashboardComponent instanceof DashboardComponent.PredictionMarketSection) {
                ReorderableLazyColumn = reorderableLazyListScope;
                LazyListScope.item$default(ReorderableLazyColumn, "dashboard_event_topics_section_nux", null, ComposableSingletons$LoadedDashboardKt.INSTANCE.m13174getLambda$129805487$lib_account_home_externalDebug(), 2, null);
            } else if (dashboardComponent instanceof DashboardComponent.RealizedProfitAndLoss) {
                ReorderableLazyColumn = reorderableLazyListScope;
                LazyListScope.item$default(ReorderableLazyColumn, "dashboard_pnl_hub_section_" + ((DashboardComponent.RealizedProfitAndLoss) dashboardComponent).getAccountNumber(), null, ComposableLambda3.composableLambdaInstance(-243415982, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.LoadedDashboardKt$DashboardComponentColumn$1$1$5
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
                            ComposerKt.traceEventStart(-243415982, i, -1, "com.robinhood.android.dashboard.lib.DashboardComponentColumn.<anonymous>.<anonymous>.<anonymous> (LoadedDashboard.kt:173)");
                        }
                        PnlHubSectionComposable5.PnlHubSectionComposable(CryptoHomeCtaButtons.DEFAULT_ID, ((DashboardComponent.RealizedProfitAndLoss) dashboardComponent).getAccountNumber(), PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), null, composer, 6, 8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), 2, null);
            } else {
                ReorderableLazyColumn = reorderableLazyListScope;
                if (dashboardComponent instanceof DashboardComponent.FeatureDiscovery) {
                    DashboardComponent.FeatureDiscovery featureDiscovery = (DashboardComponent.FeatureDiscovery) dashboardComponent;
                    FeatureDiscoveryComponent.featureDiscoveryContent(ReorderableLazyColumn, featureDiscovery.getLocation(), featureDiscovery.getAccountNumber(), ModifiersKt.standardComponentTopPadding(Modifier.INSTANCE));
                } else if (dashboardComponent instanceof DashboardComponent.SweepSection) {
                    LazyListScope.item$default(ReorderableLazyColumn, "dashboard_sweep_section_" + ((DashboardComponent.SweepSection) dashboardComponent).getAccountNumber(), null, ComposableLambda3.composableLambdaInstance(-470636972, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.LoadedDashboardKt$DashboardComponentColumn$1$1$6
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
                                ComposerKt.traceEventStart(-470636972, i, -1, "com.robinhood.android.dashboard.lib.DashboardComponentColumn.<anonymous>.<anonymous>.<anonymous> (LoadedDashboard.kt:192)");
                            }
                            DashboardSweepSection.DashboardSweepSection(((DashboardComponent.SweepSection) dashboardComponent).getAccountNumber(), ModifiersKt.standardComponentTopPadding(Modifier.INSTANCE), null, composer, 0, 4);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), 2, null);
                } else if (dashboardComponent instanceof DashboardComponent.Contributions) {
                    ReorderableLazyColumn = reorderableLazyListScope;
                    LazyListScope.item$default(ReorderableLazyColumn, ContributionsKey, null, ComposableLambda3.composableLambdaInstance(-584247467, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.LoadedDashboardKt$DashboardComponentColumn$1$1$7
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
                                ComposerKt.traceEventStart(-584247467, i, -1, "com.robinhood.android.dashboard.lib.DashboardComponentColumn.<anonymous>.<anonymous>.<anonymous> (LoadedDashboard.kt:199)");
                            }
                            IsaContributionSection.IsaContributionSection(((DashboardComponent.Contributions) dashboardComponent).getAccountNumber(), PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), null, composer, 0, 4);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), 2, null);
                } else if (dashboardComponent instanceof DashboardComponent.InfoBanner) {
                    DashboardComponent.InfoBanner infoBanner = (DashboardComponent.InfoBanner) dashboardComponent;
                    ReorderableLazyColumn = reorderableLazyListScope;
                    InfoBannerComponent.infoBanner$default(ReorderableLazyColumn, null, infoBanner.getAccountNumber(), infoBanner.getLocation(), dashboardInfoBannerCoordinatorDuxo, 1, null);
                } else if (dashboardComponent instanceof DashboardComponent.Disclosure) {
                    ReorderableLazyColumn = reorderableLazyListScope;
                    LazyListScope.item$default(ReorderableLazyColumn, DisclosureKey, null, ComposableLambda3.composableLambdaInstance(795084238, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.LoadedDashboardKt$DashboardComponentColumn$1$1$8
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
                                ComposerKt.traceEventStart(795084238, i, -1, "com.robinhood.android.dashboard.lib.DashboardComponentColumn.<anonymous>.<anonymous>.<anonymous> (LoadedDashboard.kt:212)");
                            }
                            HomescreenDisclosureComposable3.DashboardDisclosureComponent(((DashboardComponent.Disclosure) dashboardComponent).getAccountNumber(), null, null, composer, 0, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), 2, null);
                } else if (dashboardComponent instanceof DashboardComponent.CardStack) {
                    ReorderableLazyColumn = reorderableLazyListScope;
                    LazyListScope.item$default(ReorderableLazyColumn, CardStackKey, null, ComposableLambda3.composableLambdaInstance(681473743, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.LoadedDashboardKt$DashboardComponentColumn$1$1$9
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
                                ComposerKt.traceEventStart(681473743, i, -1, "com.robinhood.android.dashboard.lib.DashboardComponentColumn.<anonymous>.<anonymous>.<anonymous> (LoadedDashboard.kt:218)");
                            }
                            BentoTheme4 bentoTheme42 = bentoTheme4;
                            if (bentoTheme42 == null) {
                                bentoTheme42 = BentoTheme4.POSITIVE;
                            }
                            CardStackComposable.CardStackComposable(bentoTheme42, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), true, null, composer, 384, 8);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }), 2, null);
                } else {
                    if (dashboardComponent instanceof DashboardComponent.CuratedList) {
                        Function3<CuratedListState.Loaded, Composer, Integer, Unit> lambda$1959482552$lib_account_home_externalDebug = ComposableSingletons$LoadedDashboardKt.INSTANCE.getLambda$1959482552$lib_account_home_externalDebug();
                        ComposableLambda composableLambdaComposableLambdaInstance = ComposableLambda3.composableLambdaInstance(44830194, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.LoadedDashboardKt$DashboardComponentColumn$1$1$10
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
                                    ComposerKt.traceEventStart(44830194, i, -1, "com.robinhood.android.dashboard.lib.DashboardComponentColumn.<anonymous>.<anonymous>.<anonymous> (LoadedDashboard.kt:236)");
                                }
                                CreateScreenerOrWatchListRow2.CreateScreenerOrWatchlistRow(((DashboardComponent.CuratedList) dashboardComponent).getAccountNumber(), null, composer, 0, 2);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                        CuratedListState.Loaded loaded = curatedListState2 instanceof CuratedListState.Loaded ? (CuratedListState.Loaded) curatedListState2 : null;
                        CuratedListComposable5.curatedList$default(reorderableLazyListScope, curatedListState2, lambda$1959482552$lib_account_home_externalDebug, composableLambdaComposableLambdaInstance, loaded != null ? loaded.isSwipeToBuyEnabled() : false, null, null, 48, null);
                    } else if (dashboardComponent instanceof DashboardComponent.RecurringInvestments) {
                        LazyListScope.item$default(reorderableLazyListScope, RecurringSectionKey, null, ComposableLambda3.composableLambdaInstance(454252753, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.LoadedDashboardKt$DashboardComponentColumn$1$1$11
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
                                    ComposerKt.traceEventStart(454252753, i, -1, "com.robinhood.android.dashboard.lib.DashboardComponentColumn.<anonymous>.<anonymous>.<anonymous> (LoadedDashboard.kt:246)");
                                }
                                DashboardRecurringSection.DashboardRecurringSection(((DashboardComponent.RecurringInvestments) dashboardComponent).getAccountNumber(), ModifiersKt.standardComponentTopPadding(Modifier.INSTANCE), null, composer, 0, 4);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), 2, null);
                    } else if (dashboardComponent instanceof DashboardComponent.Deposits) {
                        LazyListScope.item$default(reorderableLazyListScope, DepositsSectionKey, null, ComposableLambda3.composableLambdaInstance(340642258, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.LoadedDashboardKt$DashboardComponentColumn$1$1$12
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
                                    ComposerKt.traceEventStart(340642258, i, -1, "com.robinhood.android.dashboard.lib.DashboardComponentColumn.<anonymous>.<anonymous>.<anonymous> (LoadedDashboard.kt:253)");
                                }
                                DashboardDepositsSection.DashboardDepositsSection(((DashboardComponent.Deposits) dashboardComponent).getAccountNumber(), null, null, composer, 0, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), 2, null);
                    } else if (dashboardComponent instanceof DashboardComponent.ManagedHoldings) {
                        LazyListScope.item$default(reorderableLazyListScope, ManagedHoldingsKey, null, ComposableLambda3.composableLambdaInstance(227031763, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.LoadedDashboardKt$DashboardComponentColumn$1$1$13
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
                                    ComposerKt.traceEventStart(227031763, i, -1, "com.robinhood.android.dashboard.lib.DashboardComponentColumn.<anonymous>.<anonymous>.<anonymous> (LoadedDashboard.kt:259)");
                                }
                                PortfolioHoldings.PortfolioHoldings(((DashboardComponent.ManagedHoldings) dashboardComponent).getAccountNumber(), null, null, composer, 0, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), 2, null);
                    } else if (dashboardComponent instanceof DashboardComponent.ManagedAccountOverview) {
                        LazyListScope.item$default(reorderableLazyListScope, DashboardChartKey, null, ComposableLambda3.composableLambdaInstance(113421268, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.LoadedDashboardKt$DashboardComponentColumn$1$1$14
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
                                    ComposerKt.traceEventStart(113421268, i, -1, "com.robinhood.android.dashboard.lib.DashboardComponentColumn.<anonymous>.<anonymous>.<anonymous> (LoadedDashboard.kt:265)");
                                }
                                ManagedAccountOverview2.ManagedAccountOverview(((DashboardComponent.ManagedAccountOverview) dashboardComponent).getAccountNumber(), z, null, composer, 0, 4);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), 2, null);
                    } else if (dashboardComponent instanceof DashboardComponent.ManagedAccountInsights) {
                        LazyListScope.item$default(reorderableLazyListScope, ManagedInsightsKey, null, ComposableLambda3.composableLambdaInstance(-189227, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.LoadedDashboardKt$DashboardComponentColumn$1$1$15
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
                                    ComposerKt.traceEventStart(-189227, i, -1, "com.robinhood.android.dashboard.lib.DashboardComponentColumn.<anonymous>.<anonymous>.<anonymous> (LoadedDashboard.kt:272)");
                                }
                                InsightsRow.InsightsRow(((DashboardComponent.ManagedAccountInsights) dashboardComponent).getAccountNumber(), null, null, composer, 0, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), 2, null);
                    } else if (dashboardComponent instanceof DashboardComponent.InvestingHighlights) {
                        LazyListScope.item$default(reorderableLazyListScope, InvestingHighlightsKey, null, ComposableLambda3.composableLambdaInstance(-113799722, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.LoadedDashboardKt$DashboardComponentColumn$1$1$16
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
                                    ComposerKt.traceEventStart(-113799722, i, -1, "com.robinhood.android.dashboard.lib.DashboardComponentColumn.<anonymous>.<anonymous>.<anonymous> (LoadedDashboard.kt:278)");
                                }
                                HighlightsCarouselComposable.HighlightsCarouselComposable(((DashboardComponent.InvestingHighlights) dashboardComponent).getAccountNumber(), null, null, composer, 0, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), 2, null);
                    } else if (dashboardComponent instanceof DashboardComponent.MultiCurrencyBalances) {
                        LazyListScope.item$default(reorderableLazyListScope, MultiCurrencyBalancesKey, null, ComposableLambda3.composableLambdaInstance(1681736684, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.LoadedDashboardKt$DashboardComponentColumn$1$1$17
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
                                    ComposerKt.traceEventStart(1681736684, i, -1, "com.robinhood.android.dashboard.lib.DashboardComponentColumn.<anonymous>.<anonymous>.<anonymous> (LoadedDashboard.kt:284)");
                                }
                                DashboardMcwSection.DashboardMcwSection(((DashboardComponent.MultiCurrencyBalances) dashboardComponent).getAccountNumber(), null, null, composer, 0, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), 2, null);
                    } else {
                        if (!(dashboardComponent instanceof DashboardComponent.AccountSettings)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        LazyListScope.item$default(reorderableLazyListScope, AccountSettingsKey, null, ComposableLambda3.composableLambdaInstance(1568126189, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.LoadedDashboardKt$DashboardComponentColumn$1$1$18
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
                                    ComposerKt.traceEventStart(1568126189, i, -1, "com.robinhood.android.dashboard.lib.DashboardComponentColumn.<anonymous>.<anonymous>.<anonymous> (LoadedDashboard.kt:290)");
                                }
                                AccountSettingsRow.AccountSettingsRow(((DashboardComponent.AccountSettings) dashboardComponent).getAccountNumber(), ((DashboardComponent.AccountSettings) dashboardComponent).getAccountType(), ModifiersKt.standardComponentTopPadding(Modifier.INSTANCE), composer, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), 2, null);
                    }
                    curatedListState2 = curatedListState;
                }
            }
            ReorderableLazyColumn = reorderableLazyListScope;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecyclePauseOrDisposeEffectResult createInfoBannerCoordinator$lambda$6$lambda$5(DashboardInfoBannerCoordinatorDuxo dashboardInfoBannerCoordinatorDuxo, List list, String str, final LifecycleResumePauseEffectScope LifecycleResumeEffect) {
        Intrinsics.checkNotNullParameter(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
        final Job jobBind = dashboardInfoBannerCoordinatorDuxo.bind((List<? extends IacInfoBannerLocation>) list, str);
        return new LifecyclePauseOrDisposeEffectResult() { // from class: com.robinhood.android.dashboard.lib.LoadedDashboardKt$createInfoBannerCoordinator$lambda$6$lambda$5$$inlined$onPauseOrDispose$1
            @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
            public void runPauseOrOnDisposeEffect() {
                Job.DefaultImpls.cancel$default(jobBind, null, 1, null);
            }
        };
    }

    private static final DashboardInfoBannerCoordinatorDuxo createInfoBannerCoordinator(ImmutableList<? extends DashboardComponent> immutableList, Composer composer, int i) {
        CreationExtras defaultViewModelCreationExtras;
        composer.startReplaceGroup(1170512160);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1170512160, i, -1, "com.robinhood.android.dashboard.lib.createInfoBannerCoordinator (LoadedDashboard.kt:304)");
        }
        ArrayList arrayList = new ArrayList();
        for (DashboardComponent dashboardComponent : immutableList) {
            if (dashboardComponent instanceof DashboardComponent.InfoBanner) {
                arrayList.add(dashboardComponent);
            }
        }
        if (arrayList.isEmpty()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return null;
        }
        DashboardComponent.InfoBanner infoBanner = (DashboardComponent.InfoBanner) CollectionsKt.firstOrNull((List) arrayList);
        final String accountNumber = infoBanner != null ? infoBanner.getAccountNumber() : null;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((DashboardComponent.InfoBanner) it.next()).getLocation());
        }
        final List listDistinct = CollectionsKt.distinct(arrayList2);
        String str = "dashboard_info_banner_coordinator_" + accountNumber;
        composer.startReplaceGroup(-747520797);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composer, 0);
        composer.startReplaceableGroup(1729797275);
        if (current instanceof HasDefaultViewModelProviderFactory) {
            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
        } else {
            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
        }
        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(DashboardInfoBannerCoordinatorDuxo.class), current, str, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composer, 0, 0);
        composer.endReplaceableGroup();
        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
        final Lifecycle lifecycle = ((LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(baseDuxo) | composer.changedInstance(lifecycle);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.dashboard.lib.LoadedDashboardKt$createInfoBannerCoordinator$$inlined$duxo$1
                @Override // kotlin.jvm.functions.Function1
                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                    lifecycle.addObserver(duxoLifecycleObserver);
                    final Lifecycle lifecycle2 = lifecycle;
                    return new DisposableEffectResult() { // from class: com.robinhood.android.dashboard.lib.LoadedDashboardKt$createInfoBannerCoordinator$$inlined$duxo$1.1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            lifecycle2.removeObserver(duxoLifecycleObserver);
                        }
                    };
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer, 0);
        composer.endReplaceGroup();
        final DashboardInfoBannerCoordinatorDuxo dashboardInfoBannerCoordinatorDuxo = (DashboardInfoBannerCoordinatorDuxo) baseDuxo;
        composer.startReplaceGroup(-1746271574);
        boolean zChangedInstance2 = composer.changedInstance(dashboardInfoBannerCoordinatorDuxo) | composer.changedInstance(listDistinct) | composer.changed(accountNumber);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.dashboard.lib.LoadedDashboardKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LoadedDashboardKt.createInfoBannerCoordinator$lambda$6$lambda$5(dashboardInfoBannerCoordinatorDuxo, listDistinct, accountNumber, (LifecycleResumePauseEffectScope) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        LifecycleEffectKt.LifecycleResumeEffect(listDistinct, accountNumber, null, (Function1) objRememberedValue2, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return dashboardInfoBannerCoordinatorDuxo;
    }
}
