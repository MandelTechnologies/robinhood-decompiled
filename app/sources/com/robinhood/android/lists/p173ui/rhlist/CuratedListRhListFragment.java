package com.robinhood.android.lists.p173ui.rhlist;

import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableString;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.snackbar.Snackbar;
import com.jakewharton.rxbinding3.recyclerview.RecyclerViewScrollEvent;
import com.jakewharton.rxbinding3.recyclerview.RxRecyclerView;
import com.jakewharton.rxbinding3.view.RxView;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.analytics.LogOnceAnalytics;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.contracts.CuratedListKey;
import com.robinhood.android.common.extensions.SecurityViewModes;
import com.robinhood.android.common.extensions.SortOrders;
import com.robinhood.android.common.lists.C11222R;
import com.robinhood.android.common.p088ui.AccurateLinearLayoutManager;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.HtmlCompat;
import com.robinhood.android.common.util.SecurityViewMode;
import com.robinhood.android.common.util.VisibleItemsManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.extensions.CharSequences;
import com.robinhood.android.common.util.extensions.RichTexts;
import com.robinhood.android.common.util.extensions.Snackbars;
import com.robinhood.android.common.util.transition.ToolbarScrollAnimator;
import com.robinhood.android.common.view.ErrorView;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.futures.contracts.FuturesDetailFragmentKey;
import com.robinhood.android.history.p153ui.MerchantRewardDetailComposable;
import com.robinhood.android.indexes.contracts.IndexDetailPageFragmentKey;
import com.robinhood.android.indexes.contracts.IndexDetailPageFragmentKey2;
import com.robinhood.android.lists.C20839R;
import com.robinhood.android.lists.databinding.FragmentCuratedListRhListBinding;
import com.robinhood.android.lists.extensions.SortDirections;
import com.robinhood.android.lists.p173ui.CuratedListAdapter;
import com.robinhood.android.lists.p173ui.ipo.CuratedListIpoAccessEmptyView;
import com.robinhood.android.lists.p173ui.ipo.CuratedListIpoAccessFilterView;
import com.robinhood.android.lists.p173ui.ipo.CuratedListIpoAccessHeaderView;
import com.robinhood.android.lists.p173ui.ipo.CuratedListIpoAccessInstrumentCarousel;
import com.robinhood.android.lists.p173ui.ipo.IpoNotificationSettingBottomSheet;
import com.robinhood.android.lists.p173ui.listitemsort.CuratedListSortItemsBottomSheetFragment;
import com.robinhood.android.lists.p173ui.rhlist.CuratedListRhListCarouselView;
import com.robinhood.android.lists.p173ui.rhlist.CuratedListRhListDetailView;
import com.robinhood.android.lists.p173ui.rhlist.CuratedListRhListHeaderView;
import com.robinhood.android.lists.p173ui.rhlist.CuratedListRhListViewState;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource;
import com.robinhood.android.navigation.keys.HostIntentKey;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.directipo.models.api.ApiIpoAccessListEmptyState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.models.api.ApiCuratedList;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.api.GenericErrorResponse;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.models.p320db.CuratedListViewMode;
import com.robinhood.models.p320db.IacInfoBanner;
import com.robinhood.models.p320db.IpoAccessStatus;
import com.robinhood.models.p320db.bonfire.ListDisclosure;
import com.robinhood.models.p355ui.CryptoCuratedListEligible;
import com.robinhood.models.p355ui.CuratedListEligible;
import com.robinhood.models.p355ui.FuturesCuratedListEligible;
import com.robinhood.models.p355ui.IndexCuratedListEligible;
import com.robinhood.models.p355ui.InstrumentCuratedListEligible;
import com.robinhood.models.p355ui.OptionStrategyCuratedListEligible;
import com.robinhood.models.p355ui.SortOption;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.shared.crypto.contracts.detail.CryptoDetailFragmentKey;
import com.robinhood.shared.iac.extensions.IacInfoBanners;
import com.robinhood.shared.iac.infobanner.InfoBannerCallbacks;
import com.robinhood.shared.portfolio.lists.p391ui.sort.CuratedListSortCallbacks;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsAndCallbacksCompanion;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.CompositeAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.SingleItemAdapter;
import com.robinhood.viewmode.ViewModeSelectionBottomSheetFragment;
import com.robinhood.viewmode.ViewModeSelectionType;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples3;
import kotlin.Unit;
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
import p479j$.time.Instant;

/* compiled from: CuratedListRhListFragment.kt */
@Metadata(m3635d1 = {"\u0000¬\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u0080\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n:\u0002\u0080\u0002B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0011J'\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001e\u0010\u0011J\u0017\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001f\u0010\u0011J\u0019\u0010\"\u001a\u00020\u000f2\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b$\u0010\u0011J\u0017\u0010%\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b%\u0010\u0011J\u0017\u0010&\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b&\u0010\u0011J\u0017\u0010'\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b'\u0010\u0011J!\u0010,\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020(2\b\b\u0002\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J!\u0010,\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020.2\b\b\u0002\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010/J\u0017\u00100\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b0\u0010\u0011J\u0017\u00101\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b1\u0010\u0011J\u001f\u00105\u001a\u00020\u000f2\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020\u0017H\u0002¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u00020\u000f2\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u000fH\u0016¢\u0006\u0004\b?\u0010\fJ\u0019\u0010B\u001a\u00020\u000f2\b\u0010A\u001a\u0004\u0018\u00010@H\u0016¢\u0006\u0004\bB\u0010CJ!\u0010F\u001a\u00020\u000f2\u0006\u0010E\u001a\u00020D2\b\u0010A\u001a\u0004\u0018\u00010@H\u0016¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u000fH\u0016¢\u0006\u0004\bH\u0010\fJ\u000f\u0010I\u001a\u00020\u000fH\u0016¢\u0006\u0004\bI\u0010\fJ\u000f\u0010J\u001a\u00020\u000fH\u0016¢\u0006\u0004\bJ\u0010\fJ\u001f\u0010O\u001a\u00020\u000f2\u0006\u0010L\u001a\u00020K2\u0006\u0010N\u001a\u00020MH\u0014¢\u0006\u0004\bO\u0010PJ\u0017\u0010R\u001a\u00020\u00172\u0006\u00108\u001a\u00020QH\u0016¢\u0006\u0004\bR\u0010SJ\u0017\u0010V\u001a\u00020\u000f2\u0006\u0010U\u001a\u00020TH\u0016¢\u0006\u0004\bV\u0010WJ\u001f\u0010X\u001a\u00020\u000f2\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020\u0017H\u0016¢\u0006\u0004\bX\u00106J\u0017\u0010[\u001a\u00020\u000f2\u0006\u0010Z\u001a\u00020YH\u0016¢\u0006\u0004\b[\u0010\\J\u0017\u0010]\u001a\u00020\u000f2\u0006\u0010Z\u001a\u00020YH\u0016¢\u0006\u0004\b]\u0010\\J\u0017\u0010^\u001a\u00020\u000f2\u0006\u0010Z\u001a\u00020YH\u0016¢\u0006\u0004\b^\u0010\\J\u0017\u0010`\u001a\u00020\u000f2\u0006\u0010_\u001a\u000202H\u0016¢\u0006\u0004\b`\u0010aJ\u0017\u0010c\u001a\u00020\u000f2\u0006\u0010b\u001a\u00020TH\u0016¢\u0006\u0004\bc\u0010WJ\u0017\u0010e\u001a\u00020\u000f2\u0006\u0010d\u001a\u00020TH\u0016¢\u0006\u0004\be\u0010WJ\u0017\u0010g\u001a\u00020\u000f2\u0006\u0010f\u001a\u00020TH\u0016¢\u0006\u0004\bg\u0010WJ\u0017\u0010i\u001a\u00020\u000f2\u0006\u0010h\u001a\u00020TH\u0016¢\u0006\u0004\bi\u0010WJ\u000f\u0010j\u001a\u00020\u000fH\u0016¢\u0006\u0004\bj\u0010\fJ\u000f\u0010k\u001a\u00020\u000fH\u0016¢\u0006\u0004\bk\u0010\fJ\u0017\u0010l\u001a\u00020\u000f2\u0006\u0010b\u001a\u00020TH\u0016¢\u0006\u0004\bl\u0010WJ\u0017\u0010m\u001a\u00020\u000f2\u0006\u0010d\u001a\u00020TH\u0016¢\u0006\u0004\bm\u0010WJ\u0017\u0010n\u001a\u00020\u000f2\u0006\u0010f\u001a\u00020TH\u0016¢\u0006\u0004\bn\u0010WJ\u0017\u0010p\u001a\u00020\u000f2\u0006\u0010o\u001a\u00020DH\u0016¢\u0006\u0004\bp\u0010qJ'\u0010v\u001a\u00020\u000f2\u0006\u0010s\u001a\u00020r2\u0006\u0010t\u001a\u00020T2\u0006\u0010u\u001a\u00020.H\u0016¢\u0006\u0004\bv\u0010wJ\u0017\u0010z\u001a\u00020\u000f2\u0006\u0010y\u001a\u00020xH\u0016¢\u0006\u0004\bz\u0010{J\u0017\u0010}\u001a\u00020\u000f2\u0006\u0010|\u001a\u000207H\u0016¢\u0006\u0004\b}\u0010:J\u0017\u0010~\u001a\u00020\u000f2\u0006\u0010|\u001a\u000207H\u0016¢\u0006\u0004\b~\u0010:J\u0017\u0010\u007f\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\u007f\u0010#J\u0019\u0010\u0080\u0001\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0005\b\u0080\u0001\u0010#R\u001a\u0010\u0082\u0001\u001a\u00030\u0081\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001a\u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001b\u0010\u0087\u0001\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001b\u0010\u0089\u0001\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u0088\u0001R\u001b\u0010\u008a\u0001\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0088\u0001R!\u0010\u0090\u0001\u001a\u00030\u008b\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R!\u0010\u0096\u0001\u001a\u00030\u0091\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R&\u0010\u0098\u0001\u001a\u000f\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u0002070\u0097\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R&\u0010\u009d\u0001\u001a\u0011\u0012\u0005\u0012\u00030\u009b\u0001\u0012\u0005\u0012\u00030\u009c\u00010\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R%\u0010 \u0001\u001a\u0010\u0012\u0005\u0012\u00030\u009f\u0001\u0012\u0004\u0012\u00020 0\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0001\u0010\u009e\u0001R&\u0010¢\u0001\u001a\u0011\u0012\u0005\u0012\u00030¡\u0001\u0012\u0005\u0012\u00030\u009c\u00010\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¢\u0001\u0010\u009e\u0001R%\u0010¤\u0001\u001a\u0010\u0012\u0005\u0012\u00030£\u0001\u0012\u0004\u0012\u00020x0\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010\u009e\u0001R,\u0010§\u0001\u001a\u0017\u0012\u0005\u0012\u00030¥\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u0002070¦\u00010\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0001\u0010\u009e\u0001R&\u0010ª\u0001\u001a\u0011\u0012\u0005\u0012\u00030¨\u0001\u0012\u0005\u0012\u00030©\u00010\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bª\u0001\u0010\u009e\u0001R&\u0010\u00ad\u0001\u001a\u0011\u0012\u0005\u0012\u00030«\u0001\u0012\u0005\u0012\u00030¬\u00010\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00ad\u0001\u0010\u009e\u0001R!\u0010²\u0001\u001a\u00030®\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¯\u0001\u0010\u0093\u0001\u001a\u0006\b°\u0001\u0010±\u0001R&\u0010µ\u0001\u001a\u0011\u0012\u0005\u0012\u00030³\u0001\u0012\u0005\u0012\u00030´\u00010\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bµ\u0001\u0010\u009e\u0001R$\u0010¶\u0001\u001a\u000f\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\u000f0\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010\u009e\u0001R%\u0010¸\u0001\u001a\u0010\u0012\u0005\u0012\u00030·\u0001\u0012\u0004\u0012\u00020\u000f0\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¸\u0001\u0010\u009e\u0001R%\u0010º\u0001\u001a\u0010\u0012\u0005\u0012\u00030¹\u0001\u0012\u0004\u0012\u00020\u000f0\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0001\u0010\u009e\u0001R&\u0010½\u0001\u001a\u0011\u0012\u0005\u0012\u00030»\u0001\u0012\u0005\u0012\u00030¼\u00010\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b½\u0001\u0010\u009e\u0001R%\u0010¿\u0001\u001a\u0010\u0012\u0005\u0012\u00030¾\u0001\u0012\u0004\u0012\u00020\u000f0\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¿\u0001\u0010\u009e\u0001R%\u0010À\u0001\u001a\u0010\u0012\u0005\u0012\u00030¾\u0001\u0012\u0004\u0012\u00020\u000f0\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÀ\u0001\u0010\u009e\u0001R$\u0010Á\u0001\u001a\u000f\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020(0\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÁ\u0001\u0010\u009e\u0001R\u001b\u0010Â\u0001\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÂ\u0001\u0010Ã\u0001R\u001e\u0010Å\u0001\u001a\t\u0012\u0004\u0012\u00020\u000f0Ä\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÅ\u0001\u0010Æ\u0001R\u0017\u0010Ç\u0001\u001a\u00020.8\u0002X\u0082D¢\u0006\b\n\u0006\bÇ\u0001\u0010Ã\u0001R!\u0010Ì\u0001\u001a\u00030È\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÉ\u0001\u0010\u0093\u0001\u001a\u0006\bÊ\u0001\u0010Ë\u0001R*\u0010Î\u0001\u001a\u00030Í\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÎ\u0001\u0010Ï\u0001\u001a\u0006\bÐ\u0001\u0010Ñ\u0001\"\u0006\bÒ\u0001\u0010Ó\u0001R*\u0010Õ\u0001\u001a\u00030Ô\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÕ\u0001\u0010Ö\u0001\u001a\u0006\b×\u0001\u0010Ø\u0001\"\u0006\bÙ\u0001\u0010Ú\u0001R\u001a\u0010Ü\u0001\u001a\u00030Û\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÜ\u0001\u0010Ý\u0001R\u001f\u0010Þ\u0001\u001a\u00020\u00178\u0016X\u0096D¢\u0006\u0010\n\u0006\bÞ\u0001\u0010ß\u0001\u001a\u0006\bà\u0001\u0010á\u0001R\u001f\u0010â\u0001\u001a\u00020.8\u0016X\u0096D¢\u0006\u0010\n\u0006\bâ\u0001\u0010Ã\u0001\u001a\u0006\bã\u0001\u0010ä\u0001R\u001f\u0010å\u0001\u001a\u00020.8\u0016X\u0096D¢\u0006\u0010\n\u0006\bå\u0001\u0010Ã\u0001\u001a\u0006\bæ\u0001\u0010ä\u0001R\u0018\u0010ê\u0001\u001a\u00030ç\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bè\u0001\u0010é\u0001R\u0018\u0010í\u0001\u001a\u00030³\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bë\u0001\u0010ì\u0001R\u001f\u0010ñ\u0001\u001a\n\u0012\u0005\u0012\u00030¨\u00010î\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bï\u0001\u0010ð\u0001R\u0017\u0010ô\u0001\u001a\u00020T8BX\u0082\u0004¢\u0006\b\u001a\u0006\bò\u0001\u0010ó\u0001R\u0018\u0010ø\u0001\u001a\u00030õ\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bö\u0001\u0010÷\u0001R\u001d\u0010ý\u0001\u001a\b0ù\u0001j\u0003`ú\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bû\u0001\u0010ü\u0001R\u0017\u0010ÿ\u0001\u001a\u00020.8VX\u0096\u0004¢\u0006\b\u001a\u0006\bþ\u0001\u0010ä\u0001¨\u0006\u0081\u0002"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListCarouselView$Callbacks;", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListDetailView$Callbacks;", "Lcom/robinhood/android/lists/ui/ipo/CuratedListIpoAccessFilterView$Callbacks;", "Lcom/robinhood/shared/portfolio/lists/ui/sort/CuratedListSortCallbacks;", "Lcom/robinhood/android/lists/ui/ipo/CuratedListIpoAccessInstrumentCarousel$Callbacks;", "Lcom/robinhood/android/lists/ui/CuratedListAdapter$Callbacks;", "Lcom/robinhood/viewmode/ViewModeSelectionBottomSheetFragment$Callbacks;", "Lcom/robinhood/shared/iac/infobanner/InfoBannerCallbacks;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListViewState;", "state", "", "setViewState", "(Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListViewState;)V", "bindLoading", "bindListError", "bindListItemsError", "bindHeader", "bindRelatedListCarousel", "", "showRhListDetail", "showStickyView", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListDetailView$State$Data;", WebsocketGatewayConstants.DATA_KEY, "bindRhListDetails", "(ZZLcom/robinhood/android/lists/ui/rhlist/CuratedListRhListDetailView$State$Data;)V", "bindIpoAccessFilter", "bindCuratedListItems", "Lcom/robinhood/models/db/IacInfoBanner;", MerchantRewardDetailComposable.BANNER_TEST_TAG, "bindIacInfoBanner", "(Lcom/robinhood/models/db/IacInfoBanner;)V", "bindCuratedListIpoAccessItems", "bindShowAllView", "bindEmpty", "consumeUiEvents", "", "message", "", "duration", "showSnackbar", "(Ljava/lang/CharSequence;I)V", "", "(Ljava/lang/String;I)V", "updateMenuItems", "bindDisclosureText", "Lcom/robinhood/models/ui/SortOption;", "currentSortOption", "isFuturesOnlyList", "showSortOrderBottomSheet", "(Lcom/robinhood/models/ui/SortOption;Z)V", "Lcom/robinhood/models/ui/CuratedListEligible;", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "logListItemAppear", "(Lcom/robinhood/models/ui/CuratedListEligible;)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "onDetach", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "onResume", "onStop", "Landroid/view/Menu;", "menu", "Landroid/view/MenuInflater;", "inflater", "createOptionsMenu", "(Landroid/view/Menu;Landroid/view/MenuInflater;)V", "Landroid/view/MenuItem;", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Ljava/util/UUID;", "childListId", "onChildListClicked", "(Ljava/util/UUID;)V", "onSortControlButtonClicked", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListViewState$Filter;", "filterChip", "onFilterChipClicked", "(Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListViewState$Filter;)V", "onFilterChipTooltipClicked", "onFilterChipTooltipAppear", "sortOption", "onSortOptionSelected", "(Lcom/robinhood/models/ui/SortOption;)V", "instrumentId", "onInstrumentRowClicked", "currencyPairId", "onCurrencyRowClicked", "contractId", "onFuturesRowClicked", "indexId", "onIndexRowClicked", "onQuoteClicked", "onFuturesQuoteClicked", "onInstrumentRowRemoved", "onCryptoRowRemoved", "onFuturesRowRemoved", "itemView", "onReorderPressed", "(Landroid/view/View;)V", "Lcom/robinhood/android/common/util/SecurityViewMode;", "viewMode", "listId", "listDisplayName", "onCuratedListViewModeChange", "(Lcom/robinhood/android/common/util/SecurityViewMode;Ljava/util/UUID;Ljava/lang/String;)V", "Lcom/robinhood/android/lists/ui/rhlist/IpoAccessFilter;", "ipoAccessFilter", "onIpoAccessFilterChanged", "(Lcom/robinhood/android/lists/ui/rhlist/IpoAccessFilter;)V", "curatedListEligible", "onIpoAccessInstrumentAppear", "onIpoAccessInstrumentClicked", "onClickInfoBanner", "onDismissInfoBanner", "Lcom/robinhood/utils/ui/view/recyclerview/CompositeAdapter;", "compositeAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/CompositeAdapter;", "Lcom/robinhood/android/lists/ui/CuratedListAdapter;", "curatedListAdapter", "Lcom/robinhood/android/lists/ui/CuratedListAdapter;", "menuItemLoading", "Landroid/view/MenuItem;", "menuItemUnfollowList", "menuItemFollowList", "Lcom/robinhood/android/lists/databinding/FragmentCuratedListRhListBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getBinding", "()Lcom/robinhood/android/lists/databinding/FragmentCuratedListRhListBinding;", "binding", "Lcom/robinhood/analytics/LogOnceAnalytics;", "logOnceAnalytics$delegate", "Lkotlin/Lazy;", "getLogOnceAnalytics", "()Lcom/robinhood/analytics/LogOnceAnalytics;", "logOnceAnalytics", "Lcom/robinhood/android/common/util/VisibleItemsManager;", "visibleItemsManager", "Lcom/robinhood/android/common/util/VisibleItemsManager;", "Lcom/robinhood/utils/ui/view/recyclerview/SingleItemAdapter;", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListHeaderView;", "Lcom/robinhood/android/lists/ui/rhlist/HeaderState;", "rhListHeaderAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/SingleItemAdapter;", "Lcom/robinhood/android/designsystem/banner/RdsInfoBannerView;", "infoBannerAdapter", "Lcom/robinhood/android/lists/ui/ipo/CuratedListIpoAccessHeaderView;", "ipoAccessHeaderAdapter", "Lcom/robinhood/android/lists/ui/ipo/CuratedListIpoAccessFilterView;", "ipoAccessFilterAdapter", "Lcom/robinhood/android/lists/ui/ipo/CuratedListIpoAccessInstrumentCarousel;", "", "ipoAccessInstrumentCarouselAdapter", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListCarouselView;", "Lcom/robinhood/android/lists/ui/rhlist/RelatedListCarouselState;", "relatedListCarouselAdapter", "Lcom/robinhood/android/designsystem/button/RdsButton;", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListViewState$ShowAllItemsRowData;", "showAllItemsAdapter", "Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "toolbarScrollAnimator$delegate", "getToolbarScrollAnimator", "()Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "toolbarScrollAnimator", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListDetailView;", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListDetailView$State;", "rhListDetailAdapter", "anchorAdapter", "Landroid/widget/FrameLayout;", "loadingAdapter", "Landroid/widget/LinearLayout;", "emptyStateAdapter", "Lcom/robinhood/android/lists/ui/ipo/CuratedListIpoAccessEmptyView;", "Lcom/robinhood/directipo/models/api/ApiIpoAccessListEmptyState;", "ipoAccessEmptyStateAdapter", "Lcom/robinhood/android/common/view/ErrorView;", "listErrorStateAdapter", "listItemsErrorStateAdapter", "disclosureAdapter", "curatedListDisplayName", "Ljava/lang/String;", "Lkotlin/Function0;", "illustrationLoadingOnError", "Lkotlin/jvm/functions/Function0;", "analyticsTag", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListDuxo;", "duxo$delegate", "getDuxo", "()Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListDuxo;", "duxo", "Lcom/robinhood/analytics/AnalyticsLogger;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "j$/time/Instant", "appearanceTime", "Lj$/time/Instant;", "useDesignSystemToolbar", "Z", "getUseDesignSystemToolbar", "()Z", "screenName", "getScreenName", "()Ljava/lang/String;", "screenDescription", "getScreenDescription", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "getStickyRhListDetailView", "()Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListDetailView;", "stickyRhListDetailView", "Lcom/robinhood/utils/ui/view/Inflater;", "getRelatedListCarouselInflater", "()Lcom/robinhood/utils/ui/view/Inflater;", "relatedListCarouselInflater", "getCuratedListId", "()Ljava/util/UUID;", "curatedListId", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "screenEventContext", "getEntityId", "entityId", "Companion", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class CuratedListRhListFragment extends BaseFragment implements CuratedListRhListCarouselView.Callbacks, CuratedListRhListDetailView.Callbacks, CuratedListIpoAccessFilterView.Callbacks, CuratedListSortCallbacks, CuratedListIpoAccessInstrumentCarousel.Callbacks, CuratedListAdapter.Callbacks, ViewModeSelectionBottomSheetFragment.Callbacks, InfoBannerCallbacks, AutoLoggableFragment {
    public static final int $stable = 0;
    private static final String SCREEN_NAME_DEFAULT = "ListDetailPage";
    public AnalyticsLogger analytics;
    private final String analyticsTag;
    private final SingleItemAdapter<View, Unit> anchorAdapter;
    private Instant appearanceTime;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private CompositeAdapter compositeAdapter;
    private CuratedListAdapter curatedListAdapter;
    private String curatedListDisplayName;
    private final SingleItemAdapter<View, CharSequence> disclosureAdapter;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final SingleItemAdapter<LinearLayout, Unit> emptyStateAdapter;
    public EventLogger eventLogger;
    private final Function0<Unit> illustrationLoadingOnError;
    private final SingleItemAdapter<RdsInfoBannerView, IacInfoBanner> infoBannerAdapter;
    private final SingleItemAdapter<CuratedListIpoAccessEmptyView, ApiIpoAccessListEmptyState> ipoAccessEmptyStateAdapter;
    private final SingleItemAdapter<CuratedListIpoAccessFilterView, CuratedListRhListViewState6> ipoAccessFilterAdapter;
    private final SingleItemAdapter<CuratedListIpoAccessHeaderView, HeaderState> ipoAccessHeaderAdapter;
    private final SingleItemAdapter<CuratedListIpoAccessInstrumentCarousel, List<CuratedListEligible>> ipoAccessInstrumentCarouselAdapter;
    private final SingleItemAdapter<ErrorView, Unit> listErrorStateAdapter;
    private final SingleItemAdapter<ErrorView, Unit> listItemsErrorStateAdapter;
    private final SingleItemAdapter<FrameLayout, Unit> loadingAdapter;

    /* renamed from: logOnceAnalytics$delegate, reason: from kotlin metadata */
    private final Lazy logOnceAnalytics;
    private MenuItem menuItemFollowList;
    private MenuItem menuItemLoading;
    private MenuItem menuItemUnfollowList;
    private final SingleItemAdapter<CuratedListRhListCarouselView, RelatedListCarouselState> relatedListCarouselAdapter;
    private final SingleItemAdapter<CuratedListRhListDetailView, CuratedListRhListDetailView.State> rhListDetailAdapter;
    private final SingleItemAdapter<CuratedListRhListHeaderView, HeaderState> rhListHeaderAdapter;
    private final String screenDescription;
    private final String screenName;
    private final SingleItemAdapter<RdsButton, CuratedListRhListViewState.ShowAllItemsRowData> showAllItemsAdapter;

    /* renamed from: toolbarScrollAnimator$delegate, reason: from kotlin metadata */
    private final Lazy toolbarScrollAnimator;
    private final boolean useDesignSystemToolbar;
    private VisibleItemsManager<UUID, CuratedListEligible> visibleItemsManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CuratedListRhListFragment.class, "binding", "getBinding()Lcom/robinhood/android/lists/databinding/FragmentCuratedListRhListBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Screen PROTOBUF_SCREEN = new Screen(Screen.Name.ROBINHOOD_LIST_DETAIL_PAGE, null, null, null, 14, null);

    /* compiled from: CuratedListRhListFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IpoAccessStatus.values().length];
            try {
                iArr[IpoAccessStatus.S1_FILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IpoAccessStatus.PRICE_FINALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IpoAccessStatus.PRICE_INITIALIZED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IpoAccessStatus.PUBLIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IpoAccessStatus.CANCELED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[IpoAccessStatus.DELAYED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[IpoAccessStatus.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onViewCreated$lambda$27() {
        return true;
    }

    @Override // com.robinhood.android.lists.ui.CuratedListAdapter.Callbacks
    public void onCryptoRowRemoved(UUID currencyPairId) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
    }

    @Override // com.robinhood.android.lists.ui.CuratedListAdapter.Callbacks
    public void onFuturesRowRemoved(UUID contractId) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
    }

    @Override // com.robinhood.android.lists.ui.CuratedListAdapter.Callbacks
    public void onInstrumentRowRemoved(UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
    }

    @Override // com.robinhood.android.lists.ui.CuratedListAdapter.Callbacks
    public void onReorderPressed(View itemView) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
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
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    @Override // com.robinhood.viewmode.ViewModeSelectionBottomSheetFragment.Callbacks
    public void onAllCuratedListsViewModeChange(SecurityViewMode securityViewMode) {
        ViewModeSelectionBottomSheetFragment.Callbacks.DefaultImpls.onAllCuratedListsViewModeChange(this, securityViewMode);
    }

    @Override // com.robinhood.viewmode.ViewModeSelectionBottomSheetFragment.Callbacks
    public void onHoldingsViewModeChange(SecurityViewMode securityViewMode) {
        ViewModeSelectionBottomSheetFragment.Callbacks.DefaultImpls.onHoldingsViewModeChange(this, securityViewMode);
    }

    @Override // com.robinhood.viewmode.ViewModeSelectionBottomSheetFragment.Callbacks
    public void onOptionsWatchlistViewModeChange(SecurityViewMode securityViewMode) {
        ViewModeSelectionBottomSheetFragment.Callbacks.DefaultImpls.onOptionsWatchlistViewModeChange(this, securityViewMode);
    }

    public CuratedListRhListFragment() {
        super(C20839R.layout.fragment_curated_list_rh_list);
        this.binding = ViewBinding5.viewBinding(this, CuratedListRhListFragment2.INSTANCE);
        this.logOnceAnalytics = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CuratedListRhListFragment.logOnceAnalytics_delegate$lambda$0(this.f$0);
            }
        });
        SingleItemAdapter.Companion companion = SingleItemAdapter.INSTANCE;
        CuratedListRhListHeaderView.Companion companion2 = CuratedListRhListHeaderView.INSTANCE;
        DiffCallbacks.Single single = DiffCallbacks.Single.INSTANCE;
        this.rhListHeaderAdapter = companion.m2993of(companion2, single, new Function2() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CuratedListRhListFragment.rhListHeaderAdapter$lambda$1(this.f$0, (CuratedListRhListHeaderView) obj, (HeaderState) obj2);
            }
        });
        this.infoBannerAdapter = companion.m2993of(RdsInfoBannerView.INSTANCE, single, new Function2() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListFragment$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CuratedListRhListFragment.infoBannerAdapter$lambda$2(this.f$0, (RdsInfoBannerView) obj, (IacInfoBanner) obj2);
            }
        });
        this.ipoAccessHeaderAdapter = SingleItemAdapter.Companion.of$default(companion, CuratedListIpoAccessHeaderView.INSTANCE, null, 2, null);
        this.ipoAccessFilterAdapter = companion.m2993of(CuratedListIpoAccessFilterView.INSTANCE, single, new Function2() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListFragment$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CuratedListRhListFragment.ipoAccessFilterAdapter$lambda$3(this.f$0, (CuratedListIpoAccessFilterView) obj, (CuratedListRhListViewState6) obj2);
            }
        });
        this.ipoAccessInstrumentCarouselAdapter = companion.m2993of(CuratedListIpoAccessInstrumentCarousel.INSTANCE, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListFragment$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CuratedListRhListFragment.ipoAccessInstrumentCarouselAdapter$lambda$4(this.f$0, (CuratedListIpoAccessInstrumentCarousel) obj, (List) obj2);
            }
        });
        this.relatedListCarouselAdapter = companion.m2993of(getRelatedListCarouselInflater(), single, new Function2() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListFragment$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CuratedListRhListFragment.relatedListCarouselAdapter$lambda$5((CuratedListRhListCarouselView) obj, (RelatedListCarouselState) obj2);
            }
        });
        SingleItemAdapter<RdsButton, CuratedListRhListViewState.ShowAllItemsRowData> singleItemAdapterM2991of = companion.m2991of(C11222R.layout.include_curated_list_show_more_ghost_button, single, new Function2() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListFragment$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CuratedListRhListFragment.showAllItemsAdapter$lambda$7(this.f$0, (RdsButton) obj, (CuratedListRhListViewState.ShowAllItemsRowData) obj2);
            }
        });
        singleItemAdapterM2991of.setData(null);
        this.showAllItemsAdapter = singleItemAdapterM2991of;
        this.toolbarScrollAnimator = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListFragment$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CuratedListRhListFragment.toolbarScrollAnimator_delegate$lambda$9(this.f$0);
            }
        });
        SingleItemAdapter<CuratedListRhListDetailView, CuratedListRhListDetailView.State> singleItemAdapterM2993of = companion.m2993of(CuratedListRhListDetailView.INSTANCE, single, new Function2() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListFragment$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CuratedListRhListFragment.rhListDetailAdapter$lambda$10(this.f$0, (CuratedListRhListDetailView) obj, (CuratedListRhListDetailView.State) obj2);
            }
        });
        singleItemAdapterM2993of.setData(null);
        this.rhListDetailAdapter = singleItemAdapterM2993of;
        this.anchorAdapter = SingleItemAdapter.Companion.ofUnit$default(companion, C20839R.layout.curated_list_item_recycler_view_anchor, (DiffUtil.ItemCallback) null, (Function1) null, 6, (Object) null);
        this.loadingAdapter = SingleItemAdapter.Companion.ofUnit$default(companion, C20839R.layout.curated_list_loading_view, (DiffUtil.ItemCallback) null, (Function1) null, 6, (Object) null);
        SingleItemAdapter<LinearLayout, Unit> singleItemAdapterOfUnit$default = SingleItemAdapter.Companion.ofUnit$default(companion, C20839R.layout.curated_list_rh_list_empty_view, (DiffUtil.ItemCallback) null, (Function1) null, 6, (Object) null);
        singleItemAdapterOfUnit$default.setData(null);
        this.emptyStateAdapter = singleItemAdapterOfUnit$default;
        this.ipoAccessEmptyStateAdapter = SingleItemAdapter.Companion.of$default(companion, CuratedListIpoAccessEmptyView.INSTANCE, null, 2, null);
        this.listErrorStateAdapter = companion.m2991of(C20839R.layout.include_curated_list_error_view, single, new Function2() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListFragment$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CuratedListRhListFragment.listErrorStateAdapter$lambda$14(this.f$0, (ErrorView) obj, (Unit) obj2);
            }
        });
        this.listItemsErrorStateAdapter = companion.m2991of(C20839R.layout.include_curated_list_items_error_view, single, new Function2() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CuratedListRhListFragment.listItemsErrorStateAdapter$lambda$16(this.f$0, (ErrorView) obj, (Unit) obj2);
            }
        });
        this.disclosureAdapter = companion.m2991of(C20839R.layout.curated_list_disclosure_item, single, new Function2() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CuratedListRhListFragment.disclosureAdapter$lambda$17((View) obj, (CharSequence) obj2);
            }
        });
        this.illustrationLoadingOnError = new Function0() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CuratedListRhListFragment.illustrationLoadingOnError$lambda$18(this.f$0);
            }
        };
        this.analyticsTag = "rh_list";
        this.duxo = OldDuxos.oldDuxo(this, CuratedListRhListDuxo.class);
        this.useDesignSystemToolbar = true;
        this.screenName = SCREEN_NAME_DEFAULT;
        this.screenDescription = "rh_list";
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.ROBINHOOD_LIST_DETAIL_PAGE, null, null, null, 14, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        String string2 = ((CuratedListKey.RhList) INSTANCE.getArgs((Fragment) this)).getListId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, new com.robinhood.rosetta.eventlogging.List(string2, null, null, null, 14, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32769, -1, -1, -1, -1, -1, 16383, null);
    }

    private final FragmentCuratedListRhListBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentCuratedListRhListBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecyclerView getRecyclerView() {
        RecyclerView fragmentCuratedListUserListRecyclerView = getBinding().fragmentCuratedListUserListRecyclerView;
        Intrinsics.checkNotNullExpressionValue(fragmentCuratedListUserListRecyclerView, "fragmentCuratedListUserListRecyclerView");
        return fragmentCuratedListUserListRecyclerView;
    }

    private final CuratedListRhListDetailView getStickyRhListDetailView() {
        CuratedListRhListDetailView fragmentCuratedListRhListStickyDetailView = getBinding().fragmentCuratedListRhListStickyDetailView;
        Intrinsics.checkNotNullExpressionValue(fragmentCuratedListRhListStickyDetailView, "fragmentCuratedListRhListStickyDetailView");
        return fragmentCuratedListRhListStickyDetailView;
    }

    private final LogOnceAnalytics getLogOnceAnalytics() {
        return (LogOnceAnalytics) this.logOnceAnalytics.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LogOnceAnalytics logOnceAnalytics_delegate$lambda$0(CuratedListRhListFragment curatedListRhListFragment) {
        return new LogOnceAnalytics(curatedListRhListFragment.getAnalytics());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rhListHeaderAdapter$lambda$1(CuratedListRhListFragment curatedListRhListFragment, CuratedListRhListHeaderView of, HeaderState state) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(state, "state");
        of.setImageLoaderOnError(curatedListRhListFragment.illustrationLoadingOnError);
        of.bind(state);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit infoBannerAdapter$lambda$2(CuratedListRhListFragment curatedListRhListFragment, RdsInfoBannerView of, IacInfoBanner infoBanner) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(infoBanner, "infoBanner");
        int dimensionPixelSize = of.getResources().getDimensionPixelSize(C13997R.dimen.rds_spacing_medium);
        ViewsKt.setMarginStart(of, dimensionPixelSize);
        ViewsKt.setMarginEnd(of, dimensionPixelSize);
        ViewsKt.setMarginBottom(of, of.getResources().getDimensionPixelSize(C13997R.dimen.rds_spacing_default));
        IacInfoBanners.bindIacInfoBanner(of, infoBanner, curatedListRhListFragment);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ipoAccessFilterAdapter$lambda$3(CuratedListRhListFragment curatedListRhListFragment, CuratedListIpoAccessFilterView of, CuratedListRhListViewState6 ipoAccessFilter) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(ipoAccessFilter, "ipoAccessFilter");
        of.setCallbacks(curatedListRhListFragment);
        of.bind(ipoAccessFilter);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ipoAccessInstrumentCarouselAdapter$lambda$4(CuratedListRhListFragment curatedListRhListFragment, CuratedListIpoAccessInstrumentCarousel of, List items) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(items, "items");
        of.setCallbacks(curatedListRhListFragment);
        of.bind((List<? extends CuratedListEligible>) items);
        return Unit.INSTANCE;
    }

    private final Inflater<CuratedListRhListCarouselView> getRelatedListCarouselInflater() {
        return new Inflater() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListFragment$relatedListCarouselInflater$1
            @Override // com.robinhood.utils.p409ui.view.Inflater
            public final CuratedListRhListCarouselView inflate(ViewGroup parent) {
                Intrinsics.checkNotNullParameter(parent, "parent");
                CuratedListRhListCarouselView curatedListRhListCarouselViewInflate = CuratedListRhListCarouselView.INSTANCE.inflate(parent);
                curatedListRhListCarouselViewInflate.setCallbacks(this.this$0);
                return curatedListRhListCarouselViewInflate;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit relatedListCarouselAdapter$lambda$5(CuratedListRhListCarouselView of, RelatedListCarouselState state) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(state, "state");
        of.bind(state);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showAllItemsAdapter$lambda$7(final CuratedListRhListFragment curatedListRhListFragment, RdsButton of, CuratedListRhListViewState.ShowAllItemsRowData rowData) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(rowData, "rowData");
        String string2 = curatedListRhListFragment.getString(C20839R.string.lists_show_all_rows_text);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        of.setText(CharSequences.addUnderlineToText(string2));
        of.setLoading(rowData.getShowLoading());
        OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListFragment$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CuratedListRhListFragment.showAllItemsAdapter$lambda$7$lambda$6(this.f$0);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showAllItemsAdapter$lambda$7$lambda$6(CuratedListRhListFragment curatedListRhListFragment) {
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(curatedListRhListFragment.getAnalytics(), AnalyticsStrings.BUTTON_GROUP_LIST_DETAIL, AnalyticsStrings.BUTTON_LIST_SHOW_MORE_LIST_ITEMS, null, null, curatedListRhListFragment.getCuratedListId().toString(), curatedListRhListFragment.curatedListDisplayName, null, null, 204, null);
        curatedListRhListFragment.getDuxo().showFullList();
        return Unit.INSTANCE;
    }

    private final ToolbarScrollAnimator getToolbarScrollAnimator() {
        return (ToolbarScrollAnimator) this.toolbarScrollAnimator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ToolbarScrollAnimator toolbarScrollAnimator_delegate$lambda$9(CuratedListRhListFragment curatedListRhListFragment) {
        RhToolbar rhToolbar = curatedListRhListFragment.getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        return new ToolbarScrollAnimator(rhToolbar, curatedListRhListFragment.getResources().getDimension(C11048R.dimen.toolbar_scroll_height), true, true, false, (Float) null, 48, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rhListDetailAdapter$lambda$10(CuratedListRhListFragment curatedListRhListFragment, CuratedListRhListDetailView of, CuratedListRhListDetailView.State state) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(state, "state");
        of.setCallbacks(curatedListRhListFragment);
        of.bind(state);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit listErrorStateAdapter$lambda$14(final CuratedListRhListFragment curatedListRhListFragment, ErrorView of, Unit it) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(it, "it");
        of.setOnPrimaryButtonClick(new Function0() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListFragment$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CuratedListRhListFragment.listErrorStateAdapter$lambda$14$lambda$13(this.f$0);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit listErrorStateAdapter$lambda$14$lambda$13(CuratedListRhListFragment curatedListRhListFragment) {
        curatedListRhListFragment.getDuxo().retry();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit listItemsErrorStateAdapter$lambda$16(final CuratedListRhListFragment curatedListRhListFragment, ErrorView of, Unit it) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(it, "it");
        of.showImage(false);
        of.setOnPrimaryButtonClick(new Function0() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CuratedListRhListFragment.listItemsErrorStateAdapter$lambda$16$lambda$15(this.f$0);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit listItemsErrorStateAdapter$lambda$16$lambda$15(CuratedListRhListFragment curatedListRhListFragment) {
        curatedListRhListFragment.getDuxo().retry();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit disclosureAdapter$lambda$17(View of, CharSequence disclosure) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        ((RhTextView) of.findViewById(C20839R.id.curated_list_disclosure_text)).setText(disclosure);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit illustrationLoadingOnError$lambda$18(CuratedListRhListFragment curatedListRhListFragment) {
        curatedListRhListFragment.getDuxo().setShowingErrorImage(true);
        return Unit.INSTANCE;
    }

    private final UUID getCuratedListId() {
        return ((CuratedListKey.RhList) INSTANCE.getArgs((Fragment) this)).getListId();
    }

    private final CuratedListRhListDuxo getDuxo() {
        return (CuratedListRhListDuxo) this.duxo.getValue();
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
        this.appearanceTime = Instant.now();
        EventLogger eventLogger = getEventLogger();
        Screen screen = PROTOBUF_SCREEN;
        String string2 = ((CuratedListKey.RhList) INSTANCE.getArgs((Fragment) this)).getListId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        EventLogger.DefaultImpls.logAppear$default(eventLogger, null, screen, null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, new com.robinhood.rosetta.eventlogging.List(string2, null, null, null, 14, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32769, -1, -1, -1, -1, -1, 16383, null), 13, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        long epochMilli = Instant.now().toEpochMilli();
        Instant instant = this.appearanceTime;
        if (instant == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appearanceTime");
            instant = null;
        }
        int epochMilli2 = (int) (epochMilli - instant.toEpochMilli());
        EventLogger eventLogger = getEventLogger();
        Screen screen = PROTOBUF_SCREEN;
        String string2 = ((CuratedListKey.RhList) INSTANCE.getArgs((Fragment) this)).getListId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        EventLogger.DefaultImpls.logDisappear$default(eventLogger, null, screen, null, null, new Context(0, 0, 0, null, null, null, null, null, epochMilli2, null, null, null, null, null, null, new com.robinhood.rosetta.eventlogging.List(string2, null, null, null, 14, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -33025, -1, -1, -1, -1, -1, 16383, null), 13, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        CuratedListAdapter curatedListAdapter = new CuratedListAdapter(this, true);
        this.curatedListAdapter = curatedListAdapter;
        curatedListAdapter.registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListFragment.onCreate.1
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeChanged(int positionStart, int itemCount) {
                VisibleItemsManager visibleItemsManager = CuratedListRhListFragment.this.visibleItemsManager;
                if (visibleItemsManager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("visibleItemsManager");
                    visibleItemsManager = null;
                }
                visibleItemsManager.update();
            }
        });
        SingleItemAdapter<View, Unit> singleItemAdapter = this.anchorAdapter;
        SingleItemAdapter<RdsInfoBannerView, IacInfoBanner> singleItemAdapter2 = this.infoBannerAdapter;
        SingleItemAdapter<CuratedListRhListHeaderView, HeaderState> singleItemAdapter3 = this.rhListHeaderAdapter;
        SingleItemAdapter<CuratedListIpoAccessHeaderView, HeaderState> singleItemAdapter4 = this.ipoAccessHeaderAdapter;
        SingleItemAdapter<CuratedListRhListCarouselView, RelatedListCarouselState> singleItemAdapter5 = this.relatedListCarouselAdapter;
        SingleItemAdapter<CuratedListRhListDetailView, CuratedListRhListDetailView.State> singleItemAdapter6 = this.rhListDetailAdapter;
        SingleItemAdapter<CuratedListIpoAccessFilterView, CuratedListRhListViewState6> singleItemAdapter7 = this.ipoAccessFilterAdapter;
        SingleItemAdapter<FrameLayout, Unit> singleItemAdapter8 = this.loadingAdapter;
        SingleItemAdapter<LinearLayout, Unit> singleItemAdapter9 = this.emptyStateAdapter;
        SingleItemAdapter<CuratedListIpoAccessEmptyView, ApiIpoAccessListEmptyState> singleItemAdapter10 = this.ipoAccessEmptyStateAdapter;
        SingleItemAdapter<ErrorView, Unit> singleItemAdapter11 = this.listErrorStateAdapter;
        SingleItemAdapter<ErrorView, Unit> singleItemAdapter12 = this.listItemsErrorStateAdapter;
        CuratedListAdapter curatedListAdapter2 = this.curatedListAdapter;
        if (curatedListAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("curatedListAdapter");
            curatedListAdapter2 = null;
        }
        this.compositeAdapter = new CompositeAdapter((RecyclerView.Adapter<?>[]) new RecyclerView.Adapter[]{singleItemAdapter, singleItemAdapter2, singleItemAdapter3, singleItemAdapter4, singleItemAdapter5, singleItemAdapter6, singleItemAdapter7, singleItemAdapter8, singleItemAdapter9, singleItemAdapter10, singleItemAdapter11, singleItemAdapter12, curatedListAdapter2, this.ipoAccessInstrumentCarouselAdapter, this.showAllItemsAdapter, this.disclosureAdapter});
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (!isInTabFragment()) {
            FrameLayout root = getBinding().getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(root, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        }
        RecyclerView recyclerView = getRecyclerView();
        final FragmentActivity activity = getActivity();
        recyclerView.setLayoutManager(new AccurateLinearLayoutManager(activity) { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListFragment$onViewCreated$1$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean supportsPredictiveItemAnimations() {
                return false;
            }
        });
        recyclerView.setHasFixedSize(true);
        RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
        Intrinsics.checkNotNull(itemAnimator);
        itemAnimator.setChangeDuration(0L);
        CompositeAdapter compositeAdapter = this.compositeAdapter;
        if (compositeAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("compositeAdapter");
            compositeAdapter = null;
        }
        bindAdapter(recyclerView, compositeAdapter);
        RecyclerView.LayoutManager layoutManager = getRecyclerView().getLayoutManager();
        Intrinsics.checkNotNull(layoutManager);
        VisibleItemsManager<UUID, CuratedListEligible> visibleItemsManager = new VisibleItemsManager<>(layoutManager, new Function0() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListFragment$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(CuratedListRhListFragment.onViewCreated$lambda$21(this.f$0));
            }
        }, new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListFragment$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListRhListFragment.onViewCreated$lambda$22(this.f$0, ((Integer) obj).intValue());
            }
        }, new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListFragment$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListRhListFragment.onViewCreated$lambda$23((CuratedListEligible) obj);
            }
        });
        this.visibleItemsManager = visibleItemsManager;
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(visibleItemsManager.getItemAppearances()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListFragment$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListRhListFragment.onViewCreated$lambda$24(this.f$0, (CuratedListEligible) obj);
            }
        });
        getRecyclerView().addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListFragment.onViewCreated.6
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView2, int newState) {
                Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                if (newState == 0) {
                    RecyclerView.LayoutManager layoutManager2 = recyclerView2.getLayoutManager();
                    Intrinsics.checkNotNull(layoutManager2, "null cannot be cast to non-null type com.robinhood.android.common.ui.AccurateLinearLayoutManager");
                    EventLogger eventLogger = CuratedListRhListFragment.this.getEventLogger();
                    Screen screen = CuratedListRhListFragment.PROTOBUF_SCREEN;
                    int iFindLastCompletelyVisibleItemPosition = ((AccurateLinearLayoutManager) layoutManager2).findLastCompletelyVisibleItemPosition();
                    String string2 = ((CuratedListKey.RhList) CuratedListRhListFragment.INSTANCE.getArgs((Fragment) CuratedListRhListFragment.this)).getListId().toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    EventLogger.DefaultImpls.logScroll$default(eventLogger, null, screen, null, null, new Context(0, 0, iFindLastCompletelyVisibleItemPosition, null, null, null, null, null, 0, null, null, null, null, null, null, new com.robinhood.rosetta.eventlogging.List(string2, null, null, null, 14, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32773, -1, -1, -1, -1, -1, 16383, null), 13, null);
                }
            }
        });
        getStickyRhListDetailView().setCallbacks(this);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C209027(this));
        Observable<R> map = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListFragment$onViewCreated$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((CuratedListRhListViewState) it).getViewMode());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((CuratedListRhListFragment$onViewCreated$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableDistinctUntilChanged = ObservablesKt.filterIsPresent(map).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        ScopedObservable scopedObservableBind$default = LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null);
        CuratedListAdapter curatedListAdapter = this.curatedListAdapter;
        if (curatedListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("curatedListAdapter");
            curatedListAdapter = null;
        }
        scopedObservableBind$default.subscribeKotlin(new C209039(curatedListAdapter));
        Observable observableDistinctUntilChanged2 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListFragment.onViewCreated.10
            @Override // io.reactivex.functions.Function
            public final Optional<IacInfoBanner> apply(CuratedListRhListViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(it.getIacInfoBannerData());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListFragment$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListRhListFragment.onViewCreated$lambda$26(this.f$0, (Optional) obj);
            }
        });
        Observables observables = Observables.INSTANCE;
        ObservableSource map2 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListFragment.onViewCreated.12
            @Override // io.reactivex.functions.Function
            public final Boolean apply(CuratedListRhListViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.getShowRhListDetail());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        ObservableSource map3 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListFragment.onViewCreated.13
            @Override // io.reactivex.functions.Function
            public final CuratedListRhListDetailView.State.Data apply(CuratedListRhListViewState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return new CuratedListRhListDetailView.State.Data(state.getTotalListItemCount(), state.getShowRhControlsButton(), state.getIsFuturesOnlyList(), state.getCurrentSortOption(), state.getFilters());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        Observable map4 = observables.combineLatest(RxRecyclerView.scrollEvents(getRecyclerView()), RxView.preDraws(getRecyclerView(), new Function0() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListFragment$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(CuratedListRhListFragment.onViewCreated$lambda$27());
            }
        })).map(new Function() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListFragment.onViewCreated.15
            @Override // io.reactivex.functions.Function
            public final Boolean apply(Tuples2<RecyclerViewScrollEvent, Unit> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                View viewFindViewById = CuratedListRhListFragment.this.getRecyclerView().findViewById(C20839R.id.curated_list_rh_list_detail_view);
                return Boolean.valueOf(CuratedListRhListFragment.this.rhListDetailAdapter.getData() != null && (viewFindViewById == null || viewFindViewById.getTop() <= 0));
            }
        });
        Intrinsics.checkNotNullExpressionValue(map4, "map(...)");
        Observable observableDistinctUntilChanged3 = observables.combineLatest(map2, map3, map4).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged3, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged3), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListFragment$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListRhListFragment.onViewCreated$lambda$28(this.f$0, (Tuples3) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int onViewCreated$lambda$21(CuratedListRhListFragment curatedListRhListFragment) {
        CompositeAdapter compositeAdapter = curatedListRhListFragment.compositeAdapter;
        if (compositeAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("compositeAdapter");
            compositeAdapter = null;
        }
        return compositeAdapter.getSize();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListEligible onViewCreated$lambda$22(CuratedListRhListFragment curatedListRhListFragment, int i) {
        CompositeAdapter compositeAdapter = curatedListRhListFragment.compositeAdapter;
        CuratedListAdapter curatedListAdapter = null;
        if (compositeAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("compositeAdapter");
            compositeAdapter = null;
        }
        CuratedListAdapter curatedListAdapter2 = curatedListRhListFragment.curatedListAdapter;
        if (curatedListAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("curatedListAdapter");
            curatedListAdapter2 = null;
        }
        int firstItemPositionOf = compositeAdapter.getFirstItemPositionOf(curatedListAdapter2);
        int i2 = i - firstItemPositionOf;
        if (firstItemPositionOf > i) {
            return null;
        }
        CuratedListAdapter curatedListAdapter3 = curatedListRhListFragment.curatedListAdapter;
        if (curatedListAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("curatedListAdapter");
            curatedListAdapter3 = null;
        }
        if (i2 >= curatedListAdapter3.getSize()) {
            return null;
        }
        CuratedListAdapter curatedListAdapter4 = curatedListRhListFragment.curatedListAdapter;
        if (curatedListAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("curatedListAdapter");
        } else {
            curatedListAdapter = curatedListAdapter4;
        }
        return curatedListAdapter.getItem(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UUID onViewCreated$lambda$23(CuratedListEligible VisibleItemsManager) {
        Intrinsics.checkNotNullParameter(VisibleItemsManager, "$this$VisibleItemsManager");
        return VisibleItemsManager.getCuratedListItem().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$24(CuratedListRhListFragment curatedListRhListFragment, CuratedListEligible it) {
        Intrinsics.checkNotNullParameter(it, "it");
        curatedListRhListFragment.logListItemAppear(it);
        return Unit.INSTANCE;
    }

    /* compiled from: CuratedListRhListFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lists.ui.rhlist.CuratedListRhListFragment$onViewCreated$7 */
    /* synthetic */ class C209027 extends FunctionReferenceImpl implements Function1<CuratedListRhListViewState, Unit> {
        C209027(Object obj) {
            super(1, obj, CuratedListRhListFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CuratedListRhListViewState curatedListRhListViewState) throws Resources.NotFoundException {
            invoke2(curatedListRhListViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CuratedListRhListViewState p0) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((CuratedListRhListFragment) this.receiver).setViewState(p0);
        }
    }

    /* compiled from: CuratedListRhListFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lists.ui.rhlist.CuratedListRhListFragment$onViewCreated$9 */
    /* synthetic */ class C209039 extends FunctionReferenceImpl implements Function1<CuratedListViewMode, Unit> {
        C209039(Object obj) {
            super(1, obj, CuratedListAdapter.class, "setViewMode", "setViewMode(Lcom/robinhood/models/db/CuratedListViewMode;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CuratedListViewMode curatedListViewMode) {
            invoke2(curatedListViewMode);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CuratedListViewMode p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((CuratedListAdapter) this.receiver).setViewMode(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$26(CuratedListRhListFragment curatedListRhListFragment, Optional optional) {
        curatedListRhListFragment.bindIacInfoBanner((IacInfoBanner) optional.component1());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$28(CuratedListRhListFragment curatedListRhListFragment, Tuples3 tuples3) {
        Boolean bool = (Boolean) tuples3.component1();
        CuratedListRhListDetailView.State.Data data = (CuratedListRhListDetailView.State.Data) tuples3.component2();
        Boolean bool2 = (Boolean) tuples3.component3();
        Intrinsics.checkNotNull(bool);
        boolean zBooleanValue = bool.booleanValue();
        Intrinsics.checkNotNull(bool2);
        boolean zBooleanValue2 = bool2.booleanValue();
        Intrinsics.checkNotNull(data);
        curatedListRhListFragment.bindRhListDetails(zBooleanValue, zBooleanValue2, data);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, RxRecyclerView.scrollEvents(getRecyclerView()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListFragment$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListRhListFragment.onStart$lambda$29(this.f$0, (RecyclerViewScrollEvent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$29(CuratedListRhListFragment curatedListRhListFragment, RecyclerViewScrollEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        VisibleItemsManager<UUID, CuratedListEligible> visibleItemsManager = curatedListRhListFragment.visibleItemsManager;
        if (visibleItemsManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("visibleItemsManager");
            visibleItemsManager = null;
        }
        visibleItemsManager.update();
        curatedListRhListFragment.getToolbarScrollAnimator().dispatchScroll(curatedListRhListFragment.getRecyclerView());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getToolbarScrollAnimator().dispatchScroll(getRecyclerView());
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        getLogOnceAnalytics().reset();
        getRecyclerView().clearOnScrollListeners();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    protected void createOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.createOptionsMenu(menu, inflater);
        inflater.inflate(C20839R.menu.menu_curated_list, menu);
        this.menuItemFollowList = menu.findItem(C20839R.id.curated_list_action_follow_list);
        this.menuItemUnfollowList = menu.findItem(C20839R.id.curated_list_action_unfollow_list);
        this.menuItemLoading = menu.findItem(C20839R.id.curated_list_loading);
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        int itemId = item.getItemId();
        if (itemId == C20839R.id.curated_list_action_follow_list) {
            AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_LIST_DETAIL, AnalyticsStrings.BUTTON_LIST_FOLLOW_LIST, null, null, getCuratedListId().toString(), this.curatedListDisplayName, null, null, 204, null);
            getDuxo().followList();
            return true;
        }
        if (itemId == C20839R.id.curated_list_action_unfollow_list) {
            AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_LIST_DETAIL, AnalyticsStrings.BUTTON_LIST_UNFOLLOW_LIST, null, null, getCuratedListId().toString(), this.curatedListDisplayName, null, null, 204, null);
            getDuxo().unfollowList();
            return true;
        }
        if (itemId == C20839R.id.curated_list_loading) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // com.robinhood.android.lists.ui.rhlist.CuratedListRhListCarouselView.Callbacks
    public void onChildListClicked(UUID childListId) {
        Intrinsics.checkNotNullParameter(childListId, "childListId");
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_LIST_DETAIL, AnalyticsStrings.BUTTON_LIST_VIEW_CHILD, childListId.toString(), null, getCuratedListId().toString(), this.curatedListDisplayName, null, null, 200, null);
    }

    @Override // com.robinhood.android.lists.ui.rhlist.CuratedListRhListDetailView.Callbacks
    public void onSortControlButtonClicked(SortOption currentSortOption, boolean isFuturesOnlyList) {
        Intrinsics.checkNotNullParameter(currentSortOption, "currentSortOption");
        showSortOrderBottomSheet(currentSortOption, isFuturesOnlyList);
    }

    @Override // com.robinhood.android.lists.ui.rhlist.CuratedListRhListDetailView.Callbacks
    public void onFilterChipClicked(CuratedListRhListViewState.Filter filterChip) {
        Intrinsics.checkNotNullParameter(filterChip, "filterChip");
        getDuxo().clickFilterChip(filterChip);
    }

    @Override // com.robinhood.android.lists.ui.rhlist.CuratedListRhListDetailView.Callbacks
    public void onFilterChipTooltipClicked(CuratedListRhListViewState.Filter filterChip) {
        Intrinsics.checkNotNullParameter(filterChip, "filterChip");
        getDuxo().clickFilterChipTooltip(filterChip);
    }

    @Override // com.robinhood.android.lists.ui.rhlist.CuratedListRhListDetailView.Callbacks
    public void onFilterChipTooltipAppear(CuratedListRhListViewState.Filter filterChip) {
        Intrinsics.checkNotNullParameter(filterChip, "filterChip");
        getDuxo().onFilterChipTooltipAppear(filterChip);
    }

    @Override // com.robinhood.shared.portfolio.lists.p391ui.sort.CuratedListSortCallbacks
    public void onSortOptionSelected(SortOption sortOption) {
        String str;
        Intrinsics.checkNotNullParameter(sortOption, "sortOption");
        if (sortOption.getSortDirection() == ApiCuratedList.SortDirection.EMPTY) {
            str = "custom";
        } else {
            str = SortOrders.getAnalyticsString(sortOption.getSortOrder()) + "_" + SortDirections.getAnalyticsString(sortOption.getSortDirection());
        }
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_LDP_SORT, str, null, null, getCuratedListId().toString(), this.curatedListDisplayName, this.analyticsTag, null, EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE, null);
        getDuxo().sortList(sortOption);
    }

    @Override // com.robinhood.android.lists.ui.CuratedListAdapter.Callbacks
    public void onInstrumentRowClicked(final UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_LIST_DETAIL, "view_sdp", instrumentId.toString(), null, getCuratedListId().toString(), this.curatedListDisplayName, this.analyticsTag, null, 136, null);
        Observable observableTake = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListFragment.onInstrumentRowClicked.1
            @Override // io.reactivex.functions.Function
            public final List<UUID> apply(CuratedListRhListViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getCuratedListInstrumentItemsIds();
            }
        }).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListRhListFragment.onInstrumentRowClicked$lambda$30(this.f$0, instrumentId, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInstrumentRowClicked$lambda$30(CuratedListRhListFragment curatedListRhListFragment, UUID uuid, List list) {
        Navigator navigator = curatedListRhListFragment.getNavigator();
        android.content.Context contextRequireContext = curatedListRhListFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Intrinsics.checkNotNull(list);
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new LegacyFragmentKey.EquityInstrumentDetail(uuid, list, ((CuratedListKey.RhList) INSTANCE.getArgs((Fragment) curatedListRhListFragment)).getAccountNumber(), InstrumentDetailSource.CURATED_LIST_DETAIL, false, 16, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.lists.ui.CuratedListAdapter.Callbacks
    public void onCurrencyRowClicked(final UUID currencyPairId) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_LIST_DETAIL, "view_cdp", currencyPairId.toString(), null, getCuratedListId().toString(), this.curatedListDisplayName, this.analyticsTag, null, 136, null);
        Observable observableTake = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListFragment.onCurrencyRowClicked.1
            @Override // io.reactivex.functions.Function
            public final List<UUID> apply(CuratedListRhListViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getCuratedListCurrencyPairIds();
            }
        }).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListFragment$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListRhListFragment.onCurrencyRowClicked$lambda$31(this.f$0, currencyPairId, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCurrencyRowClicked$lambda$31(CuratedListRhListFragment curatedListRhListFragment, UUID uuid, List list) {
        Navigator navigator = curatedListRhListFragment.getNavigator();
        android.content.Context contextRequireContext = curatedListRhListFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Intrinsics.checkNotNull(list);
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new CryptoDetailFragmentKey(uuid, list, false, null, null, null, 60, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.lists.ui.CuratedListAdapter.Callbacks
    public void onFuturesRowClicked(UUID contractId) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new FuturesDetailFragmentKey.ByContractId(contractId, getEventScreen(), null, 4, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
    }

    @Override // com.robinhood.android.lists.ui.CuratedListAdapter.Callbacks
    public void onIndexRowClicked(UUID indexId) {
        Intrinsics.checkNotNullParameter(indexId, "indexId");
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new IndexDetailPageFragmentKey(indexId, ((CuratedListKey.RhList) INSTANCE.getArgs((Fragment) this)).getAccountNumber(), IndexDetailPageFragmentKey2.RhList.INSTANCE), false, false, false, null, false, null, false, false, null, null, 4092, null);
    }

    @Override // com.robinhood.android.lists.ui.CuratedListAdapter.Callbacks
    public void onQuoteClicked() {
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_LIST_DETAIL, AnalyticsStrings.BUTTON_LIST_EDIT_LISTS_DETAIL_PAGE_DISPLAY_DATA, null, null, getCuratedListId().toString(), this.curatedListDisplayName, this.analyticsTag, null, EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE, null);
        ViewModeSelectionBottomSheetFragment viewModeSelectionBottomSheetFragment = (ViewModeSelectionBottomSheetFragment) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.newInstance$default(ViewModeSelectionBottomSheetFragment.INSTANCE, new ViewModeSelectionBottomSheetFragment.Args(ViewModeSelectionType.CuratedList.INSTANCE, getCuratedListId(), this.curatedListDisplayName), this, 0, 4, null);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        viewModeSelectionBottomSheetFragment.show(parentFragmentManager, "viewModeBottomSheet");
    }

    @Override // com.robinhood.android.lists.ui.CuratedListAdapter.Callbacks
    public void onFuturesQuoteClicked() {
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_LIST_DETAIL, AnalyticsStrings.BUTTON_LIST_EDIT_LISTS_DETAIL_PAGE_DISPLAY_DATA, null, null, getCuratedListId().toString(), this.curatedListDisplayName, this.analyticsTag, null, EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE, null);
        ViewModeSelectionBottomSheetFragment viewModeSelectionBottomSheetFragment = (ViewModeSelectionBottomSheetFragment) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.newInstance$default(ViewModeSelectionBottomSheetFragment.INSTANCE, new ViewModeSelectionBottomSheetFragment.Args(ViewModeSelectionType.FuturesCuratedRhList.INSTANCE, getCuratedListId(), this.curatedListDisplayName), this, 0, 4, null);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        viewModeSelectionBottomSheetFragment.show(parentFragmentManager, "viewModeBottomSheet");
    }

    @Override // com.robinhood.viewmode.ViewModeSelectionBottomSheetFragment.Callbacks
    public void onCuratedListViewModeChange(SecurityViewMode viewMode, UUID listId, String listDisplayName) {
        Intrinsics.checkNotNullParameter(viewMode, "viewMode");
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(listDisplayName, "listDisplayName");
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_LIST_DETAIL, SecurityViewModes.getAnalyticsButtonTitle(viewMode), null, null, listId.toString(), listDisplayName, this.analyticsTag, null, EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE, null);
    }

    @Override // com.robinhood.android.lists.ui.ipo.CuratedListIpoAccessFilterView.Callbacks
    public void onIpoAccessFilterChanged(CuratedListRhListViewState6 ipoAccessFilter) {
        Intrinsics.checkNotNullParameter(ipoAccessFilter, "ipoAccessFilter");
        getDuxo().setIpoAccessFilter(ipoAccessFilter);
    }

    @Override // com.robinhood.android.lists.ui.ipo.CuratedListIpoAccessInstrumentCarousel.Callbacks
    public void onIpoAccessInstrumentAppear(CuratedListEligible curatedListEligible) {
        String str;
        Intrinsics.checkNotNullParameter(curatedListEligible, "curatedListEligible");
        IpoAccessStatus ipoAccessStatus = curatedListEligible.getCuratedListItem().getIpoAccessStatus();
        switch (ipoAccessStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$0[ipoAccessStatus.ordinal()]) {
            case -1:
            case 4:
            case 5:
            case 6:
            case 7:
                str = AnalyticsStrings.BUTTON_LIST_VIEW_IPO_SUMMARY;
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
            case 2:
            case 3:
                str = "view_sdp";
                break;
        }
        String str2 = str;
        UUID id = curatedListEligible.getId();
        LogOnceAnalytics logOnceAnalytics = getLogOnceAnalytics();
        String string2 = id.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        LogOnceAnalytics.logButtonGroupAppear$default(logOnceAnalytics, AnalyticsStrings.BUTTON_GROUP_LIST_DETAIL, str2, string2, id.toString(), null, getCuratedListId().toString(), this.curatedListDisplayName, this.analyticsTag, 16, null);
    }

    @Override // com.robinhood.android.lists.ui.ipo.CuratedListIpoAccessInstrumentCard.Callbacks
    public void onIpoAccessInstrumentClicked(CuratedListEligible curatedListEligible) {
        Intrinsics.checkNotNullParameter(curatedListEligible, "curatedListEligible");
        UUID id = curatedListEligible.getId();
        IpoAccessStatus ipoAccessStatus = curatedListEligible.getCuratedListItem().getIpoAccessStatus();
        switch (ipoAccessStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$0[ipoAccessStatus.ordinal()]) {
            case -1:
            case 4:
            case 5:
            case 6:
            case 7:
                AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_LIST_DETAIL, AnalyticsStrings.BUTTON_LIST_VIEW_IPO_SUMMARY, id.toString(), null, getCuratedListId().toString(), this.curatedListDisplayName, this.analyticsTag, null, 136, null);
                Navigator navigator = getNavigator();
                android.content.Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new LegacyIntentKey.DirectIpoSummary(id), null, false, null, null, 60, null);
                return;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
            case 2:
            case 3:
                onInstrumentRowClicked(id);
                return;
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return this.screenName;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenDescription() {
        return this.screenDescription;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getEntityId() {
        String string2 = getCuratedListId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(CuratedListRhListViewState state) throws Resources.NotFoundException {
        bindLoading(state);
        bindListError(state);
        bindListItemsError(state);
        bindEmpty(state);
        if (state.getCuratedList() != null) {
            RhToolbar rhToolbar = getRhToolbar();
            Intrinsics.checkNotNull(rhToolbar);
            rhToolbar.setTitle(state.getToolbarTitle());
            this.curatedListDisplayName = state.getCuratedList().getDisplayName();
            bindHeader(state);
            bindRelatedListCarousel(state);
            bindIpoAccessFilter(state);
            bindCuratedListItems(state);
            bindCuratedListIpoAccessItems(state);
            bindDisclosureText(state);
            updateMenuItems(state);
            consumeUiEvents(state);
        }
    }

    private final void bindLoading(CuratedListRhListViewState state) {
        this.loadingAdapter.setData(state.getShowLoading() ? Unit.INSTANCE : null);
    }

    private final void bindListError(CuratedListRhListViewState state) {
        this.listErrorStateAdapter.setData(state.getShowListError() ? Unit.INSTANCE : null);
    }

    private final void bindListItemsError(CuratedListRhListViewState state) {
        this.listItemsErrorStateAdapter.setData(state.getShowListItemError() ? Unit.INSTANCE : null);
    }

    private final void bindHeader(CuratedListRhListViewState state) {
        this.rhListHeaderAdapter.setData(state.getHeaderState());
        this.ipoAccessHeaderAdapter.setData(state.getIpoHeaderState());
    }

    private final void bindRelatedListCarousel(CuratedListRhListViewState state) {
        this.relatedListCarouselAdapter.setData(state.getShowRelatedListCarousel() ? state.getRelatedListCarouselState() : null);
    }

    private final void bindRhListDetails(boolean showRhListDetail, boolean showStickyView, CuratedListRhListDetailView.State.Data data) {
        this.rhListDetailAdapter.setData(showRhListDetail ? new CuratedListRhListDetailView.State(data, !showStickyView) : null);
        getStickyRhListDetailView().bind(new CuratedListRhListDetailView.State(data, showStickyView));
        getStickyRhListDetailView().setVisibility(showStickyView ? 0 : 8);
        getDuxo().toggleMenuOptionVisibility(!showStickyView);
    }

    private final void bindIpoAccessFilter(CuratedListRhListViewState state) {
        this.ipoAccessFilterAdapter.setData(state.getSelectedIpoAccessFilter());
    }

    private final void bindCuratedListItems(final CuratedListRhListViewState state) {
        CuratedListAdapter curatedListAdapter = this.curatedListAdapter;
        CuratedListAdapter curatedListAdapter2 = null;
        if (curatedListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("curatedListAdapter");
            curatedListAdapter = null;
        }
        curatedListAdapter.setInEditMode(false);
        CuratedListAdapter curatedListAdapter3 = this.curatedListAdapter;
        if (curatedListAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("curatedListAdapter");
        } else {
            curatedListAdapter2 = curatedListAdapter3;
        }
        curatedListAdapter2.submitList(state.getVisibleCuratedListItems(), new Runnable() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListFragment.bindCuratedListItems.1
            @Override // java.lang.Runnable
            public final void run() {
                CuratedListRhListFragment.this.bindShowAllView(state);
            }
        });
    }

    private final void bindIacInfoBanner(IacInfoBanner banner) {
        this.infoBannerAdapter.setData(banner);
    }

    private final void bindCuratedListIpoAccessItems(CuratedListRhListViewState state) {
        this.ipoAccessEmptyStateAdapter.setData(state.getIpoAccessEmptyState());
        SingleItemAdapter<CuratedListIpoAccessInstrumentCarousel, List<CuratedListEligible>> singleItemAdapter = this.ipoAccessInstrumentCarouselAdapter;
        List<CuratedListEligible> visibleIpoAccessCuratedItems = state.getVisibleIpoAccessCuratedItems();
        if (visibleIpoAccessCuratedItems != null) {
            List<CuratedListEligible> list = visibleIpoAccessCuratedItems;
            list = list.isEmpty() ? null : list;
        }
        singleItemAdapter.setData(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindShowAllView(CuratedListRhListViewState state) {
        this.showAllItemsAdapter.setData(state.getShowAllItemsRowData());
    }

    private final void bindEmpty(CuratedListRhListViewState state) {
        this.emptyStateAdapter.setData(state.getShowEmpty() ? Unit.INSTANCE : null);
    }

    private final void consumeUiEvents(CuratedListRhListViewState state) throws Resources.NotFoundException {
        UUID uuidConsume;
        Throwable thConsume;
        String string2;
        Boolean boolConsume;
        Throwable thConsume2;
        String string3;
        UiEvent<Throwable> updatedListErrorEvent = state.getUpdatedListErrorEvent();
        if (updatedListErrorEvent != null && (thConsume2 = updatedListErrorEvent.consume()) != null) {
            ErrorResponse errorResponseExtractErrorResponse = NetworkThrowables.extractErrorResponse(thConsume2);
            GenericErrorResponse genericErrorResponse = errorResponseExtractErrorResponse instanceof GenericErrorResponse ? (GenericErrorResponse) errorResponseExtractErrorResponse : null;
            if (genericErrorResponse == null || (string3 = genericErrorResponse.getDisplayErrorText()) == null) {
                string3 = getString(C11048R.string.general_error_unable_to_save_changes);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            }
            showSnackbar$default(this, string3, 0, 2, (Object) null);
        }
        UiEvent<Boolean> followSuccessEvent = state.getFollowSuccessEvent();
        if (followSuccessEvent != null && (boolConsume = followSuccessEvent.consume()) != null) {
            int i = boolConsume.booleanValue() ? C20839R.string.lists_follow_success : C20839R.string.lists_unfollow_success;
            Resources resources = getResources();
            CuratedList curatedList = state.getCuratedList();
            Intrinsics.checkNotNull(curatedList);
            String string4 = resources.getString(i, curatedList.getDisplayName());
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            showSnackbar$default(this, HtmlCompat.fromHtml$default(string4, 0, 2, null), 0, 2, (Object) null);
        }
        UiEvent<Throwable> followErrorEvent = state.getFollowErrorEvent();
        if (followErrorEvent != null && (thConsume = followErrorEvent.consume()) != null) {
            ErrorResponse errorResponseExtractErrorResponse2 = NetworkThrowables.extractErrorResponse(thConsume);
            GenericErrorResponse genericErrorResponse2 = errorResponseExtractErrorResponse2 instanceof GenericErrorResponse ? (GenericErrorResponse) errorResponseExtractErrorResponse2 : null;
            if (genericErrorResponse2 == null || (string2 = genericErrorResponse2.getDisplayErrorText()) == null) {
                string2 = getString(C20839R.string.something_went_wrong);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            }
            showSnackbar$default(this, SpannableString.valueOf(string2), 0, 2, (Object) null);
        }
        UiEvent<Unit> showIpoNotificationBottomSheetEvent = state.getShowIpoNotificationBottomSheetEvent();
        if ((showIpoNotificationBottomSheetEvent != null ? showIpoNotificationBottomSheetEvent.consume() : null) != null) {
            IpoNotificationSettingBottomSheet ipoNotificationSettingBottomSheetNewInstance = IpoNotificationSettingBottomSheet.INSTANCE.newInstance();
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            ipoNotificationSettingBottomSheetNewInstance.show(childFragmentManager, "ipoListNotificationBottomSheet");
        }
        UiEvent<Unit> showIpoAccessOnboardingEvent = state.getShowIpoAccessOnboardingEvent();
        if ((showIpoAccessOnboardingEvent != null ? showIpoAccessOnboardingEvent.consume() : null) != null) {
            Navigator navigator = getNavigator();
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, LegacyIntentKey.DirectIpoOnboarding.INSTANCE, null, false, null, null, 60, null);
        }
        UiEvent<UUID> showIpoAnnouncementEvent = state.getShowIpoAnnouncementEvent();
        if (showIpoAnnouncementEvent == null || (uuidConsume = showIpoAnnouncementEvent.consume()) == null) {
            return;
        }
        Navigator navigator2 = getNavigator();
        android.content.Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator2, contextRequireContext2, new HostIntentKey.ShowFragmentInStandaloneRdsActivity(new LegacyFragmentKey.IpoAnnouncement(uuidConsume), false, false, false, false, false, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), null, false, null, null, 60, null);
    }

    static /* synthetic */ void showSnackbar$default(CuratedListRhListFragment curatedListRhListFragment, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = -1;
        }
        curatedListRhListFragment.showSnackbar(charSequence, i);
    }

    private final void showSnackbar(CharSequence message, int duration) {
        View viewFindViewById = requireActivity().findViewById(C11048R.id.snackbar_container);
        if (viewFindViewById == null) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            Snackbars.show(fragmentActivityRequireActivity, message, duration);
        } else {
            Snackbar snackbarMake = Snackbar.make(viewFindViewById, message, duration);
            Intrinsics.checkNotNullExpressionValue(snackbarMake, "make(...)");
            snackbarMake.setAnchorView(viewFindViewById);
            snackbarMake.show();
        }
    }

    static /* synthetic */ void showSnackbar$default(CuratedListRhListFragment curatedListRhListFragment, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = -1;
        }
        curatedListRhListFragment.showSnackbar(str, i);
    }

    private final void showSnackbar(String message, int duration) {
        View viewFindViewById = requireActivity().findViewById(C11048R.id.snackbar_container);
        if (viewFindViewById == null) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            Snackbars.show(fragmentActivityRequireActivity, message, duration);
        } else {
            Snackbar snackbarMake = Snackbar.make(viewFindViewById, message, duration);
            Intrinsics.checkNotNullExpressionValue(snackbarMake, "make(...)");
            snackbarMake.setAnchorView(viewFindViewById);
            snackbarMake.show();
        }
    }

    private final void updateMenuItems(CuratedListRhListViewState state) {
        MenuItem menuItem;
        MenuItem menuItem2;
        MenuItem menuItem3 = this.menuItemFollowList;
        if (menuItem3 == null || (menuItem = this.menuItemUnfollowList) == null || (menuItem2 = this.menuItemLoading) == null) {
            return;
        }
        menuItem3.setVisible(state.getShowFollowListMenuOption());
        menuItem.setVisible(state.getShowUnfollowListMenuOption());
        menuItem2.setVisible(state.getShowLoadingListMenuOption());
        Object icon = menuItem2.getIcon();
        Intrinsics.checkNotNull(icon, "null cannot be cast to non-null type android.graphics.drawable.Animatable");
        Animatable animatable = (Animatable) icon;
        if (state.getShowLoadingListMenuOption()) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    private final void bindDisclosureText(CuratedListRhListViewState state) {
        SpannableString spannableString$default;
        RichText preview;
        SingleItemAdapter<View, CharSequence> singleItemAdapter = this.disclosureAdapter;
        ListDisclosure disclosure = state.getDisclosure();
        if (disclosure == null || (preview = disclosure.getPreview()) == null) {
            spannableString$default = null;
        } else {
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            spannableString$default = RichTexts.toSpannableString$default(preview, contextRequireContext, null, true, null, 10, null);
        }
        singleItemAdapter.setData(spannableString$default);
    }

    private final void showSortOrderBottomSheet(SortOption currentSortOption, boolean isFuturesOnlyList) {
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_LIST_DETAIL, AnalyticsStrings.BUTTON_LIST_SORT, null, null, getCuratedListId().toString(), this.curatedListDisplayName, this.analyticsTag, null, EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE, null);
        CuratedListSortItemsBottomSheetFragment.Companion companion = CuratedListSortItemsBottomSheetFragment.INSTANCE;
        UUID curatedListId = getCuratedListId();
        String str = this.curatedListDisplayName;
        Intrinsics.checkNotNull(str);
        CuratedListSortItemsBottomSheetFragment curatedListSortItemsBottomSheetFragment = (CuratedListSortItemsBottomSheetFragment) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.newInstance$default(companion, new CuratedListSortItemsBottomSheetFragment.Args(currentSortOption, curatedListId, str, this.analyticsTag, isFuturesOnlyList), this, 0, 4, null);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        curatedListSortItemsBottomSheetFragment.show(parentFragmentManager, "listItemSortBottomSheet");
    }

    private final void logListItemAppear(CuratedListEligible item) {
        String str;
        String string2 = item.getCuratedListItem().getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        if (item instanceof InstrumentCuratedListEligible) {
            str = "view_sdp";
        } else if (item instanceof CryptoCuratedListEligible) {
            str = "view_cdp";
        } else if (item instanceof OptionStrategyCuratedListEligible) {
            str = "view_odp";
        } else if (item instanceof FuturesCuratedListEligible) {
            str = AnalyticsStrings.BUTTON_LIST_VIEW_FUTURES_DETAIL;
        } else {
            if (!(item instanceof IndexCuratedListEligible)) {
                throw new NoWhenBranchMatchedException();
            }
            str = AnalyticsStrings.BUTTON_LIST_VIEW_INDEX_DETAIL;
        }
        LogOnceAnalytics.logButtonGroupAppear$default(getLogOnceAnalytics(), AnalyticsStrings.BUTTON_GROUP_LIST_DETAIL, str, string2, string2, null, getCuratedListId().toString(), this.curatedListDisplayName, this.analyticsTag, 16, null);
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
    public void onDismissInfoBanner(IacInfoBanner banner) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        getDuxo().dismissInfoBanner(banner.getReceiptUuid());
    }

    /* compiled from: CuratedListRhListFragment.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/common/contracts/CuratedListKey$RhList;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListFragment;", "<init>", "()V", "SCREEN_NAME_DEFAULT", "", "PROTOBUF_SCREEN", "Lcom/robinhood/rosetta/eventlogging/Screen;", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<CuratedListKey.RhList>, FragmentWithArgsCompanion<CuratedListRhListFragment, CuratedListKey.RhList> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public CuratedListKey.RhList getArgs(CuratedListRhListFragment curatedListRhListFragment) {
            return (CuratedListKey.RhList) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, curatedListRhListFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CuratedListRhListFragment newInstance(CuratedListKey.RhList rhList) {
            return (CuratedListRhListFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, rhList);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CuratedListRhListFragment curatedListRhListFragment, CuratedListKey.RhList rhList) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, curatedListRhListFragment, rhList);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(CuratedListKey.RhList key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return newInstance((Parcelable) key);
        }
    }
}
