package com.robinhood.android.search.newsfeed.view;

import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.core.view.ViewGroup2;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.p014ui.PlayerView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.jakewharton.rxbinding3.recyclerview.RecyclerViewScrollEvent;
import com.jakewharton.rxbinding3.recyclerview.RxRecyclerView;
import com.jakewharton.rxbinding3.swiperefreshlayout.SwipeRefreshLayoutRefreshObservable2;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.assethomes.AssetHomeTopAppBar;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.AutoLoggingConfig;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.VisibleAutoLoggableViewManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.data.prefs.VideoAutoplaySettingPref;
import com.robinhood.android.common.data.prefs.VideoAutoplaySettingPref2;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ScrollableLayoutManager;
import com.robinhood.android.common.p088ui.tabs.Scrollable;
import com.robinhood.android.common.p088ui.view.FragmentContainerLayout;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.p088ui.view.TopNavButtonView;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.VisibleItemsManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.transition.ToolbarScrollAnimator;
import com.robinhood.android.common.view.ErrorView;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.education.contracts.NewsFeed;
import com.robinhood.android.history.p153ui.MerchantRewardDetailComposable;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource;
import com.robinhood.android.newsfeed.extensions.LoggedCustomTabs2;
import com.robinhood.android.newsfeed.model.Content;
import com.robinhood.android.newsfeed.model.Element;
import com.robinhood.android.newsfeed.model.RelatedAsset;
import com.robinhood.android.newsfeed.model.RelatedInstrument;
import com.robinhood.android.newsfeed.util.NewsFeedAnalytics;
import com.robinhood.android.newsfeed.view.util.LoggedCustomTabs;
import com.robinhood.android.search.C27909R;
import com.robinhood.android.search.contracts.SearchFragmentKey;
import com.robinhood.android.search.contracts.SnacksWebViewFragmentKey;
import com.robinhood.android.search.newsfeed.NewsFeedDuxo;
import com.robinhood.android.search.newsfeed.NewsFeedViewState;
import com.robinhood.android.search.newsfeed.videoplayer.NewsFeedVideoView;
import com.robinhood.android.search.newsfeed.videoplayer.extensions.ExoPlayers;
import com.robinhood.android.search.newsfeed.videoplayer.mux.MuxWrapper;
import com.robinhood.android.search.newsfeed.view.NewsFeedElementAdapter;
import com.robinhood.android.search.newsfeed.view.NewsFeedHeaderView;
import com.robinhood.android.search.newsfeed.view.util.DummyErrorMessageProvider;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.iac.crosssell.CrossSellLaunchManager;
import com.robinhood.models.p320db.IacAlertSheetLocation;
import com.robinhood.models.p320db.IacInfoBanner;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.prefs.StringPreference;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.shared.common.contracts.RhEmbeddedWebViewFragmentKey;
import com.robinhood.shared.iac.extensions.IacInfoBanners;
import com.robinhood.shared.iac.infobanner.InfoBannerCallbacks;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLessonPreview;
import com.robinhood.shared.user.agent.UserAgentProvider;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.Contexts8;
import com.robinhood.utils.extensions.HttpUrl2;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.CompositeAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.SingleItemAdapter;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import okhttp3.HttpUrl;
import org.json.JSONException;

/* compiled from: NewsFeedFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0084\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 Õ\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002Õ\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u008f\u0001\u001a\u00030\u0090\u00012\b\u0010\u0091\u0001\u001a\u00030\u0092\u0001H\u0016J\u0016\u0010\u0093\u0001\u001a\u00030\u0090\u00012\n\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0095\u0001H\u0016J\u001f\u0010\u0096\u0001\u001a\u00030\u0090\u00012\u0007\u0010\u0097\u0001\u001a\u00020X2\n\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0095\u0001H\u0016J\n\u0010\u0098\u0001\u001a\u00030\u0090\u0001H\u0016J\u0014\u0010\u0099\u0001\u001a\u00030\u0090\u00012\b\u0010\u009a\u0001\u001a\u00030\u009b\u0001H\u0016J\u0014\u0010\u009c\u0001\u001a\u00030\u0090\u00012\b\u0010\u009d\u0001\u001a\u00030\u009e\u0001H\u0002J\n\u0010\u009f\u0001\u001a\u00030\u0090\u0001H\u0002J\t\u0010 \u0001\u001a\u000203H\u0002J\u0014\u0010¡\u0001\u001a\u0004\u0018\u00010>2\u0007\u0010¢\u0001\u001a\u000203H\u0002J\n\u0010£\u0001\u001a\u00030\u0090\u0001H\u0016J\n\u0010¤\u0001\u001a\u00030\u0090\u0001H\u0016J\n\u0010¥\u0001\u001a\u00030\u0090\u0001H\u0016J\n\u0010¦\u0001\u001a\u00030\u0090\u0001H\u0016J'\u0010«\u0001\u001a\u00030\u0090\u00012\b\u0010¬\u0001\u001a\u00030\u00ad\u00012\b\u0010®\u0001\u001a\u00030¯\u00012\u0007\u0010°\u0001\u001a\u000203H\u0016J\u001d\u0010±\u0001\u001a\u00030\u0090\u00012\b\u0010¬\u0001\u001a\u00030²\u00012\u0007\u0010³\u0001\u001a\u000203H\u0016J\u001d\u0010´\u0001\u001a\u00030\u0090\u00012\b\u0010¬\u0001\u001a\u00030²\u00012\u0007\u0010³\u0001\u001a\u000203H\u0016J\u001d\u0010µ\u0001\u001a\u00030\u0090\u00012\b\u0010¬\u0001\u001a\u00030\u00ad\u00012\u0007\u0010°\u0001\u001a\u000203H\u0016J\u001d\u0010¶\u0001\u001a\u00030\u0090\u00012\b\u0010¬\u0001\u001a\u00030\u00ad\u00012\u0007\u0010°\u0001\u001a\u000203H\u0002J\u0014\u0010·\u0001\u001a\u00030\u0090\u00012\b\u0010¬\u0001\u001a\u00030\u00ad\u0001H\u0016J\u0014\u0010¸\u0001\u001a\u00030\u0090\u00012\b\u0010¬\u0001\u001a\u00030\u00ad\u0001H\u0016J\u001d\u0010¹\u0001\u001a\u00030\u0090\u00012\b\u0010¬\u0001\u001a\u00030\u00ad\u00012\u0007\u0010º\u0001\u001a\u00020DH\u0016J\u0014\u0010»\u0001\u001a\u00030\u0090\u00012\b\u0010¬\u0001\u001a\u00030¼\u0001H\u0016J\u0014\u0010½\u0001\u001a\u00030\u0090\u00012\b\u0010¬\u0001\u001a\u00030¼\u0001H\u0016J\u001b\u0010¾\u0001\u001a\u00030\u0090\u00012\u000f\u0010¿\u0001\u001a\n\u0012\u0005\u0012\u00030Á\u00010À\u0001H\u0016J\n\u0010Â\u0001\u001a\u00030\u0090\u0001H\u0016J\n\u0010Ã\u0001\u001a\u00030\u0090\u0001H\u0016J\u0014\u0010Ä\u0001\u001a\u00030\u0090\u00012\b\u0010Å\u0001\u001a\u00030Æ\u0001H\u0002J\u0014\u0010Ç\u0001\u001a\u00030\u0090\u00012\b\u0010È\u0001\u001a\u00030É\u0001H\u0002J\u0013\u0010Ê\u0001\u001a\u00030\u0090\u00012\u0007\u0010Ë\u0001\u001a\u00020oH\u0002J\n\u0010Ì\u0001\u001a\u00030\u0090\u0001H\u0002J\n\u0010Í\u0001\u001a\u00030\u0090\u0001H\u0002J\u0016\u0010Î\u0001\u001a\u00030\u0090\u00012\n\u0010Ï\u0001\u001a\u0005\u0018\u00010Ð\u0001H\u0002J\n\u0010Ñ\u0001\u001a\u00030\u0090\u0001H\u0002J\u0014\u0010Ò\u0001\u001a\u00030\u0090\u00012\b\u0010Ó\u0001\u001a\u00030Ð\u0001H\u0016J\u0014\u0010Ô\u0001\u001a\u00030\u0090\u00012\b\u0010Ó\u0001\u001a\u00030Ð\u0001H\u0016R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u00020!8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010&\u001a\u00020'8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001b\u0010,\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b.\u0010/R\u0014\u00102\u001a\u0002038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u001b\u00106\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u00101\u001a\u0004\b8\u00109R\u0010\u0010;\u001a\u0004\u0018\u00010<X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010=\u001a\u0004\u0018\u00010>X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020@X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010A\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020D0BX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020FX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010G\u001a\u00020H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bI\u0010JR\u001b\u0010M\u001a\u00020N8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010L\u001a\u0004\bO\u0010PR\u001b\u0010R\u001a\u00020S8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010L\u001a\u0004\bT\u0010UR\u001b\u0010W\u001a\u00020X8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b[\u0010L\u001a\u0004\bY\u0010ZR\u001b\u0010\\\u001a\u00020]8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b`\u0010L\u001a\u0004\b^\u0010_R\u001d\u0010a\u001a\u0004\u0018\u00010b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\be\u0010L\u001a\u0004\bc\u0010dR\u001d\u0010f\u001a\u0004\u0018\u00010X8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bh\u0010L\u001a\u0004\bg\u0010ZR\u001d\u0010i\u001a\u0004\u0018\u00010j8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bm\u0010L\u001a\u0004\bk\u0010lR\u000e\u0010n\u001a\u00020oX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010p\u001a\u000e\u0012\u0004\u0012\u00020r\u0012\u0004\u0012\u00020s0qX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010t\u001a\u000e\u0012\u0004\u0012\u00020v\u0012\u0004\u0012\u0002030uX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010w\u001a\u00020xX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010y\u001a\u00020zX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010{\u001a\u0004\u0018\u00010|X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010}\u001a\u00020~8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0081\u0001\u00101\u001a\u0005\b\u007f\u0010\u0080\u0001R\u001d\u0010\u0082\u0001\u001a\u0010\u0012\u0004\u0012\u00020C\u0012\u0005\u0012\u00030\u0084\u00010\u0083\u0001X\u0082.¢\u0006\u0002\n\u0000R\u001d\u0010\u0085\u0001\u001a\u0010\u0012\u0004\u0012\u00020C\u0012\u0005\u0012\u00030\u0084\u00010\u0086\u0001X\u0082.¢\u0006\u0002\n\u0000R\u0016\u0010\u0087\u0001\u001a\u000203X\u0096D¢\u0006\t\n\u0000\u001a\u0005\b\u0088\u0001\u00105R\u0016\u0010\u0089\u0001\u001a\u0002038VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u00105R\u0018\u0010\u008b\u0001\u001a\u00030\u008c\u0001X\u0096\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0018\u0010§\u0001\u001a\u00030¨\u0001X\u0096D¢\u0006\n\n\u0000\u001a\u0006\b©\u0001\u0010ª\u0001¨\u0006Ö\u0001"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/view/NewsFeedFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/search/newsfeed/view/NewsFeedElementAdapter$Callbacks;", "Lcom/robinhood/android/common/ui/tabs/Scrollable;", "Lcom/robinhood/shared/iac/infobanner/InfoBannerCallbacks;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "loggedCustomTabs", "Lcom/robinhood/android/newsfeed/view/util/LoggedCustomTabs;", "getLoggedCustomTabs", "()Lcom/robinhood/android/newsfeed/view/util/LoggedCustomTabs;", "setLoggedCustomTabs", "(Lcom/robinhood/android/newsfeed/view/util/LoggedCustomTabs;)V", "userAgentProvider", "Lcom/robinhood/shared/user/agent/UserAgentProvider;", "getUserAgentProvider", "()Lcom/robinhood/shared/user/agent/UserAgentProvider;", "setUserAgentProvider", "(Lcom/robinhood/shared/user/agent/UserAgentProvider;)V", "crossSellLaunchManager", "Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "getCrossSellLaunchManager", "()Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "setCrossSellLaunchManager", "(Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;)V", "autoplaySettingPref", "Lcom/robinhood/prefs/StringPreference;", "getAutoplaySettingPref", "()Lcom/robinhood/prefs/StringPreference;", "setAutoplaySettingPref", "(Lcom/robinhood/prefs/StringPreference;)V", "newsFeedAnalytics", "Lcom/robinhood/android/newsfeed/util/NewsFeedAnalytics;", "getNewsFeedAnalytics", "()Lcom/robinhood/android/newsfeed/util/NewsFeedAnalytics;", "newsFeedAnalytics$delegate", "Lkotlin/Lazy;", "hideSearch", "", "getHideSearch", "()Z", "duxo", "Lcom/robinhood/android/search/newsfeed/NewsFeedDuxo;", "getDuxo", "()Lcom/robinhood/android/search/newsfeed/NewsFeedDuxo;", "duxo$delegate", "playerView", "Landroidx/media3/ui/PlayerView;", "autoplayingVideoView", "Lcom/robinhood/android/search/newsfeed/videoplayer/NewsFeedVideoView;", "videoAudioVolume", "", "videoContentIdToPlaybackPositionMap", "", "Ljava/util/UUID;", "", "muxWrapper", "Lcom/robinhood/android/search/newsfeed/videoplayer/mux/MuxWrapper;", "errorView", "Lcom/robinhood/android/common/view/ErrorView;", "getErrorView", "()Lcom/robinhood/android/common/view/ErrorView;", "errorView$delegate", "Lkotlin/properties/ReadOnlyProperty;", "swipeRefreshView", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "getSwipeRefreshView", "()Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "swipeRefreshView$delegate", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView$delegate", "searchToolbarContainer", "Landroid/view/View;", "getSearchToolbarContainer", "()Landroid/view/View;", "searchToolbarContainer$delegate", "searchToolbarEditText", "Landroid/widget/EditText;", "getSearchToolbarEditText", "()Landroid/widget/EditText;", "searchToolbarEditText$delegate", "topInfoBannerView", "Lcom/robinhood/android/designsystem/banner/RdsInfoBannerView;", "getTopInfoBannerView", "()Lcom/robinhood/android/designsystem/banner/RdsInfoBannerView;", "topInfoBannerView$delegate", "headerTextContainerLayout", "getHeaderTextContainerLayout", "headerTextContainerLayout$delegate", "rootContainer", "Landroid/widget/FrameLayout;", "getRootContainer", "()Landroid/widget/FrameLayout;", "rootContainer$delegate", "searchToolbarOffset", "", "headerAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/SingleItemAdapter;", "Lcom/robinhood/android/search/newsfeed/view/NewsFeedHeaderView;", "Lcom/robinhood/android/search/newsfeed/view/NewsFeedHeaderView$Data;", "loadingAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/search/newsfeed/view/NewsFeedLoadingView;", "elementAdapter", "Lcom/robinhood/android/search/newsfeed/view/NewsFeedElementAdapter;", "compositeAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/CompositeAdapter;", "scrollableLayoutManager", "Lcom/robinhood/android/common/ui/ScrollableLayoutManager;", "toolbarScrollAnimator", "Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "getToolbarScrollAnimator", "()Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "toolbarScrollAnimator$delegate", "visibleItemsManager", "Lcom/robinhood/android/common/util/VisibleItemsManager;", "Lcom/robinhood/android/newsfeed/model/Element;", "visibleAutoLoggableViewManager", "Lcom/robinhood/android/autoeventlogging/VisibleAutoLoggableViewManager;", "useDesignSystemToolbar", "getUseDesignSystemToolbar", "toolbarVisible", "getToolbarVisible", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "onDestroy", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "updateAutoplayVideo", "event", "Lcom/jakewharton/rxbinding3/recyclerview/RecyclerViewScrollEvent;", "resetAutoplayingVideoView", "shouldAutoplay", "findVideoView", "scrollingDown", "onStart", "onResume", "onStop", "onDestroyView", "screenName", "", "getScreenName", "()Ljava/lang/String;", "onContentRelatedInstrumentClick", "content", "Lcom/robinhood/android/newsfeed/model/Content;", "instrument", "Lcom/robinhood/android/newsfeed/model/RelatedInstrument;", "inCarousel", "onToggleVideoAudioClick", "Lcom/robinhood/android/newsfeed/model/Content$Video;", "enabled", "onToggleVideoAudioAppear", "onContentClick", "handleContentClick", "onCarouselContentAppear", "onCarouselContentClick", "onCarouselContentDisappear", "durationVisible", "onListsChipContentAppear", "Lcom/robinhood/android/newsfeed/model/Content$ListPreview;", "onListsChipContentClick", "onEducationLessonsAppear", "lessons", "", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLessonPreview;", "onEducationHomeEntryPointClick", "scrollToTop", "initVisibleViewManagers", "linearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "updateViewState", "viewState", "Lcom/robinhood/android/search/newsfeed/NewsFeedViewState;", "scrollToTarget", "targetIndex", "showSearch", "updateSearchToolbarContainer", "bindIacInfoBanner", "infoBanner", "Lcom/robinhood/models/db/IacInfoBanner;", "updateSearchBarPosition", "onClickInfoBanner", MerchantRewardDetailComposable.BANNER_TEST_TAG, "onDismissInfoBanner", "Companion", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class NewsFeedFragment extends BaseFragment implements NewsFeedElementAdapter.Callbacks, Scrollable, InfoBannerCallbacks, AutoLoggableFragment {
    public static final int $stable = 0;
    private static final String ANALYTICS_PREFIX = "browse";
    private static final String PLAYER_NAME = "news-feed";
    public AnalyticsLogger analytics;

    @VideoAutoplaySettingPref
    public StringPreference autoplaySettingPref;
    private NewsFeedVideoView autoplayingVideoView;
    private final CompositeAdapter compositeAdapter;
    public CrossSellLaunchManager crossSellLaunchManager;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final NewsFeedElementAdapter elementAdapter;

    /* renamed from: errorView$delegate, reason: from kotlin metadata */
    private final Interfaces2 errorView;
    public EventLogger eventLogger;
    private final Screen eventScreen;
    private final SingleItemAdapter<NewsFeedHeaderView, NewsFeedHeaderView.Data> headerAdapter;

    /* renamed from: headerTextContainerLayout$delegate, reason: from kotlin metadata */
    private final Interfaces2 headerTextContainerLayout;
    private final GenericListAdapter<NewsFeedLoadingView, Boolean> loadingAdapter;
    public LoggedCustomTabs loggedCustomTabs;
    private final MuxWrapper muxWrapper;

    /* renamed from: newsFeedAnalytics$delegate, reason: from kotlin metadata */
    private final Lazy newsFeedAnalytics;
    private PlayerView playerView;

    /* renamed from: recyclerView$delegate, reason: from kotlin metadata */
    private final Interfaces2 recyclerView;

    /* renamed from: rootContainer$delegate, reason: from kotlin metadata */
    private final Interfaces2 rootContainer;
    private final String screenName;
    private ScrollableLayoutManager scrollableLayoutManager;

    /* renamed from: searchToolbarContainer$delegate, reason: from kotlin metadata */
    private final Interfaces2 searchToolbarContainer;

    /* renamed from: searchToolbarEditText$delegate, reason: from kotlin metadata */
    private final Interfaces2 searchToolbarEditText;
    private int searchToolbarOffset;

    /* renamed from: swipeRefreshView$delegate, reason: from kotlin metadata */
    private final Interfaces2 swipeRefreshView;

    /* renamed from: toolbarScrollAnimator$delegate, reason: from kotlin metadata */
    private final Lazy toolbarScrollAnimator;

    /* renamed from: topInfoBannerView$delegate, reason: from kotlin metadata */
    private final Interfaces2 topInfoBannerView;
    private final boolean useDesignSystemToolbar;
    public UserAgentProvider userAgentProvider;
    private float videoAudioVolume;
    private Map<UUID, Long> videoContentIdToPlaybackPositionMap;
    private VisibleAutoLoggableViewManager<UUID, Element> visibleAutoLoggableViewManager;
    private VisibleItemsManager<UUID, Element> visibleItemsManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(NewsFeedFragment.class, "errorView", "getErrorView()Lcom/robinhood/android/common/view/ErrorView;", 0)), Reflection.property1(new PropertyReference1Impl(NewsFeedFragment.class, "swipeRefreshView", "getSwipeRefreshView()Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", 0)), Reflection.property1(new PropertyReference1Impl(NewsFeedFragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0)), Reflection.property1(new PropertyReference1Impl(NewsFeedFragment.class, "searchToolbarContainer", "getSearchToolbarContainer()Landroid/view/View;", 0)), Reflection.property1(new PropertyReference1Impl(NewsFeedFragment.class, "searchToolbarEditText", "getSearchToolbarEditText()Landroid/widget/EditText;", 0)), Reflection.property1(new PropertyReference1Impl(NewsFeedFragment.class, "topInfoBannerView", "getTopInfoBannerView()Lcom/robinhood/android/designsystem/banner/RdsInfoBannerView;", 0)), Reflection.property1(new PropertyReference1Impl(NewsFeedFragment.class, "headerTextContainerLayout", "getHeaderTextContainerLayout()Landroid/view/View;", 0)), Reflection.property1(new PropertyReference1Impl(NewsFeedFragment.class, "rootContainer", "getRootContainer()Landroid/widget/FrameLayout;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: NewsFeedFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoAutoplaySettingPref2.values().length];
            try {
                iArr[VideoAutoplaySettingPref2.MOBILE_AND_WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoAutoplaySettingPref2.WIFI_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoAutoplaySettingPref2.NEVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return true;
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
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
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

    @Override // com.robinhood.android.search.newsfeed.view.NewsFeedElementAdapter.Callbacks
    public void onContentRelatedAssetClick(Content content, RelatedAsset relatedAsset, boolean z) {
        NewsFeedElementAdapter.Callbacks.DefaultImpls.onContentRelatedAssetClick(this, content, relatedAsset, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NewsFeedFragment() {
        super(C27909R.layout.fragment_news_feed);
        this.newsFeedAnalytics = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedFragment$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewsFeedFragment.newsFeedAnalytics_delegate$lambda$0(this.f$0);
            }
        });
        this.duxo = OldDuxos.oldDuxo(this, NewsFeedDuxo.class);
        this.videoContentIdToPlaybackPositionMap = new LinkedHashMap();
        this.muxWrapper = new MuxWrapper();
        this.errorView = bindView(C27909R.id.news_feed_error_retry_view);
        this.swipeRefreshView = bindView(C27909R.id.swipe_refresh_view);
        this.recyclerView = bindView(C27909R.id.recycler_view);
        this.searchToolbarContainer = bindView(C27909R.id.search_toolbar_container);
        this.searchToolbarEditText = bindView(C27909R.id.search_toolbar_edt);
        this.topInfoBannerView = bindView(C27909R.id.top_info_banner);
        this.headerTextContainerLayout = bindView(C27909R.id.news_feed_header_txt_layout);
        this.rootContainer = bindView(C27909R.id.news_feed_fragment_root_container);
        SingleItemAdapter<NewsFeedHeaderView, NewsFeedHeaderView.Data> singleItemAdapterOf$default = SingleItemAdapter.Companion.of$default(SingleItemAdapter.INSTANCE, NewsFeedHeaderView.INSTANCE, (DiffUtil.ItemCallback) null, new Function2() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedFragment$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return NewsFeedFragment.headerAdapter$lambda$1((NewsFeedHeaderView) obj, (NewsFeedHeaderView.Data) obj2);
            }
        }, 2, (Object) null);
        this.headerAdapter = singleItemAdapterOf$default;
        GenericListAdapter<NewsFeedLoadingView, Boolean> genericListAdapterM2986of = GenericListAdapter.INSTANCE.m2986of(NewsFeedLoadingView.INSTANCE, DiffCallbacks.INSTANCE.byEquality(new Function1() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedFragment$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedFragment.loadingAdapter$lambda$2(((Boolean) obj).booleanValue());
            }
        }));
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = Boolean.FALSE;
        genericListAdapterM2986of.submitList(CollectionsKt.listOf((Object[]) new Boolean[]{bool, bool2, bool2}));
        this.loadingAdapter = genericListAdapterM2986of;
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        NewsFeedElementAdapter newsFeedElementAdapter = new NewsFeedElementAdapter(lifecycle, null, 2, 0 == true ? 1 : 0);
        this.elementAdapter = newsFeedElementAdapter;
        this.compositeAdapter = new CompositeAdapter((RecyclerView.Adapter<?>[]) new RecyclerView.Adapter[]{singleItemAdapterOf$default, genericListAdapterM2986of, newsFeedElementAdapter});
        this.toolbarScrollAnimator = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedFragment$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewsFeedFragment.toolbarScrollAnimator_delegate$lambda$4(this.f$0);
            }
        });
        this.useDesignSystemToolbar = true;
        this.eventScreen = new Screen(Screen.Name.BROWSE_NEWSFEED, null, null, null, 14, null);
        this.screenName = "BROWSE_NEWSFEED";
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

    public final LoggedCustomTabs getLoggedCustomTabs() {
        LoggedCustomTabs loggedCustomTabs = this.loggedCustomTabs;
        if (loggedCustomTabs != null) {
            return loggedCustomTabs;
        }
        Intrinsics.throwUninitializedPropertyAccessException("loggedCustomTabs");
        return null;
    }

    public final void setLoggedCustomTabs(LoggedCustomTabs loggedCustomTabs) {
        Intrinsics.checkNotNullParameter(loggedCustomTabs, "<set-?>");
        this.loggedCustomTabs = loggedCustomTabs;
    }

    public final UserAgentProvider getUserAgentProvider() {
        UserAgentProvider userAgentProvider = this.userAgentProvider;
        if (userAgentProvider != null) {
            return userAgentProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userAgentProvider");
        return null;
    }

    public final void setUserAgentProvider(UserAgentProvider userAgentProvider) {
        Intrinsics.checkNotNullParameter(userAgentProvider, "<set-?>");
        this.userAgentProvider = userAgentProvider;
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

    public final StringPreference getAutoplaySettingPref() {
        StringPreference stringPreference = this.autoplaySettingPref;
        if (stringPreference != null) {
            return stringPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("autoplaySettingPref");
        return null;
    }

    public final void setAutoplaySettingPref(StringPreference stringPreference) {
        Intrinsics.checkNotNullParameter(stringPreference, "<set-?>");
        this.autoplaySettingPref = stringPreference;
    }

    private final NewsFeedAnalytics getNewsFeedAnalytics() {
        return (NewsFeedAnalytics) this.newsFeedAnalytics.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NewsFeedAnalytics newsFeedAnalytics_delegate$lambda$0(NewsFeedFragment newsFeedFragment) {
        return new NewsFeedAnalytics(newsFeedFragment.getAnalytics(), "browse", newsFeedFragment.getEventLogger(), new Screen(Screen.Name.BROWSE_NEWSFEED, null, null, null, 14, null));
    }

    private final boolean getHideSearch() {
        return ((NewsFeed) INSTANCE.getArgs((Fragment) this)).getHideSearch();
    }

    private final NewsFeedDuxo getDuxo() {
        return (NewsFeedDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ErrorView getErrorView() {
        return (ErrorView) this.errorView.getValue(this, $$delegatedProperties[0]);
    }

    private final SwipeRefreshLayout getSwipeRefreshView() {
        return (SwipeRefreshLayout) this.swipeRefreshView.getValue(this, $$delegatedProperties[1]);
    }

    private final RecyclerView getRecyclerView() {
        return (RecyclerView) this.recyclerView.getValue(this, $$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getSearchToolbarContainer() {
        return (View) this.searchToolbarContainer.getValue(this, $$delegatedProperties[3]);
    }

    private final EditText getSearchToolbarEditText() {
        return (EditText) this.searchToolbarEditText.getValue(this, $$delegatedProperties[4]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RdsInfoBannerView getTopInfoBannerView() {
        return (RdsInfoBannerView) this.topInfoBannerView.getValue(this, $$delegatedProperties[5]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getHeaderTextContainerLayout() {
        return (View) this.headerTextContainerLayout.getValue(this, $$delegatedProperties[6]);
    }

    private final FrameLayout getRootContainer() {
        return (FrameLayout) this.rootContainer.getValue(this, $$delegatedProperties[7]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit headerAdapter$lambda$1(NewsFeedHeaderView of, NewsFeedHeaderView.Data headerViewData) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(headerViewData, "headerViewData");
        of.bind(headerViewData);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadingAdapter$lambda$2(boolean z) {
        return Unit.INSTANCE;
    }

    private final ToolbarScrollAnimator getToolbarScrollAnimator() {
        return (ToolbarScrollAnimator) this.toolbarScrollAnimator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ToolbarScrollAnimator toolbarScrollAnimator_delegate$lambda$4(NewsFeedFragment newsFeedFragment) {
        RhToolbar rhToolbar = newsFeedFragment.getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        return new ToolbarScrollAnimator(rhToolbar, newsFeedFragment.getResources().getDimension(C11048R.dimen.toolbar_scroll_height), false, false, false, (Float) null, 60, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.elementAdapter.setCallbacks(this);
        this.elementAdapter.registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedFragment.onCreate.1
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeChanged(int positionStart, int itemCount) {
                VisibleItemsManager visibleItemsManager = NewsFeedFragment.this.visibleItemsManager;
                VisibleAutoLoggableViewManager visibleAutoLoggableViewManager = null;
                if (visibleItemsManager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("visibleItemsManager");
                    visibleItemsManager = null;
                }
                visibleItemsManager.update();
                VisibleAutoLoggableViewManager visibleAutoLoggableViewManager2 = NewsFeedFragment.this.visibleAutoLoggableViewManager;
                if (visibleAutoLoggableViewManager2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("visibleAutoLoggableViewManager");
                } else {
                    visibleAutoLoggableViewManager = visibleAutoLoggableViewManager2;
                }
                visibleAutoLoggableViewManager.update();
            }
        });
        LoggedCustomTabs loggedCustomTabs = getLoggedCustomTabs();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        loggedCustomTabs.bind(contextRequireContext);
        getNewsFeedAnalytics().logNetworkAction(UserInteractionEventData.Action.FETCH);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(final View view, Bundle savedInstanceState) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        ScrollableLayoutManager scrollableLayoutManager = new ScrollableLayoutManager(contextRequireContext) { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedFragment.onViewCreated.1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean supportsPredictiveItemAnimations() {
                return false;
            }
        };
        scrollableLayoutManager.setSnapMode(ScrollableLayoutManager.SnapMode.START);
        this.scrollableLayoutManager = scrollableLayoutManager;
        getRecyclerView().setLayoutManager(this.scrollableLayoutManager);
        bindAdapter(getRecyclerView(), this.compositeAdapter);
        RecyclerView recyclerView = getRecyclerView();
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        recyclerView.setItemAnimator(defaultItemAnimator);
        ScrollableLayoutManager scrollableLayoutManager2 = this.scrollableLayoutManager;
        if (scrollableLayoutManager2 != null) {
            initVisibleViewManagers(scrollableLayoutManager2);
        }
        VisibleItemsManager<UUID, Element> visibleItemsManager = this.visibleItemsManager;
        if (visibleItemsManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("visibleItemsManager");
            visibleItemsManager = null;
        }
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(visibleItemsManager.getItemAppearances()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedFragment.onViewCreated$lambda$9(this.f$0, (Element) obj);
            }
        });
        VisibleItemsManager<UUID, Element> visibleItemsManager2 = this.visibleItemsManager;
        if (visibleItemsManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("visibleItemsManager");
            visibleItemsManager2 = null;
        }
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(visibleItemsManager2.getItemDisappearances()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedFragment.onViewCreated$lambda$10(this.f$0, (VisibleItemsManager.Data) obj);
            }
        });
        getSwipeRefreshView().setColorSchemeColors(ThemeColors.getThemeColor(contextRequireContext, C20690R.attr.colorPrimary));
        LifecycleHost.DefaultImpls.bind$default(this, SwipeRefreshLayoutRefreshObservable2.refreshes(getSwipeRefreshView()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedFragment.onViewCreated$lambda$11(this.f$0, (Unit) obj);
            }
        });
        OnClickListeners.onClick(getSearchToolbarContainer(), new Function0() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewsFeedFragment.onViewCreated$lambda$12(this.f$0);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, RxRecyclerView.scrollStateChanges(getRecyclerView()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedFragment.onViewCreated$lambda$13(this.f$0, ((Integer) obj).intValue());
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, RxRecyclerView.scrollEvents(getRecyclerView()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedFragment$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedFragment.onViewCreated$lambda$14(this.f$0, (RecyclerViewScrollEvent) obj);
            }
        });
        final ErrorView errorView = getErrorView();
        errorView.setOnPrimaryButtonClick(new Function0() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedFragment$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewsFeedFragment.onViewCreated$lambda$15(this.f$0);
            }
        });
        final int dimensionPixelSize = getResources().getDimensionPixelSize(C13997R.dimen.rds_spacing_small);
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedFragment$onViewCreated$listener$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                View viewFindViewById = view.findViewById(C27909R.id.news_feed_header_txt_layout);
                if (viewFindViewById != null) {
                    this.searchToolbarOffset = viewFindViewById.getBottom() + dimensionPixelSize;
                    this.updateSearchToolbarContainer();
                    ViewsKt.setMarginTop(errorView, this.searchToolbarOffset + this.getSearchToolbarContainer().getBottom());
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            }
        });
        getSearchToolbarContainer().setVisibility(getHideSearch() ? 8 : 0);
        FrameLayout rootContainer = getRootContainer();
        ViewGroup.LayoutParams layoutParams = rootContainer != null ? rootContainer.getLayoutParams() : null;
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.robinhood.android.common.ui.view.FragmentContainerLayout.LayoutParams");
        ((FragmentContainerLayout.LayoutParams) layoutParams).setUnderneathToolbar(!getHideSearch());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$9(NewsFeedFragment newsFeedFragment, Element item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item instanceof Element.Regular) {
            newsFeedFragment.getNewsFeedAnalytics().logContentAppear(((Element.Regular) item).getContent(), false);
        } else if (item instanceof Element.ListPreview) {
            newsFeedFragment.getNewsFeedAnalytics().logListPreviewElementAppear((Element.ListPreview) item);
        } else if (!(item instanceof Element.Carousel) && !(item instanceof Element.EducationCarousel) && !(item instanceof Element.RecommendationsCard) && !(item instanceof Element.MarketUpdates) && !(item instanceof Element.MarketIndicators)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$10(NewsFeedFragment newsFeedFragment, VisibleItemsManager.Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Element element = (Element) data.getItem();
        if (element instanceof Element.Regular) {
            newsFeedFragment.getNewsFeedAnalytics().logContentDisappear(((Element.Regular) element).getContent(), data.getDurationVisible(), false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$11(NewsFeedFragment newsFeedFragment, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        newsFeedFragment.getAnalytics().logUserAction(AnalyticsStrings.USER_ACTION_BROWSE_REFRESH);
        newsFeedFragment.getNewsFeedAnalytics().logNetworkAction(UserInteractionEventData.Action.REFRESH);
        newsFeedFragment.getDuxo().refreshNewsFeed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$12(NewsFeedFragment newsFeedFragment) {
        newsFeedFragment.showSearch();
        newsFeedFragment.getNewsFeedAnalytics().logSearchBarTap(newsFeedFragment.getSearchToolbarEditText().getText().toString());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$13(NewsFeedFragment newsFeedFragment, int i) {
        if (1 == i) {
            newsFeedFragment.getNewsFeedAnalytics().logPageScroll();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$14(NewsFeedFragment newsFeedFragment, RecyclerViewScrollEvent event) throws JSONException {
        Intrinsics.checkNotNullParameter(event, "event");
        newsFeedFragment.getToolbarScrollAnimator().dispatchScroll(newsFeedFragment.getRecyclerView());
        newsFeedFragment.updateSearchToolbarContainer();
        VisibleItemsManager<UUID, Element> visibleItemsManager = newsFeedFragment.visibleItemsManager;
        VisibleAutoLoggableViewManager<UUID, Element> visibleAutoLoggableViewManager = null;
        if (visibleItemsManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("visibleItemsManager");
            visibleItemsManager = null;
        }
        visibleItemsManager.update();
        VisibleAutoLoggableViewManager<UUID, Element> visibleAutoLoggableViewManager2 = newsFeedFragment.visibleAutoLoggableViewManager;
        if (visibleAutoLoggableViewManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("visibleAutoLoggableViewManager");
        } else {
            visibleAutoLoggableViewManager = visibleAutoLoggableViewManager2;
        }
        visibleAutoLoggableViewManager.update();
        newsFeedFragment.updateAutoplayVideo(event);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$15(NewsFeedFragment newsFeedFragment) {
        newsFeedFragment.getNewsFeedAnalytics().logRetryClick();
        newsFeedFragment.getNewsFeedAnalytics().logNetworkAction(UserInteractionEventData.Action.RETRY);
        newsFeedFragment.getDuxo().refreshNewsFeed();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        LoggedCustomTabs loggedCustomTabs = getLoggedCustomTabs();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        loggedCustomTabs.unbind(contextRequireContext);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        RhToolbar rhToolbar;
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setVisibility(getHideSearch() ? 0 : 8);
        if (getHideSearch()) {
            if (((ViewGroup) toolbar.findViewById(C27909R.id.newsfeed_toolbar_container)) == null) {
                rhToolbar = toolbar;
                RhToolbar.addCustomView$default(rhToolbar, C27909R.layout.newsfeed_fragment_toolbar, false, 8388613, 2, null);
                TopNavButtonView topNavButtonView = (TopNavButtonView) rhToolbar.findViewById(C27909R.id.newsfeed_toolbar_inbox_button);
                if (topNavButtonView != null) {
                    OnClickListeners.onClick(topNavButtonView, new Function0() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedFragment$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return NewsFeedFragment.configureToolbar$lambda$16(this.f$0);
                        }
                    });
                }
            } else {
                rhToolbar = toolbar;
            }
        } else {
            rhToolbar = toolbar;
            rhToolbar.removeCustomView();
        }
        TopNavButtonView topNavButtonView2 = (TopNavButtonView) rhToolbar.findViewById(C27909R.id.newsfeed_toolbar_search_button);
        if (topNavButtonView2 != null) {
            com.robinhood.android.autoeventlogging.ViewsKt.setLoggingConfig(topNavButtonView2, new AutoLoggingConfig(false, false, 2, null));
            com.robinhood.android.autoeventlogging.ViewsKt.eventData$default(topNavButtonView2, false, new Function0() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedFragment$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NewsFeedFragment.configureToolbar$lambda$19$lambda$17(this.f$0);
                }
            }, 1, null);
            OnClickListeners.onClick(topNavButtonView2, new Function0() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedFragment$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NewsFeedFragment.configureToolbar$lambda$19$lambda$18(this.f$0);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureToolbar$lambda$16(NewsFeedFragment newsFeedFragment) {
        Navigator navigator = newsFeedFragment.getNavigator();
        android.content.Context contextRequireContext = newsFeedFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, LegacyFragmentKey.InboxThreadList.INSTANCE, false, false, false, null, false, null, false, false, null, null, 4092, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor configureToolbar$lambda$19$lambda$17(NewsFeedFragment newsFeedFragment) {
        return new UserInteractionEventDescriptor(null, newsFeedFragment.getEventScreen(), UserInteractionEventData.Action.VIEW_SEARCH, null, new Component(Component.ComponentType.BUTTON, AssetHomeTopAppBar.SEARCH_IDENTIFIER, null, 4, null), null, 41, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureToolbar$lambda$19$lambda$18(NewsFeedFragment newsFeedFragment) {
        Navigator navigator = newsFeedFragment.getNavigator();
        android.content.Context contextRequireContext = newsFeedFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new SearchFragmentKey(null, null, null, null, null, null, false, null, 255, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
        return Unit.INSTANCE;
    }

    private final void updateAutoplayVideo(RecyclerViewScrollEvent event) throws JSONException {
        NewsFeedVideoView newsFeedVideoViewFindVideoView = findVideoView(event.getDy() > 0);
        if (newsFeedVideoViewFindVideoView == null || Intrinsics.areEqual(newsFeedVideoViewFindVideoView, this.autoplayingVideoView)) {
            if (newsFeedVideoViewFindVideoView == null) {
                resetAutoplayingVideoView();
                return;
            }
            return;
        }
        if (shouldAutoplay()) {
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            PlayerView playerView = this.playerView;
            if (playerView == null) {
                View viewInflate$default = ViewGroups.inflate$default(newsFeedVideoViewFindVideoView, C27909R.layout.include_news_feed_video_player_view, false, 2, null);
                Intrinsics.checkNotNull(viewInflate$default, "null cannot be cast to non-null type androidx.media3.ui.PlayerView");
                playerView = (PlayerView) viewInflate$default;
                playerView.setErrorMessageProvider(new DummyErrorMessageProvider());
                ExoPlayer exoPlayerBuild = new ExoPlayer.Builder(contextRequireContext).build();
                this.videoAudioVolume = exoPlayerBuild.getVolume();
                exoPlayerBuild.setVolume(0.0f);
                playerView.setPlayer(exoPlayerBuild);
                MuxWrapper muxWrapper = this.muxWrapper;
                FragmentActivity fragmentActivityRequireActivity = requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                muxWrapper.setPlayer(fragmentActivityRequireActivity, PLAYER_NAME, playerView);
                this.playerView = playerView;
            }
            resetAutoplayingVideoView();
            newsFeedVideoViewFindVideoView.bindPlayerView(playerView);
            Player player = playerView.getPlayer();
            Intrinsics.checkNotNull(player, "null cannot be cast to non-null type androidx.media3.exoplayer.ExoPlayer");
            ExoPlayer exoPlayer = (ExoPlayer) player;
            HttpUrl videoUrl = newsFeedVideoViewFindVideoView.getVideoUrl();
            Intrinsics.checkNotNull(videoUrl);
            String userAgent = getUserAgentProvider().getUserAgent();
            Uri androidUri = HttpUrl2.toAndroidUri(videoUrl);
            HttpUrl captionsUrl = newsFeedVideoViewFindVideoView.getCaptionsUrl();
            ExoPlayers.prepareNewsFeedVideo(exoPlayer, contextRequireContext, userAgent, androidUri, captionsUrl != null ? HttpUrl2.toAndroidUri(captionsUrl) : null);
            MuxWrapper muxWrapper2 = this.muxWrapper;
            UUID contentId = newsFeedVideoViewFindVideoView.getContentId();
            Intrinsics.checkNotNull(contentId);
            String string2 = contentId.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            String videoTitle = newsFeedVideoViewFindVideoView.getVideoTitle();
            Intrinsics.checkNotNull(videoTitle);
            muxWrapper2.updateVideo(string2, videoTitle, videoUrl);
            exoPlayer.setPlayWhenReady(true);
            Map<UUID, Long> map = this.videoContentIdToPlaybackPositionMap;
            UUID contentId2 = newsFeedVideoViewFindVideoView.getContentId();
            Intrinsics.checkNotNull(contentId2);
            Long l = map.get(contentId2);
            if (l != null) {
                exoPlayer.seekTo(l.longValue());
            }
            this.autoplayingVideoView = newsFeedVideoViewFindVideoView;
            return;
        }
        resetAutoplayingVideoView();
    }

    private final void resetAutoplayingVideoView() {
        Player player;
        Player player2;
        NewsFeedVideoView newsFeedVideoView = this.autoplayingVideoView;
        if (newsFeedVideoView != null) {
            PlayerView playerView = this.playerView;
            if (playerView != null && (player2 = playerView.getPlayer()) != null) {
                Long lValueOf = Long.valueOf(player2.getCurrentPosition());
                Map<UUID, Long> map = this.videoContentIdToPlaybackPositionMap;
                UUID contentId = newsFeedVideoView.getContentId();
                Intrinsics.checkNotNull(contentId);
                map.put(contentId, lValueOf);
            }
            newsFeedVideoView.unbindPlayerView();
            this.autoplayingVideoView = null;
            if (playerView == null || (player = playerView.getPlayer()) == null) {
                return;
            }
            player.setPlayWhenReady(false);
        }
    }

    private final boolean shouldAutoplay() {
        VideoAutoplaySettingPref2.Companion companion = VideoAutoplaySettingPref2.INSTANCE;
        String str = getAutoplaySettingPref().get();
        Intrinsics.checkNotNull(str);
        int i = WhenMappings.$EnumSwitchMapping$0[companion.fromValue(str).ordinal()];
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            if (i == 3) {
                return false;
            }
            throw new NoWhenBranchMatchedException();
        }
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return Contexts8.isWifiConnected(contextRequireContext);
    }

    private final NewsFeedVideoView findVideoView(boolean scrollingDown) {
        Object next;
        Sequence sequenceFilter = SequencesKt.filter(scrollingDown ? ViewGroups.getChildrenReversed(getRecyclerView()) : ViewGroup2.getChildren(getRecyclerView()), new Function1<Object, Boolean>() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedFragment$findVideoView$$inlined$filterIsInstance$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof NewsFeedVideoView);
            }
        });
        Intrinsics.checkNotNull(sequenceFilter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        Iterator itIterator2 = sequenceFilter.iterator2();
        while (true) {
            if (!itIterator2.hasNext()) {
                next = null;
                break;
            }
            next = itIterator2.next();
            if (((NewsFeedVideoView) next).isVideoViewVisible(getSearchToolbarContainer().getHeight())) {
                break;
            }
        }
        return (NewsFeedVideoView) next;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        VisibleItemsManager<UUID, Element> visibleItemsManager = this.visibleItemsManager;
        if (visibleItemsManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("visibleItemsManager");
            visibleItemsManager = null;
        }
        visibleItemsManager.update();
        VisibleAutoLoggableViewManager<UUID, Element> visibleAutoLoggableViewManager = this.visibleAutoLoggableViewManager;
        if (visibleAutoLoggableViewManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("visibleAutoLoggableViewManager");
            visibleAutoLoggableViewManager = null;
        }
        visibleAutoLoggableViewManager.update();
        if (getSearchToolbarEditText().getVisibility() == 0) {
            getNewsFeedAnalytics().logSearchBarAppear(getSearchToolbarEditText().getText().toString());
        }
        Observable observableDistinctUntilChanged = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedFragment.onStart.1
            @Override // io.reactivex.functions.Function
            public final Optional<IacInfoBanner> apply(NewsFeedViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(it.getIacInfoBannerData());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedFragment$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedFragment.onStart$lambda$23(this.f$0, (Optional) obj);
            }
        });
        Observable<NewsFeedViewState> states = getDuxo().getStates();
        final C280953 c280953 = new PropertyReference1Impl() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedFragment.onStart.3
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((NewsFeedViewState) obj).getEducationTrackingIds();
            }
        };
        Observable observableDistinctUntilChanged2 = states.map(new Function(c280953) { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedFragment$sam$io_reactivex_functions_Function$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(c280953, "function");
                this.function = c280953;
            }

            @Override // io.reactivex.functions.Function
            public final /* synthetic */ Object apply(Object obj) {
                return this.function.invoke(obj);
            }
        }).filter(new Predicate() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedFragment.onStart.4
            @Override // io.reactivex.functions.Predicate
            public final boolean test(List<String> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return !it.isEmpty();
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C280975(getDuxo()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$23(NewsFeedFragment newsFeedFragment, Optional optional) throws Resources.NotFoundException {
        newsFeedFragment.bindIacInfoBanner((IacInfoBanner) optional.component1());
        return Unit.INSTANCE;
    }

    /* compiled from: NewsFeedFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.search.newsfeed.view.NewsFeedFragment$onStart$5 */
    /* synthetic */ class C280975 extends FunctionReferenceImpl implements Function1<List<? extends String>, Unit> {
        C280975(Object obj) {
            super(1, obj, NewsFeedDuxo.class, "loadUserProgress", "loadUserProgress(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends String> list) {
            invoke2((List<String>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<String> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((NewsFeedDuxo) this.receiver).loadUserProgress(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Observable<NewsFeedViewState> observableDebounce = getDuxo().getStates().debounce(10L, TimeUnit.MILLISECONDS, Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(observableDebounce, "debounce(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDebounce), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C280931(this));
        getToolbarScrollAnimator().dispatchScroll(getRecyclerView());
        CrossSellLaunchManager.initIacBottomSheetPolling$default(getCrossSellLaunchManager(), this, IacAlertSheetLocation.TOP_LEVEL_BROWSE, null, null, null, null, null, null, null, 508, null);
    }

    /* compiled from: NewsFeedFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.search.newsfeed.view.NewsFeedFragment$onResume$1 */
    /* synthetic */ class C280931 extends FunctionReferenceImpl implements Function1<NewsFeedViewState, Unit> {
        C280931(Object obj) {
            super(1, obj, NewsFeedFragment.class, "updateViewState", "updateViewState(Lcom/robinhood/android/search/newsfeed/NewsFeedViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NewsFeedViewState newsFeedViewState) throws Throwable {
            invoke2(newsFeedViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(NewsFeedViewState p0) throws Throwable {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((NewsFeedFragment) this.receiver).updateViewState(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        Player player;
        super.onStop();
        VisibleItemsManager<UUID, Element> visibleItemsManager = this.visibleItemsManager;
        VisibleAutoLoggableViewManager<UUID, Element> visibleAutoLoggableViewManager = null;
        if (visibleItemsManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("visibleItemsManager");
            visibleItemsManager = null;
        }
        visibleItemsManager.clear();
        VisibleAutoLoggableViewManager<UUID, Element> visibleAutoLoggableViewManager2 = this.visibleAutoLoggableViewManager;
        if (visibleAutoLoggableViewManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("visibleAutoLoggableViewManager");
        } else {
            visibleAutoLoggableViewManager = visibleAutoLoggableViewManager2;
        }
        visibleAutoLoggableViewManager.clear();
        PlayerView playerView = this.playerView;
        if (playerView == null || (player = playerView.getPlayer()) == null) {
            return;
        }
        player.setPlayWhenReady(false);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Player player;
        super.onDestroyView();
        resetAutoplayingVideoView();
        this.muxWrapper.release();
        PlayerView playerView = this.playerView;
        if (playerView != null && (player = playerView.getPlayer()) != null) {
            player.release();
        }
        this.playerView = null;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return this.screenName;
    }

    @Override // com.robinhood.android.search.newsfeed.view.NewsFeedElementAdapter.Callbacks
    public void onContentRelatedInstrumentClick(Content content, RelatedInstrument instrument, boolean inCarousel) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        getNewsFeedAnalytics().logContentRelatedInstrumentClick(content, instrument, inCarousel);
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new LegacyFragmentKey.EquityInstrumentDetail(instrument.getId(), null, null, InstrumentDetailSource.NEWS_FEED, false, 22, null), false, false, false, PerformanceMetricEventData.Source.SOURCE_SEARCH, false, null, false, false, null, null, 4060, null);
    }

    @Override // com.robinhood.android.search.newsfeed.view.NewsFeedElementAdapter.Callbacks
    public void onToggleVideoAudioClick(Content.Video content, boolean enabled) {
        Player player;
        Intrinsics.checkNotNullParameter(content, "content");
        PlayerView playerView = this.playerView;
        if (playerView != null && (player = playerView.getPlayer()) != null) {
            player.setVolume(enabled ? this.videoAudioVolume : 0.0f);
        }
        getDuxo().enableAutoplayVideoAudio(enabled);
        getNewsFeedAnalytics().logToggleVideoAudioClick(content, enabled);
    }

    @Override // com.robinhood.android.search.newsfeed.view.NewsFeedElementAdapter.Callbacks
    public void onToggleVideoAudioAppear(Content.Video content, boolean enabled) {
        Intrinsics.checkNotNullParameter(content, "content");
        getNewsFeedAnalytics().logToggleVideoAudioAppear(content, enabled);
    }

    @Override // com.robinhood.android.search.newsfeed.view.NewsFeedElementAdapter.Callbacks
    public void onContentClick(Content content, boolean inCarousel) {
        Intrinsics.checkNotNullParameter(content, "content");
        handleContentClick(content, inCarousel);
        getNewsFeedAnalytics().logContentClick(content, inCarousel);
    }

    private final void handleContentClick(Content content, boolean inCarousel) {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        if (content instanceof Content.Article) {
            Content.Article article = (Content.Article) content;
            if (StringsKt.isSnacksUrl(article.getUrl().getUrl())) {
                Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(getNavigator(), contextRequireContext, new SnacksWebViewFragmentKey(article.getUrl().getUrl()), false, false, false, false, null, false, null, null, 1020, null);
                return;
            } else if (StringsKt.isLearnUrl(article.getUrl().getUrl())) {
                Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(getNavigator(), contextRequireContext, new RhEmbeddedWebViewFragmentKey(article.getUrl().getUrl()), false, false, false, false, null, false, null, null, 1020, null);
                return;
            } else {
                LoggedCustomTabs2.showNewsFeedArticle(getLoggedCustomTabs(), contextRequireContext, article, "browse", getScreenName());
                return;
            }
        }
        if (content instanceof Content.EmbeddedArticle) {
            Content.EmbeddedArticle embeddedArticle = (Content.EmbeddedArticle) content;
            Navigator.DefaultImpls.showFragment$default(getNavigator(), contextRequireContext, new LegacyFragmentKey.NewsFeedEmbeddedArticle(embeddedArticle.getId(), embeddedArticle.getParentElement().getTemplate(), embeddedArticle.getAnalyticsContentType(), "browse", null, null, 48, null), false, false, false, null, false, null, false, false, null, null, 4084, null);
            return;
        }
        if (content instanceof Content.Instrument) {
            Content.Instrument instrument = (Content.Instrument) content;
            UUID instrumentId = instrument.getInstrumentId();
            if (inCarousel) {
                AnalyticsLogger analytics = getAnalytics();
                String string2 = instrumentId.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(analytics, AnalyticsStrings.BUTTON_GROUP_CAROUSEL_BROWSE_NEWS_CAROUSEL, string2, instrument.getParentElement().getCategory(), null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null);
            }
            Navigator navigator = getNavigator();
            android.content.Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext2, new LegacyFragmentKey.EquityInstrumentDetail(instrumentId, null, null, InstrumentDetailSource.NEWS_FEED, false, 22, null), false, false, false, PerformanceMetricEventData.Source.SOURCE_SEARCH, false, null, false, false, null, null, 4060, null);
            return;
        }
        if (content instanceof Content.Video) {
            Navigator.DefaultImpls.showFragment$default(getNavigator(), contextRequireContext, new LegacyFragmentKey.NewsFeedVideoPlayer(((Content.Video) content).getId()), false, false, true, null, false, null, false, false, null, null, 4068, null);
            return;
        }
        if (content instanceof Content.ListPreview) {
            AnalyticsLogger analytics2 = getAnalytics();
            String string3 = ((Content.ListPreview) content).getId().toString();
            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
            AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(analytics2, AnalyticsStrings.BUTTON_GROUP_BROWSE_LIST, string3, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
            return;
        }
        if (!(content instanceof Content.EducationSeries) && !(content instanceof Content.MarketUpdates) && !(content instanceof Content.MarketIndicator)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.robinhood.android.search.newsfeed.view.NewsFeedElementAdapter.Callbacks
    public void onCarouselContentAppear(Content content) {
        Intrinsics.checkNotNullParameter(content, "content");
        getNewsFeedAnalytics().logCarouselContentAppear(content);
    }

    @Override // com.robinhood.android.search.newsfeed.view.NewsFeedElementAdapter.Callbacks
    public void onCarouselContentClick(Content content) {
        Intrinsics.checkNotNullParameter(content, "content");
        handleContentClick(content, true);
        getNewsFeedAnalytics().logCarouselContentClick(content);
    }

    @Override // com.robinhood.android.search.newsfeed.view.NewsFeedElementAdapter.Callbacks
    public void onCarouselContentDisappear(Content content, long durationVisible) {
        Intrinsics.checkNotNullParameter(content, "content");
        getNewsFeedAnalytics().logContentDisappear(content, durationVisible, true);
    }

    @Override // com.robinhood.android.search.newsfeed.view.NewsFeedElementAdapter.Callbacks
    public void onListsChipContentAppear(Content.ListPreview content) {
        Intrinsics.checkNotNullParameter(content, "content");
        getNewsFeedAnalytics().logListPreviewContentAppear(content);
    }

    @Override // com.robinhood.android.search.newsfeed.view.NewsFeedElementAdapter.Callbacks
    public void onListsChipContentClick(Content.ListPreview content) {
        Intrinsics.checkNotNullParameter(content, "content");
        getDuxo().markListChipBadgeSeen(content.getId());
        getNewsFeedAnalytics().logListPreviewContentClick(content);
    }

    @Override // com.robinhood.android.search.newsfeed.view.NewsFeedElementAdapter.Callbacks
    public void onEducationLessonsAppear(List<EducationLessonPreview> lessons) {
        Intrinsics.checkNotNullParameter(lessons, "lessons");
        getDuxo().markEducationLessonsAppeared(lessons);
    }

    @Override // com.robinhood.android.search.newsfeed.view.NewsFeedElementAdapter.Callbacks
    public void onEducationHomeEntryPointClick() {
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        requireActivity().startActivity(Navigator.DefaultImpls.createIntentForFragment$default(navigator, contextRequireContext, new LegacyFragmentKey.EducationHome("browse"), false, false, false, null, false, false, false, false, false, null, false, 8188, null));
    }

    @Override // com.robinhood.android.common.p088ui.tabs.Scrollable
    public void scrollToTop() {
        RecyclerView.LayoutManager layoutManager = getRecyclerView().getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int iFindFirstCompletelyVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition();
        if (!getHideSearch() && iFindFirstCompletelyVisibleItemPosition == 0) {
            showSearch();
        } else {
            getRecyclerView().smoothScrollToPosition(0);
        }
    }

    private final void initVisibleViewManagers(LinearLayoutManager linearLayoutManager) {
        Function1 function1 = new Function1() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedFragment$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedFragment.initVisibleViewManagers$lambda$24(this.f$0, ((Integer) obj).intValue());
            }
        };
        Function1 function12 = new Function1() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedFragment$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsFeedFragment.initVisibleViewManagers$lambda$25((Element) obj);
            }
        };
        this.visibleItemsManager = new VisibleItemsManager<>(linearLayoutManager, new Function0() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedFragment$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(NewsFeedFragment.initVisibleViewManagers$lambda$26(this.f$0));
            }
        }, function1, function12);
        this.visibleAutoLoggableViewManager = new VisibleAutoLoggableViewManager<>(linearLayoutManager, new Function0() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedFragment$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(NewsFeedFragment.initVisibleViewManagers$lambda$27(this.f$0));
            }
        }, function1, function12, false, false, 48, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Element initVisibleViewManagers$lambda$24(NewsFeedFragment newsFeedFragment, int i) {
        CompositeAdapter.Target targetAdapterPositionToTarget = newsFeedFragment.compositeAdapter.adapterPositionToTarget(i);
        if (Intrinsics.areEqual(targetAdapterPositionToTarget.getChild().getValue(), newsFeedFragment.elementAdapter)) {
            return newsFeedFragment.elementAdapter.getItem(targetAdapterPositionToTarget.getChildPosition());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UUID initVisibleViewManagers$lambda$25(Element element) {
        Intrinsics.checkNotNullParameter(element, "<this>");
        return element instanceof Element.Regular ? ((Element.Regular) element).getContent().getId() : element.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int initVisibleViewManagers$lambda$26(NewsFeedFragment newsFeedFragment) {
        return newsFeedFragment.compositeAdapter.getSize();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int initVisibleViewManagers$lambda$27(NewsFeedFragment newsFeedFragment) {
        return newsFeedFragment.compositeAdapter.getSize();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateViewState(NewsFeedViewState viewState) throws Throwable {
        Throwable thConsume;
        UiEvent<NewsfeedHeaderChange> newsfeedHeaderChangeEvent = viewState.getNewsfeedHeaderChangeEvent();
        if (newsfeedHeaderChangeEvent != null) {
            newsfeedHeaderChangeEvent.consumeWith(new Function1() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NewsFeedFragment.updateViewState$lambda$28(this.f$0, (NewsfeedHeaderChange) obj);
                }
            });
        }
        if (viewState.getShowInitialLoadErrorMessage() && getErrorView().getVisibility() != 0) {
            getNewsFeedAnalytics().logRetryAppear();
        }
        getErrorView().setVisibility(viewState.getShowInitialLoadErrorMessage() ? 0 : 8);
        UiEvent<Throwable> manualRefreshErrorEvent = viewState.getManualRefreshErrorEvent();
        if (manualRefreshErrorEvent != null && (thConsume = manualRefreshErrorEvent.consume()) != null) {
            getSwipeRefreshView().setRefreshing(false);
            if (!AbsErrorHandler.handleError$default(getActivityErrorHandler(), thConsume, false, 2, null)) {
                throw thConsume;
            }
        }
        UiEvent<Unit> manualRefreshCompleteEvent = viewState.getManualRefreshCompleteEvent();
        if ((manualRefreshCompleteEvent != null ? manualRefreshCompleteEvent.consume() : null) != null) {
            getSwipeRefreshView().setRefreshing(false);
        }
        if (!viewState.getShowInitialLoading()) {
            this.loadingAdapter.submitList(CollectionsKt.emptyList());
            this.elementAdapter.submitList(viewState.getElements());
        }
        UiEvent<Integer> scrollToTargetEvent = viewState.getScrollToTargetEvent();
        if (scrollToTargetEvent != null) {
            scrollToTargetEvent.consumeWith(new Function1() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NewsFeedFragment.updateViewState$lambda$30(this.f$0, ((Integer) obj).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateViewState$lambda$28(NewsFeedFragment newsFeedFragment, NewsfeedHeaderChange headerChange) {
        View viewFindViewById;
        Intrinsics.checkNotNullParameter(headerChange, "headerChange");
        newsFeedFragment.headerAdapter.setData(new NewsFeedHeaderView.Data(((NewsFeed) INSTANCE.getArgs((Fragment) newsFeedFragment)).getHideSearch(), headerChange.getToolbarTitle(), headerChange.getNewsFeedDisclosureKey()));
        RhToolbar rhToolbar = newsFeedFragment.getRhToolbar();
        if (rhToolbar != null && (viewFindViewById = rhToolbar.findViewById(C27909R.id.newsfeed_toolbar_search_button)) != null) {
            viewFindViewById.setVisibility(headerChange.getShowSearchInToolbar() ? 0 : 8);
        }
        RhToolbar rhToolbar2 = newsFeedFragment.getRhToolbar();
        if (rhToolbar2 != null) {
            rhToolbar2.setTitle(headerChange.getToolbarTitle());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateViewState$lambda$30(NewsFeedFragment newsFeedFragment, int i) {
        newsFeedFragment.scrollToTarget(i);
        return Unit.INSTANCE;
    }

    private final void scrollToTarget(int targetIndex) {
        int firstItemPositionOf = this.compositeAdapter.getFirstItemPositionOf(this.elementAdapter) + targetIndex;
        ScrollableLayoutManager scrollableLayoutManager = this.scrollableLayoutManager;
        if (scrollableLayoutManager != null) {
            scrollableLayoutManager.scrollToPositionWithOffset(firstItemPositionOf, 0);
        }
    }

    private final void showSearch() {
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new SearchFragmentKey(null, null, null, null, null, null, false, null, 255, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSearchToolbarContainer() {
        getSearchToolbarContainer().setTranslationY(Math.max(0, this.searchToolbarOffset - getRecyclerView().computeVerticalScrollOffset()));
    }

    private final void bindIacInfoBanner(IacInfoBanner infoBanner) throws Resources.NotFoundException {
        RdsInfoBannerView topInfoBannerView = getTopInfoBannerView();
        if (topInfoBannerView != null) {
            IacInfoBanners.bindIacInfoBanner(topInfoBannerView, infoBanner, this);
        }
        if (infoBanner != null) {
            updateSearchBarPosition();
        }
    }

    private final void updateSearchBarPosition() throws Resources.NotFoundException {
        ViewTreeObserver viewTreeObserver;
        if (getTopInfoBannerView() == null) {
            return;
        }
        final int dimensionPixelSize = getResources().getDimensionPixelSize(C13997R.dimen.rds_spacing_small);
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.robinhood.android.search.newsfeed.view.NewsFeedFragment$updateSearchBarPosition$listener$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                ViewTreeObserver viewTreeObserver2;
                if (this.this$0.getHeaderTextContainerLayout() == null) {
                    return;
                }
                NewsFeedFragment newsFeedFragment = this.this$0;
                View headerTextContainerLayout = newsFeedFragment.getHeaderTextContainerLayout();
                newsFeedFragment.searchToolbarOffset = headerTextContainerLayout != null ? headerTextContainerLayout.getBottom() : dimensionPixelSize;
                this.this$0.updateSearchToolbarContainer();
                ViewsKt.setMarginTop(this.this$0.getErrorView(), this.this$0.searchToolbarOffset + this.this$0.getSearchToolbarContainer().getBottom());
                RdsInfoBannerView topInfoBannerView = this.this$0.getTopInfoBannerView();
                if (topInfoBannerView == null || (viewTreeObserver2 = topInfoBannerView.getViewTreeObserver()) == null) {
                    return;
                }
                viewTreeObserver2.removeOnGlobalLayoutListener(this);
            }
        };
        RdsInfoBannerView topInfoBannerView = getTopInfoBannerView();
        if (topInfoBannerView == null || (viewTreeObserver = topInfoBannerView.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    @Override // com.robinhood.shared.iac.infobanner.InfoBannerCallbacks
    public void onClickInfoBanner(IacInfoBanner banner) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        GenericAction ctaAction = banner.getCtaAction();
        if (ctaAction instanceof GenericAction.DeeplinkAction) {
            Navigator navigator = getNavigator();
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            GenericAction.DeeplinkAction deeplinkAction = (GenericAction.DeeplinkAction) ctaAction;
            Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, deeplinkAction.getUri(), null, null, false, null, 60, null);
            getDuxo().tapInfoBanner(banner.getReceiptUuid(), deeplinkAction);
        }
    }

    @Override // com.robinhood.shared.iac.infobanner.InfoBannerCallbacks
    public void onDismissInfoBanner(IacInfoBanner banner) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(banner, "banner");
        getDuxo().dismissInfoBanner(banner.getReceiptUuid());
        updateSearchBarPosition();
    }

    /* compiled from: NewsFeedFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/view/NewsFeedFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/search/newsfeed/view/NewsFeedFragment;", "Lcom/robinhood/android/education/contracts/NewsFeed;", "<init>", "()V", "ANALYTICS_PREFIX", "", "PLAYER_NAME", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<NewsFeedFragment, NewsFeed> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(NewsFeed newsFeed) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, newsFeed);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public NewsFeed getArgs(NewsFeedFragment newsFeedFragment) {
            return (NewsFeed) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, newsFeedFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public NewsFeedFragment newInstance(NewsFeed newsFeed) {
            return (NewsFeedFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, newsFeed);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(NewsFeedFragment newsFeedFragment, NewsFeed newsFeed) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, newsFeedFragment, newsFeed);
        }
    }
}
