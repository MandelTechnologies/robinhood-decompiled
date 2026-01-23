package com.robinhood.android.crypto.tab.p093ui;

import android.content.Context;
import android.net.Uri;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.AnimationModifier;
import androidx.compose.animation.Crossfade;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier7;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.p011ui.unit.TextUnit;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotLongState2;
import androidx.compose.runtime.SnapshotLongState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import androidx.core.os.Bundle2;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.CreationExtras2;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.crypto.p094ui.detail.p095v2.CryptoDetailComposableKt;
import com.robinhood.android.crypto.tab.p093ui.CryptoHomeComposableKt;
import com.robinhood.android.crypto.tab.p093ui.CryptoHomeEvent;
import com.robinhood.android.crypto.tab.p093ui.CryptoHomeViewState;
import com.robinhood.android.crypto.tab.p093ui.appbar.CryptoHomeAppBarComposable;
import com.robinhood.android.crypto.tab.p093ui.discover.CryptoHomeDiscoverComposable4;
import com.robinhood.android.crypto.tab.p093ui.discover.CryptoHomeDiscoverExperimentComposableKt;
import com.robinhood.android.crypto.tab.p093ui.discover.CryptoHomeDiscoverExperimentDuxo;
import com.robinhood.android.crypto.tab.p093ui.discover.CryptoHomeDiscoverExperimentViewState;
import com.robinhood.android.crypto.tab.p093ui.discover.CryptoHomeDiscoverViewState;
import com.robinhood.android.crypto.tab.p093ui.feeTiers.CryptoHomeFeeTierStatusComposable;
import com.robinhood.android.crypto.tab.p093ui.holding.CryptoHomeHoldingsSection;
import com.robinhood.android.crypto.tab.p093ui.interest.CryptoHomeInterestSection4;
import com.robinhood.android.crypto.tab.p093ui.lists.CryptoHomeListsSection;
import com.robinhood.android.crypto.tab.p093ui.lists.cryptoHomeWatchlistSection4;
import com.robinhood.android.crypto.tab.p093ui.news.CryptoHomeNewsComposable;
import com.robinhood.android.crypto.tab.p093ui.pnl.CryptoHomePnlEntryPointComposable;
import com.robinhood.android.crypto.tab.p093ui.power.CryptoBuyingPowerComposable3;
import com.robinhood.android.crypto.tab.p093ui.recurring.CryptoRecurringComposable;
import com.robinhood.android.crypto.tab.p093ui.staking.CryptoStakingOverviewSectionComposable3;
import com.robinhood.android.crypto.tab.p093ui.walletTrending.CryptoHomeWalletTrendingComposable;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiButton2;
import com.robinhood.android.microgramsdui.MicrogramEmbeddedSection3;
import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.newsfeed.view.util.LoggedCustomTabs;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.models.api.FeatureDiscoveryLocation;
import com.robinhood.models.api.home.CryptoHomeComponentType;
import com.robinhood.models.api.trading.CryptoTradingOptionsLocation;
import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherLocation;
import com.robinhood.models.crypto.p314db.explore.CryptoExploreState3;
import com.robinhood.models.crypto.p314db.explore.CryptoExploreState4;
import com.robinhood.models.p320db.IacInfoBannerLocation;
import com.robinhood.models.serverdriven.experimental.api.Button;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.shared.cards.p371v3.CardStackComposable;
import com.robinhood.shared.crypto.buttonBar.CryptoButtonBarArgs;
import com.robinhood.shared.crypto.buttonBar.CryptoButtonBarComposable;
import com.robinhood.shared.crypto.history.section.CryptoHistorySection3;
import com.robinhood.shared.crypto.history.section.CryptoHistorySectionDuxo;
import com.robinhood.shared.crypto.history.section.CryptoHistorySectionState;
import com.robinhood.shared.crypto.movers.CryptoDailyMoversComposable;
import com.robinhood.shared.crypto.pending.section.CryptoPendingSection;
import com.robinhood.shared.crypto.pending.section.CryptoPendingSectionConfig;
import com.robinhood.shared.crypto.top.CryptoHomeTopComposable3;
import com.robinhood.shared.crypto.top.CryptoHomeTopViewState;
import com.robinhood.shared.discover.section.DiscoverSectionComposable;
import com.robinhood.shared.feature.discovery.p382ui.FeatureDiscoveryComponent;
import com.robinhood.shared.iac.infobanner.InfoBannerComponent;
import com.robinhood.shared.portfolio.lists.p391ui.CuratedListState;
import com.robinhood.utils.compose.reorderable.ReorderableLazyColumnKt;
import com.robinhood.utils.compose.reorderable.ReorderableLazyListScope;
import com.robinhood.utils.p409ui.context.BaseContexts;
import io.github.z4kn4fein.semver.Version;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import microgram.android.RemoteMicrogramApplication;

/* compiled from: CryptoHomeComposable.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\u001aG\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0001¢\u0006\u0002\u0010\u0016\u001a-\u0010\u0017\u001a\u00020\n*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00132\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001bH\u0003¢\u0006\u0002\u0010\u001e\u001a0\u0010\u001f\u001a\u00020 2!\u0010!\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\n0\u000eH\u0003¢\u0006\u0002\u0010%\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006&²\u0006\n\u0010'\u001a\u00020(X\u008a\u0084\u0002²\u0006\u0012\u0010)\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*X\u008a\u0084\u0002²\u0006\n\u0010,\u001a\u00020-X\u008a\u0084\u0002²\u0006\n\u0010.\u001a\u00020\u000fX\u008a\u008e\u0002²\u0006\n\u0010/\u001a\u00020\u0013X\u008a\u008e\u0002²\u0006\n\u00100\u001a\u00020\u0013X\u008a\u008e\u0002²\u0006\n\u0010\u0019\u001a\u00020\u0013X\u008a\u0084\u0002²\u0006\n\u00101\u001a\u000202X\u008a\u008e\u0002"}, m3636d2 = {"CryptoHomeLoading", "", "getCryptoHomeLoading$annotations", "()V", "CryptoHomeError", "CryptoHomeLazyColumn", "CryptoHomeCtaButtons", "CTA_BUTTONS_ANIMATION_DURATION_MILLIS", "", "CryptoHomeComposable", "", "loggedCustomTabs", "Lcom/robinhood/android/newsfeed/view/util/LoggedCustomTabs;", "onDirectionChanged", "Lkotlin/Function1;", "Lcom/robinhood/compose/bento/theme/Direction;", "modifier", "Landroidx/compose/ui/Modifier;", "isEmbedded", "", "duxo", "Lcom/robinhood/android/crypto/tab/ui/CryptoHomeDuxo;", "(Lcom/robinhood/android/newsfeed/view/util/LoggedCustomTabs;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLcom/robinhood/android/crypto/tab/ui/CryptoHomeDuxo;Landroidx/compose/runtime/Composer;II)V", "CtaButtons", "Landroidx/compose/foundation/layout/BoxScope;", "showCta", "ctaButtons", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/Button;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "(Landroidx/compose/foundation/layout/BoxScope;ZLkotlinx/collections/immutable/ImmutableList;Landroidx/compose/runtime/Composer;I)V", "rememberCtaButtonsScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "onScrollDirectionChanged", "Lkotlin/ParameterName;", "name", "isScrollingUp", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "feature-crypto-tab_externalDebug", "viewState", "Lcom/robinhood/android/crypto/tab/ui/CryptoHomeViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/crypto/tab/ui/CryptoHomeEvent;", "appBarContentAlpha", "", "direction", "isLastScrollUp", "lastKnownShowCta", "lastVisibilityCheckTimestamp", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CryptoHomeComposableKt {
    private static final int CTA_BUTTONS_ANIMATION_DURATION_MILLIS = 400;
    public static final String CryptoHomeCtaButtons = "cryptoHomeCtaButtons";
    public static final String CryptoHomeError = "cryptoHomeError";
    public static final String CryptoHomeLazyColumn = "cryptoHomeLazyColumn";
    public static final String CryptoHomeLoading = "cryptoHomeLoading";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoHomeComposable$lambda$13(LoggedCustomTabs loggedCustomTabs, Function1 function1, Modifier modifier, boolean z, CryptoHomeDuxo cryptoHomeDuxo, int i, int i2, Composer composer, int i3) {
        CryptoHomeComposable(loggedCustomTabs, function1, modifier, z, cryptoHomeDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int CtaButtons$lambda$15$lambda$14(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int CtaButtons$lambda$17$lambda$16(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CtaButtons$lambda$18(BoxScope boxScope, boolean z, ImmutableList immutableList, int i, Composer composer, int i2) {
        CtaButtons(boxScope, z, immutableList, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getCryptoHomeLoading$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoHomeViewState CryptoHomeComposable$lambda$0(SnapshotState4<CryptoHomeViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<CryptoHomeEvent> CryptoHomeComposable$lambda$1(SnapshotState4<Event<CryptoHomeEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BentoTheme4 CryptoHomeComposable$lambda$10(SnapshotState<BentoTheme4> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CryptoHomeComposable$lambda$7(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoHomeComposable(final LoggedCustomTabs loggedCustomTabs, final Function1<? super BentoTheme4, Unit> onDirectionChanged, Modifier modifier, boolean z, CryptoHomeDuxo cryptoHomeDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        CryptoHomeDuxo cryptoHomeDuxo2;
        Composer composer2;
        String str;
        boolean z3;
        boolean z4;
        int i5;
        int i6;
        Modifier modifier3;
        boolean z5;
        CryptoHomeDuxo cryptoHomeDuxo3;
        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        Event<CryptoHomeEvent> event;
        Object objRememberedValue;
        Composer.Companion companion;
        String str2;
        boolean z6;
        Object objRememberedValue2;
        Object objRememberedValue3;
        final Event<CryptoHomeEvent> eventCryptoHomeComposable$lambda$1;
        Context context;
        final LazyListState lazyListState;
        boolean z7;
        SnapshotState4 snapshotState4;
        final CryptoHomeDiscoverExperimentDuxo cryptoHomeDiscoverExperimentDuxo;
        StateFlow<CryptoHomeDiscoverExperimentViewState> stateFlow;
        final SnapshotState4 snapshotState42;
        Navigator navigator;
        final boolean z8;
        SnapshotState4 snapshotState4CollectAsStateWithLifecycle2;
        final CryptoHomeDuxo cryptoHomeDuxo4;
        final Modifier modifier4;
        final boolean z9;
        EventConsumer<CryptoHomeEvent> eventConsumerInvoke;
        float fMo5015toPxR2X_6o;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(loggedCustomTabs, "loggedCustomTabs");
        Intrinsics.checkNotNullParameter(onDirectionChanged, "onDirectionChanged");
        Composer composerStartRestartGroup = composer.startRestartGroup(-966623675);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(loggedCustomTabs) : composerStartRestartGroup.changedInstance(loggedCustomTabs) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDirectionChanged) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        cryptoHomeDuxo2 = cryptoHomeDuxo;
                        int i8 = composerStartRestartGroup.changedInstance(cryptoHomeDuxo2) ? 16384 : 8192;
                        i3 |= i8;
                    } else {
                        cryptoHomeDuxo2 = cryptoHomeDuxo;
                    }
                    i3 |= i8;
                } else {
                    cryptoHomeDuxo2 = cryptoHomeDuxo;
                }
                if ((i3 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    z9 = z2;
                    cryptoHomeDuxo4 = cryptoHomeDuxo2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier5 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) == 0) {
                            composerStartRestartGroup.startReplaceGroup(-747520797);
                            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                            if (current == null) {
                                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            }
                            ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(1729797275);
                            CreationExtras defaultViewModelCreationExtras = current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
                            z3 = -1633490746;
                            str = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner";
                            z4 = 1729797275;
                            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoHomeDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                            composer2 = composerStartRestartGroup;
                            composer2.endReplaceableGroup();
                            final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                            final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                            composer2.startReplaceGroup(-1633490746);
                            boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                            Object objRememberedValue4 = composer2.rememberedValue();
                            if (zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$$inlined$duxo$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                        lifecycle.addObserver(duxoLifecycleObserver);
                                        final Lifecycle lifecycle2 = lifecycle;
                                        return new DisposableEffectResult() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$$inlined$duxo$1.1
                                            @Override // androidx.compose.runtime.DisposableEffectResult
                                            public void dispose() {
                                                lifecycle2.removeObserver(duxoLifecycleObserver);
                                            }
                                        };
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue4);
                            }
                            composer2.endReplaceGroup();
                            EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composer2, 0);
                            composer2.endReplaceGroup();
                            i6 = i3 & (-57345);
                            modifier3 = modifier5;
                            z5 = z2;
                            cryptoHomeDuxo3 = (CryptoHomeDuxo) baseDuxo;
                            i5 = 0;
                        } else {
                            composer2 = composerStartRestartGroup;
                            str = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner";
                            z3 = -1633490746;
                            z4 = 1729797275;
                            i5 = 0;
                            i6 = i3;
                            modifier3 = modifier5;
                            z5 = z2;
                            cryptoHomeDuxo3 = cryptoHomeDuxo2;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        composer2 = composerStartRestartGroup;
                        str = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner";
                        modifier3 = modifier2;
                        cryptoHomeDuxo3 = cryptoHomeDuxo2;
                        z3 = -1633490746;
                        z4 = 1729797275;
                        i5 = 0;
                        i6 = i3;
                        z5 = z2;
                    }
                    composer2.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-966623675, i6, -1, "com.robinhood.android.crypto.tab.ui.CryptoHomeComposable (CryptoHomeComposable.kt:137)");
                    }
                    Composer composer3 = composer2;
                    String str3 = str;
                    snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoHomeDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer3, 0, 7);
                    final StateFlow<Event<CryptoHomeEvent>> eventFlow = cryptoHomeDuxo3.getEventFlow();
                    composer3.startReplaceGroup(-523522313);
                    LifecycleOwner lifecycleOwner = (LifecycleOwner) composer3.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    Lifecycle.State state = Lifecycle.State.STARTED;
                    CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                    int i9 = i5;
                    Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$$inlined$collectEventAsStateWithLifecycle$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                            Object objCollect = eventFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CryptoHomeComposable.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                    Event event = (Event) obj;
                                    if ((event != null ? event.getData() : null) instanceof CryptoHomeEvent) {
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
                    };
                    Event<CryptoHomeEvent> value = eventFlow.getValue();
                    event = value;
                    if (!((event == null ? event.getData() : null) instanceof CryptoHomeEvent)) {
                        value = null;
                    }
                    boolean z10 = z5;
                    int i10 = i6;
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composer3, 0, 0);
                    composer3.endReplaceGroup();
                    final Context context2 = (Context) composer3.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                    final LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(i9, i9, composer3, i9, 3);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i11 = BentoTheme.$stable;
                    final float fM21590getDefaultD9Ej5fM = bentoTheme.getSpacing(composer3, i11).m21590getDefaultD9Ej5fM();
                    final float fMo5016toPx0680j_4 = density.mo5016toPx0680j_4(fM21590getDefaultD9Ej5fM);
                    TextStyle displayCapsuleLarge = bentoTheme.getTypography(composer3, i11).getDisplayCapsuleLarge();
                    composer3.startReplaceGroup(1849434622);
                    objRememberedValue = composer3.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue != companion.getEmpty()) {
                        if (TextUnit.m8077isSpimpl(displayCapsuleLarge.m7668getLineHeightXSAIIZE())) {
                            str2 = str3;
                            z6 = z10;
                            fMo5015toPxR2X_6o = density.mo5015toPxR2X_6o(displayCapsuleLarge.m7668getLineHeightXSAIIZE());
                        } else {
                            str2 = str3;
                            z6 = z10;
                            fMo5015toPxR2X_6o = density.mo5015toPxR2X_6o(displayCapsuleLarge.m7662getFontSizeXSAIIZE());
                        }
                        objRememberedValue = Float.valueOf(fMo5015toPxR2X_6o + density.mo5016toPx0680j_4(fM21590getDefaultD9Ej5fM));
                        composer3.updateRememberedValue(objRememberedValue);
                    } else {
                        str2 = str3;
                        z6 = z10;
                    }
                    final float fFloatValue = ((Number) objRememberedValue).floatValue();
                    composer3.endReplaceGroup();
                    composer3.startReplaceGroup(1849434622);
                    objRememberedValue2 = composer3.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(CryptoHomeComposableKt.CryptoHomeComposable$lambda$6$lambda$5(lazyListStateRememberLazyListState, fMo5016toPx0680j_4, fFloatValue, snapshotState4CollectAsStateWithLifecycle));
                            }
                        });
                        composer3.updateRememberedValue(objRememberedValue2);
                    }
                    SnapshotState4 snapshotState43 = (SnapshotState4) objRememberedValue2;
                    composer3.endReplaceGroup();
                    Object[] objArr = new Object[0];
                    composer3.startReplaceGroup(1849434622);
                    objRememberedValue3 = composer3.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoHomeComposableKt.CryptoHomeComposable$lambda$9$lambda$8();
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue3);
                    }
                    composer3.endReplaceGroup();
                    String str4 = str2;
                    boolean z11 = z6;
                    final SnapshotState snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue3, composer3, 3072, 6);
                    final Navigator navigator2 = (Navigator) composer3.consume(LocalNavigator.getLocalNavigator());
                    final EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer3, AutoLoggingCompositionLocals4.$stable);
                    eventCryptoHomeComposable$lambda$1 = CryptoHomeComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle3);
                    if (eventCryptoHomeComposable$lambda$1 != null) {
                        if ((eventCryptoHomeComposable$lambda$1.getData() instanceof CryptoHomeEvent.ShowUpsell) && (eventConsumerInvoke = eventCryptoHomeComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(eventCryptoHomeComposable$lambda$1, new Function1() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    m12993invoke(obj);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m12993invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    Navigator.DefaultImpls.handleDeepLink$default(navigator2, context2, Uri.parse(((CryptoHomeEvent.ShowUpsell) eventCryptoHomeComposable$lambda$1.getData()).getDeepLink()), null, null, false, null, 60, null);
                                }
                            });
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                    composer3.startReplaceGroup(-1212335951);
                    Function1<ReorderableLazyListScope, Unit> function1CryptoHomeHoldingsSection = !CryptoHomeComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getComponentTypes().contains(CryptoHomeComponentType.HOLDINGS) ? CryptoHomeHoldingsSection.cryptoHomeHoldingsSection(CryptoHomeComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getAccountNumber(), PositionInstrumentType.CRYPTO, composer3, 48) : null;
                    composer3.endReplaceGroup();
                    composer3.startReplaceGroup(-1212323719);
                    Function1<ReorderableLazyListScope, Unit> function1CryptoHomeHoldingsSection2 = !CryptoHomeComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getComponentTypes().contains(CryptoHomeComponentType.CRYPTO_POSITIONS) ? CryptoHomeHoldingsSection.cryptoHomeHoldingsSection(CryptoHomeComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getAccountNumber(), PositionInstrumentType.CRYPTO, composer3, 48) : null;
                    composer3.endReplaceGroup();
                    composer3.startReplaceGroup(-1212311468);
                    Function1<ReorderableLazyListScope, Unit> function1CryptoHomeHoldingsSection3 = !CryptoHomeComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getComponentTypes().contains(CryptoHomeComponentType.TOKENIZED_STOCKS_POSITIONS) ? CryptoHomeHoldingsSection.cryptoHomeHoldingsSection(CryptoHomeComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getAccountNumber(), PositionInstrumentType.CRYPTO_TOKENIZED_STOCKS, composer3, 48) : null;
                    composer3.endReplaceGroup();
                    composer3.startReplaceGroup(-1212298264);
                    Function1<ReorderableLazyListScope, Unit> function1CryptoHomeHoldingsSection4 = !CryptoHomeComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getComponentTypes().contains(CryptoHomeComponentType.PERPETUALS_POSITIONS) ? CryptoHomeHoldingsSection.cryptoHomeHoldingsSection(CryptoHomeComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getAccountNumber(), PositionInstrumentType.CRYPTO_PERPETUALS, composer3, 48) : null;
                    composer3.endReplaceGroup();
                    boolean zContains = CryptoHomeComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getComponentTypes().contains(CryptoHomeComponentType.WATCHLISTS);
                    composer3.startReplaceGroup(-1212284071);
                    CuratedListState curatedListStateCreateCuratedListSection = !zContains ? CryptoHomeListsSection.createCuratedListSection(CryptoHomeComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getAccountNumber(), composer3, 0) : null;
                    composer3.endReplaceGroup();
                    composer3.startReplaceGroup(-1212277851);
                    if (CryptoHomeComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).isExploreExperimentEnabled()) {
                        context = context2;
                        lazyListState = lazyListStateRememberLazyListState;
                        z7 = z11;
                        snapshotState4 = snapshotState43;
                        cryptoHomeDiscoverExperimentDuxo = null;
                    } else {
                        CryptoHomeDiscoverExperimentDuxo.InitArgs initArgs = new CryptoHomeDiscoverExperimentDuxo.InitArgs(true, 0, null, 6, null);
                        composer3.startReplaceGroup(2050738472);
                        ViewModelStoreOwner current3 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer3, LocalViewModelStoreOwner.$stable);
                        if (current3 == null) {
                            throw new IllegalStateException(str4);
                        }
                        CreationExtras2 creationExtras2 = new CreationExtras2(current3 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current3).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE);
                        creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, initArgs)));
                        ViewModelProvider.Factory factoryCreateViewModelFactory2 = DuxosKt.createViewModelFactory(current3, composer3, 0);
                        composer3.startReplaceableGroup(1729797275);
                        lazyListState = lazyListStateRememberLazyListState;
                        context = context2;
                        snapshotState4 = snapshotState43;
                        z7 = z11;
                        ViewModel viewModel2 = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoHomeDiscoverExperimentDuxo.class), current3, "experiment_duxo", factoryCreateViewModelFactory2, creationExtras2, composer3, 384, 0);
                        composer3.endReplaceableGroup();
                        final BaseDuxo baseDuxo2 = (BaseDuxo) viewModel2;
                        final Lifecycle lifecycle2 = ((LifecycleOwner) composer3.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer3.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composer3.changedInstance(baseDuxo2) | composer3.changedInstance(lifecycle2);
                        Object objRememberedValue5 = composer3.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$$inlined$duxo$2
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo2);
                                    lifecycle2.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle3 = lifecycle2;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$$inlined$duxo$2.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle3.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue5);
                        }
                        composer3.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue5, composer3, 0);
                        composer3.endReplaceGroup();
                        cryptoHomeDiscoverExperimentDuxo = (CryptoHomeDiscoverExperimentDuxo) baseDuxo2;
                    }
                    composer3.endReplaceGroup();
                    stateFlow = cryptoHomeDiscoverExperimentDuxo == null ? cryptoHomeDiscoverExperimentDuxo.getStateFlow() : null;
                    composer3.startReplaceGroup(-1212267230);
                    if (stateFlow != null) {
                        navigator = navigator2;
                        snapshotState42 = snapshotState4;
                        z8 = z7;
                        snapshotState4CollectAsStateWithLifecycle2 = null;
                    } else {
                        snapshotState42 = snapshotState4;
                        navigator = navigator2;
                        StateFlow<CryptoHomeDiscoverExperimentViewState> stateFlow2 = stateFlow;
                        z8 = z7;
                        snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(stateFlow2, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer3, 0, 7);
                    }
                    composer3.endReplaceGroup();
                    boolean z12 = z8;
                    final Navigator navigator3 = navigator;
                    final CryptoHomeDuxo cryptoHomeDuxo5 = cryptoHomeDuxo3;
                    final CryptoHomeDiscoverExperimentViewState cryptoHomeDiscoverExperimentViewState = snapshotState4CollectAsStateWithLifecycle2 != null ? (CryptoHomeDiscoverExperimentViewState) snapshotState4CollectAsStateWithLifecycle2.getValue() : null;
                    final Function1<ReorderableLazyListScope, Unit> function1 = function1CryptoHomeHoldingsSection;
                    final Function1<ReorderableLazyListScope, Unit> function12 = function1CryptoHomeHoldingsSection2;
                    final Function1<ReorderableLazyListScope, Unit> function13 = function1CryptoHomeHoldingsSection3;
                    final CuratedListState curatedListState = curatedListStateCreateCuratedListSection;
                    final Context context3 = context;
                    final Function1<ReorderableLazyListScope, Unit> function14 = function1CryptoHomeHoldingsSection4;
                    Modifier modifier6 = modifier3;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(modifier6, ComposableLambda3.rememberComposableLambda(-1699625719, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt.CryptoHomeComposable.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i12) {
                            if ((i12 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1699625719, i12, -1, "com.robinhood.android.crypto.tab.ui.CryptoHomeComposable.<anonymous> (CryptoHomeComposable.kt:257)");
                            }
                            if (!z8) {
                                CryptoHomeAppBarComposable.CryptoHomeAppBarComposable(CryptoHomeComposableKt.CryptoHomeComposable$lambda$7(snapshotState42), SizeKt.fillMaxWidth$default(WindowInsetsPadding_androidKt.statusBarsPadding(Modifier.INSTANCE), 0.0f, 1, null), null, composer4, 0, 4);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), ComposableLambda3.rememberComposableLambda(-1435928694, true, new C130283(snapshotState4CollectAsStateWithLifecycle), composer3, 54), null, null, 0, 0L, 0L, WindowInsetsKt.WindowInsets$default(0, 0, 0, 0, 14, null), ComposableLambda3.rememberComposableLambda(-692202156, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt.CryptoHomeComposable.4

                        /* compiled from: CryptoHomeComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1, reason: invalid class name */
                        static final class AnonymousClass1 implements Function3<CryptoHomeViewState.ContentState, Composer, Integer, Unit> {
                            final /* synthetic */ Context $context;
                            final /* synthetic */ Function1<ReorderableLazyListScope, Unit> $cryptoHoldingsSection;
                            final /* synthetic */ float $defaultSpacing;
                            final /* synthetic */ SnapshotState<BentoTheme4> $direction$delegate;
                            final /* synthetic */ CryptoHomeDuxo $duxo;
                            final /* synthetic */ EventLogger $eventLogger;
                            final /* synthetic */ Function1<ReorderableLazyListScope, Unit> $holdingsSection;
                            final /* synthetic */ CryptoHomeDiscoverExperimentDuxo $homeDiscoverExperimentDuxo;
                            final /* synthetic */ CryptoHomeDiscoverExperimentViewState $homeDiscoverExperimentViewState;
                            final /* synthetic */ LazyListState $listState;
                            final /* synthetic */ LoggedCustomTabs $loggedCustomTabs;
                            final /* synthetic */ Navigator $navigator;
                            final /* synthetic */ Function1<BentoTheme4, Unit> $onDirectionChanged;
                            final /* synthetic */ Function1<ReorderableLazyListScope, Unit> $perpetualsSection;
                            final /* synthetic */ Function1<ReorderableLazyListScope, Unit> $tokensSection;
                            final /* synthetic */ SnapshotState4<CryptoHomeViewState> $viewState$delegate;
                            final /* synthetic */ CuratedListState $watchlistState;

                            /* compiled from: CryptoHomeComposable.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            /* renamed from: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1$WhenMappings */
                            public /* synthetic */ class WhenMappings {
                                public static final /* synthetic */ int[] $EnumSwitchMapping$0;
                                public static final /* synthetic */ int[] $EnumSwitchMapping$1;

                                static {
                                    int[] iArr = new int[CryptoHomeComponentType.values().length];
                                    try {
                                        iArr[CryptoHomeComponentType.NUX.ordinal()] = 1;
                                    } catch (NoSuchFieldError unused) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.CHART.ordinal()] = 2;
                                    } catch (NoSuchFieldError unused2) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.IN_APP_BANNER.ordinal()] = 3;
                                    } catch (NoSuchFieldError unused3) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.HOLDINGS.ordinal()] = 4;
                                    } catch (NoSuchFieldError unused4) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.CRYPTO_POSITIONS.ordinal()] = 5;
                                    } catch (NoSuchFieldError unused5) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.TOKENIZED_STOCKS_POSITIONS.ordinal()] = 6;
                                    } catch (NoSuchFieldError unused6) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.PERPETUALS_POSITIONS.ordinal()] = 7;
                                    } catch (NoSuchFieldError unused7) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.RECURRING.ordinal()] = 8;
                                    } catch (NoSuchFieldError unused8) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.NEWS.ordinal()] = 9;
                                    } catch (NoSuchFieldError unused9) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.DISCOVER_COINS.ordinal()] = 10;
                                    } catch (NoSuchFieldError unused10) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.EDUCATION.ordinal()] = 11;
                                    } catch (NoSuchFieldError unused11) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.NUX_ONBOARDING.ordinal()] = 12;
                                    } catch (NoSuchFieldError unused12) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.TOP_CRYPTOS.ordinal()] = 13;
                                    } catch (NoSuchFieldError unused13) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.FIRST_DEPOSIT_BANNER.ordinal()] = 14;
                                    } catch (NoSuchFieldError unused14) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.REWARDS_CARD.ordinal()] = 15;
                                    } catch (NoSuchFieldError unused15) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.UPSELL_CARD.ordinal()] = 16;
                                    } catch (NoSuchFieldError unused16) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.DAILY_MOVERS.ordinal()] = 17;
                                    } catch (NoSuchFieldError unused17) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.NOTIFICATION_CARDS.ordinal()] = 18;
                                    } catch (NoSuchFieldError unused18) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.BUYING_POWER.ordinal()] = 19;
                                    } catch (NoSuchFieldError unused19) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.STAKING.ordinal()] = 20;
                                    } catch (NoSuchFieldError unused20) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.SUPPORT.ordinal()] = 21;
                                    } catch (NoSuchFieldError unused21) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.PENDING.ordinal()] = 22;
                                    } catch (NoSuchFieldError unused22) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.PENDING_ORDERS.ordinal()] = 23;
                                    } catch (NoSuchFieldError unused23) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.FEATURE_DISCOVERY.ordinal()] = 24;
                                    } catch (NoSuchFieldError unused24) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.WATCHLISTS.ordinal()] = 25;
                                    } catch (NoSuchFieldError unused25) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.TOP_LEVEL_BANNER.ordinal()] = 26;
                                    } catch (NoSuchFieldError unused26) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.DISCLOSURES.ordinal()] = 27;
                                    } catch (NoSuchFieldError unused27) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.TRENDING.ordinal()] = 28;
                                    } catch (NoSuchFieldError unused28) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.HISTORY.ordinal()] = 29;
                                    } catch (NoSuchFieldError unused29) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.PNL_HUB_ENTRY_POINT.ordinal()] = 30;
                                    } catch (NoSuchFieldError unused30) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.FEE_TIER_STATUS.ordinal()] = 31;
                                    } catch (NoSuchFieldError unused31) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.PULSE.ordinal()] = 32;
                                    } catch (NoSuchFieldError unused32) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.TOP_MOVERS.ordinal()] = 33;
                                    } catch (NoSuchFieldError unused33) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.WALLET_TRENDING.ordinal()] = 34;
                                    } catch (NoSuchFieldError unused34) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.CASH_INTEREST.ordinal()] = 35;
                                    } catch (NoSuchFieldError unused35) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.UNKNOWN.ordinal()] = 36;
                                    } catch (NoSuchFieldError unused36) {
                                    }
                                    $EnumSwitchMapping$0 = iArr;
                                    int[] iArr2 = new int[CryptoHomeViewState.ContentState.values().length];
                                    try {
                                        iArr2[CryptoHomeViewState.ContentState.LOADING.ordinal()] = 1;
                                    } catch (NoSuchFieldError unused37) {
                                    }
                                    try {
                                        iArr2[CryptoHomeViewState.ContentState.ERROR.ordinal()] = 2;
                                    } catch (NoSuchFieldError unused38) {
                                    }
                                    try {
                                        iArr2[CryptoHomeViewState.ContentState.CONTENT.ordinal()] = 3;
                                    } catch (NoSuchFieldError unused39) {
                                    }
                                    $EnumSwitchMapping$1 = iArr2;
                                }
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            AnonymousClass1(LazyListState lazyListState, SnapshotState4<CryptoHomeViewState> snapshotState4, SnapshotState<BentoTheme4> snapshotState, Function1<? super BentoTheme4, Unit> function1, Function1<? super ReorderableLazyListScope, Unit> function12, Function1<? super ReorderableLazyListScope, Unit> function13, Function1<? super ReorderableLazyListScope, Unit> function14, Function1<? super ReorderableLazyListScope, Unit> function15, Navigator navigator, LoggedCustomTabs loggedCustomTabs, EventLogger eventLogger, CryptoHomeDiscoverExperimentDuxo cryptoHomeDiscoverExperimentDuxo, CryptoHomeDiscoverExperimentViewState cryptoHomeDiscoverExperimentViewState, Context context, CryptoHomeDuxo cryptoHomeDuxo, CuratedListState curatedListState, float f) {
                                this.$listState = lazyListState;
                                this.$viewState$delegate = snapshotState4;
                                this.$direction$delegate = snapshotState;
                                this.$onDirectionChanged = function1;
                                this.$holdingsSection = function12;
                                this.$cryptoHoldingsSection = function13;
                                this.$tokensSection = function14;
                                this.$perpetualsSection = function15;
                                this.$navigator = navigator;
                                this.$loggedCustomTabs = loggedCustomTabs;
                                this.$eventLogger = eventLogger;
                                this.$homeDiscoverExperimentDuxo = cryptoHomeDiscoverExperimentDuxo;
                                this.$homeDiscoverExperimentViewState = cryptoHomeDiscoverExperimentViewState;
                                this.$context = context;
                                this.$duxo = cryptoHomeDuxo;
                                this.$watchlistState = curatedListState;
                                this.$defaultSpacing = f;
                            }

                            private static final boolean invoke$lambda$20$lambda$15(SnapshotState<Boolean> snapshotState) {
                                return snapshotState.getValue().booleanValue();
                            }

                            private static final boolean invoke$lambda$20$lambda$19(SnapshotState4<Boolean> snapshotState4) {
                                return snapshotState4.getValue().booleanValue();
                            }

                            private static final boolean invoke$lambda$20$lambda$2(SnapshotState<Boolean> snapshotState) {
                                return snapshotState.getValue().booleanValue();
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            /* renamed from: invoke$lambda$20$lambda$12$lambda$11$lambda$10$componentTopPadding */
                            public static final Modifier m1899x7f67c62f(Modifier modifier, int i, float f) {
                                if (i == 0) {
                                    f = C2002Dp.m7995constructorimpl(0);
                                }
                                return PaddingKt.m5146paddingqDBjuR0$default(modifier, 0.0f, f, 0.0f, 0.0f, 13, null);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(CryptoHomeViewState.ContentState contentState, Composer composer, Integer num) {
                                invoke(contentState, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(CryptoHomeViewState.ContentState contentState, Composer composer, int i) {
                                int i2;
                                Intrinsics.checkNotNullParameter(contentState, "contentState");
                                if ((i & 6) == 0) {
                                    i2 = i | (composer.changed(contentState.ordinal()) ? 4 : 2);
                                } else {
                                    i2 = i;
                                }
                                if ((i2 & 19) == 18 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(785993519, i2, -1, "com.robinhood.android.crypto.tab.ui.CryptoHomeComposable.<anonymous>.<anonymous> (CryptoHomeComposable.kt:287)");
                                }
                                int i3 = WhenMappings.$EnumSwitchMapping$1[contentState.ordinal()];
                                if (i3 == 1) {
                                    composer.startReplaceGroup(-574467940);
                                    LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(TestTag3.testTag(Modifier.INSTANCE, CryptoHomeComposableKt.CryptoHomeLoading), null, true, false, composer, 390, 10);
                                    composer.endReplaceGroup();
                                } else if (i3 == 2) {
                                    composer.startReplaceGroup(-574459690);
                                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableSingletons$CryptoHomeComposableKt.INSTANCE.m12987getLambda$2127179621$feature_crypto_tab_externalDebug(), composer, 6);
                                    composer.endReplaceGroup();
                                } else {
                                    if (i3 != 3) {
                                        composer.startReplaceGroup(-574449297);
                                        composer.endReplaceGroup();
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    composer.startReplaceGroup(-574425627);
                                    final LazyListState lazyListState = this.$listState;
                                    final SnapshotState4<CryptoHomeViewState> snapshotState4 = this.$viewState$delegate;
                                    final SnapshotState<BentoTheme4> snapshotState = this.$direction$delegate;
                                    final Function1<BentoTheme4, Unit> function1 = this.$onDirectionChanged;
                                    final Function1<ReorderableLazyListScope, Unit> function12 = this.$holdingsSection;
                                    final Function1<ReorderableLazyListScope, Unit> function13 = this.$cryptoHoldingsSection;
                                    final Function1<ReorderableLazyListScope, Unit> function14 = this.$tokensSection;
                                    final Function1<ReorderableLazyListScope, Unit> function15 = this.$perpetualsSection;
                                    final Navigator navigator = this.$navigator;
                                    final LoggedCustomTabs loggedCustomTabs = this.$loggedCustomTabs;
                                    final EventLogger eventLogger = this.$eventLogger;
                                    final CryptoHomeDiscoverExperimentDuxo cryptoHomeDiscoverExperimentDuxo = this.$homeDiscoverExperimentDuxo;
                                    final CryptoHomeDiscoverExperimentViewState cryptoHomeDiscoverExperimentViewState = this.$homeDiscoverExperimentViewState;
                                    final Context context = this.$context;
                                    final CryptoHomeDuxo cryptoHomeDuxo = this.$duxo;
                                    final CuratedListState curatedListState = this.$watchlistState;
                                    final float f = this.$defaultSpacing;
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    Object[] objArr = new Object[0];
                                    composer.startReplaceGroup(1849434622);
                                    Object objRememberedValue = composer.rememberedValue();
                                    Composer.Companion companion3 = Composer.INSTANCE;
                                    if (objRememberedValue == companion3.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return CryptoHomeComposableKt.C130294.AnonymousClass1.invoke$lambda$20$lambda$1$lambda$0();
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    final SnapshotState snapshotState2 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composer, 3072, 6);
                                    composer.startReplaceGroup(5004770);
                                    boolean zChanged = composer.changed(snapshotState2);
                                    Object objRememberedValue2 = composer.rememberedValue();
                                    if (zChanged || objRememberedValue2 == companion3.getEmpty()) {
                                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return CryptoHomeComposableKt.C130294.AnonymousClass1.invoke$lambda$20$lambda$5$lambda$4(snapshotState2, ((Boolean) obj).booleanValue());
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer.endReplaceGroup();
                                    Modifier modifierTestTag = TestTag3.testTag(NestedScrollModifier7.nestedScroll$default(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), CryptoHomeComposableKt.rememberCtaButtonsScrollConnection((Function1) objRememberedValue2, composer, 0), null, 2, null), CryptoHomeComposableKt.CryptoHomeLazyColumn);
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i4 = BentoTheme.$stable;
                                    PaddingValues paddingValuesM5139PaddingValuesa9UjIt4$default = PaddingKt.m5139PaddingValuesa9UjIt4$default(0.0f, bentoTheme.getSpacing(composer, i4).m21595getXsmallD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i4).m21592getMediumD9Ej5fM(), 5, null);
                                    composer.startReplaceGroup(-1224400529);
                                    boolean zChanged2 = composer.changed(snapshotState4) | composer.changed(snapshotState) | composer.changed(function1) | composer.changed(function12) | composer.changed(function13) | composer.changed(function14) | composer.changed(function15) | composer.changedInstance(navigator) | composer.changedInstance(loggedCustomTabs) | composer.changedInstance(eventLogger) | composer.changedInstance(cryptoHomeDiscoverExperimentDuxo) | composer.changedInstance(cryptoHomeDiscoverExperimentViewState) | composer.changedInstance(context) | composer.changedInstance(cryptoHomeDuxo) | composer.changedInstance(curatedListState) | composer.changed(f);
                                    Object objRememberedValue3 = composer.rememberedValue();
                                    if (zChanged2 || objRememberedValue3 == companion3.getEmpty()) {
                                        Object obj = new Function1() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                return CryptoHomeComposableKt.C130294.AnonymousClass1.invoke$lambda$20$lambda$12$lambda$11(snapshotState4, function12, function13, function14, function15, cryptoHomeDiscoverExperimentDuxo, cryptoHomeDiscoverExperimentViewState, curatedListState, cryptoHomeDuxo, context, navigator, snapshotState, function1, loggedCustomTabs, eventLogger, f, (ReorderableLazyListScope) obj2);
                                            }
                                        };
                                        composer.updateRememberedValue(obj);
                                        objRememberedValue3 = obj;
                                    }
                                    composer.endReplaceGroup();
                                    ReorderableLazyColumnKt.ReorderableLazyColumn(modifierTestTag, lazyListState, paddingValuesM5139PaddingValuesa9UjIt4$default, false, null, null, null, false, (Function1) objRememberedValue3, composer, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                                    composer.startReplaceGroup(828229602);
                                    if (!CryptoHomeComposableKt.CryptoHomeComposable$lambda$0(snapshotState4).isCryptoMibExperimentEnabled()) {
                                        Object[] objArr2 = new Object[0];
                                        composer.startReplaceGroup(1849434622);
                                        Object objRememberedValue4 = composer.rememberedValue();
                                        if (objRememberedValue4 == companion3.getEmpty()) {
                                            objRememberedValue4 = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1$$ExternalSyntheticLambda3
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return CryptoHomeComposableKt.C130294.AnonymousClass1.invoke$lambda$20$lambda$14$lambda$13();
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue4);
                                        }
                                        composer.endReplaceGroup();
                                        final SnapshotState snapshotState3 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue4, composer, 3072, 6);
                                        composer.startReplaceGroup(1849434622);
                                        Object objRememberedValue5 = composer.rememberedValue();
                                        if (objRememberedValue5 == companion3.getEmpty()) {
                                            objRememberedValue5 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1$$ExternalSyntheticLambda4
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return Boolean.valueOf(CryptoHomeComposableKt.C130294.AnonymousClass1.invoke$lambda$20$lambda$18$lambda$17(lazyListState, snapshotState4, snapshotState2, snapshotState3));
                                                }
                                            });
                                            composer.updateRememberedValue(objRememberedValue5);
                                        }
                                        composer.endReplaceGroup();
                                        CryptoHomeComposableKt.CtaButtons(boxScopeInstance, invoke$lambda$20$lambda$19((SnapshotState4) objRememberedValue5), CryptoHomeComposableKt.CryptoHomeComposable$lambda$0(snapshotState4).getCtaButtons(), composer, 6);
                                    }
                                    composer.endReplaceGroup();
                                    composer.endNode();
                                    composer.endReplaceGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final SnapshotState invoke$lambda$20$lambda$1$lambda$0() {
                                return SnapshotState3.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                            }

                            private static final void invoke$lambda$20$lambda$3(SnapshotState<Boolean> snapshotState, boolean z) {
                                snapshotState.setValue(Boolean.valueOf(z));
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$20$lambda$5$lambda$4(SnapshotState snapshotState, boolean z) {
                                invoke$lambda$20$lambda$3(snapshotState, z);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                            public static final Unit invoke$lambda$20$lambda$12$lambda$11(final SnapshotState4 snapshotState4, Function1 function1, Function1 function12, Function1 function13, Function1 function14, CryptoHomeDiscoverExperimentDuxo cryptoHomeDiscoverExperimentDuxo, CryptoHomeDiscoverExperimentViewState cryptoHomeDiscoverExperimentViewState, CuratedListState curatedListState, CryptoHomeDuxo cryptoHomeDuxo, Context context, Navigator navigator, final SnapshotState snapshotState, Function1 function15, final LoggedCustomTabs loggedCustomTabs, final EventLogger eventLogger, final float f, ReorderableLazyListScope reorderableLazyListScope) {
                                final Navigator navigator2;
                                final Context context2 = context;
                                Navigator navigator3 = navigator;
                                ReorderableLazyListScope ReorderableLazyColumn = reorderableLazyListScope;
                                Intrinsics.checkNotNullParameter(ReorderableLazyColumn, "$this$ReorderableLazyColumn");
                                final int i = 0;
                                for (CryptoHomeComponentType cryptoHomeComponentType : CryptoHomeComposableKt.CryptoHomeComposable$lambda$0(snapshotState4).getComponentTypes()) {
                                    int i2 = i + 1;
                                    if (i < 0) {
                                        CollectionsKt.throwIndexOverflow();
                                    }
                                    switch (WhenMappings.$EnumSwitchMapping$0[cryptoHomeComponentType.ordinal()]) {
                                        case 1:
                                            navigator2 = navigator3;
                                            LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableSingletons$CryptoHomeComposableKt.INSTANCE.m12985getLambda$1509284483$feature_crypto_tab_externalDebug(), 3, null);
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 2:
                                            navigator2 = navigator3;
                                            LazyListScope.item$default(ReorderableLazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-207311500, true, new CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$1(snapshotState, function15, snapshotState4)), 3, null);
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 3:
                                        case 36:
                                            navigator2 = navigator3;
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 4:
                                            navigator2 = navigator3;
                                            if (function1 != null) {
                                                function1.invoke(ReorderableLazyColumn);
                                            }
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 5:
                                            navigator2 = navigator3;
                                            if (function12 != null) {
                                                function12.invoke(ReorderableLazyColumn);
                                            }
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 6:
                                            navigator2 = navigator3;
                                            if (function13 != null) {
                                                function13.invoke(ReorderableLazyColumn);
                                            }
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 7:
                                            navigator2 = navigator3;
                                            if (function14 != null) {
                                                function14.invoke(ReorderableLazyColumn);
                                            }
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 8:
                                            navigator2 = navigator3;
                                            LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableLambda3.composableLambdaInstance(-790667398, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$2
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                                    invoke(lazyItemScope, composer, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(LazyItemScope item, Composer composer, int i3) {
                                                    Intrinsics.checkNotNullParameter(item, "$this$item");
                                                    if ((i3 & 17) == 16 && composer.getSkipping()) {
                                                        composer.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-790667398, i3, -1, "com.robinhood.android.crypto.tab.ui.CryptoHomeComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoHomeComposable.kt:356)");
                                                    }
                                                    CryptoRecurringComposable.CryptoRecurringComposable(CryptoHomeComposableKt.C130294.AnonymousClass1.m1899x7f67c62f(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), i, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21594getXlargeD9Ej5fM()), null, composer, 0, 2);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }), 3, null);
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 9:
                                            navigator2 = navigator3;
                                            LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableLambda3.composableLambdaInstance(1259590267, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$3
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                                    invoke(lazyItemScope, composer, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(LazyItemScope item, Composer composer, int i3) {
                                                    Intrinsics.checkNotNullParameter(item, "$this$item");
                                                    if ((i3 & 17) == 16 && composer.getSkipping()) {
                                                        composer.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1259590267, i3, -1, "com.robinhood.android.crypto.tab.ui.CryptoHomeComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoHomeComposable.kt:364)");
                                                    }
                                                    CryptoHomeNewsComposable.CryptoHomeNewsComposable(navigator2, loggedCustomTabs, eventLogger, null, composer, LoggedCustomTabs.$stable << 3, 8);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }), 3, null);
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 10:
                                            if (cryptoHomeDiscoverExperimentDuxo == null) {
                                                CryptoHomeDiscoverViewState discoverViewState = CryptoHomeComposableKt.CryptoHomeComposable$lambda$0(snapshotState4).getDiscoverViewState();
                                                if (discoverViewState != null) {
                                                    CryptoHomeDiscoverComposable4.cryptoHomeDiscoverComposable(reorderableLazyListScope, context, navigator, eventLogger, new CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$5$1(cryptoHomeDuxo), new CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$5$2(cryptoHomeDuxo), discoverViewState);
                                                    navigator2 = navigator;
                                                }
                                                context2 = context;
                                                ReorderableLazyColumn = reorderableLazyListScope;
                                                navigator3 = navigator2;
                                                i = i2;
                                            } else if (cryptoHomeDiscoverExperimentViewState != null) {
                                                CryptoHomeDiscoverExperimentComposableKt.cryptoHomeDiscoverExperimentItems$default(reorderableLazyListScope, cryptoHomeDiscoverExperimentViewState, context, navigator, true, cryptoHomeDiscoverExperimentDuxo, null, 32, null);
                                            }
                                            navigator2 = navigator;
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 11:
                                            LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableSingletons$CryptoHomeComposableKt.INSTANCE.getLambda$981447412$feature_crypto_tab_externalDebug(), 3, null);
                                            navigator2 = navigator;
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 12:
                                            LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableSingletons$CryptoHomeComposableKt.INSTANCE.m12983getLambda$1263262219$feature_crypto_tab_externalDebug(), 3, null);
                                            navigator2 = navigator;
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 13:
                                            CryptoHomeTopViewState topCryptosViewState = CryptoHomeComposableKt.CryptoHomeComposable$lambda$0(snapshotState4).getTopCryptosViewState();
                                            if (topCryptosViewState != null) {
                                                CryptoHomeTopComposable3.cryptoHomeTopComposable(reorderableLazyListScope, context2, navigator3, eventLogger, new CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$6$1(cryptoHomeDuxo), topCryptosViewState);
                                            }
                                            navigator2 = navigator;
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 14:
                                            LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableSingletons$CryptoHomeComposableKt.INSTANCE.m12984getLambda$1457714185$feature_crypto_tab_externalDebug(), 3, null);
                                            navigator2 = navigator3;
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 15:
                                            LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableSingletons$CryptoHomeComposableKt.INSTANCE.getLambda$592543480$feature_crypto_tab_externalDebug(), 3, null);
                                            navigator2 = navigator3;
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 16:
                                            LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableLambda3.composableLambdaInstance(-1652166151, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$7
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                                    invoke(lazyItemScope, composer, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(LazyItemScope item, Composer composer, int i3) {
                                                    Intrinsics.checkNotNullParameter(item, "$this$item");
                                                    if ((i3 & 17) == 16 && composer.getSkipping()) {
                                                        composer.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1652166151, i3, -1, "com.robinhood.android.crypto.tab.ui.CryptoHomeComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoHomeComposable.kt:428)");
                                                    }
                                                    Modifier modifierAnimateContentSize$default = AnimationModifier.animateContentSize$default(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, 3, null);
                                                    RemoteMicrogramApplication remoteMicrogramApplication = new RemoteMicrogramApplication(CryptoDetailComposableKt.MicrogramAppName, new Version(0, 0, 6, null, null, 24, null));
                                                    FragmentManager supportFragmentManager = BaseContexts.requireActivityBaseContext(context2).getSupportFragmentManager();
                                                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                                                    MicrogramEmbeddedSection3.MicrogramEmbeddedSection(remoteMicrogramApplication, supportFragmentManager, modifierAnimateContentSize$default, "touchpoint=CRYPTO_HOME_TAB", ComposableSingletons$CryptoHomeComposableKt.INSTANCE.m12986getLambda$1664467414$feature_crypto_tab_externalDebug(), null, null, false, "CRYPTO_HOME_TAB", composer, 100690944, 224);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }), 3, null);
                                            navigator2 = navigator3;
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 17:
                                            LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableLambda3.composableLambdaInstance(398091514, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$8
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                                    invoke(lazyItemScope, composer, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(LazyItemScope item, Composer composer, int i3) {
                                                    Intrinsics.checkNotNullParameter(item, "$this$item");
                                                    if ((i3 & 17) == 16 && composer.getSkipping()) {
                                                        composer.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(398091514, i3, -1, "com.robinhood.android.crypto.tab.ui.CryptoHomeComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoHomeComposable.kt:446)");
                                                    }
                                                    CryptoDailyMoversComposable.CryptoDailyMoversComposable(CryptoHomeComposableKt.C130294.AnonymousClass1.m1899x7f67c62f(AnimationModifier.animateContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, 3, null), i, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21594getXlargeD9Ej5fM()), null, null, null, composer, 0, 14);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }), 3, null);
                                            navigator2 = navigator3;
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 18:
                                            LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableLambda3.composableLambdaInstance(-1846618117, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$9
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                                    invoke(lazyItemScope, composer, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(LazyItemScope item, Composer composer, int i3) {
                                                    Intrinsics.checkNotNullParameter(item, "$this$item");
                                                    if ((i3 & 17) == 16 && composer.getSkipping()) {
                                                        composer.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1846618117, i3, -1, "com.robinhood.android.crypto.tab.ui.CryptoHomeComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoHomeComposable.kt:455)");
                                                    }
                                                    CardStackComposable.CardStackComposable(CryptoHomeComposableKt.CryptoHomeComposable$lambda$10(snapshotState), PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 7, null), false, null, composer, 0, 12);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }), 3, null);
                                            navigator2 = navigator3;
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 19:
                                            LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableLambda3.composableLambdaInstance(203639548, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$10
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                                    invoke(lazyItemScope, composer, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(LazyItemScope item, Composer composer, int i3) {
                                                    Intrinsics.checkNotNullParameter(item, "$this$item");
                                                    if ((i3 & 17) == 16 && composer.getSkipping()) {
                                                        composer.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(203639548, i3, -1, "com.robinhood.android.crypto.tab.ui.CryptoHomeComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoHomeComposable.kt:467)");
                                                    }
                                                    CryptoBuyingPowerComposable3.CryptoBuyingPowerComposable(CryptoHomeComposableKt.CryptoHomeComposable$lambda$0(snapshotState4).getHideBuyingPowerDivider(), null, null, composer, 0, 6);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }), 3, null);
                                            navigator2 = navigator3;
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 20:
                                            LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableLambda3.composableLambdaInstance(-2041070083, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$11
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                                    invoke(lazyItemScope, composer, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(LazyItemScope item, Composer composer, int i3) {
                                                    Intrinsics.checkNotNullParameter(item, "$this$item");
                                                    if ((i3 & 17) == 16 && composer.getSkipping()) {
                                                        composer.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-2041070083, i3, -1, "com.robinhood.android.crypto.tab.ui.CryptoHomeComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoHomeComposable.kt:473)");
                                                    }
                                                    CryptoStakingOverviewSectionComposable3.CryptoStakingOverviewSectionComposable(CryptoHomeComposableKt.C130294.AnonymousClass1.m1899x7f67c62f(Modifier.INSTANCE, i, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21594getXlargeD9Ej5fM()), null, composer, 0, 2);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }), 3, null);
                                            navigator2 = navigator3;
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 21:
                                            LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableSingletons$CryptoHomeComposableKt.INSTANCE.getLambda$114925587$feature_crypto_tab_externalDebug(), 3, null);
                                            navigator2 = navigator3;
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 22:
                                        case 23:
                                            LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableLambda3.composableLambdaInstance(-2129784044, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$12
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                                    invoke(lazyItemScope, composer, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(LazyItemScope item, Composer composer, int i3) {
                                                    Intrinsics.checkNotNullParameter(item, "$this$item");
                                                    if ((i3 & 17) == 16 && composer.getSkipping()) {
                                                        composer.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-2129784044, i3, -1, "com.robinhood.android.crypto.tab.ui.CryptoHomeComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoHomeComposable.kt:492)");
                                                    }
                                                    BentoTheme4 bentoTheme4CryptoHomeComposable$lambda$10 = CryptoHomeComposableKt.CryptoHomeComposable$lambda$10(snapshotState);
                                                    final int i4 = i;
                                                    BentoTheme2.BentoTheme(null, null, null, null, null, null, null, bentoTheme4CryptoHomeComposable$lambda$10, ComposableLambda3.rememberComposableLambda(1620355788, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$12.1
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                            invoke(composer2, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(Composer composer2, int i5) {
                                                            if ((i5 & 3) == 2 && composer2.getSkipping()) {
                                                                composer2.skipToGroupEnd();
                                                                return;
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(1620355788, i5, -1, "com.robinhood.android.crypto.tab.ui.CryptoHomeComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoHomeComposable.kt:493)");
                                                            }
                                                            CryptoPendingSection.CryptoPendingSection(CryptoPendingSectionConfig.All.INSTANCE, CryptoHomeComposableKt.C130294.AnonymousClass1.m1899x7f67c62f(Modifier.INSTANCE, i4, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21594getXlargeD9Ej5fM()), null, composer2, CryptoPendingSectionConfig.All.$stable, 4);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                        }
                                                    }, composer, 54), composer, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }), 3, null);
                                            navigator2 = navigator3;
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 24:
                                            LazyListScope.item$default(ReorderableLazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-79526379, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$13
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                                    invoke(lazyItemScope, composer, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(LazyItemScope item, Composer composer, int i3) {
                                                    Intrinsics.checkNotNullParameter(item, "$this$item");
                                                    if ((i3 & 17) == 16 && composer.getSkipping()) {
                                                        composer.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-79526379, i3, -1, "com.robinhood.android.crypto.tab.ui.CryptoHomeComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoHomeComposable.kt:504)");
                                                    }
                                                    FeatureDiscoveryComponent.FeatureDiscoveryComponent(FeatureDiscoveryLocation.RHCE_HOME, null, CryptoHomeComposableKt.C130294.AnonymousClass1.m1899x7f67c62f(Modifier.INSTANCE, i, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21594getXlargeD9Ej5fM()), null, composer, 54, 8);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }), 3, null);
                                            navigator2 = navigator3;
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 25:
                                            cryptoHomeWatchlistSection4.cryptoHomeWatchlistSection(ReorderableLazyColumn, curatedListState, cryptoHomeDuxo, context2, navigator3);
                                            navigator2 = navigator3;
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 26:
                                            LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableLambda3.composableLambdaInstance(-273978345, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$14
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                                    invoke(lazyItemScope, composer, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(LazyItemScope item, Composer composer, int i3) {
                                                    Intrinsics.checkNotNullParameter(item, "$this$item");
                                                    if ((i3 & 17) == 16 && composer.getSkipping()) {
                                                        composer.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-273978345, i3, -1, "com.robinhood.android.crypto.tab.ui.CryptoHomeComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoHomeComposable.kt:521)");
                                                    }
                                                    final int i4 = i;
                                                    final float f2 = f;
                                                    BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(-685771211, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$14.1
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                            invoke(composer2, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(Composer composer2, int i5) {
                                                            if ((i5 & 3) == 2 && composer2.getSkipping()) {
                                                                composer2.skipToGroupEnd();
                                                                return;
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-685771211, i5, -1, "com.robinhood.android.crypto.tab.ui.CryptoHomeComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoHomeComposable.kt:522)");
                                                            }
                                                            InfoBannerComponent.InfoBannerComponent(null, IacInfoBannerLocation.INFO_BANNER_CRYPTO_TAB_MOBILE_TOP_LEVEL, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, i4 == 0 ? C2002Dp.m7995constructorimpl(0) : f2, 0.0f, f2, 5, null), null, null, null, null, null, null, null, null, null, null, composer2, 54, 0, 8184);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                        }
                                                    }, composer, 54), composer, 6);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }), 3, null);
                                            navigator2 = navigator3;
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 27:
                                            LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableSingletons$CryptoHomeComposableKt.INSTANCE.getLambda$1776279320$feature_crypto_tab_externalDebug(), 3, null);
                                            navigator2 = navigator3;
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 28:
                                            LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableLambda3.composableLambdaInstance(-468430311, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$15
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                                    invoke(lazyItemScope, composer, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(LazyItemScope item, Composer composer, int i3) {
                                                    Intrinsics.checkNotNullParameter(item, "$this$item");
                                                    if ((i3 & 17) == 16 && composer.getSkipping()) {
                                                        composer.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-468430311, i3, -1, "com.robinhood.android.crypto.tab.ui.CryptoHomeComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoHomeComposable.kt:541)");
                                                    }
                                                    CryptoDailyMoversComposable.CryptoDailyMoversComposable(CryptoHomeComposableKt.C130294.AnonymousClass1.m1899x7f67c62f(AnimationModifier.animateContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, 3, null), i, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21594getXlargeD9Ej5fM()), CryptoTradingOptionsLocation.TRENDING, null, null, composer, 48, 12);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }), 3, null);
                                            navigator2 = navigator3;
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 29:
                                            LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableLambda3.composableLambdaInstance(1581827354, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$16
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                                    invoke(lazyItemScope, composer, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(LazyItemScope item, Composer composer, int i3) {
                                                    Intrinsics.checkNotNullParameter(item, "$this$item");
                                                    if ((i3 & 17) == 16 && composer.getSkipping()) {
                                                        composer.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1581827354, i3, -1, "com.robinhood.android.crypto.tab.ui.CryptoHomeComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoHomeComposable.kt:551)");
                                                    }
                                                    CryptoHistorySection3.CryptoHistorySection(new CryptoHistorySectionDuxo.Args(new CryptoHistorySectionState.Crypto(null, null, 2, null), CryptoAccountSwitcherLocation.Home.INSTANCE), CryptoHomeComposableKt.C130294.AnonymousClass1.m1899x7f67c62f(Modifier.INSTANCE, i, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21594getXlargeD9Ej5fM()), false, null, composer, CryptoHistorySectionDuxo.Args.$stable, 12);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }), 3, null);
                                            navigator2 = navigator3;
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 30:
                                            final String accountNumber = CryptoHomeComposableKt.CryptoHomeComposable$lambda$0(snapshotState4).getAccountNumber();
                                            if (accountNumber != null) {
                                                LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableLambda3.composableLambdaInstance(608764667, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$17$1
                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                                        invoke(lazyItemScope, composer, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(LazyItemScope item, Composer composer, int i3) {
                                                        Intrinsics.checkNotNullParameter(item, "$this$item");
                                                        if ((i3 & 17) == 16 && composer.getSkipping()) {
                                                            composer.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(608764667, i3, -1, "com.robinhood.android.crypto.tab.ui.CryptoHomeComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoHomeComposable.kt:565)");
                                                        }
                                                        CryptoHomePnlEntryPointComposable.CryptoHomePnlEntryPointComposable(accountNumber, null, null, composer, 0, 6);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }), 3, null);
                                            }
                                            navigator2 = navigator3;
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 31:
                                            LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableLambda3.composableLambdaInstance(1387375388, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$18
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                                    invoke(lazyItemScope, composer, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(LazyItemScope item, Composer composer, int i3) {
                                                    Intrinsics.checkNotNullParameter(item, "$this$item");
                                                    if ((i3 & 17) == 16 && composer.getSkipping()) {
                                                        composer.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1387375388, i3, -1, "com.robinhood.android.crypto.tab.ui.CryptoHomeComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoHomeComposable.kt:572)");
                                                    }
                                                    CryptoHomeFeeTierStatusComposable.CryptoHomeFeeTierStatusComposable(CryptoHomeComposableKt.C130294.AnonymousClass1.m1899x7f67c62f(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null), i, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21594getXlargeD9Ej5fM()), null, composer, 0, 2);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }), 3, null);
                                            navigator2 = navigator3;
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 32:
                                            LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableSingletons$CryptoHomeComposableKt.INSTANCE.m12988getLambda$751596238$feature_crypto_tab_externalDebug(), 3, null);
                                            navigator2 = navigator3;
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 33:
                                            LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableLambda3.composableLambdaInstance(1298661427, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$19
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                                    invoke(lazyItemScope, composer, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(LazyItemScope item, Composer composer, int i3) {
                                                    Intrinsics.checkNotNullParameter(item, "$this$item");
                                                    if ((i3 & 17) == 16 && composer.getSkipping()) {
                                                        composer.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1298661427, i3, -1, "com.robinhood.android.crypto.tab.ui.CryptoHomeComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoHomeComposable.kt:587)");
                                                    }
                                                    DiscoverSectionComposable.DiscoverSectionComposable(CryptoExploreState3.CRYPTO, CryptoExploreState4.CHP_CHIPS, CryptoHomeComposableKt.C130294.AnonymousClass1.m1899x7f67c62f(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), i, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21594getXlargeD9Ej5fM()), null, false, null, FragmentTab.CRYPTO, null, null, composer, 1572918, 440);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }), 3, null);
                                            navigator2 = navigator3;
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 34:
                                            LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableLambda3.composableLambdaInstance(-946048204, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$20
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                                    invoke(lazyItemScope, composer, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(LazyItemScope item, Composer composer, int i3) {
                                                    Intrinsics.checkNotNullParameter(item, "$this$item");
                                                    if ((i3 & 17) == 16 && composer.getSkipping()) {
                                                        composer.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-946048204, i3, -1, "com.robinhood.android.crypto.tab.ui.CryptoHomeComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoHomeComposable.kt:599)");
                                                    }
                                                    CryptoHomeWalletTrendingComposable.CryptoHomeWalletTrendingComposable(CryptoHomeComposableKt.C130294.AnonymousClass1.m1899x7f67c62f(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), i, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21594getXlargeD9Ej5fM()), null, composer, 0, 2);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }), 3, null);
                                            navigator2 = navigator3;
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 35:
                                            LazyListScope.item$default(ReorderableLazyColumn, null, null, ComposableLambda3.composableLambdaInstance(1104209461, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$21
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                                    invoke(lazyItemScope, composer, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(LazyItemScope item, Composer composer, int i3) {
                                                    Intrinsics.checkNotNullParameter(item, "$this$item");
                                                    if ((i3 & 17) == 16 && composer.getSkipping()) {
                                                        composer.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1104209461, i3, -1, "com.robinhood.android.crypto.tab.ui.CryptoHomeComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoHomeComposable.kt:609)");
                                                    }
                                                    CryptoHomeInterestSection4.CryptoHomeInterestSection(CryptoHomeComposableKt.C130294.AnonymousClass1.m1899x7f67c62f(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), i, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21594getXlargeD9Ej5fM()), null, composer, 0, 2);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }), 3, null);
                                            navigator2 = navigator3;
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        default:
                                            throw new NoWhenBranchMatchedException();
                                    }
                                }
                                if (CryptoHomeComposableKt.CryptoHomeComposable$lambda$0(snapshotState4).getShowBottomDisclosure()) {
                                    LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableSingletons$CryptoHomeComposableKt.INSTANCE.m12989getLambda$884003582$feature_crypto_tab_externalDebug(), 3, null);
                                }
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final SnapshotState invoke$lambda$20$lambda$14$lambda$13() {
                                return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            }

                            private static final void invoke$lambda$20$lambda$16(SnapshotState<Boolean> snapshotState, boolean z) {
                                snapshotState.setValue(Boolean.valueOf(z));
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final boolean invoke$lambda$20$lambda$18$lambda$17(LazyListState lazyListState, SnapshotState4 snapshotState4, SnapshotState snapshotState, SnapshotState snapshotState2) {
                                if (lazyListState.getLayoutInfo().getTotalItemsCount() > 0) {
                                    boolean z = !CryptoHomeComposableKt.CryptoHomeComposable$lambda$0(snapshotState4).getCtaButtons().isEmpty() && ((invoke$lambda$20$lambda$2(snapshotState) && lazyListState.getCanScrollForward()) || !lazyListState.getCanScrollBackward());
                                    invoke$lambda$20$lambda$16(snapshotState2, z);
                                    return z;
                                }
                                return invoke$lambda$20$lambda$15(snapshotState2);
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer4, Integer num) {
                            invoke(paddingValues, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues paddingValues, Composer composer4, int i12) {
                            int i13;
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i12 & 6) == 0) {
                                i13 = i12 | (composer4.changed(paddingValues) ? 4 : 2);
                            } else {
                                i13 = i12;
                            }
                            if ((i13 & 19) == 18 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-692202156, i13, -1, "com.robinhood.android.crypto.tab.ui.CryptoHomeComposable.<anonymous> (CryptoHomeComposable.kt:277)");
                            }
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            float top = paddingValues.getTop();
                            float bottom = paddingValues.getBottom();
                            LayoutDirection layoutDirection = LayoutDirection.Ltr;
                            Crossfade.Crossfade(CryptoHomeComposableKt.CryptoHomeComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getContentState(), PaddingKt.m5145paddingqDBjuR0(companion2, PaddingKt.calculateStartPadding(paddingValues, layoutDirection), top, PaddingKt.calculateEndPadding(paddingValues, layoutDirection), bottom), (FiniteAnimationSpec<Float>) null, "contentCrossFade", ComposableLambda3.rememberComposableLambda(785993519, true, new AnonymousClass1(lazyListState, snapshotState4CollectAsStateWithLifecycle, snapshotState, onDirectionChanged, function1, function12, function13, function14, navigator3, loggedCustomTabs, current2, cryptoHomeDiscoverExperimentDuxo, cryptoHomeDiscoverExperimentViewState, context3, cryptoHomeDuxo5, curatedListState, fM21590getDefaultD9Ej5fM), composer4, 54), composer4, 27648, 4);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), composer3, ((i10 >> 6) & 14) | 805306800, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                    composerStartRestartGroup = composer3;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    cryptoHomeDuxo4 = cryptoHomeDuxo5;
                    modifier4 = modifier6;
                    z9 = z12;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CryptoHomeComposableKt.CryptoHomeComposable$lambda$13(loggedCustomTabs, onDirectionChanged, modifier4, z9, cryptoHomeDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            z2 = z;
            if ((i & 24576) == 0) {
            }
            if ((i3 & 9363) == 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i7 == 0) {
                    }
                    if (i4 != 0) {
                    }
                    if ((i2 & 16) == 0) {
                    }
                    composer2.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Composer composer32 = composer2;
                    String str32 = str;
                    snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoHomeDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer32, 0, 7);
                    final Flow eventFlow2 = cryptoHomeDuxo3.getEventFlow();
                    composer32.startReplaceGroup(-523522313);
                    LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composer32.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    Lifecycle.State state2 = Lifecycle.State.STARTED;
                    CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                    int i92 = i5;
                    Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$$inlined$collectEventAsStateWithLifecycle$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                            Object objCollect = eventFlow2.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CryptoHomeComposable.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                    Event event = (Event) obj;
                                    if ((event != null ? event.getData() : null) instanceof CryptoHomeEvent) {
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
                    };
                    Event<CryptoHomeEvent> value2 = eventFlow2.getValue();
                    event = value2;
                    if (!((event == null ? event.getData() : null) instanceof CryptoHomeEvent)) {
                    }
                    boolean z102 = z5;
                    int i102 = i6;
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle32 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composer32, 0, 0);
                    composer32.endReplaceGroup();
                    final Context context22 = (Context) composer32.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    Density density2 = (Density) composer32.consume(CompositionLocalsKt.getLocalDensity());
                    final LazyListState lazyListStateRememberLazyListState2 = LazyListStateKt.rememberLazyListState(i92, i92, composer32, i92, 3);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i112 = BentoTheme.$stable;
                    final float fM21590getDefaultD9Ej5fM2 = bentoTheme2.getSpacing(composer32, i112).m21590getDefaultD9Ej5fM();
                    final float fMo5016toPx0680j_42 = density2.mo5016toPx0680j_4(fM21590getDefaultD9Ej5fM2);
                    TextStyle displayCapsuleLarge2 = bentoTheme2.getTypography(composer32, i112).getDisplayCapsuleLarge();
                    composer32.startReplaceGroup(1849434622);
                    objRememberedValue = composer32.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue != companion.getEmpty()) {
                    }
                    final float fFloatValue2 = ((Number) objRememberedValue).floatValue();
                    composer32.endReplaceGroup();
                    composer32.startReplaceGroup(1849434622);
                    objRememberedValue2 = composer32.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    SnapshotState4 snapshotState432 = (SnapshotState4) objRememberedValue2;
                    composer32.endReplaceGroup();
                    Object[] objArr2 = new Object[0];
                    composer32.startReplaceGroup(1849434622);
                    objRememberedValue3 = composer32.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                    }
                    composer32.endReplaceGroup();
                    String str42 = str2;
                    boolean z112 = z6;
                    final SnapshotState<BentoTheme4> snapshotState2 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue3, composer32, 3072, 6);
                    final Navigator navigator22 = (Navigator) composer32.consume(LocalNavigator.getLocalNavigator());
                    final EventLogger current22 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer32, AutoLoggingCompositionLocals4.$stable);
                    eventCryptoHomeComposable$lambda$1 = CryptoHomeComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle32);
                    if (eventCryptoHomeComposable$lambda$1 != null) {
                    }
                    composer32.startReplaceGroup(-1212335951);
                    if (!CryptoHomeComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getComponentTypes().contains(CryptoHomeComponentType.HOLDINGS)) {
                    }
                    composer32.endReplaceGroup();
                    composer32.startReplaceGroup(-1212323719);
                    if (!CryptoHomeComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getComponentTypes().contains(CryptoHomeComponentType.CRYPTO_POSITIONS)) {
                    }
                    composer32.endReplaceGroup();
                    composer32.startReplaceGroup(-1212311468);
                    if (!CryptoHomeComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getComponentTypes().contains(CryptoHomeComponentType.TOKENIZED_STOCKS_POSITIONS)) {
                    }
                    composer32.endReplaceGroup();
                    composer32.startReplaceGroup(-1212298264);
                    if (!CryptoHomeComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getComponentTypes().contains(CryptoHomeComponentType.PERPETUALS_POSITIONS)) {
                    }
                    composer32.endReplaceGroup();
                    boolean zContains2 = CryptoHomeComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getComponentTypes().contains(CryptoHomeComponentType.WATCHLISTS);
                    composer32.startReplaceGroup(-1212284071);
                    if (!zContains2) {
                    }
                    composer32.endReplaceGroup();
                    composer32.startReplaceGroup(-1212277851);
                    if (CryptoHomeComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).isExploreExperimentEnabled()) {
                    }
                    composer32.endReplaceGroup();
                    if (cryptoHomeDiscoverExperimentDuxo == null) {
                    }
                    composer32.startReplaceGroup(-1212267230);
                    if (stateFlow != null) {
                    }
                    composer32.endReplaceGroup();
                    boolean z122 = z8;
                    final Navigator navigator32 = navigator;
                    final CryptoHomeDuxo cryptoHomeDuxo52 = cryptoHomeDuxo3;
                    final CryptoHomeDiscoverExperimentViewState cryptoHomeDiscoverExperimentViewState2 = snapshotState4CollectAsStateWithLifecycle2 != null ? (CryptoHomeDiscoverExperimentViewState) snapshotState4CollectAsStateWithLifecycle2.getValue() : null;
                    final Function1<? super ReorderableLazyListScope, Unit> function15 = function1CryptoHomeHoldingsSection;
                    final Function1<? super ReorderableLazyListScope, Unit> function122 = function1CryptoHomeHoldingsSection2;
                    final Function1<? super ReorderableLazyListScope, Unit> function132 = function1CryptoHomeHoldingsSection3;
                    final CuratedListState curatedListState2 = curatedListStateCreateCuratedListSection;
                    final Context context32 = context;
                    final Function1<? super ReorderableLazyListScope, Unit> function142 = function1CryptoHomeHoldingsSection4;
                    Modifier modifier62 = modifier3;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(modifier62, ComposableLambda3.rememberComposableLambda(-1699625719, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt.CryptoHomeComposable.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i12) {
                            if ((i12 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1699625719, i12, -1, "com.robinhood.android.crypto.tab.ui.CryptoHomeComposable.<anonymous> (CryptoHomeComposable.kt:257)");
                            }
                            if (!z8) {
                                CryptoHomeAppBarComposable.CryptoHomeAppBarComposable(CryptoHomeComposableKt.CryptoHomeComposable$lambda$7(snapshotState42), SizeKt.fillMaxWidth$default(WindowInsetsPadding_androidKt.statusBarsPadding(Modifier.INSTANCE), 0.0f, 1, null), null, composer4, 0, 4);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer32, 54), ComposableLambda3.rememberComposableLambda(-1435928694, true, new C130283(snapshotState4CollectAsStateWithLifecycle), composer32, 54), null, null, 0, 0L, 0L, WindowInsetsKt.WindowInsets$default(0, 0, 0, 0, 14, null), ComposableLambda3.rememberComposableLambda(-692202156, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt.CryptoHomeComposable.4

                        /* compiled from: CryptoHomeComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1, reason: invalid class name */
                        static final class AnonymousClass1 implements Function3<CryptoHomeViewState.ContentState, Composer, Integer, Unit> {
                            final /* synthetic */ Context $context;
                            final /* synthetic */ Function1<ReorderableLazyListScope, Unit> $cryptoHoldingsSection;
                            final /* synthetic */ float $defaultSpacing;
                            final /* synthetic */ SnapshotState<BentoTheme4> $direction$delegate;
                            final /* synthetic */ CryptoHomeDuxo $duxo;
                            final /* synthetic */ EventLogger $eventLogger;
                            final /* synthetic */ Function1<ReorderableLazyListScope, Unit> $holdingsSection;
                            final /* synthetic */ CryptoHomeDiscoverExperimentDuxo $homeDiscoverExperimentDuxo;
                            final /* synthetic */ CryptoHomeDiscoverExperimentViewState $homeDiscoverExperimentViewState;
                            final /* synthetic */ LazyListState $listState;
                            final /* synthetic */ LoggedCustomTabs $loggedCustomTabs;
                            final /* synthetic */ Navigator $navigator;
                            final /* synthetic */ Function1<BentoTheme4, Unit> $onDirectionChanged;
                            final /* synthetic */ Function1<ReorderableLazyListScope, Unit> $perpetualsSection;
                            final /* synthetic */ Function1<ReorderableLazyListScope, Unit> $tokensSection;
                            final /* synthetic */ SnapshotState4<CryptoHomeViewState> $viewState$delegate;
                            final /* synthetic */ CuratedListState $watchlistState;

                            /* compiled from: CryptoHomeComposable.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            /* renamed from: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1$WhenMappings */
                            public /* synthetic */ class WhenMappings {
                                public static final /* synthetic */ int[] $EnumSwitchMapping$0;
                                public static final /* synthetic */ int[] $EnumSwitchMapping$1;

                                static {
                                    int[] iArr = new int[CryptoHomeComponentType.values().length];
                                    try {
                                        iArr[CryptoHomeComponentType.NUX.ordinal()] = 1;
                                    } catch (NoSuchFieldError unused) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.CHART.ordinal()] = 2;
                                    } catch (NoSuchFieldError unused2) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.IN_APP_BANNER.ordinal()] = 3;
                                    } catch (NoSuchFieldError unused3) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.HOLDINGS.ordinal()] = 4;
                                    } catch (NoSuchFieldError unused4) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.CRYPTO_POSITIONS.ordinal()] = 5;
                                    } catch (NoSuchFieldError unused5) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.TOKENIZED_STOCKS_POSITIONS.ordinal()] = 6;
                                    } catch (NoSuchFieldError unused6) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.PERPETUALS_POSITIONS.ordinal()] = 7;
                                    } catch (NoSuchFieldError unused7) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.RECURRING.ordinal()] = 8;
                                    } catch (NoSuchFieldError unused8) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.NEWS.ordinal()] = 9;
                                    } catch (NoSuchFieldError unused9) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.DISCOVER_COINS.ordinal()] = 10;
                                    } catch (NoSuchFieldError unused10) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.EDUCATION.ordinal()] = 11;
                                    } catch (NoSuchFieldError unused11) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.NUX_ONBOARDING.ordinal()] = 12;
                                    } catch (NoSuchFieldError unused12) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.TOP_CRYPTOS.ordinal()] = 13;
                                    } catch (NoSuchFieldError unused13) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.FIRST_DEPOSIT_BANNER.ordinal()] = 14;
                                    } catch (NoSuchFieldError unused14) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.REWARDS_CARD.ordinal()] = 15;
                                    } catch (NoSuchFieldError unused15) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.UPSELL_CARD.ordinal()] = 16;
                                    } catch (NoSuchFieldError unused16) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.DAILY_MOVERS.ordinal()] = 17;
                                    } catch (NoSuchFieldError unused17) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.NOTIFICATION_CARDS.ordinal()] = 18;
                                    } catch (NoSuchFieldError unused18) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.BUYING_POWER.ordinal()] = 19;
                                    } catch (NoSuchFieldError unused19) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.STAKING.ordinal()] = 20;
                                    } catch (NoSuchFieldError unused20) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.SUPPORT.ordinal()] = 21;
                                    } catch (NoSuchFieldError unused21) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.PENDING.ordinal()] = 22;
                                    } catch (NoSuchFieldError unused22) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.PENDING_ORDERS.ordinal()] = 23;
                                    } catch (NoSuchFieldError unused23) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.FEATURE_DISCOVERY.ordinal()] = 24;
                                    } catch (NoSuchFieldError unused24) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.WATCHLISTS.ordinal()] = 25;
                                    } catch (NoSuchFieldError unused25) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.TOP_LEVEL_BANNER.ordinal()] = 26;
                                    } catch (NoSuchFieldError unused26) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.DISCLOSURES.ordinal()] = 27;
                                    } catch (NoSuchFieldError unused27) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.TRENDING.ordinal()] = 28;
                                    } catch (NoSuchFieldError unused28) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.HISTORY.ordinal()] = 29;
                                    } catch (NoSuchFieldError unused29) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.PNL_HUB_ENTRY_POINT.ordinal()] = 30;
                                    } catch (NoSuchFieldError unused30) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.FEE_TIER_STATUS.ordinal()] = 31;
                                    } catch (NoSuchFieldError unused31) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.PULSE.ordinal()] = 32;
                                    } catch (NoSuchFieldError unused32) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.TOP_MOVERS.ordinal()] = 33;
                                    } catch (NoSuchFieldError unused33) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.WALLET_TRENDING.ordinal()] = 34;
                                    } catch (NoSuchFieldError unused34) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.CASH_INTEREST.ordinal()] = 35;
                                    } catch (NoSuchFieldError unused35) {
                                    }
                                    try {
                                        iArr[CryptoHomeComponentType.UNKNOWN.ordinal()] = 36;
                                    } catch (NoSuchFieldError unused36) {
                                    }
                                    $EnumSwitchMapping$0 = iArr;
                                    int[] iArr2 = new int[CryptoHomeViewState.ContentState.values().length];
                                    try {
                                        iArr2[CryptoHomeViewState.ContentState.LOADING.ordinal()] = 1;
                                    } catch (NoSuchFieldError unused37) {
                                    }
                                    try {
                                        iArr2[CryptoHomeViewState.ContentState.ERROR.ordinal()] = 2;
                                    } catch (NoSuchFieldError unused38) {
                                    }
                                    try {
                                        iArr2[CryptoHomeViewState.ContentState.CONTENT.ordinal()] = 3;
                                    } catch (NoSuchFieldError unused39) {
                                    }
                                    $EnumSwitchMapping$1 = iArr2;
                                }
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            AnonymousClass1(LazyListState lazyListState, SnapshotState4<CryptoHomeViewState> snapshotState4, SnapshotState<BentoTheme4> snapshotState, Function1<? super BentoTheme4, Unit> function1, Function1<? super ReorderableLazyListScope, Unit> function12, Function1<? super ReorderableLazyListScope, Unit> function13, Function1<? super ReorderableLazyListScope, Unit> function14, Function1<? super ReorderableLazyListScope, Unit> function15, Navigator navigator, LoggedCustomTabs loggedCustomTabs, EventLogger eventLogger, CryptoHomeDiscoverExperimentDuxo cryptoHomeDiscoverExperimentDuxo, CryptoHomeDiscoverExperimentViewState cryptoHomeDiscoverExperimentViewState, Context context, CryptoHomeDuxo cryptoHomeDuxo, CuratedListState curatedListState, float f) {
                                this.$listState = lazyListState;
                                this.$viewState$delegate = snapshotState4;
                                this.$direction$delegate = snapshotState;
                                this.$onDirectionChanged = function1;
                                this.$holdingsSection = function12;
                                this.$cryptoHoldingsSection = function13;
                                this.$tokensSection = function14;
                                this.$perpetualsSection = function15;
                                this.$navigator = navigator;
                                this.$loggedCustomTabs = loggedCustomTabs;
                                this.$eventLogger = eventLogger;
                                this.$homeDiscoverExperimentDuxo = cryptoHomeDiscoverExperimentDuxo;
                                this.$homeDiscoverExperimentViewState = cryptoHomeDiscoverExperimentViewState;
                                this.$context = context;
                                this.$duxo = cryptoHomeDuxo;
                                this.$watchlistState = curatedListState;
                                this.$defaultSpacing = f;
                            }

                            private static final boolean invoke$lambda$20$lambda$15(SnapshotState<Boolean> snapshotState) {
                                return snapshotState.getValue().booleanValue();
                            }

                            private static final boolean invoke$lambda$20$lambda$19(SnapshotState4<Boolean> snapshotState4) {
                                return snapshotState4.getValue().booleanValue();
                            }

                            private static final boolean invoke$lambda$20$lambda$2(SnapshotState<Boolean> snapshotState) {
                                return snapshotState.getValue().booleanValue();
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            /* renamed from: invoke$lambda$20$lambda$12$lambda$11$lambda$10$componentTopPadding */
                            public static final Modifier m1899x7f67c62f(Modifier modifier, int i, float f) {
                                if (i == 0) {
                                    f = C2002Dp.m7995constructorimpl(0);
                                }
                                return PaddingKt.m5146paddingqDBjuR0$default(modifier, 0.0f, f, 0.0f, 0.0f, 13, null);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(CryptoHomeViewState.ContentState contentState, Composer composer, Integer num) {
                                invoke(contentState, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(CryptoHomeViewState.ContentState contentState, Composer composer, int i) {
                                int i2;
                                Intrinsics.checkNotNullParameter(contentState, "contentState");
                                if ((i & 6) == 0) {
                                    i2 = i | (composer.changed(contentState.ordinal()) ? 4 : 2);
                                } else {
                                    i2 = i;
                                }
                                if ((i2 & 19) == 18 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(785993519, i2, -1, "com.robinhood.android.crypto.tab.ui.CryptoHomeComposable.<anonymous>.<anonymous> (CryptoHomeComposable.kt:287)");
                                }
                                int i3 = WhenMappings.$EnumSwitchMapping$1[contentState.ordinal()];
                                if (i3 == 1) {
                                    composer.startReplaceGroup(-574467940);
                                    LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(TestTag3.testTag(Modifier.INSTANCE, CryptoHomeComposableKt.CryptoHomeLoading), null, true, false, composer, 390, 10);
                                    composer.endReplaceGroup();
                                } else if (i3 == 2) {
                                    composer.startReplaceGroup(-574459690);
                                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableSingletons$CryptoHomeComposableKt.INSTANCE.m12987getLambda$2127179621$feature_crypto_tab_externalDebug(), composer, 6);
                                    composer.endReplaceGroup();
                                } else {
                                    if (i3 != 3) {
                                        composer.startReplaceGroup(-574449297);
                                        composer.endReplaceGroup();
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    composer.startReplaceGroup(-574425627);
                                    final LazyListState lazyListState = this.$listState;
                                    final SnapshotState4 snapshotState4 = this.$viewState$delegate;
                                    final SnapshotState snapshotState = this.$direction$delegate;
                                    final Function1 function1 = this.$onDirectionChanged;
                                    final Function1 function12 = this.$holdingsSection;
                                    final Function1 function13 = this.$cryptoHoldingsSection;
                                    final Function1 function14 = this.$tokensSection;
                                    final Function1 function15 = this.$perpetualsSection;
                                    final Navigator navigator = this.$navigator;
                                    final LoggedCustomTabs loggedCustomTabs = this.$loggedCustomTabs;
                                    final EventLogger eventLogger = this.$eventLogger;
                                    final CryptoHomeDiscoverExperimentDuxo cryptoHomeDiscoverExperimentDuxo = this.$homeDiscoverExperimentDuxo;
                                    final CryptoHomeDiscoverExperimentViewState cryptoHomeDiscoverExperimentViewState = this.$homeDiscoverExperimentViewState;
                                    final Context context = this.$context;
                                    final CryptoHomeDuxo cryptoHomeDuxo = this.$duxo;
                                    final CuratedListState curatedListState = this.$watchlistState;
                                    final float f = this.$defaultSpacing;
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    Object[] objArr = new Object[0];
                                    composer.startReplaceGroup(1849434622);
                                    Object objRememberedValue = composer.rememberedValue();
                                    Composer.Companion companion3 = Composer.INSTANCE;
                                    if (objRememberedValue == companion3.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return CryptoHomeComposableKt.C130294.AnonymousClass1.invoke$lambda$20$lambda$1$lambda$0();
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    final SnapshotState snapshotState2 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composer, 3072, 6);
                                    composer.startReplaceGroup(5004770);
                                    boolean zChanged = composer.changed(snapshotState2);
                                    Object objRememberedValue2 = composer.rememberedValue();
                                    if (zChanged || objRememberedValue2 == companion3.getEmpty()) {
                                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return CryptoHomeComposableKt.C130294.AnonymousClass1.invoke$lambda$20$lambda$5$lambda$4(snapshotState2, ((Boolean) obj).booleanValue());
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer.endReplaceGroup();
                                    Modifier modifierTestTag = TestTag3.testTag(NestedScrollModifier7.nestedScroll$default(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), CryptoHomeComposableKt.rememberCtaButtonsScrollConnection((Function1) objRememberedValue2, composer, 0), null, 2, null), CryptoHomeComposableKt.CryptoHomeLazyColumn);
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i4 = BentoTheme.$stable;
                                    PaddingValues paddingValuesM5139PaddingValuesa9UjIt4$default = PaddingKt.m5139PaddingValuesa9UjIt4$default(0.0f, bentoTheme.getSpacing(composer, i4).m21595getXsmallD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i4).m21592getMediumD9Ej5fM(), 5, null);
                                    composer.startReplaceGroup(-1224400529);
                                    boolean zChanged2 = composer.changed(snapshotState4) | composer.changed(snapshotState) | composer.changed(function1) | composer.changed(function12) | composer.changed(function13) | composer.changed(function14) | composer.changed(function15) | composer.changedInstance(navigator) | composer.changedInstance(loggedCustomTabs) | composer.changedInstance(eventLogger) | composer.changedInstance(cryptoHomeDiscoverExperimentDuxo) | composer.changedInstance(cryptoHomeDiscoverExperimentViewState) | composer.changedInstance(context) | composer.changedInstance(cryptoHomeDuxo) | composer.changedInstance(curatedListState) | composer.changed(f);
                                    Object objRememberedValue3 = composer.rememberedValue();
                                    if (zChanged2 || objRememberedValue3 == companion3.getEmpty()) {
                                        Object obj = new Function1() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                return CryptoHomeComposableKt.C130294.AnonymousClass1.invoke$lambda$20$lambda$12$lambda$11(snapshotState4, function12, function13, function14, function15, cryptoHomeDiscoverExperimentDuxo, cryptoHomeDiscoverExperimentViewState, curatedListState, cryptoHomeDuxo, context, navigator, snapshotState, function1, loggedCustomTabs, eventLogger, f, (ReorderableLazyListScope) obj2);
                                            }
                                        };
                                        composer.updateRememberedValue(obj);
                                        objRememberedValue3 = obj;
                                    }
                                    composer.endReplaceGroup();
                                    ReorderableLazyColumnKt.ReorderableLazyColumn(modifierTestTag, lazyListState, paddingValuesM5139PaddingValuesa9UjIt4$default, false, null, null, null, false, (Function1) objRememberedValue3, composer, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                                    composer.startReplaceGroup(828229602);
                                    if (!CryptoHomeComposableKt.CryptoHomeComposable$lambda$0(snapshotState4).isCryptoMibExperimentEnabled()) {
                                        Object[] objArr2 = new Object[0];
                                        composer.startReplaceGroup(1849434622);
                                        Object objRememberedValue4 = composer.rememberedValue();
                                        if (objRememberedValue4 == companion3.getEmpty()) {
                                            objRememberedValue4 = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1$$ExternalSyntheticLambda3
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return CryptoHomeComposableKt.C130294.AnonymousClass1.invoke$lambda$20$lambda$14$lambda$13();
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue4);
                                        }
                                        composer.endReplaceGroup();
                                        final SnapshotState snapshotState3 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue4, composer, 3072, 6);
                                        composer.startReplaceGroup(1849434622);
                                        Object objRememberedValue5 = composer.rememberedValue();
                                        if (objRememberedValue5 == companion3.getEmpty()) {
                                            objRememberedValue5 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1$$ExternalSyntheticLambda4
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return Boolean.valueOf(CryptoHomeComposableKt.C130294.AnonymousClass1.invoke$lambda$20$lambda$18$lambda$17(lazyListState, snapshotState4, snapshotState2, snapshotState3));
                                                }
                                            });
                                            composer.updateRememberedValue(objRememberedValue5);
                                        }
                                        composer.endReplaceGroup();
                                        CryptoHomeComposableKt.CtaButtons(boxScopeInstance, invoke$lambda$20$lambda$19((SnapshotState4) objRememberedValue5), CryptoHomeComposableKt.CryptoHomeComposable$lambda$0(snapshotState4).getCtaButtons(), composer, 6);
                                    }
                                    composer.endReplaceGroup();
                                    composer.endNode();
                                    composer.endReplaceGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final SnapshotState invoke$lambda$20$lambda$1$lambda$0() {
                                return SnapshotState3.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                            }

                            private static final void invoke$lambda$20$lambda$3(SnapshotState<Boolean> snapshotState, boolean z) {
                                snapshotState.setValue(Boolean.valueOf(z));
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$20$lambda$5$lambda$4(SnapshotState snapshotState, boolean z) {
                                invoke$lambda$20$lambda$3(snapshotState, z);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                            public static final Unit invoke$lambda$20$lambda$12$lambda$11(final SnapshotState4<CryptoHomeViewState> snapshotState4, Function1 function1, Function1 function12, Function1 function13, Function1 function14, CryptoHomeDiscoverExperimentDuxo cryptoHomeDiscoverExperimentDuxo, CryptoHomeDiscoverExperimentViewState cryptoHomeDiscoverExperimentViewState, CuratedListState curatedListState, CryptoHomeDuxo cryptoHomeDuxo, Context context, Navigator navigator, final SnapshotState<BentoTheme4> snapshotState, Function1 function15, final LoggedCustomTabs loggedCustomTabs, final EventLogger eventLogger, final float f, ReorderableLazyListScope reorderableLazyListScope) {
                                final Navigator navigator2;
                                final Context context2 = context;
                                Navigator navigator3 = navigator;
                                ReorderableLazyListScope ReorderableLazyColumn = reorderableLazyListScope;
                                Intrinsics.checkNotNullParameter(ReorderableLazyColumn, "$this$ReorderableLazyColumn");
                                final int i = 0;
                                for (CryptoHomeComponentType cryptoHomeComponentType : CryptoHomeComposableKt.CryptoHomeComposable$lambda$0(snapshotState4).getComponentTypes()) {
                                    int i2 = i + 1;
                                    if (i < 0) {
                                        CollectionsKt.throwIndexOverflow();
                                    }
                                    switch (WhenMappings.$EnumSwitchMapping$0[cryptoHomeComponentType.ordinal()]) {
                                        case 1:
                                            navigator2 = navigator3;
                                            LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableSingletons$CryptoHomeComposableKt.INSTANCE.m12985getLambda$1509284483$feature_crypto_tab_externalDebug(), 3, null);
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 2:
                                            navigator2 = navigator3;
                                            LazyListScope.item$default(ReorderableLazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-207311500, true, new CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$1(snapshotState, function15, snapshotState4)), 3, null);
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 3:
                                        case 36:
                                            navigator2 = navigator3;
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 4:
                                            navigator2 = navigator3;
                                            if (function1 != null) {
                                                function1.invoke(ReorderableLazyColumn);
                                            }
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 5:
                                            navigator2 = navigator3;
                                            if (function12 != null) {
                                                function12.invoke(ReorderableLazyColumn);
                                            }
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 6:
                                            navigator2 = navigator3;
                                            if (function13 != null) {
                                                function13.invoke(ReorderableLazyColumn);
                                            }
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 7:
                                            navigator2 = navigator3;
                                            if (function14 != null) {
                                                function14.invoke(ReorderableLazyColumn);
                                            }
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 8:
                                            navigator2 = navigator3;
                                            LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableLambda3.composableLambdaInstance(-790667398, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$2
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                                    invoke(lazyItemScope, composer, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(LazyItemScope item, Composer composer, int i3) {
                                                    Intrinsics.checkNotNullParameter(item, "$this$item");
                                                    if ((i3 & 17) == 16 && composer.getSkipping()) {
                                                        composer.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-790667398, i3, -1, "com.robinhood.android.crypto.tab.ui.CryptoHomeComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoHomeComposable.kt:356)");
                                                    }
                                                    CryptoRecurringComposable.CryptoRecurringComposable(CryptoHomeComposableKt.C130294.AnonymousClass1.m1899x7f67c62f(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), i, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21594getXlargeD9Ej5fM()), null, composer, 0, 2);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }), 3, null);
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 9:
                                            navigator2 = navigator3;
                                            LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableLambda3.composableLambdaInstance(1259590267, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$3
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                                    invoke(lazyItemScope, composer, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(LazyItemScope item, Composer composer, int i3) {
                                                    Intrinsics.checkNotNullParameter(item, "$this$item");
                                                    if ((i3 & 17) == 16 && composer.getSkipping()) {
                                                        composer.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1259590267, i3, -1, "com.robinhood.android.crypto.tab.ui.CryptoHomeComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoHomeComposable.kt:364)");
                                                    }
                                                    CryptoHomeNewsComposable.CryptoHomeNewsComposable(navigator2, loggedCustomTabs, eventLogger, null, composer, LoggedCustomTabs.$stable << 3, 8);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }), 3, null);
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 10:
                                            if (cryptoHomeDiscoverExperimentDuxo == null) {
                                                CryptoHomeDiscoverViewState discoverViewState = CryptoHomeComposableKt.CryptoHomeComposable$lambda$0(snapshotState4).getDiscoverViewState();
                                                if (discoverViewState != null) {
                                                    CryptoHomeDiscoverComposable4.cryptoHomeDiscoverComposable(reorderableLazyListScope, context, navigator, eventLogger, new CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$5$1(cryptoHomeDuxo), new CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$5$2(cryptoHomeDuxo), discoverViewState);
                                                    navigator2 = navigator;
                                                }
                                                context2 = context;
                                                ReorderableLazyColumn = reorderableLazyListScope;
                                                navigator3 = navigator2;
                                                i = i2;
                                            } else if (cryptoHomeDiscoverExperimentViewState != null) {
                                                CryptoHomeDiscoverExperimentComposableKt.cryptoHomeDiscoverExperimentItems$default(reorderableLazyListScope, cryptoHomeDiscoverExperimentViewState, context, navigator, true, cryptoHomeDiscoverExperimentDuxo, null, 32, null);
                                            }
                                            navigator2 = navigator;
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 11:
                                            LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableSingletons$CryptoHomeComposableKt.INSTANCE.getLambda$981447412$feature_crypto_tab_externalDebug(), 3, null);
                                            navigator2 = navigator;
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 12:
                                            LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableSingletons$CryptoHomeComposableKt.INSTANCE.m12983getLambda$1263262219$feature_crypto_tab_externalDebug(), 3, null);
                                            navigator2 = navigator;
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 13:
                                            CryptoHomeTopViewState topCryptosViewState = CryptoHomeComposableKt.CryptoHomeComposable$lambda$0(snapshotState4).getTopCryptosViewState();
                                            if (topCryptosViewState != null) {
                                                CryptoHomeTopComposable3.cryptoHomeTopComposable(reorderableLazyListScope, context2, navigator3, eventLogger, new CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$6$1(cryptoHomeDuxo), topCryptosViewState);
                                            }
                                            navigator2 = navigator;
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 14:
                                            LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableSingletons$CryptoHomeComposableKt.INSTANCE.m12984getLambda$1457714185$feature_crypto_tab_externalDebug(), 3, null);
                                            navigator2 = navigator3;
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 15:
                                            LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableSingletons$CryptoHomeComposableKt.INSTANCE.getLambda$592543480$feature_crypto_tab_externalDebug(), 3, null);
                                            navigator2 = navigator3;
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 16:
                                            LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableLambda3.composableLambdaInstance(-1652166151, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$7
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                                    invoke(lazyItemScope, composer, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(LazyItemScope item, Composer composer, int i3) {
                                                    Intrinsics.checkNotNullParameter(item, "$this$item");
                                                    if ((i3 & 17) == 16 && composer.getSkipping()) {
                                                        composer.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1652166151, i3, -1, "com.robinhood.android.crypto.tab.ui.CryptoHomeComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoHomeComposable.kt:428)");
                                                    }
                                                    Modifier modifierAnimateContentSize$default = AnimationModifier.animateContentSize$default(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, 3, null);
                                                    RemoteMicrogramApplication remoteMicrogramApplication = new RemoteMicrogramApplication(CryptoDetailComposableKt.MicrogramAppName, new Version(0, 0, 6, null, null, 24, null));
                                                    FragmentManager supportFragmentManager = BaseContexts.requireActivityBaseContext(context2).getSupportFragmentManager();
                                                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                                                    MicrogramEmbeddedSection3.MicrogramEmbeddedSection(remoteMicrogramApplication, supportFragmentManager, modifierAnimateContentSize$default, "touchpoint=CRYPTO_HOME_TAB", ComposableSingletons$CryptoHomeComposableKt.INSTANCE.m12986getLambda$1664467414$feature_crypto_tab_externalDebug(), null, null, false, "CRYPTO_HOME_TAB", composer, 100690944, 224);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }), 3, null);
                                            navigator2 = navigator3;
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 17:
                                            LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableLambda3.composableLambdaInstance(398091514, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$8
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                                    invoke(lazyItemScope, composer, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(LazyItemScope item, Composer composer, int i3) {
                                                    Intrinsics.checkNotNullParameter(item, "$this$item");
                                                    if ((i3 & 17) == 16 && composer.getSkipping()) {
                                                        composer.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(398091514, i3, -1, "com.robinhood.android.crypto.tab.ui.CryptoHomeComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoHomeComposable.kt:446)");
                                                    }
                                                    CryptoDailyMoversComposable.CryptoDailyMoversComposable(CryptoHomeComposableKt.C130294.AnonymousClass1.m1899x7f67c62f(AnimationModifier.animateContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, 3, null), i, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21594getXlargeD9Ej5fM()), null, null, null, composer, 0, 14);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }), 3, null);
                                            navigator2 = navigator3;
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 18:
                                            LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableLambda3.composableLambdaInstance(-1846618117, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$9
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                                    invoke(lazyItemScope, composer, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(LazyItemScope item, Composer composer, int i3) {
                                                    Intrinsics.checkNotNullParameter(item, "$this$item");
                                                    if ((i3 & 17) == 16 && composer.getSkipping()) {
                                                        composer.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1846618117, i3, -1, "com.robinhood.android.crypto.tab.ui.CryptoHomeComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoHomeComposable.kt:455)");
                                                    }
                                                    CardStackComposable.CardStackComposable(CryptoHomeComposableKt.CryptoHomeComposable$lambda$10(snapshotState), PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 7, null), false, null, composer, 0, 12);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }), 3, null);
                                            navigator2 = navigator3;
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 19:
                                            LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableLambda3.composableLambdaInstance(203639548, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$10
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                                    invoke(lazyItemScope, composer, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(LazyItemScope item, Composer composer, int i3) {
                                                    Intrinsics.checkNotNullParameter(item, "$this$item");
                                                    if ((i3 & 17) == 16 && composer.getSkipping()) {
                                                        composer.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(203639548, i3, -1, "com.robinhood.android.crypto.tab.ui.CryptoHomeComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoHomeComposable.kt:467)");
                                                    }
                                                    CryptoBuyingPowerComposable3.CryptoBuyingPowerComposable(CryptoHomeComposableKt.CryptoHomeComposable$lambda$0(snapshotState4).getHideBuyingPowerDivider(), null, null, composer, 0, 6);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }), 3, null);
                                            navigator2 = navigator3;
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 20:
                                            LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableLambda3.composableLambdaInstance(-2041070083, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$11
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                                    invoke(lazyItemScope, composer, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(LazyItemScope item, Composer composer, int i3) {
                                                    Intrinsics.checkNotNullParameter(item, "$this$item");
                                                    if ((i3 & 17) == 16 && composer.getSkipping()) {
                                                        composer.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-2041070083, i3, -1, "com.robinhood.android.crypto.tab.ui.CryptoHomeComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoHomeComposable.kt:473)");
                                                    }
                                                    CryptoStakingOverviewSectionComposable3.CryptoStakingOverviewSectionComposable(CryptoHomeComposableKt.C130294.AnonymousClass1.m1899x7f67c62f(Modifier.INSTANCE, i, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21594getXlargeD9Ej5fM()), null, composer, 0, 2);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }), 3, null);
                                            navigator2 = navigator3;
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 21:
                                            LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableSingletons$CryptoHomeComposableKt.INSTANCE.getLambda$114925587$feature_crypto_tab_externalDebug(), 3, null);
                                            navigator2 = navigator3;
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 22:
                                        case 23:
                                            LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableLambda3.composableLambdaInstance(-2129784044, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$12
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                                    invoke(lazyItemScope, composer, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(LazyItemScope item, Composer composer, int i3) {
                                                    Intrinsics.checkNotNullParameter(item, "$this$item");
                                                    if ((i3 & 17) == 16 && composer.getSkipping()) {
                                                        composer.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-2129784044, i3, -1, "com.robinhood.android.crypto.tab.ui.CryptoHomeComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoHomeComposable.kt:492)");
                                                    }
                                                    BentoTheme4 bentoTheme4CryptoHomeComposable$lambda$10 = CryptoHomeComposableKt.CryptoHomeComposable$lambda$10(snapshotState);
                                                    final int i4 = i;
                                                    BentoTheme2.BentoTheme(null, null, null, null, null, null, null, bentoTheme4CryptoHomeComposable$lambda$10, ComposableLambda3.rememberComposableLambda(1620355788, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$12.1
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                            invoke(composer2, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(Composer composer2, int i5) {
                                                            if ((i5 & 3) == 2 && composer2.getSkipping()) {
                                                                composer2.skipToGroupEnd();
                                                                return;
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(1620355788, i5, -1, "com.robinhood.android.crypto.tab.ui.CryptoHomeComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoHomeComposable.kt:493)");
                                                            }
                                                            CryptoPendingSection.CryptoPendingSection(CryptoPendingSectionConfig.All.INSTANCE, CryptoHomeComposableKt.C130294.AnonymousClass1.m1899x7f67c62f(Modifier.INSTANCE, i4, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21594getXlargeD9Ej5fM()), null, composer2, CryptoPendingSectionConfig.All.$stable, 4);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                        }
                                                    }, composer, 54), composer, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }), 3, null);
                                            navigator2 = navigator3;
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 24:
                                            LazyListScope.item$default(ReorderableLazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-79526379, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$13
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                                    invoke(lazyItemScope, composer, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(LazyItemScope item, Composer composer, int i3) {
                                                    Intrinsics.checkNotNullParameter(item, "$this$item");
                                                    if ((i3 & 17) == 16 && composer.getSkipping()) {
                                                        composer.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-79526379, i3, -1, "com.robinhood.android.crypto.tab.ui.CryptoHomeComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoHomeComposable.kt:504)");
                                                    }
                                                    FeatureDiscoveryComponent.FeatureDiscoveryComponent(FeatureDiscoveryLocation.RHCE_HOME, null, CryptoHomeComposableKt.C130294.AnonymousClass1.m1899x7f67c62f(Modifier.INSTANCE, i, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21594getXlargeD9Ej5fM()), null, composer, 54, 8);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }), 3, null);
                                            navigator2 = navigator3;
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 25:
                                            cryptoHomeWatchlistSection4.cryptoHomeWatchlistSection(ReorderableLazyColumn, curatedListState, cryptoHomeDuxo, context2, navigator3);
                                            navigator2 = navigator3;
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 26:
                                            LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableLambda3.composableLambdaInstance(-273978345, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$14
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                                    invoke(lazyItemScope, composer, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(LazyItemScope item, Composer composer, int i3) {
                                                    Intrinsics.checkNotNullParameter(item, "$this$item");
                                                    if ((i3 & 17) == 16 && composer.getSkipping()) {
                                                        composer.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-273978345, i3, -1, "com.robinhood.android.crypto.tab.ui.CryptoHomeComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoHomeComposable.kt:521)");
                                                    }
                                                    final int i4 = i;
                                                    final float f2 = f;
                                                    BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(-685771211, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$14.1
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                            invoke(composer2, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(Composer composer2, int i5) {
                                                            if ((i5 & 3) == 2 && composer2.getSkipping()) {
                                                                composer2.skipToGroupEnd();
                                                                return;
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-685771211, i5, -1, "com.robinhood.android.crypto.tab.ui.CryptoHomeComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoHomeComposable.kt:522)");
                                                            }
                                                            InfoBannerComponent.InfoBannerComponent(null, IacInfoBannerLocation.INFO_BANNER_CRYPTO_TAB_MOBILE_TOP_LEVEL, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, i4 == 0 ? C2002Dp.m7995constructorimpl(0) : f2, 0.0f, f2, 5, null), null, null, null, null, null, null, null, null, null, null, composer2, 54, 0, 8184);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                        }
                                                    }, composer, 54), composer, 6);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }), 3, null);
                                            navigator2 = navigator3;
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 27:
                                            LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableSingletons$CryptoHomeComposableKt.INSTANCE.getLambda$1776279320$feature_crypto_tab_externalDebug(), 3, null);
                                            navigator2 = navigator3;
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 28:
                                            LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableLambda3.composableLambdaInstance(-468430311, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$15
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                                    invoke(lazyItemScope, composer, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(LazyItemScope item, Composer composer, int i3) {
                                                    Intrinsics.checkNotNullParameter(item, "$this$item");
                                                    if ((i3 & 17) == 16 && composer.getSkipping()) {
                                                        composer.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-468430311, i3, -1, "com.robinhood.android.crypto.tab.ui.CryptoHomeComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoHomeComposable.kt:541)");
                                                    }
                                                    CryptoDailyMoversComposable.CryptoDailyMoversComposable(CryptoHomeComposableKt.C130294.AnonymousClass1.m1899x7f67c62f(AnimationModifier.animateContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, 3, null), i, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21594getXlargeD9Ej5fM()), CryptoTradingOptionsLocation.TRENDING, null, null, composer, 48, 12);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }), 3, null);
                                            navigator2 = navigator3;
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 29:
                                            LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableLambda3.composableLambdaInstance(1581827354, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$16
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                                    invoke(lazyItemScope, composer, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(LazyItemScope item, Composer composer, int i3) {
                                                    Intrinsics.checkNotNullParameter(item, "$this$item");
                                                    if ((i3 & 17) == 16 && composer.getSkipping()) {
                                                        composer.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1581827354, i3, -1, "com.robinhood.android.crypto.tab.ui.CryptoHomeComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoHomeComposable.kt:551)");
                                                    }
                                                    CryptoHistorySection3.CryptoHistorySection(new CryptoHistorySectionDuxo.Args(new CryptoHistorySectionState.Crypto(null, null, 2, null), CryptoAccountSwitcherLocation.Home.INSTANCE), CryptoHomeComposableKt.C130294.AnonymousClass1.m1899x7f67c62f(Modifier.INSTANCE, i, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21594getXlargeD9Ej5fM()), false, null, composer, CryptoHistorySectionDuxo.Args.$stable, 12);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }), 3, null);
                                            navigator2 = navigator3;
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 30:
                                            final String accountNumber = CryptoHomeComposableKt.CryptoHomeComposable$lambda$0(snapshotState4).getAccountNumber();
                                            if (accountNumber != null) {
                                                LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableLambda3.composableLambdaInstance(608764667, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$17$1
                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                                        invoke(lazyItemScope, composer, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(LazyItemScope item, Composer composer, int i3) {
                                                        Intrinsics.checkNotNullParameter(item, "$this$item");
                                                        if ((i3 & 17) == 16 && composer.getSkipping()) {
                                                            composer.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(608764667, i3, -1, "com.robinhood.android.crypto.tab.ui.CryptoHomeComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoHomeComposable.kt:565)");
                                                        }
                                                        CryptoHomePnlEntryPointComposable.CryptoHomePnlEntryPointComposable(accountNumber, null, null, composer, 0, 6);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }), 3, null);
                                            }
                                            navigator2 = navigator3;
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 31:
                                            LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableLambda3.composableLambdaInstance(1387375388, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$18
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                                    invoke(lazyItemScope, composer, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(LazyItemScope item, Composer composer, int i3) {
                                                    Intrinsics.checkNotNullParameter(item, "$this$item");
                                                    if ((i3 & 17) == 16 && composer.getSkipping()) {
                                                        composer.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1387375388, i3, -1, "com.robinhood.android.crypto.tab.ui.CryptoHomeComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoHomeComposable.kt:572)");
                                                    }
                                                    CryptoHomeFeeTierStatusComposable.CryptoHomeFeeTierStatusComposable(CryptoHomeComposableKt.C130294.AnonymousClass1.m1899x7f67c62f(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null), i, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21594getXlargeD9Ej5fM()), null, composer, 0, 2);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }), 3, null);
                                            navigator2 = navigator3;
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 32:
                                            LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableSingletons$CryptoHomeComposableKt.INSTANCE.m12988getLambda$751596238$feature_crypto_tab_externalDebug(), 3, null);
                                            navigator2 = navigator3;
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 33:
                                            LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableLambda3.composableLambdaInstance(1298661427, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$19
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                                    invoke(lazyItemScope, composer, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(LazyItemScope item, Composer composer, int i3) {
                                                    Intrinsics.checkNotNullParameter(item, "$this$item");
                                                    if ((i3 & 17) == 16 && composer.getSkipping()) {
                                                        composer.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1298661427, i3, -1, "com.robinhood.android.crypto.tab.ui.CryptoHomeComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoHomeComposable.kt:587)");
                                                    }
                                                    DiscoverSectionComposable.DiscoverSectionComposable(CryptoExploreState3.CRYPTO, CryptoExploreState4.CHP_CHIPS, CryptoHomeComposableKt.C130294.AnonymousClass1.m1899x7f67c62f(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), i, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21594getXlargeD9Ej5fM()), null, false, null, FragmentTab.CRYPTO, null, null, composer, 1572918, 440);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }), 3, null);
                                            navigator2 = navigator3;
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 34:
                                            LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableLambda3.composableLambdaInstance(-946048204, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$20
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                                    invoke(lazyItemScope, composer, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(LazyItemScope item, Composer composer, int i3) {
                                                    Intrinsics.checkNotNullParameter(item, "$this$item");
                                                    if ((i3 & 17) == 16 && composer.getSkipping()) {
                                                        composer.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-946048204, i3, -1, "com.robinhood.android.crypto.tab.ui.CryptoHomeComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoHomeComposable.kt:599)");
                                                    }
                                                    CryptoHomeWalletTrendingComposable.CryptoHomeWalletTrendingComposable(CryptoHomeComposableKt.C130294.AnonymousClass1.m1899x7f67c62f(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), i, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21594getXlargeD9Ej5fM()), null, composer, 0, 2);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }), 3, null);
                                            navigator2 = navigator3;
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        case 35:
                                            LazyListScope.item$default(ReorderableLazyColumn, null, null, ComposableLambda3.composableLambdaInstance(1104209461, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$21
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                                    invoke(lazyItemScope, composer, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(LazyItemScope item, Composer composer, int i3) {
                                                    Intrinsics.checkNotNullParameter(item, "$this$item");
                                                    if ((i3 & 17) == 16 && composer.getSkipping()) {
                                                        composer.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1104209461, i3, -1, "com.robinhood.android.crypto.tab.ui.CryptoHomeComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoHomeComposable.kt:609)");
                                                    }
                                                    CryptoHomeInterestSection4.CryptoHomeInterestSection(CryptoHomeComposableKt.C130294.AnonymousClass1.m1899x7f67c62f(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), i, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21594getXlargeD9Ej5fM()), null, composer, 0, 2);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }), 3, null);
                                            navigator2 = navigator3;
                                            context2 = context;
                                            ReorderableLazyColumn = reorderableLazyListScope;
                                            navigator3 = navigator2;
                                            i = i2;
                                        default:
                                            throw new NoWhenBranchMatchedException();
                                    }
                                }
                                if (CryptoHomeComposableKt.CryptoHomeComposable$lambda$0(snapshotState4).getShowBottomDisclosure()) {
                                    LazyListScope.item$default(reorderableLazyListScope, null, null, ComposableSingletons$CryptoHomeComposableKt.INSTANCE.m12989getLambda$884003582$feature_crypto_tab_externalDebug(), 3, null);
                                }
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final SnapshotState invoke$lambda$20$lambda$14$lambda$13() {
                                return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            }

                            private static final void invoke$lambda$20$lambda$16(SnapshotState<Boolean> snapshotState, boolean z) {
                                snapshotState.setValue(Boolean.valueOf(z));
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final boolean invoke$lambda$20$lambda$18$lambda$17(LazyListState lazyListState, SnapshotState4 snapshotState4, SnapshotState snapshotState, SnapshotState snapshotState2) {
                                if (lazyListState.getLayoutInfo().getTotalItemsCount() > 0) {
                                    boolean z = !CryptoHomeComposableKt.CryptoHomeComposable$lambda$0(snapshotState4).getCtaButtons().isEmpty() && ((invoke$lambda$20$lambda$2(snapshotState) && lazyListState.getCanScrollForward()) || !lazyListState.getCanScrollBackward());
                                    invoke$lambda$20$lambda$16(snapshotState2, z);
                                    return z;
                                }
                                return invoke$lambda$20$lambda$15(snapshotState2);
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer4, Integer num) {
                            invoke(paddingValues, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues paddingValues, Composer composer4, int i12) {
                            int i13;
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i12 & 6) == 0) {
                                i13 = i12 | (composer4.changed(paddingValues) ? 4 : 2);
                            } else {
                                i13 = i12;
                            }
                            if ((i13 & 19) == 18 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-692202156, i13, -1, "com.robinhood.android.crypto.tab.ui.CryptoHomeComposable.<anonymous> (CryptoHomeComposable.kt:277)");
                            }
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            float top = paddingValues.getTop();
                            float bottom = paddingValues.getBottom();
                            LayoutDirection layoutDirection = LayoutDirection.Ltr;
                            Crossfade.Crossfade(CryptoHomeComposableKt.CryptoHomeComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getContentState(), PaddingKt.m5145paddingqDBjuR0(companion2, PaddingKt.calculateStartPadding(paddingValues, layoutDirection), top, PaddingKt.calculateEndPadding(paddingValues, layoutDirection), bottom), (FiniteAnimationSpec<Float>) null, "contentCrossFade", ComposableLambda3.rememberComposableLambda(785993519, true, new AnonymousClass1(lazyListState, snapshotState4CollectAsStateWithLifecycle, snapshotState2, onDirectionChanged, function15, function122, function132, function142, navigator32, loggedCustomTabs, current22, cryptoHomeDiscoverExperimentDuxo, cryptoHomeDiscoverExperimentViewState2, context32, cryptoHomeDuxo52, curatedListState2, fM21590getDefaultD9Ej5fM2), composer4, 54), composer4, 27648, 4);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer32, 54), composer32, ((i102 >> 6) & 14) | 805306800, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                    composerStartRestartGroup = composer32;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    cryptoHomeDuxo4 = cryptoHomeDuxo52;
                    modifier4 = modifier62;
                    z9 = z122;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        z2 = z;
        if ((i & 24576) == 0) {
        }
        if ((i3 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CryptoHomeComposable$lambda$6$lambda$5(LazyListState lazyListState, float f, float f2, SnapshotState4 snapshotState4) {
        int firstVisibleItemScrollOffset = lazyListState.getFirstVisibleItemScrollOffset();
        if (lazyListState.getFirstVisibleItemIndex() < CryptoHomeComposable$lambda$0(snapshotState4).getChartIndex()) {
            return 0.0f;
        }
        if (lazyListState.getFirstVisibleItemIndex() != CryptoHomeComposable$lambda$0(snapshotState4).getChartIndex()) {
            lazyListState.getFirstVisibleItemIndex();
            CryptoHomeComposable$lambda$0(snapshotState4).getChartIndex();
            return 1.0f;
        }
        float f3 = firstVisibleItemScrollOffset;
        if (f3 <= f) {
            return 0.0f;
        }
        return RangesKt.coerceIn((f3 - f) / f2, 0.0f, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState CryptoHomeComposable$lambda$9$lambda$8() {
        return SnapshotState3.mutableStateOf$default(BentoTheme4.POSITIVE, null, 2, null);
    }

    /* compiled from: CryptoHomeComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$3 */
    static final class C130283 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<CryptoHomeViewState> $viewState$delegate;

        C130283(SnapshotState4<CryptoHomeViewState> snapshotState4) {
            this.$viewState$delegate = snapshotState4;
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
                ComposerKt.traceEventStart(-1435928694, i, -1, "com.robinhood.android.crypto.tab.ui.CryptoHomeComposable.<anonymous> (CryptoHomeComposable.kt:267)");
            }
            if (CryptoHomeComposableKt.CryptoHomeComposable$lambda$0(this.$viewState$delegate).isCryptoMibExperimentEnabled()) {
                CryptoButtonBarArgs.Home home = CryptoButtonBarArgs.Home.INSTANCE;
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$3$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$3$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                CryptoButtonBarComposable.CryptoButtonBarComposable(home, false, function0, (Function0) objRememberedValue2, null, null, composer, CryptoButtonBarArgs.Home.$stable | 3504, 48);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CtaButtons(final BoxScope boxScope, boolean z, final ImmutableList<? extends Button<? extends GenericAction>> immutableList, Composer composer, final int i) {
        int i2;
        final boolean z2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1349487233);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(immutableList) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1349487233, i2, -1, "com.robinhood.android.crypto.tab.ui.CtaButtons (CryptoHomeComposable.kt:663)");
            }
            long jM21373getBg30d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21373getBg30d7_KjU();
            Modifier.Companion companion = Modifier.INSTANCE;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(boxScope.align(companion, companion2.getBottomCenter()), jM21373getBg30d7_KjU, 0.0f, composerStartRestartGroup, 0, 4);
            Modifier modifierAlign = boxScope.align(companion, companion2.getBottomCenter());
            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(400, 0, null, 6, null);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objRememberedValue == companion3.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(CryptoHomeComposableKt.CtaButtons$lambda$15$lambda$14(((Integer) obj).intValue()));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EnterTransition enterTransitionSlideInVertically = EnterExitTransitionKt.slideInVertically(tweenSpecTween$default, (Function1) objRememberedValue);
            TweenSpec tweenSpecTween$default2 = AnimationSpecKt.tween$default(400, 0, null, 6, null);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion3.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(CryptoHomeComposableKt.CtaButtons$lambda$17$lambda$16(((Integer) obj).intValue()));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            z2 = z;
            AnimatedVisibilityKt.AnimatedVisibility(z2, modifierAlign, enterTransitionSlideInVertically, EnterExitTransitionKt.slideOutVertically(tweenSpecTween$default2, (Function1) objRememberedValue2), "ctaButtonsVisibility", ComposableLambda3.rememberComposableLambda(-296460967, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt.CtaButtons.3
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                    invoke(animatedVisibilityScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-296460967, i3, -1, "com.robinhood.android.crypto.tab.ui.CtaButtons.<anonymous> (CryptoHomeComposable.kt:680)");
                    }
                    final ImmutableList<Button<GenericAction>> immutableList2 = immutableList;
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion4);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion5.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21373getBg30d7_KjU(), 0.0f, composer2, 0, 5);
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(121304026, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CtaButtons$3$1$1
                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(121304026, i4, -1, "com.robinhood.android.crypto.tab.ui.CtaButtons.<anonymous>.<anonymous>.<anonymous> (CryptoHomeComposable.kt:683)");
                            }
                            Modifier.Companion companion6 = Modifier.INSTANCE;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i5 = BentoTheme.$stable;
                            Modifier modifierTestTag = TestTag3.testTag(com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(Background3.m4872backgroundbw27NRU$default(companion6, bentoTheme.getColors(composer3, i5).m21371getBg0d7_KjU(), null, 2, null), bentoTheme.getSpacing(composer3, i5).m21590getDefaultD9Ej5fM()), CryptoHomeComposableKt.CryptoHomeCtaButtons);
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer3, i5).m21593getSmallD9Ej5fM());
                            ImmutableList<Button<GenericAction>> immutableList3 = immutableList2;
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, Alignment.INSTANCE.getTop(), composer3, 0);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierTestTag);
                            ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion7.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor2);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion7.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion7.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion7.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion7.getSetModifier());
                            Row6 row6 = Row6.INSTANCE;
                            composer3.startReplaceGroup(1974351044);
                            Iterator<Button<GenericAction>> it = immutableList3.iterator();
                            while (it.hasNext()) {
                                SduiButton2.SduiButton(it.next(), Row5.weight$default(row6, Modifier.INSTANCE, 1.0f, false, 2, null), composer3, 0, 0);
                            }
                            composer3.endReplaceGroup();
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }
                    }, composer2, 54), composer2, 6);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 3) & 14) | 224640, 0);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            z2 = z;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoHomeComposableKt.CtaButtons$lambda$18(boxScope, z2, immutableList, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NestedScrollModifier rememberCtaButtonsScrollConnection(final Function1<? super Boolean, Unit> function1, Composer composer, int i) {
        composer.startReplaceGroup(875905039);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(875905039, i, -1, "com.robinhood.android.crypto.tab.ui.rememberCtaButtonsScrollConnection (CryptoHomeComposable.kt:707)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotLongState3.mutableLongStateOf(0L);
            composer.updateRememberedValue(objRememberedValue);
        }
        final SnapshotLongState2 snapshotLongState2 = (SnapshotLongState2) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new NestedScrollModifier() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$rememberCtaButtonsScrollConnection$1$1
                @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
                /* renamed from: onPostFling-RZ2iAVY */
                public /* bridge */ /* synthetic */ Object mo5023onPostFlingRZ2iAVY(long j, long j2, Continuation continuation) {
                    return super.mo5023onPostFlingRZ2iAVY(j, j2, continuation);
                }

                @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
                /* renamed from: onPostScroll-DzOQY0M */
                public /* bridge */ /* synthetic */ long mo5024onPostScrollDzOQY0M(long j, long j2, int i2) {
                    return super.mo5024onPostScrollDzOQY0M(j, j2, i2);
                }

                @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
                /* renamed from: onPreFling-QWom1Mo */
                public /* bridge */ /* synthetic */ Object mo5609onPreFlingQWom1Mo(long j, Continuation continuation) {
                    return super.mo5609onPreFlingQWom1Mo(j, continuation);
                }

                @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
                /* renamed from: onPreScroll-OzD1aCk */
                public long mo5298onPreScrollOzD1aCk(long available, int source) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (available & 4294967295L));
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - snapshotLongState2.getLongValue() > 400) {
                        if (fIntBitsToFloat > 1.0f) {
                            function1.invoke(Boolean.TRUE);
                        } else if (fIntBitsToFloat < -1.0f) {
                            function1.invoke(Boolean.FALSE);
                        }
                        snapshotLongState2.setLongValue(jCurrentTimeMillis);
                    }
                    return Offset.INSTANCE.m6553getZeroF1C5BW0();
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        CryptoHomeComposableKt$rememberCtaButtonsScrollConnection$1$1 cryptoHomeComposableKt$rememberCtaButtonsScrollConnection$1$1 = (CryptoHomeComposableKt$rememberCtaButtonsScrollConnection$1$1) objRememberedValue2;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return cryptoHomeComposableKt$rememberCtaButtonsScrollConnection$1$1;
    }
}
