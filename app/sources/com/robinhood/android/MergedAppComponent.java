package com.robinhood.android;

import android.app.Application;
import anvil.component.com.robinhood.android.appcomponent.MergedActivityRetainedComponent_bbdcf727;
import anvil.component.com.robinhood.android.appcomponent.MergedBifrostSubcomponent_37ed191a;
import anvil.component.com.robinhood.android.appcomponent.MergedMicrogramComponent_5f4d8480;
import anvil.component.com.robinhood.android.appcomponent.MergedServiceComponent_7ebbc657;
import anvil.component.com.robinhood.android.appcomponent.MergedWorkerComponent_166d7d2f;
import com.robinhood.analytics.PeriodicLoggingWorker;
import com.robinhood.android.AppComponent;
import com.robinhood.android.AppObjectGraph;
import com.robinhood.android.autoeventlogging.AutoLoggableViewEntryPoint;
import com.robinhood.android.blackwidow.p068ui.upsell.ExploreLegendUpsellFragment;
import com.robinhood.android.bugsy.BugsyRedactCompose;
import com.robinhood.android.common.buysell.BuySellHelper;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.DynamicTranslationsEntryPoint;
import com.robinhood.android.common.p088ui.LocaleConfigurationEntryPoint;
import com.robinhood.android.common.p088ui.RxActivity;
import com.robinhood.android.common.p088ui.ViewPumpEntryPoint;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals2;
import com.robinhood.android.cortex.digest.common.LocalClock2;
import com.robinhood.android.dashboardpill.p096ui.VisibilityTracking;
import com.robinhood.android.deeplink.targets.EquityAdvancedChartDeeplinkTarget;
import com.robinhood.android.designsystem.sparkle.SparkleDrawable;
import com.robinhood.android.diagnostics.work.LogFileCleanerWorker;
import com.robinhood.android.eventcontracts.contracts.HubNavigateUtils;
import com.robinhood.android.gold.sparkle.compose.GoldSparkleBrush4;
import com.robinhood.android.graph.TabHeaderGraphLayout;
import com.robinhood.android.lib.trade.BaseOrderActivity;
import com.robinhood.android.lib.trade.BaseOrderFragment;
import com.robinhood.android.libdesignsystem.serverui.experimental.api.PaginatedListApiEntryPoint;
import com.robinhood.android.markdown.compose.CustomMarkdownParser2;
import com.robinhood.android.markdown.util.MarkwonEntryPoint;
import com.robinhood.android.regiongate.compose.p236di.RegionGateProviderEntryPoint;
import com.robinhood.android.regiongate.compose.p236di.UserStoreEntryPoint;
import com.robinhood.android.sdui.annotations.SduiEntryPoint;
import com.robinhood.android.search.deeplinks.SearchDeeplinkTarget;
import com.robinhood.android.stringscodegen.runtime.StringsCodegenEntryPoint;
import com.robinhood.android.transfers.lib.validation.IraDistributionCheck;
import com.robinhood.android.util.notification.RhGcmListenerService;
import com.robinhood.android.util.play.GooglePlay;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.android.wallet.upsell.WalletUpsellUtil;
import com.robinhood.android.widget.p277ui.PortfolioWidgetProvider;
import com.robinhood.android.widget.p277ui.WatchlistViewsFactory;
import com.robinhood.compose.bento.component.text.Markdown2;
import com.robinhood.hammer.android.activity.ActivityRetainedComponent;
import com.robinhood.hammer.android.broadcastreceiver.HammerBroadcastReceiver2;
import com.robinhood.hammer.android.service.ServiceComponent;
import com.robinhood.hammer.android.work.WorkerComponent;
import com.robinhood.p2p.common.ProfileAvatar2;
import com.robinhood.shared.cards.PromptForReviewNotificationCard;
import com.robinhood.shared.cards.ServerCard;
import com.robinhood.shared.portfolio.lists.p391ui.watchlist.WatchlistItemRowComposable2;
import com.robinhood.shared.support.supportchat.p396ui.ImageContent4;
import com.robinhood.utils.p409ui.view.dagger.ViewEntryPoint;
import kotlin.Metadata;
import microgram.android.bifrost.internal.component.DI;
import microgram.android.inject.MicrogramComponent;

/* compiled from: MergedAppComponent.kt */
@Metadata(m3635d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00022\u00020\u00022\u00020\u00022\u00020\u00022\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000f2\u00020\u00102\u00020\u00112\u00020\u00122\u00020\u00132\u00020\u00142\u00020\u00152\u00020\u00162\u00020\u00172\u00020\u00182\u00020\u00192\u00020\u001a2\u00020\u001b2\u00020\u001c2\u00020\u001d2\u00020\u001e2\u00020\u001f2\u00020 2\u00020!2\u00020\"2\u00020#2\u00020$2\u00020%2\u00020&2\u00020'2\u00020(2\u00020)2\u00020*2\u00020+2\u00020,2\u00020-2\u00020.2\u00020/2\u0002002\u0002012\u0002022\u0002032\u00020\u0002:\u000245¨\u00066"}, m3636d2 = {"Lcom/robinhood/android/MergedAppComponent;", "Lcom/robinhood/android/AppComponent;", "", "Lcom/robinhood/analytics/PeriodicLoggingWorker$PeriodicLoggingWorkerEntryPoint;", "Lcom/robinhood/android/AppObjectGraph$AppEntryPoint;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableViewEntryPoint;", "Lcom/robinhood/android/blackwidow/ui/upsell/ExploreLegendUpsellFragment$ExploreLegendUpsellEntryPoint;", "Lcom/robinhood/android/bugsy/BugsyEntryPoint;", "Lcom/robinhood/android/common/buysell/BuySellHelper$BuySellHelperEntryPoint;", "Lcom/robinhood/android/common/ui/BaseActivity$BaseActivityEntryPoint;", "Lcom/robinhood/android/common/ui/DynamicTranslationsEntryPoint;", "Lcom/robinhood/android/common/ui/LocaleConfigurationEntryPoint;", "Lcom/robinhood/android/common/ui/RxActivity$RxActivityEntryPoint;", "Lcom/robinhood/android/common/ui/ViewPumpEntryPoint;", "Lcom/robinhood/android/compose/autoeventlogging/AutoLoggingEntryPoint;", "Lcom/robinhood/android/cortex/digest/common/ClockEntryPoint;", "Lcom/robinhood/android/dashboardpill/ui/DashboardPillManagerEntryPoint;", "Lcom/robinhood/android/deeplink/targets/EquityAdvancedChartDeeplinkTarget$Component;", "Lcom/robinhood/android/designsystem/sparkle/SparkleDrawable$SparkleDrawableEntryPoint;", "Lcom/robinhood/android/diagnostics/work/LogFileCleanerWorker$WorkerEntryPoint;", "Lcom/robinhood/android/eventcontracts/contracts/HubExperimentEntryPoint;", "Lcom/robinhood/android/gold/sparkle/compose/SparkleManagerEntryPoint;", "Lcom/robinhood/android/graph/TabHeaderGraphLayout$TabHeaderGraphLayoutEntryPoint;", "Lcom/robinhood/android/lib/trade/BaseOrderActivity$BaseOrderActivityEntryPoint;", "Lcom/robinhood/android/lib/trade/BaseOrderFragment$EntryPoint;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/api/PaginatedListApiEntryPoint;", "Lcom/robinhood/android/markdown/compose/CustomMarkdownParserEntryPoint;", "Lcom/robinhood/android/markdown/util/MarkwonEntryPoint;", "Lcom/robinhood/android/regiongate/compose/di/RegionGateProviderEntryPoint;", "Lcom/robinhood/android/regiongate/compose/di/UserStoreEntryPoint;", "Lcom/robinhood/android/sdui/annotations/SduiEntryPoint;", "Lcom/robinhood/android/search/deeplinks/SearchDeeplinkTarget$DeeplinkEntryPoint;", "Lcom/robinhood/android/stringscodegen/runtime/StringsCodegenEntryPoint;", "Lcom/robinhood/android/transfers/lib/validation/IraDistributionCheck$FailureEntryPoint;", "Lcom/robinhood/android/util/notification/RhGcmListenerService$RhGcmListenerServiceEntryPoint;", "Lcom/robinhood/android/util/play/GooglePlay$EntryPoint;", "Lcom/robinhood/android/util/play/GooglePlay$GooglePayEntryPoint;", "Lcom/robinhood/android/utils/web/WebUtils$WebUtilsEntryPoint;", "Lcom/robinhood/android/wallet/upsell/WalletUpsellUtil$WalletUpsellDeeplinkEntryPoint;", "Lcom/robinhood/android/widget/ui/PortfolioWidgetProvider$EntryPoint;", "Lcom/robinhood/android/widget/ui/WatchlistViewsFactory$WatchlistViewsFactoryEntryPoint;", "Lcom/robinhood/compose/bento/component/text/BentoMarkdownTextEntryPoint;", "Lcom/robinhood/hammer/android/activity/ActivityRetainedComponent$ParentComponent;", "Lcom/robinhood/hammer/android/broadcastreceiver/HammerBroadcastReceiverComponent;", "Lcom/robinhood/hammer/android/service/ServiceComponent$ParentComponent;", "Lcom/robinhood/hammer/android/work/WorkerComponent$ParentComponent;", "Lcom/robinhood/p2p/common/ProfileAvatarEntryPoint;", "Lcom/robinhood/shared/cards/PromptForReviewNotificationCard$PromptForReviewNotificationCardEntryPoint;", "Lcom/robinhood/shared/cards/ServerCard$ServerCardEntryPoint;", "Lcom/robinhood/shared/portfolio/lists/ui/watchlist/ListInstrumentClickHandlerEntryPoint;", "Lcom/robinhood/shared/support/supportchat/ui/CxChatImageMessageEntryPoint;", "Lcom/robinhood/utils/ui/view/dagger/ViewEntryPoint;", "Factory", "BindingModule", "app-2025.51.4_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface MergedAppComponent extends AppComponent, ActivityRetainedComponent.ParentComponent, ServiceComponent.ParentComponent, WorkerComponent.ParentComponent, PeriodicLoggingWorker.PeriodicLoggingWorkerEntryPoint, AppObjectGraph.AppEntryPoint, AutoLoggableViewEntryPoint, ExploreLegendUpsellFragment.ExploreLegendUpsellEntryPoint, BugsyRedactCompose, BuySellHelper.BuySellHelperEntryPoint, BaseActivity.BaseActivityEntryPoint, DynamicTranslationsEntryPoint, LocaleConfigurationEntryPoint, RxActivity.RxActivityEntryPoint, ViewPumpEntryPoint, AutoLoggingCompositionLocals2, LocalClock2, VisibilityTracking, EquityAdvancedChartDeeplinkTarget.Component, SparkleDrawable.SparkleDrawableEntryPoint, LogFileCleanerWorker.WorkerEntryPoint, HubNavigateUtils, GoldSparkleBrush4, TabHeaderGraphLayout.TabHeaderGraphLayoutEntryPoint, BaseOrderActivity.BaseOrderActivityEntryPoint, BaseOrderFragment.EntryPoint, PaginatedListApiEntryPoint, CustomMarkdownParser2, MarkwonEntryPoint, RegionGateProviderEntryPoint, UserStoreEntryPoint, SduiEntryPoint, SearchDeeplinkTarget.DeeplinkEntryPoint, StringsCodegenEntryPoint, IraDistributionCheck.FailureEntryPoint, RhGcmListenerService.RhGcmListenerServiceEntryPoint, GooglePlay.EntryPoint, GooglePlay.GooglePayEntryPoint, WebUtils.WebUtilsEntryPoint, WalletUpsellUtil.WalletUpsellDeeplinkEntryPoint, PortfolioWidgetProvider.EntryPoint, WatchlistViewsFactory.WatchlistViewsFactoryEntryPoint, Markdown2, HammerBroadcastReceiver2, ProfileAvatar2, PromptForReviewNotificationCard.PromptForReviewNotificationCardEntryPoint, ServerCard.ServerCardEntryPoint, WatchlistItemRowComposable2, ImageContent4, ViewEntryPoint {

    /* compiled from: MergedAppComponent.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH'¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/MergedAppComponent$BindingModule;", "", "bindMergedAppComponent", "Lcom/robinhood/android/AppComponent;", "impl", "Lcom/robinhood/android/MergedAppComponent;", "bindFactory", "Lcom/robinhood/android/AppComponent$Factory;", "Lcom/robinhood/android/MergedAppComponent$Factory;", "app-2025.51.4_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes24.dex */
    public interface BindingModule {
        AppComponent.Factory bindFactory(Factory impl);

        AppComponent bindMergedAppComponent(MergedAppComponent impl);
    }

    /* compiled from: MergedAppComponent.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/MergedAppComponent$Factory;", "Lcom/robinhood/android/AppComponent$Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/MergedAppComponent;", "application", "Landroid/app/Application;", "app-2025.51.4_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Factory extends AppComponent.Factory {
        @Override // com.robinhood.android.AppComponent.Factory
        MergedAppComponent create(Application application);
    }

    /* synthetic */ MergedActivityRetainedComponent_bbdcf727.Factory createActivityRetainedSubcomponentFactory();

    /* renamed from: createFactory */
    /* synthetic */ MergedBifrostSubcomponent_37ed191a.Factory mo10301createFactory();

    /* renamed from: createFactory */
    /* synthetic */ DI.Factory mo10301createFactory();

    /* renamed from: createMicrogramSubcomponentFactory */
    /* synthetic */ MergedMicrogramComponent_5f4d8480.Factory mo10302createMicrogramSubcomponentFactory();

    /* renamed from: createMicrogramSubcomponentFactory */
    /* synthetic */ MicrogramComponent.Factory mo10302createMicrogramSubcomponentFactory();

    /* synthetic */ MergedServiceComponent_7ebbc657.Factory createServiceSubcomponentFactory();

    /* synthetic */ MergedWorkerComponent_166d7d2f.Factory createWorkerSubcomponentFactory();
}
