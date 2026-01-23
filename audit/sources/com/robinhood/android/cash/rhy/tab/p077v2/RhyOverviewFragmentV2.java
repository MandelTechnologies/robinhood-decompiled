package com.robinhood.android.cash.rhy.tab.p077v2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier7;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.paging.Pager;
import androidx.paging.PagingData;
import androidx.paging.compose.LazyPagingItems;
import androidx.paging.compose.LazyPagingItems5;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.cash.lib.atm.p072ui.AtmMiniFinderComposable;
import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.android.cash.rhy.tab.p077v2.RhyOverviewV2ViewState;
import com.robinhood.android.cash.rhy.tab.p077v2.logging.RhyEventLoggingUtils;
import com.robinhood.android.cash.rhy.tab.p077v2.p078ui.RhyOverviewAccountSectionComposable5;
import com.robinhood.android.cash.rhy.tab.p077v2.p078ui.RhyOverviewActionBar;
import com.robinhood.android.cash.rhy.tab.p077v2.p078ui.RhyOverviewCashCardOffersComposable;
import com.robinhood.android.cash.rhy.tab.p077v2.p078ui.RhyOverviewHeaderComposable;
import com.robinhood.android.cash.rhy.tab.p077v2.p078ui.RhyOverviewHistoryComposable3;
import com.robinhood.android.cash.rhy.tab.p077v2.p078ui.RhyPaycheckModuleComposable;
import com.robinhood.android.cash.rhy.tab.p077v2.p078ui.RhyTopAppBar4;
import com.robinhood.android.cash.rhy.tab.p077v2.p078ui.RhyTopAppBar5;
import com.robinhood.android.cash.rhy.tab.p077v2.p078ui.banner.RhyOverviewBannerState;
import com.robinhood.android.cash.rhy.tab.p077v2.p078ui.banner.RhyOverviewBannersComposable;
import com.robinhood.android.cash.rhy.tab.p077v2.p078ui.fixedPercent.FixedPercentOfferBottomSheetFragment;
import com.robinhood.android.cash.rhy.tab.p077v2.p078ui.footer.RhyOverviewFooterComposable;
import com.robinhood.android.cash.rhy.tab.p077v2.prefs.PaycheckModuleInfoBannerDismissTimeoutsPref;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.history.p082ui.HistoryRow3;
import com.robinhood.android.common.history.p082ui.HistoryRowCallbackExtensions;
import com.robinhood.android.common.history.p082ui.HistoryRowsCallbacks;
import com.robinhood.android.common.history.p082ui.UnifiedHistoryView;
import com.robinhood.android.common.mcduckling.requirements.McDucklingDeepLinkHandler;
import com.robinhood.android.common.mcduckling.requirements.McDucklingDeepLinkHandler2;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.tabs.Scrollable;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.deeplink.DeepLinkPath;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.googlepay.GooglePayPushTokenizeManager;
import com.robinhood.android.lib.stepupverification.SuvLauncher;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.redesign.accounttab.AccountSelectorTabArgs;
import com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabEmbeddedListStateProvider;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.android.rhy.contracts.FlatCashbackOnboardingContract;
import com.robinhood.android.rhy.contracts.RhyReferrerLandingKey;
import com.robinhood.android.rhyrewards.p246ui.CashCardOffer;
import com.robinhood.android.rhyrewards.p246ui.MerchantRewardsOfferDetailsBottomSheet;
import com.robinhood.android.search.contracts.SearchFragmentKey;
import com.robinhood.android.social.contracts.PendingTransactionsFragmentKey;
import com.robinhood.android.social.contracts.matcha.MatchaTransaction;
import com.robinhood.android.transfers.contracts.Transfer;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.component.TopBarScrollState;
import com.robinhood.compose.bento.component.TopBarScrollState3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.duxo.ComposeUiEvent;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.logging.RhyGlobalLoggingContext;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.minerva.VerificationRequiredException;
import com.robinhood.models.p320db.IacInfoBanner;
import com.robinhood.models.p320db.bonfire.RhyPaycheckModule;
import com.robinhood.models.p320db.mcduckling.MerchantOfferV2;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.prefs.StringToLongMapPreference;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.rosetta.eventlogging.PaycheckSectionContext;
import com.robinhood.rosetta.eventlogging.RHYContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.shared.history.navigation.HistoryNavigator;
import com.robinhood.shared.home.contracts.TabLinkIntentKey;
import com.robinhood.shared.iac.infobanner.InfoBannerCallbacks;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.robinhood.targetbackend.TargetBackend;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.resource.StringResource;
import io.noties.markwon.Markwon;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Supervisor3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow2;
import p479j$.time.Clock;

/* compiled from: RhyOverviewFragmentV2.kt */
@Metadata(m3635d1 = {"\u0000¸\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 ®\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t:\u0002®\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010[\u001a\u00020Z2\b\u0010\\\u001a\u0004\u0018\u00010]H\u0016J\u0010\u0010^\u001a\u00020Z2\u0006\u0010_\u001a\u00020`H\u0016J\u001a\u0010a\u001a\u00020Z2\u0006\u0010b\u001a\u00020c2\b\u0010\\\u001a\u0004\u0018\u00010]H\u0017J\r\u0010d\u001a\u00020ZH\u0017¢\u0006\u0002\u0010eJ\u001c\u0010f\u001a\u00020\u00152\b\b\u0001\u0010g\u001a\u00020h2\b\u0010i\u001a\u0004\u0018\u00010]H\u0016J\u0010\u0010j\u001a\u00020Z2\u0006\u0010k\u001a\u00020]H\u0016J\u0014\u0010l\u001a\u00020Z2\n\b\u0002\u0010m\u001a\u0004\u0018\u00010nH\u0002J\b\u0010o\u001a\u00020ZH\u0017J\b\u0010p\u001a\u00020ZH\u0016J\b\u0010q\u001a\u00020ZH\u0016J\u0010\u0010r\u001a\u00020Z2\u0006\u0010s\u001a\u00020tH\u0016J\b\u0010u\u001a\u00020ZH\u0016J\b\u0010v\u001a\u00020ZH\u0016J\u0010\u0010w\u001a\u00020Z2\u0006\u0010x\u001a\u00020yH\u0016J\u0010\u0010z\u001a\u00020Z2\u0006\u0010{\u001a\u00020|H\u0002J*\u0010}\u001a\u00020Z2\b\b\u0002\u0010~\u001a\u00020\u007f2\b\u0010\u0080\u0001\u001a\u00030\u0081\u00012\u0006\u0010{\u001a\u00020|H\u0003¢\u0006\u0003\u0010\u0082\u0001J5\u0010\u0083\u0001\u001a\u00020Z*\u00030\u0084\u00012\u001d\u0010\u0085\u0001\u001a\u0018\u0012\u0011\u0012\u000f\u0012\u0005\u0012\u00030\u0088\u00010\u0087\u0001j\u0003`\u0089\u0001\u0018\u00010\u0086\u00012\u0006\u0010{\u001a\u00020|H\u0002J\u0011\u0010\u008a\u0001\u001a\u00020Z2\u0006\u0010{\u001a\u00020|H\u0002J\u0019\u0010\u008b\u0001\u001a\u00020Z2\b\u0010\u008c\u0001\u001a\u00030\u008d\u0001H\u0003¢\u0006\u0003\u0010\u008e\u0001J\u0017\u0010\u008f\u0001\u001a\u00020Z2\u0006\u0010{\u001a\u00020|H\u0003¢\u0006\u0003\u0010\u0090\u0001J\u0017\u0010\u0091\u0001\u001a\u00020Z2\u0006\u0010{\u001a\u00020|H\u0003¢\u0006\u0003\u0010\u0090\u0001J\u0017\u0010\u0092\u0001\u001a\u00020Z2\u0006\u0010{\u001a\u00020|H\u0003¢\u0006\u0003\u0010\u0090\u0001J\u0011\u0010\u0093\u0001\u001a\u00020Z2\u0006\u0010g\u001a\u00020hH\u0016J\u0012\u0010\u0094\u0001\u001a\u00020Z2\u0007\u0010x\u001a\u00030\u0095\u0001H\u0002J\u0012\u0010\u0096\u0001\u001a\u00020Z2\u0007\u0010\u0097\u0001\u001a\u00020yH\u0002J\t\u0010\u0098\u0001\u001a\u00020ZH\u0002J\u0011\u0010\u0099\u0001\u001a\u00020Z2\u0006\u0010{\u001a\u00020|H\u0002J\u0013\u0010\u009a\u0001\u001a\u00020Z2\b\u0010\u009b\u0001\u001a\u00030\u009c\u0001H\u0002J\u0017\u0010\u009d\u0001\u001a\u00020Z2\u0006\u0010{\u001a\u00020|H\u0003¢\u0006\u0003\u0010\u0090\u0001J\u0011\u0010\u009e\u0001\u001a\u00020Z2\u0006\u0010{\u001a\u00020|H\u0002J\u000e\u0010\u009f\u0001\u001a\u00020ZH\u0003¢\u0006\u0002\u0010eJ\u001b\u0010 \u0001\u001a\u00020Z2\n\u0010¡\u0001\u001a\u0005\u0018\u00010¢\u0001H\u0003¢\u0006\u0003\u0010£\u0001J\t\u0010¤\u0001\u001a\u00020ZH\u0002J\t\u0010¥\u0001\u001a\u00020ZH\u0016J\t\u0010¦\u0001\u001a\u00020ZH\u0016J\t\u0010§\u0001\u001a\u00020ZH\u0002J\n\u0010¨\u0001\u001a\u00020\u0015H\u0096\u0001R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010'\u001a\u00020(8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001e\u0010-\u001a\u00020.8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001e\u00103\u001a\u0002048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001e\u00109\u001a\u00020:8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001e\u0010?\u001a\u00020@8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001e\u0010E\u001a\u00020F8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001e\u0010K\u001a\u00020L8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u0014\u0010Q\u001a\u00020\u0015X\u0096D¢\u0006\b\n\u0000\u001a\u0004\bR\u0010\u0017R\u0014\u0010S\u001a\u00020\u0015X\u0096D¢\u0006\b\n\u0000\u001a\u0004\bT\u0010\u0017R\u0014\u0010U\u001a\u00020\u0015X\u0096D¢\u0006\b\n\u0000\u001a\u0004\bV\u0010\u0017R \u0010W\u001a\u0014\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020Z0XX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010©\u0001\u001a\n\u0012\u0005\u0012\u00030«\u00010ª\u0001X\u0096\u0005¢\u0006\b\u001a\u0006\b¬\u0001\u0010\u00ad\u0001¨\u0006¯\u0001²\u0006\u000b\u0010°\u0001\u001a\u00020|X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/RhyOverviewFragmentV2;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/common/history/ui/UnifiedHistoryView$Callbacks;", "Lcom/robinhood/android/rhyrewards/ui/MerchantRewardsOfferDetailsBottomSheet$Callbacks;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnClickListener;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment$OnDismissListener;", "Lcom/robinhood/android/common/ui/tabs/Scrollable;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/RhyTopAppBarCallbacks;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventData", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "getScreenEventData", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "excludeFromAutoScreenEventLogging", "", "getExcludeFromAutoScreenEventLogging", "()Z", "duxo", "Lcom/robinhood/android/cash/rhy/tab/v2/RhyOverviewV2Duxo;", "getDuxo", "()Lcom/robinhood/android/cash/rhy/tab/v2/RhyOverviewV2Duxo;", "duxo$delegate", "Lkotlin/Lazy;", "googlePayPushTokenizeManager", "Lcom/robinhood/android/googlepay/GooglePayPushTokenizeManager;", "isDialogCurrentlyDisplayed", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "getImageLoader", "()Lcom/robinhood/android/rhimage/ImageLoader;", "setImageLoader", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", "mediaImageLoader", "Lcoil/ImageLoader;", "getMediaImageLoader", "()Lcoil/ImageLoader;", "setMediaImageLoader", "(Lcoil/ImageLoader;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "getTargetBackend", "()Lcom/robinhood/targetbackend/TargetBackend;", "setTargetBackend", "(Lcom/robinhood/targetbackend/TargetBackend;)V", "rhyGlobalLoggingContext", "Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;", "getRhyGlobalLoggingContext", "()Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;", "setRhyGlobalLoggingContext", "(Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;)V", "historyNavigator", "Lcom/robinhood/shared/history/navigation/HistoryNavigator;", "getHistoryNavigator", "()Lcom/robinhood/shared/history/navigation/HistoryNavigator;", "setHistoryNavigator", "(Lcom/robinhood/shared/history/navigation/HistoryNavigator;)V", "paycheckModuleInfoBannerDismissTimeoutsPref", "Lcom/robinhood/prefs/StringToLongMapPreference;", "getPaycheckModuleInfoBannerDismissTimeoutsPref", "()Lcom/robinhood/prefs/StringToLongMapPreference;", "setPaycheckModuleInfoBannerDismissTimeoutsPref", "(Lcom/robinhood/prefs/StringToLongMapPreference;)V", "hasBottomBar", "getHasBottomBar", "useDesignSystemToolbar", "getUseDesignSystemToolbar", "childFragmentsShouldNotConfigureToolbar", "getChildFragmentsShouldNotConfigureToolbar", "launchSuv", "Lkotlin/Function2;", "Ljava/util/UUID;", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onAttach", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onPositiveButtonClicked", "id", "", "passthroughArgs", "onSaveInstanceState", "outState", "openCardSettings", "action", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RhyCardSettings$Action;", "onStart", "onResume", "onPause", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "scrollToTop", "onRecentHistoryShowAllClicked", "onRadTaskCompleted", "offer", "Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;", "bind", "state", "Lcom/robinhood/android/cash/rhy/tab/v2/RhyOverviewV2ViewState;", "ScrollContent", "modifier", "Landroidx/compose/ui/Modifier;", "listState", "Landroidx/compose/foundation/lazy/LazyListState;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Lcom/robinhood/android/cash/rhy/tab/v2/RhyOverviewV2ViewState;Landroidx/compose/runtime/Composer;II)V", AnalyticsStrings.BUTTON_GROUP_TITLE_HISTORY, "Landroidx/compose/foundation/lazy/LazyListScope;", "historyItems", "Landroidx/paging/compose/LazyPagingItems;", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "Lcom/robinhood/shared/models/history/shared/GenericStatefulHistoryEvent;", "bindGooglePay", "PaycheckModule", "paycheckModule", "Lcom/robinhood/models/db/bonfire/RhyPaycheckModule;", "(Lcom/robinhood/models/db/bonfire/RhyPaycheckModule;Landroidx/compose/runtime/Composer;I)V", "AccountSection", "(Lcom/robinhood/android/cash/rhy/tab/v2/RhyOverviewV2ViewState;Landroidx/compose/runtime/Composer;I)V", "Offers", "Banners", "onBottomSheetDismissed", "onClickCashCardOffer", "Lcom/robinhood/android/rhyrewards/ui/CashCardOffer;", "showMerchantRewardsOfferDetailsSheet", "merchantOffer", "onClickSettings", "onDirectDepositClick", "showTransferMoney", "entryPoint", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "Header", "bindBottomSheets", "AtmMiniFinder", "ActionBar", "directDepositRowIntentKey", "Lcom/robinhood/android/navigation/keys/IntentKey;", "(Lcom/robinhood/android/navigation/keys/IntentKey;Landroidx/compose/runtime/Composer;I)V", "showDebugAddCardToGooglePay", "onMessagesClicked", "onSearchClicked", "onClickRhyReferrals", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-cash-rhy-tab_externalDebug", "viewState"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class RhyOverviewFragmentV2 extends GenericComposeFragment implements RegionGated, UnifiedHistoryView.Callbacks, MerchantRewardsOfferDetailsBottomSheet.Callbacks, RhDialogFragment.OnClickListener, AutoLoggableFragment, BaseBottomSheetDialogFragment.OnDismissListener, Scrollable, RhyTopAppBar4 {
    private static final String DIALOG_CURRENTLY_DISPLAYED = "rhyTabDialogCurrentlyDisplayed";
    private static final String FUNDING_BOTTOM_SHEET_TAG = "fundingBottomSheet";
    private static final int REQUEST_PUSH_TOKENIZE = 1;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
    private final boolean childFragmentsShouldNotConfigureToolbar;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    private final Screen eventScreen;
    private final boolean excludeFromAutoScreenEventLogging;
    private final GooglePayPushTokenizeManager googlePayPushTokenizeManager;
    private final boolean hasBottomBar;
    public HistoryNavigator historyNavigator;
    public ImageLoader imageLoader;
    private boolean isDialogCurrentlyDisplayed;
    private final Function2<UUID, Boolean, Unit> launchSuv;
    public Markwon markwon;
    public coil.ImageLoader mediaImageLoader;

    @PaycheckModuleInfoBannerDismissTimeoutsPref
    public StringToLongMapPreference paycheckModuleInfoBannerDismissTimeoutsPref;
    public RhyGlobalLoggingContext rhyGlobalLoggingContext;
    private final UserInteractionEventData screenEventData;
    public TargetBackend targetBackend;
    private final boolean useDesignSystemToolbar;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final float BOTTOM_OFFSET_FOR_DEBIT_CARD_VIEW = C2002Dp.m7995constructorimpl(80);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSection$lambda$24(RhyOverviewFragmentV2 rhyOverviewFragmentV2, RhyOverviewV2ViewState rhyOverviewV2ViewState, int i, Composer composer, int i2) {
        rhyOverviewFragmentV2.AccountSection(rhyOverviewV2ViewState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ActionBar$lambda$49(RhyOverviewFragmentV2 rhyOverviewFragmentV2, IntentKey intentKey, int i, Composer composer, int i2) {
        rhyOverviewFragmentV2.ActionBar(intentKey, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AtmMiniFinder$lambda$39(RhyOverviewFragmentV2 rhyOverviewFragmentV2, int i, Composer composer, int i2) {
        rhyOverviewFragmentV2.AtmMiniFinder(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Banners$lambda$31(RhyOverviewFragmentV2 rhyOverviewFragmentV2, RhyOverviewV2ViewState rhyOverviewV2ViewState, int i, Composer composer, int i2) {
        rhyOverviewFragmentV2.Banners(rhyOverviewV2ViewState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$4(RhyOverviewFragmentV2 rhyOverviewFragmentV2, int i, Composer composer, int i2) {
        rhyOverviewFragmentV2.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Header$lambda$36(RhyOverviewFragmentV2 rhyOverviewFragmentV2, RhyOverviewV2ViewState rhyOverviewV2ViewState, int i, Composer composer, int i2) {
        rhyOverviewFragmentV2.Header(rhyOverviewV2ViewState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Offers$lambda$28(RhyOverviewFragmentV2 rhyOverviewFragmentV2, RhyOverviewV2ViewState rhyOverviewV2ViewState, int i, Composer composer, int i2) {
        rhyOverviewFragmentV2.Offers(rhyOverviewV2ViewState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PaycheckModule$lambda$19(RhyOverviewFragmentV2 rhyOverviewFragmentV2, RhyPaycheckModule rhyPaycheckModule, int i, Composer composer, int i2) {
        rhyOverviewFragmentV2.PaycheckModule(rhyPaycheckModule, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScrollContent$lambda$12(RhyOverviewFragmentV2 rhyOverviewFragmentV2, Modifier modifier, LazyListState lazyListState, RhyOverviewV2ViewState rhyOverviewV2ViewState, int i, int i2, Composer composer, int i3) {
        rhyOverviewFragmentV2.ScrollContent(modifier, lazyListState, rhyOverviewV2ViewState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
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
    public static final RhyOverviewV2ViewState ComposeContent$lambda$3(SnapshotState4<RhyOverviewV2ViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    @Override // com.robinhood.android.common.history.ui.UnifiedHistoryView.Callbacks
    public void doOnTransactionDetailRequested(HistoryEvent historyEvent) {
        UnifiedHistoryView.Callbacks.DefaultImpls.doOnTransactionDetailRequested(this, historyEvent);
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

    @Override // com.robinhood.android.common.history.ui.UnifiedHistoryView.Callbacks
    public void onSummaryBadgeClicked(HistoryEvent historyEvent) {
        UnifiedHistoryView.Callbacks.DefaultImpls.onSummaryBadgeClicked(this, historyEvent);
    }

    public RhyOverviewFragmentV2() {
        RhyEventLoggingUtils rhyEventLoggingUtils = RhyEventLoggingUtils.INSTANCE;
        this.eventScreen = rhyEventLoggingUtils.getRhyTabScreen();
        this.screenEventData = new UserInteractionEventData(null, getEventScreen(), null, null, rhyEventLoggingUtils.getRhyTabContext(), null, null, 109, null);
        this.excludeFromAutoScreenEventLogging = true;
        this.duxo = OldDuxos.oldDuxo(this, RhyOverviewV2Duxo.class);
        this.googlePayPushTokenizeManager = new GooglePayPushTokenizeManager();
        this.hasBottomBar = true;
        this.useDesignSystemToolbar = true;
        this.childFragmentsShouldNotConfigureToolbar = true;
        this.launchSuv = SuvLauncher.registerSuvLauncher$default(this, new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }, new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyOverviewFragmentV2.launchSuv$lambda$1(this.f$0);
            }
        }, (Function0) null, 4, (Object) null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return this.screenEventData;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return this.excludeFromAutoScreenEventLogging;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RhyOverviewV2Duxo getDuxo() {
        return (RhyOverviewV2Duxo) this.duxo.getValue();
    }

    public final ImageLoader getImageLoader() {
        ImageLoader imageLoader = this.imageLoader;
        if (imageLoader != null) {
            return imageLoader;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageLoader");
        return null;
    }

    public final void setImageLoader(ImageLoader imageLoader) {
        Intrinsics.checkNotNullParameter(imageLoader, "<set-?>");
        this.imageLoader = imageLoader;
    }

    public final coil.ImageLoader getMediaImageLoader() {
        coil.ImageLoader imageLoader = this.mediaImageLoader;
        if (imageLoader != null) {
            return imageLoader;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mediaImageLoader");
        return null;
    }

    public final void setMediaImageLoader(coil.ImageLoader imageLoader) {
        Intrinsics.checkNotNullParameter(imageLoader, "<set-?>");
        this.mediaImageLoader = imageLoader;
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

    public final TargetBackend getTargetBackend() {
        TargetBackend targetBackend = this.targetBackend;
        if (targetBackend != null) {
            return targetBackend;
        }
        Intrinsics.throwUninitializedPropertyAccessException("targetBackend");
        return null;
    }

    public final void setTargetBackend(TargetBackend targetBackend) {
        Intrinsics.checkNotNullParameter(targetBackend, "<set-?>");
        this.targetBackend = targetBackend;
    }

    public final RhyGlobalLoggingContext getRhyGlobalLoggingContext() {
        RhyGlobalLoggingContext rhyGlobalLoggingContext = this.rhyGlobalLoggingContext;
        if (rhyGlobalLoggingContext != null) {
            return rhyGlobalLoggingContext;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rhyGlobalLoggingContext");
        return null;
    }

    public final void setRhyGlobalLoggingContext(RhyGlobalLoggingContext rhyGlobalLoggingContext) {
        Intrinsics.checkNotNullParameter(rhyGlobalLoggingContext, "<set-?>");
        this.rhyGlobalLoggingContext = rhyGlobalLoggingContext;
    }

    public final HistoryNavigator getHistoryNavigator() {
        HistoryNavigator historyNavigator = this.historyNavigator;
        if (historyNavigator != null) {
            return historyNavigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("historyNavigator");
        return null;
    }

    public final void setHistoryNavigator(HistoryNavigator historyNavigator) {
        Intrinsics.checkNotNullParameter(historyNavigator, "<set-?>");
        this.historyNavigator = historyNavigator;
    }

    public final StringToLongMapPreference getPaycheckModuleInfoBannerDismissTimeoutsPref() {
        StringToLongMapPreference stringToLongMapPreference = this.paycheckModuleInfoBannerDismissTimeoutsPref;
        if (stringToLongMapPreference != null) {
            return stringToLongMapPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("paycheckModuleInfoBannerDismissTimeoutsPref");
        return null;
    }

    public final void setPaycheckModuleInfoBannerDismissTimeoutsPref(StringToLongMapPreference stringToLongMapPreference) {
        Intrinsics.checkNotNullParameter(stringToLongMapPreference, "<set-?>");
        this.paycheckModuleInfoBannerDismissTimeoutsPref = stringToLongMapPreference;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getHasBottomBar() {
        return this.hasBottomBar;
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
    public static final Unit launchSuv$lambda$1(RhyOverviewFragmentV2 rhyOverviewFragmentV2) {
        rhyOverviewFragmentV2.getDuxo().getPushTokenizeEvent();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            this.isDialogCurrentlyDisplayed = savedInstanceState.getBoolean(DIALOG_CURRENTLY_DISPLAYED);
        }
        getLifecycleScope().launchWhenCreated(new C103001(null));
        MapsInitializer.initialize(requireContext().getApplicationContext(), MapsInitializer.Renderer.LATEST, null);
        getRhyGlobalLoggingContext().refresh();
    }

    /* compiled from: RhyOverviewFragmentV2.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2$onCreate$1", m3645f = "RhyOverviewFragmentV2.kt", m3646l = {182}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2$onCreate$1 */
    static final class C103001 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C103001(Continuation<? super C103001> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RhyOverviewFragmentV2.this.new C103001(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C103001) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: RhyOverviewFragmentV2.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2$onCreate$1$1", m3645f = "RhyOverviewFragmentV2.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ RhyOverviewFragmentV2 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(RhyOverviewFragmentV2 rhyOverviewFragmentV2, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = rhyOverviewFragmentV2;
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
                    SharedFlow2<McDucklingDeepLinkHandler2> showCardSettings = McDucklingDeepLinkHandler.INSTANCE.getShowCardSettings();
                    final RhyOverviewFragmentV2 rhyOverviewFragmentV2 = this.this$0;
                    FlowCollector<? super McDucklingDeepLinkHandler2> flowCollector = new FlowCollector() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2.onCreate.1.1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return m11630emitwIMvIbw(((McDucklingDeepLinkHandler2) obj2).m12264unboximpl(), continuation);
                        }

                        /* renamed from: emit-wIMvIbw, reason: not valid java name */
                        public final Object m11630emitwIMvIbw(boolean z, Continuation<? super Unit> continuation) {
                            McDucklingDeepLinkHandler.INSTANCE.getShowCardSettings().resetReplayCache();
                            if (z) {
                                RhyOverviewFragmentV2.openCardSettings$default(rhyOverviewFragmentV2, null, 1, null);
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (showCardSettings.collect(flowCollector, this) == coroutine_suspended) {
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
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(RhyOverviewFragmentV2.this, null);
                this.label = 1;
                if (Supervisor3.supervisorScope(anonymousClass1, this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    @SuppressLint({"ClickableViewAccessibility"})
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getViewLifecycleOwner().getLifecycle().addObserver(this.googlePayPushTokenizeManager);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-6769370);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-6769370, i2, -1, "com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2.ComposeContent (RhyOverviewFragmentV2.kt:208)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStatesFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            final TopBarScrollState topBarScrollStateRememberTopBarScrollState = TopBarScrollState3.rememberTopBarScrollState(0.0f, composerStartRestartGroup, 0, 1);
            AccountTabEmbeddedListStateProvider.AccountTabEmbeddedLazyListStateProvider(this, ((LegacyFragmentKey.RhyOverviewV2) INSTANCE.getArgs((Fragment) this)).getAccountSelectorTabArgs(), null, ComposableLambda3.rememberComposableLambda(2004605895, true, new Function4<LazyListState, NestedScrollModifier, Composer, Integer, Unit>() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2.ComposeContent.1
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(LazyListState lazyListState, NestedScrollModifier nestedScrollModifier, Composer composer2, Integer num) {
                    invoke(lazyListState, nestedScrollModifier, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(final LazyListState listState, final NestedScrollModifier nestedScrollModifier, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(listState, "listState");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2004605895, i3, -1, "com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2.ComposeContent.<anonymous> (RhyOverviewFragmentV2.kt:216)");
                    }
                    final RhyOverviewFragmentV2 rhyOverviewFragmentV2 = RhyOverviewFragmentV2.this;
                    final TopBarScrollState topBarScrollState = topBarScrollStateRememberTopBarScrollState;
                    final SnapshotState4<RhyOverviewV2ViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-104674414, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2.ComposeContent.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-104674414, i4, -1, "com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2.ComposeContent.<anonymous>.<anonymous> (RhyOverviewFragmentV2.kt:217)");
                            }
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i5 = BentoTheme.$stable;
                            long jM21371getBg0d7_KjU = bentoTheme.getColors(composer3, i5).m21371getBg0d7_KjU();
                            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer3, i5).m21425getFg0d7_KjU();
                            final RhyOverviewFragmentV2 rhyOverviewFragmentV22 = rhyOverviewFragmentV2;
                            final LazyListState lazyListState = listState;
                            final TopBarScrollState topBarScrollState2 = topBarScrollState;
                            final SnapshotState4<RhyOverviewV2ViewState> snapshotState42 = snapshotState4;
                            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(713050711, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2.ComposeContent.1.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i6) {
                                    if ((i6 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(713050711, i6, -1, "com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2.ComposeContent.<anonymous>.<anonymous>.<anonymous> (RhyOverviewFragmentV2.kt:221)");
                                    }
                                    AccountSelectorTabArgs accountSelectorTabArgs = ((LegacyFragmentKey.RhyOverviewV2) RhyOverviewFragmentV2.INSTANCE.getArgs((Fragment) rhyOverviewFragmentV22)).getAccountSelectorTabArgs();
                                    if (accountSelectorTabArgs != null && accountSelectorTabArgs.isEmbedded()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        RhyTopAppBar5.RhyTopAppBar(TopBarScrollState3.scrollableTopBarState(Modifier.INSTANCE, lazyListState, topBarScrollState2), topBarScrollState2, null, RhyOverviewFragmentV2.ComposeContent$lambda$3(snapshotState42).getAccountBalance(), rhyOverviewFragmentV22, false, false, composer4, TopBarScrollState.$stable << 3, 100);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }
                            }, composer3, 54);
                            final RhyOverviewFragmentV2 rhyOverviewFragmentV23 = rhyOverviewFragmentV2;
                            final NestedScrollModifier nestedScrollModifier2 = nestedScrollModifier;
                            final LazyListState lazyListState2 = listState;
                            final SnapshotState4<RhyOverviewV2ViewState> snapshotState43 = snapshotState4;
                            ScaffoldKt.m5625Scaffold27mzLpw(null, null, composableLambdaRememberComposableLambda, null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, ComposableLambda3.rememberComposableLambda(-2750384, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2.ComposeContent.1.1.2
                                public final void invoke(PaddingValues paddingValues, Composer composer4, int i6) {
                                    Modifier modifierNestedScroll$default;
                                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                    if ((i6 & 6) == 0) {
                                        i6 |= composer4.changed(paddingValues) ? 4 : 2;
                                    }
                                    if ((i6 & 19) == 18 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-2750384, i6, -1, "com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2.ComposeContent.<anonymous>.<anonymous>.<anonymous> (RhyOverviewFragmentV2.kt:234)");
                                    }
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    Modifier modifierPadding = PaddingKt.padding(companion, paddingValues);
                                    RhyOverviewFragmentV2 rhyOverviewFragmentV24 = rhyOverviewFragmentV23;
                                    NestedScrollModifier nestedScrollModifier3 = nestedScrollModifier2;
                                    LazyListState lazyListState3 = lazyListState2;
                                    SnapshotState4<RhyOverviewV2ViewState> snapshotState44 = snapshotState43;
                                    Alignment.Companion companion2 = Alignment.INSTANCE;
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierPadding);
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                    if (composer4.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                                    if (nestedScrollModifier3 != null && (modifierNestedScroll$default = NestedScrollModifier7.nestedScroll$default(modifierFillMaxSize$default, nestedScrollModifier3, null, 2, null)) != null) {
                                        modifierFillMaxSize$default = modifierNestedScroll$default;
                                    }
                                    rhyOverviewFragmentV24.ScrollContent(modifierFillMaxSize$default, lazyListState3, RhyOverviewFragmentV2.ComposeContent$lambda$3(snapshotState44), composer4, 0, 0);
                                    Modifier modifierAlign = boxScopeInstance.align(companion, companion2.getBottomCenter());
                                    RhyOverviewV2ViewState rhyOverviewV2ViewStateComposeContent$lambda$3 = RhyOverviewFragmentV2.ComposeContent$lambda$3(snapshotState44);
                                    composer4.startReplaceGroup(5004770);
                                    boolean zChangedInstance = composer4.changedInstance(rhyOverviewFragmentV24);
                                    Object objRememberedValue = composer4.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new RhyOverviewFragmentV2$ComposeContent$1$1$2$1$2$1(rhyOverviewFragmentV24);
                                        composer4.updateRememberedValue(objRememberedValue);
                                    }
                                    Function0 function0 = (Function0) objRememberedValue;
                                    composer4.endReplaceGroup();
                                    composer4.startReplaceGroup(5004770);
                                    boolean zChangedInstance2 = composer4.changedInstance(rhyOverviewFragmentV24);
                                    Object objRememberedValue2 = composer4.rememberedValue();
                                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new RhyOverviewFragmentV2$ComposeContent$1$1$2$1$3$1(rhyOverviewFragmentV24);
                                        composer4.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer4.endReplaceGroup();
                                    RhyOverviewFooterComposable.RhyOverviewFooterComposable(modifierAlign, rhyOverviewV2ViewStateComposeContent$lambda$3, lazyListState3, function0, (Function1) ((KFunction) objRememberedValue2), composer4, 0, 0);
                                    composer4.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer4, Integer num) {
                                    invoke(paddingValues, composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }
                            }, composer3, 54), composer3, 384, 12582912, 32763);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i2 & 14) | 3072, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyOverviewFragmentV2.ComposeContent$lambda$4(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C10285R.id.dialog_id_cash_rhy_tab_brokerage_account_in_review) {
            Navigator navigator = getNavigator();
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Intent intentCreateIntent$default = Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, TabLinkIntentKey.Home.Legacy.INSTANCE, null, false, 12, null);
            intentCreateIntent$default.addFlags(131072);
            startActivity(intentCreateIntent$default);
            return true;
        }
        if (id == C10285R.id.dialog_id_cash_rhy_tab_debug_add_gpay_token) {
            getDuxo().debugOnlyAddToGoogleWallet();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putBoolean(DIALOG_CURRENTLY_DISPLAYED, this.isDialogCurrentlyDisplayed);
    }

    static /* synthetic */ void openCardSettings$default(RhyOverviewFragmentV2 rhyOverviewFragmentV2, LegacyFragmentKey.RhyCardSettings.Action action, int i, Object obj) {
        if ((i & 1) != 0) {
            action = null;
        }
        rhyOverviewFragmentV2.openCardSettings(action);
    }

    private final void openCardSettings(LegacyFragmentKey.RhyCardSettings.Action action) {
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new LegacyFragmentKey.RhyCardSettings(action), false, false, false, null, false, null, false, false, null, null, 4092, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    @SuppressLint({"NotifyDataSetChanged"})
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C103011(this));
        GooglePayPushTokenizeManager googlePayPushTokenizeManager = this.googlePayPushTokenizeManager;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        LifecycleHost.DefaultImpls.bind$default(this, googlePayPushTokenizeManager.onDataChanged(fragmentActivityRequireActivity), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyOverviewFragmentV2.onStart$lambda$5(this.f$0);
            }
        });
    }

    /* compiled from: RhyOverviewFragmentV2.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2$onStart$1 */
    /* synthetic */ class C103011 extends FunctionReferenceImpl implements Function1<RhyOverviewV2ViewState, Unit> {
        C103011(Object obj) {
            super(1, obj, RhyOverviewFragmentV2.class, "bind", "bind(Lcom/robinhood/android/cash/rhy/tab/v2/RhyOverviewV2ViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RhyOverviewV2ViewState rhyOverviewV2ViewState) {
            invoke2(rhyOverviewV2ViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(RhyOverviewV2ViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((RhyOverviewFragmentV2) this.receiver).bind(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$5(RhyOverviewFragmentV2 rhyOverviewFragmentV2) {
        rhyOverviewFragmentV2.getDuxo().updateGooglePayData();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        EventLogger.DefaultImpls.logUserInteractionEvent$default(getEventLogger(), UserInteractionEventData.copy$default(getScreenEventData(), UserInteractionEventData.EventType.SCREEN_TRANSITION_APPEAR, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), false, false, 6, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        EventLogger.DefaultImpls.logUserInteractionEvent$default(getEventLogger(), UserInteractionEventData.copy$default(getScreenEventData(), UserInteractionEventData.EventType.SCREEN_TRANSITION_DISAPPEAR, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), false, false, 6, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    @Override // com.robinhood.android.common.p088ui.tabs.Scrollable
    public void scrollToTop() {
        getDuxo().animateScrollToTop();
    }

    @Override // com.robinhood.android.common.history.ui.UnifiedHistoryView.Callbacks
    public void onRecentHistoryShowAllClicked() {
        getDuxo().showHistoryExperience();
    }

    @Override // com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet.Callbacks
    public void onRadTaskCompleted(MerchantOfferV2 offer) {
        Intrinsics.checkNotNullParameter(offer, "offer");
        getDuxo().radTransferComplete(offer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(RhyOverviewV2ViewState state) {
        final RhyOverviewFragmentV2 rhyOverviewFragmentV2;
        FragmentKey fragmentKeyConsume;
        UiEvent<MerchantOfferV2> radTransferComplete = state.getRadTransferComplete();
        if (radTransferComplete != null) {
            rhyOverviewFragmentV2 = this;
            radTransferComplete.consumeWith(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhyOverviewFragmentV2.bind$lambda$6(this.f$0, (MerchantOfferV2) obj);
                }
            });
        } else {
            rhyOverviewFragmentV2 = this;
        }
        UiEvent<FragmentKey> showHistoryExperienceEvent = state.getShowHistoryExperienceEvent();
        if (showHistoryExperienceEvent != null && (fragmentKeyConsume = showHistoryExperienceEvent.consume()) != null) {
            Navigator navigator = rhyOverviewFragmentV2.getNavigator();
            android.content.Context contextRequireContext = rhyOverviewFragmentV2.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, fragmentKeyConsume, false, false, false, null, false, null, false, false, null, null, 4092, null);
        }
        bindBottomSheets(state);
        bindGooglePay(state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$6(RhyOverviewFragmentV2 rhyOverviewFragmentV2, MerchantOfferV2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        rhyOverviewFragmentV2.showMerchantRewardsOfferDetailsSheet(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ScrollContent(Modifier modifier, final LazyListState lazyListState, final RhyOverviewV2ViewState rhyOverviewV2ViewState, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-253894451);
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
            i3 |= composerStartRestartGroup.changed(lazyListState) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(rhyOverviewV2ViewState) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(this) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-253894451, i3, -1, "com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2.ScrollContent (RhyOverviewFragmentV2.kt:360)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
            Pager<HistoryEvent.SortKey, StatefulHistoryEvent<HistoryEvent>> historyPager = rhyOverviewV2ViewState.getHistoryPager();
            Flow<PagingData<StatefulHistoryEvent<HistoryEvent>>> flow = historyPager != null ? historyPager.getFlow() : null;
            composerStartRestartGroup.startReplaceGroup(820577127);
            final LazyPagingItems lazyPagingItemsCollectAsLazyPagingItems = flow != null ? LazyPagingItems5.collectAsLazyPagingItems(flow, null, composerStartRestartGroup, 0, 1) : null;
            composerStartRestartGroup.endReplaceGroup();
            ComposeUiEvent<Unit> animateScrollToTop = rhyOverviewV2ViewState.getAnimateScrollToTop();
            composerStartRestartGroup.startReplaceGroup(820579147);
            if (animateScrollToTop != null) {
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope) | ((i3 & 112) == 32);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return RhyOverviewFragmentV2.ScrollContent$lambda$9$lambda$8(coroutineScope, lazyListState, (Unit) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                animateScrollToTop.consumeWith((Function1) objRememberedValue2);
                Unit unit = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceGroup();
            PaddingValues paddingValuesM5139PaddingValuesa9UjIt4$default = PaddingKt.m5139PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, BOTTOM_OFFSET_FOR_DEBIT_CARD_VIEW, 7, null);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changedInstance(rhyOverviewV2ViewState) | composerStartRestartGroup.changedInstance(lazyPagingItemsCollectAsLazyPagingItems);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RhyOverviewFragmentV2.ScrollContent$lambda$11$lambda$10(this.f$0, lazyPagingItemsCollectAsLazyPagingItems, rhyOverviewV2ViewState, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            modifier3 = modifier4;
            LazyDslKt.LazyColumn(modifier3, lazyListState, paddingValuesM5139PaddingValuesa9UjIt4$default, false, null, null, null, false, null, (Function1) objRememberedValue3, composerStartRestartGroup, (i3 & 14) | 384 | (i3 & 112), 504);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyOverviewFragmentV2.ScrollContent$lambda$12(this.f$0, modifier3, lazyListState, rhyOverviewV2ViewState, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScrollContent$lambda$9$lambda$8(CoroutineScope coroutineScope, LazyListState lazyListState, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new RhyOverviewFragmentV2$ScrollContent$1$1$1(lazyListState, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScrollContent$lambda$11$lambda$10(final RhyOverviewFragmentV2 rhyOverviewFragmentV2, LazyPagingItems lazyPagingItems, final RhyOverviewV2ViewState rhyOverviewV2ViewState, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, CashTabSectionKey.Header, null, ComposableLambda3.composableLambdaInstance(-598842152, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2$ScrollContent$2$1$1
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
                    ComposerKt.traceEventStart(-598842152, i, -1, "com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2.ScrollContent.<anonymous>.<anonymous>.<anonymous> (RhyOverviewFragmentV2.kt:372)");
                }
                this.this$0.Banners(rhyOverviewV2ViewState, composer, 0);
                this.this$0.Header(rhyOverviewV2ViewState, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 2, null);
        LazyListScope.item$default(LazyColumn, CashTabSectionKey.CarouselOrNux, null, ComposableLambda3.composableLambdaInstance(489008705, true, new RhyOverviewFragmentV2$ScrollContent$2$1$2(rhyOverviewFragmentV2)), 2, null);
        LazyListScope.item$default(LazyColumn, CashTabSectionKey.ActionBar, null, ComposableLambda3.composableLambdaInstance(-846365024, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2$ScrollContent$2$1$3
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
                    ComposerKt.traceEventStart(-846365024, i, -1, "com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2.ScrollContent.<anonymous>.<anonymous>.<anonymous> (RhyOverviewFragmentV2.kt:391)");
                }
                if (rhyOverviewV2ViewState.isActionBarVisible()) {
                    rhyOverviewFragmentV2.ActionBar(rhyOverviewV2ViewState.getDirectDepositRowIntentKey(), composer, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 2, null);
        rhyOverviewFragmentV2.history(LazyColumn, lazyPagingItems, rhyOverviewV2ViewState);
        LazyListScope.item$default(LazyColumn, CashTabSectionKey.Offers, null, ComposableLambda3.composableLambdaInstance(2113228543, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2$ScrollContent$2$1$4
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
                    ComposerKt.traceEventStart(2113228543, i, -1, "com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2.ScrollContent.<anonymous>.<anonymous>.<anonymous> (RhyOverviewFragmentV2.kt:397)");
                }
                if (rhyOverviewV2ViewState.getShouldShowMerchantOffers()) {
                    rhyOverviewFragmentV2.Offers(rhyOverviewV2ViewState, composer, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 2, null);
        LazyListScope.item$default(LazyColumn, CashTabSectionKey.PaycheckModule, null, ComposableLambda3.composableLambdaInstance(777854814, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2$ScrollContent$2$1$5
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
                    ComposerKt.traceEventStart(777854814, i, -1, "com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2.ScrollContent.<anonymous>.<anonymous>.<anonymous> (RhyOverviewFragmentV2.kt:402)");
                }
                RhyPaycheckModule paycheckModule = rhyOverviewV2ViewState.getPaycheckModule();
                if (paycheckModule != null) {
                    rhyOverviewFragmentV2.PaycheckModule(paycheckModule, composer, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 2, null);
        LazyListScope.item$default(LazyColumn, CashTabSectionKey.AtmFinder, null, ComposableLambda3.composableLambdaInstance(-557518915, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2$ScrollContent$2$1$6
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
                    ComposerKt.traceEventStart(-557518915, i, -1, "com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2.ScrollContent.<anonymous>.<anonymous>.<anonymous> (RhyOverviewFragmentV2.kt:407)");
                }
                if (rhyOverviewV2ViewState.isAtmMiniFinderVisible()) {
                    rhyOverviewFragmentV2.AtmMiniFinder(composer, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 2, null);
        LazyListScope.item$default(LazyColumn, CashTabSectionKey.AccountSection, null, ComposableLambda3.composableLambdaInstance(-1892892644, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2$ScrollContent$2$1$7
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
                    ComposerKt.traceEventStart(-1892892644, i, -1, "com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2.ScrollContent.<anonymous>.<anonymous>.<anonymous> (RhyOverviewFragmentV2.kt:412)");
                }
                if (rhyOverviewV2ViewState.isActiveAccount()) {
                    rhyOverviewFragmentV2.AccountSection(rhyOverviewV2ViewState, composer, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 2, null);
        return Unit.INSTANCE;
    }

    private final void history(LazyListScope lazyListScope, LazyPagingItems<StatefulHistoryEvent<HistoryEvent>> lazyPagingItems, RhyOverviewV2ViewState rhyOverviewV2ViewState) {
        AnnotatedString annotatedString;
        if (!rhyOverviewV2ViewState.getIsMigratedFromCm()) {
            String string2 = getString(C10285R.string.rhy_spending_overview_transaction_history_empty_new_user);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            annotatedString = new AnnotatedString(string2, null, 2, null);
        } else {
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            String string3 = getString(C10285R.string.rhy_spending_overview_transaction_history_empty_migrated_user);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            builder.append(string3);
            builder.append(PlaceholderUtils.XXShortPlaceholderText);
            int iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 61435, (DefaultConstructorMarker) null));
            try {
                String string4 = getString(C10285R.string.f3940x1b84dd8d);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                builder.append(string4);
                Unit unit = Unit.INSTANCE;
                builder.pop(iPushStyle);
                annotatedString = builder.toAnnotatedString();
            } catch (Throwable th) {
                builder.pop(iPushStyle);
                throw th;
            }
        }
        AnnotatedString annotatedString2 = annotatedString;
        Function0 function0 = rhyOverviewV2ViewState.getIsMigratedFromCm() ? new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyOverviewFragmentV2.history$lambda$15(this.f$0);
            }
        } : null;
        RhyOverviewHistoryComposable3.rhyRecentHistorySection(lazyListScope, lazyPagingItems, annotatedString2, function0, rhyOverviewV2ViewState.getPendingMatchaTransactions(), getMediaImageLoader(), new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyOverviewFragmentV2.history$lambda$16(this.f$0);
            }
        }, new HistoryRowsCallbacks() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2.history.3
            @Override // com.robinhood.android.common.history.p082ui.HistoryRowsCallbacks
            public void onShowAllHistoryClicked() {
                RhyOverviewFragmentV2.this.getDuxo().showHistoryExperience();
            }

            @Override // com.robinhood.android.common.history.p082ui.HistoryRow2
            public void onHistoryRowClicked(HistoryRow3 event) {
                Intrinsics.checkNotNullParameter(event, "event");
                RhyOverviewFragmentV2 rhyOverviewFragmentV2 = RhyOverviewFragmentV2.this;
                HistoryRowCallbackExtensions.handleHistoryRowClick$default(rhyOverviewFragmentV2, event, rhyOverviewFragmentV2.getHistoryNavigator(), null, 4, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit history$lambda$15(RhyOverviewFragmentV2 rhyOverviewFragmentV2) {
        Navigator navigator = rhyOverviewFragmentV2.getNavigator();
        android.content.Context contextRequireContext = rhyOverviewFragmentV2.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(DeepLinkPath.INSTANCE.getSCHEME_ROBINHOOD() + "://history"), null, null, false, null, 60, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit history$lambda$16(RhyOverviewFragmentV2 rhyOverviewFragmentV2) {
        Navigator navigator = rhyOverviewFragmentV2.getNavigator();
        android.content.Context contextRequireContext = rhyOverviewFragmentV2.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, PendingTransactionsFragmentKey.All.INSTANCE, false, false, false, false, null, false, null, null, 1020, null);
        return Unit.INSTANCE;
    }

    private final void bindGooglePay(RhyOverviewV2ViewState state) {
        VerificationRequiredException verificationRequiredExceptionConsume;
        PushTokenizeRequest pushTokenizeRequestConsume;
        UiEvent<PushTokenizeRequest> pushTokenizeEvent = state.getPushTokenizeEvent();
        if (pushTokenizeEvent != null && (pushTokenizeRequestConsume = pushTokenizeEvent.consume()) != null) {
            GooglePayPushTokenizeManager googlePayPushTokenizeManager = this.googlePayPushTokenizeManager;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            googlePayPushTokenizeManager.pushTokenize(fragmentActivityRequireActivity, pushTokenizeRequestConsume, 1);
        }
        UiEvent<VerificationRequiredException> verificationRequired = state.getVerificationRequired();
        if (verificationRequired == null || (verificationRequiredExceptionConsume = verificationRequired.consume()) == null) {
            return;
        }
        this.launchSuv.invoke(verificationRequiredExceptionConsume.getWorkflowInstanceUuid(), Boolean.valueOf(verificationRequiredExceptionConsume.isMigrated()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void PaycheckModule(final RhyPaycheckModule rhyPaycheckModule, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1087078104);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(rhyPaycheckModule) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1087078104, i2, -1, "com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2.PaycheckModule (RhyOverviewFragmentV2.kt:488)");
            }
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, getEventScreen(), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new PaycheckSectionContext(rhyPaycheckModule.getLoggingContextScenario(), "", null, 4, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -131073, -1, -1, -1, 16383, null), new Component(Component.ComponentType.PAYCHECK_SECTION, null, null, 6, null), null, 37, null), ComposableLambda3.rememberComposableLambda(-2141020669, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2.PaycheckModule.1
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
                        ComposerKt.traceEventStart(-2141020669, i3, -1, "com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2.PaycheckModule.<anonymous> (RhyOverviewFragmentV2.kt:501)");
                    }
                    RhyPaycheckModuleComposable.RhyPaycheckModuleComposable(PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 1, null), rhyPaycheckModule, this.getNavigator(), this.getPaycheckModuleInfoBannerDismissTimeoutsPref(), composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyOverviewFragmentV2.PaycheckModule$lambda$19(this.f$0, rhyPaycheckModule, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AccountSection(final RhyOverviewV2ViewState rhyOverviewV2ViewState, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1690066083);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(rhyOverviewV2ViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1690066083, i2, -1, "com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2.AccountSection (RhyOverviewFragmentV2.kt:512)");
            }
            boolean z = rhyOverviewV2ViewState.getDirectDepositRowIntentKey() != null;
            boolean showRhyReferrals = rhyOverviewV2ViewState.getShowRhyReferrals();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new RhyOverviewFragmentV2$AccountSection$1$1(this);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Function0 function0 = (Function0) ((KFunction) objRememberedValue);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changedInstance(rhyOverviewV2ViewState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RhyOverviewFragmentV2.AccountSection$lambda$22$lambda$21(this.f$0, rhyOverviewV2ViewState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function0 function02 = (Function0) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new RhyOverviewFragmentV2$AccountSection$3$1(this);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            RhyOverviewAccountSectionComposable5.RhyOverviewAccountSectionComposable(null, z, showRhyReferrals, function0, function02, (Function0) ((KFunction) objRememberedValue3), composerStartRestartGroup, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyOverviewFragmentV2.AccountSection$lambda$24(this.f$0, rhyOverviewV2ViewState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSection$lambda$22$lambda$21(RhyOverviewFragmentV2 rhyOverviewFragmentV2, RhyOverviewV2ViewState rhyOverviewV2ViewState) {
        rhyOverviewFragmentV2.onDirectDepositClick(rhyOverviewV2ViewState);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Offers(final RhyOverviewV2ViewState rhyOverviewV2ViewState, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2143257534);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(rhyOverviewV2ViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2143257534, i2, -1, "com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2.Offers (RhyOverviewFragmentV2.kt:523)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            RhyEventLoggingUtils rhyEventLoggingUtils = RhyEventLoggingUtils.INSTANCE;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(ModifiersKt.autoLogEvents$default(companion, RhyEventLoggingUtils.toRhyTabEventData$default(rhyEventLoggingUtils, Component.ComponentType.MERCHANT_REWARD_CAROUSEL, null, null, 3, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null);
            Clock clock = getDuxo().getClock();
            Screen eventScreen = getEventScreen();
            Context rhyTabContext = rhyEventLoggingUtils.getRhyTabContext();
            List<CashCardOffer> cashCardOffers = rhyOverviewV2ViewState.getCashCardOffers();
            if (cashCardOffers == null) {
                cashCardOffers = CollectionsKt.emptyList();
            }
            ImmutableList immutableList = extensions2.toImmutableList(cashCardOffers);
            List<MerchantOfferV2> moreMerchantOffers = rhyOverviewV2ViewState.getMoreMerchantOffers();
            if (moreMerchantOffers == null) {
                moreMerchantOffers = CollectionsKt.emptyList();
            }
            ImmutableList immutableList2 = extensions2.toImmutableList(moreMerchantOffers);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new RhyOverviewFragmentV2$Offers$1$1(this);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Function1 function1 = (Function1) ((KFunction) objRememberedValue);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2$$ExternalSyntheticLambda24
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RhyOverviewFragmentV2.Offers$lambda$27$lambda$26(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            RhyOverviewCashCardOffersComposable.RhyOverviewCashCardOffersComposable(modifierM5146paddingqDBjuR0$default, clock, eventScreen, rhyTabContext, immutableList, immutableList2, function1, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2$$ExternalSyntheticLambda25
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyOverviewFragmentV2.Offers$lambda$28(this.f$0, rhyOverviewV2ViewState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Offers$lambda$27$lambda$26(RhyOverviewFragmentV2 rhyOverviewFragmentV2) {
        Navigator navigator = rhyOverviewFragmentV2.getNavigator();
        android.content.Context contextRequireContext = rhyOverviewFragmentV2.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new LegacyIntentKey.RhyMerchantRewards(null, 1, null), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Banners(final RhyOverviewV2ViewState rhyOverviewV2ViewState, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1978867414);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(rhyOverviewV2ViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1978867414, i2, -1, "com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2.Banners (RhyOverviewFragmentV2.kt:547)");
            }
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composerStartRestartGroup, 6, 1);
            IacInfoBanner iacInfoBannerData = rhyOverviewV2ViewState.getIacInfoBannerData();
            InfoBannerCallbacks infoBannerCallbacks = new InfoBannerCallbacks() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2.Banners.1
                @Override // com.robinhood.shared.iac.infobanner.InfoBannerCallbacks
                public void onClickInfoBanner(IacInfoBanner banner) {
                    Intrinsics.checkNotNullParameter(banner, "banner");
                    GenericAction ctaAction = banner.getCtaAction();
                    if (ctaAction instanceof GenericAction.DeeplinkAction) {
                        Navigator navigator = RhyOverviewFragmentV2.this.getNavigator();
                        android.content.Context contextRequireContext = RhyOverviewFragmentV2.this.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        GenericAction.DeeplinkAction deeplinkAction = (GenericAction.DeeplinkAction) ctaAction;
                        Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, deeplinkAction.getUri(), null, null, false, null, 60, null);
                        RhyOverviewFragmentV2.this.getDuxo().tapInfoBanner(banner.getReceiptUuid(), deeplinkAction);
                    }
                }

                @Override // com.robinhood.shared.iac.infobanner.InfoBannerCallbacks
                public void onDismissInfoBanner(IacInfoBanner banner) {
                    Intrinsics.checkNotNullParameter(banner, "banner");
                    RhyOverviewFragmentV2.this.getDuxo().dismissInfoBanner(banner.getReceiptUuid());
                }
            };
            RhyOverviewBannerState rhyOverviewBannerState = rhyOverviewV2ViewState.getRhyOverviewBannerState();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RhyOverviewFragmentV2.Banners$lambda$30$lambda$29(this.f$0, (RhyOverviewBannerState.Visible) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            RhyOverviewBannersComposable.RhyOverviewBannersComposable(modifierM21623defaultHorizontalPaddingrAjV9yQ, iacInfoBannerData, infoBannerCallbacks, rhyOverviewBannerState, (Function1) objRememberedValue, composerStartRestartGroup, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyOverviewFragmentV2.Banners$lambda$31(this.f$0, rhyOverviewV2ViewState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Banners$lambda$30$lambda$29(RhyOverviewFragmentV2 rhyOverviewFragmentV2, RhyOverviewBannerState.Visible bannerState) {
        Intrinsics.checkNotNullParameter(bannerState, "bannerState");
        if (Intrinsics.areEqual(bannerState, RhyOverviewBannerState.Visible.AddToGooglePay.INSTANCE)) {
            rhyOverviewFragmentV2.getDuxo().getPushTokenizeEvent();
        } else {
            Function1<RhyOverviewBannerState.Visible.BannerActionParams, Unit> bannerAction = bannerState.getBannerAction();
            if (bannerAction != null) {
                android.content.Context contextRequireContext = rhyOverviewFragmentV2.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                bannerAction.invoke(new RhyOverviewBannerState.Visible.BannerActionParams(contextRequireContext, rhyOverviewFragmentV2.getNavigator()));
            }
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseRhBottomSheetDialogHostFragment, com.robinhood.android.common.p088ui.RhBottomSheetDialogFragmentHost, com.robinhood.android.common.ui.BaseBottomSheetDialogFragment.OnDismissListener
    public void onBottomSheetDismissed(int id) {
        this.isDialogCurrentlyDisplayed = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClickCashCardOffer(CashCardOffer offer) {
        if (offer instanceof CashCardOffer.Merchant) {
            showMerchantRewardsOfferDetailsSheet(((CashCardOffer.Merchant) offer).getOffer());
            return;
        }
        if (!(offer instanceof CashCardOffer.RhyReferral)) {
            throw new NoWhenBranchMatchedException();
        }
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), null, RhyEventLoggingUtils.INSTANCE.getRhyTabScreen(), new Component(Component.ComponentType.RHY_REFERRAL_CASH_OFFER_CARD, null, null, 6, null), null, getRhyGlobalLoggingContext().eventContext(RHYContext.ProductArea.REFERRALS, "rhy_home", "cash_tab"), false, 41, null);
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, RhyReferrerLandingKey.INSTANCE, false, false, false, false, null, false, null, null, 1020, null);
    }

    private final void showMerchantRewardsOfferDetailsSheet(MerchantOfferV2 merchantOffer) {
        MerchantRewardsOfferDetailsBottomSheet merchantRewardsOfferDetailsBottomSheet = (MerchantRewardsOfferDetailsBottomSheet) MerchantRewardsOfferDetailsBottomSheet.INSTANCE.newInstance((Parcelable) new MerchantRewardsOfferDetailsBottomSheet.Args(merchantOffer, false, 2, null));
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        merchantRewardsOfferDetailsBottomSheet.show(childFragmentManager, "MerchantRewardsOfferDetailsBottomSheetDialogFragment");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClickSettings() {
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, LegacyFragmentKey.RhyAccountSettings.INSTANCE, false, false, false, null, false, null, false, false, null, null, 4092, null);
    }

    private final void onDirectDepositClick(RhyOverviewV2ViewState state) {
        IntentKey directDepositRowIntentKey = state.getDirectDepositRowIntentKey();
        if (directDepositRowIntentKey != null) {
            Navigator navigator = getNavigator();
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, directDepositRowIntentKey, null, false, null, null, 60, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showTransferMoney(MAXTransferContext.EntryPoint entryPoint) {
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new Transfer(new TransferConfiguration.Standard(null, null, false, new TransferConfiguration.TransferAccountSelection(null, false, ApiTransferAccount.TransferAccountType.ACH, 3, null), new TransferConfiguration.TransferAccountSelection(null, false, ApiTransferAccount.TransferAccountType.RHY, 3, null), null, entryPoint, null, false, false, null, null, false, 8103, null)), null, false, null, null, 60, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Header(final RhyOverviewV2ViewState rhyOverviewV2ViewState, Composer composer, final int i) {
        int i2;
        StringResource pendingLabelValue;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1028076232);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(rhyOverviewV2ViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1028076232, i2, -1, "com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2.Header (RhyOverviewFragmentV2.kt:648)");
            }
            composerStartRestartGroup.startReplaceGroup(-138777290);
            AnnotatedString annotatedString = null;
            if (rhyOverviewV2ViewState.getHasPendingDeposits() && (pendingLabelValue = rhyOverviewV2ViewState.getPendingLabelValue()) != null) {
                composerStartRestartGroup.startReplaceGroup(-138774527);
                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                int iPushStyle = builder.pushStyle(new SpanStyle(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21456getPositive0d7_KjU(), 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65530, (DefaultConstructorMarker) null));
                try {
                    Resources resources = getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    builder.append(pendingLabelValue.getText(resources).toString());
                    Unit unit = Unit.INSTANCE;
                    builder.pop(iPushStyle);
                    builder.append(PlaceholderUtils.XXShortPlaceholderText);
                    StringResource pendingLabelSuffix = rhyOverviewV2ViewState.getPendingLabelSuffix();
                    Resources resources2 = getResources();
                    Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                    builder.append(pendingLabelSuffix.getText(resources2).toString());
                    annotatedString = builder.toAnnotatedString();
                    composerStartRestartGroup.endReplaceGroup();
                } catch (Throwable th) {
                    builder.pop(iPushStyle);
                    throw th;
                }
            }
            AnnotatedString annotatedString2 = annotatedString;
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
            String accountBalance = rhyOverviewV2ViewState.getAccountBalance();
            AccountSelectorTabArgs accountSelectorTabArgs = ((LegacyFragmentKey.RhyOverviewV2) INSTANCE.getArgs((Fragment) this)).getAccountSelectorTabArgs();
            RhyOverviewHeaderComposable.RhyOverviewHeaderComposable(modifierM5146paddingqDBjuR0$default, accountBalance, annotatedString2, accountSelectorTabArgs != null ? accountSelectorTabArgs.isEmbedded() : false, composerStartRestartGroup, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyOverviewFragmentV2.Header$lambda$36(this.f$0, rhyOverviewV2ViewState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private final void bindBottomSheets(RhyOverviewV2ViewState state) {
        DialogFragment dialogFragmentCreateDialogFragment$default;
        UiEvent<String> debitSpendingContentId = state.getDebitSpendingContentId();
        if (debitSpendingContentId != null) {
            debitSpendingContentId.consumeWith(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhyOverviewFragmentV2.bindBottomSheets$lambda$37(this.f$0, (String) obj);
                }
            });
        }
        if (Intrinsics.areEqual(state.isInDedupeExperiment(), Boolean.TRUE)) {
            RhyOverviewV2ViewState.BottomSheetType bottomSheetType = (RhyOverviewV2ViewState.BottomSheetType) CollectionsKt.firstOrNull((List) state.getDialogsReadyToShowList());
            if (bottomSheetType == null || this.isDialogCurrentlyDisplayed) {
                return;
            }
            boolean z = bottomSheetType instanceof RhyOverviewV2ViewState.BottomSheetType.FundingBottomSheet;
            String str = FUNDING_BOTTOM_SHEET_TAG;
            if (z) {
                dialogFragmentCreateDialogFragment$default = Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new LegacyDialogFragmentKey.TransferFundsBottomSheet(true, "new_rhy_onboarding"), null, 2, null);
            } else if (bottomSheetType instanceof RhyOverviewV2ViewState.BottomSheetType.NoaRedirectBottomSheet) {
                dialogFragmentCreateDialogFragment$default = Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new LegacyDialogFragmentKey.RedirectDirectDeposit(((RhyOverviewV2ViewState.BottomSheetType.NoaRedirectBottomSheet) bottomSheetType).getPrompt(), "rhy_spending_home", RhyEventLoggingUtils.INSTANCE.getRhyTabScreen()), null, 2, null);
                str = "noa-redirect-warning";
            } else if (bottomSheetType instanceof RhyOverviewV2ViewState.BottomSheetType.CashCushionBottomSheet) {
                dialogFragmentCreateDialogFragment$default = Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new LegacyDialogFragmentKey.CashCushionUpsell("existing_rhy_half_sheet"), null, 2, null);
            } else if (bottomSheetType instanceof RhyOverviewV2ViewState.BottomSheetType.DebitSpendBottomSheet) {
                RhyOverviewV2ViewState.BottomSheetType.DebitSpendBottomSheet debitSpendBottomSheet = (RhyOverviewV2ViewState.BottomSheetType.DebitSpendBottomSheet) bottomSheetType;
                dialogFragmentCreateDialogFragment$default = (DialogFragment) FixedPercentOfferBottomSheetFragment.INSTANCE.newInstance((Parcelable) new FixedPercentOfferBottomSheetFragment.Args(debitSpendBottomSheet.getPercentage(), debitSpendBottomSheet.getOffer(), debitSpendBottomSheet.getContent()));
                str = "FIXED_PERCENT_BACK";
            } else {
                if (!(bottomSheetType instanceof RhyOverviewV2ViewState.BottomSheetType.FlatCashbackBottomSheet)) {
                    throw new NoWhenBranchMatchedException();
                }
                dialogFragmentCreateDialogFragment$default = Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), FlatCashbackOnboardingContract.DialogKey.INSTANCE, null, 2, null);
                str = "flat-cashback";
            }
            this.isDialogCurrentlyDisplayed = true;
            dialogFragmentCreateDialogFragment$default.show(getChildFragmentManager(), str);
            return;
        }
        UiEvent<RhyOverviewV2ViewState.BottomSheetType> showBottomSheet = state.getShowBottomSheet();
        if (showBottomSheet != null) {
            showBottomSheet.consumeWith(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhyOverviewFragmentV2.bindBottomSheets$lambda$38(this.f$0, (RhyOverviewV2ViewState.BottomSheetType) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindBottomSheets$lambda$37(RhyOverviewFragmentV2 rhyOverviewFragmentV2, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        rhyOverviewFragmentV2.getDuxo().getContentForBottomSheetOffers(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindBottomSheets$lambda$38(RhyOverviewFragmentV2 rhyOverviewFragmentV2, RhyOverviewV2ViewState.BottomSheetType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof RhyOverviewV2ViewState.BottomSheetType.FundingBottomSheet) {
            Navigator.DefaultImpls.createDialogFragment$default(rhyOverviewFragmentV2.getNavigator(), new LegacyDialogFragmentKey.TransferFundsBottomSheet(true, "new_rhy_onboarding"), null, 2, null).show(rhyOverviewFragmentV2.getChildFragmentManager(), FUNDING_BOTTOM_SHEET_TAG);
        } else if (it instanceof RhyOverviewV2ViewState.BottomSheetType.NoaRedirectBottomSheet) {
            Navigator.DefaultImpls.createDialogFragment$default(rhyOverviewFragmentV2.getNavigator(), new LegacyDialogFragmentKey.RedirectDirectDeposit(((RhyOverviewV2ViewState.BottomSheetType.NoaRedirectBottomSheet) it).getPrompt(), "rhy_spending_home", RhyEventLoggingUtils.INSTANCE.getRhyTabScreen()), null, 2, null).show(rhyOverviewFragmentV2.getChildFragmentManager(), "noa-redirect-warning");
        } else if (it instanceof RhyOverviewV2ViewState.BottomSheetType.CashCushionBottomSheet) {
            Navigator.DefaultImpls.createDialogFragment$default(rhyOverviewFragmentV2.getNavigator(), new LegacyDialogFragmentKey.CashCushionUpsell("existing_rhy_half_sheet"), null, 2, null).show(rhyOverviewFragmentV2.getChildFragmentManager(), FUNDING_BOTTOM_SHEET_TAG);
        } else if (it instanceof RhyOverviewV2ViewState.BottomSheetType.DebitSpendBottomSheet) {
            RhyOverviewV2ViewState.BottomSheetType.DebitSpendBottomSheet debitSpendBottomSheet = (RhyOverviewV2ViewState.BottomSheetType.DebitSpendBottomSheet) it;
            FixedPercentOfferBottomSheetFragment fixedPercentOfferBottomSheetFragment = (FixedPercentOfferBottomSheetFragment) FixedPercentOfferBottomSheetFragment.INSTANCE.newInstance((Parcelable) new FixedPercentOfferBottomSheetFragment.Args(debitSpendBottomSheet.getPercentage(), debitSpendBottomSheet.getOffer(), debitSpendBottomSheet.getContent()));
            FragmentManager childFragmentManager = rhyOverviewFragmentV2.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            fixedPercentOfferBottomSheetFragment.show(childFragmentManager, "FIXED_PERCENT_BACK");
        } else {
            if (!(it instanceof RhyOverviewV2ViewState.BottomSheetType.FlatCashbackBottomSheet)) {
                throw new NoWhenBranchMatchedException();
            }
            Navigator.DefaultImpls.createDialogFragment$default(rhyOverviewFragmentV2.getNavigator(), FlatCashbackOnboardingContract.DialogKey.INSTANCE, null, 2, null).show(rhyOverviewFragmentV2.getChildFragmentManager(), "flat-cash-back");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AtmMiniFinder(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(981311770);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(981311770, i2, -1, "com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2.AtmMiniFinder (RhyOverviewFragmentV2.kt:776)");
            }
            AtmMiniFinderComposable.AtmMiniFinderComposable(PaddingKt.m5144paddingVpY3zN4$default(ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, RhyEventLoggingUtils.toRhyTabEventData$default(RhyEventLoggingUtils.INSTANCE, Component.ComponentType.HOME_ATM_FINDER, null, null, 3, null), true, false, false, true, false, null, 108, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null), getNavigator(), null, composerStartRestartGroup, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyOverviewFragmentV2.AtmMiniFinder$lambda$39(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ActionBar(final IntentKey intentKey, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(204065263);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(intentKey) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(204065263, i2, -1, "com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2.ActionBar (RhyOverviewFragmentV2.kt:790)");
            }
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 1, null);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RhyOverviewFragmentV2.ActionBar$lambda$41$lambda$40(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RhyOverviewFragmentV2.ActionBar$lambda$43$lambda$42(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function0 function02 = (Function0) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RhyOverviewFragmentV2.ActionBar$lambda$45$lambda$44(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Function0 function03 = (Function0) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            boolean z = intentKey != null;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(intentKey) | composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RhyOverviewFragmentV2.ActionBar$lambda$48$lambda$47(intentKey, this);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            RhyOverviewActionBar.RhyOverviewActionBar(modifierM5144paddingVpY3zN4$default, function0, function02, function03, z, (Function0) objRememberedValue4, composerStartRestartGroup, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyOverviewFragmentV2.ActionBar$lambda$49(this.f$0, intentKey, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ActionBar$lambda$41$lambda$40(RhyOverviewFragmentV2 rhyOverviewFragmentV2) {
        EventLogger eventLogger = rhyOverviewFragmentV2.getEventLogger();
        RhyEventLoggingUtils rhyEventLoggingUtils = RhyEventLoggingUtils.INSTANCE;
        Screen rhyTabScreen = rhyEventLoggingUtils.getRhyTabScreen();
        Component component = new Component(Component.ComponentType.BUTTON, "transfer", null, 4, null);
        Context rhyTabContext = rhyEventLoggingUtils.getRhyTabContext();
        MAXTransferContext.EntryPoint entryPoint = MAXTransferContext.EntryPoint.SPENDING_HOME_WITH_ACTION_BAR;
        String lowerCase = "SPENDING_HOME_WITH_ACTION_BAR".toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, rhyTabScreen, component, null, Context.copy$default(rhyTabContext, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new MAXTransferContext(null, null, null, null, null, null, entryPoint, null, null, null, null, null, null, null, null, lowerCase, null, null, null, null, 1015743, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -131073, -1, -1, -1, -1, 16383, null), false, 41, null);
        rhyOverviewFragmentV2.showTransferMoney(entryPoint);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ActionBar$lambda$43$lambda$42(RhyOverviewFragmentV2 rhyOverviewFragmentV2) {
        EventLogger.DefaultImpls.logTap$default(rhyOverviewFragmentV2.getEventLogger(), UserInteractionEventData.Action.PAY, RhyEventLoggingUtils.INSTANCE.getRhyTabScreen(), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, null, false, 56, null);
        Navigator navigator = rhyOverviewFragmentV2.getNavigator();
        android.content.Context contextRequireContext = rhyOverviewFragmentV2.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new MatchaTransaction.Create(MatchaTransaction.Direction.SEND, MatchaTransaction.EntryPoint.CASH_TAB), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ActionBar$lambda$45$lambda$44(RhyOverviewFragmentV2 rhyOverviewFragmentV2) {
        EventLogger.DefaultImpls.logTap$default(rhyOverviewFragmentV2.getEventLogger(), UserInteractionEventData.Action.REQUEST, RhyEventLoggingUtils.INSTANCE.getRhyTabScreen(), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, null, false, 56, null);
        Navigator navigator = rhyOverviewFragmentV2.getNavigator();
        android.content.Context contextRequireContext = rhyOverviewFragmentV2.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new MatchaTransaction.Create(MatchaTransaction.Direction.REQUEST, MatchaTransaction.EntryPoint.CASH_TAB), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ActionBar$lambda$48$lambda$47(IntentKey intentKey, RhyOverviewFragmentV2 rhyOverviewFragmentV2) {
        if (intentKey != null) {
            Navigator navigator = rhyOverviewFragmentV2.getNavigator();
            android.content.Context contextRequireContext = rhyOverviewFragmentV2.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, intentKey, null, false, null, null, 60, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showDebugAddCardToGooglePay() {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder negativeButton = companion.create(contextRequireContext).setId(C10285R.id.dialog_id_cash_rhy_tab_debug_add_gpay_token).setUseDesignSystemOverlay(true).setPogPictogram(C20690R.drawable.pict_mono_rds_payment_card).setTitle("Test Add Card to Google Wallet").setMessage("Fake adding a card to Google Wallet").setPositiveButton(C11048R.string.general_label_continue, new Object[0]).setNegativeButton(C11048R.string.general_label_cancel, new Object[0]);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(negativeButton, childFragmentManager, "alert", false, 4, null);
    }

    @Override // com.robinhood.android.cash.rhy.tab.p077v2.p078ui.RhyTopAppBar4
    public void onMessagesClicked() {
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, LegacyFragmentKey.InboxThreadList.INSTANCE, false, false, false, null, false, null, false, false, null, null, 4092, null);
    }

    @Override // com.robinhood.android.cash.rhy.tab.p077v2.p078ui.RhyTopAppBar4
    public void onSearchClicked() {
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new SearchFragmentKey(null, null, null, null, null, null, false, null, 255, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClickRhyReferrals() {
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.ENTER_REFERRAL_FLOW, RhyEventLoggingUtils.INSTANCE.getRhyTabScreen(), new Component(Component.ComponentType.ROW, null, null, 6, null), null, getRhyGlobalLoggingContext().eventContext(RHYContext.ProductArea.REFERRALS, "rhy_home", "cash_tab"), false, 40, null);
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, RhyReferrerLandingKey.INSTANCE, false, false, false, false, null, false, null, null, 1020, null);
    }

    /* compiled from: RhyOverviewFragmentV2.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/RhyOverviewFragmentV2$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/cash/rhy/tab/v2/RhyOverviewFragmentV2;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$RhyOverviewV2;", "<init>", "()V", "FUNDING_BOTTOM_SHEET_TAG", "", "DIALOG_CURRENTLY_DISPLAYED", "REQUEST_PUSH_TOKENIZE", "", "BOTTOM_OFFSET_FOR_DEBIT_CARD_VIEW", "Landroidx/compose/ui/unit/Dp;", "F", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<RhyOverviewFragmentV2, LegacyFragmentKey.RhyOverviewV2> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.RhyOverviewV2 rhyOverviewV2) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, rhyOverviewV2);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.RhyOverviewV2 getArgs(RhyOverviewFragmentV2 rhyOverviewFragmentV2) {
            return (LegacyFragmentKey.RhyOverviewV2) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, rhyOverviewFragmentV2);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RhyOverviewFragmentV2 newInstance(LegacyFragmentKey.RhyOverviewV2 rhyOverviewV2) {
            return (RhyOverviewFragmentV2) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, rhyOverviewV2);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RhyOverviewFragmentV2 rhyOverviewFragmentV2, LegacyFragmentKey.RhyOverviewV2 rhyOverviewV2) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, rhyOverviewFragmentV2, rhyOverviewV2);
        }
    }
}
