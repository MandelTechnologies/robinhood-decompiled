package com.robinhood.android.optionschain;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.ViewCompositionStrategy;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.rxjava2.RxJava2Adapter;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultCaller;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.jakewharton.rxbinding3.viewpager2.RxViewPager2;
import com.jakewharton.rxbinding3.widget.RxRadioGroup;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.options.OptionDefaultPricingState;
import com.robinhood.android.common.options.extensions.Instants2;
import com.robinhood.android.common.options.upsell.fridaytrading.FridayTradingDialogFragment;
import com.robinhood.android.common.options.upsell.fridaytrading.OptionDiscoverZeroDteBottomSheetFragment;
import com.robinhood.android.common.options.upsell.fridaytrading.OptionDiscoverZeroDteSnackbarHelper;
import com.robinhood.android.common.options.upsell.watchlist.OptionDoubleTapToWatchBottomSheetFragment;
import com.robinhood.android.common.p088ui.BaseRhBottomSheetDialogHostFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.daynight.DayNightChanges;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.common.util.transition.Interpolators;
import com.robinhood.android.common.util.transition.SimpleSlide;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.designsystem.tooltip.RdsTooltipView;
import com.robinhood.android.lists.options.OptionsListsQuickAddFragment;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.ReturnedData;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.optionchain.OptionChainExpirationPageCallbacks;
import com.robinhood.android.optionchain.SupportOptionOrderFilter;
import com.robinhood.android.optionchain.chainsettings.OptionChainCustomizationErrorEvent;
import com.robinhood.android.optionchain.chainsettings.OptionChainCustomizationSnackbarHelper;
import com.robinhood.android.optionchain.tooltips.IndexOptionsTooltip;
import com.robinhood.android.optionchain.tooltips.OptionChainTooltipView;
import com.robinhood.android.optionchain.tooltips.SwitchFocusedToSbsTooltip;
import com.robinhood.android.options.contracts.InternalOptionChainFragmentKey;
import com.robinhood.android.options.contracts.OptionChainLaunchMode;
import com.robinhood.android.options.contracts.OptionOrderIntentKey;
import com.robinhood.android.options.contracts.OptionStatisticsFragmentKey;
import com.robinhood.android.options.tradability.expiration.OptionChainExpirationDateState;
import com.robinhood.android.optionschain.OptionChainFragment;
import com.robinhood.android.optionschain.OptionChainListView;
import com.robinhood.android.optionschain.OptionChainListViewState;
import com.robinhood.android.optionschain.OptionChainViewState;
import com.robinhood.android.optionschain.OptionContractRowView;
import com.robinhood.android.optionschain.OptionDetailNoMarketdataBottomSheet;
import com.robinhood.android.optionschain.OptionSideBySideUpsellBottomSheetFragment;
import com.robinhood.android.optionschain.OptionStrategyBuilderView;
import com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetScaffoldKt;
import com.robinhood.android.optionschain.databinding.FragmentOptionChainBinding;
import com.robinhood.android.optionschain.rolling.OptionChainRollingHeaderView;
import com.robinhood.android.optionschain.sbschain.table.BidAskCellDisableType;
import com.robinhood.android.optionschain.strategybuilder.OptionStrategyBuilderAdapter2;
import com.robinhood.android.optionschain.view.OptionChainTooltipBanner;
import com.robinhood.android.optionschain.view.OptionChainTooltipBanner3;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.iac.alertsheet.BaseFragmentExtensions;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionOrderFilter;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p320db.OptionStrategyBuilder;
import com.robinhood.models.p320db.OptionTooltip;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p355ui.IacAlertSheet;
import com.robinhood.models.p355ui.OptionChainBundle;
import com.robinhood.models.p355ui.OptionConfigurationBundle;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.models.p355ui.OptionStatisticsTradableState;
import com.robinhood.models.p355ui.OptionWatchlistItemState;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionStrategyLegDisplay;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.ScarletOverlay;
import com.robinhood.shared.lists.quickadd.extensions.OptionStrategySecurity;
import com.robinhood.shared.settings.contracts.SettingsFragmentKey;
import com.robinhood.shared.settings.contracts.SettingsFragmentKey3;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.test.idler.TrackedListAdapter;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.GenericViewHolder;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.noties.markwon.Markwon;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples3;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import p479j$.time.Clock;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.chrono.ChronoLocalDate;
import timber.log.Timber;

/* compiled from: OptionChainFragment.kt */
@Metadata(m3635d1 = {"\u0000¼\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 µ\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0004¶\u0001µ\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001f\u0010\bJ\u000f\u0010 \u001a\u00020\u000bH\u0002¢\u0006\u0004\b \u0010\bJ\u000f\u0010!\u001a\u00020\u000bH\u0002¢\u0006\u0004\b!\u0010\bJ\u000f\u0010\"\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\"\u0010\bJ\u000f\u0010#\u001a\u00020\u000bH\u0003¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010,\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020)2\u0006\u0010+\u001a\u00020*H\u0003¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u0019\u00104\u001a\u00020\u000b2\b\u00103\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b4\u00105J!\u00108\u001a\u00020\u000b2\u0006\u00107\u001a\u0002062\b\u00103\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u000bH\u0016¢\u0006\u0004\b:\u0010\bJ\u000f\u0010;\u001a\u00020\u000bH\u0016¢\u0006\u0004\b;\u0010\bJ\u000f\u0010<\u001a\u00020\u000bH\u0016¢\u0006\u0004\b<\u0010\bJ\u0017\u0010?\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b?\u0010@J)\u0010E\u001a\u00020\u000b2\u0006\u0010A\u001a\u00020\u00152\u0006\u0010B\u001a\u00020\u00152\b\u0010D\u001a\u0004\u0018\u00010CH\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020\u000b2\u0006\u0010G\u001a\u00020CH\u0016¢\u0006\u0004\bH\u0010IJ\u0017\u0010L\u001a\u00020\u000b2\u0006\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bL\u0010MJ\u0017\u0010N\u001a\u00020\u000b2\u0006\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bN\u0010MJ\u0017\u0010O\u001a\u00020\u000b2\u0006\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bO\u0010MJ\u0017\u0010R\u001a\u00020\u000b2\u0006\u0010Q\u001a\u00020PH\u0016¢\u0006\u0004\bR\u0010SJ'\u0010W\u001a\u00020\u000b2\u0006\u0010K\u001a\u00020J2\u0006\u0010U\u001a\u00020T2\u0006\u0010V\u001a\u00020*H\u0016¢\u0006\u0004\bW\u0010XJ/\u0010^\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010Z\u001a\u00020Y2\u0006\u0010\\\u001a\u00020[2\u0006\u0010&\u001a\u00020]H\u0016¢\u0006\u0004\b^\u0010_J\u000f\u0010`\u001a\u00020\u000bH\u0016¢\u0006\u0004\b`\u0010\bJ\u000f\u0010a\u001a\u00020\u000bH\u0016¢\u0006\u0004\ba\u0010\bJ\u000f\u0010b\u001a\u00020\u000bH\u0016¢\u0006\u0004\bb\u0010\bJ!\u0010f\u001a\u00020\u000b2\b\u0010d\u001a\u0004\u0018\u00010c2\u0006\u0010e\u001a\u00020cH\u0016¢\u0006\u0004\bf\u0010gJ\u0017\u0010j\u001a\u00020\u000b2\u0006\u0010i\u001a\u00020hH\u0016¢\u0006\u0004\bj\u0010kJ\u0019\u0010n\u001a\u00020\u000b2\b\u0010m\u001a\u0004\u0018\u00010lH\u0016¢\u0006\u0004\bn\u0010oJ\u000f\u0010p\u001a\u00020\u000bH\u0016¢\u0006\u0004\bp\u0010\bJ\u0015\u0010r\u001a\u00020\u000b2\u0006\u0010q\u001a\u00020*¢\u0006\u0004\br\u0010sJ\u000f\u0010t\u001a\u00020\u000bH\u0016¢\u0006\u0004\bt\u0010\bJ\u000f\u0010u\u001a\u00020\u000bH\u0016¢\u0006\u0004\bu\u0010\bJ\u0010\u0010v\u001a\u00020*H\u0096\u0001¢\u0006\u0004\bv\u0010wR\"\u0010y\u001a\u00020x8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R)\u0010\u0080\u0001\u001a\u00020\u007f8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R!\u0010\u008b\u0001\u001a\u00030\u0086\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R!\u0010\u0091\u0001\u001a\u00030\u008c\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R!\u0010\u0096\u0001\u001a\u00030\u0092\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0093\u0001\u0010\u0088\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001c\u0010\u0098\u0001\u001a\u00070\u0097\u0001R\u00020\u00008\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001a\u0010\u009b\u0001\u001a\u00030\u009a\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R'\u0010\u009f\u0001\u001a\u0012\u0012\r\u0012\u000b \u009e\u0001*\u0004\u0018\u00010C0C0\u009d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u001c\u0010¢\u0001\u001a\u0005\u0018\u00010¡\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R\u001a\u0010¥\u0001\u001a\u00030¤\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R'\u0010§\u0001\u001a\u0012\u0012\r\u0012\u000b \u009e\u0001*\u0004\u0018\u00010C0C0\u009d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0001\u0010 \u0001R'\u0010¨\u0001\u001a\u0012\u0012\r\u0012\u000b \u009e\u0001*\u0004\u0018\u00010C0C0\u009d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010 \u0001R\u001c\u0010ª\u0001\u001a\u0005\u0018\u00010©\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R\u0018\u0010¯\u0001\u001a\u00030¬\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u00ad\u0001\u0010®\u0001R\u001f\u0010´\u0001\u001a\n\u0012\u0005\u0012\u00030±\u00010°\u00018\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b²\u0001\u0010³\u0001¨\u0006º\u0001²\u0006\u000f\u0010·\u0001\u001a\u0004\u0018\u00010c8\nX\u008a\u0084\u0002²\u0006\u0010\u0010¹\u0001\u001a\u0005\u0018\u00010¸\u00018\nX\u008a\u0084\u0002²\u0006\u000e\u0010¥\u0001\u001a\u00030¤\u00018\nX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionChainFragment;", "Lcom/robinhood/android/common/ui/BaseRhBottomSheetDialogHostFragment;", "Lcom/robinhood/android/optionschain/OptionChainListView$Callbacks;", "Lcom/robinhood/android/optionschain/OptionContractRowView$Callbacks;", "Lcom/robinhood/android/optionschain/OptionStrategyBuilderView$Callbacks;", "Lcom/robinhood/android/common/options/upsell/fridaytrading/OptionDiscoverZeroDteBottomSheetFragment$Callbacks;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "Lcom/robinhood/models/db/OptionInstrument;", "optionInstrument", "", "jumpToExpirationDateAfterOptionInstrument", "(Lcom/robinhood/models/db/OptionInstrument;)V", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/ui/UiOptionStrategyLegDisplay;", "targetLegs", "jumpToOptionInstrument", "(Lkotlinx/collections/immutable/ImmutableList;)V", "Ljava/math/BigDecimal;", "targetStrikePrice", "", "pageIndex", "jumpToStrikePrice", "(Ljava/math/BigDecimal;I)V", "jumpToExpirationPageIndex", "(I)V", "Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;", "expirationPage", "jumpToExpirationPage", "(Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;)V", "startHeaderAnimation", "showCustomizationPage", "setupComposeOverlay", "destroyComposeOverlay", "BottomSheetOverlay", "(Landroidx/compose/runtime/Composer;I)V", "Lcom/robinhood/android/optionschain/OptionChainToolbarState;", "state", "bindToolbar", "(Lcom/robinhood/android/optionschain/OptionChainToolbarState;)V", "Lcom/robinhood/android/optionschain/OptionChainToolbarMenuState;", "", "shouldDismissSelloutSnackbar", "ToolbarMenuComposable", "(Lcom/robinhood/android/optionschain/OptionChainToolbarMenuState;ZLandroidx/compose/runtime/Composer;I)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "onResume", "onDestroy", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "toolbar", "configureToolbar", "(Lcom/robinhood/android/common/ui/view/RhToolbar;)V", "requestCode", "resultCode", "Landroid/content/Intent;", WebsocketGatewayConstants.DATA_KEY, "onActivityResult", "(IILandroid/content/Intent;)V", "intent", "launchIntentForResult", "(Landroid/content/Intent;)V", "Lcom/robinhood/models/ui/OptionLegBundle;", "optionLegBundle", "onMultiLegAdd", "(Lcom/robinhood/models/ui/OptionLegBundle;)V", "onMultiLegRemove", "onLaunchSingleLegOrder", "j$/time/Instant", "selloutTime", "showTradeOnExpirationAfterSelloutDialog", "(Lj$/time/Instant;)V", "Lcom/robinhood/models/ui/OptionStatisticsTradableState;", "tradableState", "hasMarketdata", "onLaunchStatisticsDetail", "(Lcom/robinhood/models/ui/OptionLegBundle;Lcom/robinhood/models/ui/OptionStatisticsTradableState;Z)V", "Lcom/robinhood/models/db/OrderSide;", "side", "Lcom/robinhood/models/ui/UiOptionChain;", "uiOptionChain", "Lcom/robinhood/models/ui/OptionWatchlistItemState;", "onWatchlistAddOrRemove", "(Lcom/robinhood/models/db/OptionInstrument;Lcom/robinhood/models/db/OrderSide;Lcom/robinhood/models/ui/UiOptionChain;Lcom/robinhood/models/ui/OptionWatchlistItemState;)V", "showWatchlistAddOrRemovePcoErrorDialog", "dismissSwitchFocusedToSbsTooltip", "showDoubleTapToWatchUpsell", "", "optionLevel", "chainIdsForLogging", "showSbsChainUpsell", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/robinhood/models/ui/IacAlertSheet;", "iacAlertSheet", "showIacAlertSheet", "(Lcom/robinhood/models/ui/IacAlertSheet;)V", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "underlyingType", "showDiscoverZeroDteBottomSheet", "(Lcom/robinhood/models/db/OptionChain$UnderlyingType;)V", "turnOnTradeOnExpirationSetting", "isOnboardingSearchSelectorVisible", "setupToolbar", "(Z)V", "onSelloutSnackbarDismissed", "onSelloutSnackbarTimerStarted", "onDismissUnsupportedFeatureDialog", "()Z", "Lio/noties/markwon/Markwon;", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "j$/time/Clock", Card.Icon.CLOCK, "Lj$/time/Clock;", "getClock", "()Lj$/time/Clock;", "setClock", "(Lj$/time/Clock;)V", "Lcom/robinhood/android/optionchain/OptionChainExpirationPageCallbacks;", "expirationPageCallbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getExpirationPageCallbacks", "()Lcom/robinhood/android/optionchain/OptionChainExpirationPageCallbacks;", "expirationPageCallbacks", "Lcom/robinhood/android/optionschain/OptionChainDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "getDuxo", "()Lcom/robinhood/android/optionschain/OptionChainDuxo;", "duxo", "Lcom/robinhood/android/optionschain/databinding/FragmentOptionChainBinding;", "binding$delegate", "getBinding", "()Lcom/robinhood/android/optionschain/databinding/FragmentOptionChainBinding;", "binding", "Lcom/robinhood/android/optionschain/OptionChainFragment$OptionChainAdapter;", "adapter", "Lcom/robinhood/android/optionschain/OptionChainFragment$OptionChainAdapter;", "Lcom/google/android/material/tabs/TabLayoutMediator;", "tabLayoutMediator", "Lcom/google/android/material/tabs/TabLayoutMediator;", "Landroidx/activity/result/ActivityResultLauncher;", "kotlin.jvm.PlatformType", "strategyBuilderLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "listRecycledViewPool", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "Lcom/robinhood/android/common/options/OptionDefaultPricingState;", "defaultPricingState", "Lcom/robinhood/android/common/options/OptionDefaultPricingState;", "pricingSettingsLauncher", "optionOrderLauncher", "Landroidx/compose/ui/platform/ComposeView;", "toolbarView", "Landroidx/compose/ui/platform/ComposeView;", "Lcom/robinhood/android/lists/options/OptionsListsQuickAddFragment;", "getOptionsListsQuickAddFragment", "()Lcom/robinhood/android/lists/options/OptionsListsQuickAddFragment;", "optionsListsQuickAddFragment", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "requiresRegionGates", "Companion", "OptionChainAdapter", "accountNumber", "Lcom/robinhood/android/optionschain/OptionChainViewState$ShoppingCartConfigData;", "shoppingCartConfigData", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionChainFragment extends BaseRhBottomSheetDialogHostFragment implements OptionChainListView.Callbacks, OptionContractRowView.Callbacks, OptionStrategyBuilderView.Callbacks, OptionDiscoverZeroDteBottomSheetFragment.Callbacks, RegionGated {
    public static final String FT_SELLOUT_REMINDER_TAG = "friday_trading_sellout_reminder";
    public static final int OPTION_ORDER_REQUEST_CODE = 1;
    public static final String OPTION_STATISTICS_NO_MARKETDATA_TAG = "option_statistics_no_marketdata";
    private static final int OPTION_STATISTICS_REQUEST_CODE = 123;
    public static final int VIEW_TYPE_BUILDER_PAGE = 3;
    public static final int VIEW_TYPE_OPTION_EXPIRATION_DATE_PAGE = 2;
    private final /* synthetic */ RegionGated2 $$delegate_0;
    private final OptionChainAdapter adapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public Clock clock;
    private OptionDefaultPricingState defaultPricingState;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: expirationPageCallbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 expirationPageCallbacks;
    private RecyclerView.RecycledViewPool listRecycledViewPool;
    public Markwon markwon;
    private final ActivityResultLauncher<Intent> optionOrderLauncher;
    private final ActivityResultLauncher<Intent> pricingSettingsLauncher;
    private final ActivityResultLauncher<Intent> strategyBuilderLauncher;
    private TabLayoutMediator tabLayoutMediator;
    private ComposeView toolbarView;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionChainFragment.class, "expirationPageCallbacks", "getExpirationPageCallbacks()Lcom/robinhood/android/optionchain/OptionChainExpirationPageCallbacks;", 0)), Reflection.property1(new PropertyReference1Impl(OptionChainFragment.class, "binding", "getBinding()Lcom/robinhood/android/optionschain/databinding/FragmentOptionChainBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OptionChainFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionWatchlistItemState.values().length];
            try {
                iArr[OptionWatchlistItemState.ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionWatchlistItemState.NOT_ADDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OptionWatchlistItemState.NOT_AVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomSheetOverlay$lambda$66(OptionChainFragment optionChainFragment, int i, Composer composer, int i2) {
        optionChainFragment.BottomSheetOverlay(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ToolbarMenuComposable$lambda$67(OptionChainFragment optionChainFragment, OptionChainToolbarMenuState optionChainToolbarMenuState, boolean z, int i, Composer composer, int i2) {
        optionChainFragment.ToolbarMenuComposable(optionChainToolbarMenuState, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String BottomSheetOverlay$lambda$61(SnapshotState4<String> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final OptionChainViewState.ShoppingCartConfigData BottomSheetOverlay$lambda$63(SnapshotState4<OptionChainViewState.ShoppingCartConfigData> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionDefaultPricingState BottomSheetOverlay$lambda$65(SnapshotState4<? extends OptionDefaultPricingState> snapshotState4) {
        return snapshotState4.getValue();
    }

    public OptionChainFragment() {
        super(C24135R.layout.fragment_option_chain);
        this.$$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);
        this.expirationPageCallbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(OptionChainExpirationPageCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.optionschain.OptionChainFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof OptionChainExpirationPageCallbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.duxo = OldDuxos.oldDuxo(this, OptionChainDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, OptionChainFragment$binding$2.INSTANCE);
        this.adapter = new OptionChainAdapter();
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.optionschain.OptionChainFragment$strategyBuilderLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.getResultCode() == -1) {
                    this.this$0.requireActivity().setResult(-1);
                    this.this$0.requireActivity().finish();
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.strategyBuilderLauncher = activityResultLauncherRegisterForActivityResult;
        this.defaultPricingState = OptionDefaultPricingState.NOT_AVAILABLE;
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.optionschain.OptionChainFragment$pricingSettingsLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.getResultCode() == -1) {
                    Intent data = result.getData();
                    Serializable serializableExtra = data != null ? data.getSerializableExtra(ReturnedData.EXTRA_RETURNED_DATA) : null;
                    if (serializableExtra == null || !(serializableExtra instanceof OptionSettings.DefaultPricingSetting)) {
                        return;
                    }
                    this.this$0.getDuxo().setDefaultPricingSetting((OptionSettings.DefaultPricingSetting) serializableExtra);
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "registerForActivityResult(...)");
        this.pricingSettingsLauncher = activityResultLauncherRegisterForActivityResult2;
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult3 = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.optionschain.OptionChainFragment$optionOrderLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.getResultCode() == -1) {
                    this.this$0.requireActivity().setResult(-1);
                    this.this$0.requireActivity().finish();
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult3, "registerForActivityResult(...)");
        this.optionOrderLauncher = activityResultLauncherRegisterForActivityResult3;
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

    public final Clock getClock() {
        Clock clock = this.clock;
        if (clock != null) {
            return clock;
        }
        Intrinsics.throwUninitializedPropertyAccessException(Card.Icon.CLOCK);
        return null;
    }

    public final void setClock(Clock clock) {
        Intrinsics.checkNotNullParameter(clock, "<set-?>");
        this.clock = clock;
    }

    private final OptionChainExpirationPageCallbacks getExpirationPageCallbacks() {
        return (OptionChainExpirationPageCallbacks) this.expirationPageCallbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OptionChainDuxo getDuxo() {
        return (OptionChainDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentOptionChainBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentOptionChainBinding) value;
    }

    private final OptionsListsQuickAddFragment getOptionsListsQuickAddFragment() {
        Fragment fragmentFindFragmentByTag = getParentFragmentManager().findFragmentByTag(OptionChainActivity.QUICK_ADD_TAG);
        Intrinsics.checkNotNull(fragmentFindFragmentByTag, "null cannot be cast to non-null type com.robinhood.android.lists.options.OptionsListsQuickAddFragment");
        return (OptionsListsQuickAddFragment) fragmentFindFragmentByTag;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        setHasOptionsMenu(true);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            getDuxo().logFragmentRecreated();
        }
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C240871(null));
    }

    /* compiled from: OptionChainFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainFragment$onCreate$1", m3645f = "OptionChainFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.OptionChainFragment$onCreate$1 */
    static final class C240871 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C240871(Continuation<? super C240871> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionChainFragment.this.new C240871(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C240871) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Flow<Boolean> flowChainNuxSearchDismissedFlow$feature_options_chain_externalDebug;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FragmentActivity activity = OptionChainFragment.this.getActivity();
                OptionChainActivity optionChainActivity = activity instanceof OptionChainActivity ? (OptionChainActivity) activity : null;
                if (optionChainActivity != null && (flowChainNuxSearchDismissedFlow$feature_options_chain_externalDebug = optionChainActivity.chainNuxSearchDismissedFlow$feature_options_chain_externalDebug()) != null) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionChainFragment.this, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowChainNuxSearchDismissedFlow$feature_options_chain_externalDebug, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: OptionChainFragment.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "dismissed", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainFragment$onCreate$1$1", m3645f = "OptionChainFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionschain.OptionChainFragment$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ OptionChainFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionChainFragment optionChainFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionChainFragment;
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
                    this.this$0.getDuxo().setNuxSearchDismissed(this.Z$0);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ScarletManager.putOverlay$default(getScarletManager(), OptionChainTransparentStatusBar.INSTANCE, null, 2, null);
        OptionChainLaunchMode launchMode = ((InternalOptionChainFragmentKey) INSTANCE.getArgs((Fragment) this)).getLaunchMode();
        if (launchMode instanceof OptionChainLaunchMode.RollingContractSelector) {
            getDuxo().logRollingContractSelectorAppear((OptionChainLaunchMode.RollingContractSelector) launchMode);
        }
        ViewPager2 viewPager2 = getBinding().viewpager;
        viewPager2.setAdapter(this.adapter);
        Intrinsics.checkNotNull(viewPager2);
        LifecycleHost.DefaultImpls.bind$default(this, RxViewPager2.pageSelections(viewPager2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new OptionChainFragment$onViewCreated$1$1(getDuxo()));
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(getBinding().tabLayout, getBinding().viewpager, false, new TabLayoutMediator.TabConfigurationStrategy() { // from class: com.robinhood.android.optionschain.OptionChainFragment.onViewCreated.2
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                Intrinsics.checkNotNullParameter(tab, "tab");
                if (OptionChainFragment.this.getContext() == null) {
                    return;
                }
                OptionChainViewState.OptionChainPage optionChainPage = OptionChainFragment.this.adapter.getCurrentList().get(i);
                Resources resources = OptionChainFragment.this.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                tab.setText(optionChainPage.getTabTitle(resources));
                Integer leadingTabIconImageRes = optionChainPage.getLeadingTabIconImageRes();
                if (leadingTabIconImageRes != null) {
                    Intrinsics.checkNotNull(tab.setIcon(leadingTabIconImageRes.intValue()));
                } else {
                    tab.setIcon((Drawable) null);
                }
                TabLayout.TabView tabView = tab.view;
                final OptionChainFragment optionChainFragment = OptionChainFragment.this;
                tabView.setOnClickListener(new View.OnClickListener() { // from class: com.robinhood.android.optionschain.OptionChainFragment.onViewCreated.2.1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        if (optionChainFragment.getDuxo().getStatesFlow().getValue().getIsOnBuilderPage()) {
                            return;
                        }
                        optionChainFragment.getDuxo().dismissSwitchFocusedToSbsTooltip();
                    }
                });
            }
        });
        this.tabLayoutMediator = tabLayoutMediator;
        tabLayoutMediator.attach();
        getBinding().viewpager.setPageTransformer(new ViewPager2.PageTransformer() { // from class: com.robinhood.android.optionschain.OptionChainFragment.onViewCreated.3
            @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
            public final void transformPage(View view2, float f) {
                Intrinsics.checkNotNullParameter(view2, "<unused var>");
            }
        });
        RadioGroup optionChainSideGroup = getBinding().optionChainSideGroup;
        Intrinsics.checkNotNullExpressionValue(optionChainSideGroup, "optionChainSideGroup");
        Observable<Integer> observableFilter = RxRadioGroup.checkedChanges(optionChainSideGroup).filter(new Predicate() { // from class: com.robinhood.android.optionschain.OptionChainFragment.onViewCreated.4
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Integer it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.intValue() > 0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFilter, "filter(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableFilter), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainFragment.onViewCreated$lambda$1(this.f$0, (Integer) obj);
            }
        });
        RadioGroup optionChainContractTypeGroup = getBinding().optionChainContractTypeGroup;
        Intrinsics.checkNotNullExpressionValue(optionChainContractTypeGroup, "optionChainContractTypeGroup");
        Observable<Integer> observableFilter2 = RxRadioGroup.checkedChanges(optionChainContractTypeGroup).filter(new Predicate() { // from class: com.robinhood.android.optionschain.OptionChainFragment.onViewCreated.6
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Integer it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.intValue() > 0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFilter2, "filter(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableFilter2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainFragment.onViewCreated$lambda$2(this.f$0, (Integer) obj);
            }
        });
        if (savedInstanceState == null) {
            Group optionChainSettings = getBinding().optionChainSettings;
            Intrinsics.checkNotNullExpressionValue(optionChainSettings, "optionChainSettings");
            optionChainSettings.setVisibility(8);
        }
        Observable<OptionChainViewState> observableFilter3 = getDuxo().getStates().filter(new Predicate() { // from class: com.robinhood.android.optionschain.OptionChainFragment.onViewCreated.8
            @Override // io.reactivex.functions.Predicate
            public final boolean test(OptionChainViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getChainSettingsIcon() != OptionChainViewState3.NONE;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFilter3, "filter(...)");
        Observable observableDistinctUntilChanged = observableFilter3.map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainFragment$onViewCreated$$inlined$mapDistinct$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (R) Optional3.asOptional(((OptionChainViewState) it).getTooltip());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainFragment.onViewCreated$lambda$6(this.f$0, (Optional) obj);
            }
        });
        Observable observableDistinctUntilChanged2 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainFragment$onViewCreated$$inlined$mapDistinct$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (R) Optional3.asOptional(((OptionChainViewState) it).getIndexOptionsTooltip());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainFragment.onViewCreated$lambda$8(this.f$0, (Optional) obj);
            }
        });
        Observable observableDistinctUntilChanged3 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainFragment$onViewCreated$$inlined$mapDistinct$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (R) Boolean.valueOf(((OptionChainViewState) it).getShouldShowSimulatedReturnSwitchChartTooltip());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged3, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged3), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainFragment.onViewCreated$lambda$11(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        Observable<R> map = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainFragment$onViewCreated$$inlined$mapDistinctNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((OptionChainViewState) it).getSelectedOptionChainExpirationDateState());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionChainFragment$onViewCreated$$inlined$mapDistinctNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableDistinctUntilChanged4 = ObservablesKt.filterIsPresent(map).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged4, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged4), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainFragment.onViewCreated$lambda$13(this.f$0, (OptionChainExpirationDateState) obj);
            }
        });
        Observable observableDistinctUntilChanged5 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainFragment$onViewCreated$$inlined$mapDistinct$4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (R) Optional3.asOptional(((OptionChainViewState) it).getShowSwitchFocusedToSbsTooltip());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged5, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged5), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainFragment$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainFragment.onViewCreated$lambda$16(this.f$0, (Optional) obj);
            }
        });
        collectDuxoState(Lifecycle.State.RESUMED, new C2409419(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(OptionChainFragment optionChainFragment, Integer num) {
        OrderSide orderSide;
        OptionChainDuxo duxo = optionChainFragment.getDuxo();
        int i = C24135R.id.option_chain_buy_radio;
        if (num != null && num.intValue() == i) {
            orderSide = OrderSide.BUY;
        } else {
            int i2 = C24135R.id.option_chain_sell_radio;
            if (num == null || num.intValue() != i2) {
                Preconditions.INSTANCE.failUnexpectedItemKotlin(num);
                throw new ExceptionsH();
            }
            orderSide = OrderSide.SELL;
        }
        duxo.onSideSelected(orderSide);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(OptionChainFragment optionChainFragment, Integer num) {
        OptionContractType optionContractType;
        OptionChainDuxo duxo = optionChainFragment.getDuxo();
        int i = C24135R.id.option_chain_call_radio;
        if (num != null && num.intValue() == i) {
            optionContractType = OptionContractType.CALL;
        } else {
            int i2 = C24135R.id.option_chain_put_radio;
            if (num == null || num.intValue() != i2) {
                Preconditions.INSTANCE.failUnexpectedItemKotlin(num);
                throw new ExceptionsH();
            }
            optionContractType = OptionContractType.PUT;
        }
        duxo.onContractTypeSelected(optionContractType);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$6(final OptionChainFragment optionChainFragment, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        OptionTooltip optionTooltip = (OptionTooltip) optional.component1();
        RdsTooltipView rdsTooltipView = optionChainFragment.getBinding().chainCustomizationTooltip;
        rdsTooltipView.setText(optionTooltip != null ? optionTooltip.getContent() : null);
        Intrinsics.checkNotNull(rdsTooltipView);
        rdsTooltipView.setVisibility(optionTooltip != null ? 0 : 8);
        OnClickListeners.onClick(rdsTooltipView, new Function0() { // from class: com.robinhood.android.optionschain.OptionChainFragment$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionChainFragment.onViewCreated$lambda$6$lambda$5$lambda$4(this.f$0);
            }
        });
        if (optionTooltip != null) {
            optionChainFragment.getDuxo().setTooltipSeen(optionTooltip);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$6$lambda$5$lambda$4(OptionChainFragment optionChainFragment) {
        optionChainFragment.getDuxo().setTooltipTapped();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$8(final OptionChainFragment optionChainFragment, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        IndexOptionsTooltip indexOptionsTooltip = (IndexOptionsTooltip) optional.component1();
        if (indexOptionsTooltip instanceof IndexOptionsTooltip.MultipleUnderlyingsTooltip) {
            OptionChainTooltipView chainMultipleUnderlyingsTooltip = optionChainFragment.getBinding().chainMultipleUnderlyingsTooltip;
            Intrinsics.checkNotNullExpressionValue(chainMultipleUnderlyingsTooltip, "chainMultipleUnderlyingsTooltip");
            chainMultipleUnderlyingsTooltip.setVisibility(0);
            IndexOptionsTooltip.MultipleUnderlyingsTooltip multipleUnderlyingsTooltip = (IndexOptionsTooltip.MultipleUnderlyingsTooltip) indexOptionsTooltip;
            optionChainFragment.getBinding().chainMultipleUnderlyingsTooltip.bind(new OptionChainTooltipView.Args(multipleUnderlyingsTooltip.getNibHorizontalBias(), multipleUnderlyingsTooltip.getTextRes(), multipleUnderlyingsTooltip.getLinkTextRes(), multipleUnderlyingsTooltip.getLinkRes()), new OptionChainTooltipView.Callbacks() { // from class: com.robinhood.android.optionschain.OptionChainFragment$onViewCreated$12$1
                @Override // com.robinhood.android.optionchain.tooltips.OptionChainTooltipView.Callbacks
                public void setTooltipSeen() {
                    this.this$0.getDuxo().setMultipleUnderlyingsTooltipSeen();
                }

                @Override // com.robinhood.android.optionchain.tooltips.OptionChainTooltipView.Callbacks
                public void onTooltipClicked() {
                    this.this$0.getDuxo().dismissMultipleUnderlyingsTooltip();
                }
            });
        } else if (indexOptionsTooltip instanceof IndexOptionsTooltip.SettleOnOpenTooltip) {
            OptionChainTooltipView chainSettleOnOpenTooltip = optionChainFragment.getBinding().chainSettleOnOpenTooltip;
            Intrinsics.checkNotNullExpressionValue(chainSettleOnOpenTooltip, "chainSettleOnOpenTooltip");
            chainSettleOnOpenTooltip.setVisibility(0);
            IndexOptionsTooltip.SettleOnOpenTooltip settleOnOpenTooltip = (IndexOptionsTooltip.SettleOnOpenTooltip) indexOptionsTooltip;
            optionChainFragment.getBinding().chainSettleOnOpenTooltip.bind(new OptionChainTooltipView.Args(settleOnOpenTooltip.getNibHorizontalBias(), settleOnOpenTooltip.getTextRes(), settleOnOpenTooltip.getLinkTextRes(), settleOnOpenTooltip.getLinkRes()), new OptionChainTooltipView.Callbacks() { // from class: com.robinhood.android.optionschain.OptionChainFragment$onViewCreated$12$2
                @Override // com.robinhood.android.optionchain.tooltips.OptionChainTooltipView.Callbacks
                public void setTooltipSeen() {
                    this.this$0.getDuxo().setSettleOnOpenTooltipSeen();
                }

                @Override // com.robinhood.android.optionchain.tooltips.OptionChainTooltipView.Callbacks
                public void onTooltipClicked() {
                    this.this$0.getDuxo().dismissSettleOnOpenTooltip();
                }
            });
        } else {
            if (indexOptionsTooltip != null) {
                throw new NoWhenBranchMatchedException();
            }
            OptionChainTooltipView chainMultipleUnderlyingsTooltip2 = optionChainFragment.getBinding().chainMultipleUnderlyingsTooltip;
            Intrinsics.checkNotNullExpressionValue(chainMultipleUnderlyingsTooltip2, "chainMultipleUnderlyingsTooltip");
            chainMultipleUnderlyingsTooltip2.setVisibility(8);
            OptionChainTooltipView chainSettleOnOpenTooltip2 = optionChainFragment.getBinding().chainSettleOnOpenTooltip;
            Intrinsics.checkNotNullExpressionValue(chainSettleOnOpenTooltip2, "chainSettleOnOpenTooltip");
            chainSettleOnOpenTooltip2.setVisibility(8);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$11(final OptionChainFragment optionChainFragment, boolean z) {
        RdsTooltipView chainSimulatedReturnTooltip = optionChainFragment.getBinding().chainSimulatedReturnTooltip;
        Intrinsics.checkNotNullExpressionValue(chainSimulatedReturnTooltip, "chainSimulatedReturnTooltip");
        chainSimulatedReturnTooltip.setVisibility(z ? 0 : 8);
        RdsTooltipView chainSimulatedReturnTooltip2 = optionChainFragment.getBinding().chainSimulatedReturnTooltip;
        Intrinsics.checkNotNullExpressionValue(chainSimulatedReturnTooltip2, "chainSimulatedReturnTooltip");
        OnClickListeners.onClick(chainSimulatedReturnTooltip2, new Function0() { // from class: com.robinhood.android.optionschain.OptionChainFragment$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionChainFragment.onViewCreated$lambda$11$lambda$10(this.f$0);
            }
        });
        if (z) {
            optionChainFragment.getDuxo().dismissSimulatedReturnSwitchChartTooltip(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$11$lambda$10(OptionChainFragment optionChainFragment) {
        optionChainFragment.getDuxo().dismissSimulatedReturnSwitchChartTooltip(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$13(OptionChainFragment optionChainFragment, OptionChainExpirationDateState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        optionChainFragment.getExpirationPageCallbacks().setSelectedExpirationPage(state);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$16(final OptionChainFragment optionChainFragment, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        SwitchFocusedToSbsTooltip switchFocusedToSbsTooltip = (SwitchFocusedToSbsTooltip) optional.component1();
        if (switchFocusedToSbsTooltip != null) {
            RdsTooltipView chainViewSwitchTooltip = optionChainFragment.getBinding().chainViewSwitchTooltip;
            Intrinsics.checkNotNullExpressionValue(chainViewSwitchTooltip, "chainViewSwitchTooltip");
            chainViewSwitchTooltip.setVisibility(0);
            RdsTooltipView rdsTooltipView = optionChainFragment.getBinding().chainViewSwitchTooltip;
            StringResource textRes = switchFocusedToSbsTooltip.getTextRes();
            Resources resources = optionChainFragment.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            rdsTooltipView.setText(textRes.getText(resources));
            optionChainFragment.getBinding().chainViewSwitchTooltip.setNibHorizontalBias(switchFocusedToSbsTooltip.getNibHorizontalBias());
            RdsTooltipView chainViewSwitchTooltip2 = optionChainFragment.getBinding().chainViewSwitchTooltip;
            Intrinsics.checkNotNullExpressionValue(chainViewSwitchTooltip2, "chainViewSwitchTooltip");
            OnClickListeners.onClick(chainViewSwitchTooltip2, new Function0() { // from class: com.robinhood.android.optionschain.OptionChainFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OptionChainFragment.onViewCreated$lambda$16$lambda$15(this.f$0);
                }
            });
            optionChainFragment.getDuxo().setSwitchFocusedToSbsTooltipSeen();
        } else {
            RdsTooltipView chainViewSwitchTooltip3 = optionChainFragment.getBinding().chainViewSwitchTooltip;
            Intrinsics.checkNotNullExpressionValue(chainViewSwitchTooltip3, "chainViewSwitchTooltip");
            chainViewSwitchTooltip3.setVisibility(8);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$16$lambda$15(OptionChainFragment optionChainFragment) {
        optionChainFragment.getDuxo().dismissSwitchFocusedToSbsTooltip();
        return Unit.INSTANCE;
    }

    /* compiled from: OptionChainFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainFragment$onViewCreated$19", m3645f = "OptionChainFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionschain.OptionChainFragment$onViewCreated$19 */
    static final class C2409419 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C2409419(Continuation<? super C2409419> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C2409419 c2409419 = OptionChainFragment.this.new C2409419(continuation);
            c2409419.L$0 = obj;
            return c2409419;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2409419) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: OptionChainFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainFragment$onViewCreated$19$1", m3645f = "OptionChainFragment.kt", m3646l = {400}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.optionschain.OptionChainFragment$onViewCreated$19$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ OptionChainFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionChainFragment optionChainFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionChainFragment;
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
                    final StateFlow<OptionChainViewState> statesFlow = this.this$0.getDuxo().getStatesFlow();
                    final OptionChainFragment optionChainFragment = this.this$0;
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<OptionChainToolbarState>() { // from class: com.robinhood.android.optionschain.OptionChainFragment$onViewCreated$19$1$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super OptionChainToolbarState> flowCollector, Continuation continuation) {
                            Object objCollect = statesFlow.collect(new AnonymousClass2(flowCollector, optionChainFragment), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.optionschain.OptionChainFragment$onViewCreated$19$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;
                            final /* synthetic */ OptionChainFragment this$0;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainFragment$onViewCreated$19$1$invokeSuspend$$inlined$map$1$2", m3645f = "OptionChainFragment.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.optionschain.OptionChainFragment$onViewCreated$19$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector, OptionChainFragment optionChainFragment) {
                                this.$this_unsafeFlow = flowCollector;
                                this.this$0 = optionChainFragment;
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
                                    Resources resources = this.this$0.getResources();
                                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                                    OptionChainToolbarState toolbarState = ((OptionChainViewState) obj).getToolbarState(resources, this.this$0.getClock());
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(toolbarState, anonymousClass1) == coroutine_suspended) {
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

            /* compiled from: OptionChainFragment.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "toolbarState", "Lcom/robinhood/android/optionschain/OptionChainToolbarState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainFragment$onViewCreated$19$1$2", m3645f = "OptionChainFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.OptionChainFragment$onViewCreated$19$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<OptionChainToolbarState, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionChainFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(OptionChainFragment optionChainFragment, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = optionChainFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionChainToolbarState optionChainToolbarState, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(optionChainToolbarState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.bindToolbar((OptionChainToolbarState) this.L$0);
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
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(OptionChainFragment.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(OptionChainFragment.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: OptionChainFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainFragment$onViewCreated$19$2", m3645f = "OptionChainFragment.kt", m3646l = {409}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.optionschain.OptionChainFragment$onViewCreated$19$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ OptionChainFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionChainFragment optionChainFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionChainFragment;
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
                    final StateFlow<OptionChainViewState> statesFlow = this.this$0.getDuxo().getStatesFlow();
                    final OptionChainFragment optionChainFragment = this.this$0;
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<OptionChainTooltipBanner3>() { // from class: com.robinhood.android.optionschain.OptionChainFragment$onViewCreated$19$2$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super OptionChainTooltipBanner3> flowCollector, Continuation continuation) {
                            Object objCollect = statesFlow.collect(new AnonymousClass2(flowCollector, optionChainFragment), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.optionschain.OptionChainFragment$onViewCreated$19$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;
                            final /* synthetic */ OptionChainFragment this$0;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainFragment$onViewCreated$19$2$invokeSuspend$$inlined$map$1$2", m3645f = "OptionChainFragment.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.optionschain.OptionChainFragment$onViewCreated$19$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector, OptionChainFragment optionChainFragment) {
                                this.$this_unsafeFlow = flowCollector;
                                this.this$0 = optionChainFragment;
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
                                    OptionChainTooltipBanner3 topTooltipBannerType = ((OptionChainViewState) obj).getTopTooltipBannerType(this.this$0.getClock());
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(topTooltipBannerType, anonymousClass1) == coroutine_suspended) {
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
                    C503762 c503762 = new C503762(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, c503762, this) == coroutine_suspended) {
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

            /* compiled from: OptionChainFragment.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "topTooltipBannerType", "Lcom/robinhood/android/optionschain/view/OptionChainTooltipBannerType;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainFragment$onViewCreated$19$2$2", m3645f = "OptionChainFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionschain.OptionChainFragment$onViewCreated$19$2$2, reason: invalid class name and collision with other inner class name */
            static final class C503762 extends ContinuationImpl7 implements Function2<OptionChainTooltipBanner3, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionChainFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C503762(OptionChainFragment optionChainFragment, Continuation<? super C503762> continuation) {
                    super(2, continuation);
                    this.this$0 = optionChainFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C503762 c503762 = new C503762(this.this$0, continuation);
                    c503762.L$0 = obj;
                    return c503762;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionChainTooltipBanner3 optionChainTooltipBanner3, Continuation<? super Unit> continuation) {
                    return ((C503762) create(optionChainTooltipBanner3, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        final OptionChainTooltipBanner3 optionChainTooltipBanner3 = (OptionChainTooltipBanner3) this.L$0;
                        ComposeView composeView = this.this$0.getBinding().chainListComposeView;
                        final OptionChainFragment optionChainFragment = this.this$0;
                        composeView.setContent(ComposableLambda3.composableLambdaInstance(2085748265, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.OptionChainFragment.onViewCreated.19.2.2.1

                            /* compiled from: OptionChainFragment.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.optionschain.OptionChainFragment$onViewCreated$19$2$2$1$1, reason: invalid class name and collision with other inner class name */
                            static final class C503771 implements Function2<Composer, Integer, Unit> {
                                final /* synthetic */ OptionChainTooltipBanner3 $topTooltipBannerType;
                                final /* synthetic */ OptionChainFragment this$0;

                                C503771(OptionChainTooltipBanner3 optionChainTooltipBanner3, OptionChainFragment optionChainFragment) {
                                    this.$topTooltipBannerType = optionChainTooltipBanner3;
                                    this.this$0 = optionChainFragment;
                                }

                                public final void invoke(Composer composer, int i) {
                                    Composer composer2;
                                    if ((i & 3) == 2 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(209814199, i, -1, "com.robinhood.android.optionschain.OptionChainFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OptionChainFragment.kt:414)");
                                    }
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                                    OptionChainTooltipBanner3 optionChainTooltipBanner3 = this.$topTooltipBannerType;
                                    final OptionChainFragment optionChainFragment = this.this$0;
                                    Alignment.Companion companion2 = Alignment.INSTANCE;
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxSize$default);
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    composer.startReplaceGroup(-1582145937);
                                    if (optionChainTooltipBanner3 != null) {
                                        Modifier modifierAlign = boxScopeInstance.align(companion, companion2.getTopCenter());
                                        composer.startReplaceGroup(5004770);
                                        boolean zChangedInstance = composer.changedInstance(optionChainFragment);
                                        Object objRememberedValue = composer.rememberedValue();
                                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new Function1() { // from class: com.robinhood.android.optionschain.OptionChainFragment$onViewCreated$19$2$2$1$1$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return OptionChainFragment.C2409419.AnonymousClass2.C503762.AnonymousClass1.C503771.invoke$lambda$4$lambda$1$lambda$0(optionChainFragment, (OptionChainTooltipBanner3) obj);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue);
                                        }
                                        Function1 function1 = (Function1) objRememberedValue;
                                        composer.endReplaceGroup();
                                        composer.startReplaceGroup(1849434622);
                                        Object objRememberedValue2 = composer.rememberedValue();
                                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.optionschain.OptionChainFragment$onViewCreated$19$2$2$1$1$$ExternalSyntheticLambda1
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return OptionChainFragment.C2409419.AnonymousClass2.C503762.AnonymousClass1.C503771.invoke$lambda$4$lambda$3$lambda$2((OptionChainTooltipBanner3) obj);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer.endReplaceGroup();
                                        composer2 = composer;
                                        OptionChainTooltipBanner.OptionChainTooltipBanner(optionChainTooltipBanner3, function1, modifierAlign, false, (Function1) objRememberedValue2, composer2, 24576, 8);
                                    } else {
                                        composer2 = composer;
                                    }
                                    composer2.endReplaceGroup();
                                    composer2.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                    invoke(composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$4$lambda$1$lambda$0(OptionChainFragment optionChainFragment, OptionChainTooltipBanner3 it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    optionChainFragment.getDuxo().dismissTopTooltipBanner(false);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$4$lambda$3$lambda$2(OptionChainTooltipBanner3 it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    return Unit.INSTANCE;
                                }
                            }

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
                                    ComposerKt.traceEventStart(2085748265, i, -1, "com.robinhood.android.optionschain.OptionChainFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OptionChainFragment.kt:410)");
                                }
                                BentoTheme2.BentoTheme(ScarletComposeInterop.themeChangesForCompose(optionChainFragment.getScarletManager()), ScarletComposeInterop.themesForCompose(optionChainFragment.getScarletManager()), ComposableLambda3.rememberComposableLambda(209814199, true, new C503771(optionChainTooltipBanner3, optionChainFragment), composer, 54), composer, 384, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Observable observableDistinctUntilChanged = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainFragment.onStart.1
            @Override // io.reactivex.functions.Function
            public final OptionChainPagesWithScrollEvents apply(OptionChainViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getOptionChainPagesWithScrollEvents();
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainFragment$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainFragment.onStart$lambda$17(this.f$0, (OptionChainPagesWithScrollEvents) obj);
            }
        });
        Observable<R> map = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainFragment.onStart.3
            @Override // io.reactivex.functions.Function
            public final Optional<OptionOrderFilter> apply(OptionChainViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(it.getOptionOrderFilter());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableDistinctUntilChanged2 = ObservablesKt.filterIsPresent(map).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainFragment$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainFragment.onStart$lambda$18(this.f$0, (OptionOrderFilter) obj);
            }
        });
        if (((InternalOptionChainFragmentKey) INSTANCE.getArgs((Fragment) this)).getLaunchMode().hasFeature(OptionChainLaunchMode.Feature.DISABLE_DEFAULT_ORDER_FILTER)) {
            ActivityResultCaller activityResultCallerRequireParentFragment = requireParentFragment();
            Intrinsics.checkNotNull(activityResultCallerRequireParentFragment, "null cannot be cast to non-null type com.robinhood.android.optionchain.SupportOptionOrderFilter");
            Observable<Tuples2<OrderSide, OptionContractType>> observableDistinctUntilChanged3 = ((SupportOptionOrderFilter) activityResultCallerRequireParentFragment).getOptionOrderFilterRelay().distinctUntilChanged();
            Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged3, "distinctUntilChanged(...)");
            LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged3), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainFragment$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionChainFragment.onStart$lambda$19(this.f$0, (Tuples2) obj);
                }
            });
        }
        Observable observableDistinctUntilChanged4 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainFragment.onStart.6
            @Override // io.reactivex.functions.Function
            public final Optional<ScarletOverlay> apply(OptionChainViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(it.getScarletOverlay());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged4, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged4), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainFragment$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainFragment.onStart$lambda$20(this.f$0, (Optional) obj);
            }
        });
        Observable<OptionChainViewState> states = getDuxo().getStates();
        final C240938 c240938 = new PropertyReference1Impl() { // from class: com.robinhood.android.optionschain.OptionChainFragment.onStart.8
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return Boolean.valueOf(((OptionChainViewState) obj).getShouldShowChainSettings());
            }
        };
        Observable observableDistinctUntilChanged5 = states.map(new Function(c240938) { // from class: com.robinhood.android.optionschain.OptionChainFragment$sam$io_reactivex_functions_Function$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(c240938, "function");
                this.function = c240938;
            }

            @Override // io.reactivex.functions.Function
            public final /* synthetic */ Object apply(Object obj) {
                return this.function.invoke(obj);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged5, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged5), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainFragment$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainFragment.onStart$lambda$21(this.f$0, (Boolean) obj);
            }
        });
        Observable observableDistinctUntilChanged6 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainFragment$onStart$$inlined$mapDistinct$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (R) Boolean.valueOf(((OptionChainViewState) it).getShouldShowRollingHeaderView());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged6, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged6), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainFragment$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainFragment.onStart$lambda$22(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        Observable<R> map2 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainFragment$onStart$$inlined$mapDistinctNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((OptionChainViewState) it).getRollingHeaderData());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionChainFragment$onStart$$inlined$mapDistinctNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        Observable observableDistinctUntilChanged7 = ObservablesKt.filterIsPresent(map2).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged7, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged7), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C2408913(getBinding().rollingPositionContainer));
        Observable<R> map3 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainFragment.onStart.14
            @Override // io.reactivex.functions.Function
            public final Optional<UiEvent<Throwable>> apply(OptionChainViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(it.getFridayTradingErrorEvent());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        Observable observableDistinctUntilChanged8 = ObservablesKt.filterIsPresent(map3).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged8, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged8), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainFragment$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainFragment.onStart$lambda$24(this.f$0, (UiEvent) obj);
            }
        });
        Observable observableDistinctUntilChanged9 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainFragment$onStart$$inlined$mapDistinct$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (R) ((OptionChainViewState) it).getDefaultPricingState();
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged9, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged9), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainFragment$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainFragment.onStart$lambda$26(this.f$0, (OptionDefaultPricingState) obj);
            }
        });
        Observable<R> map4 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainFragment$onStart$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((OptionChainViewState) it).getOptionStrategyBuilderData());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionChainFragment$onStart$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map4, "map(...)");
        Observable observableDistinctUntilChanged10 = ObservablesKt.filterIsPresent(map4).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged10, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged10), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainFragment$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainFragment.onStart$lambda$28(this.f$0, (List) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(requireBaseActivity().getDayNightStyleChanges()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainFragment$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainFragment.onStart$lambda$29(this.f$0, (DayNightOverlay) obj);
            }
        });
        Observable<R> map5 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainFragment$onStart$$inlined$mapNotNull$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((OptionChainViewState) it).getChainCustomizationErrorEvent());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionChainFragment$onStart$$inlined$mapNotNull$2<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map5, "map(...)");
        Observable observableDistinctUntilChanged11 = ObservablesKt.filterIsPresent(map5).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged11, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged11), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainFragment$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainFragment.onStart$lambda$33(this.f$0, (UiEvent) obj);
            }
        });
        Observable<R> map6 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainFragment$onStart$$inlined$mapNotNull$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((OptionChainViewState) it).getShowDiscoverZeroDteSnackbarEvent());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionChainFragment$onStart$$inlined$mapNotNull$3<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map6, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(ObservablesKt.filterIsPresent(map6)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainFragment$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainFragment.onStart$lambda$37(this.f$0, (UiEvent) obj);
            }
        });
        setupComposeOverlay();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$17(final OptionChainFragment optionChainFragment, final OptionChainPagesWithScrollEvents optionChainViewState2) {
        final int size = optionChainFragment.adapter.getSize();
        final List<OptionChainViewState.OptionChainPage> optionChainPages = optionChainViewState2.getOptionChainPages();
        optionChainFragment.adapter.submitList(optionChainPages, new Runnable() { // from class: com.robinhood.android.optionschain.OptionChainFragment$onStart$2$1
            @Override // java.lang.Runnable
            public final void run() {
                Tuples2<BigDecimal, Integer> tuples2Consume;
                ImmutableList<UiOptionStrategyLegDisplay> immutableListConsume;
                OptionInstrument optionInstrumentConsume;
                OptionChainExpirationDateState optionChainExpirationDateStateConsume;
                Integer numConsume;
                if (!optionChainPages.isEmpty()) {
                    UiEvent<Integer> defaultToNearestExpirationDateEvent = optionChainViewState2.getDefaultToNearestExpirationDateEvent();
                    if (defaultToNearestExpirationDateEvent != null && (numConsume = defaultToNearestExpirationDateEvent.consume()) != null) {
                        optionChainFragment.jumpToExpirationPageIndex(numConsume.intValue());
                    }
                    UiEvent<OptionChainExpirationDateState> targetExpirationPageFromSbsChainEvent = optionChainViewState2.getTargetExpirationPageFromSbsChainEvent();
                    if (targetExpirationPageFromSbsChainEvent != null && (optionChainExpirationDateStateConsume = targetExpirationPageFromSbsChainEvent.consume()) != null) {
                        optionChainFragment.jumpToExpirationPage(optionChainExpirationDateStateConsume);
                    }
                    UiEvent<OptionInstrument> rollingExpirationDateEvent = optionChainViewState2.getRollingExpirationDateEvent();
                    if (rollingExpirationDateEvent != null && (optionInstrumentConsume = rollingExpirationDateEvent.consume()) != null) {
                        optionChainFragment.jumpToExpirationDateAfterOptionInstrument(optionInstrumentConsume);
                    }
                    UiEvent<ImmutableList<UiOptionStrategyLegDisplay>> targetExpirationPageFromTargetLegsEvent = optionChainViewState2.getTargetExpirationPageFromTargetLegsEvent();
                    if (targetExpirationPageFromTargetLegsEvent != null && (immutableListConsume = targetExpirationPageFromTargetLegsEvent.consume()) != null) {
                        optionChainFragment.jumpToOptionInstrument(immutableListConsume);
                    }
                    UiEvent<Tuples2<BigDecimal, Integer>> targetStrikePriceEvent = optionChainViewState2.getTargetStrikePriceEvent();
                    if (targetStrikePriceEvent != null && (tuples2Consume = targetStrikePriceEvent.consume()) != null) {
                        optionChainFragment.jumpToStrikePrice(tuples2Consume.component1(), tuples2Consume.component2().intValue());
                    }
                    optionChainFragment.getDuxo().logOptionsPagesLoaded();
                }
                if (size != optionChainPages.size()) {
                    TabLayoutMediator tabLayoutMediator = optionChainFragment.tabLayoutMediator;
                    TabLayoutMediator tabLayoutMediator2 = null;
                    if (tabLayoutMediator == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("tabLayoutMediator");
                        tabLayoutMediator = null;
                    }
                    tabLayoutMediator.detach();
                    TabLayoutMediator tabLayoutMediator3 = optionChainFragment.tabLayoutMediator;
                    if (tabLayoutMediator3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("tabLayoutMediator");
                    } else {
                        tabLayoutMediator2 = tabLayoutMediator3;
                    }
                    tabLayoutMediator2.attach();
                }
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$18(OptionChainFragment optionChainFragment, OptionOrderFilter optionOrderFilter) {
        boolean z = optionOrderFilter.getSide() == OrderSide.BUY;
        boolean z2 = optionOrderFilter.getContractType() == OptionContractType.CALL;
        FragmentOptionChainBinding binding = optionChainFragment.getBinding();
        (z ? binding.optionChainBuyRadio : binding.optionChainSellRadio).setCheckedProgrammatically(true);
        FragmentOptionChainBinding binding2 = optionChainFragment.getBinding();
        (z2 ? binding2.optionChainCallRadio : binding2.optionChainPutRadio).setCheckedProgrammatically(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$19(OptionChainFragment optionChainFragment, Tuples2 tuples2) {
        OrderSide orderSide = (OrderSide) tuples2.component1();
        optionChainFragment.getDuxo().setOptionOrderFilter(new OptionOrderFilter(((InternalOptionChainFragmentKey) INSTANCE.getArgs((Fragment) optionChainFragment)).getOptionChainId(), (OptionContractType) tuples2.component2(), orderSide));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$20(OptionChainFragment optionChainFragment, Optional optional) {
        ScarletOverlay scarletOverlay = (ScarletOverlay) optional.component1();
        if (scarletOverlay != null) {
            ScarletManager.putOverlay$default(optionChainFragment.getScarletManager(), scarletOverlay, null, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$21(OptionChainFragment optionChainFragment, Boolean bool) {
        Group optionChainSettings = optionChainFragment.getBinding().optionChainSettings;
        Intrinsics.checkNotNullExpressionValue(optionChainSettings, "optionChainSettings");
        if (Intrinsics.areEqual(Boolean.valueOf(optionChainSettings.getVisibility() == 0), bool)) {
            return Unit.INSTANCE;
        }
        optionChainFragment.startHeaderAnimation();
        Group optionChainSettings2 = optionChainFragment.getBinding().optionChainSettings;
        Intrinsics.checkNotNullExpressionValue(optionChainSettings2, "optionChainSettings");
        Intrinsics.checkNotNull(bool);
        optionChainSettings2.setVisibility(bool.booleanValue() ? 0 : 8);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$22(OptionChainFragment optionChainFragment, boolean z) {
        OptionChainRollingHeaderView rollingPositionContainer = optionChainFragment.getBinding().rollingPositionContainer;
        Intrinsics.checkNotNullExpressionValue(rollingPositionContainer, "rollingPositionContainer");
        if ((rollingPositionContainer.getVisibility() == 0) == z) {
            return Unit.INSTANCE;
        }
        optionChainFragment.startHeaderAnimation();
        OptionChainRollingHeaderView rollingPositionContainer2 = optionChainFragment.getBinding().rollingPositionContainer;
        Intrinsics.checkNotNullExpressionValue(rollingPositionContainer2, "rollingPositionContainer");
        rollingPositionContainer2.setVisibility(z ? 0 : 8);
        return Unit.INSTANCE;
    }

    /* compiled from: OptionChainFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionschain.OptionChainFragment$onStart$13 */
    /* synthetic */ class C2408913 extends FunctionReferenceImpl implements Function1<OptionChainRollingHeaderView.RollingHeaderData, Unit> {
        C2408913(Object obj) {
            super(1, obj, OptionChainRollingHeaderView.class, "bind", "bind(Lcom/robinhood/android/optionschain/rolling/OptionChainRollingHeaderView$RollingHeaderData;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OptionChainRollingHeaderView.RollingHeaderData rollingHeaderData) throws Resources.NotFoundException {
            invoke2(rollingHeaderData);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(OptionChainRollingHeaderView.RollingHeaderData p0) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((OptionChainRollingHeaderView) this.receiver).bind(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$24(OptionChainFragment optionChainFragment, UiEvent uiEvent) {
        Throwable th = (Throwable) uiEvent.consume();
        if (th != null) {
            optionChainFragment.getActivityErrorHandler().invoke((ActivityErrorHandler) th);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$26(OptionChainFragment optionChainFragment, OptionDefaultPricingState defaultPricingState) {
        Intrinsics.checkNotNullParameter(defaultPricingState, "defaultPricingState");
        optionChainFragment.defaultPricingState = defaultPricingState;
        optionChainFragment.requireActivity().invalidateOptionsMenu();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$28(OptionChainFragment optionChainFragment, List list) {
        optionChainFragment.adapter.notifyItemChanged(0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$29(OptionChainFragment optionChainFragment, DayNightOverlay dayNightOverlay) {
        Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
        optionChainFragment.getDuxo().isDay(DayNightChanges.isDay(dayNightOverlay));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$33(final OptionChainFragment optionChainFragment, UiEvent uiEvent) {
        OptionChainCustomizationErrorEvent optionChainCustomizationErrorEvent;
        if (uiEvent != null && (optionChainCustomizationErrorEvent = (OptionChainCustomizationErrorEvent) uiEvent.consume()) != null) {
            CoordinatorLayout root = optionChainFragment.getBinding().getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            OptionChainCustomizationSnackbarHelper.showCustomizationSnackbar(root, optionChainCustomizationErrorEvent, new OptionChainFragment$onStart$22$1$1(optionChainFragment), new Function1() { // from class: com.robinhood.android.optionschain.OptionChainFragment$$ExternalSyntheticLambda30
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(OptionChainFragment.onStart$lambda$33$lambda$32$lambda$31(this.f$0, (Throwable) obj));
                }
            });
            optionChainFragment.getDuxo().logCustomizationSnackbar(optionChainCustomizationErrorEvent);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onStart$lambda$33$lambda$32$lambda$31(OptionChainFragment optionChainFragment, Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return AbsErrorHandler.handleError$default(optionChainFragment.getActivityErrorHandler(), error, false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$37(final OptionChainFragment optionChainFragment, UiEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        final String str = (String) event.consume();
        if (str == null) {
            return Unit.INSTANCE;
        }
        CoordinatorLayout root = optionChainFragment.getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        OptionDiscoverZeroDteSnackbarHelper.showDiscoverZeroDteSnackbar(root, new Function0() { // from class: com.robinhood.android.optionschain.OptionChainFragment$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionChainFragment.onStart$lambda$37$lambda$35(this.f$0, str);
            }
        }, new Function0() { // from class: com.robinhood.android.optionschain.OptionChainFragment$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionChainFragment.onStart$lambda$37$lambda$36(this.f$0);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$37$lambda$35(OptionChainFragment optionChainFragment, String str) {
        Navigator navigator = optionChainFragment.getNavigator();
        Context contextRequireContext = optionChainFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new SettingsFragmentKey(SettingsFragmentKey3.LAUNCH_OPTIONS_SETTINGS, false, false, false, null, null, str, null, false, 446, null), false, false, false, null, false, null, false, false, null, null, 4084, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$37$lambda$36(OptionChainFragment optionChainFragment) {
        optionChainFragment.getDuxo().dismissDiscoverZeroDteSnackbar();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        destroyComposeOverlay();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setVisibility(0);
        toolbar.setUseDesignSystemTheme(true);
        toolbar.setElevation(0.0f);
        ComposeView composeView = (ComposeView) toolbar.findViewById(C24135R.id.toolbar_compose_view);
        this.toolbarView = composeView;
        if (composeView == null) {
            RhToolbar.addCustomView$default(toolbar, C24135R.layout.toolbar_option_chain_fragment, false, 8388613, 2, null);
            this.toolbarView = (ComposeView) toolbar.findViewById(C24135R.id.toolbar_compose_view);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1 && resultCode == -1) {
            requireActivity().finish();
            return;
        }
        if (requestCode == 123 && resultCode == -1) {
            OptionInstrument optionInstrument = data != null ? (OptionInstrument) data.getParcelableExtra(OptionChainLaunchMode.SingleLegAction.Roll.EXTRA_SELECTED_INSTRUMENT) : null;
            if (optionInstrument != null) {
                requireActivity().setResult(-1, OptionChainLaunchMode.SingleLegAction.Roll.INSTANCE.getResultData(optionInstrument));
            }
            requireActivity().finish();
            return;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // com.robinhood.android.optionschain.OptionStrategyBuilderView.Callbacks
    public void launchIntentForResult(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.strategyBuilderLauncher.launch(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: OptionChainFragment.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0003H\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionChainFragment$OptionChainAdapter;", "Lcom/robinhood/test/idler/TrackedListAdapter;", "Lcom/robinhood/android/optionschain/OptionChainViewState$OptionChainPage;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "<init>", "(Lcom/robinhood/android/optionschain/OptionChainFragment;)V", "getItemViewType", "", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", "holder", "onViewDetachedFromWindow", "onViewRecycled", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    final class OptionChainAdapter extends TrackedListAdapter<OptionChainViewState.OptionChainPage, RecyclerView.ViewHolder> {
        public OptionChainAdapter() {
            super(OptionChainViewState.OptionChainPage.INSTANCE.getDiffCallback());
            setStateRestorationPolicy(RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int position) {
            OptionChainViewState.OptionChainPage item = getItem(position);
            if (item instanceof OptionChainViewState.OptionChainPage.BuilderPage) {
                return 3;
            }
            if (item instanceof OptionChainViewState.OptionChainPage.OptionExpirationDatePage) {
                return 2;
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            if (viewType != 2) {
                if (viewType == 3) {
                    return new GenericViewHolder(OptionStrategyBuilderView.INSTANCE.inflate(parent));
                }
                throw new IllegalStateException("Unrecognized view type");
            }
            OptionChainListView optionChainListViewInflate = OptionChainListView.INSTANCE.inflate(parent);
            RecyclerView.RecycledViewPool recycledViewPool = OptionChainFragment.this.listRecycledViewPool;
            if (recycledViewPool == null) {
                OptionChainFragment.this.listRecycledViewPool = optionChainListViewInflate.getRecycledViewPool();
            } else {
                optionChainListViewInflate.setRecycledViewPool(recycledViewPool);
            }
            optionChainListViewInflate.setRowCallbacks(OptionChainFragment.this);
            optionChainListViewInflate.setCallbacks(OptionChainFragment.this);
            return new GenericViewHolder(optionChainListViewInflate);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            int itemViewType = getItemViewType(position);
            OptionChainViewState.OptionChainPage item = getItem(position);
            if (itemViewType == 2) {
                View view = holder.itemView;
                Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.optionschain.OptionChainListView");
                Intrinsics.checkNotNull(item, "null cannot be cast to non-null type com.robinhood.android.optionschain.OptionChainViewState.OptionChainPage.OptionExpirationDatePage");
                ((OptionChainListView) view).onBind((OptionChainViewState.OptionChainPage.OptionExpirationDatePage) item);
                return;
            }
            if (itemViewType != 3) {
                return;
            }
            OptionChainFragment optionChainFragment = OptionChainFragment.this;
            Observable<R> map = optionChainFragment.getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainFragment$OptionChainAdapter$onBindViewHolder$$inlined$mapNotNull$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.reactivex.functions.Function
                public final Optional<R> apply(T it) {
                    List<OptionStrategyBuilderAdapter2> optionStrategyBuilderData;
                    Intrinsics.checkNotNullParameter(it, "it");
                    OptionChainViewState optionChainViewState = (OptionChainViewState) it;
                    OptionStrategyBuilderView.AdditionalCardData additionalCardData = optionChainViewState.getAdditionalCardData();
                    OptionChainViewState.ExtendedOptionStrategyBuilderData extendedOptionStrategyBuilderData = null;
                    if (additionalCardData != null && (optionStrategyBuilderData = optionChainViewState.getOptionStrategyBuilderData()) != null) {
                        extendedOptionStrategyBuilderData = new OptionChainViewState.ExtendedOptionStrategyBuilderData(additionalCardData, optionStrategyBuilderData);
                    }
                    return Optional3.asOptional(extendedOptionStrategyBuilderData);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.reactivex.functions.Function
                public /* bridge */ /* synthetic */ Object apply(Object obj) {
                    return apply((C24069x663877aa<T, R>) obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            Observable observableDistinctUntilChanged = ObservablesKt.filterIsPresent(map).distinctUntilChanged();
            Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
            ScopedObservable scopedObservableBind$default = LifecycleHost.DefaultImpls.bind$default(optionChainFragment, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null);
            final OptionChainFragment optionChainFragment2 = OptionChainFragment.this;
            scopedObservableBind$default.subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainFragment$OptionChainAdapter$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionChainFragment.OptionChainAdapter.onBindViewHolder$lambda$2(holder, optionChainFragment2, (OptionChainViewState.ExtendedOptionStrategyBuilderData) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onBindViewHolder$lambda$2(RecyclerView.ViewHolder viewHolder, final OptionChainFragment optionChainFragment, OptionChainViewState.ExtendedOptionStrategyBuilderData extendedOptionStrategyBuilderData) {
            View view = viewHolder.itemView;
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.optionschain.OptionStrategyBuilderView");
            ((OptionStrategyBuilderView) view).bind(new OptionStrategyBuilderView.OptionStrategyBuilderViewData(extendedOptionStrategyBuilderData.getOptionStrategyBuilderData(), extendedOptionStrategyBuilderData.getAdditionalCardData(), new Function1() { // from class: com.robinhood.android.optionschain.OptionChainFragment$OptionChainAdapter$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionChainFragment.OptionChainAdapter.onBindViewHolder$lambda$2$lambda$1(optionChainFragment, (OptionStrategyBuilder.SentimentFilter) obj);
                }
            }), optionChainFragment);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onBindViewHolder$lambda$2$lambda$1(OptionChainFragment optionChainFragment, OptionStrategyBuilder.SentimentFilter sentimentFilter) {
            optionChainFragment.getDuxo().setSentiment(sentimentFilter);
            return Unit.INSTANCE;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewDetachedFromWindow(RecyclerView.ViewHolder holder) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            if (holder.getItemViewType() == 2) {
                View view = holder.itemView;
                Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.optionschain.OptionChainListView");
                ((OptionChainListView) view).onDetachFromRecyclerView();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewRecycled(RecyclerView.ViewHolder holder) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            if (holder.getItemViewType() == 2) {
                View view = holder.itemView;
                Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.optionschain.OptionChainListView");
                ((OptionChainListView) view).onRecycled();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void jumpToExpirationDateAfterOptionInstrument(OptionInstrument optionInstrument) {
        OptionConfigurationBundle optionConfigurationBundle;
        LocalDate expirationDate;
        LocalDate expirationDate2 = optionInstrument.getExpirationDate();
        List<OptionChainViewState.OptionChainPage> currentList = this.adapter.getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        Iterator<OptionChainViewState.OptionChainPage> it = currentList.iterator();
        int lastIndex = 0;
        while (true) {
            if (!it.hasNext()) {
                lastIndex = -1;
                break;
            }
            OptionChainViewState.OptionChainPage next = it.next();
            OptionChainViewState.OptionChainPage.OptionExpirationDatePage optionExpirationDatePage = next instanceof OptionChainViewState.OptionChainPage.OptionExpirationDatePage ? (OptionChainViewState.OptionChainPage.OptionExpirationDatePage) next : null;
            if (optionExpirationDatePage != null && (optionConfigurationBundle = optionExpirationDatePage.getOptionConfigurationBundle()) != null && (expirationDate = optionConfigurationBundle.getExpirationDate()) != null && expirationDate.compareTo((ChronoLocalDate) expirationDate2) > 0) {
                break;
            } else {
                lastIndex++;
            }
        }
        if (lastIndex < 0 || lastIndex >= this.adapter.getCurrentList().size()) {
            List<OptionChainViewState.OptionChainPage> currentList2 = this.adapter.getCurrentList();
            Intrinsics.checkNotNullExpressionValue(currentList2, "getCurrentList(...)");
            lastIndex = CollectionsKt.getLastIndex(currentList2);
        }
        getBinding().viewpager.setCurrentItem(lastIndex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void jumpToOptionInstrument(ImmutableList<? extends UiOptionStrategyLegDisplay> targetLegs) {
        OptionConfigurationBundle optionConfigurationBundle;
        if (targetLegs.isEmpty()) {
            return;
        }
        Iterator<? extends UiOptionStrategyLegDisplay> it = targetLegs.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        LocalDate expirationDate = it.next().getExpirationDate();
        while (it.hasNext()) {
            LocalDate expirationDate2 = it.next().getExpirationDate();
            if (expirationDate.compareTo(expirationDate2) > 0) {
                expirationDate = expirationDate2;
            }
        }
        List<OptionChainViewState.OptionChainPage> currentList = this.adapter.getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        Iterator<OptionChainViewState.OptionChainPage> it2 = currentList.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            }
            OptionChainViewState.OptionChainPage next = it2.next();
            LocalDate expirationDate3 = null;
            OptionChainViewState.OptionChainPage.OptionExpirationDatePage optionExpirationDatePage = next instanceof OptionChainViewState.OptionChainPage.OptionExpirationDatePage ? (OptionChainViewState.OptionChainPage.OptionExpirationDatePage) next : null;
            if (optionExpirationDatePage != null && (optionConfigurationBundle = optionExpirationDatePage.getOptionConfigurationBundle()) != null) {
                expirationDate3 = optionConfigurationBundle.getExpirationDate();
            }
            if (Intrinsics.areEqual(expirationDate3, expirationDate)) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            Timber.INSTANCE.mo3362w("Date not found: %s", expirationDate);
            return;
        }
        getBinding().viewpager.setCurrentItem(i);
        OptionChainDuxo duxo = getDuxo();
        for (UiOptionStrategyLegDisplay uiOptionStrategyLegDisplay : targetLegs) {
            if (Intrinsics.areEqual(uiOptionStrategyLegDisplay.getExpirationDate(), expirationDate)) {
                duxo.setScrollTarget(new OptionChainViewState.ChainScrollTarget(expirationDate, new OptionChainListViewState.ScrollTarget.InstrumentId(uiOptionStrategyLegDisplay.getOptionInstrument().getId())));
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void jumpToStrikePrice(BigDecimal targetStrikePrice, int pageIndex) {
        OptionConfigurationBundle optionConfigurationBundle;
        LocalDate expirationDate;
        OptionChainViewState.OptionChainPage optionChainPage = this.adapter.getCurrentList().get(pageIndex);
        OptionChainViewState.OptionChainPage.OptionExpirationDatePage optionExpirationDatePage = optionChainPage instanceof OptionChainViewState.OptionChainPage.OptionExpirationDatePage ? (OptionChainViewState.OptionChainPage.OptionExpirationDatePage) optionChainPage : null;
        if (optionExpirationDatePage == null || (optionConfigurationBundle = optionExpirationDatePage.getOptionConfigurationBundle()) == null || (expirationDate = optionConfigurationBundle.getExpirationDate()) == null) {
            return;
        }
        jumpToExpirationPageIndex(pageIndex);
        getDuxo().setScrollTarget(new OptionChainViewState.ChainScrollTarget(expirationDate, new OptionChainListViewState.ScrollTarget.StrikePrice(targetStrikePrice)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void jumpToExpirationPageIndex(int pageIndex) {
        if (pageIndex < 0 || pageIndex >= this.adapter.getCurrentList().size()) {
            pageIndex = getBinding().viewpager.getCurrentItem();
        }
        getBinding().viewpager.setCurrentItem(pageIndex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void jumpToExpirationPage(OptionChainExpirationDateState expirationPage) {
        OptionConfigurationBundle optionConfigurationBundle;
        OptionChainBundle optionChainBundle;
        UiOptionChain uiOptionChain;
        OptionChain optionChain;
        OptionConfigurationBundle optionConfigurationBundle2;
        List<OptionChainViewState.OptionChainPage> currentList = this.adapter.getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        Iterator<OptionChainViewState.OptionChainPage> it = currentList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            OptionChainViewState.OptionChainPage next = it.next();
            OptionChainViewState.OptionChainPage.OptionExpirationDatePage optionExpirationDatePage = next instanceof OptionChainViewState.OptionChainPage.OptionExpirationDatePage ? (OptionChainViewState.OptionChainPage.OptionExpirationDatePage) next : null;
            LocalDate expirationDate = (optionExpirationDatePage == null || (optionConfigurationBundle2 = optionExpirationDatePage.getOptionConfigurationBundle()) == null) ? null : optionConfigurationBundle2.getExpirationDate();
            UUID id = (optionExpirationDatePage == null || (optionConfigurationBundle = optionExpirationDatePage.getOptionConfigurationBundle()) == null || (optionChainBundle = optionConfigurationBundle.getOptionChainBundle()) == null || (uiOptionChain = optionChainBundle.getUiOptionChain()) == null || (optionChain = uiOptionChain.getOptionChain()) == null) ? null : optionChain.getId();
            if (Intrinsics.areEqual(expirationDate, expirationPage.getExpirationDate()) && Intrinsics.areEqual(id, expirationPage.getUiOptionChain().getOptionChain().getId())) {
                break;
            } else {
                i++;
            }
        }
        Integer numValueOf = Integer.valueOf(i);
        Integer num = numValueOf.intValue() >= 0 ? numValueOf : null;
        if (num != null) {
            getBinding().viewpager.setCurrentItem(num.intValue());
        }
    }

    private final void startHeaderAnimation() {
        ConstraintLayout optionChainMainContent = getBinding().optionChainMainContent;
        Intrinsics.checkNotNullExpressionValue(optionChainMainContent, "optionChainMainContent");
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.optionschain.OptionChainFragment$startHeaderAnimation$$inlined$beginDelayedTransition$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition) {
                IdlingResourceCounters2.increment(IdlingResourceType.DELAYED_TRANSITION);
            }
        });
        transitionSet.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.optionschain.OptionChainFragment$startHeaderAnimation$$inlined$beginDelayedTransition$2
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
                IdlingResourceCounters2.decrement(IdlingResourceType.DELAYED_TRANSITION);
            }
        });
        Fade fade = new Fade();
        fade.addTarget(getBinding().optionChainContractTypeGroup);
        fade.addTarget(getBinding().optionChainSideGroup);
        fade.addTarget(getBinding().rollingPositionContainer);
        transitionSet.addTransition(fade);
        SimpleSlide simpleSlide = new SimpleSlide(48);
        simpleSlide.addTarget(getBinding().optionChainContractTypeGroup);
        simpleSlide.addTarget(getBinding().optionChainSideGroup);
        simpleSlide.addTarget(getBinding().rollingPositionContainer);
        transitionSet.addTransition(simpleSlide);
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.addTarget(getBinding().viewpager);
        transitionSet.addTransition(changeBounds);
        transitionSet.setInterpolator((TimeInterpolator) Interpolators.INSTANCE.getAccelerateDecelerate());
        TransitionManager.beginDelayedTransition(optionChainMainContent, transitionSet);
    }

    @Override // com.robinhood.android.optionschain.OptionContractRowView.Callbacks
    public void onMultiLegAdd(OptionLegBundle optionLegBundle) {
        Intrinsics.checkNotNullParameter(optionLegBundle, "optionLegBundle");
        getDuxo().onMultilegAdd(optionLegBundle);
    }

    @Override // com.robinhood.android.optionschain.OptionContractRowView.Callbacks
    public void onMultiLegRemove(OptionLegBundle optionLegBundle) {
        Intrinsics.checkNotNullParameter(optionLegBundle, "optionLegBundle");
        getDuxo().onMultilegRemove(optionLegBundle);
    }

    @Override // com.robinhood.android.optionschain.OptionContractRowView.Callbacks
    public void onLaunchSingleLegOrder(final OptionLegBundle optionLegBundle) {
        Intrinsics.checkNotNullParameter(optionLegBundle, "optionLegBundle");
        if (getActivity() == null || !isAdded()) {
            return;
        }
        OptionChainLaunchMode.SingleLegAction singleLegAction = ((InternalOptionChainFragmentKey) INSTANCE.getArgs((Fragment) this)).getLaunchMode().getSingleLegAction();
        if (singleLegAction instanceof OptionChainLaunchMode.SingleLegAction.Order) {
            Observable<R> map = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainFragment$onLaunchSingleLegOrder$$inlined$mapNotNull$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.reactivex.functions.Function
                public final Optional<R> apply(T it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Optional3.asOptional(((OptionChainViewState) it).getOptionOrderIntentKey(extensions2.persistentListOf(optionLegBundle)));
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.reactivex.functions.Function
                public /* bridge */ /* synthetic */ Object apply(Object obj) {
                    return apply((OptionChainFragment$onLaunchSingleLegOrder$$inlined$mapNotNull$1<T, R>) obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            Observable observableTake = ObservablesKt.filterIsPresent(map).take(1L);
            Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
            LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainFragment$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionChainFragment.onLaunchSingleLegOrder$lambda$49(this.f$0, (OptionOrderIntentKey.FromOptionOrderBundle) obj);
                }
            });
            return;
        }
        if (singleLegAction instanceof OptionChainLaunchMode.SingleLegAction.Roll) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            fragmentActivityRequireActivity.setResult(-1, ((OptionChainLaunchMode.SingleLegAction.Roll) singleLegAction).getResultData(optionLegBundle.getOptionInstrument()));
            fragmentActivityRequireActivity.finish();
            Intrinsics.checkNotNull(fragmentActivityRequireActivity);
            return;
        }
        if (!Intrinsics.areEqual(singleLegAction, OptionChainLaunchMode.SingleLegAction.None.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onLaunchSingleLegOrder$lambda$49(OptionChainFragment optionChainFragment, OptionOrderIntentKey.FromOptionOrderBundle fromOptionOrderBundle) {
        Navigator navigator = optionChainFragment.getNavigator();
        Context contextRequireContext = optionChainFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Intrinsics.checkNotNull(fromOptionOrderBundle);
        optionChainFragment.startActivityForResult(Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, fromOptionOrderBundle, null, false, 12, null), 1);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.optionschain.OptionContractRowView.Callbacks
    public void showTradeOnExpirationAfterSelloutDialog(final Instant selloutTime) {
        Intrinsics.checkNotNullParameter(selloutTime, "selloutTime");
        Observable<R> map = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainFragment$showTradeOnExpirationAfterSelloutDialog$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(Boolean.valueOf(((OptionChainViewState) it).getInSelloutImprovementExperiment()));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((C24081x1c5aa959<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableTake = ObservablesKt.filterIsPresent(map).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainFragment$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainFragment.showTradeOnExpirationAfterSelloutDialog$lambda$52(this.f$0, selloutTime, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showTradeOnExpirationAfterSelloutDialog$lambda$52(OptionChainFragment optionChainFragment, Instant instant, Boolean bool) {
        int i;
        if (bool.booleanValue()) {
            i = C24135R.string.friday_trading_sellout_alert_description_sellout_improvement;
        } else {
            i = C24135R.string.friday_trading_sellout_alert_description;
        }
        FridayTradingDialogFragment.Companion companion = FridayTradingDialogFragment.INSTANCE;
        Context contextRequireContext = optionChainFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder positiveButton = companion.create(contextRequireContext).setUseDesignSystemOverlay(true).setTitle(C24135R.string.friday_trading_sellout_alert_title, new Object[0]).setMessage(i, Instants2.toEasternTimeString(instant)).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]);
        FragmentManager childFragmentManager = optionChainFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(positiveButton, childFragmentManager, FT_SELLOUT_REMINDER_TAG, false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.optionschain.OptionContractRowView.Callbacks
    public void onLaunchStatisticsDetail(final OptionLegBundle optionLegBundle, final OptionStatisticsTradableState tradableState, boolean hasMarketdata) {
        Intrinsics.checkNotNullParameter(optionLegBundle, "optionLegBundle");
        Intrinsics.checkNotNullParameter(tradableState, "tradableState");
        if (getActivity() == null || !isAdded()) {
            return;
        }
        if (!tradableState.isTradable() || hasMarketdata) {
            Observable<R> map = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainFragment$onLaunchStatisticsDetail$$inlined$mapNotNull$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.reactivex.functions.Function
                public final Optional<R> apply(T it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Optional3.asOptional(((OptionChainViewState) it).getOptionOrderIntentKey(extensions2.persistentListOf(optionLegBundle)));
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.reactivex.functions.Function
                public /* bridge */ /* synthetic */ Object apply(Object obj) {
                    return apply((C24075xc9b9e412<T, R>) obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            Observable observableTake = ObservablesKt.filterIsPresent(map).take(1L);
            Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
            LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainFragment$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionChainFragment.onLaunchStatisticsDetail$lambda$54(this.f$0, optionLegBundle, tradableState, (OptionOrderIntentKey.FromOptionOrderBundle) obj);
                }
            });
            return;
        }
        OptionDetailNoMarketdataBottomSheet optionDetailNoMarketdataBottomSheetNewInstance = OptionDetailNoMarketdataBottomSheet.INSTANCE.newInstance(new OptionDetailNoMarketdataBottomSheet.Args(optionLegBundle));
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        optionDetailNoMarketdataBottomSheetNewInstance.show(childFragmentManager, OPTION_STATISTICS_NO_MARKETDATA_TAG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onLaunchStatisticsDetail$lambda$54(OptionChainFragment optionChainFragment, OptionLegBundle optionLegBundle, OptionStatisticsTradableState optionStatisticsTradableState, OptionOrderIntentKey.FromOptionOrderBundle fromOptionOrderBundle) {
        Navigator navigator = optionChainFragment.getNavigator();
        Context contextRequireContext = optionChainFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Companion companion = INSTANCE;
        optionChainFragment.startActivityForResult(Navigator.DefaultImpls.createIntentForFragment$default(navigator, contextRequireContext, new OptionStatisticsFragmentKey(optionLegBundle, fromOptionOrderBundle, optionStatisticsTradableState, ((InternalOptionChainFragmentKey) companion.getArgs((Fragment) optionChainFragment)).getLaunchMode().getOptionStatisticsLaunchMode(), ((InternalOptionChainFragmentKey) companion.getArgs((Fragment) optionChainFragment)).getLaunchMode().hasFeature(OptionChainLaunchMode.Feature.SIMULATED_RETURN_PRE_TRADE_DEEPLINK)), false, false, false, null, false, false, false, false, false, null, false, 8180, null), 123);
        optionChainFragment.getDuxo().dismissTopTooltipBanner(true);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.optionschain.OptionContractRowView.Callbacks
    public void onWatchlistAddOrRemove(OptionInstrument optionInstrument, OrderSide side, UiOptionChain uiOptionChain, OptionWatchlistItemState state) {
        Intrinsics.checkNotNullParameter(optionInstrument, "optionInstrument");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(uiOptionChain, "uiOptionChain");
        Intrinsics.checkNotNullParameter(state, "state");
        if (getActivity() == null || !isAdded()) {
            return;
        }
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        OptionStrategySecurity optionStrategySecurity = new OptionStrategySecurity(resources, optionInstrument, side, uiOptionChain);
        Screen.Name name = Screen.Name.OPTION_CHAIN;
        String string2 = ((InternalOptionChainFragmentKey) INSTANCE.getArgs((Fragment) this)).getOptionChainId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        Screen screen = new Screen(name, null, string2, null, 10, null);
        int i = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i == 1) {
            OptionsListsQuickAddFragment.removeFromOptionsWatchlist$default(getOptionsListsQuickAddFragment(), optionStrategySecurity, screen, null, 4, null);
        } else if (i == 2) {
            OptionsListsQuickAddFragment.addToOptionsWatchlist$default(getOptionsListsQuickAddFragment(), optionStrategySecurity, screen, null, 4, null);
        } else if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.robinhood.android.optionschain.OptionContractRowView.Callbacks
    public void showWatchlistAddOrRemovePcoErrorDialog() {
        RdsSnackbar.Companion companion = RdsSnackbar.INSTANCE;
        CoordinatorLayout root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        companion.make(root, C24135R.string.option_watchlist_add_remove_pco_error_message, 0).show();
    }

    @Override // com.robinhood.android.optionschain.OptionContractRowView.Callbacks
    public void dismissSwitchFocusedToSbsTooltip() {
        getDuxo().dismissSwitchFocusedToSbsTooltip();
    }

    @Override // com.robinhood.android.optionschain.OptionChainListView.Callbacks
    public void showDoubleTapToWatchUpsell() {
        OptionDoubleTapToWatchBottomSheetFragment optionDoubleTapToWatchBottomSheetFragmentNewInstance = OptionDoubleTapToWatchBottomSheetFragment.INSTANCE.newInstance();
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        optionDoubleTapToWatchBottomSheetFragmentNewInstance.show(childFragmentManager, "doubleTapToWatch");
    }

    @Override // com.robinhood.android.optionschain.OptionChainListView.Callbacks
    public void showSbsChainUpsell(String optionLevel, String chainIdsForLogging) {
        Intrinsics.checkNotNullParameter(chainIdsForLogging, "chainIdsForLogging");
        OptionSideBySideUpsellBottomSheetFragment.Companion companion = OptionSideBySideUpsellBottomSheetFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        OptionSideBySideUpsellBottomSheetFragment optionSideBySideUpsellBottomSheetFragment = (OptionSideBySideUpsellBottomSheetFragment) companion.newInstance((Parcelable) new OptionSideBySideUpsellBottomSheetFragment.Args(DayNightChanges.isDay(ScarletManager2.getScarletManager(contextRequireContext)), optionLevel, chainIdsForLogging));
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        optionSideBySideUpsellBottomSheetFragment.show(childFragmentManager, "sbsChainUpsell");
    }

    @Override // com.robinhood.android.optionschain.OptionChainListView.Callbacks
    public void showIacAlertSheet(IacAlertSheet iacAlertSheet) {
        Intrinsics.checkNotNullParameter(iacAlertSheet, "iacAlertSheet");
        BaseFragmentExtensions.displayIacAlertSheet(this, iacAlertSheet, new Screen(Screen.Name.OPTION_CHAIN_EXPIRATION_PAGE, null, null, null, 14, null));
    }

    @Override // com.robinhood.android.optionschain.OptionChainListView.Callbacks, com.robinhood.android.optionschain.OptionContractRowView.Callbacks
    public void showDiscoverZeroDteBottomSheet(final OptionChain.UnderlyingType underlyingType) {
        Observable<R> map = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainFragment$showDiscoverZeroDteBottomSheet$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                OptionChainViewState optionChainViewState = (OptionChainViewState) it;
                return Optional3.asOptional(new Tuples3(Boolean.valueOf(optionChainViewState.isEtfSupported()), Boolean.valueOf(optionChainViewState.getInSelloutImprovementExperiment()), Boolean.valueOf(optionChainViewState.isMemberPdtRevampV1())));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((C24080x396c4339<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableTake = ObservablesKt.filterIsPresent(map).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainFragment$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainFragment.showDiscoverZeroDteBottomSheet$lambda$56(underlyingType, this, (Tuples3) obj);
            }
        });
        getDuxo().recordSeenDiscoverZeroDteBottomSheet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showDiscoverZeroDteBottomSheet$lambda$56(OptionChain.UnderlyingType underlyingType, OptionChainFragment optionChainFragment, Tuples3 tuples3) {
        OptionDiscoverZeroDteBottomSheetFragment optionDiscoverZeroDteBottomSheetFragmentNewInstance = OptionDiscoverZeroDteBottomSheetFragment.INSTANCE.newInstance(new OptionDiscoverZeroDteBottomSheetFragment.Args(((Boolean) tuples3.component1()).booleanValue(), underlyingType, ((Boolean) tuples3.component2()).booleanValue(), ((Boolean) tuples3.component3()).booleanValue()));
        FragmentManager childFragmentManager = optionChainFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        optionDiscoverZeroDteBottomSheetFragmentNewInstance.show(childFragmentManager, "discoverZeroDte");
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.options.upsell.fridaytrading.OptionDiscoverZeroDteBottomSheetFragment.Callbacks
    public void turnOnTradeOnExpirationSetting() {
        getDuxo().turnOnTradeOnExpirationSettingForDiscoverZeroDte();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showCustomizationPage() {
        if (this.defaultPricingState == OptionDefaultPricingState.NOT_AVAILABLE) {
            return;
        }
        Observable<R> map = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainFragment$showCustomizationPage$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((OptionChainViewState) it).getOptionChainSettingsFragmentKey());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionChainFragment$showCustomizationPage$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableTake = ObservablesKt.filterIsPresent(map).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainFragment$$ExternalSyntheticLambda29
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainFragment.showCustomizationPage$lambda$58(this.f$0, (FragmentKey) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showCustomizationPage$lambda$58(OptionChainFragment optionChainFragment, FragmentKey fragmentKey) {
        ActivityResultLauncher<Intent> activityResultLauncher = optionChainFragment.pricingSettingsLauncher;
        Navigator navigator = optionChainFragment.getNavigator();
        Context contextRequireContext = optionChainFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Intrinsics.checkNotNull(fragmentKey);
        activityResultLauncher.launch(Navigator.DefaultImpls.createIntentForFragment$default(navigator, contextRequireContext, fragmentKey, false, false, false, null, false, true, false, false, false, null, false, 8052, null));
        return Unit.INSTANCE;
    }

    private final void setupComposeOverlay() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        OptionChainActivity optionChainActivity = fragmentActivityRequireActivity instanceof OptionChainActivity ? (OptionChainActivity) fragmentActivityRequireActivity : null;
        if (optionChainActivity == null) {
            return;
        }
        ComposeView composeOverlay = optionChainActivity.getComposeOverlay();
        composeOverlay.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        composeOverlay.setContent(ComposableLambda3.composableLambdaInstance(1894328068, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.OptionChainFragment$setupComposeOverlay$1$1
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
                    ComposerKt.traceEventStart(1894328068, i, -1, "com.robinhood.android.optionschain.OptionChainFragment.setupComposeOverlay.<anonymous>.<anonymous> (OptionChainFragment.kt:1063)");
                }
                this.this$0.BottomSheetOverlay(composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    private final void destroyComposeOverlay() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        OptionChainActivity optionChainActivity = fragmentActivityRequireActivity instanceof OptionChainActivity ? (OptionChainActivity) fragmentActivityRequireActivity : null;
        if (optionChainActivity == null) {
            return;
        }
        optionChainActivity.getComposeOverlay().setContent(ComposableSingletons$OptionChainFragmentKt.INSTANCE.getLambda$2051267481$feature_options_chain_externalDebug());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void BottomSheetOverlay(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-643012739);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-643012739, i2, -1, "com.robinhood.android.optionschain.OptionChainFragment.BottomSheetOverlay (OptionChainFragment.kt:1073)");
            }
            Observable<R> map = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainFragment$BottomSheetOverlay$$inlined$mapDistinctNotNull$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.reactivex.functions.Function
                public final Optional<R> apply(T it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    Account account = ((OptionChainViewState) it).getAccount();
                    return Optional3.asOptional(account != null ? account.getAccountNumber() : null);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.reactivex.functions.Function
                public /* bridge */ /* synthetic */ Object apply(Object obj) {
                    return apply((C24064xaebf26ec<T, R>) obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            Observable observableDistinctUntilChanged = ObservablesKt.filterIsPresent(map).distinctUntilChanged();
            Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
            final SnapshotState4 snapshotState4SubscribeAsState = RxJava2Adapter.subscribeAsState(observableDistinctUntilChanged, null, composerStartRestartGroup, 48);
            Observable<R> map2 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainFragment$BottomSheetOverlay$$inlined$mapDistinctNotNull$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.reactivex.functions.Function
                public final Optional<R> apply(T it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Optional3.asOptional(((OptionChainViewState) it).getShoppingCartConfigData());
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.reactivex.functions.Function
                public /* bridge */ /* synthetic */ Object apply(Object obj) {
                    return apply((C24065xaebf26ed<T, R>) obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
            Observable observableDistinctUntilChanged2 = ObservablesKt.filterIsPresent(map2).distinctUntilChanged();
            Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
            SnapshotState4 snapshotState4SubscribeAsState2 = RxJava2Adapter.subscribeAsState(observableDistinctUntilChanged2, null, composerStartRestartGroup, 48);
            Observable<R> map3 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainFragment$BottomSheetOverlay$$inlined$mapDistinctNotNull$3
                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.reactivex.functions.Function
                public final Optional<R> apply(T it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Optional3.asOptional(((OptionChainViewState) it).getDefaultPricingState());
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.reactivex.functions.Function
                public /* bridge */ /* synthetic */ Object apply(Object obj) {
                    return apply((C24066xaebf26ee<T, R>) obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
            Observable observableDistinctUntilChanged3 = ObservablesKt.filterIsPresent(map3).distinctUntilChanged();
            Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged3, "distinctUntilChanged(...)");
            final SnapshotState4 snapshotState4SubscribeAsState3 = RxJava2Adapter.subscribeAsState(observableDistinctUntilChanged3, this.defaultPricingState, composerStartRestartGroup, 0);
            final OptionChainViewState.ShoppingCartConfigData shoppingCartConfigDataBottomSheetOverlay$lambda$63 = BottomSheetOverlay$lambda$63(snapshotState4SubscribeAsState2);
            if (BottomSheetOverlay$lambda$61(snapshotState4SubscribeAsState) != null) {
                CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{LocalViewModelStoreOwner.INSTANCE.provides(this), LocalNavigator.getLocalNavigator().provides(getNavigator())}, ComposableLambda3.rememberComposableLambda(1903257368, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.OptionChainFragment.BottomSheetOverlay.1

                    /* compiled from: OptionChainFragment.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.optionschain.OptionChainFragment$BottomSheetOverlay$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ SnapshotState4<String> $accountNumber$delegate;
                        final /* synthetic */ OptionChainViewState.ShoppingCartConfigData $config;
                        final /* synthetic */ SnapshotState4<OptionDefaultPricingState> $defaultPricingState$delegate;
                        final /* synthetic */ OptionChainFragment this$0;

                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass1(OptionChainViewState.ShoppingCartConfigData shoppingCartConfigData, OptionChainFragment optionChainFragment, SnapshotState4<String> snapshotState4, SnapshotState4<? extends OptionDefaultPricingState> snapshotState42) {
                            this.$config = shoppingCartConfigData;
                            this.this$0 = optionChainFragment;
                            this.$accountNumber$delegate = snapshotState4;
                            this.$defaultPricingState$delegate = snapshotState42;
                        }

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
                                ComposerKt.traceEventStart(355784400, i, -1, "com.robinhood.android.optionschain.OptionChainFragment.BottomSheetOverlay.<anonymous>.<anonymous> (OptionChainFragment.kt:1088)");
                            }
                            String strBottomSheetOverlay$lambda$61 = OptionChainFragment.BottomSheetOverlay$lambda$61(this.$accountNumber$delegate);
                            OptionChainViewState.ShoppingCartConfigData shoppingCartConfigData = this.$config;
                            OptionOrderIntentKey.FromOptionOrderBundle optionOrderIntentKey = shoppingCartConfigData != null ? shoppingCartConfigData.getOptionOrderIntentKey() : null;
                            OptionDefaultPricingState optionDefaultPricingStateBottomSheetOverlay$lambda$65 = OptionChainFragment.BottomSheetOverlay$lambda$65(this.$defaultPricingState$delegate);
                            Screen.Name name = Screen.Name.OPTION_CHAIN;
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer.changedInstance(this.this$0);
                            final OptionChainFragment optionChainFragment = this.this$0;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.android.optionschain.OptionChainFragment$BottomSheetOverlay$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return OptionChainFragment.C240841.AnonymousClass1.invoke$lambda$1$lambda$0(optionChainFragment, (Intent) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            Function1 function1 = (Function1) objRememberedValue;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance2 = composer.changedInstance(this.this$0);
                            final OptionChainFragment optionChainFragment2 = this.this$0;
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function3() { // from class: com.robinhood.android.optionschain.OptionChainFragment$BottomSheetOverlay$1$1$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                                        return OptionChainFragment.C240841.AnonymousClass1.invoke$lambda$3$lambda$2(optionChainFragment2, ((Boolean) obj).booleanValue(), (OptionLegBundle) obj2, (BidAskCellDisableType) obj3);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            composer.endReplaceGroup();
                            final OptionChainFragment optionChainFragment3 = this.this$0;
                            OptionChainBottomSheetScaffoldKt.m17158OptionChainBottomSheetScaffoldTCVpFMg(strBottomSheetOverlay$lambda$61, optionDefaultPricingStateBottomSheetOverlay$lambda$65, optionOrderIntentKey, function1, name, false, null, null, 0.0f, null, (Function3) objRememberedValue2, null, ComposableLambda3.rememberComposableLambda(1080997937, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.OptionChainFragment.BottomSheetOverlay.1.1.3
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer2, Integer num) {
                                    invoke(paddingValues, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(PaddingValues paddingValues, Composer composer2, int i2) {
                                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                    if ((i2 & 6) == 0) {
                                        i2 |= composer2.changed(paddingValues) ? 4 : 2;
                                    }
                                    if ((i2 & 19) == 18 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1080997937, i2, -1, "com.robinhood.android.optionschain.OptionChainFragment.BottomSheetOverlay.<anonymous>.<anonymous>.<anonymous> (OptionChainFragment.kt:1113)");
                                    }
                                    int iMo5016toPx0680j_4 = (int) ((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(paddingValues.getBottom());
                                    Integer numValueOf = Integer.valueOf(iMo5016toPx0680j_4);
                                    composer2.startReplaceGroup(-1633490746);
                                    boolean zChangedInstance3 = composer2.changedInstance(optionChainFragment3) | composer2.changed(iMo5016toPx0680j_4);
                                    OptionChainFragment optionChainFragment4 = optionChainFragment3;
                                    Object objRememberedValue3 = composer2.rememberedValue();
                                    if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = new OptionChainFragment$BottomSheetOverlay$1$1$3$1$1(optionChainFragment4, iMo5016toPx0680j_4, null);
                                        composer2.updateRememberedValue(objRememberedValue3);
                                    }
                                    composer2.endReplaceGroup();
                                    EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer, 54), composer, 221184, 384, 3008);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(OptionChainFragment optionChainFragment, Intent intent) {
                            Intrinsics.checkNotNullParameter(intent, "intent");
                            optionChainFragment.optionOrderLauncher.launch(intent);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$3$lambda$2(OptionChainFragment optionChainFragment, boolean z, OptionLegBundle optionLegBundle, BidAskCellDisableType bidAskCellDisableType) {
                            OptionWatchlistItemState optionWatchlistItemState;
                            if (optionLegBundle != null) {
                                OptionInstrument optionInstrument = optionLegBundle.getOptionInstrument();
                                OrderSide optionSide = optionLegBundle.getOptionConfigurationBundle().getOptionSide();
                                UiOptionChain uiOptionChain = optionLegBundle.getOptionConfigurationBundle().getOptionChainBundle().getUiOptionChain();
                                if (z) {
                                    optionWatchlistItemState = OptionWatchlistItemState.ADDED;
                                } else {
                                    optionWatchlistItemState = OptionWatchlistItemState.NOT_ADDED;
                                }
                                optionChainFragment.onWatchlistAddOrRemove(optionInstrument, optionSide, uiOptionChain, optionWatchlistItemState);
                            }
                            return Unit.INSTANCE;
                        }
                    }

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
                            ComposerKt.traceEventStart(1903257368, i3, -1, "com.robinhood.android.optionschain.OptionChainFragment.BottomSheetOverlay.<anonymous> (OptionChainFragment.kt:1087)");
                        }
                        BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(355784400, true, new AnonymousClass1(shoppingCartConfigDataBottomSheetOverlay$lambda$63, this, snapshotState4SubscribeAsState, snapshotState4SubscribeAsState3), composer2, 54), composer2, 100663296, 255);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            } else {
                ConstraintLayout optionChainMainContent = getBinding().optionChainMainContent;
                Intrinsics.checkNotNullExpressionValue(optionChainMainContent, "optionChainMainContent");
                ViewsKt.setBottomPadding(optionChainMainContent, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.OptionChainFragment$$ExternalSyntheticLambda31
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionChainFragment.BottomSheetOverlay$lambda$66(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindToolbar(final OptionChainToolbarState state) {
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar == null) {
            return;
        }
        try {
            rhToolbar.setTitle(state.getTitle());
            rhToolbar.setSubtitle(state.getSubtitle());
            ComposeView composeView = this.toolbarView;
            if (composeView != null) {
                composeView.setContent(ComposableLambda3.composableLambdaInstance(-534304134, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.OptionChainFragment.bindToolbar.1
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
                            ComposerKt.traceEventStart(-534304134, i, -1, "com.robinhood.android.optionschain.OptionChainFragment.bindToolbar.<anonymous> (OptionChainFragment.kt:1135)");
                        }
                        OptionChainFragment.this.ToolbarMenuComposable(state.getMenuState(), state.getShouldDismissSelloutSnackbar(), composer, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
            }
        } catch (IllegalStateException e) {
            Timber.INSTANCE.mo3355e(e, "Safely catching toolbar exceptions", new Object[0]);
        }
    }

    public final void setupToolbar(boolean isOnboardingSearchSelectorVisible) {
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar == null) {
            return;
        }
        OptionChainViewState value = getDuxo().getStatesFlow().getValue();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        OptionChainToolbarState toolbarState = value.getToolbarState(resources, getClock());
        configureToolbar(rhToolbar);
        bindToolbar(toolbarState);
        getDuxo().setIsOnboardingSearchSelectorVisible(isOnboardingSearchSelectorVisible);
    }

    /* compiled from: OptionChainFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.optionschain.OptionChainFragment$ToolbarMenuComposable$1 */
    static final class C240851 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ boolean $shouldDismissSelloutSnackbar;
        final /* synthetic */ OptionChainToolbarMenuState $state;
        final /* synthetic */ OptionChainFragment this$0;

        C240851(OptionChainToolbarMenuState optionChainToolbarMenuState, OptionChainFragment optionChainFragment, boolean z) {
            this.$state = optionChainToolbarMenuState;
            this.this$0 = optionChainFragment;
            this.$shouldDismissSelloutSnackbar = z;
        }

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
                ComposerKt.traceEventStart(1841311393, i, -1, "com.robinhood.android.optionschain.OptionChainFragment.ToolbarMenuComposable.<anonymous> (OptionChainFragment.kt:1153)");
            }
            OptionChainToolbarMenuState optionChainToolbarMenuState = this.$state;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(this.this$0);
            final OptionChainFragment optionChainFragment = this.this$0;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.optionschain.OptionChainFragment$ToolbarMenuComposable$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionChainFragment.C240851.invoke$lambda$1$lambda$0(optionChainFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$shouldDismissSelloutSnackbar) | composer.changedInstance(this.this$0);
            final boolean z = this.$shouldDismissSelloutSnackbar;
            final OptionChainFragment optionChainFragment2 = this.this$0;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.optionschain.OptionChainFragment$ToolbarMenuComposable$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionChainFragment.C240851.invoke$lambda$5$lambda$4(z, optionChainFragment2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function0 function02 = (Function0) objRememberedValue2;
            composer.endReplaceGroup();
            int settingGreenDotRemainingBlinks = this.this$0.getDuxo().getStatesFlow().getValue().getSettingGreenDotRemainingBlinks();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(this.this$0);
            final OptionChainFragment optionChainFragment3 = this.this$0;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.optionschain.OptionChainFragment$ToolbarMenuComposable$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionChainFragment.C240851.invoke$lambda$7$lambda$6(optionChainFragment3);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            OptionChainFragmentToolbarMenu.OptionChainFragmentToolbarMenu(optionChainToolbarMenuState, function0, function02, settingGreenDotRemainingBlinks, (Function0) objRememberedValue3, null, composer, 0, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(OptionChainFragment optionChainFragment) {
            optionChainFragment.getDuxo().clearMultilegSelection();
            optionChainFragment.getDuxo().logMultilegClearTap();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(boolean z, final OptionChainFragment optionChainFragment) {
            if (z) {
                optionChainFragment.getDuxo().dismissSelloutSnackbar();
            }
            optionChainFragment.getDuxo().logOptionChainSettingsTap();
            if (optionChainFragment.defaultPricingState != OptionDefaultPricingState.NOT_AVAILABLE) {
                Observable<R> map = optionChainFragment.getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainFragment$ToolbarMenuComposable$1$invoke$lambda$5$lambda$4$$inlined$mapNotNull$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // io.reactivex.functions.Function
                    public final Optional<R> apply(T it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Optional3.asOptional(((OptionChainViewState) it).getOptionChainSettingsFragmentKey());
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // io.reactivex.functions.Function
                    public /* bridge */ /* synthetic */ Object apply(Object obj) {
                        return apply((C24074xc0a6d533<T, R>) obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                Observable observableTake = ObservablesKt.filterIsPresent(map).take(1L);
                Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
                LifecycleHost.DefaultImpls.bind$default(optionChainFragment, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainFragment$ToolbarMenuComposable$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionChainFragment.C240851.invoke$lambda$5$lambda$4$lambda$3(optionChainFragment, (FragmentKey) obj);
                    }
                });
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4$lambda$3(OptionChainFragment optionChainFragment, FragmentKey fragmentKey) {
            ActivityResultLauncher activityResultLauncher = optionChainFragment.pricingSettingsLauncher;
            Navigator navigator = optionChainFragment.getNavigator();
            Context contextRequireContext = optionChainFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Intrinsics.checkNotNull(fragmentKey);
            activityResultLauncher.launch(Navigator.DefaultImpls.createIntentForFragment$default(navigator, contextRequireContext, fragmentKey, false, false, false, null, false, true, false, false, false, null, false, 8052, null));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$6(OptionChainFragment optionChainFragment) {
            optionChainFragment.getDuxo().decrementNuxBlink();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ToolbarMenuComposable(final OptionChainToolbarMenuState optionChainToolbarMenuState, final boolean z, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-656922385);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(optionChainToolbarMenuState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-656922385, i2, -1, "com.robinhood.android.optionschain.OptionChainFragment.ToolbarMenuComposable (OptionChainFragment.kt:1151)");
            }
            BentoTheme2.BentoTheme(ScarletComposeInterop.themeChangesForCompose(getScarletManager()), null, ComposableLambda3.rememberComposableLambda(1841311393, true, new C240851(optionChainToolbarMenuState, this, z), composerStartRestartGroup, 54), composerStartRestartGroup, 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.OptionChainFragment$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionChainFragment.ToolbarMenuComposable$lambda$67(this.f$0, optionChainToolbarMenuState, z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.optionschain.OptionChainListView.Callbacks
    public void onSelloutSnackbarDismissed() {
        getDuxo().markSelloutSnackbarDismissedOrElapsed();
        getDuxo().cancelSnackbarTimer();
    }

    @Override // com.robinhood.android.optionschain.OptionChainListView.Callbacks
    public void onSelloutSnackbarTimerStarted() {
        getDuxo().startSelloutSnackbarTimer();
    }

    /* compiled from: OptionChainFragment.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionChainFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/optionschain/OptionChainFragment;", "Lcom/robinhood/android/options/contracts/InternalOptionChainFragmentKey;", "<init>", "()V", "OPTION_ORDER_REQUEST_CODE", "", "OPTION_STATISTICS_REQUEST_CODE", "VIEW_TYPE_OPTION_EXPIRATION_DATE_PAGE", "VIEW_TYPE_BUILDER_PAGE", "FT_SELLOUT_REMINDER_TAG", "", "OPTION_STATISTICS_NO_MARKETDATA_TAG", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<OptionChainFragment, InternalOptionChainFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(InternalOptionChainFragmentKey internalOptionChainFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, internalOptionChainFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public InternalOptionChainFragmentKey getArgs(OptionChainFragment optionChainFragment) {
            return (InternalOptionChainFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, optionChainFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OptionChainFragment newInstance(InternalOptionChainFragmentKey internalOptionChainFragmentKey) {
            return (OptionChainFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, internalOptionChainFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OptionChainFragment optionChainFragment, InternalOptionChainFragmentKey internalOptionChainFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, optionChainFragment, internalOptionChainFragmentKey);
        }
    }
}
