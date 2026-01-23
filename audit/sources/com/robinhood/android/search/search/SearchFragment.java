package com.robinhood.android.search.search;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.card.MaterialCardView;
import com.jakewharton.rxbinding3.recyclerview.RecyclerViewScrollEvent;
import com.jakewharton.rxbinding3.recyclerview.RxRecyclerView;
import com.jakewharton.rxbinding3.swiperefreshlayout.SwipeRefreshLayoutRefreshObservable2;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.analytics.LogOnceEventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.VisibleAutoLoggableViewManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.contracts.CuratedListKey;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BaseRhBottomSheetDialogHostFragment;
import com.robinhood.android.common.p088ui.CuratedListChipItem;
import com.robinhood.android.common.p088ui.CuratedListChipRecyclerView;
import com.robinhood.android.common.p088ui.ScrollableLayoutManager;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.tabs.Scrollable;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.HtmlCompat;
import com.robinhood.android.common.util.RhShortcut;
import com.robinhood.android.common.util.RhShortcutManager;
import com.robinhood.android.common.util.VisibleItemsManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.extensions.Snackbars;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import com.robinhood.android.eventcontracts.contracts.EcUuidType;
import com.robinhood.android.eventcontracts.contracts.EventDetailRoutingFragmentKey;
import com.robinhood.android.eventcontracts.models.event.api.bonfire.ApiEventContractSearchItem;
import com.robinhood.android.futures.analytics.FuturesAnalyticsStrings;
import com.robinhood.android.futures.contracts.FuturesDetailFragmentKey;
import com.robinhood.android.indexes.contracts.IndexDetailPageFragmentKey;
import com.robinhood.android.indexes.contracts.IndexDetailPageFragmentKey2;
import com.robinhood.android.indexes.models.p159db.Index;
import com.robinhood.android.lib.creditcard.p165ui.invite.CreditApplicationInviteBannerAdapter;
import com.robinhood.android.lib.creditcard.p165ui.invite.CreditApplicationInviteBannerDuxo4;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.models.futures.api.bonfire.ApiFuturesContractSearchItem;
import com.robinhood.android.models.futures.api.bonfire.ApiFuturesProductSearchItem;
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
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.screener.p248ui.ScreenersAdapter;
import com.robinhood.android.search.C27909R;
import com.robinhood.android.search.contracts.SearchFragmentKey;
import com.robinhood.android.search.contracts.SnacksWebViewFragmentKey;
import com.robinhood.android.search.databinding.FragmentSearchBinding;
import com.robinhood.android.search.highlights.duxo.SearchHighlightsDuxo;
import com.robinhood.android.search.highlights.duxo.SearchHighlightsViewState;
import com.robinhood.android.search.highlights.interactions.SearchHighlightInteractable;
import com.robinhood.android.search.highlights.p249ui.SearchHighlightDisclosureAdapter;
import com.robinhood.android.search.highlights.p249ui.SearchHighlightsAdapter;
import com.robinhood.android.search.highlights.p249ui.subpages.SearchHighlightSubpageData;
import com.robinhood.android.search.newsfeed.view.NewsFeedElementAdapter;
import com.robinhood.android.search.recentSearch.RecentSearchAdapter;
import com.robinhood.android.search.recentSearch.RecentSearchConverters;
import com.robinhood.android.search.screeners.ScreenerSearchAnalytics;
import com.robinhood.android.search.search.SearchAdapter;
import com.robinhood.android.search.search.SearchFragment;
import com.robinhood.android.search.search.SearchItem;
import com.robinhood.android.search.search.SearchViewState;
import com.robinhood.android.search.search.p250ui.SearchToolbarViewWrapper;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.equityscreener.models.p294db.Screener;
import com.robinhood.iac.crosssell.CrossSellLaunchManager;
import com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.api.GenericErrorResponse;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.IacAlertSheetLocation;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Security;
import com.robinhood.models.p320db.recentSearch.RecentSearch;
import com.robinhood.models.p320db.recentSearch.RecentSearch2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.ListsContext;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.SearchResultItem;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.shared.common.contracts.RhEmbeddedWebViewFragmentKey;
import com.robinhood.shared.crypto.contracts.detail.CryptoDetailFragmentKey;
import com.robinhood.shared.home.contracts.TabLinkIntentKey;
import com.robinhood.shared.lists.quickadd.CuratedListQuickAddFragment;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLessonPreview;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.view.recyclerview.AlwaysScrollToTopLayoutEnforcer;
import com.robinhood.utils.p409ui.view.recyclerview.CompositeAdapter;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.noties.markwon.Markwon;
import io.reactivex.Observable;
import io.reactivex.functions.Predicate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import p479j$.time.Instant;

/* compiled from: SearchFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0096\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 ©\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\u0002©\u0002B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010§\u0001\u001a\u00030¨\u00012\b\u0010©\u0001\u001a\u00030ª\u0001H\u0002J\u0014\u0010«\u0001\u001a\u00030¨\u00012\b\u0010¬\u0001\u001a\u00030\u00ad\u0001H\u0002J\u001b\u0010®\u0001\u001a\u00030¨\u00012\t\u0010¯\u0001\u001a\u0004\u0018\u000106H\u0002¢\u0006\u0003\u0010°\u0001J\u0014\u0010±\u0001\u001a\u00030¨\u00012\b\u0010²\u0001\u001a\u00030³\u0001H\u0002J\u0014\u0010´\u0001\u001a\u00030¨\u00012\b\u0010²\u0001\u001a\u00030³\u0001H\u0002J\u001e\u0010µ\u0001\u001a\u00030¨\u00012\b\u0010²\u0001\u001a\u00030³\u00012\b\u0010¶\u0001\u001a\u00030·\u0001H\u0002J\u001e\u0010¸\u0001\u001a\u00030¨\u00012\b\u0010²\u0001\u001a\u00030³\u00012\b\u0010¶\u0001\u001a\u00030·\u0001H\u0002J\n\u0010¹\u0001\u001a\u00030¨\u0001H\u0002J!\u0010º\u0001\u001a\u00030¨\u00012\u0007\u0010»\u0001\u001a\u00020A2\f\b\u0002\u0010¼\u0001\u001a\u0005\u0018\u00010\u008c\u0001H\u0002J\u0014\u0010½\u0001\u001a\u00030¨\u00012\b\u0010¾\u0001\u001a\u00030¿\u0001H\u0016J \u0010À\u0001\u001a\u00030¨\u00012\b\u0010Á\u0001\u001a\u00030Â\u00012\n\u0010Ã\u0001\u001a\u0005\u0018\u00010Ä\u0001H\u0016J\n\u0010Å\u0001\u001a\u00030¨\u0001H\u0016J\n\u0010Æ\u0001\u001a\u00030¨\u0001H\u0016J\n\u0010Ç\u0001\u001a\u00030¨\u0001H\u0016J\n\u0010È\u0001\u001a\u00030¨\u0001H\u0016J\u0014\u0010É\u0001\u001a\u00030¨\u00012\b\u0010Ê\u0001\u001a\u00030Ë\u0001H\u0016J\n\u0010Ì\u0001\u001a\u00030¨\u0001H\u0002J\u0013\u0010Í\u0001\u001a\u00030¨\u00012\u0007\u0010Î\u0001\u001a\u00020AH\u0016J\n\u0010Ï\u0001\u001a\u00030¨\u0001H\u0016J\n\u0010Ð\u0001\u001a\u00030¨\u0001H\u0016J\u0013\u0010Ñ\u0001\u001a\u00030¨\u00012\u0007\u0010Ò\u0001\u001a\u00020EH\u0016J\n\u0010Ó\u0001\u001a\u00030¨\u0001H\u0002J\n\u0010Ô\u0001\u001a\u00030¨\u0001H\u0016J\u0014\u0010Õ\u0001\u001a\u00030¨\u00012\b\u0010Ö\u0001\u001a\u00030×\u0001H\u0016J\u001d\u0010Ø\u0001\u001a\u00030¨\u00012\b\u0010²\u0001\u001a\u00030³\u00012\u0007\u0010Ù\u0001\u001a\u00020EH\u0016J\u001d\u0010Ú\u0001\u001a\u00030¨\u00012\b\u0010²\u0001\u001a\u00030³\u00012\u0007\u0010Ù\u0001\u001a\u00020EH\u0016J\u0014\u0010Û\u0001\u001a\u00030¨\u00012\b\u0010²\u0001\u001a\u00030³\u0001H\u0016J\u001c\u0010Ü\u0001\u001a\u00030¨\u00012\u0007\u0010Ý\u0001\u001a\u00020N2\u0007\u0010Þ\u0001\u001a\u000206H\u0016J\u0014\u0010ß\u0001\u001a\u00030¨\u00012\b\u0010à\u0001\u001a\u00030á\u0001H\u0016J\u0014\u0010â\u0001\u001a\u00030¨\u00012\b\u0010à\u0001\u001a\u00030ã\u0001H\u0016J\u0014\u0010ä\u0001\u001a\u00030¨\u00012\b\u0010å\u0001\u001a\u00030æ\u0001H\u0016J\u0014\u0010ç\u0001\u001a\u00030¨\u00012\b\u0010è\u0001\u001a\u00030é\u0001H\u0016J\u0014\u0010ê\u0001\u001a\u00030¨\u00012\b\u0010è\u0001\u001a\u00030é\u0001H\u0016J\u0014\u0010ë\u0001\u001a\u00030¨\u00012\b\u0010ì\u0001\u001a\u00030í\u0001H\u0002J\u0014\u0010î\u0001\u001a\u00030¨\u00012\b\u0010ì\u0001\u001a\u00030ï\u0001H\u0002J\u0014\u0010ð\u0001\u001a\u00030¨\u00012\b\u0010ì\u0001\u001a\u00030ñ\u0001H\u0002J\u0014\u0010ò\u0001\u001a\u00030¨\u00012\b\u0010ì\u0001\u001a\u00030ó\u0001H\u0002J\u0014\u0010ô\u0001\u001a\u00030¨\u00012\b\u0010ì\u0001\u001a\u00030õ\u0001H\u0002J\u0014\u0010ö\u0001\u001a\u00030¨\u00012\b\u0010ì\u0001\u001a\u00030÷\u0001H\u0002J\u0014\u0010ø\u0001\u001a\u00030¨\u00012\b\u0010ì\u0001\u001a\u00030ù\u0001H\u0002J\u0014\u0010ú\u0001\u001a\u00030¨\u00012\b\u0010ì\u0001\u001a\u00030û\u0001H\u0002J\u0014\u0010ü\u0001\u001a\u00030¨\u00012\b\u0010ì\u0001\u001a\u00030ý\u0001H\u0002J\u0013\u0010þ\u0001\u001a\u00020E2\b\u0010ÿ\u0001\u001a\u00030æ\u0001H\u0002J\u001d\u0010\u0080\u0002\u001a\u00030¨\u00012\u0007\u0010\u0081\u0002\u001a\u00020E2\b\u0010²\u0001\u001a\u00030³\u0001H\u0002J\u001f\u0010\u0086\u0002\u001a\u00030æ\u00012\b\u0010å\u0001\u001a\u00030æ\u00012\t\u0010\u0087\u0002\u001a\u0004\u0018\u00010AH\u0002J\n\u0010\u0088\u0002\u001a\u00030¨\u0001H\u0002J\u0019\u0010\u0089\u0002\u001a\u00030¨\u00012\r\u0010\u008a\u0002\u001a\b0\u008b\u0002j\u0003`\u008c\u0002H\u0002J\n\u0010\u008d\u0002\u001a\u00030¨\u0001H\u0002J\u001e\u0010\u008e\u0002\u001a\u00030¨\u00012\b\u0010\u008f\u0002\u001a\u00030\u0090\u00022\b\u0010Á\u0001\u001a\u00030Â\u0001H\u0002J\u001d\u0010\u0091\u0002\u001a\u00030¨\u00012\b\u0010\u0092\u0002\u001a\u00030\u0093\u00022\u0007\u0010\u0094\u0002\u001a\u00020EH\u0016J\u001d\u0010\u0095\u0002\u001a\u00030¨\u00012\b\u0010\u0092\u0002\u001a\u00030\u0093\u00022\u0007\u0010\u0094\u0002\u001a\u00020EH\u0002J'\u0010\u0096\u0002\u001a\u00030¨\u00012\b\u0010\u0092\u0002\u001a\u00030\u0093\u00022\b\u0010\u0097\u0002\u001a\u00030\u0098\u00022\u0007\u0010\u0094\u0002\u001a\u00020EH\u0016J\u0014\u0010\u0099\u0002\u001a\u00030¨\u00012\b\u0010\u0092\u0002\u001a\u00030\u0093\u0002H\u0016J\n\u0010\u009a\u0002\u001a\u00030¨\u0001H\u0016J\u0014\u0010\u009b\u0002\u001a\u00030¨\u00012\b\u0010\u0092\u0002\u001a\u00030\u0093\u0002H\u0016J\u001e\u0010\u009c\u0002\u001a\u00030¨\u00012\b\u0010\u0092\u0002\u001a\u00030\u0093\u00022\b\u0010\u009d\u0002\u001a\u00030\u009e\u0002H\u0016J\u0014\u0010\u009f\u0002\u001a\u00030¨\u00012\b\u0010\u0092\u0002\u001a\u00030 \u0002H\u0016J\u0014\u0010¡\u0002\u001a\u00030¨\u00012\b\u0010\u0092\u0002\u001a\u00030 \u0002H\u0016J\u0014\u0010¢\u0002\u001a\u00030¨\u00012\b\u0010£\u0002\u001a\u00030¤\u0002H\u0002J\n\u0010¥\u0002\u001a\u00030¨\u0001H\u0016J\u0014\u0010¦\u0002\u001a\u00030¨\u00012\b\u0010§\u0002\u001a\u00030¨\u0002H\u0016R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020$8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001e\u0010)\u001a\u00020*8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001b\u0010/\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b1\u00102R\u000e\u00105\u001a\u000206X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u00107\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u00104\u001a\u0004\b9\u0010:R\u0016\u0010<\u001a\u0004\u0018\u00010=8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0016\u0010@\u001a\u0004\u0018\u00010A8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020E8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010FR\u000e\u0010G\u001a\u00020EX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010H\u001a\u0004\u0018\u00010I8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u001c\u0010L\u001a\u0010\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020N\u0018\u00010MX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020PX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020RX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020TX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010U\u001a\u00020V8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u00104\u001a\u0004\bW\u0010XR\u001b\u0010Z\u001a\u00020[8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b^\u00104\u001a\u0004\b\\\u0010]R\u001b\u0010_\u001a\u00020V8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\ba\u00104\u001a\u0004\b`\u0010XR\u001b\u0010b\u001a\u00020c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bf\u00104\u001a\u0004\bd\u0010eR\u001b\u0010g\u001a\u00020h8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bk\u00104\u001a\u0004\bi\u0010jR\u001b\u0010l\u001a\u00020m8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bp\u00104\u001a\u0004\bn\u0010oR\u001b\u0010q\u001a\u00020r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bu\u00104\u001a\u0004\bs\u0010tR\u0010\u0010v\u001a\u0004\u0018\u00010wX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010x\u001a\u00020y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b|\u00104\u001a\u0004\bz\u0010{R\u001d\u0010}\u001a\u00020~8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0081\u0001\u00104\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0017\u0010\u0082\u0001\u001a\n\u0012\u0005\u0012\u00030\u0084\u00010\u0083\u0001X\u0082.¢\u0006\u0002\n\u0000R!\u0010\u0085\u0001\u001a\u00030\u0086\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\"\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u008c\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u008f\u0001\u00104\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u000f\u0010\u0090\u0001\u001a\u00020AX\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u0091\u0001\u001a\u00020EX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0092\u0001\u001a\u00030\u0093\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0018\u0010\u0096\u0001\u001a\u00030\u0097\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001d\u0010\u009a\u0001\u001a\b0\u009b\u0001j\u0003`\u009c\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0016\u0010\u009f\u0001\u001a\u00020EX\u0096D¢\u0006\t\n\u0000\u001a\u0005\b \u0001\u0010FR\u0016\u0010¡\u0001\u001a\u00020EX\u0096D¢\u0006\t\n\u0000\u001a\u0005\b¢\u0001\u0010FR\u001c\u0010£\u0001\u001a\u000f\u0012\u0004\u0012\u00020=\u0012\u0005\u0012\u00030¤\u00010MX\u0082.¢\u0006\u0002\n\u0000R\u001d\u0010¥\u0001\u001a\u0010\u0012\u0004\u0012\u00020=\u0012\u0005\u0012\u00030¤\u00010¦\u0001X\u0082.¢\u0006\u0002\n\u0000R\u0016\u0010\u0082\u0002\u001a\u00020A8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0083\u0002\u0010CR\u0018\u0010\u0084\u0002\u001a\u0004\u0018\u00010A8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0085\u0002\u0010C¨\u0006ª\u0002"}, m3636d2 = {"Lcom/robinhood/android/search/search/SearchFragment;", "Lcom/robinhood/android/common/ui/BaseRhBottomSheetDialogHostFragment;", "Lcom/robinhood/android/common/ui/tabs/Scrollable;", "Lcom/robinhood/android/search/search/SearchAdapter$Callbacks;", "Lcom/robinhood/android/search/recentSearch/RecentSearchAdapter$Callbacks;", "Lcom/robinhood/android/search/newsfeed/view/NewsFeedElementAdapter$Callbacks;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/search/search/ui/SearchToolbarViewWrapper$Callback;", "Lcom/robinhood/android/search/highlights/interactions/SearchHighlightInteractable;", "<init>", "()V", "shortcutManager", "Lcom/robinhood/android/common/util/RhShortcutManager;", "getShortcutManager", "()Lcom/robinhood/android/common/util/RhShortcutManager;", "setShortcutManager", "(Lcom/robinhood/android/common/util/RhShortcutManager;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "loggedCustomTabs", "Lcom/robinhood/android/newsfeed/view/util/LoggedCustomTabs;", "getLoggedCustomTabs", "()Lcom/robinhood/android/newsfeed/view/util/LoggedCustomTabs;", "setLoggedCustomTabs", "(Lcom/robinhood/android/newsfeed/view/util/LoggedCustomTabs;)V", "crossSellLaunchManager", "Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "getCrossSellLaunchManager", "()Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "setCrossSellLaunchManager", "(Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;)V", "logOnceEventLogger", "Lcom/robinhood/analytics/LogOnceEventLogger;", "getLogOnceEventLogger", "()Lcom/robinhood/analytics/LogOnceEventLogger;", "logOnceEventLogger$delegate", "Lkotlin/Lazy;", "toastPopupOffsetHeight", "", "newsFeedAnalytics", "Lcom/robinhood/android/newsfeed/util/NewsFeedAnalytics;", "getNewsFeedAnalytics", "()Lcom/robinhood/android/newsfeed/util/NewsFeedAnalytics;", "newsFeedAnalytics$delegate", "curatedListId", "Ljava/util/UUID;", "getCuratedListId", "()Ljava/util/UUID;", "curatedListDisplayName", "", "getCuratedListDisplayName", "()Ljava/lang/String;", "isSearchFromCuratedList", "", "()Z", "isQueryChangedByTyping", "curatedListQuickAddFragment", "Lcom/robinhood/shared/lists/quickadd/CuratedListQuickAddFragment;", "getCuratedListQuickAddFragment", "()Lcom/robinhood/shared/lists/quickadd/CuratedListQuickAddFragment;", "listChipsVisibleItemsManager", "Lcom/robinhood/android/common/util/VisibleItemsManager;", "Lcom/robinhood/android/common/ui/CuratedListChipItem;", "layoutEnforcer", "Lcom/robinhood/utils/ui/view/recyclerview/AlwaysScrollToTopLayoutEnforcer;", "searchAdapter", "Lcom/robinhood/android/search/search/SearchAdapter;", "recentSearchAdapter", "Lcom/robinhood/android/search/recentSearch/RecentSearchAdapter;", "elementAdapter", "Lcom/robinhood/android/search/newsfeed/view/NewsFeedElementAdapter;", "getElementAdapter", "()Lcom/robinhood/android/search/newsfeed/view/NewsFeedElementAdapter;", "elementAdapter$delegate", "screenerAdapter", "Lcom/robinhood/android/screener/ui/ScreenersAdapter;", "getScreenerAdapter", "()Lcom/robinhood/android/screener/ui/ScreenersAdapter;", "screenerAdapter$delegate", "recommendationsFirstAdapter", "getRecommendationsFirstAdapter", "recommendationsFirstAdapter$delegate", "creditAppInviteAdapter", "Lcom/robinhood/android/lib/creditcard/ui/invite/CreditApplicationInviteBannerAdapter;", "getCreditAppInviteAdapter", "()Lcom/robinhood/android/lib/creditcard/ui/invite/CreditApplicationInviteBannerAdapter;", "creditAppInviteAdapter$delegate", "highlightsAdapter", "Lcom/robinhood/android/search/highlights/ui/SearchHighlightsAdapter;", "getHighlightsAdapter", "()Lcom/robinhood/android/search/highlights/ui/SearchHighlightsAdapter;", "highlightsAdapter$delegate", "disclosuresAdapter", "Lcom/robinhood/android/search/highlights/ui/SearchHighlightDisclosureAdapter;", "getDisclosuresAdapter", "()Lcom/robinhood/android/search/highlights/ui/SearchHighlightDisclosureAdapter;", "disclosuresAdapter$delegate", "compositeDiscoverAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/CompositeAdapter;", "getCompositeDiscoverAdapter", "()Lcom/robinhood/utils/ui/view/recyclerview/CompositeAdapter;", "compositeDiscoverAdapter$delegate", "discoverLayoutManager", "Lcom/robinhood/android/common/ui/ScrollableLayoutManager;", "duxo", "Lcom/robinhood/android/search/search/SearchDuxo;", "getDuxo", "()Lcom/robinhood/android/search/search/SearchDuxo;", "duxo$delegate", "highlightsDuxo", "Lcom/robinhood/android/search/highlights/duxo/SearchHighlightsDuxo;", "getHighlightsDuxo", "()Lcom/robinhood/android/search/highlights/duxo/SearchHighlightsDuxo;", "highlightsDuxo$delegate", "errorHandler", "Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;", "", "binding", "Lcom/robinhood/android/search/databinding/FragmentSearchBinding;", "getBinding", "()Lcom/robinhood/android/search/databinding/FragmentSearchBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "checkmarkDrawable", "Landroid/graphics/drawable/Drawable;", "getCheckmarkDrawable", "()Landroid/graphics/drawable/Drawable;", "checkmarkDrawable$delegate", "searchText", "userScrolled", "searchBarViewWrapper", "Lcom/robinhood/android/search/search/ui/SearchToolbarViewWrapper;", "getSearchBarViewWrapper", "()Lcom/robinhood/android/search/search/ui/SearchToolbarViewWrapper;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "useDesignSystemToolbar", "getUseDesignSystemToolbar", "childFragmentsShouldNotConfigureToolbar", "getChildFragmentsShouldNotConfigureToolbar", "visibleItemsManager", "Lcom/robinhood/android/newsfeed/model/Element;", "visibleAutoLoggableViewManager", "Lcom/robinhood/android/autoeventlogging/VisibleAutoLoggableViewManager;", "setViewState", "", "viewState", "Lcom/robinhood/android/search/search/SearchViewState;", "updateDisplayMode", "displayMode", "Lcom/robinhood/android/search/search/SearchViewState$DisplayMode;", "scrollToTarget", "targetIndex", "(Ljava/lang/Integer;)V", "onSecurityAddedToCuratedList", "security", "Lcom/robinhood/models/db/Security;", "onSecurityRemovedFromCuratedList", "onSecurityAddToCuratedListError", "t", "", "onSecurityRemoveFromCuratedListError", "onDeleteRecentSearchError", "showRdsSnackbar", "message", "iconDrawable", "onAttach", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onResume", "onStop", "onDestroyView", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "setupComposeSearchToolbar", "onQueryChanged", "query", "onQueryCleared", "onQueryCancelled", "onFocusChanged", "focused", "resetTextField", "onToolbarBackPressed", "onListChipsRecyclerViewCreated", "recyclerView", "Lcom/robinhood/android/common/ui/CuratedListChipRecyclerView;", "onSecurityClicked", "isAlreadyInUserList", "onAddToWatchlistClicked", "onRemoveFromWatchlistClicked", "onCuratedListChipItemClicked", WebsocketGatewayConstants.DATA_KEY, "position", "onEducationClicked", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/android/search/search/SearchItem$EducationRow;", "onDeeplinkClicked", "Lcom/robinhood/android/search/search/SearchItem$DeeplinkRow;", "onHeaderWithActionClicked", "uri", "Landroid/net/Uri;", "onRecentSearchClicked", "recentSearch", "Lcom/robinhood/models/db/recentSearch/RecentSearch$RecentSearchResult;", "onRecentSearchDeleted", "onInstrumentRecentSearchClicked", "recentSearchItem", "Lcom/robinhood/models/db/recentSearch/RecentSearchItem$Instrument;", "onCryptoRecentSearchClicked", "Lcom/robinhood/models/db/recentSearch/RecentSearchItem$Crypto;", "onFuturesContractRecentSearchClicked", "Lcom/robinhood/models/db/recentSearch/RecentSearchItem$FuturesContract;", "onFuturesProductRecentSearchClicked", "Lcom/robinhood/models/db/recentSearch/RecentSearchItem$FuturesProduct;", "onEventContractRecentSearchClicked", "Lcom/robinhood/models/db/recentSearch/RecentSearchItem$EventContract;", "onEducationRecentSearchClicked", "Lcom/robinhood/models/db/recentSearch/RecentSearchItem$Education;", "onDeeplinkRecentSearchClicked", "Lcom/robinhood/models/db/recentSearch/RecentSearchItem$Deeplink;", "onListChipItemRecentSearchClicked", "Lcom/robinhood/models/db/recentSearch/RecentSearchItem$CuratedListChipItem;", "onIndexRecentSearchClicked", "Lcom/robinhood/models/db/recentSearch/RecentSearchItem$MarketIndex;", "handleDeeplinkWithPotentialAccountNumberNeeded", "deeplinkUri", "logCuratedListItemUpdateAction", "added", "screenName", "getScreenName", "entityId", "getEntityId", "appendAccountNumberToDeeplink", "accountNumber", "ensureCuratedListQuickAddFragment", "logSearchBarEvent", "eventType", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$EventType;", "Lcom/robinhood/rosetta/eventlogging/EventType;", "resetEventLoggers", "attachToastPopup", "activity", "Landroid/app/Activity;", "onContentClick", "content", "Lcom/robinhood/android/newsfeed/model/Content;", "inCarousel", "handleContentClick", "onContentRelatedInstrumentClick", "instrument", "Lcom/robinhood/android/newsfeed/model/RelatedInstrument;", "onCarouselContentClick", "onEducationHomeEntryPointClick", "onCarouselContentAppear", "onCarouselContentDisappear", "durationVisible", "", "onListsChipContentAppear", "Lcom/robinhood/android/newsfeed/model/Content$ListPreview;", "onListsChipContentClick", "initVisibleViewManagers", "linearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "scrollToTop", "processDeeplink", "tabIntentKey", "Lcom/robinhood/shared/home/contracts/TabLinkIntentKey$Search;", "Companion", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class SearchFragment extends BaseRhBottomSheetDialogHostFragment implements Scrollable, SearchAdapter.Callbacks, RecentSearchAdapter.Callbacks, NewsFeedElementAdapter.Callbacks, AutoLoggableFragment, SearchToolbarViewWrapper.Callback, SearchHighlightInteractable {
    private static final String ANALYTICS_PREFIX = "search";
    private static final String QUICK_ADD_TAG = "quickAddFragment";
    private static final String SCREEN_NAME_LIST_ITEM_SEARCH = "ListItemSearch";
    public AnalyticsLogger analytics;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: checkmarkDrawable$delegate, reason: from kotlin metadata */
    private final Lazy checkmarkDrawable;
    private final boolean childFragmentsShouldNotConfigureToolbar;

    /* renamed from: compositeDiscoverAdapter$delegate, reason: from kotlin metadata */
    private final Lazy compositeDiscoverAdapter;

    /* renamed from: creditAppInviteAdapter$delegate, reason: from kotlin metadata */
    private final Lazy creditAppInviteAdapter;
    public CrossSellLaunchManager crossSellLaunchManager;

    /* renamed from: disclosuresAdapter$delegate, reason: from kotlin metadata */
    private final Lazy disclosuresAdapter;
    private ScrollableLayoutManager discoverLayoutManager;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: elementAdapter$delegate, reason: from kotlin metadata */
    private final Lazy elementAdapter;
    private ActivityErrorHandler<Object> errorHandler;
    public EventLogger eventLogger;

    /* renamed from: highlightsAdapter$delegate, reason: from kotlin metadata */
    private final Lazy highlightsAdapter;

    /* renamed from: highlightsDuxo$delegate, reason: from kotlin metadata */
    private final Lazy highlightsDuxo;
    private boolean isQueryChangedByTyping;
    private final AlwaysScrollToTopLayoutEnforcer layoutEnforcer;
    private VisibleItemsManager<UUID, CuratedListChipItem> listChipsVisibleItemsManager;

    /* renamed from: logOnceEventLogger$delegate, reason: from kotlin metadata */
    private final Lazy logOnceEventLogger;
    public LoggedCustomTabs loggedCustomTabs;
    public Markwon markwon;

    /* renamed from: newsFeedAnalytics$delegate, reason: from kotlin metadata */
    private final Lazy newsFeedAnalytics;
    private final RecentSearchAdapter recentSearchAdapter;

    /* renamed from: recommendationsFirstAdapter$delegate, reason: from kotlin metadata */
    private final Lazy recommendationsFirstAdapter;

    /* renamed from: screenerAdapter$delegate, reason: from kotlin metadata */
    private final Lazy screenerAdapter;
    private final SearchAdapter searchAdapter;
    private String searchText;
    public RhShortcutManager shortcutManager;
    private int toastPopupOffsetHeight;
    private final boolean useDesignSystemToolbar;
    private boolean userScrolled;
    private VisibleAutoLoggableViewManager<UUID, Element> visibleAutoLoggableViewManager;
    private VisibleItemsManager<UUID, Element> visibleItemsManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SearchFragment.class, "binding", "getBinding()Lcom/robinhood/android/search/databinding/FragmentSearchBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Set<String> deeplinksNeedingAccountNumber = SetsKt.setOf((Object[]) new String[]{"robinhood://account", "robinhood://buying_power", "robinhood://drip_settings", "robinhood://recurring_investments", "robinhood://sweep_onboarding"});

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
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    @Override // com.robinhood.android.search.newsfeed.view.NewsFeedElementAdapter.Callbacks
    public void onContentRelatedAssetClick(Content content, RelatedAsset relatedAsset, boolean z) {
        NewsFeedElementAdapter.Callbacks.DefaultImpls.onContentRelatedAssetClick(this, content, relatedAsset, z);
    }

    @Override // com.robinhood.android.search.newsfeed.view.NewsFeedElementAdapter.Callbacks
    public void onEducationLessonsAppear(List<EducationLessonPreview> list) {
        NewsFeedElementAdapter.Callbacks.DefaultImpls.onEducationLessonsAppear(this, list);
    }

    @Override // com.robinhood.android.search.newsfeed.view.NewsFeedElementAdapter.Callbacks
    public void onToggleVideoAudioAppear(Content.Video video, boolean z) {
        NewsFeedElementAdapter.Callbacks.DefaultImpls.onToggleVideoAudioAppear(this, video, z);
    }

    @Override // com.robinhood.android.search.newsfeed.view.NewsFeedElementAdapter.Callbacks
    public void onToggleVideoAudioClick(Content.Video video, boolean z) {
        NewsFeedElementAdapter.Callbacks.DefaultImpls.onToggleVideoAudioClick(this, video, z);
    }

    public SearchFragment() {
        super(C27909R.layout.fragment_search);
        this.logOnceEventLogger = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.search.search.SearchFragment$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchFragment.logOnceEventLogger_delegate$lambda$0(this.f$0);
            }
        });
        this.newsFeedAnalytics = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.robinhood.android.search.search.SearchFragment$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchFragment.newsFeedAnalytics_delegate$lambda$1(this.f$0);
            }
        });
        AlwaysScrollToTopLayoutEnforcer alwaysScrollToTopLayoutEnforcer = new AlwaysScrollToTopLayoutEnforcer();
        this.layoutEnforcer = alwaysScrollToTopLayoutEnforcer;
        SearchAdapter searchAdapter = new SearchAdapter(this);
        searchAdapter.registerAdapterDataObserver(alwaysScrollToTopLayoutEnforcer);
        this.searchAdapter = searchAdapter;
        RecentSearchAdapter recentSearchAdapter = new RecentSearchAdapter(this);
        recentSearchAdapter.registerAdapterDataObserver(alwaysScrollToTopLayoutEnforcer);
        this.recentSearchAdapter = recentSearchAdapter;
        this.elementAdapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.search.search.SearchFragment$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchFragment.elementAdapter_delegate$lambda$5(this.f$0);
            }
        });
        this.screenerAdapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.search.search.SearchFragment$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchFragment.screenerAdapter_delegate$lambda$6(this.f$0);
            }
        });
        this.recommendationsFirstAdapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.search.search.SearchFragment$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchFragment.recommendationsFirstAdapter_delegate$lambda$7(this.f$0);
            }
        });
        this.creditAppInviteAdapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.search.search.SearchFragment$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchFragment.creditAppInviteAdapter_delegate$lambda$8(this.f$0);
            }
        });
        this.highlightsAdapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.search.search.SearchFragment$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchFragment.highlightsAdapter_delegate$lambda$11(this.f$0);
            }
        });
        this.disclosuresAdapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.search.search.SearchFragment$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchFragment.disclosuresAdapter_delegate$lambda$12(this.f$0);
            }
        });
        this.compositeDiscoverAdapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.search.search.SearchFragment$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchFragment.compositeDiscoverAdapter_delegate$lambda$13(this.f$0);
            }
        });
        this.duxo = DuxosKt.duxo(this, SearchDuxo.class);
        this.highlightsDuxo = DuxosKt.duxo(this, SearchHighlightsDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, SearchFragment2.INSTANCE);
        this.checkmarkDrawable = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.search.search.SearchFragment$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchFragment.checkmarkDrawable_delegate$lambda$14(this.f$0);
            }
        });
        this.searchText = "";
        this.useDesignSystemToolbar = true;
        this.childFragmentsShouldNotConfigureToolbar = true;
    }

    public final RhShortcutManager getShortcutManager() {
        RhShortcutManager rhShortcutManager = this.shortcutManager;
        if (rhShortcutManager != null) {
            return rhShortcutManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("shortcutManager");
        return null;
    }

    public final void setShortcutManager(RhShortcutManager rhShortcutManager) {
        Intrinsics.checkNotNullParameter(rhShortcutManager, "<set-?>");
        this.shortcutManager = rhShortcutManager;
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

    private final LogOnceEventLogger getLogOnceEventLogger() {
        return (LogOnceEventLogger) this.logOnceEventLogger.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LogOnceEventLogger logOnceEventLogger_delegate$lambda$0(SearchFragment searchFragment) {
        return new LogOnceEventLogger(searchFragment.getEventLogger());
    }

    private final NewsFeedAnalytics getNewsFeedAnalytics() {
        return (NewsFeedAnalytics) this.newsFeedAnalytics.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NewsFeedAnalytics newsFeedAnalytics_delegate$lambda$1(SearchFragment searchFragment) {
        return new NewsFeedAnalytics(searchFragment.getAnalytics(), "search", searchFragment.getEventLogger(), new Screen(Screen.Name.BROWSE_SEARCH, null, null, null, 14, null));
    }

    private final UUID getCuratedListId() {
        return ((SearchFragmentKey) INSTANCE.getArgs((Fragment) this)).getListId();
    }

    private final String getCuratedListDisplayName() {
        return ((SearchFragmentKey) INSTANCE.getArgs((Fragment) this)).getListDisplayName();
    }

    private final boolean isSearchFromCuratedList() {
        return getCuratedListId() != null;
    }

    private final CuratedListQuickAddFragment getCuratedListQuickAddFragment() {
        Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("quickAddFragment");
        if (fragmentFindFragmentByTag instanceof CuratedListQuickAddFragment) {
            return (CuratedListQuickAddFragment) fragmentFindFragmentByTag;
        }
        return null;
    }

    private final NewsFeedElementAdapter getElementAdapter() {
        return (NewsFeedElementAdapter) this.elementAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NewsFeedElementAdapter elementAdapter_delegate$lambda$5(SearchFragment searchFragment) {
        Lifecycle lifecycle = searchFragment.getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        NewsFeedElementAdapter newsFeedElementAdapter = new NewsFeedElementAdapter(lifecycle, ((SearchFragmentKey) INSTANCE.getArgs((Fragment) searchFragment)).getAccountNumber());
        newsFeedElementAdapter.setCallbacks(searchFragment);
        return newsFeedElementAdapter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ScreenersAdapter getScreenerAdapter() {
        return (ScreenersAdapter) this.screenerAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScreenersAdapter screenerAdapter_delegate$lambda$6(SearchFragment searchFragment) {
        Context contextRequireContext = searchFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator navigator = searchFragment.getNavigator();
        FragmentManager parentFragmentManager = searchFragment.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        return new ScreenersAdapter(contextRequireContext, navigator, parentFragmentManager, 3, new ScreenerSearchAnalytics(searchFragment.getEventLogger(), searchFragment.getLogOnceEventLogger()), ((SearchFragmentKey) INSTANCE.getArgs((Fragment) searchFragment)).getAccountNumber());
    }

    private final NewsFeedElementAdapter getRecommendationsFirstAdapter() {
        return (NewsFeedElementAdapter) this.recommendationsFirstAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NewsFeedElementAdapter recommendationsFirstAdapter_delegate$lambda$7(SearchFragment searchFragment) {
        Lifecycle lifecycle = searchFragment.getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        return new NewsFeedElementAdapter(lifecycle, ((SearchFragmentKey) INSTANCE.getArgs((Fragment) searchFragment)).getAccountNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CreditApplicationInviteBannerAdapter getCreditAppInviteAdapter() {
        return (CreditApplicationInviteBannerAdapter) this.creditAppInviteAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreditApplicationInviteBannerAdapter creditAppInviteAdapter_delegate$lambda$8(SearchFragment searchFragment) {
        Context contextRequireContext = searchFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return new CreditApplicationInviteBannerAdapter(contextRequireContext, searchFragment.getNavigator(), CreditApplicationInviteBannerDuxo4.SEARCH);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SearchHighlightsAdapter getHighlightsAdapter() {
        return (SearchHighlightsAdapter) this.highlightsAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchHighlightsAdapter highlightsAdapter_delegate$lambda$11(final SearchFragment searchFragment) {
        return new SearchHighlightsAdapter(searchFragment.getNavigator(), ((SearchFragmentKey) INSTANCE.getArgs((Fragment) searchFragment)).getAccountNumber(), new Function1() { // from class: com.robinhood.android.search.search.SearchFragment$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchFragment.highlightsAdapter_delegate$lambda$11$lambda$9(this.f$0, ((Boolean) obj).booleanValue());
            }
        }, new Function1() { // from class: com.robinhood.android.search.search.SearchFragment$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchFragment.highlightsAdapter_delegate$lambda$11$lambda$10(this.f$0, (SearchHighlightSubpageData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit highlightsAdapter_delegate$lambda$11$lambda$9(SearchFragment searchFragment, boolean z) {
        searchFragment.getHighlightsDuxo().toggleShowMoreEarnings(z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit highlightsAdapter_delegate$lambda$11$lambda$10(SearchFragment searchFragment, SearchHighlightSubpageData subpage) {
        Intrinsics.checkNotNullParameter(subpage, "subpage");
        searchFragment.getHighlightsDuxo().onSubpageSelected(subpage);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SearchHighlightDisclosureAdapter getDisclosuresAdapter() {
        return (SearchHighlightDisclosureAdapter) this.disclosuresAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchHighlightDisclosureAdapter disclosuresAdapter_delegate$lambda$12(SearchFragment searchFragment) {
        return new SearchHighlightDisclosureAdapter(searchFragment.getNavigator());
    }

    private final CompositeAdapter getCompositeDiscoverAdapter() {
        return (CompositeAdapter) this.compositeDiscoverAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CompositeAdapter compositeDiscoverAdapter_delegate$lambda$13(SearchFragment searchFragment) {
        return new CompositeAdapter((RecyclerView.Adapter<?>[]) new RecyclerView.Adapter[]{searchFragment.getCreditAppInviteAdapter(), searchFragment.getHighlightsAdapter(), searchFragment.getRecommendationsFirstAdapter(), searchFragment.getScreenerAdapter(), searchFragment.getElementAdapter(), searchFragment.getDisclosuresAdapter()});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SearchDuxo getDuxo() {
        return (SearchDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SearchHighlightsDuxo getHighlightsDuxo() {
        return (SearchHighlightsDuxo) this.highlightsDuxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentSearchBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentSearchBinding) value;
    }

    private final Drawable getCheckmarkDrawable() {
        return (Drawable) this.checkmarkDrawable.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Drawable checkmarkDrawable_delegate$lambda$14(SearchFragment searchFragment) {
        return searchFragment.requireContext().getDrawable(C20690R.drawable.ic_rds_checkmark_16dp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SearchToolbarViewWrapper getSearchBarViewWrapper() {
        SearchToolbarViewWrapper searchBarViewWrapper = getBinding().searchBarViewWrapper;
        Intrinsics.checkNotNullExpressionValue(searchBarViewWrapper, "searchBarViewWrapper");
        return searchBarViewWrapper;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        if (isSearchFromCuratedList()) {
            return new Screen(Screen.Name.USER_LIST_DETAIL_SEARCH, null, null, null, 14, null);
        }
        return new Screen(Screen.Name.BROWSE_SEARCH, null, null, null, 14, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, ((SearchFragmentKey) INSTANCE.getArgs((Fragment) this)).getSourceScreen(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4097, -1, -1, -1, -1, -1, 16383, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getChildFragmentsShouldNotConfigureToolbar() {
        return this.childFragmentsShouldNotConfigureToolbar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(final SearchViewState viewState) throws Throwable {
        Throwable thConsume;
        Tuples2<Security, Throwable> tuples2Consume;
        Tuples2<Security, Throwable> tuples2Consume2;
        Security securityConsume;
        Security securityConsume2;
        Throwable thConsume2;
        getSearchBarViewWrapper().update(new Function1() { // from class: com.robinhood.android.search.search.SearchFragment$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchFragment.setViewState$lambda$15(viewState, (SearchToolbarViewWrapper.ViewState) obj);
            }
        });
        List<SearchItem> searchResult = viewState.getSearchResult();
        ArrayList arrayList = new ArrayList();
        for (Object obj : searchResult) {
            SearchItem searchItem = (SearchItem) obj;
            if (!(searchItem instanceof SearchItem.DeeplinkRow) || getNavigator().isDeepLinkSupported(((SearchItem.DeeplinkRow) searchItem).getUri())) {
                arrayList.add(obj);
            }
        }
        this.searchAdapter.submitList(arrayList);
        updateDisplayMode(viewState.getDisplayMode());
        UiEvent<Throwable> throwable = viewState.getThrowable();
        if (throwable != null && (thConsume2 = throwable.consume()) != null) {
            ActivityErrorHandler<Object> activityErrorHandler = this.errorHandler;
            if (activityErrorHandler == null) {
                Intrinsics.throwUninitializedPropertyAccessException("errorHandler");
                activityErrorHandler = null;
            }
            if (!AbsErrorHandler.handleError$default(activityErrorHandler, thConsume2, false, 2, null)) {
                throw thConsume2;
            }
        }
        UiEvent<Security> addedToList = viewState.getAddedToList();
        if (addedToList != null && (securityConsume2 = addedToList.consume()) != null) {
            onSecurityAddedToCuratedList(securityConsume2);
        }
        UiEvent<Security> removedFromList = viewState.getRemovedFromList();
        if (removedFromList != null && (securityConsume = removedFromList.consume()) != null) {
            onSecurityRemovedFromCuratedList(securityConsume);
        }
        UiEvent<Tuples2<Security, Throwable>> addedToListError = viewState.getAddedToListError();
        if (addedToListError != null && (tuples2Consume2 = addedToListError.consume()) != null) {
            onSecurityAddToCuratedListError(tuples2Consume2.component1(), tuples2Consume2.component2());
        }
        UiEvent<Tuples2<Security, Throwable>> removedFromListError = viewState.getRemovedFromListError();
        if (removedFromListError != null && (tuples2Consume = removedFromListError.consume()) != null) {
            onSecurityRemoveFromCuratedListError(tuples2Consume.component1(), tuples2Consume.component2());
        }
        UiEvent<Unit> deleteRecentSearchError = viewState.getDeleteRecentSearchError();
        if ((deleteRecentSearchError != null ? deleteRecentSearchError.consume() : null) != null) {
            onDeleteRecentSearchError();
        }
        getRecommendationsFirstAdapter().submitList(viewState.getRecommendationsCard());
        getScreenerAdapter().bind(viewState.getScreenersData());
        getElementAdapter().submitList(viewState.getElements());
        this.recentSearchAdapter.submitList(viewState.getRecentSearchItemsWithHeader());
        UiEvent<Optional<Integer>> scrollToTargetEvent = viewState.getScrollToTargetEvent();
        if (scrollToTargetEvent != null) {
            scrollToTargetEvent.consumeWith(new Function1() { // from class: com.robinhood.android.search.search.SearchFragment$$ExternalSyntheticLambda31
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return SearchFragment.setViewState$lambda$22(this.f$0, (Optional) obj2);
                }
            });
        }
        UiEvent<Unit> manualRefreshCompleteEvent = viewState.getManualRefreshCompleteEvent();
        if ((manualRefreshCompleteEvent != null ? manualRefreshCompleteEvent.consume() : null) != null) {
            getBinding().swipeRefreshView.setRefreshing(false);
        }
        UiEvent<Throwable> manualRefreshErrorEvent = viewState.getManualRefreshErrorEvent();
        if (manualRefreshErrorEvent != null && (thConsume = manualRefreshErrorEvent.consume()) != null) {
            getBinding().swipeRefreshView.setRefreshing(false);
            if (!AbsErrorHandler.handleError$default(getActivityErrorHandler(), thConsume, false, 2, null)) {
                throw thConsume;
            }
        }
        if (viewState.getRecyclerViewItemsFetched().getAllFetched()) {
            return;
        }
        scrollToTarget(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchToolbarViewWrapper.ViewState setViewState$lambda$15(SearchViewState searchViewState, SearchToolbarViewWrapper.ViewState update) {
        Intrinsics.checkNotNullParameter(update, "$this$update");
        return SearchToolbarViewWrapper.ViewState.copy$default(update, null, false, 0, false, searchViewState.getShowProgressBar(), null, 47, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViewState$lambda$22(SearchFragment searchFragment, Optional targetIndex) {
        Intrinsics.checkNotNullParameter(targetIndex, "targetIndex");
        searchFragment.scrollToTarget((Integer) targetIndex.getOrNull());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateDisplayMode(final SearchViewState.DisplayMode displayMode) {
        RecyclerView searchResultsList = getBinding().searchResultsList;
        Intrinsics.checkNotNullExpressionValue(searchResultsList, "searchResultsList");
        searchResultsList.setVisibility(displayMode == SearchViewState.DisplayMode.RESULTS ? 0 : 8);
        RecyclerView searchDiscoverList = getBinding().searchDiscoverList;
        Intrinsics.checkNotNullExpressionValue(searchDiscoverList, "searchDiscoverList");
        searchDiscoverList.setVisibility(displayMode == SearchViewState.DisplayMode.DISCOVER ? 0 : 8);
        RecyclerView recentSearchList = getBinding().recentSearchList;
        Intrinsics.checkNotNullExpressionValue(recentSearchList, "recentSearchList");
        recentSearchList.setVisibility(displayMode == SearchViewState.DisplayMode.RECENT_SEARCHES ? 0 : 8);
        LinearLayout recentSearchDefaultView = getBinding().recentSearchDefaultView;
        Intrinsics.checkNotNullExpressionValue(recentSearchDefaultView, "recentSearchDefaultView");
        recentSearchDefaultView.setVisibility(displayMode == SearchViewState.DisplayMode.EMPTY_RECENT_SEARCH_LIST ? 0 : 8);
        getSearchBarViewWrapper().update(new Function1() { // from class: com.robinhood.android.search.search.SearchFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchFragment.updateDisplayMode$lambda$24(displayMode, (SearchToolbarViewWrapper.ViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchToolbarViewWrapper.ViewState updateDisplayMode$lambda$24(SearchViewState.DisplayMode displayMode, SearchToolbarViewWrapper.ViewState update) {
        Intrinsics.checkNotNullParameter(update, "$this$update");
        return SearchToolbarViewWrapper.ViewState.copy$default(update, null, false, 0, false, false, displayMode, 31, null);
    }

    private final void scrollToTarget(Integer targetIndex) {
        if (this.userScrolled) {
            return;
        }
        if (targetIndex == null) {
            ScrollableLayoutManager scrollableLayoutManager = this.discoverLayoutManager;
            if (scrollableLayoutManager != null) {
                scrollableLayoutManager.scrollToPositionWithOffset(0, 0);
                return;
            }
            return;
        }
        int firstItemPositionOf = getCompositeDiscoverAdapter().getFirstItemPositionOf(getElementAdapter()) + targetIndex.intValue();
        ScrollableLayoutManager scrollableLayoutManager2 = this.discoverLayoutManager;
        if (scrollableLayoutManager2 != null) {
            scrollableLayoutManager2.scrollToPositionWithOffset(firstItemPositionOf, 0);
        }
    }

    private final void onSecurityAddedToCuratedList(Security security) {
        String string2 = getString(C11048R.string.lists_add_instrument_success_summary, security.getDisplaySymbol(), getCuratedListDisplayName());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        showRdsSnackbar(string2, getCheckmarkDrawable());
    }

    private final void onSecurityRemovedFromCuratedList(Security security) {
        String string2 = getString(C11048R.string.lists_remove_instrument_success_summary, security.getDisplaySymbol(), getCuratedListDisplayName());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        showRdsSnackbar(string2, getCheckmarkDrawable());
    }

    private final void onSecurityAddToCuratedListError(Security security, Throwable t) {
        String string2;
        ErrorResponse errorResponseExtractErrorResponse = NetworkThrowables.extractErrorResponse(t);
        GenericErrorResponse genericErrorResponse = errorResponseExtractErrorResponse instanceof GenericErrorResponse ? (GenericErrorResponse) errorResponseExtractErrorResponse : null;
        if (genericErrorResponse == null || (string2 = genericErrorResponse.getDisplayErrorText()) == null) {
            string2 = getString(C27909R.string.add_to_list_generic_error_message, security.getDisplaySymbol());
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        }
        showRdsSnackbar(string2, requireContext().getDrawable(C20690R.drawable.ic_rds_alert_24dp));
    }

    private final void onSecurityRemoveFromCuratedListError(Security security, Throwable t) {
        String string2;
        ErrorResponse errorResponseExtractErrorResponse = NetworkThrowables.extractErrorResponse(t);
        GenericErrorResponse genericErrorResponse = errorResponseExtractErrorResponse instanceof GenericErrorResponse ? (GenericErrorResponse) errorResponseExtractErrorResponse : null;
        if (genericErrorResponse == null || (string2 = genericErrorResponse.getDisplayErrorText()) == null) {
            string2 = getString(C27909R.string.remove_from_list_generic_error_message, security.getDisplaySymbol());
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        }
        showRdsSnackbar(string2, requireContext().getDrawable(C20690R.drawable.ic_rds_alert_24dp));
    }

    private final void onDeleteRecentSearchError() {
        String string2 = getString(C11048R.string.general_error_unable_to_save_changes);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        showRdsSnackbar(string2, requireContext().getDrawable(C20690R.drawable.ic_rds_info_24dp));
    }

    static /* synthetic */ void showRdsSnackbar$default(SearchFragment searchFragment, String str, Drawable drawable, int i, Object obj) {
        if ((i & 2) != 0) {
            drawable = null;
        }
        searchFragment.showRdsSnackbar(str, drawable);
    }

    private final void showRdsSnackbar(String message, Drawable iconDrawable) {
        RdsSnackbar.Companion companion = RdsSnackbar.INSTANCE;
        Snackbars snackbars = Snackbars.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        companion.make(snackbars.findRoot(fragmentActivityRequireActivity), HtmlCompat.fromHtml$default(message, 0, 2, null), -1).setLeadingIcon(iconDrawable).show();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
        this.errorHandler = new ActivityErrorHandler<Object>(requireActivity()) { // from class: com.robinhood.android.search.search.SearchFragment.onAttach.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(fragmentActivity, false, 0, null, 14, null);
                Intrinsics.checkNotNull(fragmentActivity);
            }

            @Override // com.robinhood.android.common.util.p090rx.ActivityErrorHandler, com.robinhood.android.common.util.p090rx.ContextErrorHandler
            protected void showShortError(String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                SearchFragment.showRdsSnackbar$default(SearchFragment.this, message, null, 2, null);
            }
        };
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26683getTopXedK2Rk());
        getShortcutManager().reportUse(RhShortcut.SEARCH);
        RecyclerView recyclerView = getBinding().searchResultsList;
        Intrinsics.checkNotNull(recyclerView);
        bindAdapter(recyclerView, this.searchAdapter);
        final FragmentActivity activity = getActivity();
        recyclerView.setLayoutManager(new LinearLayoutManager(activity) { // from class: com.robinhood.android.search.search.SearchFragment$onViewCreated$1$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public void onLayoutCompleted(RecyclerView.State state) {
                super.onLayoutCompleted(state);
                VisibleItemsManager visibleItemsManager = this.this$0.listChipsVisibleItemsManager;
                if (visibleItemsManager != null) {
                    visibleItemsManager.update();
                }
            }
        });
        recyclerView.setHasFixedSize(true);
        RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
        Intrinsics.checkNotNull(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.DefaultItemAnimator");
        ((DefaultItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
        this.layoutEnforcer.setRecyclerView(recyclerView);
        LifecycleHost.DefaultImpls.bind$default(this, RxRecyclerView.scrollStateChanges(recyclerView), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.search.SearchFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchFragment.onViewCreated$lambda$27$lambda$26(this.f$0, ((Integer) obj).intValue());
            }
        });
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        ScrollableLayoutManager scrollableLayoutManager = new ScrollableLayoutManager(contextRequireContext);
        scrollableLayoutManager.setSnapMode(ScrollableLayoutManager.SnapMode.START);
        this.discoverLayoutManager = scrollableLayoutManager;
        initVisibleViewManagers(scrollableLayoutManager);
        RecyclerView recyclerView2 = getBinding().searchDiscoverList;
        Intrinsics.checkNotNull(recyclerView2);
        bindAdapter(recyclerView2, getCompositeDiscoverAdapter());
        recyclerView2.setLayoutManager(this.discoverLayoutManager);
        RecyclerView recyclerView3 = getBinding().recentSearchList;
        Intrinsics.checkNotNull(recyclerView3);
        bindAdapter(recyclerView3, this.recentSearchAdapter);
        recyclerView3.setLayoutManager(new LinearLayoutManager(recyclerView3.getContext()));
        SwipeRefreshLayout swipeRefreshLayout = getBinding().swipeRefreshView;
        Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
        swipeRefreshLayout.setColorSchemeColors(ThemeColors.getThemeColor(contextRequireContext2, C20690R.attr.colorPrimary));
        SwipeRefreshLayout swipeRefreshView = getBinding().swipeRefreshView;
        Intrinsics.checkNotNullExpressionValue(swipeRefreshView, "swipeRefreshView");
        LifecycleHost.DefaultImpls.bind$default(this, SwipeRefreshLayoutRefreshObservable2.refreshes(swipeRefreshView), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.search.SearchFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchFragment.onViewCreated$lambda$32(this.f$0, (Unit) obj);
            }
        });
        RecyclerView searchDiscoverList = getBinding().searchDiscoverList;
        Intrinsics.checkNotNullExpressionValue(searchDiscoverList, "searchDiscoverList");
        Observable<Integer> observableTake = RxRecyclerView.scrollStateChanges(searchDiscoverList).filter(new Predicate() { // from class: com.robinhood.android.search.search.SearchFragment.onViewCreated.7
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Integer it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.intValue() == 1;
            }
        }).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.search.SearchFragment$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchFragment.onViewCreated$lambda$33(this.f$0, (Integer) obj);
            }
        });
        RecyclerView searchDiscoverList2 = getBinding().searchDiscoverList;
        Intrinsics.checkNotNullExpressionValue(searchDiscoverList2, "searchDiscoverList");
        LifecycleHost.DefaultImpls.bind$default(this, RxRecyclerView.scrollEvents(searchDiscoverList2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.search.SearchFragment$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchFragment.onViewCreated$lambda$34(this.f$0, (RecyclerViewScrollEvent) obj);
            }
        });
        BaseFragment.collectDuxoState$default(this, null, new C2812810(null), 1, null);
        collectDuxoState(Lifecycle.State.RESUMED, new C2812911(null));
        getElementAdapter().registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() { // from class: com.robinhood.android.search.search.SearchFragment.onViewCreated.12
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeChanged(int positionStart, int itemCount) {
                VisibleItemsManager visibleItemsManager = SearchFragment.this.visibleItemsManager;
                VisibleAutoLoggableViewManager visibleAutoLoggableViewManager = null;
                if (visibleItemsManager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("visibleItemsManager");
                    visibleItemsManager = null;
                }
                visibleItemsManager.update();
                VisibleAutoLoggableViewManager visibleAutoLoggableViewManager2 = SearchFragment.this.visibleAutoLoggableViewManager;
                if (visibleAutoLoggableViewManager2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("visibleAutoLoggableViewManager");
                } else {
                    visibleAutoLoggableViewManager = visibleAutoLoggableViewManager2;
                }
                visibleAutoLoggableViewManager.update();
            }
        });
        VisibleItemsManager<UUID, Element> visibleItemsManager = this.visibleItemsManager;
        if (visibleItemsManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("visibleItemsManager");
            visibleItemsManager = null;
        }
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(visibleItemsManager.getItemAppearances()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.search.SearchFragment$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchFragment.onViewCreated$lambda$35(this.f$0, (Element) obj);
            }
        });
        VisibleItemsManager<UUID, Element> visibleItemsManager2 = this.visibleItemsManager;
        if (visibleItemsManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("visibleItemsManager");
            visibleItemsManager2 = null;
        }
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(visibleItemsManager2.getItemDisappearances()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.search.SearchFragment$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchFragment.onViewCreated$lambda$36(this.f$0, (VisibleItemsManager.Data) obj);
            }
        });
        getHighlightsDuxo().onSearchPageOpened(((SearchFragmentKey) INSTANCE.getArgs((Fragment) this)).getSubpageId());
        BaseFragment.collectDuxoState$default(this, null, new C2813115(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$27$lambda$26(SearchFragment searchFragment, int i) {
        if (1 == i) {
            EventLogger.DefaultImpls.logScroll$default(searchFragment.getEventLogger(), null, searchFragment.getEventScreen(), null, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, searchFragment.searchText, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -33, -1, -1, -1, -1, -1, 16383, null), 13, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$32(SearchFragment searchFragment, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        searchFragment.getDuxo().refreshNewsFeed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$33(SearchFragment searchFragment, Integer num) {
        searchFragment.userScrolled = true;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$34(SearchFragment searchFragment, RecyclerViewScrollEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        VisibleItemsManager<UUID, Element> visibleItemsManager = searchFragment.visibleItemsManager;
        VisibleAutoLoggableViewManager<UUID, Element> visibleAutoLoggableViewManager = null;
        if (visibleItemsManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("visibleItemsManager");
            visibleItemsManager = null;
        }
        visibleItemsManager.update();
        VisibleAutoLoggableViewManager<UUID, Element> visibleAutoLoggableViewManager2 = searchFragment.visibleAutoLoggableViewManager;
        if (visibleAutoLoggableViewManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("visibleAutoLoggableViewManager");
        } else {
            visibleAutoLoggableViewManager = visibleAutoLoggableViewManager2;
        }
        visibleAutoLoggableViewManager.update();
        return Unit.INSTANCE;
    }

    /* compiled from: SearchFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.search.search.SearchFragment$onViewCreated$10", m3645f = "SearchFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.search.search.SearchFragment$onViewCreated$10 */
    static final class C2812810 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C2812810(Continuation<? super C2812810> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C2812810 c2812810 = SearchFragment.this.new C2812810(continuation);
            c2812810.L$0 = obj;
            return c2812810;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2812810) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: SearchFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.search.search.SearchFragment$onViewCreated$10$1", m3645f = "SearchFragment.kt", m3646l = {524}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.search.search.SearchFragment$onViewCreated$10$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ SearchFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SearchFragment searchFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = searchFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: SearchFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.search.search.SearchFragment$onViewCreated$10$1$1, reason: invalid class name and collision with other inner class name */
            /* synthetic */ class C505321 implements FlowCollector, FunctionAdapter {
                final /* synthetic */ SearchFragment $tmp0;

                C505321(SearchFragment searchFragment) {
                    this.$tmp0 = searchFragment;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.FunctionAdapter
                public final Function<?> getFunctionDelegate() {
                    return new AdaptedFunctionReference(2, this.$tmp0, SearchFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/search/search/SearchViewState;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }

                public final Object emit(SearchViewState searchViewState, Continuation<? super Unit> continuation) throws Throwable {
                    Object objInvokeSuspend$setViewState = AnonymousClass1.invokeSuspend$setViewState(this.$tmp0, searchViewState, continuation);
                    return objInvokeSuspend$setViewState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$setViewState : Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return emit((SearchViewState) obj, (Continuation<? super Unit>) continuation);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<SearchViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    C505321 c505321 = new C505321(this.this$0);
                    this.label = 1;
                    if (stateFlow.collect(c505321, this) == coroutine_suspended) {
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

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object invokeSuspend$setViewState(SearchFragment searchFragment, SearchViewState searchViewState, Continuation continuation) throws Throwable {
                searchFragment.setViewState(searchViewState);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(SearchFragment.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(SearchFragment.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(SearchFragment.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: SearchFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.search.search.SearchFragment$onViewCreated$10$2", m3645f = "SearchFragment.kt", m3646l = {532}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.search.search.SearchFragment$onViewCreated$10$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ SearchFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(SearchFragment searchFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = searchFragment;
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
                    final StateFlow<SearchViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    final Flow<ScreenersStore.ScreenersData> flow = new Flow<ScreenersStore.ScreenersData>() { // from class: com.robinhood.android.search.search.SearchFragment$onViewCreated$10$2$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super ScreenersStore.ScreenersData> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new C281202(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.search.search.SearchFragment$onViewCreated$10$2$invokeSuspend$$inlined$map$1$2 */
                        public static final class C281202<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.search.search.SearchFragment$onViewCreated$10$2$invokeSuspend$$inlined$map$1$2", m3645f = "SearchFragment.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.search.search.SearchFragment$onViewCreated$10$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return C281202.this.emit(null, this);
                                }
                            }

                            public C281202(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    ScreenersStore.ScreenersData screenersData = ((SearchViewState) obj).getScreenersData();
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(screenersData, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    };
                    Flow flowTake = FlowKt.take(new Flow<ScreenersStore.ScreenersData>() { // from class: com.robinhood.android.search.search.SearchFragment$onViewCreated$10$2$invokeSuspend$$inlined$filter$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super ScreenersStore.ScreenersData> flowCollector, Continuation continuation) {
                            Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.search.search.SearchFragment$onViewCreated$10$2$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.search.search.SearchFragment$onViewCreated$10$2$invokeSuspend$$inlined$filter$1$2", m3645f = "SearchFragment.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.search.search.SearchFragment$onViewCreated$10$2$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                Object L$1;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    if (!((ScreenersStore.ScreenersData) obj).getScreeners().isEmpty()) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }, 1);
                    final SearchFragment searchFragment = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.search.search.SearchFragment.onViewCreated.10.2.3
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((ScreenersStore.ScreenersData) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(ScreenersStore.ScreenersData screenersData, Continuation<? super Unit> continuation) {
                            EventLogger eventLogger = searchFragment.getEventLogger();
                            Screen screen = new Screen(Screen.Name.BROWSE_SEARCH, null, null, null, 14, null);
                            List<Screener> screeners = screenersData.getScreeners();
                            SearchFragment searchFragment2 = searchFragment;
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(screeners, 10));
                            for (Screener screener : screeners) {
                                arrayList.add(boxing.boxInt(searchFragment2.getId()));
                            }
                            EventLogger.DefaultImpls.logScreenAppear$default(eventLogger, null, screen, null, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, new ListsContext(null, null, 0, 0, CollectionsKt.joinToString$default(arrayList, null, null, null, 0, null, null, 63, null), null, screenersData.getScreeners().size(), false, 0, 0, null, null, 4015, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1048577, -1, -1, -1, -1, -1, 16383, null), 13, null);
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowTake.collect(flowCollector, this) == coroutine_suspended) {
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

        /* compiled from: SearchFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.search.search.SearchFragment$onViewCreated$10$3", m3645f = "SearchFragment.kt", m3646l = {549}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.search.search.SearchFragment$onViewCreated$10$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ SearchFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(SearchFragment searchFragment, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = searchFragment;
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
                    final StateFlow<SearchViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Integer>() { // from class: com.robinhood.android.search.search.SearchFragment$onViewCreated$10$3$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Integer> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new C281212(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.search.search.SearchFragment$onViewCreated$10$3$invokeSuspend$$inlined$map$1$2 */
                        public static final class C281212<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.search.search.SearchFragment$onViewCreated$10$3$invokeSuspend$$inlined$map$1$2", m3645f = "SearchFragment.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.search.search.SearchFragment$onViewCreated$10$3$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return C281212.this.emit(null, this);
                                }
                            }

                            public C281212(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    Integer numBoxInt = boxing.boxInt(((SearchViewState) obj).getEmptyRecentSearchTextResId());
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(numBoxInt, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    });
                    final SearchFragment searchFragment = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.search.search.SearchFragment.onViewCreated.10.3.2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(int i2, Continuation<? super Unit> continuation) {
                            searchFragment.getBinding().emptyRecentSearchText.setText(searchFragment.getString(i2));
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowDistinctUntilChanged.collect(flowCollector, this) == coroutine_suspended) {
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
    }

    /* compiled from: SearchFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.search.search.SearchFragment$onViewCreated$11", m3645f = "SearchFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.search.search.SearchFragment$onViewCreated$11 */
    static final class C2812911 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C2812911(Continuation<? super C2812911> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C2812911 c2812911 = SearchFragment.this.new C2812911(continuation);
            c2812911.L$0 = obj;
            return c2812911;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2812911) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: SearchFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.search.search.SearchFragment$onViewCreated$11$1", m3645f = "SearchFragment.kt", m3646l = {560}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.search.search.SearchFragment$onViewCreated$11$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ SearchFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SearchFragment searchFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = searchFragment;
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
                    final Flow flowTake = FlowKt.take(this.this$0.getDuxo().getStateFlow(), 1);
                    Flow<String> flow = new Flow<String>() { // from class: com.robinhood.android.search.search.SearchFragment$onViewCreated$11$1$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                            Object objCollect = flowTake.collect(new C281222(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.search.search.SearchFragment$onViewCreated$11$1$invokeSuspend$$inlined$map$1$2 */
                        public static final class C281222<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.search.search.SearchFragment$onViewCreated$11$1$invokeSuspend$$inlined$map$1$2", m3645f = "SearchFragment.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.search.search.SearchFragment$onViewCreated$11$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return C281222.this.emit(null, this);
                                }
                            }

                            public C281222(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    String query = ((SearchViewState) obj).getQuery();
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(query, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    };
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0);
                    this.label = 1;
                    if (flow.collect(anonymousClass2, this) == coroutine_suspended) {
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

            /* compiled from: SearchFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.search.search.SearchFragment$onViewCreated$11$1$2, reason: invalid class name */
            static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ SearchFragment this$0;

                AnonymousClass2(SearchFragment searchFragment) {
                    this.this$0 = searchFragment;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return emit((String) obj, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(final String str, Continuation<? super Unit> continuation) {
                    SearchToolbarViewWrapper searchBarViewWrapper = this.this$0.getSearchBarViewWrapper();
                    final SearchFragment searchFragment = this.this$0;
                    searchBarViewWrapper.update(new Function1() { // from class: com.robinhood.android.search.search.SearchFragment$onViewCreated$11$1$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SearchFragment.C2812911.AnonymousClass1.AnonymousClass2.emit$lambda$0(str, searchFragment, (SearchToolbarViewWrapper.ViewState) obj);
                        }
                    });
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final SearchToolbarViewWrapper.ViewState emit$lambda$0(String str, SearchFragment searchFragment, SearchToolbarViewWrapper.ViewState update) {
                    Intrinsics.checkNotNullParameter(update, "$this$update");
                    return SearchToolbarViewWrapper.ViewState.copy$default(update, str, (((SearchFragmentKey) SearchFragment.INSTANCE.getArgs((Fragment) searchFragment)).getListId() == null && StringsKt.isBlank(str)) ? false : true, 0, !((SearchFragmentKey) r0.getArgs((Fragment) searchFragment)).getShownInMainTab(), false, null, 52, null);
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(SearchFragment.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(SearchFragment.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: SearchFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.search.search.SearchFragment$onViewCreated$11$2", m3645f = "SearchFragment.kt", m3646l = {576}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.search.search.SearchFragment$onViewCreated$11$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ SearchFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(SearchFragment searchFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = searchFragment;
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
                    final StateFlow<SearchViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    Flow<SearchViewState.DisplayMode> flow = new Flow<SearchViewState.DisplayMode>() { // from class: com.robinhood.android.search.search.SearchFragment$onViewCreated$11$2$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super SearchViewState.DisplayMode> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new C281232(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.search.search.SearchFragment$onViewCreated$11$2$invokeSuspend$$inlined$map$1$2 */
                        public static final class C281232<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.search.search.SearchFragment$onViewCreated$11$2$invokeSuspend$$inlined$map$1$2", m3645f = "SearchFragment.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.search.search.SearchFragment$onViewCreated$11$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return C281232.this.emit(null, this);
                                }
                            }

                            public C281232(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    SearchViewState.DisplayMode displayMode = ((SearchViewState) obj).getDisplayMode();
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(displayMode, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    };
                    final SearchFragment searchFragment = this.this$0;
                    FlowCollector<? super SearchViewState.DisplayMode> flowCollector = new FlowCollector() { // from class: com.robinhood.android.search.search.SearchFragment.onViewCreated.11.2.2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((SearchViewState.DisplayMode) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(SearchViewState.DisplayMode displayMode, Continuation<? super Unit> continuation) {
                            searchFragment.updateDisplayMode(displayMode);
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flow.collect(flowCollector, this) == coroutine_suspended) {
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$35(SearchFragment searchFragment, Element item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item instanceof Element.Regular) {
            searchFragment.getNewsFeedAnalytics().logContentAppear(((Element.Regular) item).getContent(), false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$36(SearchFragment searchFragment, VisibleItemsManager.Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Element element = (Element) data.getItem();
        if (element instanceof Element.Regular) {
            searchFragment.getNewsFeedAnalytics().logContentDisappear(((Element.Regular) element).getContent(), data.getDurationVisible(), false);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: SearchFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.search.search.SearchFragment$onViewCreated$15", m3645f = "SearchFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.search.search.SearchFragment$onViewCreated$15 */
    static final class C2813115 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C2813115(Continuation<? super C2813115> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C2813115 c2813115 = SearchFragment.this.new C2813115(continuation);
            c2813115.L$0 = obj;
            return c2813115;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2813115) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: SearchFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.search.search.SearchFragment$onViewCreated$15$1", m3645f = "SearchFragment.kt", m3646l = {621}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.search.search.SearchFragment$onViewCreated$15$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ SearchFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SearchFragment searchFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = searchFragment;
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
                    final StateFlow<SearchHighlightsViewState> stateFlow = this.this$0.getHighlightsDuxo().getStateFlow();
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<ImmutableList3<? extends String>>() { // from class: com.robinhood.android.search.search.SearchFragment$onViewCreated$15$1$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super ImmutableList3<? extends String>> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new C281242(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.search.search.SearchFragment$onViewCreated$15$1$invokeSuspend$$inlined$map$1$2 */
                        public static final class C281242<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.search.search.SearchFragment$onViewCreated$15$1$invokeSuspend$$inlined$map$1$2", m3645f = "SearchFragment.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.search.search.SearchFragment$onViewCreated$15$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return C281242.this.emit(null, this);
                                }
                            }

                            public C281242(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    ImmutableList3<String> excludedTemplates = ((SearchHighlightsViewState) obj).getExcludedTemplates();
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(excludedTemplates, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    });
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == coroutine_suspended) {
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

            /* compiled from: SearchFragment.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "excludableTemplates", "Lkotlinx/collections/immutable/PersistentList;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.search.search.SearchFragment$onViewCreated$15$1$2", m3645f = "SearchFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.search.search.SearchFragment$onViewCreated$15$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<ImmutableList3<? extends String>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ SearchFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(SearchFragment searchFragment, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = searchFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(ImmutableList3<? extends String> immutableList3, Continuation<? super Unit> continuation) {
                    return invoke2((ImmutableList3<String>) immutableList3, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(ImmutableList3<String> immutableList3, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(immutableList3, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.getDuxo().updateExcludedTemplates((ImmutableList3) this.L$0);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(SearchFragment.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(SearchFragment.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(SearchFragment.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: SearchFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.search.search.SearchFragment$onViewCreated$15$2", m3645f = "SearchFragment.kt", m3646l = {630}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.search.search.SearchFragment$onViewCreated$15$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ SearchFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(SearchFragment searchFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = searchFragment;
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
                    final StateFlow<SearchHighlightsViewState> stateFlow = this.this$0.getHighlightsDuxo().getStateFlow();
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Boolean>() { // from class: com.robinhood.android.search.search.SearchFragment$onViewCreated$15$2$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new C281252(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.search.search.SearchFragment$onViewCreated$15$2$invokeSuspend$$inlined$map$1$2 */
                        public static final class C281252<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.search.search.SearchFragment$onViewCreated$15$2$invokeSuspend$$inlined$map$1$2", m3645f = "SearchFragment.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.search.search.SearchFragment$onViewCreated$15$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return C281252.this.emit(null, this);
                                }
                            }

                            public C281252(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    Boolean boolBoxBoolean = boxing.boxBoolean(((SearchHighlightsViewState) obj).getHideScreeners());
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    });
                    C505342 c505342 = new C505342(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, c505342, this) == coroutine_suspended) {
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

            /* compiled from: SearchFragment.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "shouldHide", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.search.search.SearchFragment$onViewCreated$15$2$2", m3645f = "SearchFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.search.search.SearchFragment$onViewCreated$15$2$2, reason: invalid class name and collision with other inner class name */
            static final class C505342 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ SearchFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C505342(SearchFragment searchFragment, Continuation<? super C505342> continuation) {
                    super(2, continuation);
                    this.this$0 = searchFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C505342 c505342 = new C505342(this.this$0, continuation);
                    c505342.Z$0 = ((Boolean) obj).booleanValue();
                    return c505342;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((C505342) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.getScreenerAdapter().updateShouldHide(this.Z$0);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: SearchFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.search.search.SearchFragment$onViewCreated$15$3", m3645f = "SearchFragment.kt", m3646l = {636}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.search.search.SearchFragment$onViewCreated$15$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ SearchFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(SearchFragment searchFragment, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = searchFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: SearchFragment.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "viewState", "Lcom/robinhood/android/search/highlights/duxo/SearchHighlightsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.search.search.SearchFragment$onViewCreated$15$3$1", m3645f = "SearchFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.search.search.SearchFragment$onViewCreated$15$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<SearchHighlightsViewState, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ SearchFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(SearchFragment searchFragment, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = searchFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(SearchHighlightsViewState searchHighlightsViewState, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(searchHighlightsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        SearchHighlightsViewState searchHighlightsViewState = (SearchHighlightsViewState) this.L$0;
                        this.this$0.getHighlightsAdapter().bind(searchHighlightsViewState);
                        this.this$0.getCreditAppInviteAdapter().bind(!searchHighlightsViewState.getInExperiment());
                        if (!searchHighlightsViewState.getInExperiment() || searchHighlightsViewState.getHighlights().isEmpty()) {
                            this.this$0.getDisclosuresAdapter().bind(false);
                        } else {
                            this.this$0.getDisclosuresAdapter().bind(true);
                        }
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<SearchHighlightsViewState> stateFlow = this.this$0.getHighlightsDuxo().getStateFlow();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        VisibleItemsManager<UUID, Element> visibleItemsManager = this.visibleItemsManager;
        VisibleAutoLoggableViewManager<UUID, Element> visibleAutoLoggableViewManager = null;
        if (visibleItemsManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("visibleItemsManager");
            visibleItemsManager = null;
        }
        visibleItemsManager.update();
        VisibleAutoLoggableViewManager<UUID, Element> visibleAutoLoggableViewManager2 = this.visibleAutoLoggableViewManager;
        if (visibleAutoLoggableViewManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("visibleAutoLoggableViewManager");
        } else {
            visibleAutoLoggableViewManager = visibleAutoLoggableViewManager2;
        }
        visibleAutoLoggableViewManager.update();
        logSearchBarEvent(UserInteractionEventData.EventType.APPEAR);
        ensureCuratedListQuickAddFragment();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.isQueryChangedByTyping = false;
        CrossSellLaunchManager.initIacBottomSheetPolling$default(getCrossSellLaunchManager(), this, IacAlertSheetLocation.TOP_LEVEL_BROWSE, null, null, null, null, null, null, null, 508, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        VisibleAutoLoggableViewManager<UUID, Element> visibleAutoLoggableViewManager = null;
        Activity.hideKeyboard$default(fragmentActivityRequireActivity, false, 1, null);
        resetEventLoggers();
        VisibleItemsManager<UUID, Element> visibleItemsManager = this.visibleItemsManager;
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
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.layoutEnforcer.setRecyclerView(null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
        setupComposeSearchToolbar();
    }

    private final void setupComposeSearchToolbar() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        attachToastPopup(fragmentActivityRequireActivity, getSearchBarViewWrapper());
        SearchToolbarViewWrapper.bind$default(getBinding().searchBarViewWrapper, this, null, 2, null);
        getBinding().searchBarViewWrapper.update(new Function1() { // from class: com.robinhood.android.search.search.SearchFragment$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchFragment.setupComposeSearchToolbar$lambda$37(this.f$0, (SearchToolbarViewWrapper.ViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchToolbarViewWrapper.ViewState setupComposeSearchToolbar$lambda$37(SearchFragment searchFragment, SearchToolbarViewWrapper.ViewState update) {
        Intrinsics.checkNotNullParameter(update, "$this$update");
        return SearchToolbarViewWrapper.ViewState.copy$default(update, null, false, 0, !((SearchFragmentKey) INSTANCE.getArgs((Fragment) searchFragment)).getShownInMainTab(), false, null, 55, null);
    }

    @Override // com.robinhood.android.search.search.ui.SearchToolbarViewWrapper.Callback
    public void onQueryChanged(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.searchText = query;
        if (this.isQueryChangedByTyping) {
            logSearchBarEvent(UserInteractionEventData.EventType.TYPE);
        }
        this.isQueryChangedByTyping = true;
        resetEventLoggers();
        getDuxo().search(query);
    }

    @Override // com.robinhood.android.search.search.ui.SearchToolbarViewWrapper.Callback
    public void onQueryCleared() {
        resetTextField();
        getDuxo().swapDiscoverAndRecentSearch(true);
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.CLEAR_SEARCH_QUERY, getEventScreen(), new Component(Component.ComponentType.CANCEL_BUTTON, null, null, 6, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, this.searchText, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -33, -1, -1, -1, -1, -1, 16383, null), false, 40, null);
    }

    @Override // com.robinhood.android.search.search.ui.SearchToolbarViewWrapper.Callback
    public void onQueryCancelled() {
        resetTextField();
        getDuxo().swapDiscoverAndRecentSearch(false);
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.CANCEL_SEARCH_QUERY, getEventScreen(), new Component(Component.ComponentType.CANCEL_BUTTON, null, null, 6, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, this.searchText, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -33, -1, -1, -1, -1, -1, 16383, null), false, 40, null);
    }

    @Override // com.robinhood.android.search.search.ui.SearchToolbarViewWrapper.Callback
    public void onFocusChanged(boolean focused) {
        if (focused) {
            logSearchBarEvent(UserInteractionEventData.EventType.TAP);
            getDuxo().swapDiscoverAndRecentSearch(true);
        }
    }

    private final void resetTextField() {
        this.isQueryChangedByTyping = false;
        this.searchText = "";
        this.searchAdapter.submitList(CollectionsKt.emptyList());
        getDuxo().search("");
    }

    @Override // com.robinhood.android.search.search.ui.SearchToolbarViewWrapper.Callback
    public void onToolbarBackPressed() {
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.CANCEL_SEARCH_QUERY, getEventScreen(), new Component(Component.ComponentType.BACK_BUTTON, null, null, 6, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, this.searchText, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -33, -1, -1, -1, -1, -1, 16383, null), false, 40, null);
        requireBaseActivity().onBackPressed();
    }

    @Override // com.robinhood.android.search.search.SearchAdapter.Callbacks
    public void onListChipsRecyclerViewCreated(final CuratedListChipRecyclerView recyclerView) {
        Observable<CuratedListChipItem> itemAppearances;
        Observable observableObserveOnMainThread;
        ScopedObservable scopedObservableBind$default;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager);
        this.listChipsVisibleItemsManager = new VisibleItemsManager<>(layoutManager, new Function0() { // from class: com.robinhood.android.search.search.SearchFragment$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(recyclerView.getItemCount());
            }
        }, new Function1() { // from class: com.robinhood.android.search.search.SearchFragment$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return recyclerView.getItem(((Integer) obj).intValue());
            }
        }, new Function1() { // from class: com.robinhood.android.search.search.SearchFragment$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchFragment.onListChipsRecyclerViewCreated$lambda$40((CuratedListChipItem) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(RxRecyclerView.scrollEvents(recyclerView)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.search.SearchFragment$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchFragment.onListChipsRecyclerViewCreated$lambda$41(this.f$0, (RecyclerViewScrollEvent) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, RxRecyclerView.scrollStateChanges(recyclerView), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.search.SearchFragment$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchFragment.onListChipsRecyclerViewCreated$lambda$42(this.f$0, ((Integer) obj).intValue());
            }
        });
        VisibleItemsManager<UUID, CuratedListChipItem> visibleItemsManager = this.listChipsVisibleItemsManager;
        if (visibleItemsManager != null && (itemAppearances = visibleItemsManager.getItemAppearances()) != null && (observableObserveOnMainThread = ObservablesAndroid.observeOnMainThread(itemAppearances)) != null && (scopedObservableBind$default = LifecycleHost.DefaultImpls.bind$default(this, observableObserveOnMainThread, (LifecycleEvent) null, 1, (Object) null)) != null) {
            scopedObservableBind$default.subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.search.SearchFragment$$ExternalSyntheticLambda29
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SearchFragment.onListChipsRecyclerViewCreated$lambda$43(recyclerView, this, (CuratedListChipItem) obj);
                }
            });
        }
        VisibleItemsManager<UUID, CuratedListChipItem> visibleItemsManager2 = this.listChipsVisibleItemsManager;
        if (visibleItemsManager2 != null) {
            visibleItemsManager2.update();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UUID onListChipsRecyclerViewCreated$lambda$40(CuratedListChipItem VisibleItemsManager) {
        Intrinsics.checkNotNullParameter(VisibleItemsManager, "$this$VisibleItemsManager");
        return VisibleItemsManager.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onListChipsRecyclerViewCreated$lambda$41(SearchFragment searchFragment, RecyclerViewScrollEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        VisibleItemsManager<UUID, CuratedListChipItem> visibleItemsManager = searchFragment.listChipsVisibleItemsManager;
        if (visibleItemsManager != null) {
            visibleItemsManager.update();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onListChipsRecyclerViewCreated$lambda$42(SearchFragment searchFragment, int i) {
        if (1 == i) {
            EventLogger.DefaultImpls.logScroll$default(searchFragment.getEventLogger(), null, searchFragment.getEventScreen(), new Component(Component.ComponentType.LIST_CHIP_GRID, null, null, 6, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, searchFragment.searchText, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -33, -1, -1, -1, -1, -1, 16383, null), 9, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onListChipsRecyclerViewCreated$lambda$43(CuratedListChipRecyclerView curatedListChipRecyclerView, SearchFragment searchFragment, CuratedListChipItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        int position = curatedListChipRecyclerView.getPosition(item);
        if (position != -1) {
            LogOnceEventLogger logOnceEventLogger = searchFragment.getLogOnceEventLogger();
            String displayName = item.getDisplayName();
            Screen eventScreen = searchFragment.getEventScreen();
            UserInteractionEventData.Action action = UserInteractionEventData.Action.VIEW_SEARCH_RESULT;
            Component component = new Component(Component.ComponentType.LIST_CHIP, null, null, 6, null);
            String string2 = item.getId().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            SearchResultItem searchResultItem = new SearchResultItem(string2, SearchResultItem.ContentType.LIST, item.getDisplayName(), null, 8, null);
            logOnceEventLogger.logAppear(displayName, action, eventScreen, component, new com.robinhood.rosetta.eventlogging.Context(position + 1, searchFragment.searchAdapter.getListChipsCount(), 0, null, null, searchFragment.searchText, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, searchResultItem, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -36, -2097153, -1, -1, -1, -1, 16383, null));
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.search.search.SearchAdapter.Callbacks
    public void onSecurityClicked(Security security, boolean isAlreadyInUserList) {
        Intrinsics.checkNotNullParameter(security, "security");
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        if (isSearchFromCuratedList()) {
            logCuratedListItemUpdateAction(!isAlreadyInUserList, security);
            if (!isAlreadyInUserList) {
                SearchDuxo duxo = getDuxo();
                UUID curatedListId = getCuratedListId();
                Intrinsics.checkNotNull(curatedListId);
                duxo.addSecurityToList(curatedListId, security);
                return;
            }
            SearchDuxo duxo2 = getDuxo();
            UUID curatedListId2 = getCuratedListId();
            Intrinsics.checkNotNull(curatedListId2);
            duxo2.removeSecurityFromList(curatedListId2, security);
            return;
        }
        if (security instanceof Instrument) {
            AnalyticsLogger analytics = getAnalytics();
            Instrument instrument = (Instrument) security;
            String string2 = instrument.getId().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(analytics, "search_instrument", string2, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
            Navigator.DefaultImpls.showFragment$default(getNavigator(), fragmentActivityRequireActivity, new LegacyFragmentKey.EquityInstrumentDetail(instrument.getId(), null, ((SearchFragmentKey) INSTANCE.getArgs((Fragment) this)).getAccountNumber(), InstrumentDetailSource.SEARCH, false, 18, null), false, false, false, PerformanceMetricEventData.Source.SOURCE_SEARCH, false, null, false, false, null, null, 4060, null);
        } else if (security instanceof UiCurrencyPair) {
            AnalyticsLogger analytics2 = getAnalytics();
            UiCurrencyPair uiCurrencyPair = (UiCurrencyPair) security;
            String string3 = uiCurrencyPair.getId().toString();
            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
            AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(analytics2, "search_crypto", string3, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
            Navigator.DefaultImpls.showFragment$default(getNavigator(), fragmentActivityRequireActivity, new CryptoDetailFragmentKey(uiCurrencyPair.getId(), null, false, null, null, null, 62, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
        } else if (security instanceof ApiFuturesContractSearchItem) {
            Navigator.DefaultImpls.showFragment$default(getNavigator(), fragmentActivityRequireActivity, new FuturesDetailFragmentKey.ByContractId(((ApiFuturesContractSearchItem) security).getId(), getEventScreen(), "search_result"), false, false, false, null, false, null, false, false, null, null, 4092, null);
        } else if (security instanceof ApiFuturesProductSearchItem) {
            Navigator.DefaultImpls.showFragment$default(getNavigator(), fragmentActivityRequireActivity, new FuturesDetailFragmentKey.ByProductId(((ApiFuturesProductSearchItem) security).getId(), getEventScreen(), "search_result"), false, false, false, null, false, null, false, false, null, null, 4092, null);
        } else if (security instanceof ApiEventContractSearchItem) {
            Navigator.DefaultImpls.showFragment$default(getNavigator(), fragmentActivityRequireActivity, new EventDetailRoutingFragmentKey(((ApiEventContractSearchItem) security).getId(), EcUuidType.EVENT_ID, "search_result", false, 8, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
        } else if (security instanceof Index) {
            Navigator.DefaultImpls.showFragment$default(getNavigator(), fragmentActivityRequireActivity, new IndexDetailPageFragmentKey(((Index) security).getId(), ((SearchFragmentKey) INSTANCE.getArgs((Fragment) this)).getAccountNumber(), IndexDetailPageFragmentKey2.Search.INSTANCE), false, false, false, null, false, null, false, false, null, null, 4092, null);
        } else {
            Preconditions.INSTANCE.failUnexpectedItemKotlin(security);
            throw new ExceptionsH();
        }
        getDuxo().saveRecentSearch(RecentSearchConverters.toRecentSearch(security));
    }

    @Override // com.robinhood.android.search.search.SearchAdapter.Callbacks
    public void onAddToWatchlistClicked(Security security, boolean isAlreadyInUserList) {
        Intrinsics.checkNotNullParameter(security, "security");
        if (isSearchFromCuratedList()) {
            logCuratedListItemUpdateAction(true, security);
            SearchDuxo duxo = getDuxo();
            UUID curatedListId = getCuratedListId();
            Intrinsics.checkNotNull(curatedListId);
            duxo.addSecurityToList(curatedListId, security);
            return;
        }
        CuratedListQuickAddFragment curatedListQuickAddFragment = getCuratedListQuickAddFragment();
        Intrinsics.checkNotNull(curatedListQuickAddFragment);
        curatedListQuickAddFragment.addSelectedItemToCuratedList(isAlreadyInUserList, security);
    }

    @Override // com.robinhood.android.search.search.SearchAdapter.Callbacks
    public void onRemoveFromWatchlistClicked(Security security) {
        Intrinsics.checkNotNullParameter(security, "security");
        if (isSearchFromCuratedList()) {
            logCuratedListItemUpdateAction(false, security);
            SearchDuxo duxo = getDuxo();
            UUID curatedListId = getCuratedListId();
            Intrinsics.checkNotNull(curatedListId);
            duxo.removeSecurityFromList(curatedListId, security);
        }
    }

    @Override // com.robinhood.android.search.search.SearchAdapter.Callbacks
    public void onCuratedListChipItemClicked(CuratedListChipItem data, int position) {
        Intrinsics.checkNotNullParameter(data, "data");
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_SEARCH_COLLECTION, data.getDisplayName(), null, null, data.getId().toString(), null, String.valueOf(position), this.searchText, 44, null);
        EventLogger eventLogger = getEventLogger();
        Screen eventScreen = getEventScreen();
        UserInteractionEventData.Action action = UserInteractionEventData.Action.VIEW_SEARCH_RESULT;
        Component component = new Component(Component.ComponentType.LIST_CHIP, null, null, 6, null);
        String string2 = data.getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        SearchResultItem searchResultItem = new SearchResultItem(string2, SearchResultItem.ContentType.LIST, data.getDisplayName(), null, 8, null);
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, eventScreen, component, null, new com.robinhood.rosetta.eventlogging.Context(position + 1, this.searchAdapter.getListChipsCount(), 0, null, null, this.searchText, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, searchResultItem, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -36, -2097153, -1, -1, -1, -1, 16383, null), false, 40, null);
        getDuxo().saveRecentSearch(RecentSearchConverters.toRecentSearch(data));
    }

    @Override // com.robinhood.android.search.search.SearchAdapter.Callbacks
    public void onEducationClicked(SearchItem.EducationRow item) {
        Intrinsics.checkNotNullParameter(item, "item");
        handleDeeplinkWithPotentialAccountNumberNeeded(item.getUri());
        getDuxo().saveRecentSearch(RecentSearchConverters.toRecentSearch(item));
    }

    @Override // com.robinhood.android.search.search.SearchAdapter.Callbacks
    public void onDeeplinkClicked(SearchItem.DeeplinkRow item) {
        Intrinsics.checkNotNullParameter(item, "item");
        handleDeeplinkWithPotentialAccountNumberNeeded(item.getUri());
        getDuxo().saveRecentSearch(RecentSearchConverters.toRecentSearch(item));
    }

    @Override // com.robinhood.android.search.search.SearchAdapter.Callbacks
    public void onHeaderWithActionClicked(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        handleDeeplinkWithPotentialAccountNumberNeeded(uri);
    }

    @Override // com.robinhood.android.search.recentSearch.RecentSearchAdapter.Callbacks
    public void onRecentSearchClicked(RecentSearch.RecentSearchResult recentSearch) {
        Intrinsics.checkNotNullParameter(recentSearch, "recentSearch");
        RecentSearch2 item = recentSearch.getItem();
        if (item instanceof RecentSearch2.Instrument) {
            onInstrumentRecentSearchClicked((RecentSearch2.Instrument) item);
        } else if (item instanceof RecentSearch2.Crypto) {
            onCryptoRecentSearchClicked((RecentSearch2.Crypto) item);
        } else if (item instanceof RecentSearch2.FuturesContract) {
            onFuturesContractRecentSearchClicked((RecentSearch2.FuturesContract) item);
        } else if (item instanceof RecentSearch2.FuturesProduct) {
            onFuturesProductRecentSearchClicked((RecentSearch2.FuturesProduct) item);
        } else if (item instanceof RecentSearch2.EventContract) {
            onEventContractRecentSearchClicked((RecentSearch2.EventContract) item);
        } else if (item instanceof RecentSearch2.Education) {
            onEducationRecentSearchClicked((RecentSearch2.Education) item);
        } else if (item instanceof RecentSearch2.Deeplink) {
            onDeeplinkRecentSearchClicked((RecentSearch2.Deeplink) item);
        } else if (item instanceof RecentSearch2.CuratedListChipItem) {
            onListChipItemRecentSearchClicked((RecentSearch2.CuratedListChipItem) item);
        } else if (item instanceof RecentSearch2.MarketIndex) {
            onIndexRecentSearchClicked((RecentSearch2.MarketIndex) item);
        } else if (!(item instanceof RecentSearch2.Unknown)) {
            throw new NoWhenBranchMatchedException();
        }
        SearchDuxo duxo = getDuxo();
        Instant instantNow = Instant.now();
        Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
        duxo.saveRecentSearch(RecentSearch.RecentSearchResult.copy$default(recentSearch, null, instantNow, null, null, 13, null));
    }

    @Override // com.robinhood.android.search.recentSearch.RecentSearchAdapter.Callbacks
    public void onRecentSearchDeleted(RecentSearch.RecentSearchResult recentSearch) {
        Intrinsics.checkNotNullParameter(recentSearch, "recentSearch");
        getDuxo().deleteRecentSearch(recentSearch);
    }

    private final void onInstrumentRecentSearchClicked(RecentSearch2.Instrument recentSearchItem) {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new LegacyFragmentKey.EquityInstrumentDetail(recentSearchItem.getId(), null, ((SearchFragmentKey) INSTANCE.getArgs((Fragment) this)).getAccountNumber(), InstrumentDetailSource.SEARCH, false, 18, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
    }

    private final void onCryptoRecentSearchClicked(RecentSearch2.Crypto recentSearchItem) {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new CryptoDetailFragmentKey(recentSearchItem.getId(), null, false, null, null, null, 62, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
    }

    private final void onFuturesContractRecentSearchClicked(RecentSearch2.FuturesContract recentSearchItem) {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new FuturesDetailFragmentKey.ByContractId(recentSearchItem.getId(), getEventScreen(), FuturesAnalyticsStrings.ENTRY_POINT_RECENT_SEARCH_ITEM), false, false, false, null, false, null, false, false, null, null, 4092, null);
    }

    private final void onFuturesProductRecentSearchClicked(RecentSearch2.FuturesProduct recentSearchItem) {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new FuturesDetailFragmentKey.ByProductId(recentSearchItem.getId(), getEventScreen(), FuturesAnalyticsStrings.ENTRY_POINT_RECENT_SEARCH_ITEM), false, false, false, null, false, null, false, false, null, null, 4092, null);
    }

    private final void onEventContractRecentSearchClicked(RecentSearch2.EventContract recentSearchItem) {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new EventDetailRoutingFragmentKey(recentSearchItem.getId(), EcUuidType.EVENT_ID, "search_result", false, 8, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
    }

    private final void onEducationRecentSearchClicked(RecentSearch2.Education recentSearchItem) {
        Uri deeplink = recentSearchItem.getDeeplink();
        if (deeplink == null) {
            return;
        }
        handleDeeplinkWithPotentialAccountNumberNeeded(deeplink);
    }

    private final void onDeeplinkRecentSearchClicked(RecentSearch2.Deeplink recentSearchItem) {
        Uri deeplink = recentSearchItem.getDeeplink();
        if (deeplink == null) {
            return;
        }
        handleDeeplinkWithPotentialAccountNumberNeeded(deeplink);
    }

    private final void onListChipItemRecentSearchClicked(RecentSearch2.CuratedListChipItem recentSearchItem) {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new CuratedListKey.RhList(recentSearchItem.getId(), null, ((SearchFragmentKey) INSTANCE.getArgs((Fragment) this)).getAccountNumber(), null, 10, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
    }

    private final void onIndexRecentSearchClicked(RecentSearch2.MarketIndex recentSearchItem) {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new IndexDetailPageFragmentKey(recentSearchItem.getId(), ((SearchFragmentKey) INSTANCE.getArgs((Fragment) this)).getAccountNumber(), IndexDetailPageFragmentKey2.Search.INSTANCE), false, false, false, null, false, null, false, false, null, null, 4092, null);
    }

    private final boolean handleDeeplinkWithPotentialAccountNumberNeeded(Uri deeplinkUri) {
        if (deeplinksNeedingAccountNumber.contains(deeplinkUri.toString())) {
            Uri uriAppendAccountNumberToDeeplink = appendAccountNumberToDeeplink(deeplinkUri, ((SearchFragmentKey) INSTANCE.getArgs((Fragment) this)).getAccountNumber());
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            return Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, uriAppendAccountNumberToDeeplink, null, null, false, null, 60, null);
        }
        Navigator navigator2 = getNavigator();
        Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
        return Navigator.DefaultImpls.handleDeepLink$default(navigator2, contextRequireContext2, deeplinkUri, null, null, false, null, 60, null);
    }

    private final void logCuratedListItemUpdateAction(boolean added, Security security) {
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), "list_item_search", added ? "add_item_to_list" : AnalyticsStrings.BUTTON_LIST_REMOVE_ITEM_FROM_LIST, security.getId().toString(), null, String.valueOf(getCuratedListId()), getCuratedListDisplayName(), null, null, 200, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return isSearchFromCuratedList() ? SCREEN_NAME_LIST_ITEM_SEARCH : super.getScreenName();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getEntityId() {
        UUID curatedListId = getCuratedListId();
        if (curatedListId != null) {
            return curatedListId.toString();
        }
        return null;
    }

    private final Uri appendAccountNumberToDeeplink(Uri uri, String accountNumber) {
        if (accountNumber == null) {
            return uri;
        }
        return Uri.parse(uri + "?account_number=" + accountNumber);
    }

    private final void ensureCuratedListQuickAddFragment() {
        if (getCuratedListQuickAddFragment() != null || isStateSaved()) {
            return;
        }
        getChildFragmentManager().beginTransaction().add(CuratedListQuickAddFragment.Companion.newInstance$default(CuratedListQuickAddFragment.INSTANCE, false, new Screen(Screen.Name.BROWSE_SEARCH, null, null, null, 14, null), 1, null), "quickAddFragment").commit();
    }

    private final void logSearchBarEvent(UserInteractionEventData.EventType eventType) {
        EventLogger.DefaultImpls.logUserInteractionEvent$default(getEventLogger(), new UserInteractionEventData(eventType, getEventScreen(), new Component(Component.ComponentType.SEARCH_BAR, null, null, 6, null), UserInteractionEventData.Action.TYPE_SEARCH_QUERY, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, this.searchText, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -33, -1, -1, -1, -1, -1, 16383, null), null, null, 96, null), false, false, 6, null);
    }

    private final void resetEventLoggers() {
        VisibleItemsManager<UUID, CuratedListChipItem> visibleItemsManager = this.listChipsVisibleItemsManager;
        if (visibleItemsManager != null) {
            visibleItemsManager.clear();
        }
        getLogOnceEventLogger().reset();
    }

    private final void attachToastPopup(final android.app.Activity activity, final View view) {
        if (this.toastPopupOffsetHeight == 0) {
            View decorView = activity.getWindow().getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
            Rect rect = new Rect();
            decorView.getWindowVisibleDisplayFrame(rect);
            this.toastPopupOffsetHeight = rect.top + activity.getResources().getDimensionPixelOffset(C13997R.dimen.rds_spacing_small);
        }
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.robinhood.android.search.search.SearchFragment.attachToastPopup.1
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                Toast toastMakeText = Toast.makeText(activity, view.getContentDescription(), 0);
                toastMakeText.setGravity(MaterialCardView.CHECKED_ICON_GRAVITY_TOP_START, iArr[0], (iArr[1] + view.getHeight()) - this.toastPopupOffsetHeight);
                toastMakeText.show();
                return false;
            }
        });
    }

    @Override // com.robinhood.android.search.newsfeed.view.NewsFeedElementAdapter.Callbacks
    public void onContentClick(Content content, boolean inCarousel) {
        Intrinsics.checkNotNullParameter(content, "content");
        handleContentClick(content, inCarousel);
        getNewsFeedAnalytics().logContentClick(content, inCarousel);
    }

    private final void handleContentClick(Content content, boolean inCarousel) {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        if (content instanceof Content.Article) {
            Content.Article article = (Content.Article) content;
            if (com.robinhood.utils.extensions.StringsKt.isSnacksUrl(article.getUrl().getUrl())) {
                Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(getNavigator(), contextRequireContext, new SnacksWebViewFragmentKey(article.getUrl().getUrl()), false, false, false, false, null, false, null, null, 1020, null);
                return;
            } else if (com.robinhood.utils.extensions.StringsKt.isLearnUrl(article.getUrl().getUrl())) {
                Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(getNavigator(), contextRequireContext, new RhEmbeddedWebViewFragmentKey(article.getUrl().getUrl()), false, false, false, false, null, false, null, null, 1020, null);
                return;
            } else {
                LoggedCustomTabs2.showNewsFeedArticle(getLoggedCustomTabs(), contextRequireContext, article, "search", getScreenName());
                return;
            }
        }
        if (content instanceof Content.EmbeddedArticle) {
            Content.EmbeddedArticle embeddedArticle = (Content.EmbeddedArticle) content;
            Navigator.DefaultImpls.showFragment$default(getNavigator(), contextRequireContext, new LegacyFragmentKey.NewsFeedEmbeddedArticle(embeddedArticle.getId(), embeddedArticle.getParentElement().getTemplate(), embeddedArticle.getAnalyticsContentType(), "search", null, null, 48, null), false, false, false, null, false, null, false, false, null, null, 4084, null);
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
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext2, new LegacyFragmentKey.EquityInstrumentDetail(instrumentId, null, null, InstrumentDetailSource.SEARCH, false, 22, null), false, false, false, PerformanceMetricEventData.Source.SOURCE_SEARCH, false, null, false, false, null, null, 4060, null);
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
    public void onContentRelatedInstrumentClick(Content content, RelatedInstrument instrument, boolean inCarousel) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        getNewsFeedAnalytics().logContentRelatedInstrumentClick(content, instrument, inCarousel);
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new LegacyFragmentKey.EquityInstrumentDetail(instrument.getId(), null, null, InstrumentDetailSource.SEARCH, false, 22, null), false, false, false, PerformanceMetricEventData.Source.SOURCE_SEARCH, false, null, false, false, null, null, 4060, null);
    }

    @Override // com.robinhood.android.search.newsfeed.view.NewsFeedElementAdapter.Callbacks
    public void onCarouselContentClick(Content content) {
        Intrinsics.checkNotNullParameter(content, "content");
        handleContentClick(content, true);
        getNewsFeedAnalytics().logCarouselContentClick(content);
    }

    @Override // com.robinhood.android.search.newsfeed.view.NewsFeedElementAdapter.Callbacks
    public void onEducationHomeEntryPointClick() {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        requireActivity().startActivity(Navigator.DefaultImpls.createIntentForFragment$default(navigator, contextRequireContext, new LegacyFragmentKey.EducationHome("browse"), false, false, false, null, false, false, false, false, false, null, false, 8188, null));
    }

    @Override // com.robinhood.android.search.newsfeed.view.NewsFeedElementAdapter.Callbacks
    public void onCarouselContentAppear(Content content) {
        Intrinsics.checkNotNullParameter(content, "content");
        getNewsFeedAnalytics().logCarouselContentAppear(content);
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
        getNewsFeedAnalytics().logListPreviewContentClick(content);
    }

    private final void initVisibleViewManagers(LinearLayoutManager linearLayoutManager) {
        Function1 function1 = new Function1() { // from class: com.robinhood.android.search.search.SearchFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchFragment.initVisibleViewManagers$lambda$44(this.f$0, ((Integer) obj).intValue());
            }
        };
        Function1 function12 = new Function1() { // from class: com.robinhood.android.search.search.SearchFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchFragment.initVisibleViewManagers$lambda$45((Element) obj);
            }
        };
        this.visibleItemsManager = new VisibleItemsManager<>(linearLayoutManager, new Function0() { // from class: com.robinhood.android.search.search.SearchFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(SearchFragment.initVisibleViewManagers$lambda$46(this.f$0));
            }
        }, function1, function12);
        this.visibleAutoLoggableViewManager = new VisibleAutoLoggableViewManager<>(linearLayoutManager, new Function0() { // from class: com.robinhood.android.search.search.SearchFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(SearchFragment.initVisibleViewManagers$lambda$47(this.f$0));
            }
        }, function1, function12, false, false, 48, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Element initVisibleViewManagers$lambda$44(SearchFragment searchFragment, int i) {
        return searchFragment.getElementAdapter().getItem(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UUID initVisibleViewManagers$lambda$45(Element element) {
        Intrinsics.checkNotNullParameter(element, "<this>");
        return element instanceof Element.Regular ? ((Element.Regular) element).getContent().getId() : element.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int initVisibleViewManagers$lambda$46(SearchFragment searchFragment) {
        return searchFragment.getElementAdapter().getSize();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int initVisibleViewManagers$lambda$47(SearchFragment searchFragment) {
        return searchFragment.getElementAdapter().getSize();
    }

    @Override // com.robinhood.android.common.p088ui.tabs.Scrollable
    public void scrollToTop() {
        ScrollableLayoutManager scrollableLayoutManager = this.discoverLayoutManager;
        if (scrollableLayoutManager != null) {
            scrollableLayoutManager.scrollToPositionWithOffset(0, 0, true);
        }
    }

    @Override // com.robinhood.android.search.highlights.interactions.SearchHighlightInteractable
    public void processDeeplink(TabLinkIntentKey.Search tabIntentKey) {
        Intrinsics.checkNotNullParameter(tabIntentKey, "tabIntentKey");
        onQueryCancelled();
        String targetSubpageId = tabIntentKey.getTargetSubpageId();
        if (targetSubpageId != null) {
            getHighlightsDuxo().onSubpageTargetRequested(targetSubpageId);
        }
    }

    /* compiled from: SearchFragment.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/search/search/SearchFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/search/search/SearchFragment;", "Lcom/robinhood/android/search/contracts/SearchFragmentKey;", "<init>", "()V", "ANALYTICS_PREFIX", "", "QUICK_ADD_TAG", "SCREEN_NAME_LIST_ITEM_SEARCH", "deeplinksNeedingAccountNumber", "", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<SearchFragment, SearchFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(SearchFragmentKey searchFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, searchFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public SearchFragmentKey getArgs(SearchFragment searchFragment) {
            return (SearchFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, searchFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public SearchFragment newInstance(SearchFragmentKey searchFragmentKey) {
            return (SearchFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, searchFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(SearchFragment searchFragment, SearchFragmentKey searchFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, searchFragment, searchFragmentKey);
        }
    }
}
