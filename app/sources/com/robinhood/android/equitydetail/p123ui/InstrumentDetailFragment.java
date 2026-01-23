package com.robinhood.android.equitydetail.p123ui;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.OneShotPreDrawListener;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwner2;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.jakewharton.rxbinding3.recyclerview.RxRecyclerView;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.analytics.LogOnceEventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.charts.util.GraphSelection2;
import com.robinhood.android.common.p088ui.AccurateLinearLayoutManager;
import com.robinhood.android.common.p088ui.BaseRhBottomSheetDialogHostFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.RecyclerViews;
import com.robinhood.android.common.util.transition.ToolbarScrollAnimator;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.style.DirectionOverlay;
import com.robinhood.android.education.contracts.AdvancedAlert;
import com.robinhood.android.educationtour.EducationTourEntryPointData;
import com.robinhood.android.educationtour.EducationTourScreenNames;
import com.robinhood.android.educationtour.extensions.BaseFragments3;
import com.robinhood.android.educationtour.extensions.ViewsKt;
import com.robinhood.android.educationtour.interfaces.EducationTourCallbacks;
import com.robinhood.android.equities.companyfinancials.CompanyFinancialsSectionDuxo;
import com.robinhood.android.equities.companyfinancials.CompanyFinancialsSectionViewState;
import com.robinhood.android.equities.contracts.AdtInstrumentInfoKey;
import com.robinhood.android.equities.contracts.tradingtrends.TradingTrendsDetailsContract;
import com.robinhood.android.equities.shortinterest.ShortInterestSectionDuxo;
import com.robinhood.android.equities.shortinterest.ShortInterestSectionViewState;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.databinding.FragmentInstrumentDetailBinding;
import com.robinhood.android.equitydetail.p123ui.InstrumentDetailAdapter;
import com.robinhood.android.equitydetail.p123ui.InstrumentDetailFragment;
import com.robinhood.android.equitydetail.p123ui.InstrumentDetailViewState;
import com.robinhood.android.equitydetail.p123ui.analytics.SdpEvent;
import com.robinhood.android.equitydetail.p123ui.analytics.SdpLogger;
import com.robinhood.android.equitydetail.p123ui.chartsettings.ChartSettingsBottomSheetFragment;
import com.robinhood.android.equitydetail.p123ui.etp.EtpCompositionItemBottomSheetFragment;
import com.robinhood.android.equitydetail.p123ui.etp.EtpCompositionItemHolder;
import com.robinhood.android.equitydetail.p123ui.etp.EtpCompositionView;
import com.robinhood.android.equitydetail.p123ui.tradingtrends.TradingTrendsAlertFragment;
import com.robinhood.android.gold.contracts.GoldFeature;
import com.robinhood.android.gold.contracts.GoldUpgradeIntentKey;
import com.robinhood.android.gold.contracts.Level2MarketDataFragmentKey;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.HostIntentKey;
import com.robinhood.android.newsfeed.util.NewsFeedAnalytics;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.regiongate.p237ui.lifecycle.UnsupportedFeatureDialogFragment;
import com.robinhood.android.tradingtrends.p264ui.chartSection.TradingTrendsChartSectionDuxo;
import com.robinhood.android.tradingtrends.p264ui.chartSection.TradingTrendsChartSectionState3;
import com.robinhood.android.tradingtrends.p264ui.details.TradingTrendsDetailsFragment;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.iac.crosssell.CrossSellLaunchManager;
import com.robinhood.librobinhood.data.store.alert.AdvancedAlertEntryPoint;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.IacAlertSheetLocation;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p355ui.GraphSelection;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertMobilePresentationStyle;
import com.robinhood.models.subscription.p352db.MarginSubscription;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.annotation.ShowDropFromRecurringCreationSurvey;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.InAppComm;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.history.contracts.account.AccountsHistoryAccountTypeFilter2;
import com.robinhood.shared.history.contracts.account.AccountsHistoryContract;
import com.robinhood.shared.history.contracts.account.AccountsHistoryTransactionTypeFilter;
import com.robinhood.shared.iac.herocards.p383ui.IacHeroCardProvider;
import com.robinhood.shared.recurring.contracts.RecurringHubFragmentKey;
import com.robinhood.udf.UiEvent;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.Survey;
import com.robinhood.utils.Either;
import com.robinhood.utils.Either2;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsAndCallbacksCompanion;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.lifecycle.ContextLifecycles;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.noties.markwon.Markwon;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.subjects.BehaviorSubject;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: InstrumentDetailFragment.kt */
@Metadata(m3635d1 = {"\u0000\u008e\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 ó\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0006ò\u0001ó\u0001ô\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0096\u0001\u001a\u00030\u0097\u00012\n\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0099\u0001H\u0016J\n\u0010\u009a\u0001\u001a\u00030\u0097\u0001H\u0016J \u0010\u009b\u0001\u001a\u00030\u0097\u00012\b\u0010\u009c\u0001\u001a\u00030\u009d\u00012\n\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0099\u0001H\u0016J\n\u0010\u009e\u0001\u001a\u00030\u0097\u0001H\u0002J\n\u0010\u009f\u0001\u001a\u00030\u0097\u0001H\u0002J\u0014\u0010 \u0001\u001a\u00030\u0097\u00012\b\u0010¡\u0001\u001a\u00030¢\u0001H\u0002J\n\u0010£\u0001\u001a\u00030\u0097\u0001H\u0016J\u0014\u0010¤\u0001\u001a\u00030\u0097\u00012\b\u0010\u008d\u0001\u001a\u00030\u008e\u0001H\u0002J\n\u0010¥\u0001\u001a\u00030\u0097\u0001H\u0016J\n\u0010¦\u0001\u001a\u00030\u0097\u0001H\u0016J\u0016\u0010§\u0001\u001a\u00030\u0097\u00012\n\u0010¨\u0001\u001a\u0005\u0018\u00010©\u0001H\u0016J\u0014\u0010ª\u0001\u001a\u00030\u0097\u00012\b\u0010¨\u0001\u001a\u00030©\u0001H\u0016J\u0014\u0010«\u0001\u001a\u00030\u0097\u00012\b\u0010¨\u0001\u001a\u00030©\u0001H\u0016J\u0014\u0010¬\u0001\u001a\u00030\u0097\u00012\b\u0010\u00ad\u0001\u001a\u00030®\u0001H\u0016J\u0014\u0010¯\u0001\u001a\u00030\u0097\u00012\b\u0010\u00ad\u0001\u001a\u00030®\u0001H\u0016J\u0014\u0010°\u0001\u001a\u00030\u0097\u00012\b\u0010±\u0001\u001a\u00030²\u0001H\u0016J\n\u0010³\u0001\u001a\u00030\u0097\u0001H\u0016J\n\u0010´\u0001\u001a\u00030\u0097\u0001H\u0016J\u0014\u0010µ\u0001\u001a\u00030\u0097\u00012\b\u0010¶\u0001\u001a\u00030·\u0001H\u0016J\u0014\u0010¸\u0001\u001a\u00030\u0097\u00012\b\u0010¶\u0001\u001a\u00030·\u0001H\u0016J\n\u0010¹\u0001\u001a\u00030\u0097\u0001H\u0002J\u0014\u0010º\u0001\u001a\u00030»\u00012\b\u0010¨\u0001\u001a\u00030©\u0001H\u0002J\u0019\u0010¼\u0001\u001a\b0½\u0001j\u0003`¾\u00012\b\u0010¨\u0001\u001a\u00030©\u0001H\u0002J\u0014\u0010¿\u0001\u001a\u00030\u0097\u00012\b\u0010À\u0001\u001a\u00030Á\u0001H\u0016J\u0013\u0010Â\u0001\u001a\u00030\u0097\u00012\u0007\u0010Ã\u0001\u001a\u00020BH\u0016J\n\u0010Ä\u0001\u001a\u00030\u0097\u0001H\u0016J\u0013\u0010Å\u0001\u001a\u00020z2\b\u0010Æ\u0001\u001a\u00030\u0093\u0001H\u0016J\u0014\u0010Ç\u0001\u001a\u00030\u0097\u00012\b\u0010È\u0001\u001a\u00030·\u0001H\u0016J\u0014\u0010É\u0001\u001a\u00030\u0097\u00012\b\u0010Ê\u0001\u001a\u00030·\u0001H\u0002J\u0014\u0010Ë\u0001\u001a\u00030\u0097\u00012\b\u0010Ì\u0001\u001a\u00030Í\u0001H\u0016J\n\u0010Î\u0001\u001a\u00030\u0097\u0001H\u0002J\n\u0010Ï\u0001\u001a\u00030\u0097\u0001H\u0002J\n\u0010Ð\u0001\u001a\u00030\u0097\u0001H\u0016J\u0013\u0010Ñ\u0001\u001a\u00030\u0097\u00012\u0007\u0010Ã\u0001\u001a\u00020BH\u0016J%\u0010Ò\u0001\u001a\u00030\u0097\u00012\b\u0010Ó\u0001\u001a\u00030·\u00012\u000f\u0010Ô\u0001\u001a\n\u0012\u0005\u0012\u00030\u0097\u00010Õ\u0001H\u0016J\u0014\u0010Ö\u0001\u001a\u00030\u0097\u00012\b\u0010×\u0001\u001a\u00030·\u0001H\u0016J\u001d\u0010Ø\u0001\u001a\u00030\u0097\u00012\u0007\u0010Ù\u0001\u001a\u00020z2\b\u0010Ú\u0001\u001a\u00030Û\u0001H\u0016J\u0014\u0010Ü\u0001\u001a\u00030\u0097\u00012\b\u0010Ý\u0001\u001a\u00030·\u0001H\u0016J$\u0010Þ\u0001\u001a\u00030\u0097\u00012\u0007\u0010Ã\u0001\u001a\u00020B2\t\u0010ß\u0001\u001a\u0004\u0018\u000107H\u0016¢\u0006\u0003\u0010à\u0001J\u0014\u0010á\u0001\u001a\u00030\u0097\u00012\b\u0010â\u0001\u001a\u00030ã\u0001H\u0002J\u0014\u0010ä\u0001\u001a\u00030\u0097\u00012\b\u0010å\u0001\u001a\u00030æ\u0001H\u0002J\n\u0010ç\u0001\u001a\u00030\u0097\u0001H\u0002J\b\u0010è\u0001\u001a\u00030\u0097\u0001J.\u0010é\u0001\u001a\u00030\u0097\u00012\u0007\u0010ß\u0001\u001a\u0002072\u000e\u0010ê\u0001\u001a\t\u0012\u0004\u0012\u0002070Õ\u00012\t\b\u0002\u0010ë\u0001\u001a\u000207H\u0002J\u0012\u0010ì\u0001\u001a\u00030í\u00012\b\u0010î\u0001\u001a\u00030ï\u0001J\n\u0010ð\u0001\u001a\u00030\u0097\u0001H\u0002J\n\u0010ñ\u0001\u001a\u00030\u0097\u0001H\u0016R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u00020!8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010&\u001a\u00020'8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010,\u001a\u00020-8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0014\u00102\u001a\u0002038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u00106\u001a\u0002078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0017\u0010:\u001a\b\u0012\u0004\u0012\u00020<0;8F¢\u0006\u0006\u001a\u0004\b=\u0010>R(\u0010?\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020B C*\n\u0012\u0004\u0012\u00020B\u0018\u00010A0A0@X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0A0;8F¢\u0006\u0006\u001a\u0004\bE\u0010>R\u001b\u0010F\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bH\u0010IR\u001b\u0010L\u001a\u00020M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bN\u0010OR\u0014\u0010R\u001a\u00020S8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u001b\u0010V\u001a\u00020W8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010K\u001a\u0004\bX\u0010YR\u001b\u0010[\u001a\u00020\\8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b_\u0010K\u001a\u0004\b]\u0010^R\u001b\u0010`\u001a\u00020a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bd\u0010K\u001a\u0004\bb\u0010cR\u001b\u0010e\u001a\u00020f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bi\u0010K\u001a\u0004\bg\u0010hR\u000e\u0010j\u001a\u00020kX\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010l\u001a\u00020m8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bp\u0010Q\u001a\u0004\bn\u0010oR/\u0010r\u001a\u0004\u0018\u0001072\b\u0010q\u001a\u0004\u0018\u0001078B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\u000e\u0010y\u001a\u00020zX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010{\u001a\u00020zX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010|\u001a\u00020}8BX\u0082\u0084\u0002¢\u0006\r\n\u0005\b\u0080\u0001\u0010K\u001a\u0004\b~\u0010\u007fR \u0010\u0081\u0001\u001a\u0013\u0012\u000e\u0012\f C*\u0005\u0018\u00010\u0083\u00010\u0083\u00010\u0082\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0015\u0010\u0084\u0001\u001a\u00030\u0085\u00018F¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0017\u0010\u0088\u0001\u001a\u00020zX\u0096D¢\u0006\n\n\u0000\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0017\u0010\u008b\u0001\u001a\u00020zX\u0096D¢\u0006\n\n\u0000\u001a\u0006\b\u008c\u0001\u0010\u008a\u0001R\u0015\u0010\u008d\u0001\u001a\u00030\u008e\u00018F¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0017\u0010\u0091\u0001\u001a\n\u0012\u0005\u0012\u00030\u0093\u00010\u0092\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0095\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006õ\u0001"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/InstrumentDetailFragment;", "Lcom/robinhood/android/common/ui/BaseRhBottomSheetDialogHostFragment;", "Lcom/robinhood/android/equitydetail/ui/InstrumentDetailAdapter$Callbacks;", "Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionItemBottomSheetFragment$Callbacks;", "Lcom/robinhood/android/equitydetail/ui/chartsettings/ChartSettingsBottomSheetFragment$Callbacks;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "sdpLogger", "Lcom/robinhood/android/equitydetail/ui/analytics/SdpLogger;", "getSdpLogger", "()Lcom/robinhood/android/equitydetail/ui/analytics/SdpLogger;", "setSdpLogger", "(Lcom/robinhood/android/equitydetail/ui/analytics/SdpLogger;)V", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "showDropFromRecurringCreationSurvey", "Lcom/robinhood/prefs/BooleanPreference;", "getShowDropFromRecurringCreationSurvey", "()Lcom/robinhood/prefs/BooleanPreference;", "setShowDropFromRecurringCreationSurvey", "(Lcom/robinhood/prefs/BooleanPreference;)V", "crossSellLaunchManager", "Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "getCrossSellLaunchManager", "()Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "setCrossSellLaunchManager", "(Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "defaultContentBottomPadding", "", "getDefaultContentBottomPadding", "()I", "directionStyleObservable", "Lio/reactivex/Observable;", "Lcom/robinhood/android/designsystem/style/DirectionOverlay;", "getDirectionStyleObservable", "()Lio/reactivex/Observable;", "currentlyBoundInfoBannerReceiptUuidRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/utils/Optional;", "Ljava/util/UUID;", "kotlin.jvm.PlatformType", "currentlyBoundInfoBannerReceiptUuid", "getCurrentlyBoundInfoBannerReceiptUuid", "logOnceEventLogger", "Lcom/robinhood/analytics/LogOnceEventLogger;", "getLogOnceEventLogger", "()Lcom/robinhood/analytics/LogOnceEventLogger;", "logOnceEventLogger$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/equitydetail/databinding/FragmentInstrumentDetailBinding;", "getBinding", "()Lcom/robinhood/android/equitydetail/databinding/FragmentInstrumentDetailBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "duxo", "Lcom/robinhood/android/equitydetail/ui/InstrumentDetailDuxo;", "getDuxo", "()Lcom/robinhood/android/equitydetail/ui/InstrumentDetailDuxo;", "duxo$delegate", "tradingTrendsSectionDuxo", "Lcom/robinhood/android/tradingtrends/ui/chartSection/TradingTrendsChartSectionDuxo;", "getTradingTrendsSectionDuxo", "()Lcom/robinhood/android/tradingtrends/ui/chartSection/TradingTrendsChartSectionDuxo;", "tradingTrendsSectionDuxo$delegate", "companyFinancialsSectionDuxo", "Lcom/robinhood/android/equities/companyfinancials/CompanyFinancialsSectionDuxo;", "getCompanyFinancialsSectionDuxo", "()Lcom/robinhood/android/equities/companyfinancials/CompanyFinancialsSectionDuxo;", "companyFinancialsSectionDuxo$delegate", "shortInterestSectionDuxo", "Lcom/robinhood/android/equities/shortinterest/ShortInterestSectionDuxo;", "getShortInterestSectionDuxo", "()Lcom/robinhood/android/equities/shortinterest/ShortInterestSectionDuxo;", "shortInterestSectionDuxo$delegate", "adapter", "Lcom/robinhood/android/equitydetail/ui/InstrumentDetailAdapter;", "callbacks", "Lcom/robinhood/android/equitydetail/ui/InstrumentDetailFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/equitydetail/ui/InstrumentDetailFragment$Callbacks;", "callbacks$delegate", "<set-?>", "lastSeenIndex", "getLastSeenIndex", "()Ljava/lang/Integer;", "setLastSeenIndex", "(Ljava/lang/Integer;)V", "lastSeenIndex$delegate", "Lkotlin/properties/ReadWriteProperty;", "educationTourEntryPointCounted", "", "isShowingEducationTour", "newsFeedAnalytics", "Lcom/robinhood/android/newsfeed/util/NewsFeedAnalytics;", "getNewsFeedAnalytics", "()Lcom/robinhood/android/newsfeed/util/NewsFeedAnalytics;", "newsFeedAnalytics$delegate", "finishedLoadingSubject", "Lio/reactivex/subjects/BehaviorSubject;", "", "finishedLoadingCompletable", "Lio/reactivex/Completable;", "getFinishedLoadingCompletable", "()Lio/reactivex/Completable;", "excludeFromSourceLogging", "getExcludeFromSourceLogging", "()Z", "excludeFromAutoScreenSourceEventLogging", "getExcludeFromAutoScreenSourceEventLogging", "instrument", "Lcom/robinhood/models/db/Instrument;", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "bottomSheetActionHandler", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "smoothScrollTarget", "Lcom/robinhood/android/equitydetail/ui/DetailData;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onViewCreated", "view", "Landroid/view/View;", "showTradingTrendsNotFound", "checkParentSource", "enableTradingTrendsSdpMode", "mode", "Lcom/robinhood/android/equitydetail/ui/InstrumentDetailViewState$SdpMode$TradingTrendsDetails;", "onResume", "setupUserLeapSurvey", "onPause", "onDestroyView", "onBindInfoBanner", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/equitydetail/ui/InfoBannerViewData;", "onClickInfoBanner", "onDismissInfoBanner", "onHeroCardDismissed", "provider", "Lcom/robinhood/shared/iac/herocards/ui/IacHeroCardProvider;", "onHeroCardClicked", "setSdpMode", "sdpMode", "Lcom/robinhood/android/equitydetail/ui/InstrumentDetailViewState$SdpMode;", "onShowEducationTour", "onHideEducationTour", "onEducationTourEntryPointCardAppear", "trackingId", "", "onEducationTourEntryPointCardHide", "hideEducationTourIfNeeded", "getProtobufComponentForInfoBanner", "Lcom/robinhood/rosetta/eventlogging/Component;", "getProtobufContextForInfoBanner", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "onEtpItemClicked", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionItemHolder;", "onEtpCompositionInstrumentSelected", "instrumentId", "onEtpCompositionBottomSheetDismissed", "handle", "action", "onSpanChanged", "span", "onRecurringHubClicked", "accountNumber", "onHistoryShowMoreClicked", "selectedAccount", "Lcom/robinhood/models/db/Account;", "onShowLevel2", "onShowAdvancedAlertFragment", "onBidAskClicked", "handleFullReportTap", "launchChartEducationTour", "tourName", "onFinish", "Lkotlin/Function0;", "onTradingTrendsTypeSelected", "tradingTrendsType", "expandTradingTrendsDetails", "viewPagerInputEnabled", "fragment", "Landroidx/fragment/app/Fragment;", "onTimePeriodSelected", "timePeriodType", "onScrubIndexChanged", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "(Ljava/util/UUID;Ljava/lang/Integer;)V", "presentUserLeapSurveyForGraphSelection", "graphSelection", "Lcom/robinhood/models/ui/GraphSelection;", "presentUserLeapSurveyForDisplaySpan", "displaySpan", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "presentUserLeapSurveyFor24HourMarket", "scrollToAnalystReport", "smoothScrollToIndex", "getNewIndex", "retriesLeft", "attachToolbarScrollAnimator", "Lio/reactivex/disposables/Disposable;", "toolbarScrollAnimator", "Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "initializeAnalytics", "onCardSeen", "Callbacks", "Companion", "InstrumentDetailArgs", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class InstrumentDetailFragment extends BaseRhBottomSheetDialogHostFragment implements InstrumentDetailAdapter.Callbacks, EtpCompositionItemBottomSheetFragment.Callbacks, ChartSettingsBottomSheetFragment.Callbacks, AutoLoggableFragment {
    private static final String ETP_ITEM_BOTTOM_SHEET_TAG = "etpItemBottomSheet";
    private InstrumentDetailAdapter adapter;
    public AnalyticsLogger analytics;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final SduiActionHandler<GenericAction> bottomSheetActionHandler;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: companyFinancialsSectionDuxo$delegate, reason: from kotlin metadata */
    private final Lazy companyFinancialsSectionDuxo;
    public CrossSellLaunchManager crossSellLaunchManager;
    private final BehaviorRelay<Optional<UUID>> currentlyBoundInfoBannerReceiptUuidRelay;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private boolean educationTourEntryPointCounted;
    public EventLogger eventLogger;
    private final boolean excludeFromAutoScreenSourceEventLogging;
    private final boolean excludeFromSourceLogging;
    private final BehaviorSubject finishedLoadingSubject;
    private boolean isShowingEducationTour;

    /* renamed from: lastSeenIndex$delegate, reason: from kotlin metadata */
    private final Interfaces3 lastSeenIndex;

    /* renamed from: logOnceEventLogger$delegate, reason: from kotlin metadata */
    private final Lazy logOnceEventLogger;
    public Markwon markwon;

    /* renamed from: newsFeedAnalytics$delegate, reason: from kotlin metadata */
    private final Lazy newsFeedAnalytics;
    public SdpLogger sdpLogger;

    /* renamed from: shortInterestSectionDuxo$delegate, reason: from kotlin metadata */
    private final Lazy shortInterestSectionDuxo;

    @ShowDropFromRecurringCreationSurvey
    public BooleanPreference showDropFromRecurringCreationSurvey;
    private DetailData smoothScrollTarget;

    /* renamed from: tradingTrendsSectionDuxo$delegate, reason: from kotlin metadata */
    private final Lazy tradingTrendsSectionDuxo;
    public SurveyManager3 userLeapManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(InstrumentDetailFragment.class, "binding", "getBinding()Lcom/robinhood/android/equitydetail/databinding/FragmentInstrumentDetailBinding;", 0)), Reflection.property1(new PropertyReference1Impl(InstrumentDetailFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/equitydetail/ui/InstrumentDetailFragment$Callbacks;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(InstrumentDetailFragment.class, "lastSeenIndex", "getLastSeenIndex()Ljava/lang/Integer;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: InstrumentDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/InstrumentDetailFragment$Callbacks;", "Lcom/robinhood/android/educationtour/interfaces/EducationTourCallbacks;", "onGraphLayoutPreDraw", "", "view", "Landroid/view/View;", "onGraphSelectionChanged", "newGraphSelection", "Lcom/robinhood/models/ui/GraphSelection;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends EducationTourCallbacks {
        void onGraphLayoutPreDraw(View view);

        void onGraphSelectionChanged(GraphSelection newGraphSelection);
    }

    /* compiled from: InstrumentDetailFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[InstrumentDetailSource.values().length];
            try {
                iArr[InstrumentDetailSource.TRADING_TRENDS_ONBOARDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InstrumentDetailSource.COMPANY_FINANCIALS_ONBOARDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[GenericAlertMobilePresentationStyle.values().length];
            try {
                iArr2[GenericAlertMobilePresentationStyle.BOTTOM_SHEET.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[GenericAlertMobilePresentationStyle.MODAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[GraphSelection.values().length];
            try {
                iArr3[GraphSelection.YEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[GraphSelection.FIVE_YEARS.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[DisplaySpan.values().length];
            try {
                iArr4[DisplaySpan.YEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr4[DisplaySpan.f93695YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    @Override // com.robinhood.shared.iac.herocards.ui.IacHeroCardView.Callback
    public void onHeroCardSeen(IacHeroCardProvider iacHeroCardProvider) {
        InstrumentDetailAdapter.Callbacks.DefaultImpls.onHeroCardSeen(this, iacHeroCardProvider);
    }

    public InstrumentDetailFragment() {
        super(C15314R.layout.fragment_instrument_detail);
        BehaviorRelay<Optional<UUID>> behaviorRelayCreateDefault = BehaviorRelay.createDefault(Optional2.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.currentlyBoundInfoBannerReceiptUuidRelay = behaviorRelayCreateDefault;
        this.logOnceEventLogger = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailFragment$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InstrumentDetailFragment.logOnceEventLogger_delegate$lambda$1(this.f$0);
            }
        });
        this.binding = ViewBinding5.viewBinding(this, InstrumentDetailFragment2.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, InstrumentDetailDuxo.class);
        this.tradingTrendsSectionDuxo = DuxosKt.duxo(this, TradingTrendsChartSectionDuxo.class);
        this.companyFinancialsSectionDuxo = DuxosKt.duxo(this, CompanyFinancialsSectionDuxo.class);
        this.shortInterestSectionDuxo = DuxosKt.duxo(this, ShortInterestSectionDuxo.class);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.lastSeenIndex = (Interfaces3) BindSavedState2.savedSerializable(this).provideDelegate(this, $$delegatedProperties[2]);
        this.newsFeedAnalytics = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailFragment$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InstrumentDetailFragment.newsFeedAnalytics_delegate$lambda$2(this.f$0);
            }
        });
        BehaviorSubject behaviorSubjectCreate = BehaviorSubject.create();
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreate, "create(...)");
        this.finishedLoadingSubject = behaviorSubjectCreate;
        this.excludeFromSourceLogging = true;
        this.excludeFromAutoScreenSourceEventLogging = true;
        this.bottomSheetActionHandler = new SduiActionHandler() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailFragment$bottomSheetActionHandler$1
            @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
            /* renamed from: handle, reason: merged with bridge method [inline-methods] */
            public final boolean mo15941handle(GenericAction action) {
                Intrinsics.checkNotNullParameter(action, "action");
                if (action instanceof GenericAction.Dismiss) {
                    return true;
                }
                return this.this$0.mo15941handle(action);
            }
        };
    }

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    public final SdpLogger getSdpLogger() {
        SdpLogger sdpLogger = this.sdpLogger;
        if (sdpLogger != null) {
            return sdpLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sdpLogger");
        return null;
    }

    public final void setSdpLogger(SdpLogger sdpLogger) {
        Intrinsics.checkNotNullParameter(sdpLogger, "<set-?>");
        this.sdpLogger = sdpLogger;
    }

    public final SurveyManager3 getUserLeapManager() {
        SurveyManager3 surveyManager3 = this.userLeapManager;
        if (surveyManager3 != null) {
            return surveyManager3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userLeapManager");
        return null;
    }

    public final void setUserLeapManager(SurveyManager3 surveyManager3) {
        Intrinsics.checkNotNullParameter(surveyManager3, "<set-?>");
        this.userLeapManager = surveyManager3;
    }

    public final BooleanPreference getShowDropFromRecurringCreationSurvey() {
        BooleanPreference booleanPreference = this.showDropFromRecurringCreationSurvey;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("showDropFromRecurringCreationSurvey");
        return null;
    }

    public final void setShowDropFromRecurringCreationSurvey(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.showDropFromRecurringCreationSurvey = booleanPreference;
    }

    public final CrossSellLaunchManager getCrossSellLaunchManager() {
        CrossSellLaunchManager crossSellLaunchManager = this.crossSellLaunchManager;
        if (crossSellLaunchManager != null) {
            return crossSellLaunchManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("crossSellLaunchManager");
        return null;
    }

    public final void setCrossSellLaunchManager(CrossSellLaunchManager crossSellLaunchManager) {
        Intrinsics.checkNotNullParameter(crossSellLaunchManager, "<set-?>");
        this.crossSellLaunchManager = crossSellLaunchManager;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        String serverValue;
        Screen.Name name = Screen.Name.STOCK_DETAIL_PAGE;
        String string2 = getInstrument().getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        InstrumentDetailSource source = ((InstrumentDetailArgs) INSTANCE.getArgs((Fragment) this)).getSource();
        if (source == null || (serverValue = source.getServerValue()) == null) {
            serverValue = "";
        }
        return new Screen(name, serverValue, string2, null, 8, null);
    }

    private final int getDefaultContentBottomPadding() {
        return getResources().getDimensionPixelSize(C13997R.dimen.rds_spacing_medium);
    }

    public final Observable<DirectionOverlay> getDirectionStyleObservable() {
        InstrumentDetailAdapter instrumentDetailAdapter = this.adapter;
        if (instrumentDetailAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            instrumentDetailAdapter = null;
        }
        Observable<DirectionOverlay> directionStyleObservable = instrumentDetailAdapter.getDirectionStyleObservable();
        Observable<R> map = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailFragment$special$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((InstrumentDetailViewState) it).getChartDirection());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((InstrumentDetailFragment$special$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable<DirectionOverlay> observableMerge = Observable.merge(directionStyleObservable, ObservablesKt.filterIsPresent(map).distinctUntilChanged());
        Intrinsics.checkNotNullExpressionValue(observableMerge, "merge(...)");
        return observableMerge;
    }

    public final Observable<Optional<UUID>> getCurrentlyBoundInfoBannerReceiptUuid() {
        return this.currentlyBoundInfoBannerReceiptUuidRelay;
    }

    private final LogOnceEventLogger getLogOnceEventLogger() {
        return (LogOnceEventLogger) this.logOnceEventLogger.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LogOnceEventLogger logOnceEventLogger_delegate$lambda$1(InstrumentDetailFragment instrumentDetailFragment) {
        return new LogOnceEventLogger(instrumentDetailFragment.getEventLogger());
    }

    private final FragmentInstrumentDetailBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentInstrumentDetailBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecyclerView getRecyclerView() {
        RecyclerView instrumentDetailRecyclerView = getBinding().instrumentDetailRecyclerView;
        Intrinsics.checkNotNullExpressionValue(instrumentDetailRecyclerView, "instrumentDetailRecyclerView");
        return instrumentDetailRecyclerView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InstrumentDetailDuxo getDuxo() {
        return (InstrumentDetailDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TradingTrendsChartSectionDuxo getTradingTrendsSectionDuxo() {
        return (TradingTrendsChartSectionDuxo) this.tradingTrendsSectionDuxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CompanyFinancialsSectionDuxo getCompanyFinancialsSectionDuxo() {
        return (CompanyFinancialsSectionDuxo) this.companyFinancialsSectionDuxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ShortInterestSectionDuxo getShortInterestSectionDuxo() {
        return (ShortInterestSectionDuxo) this.shortInterestSectionDuxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer getLastSeenIndex() {
        return (Integer) this.lastSeenIndex.getValue(this, $$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLastSeenIndex(Integer num) {
        this.lastSeenIndex.setValue(this, $$delegatedProperties[2], num);
    }

    private final NewsFeedAnalytics getNewsFeedAnalytics() {
        return (NewsFeedAnalytics) this.newsFeedAnalytics.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NewsFeedAnalytics newsFeedAnalytics_delegate$lambda$2(InstrumentDetailFragment instrumentDetailFragment) {
        return new NewsFeedAnalytics(instrumentDetailFragment.getAnalytics(), "", instrumentDetailFragment.getEventLogger(), instrumentDetailFragment.getEventScreen());
    }

    public final Completable getFinishedLoadingCompletable() {
        Completable completableIgnoreElements = this.finishedLoadingSubject.ignoreElements();
        Intrinsics.checkNotNullExpressionValue(completableIgnoreElements, "ignoreElements(...)");
        return completableIgnoreElements;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public boolean getExcludeFromSourceLogging() {
        return this.excludeFromSourceLogging;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return this.excludeFromAutoScreenSourceEventLogging;
    }

    public final Instrument getInstrument() {
        return ((InstrumentDetailArgs) INSTANCE.getArgs((Fragment) this)).getInstrument();
    }

    /* compiled from: InstrumentDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.InstrumentDetailFragment$onCreate$1", m3645f = "InstrumentDetailFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitydetail.ui.InstrumentDetailFragment$onCreate$1 */
    static final class C153681 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C153681(Continuation<? super C153681> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C153681 c153681 = InstrumentDetailFragment.this.new C153681(continuation);
            c153681.L$0 = obj;
            return c153681;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C153681) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: InstrumentDetailFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.InstrumentDetailFragment$onCreate$1$1", m3645f = "InstrumentDetailFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitydetail.ui.InstrumentDetailFragment$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ InstrumentDetailFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(InstrumentDetailFragment instrumentDetailFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = instrumentDetailFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    TradingTrendsChartSectionDuxo tradingTrendsSectionDuxo = this.this$0.getTradingTrendsSectionDuxo();
                    String string2 = this.this$0.getInstrument().getId().toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    TradingTrendsChartSectionDuxo.bind$default(tradingTrendsSectionDuxo, string2, false, null, 4, null);
                    StateFlow<TradingTrendsChartSectionState3> stateFlow = this.this$0.getTradingTrendsSectionDuxo().getStateFlow();
                    C499391 c499391 = new C499391(this.this$0.getDuxo());
                    this.label = 1;
                    if (stateFlow.collect(c499391, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new ExceptionsH();
            }

            /* compiled from: InstrumentDetailFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.equitydetail.ui.InstrumentDetailFragment$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            /* synthetic */ class C499391 implements FlowCollector, FunctionAdapter {
                final /* synthetic */ InstrumentDetailDuxo $tmp0;

                C499391(InstrumentDetailDuxo instrumentDetailDuxo) {
                    this.$tmp0 = instrumentDetailDuxo;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.FunctionAdapter
                public final kotlin.Function<?> getFunctionDelegate() {
                    return new AdaptedFunctionReference(2, this.$tmp0, InstrumentDetailDuxo.class, "onTradingTrendsSectionStateUpdated", "onTradingTrendsSectionStateUpdated(Lcom/robinhood/android/tradingtrends/ui/chartSection/TradingTrendsChartSectionViewState;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }

                public final Object emit(TradingTrendsChartSectionState3 tradingTrendsChartSectionState3, Continuation<? super Unit> continuation) {
                    Object objInvokeSuspend$onTradingTrendsSectionStateUpdated = AnonymousClass1.invokeSuspend$onTradingTrendsSectionStateUpdated(this.$tmp0, tradingTrendsChartSectionState3, continuation);
                    return objInvokeSuspend$onTradingTrendsSectionStateUpdated == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$onTradingTrendsSectionStateUpdated : Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return emit((TradingTrendsChartSectionState3) obj, (Continuation<? super Unit>) continuation);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object invokeSuspend$onTradingTrendsSectionStateUpdated(InstrumentDetailDuxo instrumentDetailDuxo, TradingTrendsChartSectionState3 tradingTrendsChartSectionState3, Continuation continuation) {
                instrumentDetailDuxo.onTradingTrendsSectionStateUpdated(tradingTrendsChartSectionState3);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(InstrumentDetailFragment.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(InstrumentDetailFragment.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(InstrumentDetailFragment.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: InstrumentDetailFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.InstrumentDetailFragment$onCreate$1$2", m3645f = "InstrumentDetailFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitydetail.ui.InstrumentDetailFragment$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ InstrumentDetailFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(InstrumentDetailFragment instrumentDetailFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = instrumentDetailFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.getCompanyFinancialsSectionDuxo().bind(this.this$0.getInstrument().getId());
                    StateFlow<CompanyFinancialsSectionViewState> stateFlow = this.this$0.getCompanyFinancialsSectionDuxo().getStateFlow();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0.getDuxo());
                    this.label = 1;
                    if (stateFlow.collect(anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new ExceptionsH();
            }

            /* compiled from: InstrumentDetailFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.equitydetail.ui.InstrumentDetailFragment$onCreate$1$2$1, reason: invalid class name */
            /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
                final /* synthetic */ InstrumentDetailDuxo $tmp0;

                AnonymousClass1(InstrumentDetailDuxo instrumentDetailDuxo) {
                    this.$tmp0 = instrumentDetailDuxo;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.FunctionAdapter
                public final kotlin.Function<?> getFunctionDelegate() {
                    return new AdaptedFunctionReference(2, this.$tmp0, InstrumentDetailDuxo.class, "onCompanyFinancialsSectionStateUpdated", "onCompanyFinancialsSectionStateUpdated(Lcom/robinhood/android/equities/companyfinancials/CompanyFinancialsSectionViewState;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }

                public final Object emit(CompanyFinancialsSectionViewState companyFinancialsSectionViewState, Continuation<? super Unit> continuation) {
                    Object objInvokeSuspend$onCompanyFinancialsSectionStateUpdated = AnonymousClass2.invokeSuspend$onCompanyFinancialsSectionStateUpdated(this.$tmp0, companyFinancialsSectionViewState, continuation);
                    return objInvokeSuspend$onCompanyFinancialsSectionStateUpdated == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$onCompanyFinancialsSectionStateUpdated : Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return emit((CompanyFinancialsSectionViewState) obj, (Continuation<? super Unit>) continuation);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object invokeSuspend$onCompanyFinancialsSectionStateUpdated(InstrumentDetailDuxo instrumentDetailDuxo, CompanyFinancialsSectionViewState companyFinancialsSectionViewState, Continuation continuation) {
                instrumentDetailDuxo.onCompanyFinancialsSectionStateUpdated(companyFinancialsSectionViewState);
                return Unit.INSTANCE;
            }
        }

        /* compiled from: InstrumentDetailFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.InstrumentDetailFragment$onCreate$1$3", m3645f = "InstrumentDetailFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitydetail.ui.InstrumentDetailFragment$onCreate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ InstrumentDetailFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(InstrumentDetailFragment instrumentDetailFragment, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = instrumentDetailFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.getShortInterestSectionDuxo().bind(this.this$0.getInstrument().getId());
                    StateFlow<ShortInterestSectionViewState> stateFlow = this.this$0.getShortInterestSectionDuxo().getStateFlow();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0.getDuxo());
                    this.label = 1;
                    if (stateFlow.collect(anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new ExceptionsH();
            }

            /* compiled from: InstrumentDetailFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.equitydetail.ui.InstrumentDetailFragment$onCreate$1$3$1, reason: invalid class name */
            /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
                final /* synthetic */ InstrumentDetailDuxo $tmp0;

                AnonymousClass1(InstrumentDetailDuxo instrumentDetailDuxo) {
                    this.$tmp0 = instrumentDetailDuxo;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.FunctionAdapter
                public final kotlin.Function<?> getFunctionDelegate() {
                    return new AdaptedFunctionReference(2, this.$tmp0, InstrumentDetailDuxo.class, "onShortInterestSectionStateUpdated", "onShortInterestSectionStateUpdated(Lcom/robinhood/android/equities/shortinterest/ShortInterestSectionViewState;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }

                public final Object emit(ShortInterestSectionViewState shortInterestSectionViewState, Continuation<? super Unit> continuation) {
                    Object objInvokeSuspend$onShortInterestSectionStateUpdated = AnonymousClass3.invokeSuspend$onShortInterestSectionStateUpdated(this.$tmp0, shortInterestSectionViewState, continuation);
                    return objInvokeSuspend$onShortInterestSectionStateUpdated == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$onShortInterestSectionStateUpdated : Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return emit((ShortInterestSectionViewState) obj, (Continuation<? super Unit>) continuation);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object invokeSuspend$onShortInterestSectionStateUpdated(InstrumentDetailDuxo instrumentDetailDuxo, ShortInterestSectionViewState shortInterestSectionViewState, Continuation continuation) {
                instrumentDetailDuxo.onShortInterestSectionStateUpdated(shortInterestSectionViewState);
                return Unit.INSTANCE;
            }
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C153681(null));
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Observable<InstrumentDetailViewState> observableDebounce = getDuxo().getStates().debounce(50L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(observableDebounce, "debounce(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDebounce), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentDetailFragment.onStart$lambda$6(this.f$0, (InstrumentDetailViewState) obj);
            }
        });
        InstrumentDetailAdapter instrumentDetailAdapter = this.adapter;
        if (instrumentDetailAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            instrumentDetailAdapter = null;
        }
        LifecycleHost.DefaultImpls.bind$default(this, instrumentDetailAdapter.getGraphSelectionChangedObservable(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentDetailFragment.onStart$lambda$7(this.f$0, (GraphSelection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$6(final InstrumentDetailFragment instrumentDetailFragment, final InstrumentDetailViewState instrumentDetailViewState) {
        UUID uuidConsume;
        Boolean boolConsume;
        InstrumentDetailAdapter instrumentDetailAdapter = instrumentDetailFragment.adapter;
        if (instrumentDetailAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            instrumentDetailAdapter = null;
        }
        instrumentDetailAdapter.submitList(instrumentDetailViewState.getDetailDataList(), new Runnable() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailFragment$onStart$1$1
            @Override // java.lang.Runnable
            public final void run() {
                if (!this.this$0.isResumed() || !instrumentDetailViewState.isConsideredLoaded() || this.this$0.finishedLoadingSubject.hasComplete()) {
                    if (this.this$0.getLastSeenIndex() != null) {
                        RecyclerView recyclerView = this.this$0.getRecyclerView();
                        Integer lastSeenIndex = this.this$0.getLastSeenIndex();
                        recyclerView.scrollToPosition(lastSeenIndex != null ? lastSeenIndex.intValue() : 0);
                        this.this$0.setLastSeenIndex(null);
                        return;
                    }
                    return;
                }
                final View viewRequireView = this.this$0.requireView();
                Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
                final InstrumentDetailFragment instrumentDetailFragment2 = this.this$0;
                OneShotPreDrawListener.add(viewRequireView, new Runnable() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailFragment$onStart$1$1$run$$inlined$doOnPreDraw$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        instrumentDetailFragment2.finishedLoadingSubject.onComplete();
                    }
                });
            }
        });
        UiEvent<Boolean> showIpoAccessOnboardingEvent = instrumentDetailViewState.getShowIpoAccessOnboardingEvent();
        if (showIpoAccessOnboardingEvent != null && (boolConsume = showIpoAccessOnboardingEvent.consume()) != null) {
            if (boolConsume.booleanValue()) {
                Navigator navigator = instrumentDetailFragment.getNavigator();
                android.content.Context contextRequireContext = instrumentDetailFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, LegacyIntentKey.DirectIpoOnboarding.INSTANCE, null, false, null, null, 60, null);
            } else {
                UnsupportedFeatureDialogFragment.Companion companion = UnsupportedFeatureDialogFragment.INSTANCE;
                android.content.Context contextRequireContext2 = instrumentDetailFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                FragmentManager supportFragmentManager = instrumentDetailFragment.requireActivity().getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                companion.show(contextRequireContext2, supportFragmentManager);
            }
        }
        UiEvent<UUID> adtInfoSheetEvent = instrumentDetailViewState.getAdtInfoSheetEvent();
        if (adtInfoSheetEvent != null && (uuidConsume = adtInfoSheetEvent.consume()) != null) {
            Navigator navigator2 = instrumentDetailFragment.getNavigator();
            android.content.Context contextRequireContext3 = instrumentDetailFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator2, contextRequireContext3, new HostIntentKey.DialogFragmentHost(new AdtInstrumentInfoKey(uuidConsume, instrumentDetailFragment.getSdpLogger().provideEventScreen(), instrumentDetailFragment.getSdpLogger().provideEventContext())), null, false, null, null, 60, null);
        }
        UiEvent<Unit> twentyFourHourMarketSurveyEvent = instrumentDetailViewState.getTwentyFourHourMarketSurveyEvent();
        if (twentyFourHourMarketSurveyEvent != null) {
            twentyFourHourMarketSurveyEvent.consumeWith(new Function1() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InstrumentDetailFragment.onStart$lambda$6$lambda$5(this.f$0, (Unit) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$6$lambda$5(InstrumentDetailFragment instrumentDetailFragment, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        instrumentDetailFragment.presentUserLeapSurveyFor24HourMarket();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$7(InstrumentDetailFragment instrumentDetailFragment, GraphSelection graphSelection) {
        Intrinsics.checkNotNullParameter(graphSelection, "graphSelection");
        instrumentDetailFragment.getCallbacks().onGraphSelectionChanged(graphSelection);
        instrumentDetailFragment.presentUserLeapSurveyForGraphSelection(graphSelection);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FrameLayout root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ViewsKt.setEducationTourScreenName(root, EducationTourScreenNames.STOCK_DETAIL_PAGE_SCREEN);
        Fragment parentFragment = getParentFragment();
        Intrinsics.checkNotNull(parentFragment, "null cannot be cast to non-null type com.robinhood.android.equitydetail.ui.InstrumentDetailListParentFragment");
        Boolean tradingTrendsDeeplink = ((InstrumentDetailListParentFragment) parentFragment).getTradingTrendsDeeplink();
        if (tradingTrendsDeeplink != null ? tradingTrendsDeeplink.booleanValue() : false) {
            InstrumentDetailDuxo duxo = getDuxo();
            TradingTrendsDetailsFragment.Companion companion = TradingTrendsDetailsFragment.INSTANCE;
            String string2 = getInstrument().getId().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            duxo.setSdpMode(new InstrumentDetailViewState.SdpMode.TradingTrendsDetails(companion.createFragment((FragmentKey) new TradingTrendsDetailsContract.Key(string2, null)), false));
        }
        checkParentSource();
        SdpLogger sdpLogger = getSdpLogger();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        InstrumentDetailAdapter instrumentDetailAdapter = new InstrumentDetailAdapter(this, sdpLogger, LifecycleOwner2.getLifecycleScope(viewLifecycleOwner), this);
        this.adapter = instrumentDetailAdapter;
        instrumentDetailAdapter.setOnGraphLayoutPreDrawCallback(new Function1() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailFragment$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentDetailFragment.onViewCreated$lambda$8(this.f$0, (View) obj);
            }
        });
        InstrumentDetailAdapter instrumentDetailAdapter2 = this.adapter;
        if (instrumentDetailAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            instrumentDetailAdapter2 = null;
        }
        instrumentDetailAdapter2.setOnRecurringHubClick(new C153722(this));
        RecyclerView recyclerView = getRecyclerView();
        recyclerView.setHasFixedSize(true);
        com.robinhood.utils.extensions.ViewsKt.setBottomPadding(recyclerView, getDefaultContentBottomPadding());
        final android.content.Context context = recyclerView.getContext();
        recyclerView.setLayoutManager(new AccurateLinearLayoutManager(context) { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailFragment$onViewCreated$3$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean supportsPredictiveItemAnimations() {
                return false;
            }
        });
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        recyclerView.setItemAnimator(defaultItemAnimator);
        InstrumentDetailAdapter instrumentDetailAdapter3 = this.adapter;
        if (instrumentDetailAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            instrumentDetailAdapter3 = null;
        }
        recyclerView.setAdapter(instrumentDetailAdapter3);
        LifecycleHost.DefaultImpls.bind$default(this, RxRecyclerView.scrollStateChanges(recyclerView), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailFragment$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentDetailFragment.onViewCreated$lambda$11$lambda$10(this.f$0, ((Integer) obj).intValue());
            }
        });
        Observable observableDistinctUntilChanged = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailFragment.onViewCreated.4
            @Override // io.reactivex.functions.Function
            public final InstrumentDetailViewState.SdpMode apply(InstrumentDetailViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getSdpMode();
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailFragment$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentDetailFragment.onViewCreated$lambda$12(this.f$0, (InstrumentDetailViewState.SdpMode) obj);
            }
        });
        Observable observableDistinctUntilChanged2 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailFragment.onViewCreated.6
            @Override // io.reactivex.functions.Function
            public final TradingTrendsChartSectionState3 apply(InstrumentDetailViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getTradingTrendsState();
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailFragment$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentDetailFragment.onViewCreated$lambda$13(this.f$0, (TradingTrendsChartSectionState3) obj);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C153758(null), 3, null);
        initializeAnalytics();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$8(InstrumentDetailFragment instrumentDetailFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (instrumentDetailFragment.getParentFragment() != null) {
            instrumentDetailFragment.getCallbacks().onGraphLayoutPreDraw(it);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: InstrumentDetailFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equitydetail.ui.InstrumentDetailFragment$onViewCreated$2 */
    /* synthetic */ class C153722 extends FunctionReferenceImpl implements Function1<String, Unit> {
        C153722(Object obj) {
            super(1, obj, InstrumentDetailFragment.class, "onRecurringHubClicked", "onRecurringHubClicked(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InstrumentDetailFragment) this.receiver).onRecurringHubClicked(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$11$lambda$10(InstrumentDetailFragment instrumentDetailFragment, int i) {
        if (1 == i) {
            instrumentDetailFragment.getNewsFeedAnalytics().logPageScroll();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$12(InstrumentDetailFragment instrumentDetailFragment, InstrumentDetailViewState.SdpMode sdpMode) {
        if (sdpMode instanceof InstrumentDetailViewState.SdpMode.Standard) {
            instrumentDetailFragment.getBinding().instrumentDetailRecyclerView.setVisibility(0);
            instrumentDetailFragment.getBinding().instrumentDetailFrameLayout.setVisibility(8);
        } else {
            if (!(sdpMode instanceof InstrumentDetailViewState.SdpMode.TradingTrendsDetails)) {
                throw new NoWhenBranchMatchedException();
            }
            instrumentDetailFragment.enableTradingTrendsSdpMode((InstrumentDetailViewState.SdpMode.TradingTrendsDetails) sdpMode);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$13(InstrumentDetailFragment instrumentDetailFragment, TradingTrendsChartSectionState3 tradingTrendsChartSectionState3) {
        if ((instrumentDetailFragment.smoothScrollTarget instanceof TradingTrendsViewData) && Intrinsics.areEqual(tradingTrendsChartSectionState3, TradingTrendsChartSectionState3.Disabled.INSTANCE)) {
            instrumentDetailFragment.showTradingTrendsNotFound();
            instrumentDetailFragment.smoothScrollTarget = null;
        }
        return Unit.INSTANCE;
    }

    /* compiled from: InstrumentDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.InstrumentDetailFragment$onViewCreated$8", m3645f = "InstrumentDetailFragment.kt", m3646l = {391}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitydetail.ui.InstrumentDetailFragment$onViewCreated$8 */
    static final class C153758 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C153758(Continuation<? super C153758> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InstrumentDetailFragment.this.new C153758(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C153758) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: InstrumentDetailFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equitydetail.ui.InstrumentDetailFragment$onViewCreated$8$1, reason: invalid class name */
        static final class AnonymousClass1<T> implements FlowCollector {
            final /* synthetic */ InstrumentDetailFragment this$0;

            AnonymousClass1(InstrumentDetailFragment instrumentDetailFragment) {
                this.this$0 = instrumentDetailFragment;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((List<? extends DetailData>) obj, (Continuation<? super Unit>) continuation);
            }

            public final Object emit(List<? extends DetailData> list, Continuation<? super Unit> continuation) {
                int i;
                int i2;
                int i3 = 0;
                if (this.this$0.smoothScrollTarget instanceof TradingTrendsViewData) {
                    Iterator<? extends DetailData> it = list.iterator();
                    int i4 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i2 = -1;
                            break;
                        }
                        if (it.next() instanceof TradingTrendsViewData) {
                            i2 = i4;
                            break;
                        }
                        i4++;
                    }
                    if (i2 != -1) {
                        final InstrumentDetailFragment instrumentDetailFragment = this.this$0;
                        InstrumentDetailFragment.smoothScrollToIndex$default(instrumentDetailFragment, i2, new Function0() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailFragment$onViewCreated$8$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(InstrumentDetailFragment.C153758.AnonymousClass1.emit$lambda$1(instrumentDetailFragment));
                            }
                        }, 0, 4, null);
                        this.this$0.smoothScrollTarget = null;
                    }
                }
                if (this.this$0.smoothScrollTarget instanceof CompanyFinancialsViewData) {
                    Iterator<? extends DetailData> it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            i = -1;
                            break;
                        }
                        if (it2.next() instanceof CompanyFinancialsViewData) {
                            i = i3;
                            break;
                        }
                        i3++;
                    }
                    if (i != -1) {
                        final InstrumentDetailFragment instrumentDetailFragment2 = this.this$0;
                        InstrumentDetailFragment.smoothScrollToIndex$default(instrumentDetailFragment2, i, new Function0() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailFragment$onViewCreated$8$1$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Integer.valueOf(InstrumentDetailFragment.C153758.AnonymousClass1.emit$lambda$3(instrumentDetailFragment2));
                            }
                        }, 0, 4, null);
                        this.this$0.smoothScrollTarget = null;
                    }
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final int emit$lambda$1(InstrumentDetailFragment instrumentDetailFragment) {
                InstrumentDetailAdapter instrumentDetailAdapter = instrumentDetailFragment.adapter;
                if (instrumentDetailAdapter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    instrumentDetailAdapter = null;
                }
                List<DetailData> currentList = instrumentDetailAdapter.getCurrentList();
                Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
                Iterator<DetailData> it = currentList.iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (it.next() instanceof TradingTrendsViewData) {
                        return i;
                    }
                    i++;
                }
                return -1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final int emit$lambda$3(InstrumentDetailFragment instrumentDetailFragment) {
                InstrumentDetailAdapter instrumentDetailAdapter = instrumentDetailFragment.adapter;
                if (instrumentDetailAdapter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    instrumentDetailAdapter = null;
                }
                List<DetailData> currentList = instrumentDetailAdapter.getCurrentList();
                Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
                Iterator<DetailData> it = currentList.iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (it.next() instanceof CompanyFinancialsViewData) {
                        return i;
                    }
                    i++;
                }
                return -1;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                InstrumentDetailAdapter instrumentDetailAdapter = InstrumentDetailFragment.this.adapter;
                if (instrumentDetailAdapter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    instrumentDetailAdapter = null;
                }
                Flow flowDebounce = FlowKt.debounce(instrumentDetailAdapter.getCurrentListFlow(), 100L);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(InstrumentDetailFragment.this);
                this.label = 1;
                if (flowDebounce.collect(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    private final void showTradingTrendsNotFound() {
        new TradingTrendsAlertFragment().show(getChildFragmentManager(), "trading_trends_alert");
    }

    private final void checkParentSource() {
        InstrumentDetailSource source = ((InstrumentDetailArgs) INSTANCE.getArgs((Fragment) this)).getSource();
        int i = source == null ? -1 : WhenMappings.$EnumSwitchMapping$0[source.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            this.smoothScrollTarget = new CompanyFinancialsViewData(getInstrument().getId(), CompanyFinancialsSectionViewState.Disabled.INSTANCE);
        } else {
            String string2 = getInstrument().getId().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            this.smoothScrollTarget = new TradingTrendsViewData(string2, TradingTrendsChartSectionState3.Disabled.INSTANCE);
        }
    }

    private final void enableTradingTrendsSdpMode(final InstrumentDetailViewState.SdpMode.TradingTrendsDetails mode) {
        getChildFragmentManager().beginTransaction().replace(getBinding().instrumentDetailFrameLayout.getId(), mode.getFragment()).commit();
        Fragment parentFragment = getParentFragment();
        Intrinsics.checkNotNull(parentFragment, "null cannot be cast to non-null type com.robinhood.android.equitydetail.ui.InstrumentDetailListParentFragment");
        ((InstrumentDetailListParentFragment) parentFragment).overrideOnBack(new Function0() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InstrumentDetailFragment.enableTradingTrendsSdpMode$lambda$14(this.f$0, mode);
            }
        }, mode.getViewPagerInputEnabled());
        getBinding().instrumentDetailRecyclerView.setVisibility(4);
        getBinding().instrumentDetailFrameLayout.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit enableTradingTrendsSdpMode$lambda$14(InstrumentDetailFragment instrumentDetailFragment, InstrumentDetailViewState.SdpMode.TradingTrendsDetails tradingTrendsDetails) {
        instrumentDetailFragment.getChildFragmentManager().beginTransaction().remove(tradingTrendsDetails.getFragment()).commit();
        instrumentDetailFragment.getDuxo().setSdpMode(InstrumentDetailViewState.SdpMode.Standard.INSTANCE);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        IacAlertSheetLocation iacAlertSheetLocation;
        Survey survey;
        super.onResume();
        if (getShowDropFromRecurringCreationSurvey().get()) {
            if (get_isCrypto()) {
                survey = Survey.RECURRING_INVESTMENTS_DROP_FROM_CREATION_CRYPTO;
            } else {
                survey = Survey.RECURRING_INVESTMENTS_DROP_FROM_CREATION_EQUITY;
            }
            getUserLeapManager().presentSurveyIfNecessary(this, survey);
            getShowDropFromRecurringCreationSurvey().set(false);
        } else {
            setupUserLeapSurvey(getInstrument());
        }
        Observable observableDistinctUntilChanged = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailFragment.onResume.1
            @Override // io.reactivex.functions.Function
            public final String apply(InstrumentDetailViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                String instrumentPrice = it.getInstrumentPrice();
                return instrumentPrice == null ? "" : instrumentPrice;
            }
        }).filter(new Predicate() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailFragment.onResume.2
            @Override // io.reactivex.functions.Predicate
            public final boolean test(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return !StringsKt.isBlank(it);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentDetailFragment.onResume$lambda$15(this.f$0, (String) obj);
            }
        });
        CrossSellLaunchManager crossSellLaunchManager = getCrossSellLaunchManager();
        Companion companion = INSTANCE;
        if (((InstrumentDetailArgs) companion.getArgs((Fragment) this)).getSource() == InstrumentDetailSource.BREAKING_NEWS) {
            iacAlertSheetLocation = IacAlertSheetLocation.INVESTING_STOCK_DETAIL_BREAKING_NEWS;
        } else {
            iacAlertSheetLocation = IacAlertSheetLocation.INVESTING_STOCK_DETAIL;
        }
        IacAlertSheetLocation iacAlertSheetLocation2 = iacAlertSheetLocation;
        UUID id = getInstrument().getId();
        InstrumentDetailSource source = ((InstrumentDetailArgs) companion.getArgs((Fragment) this)).getSource();
        CrossSellLaunchManager.initIacBottomSheetPolling$default(crossSellLaunchManager, this, iacAlertSheetLocation2, null, id, null, null, null, null, source != null ? source.getServerValue() : null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$15(InstrumentDetailFragment instrumentDetailFragment, String str) {
        RhToolbar rhToolbar = instrumentDetailFragment.getRhToolbar();
        if (rhToolbar != null) {
            rhToolbar.setTitle(instrumentDetailFragment.getInstrument().getSymbol());
        }
        RhToolbar rhToolbar2 = instrumentDetailFragment.getRhToolbar();
        if (rhToolbar2 != null) {
            rhToolbar2.setSubtitle(str);
        }
        return Unit.INSTANCE;
    }

    private final void setupUserLeapSurvey(Instrument instrument) {
        Survey survey;
        final Survey survey2;
        if (instrument.isEtp()) {
            survey = Survey.DETAILS_STOCK_ETF_THREE_SEC;
        } else {
            survey = Survey.DETAILS_STOCK_THREE_SEC;
        }
        if (instrument.isEtp()) {
            survey2 = Survey.DETAILS_STOCK_ETF_SCROLL_FIVE_SEC;
        } else {
            survey2 = Survey.DETAILS_STOCK_SCROLL_FIVE_SEC;
        }
        getUserLeapManager().presentSurveyIfNecessary(this, survey);
        RecyclerViews.addOneTimeScrollListener(getRecyclerView(), new Function0() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InstrumentDetailFragment.setupUserLeapSurvey$lambda$16(this.f$0, survey2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setupUserLeapSurvey$lambda$16(InstrumentDetailFragment instrumentDetailFragment, Survey survey) {
        instrumentDetailFragment.getUserLeapManager().presentSurveyIfNecessary(instrumentDetailFragment, survey);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        getLogOnceEventLogger().reset();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        if (Intrinsics.areEqual(ContextLifecycles.isResumed(fragmentActivityRequireActivity), Boolean.TRUE)) {
            getDuxo().incrementEducationTourEntryPointShownCount();
            this.educationTourEntryPointCounted = true;
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        InstrumentDetailAdapter instrumentDetailAdapter = null;
        getRecyclerView().setAdapter(null);
        if (!this.educationTourEntryPointCounted) {
            getDuxo().incrementEducationTourEntryPointShownCount();
        }
        hideEducationTourIfNeeded();
        super.onDestroyView();
        InstrumentDetailAdapter instrumentDetailAdapter2 = this.adapter;
        if (instrumentDetailAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            instrumentDetailAdapter = instrumentDetailAdapter2;
        }
        instrumentDetailAdapter.clear();
    }

    @Override // com.robinhood.android.equitydetail.ui.InstrumentDetailAdapter.InfoBannerCallbacks
    public void onBindInfoBanner(InfoBannerViewData data) {
        this.currentlyBoundInfoBannerReceiptUuidRelay.accept(Optional3.asOptional(data != null ? data.getReceiptUuid() : null));
        if (data != null) {
            LogOnceEventLogger logOnceEventLogger = getLogOnceEventLogger();
            String string2 = data.getReceiptUuid().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            LogOnceEventLogger.logAppear$default(logOnceEventLogger, string2, null, getEventScreen(), getProtobufComponentForInfoBanner(data), getProtobufContextForInfoBanner(data), 2, null);
        }
    }

    @Override // com.robinhood.android.equitydetail.ui.InstrumentDetailAdapter.InfoBannerCallbacks
    public void onClickInfoBanner(InfoBannerViewData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        InstrumentDetailDuxo duxo = getDuxo();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        duxo.tapInfoBanner(contextRequireContext, data.getReceiptUuid(), data.getCtaAction());
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), null, getEventScreen(), getProtobufComponentForInfoBanner(data), null, getProtobufContextForInfoBanner(data), false, 41, null);
    }

    @Override // com.robinhood.android.equitydetail.ui.InstrumentDetailAdapter.InfoBannerCallbacks
    public void onDismissInfoBanner(InfoBannerViewData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        getDuxo().dismissInfoBanner(data.getReceiptUuid());
    }

    @Override // com.robinhood.shared.iac.herocards.ui.IacHeroCardView.Callback
    public void onHeroCardDismissed(IacHeroCardProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        getDuxo().hideIacHeroCard();
    }

    @Override // com.robinhood.shared.iac.herocards.ui.IacHeroCardView.Callback
    public void onHeroCardClicked(IacHeroCardProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        getDuxo().hideIacHeroCard();
        Object extras = provider.getExtras();
        if (extras instanceof EducationTourEntryPointData) {
            EducationTourEntryPointData educationTourEntryPointData = (EducationTourEntryPointData) extras;
            BaseFragments3.showEducationTour$default(this, educationTourEntryPointData.getScreenName(), educationTourEntryPointData.getScreenUniqueId(), getCallbacks(), false, false, 24, null);
        } else if (provider.getCard().isPriceAlerts()) {
            onShowAdvancedAlertFragment();
        }
    }

    @Override // com.robinhood.android.equitydetail.ui.InstrumentDetailAdapter.Callbacks
    public void setSdpMode(InstrumentDetailViewState.SdpMode sdpMode) {
        Intrinsics.checkNotNullParameter(sdpMode, "sdpMode");
        getDuxo().setSdpMode(sdpMode);
    }

    @Override // com.robinhood.android.educationtour.interfaces.EducationTourCallbacks
    public void onShowEducationTour() {
        if (getParentFragment() != null) {
            this.isShowingEducationTour = true;
            getDuxo().onShowEducationTour();
            getCallbacks().onShowEducationTour();
        }
    }

    @Override // com.robinhood.android.educationtour.interfaces.EducationTourCallbacks
    public void onHideEducationTour() {
        if (getParentFragment() != null) {
            this.isShowingEducationTour = false;
            getDuxo().onHideEducationTour();
            getCallbacks().onHideEducationTour();
        }
    }

    @Override // com.robinhood.android.educationtour.EducationTourEntryPointCard.Callbacks
    public void onEducationTourEntryPointCardAppear(String trackingId) {
        Intrinsics.checkNotNullParameter(trackingId, "trackingId");
        getDuxo().setEducationTourEntryPointCardFirstShown(trackingId);
    }

    @Override // com.robinhood.android.educationtour.EducationTourEntryPointCard.Callbacks
    public void onEducationTourEntryPointCardHide(String trackingId) {
        Intrinsics.checkNotNullParameter(trackingId, "trackingId");
        getDuxo().setEducationTourEntryPointCardHidden(trackingId);
    }

    private final void hideEducationTourIfNeeded() {
        if (this.isShowingEducationTour) {
            onHideEducationTour();
        }
    }

    private final Component getProtobufComponentForInfoBanner(InfoBannerViewData data) {
        Component.ComponentType componentType = Component.ComponentType.INFO_BANNER;
        String loggingIdentifier = data.getLoggingIdentifier();
        if (loggingIdentifier == null) {
            loggingIdentifier = "";
        }
        return new Component(componentType, loggingIdentifier, null, 4, null);
    }

    private final Context getProtobufContextForInfoBanner(InfoBannerViewData data) {
        String string2 = data.getReceiptUuid().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new InAppComm(string2, null, data.getText().getText(), data.getLocation().getServerValue(), null, null, null, null, EnumC7081g.f2778x3356acf6, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -33554433, -1, -1, -1, -1, -1, 16383, null);
    }

    @Override // com.robinhood.android.equitydetail.ui.InstrumentDetailAdapter.EtpCompositionCallbacks
    public void onEtpItemClicked(EtpCompositionItemHolder item) {
        Intrinsics.checkNotNullParameter(item, "item");
        EtpCompositionItemBottomSheetFragment etpCompositionItemBottomSheetFragment = (EtpCompositionItemBottomSheetFragment) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.newInstance$default(EtpCompositionItemBottomSheetFragment.INSTANCE, new EtpCompositionItemBottomSheetFragment.Args(item), this, 0, 4, null);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        etpCompositionItemBottomSheetFragment.show(parentFragmentManager, ETP_ITEM_BOTTOM_SHEET_TAG);
    }

    @Override // com.robinhood.android.equitydetail.ui.etp.EtpCompositionItemBottomSheetFragment.Callbacks
    public void onEtpCompositionInstrumentSelected(UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        RecyclerView.LayoutManager layoutManager = getRecyclerView().getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        setLastSeenIndex(Integer.valueOf(((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition()));
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new LegacyFragmentKey.EquityInstrumentDetail(instrumentId, null, null, InstrumentDetailSource.ETP_COMPOSITION, false, 22, null), false, false, false, PerformanceMetricEventData.Source.SOURCE_STOCK_DETAIL, false, null, false, false, null, null, 4060, null);
    }

    @Override // com.robinhood.android.equitydetail.ui.etp.EtpCompositionItemBottomSheetFragment.DismissCallback
    public void onEtpCompositionBottomSheetDismissed() {
        EtpCompositionView etpCompositionView;
        InstrumentDetailAdapter instrumentDetailAdapter = this.adapter;
        if (instrumentDetailAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            instrumentDetailAdapter = null;
        }
        List<DetailData> currentList = instrumentDetailAdapter.getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        Iterator<DetailData> it = currentList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next() instanceof EtpCompositionViewData) {
                break;
            } else {
                i++;
            }
        }
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            RecyclerView.ViewHolder viewHolderFindViewHolderForLayoutPosition = getRecyclerView().findViewHolderForLayoutPosition(numValueOf.intValue());
            InstrumentDetailAdapter.IdvViewHolder idvViewHolder = viewHolderFindViewHolderForLayoutPosition instanceof InstrumentDetailAdapter.IdvViewHolder ? (InstrumentDetailAdapter.IdvViewHolder) viewHolderFindViewHolderForLayoutPosition : null;
            if (idvViewHolder == null || (etpCompositionView = (EtpCompositionView) idvViewHolder.getCastedItemView()) == null) {
                return;
            }
            etpCompositionView.onEtpCompositionBottomSheetDismissed();
        }
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
    /* renamed from: handle, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo15941handle(GenericAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof GenericAction.Deeplink) {
            Uri uri = Uri.parse(((GenericAction.Deeplink) action).getValue2().getUri());
            Navigator navigator = getNavigator();
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            return Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, uri, null, null, false, null, 60, null);
        }
        if (!(action instanceof GenericAction.InfoAlert)) {
            return false;
        }
        GenericAction.InfoAlert infoAlert = (GenericAction.InfoAlert) action;
        int i = WhenMappings.$EnumSwitchMapping$1[infoAlert.getValue2().getMobile_presentation_style().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return true;
            }
            throw new NoWhenBranchMatchedException();
        }
        SduiAlert sduiAlert = SduiAlert.INSTANCE;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        setSheetListener(sduiAlert.sheetListener(childFragmentManager, getMarkwon(), infoAlert.getValue2().getAlert(), this.bottomSheetActionHandler, (Function0<Unit>) new Function0() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailFragment$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        }, (Function1<? super String, Unit>) ((2016 & 32) != 0 ? new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return SduiAlert.sheetListener$lambda$16((String) obj2);
            }
        } : null), (Function1<? super String, Unit>) ((2016 & 64) != 0 ? new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return SduiAlert.sheetListener$lambda$17((String) obj2);
            }
        } : null), (2016 & 128) != 0 ? false : false, (2016 & 256) != 0 ? false : false, (2016 & 512) != 0, (2016 & 1024) != 0 ? null : null));
        return true;
    }

    @Override // com.robinhood.android.equitydetail.ui.chart.InstrumentChartView.Callbacks
    public void onSpanChanged(String span) {
        Intrinsics.checkNotNullParameter(span, "span");
        getDuxo().onDisplaySpanChanged(span);
        DisplaySpan displaySpanFromServerValue = DisplaySpan.INSTANCE.fromServerValue(span);
        if (displaySpanFromServerValue == null) {
            displaySpanFromServerValue = DisplaySpan.UNKNOWN;
        }
        presentUserLeapSurveyForDisplaySpan(displaySpanFromServerValue);
        getCallbacks().onGraphSelectionChanged(GraphSelection2.getEquityGraphSelection(displaySpanFromServerValue));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRecurringHubClicked(String accountNumber) {
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new RecurringHubFragmentKey(accountNumber), false, false, false, null, false, null, false, false, null, null, 4092, null);
    }

    @Override // com.robinhood.android.equitydetail.ui.InstrumentDetailAdapter.HistoryCallbacks
    public void onHistoryShowMoreClicked(Account selectedAccount) {
        Intrinsics.checkNotNullParameter(selectedAccount, "selectedAccount");
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new AccountsHistoryContract.Key(AccountsHistoryAccountTypeFilter2.toAccountsHistoryAccountTypeFilter(selectedAccount), AccountsHistoryTransactionTypeFilter.ALL, new AccountsHistoryContract.InstrumentFilter(getInstrument().getId(), AccountsHistoryContract.InstrumentFilterType.EQUITY), null, false, null, 56, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
    }

    private final void onShowLevel2() {
        Observable<R> map = getDuxo().getStates().take(1L).map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailFragment.onShowLevel2.1
            @Override // io.reactivex.functions.Function
            public final Tuples3<MarginSubscription, String, Boolean> apply(InstrumentDetailViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                MarginSubscription marginSubscription = it.getMarginSubscription();
                Account account = it.getAccount();
                return new Tuples3<>(marginSubscription, account != null ? account.getAccountNumber() : null, Boolean.valueOf(it.getInGoldUngatingL2DataExperiment()));
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(map), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailFragment$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentDetailFragment.onShowLevel2$lambda$19(this.f$0, (Tuples3) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onShowLevel2$lambda$19(InstrumentDetailFragment instrumentDetailFragment, Tuples3 tuples3) {
        MarginSubscription marginSubscription = (MarginSubscription) tuples3.component1();
        String str = (String) tuples3.component2();
        boolean zBooleanValue = ((Boolean) tuples3.component3()).booleanValue();
        if ((marginSubscription != null && marginSubscription.is24Karat()) || zBooleanValue) {
            Navigator navigator = instrumentDetailFragment.getNavigator();
            android.content.Context contextRequireContext = instrumentDetailFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new Level2MarketDataFragmentKey(instrumentDetailFragment.getInstrument().getId(), str), false, false, false, null, false, null, false, false, null, null, 4092, null);
        } else {
            Navigator navigator2 = instrumentDetailFragment.getNavigator();
            android.content.Context contextRequireContext2 = instrumentDetailFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator2, contextRequireContext2, new GoldUpgradeIntentKey("stock_detail_l2_button", GoldFeature.LEVEL2, null, null, null, false, 60, null), null, false, null, null, 60, null);
        }
        return Unit.INSTANCE;
    }

    private final void onShowAdvancedAlertFragment() {
        if (isRemoving() || isDetached() || !isAdded() || getChildFragmentManager().isDestroyed()) {
            return;
        }
        Observable<InstrumentDetailViewState> observableTake = getDuxo().getStates().take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        Observable observableDistinctUntilChanged = ObservablesAndroid.observeOnMainThread(observableTake).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentDetailFragment.onShowAdvancedAlertFragment$lambda$20(this.f$0, (InstrumentDetailViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onShowAdvancedAlertFragment$lambda$20(InstrumentDetailFragment instrumentDetailFragment, InstrumentDetailViewState instrumentDetailViewState) {
        GraphSelection equityGraphSelection;
        Navigator navigator = instrumentDetailFragment.getNavigator();
        android.content.Context contextRequireContext = instrumentDetailFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Either.Left leftAsLeft = Either2.asLeft(instrumentDetailFragment.getInstrument());
        DisplaySpan currentDisplaySpan = instrumentDetailViewState.getCurrentDisplaySpan();
        instrumentDetailFragment.startActivity(Navigator.DefaultImpls.createIntentForFragment$default(navigator, contextRequireContext, new AdvancedAlert(leftAsLeft, true, (currentDisplaySpan == null || (equityGraphSelection = GraphSelection2.getEquityGraphSelection(currentDisplaySpan)) == null) ? null : equityGraphSelection.getInterval(), AdvancedAlertEntryPoint.SDP_HERO_CARD), false, false, false, null, false, false, false, false, false, null, false, 8180, null));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.equitydetail.ui.statistics.InstrumentStatisticsView.Callbacks
    public void onBidAskClicked() {
        getSdpLogger().logEvent(new SdpEvent.Tap(Component.ComponentType.STATS_SECTION, null, null, 6, null));
        onShowLevel2();
    }

    @Override // com.robinhood.android.equitydetail.p123ui.analystoverview.AnalystOverviewComposable
    public void handleFullReportTap(UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        getSdpLogger().logEvent(new SdpEvent.Tap(Component.ComponentType.RESEARCH_REPORT_SECTION, null, null, 6, null));
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new LegacyFragmentKey.AnalystReport(instrumentId), false, false, false, null, false, null, false, false, null, null, 4092, null);
    }

    @Override // com.robinhood.android.equitydetail.ui.chart.InstrumentChartView.Callbacks, com.robinhood.android.equitydetail.ui.chartsettings.ChartSettingsBottomSheetFragment.Callbacks
    public void launchChartEducationTour(String tourName, final Function0<Unit> onFinish) {
        Intrinsics.checkNotNullParameter(tourName, "tourName");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        FrameLayout root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ViewsKt.setEducationTourScreenName(root, tourName);
        BaseFragments3.showEducationTour$default(this, tourName, null, new Callbacks() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailFragment.launchChartEducationTour.1
            private final /* synthetic */ Callbacks $$delegate_0;

            @Override // com.robinhood.android.equitydetail.ui.InstrumentDetailFragment.Callbacks
            public void onGraphLayoutPreDraw(View view) {
                Intrinsics.checkNotNullParameter(view, "view");
                this.$$delegate_0.onGraphLayoutPreDraw(view);
            }

            @Override // com.robinhood.android.equitydetail.ui.InstrumentDetailFragment.Callbacks
            public void onGraphSelectionChanged(GraphSelection newGraphSelection) {
                Intrinsics.checkNotNullParameter(newGraphSelection, "newGraphSelection");
                this.$$delegate_0.onGraphSelectionChanged(newGraphSelection);
            }

            @Override // com.robinhood.android.educationtour.interfaces.EducationTourCallbacks
            public void onShowEducationTour() {
                this.$$delegate_0.onShowEducationTour();
            }

            {
                this.$$delegate_0 = InstrumentDetailFragment.this.getCallbacks();
            }

            @Override // com.robinhood.android.educationtour.interfaces.EducationTourCallbacks
            public void onHideEducationTour() {
                InstrumentDetailFragment.this.getCallbacks().onHideEducationTour();
                Fragment parentFragment = InstrumentDetailFragment.this.getParentFragment();
                if (parentFragment != null) {
                    BaseFragments3.hideEducationTour(parentFragment);
                }
                onFinish.invoke();
            }
        }, false, false, 24, null);
    }

    @Override // com.robinhood.android.tradingtrends.ui.chartSection.TradingTrendsChartSectionView.Callback
    public void onTradingTrendsTypeSelected(String tradingTrendsType) {
        Intrinsics.checkNotNullParameter(tradingTrendsType, "tradingTrendsType");
        getTradingTrendsSectionDuxo().onSegmentSelected(tradingTrendsType);
    }

    @Override // com.robinhood.android.tradingtrends.ui.chartSection.TradingTrendsChartSectionView.Callback
    public void expandTradingTrendsDetails(boolean viewPagerInputEnabled, Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        setSdpMode(new InstrumentDetailViewState.SdpMode.TradingTrendsDetails(fragment, viewPagerInputEnabled));
    }

    @Override // com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsSectionView.Callback
    public void onTimePeriodSelected(String timePeriodType) {
        Intrinsics.checkNotNullParameter(timePeriodType, "timePeriodType");
        getCompanyFinancialsSectionDuxo().onTimePeriodSelected(timePeriodType);
    }

    @Override // com.robinhood.android.equities.companyfinancials.ui.CompanyFinancialsSectionView.Callback
    public void onScrubIndexChanged(UUID instrumentId, Integer index) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        getCompanyFinancialsSectionDuxo().onScrubIndexChanged(instrumentId, index);
    }

    private final void presentUserLeapSurveyForGraphSelection(GraphSelection graphSelection) {
        Survey survey;
        int i = WhenMappings.$EnumSwitchMapping$2[graphSelection.ordinal()];
        if (i != 1) {
            if (i != 2) {
                survey = null;
            } else if (getInstrument().isEtp()) {
                survey = Survey.GRAPH_LAYOUT_TIMESPAN_CHANGE_FIVE_YEARS_ETF;
            } else {
                survey = Survey.GRAPH_LAYOUT_TIMESPAN_CHANGE_FIVE_YEARS_STOCK;
            }
        } else if (getInstrument().isEtp()) {
            survey = Survey.GRAPH_LAYOUT_TIMESPAN_CHANGE_ONE_YEAR_ETF;
        } else {
            survey = Survey.GRAPH_LAYOUT_TIMESPAN_CHANGE_ONE_YEAR_STOCK;
        }
        if (survey != null) {
            getUserLeapManager().presentSurveyIfNecessary(this, survey);
        }
    }

    private final void presentUserLeapSurveyForDisplaySpan(DisplaySpan displaySpan) {
        Survey survey;
        int i = WhenMappings.$EnumSwitchMapping$3[displaySpan.ordinal()];
        if (i != 1) {
            if (i != 2) {
                survey = null;
            } else if (getInstrument().isEtp()) {
                survey = Survey.GRAPH_LAYOUT_TIMESPAN_CHANGE_FIVE_YEARS_ETF;
            } else {
                survey = Survey.GRAPH_LAYOUT_TIMESPAN_CHANGE_FIVE_YEARS_STOCK;
            }
        } else if (getInstrument().isEtp()) {
            survey = Survey.GRAPH_LAYOUT_TIMESPAN_CHANGE_ONE_YEAR_ETF;
        } else {
            survey = Survey.GRAPH_LAYOUT_TIMESPAN_CHANGE_ONE_YEAR_STOCK;
        }
        if (survey != null) {
            getUserLeapManager().presentSurveyIfNecessary(this, survey);
        }
    }

    private final void presentUserLeapSurveyFor24HourMarket() {
        getUserLeapManager().presentSurveyIfNecessary(this, Survey.TWENTY_FOUR_HOUR_MARKET_POST_LAUNCH);
    }

    public final void scrollToAnalystReport() {
        InstrumentDetailAdapter instrumentDetailAdapter = this.adapter;
        if (instrumentDetailAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            instrumentDetailAdapter = null;
        }
        List<DetailData> currentList = instrumentDetailAdapter.getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        Iterator<DetailData> it = currentList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next() instanceof AnalystReportViewData) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            getRecyclerView().smoothScrollToPosition(i);
        }
    }

    static /* synthetic */ void smoothScrollToIndex$default(InstrumentDetailFragment instrumentDetailFragment, int i, Function0 function0, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 3;
        }
        instrumentDetailFragment.smoothScrollToIndex(i, function0, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void smoothScrollToIndex(int index, final Function0<Integer> getNewIndex, final int retriesLeft) {
        if (index >= 0) {
            final android.content.Context context = getRecyclerView().getContext();
            LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(context) { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailFragment$smoothScrollToIndex$linearSmoothScroller$1
                @Override // androidx.recyclerview.widget.LinearSmoothScroller
                protected float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                    return 0.05f;
                }

                @Override // androidx.recyclerview.widget.LinearSmoothScroller
                protected int getVerticalSnapPreference() {
                    return -1;
                }
            };
            linearSmoothScroller.setTargetPosition(index);
            RecyclerView.LayoutManager layoutManager = getRecyclerView().getLayoutManager();
            Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            final LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            getRecyclerView().addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailFragment$smoothScrollToIndex$listener$1
                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(RecyclerView rv, int newState) {
                    int i;
                    Intrinsics.checkNotNullParameter(rv, "rv");
                    if (newState == 0) {
                        rv.removeOnScrollListener(this);
                        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                        int iIntValue = getNewIndex.invoke().intValue();
                        if (iFindFirstVisibleItemPosition == iIntValue || (i = retriesLeft) <= 0) {
                            return;
                        }
                        this.smoothScrollToIndex(iIntValue, getNewIndex, i - 1);
                    }
                }
            });
            linearLayoutManager.startSmoothScroll(linearSmoothScroller);
        }
    }

    public final Disposable attachToolbarScrollAnimator(final ToolbarScrollAnimator toolbarScrollAnimator) {
        Intrinsics.checkNotNullParameter(toolbarScrollAnimator, "toolbarScrollAnimator");
        final RecyclerView recyclerView = getRecyclerView();
        OneShotPreDrawListener.add(recyclerView, new Runnable() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailFragment$attachToolbarScrollAnimator$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                toolbarScrollAnimator.dispatchScroll(this.getRecyclerView());
            }
        });
        return toolbarScrollAnimator.subscribe(getRecyclerView(), this, LifecycleEvent.ON_DESTROY_VIEW);
    }

    private final void initializeAnalytics() {
        getSdpLogger().setInstrumentId(getInstrument().getId());
        getSdpLogger().setSource(((InstrumentDetailArgs) INSTANCE.getArgs((Fragment) this)).getSource());
        getLifecycle().addObserver(getSdpLogger());
    }

    @Override // com.robinhood.android.equitydetail.ui.options.InstrumentDetailOptionLevel3EntryPointCardView.Callback
    public void onCardSeen() {
        getDuxo().onOptionLevel3EntryPointCardSeen();
    }

    /* compiled from: InstrumentDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/InstrumentDetailFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/equitydetail/ui/InstrumentDetailFragment;", "Lcom/robinhood/android/equitydetail/ui/InstrumentDetailFragment$InstrumentDetailArgs;", "<init>", "()V", "ETP_ITEM_BOTTOM_SHEET_TAG", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<InstrumentDetailFragment, InstrumentDetailArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public InstrumentDetailArgs getArgs(InstrumentDetailFragment instrumentDetailFragment) {
            return (InstrumentDetailArgs) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, instrumentDetailFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public InstrumentDetailFragment newInstance(InstrumentDetailArgs instrumentDetailArgs) {
            return (InstrumentDetailFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, instrumentDetailArgs);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(InstrumentDetailFragment instrumentDetailFragment, InstrumentDetailArgs instrumentDetailArgs) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, instrumentDetailFragment, instrumentDetailArgs);
        }
    }

    /* compiled from: InstrumentDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/InstrumentDetailFragment$InstrumentDetailArgs;", "Landroid/os/Parcelable;", "instrument", "Lcom/robinhood/models/db/Instrument;", "source", "Lcom/robinhood/android/navigation/app/keys/data/InstrumentDetailSource;", "<init>", "(Lcom/robinhood/models/db/Instrument;Lcom/robinhood/android/navigation/app/keys/data/InstrumentDetailSource;)V", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "getSource", "()Lcom/robinhood/android/navigation/app/keys/data/InstrumentDetailSource;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InstrumentDetailArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<InstrumentDetailArgs> CREATOR = new Creator();
        private final Instrument instrument;
        private final InstrumentDetailSource source;

        /* compiled from: InstrumentDetailFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<InstrumentDetailArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InstrumentDetailArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InstrumentDetailArgs((Instrument) parcel.readParcelable(InstrumentDetailArgs.class.getClassLoader()), (InstrumentDetailSource) parcel.readParcelable(InstrumentDetailArgs.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InstrumentDetailArgs[] newArray(int i) {
                return new InstrumentDetailArgs[i];
            }
        }

        public static /* synthetic */ InstrumentDetailArgs copy$default(InstrumentDetailArgs instrumentDetailArgs, Instrument instrument, InstrumentDetailSource instrumentDetailSource, int i, Object obj) {
            if ((i & 1) != 0) {
                instrument = instrumentDetailArgs.instrument;
            }
            if ((i & 2) != 0) {
                instrumentDetailSource = instrumentDetailArgs.source;
            }
            return instrumentDetailArgs.copy(instrument, instrumentDetailSource);
        }

        /* renamed from: component1, reason: from getter */
        public final Instrument getInstrument() {
            return this.instrument;
        }

        /* renamed from: component2, reason: from getter */
        public final InstrumentDetailSource getSource() {
            return this.source;
        }

        public final InstrumentDetailArgs copy(Instrument instrument, InstrumentDetailSource source) {
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            return new InstrumentDetailArgs(instrument, source);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InstrumentDetailArgs)) {
                return false;
            }
            InstrumentDetailArgs instrumentDetailArgs = (InstrumentDetailArgs) other;
            return Intrinsics.areEqual(this.instrument, instrumentDetailArgs.instrument) && this.source == instrumentDetailArgs.source;
        }

        public int hashCode() {
            int iHashCode = this.instrument.hashCode() * 31;
            InstrumentDetailSource instrumentDetailSource = this.source;
            return iHashCode + (instrumentDetailSource == null ? 0 : instrumentDetailSource.hashCode());
        }

        public String toString() {
            return "InstrumentDetailArgs(instrument=" + this.instrument + ", source=" + this.source + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.instrument, flags);
            dest.writeParcelable(this.source, flags);
        }

        public InstrumentDetailArgs(Instrument instrument, InstrumentDetailSource instrumentDetailSource) {
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            this.instrument = instrument;
            this.source = instrumentDetailSource;
        }

        public final Instrument getInstrument() {
            return this.instrument;
        }

        public final InstrumentDetailSource getSource() {
            return this.source;
        }
    }
}
