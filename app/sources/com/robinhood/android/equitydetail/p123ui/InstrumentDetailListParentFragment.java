package com.robinhood.android.equitydetail.p123ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.jakewharton.rxbinding3.viewpager2.RxViewPager2;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.jakewharton.rxrelay2.PublishRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.analytics.LogOnceEventLogger;
import com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartBackgroundCacheKillSwitch;
import com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartExperiment;
import com.robinhood.android.chart.blackwidowadvancedchart.BwWebViewManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.equitydetail.InstrumentDetailListParentCallbacks;
import com.robinhood.android.common.equitydetail.InstrumentType;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.perf.OneTimeUsePerfTrace;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.extensions.Breadcrumbs2;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.common.util.transition.ToolbarScrollAnimator;
import com.robinhood.android.designsystem.style.DirectionOverlay;
import com.robinhood.android.education.contracts.AdvancedAlert;
import com.robinhood.android.educationtour.C14469R;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.databinding.FragmentInstrumentDetailListBinding;
import com.robinhood.android.equitydetail.p123ui.InstrumentDetailFragment;
import com.robinhood.android.equitydetail.p123ui.InstrumentDetailListParentFragment;
import com.robinhood.android.equitydetail.p123ui.etp.EtpCompositionViewState4;
import com.robinhood.android.equitydetail.p123ui.fractional.FractionalNuxBottomSheetFragment;
import com.robinhood.android.equitydetail.p123ui.tradebar.AnalyticsData;
import com.robinhood.android.equitydetail.p123ui.tradebar.InstrumentDetailTradeBarFragment;
import com.robinhood.android.home.contracts.WatchListIntentKey;
import com.robinhood.android.home.contracts.WatchListIntentKey2;
import com.robinhood.android.lib.breadcrumbs.SupportBreadcrumbTracker;
import com.robinhood.android.lib.breadcrumbs.SupportBreadcrumbType;
import com.robinhood.android.lib.trade.C20649R;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.android.pictureinpicture.pip.contracts.PictureInPictureKey;
import com.robinhood.android.store.options.combo.ComboOrderStore;
import com.robinhood.android.trading.contracts.EquityOrderActivityIntentKey;
import com.robinhood.android.trading.contracts.EquityOrderFlowSource;
import com.robinhood.android.tradingtrends.p264ui.details.TradingTrendsDetailsLogging;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.AggregateOptionPositionStore;
import com.robinhood.librobinhood.data.store.BalancesStore;
import com.robinhood.librobinhood.data.store.DividendStore;
import com.robinhood.librobinhood.data.store.EquityDetailNuxStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.OptionOrderStore;
import com.robinhood.librobinhood.data.store.OptionPositionStore;
import com.robinhood.librobinhood.data.store.OrderStore;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.librobinhood.data.store.QuickTradeAmountsStore;
import com.robinhood.librobinhood.data.store.alert.AdvancedAlertEntryPoint;
import com.robinhood.librobinhood.data.store.bonfire.StockDetailStore;
import com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentAccountSwitcherStore;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p355ui.GraphSelection;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.data.store.iac.IacInfoBannerStore;
import com.robinhood.shared.lists.quickadd.CuratedListQuickAddFragment;
import com.robinhood.shared.pictureinpicture.pipsupport.PictureInPictureStore;
import com.robinhood.shared.store.lists.store.ListItemIdToUserListIdsStore;
import com.robinhood.store.base.InvestmentScheduleEventStore;
import com.robinhood.utils.Either;
import com.robinhood.utils.Either2;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.Bundles;
import com.robinhood.utils.extensions.FragmentManagers;
import com.robinhood.utils.extensions.FragmentManagers2;
import com.robinhood.utils.extensions.Lists4;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.SinglesAndroid;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.Observables;
import io.reactivex.rxkotlin.disposable;
import io.reactivex.subjects.BehaviorSubject;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: InstrumentDetailListParentFragment.kt */
@Metadata(m3635d1 = {"\u0000¸\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 À\u00022\u00020\u00012\u00020\u00022\u00020\u0003:\u0002À\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0086\u0002\u001a\u00030å\u00012\b\u0010\u0087\u0002\u001a\u00030\u0088\u0002H\u0016J\u0016\u0010\u0089\u0002\u001a\u00030å\u00012\n\u0010\u008a\u0002\u001a\u0005\u0018\u00010\u008b\u0002H\u0016J \u0010\u008c\u0002\u001a\u00030å\u00012\b\u0010\u008d\u0002\u001a\u00030\u008e\u00022\n\u0010\u008a\u0002\u001a\u0005\u0018\u00010\u008b\u0002H\u0016J\n\u0010\u008f\u0002\u001a\u00030å\u0001H\u0016J\n\u0010\u0090\u0002\u001a\u00030å\u0001H\u0016J\u0014\u0010\u0091\u0002\u001a\u00030å\u00012\b\u0010\u0092\u0002\u001a\u00030\u0093\u0002H\u0002J$\u0010\u0098\u0002\u001a\u00030å\u00012\u000f\u0010\u0099\u0002\u001a\n\u0012\u0005\u0012\u00030å\u00010\u0085\u00022\t\b\u0002\u0010\u009a\u0002\u001a\u00020\u0007J\f\u0010\u009b\u0002\u001a\u0005\u0018\u00010\u0093\u0002H\u0016J\n\u0010\u009c\u0002\u001a\u00030å\u0001H\u0016J\n\u0010\u009d\u0002\u001a\u00030å\u0001H\u0016J\u0014\u0010\u009e\u0002\u001a\u00030å\u00012\b\u0010\u009f\u0002\u001a\u00030 \u0002H\u0016J\t\u0010¡\u0002\u001a\u00020\u0007H\u0016J\u001e\u0010¢\u0002\u001a\u00030å\u00012\b\u0010£\u0002\u001a\u00030¤\u00022\b\u0010¥\u0002\u001a\u00030¦\u0002H\u0014J\u0013\u0010§\u0002\u001a\u00020\u00072\b\u0010¨\u0002\u001a\u00030Ø\u0001H\u0016J0\u0010©\u0002\u001a\u00030å\u00012\b\u0010ª\u0002\u001a\u00030«\u00022\f\b\u0002\u0010¾\u0001\u001a\u0005\u0018\u00010«\u00012\f\b\u0002\u0010·\u0001\u001a\u0005\u0018\u00010³\u0001H\u0002J*\u0010¬\u0002\u001a\u00030å\u00012\b\u0010¾\u0001\u001a\u00030«\u00012\b\u0010ª\u0002\u001a\u00030«\u00022\n\u0010·\u0001\u001a\u0005\u0018\u00010³\u0001H\u0016J\u0014\u0010\u00ad\u0002\u001a\u00030å\u00012\b\u0010\u008d\u0002\u001a\u00030\u008e\u0002H\u0016J\u0014\u0010®\u0002\u001a\u00030å\u00012\b\u0010¯\u0002\u001a\u00030É\u0001H\u0016J\n\u0010°\u0002\u001a\u00030å\u0001H\u0016J\n\u0010±\u0002\u001a\u00030å\u0001H\u0016J\n\u0010²\u0002\u001a\u00030å\u0001H\u0016J\u0014\u0010³\u0002\u001a\u00030å\u00012\b\u0010´\u0002\u001a\u00030\u008b\u0002H\u0016J%\u0010µ\u0002\u001a\u00030å\u00012\u000f\u0010¶\u0002\u001a\n\u0012\u0005\u0012\u00030¦\u00010¥\u00012\b\u0010¾\u0001\u001a\u00030«\u0001H\u0002J\f\u0010·\u0002\u001a\u0005\u0018\u00010\u0093\u0002H\u0002J\n\u0010¸\u0002\u001a\u00030å\u0001H\u0002J\n\u0010¹\u0002\u001a\u00030å\u0001H\u0002J\n\u0010º\u0002\u001a\u00030å\u0001H\u0002J\n\u0010»\u0002\u001a\u00030å\u0001H\u0002J\n\u0010¼\u0002\u001a\u00030å\u0001H\u0002J\u0014\u0010½\u0002\u001a\u00030å\u00012\b\u0010¾\u0002\u001a\u00030Ä\u0001H\u0002J\n\u0010¿\u0002\u001a\u00030å\u0001H\u0002R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010'\u001a\u00020(8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001e\u0010-\u001a\u00020.8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001e\u00103\u001a\u0002048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001e\u00109\u001a\u00020:8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001e\u0010?\u001a\u00020@8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001e\u0010E\u001a\u00020F8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001e\u0010K\u001a\u00020L8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001e\u0010Q\u001a\u00020R8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u001e\u0010W\u001a\u00020X8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u001e\u0010]\u001a\u00020^8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u001e\u0010c\u001a\u00020d8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u001e\u0010i\u001a\u00020j8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\u001e\u0010o\u001a\u00020p8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\u001e\u0010u\u001a\u00020v8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\u001f\u0010{\u001a\u00020|8\u0006@\u0006X\u0087.¢\u0006\u000f\n\u0000\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R$\u0010\u0081\u0001\u001a\u00030\u0082\u00018\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0000\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R$\u0010\u0087\u0001\u001a\u00030\u0088\u00018\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0000\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R$\u0010\u008d\u0001\u001a\u00030\u008e\u00018\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0000\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R$\u0010\u0093\u0001\u001a\u00030\u0094\u00018\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0000\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R!\u0010\u0099\u0001\u001a\u00030\u009a\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R#\u0010\u009f\u0001\u001a\u0005\u0018\u00010 \u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b£\u0001\u0010\u009e\u0001\u001a\u0006\b¡\u0001\u0010¢\u0001R(\u0010¤\u0001\u001a\n\u0012\u0005\u0012\u00030¦\u00010¥\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b©\u0001\u0010\u009e\u0001\u001a\u0006\b§\u0001\u0010¨\u0001R(\u0010ª\u0001\u001a\n\u0012\u0005\u0012\u00030«\u00010¥\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u00ad\u0001\u0010\u009e\u0001\u001a\u0006\b¬\u0001\u0010¨\u0001R#\u0010®\u0001\u001a\u0005\u0018\u00010«\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b±\u0001\u0010\u009e\u0001\u001a\u0006\b¯\u0001\u0010°\u0001R#\u0010²\u0001\u001a\u0005\u0018\u00010³\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¶\u0001\u0010\u009e\u0001\u001a\u0006\b´\u0001\u0010µ\u0001R#\u0010·\u0001\u001a\u0005\u0018\u00010³\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¹\u0001\u0010\u009e\u0001\u001a\u0006\b¸\u0001\u0010µ\u0001R\"\u0010º\u0001\u001a\u0004\u0018\u00010\u00078FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b½\u0001\u0010\u009e\u0001\u001a\u0006\b»\u0001\u0010¼\u0001R\u0012\u0010¾\u0001\u001a\u0005\u0018\u00010«\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010¿\u0001\u001a\u0005\u0018\u00010³\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010À\u0001\u001a\u00030Á\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010Â\u0001\u001a\n\u0012\u0005\u0012\u00030Ä\u00010Ã\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000f\u0010Å\u0001\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010Æ\u0001\u001a\u00030Ç\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010È\u0001\u001a\u0005\u0018\u00010É\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010Ë\u0001\u001a\u0005\u0018\u00010¦\u00012\n\u0010Ê\u0001\u001a\u0005\u0018\u00010¦\u0001@BX\u0082\u000e¢\u0006\n\n\u0000\"\u0006\bÌ\u0001\u0010Í\u0001R\u0017\u0010Î\u0001\u001a\n\u0012\u0005\u0012\u00030¦\u00010Ï\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010Ð\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030¦\u00010¥\u00010Ï\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010Ñ\u0001\u001a\u0005\u0018\u00010Ò\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010Ó\u0001\u001a\u0005\u0018\u00010Ô\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÕ\u0001\u0010Ö\u0001R\u0010\u0010×\u0001\u001a\u00030Ø\u0001X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010Ù\u0001\u001a\u00030Ø\u0001X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010Ú\u0001\u001a\u00030Ø\u0001X\u0082.¢\u0006\u0002\n\u0000R\u000f\u0010Û\u0001\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R!\u0010Ü\u0001\u001a\u00030Ý\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bà\u0001\u0010á\u0001\u001a\u0006\bÞ\u0001\u0010ß\u0001R\u0010\u0010â\u0001\u001a\u00030ã\u0001X\u0082.¢\u0006\u0002\n\u0000R\u0017\u0010ä\u0001\u001a\n\u0012\u0005\u0012\u00030å\u00010Ï\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010æ\u0001\u001a\n\u0012\u0005\u0012\u00030å\u00010ç\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010è\u0001\u001a\u00030Ç\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010é\u0001\u001a\u00030Ä\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010ê\u0001\u001a\u0005\u0018\u00010«\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R!\u0010ë\u0001\u001a\u00030ì\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bï\u0001\u0010\u009e\u0001\u001a\u0006\bí\u0001\u0010î\u0001R\u0017\u0010ð\u0001\u001a\n\u0012\u0005\u0012\u00030«\u00010ñ\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010ó\u0001\u001a\u00020\u00072\u0007\u0010ò\u0001\u001a\u00020\u00078B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0006\b÷\u0001\u0010ø\u0001\u001a\u0005\bô\u0001\u0010\b\"\u0006\bõ\u0001\u0010ö\u0001R2\u0010ù\u0001\u001a\u00020\u00072\u0007\u0010ò\u0001\u001a\u00020\u00078B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0006\bü\u0001\u0010ø\u0001\u001a\u0005\bú\u0001\u0010\b\"\u0006\bû\u0001\u0010ö\u0001R\u000f\u0010ý\u0001\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010þ\u0001\u001a\u00020\u0007X\u0096D¢\u0006\t\n\u0000\u001a\u0005\bÿ\u0001\u0010\bR\u0016\u0010\u0080\u0002\u001a\u00020\u0007X\u0096D¢\u0006\t\n\u0000\u001a\u0005\b\u0081\u0002\u0010\bR\u0016\u0010\u0082\u0002\u001a\u00020\u0007X\u0096D¢\u0006\t\n\u0000\u001a\u0005\b\u0083\u0002\u0010\bR\u0019\u0010\u0084\u0002\u001a\f\u0012\u0005\u0012\u00030å\u0001\u0018\u00010\u0085\u0002X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0094\u0002\u001a\u00030³\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0095\u0002\u0010µ\u0001R\u001a\u0010\u0096\u0002\u001a\u0005\u0018\u00010³\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0097\u0002\u0010µ\u0001¨\u0006Á\u0002"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/InstrumentDetailListParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarFragment$Callbacks;", "Lcom/robinhood/android/equitydetail/ui/InstrumentDetailFragment$Callbacks;", "<init>", "()V", "isParentScreen", "", "()Z", "aggregateOptionPositionStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "getAggregateOptionPositionStore", "()Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "setAggregateOptionPositionStore", "(Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;)V", "listItemIdToUserListIdsStore", "Lcom/robinhood/shared/store/lists/store/ListItemIdToUserListIdsStore;", "getListItemIdToUserListIdsStore", "()Lcom/robinhood/shared/store/lists/store/ListItemIdToUserListIdsStore;", "setListItemIdToUserListIdsStore", "(Lcom/robinhood/shared/store/lists/store/ListItemIdToUserListIdsStore;)V", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "getInstrumentStore", "()Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "setInstrumentStore", "(Lcom/robinhood/librobinhood/data/store/InstrumentStore;)V", "stockDetailStore", "Lcom/robinhood/librobinhood/data/store/bonfire/StockDetailStore;", "getStockDetailStore", "()Lcom/robinhood/librobinhood/data/store/bonfire/StockDetailStore;", "setStockDetailStore", "(Lcom/robinhood/librobinhood/data/store/bonfire/StockDetailStore;)V", "instrumentAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAccountSwitcherStore;", "getInstrumentAccountSwitcherStore", "()Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAccountSwitcherStore;", "setInstrumentAccountSwitcherStore", "(Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAccountSwitcherStore;)V", "investmentScheduleEventStore", "Lcom/robinhood/store/base/InvestmentScheduleEventStore;", "getInvestmentScheduleEventStore", "()Lcom/robinhood/store/base/InvestmentScheduleEventStore;", "setInvestmentScheduleEventStore", "(Lcom/robinhood/store/base/InvestmentScheduleEventStore;)V", "balancesStore", "Lcom/robinhood/librobinhood/data/store/BalancesStore;", "getBalancesStore", "()Lcom/robinhood/librobinhood/data/store/BalancesStore;", "setBalancesStore", "(Lcom/robinhood/librobinhood/data/store/BalancesStore;)V", "orderStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "getOrderStore", "()Lcom/robinhood/librobinhood/data/store/OrderStore;", "setOrderStore", "(Lcom/robinhood/librobinhood/data/store/OrderStore;)V", "optionOrderStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderStore;", "getOptionOrderStore", "()Lcom/robinhood/librobinhood/data/store/OptionOrderStore;", "setOptionOrderStore", "(Lcom/robinhood/librobinhood/data/store/OptionOrderStore;)V", "comboOrderStore", "Lcom/robinhood/android/store/options/combo/ComboOrderStore;", "getComboOrderStore", "()Lcom/robinhood/android/store/options/combo/ComboOrderStore;", "setComboOrderStore", "(Lcom/robinhood/android/store/options/combo/ComboOrderStore;)V", "optionPositionStore", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "getOptionPositionStore", "()Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "setOptionPositionStore", "(Lcom/robinhood/librobinhood/data/store/OptionPositionStore;)V", "quickTradeAmountsStore", "Lcom/robinhood/librobinhood/data/store/QuickTradeAmountsStore;", "getQuickTradeAmountsStore", "()Lcom/robinhood/librobinhood/data/store/QuickTradeAmountsStore;", "setQuickTradeAmountsStore", "(Lcom/robinhood/librobinhood/data/store/QuickTradeAmountsStore;)V", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "getPositionStore", "()Lcom/robinhood/librobinhood/data/store/PositionStore;", "setPositionStore", "(Lcom/robinhood/librobinhood/data/store/PositionStore;)V", "dividendStore", "Lcom/robinhood/librobinhood/data/store/DividendStore;", "getDividendStore", "()Lcom/robinhood/librobinhood/data/store/DividendStore;", "setDividendStore", "(Lcom/robinhood/librobinhood/data/store/DividendStore;)V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "breadcrumbTracker", "Lcom/robinhood/android/lib/breadcrumbs/SupportBreadcrumbTracker;", "getBreadcrumbTracker", "()Lcom/robinhood/android/lib/breadcrumbs/SupportBreadcrumbTracker;", "setBreadcrumbTracker", "(Lcom/robinhood/android/lib/breadcrumbs/SupportBreadcrumbTracker;)V", "infoBannerStore", "Lcom/robinhood/shared/data/store/iac/IacInfoBannerStore;", "getInfoBannerStore", "()Lcom/robinhood/shared/data/store/iac/IacInfoBannerStore;", "setInfoBannerStore", "(Lcom/robinhood/shared/data/store/iac/IacInfoBannerStore;)V", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "getPerformanceLogger", "()Lcom/robinhood/android/performancelogger/PerformanceLogger;", "setPerformanceLogger", "(Lcom/robinhood/android/performancelogger/PerformanceLogger;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "equityDetailNuxStore", "Lcom/robinhood/librobinhood/data/store/EquityDetailNuxStore;", "getEquityDetailNuxStore", "()Lcom/robinhood/librobinhood/data/store/EquityDetailNuxStore;", "setEquityDetailNuxStore", "(Lcom/robinhood/librobinhood/data/store/EquityDetailNuxStore;)V", "tradingTrendsDetailsLogging", "Lcom/robinhood/android/tradingtrends/ui/details/TradingTrendsDetailsLogging;", "getTradingTrendsDetailsLogging", "()Lcom/robinhood/android/tradingtrends/ui/details/TradingTrendsDetailsLogging;", "setTradingTrendsDetailsLogging", "(Lcom/robinhood/android/tradingtrends/ui/details/TradingTrendsDetailsLogging;)V", "pipSupportStore", "Lcom/robinhood/shared/pictureinpicture/pipsupport/PictureInPictureStore;", "getPipSupportStore", "()Lcom/robinhood/shared/pictureinpicture/pipsupport/PictureInPictureStore;", "setPipSupportStore", "(Lcom/robinhood/shared/pictureinpicture/pipsupport/PictureInPictureStore;)V", "experimentStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "bwWebViewManager", "Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManager;", "getBwWebViewManager", "()Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManager;", "setBwWebViewManager", "(Lcom/robinhood/android/chart/blackwidowadvancedchart/BwWebViewManager;)V", "logOnceEventLogger", "Lcom/robinhood/analytics/LogOnceEventLogger;", "getLogOnceEventLogger", "()Lcom/robinhood/analytics/LogOnceEventLogger;", "logOnceEventLogger$delegate", "Lkotlin/Lazy;", "source", "Lcom/robinhood/android/navigation/app/keys/data/InstrumentDetailSource;", "getSource", "()Lcom/robinhood/android/navigation/app/keys/data/InstrumentDetailSource;", "source$delegate", "extraInstruments", "", "Lcom/robinhood/models/db/Instrument;", "getExtraInstruments", "()Ljava/util/List;", "extraInstruments$delegate", "extraInstrumentIds", "Ljava/util/UUID;", "getExtraInstrumentIds", "extraInstrumentIds$delegate", "extraInstrumentId", "getExtraInstrumentId", "()Ljava/util/UUID;", "extraInstrumentId$delegate", "extraInstrumentSymbol", "", "getExtraInstrumentSymbol", "()Ljava/lang/String;", "extraInstrumentSymbol$delegate", "accountNumber", "getAccountNumber", "accountNumber$delegate", InstrumentDetailListParentFragment.TRADING_TRENDS_DEEPLINK, "getTradingTrendsDeeplink", "()Ljava/lang/Boolean;", "tradingTrendsDeeplink$delegate", "instrumentId", InstrumentDetailListParentFragment.EXTRA_INSTRUMENT_SYMBOL, "loadTimeTrace", "Lcom/robinhood/android/common/perf/OneTimeUsePerfTrace;", "footerHeightSubject", "Lio/reactivex/subjects/BehaviorSubject;", "", "isInstrumentInUserLists", "isPreIpoDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "graphSelection", "Lcom/robinhood/models/ui/GraphSelection;", "value", "instrument", "setInstrument", "(Lcom/robinhood/models/db/Instrument;)V", "currentInstrumentRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "instrumentsRelay", "tradeBarFragment", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarFragment;", "curatedListQuickAddFragment", "Lcom/robinhood/shared/lists/quickadd/CuratedListQuickAddFragment;", "getCuratedListQuickAddFragment", "()Lcom/robinhood/shared/lists/quickadd/CuratedListQuickAddFragment;", "menuItemAlert", "Landroid/view/MenuItem;", "menuItemAddToList", "menuItemPip", "isPreIpo", "binding", "Lcom/robinhood/android/equitydetail/databinding/FragmentInstrumentDetailListBinding;", "getBinding", "()Lcom/robinhood/android/equitydetail/databinding/FragmentInstrumentDetailListBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "adapter", "Lcom/robinhood/android/equitydetail/ui/InstrumentDetailListFragmentAdapter;", "pageChangedRelay", "", "analystOverviewHintRelay", "Lcom/jakewharton/rxrelay2/PublishRelay;", "activeDisposables", "lastAdapterPos", "currentPageInstrumentId", "toolbarScrollAnimator", "Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "getToolbarScrollAnimator", "()Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "toolbarScrollAnimator$delegate", "sentListAddAppearAnalytics", "", "<set-?>", "hasShownFractionalNux", "getHasShownFractionalNux", "setHasShownFractionalNux", "(Z)V", "hasShownFractionalNux$delegate", "Lkotlin/properties/ReadWriteProperty;", "hasCompletedPerformanceMetric", "getHasCompletedPerformanceMetric", "setHasCompletedPerformanceMetric", "hasCompletedPerformanceMetric$delegate", "isShowingEducationTour", "useDesignSystemToolbar", "getUseDesignSystemToolbar", "hasBottomBar", "getHasBottomBar", "childFragmentsShouldNotConfigureToolbar", "getChildFragmentsShouldNotConfigureToolbar", "dataDetailOverrideOnBack", "Lkotlin/Function0;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "onDestroyView", "onDestroy", "bindToAdapterPosition", "fragment", "Lcom/robinhood/android/equitydetail/ui/InstrumentDetailFragment;", "screenDescription", "getScreenDescription", "screenSource", "getScreenSource", "overrideOnBack", "handleOnBack", "viewPagerEnabled", "getCurrentFragment", "onStart", "onResume", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onBackPressed", "createOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onOptionsItemSelected", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "navigateToEquityOrder", "side", "Lcom/robinhood/models/db/EquityOrderSide;", "onInitiateOrder", "onGraphLayoutPreDraw", "onGraphSelectionChanged", "newGraphSelection", "onAnalystReportHintClicked", "onShowEducationTour", "onHideEducationTour", "onSaveInstanceState", "outState", "bindAdapter", WebsocketGatewayConstants.DATA_KEY, "findCurrentFragment", "ensureTradeBarFragment", "hideTradeBarFragment", "ensureCuratedListQuickAddFragment", "onInstrumentLoaded", "refreshMenu", "setCurrentPosition", "position", "logPageSwipeAction", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class InstrumentDetailListParentFragment extends BaseFragment implements InstrumentDetailTradeBarFragment.Callbacks, InstrumentDetailFragment.Callbacks {
    private static final String EXTRA_ACCOUNT_NUMBER = "accountNumber";
    private static final String EXTRA_INSTRUMENT_ID = "instrumentId";
    private static final String EXTRA_INSTRUMENT_IDS = "instrumentIds";
    private static final String EXTRA_INSTRUMENT_SYMBOL = "instrumentSymbol";
    private static final String EXTRA_SOURCE = "source";
    private static final String EXTRA_WATCHED_INSTRUMENTS = "watchedInstruments";
    private static final long FRACTIONAL_NUX_DELAY_SECONDS = 2;
    private static final String FRACTIONAL_NUX_TAG = "fractionalNuxFragment";
    private static final String OVERLAY_TAG = "buySellOverlayFragment";
    private static final String QUICK_ADD_TAG = "quickAddFragment";
    private static final String TRACE_NAME = "instrumentDetail";
    private static final String TRADING_TRENDS_DEEPLINK = "tradingTrendsDeeplink";

    /* renamed from: accountNumber$delegate, reason: from kotlin metadata */
    private final Lazy accountNumber;
    private final CompositeDisposable activeDisposables;
    private InstrumentDetailListFragmentAdapter adapter;
    public AggregateOptionPositionStore aggregateOptionPositionStore;
    private final PublishRelay<Unit> analystOverviewHintRelay;
    public AnalyticsLogger analytics;
    public BalancesStore balancesStore;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public SupportBreadcrumbTracker breadcrumbTracker;
    public BwWebViewManager bwWebViewManager;
    private final boolean childFragmentsShouldNotConfigureToolbar;
    public ComboOrderStore comboOrderStore;
    private final BehaviorRelay<Instrument> currentInstrumentRelay;
    private UUID currentPageInstrumentId;
    private Function0<Unit> dataDetailOverrideOnBack;
    public DividendStore dividendStore;
    public EquityDetailNuxStore equityDetailNuxStore;
    public EventLogger eventLogger;
    public ExperimentsStore experimentStore;

    /* renamed from: extraInstrumentId$delegate, reason: from kotlin metadata */
    private final Lazy extraInstrumentId;

    /* renamed from: extraInstrumentIds$delegate, reason: from kotlin metadata */
    private final Lazy extraInstrumentIds;

    /* renamed from: extraInstrumentSymbol$delegate, reason: from kotlin metadata */
    private final Lazy extraInstrumentSymbol;

    /* renamed from: extraInstruments$delegate, reason: from kotlin metadata */
    private final Lazy extraInstruments;
    private final BehaviorSubject<Integer> footerHeightSubject;
    private GraphSelection graphSelection;
    private final boolean hasBottomBar;

    /* renamed from: hasCompletedPerformanceMetric$delegate, reason: from kotlin metadata */
    private final Interfaces3 hasCompletedPerformanceMetric;

    /* renamed from: hasShownFractionalNux$delegate, reason: from kotlin metadata */
    private final Interfaces3 hasShownFractionalNux;
    public IacInfoBannerStore infoBannerStore;
    private Instrument instrument;
    public InstrumentAccountSwitcherStore instrumentAccountSwitcherStore;
    private UUID instrumentId;
    public InstrumentStore instrumentStore;
    private String instrumentSymbol;
    private final BehaviorRelay<List<Instrument>> instrumentsRelay;
    public InvestmentScheduleEventStore investmentScheduleEventStore;
    private boolean isInstrumentInUserLists;
    private final boolean isParentScreen;
    private boolean isPreIpo;
    private final CompositeDisposable isPreIpoDisposable;
    private boolean isShowingEducationTour;
    private int lastAdapterPos;
    public ListItemIdToUserListIdsStore listItemIdToUserListIdsStore;
    private final OneTimeUsePerfTrace loadTimeTrace;

    /* renamed from: logOnceEventLogger$delegate, reason: from kotlin metadata */
    private final Lazy logOnceEventLogger;
    private MenuItem menuItemAddToList;
    private MenuItem menuItemAlert;
    private MenuItem menuItemPip;
    public OptionOrderStore optionOrderStore;
    public OptionPositionStore optionPositionStore;
    public OrderStore orderStore;
    private final BehaviorRelay<Unit> pageChangedRelay;
    public PerformanceLogger performanceLogger;
    public PictureInPictureStore pipSupportStore;
    public PositionStore positionStore;
    public QuickTradeAmountsStore quickTradeAmountsStore;
    private final Set<UUID> sentListAddAppearAnalytics;

    /* renamed from: source$delegate, reason: from kotlin metadata */
    private final Lazy source;
    public StockDetailStore stockDetailStore;

    /* renamed from: toolbarScrollAnimator$delegate, reason: from kotlin metadata */
    private final Lazy toolbarScrollAnimator;
    private InstrumentDetailTradeBarFragment tradeBarFragment;

    /* renamed from: tradingTrendsDeeplink$delegate, reason: from kotlin metadata */
    private final Lazy tradingTrendsDeeplink;
    public TradingTrendsDetailsLogging tradingTrendsDetailsLogging;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(InstrumentDetailListParentFragment.class, "binding", "getBinding()Lcom/robinhood/android/equitydetail/databinding/FragmentInstrumentDetailListBinding;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(InstrumentDetailListParentFragment.class, "hasShownFractionalNux", "getHasShownFractionalNux()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(InstrumentDetailListParentFragment.class, "hasCompletedPerformanceMetric", "getHasCompletedPerformanceMetric()Z", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final UUID onCreate$lambda$3(UUID it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it;
    }

    public InstrumentDetailListParentFragment() {
        super(C15314R.layout.fragment_instrument_detail_list);
        this.isParentScreen = true;
        this.logOnceEventLogger = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailListParentFragment$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InstrumentDetailListParentFragment.logOnceEventLogger_delegate$lambda$0(this.f$0);
            }
        });
        this.source = Fragments2.argument(this, "source");
        this.extraInstruments = Fragments2.argument(this, EXTRA_WATCHED_INSTRUMENTS);
        this.extraInstrumentIds = Fragments2.argument(this, EXTRA_INSTRUMENT_IDS);
        this.extraInstrumentId = Fragments2.argument(this, "instrumentId");
        this.extraInstrumentSymbol = Fragments2.argument(this, EXTRA_INSTRUMENT_SYMBOL);
        this.accountNumber = Fragments2.argument(this, "accountNumber");
        this.tradingTrendsDeeplink = Fragments2.argument(this, TRADING_TRENDS_DEEPLINK);
        this.loadTimeTrace = new OneTimeUsePerfTrace(TRACE_NAME);
        BehaviorSubject<Integer> behaviorSubjectCreate = BehaviorSubject.create();
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreate, "create(...)");
        this.footerHeightSubject = behaviorSubjectCreate;
        this.isPreIpoDisposable = new CompositeDisposable();
        BehaviorRelay<Instrument> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.currentInstrumentRelay = behaviorRelayCreate;
        BehaviorRelay<List<Instrument>> behaviorRelayCreate2 = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate2, "create(...)");
        this.instrumentsRelay = behaviorRelayCreate2;
        this.binding = ViewBinding5.viewBinding(this, InstrumentDetailListParentFragment2.INSTANCE);
        BehaviorRelay<Unit> behaviorRelayCreate3 = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate3, "create(...)");
        this.pageChangedRelay = behaviorRelayCreate3;
        PublishRelay<Unit> publishRelayCreate = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate, "create(...)");
        this.analystOverviewHintRelay = publishRelayCreate;
        this.activeDisposables = new CompositeDisposable();
        this.lastAdapterPos = -1;
        this.toolbarScrollAnimator = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailListParentFragment$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InstrumentDetailListParentFragment.toolbarScrollAnimator_delegate$lambda$1(this.f$0);
            }
        });
        this.sentListAddAppearAnalytics = new LinkedHashSet();
        Interfaces<Object, Interfaces3<Object, Boolean>> interfacesSavedBoolean = BindSavedState2.savedBoolean(this, false);
        KProperty<?>[] kPropertyArr = $$delegatedProperties;
        this.hasShownFractionalNux = interfacesSavedBoolean.provideDelegate(this, kPropertyArr[1]);
        this.hasCompletedPerformanceMetric = BindSavedState2.savedBoolean(this, false).provideDelegate(this, kPropertyArr[2]);
        this.useDesignSystemToolbar = true;
        this.hasBottomBar = true;
        this.childFragmentsShouldNotConfigureToolbar = true;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    /* renamed from: isParentScreen, reason: from getter */
    public boolean getIsParentScreen() {
        return this.isParentScreen;
    }

    public final AggregateOptionPositionStore getAggregateOptionPositionStore() {
        AggregateOptionPositionStore aggregateOptionPositionStore = this.aggregateOptionPositionStore;
        if (aggregateOptionPositionStore != null) {
            return aggregateOptionPositionStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aggregateOptionPositionStore");
        return null;
    }

    public final void setAggregateOptionPositionStore(AggregateOptionPositionStore aggregateOptionPositionStore) {
        Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "<set-?>");
        this.aggregateOptionPositionStore = aggregateOptionPositionStore;
    }

    public final ListItemIdToUserListIdsStore getListItemIdToUserListIdsStore() {
        ListItemIdToUserListIdsStore listItemIdToUserListIdsStore = this.listItemIdToUserListIdsStore;
        if (listItemIdToUserListIdsStore != null) {
            return listItemIdToUserListIdsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("listItemIdToUserListIdsStore");
        return null;
    }

    public final void setListItemIdToUserListIdsStore(ListItemIdToUserListIdsStore listItemIdToUserListIdsStore) {
        Intrinsics.checkNotNullParameter(listItemIdToUserListIdsStore, "<set-?>");
        this.listItemIdToUserListIdsStore = listItemIdToUserListIdsStore;
    }

    public final InstrumentStore getInstrumentStore() {
        InstrumentStore instrumentStore = this.instrumentStore;
        if (instrumentStore != null) {
            return instrumentStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("instrumentStore");
        return null;
    }

    public final void setInstrumentStore(InstrumentStore instrumentStore) {
        Intrinsics.checkNotNullParameter(instrumentStore, "<set-?>");
        this.instrumentStore = instrumentStore;
    }

    public final StockDetailStore getStockDetailStore() {
        StockDetailStore stockDetailStore = this.stockDetailStore;
        if (stockDetailStore != null) {
            return stockDetailStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("stockDetailStore");
        return null;
    }

    public final void setStockDetailStore(StockDetailStore stockDetailStore) {
        Intrinsics.checkNotNullParameter(stockDetailStore, "<set-?>");
        this.stockDetailStore = stockDetailStore;
    }

    public final InstrumentAccountSwitcherStore getInstrumentAccountSwitcherStore() {
        InstrumentAccountSwitcherStore instrumentAccountSwitcherStore = this.instrumentAccountSwitcherStore;
        if (instrumentAccountSwitcherStore != null) {
            return instrumentAccountSwitcherStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("instrumentAccountSwitcherStore");
        return null;
    }

    public final void setInstrumentAccountSwitcherStore(InstrumentAccountSwitcherStore instrumentAccountSwitcherStore) {
        Intrinsics.checkNotNullParameter(instrumentAccountSwitcherStore, "<set-?>");
        this.instrumentAccountSwitcherStore = instrumentAccountSwitcherStore;
    }

    public final InvestmentScheduleEventStore getInvestmentScheduleEventStore() {
        InvestmentScheduleEventStore investmentScheduleEventStore = this.investmentScheduleEventStore;
        if (investmentScheduleEventStore != null) {
            return investmentScheduleEventStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("investmentScheduleEventStore");
        return null;
    }

    public final void setInvestmentScheduleEventStore(InvestmentScheduleEventStore investmentScheduleEventStore) {
        Intrinsics.checkNotNullParameter(investmentScheduleEventStore, "<set-?>");
        this.investmentScheduleEventStore = investmentScheduleEventStore;
    }

    public final BalancesStore getBalancesStore() {
        BalancesStore balancesStore = this.balancesStore;
        if (balancesStore != null) {
            return balancesStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("balancesStore");
        return null;
    }

    public final void setBalancesStore(BalancesStore balancesStore) {
        Intrinsics.checkNotNullParameter(balancesStore, "<set-?>");
        this.balancesStore = balancesStore;
    }

    public final OrderStore getOrderStore() {
        OrderStore orderStore = this.orderStore;
        if (orderStore != null) {
            return orderStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("orderStore");
        return null;
    }

    public final void setOrderStore(OrderStore orderStore) {
        Intrinsics.checkNotNullParameter(orderStore, "<set-?>");
        this.orderStore = orderStore;
    }

    public final OptionOrderStore getOptionOrderStore() {
        OptionOrderStore optionOrderStore = this.optionOrderStore;
        if (optionOrderStore != null) {
            return optionOrderStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("optionOrderStore");
        return null;
    }

    public final void setOptionOrderStore(OptionOrderStore optionOrderStore) {
        Intrinsics.checkNotNullParameter(optionOrderStore, "<set-?>");
        this.optionOrderStore = optionOrderStore;
    }

    public final ComboOrderStore getComboOrderStore() {
        ComboOrderStore comboOrderStore = this.comboOrderStore;
        if (comboOrderStore != null) {
            return comboOrderStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("comboOrderStore");
        return null;
    }

    public final void setComboOrderStore(ComboOrderStore comboOrderStore) {
        Intrinsics.checkNotNullParameter(comboOrderStore, "<set-?>");
        this.comboOrderStore = comboOrderStore;
    }

    public final OptionPositionStore getOptionPositionStore() {
        OptionPositionStore optionPositionStore = this.optionPositionStore;
        if (optionPositionStore != null) {
            return optionPositionStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("optionPositionStore");
        return null;
    }

    public final void setOptionPositionStore(OptionPositionStore optionPositionStore) {
        Intrinsics.checkNotNullParameter(optionPositionStore, "<set-?>");
        this.optionPositionStore = optionPositionStore;
    }

    public final QuickTradeAmountsStore getQuickTradeAmountsStore() {
        QuickTradeAmountsStore quickTradeAmountsStore = this.quickTradeAmountsStore;
        if (quickTradeAmountsStore != null) {
            return quickTradeAmountsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("quickTradeAmountsStore");
        return null;
    }

    public final void setQuickTradeAmountsStore(QuickTradeAmountsStore quickTradeAmountsStore) {
        Intrinsics.checkNotNullParameter(quickTradeAmountsStore, "<set-?>");
        this.quickTradeAmountsStore = quickTradeAmountsStore;
    }

    public final PositionStore getPositionStore() {
        PositionStore positionStore = this.positionStore;
        if (positionStore != null) {
            return positionStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("positionStore");
        return null;
    }

    public final void setPositionStore(PositionStore positionStore) {
        Intrinsics.checkNotNullParameter(positionStore, "<set-?>");
        this.positionStore = positionStore;
    }

    public final DividendStore getDividendStore() {
        DividendStore dividendStore = this.dividendStore;
        if (dividendStore != null) {
            return dividendStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dividendStore");
        return null;
    }

    public final void setDividendStore(DividendStore dividendStore) {
        Intrinsics.checkNotNullParameter(dividendStore, "<set-?>");
        this.dividendStore = dividendStore;
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

    public final SupportBreadcrumbTracker getBreadcrumbTracker() {
        SupportBreadcrumbTracker supportBreadcrumbTracker = this.breadcrumbTracker;
        if (supportBreadcrumbTracker != null) {
            return supportBreadcrumbTracker;
        }
        Intrinsics.throwUninitializedPropertyAccessException("breadcrumbTracker");
        return null;
    }

    public final void setBreadcrumbTracker(SupportBreadcrumbTracker supportBreadcrumbTracker) {
        Intrinsics.checkNotNullParameter(supportBreadcrumbTracker, "<set-?>");
        this.breadcrumbTracker = supportBreadcrumbTracker;
    }

    public final IacInfoBannerStore getInfoBannerStore() {
        IacInfoBannerStore iacInfoBannerStore = this.infoBannerStore;
        if (iacInfoBannerStore != null) {
            return iacInfoBannerStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("infoBannerStore");
        return null;
    }

    public final void setInfoBannerStore(IacInfoBannerStore iacInfoBannerStore) {
        Intrinsics.checkNotNullParameter(iacInfoBannerStore, "<set-?>");
        this.infoBannerStore = iacInfoBannerStore;
    }

    public final PerformanceLogger getPerformanceLogger() {
        PerformanceLogger performanceLogger = this.performanceLogger;
        if (performanceLogger != null) {
            return performanceLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("performanceLogger");
        return null;
    }

    public final void setPerformanceLogger(PerformanceLogger performanceLogger) {
        Intrinsics.checkNotNullParameter(performanceLogger, "<set-?>");
        this.performanceLogger = performanceLogger;
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

    public final EquityDetailNuxStore getEquityDetailNuxStore() {
        EquityDetailNuxStore equityDetailNuxStore = this.equityDetailNuxStore;
        if (equityDetailNuxStore != null) {
            return equityDetailNuxStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("equityDetailNuxStore");
        return null;
    }

    public final void setEquityDetailNuxStore(EquityDetailNuxStore equityDetailNuxStore) {
        Intrinsics.checkNotNullParameter(equityDetailNuxStore, "<set-?>");
        this.equityDetailNuxStore = equityDetailNuxStore;
    }

    public final TradingTrendsDetailsLogging getTradingTrendsDetailsLogging() {
        TradingTrendsDetailsLogging tradingTrendsDetailsLogging = this.tradingTrendsDetailsLogging;
        if (tradingTrendsDetailsLogging != null) {
            return tradingTrendsDetailsLogging;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tradingTrendsDetailsLogging");
        return null;
    }

    public final void setTradingTrendsDetailsLogging(TradingTrendsDetailsLogging tradingTrendsDetailsLogging) {
        Intrinsics.checkNotNullParameter(tradingTrendsDetailsLogging, "<set-?>");
        this.tradingTrendsDetailsLogging = tradingTrendsDetailsLogging;
    }

    public final PictureInPictureStore getPipSupportStore() {
        PictureInPictureStore pictureInPictureStore = this.pipSupportStore;
        if (pictureInPictureStore != null) {
            return pictureInPictureStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pipSupportStore");
        return null;
    }

    public final void setPipSupportStore(PictureInPictureStore pictureInPictureStore) {
        Intrinsics.checkNotNullParameter(pictureInPictureStore, "<set-?>");
        this.pipSupportStore = pictureInPictureStore;
    }

    public final ExperimentsStore getExperimentStore() {
        ExperimentsStore experimentsStore = this.experimentStore;
        if (experimentsStore != null) {
            return experimentsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("experimentStore");
        return null;
    }

    public final void setExperimentStore(ExperimentsStore experimentsStore) {
        Intrinsics.checkNotNullParameter(experimentsStore, "<set-?>");
        this.experimentStore = experimentsStore;
    }

    public final BwWebViewManager getBwWebViewManager() {
        BwWebViewManager bwWebViewManager = this.bwWebViewManager;
        if (bwWebViewManager != null) {
            return bwWebViewManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bwWebViewManager");
        return null;
    }

    public final void setBwWebViewManager(BwWebViewManager bwWebViewManager) {
        Intrinsics.checkNotNullParameter(bwWebViewManager, "<set-?>");
        this.bwWebViewManager = bwWebViewManager;
    }

    private final LogOnceEventLogger getLogOnceEventLogger() {
        return (LogOnceEventLogger) this.logOnceEventLogger.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LogOnceEventLogger logOnceEventLogger_delegate$lambda$0(InstrumentDetailListParentFragment instrumentDetailListParentFragment) {
        return new LogOnceEventLogger(instrumentDetailListParentFragment.getEventLogger());
    }

    private final InstrumentDetailSource getSource() {
        return (InstrumentDetailSource) this.source.getValue();
    }

    private final List<Instrument> getExtraInstruments() {
        return (List) this.extraInstruments.getValue();
    }

    private final List<UUID> getExtraInstrumentIds() {
        return (List) this.extraInstrumentIds.getValue();
    }

    private final UUID getExtraInstrumentId() {
        return (UUID) this.extraInstrumentId.getValue();
    }

    private final String getExtraInstrumentSymbol() {
        return (String) this.extraInstrumentSymbol.getValue();
    }

    private final String getAccountNumber() {
        return (String) this.accountNumber.getValue();
    }

    public final Boolean getTradingTrendsDeeplink() {
        return (Boolean) this.tradingTrendsDeeplink.getValue();
    }

    private final void setInstrument(Instrument instrument) {
        Intrinsics.checkNotNull(instrument);
        this.instrument = instrument;
        this.instrumentId = instrument.getId();
        this.instrumentSymbol = instrument.getSymbol();
        InstrumentDetailTradeBarFragment instrumentDetailTradeBarFragment = this.tradeBarFragment;
        if (instrumentDetailTradeBarFragment != null) {
            instrumentDetailTradeBarFragment.bindInstrument(instrument);
        }
        this.currentInstrumentRelay.accept(instrument);
    }

    private final CuratedListQuickAddFragment getCuratedListQuickAddFragment() {
        Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("quickAddFragment");
        if (fragmentFindFragmentByTag instanceof CuratedListQuickAddFragment) {
            return (CuratedListQuickAddFragment) fragmentFindFragmentByTag;
        }
        return null;
    }

    private final FragmentInstrumentDetailListBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentInstrumentDetailListBinding) value;
    }

    private final ToolbarScrollAnimator getToolbarScrollAnimator() {
        return (ToolbarScrollAnimator) this.toolbarScrollAnimator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ToolbarScrollAnimator toolbarScrollAnimator_delegate$lambda$1(InstrumentDetailListParentFragment instrumentDetailListParentFragment) {
        RhToolbar rhToolbar = instrumentDetailListParentFragment.getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        return new ToolbarScrollAnimator(rhToolbar, instrumentDetailListParentFragment.getResources().getDimension(C11048R.dimen.toolbar_scroll_height), false, false, false, (Float) null, 48, (DefaultConstructorMarker) null);
    }

    private final boolean getHasShownFractionalNux() {
        return ((Boolean) this.hasShownFractionalNux.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    private final void setHasShownFractionalNux(boolean z) {
        this.hasShownFractionalNux.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }

    private final boolean getHasCompletedPerformanceMetric() {
        return ((Boolean) this.hasCompletedPerformanceMetric.getValue(this, $$delegatedProperties[2])).booleanValue();
    }

    private final void setHasCompletedPerformanceMetric(boolean z) {
        this.hasCompletedPerformanceMetric.setValue(this, $$delegatedProperties[2], Boolean.valueOf(z));
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getHasBottomBar() {
        return this.hasBottomBar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getChildFragmentsShouldNotConfigureToolbar() {
        return this.childFragmentsShouldNotConfigureToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    /* compiled from: InstrumentDetailListParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.InstrumentDetailListParentFragment$onCreate$1", m3645f = "InstrumentDetailListParentFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitydetail.ui.InstrumentDetailListParentFragment$onCreate$1 */
    static final class C153831 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C153831(Continuation<? super C153831> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InstrumentDetailListParentFragment.this.new C153831(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C153831) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowCombine = FlowKt.combine(ExperimentsProvider.DefaultImpls.streamStateFlow$default(InstrumentDetailListParentFragment.this.getExperimentStore(), new Experiment[]{BlackWidowAdvancedChartExperiment.INSTANCE}, false, null, 6, null), ExperimentsProvider.DefaultImpls.streamStateFlow$default(InstrumentDetailListParentFragment.this.getExperimentStore(), new Experiment[]{BlackWidowAdvancedChartBackgroundCacheKillSwitch.INSTANCE}, false, null, 6, null), new AnonymousClass1(null));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(InstrumentDetailListParentFragment.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowCombine, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: InstrumentDetailListParentFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "experimentState", "killSwitch"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.InstrumentDetailListParentFragment$onCreate$1$1", m3645f = "InstrumentDetailListParentFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitydetail.ui.InstrumentDetailListParentFragment$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function3<Boolean, Boolean, Continuation<? super Boolean>, Object> {
            /* synthetic */ boolean Z$0;
            /* synthetic */ boolean Z$1;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(3, continuation);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, Continuation<? super Boolean> continuation) {
                return invoke(bool.booleanValue(), bool2.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, boolean z2, Continuation<? super Boolean> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.Z$0 = z;
                anonymousClass1.Z$1 = z2;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return boxing.boxBoolean(this.Z$0 && !this.Z$1);
            }
        }

        /* compiled from: InstrumentDetailListParentFragment.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "enabled", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.InstrumentDetailListParentFragment$onCreate$1$2", m3645f = "InstrumentDetailListParentFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitydetail.ui.InstrumentDetailListParentFragment$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ InstrumentDetailListParentFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(InstrumentDetailListParentFragment instrumentDetailListParentFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = instrumentDetailListParentFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.Z$0) {
                        BwWebViewManager bwWebViewManager = this.this$0.getBwWebViewManager();
                        this.label = 1;
                        if (bwWebViewManager.retainUntilCanceled(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new ExceptionsH();
            }
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C153831(null));
        this.loadTimeTrace.start();
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            savedInstanceState = getArguments();
        }
        BaseActivity baseActivity = getBaseActivity();
        Intrinsics.checkNotNull(baseActivity);
        if (savedInstanceState == null) {
            baseActivity.finish();
            return;
        }
        setHasOptionsMenu(true);
        this.instrumentId = (UUID) Bundles.getTypedSerializable(savedInstanceState, "instrumentId");
        String string2 = savedInstanceState.getString(EXTRA_INSTRUMENT_SYMBOL);
        this.instrumentSymbol = string2;
        UUID uuid = this.instrumentId;
        if (uuid == null && string2 == null) {
            throw new IllegalStateException("Check failed.");
        }
        if (uuid != null) {
            if (!getExtraInstruments().isEmpty() && !getExtraInstrumentIds().isEmpty()) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        } else if (string2 != null && (!getExtraInstruments().isEmpty() || !getExtraInstrumentIds().isEmpty())) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.currentPageInstrumentId = this.instrumentId;
        if (getExtraInstruments().isEmpty() && getExtraInstrumentIds().isEmpty()) {
            this.instrumentsRelay.accept(CollectionsKt.emptyList());
            return;
        }
        if (!getExtraInstruments().isEmpty()) {
            this.instrumentsRelay.accept(getExtraInstruments());
        } else {
            if (getExtraInstrumentIds().isEmpty()) {
                return;
            }
            getInstrumentStore().pingInstruments(getExtraInstrumentIds());
            Observable<List<Instrument>> observableTake = getInstrumentStore().getInstruments(getExtraInstrumentIds(), new Function1() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailListParentFragment$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InstrumentDetailListParentFragment.onCreate$lambda$3((UUID) obj);
                }
            }).take(1L);
            Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
            LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C153843(this.instrumentsRelay));
        }
    }

    /* compiled from: InstrumentDetailListParentFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equitydetail.ui.InstrumentDetailListParentFragment$onCreate$3 */
    /* synthetic */ class C153843 extends FunctionReferenceImpl implements Function1<List<? extends Instrument>, Unit> {
        C153843(Object obj) {
            super(1, obj, BehaviorRelay.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Instrument> list) {
            invoke2((List<Instrument>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<Instrument> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((BehaviorRelay) this.receiver).accept(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (!isInTabFragment()) {
            ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        }
        this.adapter = new InstrumentDetailListFragmentAdapter(this, getSource());
        ViewPager2 viewPager = getBinding().viewPager;
        Intrinsics.checkNotNullExpressionValue(viewPager, "viewPager");
        InstrumentDetailListFragmentAdapter instrumentDetailListFragmentAdapter = null;
        LifecycleHost.DefaultImpls.bind$default(this, RxViewPager2.pageSelections(viewPager), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailListParentFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentDetailListParentFragment.onViewCreated$lambda$4(this.f$0, ((Integer) obj).intValue());
            }
        });
        Observable<R> observableSwitchMap = this.pageChangedRelay.switchMap(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailListParentFragment.onViewCreated.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends InstrumentDetailFragment> apply(Unit it) {
                Intrinsics.checkNotNullParameter(it, "it");
                InstrumentDetailFragment instrumentDetailFragmentFindCurrentFragment = InstrumentDetailListParentFragment.this.findCurrentFragment();
                if (instrumentDetailFragmentFindCurrentFragment != null) {
                    return Observable.just(instrumentDetailFragmentFindCurrentFragment);
                }
                FragmentManager childFragmentManager = InstrumentDetailListParentFragment.this.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                Observable<FragmentManagers> observableFragmentLifecycleEvents = FragmentManagers2.fragmentLifecycleEvents(childFragmentManager, false);
                final InstrumentDetailListParentFragment instrumentDetailListParentFragment = InstrumentDetailListParentFragment.this;
                Observable<R> map = observableFragmentLifecycleEvents.map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailListParentFragment$onViewCreated$2$apply$$inlined$mapNotNull$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // io.reactivex.functions.Function
                    public final Optional<R> apply(T it2) {
                        Intrinsics.checkNotNullParameter(it2, "it");
                        return Optional3.asOptional(instrumentDetailListParentFragment.findCurrentFragment());
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // io.reactivex.functions.Function
                    public /* bridge */ /* synthetic */ Object apply(Object obj) {
                        return apply((C15379xcf078aac<T, R>) obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                return ObservablesKt.filterIsPresent(map).take(1L);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailListParentFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentDetailListParentFragment.onViewCreated$lambda$5(this.f$0, (InstrumentDetailFragment) obj);
            }
        });
        final UUID uuid = this.instrumentId;
        if (uuid != null) {
            Observable<List<Instrument>> observableFilter = this.instrumentsRelay.take(1L).filter(new Predicate() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailListParentFragment.onViewCreated.4
                @Override // io.reactivex.functions.Predicate
                public final boolean test(List<Instrument> it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return !it.isEmpty();
                }
            });
            Intrinsics.checkNotNullExpressionValue(observableFilter, "filter(...)");
            LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableFilter), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailListParentFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InstrumentDetailListParentFragment.onViewCreated$lambda$6(this.f$0, uuid, (List) obj);
                }
            });
        }
        if (getExtraInstruments().isEmpty() && getExtraInstrumentIds().isEmpty()) {
            int currentItem = getBinding().viewPager.getCurrentItem();
            InstrumentDetailListFragmentAdapter instrumentDetailListFragmentAdapter2 = this.adapter;
            if (instrumentDetailListFragmentAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                instrumentDetailListFragmentAdapter = instrumentDetailListFragmentAdapter2;
            }
            if (currentItem < instrumentDetailListFragmentAdapter.getSize()) {
                this.pageChangedRelay.accept(Unit.INSTANCE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4(InstrumentDetailListParentFragment instrumentDetailListParentFragment, int i) {
        BehaviorRelay<Unit> behaviorRelay = instrumentDetailListParentFragment.pageChangedRelay;
        Unit unit = Unit.INSTANCE;
        behaviorRelay.accept(unit);
        return unit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$5(InstrumentDetailListParentFragment instrumentDetailListParentFragment, InstrumentDetailFragment instrumentDetailFragment) {
        instrumentDetailListParentFragment.logPageSwipeAction();
        Intrinsics.checkNotNull(instrumentDetailFragment);
        instrumentDetailListParentFragment.bindToAdapterPosition(instrumentDetailFragment);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$6(InstrumentDetailListParentFragment instrumentDetailListParentFragment, UUID uuid, List list) {
        Intrinsics.checkNotNull(list);
        instrumentDetailListParentFragment.bindAdapter((List<Instrument>) list, uuid);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        getBinding().viewPager.setAdapter(null);
        super.onDestroyView();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        getBreadcrumbTracker().removeBreadcrumb(getScreenName());
        if (getExtraInstrumentIds().isEmpty()) {
            return;
        }
        EtpCompositionViewState4.getEtpCompositionDataTypeManager().clear();
    }

    private final void bindToAdapterPosition(final InstrumentDetailFragment fragment) {
        InstrumentDetailListFragmentAdapter instrumentDetailListFragmentAdapter = this.adapter;
        if (instrumentDetailListFragmentAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            instrumentDetailListFragmentAdapter = null;
        }
        if (instrumentDetailListFragmentAdapter.getSize() == 0) {
            return;
        }
        int currentItem = getBinding().viewPager.getCurrentItem();
        this.activeDisposables.clear();
        Observable observableObserveOnMainThread = ObservablesAndroid.observeOnMainThread(fragment.getDirectionStyleObservable());
        LifecycleEvent lifecycleEvent = LifecycleEvent.ON_DESTROY_VIEW;
        disposable.addTo(bind(observableObserveOnMainThread, lifecycleEvent).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailListParentFragment$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentDetailListParentFragment.bindToAdapterPosition$lambda$7(this.f$0, (DirectionOverlay) obj);
            }
        }), this.activeDisposables);
        disposable.addTo(fragment.attachToolbarScrollAnimator(getToolbarScrollAnimator()), this.activeDisposables);
        Completable completableSwitchMapCompletable = ObservablesKt.filterIsPresent(fragment.getCurrentlyBoundInfoBannerReceiptUuid()).distinctUntilChanged().switchMapCompletable(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailListParentFragment.bindToAdapterPosition.2
            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(UUID it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return InstrumentDetailListParentFragment.this.getInfoBannerStore().postSeen(it);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableSwitchMapCompletable, "switchMapCompletable(...)");
        disposable.addTo(bind(completableSwitchMapCompletable, lifecycleEvent).subscribeKotlin(), this.activeDisposables);
        Observable<Integer> observableDistinctUntilChanged = this.footerHeightSubject.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        disposable.addTo(bind(observableDistinctUntilChanged, lifecycleEvent).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailListParentFragment$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentDetailListParentFragment.bindToAdapterPosition$lambda$8(this.f$0, (Integer) obj);
            }
        }), this.activeDisposables);
        Disposable disposableSubscribe = this.analystOverviewHintRelay.subscribe(new Consumer() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailListParentFragment.bindToAdapterPosition.4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Unit unit) {
                fragment.scrollToAnalystReport();
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        disposable.addTo(disposableSubscribe, this.activeDisposables);
        if (!getHasCompletedPerformanceMetric() && ((getExtraInstrumentId() != null && Intrinsics.areEqual(getExtraInstrumentId(), this.instrumentId)) || Intrinsics.areEqual(getExtraInstrumentSymbol(), this.instrumentSymbol))) {
            disposable.addTo(bind(fragment.getFinishedLoadingCompletable(), lifecycleEvent).subscribeKotlin(new Function0() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailListParentFragment$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InstrumentDetailListParentFragment.bindToAdapterPosition$lambda$9(this.f$0);
                }
            }), this.activeDisposables);
        }
        setCurrentPosition(currentItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindToAdapterPosition$lambda$7(InstrumentDetailListParentFragment instrumentDetailListParentFragment, DirectionOverlay directionStyle) {
        Intrinsics.checkNotNullParameter(directionStyle, "directionStyle");
        View viewRequireView = instrumentDetailListParentFragment.requireView();
        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(viewRequireView), directionStyle, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindToAdapterPosition$lambda$8(InstrumentDetailListParentFragment instrumentDetailListParentFragment, Integer num) {
        ViewPager2 viewPager = instrumentDetailListParentFragment.getBinding().viewPager;
        Intrinsics.checkNotNullExpressionValue(viewPager, "viewPager");
        Intrinsics.checkNotNull(num);
        ViewsKt.setMarginBottom(viewPager, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindToAdapterPosition$lambda$9(InstrumentDetailListParentFragment instrumentDetailListParentFragment) {
        instrumentDetailListParentFragment.getPerformanceLogger().completeMetric(PerformanceMetricEventData.Name.STOCK_DETAIL, instrumentDetailListParentFragment.getExtraInstrumentId());
        instrumentDetailListParentFragment.setHasCompletedPerformanceMetric(true);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenDescription() {
        UUID id = this.currentPageInstrumentId;
        if (id == null) {
            Instrument instrument = this.instrument;
            id = instrument != null ? instrument.getId() : null;
        }
        return "id: " + id;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenSource() {
        InstrumentDetailSource source = getSource();
        if (source != null) {
            return source.name();
        }
        return null;
    }

    public static /* synthetic */ void overrideOnBack$default(InstrumentDetailListParentFragment instrumentDetailListParentFragment, Function0 function0, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        instrumentDetailListParentFragment.overrideOnBack(function0, z);
    }

    public final void overrideOnBack(Function0<Unit> handleOnBack, boolean viewPagerEnabled) {
        Intrinsics.checkNotNullParameter(handleOnBack, "handleOnBack");
        this.dataDetailOverrideOnBack = handleOnBack;
        getBinding().viewPager.setUserInputEnabled(viewPagerEnabled);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.utils.p409ui.fragment.PrimaryFragmentHost
    public InstrumentDetailFragment getCurrentFragment() {
        return findCurrentFragment();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (this.lastAdapterPos != -1) {
            InstrumentDetailListFragmentAdapter instrumentDetailListFragmentAdapter = this.adapter;
            if (instrumentDetailListFragmentAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                instrumentDetailListFragmentAdapter = null;
            }
            int size = instrumentDetailListFragmentAdapter.getSize();
            int i = this.lastAdapterPos;
            if (size > i) {
                setCurrentPosition(i);
            }
        }
        ListItemIdToUserListIdsStore.refresh$default(getListItemIdToUserListIdsStore(), false, 1, null);
        Observable map = this.currentInstrumentRelay.switchMap(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailListParentFragment.onStart.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends List<UUID>> apply(Instrument instrument) {
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                return InstrumentDetailListParentFragment.this.getListItemIdToUserListIdsStore().stream(instrument.getId());
            }
        }).map(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailListParentFragment.onStart.2
            @Override // io.reactivex.functions.Function
            public final Boolean apply(List<UUID> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(!it.isEmpty());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(map), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailListParentFragment$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentDetailListParentFragment.onStart$lambda$10(this.f$0, (Boolean) obj);
            }
        });
        Observables observables = Observables.INSTANCE;
        Observable observableFilterIsPresent = ObservablesKt.filterIsPresent(getInstrumentAccountSwitcherStore().streamActiveAccountNumber());
        BehaviorRelay<Instrument> behaviorRelay = this.currentInstrumentRelay;
        final C153904 c153904 = new PropertyReference1Impl() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailListParentFragment.onStart.4
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((Instrument) obj).getId();
            }
        };
        Observable observableDistinctUntilChanged = behaviorRelay.map(new Function(c153904) { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailListParentFragment$sam$io_reactivex_functions_Function$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(c153904, "function");
                this.function = c153904;
            }

            @Override // io.reactivex.functions.Function
            public final /* synthetic */ Object apply(Object obj) {
                return this.function.invoke(obj);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observables.combineLatest(observableFilterIsPresent, observableDistinctUntilChanged)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailListParentFragment$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentDetailListParentFragment.onStart$lambda$11(this.f$0, (Tuples2) obj);
            }
        });
        if (!this.isShowingEducationTour) {
            ensureTradeBarFragment();
        }
        ensureCuratedListQuickAddFragment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$10(InstrumentDetailListParentFragment instrumentDetailListParentFragment, Boolean bool) {
        if (instrumentDetailListParentFragment.menuItemAddToList != null) {
            MenuItem menuItem = null;
            if (bool.booleanValue()) {
                MenuItem menuItem2 = instrumentDetailListParentFragment.menuItemAddToList;
                if (menuItem2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("menuItemAddToList");
                } else {
                    menuItem = menuItem2;
                }
                menuItem.setIcon(C20690R.drawable.ic_rds_bubble_checked_24dp);
            } else {
                MenuItem menuItem3 = instrumentDetailListParentFragment.menuItemAddToList;
                if (menuItem3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("menuItemAddToList");
                } else {
                    menuItem = menuItem3;
                }
                menuItem.setIcon(C11048R.drawable.svg_ic_action_add_24dp);
            }
        }
        Intrinsics.checkNotNull(bool);
        instrumentDetailListParentFragment.isInstrumentInUserLists = bool.booleanValue();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$11(InstrumentDetailListParentFragment instrumentDetailListParentFragment, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        String str = (String) tuples2.component1();
        UUID uuid = (UUID) tuples2.component2();
        QuickTradeAmountsStore quickTradeAmountsStore = instrumentDetailListParentFragment.getQuickTradeAmountsStore();
        Intrinsics.checkNotNull(uuid);
        quickTradeAmountsStore.refresh(uuid, str);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        UUID uuid = this.instrumentId;
        if (uuid != null) {
            getInstrumentStore().refresh(false, uuid);
            Observable<Instrument> observableTake = getInstrumentStore().getInstrument(uuid).take(1L);
            Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
            LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailListParentFragment$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InstrumentDetailListParentFragment.onResume$lambda$12(this.f$0, (Instrument) obj);
                }
            });
        } else {
            String str = this.instrumentSymbol;
            Intrinsics.checkNotNull(str);
            getInstrumentStore().refreshBySymbol(false, str, false);
            Observable<Instrument> observableTake2 = getInstrumentStore().getInstrumentBySymbol(str).take(1L);
            Intrinsics.checkNotNullExpressionValue(observableTake2, "take(...)");
            LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailListParentFragment$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InstrumentDetailListParentFragment.onResume$lambda$13(this.f$0, (Instrument) obj);
                }
            });
        }
        getOrderStore().refresh(false);
        getDividendStore().refresh(false);
        Observable observableRefCount = ObservablesKt.filterIsPresent(getInstrumentAccountSwitcherStore().streamActiveAccountNumber()).distinctUntilChanged().replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        Observable observableSwitchMap = observableRefCount.switchMap(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailListParentFragment.onResume.3
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Unit> apply(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                InstrumentDetailListParentFragment instrumentDetailListParentFragment = InstrumentDetailListParentFragment.this;
                return instrumentDetailListParentFragment.asObservable(instrumentDetailListParentFragment.getBalancesStore().pollAccount(accountNumber));
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        ScopedObservable.subscribe$default(LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null), null, null, null, 7, null);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableRefCount), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailListParentFragment$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentDetailListParentFragment.onResume$lambda$14(this.f$0, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$12(InstrumentDetailListParentFragment instrumentDetailListParentFragment, Instrument instrument) {
        instrumentDetailListParentFragment.setInstrument(instrument);
        instrumentDetailListParentFragment.onInstrumentLoaded();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$13(InstrumentDetailListParentFragment instrumentDetailListParentFragment, Instrument instrument) {
        instrumentDetailListParentFragment.setInstrument(instrument);
        instrumentDetailListParentFragment.onInstrumentLoaded();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$14(InstrumentDetailListParentFragment instrumentDetailListParentFragment, String str) {
        PositionStore positionStore = instrumentDetailListParentFragment.getPositionStore();
        Intrinsics.checkNotNull(str);
        positionStore.refreshAccount(str, false);
        instrumentDetailListParentFragment.getInvestmentScheduleEventStore().refreshAccountFirstPage(str, false);
        OptionPositionStore.refresh$default(instrumentDetailListParentFragment.getOptionPositionStore(), false, (UUID) null, str, 2, (Object) null);
        AggregateOptionPositionStore.refresh$default(instrumentDetailListParentFragment.getAggregateOptionPositionStore(), false, null, str, 2, null);
        instrumentDetailListParentFragment.getOptionOrderStore().refreshAll(false);
        instrumentDetailListParentFragment.getComboOrderStore().refreshAll(false);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        InstrumentType instrumentType;
        InstrumentDetailTradeBarFragment instrumentDetailTradeBarFragment = this.tradeBarFragment;
        if (instrumentDetailTradeBarFragment != null && instrumentDetailTradeBarFragment.onBackPressed()) {
            return true;
        }
        Function0<Unit> function0 = this.dataDetailOverrideOnBack;
        if (function0 != null) {
            function0.invoke();
            this.dataDetailOverrideOnBack = null;
            getBinding().viewPager.setUserInputEnabled(true);
            return true;
        }
        Instrument instrument = this.instrument;
        if (instrument != null && instrument.isEtp()) {
            instrumentType = InstrumentType.ETF;
        } else {
            instrumentType = InstrumentType.STOCK;
        }
        KeyEventDispatcher.Component activity = getActivity();
        InstrumentDetailListParentCallbacks instrumentDetailListParentCallbacks = activity instanceof InstrumentDetailListParentCallbacks ? (InstrumentDetailListParentCallbacks) activity : null;
        if (instrumentDetailListParentCallbacks != null) {
            instrumentDetailListParentCallbacks.onInstrumentDetailListParentBackPressed(instrumentType);
        }
        return super.onBackPressed();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    protected void createOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.createOptionsMenu(menu, inflater);
        inflater.inflate(C15314R.menu.menu_instrument_detail, menu);
        this.menuItemAlert = menu.findItem(C15314R.id.action_alert);
        this.menuItemAddToList = menu.findItem(C15314R.id.action_add_to_list);
        this.menuItemPip = menu.findItem(C15314R.id.action_picture_in_picture);
        refreshMenu();
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem item) {
        String serverValue;
        UUID id;
        String string2;
        UUID id2;
        Intrinsics.checkNotNullParameter(item, "item");
        int itemId = item.getItemId();
        if (itemId == 16908332) {
            BaseActivity baseActivity = getBaseActivity();
            Intrinsics.checkNotNull(baseActivity);
            Navigator.DefaultImpls.startActivity$default(baseActivity.getNavigator(), baseActivity, new WatchListIntentKey(WatchListIntentKey2.NOT_APPLICABLE), null, false, null, null, 60, null);
            baseActivity.finish();
        } else if (itemId == C15314R.id.action_add_to_list) {
            CuratedListQuickAddFragment curatedListQuickAddFragment = getCuratedListQuickAddFragment();
            Intrinsics.checkNotNull(curatedListQuickAddFragment);
            curatedListQuickAddFragment.setSnackbarContainerRes(Integer.valueOf(C15314R.id.buy_sell_overlay));
            CuratedListQuickAddFragment curatedListQuickAddFragment2 = getCuratedListQuickAddFragment();
            Intrinsics.checkNotNull(curatedListQuickAddFragment2);
            curatedListQuickAddFragment2.setAnchorView(Integer.valueOf(C20649R.id.trades_txt_shadow));
            CuratedListQuickAddFragment curatedListQuickAddFragment3 = getCuratedListQuickAddFragment();
            Intrinsics.checkNotNull(curatedListQuickAddFragment3);
            boolean z = this.isInstrumentInUserLists;
            Instrument instrument = this.instrument;
            Intrinsics.checkNotNull(instrument);
            curatedListQuickAddFragment3.addSelectedItemToCuratedList(z, instrument);
            if (getTradingTrendsDetailsLogging().getDetailsOpen()) {
                getTradingTrendsDetailsLogging().logAddWatchListTap();
            }
        } else if (itemId == C15314R.id.action_picture_in_picture) {
            Instrument instrument2 = this.instrument;
            if (instrument2 == null || (id2 = instrument2.getId()) == null) {
                return true;
            }
            getPipSupportStore().launchPipMode(requireBaseActivity(), new PictureInPictureKey.Instrument(id2));
        } else if (itemId == C15314R.id.action_alert) {
            Instrument instrument3 = this.instrument;
            if (instrument3 != null) {
                Navigator navigator = getNavigator();
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Either.Left leftAsLeft = Either2.asLeft(instrument3);
                GraphSelection graphSelection = this.graphSelection;
                startActivity(Navigator.DefaultImpls.createIntentForFragment$default(navigator, contextRequireContext, new AdvancedAlert(leftAsLeft, true, graphSelection != null ? graphSelection.getInterval() : null, AdvancedAlertEntryPoint.SDP_NAV_BAR_BUTTON), false, false, false, null, false, false, false, false, false, null, false, 8180, null));
            }
            if (getTradingTrendsDetailsLogging().getDetailsOpen()) {
                getTradingTrendsDetailsLogging().logAdvanceAlertTap();
            } else {
                EventLogger eventLogger = getEventLogger();
                Screen.Name name = Screen.Name.STOCK_DETAIL_PAGE;
                Instrument instrument4 = this.instrument;
                String str = (instrument4 == null || (id = instrument4.getId()) == null || (string2 = id.toString()) == null) ? "" : string2;
                InstrumentDetailSource source = getSource();
                EventLogger.DefaultImpls.logTap$default(eventLogger, null, new Screen(name, (source == null || (serverValue = source.getServerValue()) == null) ? "" : serverValue, str, null, 8, null), new Component(Component.ComponentType.BUTTON, "advanced-alerts", null, 4, null), null, null, false, 57, null);
            }
        } else {
            return super.onOptionsItemSelected(item);
        }
        return true;
    }

    static /* synthetic */ void navigateToEquityOrder$default(InstrumentDetailListParentFragment instrumentDetailListParentFragment, EquityOrderSide equityOrderSide, UUID uuid, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            uuid = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        instrumentDetailListParentFragment.navigateToEquityOrder(equityOrderSide, uuid, str);
    }

    private final void navigateToEquityOrder(EquityOrderSide side, UUID instrumentId, String accountNumber) {
        UUID uuid;
        BaseActivity baseActivityRequireBaseActivity = requireBaseActivity();
        if (instrumentId == null) {
            UUID uuid2 = this.instrumentId;
            if (uuid2 == null) {
                return;
            } else {
                uuid = uuid2;
            }
        } else {
            uuid = instrumentId;
        }
        String accountNumber2 = accountNumber == null ? getAccountNumber() : accountNumber;
        if (this.isPreIpo) {
            Navigator.DefaultImpls.startActivity$default(baseActivityRequireBaseActivity.getNavigator(), baseActivityRequireBaseActivity, new EquityOrderActivityIntentKey.PreIpo(uuid, EquityOrderFlowSource.SDP_TRADE_BAR, accountNumber2), null, false, null, null, 60, null);
        } else {
            Navigator.DefaultImpls.startActivity$default(baseActivityRequireBaseActivity.getNavigator(), baseActivityRequireBaseActivity, new EquityOrderActivityIntentKey.WithId(uuid, side, EquityOrderFlowSource.SDP_TRADE_BAR, null, accountNumber2, null, null, false, false, 488, null), null, false, null, null, 60, null);
        }
    }

    @Override // com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarFragment.Callbacks
    public void onInitiateOrder(UUID instrumentId, EquityOrderSide side, String accountNumber) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(side, "side");
        navigateToEquityOrder(side, instrumentId, accountNumber);
    }

    @Override // com.robinhood.android.equitydetail.ui.InstrumentDetailFragment.Callbacks
    public void onGraphLayoutPreDraw(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.loadTimeTrace.stop();
    }

    @Override // com.robinhood.android.equitydetail.ui.InstrumentDetailFragment.Callbacks
    public void onGraphSelectionChanged(GraphSelection newGraphSelection) {
        Intrinsics.checkNotNullParameter(newGraphSelection, "newGraphSelection");
        this.graphSelection = newGraphSelection;
    }

    @Override // com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarFragment.Callbacks
    public void onAnalystReportHintClicked() {
        this.analystOverviewHintRelay.accept(Unit.INSTANCE);
    }

    @Override // com.robinhood.android.educationtour.interfaces.EducationTourCallbacks
    public void onShowEducationTour() {
        this.isShowingEducationTour = true;
        refreshMenu();
        hideTradeBarFragment();
    }

    @Override // com.robinhood.android.educationtour.interfaces.EducationTourCallbacks
    public void onHideEducationTour() {
        this.isShowingEducationTour = false;
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar != null) {
            configureToolbar(rhToolbar);
        }
        requireActivity().invalidateOptionsMenu();
        ensureTradeBarFragment();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        Instrument instrument = this.instrument;
        if (instrument != null) {
            outState.putSerializable("instrumentId", instrument.getId());
            outState.putString(EXTRA_INSTRUMENT_SYMBOL, instrument.getSymbol());
        } else {
            outState.putSerializable("instrumentId", this.instrumentId);
            outState.putString(EXTRA_INSTRUMENT_SYMBOL, this.instrumentSymbol);
        }
    }

    private final void bindAdapter(List<Instrument> data, UUID instrumentId) {
        InstrumentDetailListFragmentAdapter instrumentDetailListFragmentAdapter = this.adapter;
        InstrumentDetailListFragmentAdapter instrumentDetailListFragmentAdapter2 = null;
        if (instrumentDetailListFragmentAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            instrumentDetailListFragmentAdapter = null;
        }
        instrumentDetailListFragmentAdapter.setItems(data);
        RecyclerView.Adapter adapter = getBinding().viewPager.getAdapter();
        InstrumentDetailListFragmentAdapter instrumentDetailListFragmentAdapter3 = this.adapter;
        if (instrumentDetailListFragmentAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            instrumentDetailListFragmentAdapter3 = null;
        }
        if (!Intrinsics.areEqual(adapter, instrumentDetailListFragmentAdapter3)) {
            ViewPager2 viewPager2 = getBinding().viewPager;
            InstrumentDetailListFragmentAdapter instrumentDetailListFragmentAdapter4 = this.adapter;
            if (instrumentDetailListFragmentAdapter4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                instrumentDetailListFragmentAdapter2 = instrumentDetailListFragmentAdapter4;
            }
            viewPager2.setAdapter(instrumentDetailListFragmentAdapter2);
        }
        Iterator<Instrument> it = data.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.areEqual(it.next().getId(), instrumentId)) {
                break;
            } else {
                i++;
            }
        }
        int iCoerceAtLeast = RangesKt.coerceAtLeast(i, 0);
        if (iCoerceAtLeast == getBinding().viewPager.getCurrentItem()) {
            this.pageChangedRelay.accept(Unit.INSTANCE);
        } else {
            getBinding().viewPager.setCurrentItem(iCoerceAtLeast, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InstrumentDetailFragment findCurrentFragment() {
        InstrumentDetailListFragmentAdapter instrumentDetailListFragmentAdapter = this.adapter;
        Object obj = null;
        if (instrumentDetailListFragmentAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            instrumentDetailListFragmentAdapter = null;
        }
        if (instrumentDetailListFragmentAdapter.getSize() == 0) {
            return null;
        }
        int currentItem = getBinding().viewPager.getCurrentItem();
        InstrumentDetailListFragmentAdapter instrumentDetailListFragmentAdapter2 = this.adapter;
        if (instrumentDetailListFragmentAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            instrumentDetailListFragmentAdapter2 = null;
        }
        Instrument item = instrumentDetailListFragmentAdapter2.getItem(currentItem);
        List<Fragment> fragments = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        Sequence sequenceFilter = SequencesKt.filter(CollectionsKt.asSequence(fragments), new Function1<Object, Boolean>() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailListParentFragment$findCurrentFragment$$inlined$filterIsInstance$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj2) {
                return Boolean.valueOf(obj2 instanceof InstrumentDetailFragment);
            }
        });
        Intrinsics.checkNotNull(sequenceFilter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        Iterator itIterator2 = sequenceFilter.iterator2();
        while (true) {
            if (!itIterator2.hasNext()) {
                break;
            }
            Object next = itIterator2.next();
            if (Intrinsics.areEqual(((InstrumentDetailFragment) next).getInstrument().getId(), item.getId())) {
                obj = next;
                break;
            }
        }
        return (InstrumentDetailFragment) obj;
    }

    private final void ensureTradeBarFragment() {
        String string2;
        UUID id;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        if (this.tradeBarFragment != null || childFragmentManager.isStateSaved()) {
            return;
        }
        Fragment fragmentFindFragmentByTag = childFragmentManager.findFragmentByTag(OVERLAY_TAG);
        InstrumentDetailTradeBarFragment instrumentDetailTradeBarFragment = fragmentFindFragmentByTag instanceof InstrumentDetailTradeBarFragment ? (InstrumentDetailTradeBarFragment) fragmentFindFragmentByTag : null;
        this.tradeBarFragment = instrumentDetailTradeBarFragment;
        if (instrumentDetailTradeBarFragment == null) {
            InstrumentDetailTradeBarFragment instrumentDetailTradeBarFragment2 = (InstrumentDetailTradeBarFragment) InstrumentDetailTradeBarFragment.INSTANCE.newInstance((Parcelable) new InstrumentDetailTradeBarFragment.Args(getAccountNumber(), false, 2, null));
            this.tradeBarFragment = instrumentDetailTradeBarFragment2;
            Intrinsics.checkNotNull(instrumentDetailTradeBarFragment2);
            childFragmentManager.beginTransaction().add(C15314R.id.fragment_container, instrumentDetailTradeBarFragment2, OVERLAY_TAG).commitNow();
            Instrument instrument = this.instrument;
            if (instrument != null) {
                instrumentDetailTradeBarFragment2.bindInstrument(instrument);
            }
        }
        Instrument instrument2 = this.instrument;
        InstrumentDetailTradeBarFragment instrumentDetailTradeBarFragment3 = this.tradeBarFragment;
        if (instrumentDetailTradeBarFragment3 != null) {
            Screen.Name name = Screen.Name.STOCK_DETAIL_PAGE;
            if (instrument2 == null || (id = instrument2.getId()) == null || (string2 = id.toString()) == null) {
                string2 = "";
            }
            instrumentDetailTradeBarFragment3.setAnalyticsData(new AnalyticsData(new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -1, 16383, null), new Screen(name, null, string2, null, 10, null)));
        }
        InstrumentDetailTradeBarFragment instrumentDetailTradeBarFragment4 = this.tradeBarFragment;
        Intrinsics.checkNotNull(instrumentDetailTradeBarFragment4);
        LifecycleHost.DefaultImpls.bind$default(this, instrumentDetailTradeBarFragment4.footerHeight(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C153821(this.footerHeightSubject));
    }

    /* compiled from: InstrumentDetailListParentFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equitydetail.ui.InstrumentDetailListParentFragment$ensureTradeBarFragment$1 */
    /* synthetic */ class C153821 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
        C153821(Object obj) {
            super(1, obj, BehaviorSubject.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke2(num);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Integer p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((BehaviorSubject) this.receiver).onNext(p0);
        }
    }

    private final void hideTradeBarFragment() {
        InstrumentDetailTradeBarFragment instrumentDetailTradeBarFragment = this.tradeBarFragment;
        if (instrumentDetailTradeBarFragment != null) {
            getChildFragmentManager().beginTransaction().setCustomAnimations(C14469R.anim.slide_in_bottom, C14469R.anim.slide_out_bottom).remove(instrumentDetailTradeBarFragment).commitNowAllowingStateLoss();
            this.tradeBarFragment = null;
            this.footerHeightSubject.onNext(0);
        }
    }

    private final void ensureCuratedListQuickAddFragment() {
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        if (getCuratedListQuickAddFragment() != null || childFragmentManager.isStateSaved()) {
            return;
        }
        childFragmentManager.beginTransaction().add(CuratedListQuickAddFragment.Companion.newInstance$default(CuratedListQuickAddFragment.INSTANCE, false, new Screen(Screen.Name.STOCK_DETAIL_PAGE, null, null, null, 14, null), 1, null), "quickAddFragment").commit();
    }

    private final void onInstrumentLoaded() {
        final Instrument instrument = this.instrument;
        Intrinsics.checkNotNull(instrument);
        getBreadcrumbTracker().removeBreadcrumb(getScreenName());
        getBreadcrumbTracker().addBreadcrumb(Breadcrumbs2.createBreadcrumb(this, SupportBreadcrumbType.INVESTING_STOCKS_HOLDING, instrument.getId()));
        refreshMenu();
        this.isPreIpo = false;
        this.isPreIpoDisposable.clear();
        disposable.plusAssign(this.isPreIpoDisposable, LifecycleHost.DefaultImpls.bind$default(this, asObservable(getStockDetailStore().isPreIpo(instrument.getId())), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailListParentFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentDetailListParentFragment.onInstrumentLoaded$lambda$21(this.f$0, ((Boolean) obj).booleanValue());
            }
        }));
        Observable<List<Instrument>> observableFilter = this.instrumentsRelay.take(1L).filter(new Predicate() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailListParentFragment.onInstrumentLoaded.2
            @Override // io.reactivex.functions.Predicate
            public final boolean test(List<Instrument> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.isEmpty();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFilter, "filter(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableFilter), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailListParentFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentDetailListParentFragment.onInstrumentLoaded$lambda$22(this.f$0, instrument, (List) obj);
            }
        });
        if (getHasShownFractionalNux()) {
            return;
        }
        Single<R> singleFlatMap = Single.timer(2L, TimeUnit.SECONDS).flatMap(new Function() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailListParentFragment.onInstrumentLoaded.4
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Boolean> apply(Long it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return InstrumentDetailListParentFragment.this.getEquityDetailNuxStore().shouldShowEquityDetailNux(instrument);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, SinglesAndroid.observeOnMainThread(singleFlatMap), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailListParentFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentDetailListParentFragment.onInstrumentLoaded$lambda$23(instrument, this, (Boolean) obj);
            }
        });
        setHasShownFractionalNux(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInstrumentLoaded$lambda$21(InstrumentDetailListParentFragment instrumentDetailListParentFragment, boolean z) {
        instrumentDetailListParentFragment.isPreIpo = z;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInstrumentLoaded$lambda$22(InstrumentDetailListParentFragment instrumentDetailListParentFragment, Instrument instrument, List list) {
        InstrumentDetailListFragmentAdapter instrumentDetailListFragmentAdapter = instrumentDetailListParentFragment.adapter;
        if (instrumentDetailListFragmentAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            instrumentDetailListFragmentAdapter = null;
        }
        if (instrumentDetailListFragmentAdapter.getSize() == 0) {
            List<Instrument> listListOf = CollectionsKt.listOf(instrument);
            UUID uuid = instrumentDetailListParentFragment.instrumentId;
            Intrinsics.checkNotNull(uuid);
            instrumentDetailListParentFragment.bindAdapter(listListOf, uuid);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInstrumentLoaded$lambda$23(Instrument instrument, InstrumentDetailListParentFragment instrumentDetailListParentFragment, Boolean bool) {
        if (bool.booleanValue()) {
            FractionalNuxBottomSheetFragment fractionalNuxBottomSheetFragmentNewInstance = FractionalNuxBottomSheetFragment.INSTANCE.newInstance(instrument.getSymbol(), instrument.getId());
            FragmentManager childFragmentManager = instrumentDetailListParentFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            fractionalNuxBottomSheetFragmentNewInstance.show(childFragmentManager, FRACTIONAL_NUX_TAG);
        }
        return Unit.INSTANCE;
    }

    private final void refreshMenu() {
        String serverValue;
        MenuItem menuItem = this.menuItemAddToList;
        if (menuItem == null) {
            return;
        }
        MenuItem menuItem2 = null;
        if (menuItem == null) {
            Intrinsics.throwUninitializedPropertyAccessException("menuItemAddToList");
            menuItem = null;
        }
        menuItem.setVisible((this.instrument == null || this.isShowingEducationTour) ? false : true);
        if (this.isInstrumentInUserLists) {
            MenuItem menuItem3 = this.menuItemAddToList;
            if (menuItem3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("menuItemAddToList");
                menuItem3 = null;
            }
            menuItem3.setIcon(C20690R.drawable.ic_rds_bubble_checked_24dp);
        } else {
            MenuItem menuItem4 = this.menuItemAddToList;
            if (menuItem4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("menuItemAddToList");
                menuItem4 = null;
            }
            menuItem4.setIcon(C11048R.drawable.svg_ic_action_add_24dp);
        }
        MenuItem menuItem5 = this.menuItemAddToList;
        if (menuItem5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("menuItemAddToList");
            menuItem5 = null;
        }
        if (menuItem5.isVisible()) {
            Set<UUID> set = this.sentListAddAppearAnalytics;
            Instrument instrument = this.instrument;
            Intrinsics.checkNotNull(instrument);
            if (!set.contains(instrument.getId())) {
                Set<UUID> set2 = this.sentListAddAppearAnalytics;
                Instrument instrument2 = this.instrument;
                Intrinsics.checkNotNull(instrument2);
                set2.add(instrument2.getId());
                AnalyticsLogger analytics = getAnalytics();
                Instrument instrument3 = this.instrument;
                Intrinsics.checkNotNull(instrument3);
                AnalyticsLogger.DefaultImpls.logButtonGroupAppear$default(analytics, AnalyticsStrings.BUTTON_GROUP_STOCK_DETAIL_ACTIONS, "add_item_to_list", null, null, instrument3.getId().toString(), null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE, null);
            }
        }
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C153931(null), 3, null);
        MenuItem menuItem6 = this.menuItemAlert;
        if (menuItem6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("menuItemAlert");
        } else {
            menuItem2 = menuItem6;
        }
        menuItem2.setVisible(!this.isShowingEducationTour);
        Instrument instrument4 = this.instrument;
        if (instrument4 == null || instrument4 == null) {
            return;
        }
        LogOnceEventLogger logOnceEventLogger = getLogOnceEventLogger();
        String string2 = instrument4.getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        Screen.Name name = Screen.Name.STOCK_DETAIL_PAGE;
        String string3 = instrument4.getId().toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        InstrumentDetailSource source = getSource();
        if (source == null || (serverValue = source.getServerValue()) == null) {
            serverValue = "";
        }
        LogOnceEventLogger.logAppear$default(logOnceEventLogger, string2, null, new Screen(name, serverValue, string3, null, 8, null), new Component(Component.ComponentType.BUTTON, "advanced-alerts", null, 4, null), null, 18, null);
    }

    /* compiled from: InstrumentDetailListParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.InstrumentDetailListParentFragment$refreshMenu$1", m3645f = "InstrumentDetailListParentFragment.kt", m3646l = {911}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitydetail.ui.InstrumentDetailListParentFragment$refreshMenu$1 */
    static final class C153931 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C153931(Continuation<? super C153931> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InstrumentDetailListParentFragment.this.new C153931(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C153931) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(InstrumentDetailListParentFragment.this.getPipSupportStore().streamIsInPipExperiment());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(InstrumentDetailListParentFragment.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: InstrumentDetailListParentFragment.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "pipAllowed", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.InstrumentDetailListParentFragment$refreshMenu$1$1", m3645f = "InstrumentDetailListParentFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitydetail.ui.InstrumentDetailListParentFragment$refreshMenu$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ InstrumentDetailListParentFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(InstrumentDetailListParentFragment instrumentDetailListParentFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = instrumentDetailListParentFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    boolean z = this.Z$0;
                    MenuItem menuItem = this.this$0.menuItemPip;
                    if (menuItem == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("menuItemPip");
                        menuItem = null;
                    }
                    menuItem.setVisible(z);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    private final void setCurrentPosition(int position) {
        this.lastAdapterPos = position;
        InstrumentDetailListFragmentAdapter instrumentDetailListFragmentAdapter = this.adapter;
        if (instrumentDetailListFragmentAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            instrumentDetailListFragmentAdapter = null;
        }
        setInstrument(instrumentDetailListFragmentAdapter.getItem(position));
        Instrument instrument = this.instrument;
        Intrinsics.checkNotNull(instrument);
        this.currentPageInstrumentId = instrument.getId();
        onInstrumentLoaded();
    }

    private final void logPageSwipeAction() {
        InstrumentDetailListFragmentAdapter instrumentDetailListFragmentAdapter = this.adapter;
        InstrumentDetailListFragmentAdapter instrumentDetailListFragmentAdapter2 = null;
        if (instrumentDetailListFragmentAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            instrumentDetailListFragmentAdapter = null;
        }
        if (instrumentDetailListFragmentAdapter.getSize() == 0) {
            return;
        }
        InstrumentDetailListFragmentAdapter instrumentDetailListFragmentAdapter3 = this.adapter;
        if (instrumentDetailListFragmentAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            instrumentDetailListFragmentAdapter2 = instrumentDetailListFragmentAdapter3;
        }
        AnalyticsLogger.DefaultImpls.logUserAction$default(getAnalytics(), AnalyticsStrings.USER_ACTION_SWIPE_STOCK_DETAIL, "swipe", instrumentDetailListFragmentAdapter2.getItem(getBinding().viewPager.getCurrentItem()).getId().toString(), null, 8, null);
    }

    /* compiled from: InstrumentDetailListParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0002J8\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001d2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/InstrumentDetailListParentFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$EquityInstrumentDetail;", "<init>", "()V", "TRACE_NAME", "", "OVERLAY_TAG", "FRACTIONAL_NUX_TAG", "QUICK_ADD_TAG", "FRACTIONAL_NUX_DELAY_SECONDS", "", "EXTRA_INSTRUMENT_ID", "EXTRA_INSTRUMENT_SYMBOL", "EXTRA_SOURCE", "EXTRA_WATCHED_INSTRUMENTS", "EXTRA_INSTRUMENT_IDS", "EXTRA_ACCOUNT_NUMBER", "TRADING_TRENDS_DEEPLINK", "newInstanceWithSymbol", "Lcom/robinhood/android/equitydetail/ui/InstrumentDetailListParentFragment;", "symbol", "source", "Lcom/robinhood/android/navigation/app/keys/data/InstrumentDetailSource;", "accountNumber", "newInstanceWithInstrumentIds", "instrumentId", "Ljava/util/UUID;", InstrumentDetailListParentFragment.EXTRA_INSTRUMENT_IDS, "", InstrumentDetailListParentFragment.TRADING_TRENDS_DEEPLINK, "", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements FragmentResolver<LegacyFragmentKey.EquityInstrumentDetail> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final InstrumentDetailListParentFragment newInstanceWithSymbol(String symbol, InstrumentDetailSource source, String accountNumber) {
            InstrumentDetailListParentFragment instrumentDetailListParentFragment = new InstrumentDetailListParentFragment();
            Bundle bundle = new Bundle();
            bundle.putString(InstrumentDetailListParentFragment.EXTRA_INSTRUMENT_SYMBOL, symbol);
            Bundles.putParcelableList(bundle, InstrumentDetailListParentFragment.EXTRA_WATCHED_INSTRUMENTS, CollectionsKt.emptyList());
            Bundles.putSerializableList(bundle, InstrumentDetailListParentFragment.EXTRA_INSTRUMENT_IDS, CollectionsKt.emptyList());
            bundle.putSerializable("source", source);
            bundle.putString("accountNumber", accountNumber);
            instrumentDetailListParentFragment.setArguments(bundle);
            return instrumentDetailListParentFragment;
        }

        private final InstrumentDetailListParentFragment newInstanceWithInstrumentIds(final UUID instrumentId, List<UUID> instrumentIds, InstrumentDetailSource source, String accountNumber, boolean tradingTrendsDeeplink) {
            List listTruncateAroundTarget = Lists4.truncateAroundTarget(instrumentIds, 50, new Function1() { // from class: com.robinhood.android.equitydetail.ui.InstrumentDetailListParentFragment$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(InstrumentDetailListParentFragment.Companion.newInstanceWithInstrumentIds$lambda$1(instrumentId, (UUID) obj));
                }
            });
            InstrumentDetailListParentFragment instrumentDetailListParentFragment = new InstrumentDetailListParentFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("instrumentId", instrumentId);
            Bundles.putParcelableList(bundle, InstrumentDetailListParentFragment.EXTRA_WATCHED_INSTRUMENTS, CollectionsKt.emptyList());
            Bundles.putSerializableList(bundle, InstrumentDetailListParentFragment.EXTRA_INSTRUMENT_IDS, listTruncateAroundTarget);
            bundle.putSerializable("source", source);
            bundle.putString("accountNumber", accountNumber);
            bundle.putBoolean(InstrumentDetailListParentFragment.TRADING_TRENDS_DEEPLINK, tradingTrendsDeeplink);
            instrumentDetailListParentFragment.setArguments(bundle);
            return instrumentDetailListParentFragment;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean newInstanceWithInstrumentIds$lambda$1(UUID uuid, UUID id) {
            Intrinsics.checkNotNullParameter(id, "id");
            return Intrinsics.areEqual(id, uuid);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.EquityInstrumentDetail key) {
            Intrinsics.checkNotNullParameter(key, "key");
            if (key.getId() != null) {
                UUID id = key.getId();
                Intrinsics.checkNotNull(id);
                return newInstanceWithInstrumentIds(id, key.getInstrumentIds(), key.getSource(), key.getAccountNumber(), key.getOpenTradingTrendsDetails());
            }
            String symbol = key.getSymbol();
            Intrinsics.checkNotNull(symbol);
            return newInstanceWithSymbol(symbol, key.getSource(), key.getAccountNumber());
        }
    }
}
