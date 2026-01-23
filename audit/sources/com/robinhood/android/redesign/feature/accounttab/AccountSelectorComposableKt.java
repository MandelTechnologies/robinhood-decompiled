package com.robinhood.android.redesign.feature.accounttab;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Animatable2;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.SystemGestureExclusionKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.material3.ScaffoldDefaults;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier6;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotFloatState3;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
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
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.pdfrenderer.PdfRendererComposable4;
import com.robinhood.android.redesign.accounttab.analytics.AccountTabAnalytics;
import com.robinhood.android.redesign.accounttab.common.NewUserExperienceStage;
import com.robinhood.android.redesign.accounttab.deeplink.AccountTabTarget;
import com.robinhood.android.redesign.accounttab.duxo.AccountSelectorViewState;
import com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo;
import com.robinhood.android.redesign.accounttab.duxo.AccountTabInfo;
import com.robinhood.android.redesign.accounttab.scrollstate.AccountSelectorScrollable;
import com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt;
import com.robinhood.android.redesign.feature.accounttab.util.AccountSelectorDominantDirectionModifier;
import com.robinhood.android.redesign.feature.accounttab.util.AccountSelectorExpansionState;
import com.robinhood.android.redesign.feature.accounttab.util.AccountSelectorTabRowScrollInfo;
import com.robinhood.android.redesign.feature.accounttab.util.AccountSelectorThresholdMeasure;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.common.ShimmerLoaderType;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.rosetta.eventlogging.Component;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: AccountSelectorComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0092\u0001\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\u001a½\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000526\u0010\u0006\u001a2\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u0018\b\u0002\u0010\u0018\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00192\"\b\u0002\u0010\u001a\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0019\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0019H\u0001¢\u0006\u0002\u0010\u001b\u001aY\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020$2\u0006\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0019H\u0003¢\u0006\u0002\u0010&\u001a$\u0010'\u001a\u00020\u0003*\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010(\u001a\u00020\u0015H\u0086@¢\u0006\u0002\u0010)\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010*\u001a\u00020\u0010X\u0080T¢\u0006\u0002\n\u0000¨\u0006+²\u0006\n\u0010,\u001a\u00020-X\u008a\u0084\u0002²\u0006\u0016\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0/X\u008a\u008e\u0002²\u0006\n\u00100\u001a\u00020\bX\u008a\u008e\u0002²\u0006\n\u00101\u001a\u000202X\u008a\u008e\u0002²\u0006\n\u00103\u001a\u00020\u0015X\u008a\u008e\u0002²\u0006\n\u0010\"\u001a\u00020\u0015X\u008a\u008e\u0002²\u0006\n\u00104\u001a\u00020\u0001X\u008a\u008e\u0002²\u0006\f\u00105\u001a\u0004\u0018\u00010\u0010X\u008a\u008e\u0002²\u0006\f\u00106\u001a\u0004\u0018\u00010\fX\u008a\u008e\u0002²\u0006\f\u00107\u001a\u0004\u0018\u00010\u0011X\u008a\u008e\u0002²\u0006\n\u00108\u001a\u00020\u0015X\u008a\u008e\u0002²\u0006\n\u00109\u001a\u00020\u0015X\u008a\u008e\u0002²\u0006\n\u0010:\u001a\u00020\u0015X\u008a\u0084\u0002²\u0006\f\u0010;\u001a\u0004\u0018\u00010<X\u008a\u008e\u0002²\u0006\n\u0010=\u001a\u00020\u0015X\u008a\u008e\u0002²\u0006\n\u0010>\u001a\u00020\u0015X\u008a\u008e\u0002²\u0006\n\u0010?\u001a\u00020\u0015X\u008a\u008e\u0002²\u0006\f\u0010@\u001a\u0004\u0018\u00010\fX\u008a\u008e\u0002²\u0006\n\u0010A\u001a\u00020\u0015X\u008a\u008e\u0002²\u0006\n\u0010B\u001a\u00020\u0015X\u008a\u0084\u0002²\u0006\n\u0010C\u001a\u00020\u0015X\u008a\u0084\u0002²\u0006\n\u0010D\u001a\u00020\u0015X\u008a\u0084\u0002²\u0006\f\u0010E\u001a\u0004\u0018\u00010FX\u008a\u0084\u0002²\u0006\n\u0010G\u001a\u00020\u0015X\u008a\u008e\u0002"}, m3636d2 = {"SNAP_THRESHOLD", "", "AccountSelectorComposable", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "onTabReselected", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo;", "tabInfo", "scrollableStateCache", "Lkotlinx/collections/immutable/ImmutableMap;", "", "Lcom/robinhood/android/redesign/accounttab/scrollstate/AccountSelectorScrollable;", "modifier", "Landroidx/compose/ui/Modifier;", "innerScrollActive", "", "accountTabDuxo", "Lcom/robinhood/android/redesign/accounttab/duxo/AccountTabDuxo;", "onCurrentTabChanged", "Lkotlin/Function1;", "scrollToTabRequestor", "(Landroidx/fragment/app/FragmentManager;Lkotlin/jvm/functions/Function2;Lkotlinx/collections/immutable/ImmutableMap;Landroidx/compose/ui/Modifier;ZLcom/robinhood/android/redesign/accounttab/duxo/AccountTabDuxo;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "HorizontalPager", "pagerState", "Landroidx/compose/foundation/pager/PagerState;", "accountTabInfo", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo$Account;", "allowHorizontalPaging", "tabScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "onHorizontalPagingAllowedChange", "(Landroidx/compose/foundation/pager/PagerState;Lkotlinx/collections/immutable/ImmutableList;ZZLandroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/fragment/app/FragmentManager;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "switchToPage", "forceScroll", "(Landroidx/compose/foundation/pager/PagerState;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ACCOUNT_SELECTOR_REORDER_BOTTOM_SHEET", "feature-account-selector_externalRelease", "viewState", "Lcom/robinhood/android/redesign/accounttab/duxo/AccountSelectorViewState;", "tabItemWidths", "", "tabSpacing", "uiExpansionState", "Lcom/robinhood/android/redesign/feature/accounttab/util/AccountSelectorExpansionState;", "isGestureActive", "scrollThreshold", "defaultSelectedTabId", "selectedTabInfo", "selectedTabScrollableState", "forceDarkMode", "hasRestoredPreviouslySelectedTab", "isAtTop", "tabRowScrollDebounceJob", "Lkotlinx/coroutines/Job;", "isProgrammaticallyScrollingTabRow", "showReorderBottomSheet", "needsFragmentReset", "lastSelectedTabInfoBeforeReorder", "isGlobalScrollingActive", "isVerticalScrollingActive", "shouldRealignTabRow", "currentTabNeedsGlobalGestureDetection", "targetScrollInfo", "Lcom/robinhood/android/redesign/feature/accounttab/util/AccountSelectorTabRowScrollInfo;", "awaitingNewUserExpansionSwipe"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class AccountSelectorComposableKt {
    public static final String ACCOUNT_SELECTOR_REORDER_BOTTOM_SHEET = "AccountSelectorReorderBottomSheet";
    public static final float SNAP_THRESHOLD = 0.3f;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSelectorComposable$lambda$92(FragmentManager fragmentManager, Function2 function2, ImmutableMap immutableMap, Modifier modifier, boolean z, AccountTabDuxo accountTabDuxo, Function1 function1, Function1 function12, int i, int i2, Composer composer, int i3) {
        AccountSelectorComposable(fragmentManager, function2, immutableMap, modifier, z, accountTabDuxo, function1, function12, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HorizontalPager$lambda$99(PagerState pagerState, ImmutableList immutableList, boolean z, boolean z2, NestedScrollModifier nestedScrollModifier, FragmentManager fragmentManager, Function1 function1, int i, int i2, Composer composer, int i3) {
        HorizontalPager(pagerState, immutableList, z, z2, nestedScrollModifier, fragmentManager, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ boolean access$AccountSelectorComposable$lambda$12(SnapshotState snapshotState) {
        return AccountSelectorComposable$lambda$12(snapshotState);
    }

    public static final /* synthetic */ float access$AccountSelectorComposable$lambda$18(SnapshotFloatState2 snapshotFloatState2) {
        return snapshotFloatState2.getFloatValue();
    }

    public static final /* synthetic */ boolean access$AccountSelectorComposable$lambda$39(SnapshotState4 snapshotState4) {
        return AccountSelectorComposable$lambda$39(snapshotState4);
    }

    public static final /* synthetic */ boolean access$AccountSelectorComposable$lambda$79(SnapshotState4 snapshotState4) {
        return AccountSelectorComposable$lambda$79(snapshotState4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult AccountSelectorComposable$lambda$69$lambda$68(final AccountTabDuxo accountTabDuxo, final SnapshotState snapshotState, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new DisposableEffectResult() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$lambda$69$lambda$68$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                boolean zAreEqual;
                AccountSelectorExpansionState accountSelectorExpansionStateAccountSelectorComposable$lambda$9 = AccountSelectorComposableKt.AccountSelectorComposable$lambda$9(snapshotState);
                AccountSelectorExpansionState.Collapsed collapsed = AccountSelectorExpansionState.Collapsed.INSTANCE;
                if (Intrinsics.areEqual(accountSelectorExpansionStateAccountSelectorComposable$lambda$9, collapsed)) {
                    zAreEqual = true;
                } else if (Intrinsics.areEqual(accountSelectorExpansionStateAccountSelectorComposable$lambda$9, AccountSelectorExpansionState.Expanded.INSTANCE)) {
                    zAreEqual = false;
                } else {
                    if (!(accountSelectorExpansionStateAccountSelectorComposable$lambda$9 instanceof AccountSelectorExpansionState.Transitioning)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zAreEqual = Intrinsics.areEqual(((AccountSelectorExpansionState.Transitioning) accountSelectorExpansionStateAccountSelectorComposable$lambda$9).getTo(), collapsed);
                }
                accountTabDuxo.saveCollapsedState(zAreEqual);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float AccountSelectorComposable$lambda$18(SnapshotFloatState2 snapshotFloatState2) {
        return snapshotFloatState2.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountSelectorViewState AccountSelectorComposable$lambda$0(SnapshotState4<AccountSelectorViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AccountSelectorComposable$lambda$12(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AccountSelectorComposable$lambda$15(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<Integer, Integer> AccountSelectorComposable$lambda$2(SnapshotState<Map<Integer, Integer>> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String AccountSelectorComposable$lambda$23(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountTabInfo AccountSelectorComposable$lambda$26(SnapshotState<AccountTabInfo> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountSelectorScrollable AccountSelectorComposable$lambda$29(SnapshotState<AccountSelectorScrollable> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AccountSelectorComposable$lambda$32(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AccountSelectorComposable$lambda$35(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AccountSelectorComposable$lambda$39(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    private static final Job AccountSelectorComposable$lambda$41(SnapshotState<Job> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AccountSelectorComposable$lambda$44(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AccountSelectorComposable$lambda$47(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AccountSelectorComposable$lambda$50(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountTabInfo AccountSelectorComposable$lambda$53(SnapshotState<AccountTabInfo> snapshotState) {
        return snapshotState.getValue();
    }

    private static final boolean AccountSelectorComposable$lambda$56(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AccountSelectorComposable$lambda$60(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AccountSelectorComposable$lambda$63(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AccountSelectorComposable$lambda$79(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountSelectorTabRowScrollInfo AccountSelectorComposable$lambda$84(SnapshotState4<? extends AccountSelectorTabRowScrollInfo> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AccountSelectorComposable$lambda$87(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountSelectorExpansionState AccountSelectorComposable$lambda$9(SnapshotState<AccountSelectorExpansionState> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0707  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x07a6  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x07d2  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x07da  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x07e0  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x087b  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x08be  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x08c2  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x08de  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0941  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0997  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x09a0  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x09d9  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x09fa  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0a20  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0a50  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0a80  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0a8c  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0ab4  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0ac0  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0ac8  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0ace  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0b11  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0b1d  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0b2a  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0b30  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0b6b  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0b77  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0b9a  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0ba8  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0c2c  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0c3e  */
    /* JADX WARN: Removed duplicated region for block: B:420:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011f  */
    /* JADX WARN: Type inference failed for: r8v69 */
    /* JADX WARN: Type inference failed for: r8v70, types: [int] */
    /* JADX WARN: Type inference failed for: r8v96 */
    @SuppressLint({"LogNotTimber"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountSelectorComposable(final FragmentManager fragmentManager, final Function2<? super Integer, ? super AccountTabInfo, Unit> onTabReselected, final ImmutableMap<String, ? extends AccountSelectorScrollable> scrollableStateCache, Modifier modifier, boolean z, AccountTabDuxo accountTabDuxo, Function1<? super String, Unit> function1, Function1<? super Function1<? super Integer, Unit>, Unit> function12, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        Function1<? super String, Unit> function13;
        int i6;
        Function1<? super Function1<? super Integer, Unit>, Unit> function14;
        Composer composer2;
        AccountTabDuxo accountTabDuxo2;
        final boolean z3;
        Function1<? super String, Unit> function15;
        Modifier modifier3;
        Function1<? super Function1<? super Integer, Unit>, Unit> function16;
        final AccountTabDuxo accountTabDuxo3;
        int i7;
        final ImmutableList<AccountTabInfo.Account> allTabs;
        final LazyListState lazyListStateRememberLazyListState;
        Object objRememberedValue;
        Composer.Companion companion;
        int i8;
        Object objRememberedValue2;
        SnapshotState4 snapshotState4;
        Object objRememberedValue3;
        Object objRememberedValue4;
        CoroutineScope coroutineScope;
        int i9;
        SnapshotMutationPolicy snapshotMutationPolicy;
        Object objAnimatable$default;
        Object objRememberedValue5;
        Object objRememberedValue6;
        Object objRememberedValue7;
        Object objRememberedValue8;
        boolean zChangedInstance;
        Object objRememberedValue9;
        Composer composer3;
        final PagerState pagerStateRememberPagerState;
        Object objRememberedValue10;
        int i10;
        SnapshotMutationPolicy snapshotMutationPolicy2;
        Object objRememberedValue11;
        Object objRememberedValue12;
        final SnapshotState snapshotState;
        Object objRememberedValue13;
        Object objRememberedValue14;
        boolean zChanged;
        Object objRememberedValue15;
        Object objRememberedValue16;
        int i11;
        Object objRememberedValue17;
        Object objRememberedValue18;
        Object objRememberedValue19;
        SnapshotState snapshotState2;
        int i12;
        Object objRememberedValue20;
        Object objRememberedValue21;
        SnapshotState snapshotState3;
        final SnapshotState snapshotState5;
        boolean zChanged2;
        Object objRememberedValue22;
        boolean zChanged3;
        Object objRememberedValue23;
        Object objRememberedValue24;
        boolean zChanged4;
        SnapshotFloatState2 snapshotFloatState2;
        SnapshotState snapshotState6;
        boolean z4;
        boolean z5;
        Object objRememberedValue25;
        boolean zChangedInstance2;
        Object objRememberedValue26;
        boolean zChangedInstance3;
        Animatable animatable;
        Object accountSelectorComposableKt$AccountSelectorComposable$5$1;
        final SnapshotState snapshotState7;
        int i13;
        LazyListState lazyListState;
        SnapshotFloatState2 snapshotFloatState22;
        Animatable animatable2;
        Function1<? super Function1<? super Integer, Unit>, Unit> function17;
        int i14;
        EventLogger eventLogger;
        Context context;
        CoroutineScope coroutineScope2;
        Continuation continuation;
        Boolean bool;
        SnapshotState snapshotState8;
        Boolean bool2;
        int i15;
        ImmutableList<AccountTabInfo.Account> immutableList;
        SnapshotState snapshotState9;
        SnapshotState snapshotState10;
        SnapshotState snapshotState11;
        ImmutableMap<String, Integer> immutableMap;
        int i16;
        int i17;
        boolean zChanged5;
        int i18;
        Object accountSelectorComposableKt$AccountSelectorComposable$6$1;
        Composer composer4;
        SnapshotState snapshotState12;
        Continuation continuation2;
        PagerState pagerState;
        ImmutableList<AccountTabInfo.Account> immutableList2;
        Function1<? super String, Unit> function18;
        SnapshotState snapshotState13;
        SnapshotState snapshotState14;
        Modifier modifier4;
        final SnapshotState snapshotState15;
        final SnapshotState snapshotState16;
        LazyListState lazyListState2;
        EventLogger eventLogger2;
        boolean zChanged6;
        Object objRememberedValue27;
        EventLogger eventLogger3;
        SnapshotState snapshotState17;
        Composer composer5;
        CoroutineScope coroutineScope3;
        boolean zChangedInstance4;
        Object objRememberedValue28;
        Function1<? super Function1<? super Integer, Unit>, Unit> function19;
        Integer numValueOf;
        Integer numValueOf2;
        Context context2;
        boolean zChanged7;
        Object objRememberedValue29;
        int i19;
        PagerState pagerState2;
        Integer num;
        Context context3;
        SnapshotState snapshotState18;
        ?? r8;
        Integer num2;
        final ImmutableList<AccountTabInfo.Account> immutableList3;
        int i20;
        SnapshotState4 snapshotState42;
        boolean zChanged8;
        Object objRememberedValue30;
        final PagerState pagerState3;
        boolean zChanged9;
        Object objRememberedValue31;
        Object objRememberedValue32;
        ImmutableList<AccountTabInfo.Account> immutableList4;
        final CoroutineScope coroutineScope4;
        LazyListState lazyListState3;
        EventLogger eventLogger4;
        final SnapshotState snapshotState19;
        final SnapshotIntState2 snapshotIntState2;
        SnapshotState4 snapshotState43;
        boolean zChanged10;
        Object objRememberedValue33;
        Object objRememberedValue34;
        SnapshotState snapshotState20;
        SnapshotState snapshotState21;
        boolean z6;
        boolean z7;
        Object objRememberedValue35;
        SnapshotState4 snapshotState44;
        boolean z8;
        boolean zChanged11;
        Object objRememberedValue36;
        Composer composer6;
        int i21;
        Context context4;
        SnapshotState4 snapshotState45;
        final SnapshotState snapshotState22;
        final PagerState pagerState4;
        final Animatable animatable3;
        boolean zChangedInstance5;
        Object objRememberedValue37;
        SnapshotState snapshotState23;
        final SnapshotState snapshotState24;
        final SnapshotState snapshotState25;
        final Modifier modifier5;
        Composer composer7;
        final AccountTabDuxo accountTabDuxo4;
        final boolean z9;
        final Function1<? super String, Unit> function110;
        final Function1<? super Function1<? super Integer, Unit>, Unit> function111;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i22;
        FragmentManager fragmentManager2 = fragmentManager;
        Intrinsics.checkNotNullParameter(fragmentManager2, "fragmentManager");
        Intrinsics.checkNotNullParameter(onTabReselected, "onTabReselected");
        Intrinsics.checkNotNullParameter(scrollableStateCache, "scrollableStateCache");
        Composer composerStartRestartGroup = composer.startRestartGroup(1366020567);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(fragmentManager2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onTabReselected) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(scrollableStateCache) : composerStartRestartGroup.changedInstance(scrollableStateCache) ? 256 : 128;
        }
        int i23 = i2 & 8;
        if (i23 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                }
                if ((i & 196608) == 0) {
                    if ((i2 & 32) != 0) {
                        i22 = 65536;
                        i3 |= i22;
                    } else {
                        if ((262144 & i) == 0 ? composerStartRestartGroup.changed(accountTabDuxo) : composerStartRestartGroup.changedInstance(accountTabDuxo)) {
                            i22 = 131072;
                        }
                        i3 |= i22;
                    }
                }
                i5 = i2 & 64;
                if (i5 == 0) {
                    if ((1572864 & i) == 0) {
                        function13 = function1;
                        i3 |= composerStartRestartGroup.changedInstance(function13) ? 1048576 : 524288;
                    }
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                        function14 = function12;
                    } else {
                        function14 = function12;
                        if ((i & 12582912) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function14) ? 8388608 : 4194304;
                        }
                    }
                    if ((i3 & 4793491) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i23 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            boolean z10 = i4 == 0 ? false : z;
                            if ((i2 & 32) == 0) {
                                composerStartRestartGroup.startReplaceGroup(-747520797);
                                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                                if (current == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                                composerStartRestartGroup.startReplaceableGroup(1729797275);
                                ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(AccountTabDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                                composer2 = composerStartRestartGroup;
                                composer2.endReplaceableGroup();
                                final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                                final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                                composer2.startReplaceGroup(-1633490746);
                                boolean zChangedInstance6 = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                                Object objRememberedValue38 = composer2.rememberedValue();
                                if (zChangedInstance6 || objRememberedValue38 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue38 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$$inlined$duxo$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                            final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                            lifecycle.addObserver(duxoLifecycleObserver);
                                            final Lifecycle lifecycle2 = lifecycle;
                                            return new DisposableEffectResult() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$$inlined$duxo$1.1
                                                @Override // androidx.compose.runtime.DisposableEffectResult
                                                public void dispose() {
                                                    lifecycle2.removeObserver(duxoLifecycleObserver);
                                                }
                                            };
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue38);
                                }
                                composer2.endReplaceGroup();
                                EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue38, composer2, 0);
                                composer2.endReplaceGroup();
                                accountTabDuxo2 = (AccountTabDuxo) baseDuxo;
                                i3 &= -458753;
                            } else {
                                composer2 = composerStartRestartGroup;
                                accountTabDuxo2 = accountTabDuxo;
                            }
                            Function1<? super String, Unit> function112 = i5 == 0 ? null : function1;
                            z3 = z10;
                            if (i6 == 0) {
                                accountTabDuxo3 = accountTabDuxo2;
                                function15 = function112;
                                i7 = i3;
                                modifier3 = modifier2;
                                function16 = null;
                            } else {
                                function15 = function112;
                                modifier3 = modifier2;
                                function16 = function14;
                                accountTabDuxo3 = accountTabDuxo2;
                                i7 = i3;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            z3 = z;
                            composer2 = composerStartRestartGroup;
                            i7 = i3;
                            modifier3 = modifier2;
                            function16 = function14;
                            function15 = function13;
                            accountTabDuxo3 = accountTabDuxo;
                        }
                        composer2.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1366020567, i7, -1, "com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposable (AccountSelectorComposable.kt:96)");
                        }
                        SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(accountTabDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer2, 0, 7);
                        boolean accountsLoading = AccountSelectorComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getAccountsLoading();
                        ImmutableMap<String, Integer> tabInfoIndexMap = AccountSelectorComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getTabInfoIndexMap();
                        allTabs = AccountSelectorComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getAllTabs();
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composer2, 0, 3);
                        final Navigator navigator = (Navigator) composer2.consume(LocalNavigator.getLocalNavigator());
                        Context context5 = (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        objRememberedValue = composer2.rememberedValue();
                        companion = Composer.INSTANCE;
                        Function1<? super Function1<? super Integer, Unit>, Unit> function113 = function16;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composer2);
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        CoroutineScope coroutineScope5 = (CoroutineScope) objRememberedValue;
                        final Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        i8 = i7;
                        EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer2, AutoLoggingCompositionLocals4.$stable);
                        composer2.startReplaceGroup(1849434622);
                        objRememberedValue2 = composer2.rememberedValue();
                        if (objRememberedValue2 != companion.getEmpty()) {
                            snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                            SnapshotState snapshotStateMutableStateOf$default = SnapshotState3.mutableStateOf$default(MapsKt.emptyMap(), null, 2, null);
                            composer2.updateRememberedValue(snapshotStateMutableStateOf$default);
                            objRememberedValue2 = snapshotStateMutableStateOf$default;
                        } else {
                            snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                        }
                        final SnapshotState snapshotState26 = (SnapshotState) objRememberedValue2;
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(1849434622);
                        objRememberedValue3 = composer2.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = SnapshotIntState3.mutableIntStateOf(0);
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        final SnapshotIntState2 snapshotIntState22 = (SnapshotIntState2) objRememberedValue3;
                        composer2.endReplaceGroup();
                        boolean isCollapsed = accountTabDuxo3.getIsCollapsed();
                        Object obj = !isCollapsed ? AccountSelectorExpansionState.Collapsed.INSTANCE : AccountSelectorExpansionState.Expanded.INSTANCE;
                        float f = !isCollapsed ? 1.0f : 0.0f;
                        composer2.startReplaceGroup(1849434622);
                        objRememberedValue4 = composer2.rememberedValue();
                        if (objRememberedValue4 != companion.getEmpty()) {
                            coroutineScope = coroutineScope5;
                            i9 = 2;
                            snapshotMutationPolicy = null;
                            objAnimatable$default = Animatable2.Animatable$default(f, 0.0f, 2, null);
                            composer2.updateRememberedValue(objAnimatable$default);
                        } else {
                            coroutineScope = coroutineScope5;
                            i9 = 2;
                            snapshotMutationPolicy = null;
                            objAnimatable$default = objRememberedValue4;
                        }
                        Animatable animatable4 = (Animatable) objAnimatable$default;
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(1849434622);
                        objRememberedValue5 = composer2.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = SnapshotState3.mutableStateOf$default(obj, snapshotMutationPolicy, i9, snapshotMutationPolicy);
                            composer2.updateRememberedValue(objRememberedValue5);
                        }
                        final SnapshotState snapshotState27 = (SnapshotState) objRememberedValue5;
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(1849434622);
                        objRememberedValue6 = composer2.rememberedValue();
                        if (objRememberedValue6 == companion.getEmpty()) {
                            objRememberedValue6 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy, i9, snapshotMutationPolicy);
                            composer2.updateRememberedValue(objRememberedValue6);
                        }
                        SnapshotState snapshotState28 = (SnapshotState) objRememberedValue6;
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(1849434622);
                        objRememberedValue7 = composer2.rememberedValue();
                        if (objRememberedValue7 == companion.getEmpty()) {
                            objRememberedValue7 = SnapshotState3.mutableStateOf$default(Boolean.TRUE, snapshotMutationPolicy, i9, snapshotMutationPolicy);
                            composer2.updateRememberedValue(objRememberedValue7);
                        }
                        SnapshotState snapshotState29 = (SnapshotState) objRememberedValue7;
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(1849434622);
                        objRememberedValue8 = composer2.rememberedValue();
                        if (objRememberedValue8 == companion.getEmpty()) {
                            objRememberedValue8 = SnapshotFloatState3.mutableFloatStateOf(0.0f);
                            composer2.updateRememberedValue(objRememberedValue8);
                        }
                        final SnapshotFloatState2 snapshotFloatState23 = (SnapshotFloatState2) objRememberedValue8;
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(5004770);
                        zChangedInstance = composer2.changedInstance(allTabs);
                        objRememberedValue9 = composer2.rememberedValue();
                        if (!zChangedInstance || objRememberedValue9 == companion.getEmpty()) {
                            objRememberedValue9 = new Function0() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Integer.valueOf(allTabs.size());
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue9);
                        }
                        composer2.endReplaceGroup();
                        composer3 = composer2;
                        pagerStateRememberPagerState = PagerStateKt.rememberPagerState(0, 0.0f, (Function0) objRememberedValue9, composer3, 0, 3);
                        composer3.startReplaceGroup(1849434622);
                        objRememberedValue10 = composer3.rememberedValue();
                        if (objRememberedValue10 != companion.getEmpty()) {
                            i10 = 2;
                            snapshotMutationPolicy2 = null;
                            objRememberedValue10 = SnapshotState3.mutableStateOf$default(accountTabDuxo3.getLastSelectedTabId(), null, 2, null);
                            composer3.updateRememberedValue(objRememberedValue10);
                        } else {
                            i10 = 2;
                            snapshotMutationPolicy2 = null;
                        }
                        SnapshotState snapshotState30 = (SnapshotState) objRememberedValue10;
                        composer3.endReplaceGroup();
                        composer3.startReplaceGroup(1849434622);
                        objRememberedValue11 = composer3.rememberedValue();
                        Function1<? super String, Unit> function114 = function15;
                        if (objRememberedValue11 == companion.getEmpty()) {
                            objRememberedValue11 = SnapshotState3.mutableStateOf$default(snapshotMutationPolicy2, snapshotMutationPolicy2, i10, snapshotMutationPolicy2);
                            composer3.updateRememberedValue(objRememberedValue11);
                        }
                        SnapshotState snapshotState31 = (SnapshotState) objRememberedValue11;
                        composer3.endReplaceGroup();
                        composer3.startReplaceGroup(1849434622);
                        objRememberedValue12 = composer3.rememberedValue();
                        if (objRememberedValue12 == companion.getEmpty()) {
                            objRememberedValue12 = SnapshotState3.mutableStateOf$default(snapshotMutationPolicy2, snapshotMutationPolicy2, i10, snapshotMutationPolicy2);
                            composer3.updateRememberedValue(objRememberedValue12);
                        }
                        snapshotState = (SnapshotState) objRememberedValue12;
                        composer3.endReplaceGroup();
                        composer3.startReplaceGroup(1849434622);
                        objRememberedValue13 = composer3.rememberedValue();
                        if (objRememberedValue13 != companion.getEmpty()) {
                            objRememberedValue13 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy2, 2, snapshotMutationPolicy2);
                            composer3.updateRememberedValue(objRememberedValue13);
                        }
                        SnapshotState snapshotState32 = (SnapshotState) objRememberedValue13;
                        composer3.endReplaceGroup();
                        composer3.startReplaceGroup(1849434622);
                        objRememberedValue14 = composer3.rememberedValue();
                        if (objRememberedValue14 == companion.getEmpty()) {
                            objRememberedValue14 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy2, 2, snapshotMutationPolicy2);
                            composer3.updateRememberedValue(objRememberedValue14);
                        }
                        SnapshotState snapshotState33 = (SnapshotState) objRememberedValue14;
                        composer3.endReplaceGroup();
                        AccountSelectorScrollable accountSelectorScrollableAccountSelectorComposable$lambda$29 = AccountSelectorComposable$lambda$29(snapshotState);
                        composer3.startReplaceGroup(5004770);
                        zChanged = composer3.changed(accountSelectorScrollableAccountSelectorComposable$lambda$29);
                        objRememberedValue15 = composer3.rememberedValue();
                        if (!zChanged || objRememberedValue15 == companion.getEmpty()) {
                            objRememberedValue15 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Boolean.valueOf(AccountSelectorComposableKt.AccountSelectorComposable$lambda$38$lambda$37(snapshotState));
                                }
                            });
                            composer3.updateRememberedValue(objRememberedValue15);
                        }
                        final SnapshotState4 snapshotState46 = (SnapshotState4) objRememberedValue15;
                        composer3.endReplaceGroup();
                        composer3.startReplaceGroup(1849434622);
                        objRememberedValue16 = composer3.rememberedValue();
                        if (objRememberedValue16 != companion.getEmpty()) {
                            i11 = 2;
                            objRememberedValue16 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                            composer3.updateRememberedValue(objRememberedValue16);
                        } else {
                            i11 = 2;
                        }
                        SnapshotState snapshotState34 = (SnapshotState) objRememberedValue16;
                        composer3.endReplaceGroup();
                        composer3.startReplaceGroup(1849434622);
                        objRememberedValue17 = composer3.rememberedValue();
                        if (objRememberedValue17 != companion.getEmpty()) {
                            SnapshotState snapshotStateMutableStateOf$default2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, i11, null);
                            composer3.updateRememberedValue(snapshotStateMutableStateOf$default2);
                            objRememberedValue17 = snapshotStateMutableStateOf$default2;
                        }
                        SnapshotState snapshotState35 = (SnapshotState) objRememberedValue17;
                        composer3.endReplaceGroup();
                        composer3.startReplaceGroup(1849434622);
                        objRememberedValue18 = composer3.rememberedValue();
                        if (objRememberedValue18 != companion.getEmpty()) {
                            SnapshotState snapshotStateMutableStateOf$default3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, i11, null);
                            composer3.updateRememberedValue(snapshotStateMutableStateOf$default3);
                            objRememberedValue18 = snapshotStateMutableStateOf$default3;
                        }
                        SnapshotState snapshotState36 = (SnapshotState) objRememberedValue18;
                        composer3.endReplaceGroup();
                        composer3.startReplaceGroup(1849434622);
                        objRememberedValue19 = composer3.rememberedValue();
                        if (objRememberedValue19 != companion.getEmpty()) {
                            snapshotState2 = snapshotState36;
                            i12 = 2;
                            objRememberedValue19 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composer3.updateRememberedValue(objRememberedValue19);
                        } else {
                            snapshotState2 = snapshotState36;
                            i12 = 2;
                        }
                        SnapshotState snapshotState37 = (SnapshotState) objRememberedValue19;
                        composer3.endReplaceGroup();
                        composer3.startReplaceGroup(1849434622);
                        objRememberedValue20 = composer3.rememberedValue();
                        if (objRememberedValue20 != companion.getEmpty()) {
                            objRememberedValue20 = SnapshotState3.mutableStateOf$default(null, null, i12, null);
                            composer3.updateRememberedValue(objRememberedValue20);
                        }
                        SnapshotState snapshotState38 = (SnapshotState) objRememberedValue20;
                        composer3.endReplaceGroup();
                        composer3.startReplaceGroup(1849434622);
                        objRememberedValue21 = composer3.rememberedValue();
                        if (objRememberedValue21 != companion.getEmpty()) {
                            snapshotState3 = snapshotState38;
                            objRememberedValue21 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composer3.updateRememberedValue(objRememberedValue21);
                        } else {
                            snapshotState3 = snapshotState38;
                        }
                        snapshotState5 = (SnapshotState) objRememberedValue21;
                        composer3.endReplaceGroup();
                        AccountSelectorScrollable accountSelectorScrollableAccountSelectorComposable$lambda$292 = AccountSelectorComposable$lambda$29(snapshotState);
                        composer3.startReplaceGroup(5004770);
                        zChanged2 = composer3.changed(accountSelectorScrollableAccountSelectorComposable$lambda$292);
                        objRememberedValue22 = composer3.rememberedValue();
                        if (!zChanged2 || objRememberedValue22 == companion.getEmpty()) {
                            objRememberedValue22 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Boolean.valueOf(AccountSelectorComposableKt.AccountSelectorComposable$lambda$59$lambda$58(snapshotState, snapshotState5));
                                }
                            });
                            composer3.updateRememberedValue(objRememberedValue22);
                        }
                        final SnapshotState4 snapshotState47 = (SnapshotState4) objRememberedValue22;
                        composer3.endReplaceGroup();
                        composer3.startReplaceGroup(-1633490746);
                        zChanged3 = composer3.changed(lazyListStateRememberLazyListState) | composer3.changed(pagerStateRememberPagerState);
                        objRememberedValue23 = composer3.rememberedValue();
                        if (!zChanged3 || objRememberedValue23 == companion.getEmpty()) {
                            objRememberedValue23 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Boolean.valueOf(AccountSelectorComposableKt.AccountSelectorComposable$lambda$62$lambda$61(lazyListStateRememberLazyListState, pagerStateRememberPagerState));
                                }
                            });
                            composer3.updateRememberedValue(objRememberedValue23);
                        }
                        final SnapshotState4 snapshotState48 = (SnapshotState4) objRememberedValue23;
                        composer3.endReplaceGroup();
                        boolean hasPrivacy = AccountSelectorComposable$lambda$0(snapshotState4).getHasPrivacy();
                        composer3.startReplaceGroup(5004770);
                        objRememberedValue24 = composer3.rememberedValue();
                        if (objRememberedValue24 == companion.getEmpty()) {
                            objRememberedValue24 = new Function1() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return AccountSelectorComposableKt.AccountSelectorComposable$lambda$65$lambda$64(snapshotFloatState23, ((Float) obj2).floatValue());
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue24);
                        }
                        composer3.endReplaceGroup();
                        AccountSelectorThresholdMeasure.AccountSelectorThresholdMeasure(allTabs, hasPrivacy, (Function1) objRememberedValue24, null, composer3, AccountTabInfo.Account.$stable | 384, 8);
                        Boolean boolValueOf = Boolean.valueOf(accountsLoading);
                        composer3.startReplaceGroup(-1224400529);
                        zChanged4 = composer3.changed(accountsLoading) | composer3.changed(tabInfoIndexMap) | composer3.changed(pagerStateRememberPagerState) | composer3.changedInstance(allTabs);
                        Object objRememberedValue39 = composer3.rememberedValue();
                        if (zChanged4) {
                            snapshotFloatState2 = snapshotFloatState23;
                            if (objRememberedValue39 != companion.getEmpty()) {
                                snapshotState6 = snapshotState;
                                z4 = accountsLoading;
                            }
                            composer3.endReplaceGroup();
                            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue39, composer3, 0);
                            Unit unit = Unit.INSTANCE;
                            composer3.startReplaceGroup(-1633490746);
                            int i24 = (i8 & 458752) ^ 196608;
                            z5 = (i24 > 131072 && composer3.changedInstance(accountTabDuxo3)) || (i8 & 196608) == 131072;
                            objRememberedValue25 = composer3.rememberedValue();
                            if (z5 || objRememberedValue25 == companion.getEmpty()) {
                                objRememberedValue25 = new Function1() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        return AccountSelectorComposableKt.AccountSelectorComposable$lambda$69$lambda$68(accountTabDuxo3, snapshotState27, (DisposableEffectScope) obj2);
                                    }
                                };
                                composer3.updateRememberedValue(objRememberedValue25);
                            }
                            composer3.endReplaceGroup();
                            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue25, composer3, 6);
                            composer3.startReplaceGroup(-1633490746);
                            zChangedInstance2 = composer3.changedInstance(animatable4);
                            objRememberedValue26 = composer3.rememberedValue();
                            if (!zChangedInstance2 || objRememberedValue26 == companion.getEmpty()) {
                                objRememberedValue26 = new AccountSelectorComposableKt$AccountSelectorComposable$4$1(animatable4, snapshotState27, null);
                                composer3.updateRememberedValue(objRememberedValue26);
                            }
                            composer3.endReplaceGroup();
                            EffectsKt.LaunchedEffect(animatable4, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue26, composer3, Animatable.$stable);
                            Boolean boolValueOf2 = Boolean.valueOf(AccountSelectorComposable$lambda$47(snapshotState2));
                            Boolean boolValueOf3 = Boolean.valueOf(AccountSelectorComposable$lambda$50(snapshotState37));
                            composer3.startReplaceGroup(-1224400529);
                            zChangedInstance3 = composer3.changedInstance(allTabs) | composer3.changedInstance(fragmentManager2) | composer3.changed(tabInfoIndexMap) | composer3.changed(pagerStateRememberPagerState);
                            Object objRememberedValue40 = composer3.rememberedValue();
                            if (zChangedInstance3) {
                                animatable = animatable4;
                                if (objRememberedValue40 != companion.getEmpty()) {
                                    snapshotState10 = snapshotState37;
                                    snapshotState11 = snapshotState3;
                                    snapshotState7 = snapshotState5;
                                    i13 = i24;
                                    accountSelectorComposableKt$AccountSelectorComposable$5$1 = objRememberedValue40;
                                    lazyListState = lazyListStateRememberLazyListState;
                                    snapshotFloatState22 = snapshotFloatState2;
                                    animatable2 = animatable;
                                    function17 = function113;
                                    i14 = i8;
                                    eventLogger = current2;
                                    context = context5;
                                    coroutineScope2 = coroutineScope;
                                    continuation = null;
                                    snapshotState9 = snapshotState2;
                                    bool = boolValueOf3;
                                    immutableMap = tabInfoIndexMap;
                                    snapshotState8 = snapshotState27;
                                    bool2 = boolValueOf2;
                                    immutableList = allTabs;
                                    i15 = 0;
                                }
                                composer3.endReplaceGroup();
                                EffectsKt.LaunchedEffect(bool2, bool, (Function2) accountSelectorComposableKt$AccountSelectorComposable$5$1, composer3, i15);
                                Integer numValueOf3 = Integer.valueOf(pagerStateRememberPagerState.getCurrentPage());
                                Integer numValueOf4 = Integer.valueOf(immutableList.size());
                                composer3.startReplaceGroup(-1224400529);
                                i16 = i14;
                                i17 = i13;
                                zChanged5 = composer3.changed(pagerStateRememberPagerState) | composer3.changedInstance(immutableList) | composer3.changed(z4) | ((i16 & 896) == 256 || ((i16 & 512) != 0 && composer3.changedInstance(scrollableStateCache))) | ((i17 <= 131072 && composer3.changedInstance(accountTabDuxo3)) || (i16 & 196608) == 131072) | ((3670016 & i16) == 1048576);
                                Object objRememberedValue41 = composer3.rememberedValue();
                                if (zChanged5 || objRememberedValue41 == companion.getEmpty()) {
                                    i18 = i17;
                                    PagerState pagerState5 = pagerStateRememberPagerState;
                                    composer4 = composer3;
                                    AccountTabDuxo accountTabDuxo5 = accountTabDuxo3;
                                    snapshotState12 = snapshotState8;
                                    continuation2 = continuation;
                                    ImmutableList<AccountTabInfo.Account> immutableList5 = immutableList;
                                    accountSelectorComposableKt$AccountSelectorComposable$6$1 = new AccountSelectorComposableKt$AccountSelectorComposable$6$1(pagerState5, immutableList5, z4, scrollableStateCache, accountTabDuxo5, function114, snapshotState31, snapshotState6, snapshotState32, null);
                                    pagerState = pagerState5;
                                    immutableList2 = immutableList5;
                                    accountTabDuxo3 = accountTabDuxo5;
                                    function18 = function114;
                                    snapshotState13 = snapshotState6;
                                    snapshotState14 = snapshotState32;
                                    modifier4 = modifier3;
                                    snapshotState15 = snapshotState34;
                                    snapshotState16 = snapshotState31;
                                    composer4.updateRememberedValue(accountSelectorComposableKt$AccountSelectorComposable$6$1);
                                } else {
                                    function18 = function114;
                                    pagerState = pagerStateRememberPagerState;
                                    i18 = i17;
                                    composer4 = composer3;
                                    continuation2 = continuation;
                                    modifier4 = modifier3;
                                    snapshotState15 = snapshotState34;
                                    snapshotState14 = snapshotState32;
                                    snapshotState16 = snapshotState31;
                                    immutableList2 = immutableList;
                                    accountSelectorComposableKt$AccountSelectorComposable$6$1 = objRememberedValue41;
                                    snapshotState12 = snapshotState8;
                                    snapshotState13 = snapshotState6;
                                }
                                composer4.endReplaceGroup();
                                EffectsKt.LaunchedEffect(numValueOf3, scrollableStateCache, numValueOf4, (Function2) accountSelectorComposableKt$AccountSelectorComposable$6$1, composer4, (AccountSelectorScrollable.$stable << 3) | ((i16 >> 3) & 112));
                                Boolean boolValueOf4 = Boolean.valueOf(z4);
                                composer4.startReplaceGroup(-1224400529);
                                lazyListState2 = lazyListState;
                                eventLogger2 = eventLogger;
                                zChanged6 = composer4.changed(pagerState) | composer4.changed(lazyListState2) | composer4.changed(z4) | composer4.changedInstance(eventLogger2);
                                objRememberedValue27 = composer4.rememberedValue();
                                if (!zChanged6 || objRememberedValue27 == companion.getEmpty()) {
                                    eventLogger3 = eventLogger2;
                                    AccountSelectorComposableKt$AccountSelectorComposable$7$1 accountSelectorComposableKt$AccountSelectorComposable$7$1 = new AccountSelectorComposableKt$AccountSelectorComposable$7$1(pagerState, lazyListState2, z4, snapshotState35, eventLogger3, null);
                                    snapshotState17 = snapshotState35;
                                    composer4.updateRememberedValue(accountSelectorComposableKt$AccountSelectorComposable$7$1);
                                    objRememberedValue27 = accountSelectorComposableKt$AccountSelectorComposable$7$1;
                                } else {
                                    eventLogger3 = eventLogger2;
                                    snapshotState17 = snapshotState35;
                                }
                                composer4.endReplaceGroup();
                                composer5 = composer4;
                                EffectsKt.LaunchedEffect(pagerState, lazyListState2, boolValueOf4, (Function2) objRememberedValue27, composer5, 0);
                                composer5.startReplaceGroup(-1746271574);
                                coroutineScope3 = coroutineScope2;
                                zChangedInstance4 = ((29360128 & i16) != 8388608) | composer5.changedInstance(coroutineScope3) | composer5.changed(pagerState);
                                objRememberedValue28 = composer5.rememberedValue();
                                if (!zChangedInstance4 || objRememberedValue28 == companion.getEmpty()) {
                                    function19 = function17;
                                    objRememberedValue28 = new AccountSelectorComposableKt$AccountSelectorComposable$8$1(function19, coroutineScope3, pagerState, continuation2);
                                    composer5.updateRememberedValue(objRememberedValue28);
                                } else {
                                    function19 = function17;
                                }
                                composer5.endReplaceGroup();
                                EffectsKt.LaunchedEffect(coroutineScope3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue28, composer5, 0);
                                numValueOf = Integer.valueOf(pagerState.getCurrentPage());
                                numValueOf2 = Integer.valueOf(immutableList2.size());
                                composer5.startReplaceGroup(-1224400529);
                                context2 = context;
                                zChanged7 = composer5.changed(pagerState) | composer5.changedInstance(immutableList2) | composer5.changed(z4) | composer5.changedInstance(fragmentManager2) | composer5.changedInstance(context2);
                                Function1<? super Function1<? super Integer, Unit>, Unit> function115 = function19;
                                objRememberedValue29 = composer5.rememberedValue();
                                if (!zChanged7 || objRememberedValue29 == companion.getEmpty()) {
                                    i19 = i16;
                                    FragmentManager fragmentManager3 = fragmentManager2;
                                    pagerState2 = pagerState;
                                    num = numValueOf2;
                                    context3 = context2;
                                    snapshotState18 = snapshotState9;
                                    boolean z11 = z4;
                                    r8 = 0;
                                    num2 = numValueOf;
                                    immutableList3 = immutableList2;
                                    i20 = i18;
                                    objRememberedValue29 = new AccountSelectorComposableKt$AccountSelectorComposable$9$1(pagerState2, immutableList3, z11, fragmentManager3, context3, null);
                                    composer5.updateRememberedValue(objRememberedValue29);
                                } else {
                                    num2 = numValueOf;
                                    i19 = i16;
                                    snapshotState18 = snapshotState9;
                                    immutableList3 = immutableList2;
                                    pagerState2 = pagerState;
                                    i20 = i18;
                                    r8 = 0;
                                    num = numValueOf2;
                                    context3 = context2;
                                }
                                composer5.endReplaceGroup();
                                EffectsKt.LaunchedEffect(num2, num, (Function2) objRememberedValue29, composer5, r8);
                                AccountTabTarget deeplinkTarget = AccountSelectorComposable$lambda$0(snapshotState4).getDeeplinkTarget();
                                composer5.startReplaceGroup(-1224400529);
                                snapshotState42 = snapshotState4;
                                zChanged8 = composer5.changed(snapshotState42) | composer5.changed(immutableMap) | composer5.changed(pagerState2) | (((i20 > 131072 || !composer5.changedInstance(accountTabDuxo3)) && (i19 & 196608) != 131072) ? r8 : true);
                                objRememberedValue30 = composer5.rememberedValue();
                                if (zChanged8 || objRememberedValue30 == companion.getEmpty()) {
                                    PagerState pagerState6 = pagerState2;
                                    objRememberedValue30 = new AccountSelectorComposableKt$AccountSelectorComposable$10$1(snapshotState42, pagerState6, accountTabDuxo3, immutableMap, null);
                                    pagerState3 = pagerState6;
                                    composer5.updateRememberedValue(objRememberedValue30);
                                } else {
                                    pagerState3 = pagerState2;
                                }
                                composer5.endReplaceGroup();
                                EffectsKt.LaunchedEffect(deeplinkTarget, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue30, composer5, AccountTabTarget.$stable);
                                composer5.startReplaceGroup(5004770);
                                zChanged9 = composer5.changed(immutableList3);
                                objRememberedValue31 = composer5.rememberedValue();
                                if (!zChanged9 || objRememberedValue31 == companion.getEmpty()) {
                                    objRememberedValue31 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$$ExternalSyntheticLambda6
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Boolean.valueOf(AccountSelectorComposableKt.AccountSelectorComposable$lambda$78$lambda$77(immutableList3, pagerState3));
                                        }
                                    });
                                    composer5.updateRememberedValue(objRememberedValue31);
                                }
                                SnapshotState4 snapshotState49 = (SnapshotState4) objRememberedValue31;
                                composer5.endReplaceGroup();
                                composer5.startReplaceGroup(1849434622);
                                objRememberedValue32 = composer5.rememberedValue();
                                if (objRememberedValue32 != companion.getEmpty()) {
                                    coroutineScope4 = coroutineScope3;
                                    final PagerState pagerState7 = pagerState3;
                                    final ImmutableList<AccountTabInfo.Account> immutableList6 = immutableList3;
                                    lazyListState3 = lazyListState2;
                                    final SnapshotState snapshotState39 = snapshotState10;
                                    eventLogger4 = eventLogger3;
                                    Function0 function0 = new Function0() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$$ExternalSyntheticLambda7
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return AccountSelectorComposableKt.AccountSelectorComposable$lambda$83$lambda$82(immutableList6, pagerState7, density, snapshotState39, snapshotState26, snapshotIntState22);
                                        }
                                    };
                                    immutableList4 = immutableList6;
                                    pagerState3 = pagerState7;
                                    snapshotState19 = snapshotState26;
                                    snapshotIntState2 = snapshotIntState22;
                                    objRememberedValue32 = SnapshotStateKt.derivedStateOf(function0);
                                    composer5.updateRememberedValue(objRememberedValue32);
                                } else {
                                    immutableList4 = immutableList3;
                                    coroutineScope4 = coroutineScope3;
                                    lazyListState3 = lazyListState2;
                                    eventLogger4 = eventLogger3;
                                    snapshotState19 = snapshotState26;
                                    snapshotIntState2 = snapshotIntState22;
                                }
                                snapshotState43 = (SnapshotState4) objRememberedValue32;
                                composer5.endReplaceGroup();
                                AccountSelectorTabRowScrollInfo accountSelectorTabRowScrollInfoAccountSelectorComposable$lambda$84 = AccountSelectorComposable$lambda$84(snapshotState43);
                                composer5.startReplaceGroup(-1224400529);
                                zChanged10 = composer5.changed(lazyListState3) | composer5.changed(pagerState3);
                                objRememberedValue33 = composer5.rememberedValue();
                                if (!zChanged10 || objRememberedValue33 == companion.getEmpty()) {
                                    objRememberedValue33 = new AccountSelectorComposableKt$AccountSelectorComposable$11$1(snapshotState43, lazyListState3, pagerState3, snapshotState17, null);
                                    composer5.updateRememberedValue(objRememberedValue33);
                                }
                                composer5.endReplaceGroup();
                                EffectsKt.LaunchedEffect(accountSelectorTabRowScrollInfoAccountSelectorComposable$lambda$84, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue33, composer5, 0);
                                composer5.startReplaceGroup(1849434622);
                                objRememberedValue34 = composer5.rememberedValue();
                                if (objRememberedValue34 != companion.getEmpty()) {
                                    objRememberedValue34 = SnapshotState3.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                                    composer5.updateRememberedValue(objRememberedValue34);
                                }
                                snapshotState20 = (SnapshotState) objRememberedValue34;
                                composer5.endReplaceGroup();
                                NewUserExperienceStage newUserExperienceStage = AccountSelectorComposable$lambda$0(snapshotState42).getNewUserExperienceStage();
                                composer5.startReplaceGroup(-1224400529);
                                boolean zChanged12 = composer5.changed(snapshotState42) | composer5.changed(lazyListState3);
                                if (i20 > 131072 || !composer5.changedInstance(accountTabDuxo3)) {
                                    snapshotState21 = snapshotState20;
                                    if ((i19 & 196608) != 131072) {
                                        z6 = false;
                                    }
                                    z7 = z6 | zChanged12;
                                    objRememberedValue35 = composer5.rememberedValue();
                                    if (z7 || objRememberedValue35 == companion.getEmpty()) {
                                        objRememberedValue35 = new AccountSelectorComposableKt$AccountSelectorComposable$12$1(snapshotState21, snapshotState42, lazyListState3, accountTabDuxo3, null);
                                        composer5.updateRememberedValue(objRememberedValue35);
                                    }
                                    composer5.endReplaceGroup();
                                    EffectsKt.LaunchedEffect(lazyListState3, newUserExperienceStage, (Function2) objRememberedValue35, composer5, 0);
                                    AccountSelectorExpansionState accountSelectorExpansionStateAccountSelectorComposable$lambda$9 = AccountSelectorComposable$lambda$9(snapshotState12);
                                    NewUserExperienceStage newUserExperienceStage2 = AccountSelectorComposable$lambda$0(snapshotState42).getNewUserExperienceStage();
                                    composer5.startReplaceGroup(-1224400529);
                                    boolean zChanged13 = composer5.changed(snapshotState42) | composer5.changedInstance(eventLogger4);
                                    if (i20 > 131072 || !composer5.changedInstance(accountTabDuxo3)) {
                                        snapshotState44 = snapshotState49;
                                        if ((i19 & 196608) != 131072) {
                                            z8 = false;
                                        }
                                        zChanged11 = z8 | zChanged13 | composer5.changed(pagerState3);
                                        objRememberedValue36 = composer5.rememberedValue();
                                        if (zChanged11 || objRememberedValue36 == companion.getEmpty()) {
                                            composer6 = composer5;
                                            i21 = i20;
                                            AccountTabDuxo accountTabDuxo6 = accountTabDuxo3;
                                            SnapshotState snapshotState40 = snapshotState12;
                                            AccountSelectorComposableKt$AccountSelectorComposable$13$1 accountSelectorComposableKt$AccountSelectorComposable$13$1 = new AccountSelectorComposableKt$AccountSelectorComposable$13$1(snapshotState42, snapshotState40, eventLogger4, accountTabDuxo6, pagerState3, null);
                                            context4 = context3;
                                            snapshotState45 = snapshotState42;
                                            snapshotState22 = snapshotState40;
                                            accountTabDuxo3 = accountTabDuxo6;
                                            pagerState4 = pagerState3;
                                            composer6.updateRememberedValue(accountSelectorComposableKt$AccountSelectorComposable$13$1);
                                            objRememberedValue36 = accountSelectorComposableKt$AccountSelectorComposable$13$1;
                                        } else {
                                            snapshotState45 = snapshotState42;
                                            context4 = context3;
                                            snapshotState22 = snapshotState12;
                                            composer6 = composer5;
                                            i21 = i20;
                                            pagerState4 = pagerState3;
                                        }
                                        composer6.endReplaceGroup();
                                        EffectsKt.LaunchedEffect(accountSelectorExpansionStateAccountSelectorComposable$lambda$9, newUserExperienceStage2, (Function2) objRememberedValue36, composer6, 0);
                                        Boolean boolValueOf5 = Boolean.valueOf(AccountSelectorComposable$lambda$12(snapshotState28));
                                        AccountSelectorScrollable accountSelectorScrollableAccountSelectorComposable$lambda$293 = AccountSelectorComposable$lambda$29(snapshotState13);
                                        Boolean boolValueOf6 = accountSelectorScrollableAccountSelectorComposable$lambda$293 == null ? Boolean.valueOf(accountSelectorScrollableAccountSelectorComposable$lambda$293.isScrolling()) : null;
                                        composer6.startReplaceGroup(-1224400529);
                                        animatable3 = animatable2;
                                        zChangedInstance5 = ((i21 <= 131072 && composer6.changedInstance(accountTabDuxo3)) || (i19 & 196608) == 131072) | composer6.changedInstance(animatable3);
                                        objRememberedValue37 = composer6.rememberedValue();
                                        if (zChangedInstance5 || objRememberedValue37 == companion.getEmpty()) {
                                            SnapshotState snapshotState41 = snapshotState22;
                                            snapshotState23 = snapshotState28;
                                            AccountSelectorComposableKt$AccountSelectorComposable$14$1 accountSelectorComposableKt$AccountSelectorComposable$14$1 = new AccountSelectorComposableKt$AccountSelectorComposable$14$1(animatable3, accountTabDuxo3, snapshotState23, snapshotState13, snapshotState41, snapshotState29, null);
                                            snapshotState24 = snapshotState14;
                                            snapshotState25 = snapshotState29;
                                            snapshotState22 = snapshotState41;
                                            composer6.updateRememberedValue(accountSelectorComposableKt$AccountSelectorComposable$14$1);
                                            objRememberedValue37 = accountSelectorComposableKt$AccountSelectorComposable$14$1;
                                        } else {
                                            snapshotState24 = snapshotState14;
                                            snapshotState23 = snapshotState28;
                                            snapshotState25 = snapshotState29;
                                        }
                                        composer6.endReplaceGroup();
                                        EffectsKt.LaunchedEffect(boolValueOf5, boolValueOf6, (Function2) objRememberedValue37, composer6, 0);
                                        Composer composer8 = composer6;
                                        final ImmutableMap<String, Integer> immutableMap2 = immutableMap;
                                        final AccountTabDuxo accountTabDuxo7 = accountTabDuxo3;
                                        final SnapshotState snapshotState50 = snapshotState23;
                                        final SnapshotFloatState2 snapshotFloatState24 = snapshotFloatState22;
                                        final SnapshotState snapshotState51 = snapshotState18;
                                        final SnapshotState snapshotState52 = snapshotState17;
                                        final SnapshotState snapshotState53 = snapshotState10;
                                        final SnapshotState snapshotState54 = snapshotState11;
                                        final Modifier modifier6 = modifier4;
                                        final SnapshotState4 snapshotState410 = snapshotState45;
                                        final Context context6 = context4;
                                        final SnapshotState4 snapshotState411 = snapshotState44;
                                        final LazyListState lazyListState4 = lazyListState3;
                                        final ImmutableList<AccountTabInfo.Account> immutableList7 = immutableList4;
                                        AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, AccountTabAnalytics.INSTANCE.getScreen(), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-1308901886, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt.AccountSelectorComposable.15

                                            /* compiled from: AccountSelectorComposable.kt */
                                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                            @SourceDebugExtension
                                            /* renamed from: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$15$2, reason: invalid class name */
                                            static final class AnonymousClass2 implements Function3<PaddingValues, Composer, Integer, Unit> {
                                                final /* synthetic */ AccountTabDuxo $accountTabDuxo;
                                                final /* synthetic */ ImmutableList<AccountTabInfo.Account> $accountTabInfo;
                                                final /* synthetic */ LazyListState $accountTabRowListState;
                                                final /* synthetic */ SnapshotState<Boolean> $allowHorizontalPaging$delegate;
                                                final /* synthetic */ CoroutineScope $coroutineScope;
                                                final /* synthetic */ SnapshotState4<Boolean> $currentTabNeedsGlobalGestureDetection$delegate;
                                                final /* synthetic */ FragmentManager $fragmentManager;
                                                final /* synthetic */ boolean $innerScrollActive;
                                                final /* synthetic */ SnapshotState4<Boolean> $isAtTop$delegate;
                                                final /* synthetic */ SnapshotState<Boolean> $isGestureActive$delegate;
                                                final /* synthetic */ SnapshotState<Boolean> $isGlobalScrollingActive$delegate;
                                                final /* synthetic */ SnapshotState<Boolean> $isProgrammaticallyScrollingTabRow$delegate;
                                                final /* synthetic */ SnapshotState4<Boolean> $isVerticalScrollingActive$delegate;
                                                final /* synthetic */ SnapshotState<AccountTabInfo> $lastSelectedTabInfoBeforeReorder$delegate;
                                                final /* synthetic */ SnapshotState<Boolean> $needsFragmentReset$delegate;
                                                final /* synthetic */ PagerState $pagerState;
                                                final /* synthetic */ SnapshotFloatState2 $scrollThreshold$delegate;
                                                final /* synthetic */ SnapshotState<AccountTabInfo> $selectedTabInfo$delegate;
                                                final /* synthetic */ SnapshotState4<Boolean> $shouldRealignTabRow$delegate;
                                                final /* synthetic */ SnapshotState<Boolean> $showReorderBottomSheet$delegate;
                                                final /* synthetic */ Animatable<Float, AnimationVectors2> $tabExpansionProgress;
                                                final /* synthetic */ SnapshotState<Job> $tabRowScrollDebounceJob$delegate;
                                                final /* synthetic */ SnapshotState<AccountSelectorExpansionState> $uiExpansionState$delegate;
                                                final /* synthetic */ SnapshotState4<AccountSelectorViewState> $viewState$delegate;

                                                AnonymousClass2(Animatable<Float, AnimationVectors2> animatable, CoroutineScope coroutineScope, SnapshotState4<Boolean> snapshotState4, SnapshotState4<Boolean> snapshotState42, LazyListState lazyListState, PagerState pagerState, SnapshotFloatState2 snapshotFloatState2, SnapshotState4<Boolean> snapshotState43, SnapshotState<Boolean> snapshotState, SnapshotState<AccountSelectorExpansionState> snapshotState2, SnapshotState<Boolean> snapshotState3, SnapshotState<Job> snapshotState5, SnapshotState<Boolean> snapshotState6, SnapshotState<AccountTabInfo> snapshotState7, FragmentManager fragmentManager, SnapshotState4<Boolean> snapshotState44, AccountTabDuxo accountTabDuxo, SnapshotState4<AccountSelectorViewState> snapshotState45, SnapshotState<Boolean> snapshotState8, SnapshotState<Boolean> snapshotState9, ImmutableList<AccountTabInfo.Account> immutableList, boolean z, SnapshotState<Boolean> snapshotState10, SnapshotState<AccountTabInfo> snapshotState11) {
                                                    this.$tabExpansionProgress = animatable;
                                                    this.$coroutineScope = coroutineScope;
                                                    this.$isVerticalScrollingActive$delegate = snapshotState4;
                                                    this.$shouldRealignTabRow$delegate = snapshotState42;
                                                    this.$accountTabRowListState = lazyListState;
                                                    this.$pagerState = pagerState;
                                                    this.$scrollThreshold$delegate = snapshotFloatState2;
                                                    this.$isAtTop$delegate = snapshotState43;
                                                    this.$isGestureActive$delegate = snapshotState;
                                                    this.$uiExpansionState$delegate = snapshotState2;
                                                    this.$allowHorizontalPaging$delegate = snapshotState3;
                                                    this.$tabRowScrollDebounceJob$delegate = snapshotState5;
                                                    this.$isProgrammaticallyScrollingTabRow$delegate = snapshotState6;
                                                    this.$selectedTabInfo$delegate = snapshotState7;
                                                    this.$fragmentManager = fragmentManager;
                                                    this.$currentTabNeedsGlobalGestureDetection$delegate = snapshotState44;
                                                    this.$accountTabDuxo = accountTabDuxo;
                                                    this.$viewState$delegate = snapshotState45;
                                                    this.$needsFragmentReset$delegate = snapshotState8;
                                                    this.$isGlobalScrollingActive$delegate = snapshotState9;
                                                    this.$accountTabInfo = immutableList;
                                                    this.$innerScrollActive = z;
                                                    this.$showReorderBottomSheet$delegate = snapshotState10;
                                                    this.$lastSelectedTabInfoBeforeReorder$delegate = snapshotState11;
                                                }

                                                /* JADX INFO: Access modifiers changed from: private */
                                                public static final boolean invoke$lambda$19$lambda$9$lambda$8() {
                                                    return false;
                                                }

                                                public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                                                    int i2;
                                                    FragmentManager fragmentManager;
                                                    AccountTabDuxo accountTabDuxo;
                                                    AccountTabDuxo accountTabDuxo2;
                                                    CoroutineScope coroutineScope;
                                                    final SnapshotState<AccountSelectorExpansionState> snapshotState;
                                                    PaddingValues paddingValues2 = paddingValues;
                                                    Composer composer2 = composer;
                                                    Intrinsics.checkNotNullParameter(paddingValues2, "paddingValues");
                                                    if ((i & 6) == 0) {
                                                        i2 = i | (composer2.changed(paddingValues2) ? 4 : 2);
                                                    } else {
                                                        i2 = i;
                                                    }
                                                    if ((i2 & 19) == 18 && composer2.getSkipping()) {
                                                        composer2.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(811899923, i2, -1, "com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposable.<anonymous>.<anonymous> (AccountSelectorComposable.kt:831)");
                                                    }
                                                    float fAccountSelectorComposable$lambda$18 = AccountSelectorComposableKt.AccountSelectorComposable$lambda$18(this.$scrollThreshold$delegate);
                                                    composer2.startReplaceGroup(-1746271574);
                                                    boolean zChanged = composer2.changed(fAccountSelectorComposable$lambda$18) | composer2.changed(this.$tabExpansionProgress) | composer2.changed(this.$coroutineScope);
                                                    Animatable<Float, AnimationVectors2> animatable = this.$tabExpansionProgress;
                                                    CoroutineScope coroutineScope2 = this.$coroutineScope;
                                                    final SnapshotFloatState2 snapshotFloatState2 = this.$scrollThreshold$delegate;
                                                    final SnapshotState4<Boolean> snapshotState4 = this.$isAtTop$delegate;
                                                    final SnapshotState<Boolean> snapshotState2 = this.$isGestureActive$delegate;
                                                    final SnapshotState<AccountSelectorExpansionState> snapshotState3 = this.$uiExpansionState$delegate;
                                                    final SnapshotState<Boolean> snapshotState5 = this.$allowHorizontalPaging$delegate;
                                                    Object objRememberedValue = composer2.rememberedValue();
                                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                        AccountSelectorTabNestedScrollConnection accountSelectorTabNestedScrollConnection = new AccountSelectorTabNestedScrollConnection(animatable, new Function0() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$15$2$$ExternalSyntheticLambda0
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                return Float.valueOf(AccountSelectorComposableKt.access$AccountSelectorComposable$lambda$18(snapshotFloatState2));
                                                            }
                                                        }, coroutineScope2, new Function0() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$15$2$$ExternalSyntheticLambda2
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                return Boolean.valueOf(AccountSelectorComposableKt.access$AccountSelectorComposable$lambda$39(snapshotState4));
                                                            }
                                                        }, new Function0() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$15$2$$ExternalSyntheticLambda3
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                return Boolean.valueOf(AccountSelectorComposableKt.access$AccountSelectorComposable$lambda$12(snapshotState2));
                                                            }
                                                        }, new Function1() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$15$2$$ExternalSyntheticLambda4
                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final Object invoke(Object obj) {
                                                                return AccountSelectorComposableKt.C2642715.AnonymousClass2.invoke$lambda$6$lambda$3(snapshotState2, ((Boolean) obj).booleanValue());
                                                            }
                                                        }, new Function1() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$15$2$$ExternalSyntheticLambda5
                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final Object invoke(Object obj) {
                                                                return AccountSelectorComposableKt.C2642715.AnonymousClass2.invoke$lambda$6$lambda$4(snapshotState3, (AccountSelectorExpansionState) obj);
                                                            }
                                                        }, new Function1() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$15$2$$ExternalSyntheticLambda6
                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final Object invoke(Object obj) {
                                                                return AccountSelectorComposableKt.C2642715.AnonymousClass2.invoke$lambda$6$lambda$5(snapshotState5, ((Boolean) obj).booleanValue());
                                                            }
                                                        }, C26429xc3a6121b.INSTANCE);
                                                        composer2.updateRememberedValue(accountSelectorTabNestedScrollConnection);
                                                        objRememberedValue = accountSelectorTabNestedScrollConnection;
                                                    }
                                                    AccountSelectorTabNestedScrollConnection accountSelectorTabNestedScrollConnection2 = (AccountSelectorTabNestedScrollConnection) objRememberedValue;
                                                    composer2.endReplaceGroup();
                                                    Object[] objArr = {Boolean.valueOf(AccountSelectorComposableKt.AccountSelectorComposable$lambda$63(this.$shouldRealignTabRow$delegate)), AccountSelectorComposableKt.AccountSelectorComposable$lambda$9(this.$uiExpansionState$delegate), Boolean.valueOf(AccountSelectorComposableKt.AccountSelectorComposable$lambda$60(this.$isVerticalScrollingActive$delegate)), this.$tabExpansionProgress};
                                                    composer2.startReplaceGroup(-1224400529);
                                                    boolean zChanged2 = composer2.changed(this.$isVerticalScrollingActive$delegate) | composer2.changed(this.$shouldRealignTabRow$delegate) | composer2.changedInstance(this.$coroutineScope) | composer2.changed(this.$accountTabRowListState) | composer2.changed(this.$pagerState);
                                                    PagerState pagerState = this.$pagerState;
                                                    SnapshotState4<Boolean> snapshotState42 = this.$isVerticalScrollingActive$delegate;
                                                    SnapshotState<AccountSelectorExpansionState> snapshotState6 = this.$uiExpansionState$delegate;
                                                    SnapshotState4<Boolean> snapshotState43 = this.$shouldRealignTabRow$delegate;
                                                    CoroutineScope coroutineScope3 = this.$coroutineScope;
                                                    SnapshotState<Job> snapshotState7 = this.$tabRowScrollDebounceJob$delegate;
                                                    SnapshotState<Boolean> snapshotState8 = this.$isProgrammaticallyScrollingTabRow$delegate;
                                                    LazyListState lazyListState = this.$accountTabRowListState;
                                                    Object objRememberedValue2 = composer2.rememberedValue();
                                                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                        AccountSelectorComposableKt$AccountSelectorComposable$15$2$1$1 accountSelectorComposableKt$AccountSelectorComposable$15$2$1$1 = new AccountSelectorComposableKt$AccountSelectorComposable$15$2$1$1(pagerState, snapshotState42, snapshotState6, snapshotState43, coroutineScope3, snapshotState7, snapshotState8, lazyListState, null);
                                                        composer2.updateRememberedValue(accountSelectorComposableKt$AccountSelectorComposable$15$2$1$1);
                                                        objRememberedValue2 = accountSelectorComposableKt$AccountSelectorComposable$15$2$1$1;
                                                    }
                                                    composer2.endReplaceGroup();
                                                    EffectsKt.LaunchedEffect(objArr, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer2, 0);
                                                    Modifier.Companion companion = Modifier.INSTANCE;
                                                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                                                    AccountTabInfo accountTabInfoAccountSelectorComposable$lambda$26 = AccountSelectorComposableKt.AccountSelectorComposable$lambda$26(this.$selectedTabInfo$delegate);
                                                    if (accountTabInfoAccountSelectorComposable$lambda$26 != null && accountTabInfoAccountSelectorComposable$lambda$26.getLayoutUnderTabInfo()) {
                                                        paddingValues2 = PaddingKt.m5135PaddingValues0680j_4(C2002Dp.m7995constructorimpl(0));
                                                    }
                                                    Modifier modifierPadding = PaddingKt.padding(modifierFillMaxSize$default, paddingValues2);
                                                    FragmentManager fragmentManager2 = this.$fragmentManager;
                                                    final SnapshotState4<Boolean> snapshotState44 = this.$currentTabNeedsGlobalGestureDetection$delegate;
                                                    final SnapshotState4<Boolean> snapshotState45 = this.$isAtTop$delegate;
                                                    final Animatable<Float, AnimationVectors2> animatable2 = this.$tabExpansionProgress;
                                                    final CoroutineScope coroutineScope4 = this.$coroutineScope;
                                                    AccountTabDuxo accountTabDuxo3 = this.$accountTabDuxo;
                                                    SnapshotState4<AccountSelectorViewState> snapshotState46 = this.$viewState$delegate;
                                                    SnapshotState<Boolean> snapshotState9 = this.$needsFragmentReset$delegate;
                                                    SnapshotState<Boolean> snapshotState10 = this.$allowHorizontalPaging$delegate;
                                                    final SnapshotState<Boolean> snapshotState11 = this.$isGestureActive$delegate;
                                                    final SnapshotFloatState2 snapshotFloatState22 = this.$scrollThreshold$delegate;
                                                    final SnapshotState<AccountSelectorExpansionState> snapshotState12 = this.$uiExpansionState$delegate;
                                                    final SnapshotState<Boolean> snapshotState13 = this.$isGlobalScrollingActive$delegate;
                                                    final SnapshotState<Boolean> snapshotState14 = snapshotState10;
                                                    PagerState pagerState2 = this.$pagerState;
                                                    ImmutableList<AccountTabInfo.Account> immutableList = this.$accountTabInfo;
                                                    boolean z = this.$innerScrollActive;
                                                    SnapshotState<Boolean> snapshotState15 = this.$showReorderBottomSheet$delegate;
                                                    SnapshotState<AccountTabInfo> snapshotState16 = this.$selectedTabInfo$delegate;
                                                    SnapshotState<AccountTabInfo> snapshotState17 = this.$lastSelectedTabInfoBeforeReorder$delegate;
                                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierPadding);
                                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                    }
                                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                    if (AccountSelectorComposableKt.AccountSelectorComposable$lambda$0(snapshotState46).getAccountsLoading() || AccountSelectorComposableKt.AccountSelectorComposable$lambda$50(snapshotState9)) {
                                                        fragmentManager = fragmentManager2;
                                                        accountTabDuxo = accountTabDuxo3;
                                                        composer2.startReplaceGroup(157479425);
                                                        LoadingScreenComposablesKt.ShimmerLoadingComposable(new ShimmerLoaderType.Generic(false), null, composer2, ShimmerLoaderType.Generic.$stable, 2);
                                                        composer2.endReplaceGroup();
                                                    } else if (AccountSelectorComposableKt.AccountSelectorComposable$lambda$0(snapshotState46).getNuxTab() != null) {
                                                        composer2.startReplaceGroup(157718745);
                                                        AccountTabInfo.Nux nuxTab = AccountSelectorComposableKt.AccountSelectorComposable$lambda$0(snapshotState46).getNuxTab();
                                                        if (nuxTab == null) {
                                                            throw new IllegalStateException("Required value was null.");
                                                        }
                                                        AccountSelectorFragmentPage.AccountTabFragmentPage(nuxTab, true, fragmentManager2, accountSelectorTabNestedScrollConnection2, ModifiersKt.autoLogEvents$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(null, "selector_individual_upsell", null, 5, null), null, 47, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), composer2, AccountTabInfo.Nux.$stable | 48, 0);
                                                        composer2.endReplaceGroup();
                                                        fragmentManager = fragmentManager2;
                                                        accountTabDuxo = accountTabDuxo3;
                                                    } else {
                                                        composer2.startReplaceGroup(158664803);
                                                        composer2.startReplaceGroup(1849434622);
                                                        Object objRememberedValue3 = composer2.rememberedValue();
                                                        Composer.Companion companion3 = Composer.INSTANCE;
                                                        if (objRememberedValue3 == companion3.getEmpty()) {
                                                            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$15$2$$ExternalSyntheticLambda7
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Object invoke() {
                                                                    return Boolean.valueOf(AccountSelectorComposableKt.C2642715.AnonymousClass2.invoke$lambda$19$lambda$9$lambda$8());
                                                                }
                                                            };
                                                            composer2.updateRememberedValue(objRememberedValue3);
                                                        }
                                                        Function0 function0 = (Function0) objRememberedValue3;
                                                        composer2.endReplaceGroup();
                                                        composer2.startReplaceGroup(5004770);
                                                        boolean zChanged3 = composer2.changed(snapshotState44);
                                                        Object objRememberedValue4 = composer2.rememberedValue();
                                                        if (zChanged3 || objRememberedValue4 == companion3.getEmpty()) {
                                                            objRememberedValue4 = new Function0() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$15$2$$ExternalSyntheticLambda8
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Object invoke() {
                                                                    return Boolean.valueOf(AccountSelectorComposableKt.access$AccountSelectorComposable$lambda$79(snapshotState44));
                                                                }
                                                            };
                                                            composer2.updateRememberedValue(objRememberedValue4);
                                                        }
                                                        Function0 function02 = (Function0) objRememberedValue4;
                                                        composer2.endReplaceGroup();
                                                        composer2.startReplaceGroup(-1224400529);
                                                        boolean zChanged4 = composer2.changed(snapshotState45) | composer2.changedInstance(animatable2) | composer2.changedInstance(coroutineScope4);
                                                        Object objRememberedValue5 = composer2.rememberedValue();
                                                        if (zChanged4 || objRememberedValue5 == companion3.getEmpty()) {
                                                            accountTabDuxo2 = accountTabDuxo3;
                                                            Function1 function1 = new Function1() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$15$2$$ExternalSyntheticLambda9
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final Object invoke(Object obj) {
                                                                    return AccountSelectorComposableKt.C2642715.AnonymousClass2.invoke$lambda$19$lambda$13$lambda$12(animatable2, coroutineScope4, snapshotState14, snapshotState45, snapshotState11, snapshotFloatState22, snapshotState12, ((Float) obj).floatValue());
                                                                }
                                                            };
                                                            coroutineScope = coroutineScope4;
                                                            snapshotState = snapshotState12;
                                                            composer2.updateRememberedValue(function1);
                                                            objRememberedValue5 = function1;
                                                        } else {
                                                            coroutineScope = coroutineScope4;
                                                            snapshotState = snapshotState12;
                                                            accountTabDuxo2 = accountTabDuxo3;
                                                        }
                                                        Function1 function12 = (Function1) objRememberedValue5;
                                                        composer2.endReplaceGroup();
                                                        composer2.startReplaceGroup(-1224400529);
                                                        boolean zChangedInstance = composer2.changedInstance(coroutineScope) | composer2.changedInstance(animatable2) | composer2.changedInstance(accountTabDuxo2);
                                                        Object objRememberedValue6 = composer2.rememberedValue();
                                                        if (zChangedInstance || objRememberedValue6 == companion3.getEmpty()) {
                                                            final AccountTabDuxo accountTabDuxo4 = accountTabDuxo2;
                                                            final CoroutineScope coroutineScope5 = coroutineScope;
                                                            Function0 function03 = new Function0() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$15$2$$ExternalSyntheticLambda10
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Object invoke() {
                                                                    return AccountSelectorComposableKt.C2642715.AnonymousClass2.invoke$lambda$19$lambda$15$lambda$14(coroutineScope5, snapshotState14, snapshotState11, animatable2, accountTabDuxo4, snapshotState);
                                                                }
                                                            };
                                                            snapshotState14 = snapshotState14;
                                                            accountTabDuxo = accountTabDuxo4;
                                                            composer2.updateRememberedValue(function03);
                                                            objRememberedValue6 = function03;
                                                        } else {
                                                            accountTabDuxo = accountTabDuxo2;
                                                        }
                                                        Function0 function04 = (Function0) objRememberedValue6;
                                                        composer2.endReplaceGroup();
                                                        composer2.startReplaceGroup(5004770);
                                                        Object objRememberedValue7 = composer2.rememberedValue();
                                                        if (objRememberedValue7 == companion3.getEmpty()) {
                                                            objRememberedValue7 = new Function1() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$15$2$$ExternalSyntheticLambda1
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final Object invoke(Object obj) {
                                                                    return AccountSelectorComposableKt.C2642715.AnonymousClass2.invoke$lambda$19$lambda$17$lambda$16(snapshotState13, ((Boolean) obj).booleanValue());
                                                                }
                                                            };
                                                            composer2.updateRememberedValue(objRememberedValue7);
                                                        }
                                                        composer2.endReplaceGroup();
                                                        fragmentManager = fragmentManager2;
                                                        GlobalPageGestureRecognizer.GlobalPageGestureRecognizer(function0, function02, null, function12, function04, (Function1) objRememberedValue7, ComposableLambda3.rememberComposableLambda(1489705540, true, new AccountSelectorComposableKt$AccountSelectorComposable$15$2$2$6(pagerState2, immutableList, z, accountSelectorTabNestedScrollConnection2, fragmentManager2, snapshotState14), composer2, 54), composer2, 1769478, 4);
                                                        composer2 = composer2;
                                                        composer2.endReplaceGroup();
                                                    }
                                                    Boolean boolValueOf = Boolean.valueOf(AccountSelectorComposableKt.AccountSelectorComposable$lambda$47(snapshotState15));
                                                    composer2.startReplaceGroup(-1224400529);
                                                    boolean zChangedInstance2 = composer2.changedInstance(fragmentManager) | composer2.changed(snapshotState46) | composer2.changedInstance(accountTabDuxo);
                                                    Object objRememberedValue8 = composer2.rememberedValue();
                                                    if (zChangedInstance2 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue8 = new AccountSelectorComposableKt$AccountSelectorComposable$15$2$2$7$1(fragmentManager, snapshotState15, snapshotState16, snapshotState17, snapshotState46, accountTabDuxo, snapshotState9, null);
                                                        composer2.updateRememberedValue(objRememberedValue8);
                                                    }
                                                    composer2.endReplaceGroup();
                                                    EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue8, composer2, 0);
                                                    composer2.endNode();
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                                                    invoke(paddingValues, composer, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                /* JADX INFO: Access modifiers changed from: private */
                                                public static final Unit invoke$lambda$6$lambda$3(SnapshotState snapshotState, boolean z) {
                                                    AccountSelectorComposableKt.AccountSelectorComposable$lambda$13(snapshotState, z);
                                                    return Unit.INSTANCE;
                                                }

                                                /* JADX INFO: Access modifiers changed from: private */
                                                public static final Unit invoke$lambda$6$lambda$4(SnapshotState snapshotState, AccountSelectorExpansionState state) {
                                                    Intrinsics.checkNotNullParameter(state, "state");
                                                    AccountSelectorComposableKt.AccountSelectorComposable$lambda$10(snapshotState, state);
                                                    return Unit.INSTANCE;
                                                }

                                                /* JADX INFO: Access modifiers changed from: private */
                                                public static final Unit invoke$lambda$6$lambda$5(SnapshotState snapshotState, boolean z) {
                                                    AccountSelectorComposableKt.AccountSelectorComposable$lambda$16(snapshotState, z);
                                                    return Unit.INSTANCE;
                                                }

                                                /* JADX INFO: Access modifiers changed from: private */
                                                public static final Unit invoke$lambda$19$lambda$13$lambda$12(Animatable animatable, CoroutineScope coroutineScope, SnapshotState snapshotState, SnapshotState4 snapshotState4, SnapshotState snapshotState2, SnapshotFloatState2 snapshotFloatState2, SnapshotState snapshotState3, float f) {
                                                    AccountSelectorComposableKt.AccountSelectorComposable$handleGlobalVerticalScroll(animatable, coroutineScope, snapshotState, snapshotState4, snapshotState2, snapshotFloatState2, snapshotState3, f);
                                                    return Unit.INSTANCE;
                                                }

                                                /* JADX INFO: Access modifiers changed from: private */
                                                public static final Unit invoke$lambda$19$lambda$15$lambda$14(CoroutineScope coroutineScope, SnapshotState snapshotState, SnapshotState snapshotState2, Animatable animatable, AccountTabDuxo accountTabDuxo, SnapshotState snapshotState3) {
                                                    AccountSelectorComposableKt.AccountSelectorComposable$handleGlobalGestureEnd(coroutineScope, snapshotState, snapshotState2, animatable, accountTabDuxo, snapshotState3);
                                                    return Unit.INSTANCE;
                                                }

                                                /* JADX INFO: Access modifiers changed from: private */
                                                public static final Unit invoke$lambda$19$lambda$17$lambda$16(SnapshotState snapshotState, boolean z) {
                                                    AccountSelectorComposableKt.AccountSelectorComposable$lambda$57(snapshotState, z);
                                                    return Unit.INSTANCE;
                                                }
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer9, Integer num3) {
                                                invoke(composer9, num3.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer9, int i25) {
                                                if ((i25 & 3) == 2 && composer9.getSkipping()) {
                                                    composer9.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1308901886, i25, -1, "com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposable.<anonymous> (AccountSelectorComposable.kt:750)");
                                                }
                                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier6, 0.0f, 1, null);
                                                final ImmutableList<AccountTabInfo.Account> immutableList8 = immutableList7;
                                                final SnapshotState<Boolean> snapshotState55 = snapshotState24;
                                                final Animatable<Float, AnimationVectors2> animatable5 = animatable3;
                                                final PagerState pagerState8 = pagerState4;
                                                final CoroutineScope coroutineScope6 = coroutineScope4;
                                                final AccountTabDuxo accountTabDuxo8 = accountTabDuxo7;
                                                final Function2<Integer, AccountTabInfo, Unit> function2 = onTabReselected;
                                                final Navigator navigator2 = navigator;
                                                final Context context7 = context6;
                                                final LazyListState lazyListState5 = lazyListState4;
                                                final SnapshotState4<AccountSelectorViewState> snapshotState412 = snapshotState410;
                                                final SnapshotState<Boolean> snapshotState56 = snapshotState51;
                                                final SnapshotState<AccountTabInfo> snapshotState57 = snapshotState54;
                                                final ImmutableMap<String, Integer> immutableMap3 = immutableMap2;
                                                final SnapshotState<AccountSelectorExpansionState> snapshotState58 = snapshotState22;
                                                final SnapshotState<Boolean> snapshotState59 = snapshotState50;
                                                final SnapshotState<Map<Integer, Integer>> snapshotState60 = snapshotState19;
                                                final SnapshotIntState2 snapshotIntState23 = snapshotIntState2;
                                                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1458421058, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt.AccountSelectorComposable.15.1
                                                    public final void invoke(Composer composer10, int i26) {
                                                        if ((i26 & 3) == 2 && composer10.getSkipping()) {
                                                            composer10.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1458421058, i26, -1, "com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposable.<anonymous>.<anonymous> (AccountSelectorComposable.kt:753)");
                                                        }
                                                        if (!immutableList8.isEmpty()) {
                                                            Modifier modifierSystemGestureExclusion = SystemGestureExclusionKt.systemGestureExclusion(WindowInsetsPadding_androidKt.statusBarsPadding(Modifier.INSTANCE));
                                                            SnapshotState<Boolean> snapshotState61 = snapshotState55;
                                                            Animatable<Float, AnimationVectors2> animatable6 = animatable5;
                                                            PagerState pagerState9 = pagerState8;
                                                            ImmutableList<AccountTabInfo.Account> immutableList9 = immutableList8;
                                                            CoroutineScope coroutineScope7 = coroutineScope6;
                                                            AccountTabDuxo accountTabDuxo9 = accountTabDuxo8;
                                                            Function2<Integer, AccountTabInfo, Unit> function22 = function2;
                                                            Navigator navigator3 = navigator2;
                                                            Context context8 = context7;
                                                            LazyListState lazyListState6 = lazyListState5;
                                                            SnapshotState4<AccountSelectorViewState> snapshotState413 = snapshotState412;
                                                            SnapshotState<Boolean> snapshotState62 = snapshotState56;
                                                            SnapshotState<AccountTabInfo> snapshotState63 = snapshotState57;
                                                            ImmutableMap<String, Integer> immutableMap4 = immutableMap3;
                                                            SnapshotState<AccountSelectorExpansionState> snapshotState64 = snapshotState58;
                                                            SnapshotState<Boolean> snapshotState65 = snapshotState59;
                                                            SnapshotState<Map<Integer, Integer>> snapshotState66 = snapshotState60;
                                                            SnapshotIntState2 snapshotIntState24 = snapshotIntState23;
                                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer10, 0);
                                                            CompositionLocalMap currentCompositionLocalMap = composer10.getCurrentCompositionLocalMap();
                                                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer10, modifierSystemGestureExclusion);
                                                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                                            if (composer10.getApplier() == null) {
                                                                Composables.invalidApplier();
                                                            }
                                                            composer10.startReusableNode();
                                                            if (composer10.getInserting()) {
                                                                composer10.createNode(constructor);
                                                            } else {
                                                                composer10.useNode();
                                                            }
                                                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer10);
                                                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                            }
                                                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                            Boolean boolValueOf7 = Boolean.valueOf(BentoTheme.INSTANCE.getColors(composer10, BentoTheme.$stable).getIsDay() && !AccountSelectorComposableKt.AccountSelectorComposable$lambda$32(snapshotState61));
                                                            Boolean bool3 = Boolean.FALSE;
                                                            BentoTheme2.BentoTheme(boolValueOf7, null, bool3, bool3, null, null, null, null, ComposableLambda3.rememberComposableLambda(1448713285, true, new AccountSelectorComposableKt$AccountSelectorComposable$15$1$1$1(animatable6, pagerState9, immutableList9, coroutineScope7, accountTabDuxo9, function22, navigator3, context8, lazyListState6, snapshotState413, snapshotState62, snapshotState63, immutableMap4, snapshotState64, snapshotState65, snapshotState66, snapshotIntState24), composer10, 54), composer10, 100666752, EnumC7081g.f2778x3356acf6);
                                                            composer10.endNode();
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer10, Integer num3) {
                                                        invoke(composer10, num3.intValue());
                                                        return Unit.INSTANCE;
                                                    }
                                                }, composer9, 54);
                                                composer9.startReplaceGroup(570837533);
                                                WindowInsets contentWindowInsets = immutableList7.isEmpty() ? ScaffoldDefaults.INSTANCE.getContentWindowInsets(composer9, ScaffoldDefaults.$stable) : WindowInsetsKt.WindowInsets(0, 0, 0, 0);
                                                composer9.endReplaceGroup();
                                                ScaffoldKt.m5939ScaffoldTvnljyQ(modifierFillMaxSize$default, composableLambdaRememberComposableLambda, null, null, null, 0, 0L, 0L, contentWindowInsets, ComposableLambda3.rememberComposableLambda(811899923, true, new AnonymousClass2(animatable3, coroutineScope4, snapshotState47, snapshotState48, lazyListState4, pagerState4, snapshotFloatState24, snapshotState46, snapshotState50, snapshotState22, snapshotState25, snapshotState15, snapshotState52, snapshotState16, fragmentManager, snapshotState411, accountTabDuxo7, snapshotState410, snapshotState53, snapshotState7, immutableList7, z3, snapshotState51, snapshotState54), composer9, 54), composer9, 805306416, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer8, 54), composer8, 48);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        modifier5 = modifier6;
                                        composer7 = composer8;
                                        accountTabDuxo4 = accountTabDuxo7;
                                        z9 = z3;
                                        function110 = function18;
                                        function111 = function115;
                                    } else {
                                        snapshotState44 = snapshotState49;
                                    }
                                    z8 = true;
                                    zChanged11 = z8 | zChanged13 | composer5.changed(pagerState3);
                                    objRememberedValue36 = composer5.rememberedValue();
                                    if (zChanged11) {
                                        composer6 = composer5;
                                        i21 = i20;
                                        AccountTabDuxo accountTabDuxo62 = accountTabDuxo3;
                                        SnapshotState snapshotState402 = snapshotState12;
                                        AccountSelectorComposableKt$AccountSelectorComposable$13$1 accountSelectorComposableKt$AccountSelectorComposable$13$12 = new AccountSelectorComposableKt$AccountSelectorComposable$13$1(snapshotState42, snapshotState402, eventLogger4, accountTabDuxo62, pagerState3, null);
                                        context4 = context3;
                                        snapshotState45 = snapshotState42;
                                        snapshotState22 = snapshotState402;
                                        accountTabDuxo3 = accountTabDuxo62;
                                        pagerState4 = pagerState3;
                                        composer6.updateRememberedValue(accountSelectorComposableKt$AccountSelectorComposable$13$12);
                                        objRememberedValue36 = accountSelectorComposableKt$AccountSelectorComposable$13$12;
                                        composer6.endReplaceGroup();
                                        EffectsKt.LaunchedEffect(accountSelectorExpansionStateAccountSelectorComposable$lambda$9, newUserExperienceStage2, (Function2) objRememberedValue36, composer6, 0);
                                        Boolean boolValueOf52 = Boolean.valueOf(AccountSelectorComposable$lambda$12(snapshotState28));
                                        AccountSelectorScrollable accountSelectorScrollableAccountSelectorComposable$lambda$2932 = AccountSelectorComposable$lambda$29(snapshotState13);
                                        if (accountSelectorScrollableAccountSelectorComposable$lambda$2932 == null) {
                                        }
                                        composer6.startReplaceGroup(-1224400529);
                                        animatable3 = animatable2;
                                        if (i21 <= 131072) {
                                            zChangedInstance5 = ((i21 <= 131072 && composer6.changedInstance(accountTabDuxo3)) || (i19 & 196608) == 131072) | composer6.changedInstance(animatable3);
                                            objRememberedValue37 = composer6.rememberedValue();
                                            if (zChangedInstance5) {
                                                SnapshotState snapshotState412 = snapshotState22;
                                                snapshotState23 = snapshotState28;
                                                AccountSelectorComposableKt$AccountSelectorComposable$14$1 accountSelectorComposableKt$AccountSelectorComposable$14$12 = new AccountSelectorComposableKt$AccountSelectorComposable$14$1(animatable3, accountTabDuxo3, snapshotState23, snapshotState13, snapshotState412, snapshotState29, null);
                                                snapshotState24 = snapshotState14;
                                                snapshotState25 = snapshotState29;
                                                snapshotState22 = snapshotState412;
                                                composer6.updateRememberedValue(accountSelectorComposableKt$AccountSelectorComposable$14$12);
                                                objRememberedValue37 = accountSelectorComposableKt$AccountSelectorComposable$14$12;
                                                composer6.endReplaceGroup();
                                                EffectsKt.LaunchedEffect(boolValueOf52, boolValueOf6, (Function2) objRememberedValue37, composer6, 0);
                                                Composer composer82 = composer6;
                                                final ImmutableMap<String, Integer> immutableMap22 = immutableMap;
                                                final AccountTabDuxo accountTabDuxo72 = accountTabDuxo3;
                                                final SnapshotState<Boolean> snapshotState502 = snapshotState23;
                                                final SnapshotFloatState2 snapshotFloatState242 = snapshotFloatState22;
                                                final SnapshotState<Boolean> snapshotState512 = snapshotState18;
                                                final SnapshotState<Boolean> snapshotState522 = snapshotState17;
                                                final SnapshotState<Boolean> snapshotState532 = snapshotState10;
                                                final SnapshotState<AccountTabInfo> snapshotState542 = snapshotState11;
                                                final Modifier modifier62 = modifier4;
                                                final SnapshotState4<AccountSelectorViewState> snapshotState4102 = snapshotState45;
                                                final Context context62 = context4;
                                                final SnapshotState4<Boolean> snapshotState4112 = snapshotState44;
                                                final LazyListState lazyListState42 = lazyListState3;
                                                final ImmutableList<AccountTabInfo.Account> immutableList72 = immutableList4;
                                                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, AccountTabAnalytics.INSTANCE.getScreen(), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-1308901886, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt.AccountSelectorComposable.15

                                                    /* compiled from: AccountSelectorComposable.kt */
                                                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                                    @SourceDebugExtension
                                                    /* renamed from: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$15$2, reason: invalid class name */
                                                    static final class AnonymousClass2 implements Function3<PaddingValues, Composer, Integer, Unit> {
                                                        final /* synthetic */ AccountTabDuxo $accountTabDuxo;
                                                        final /* synthetic */ ImmutableList<AccountTabInfo.Account> $accountTabInfo;
                                                        final /* synthetic */ LazyListState $accountTabRowListState;
                                                        final /* synthetic */ SnapshotState<Boolean> $allowHorizontalPaging$delegate;
                                                        final /* synthetic */ CoroutineScope $coroutineScope;
                                                        final /* synthetic */ SnapshotState4<Boolean> $currentTabNeedsGlobalGestureDetection$delegate;
                                                        final /* synthetic */ FragmentManager $fragmentManager;
                                                        final /* synthetic */ boolean $innerScrollActive;
                                                        final /* synthetic */ SnapshotState4<Boolean> $isAtTop$delegate;
                                                        final /* synthetic */ SnapshotState<Boolean> $isGestureActive$delegate;
                                                        final /* synthetic */ SnapshotState<Boolean> $isGlobalScrollingActive$delegate;
                                                        final /* synthetic */ SnapshotState<Boolean> $isProgrammaticallyScrollingTabRow$delegate;
                                                        final /* synthetic */ SnapshotState4<Boolean> $isVerticalScrollingActive$delegate;
                                                        final /* synthetic */ SnapshotState<AccountTabInfo> $lastSelectedTabInfoBeforeReorder$delegate;
                                                        final /* synthetic */ SnapshotState<Boolean> $needsFragmentReset$delegate;
                                                        final /* synthetic */ PagerState $pagerState;
                                                        final /* synthetic */ SnapshotFloatState2 $scrollThreshold$delegate;
                                                        final /* synthetic */ SnapshotState<AccountTabInfo> $selectedTabInfo$delegate;
                                                        final /* synthetic */ SnapshotState4<Boolean> $shouldRealignTabRow$delegate;
                                                        final /* synthetic */ SnapshotState<Boolean> $showReorderBottomSheet$delegate;
                                                        final /* synthetic */ Animatable<Float, AnimationVectors2> $tabExpansionProgress;
                                                        final /* synthetic */ SnapshotState<Job> $tabRowScrollDebounceJob$delegate;
                                                        final /* synthetic */ SnapshotState<AccountSelectorExpansionState> $uiExpansionState$delegate;
                                                        final /* synthetic */ SnapshotState4<AccountSelectorViewState> $viewState$delegate;

                                                        AnonymousClass2(Animatable<Float, AnimationVectors2> animatable, CoroutineScope coroutineScope, SnapshotState4<Boolean> snapshotState4, SnapshotState4<Boolean> snapshotState42, LazyListState lazyListState, PagerState pagerState, SnapshotFloatState2 snapshotFloatState2, SnapshotState4<Boolean> snapshotState43, SnapshotState<Boolean> snapshotState, SnapshotState<AccountSelectorExpansionState> snapshotState2, SnapshotState<Boolean> snapshotState3, SnapshotState<Job> snapshotState5, SnapshotState<Boolean> snapshotState6, SnapshotState<AccountTabInfo> snapshotState7, FragmentManager fragmentManager, SnapshotState4<Boolean> snapshotState44, AccountTabDuxo accountTabDuxo, SnapshotState4<AccountSelectorViewState> snapshotState45, SnapshotState<Boolean> snapshotState8, SnapshotState<Boolean> snapshotState9, ImmutableList<AccountTabInfo.Account> immutableList, boolean z, SnapshotState<Boolean> snapshotState10, SnapshotState<AccountTabInfo> snapshotState11) {
                                                            this.$tabExpansionProgress = animatable;
                                                            this.$coroutineScope = coroutineScope;
                                                            this.$isVerticalScrollingActive$delegate = snapshotState4;
                                                            this.$shouldRealignTabRow$delegate = snapshotState42;
                                                            this.$accountTabRowListState = lazyListState;
                                                            this.$pagerState = pagerState;
                                                            this.$scrollThreshold$delegate = snapshotFloatState2;
                                                            this.$isAtTop$delegate = snapshotState43;
                                                            this.$isGestureActive$delegate = snapshotState;
                                                            this.$uiExpansionState$delegate = snapshotState2;
                                                            this.$allowHorizontalPaging$delegate = snapshotState3;
                                                            this.$tabRowScrollDebounceJob$delegate = snapshotState5;
                                                            this.$isProgrammaticallyScrollingTabRow$delegate = snapshotState6;
                                                            this.$selectedTabInfo$delegate = snapshotState7;
                                                            this.$fragmentManager = fragmentManager;
                                                            this.$currentTabNeedsGlobalGestureDetection$delegate = snapshotState44;
                                                            this.$accountTabDuxo = accountTabDuxo;
                                                            this.$viewState$delegate = snapshotState45;
                                                            this.$needsFragmentReset$delegate = snapshotState8;
                                                            this.$isGlobalScrollingActive$delegate = snapshotState9;
                                                            this.$accountTabInfo = immutableList;
                                                            this.$innerScrollActive = z;
                                                            this.$showReorderBottomSheet$delegate = snapshotState10;
                                                            this.$lastSelectedTabInfoBeforeReorder$delegate = snapshotState11;
                                                        }

                                                        /* JADX INFO: Access modifiers changed from: private */
                                                        public static final boolean invoke$lambda$19$lambda$9$lambda$8() {
                                                            return false;
                                                        }

                                                        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                                                            int i2;
                                                            FragmentManager fragmentManager;
                                                            AccountTabDuxo accountTabDuxo;
                                                            AccountTabDuxo accountTabDuxo2;
                                                            CoroutineScope coroutineScope;
                                                            final SnapshotState snapshotState;
                                                            PaddingValues paddingValues2 = paddingValues;
                                                            Composer composer2 = composer;
                                                            Intrinsics.checkNotNullParameter(paddingValues2, "paddingValues");
                                                            if ((i & 6) == 0) {
                                                                i2 = i | (composer2.changed(paddingValues2) ? 4 : 2);
                                                            } else {
                                                                i2 = i;
                                                            }
                                                            if ((i2 & 19) == 18 && composer2.getSkipping()) {
                                                                composer2.skipToGroupEnd();
                                                                return;
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(811899923, i2, -1, "com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposable.<anonymous>.<anonymous> (AccountSelectorComposable.kt:831)");
                                                            }
                                                            float fAccountSelectorComposable$lambda$18 = AccountSelectorComposableKt.AccountSelectorComposable$lambda$18(this.$scrollThreshold$delegate);
                                                            composer2.startReplaceGroup(-1746271574);
                                                            boolean zChanged = composer2.changed(fAccountSelectorComposable$lambda$18) | composer2.changed(this.$tabExpansionProgress) | composer2.changed(this.$coroutineScope);
                                                            Animatable<Float, AnimationVectors2> animatable = this.$tabExpansionProgress;
                                                            CoroutineScope coroutineScope2 = this.$coroutineScope;
                                                            final SnapshotFloatState2 snapshotFloatState2 = this.$scrollThreshold$delegate;
                                                            final SnapshotState4 snapshotState4 = this.$isAtTop$delegate;
                                                            final SnapshotState snapshotState2 = this.$isGestureActive$delegate;
                                                            final SnapshotState snapshotState3 = this.$uiExpansionState$delegate;
                                                            final SnapshotState snapshotState5 = this.$allowHorizontalPaging$delegate;
                                                            Object objRememberedValue = composer2.rememberedValue();
                                                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                                AccountSelectorTabNestedScrollConnection accountSelectorTabNestedScrollConnection = new AccountSelectorTabNestedScrollConnection(animatable, new Function0() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$15$2$$ExternalSyntheticLambda0
                                                                    @Override // kotlin.jvm.functions.Function0
                                                                    public final Object invoke() {
                                                                        return Float.valueOf(AccountSelectorComposableKt.access$AccountSelectorComposable$lambda$18(snapshotFloatState2));
                                                                    }
                                                                }, coroutineScope2, new Function0() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$15$2$$ExternalSyntheticLambda2
                                                                    @Override // kotlin.jvm.functions.Function0
                                                                    public final Object invoke() {
                                                                        return Boolean.valueOf(AccountSelectorComposableKt.access$AccountSelectorComposable$lambda$39(snapshotState4));
                                                                    }
                                                                }, new Function0() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$15$2$$ExternalSyntheticLambda3
                                                                    @Override // kotlin.jvm.functions.Function0
                                                                    public final Object invoke() {
                                                                        return Boolean.valueOf(AccountSelectorComposableKt.access$AccountSelectorComposable$lambda$12(snapshotState2));
                                                                    }
                                                                }, new Function1() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$15$2$$ExternalSyntheticLambda4
                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public final Object invoke(Object obj) {
                                                                        return AccountSelectorComposableKt.C2642715.AnonymousClass2.invoke$lambda$6$lambda$3(snapshotState2, ((Boolean) obj).booleanValue());
                                                                    }
                                                                }, new Function1() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$15$2$$ExternalSyntheticLambda5
                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public final Object invoke(Object obj) {
                                                                        return AccountSelectorComposableKt.C2642715.AnonymousClass2.invoke$lambda$6$lambda$4(snapshotState3, (AccountSelectorExpansionState) obj);
                                                                    }
                                                                }, new Function1() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$15$2$$ExternalSyntheticLambda6
                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public final Object invoke(Object obj) {
                                                                        return AccountSelectorComposableKt.C2642715.AnonymousClass2.invoke$lambda$6$lambda$5(snapshotState5, ((Boolean) obj).booleanValue());
                                                                    }
                                                                }, C26429xc3a6121b.INSTANCE);
                                                                composer2.updateRememberedValue(accountSelectorTabNestedScrollConnection);
                                                                objRememberedValue = accountSelectorTabNestedScrollConnection;
                                                            }
                                                            AccountSelectorTabNestedScrollConnection accountSelectorTabNestedScrollConnection2 = (AccountSelectorTabNestedScrollConnection) objRememberedValue;
                                                            composer2.endReplaceGroup();
                                                            Object[] objArr = {Boolean.valueOf(AccountSelectorComposableKt.AccountSelectorComposable$lambda$63(this.$shouldRealignTabRow$delegate)), AccountSelectorComposableKt.AccountSelectorComposable$lambda$9(this.$uiExpansionState$delegate), Boolean.valueOf(AccountSelectorComposableKt.AccountSelectorComposable$lambda$60(this.$isVerticalScrollingActive$delegate)), this.$tabExpansionProgress};
                                                            composer2.startReplaceGroup(-1224400529);
                                                            boolean zChanged2 = composer2.changed(this.$isVerticalScrollingActive$delegate) | composer2.changed(this.$shouldRealignTabRow$delegate) | composer2.changedInstance(this.$coroutineScope) | composer2.changed(this.$accountTabRowListState) | composer2.changed(this.$pagerState);
                                                            PagerState pagerState = this.$pagerState;
                                                            SnapshotState4<Boolean> snapshotState42 = this.$isVerticalScrollingActive$delegate;
                                                            SnapshotState<AccountSelectorExpansionState> snapshotState6 = this.$uiExpansionState$delegate;
                                                            SnapshotState4<Boolean> snapshotState43 = this.$shouldRealignTabRow$delegate;
                                                            CoroutineScope coroutineScope3 = this.$coroutineScope;
                                                            SnapshotState<Job> snapshotState7 = this.$tabRowScrollDebounceJob$delegate;
                                                            SnapshotState<Boolean> snapshotState8 = this.$isProgrammaticallyScrollingTabRow$delegate;
                                                            LazyListState lazyListState = this.$accountTabRowListState;
                                                            Object objRememberedValue2 = composer2.rememberedValue();
                                                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                                AccountSelectorComposableKt$AccountSelectorComposable$15$2$1$1 accountSelectorComposableKt$AccountSelectorComposable$15$2$1$1 = new AccountSelectorComposableKt$AccountSelectorComposable$15$2$1$1(pagerState, snapshotState42, snapshotState6, snapshotState43, coroutineScope3, snapshotState7, snapshotState8, lazyListState, null);
                                                                composer2.updateRememberedValue(accountSelectorComposableKt$AccountSelectorComposable$15$2$1$1);
                                                                objRememberedValue2 = accountSelectorComposableKt$AccountSelectorComposable$15$2$1$1;
                                                            }
                                                            composer2.endReplaceGroup();
                                                            EffectsKt.LaunchedEffect(objArr, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer2, 0);
                                                            Modifier.Companion companion = Modifier.INSTANCE;
                                                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                                                            AccountTabInfo accountTabInfoAccountSelectorComposable$lambda$26 = AccountSelectorComposableKt.AccountSelectorComposable$lambda$26(this.$selectedTabInfo$delegate);
                                                            if (accountTabInfoAccountSelectorComposable$lambda$26 != null && accountTabInfoAccountSelectorComposable$lambda$26.getLayoutUnderTabInfo()) {
                                                                paddingValues2 = PaddingKt.m5135PaddingValues0680j_4(C2002Dp.m7995constructorimpl(0));
                                                            }
                                                            Modifier modifierPadding = PaddingKt.padding(modifierFillMaxSize$default, paddingValues2);
                                                            FragmentManager fragmentManager2 = this.$fragmentManager;
                                                            final SnapshotState4 snapshotState44 = this.$currentTabNeedsGlobalGestureDetection$delegate;
                                                            final SnapshotState4 snapshotState45 = this.$isAtTop$delegate;
                                                            final Animatable animatable2 = this.$tabExpansionProgress;
                                                            final CoroutineScope coroutineScope4 = this.$coroutineScope;
                                                            AccountTabDuxo accountTabDuxo3 = this.$accountTabDuxo;
                                                            SnapshotState4<AccountSelectorViewState> snapshotState46 = this.$viewState$delegate;
                                                            SnapshotState<Boolean> snapshotState9 = this.$needsFragmentReset$delegate;
                                                            SnapshotState<Boolean> snapshotState10 = this.$allowHorizontalPaging$delegate;
                                                            final SnapshotState snapshotState11 = this.$isGestureActive$delegate;
                                                            final SnapshotFloatState2 snapshotFloatState22 = this.$scrollThreshold$delegate;
                                                            final SnapshotState snapshotState12 = this.$uiExpansionState$delegate;
                                                            final SnapshotState snapshotState13 = this.$isGlobalScrollingActive$delegate;
                                                            final SnapshotState snapshotState14 = snapshotState10;
                                                            PagerState pagerState2 = this.$pagerState;
                                                            ImmutableList<AccountTabInfo.Account> immutableList = this.$accountTabInfo;
                                                            boolean z = this.$innerScrollActive;
                                                            SnapshotState<Boolean> snapshotState15 = this.$showReorderBottomSheet$delegate;
                                                            SnapshotState<AccountTabInfo> snapshotState16 = this.$selectedTabInfo$delegate;
                                                            SnapshotState<AccountTabInfo> snapshotState17 = this.$lastSelectedTabInfoBeforeReorder$delegate;
                                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierPadding);
                                                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                                                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                            }
                                                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                            if (AccountSelectorComposableKt.AccountSelectorComposable$lambda$0(snapshotState46).getAccountsLoading() || AccountSelectorComposableKt.AccountSelectorComposable$lambda$50(snapshotState9)) {
                                                                fragmentManager = fragmentManager2;
                                                                accountTabDuxo = accountTabDuxo3;
                                                                composer2.startReplaceGroup(157479425);
                                                                LoadingScreenComposablesKt.ShimmerLoadingComposable(new ShimmerLoaderType.Generic(false), null, composer2, ShimmerLoaderType.Generic.$stable, 2);
                                                                composer2.endReplaceGroup();
                                                            } else if (AccountSelectorComposableKt.AccountSelectorComposable$lambda$0(snapshotState46).getNuxTab() != null) {
                                                                composer2.startReplaceGroup(157718745);
                                                                AccountTabInfo.Nux nuxTab = AccountSelectorComposableKt.AccountSelectorComposable$lambda$0(snapshotState46).getNuxTab();
                                                                if (nuxTab == null) {
                                                                    throw new IllegalStateException("Required value was null.");
                                                                }
                                                                AccountSelectorFragmentPage.AccountTabFragmentPage(nuxTab, true, fragmentManager2, accountSelectorTabNestedScrollConnection2, ModifiersKt.autoLogEvents$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(null, "selector_individual_upsell", null, 5, null), null, 47, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), composer2, AccountTabInfo.Nux.$stable | 48, 0);
                                                                composer2.endReplaceGroup();
                                                                fragmentManager = fragmentManager2;
                                                                accountTabDuxo = accountTabDuxo3;
                                                            } else {
                                                                composer2.startReplaceGroup(158664803);
                                                                composer2.startReplaceGroup(1849434622);
                                                                Object objRememberedValue3 = composer2.rememberedValue();
                                                                Composer.Companion companion3 = Composer.INSTANCE;
                                                                if (objRememberedValue3 == companion3.getEmpty()) {
                                                                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$15$2$$ExternalSyntheticLambda7
                                                                        @Override // kotlin.jvm.functions.Function0
                                                                        public final Object invoke() {
                                                                            return Boolean.valueOf(AccountSelectorComposableKt.C2642715.AnonymousClass2.invoke$lambda$19$lambda$9$lambda$8());
                                                                        }
                                                                    };
                                                                    composer2.updateRememberedValue(objRememberedValue3);
                                                                }
                                                                Function0 function0 = (Function0) objRememberedValue3;
                                                                composer2.endReplaceGroup();
                                                                composer2.startReplaceGroup(5004770);
                                                                boolean zChanged3 = composer2.changed(snapshotState44);
                                                                Object objRememberedValue4 = composer2.rememberedValue();
                                                                if (zChanged3 || objRememberedValue4 == companion3.getEmpty()) {
                                                                    objRememberedValue4 = new Function0() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$15$2$$ExternalSyntheticLambda8
                                                                        @Override // kotlin.jvm.functions.Function0
                                                                        public final Object invoke() {
                                                                            return Boolean.valueOf(AccountSelectorComposableKt.access$AccountSelectorComposable$lambda$79(snapshotState44));
                                                                        }
                                                                    };
                                                                    composer2.updateRememberedValue(objRememberedValue4);
                                                                }
                                                                Function0 function02 = (Function0) objRememberedValue4;
                                                                composer2.endReplaceGroup();
                                                                composer2.startReplaceGroup(-1224400529);
                                                                boolean zChanged4 = composer2.changed(snapshotState45) | composer2.changedInstance(animatable2) | composer2.changedInstance(coroutineScope4);
                                                                Object objRememberedValue5 = composer2.rememberedValue();
                                                                if (zChanged4 || objRememberedValue5 == companion3.getEmpty()) {
                                                                    accountTabDuxo2 = accountTabDuxo3;
                                                                    Function1 function1 = new Function1() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$15$2$$ExternalSyntheticLambda9
                                                                        @Override // kotlin.jvm.functions.Function1
                                                                        public final Object invoke(Object obj) {
                                                                            return AccountSelectorComposableKt.C2642715.AnonymousClass2.invoke$lambda$19$lambda$13$lambda$12(animatable2, coroutineScope4, snapshotState14, snapshotState45, snapshotState11, snapshotFloatState22, snapshotState12, ((Float) obj).floatValue());
                                                                        }
                                                                    };
                                                                    coroutineScope = coroutineScope4;
                                                                    snapshotState = snapshotState12;
                                                                    composer2.updateRememberedValue(function1);
                                                                    objRememberedValue5 = function1;
                                                                } else {
                                                                    coroutineScope = coroutineScope4;
                                                                    snapshotState = snapshotState12;
                                                                    accountTabDuxo2 = accountTabDuxo3;
                                                                }
                                                                Function1 function12 = (Function1) objRememberedValue5;
                                                                composer2.endReplaceGroup();
                                                                composer2.startReplaceGroup(-1224400529);
                                                                boolean zChangedInstance = composer2.changedInstance(coroutineScope) | composer2.changedInstance(animatable2) | composer2.changedInstance(accountTabDuxo2);
                                                                Object objRememberedValue6 = composer2.rememberedValue();
                                                                if (zChangedInstance || objRememberedValue6 == companion3.getEmpty()) {
                                                                    final AccountTabDuxo accountTabDuxo4 = accountTabDuxo2;
                                                                    final CoroutineScope coroutineScope5 = coroutineScope;
                                                                    Function0 function03 = new Function0() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$15$2$$ExternalSyntheticLambda10
                                                                        @Override // kotlin.jvm.functions.Function0
                                                                        public final Object invoke() {
                                                                            return AccountSelectorComposableKt.C2642715.AnonymousClass2.invoke$lambda$19$lambda$15$lambda$14(coroutineScope5, snapshotState14, snapshotState11, animatable2, accountTabDuxo4, snapshotState);
                                                                        }
                                                                    };
                                                                    snapshotState14 = snapshotState14;
                                                                    accountTabDuxo = accountTabDuxo4;
                                                                    composer2.updateRememberedValue(function03);
                                                                    objRememberedValue6 = function03;
                                                                } else {
                                                                    accountTabDuxo = accountTabDuxo2;
                                                                }
                                                                Function0 function04 = (Function0) objRememberedValue6;
                                                                composer2.endReplaceGroup();
                                                                composer2.startReplaceGroup(5004770);
                                                                Object objRememberedValue7 = composer2.rememberedValue();
                                                                if (objRememberedValue7 == companion3.getEmpty()) {
                                                                    objRememberedValue7 = new Function1() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$15$2$$ExternalSyntheticLambda1
                                                                        @Override // kotlin.jvm.functions.Function1
                                                                        public final Object invoke(Object obj) {
                                                                            return AccountSelectorComposableKt.C2642715.AnonymousClass2.invoke$lambda$19$lambda$17$lambda$16(snapshotState13, ((Boolean) obj).booleanValue());
                                                                        }
                                                                    };
                                                                    composer2.updateRememberedValue(objRememberedValue7);
                                                                }
                                                                composer2.endReplaceGroup();
                                                                fragmentManager = fragmentManager2;
                                                                GlobalPageGestureRecognizer.GlobalPageGestureRecognizer(function0, function02, null, function12, function04, (Function1) objRememberedValue7, ComposableLambda3.rememberComposableLambda(1489705540, true, new AccountSelectorComposableKt$AccountSelectorComposable$15$2$2$6(pagerState2, immutableList, z, accountSelectorTabNestedScrollConnection2, fragmentManager2, snapshotState14), composer2, 54), composer2, 1769478, 4);
                                                                composer2 = composer2;
                                                                composer2.endReplaceGroup();
                                                            }
                                                            Boolean boolValueOf = Boolean.valueOf(AccountSelectorComposableKt.AccountSelectorComposable$lambda$47(snapshotState15));
                                                            composer2.startReplaceGroup(-1224400529);
                                                            boolean zChangedInstance2 = composer2.changedInstance(fragmentManager) | composer2.changed(snapshotState46) | composer2.changedInstance(accountTabDuxo);
                                                            Object objRememberedValue8 = composer2.rememberedValue();
                                                            if (zChangedInstance2 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                                                objRememberedValue8 = new AccountSelectorComposableKt$AccountSelectorComposable$15$2$2$7$1(fragmentManager, snapshotState15, snapshotState16, snapshotState17, snapshotState46, accountTabDuxo, snapshotState9, null);
                                                                composer2.updateRememberedValue(objRememberedValue8);
                                                            }
                                                            composer2.endReplaceGroup();
                                                            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue8, composer2, 0);
                                                            composer2.endNode();
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                        }

                                                        @Override // kotlin.jvm.functions.Function3
                                                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                                                            invoke(paddingValues, composer, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        /* JADX INFO: Access modifiers changed from: private */
                                                        public static final Unit invoke$lambda$6$lambda$3(SnapshotState snapshotState, boolean z) {
                                                            AccountSelectorComposableKt.AccountSelectorComposable$lambda$13(snapshotState, z);
                                                            return Unit.INSTANCE;
                                                        }

                                                        /* JADX INFO: Access modifiers changed from: private */
                                                        public static final Unit invoke$lambda$6$lambda$4(SnapshotState snapshotState, AccountSelectorExpansionState state) {
                                                            Intrinsics.checkNotNullParameter(state, "state");
                                                            AccountSelectorComposableKt.AccountSelectorComposable$lambda$10(snapshotState, state);
                                                            return Unit.INSTANCE;
                                                        }

                                                        /* JADX INFO: Access modifiers changed from: private */
                                                        public static final Unit invoke$lambda$6$lambda$5(SnapshotState snapshotState, boolean z) {
                                                            AccountSelectorComposableKt.AccountSelectorComposable$lambda$16(snapshotState, z);
                                                            return Unit.INSTANCE;
                                                        }

                                                        /* JADX INFO: Access modifiers changed from: private */
                                                        public static final Unit invoke$lambda$19$lambda$13$lambda$12(Animatable animatable, CoroutineScope coroutineScope, SnapshotState snapshotState, SnapshotState4 snapshotState4, SnapshotState snapshotState2, SnapshotFloatState2 snapshotFloatState2, SnapshotState snapshotState3, float f) {
                                                            AccountSelectorComposableKt.AccountSelectorComposable$handleGlobalVerticalScroll(animatable, coroutineScope, snapshotState, snapshotState4, snapshotState2, snapshotFloatState2, snapshotState3, f);
                                                            return Unit.INSTANCE;
                                                        }

                                                        /* JADX INFO: Access modifiers changed from: private */
                                                        public static final Unit invoke$lambda$19$lambda$15$lambda$14(CoroutineScope coroutineScope, SnapshotState snapshotState, SnapshotState snapshotState2, Animatable animatable, AccountTabDuxo accountTabDuxo, SnapshotState snapshotState3) {
                                                            AccountSelectorComposableKt.AccountSelectorComposable$handleGlobalGestureEnd(coroutineScope, snapshotState, snapshotState2, animatable, accountTabDuxo, snapshotState3);
                                                            return Unit.INSTANCE;
                                                        }

                                                        /* JADX INFO: Access modifiers changed from: private */
                                                        public static final Unit invoke$lambda$19$lambda$17$lambda$16(SnapshotState snapshotState, boolean z) {
                                                            AccountSelectorComposableKt.AccountSelectorComposable$lambda$57(snapshotState, z);
                                                            return Unit.INSTANCE;
                                                        }
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer9, Integer num3) {
                                                        invoke(composer9, num3.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Composer composer9, int i25) {
                                                        if ((i25 & 3) == 2 && composer9.getSkipping()) {
                                                            composer9.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1308901886, i25, -1, "com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposable.<anonymous> (AccountSelectorComposable.kt:750)");
                                                        }
                                                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier62, 0.0f, 1, null);
                                                        final ImmutableList<AccountTabInfo.Account> immutableList8 = immutableList72;
                                                        final SnapshotState<Boolean> snapshotState55 = snapshotState24;
                                                        final Animatable<Float, AnimationVectors2> animatable5 = animatable3;
                                                        final PagerState pagerState8 = pagerState4;
                                                        final CoroutineScope coroutineScope6 = coroutineScope4;
                                                        final AccountTabDuxo accountTabDuxo8 = accountTabDuxo72;
                                                        final Function2<? super Integer, ? super AccountTabInfo, Unit> function2 = onTabReselected;
                                                        final Navigator navigator2 = navigator;
                                                        final Context context7 = context62;
                                                        final LazyListState lazyListState5 = lazyListState42;
                                                        final SnapshotState4<AccountSelectorViewState> snapshotState4122 = snapshotState4102;
                                                        final SnapshotState<Boolean> snapshotState56 = snapshotState512;
                                                        final SnapshotState<AccountTabInfo> snapshotState57 = snapshotState542;
                                                        final ImmutableMap<String, Integer> immutableMap3 = immutableMap22;
                                                        final SnapshotState<AccountSelectorExpansionState> snapshotState58 = snapshotState22;
                                                        final SnapshotState<Boolean> snapshotState59 = snapshotState502;
                                                        final SnapshotState<Map<Integer, Integer>> snapshotState60 = snapshotState19;
                                                        final SnapshotIntState2 snapshotIntState23 = snapshotIntState2;
                                                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1458421058, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt.AccountSelectorComposable.15.1
                                                            public final void invoke(Composer composer10, int i26) {
                                                                if ((i26 & 3) == 2 && composer10.getSkipping()) {
                                                                    composer10.skipToGroupEnd();
                                                                    return;
                                                                }
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(-1458421058, i26, -1, "com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposable.<anonymous>.<anonymous> (AccountSelectorComposable.kt:753)");
                                                                }
                                                                if (!immutableList8.isEmpty()) {
                                                                    Modifier modifierSystemGestureExclusion = SystemGestureExclusionKt.systemGestureExclusion(WindowInsetsPadding_androidKt.statusBarsPadding(Modifier.INSTANCE));
                                                                    SnapshotState<Boolean> snapshotState61 = snapshotState55;
                                                                    Animatable<Float, AnimationVectors2> animatable6 = animatable5;
                                                                    PagerState pagerState9 = pagerState8;
                                                                    ImmutableList<AccountTabInfo.Account> immutableList9 = immutableList8;
                                                                    CoroutineScope coroutineScope7 = coroutineScope6;
                                                                    AccountTabDuxo accountTabDuxo9 = accountTabDuxo8;
                                                                    Function2<Integer, AccountTabInfo, Unit> function22 = function2;
                                                                    Navigator navigator3 = navigator2;
                                                                    Context context8 = context7;
                                                                    LazyListState lazyListState6 = lazyListState5;
                                                                    SnapshotState4<AccountSelectorViewState> snapshotState413 = snapshotState4122;
                                                                    SnapshotState<Boolean> snapshotState62 = snapshotState56;
                                                                    SnapshotState<AccountTabInfo> snapshotState63 = snapshotState57;
                                                                    ImmutableMap<String, Integer> immutableMap4 = immutableMap3;
                                                                    SnapshotState<AccountSelectorExpansionState> snapshotState64 = snapshotState58;
                                                                    SnapshotState<Boolean> snapshotState65 = snapshotState59;
                                                                    SnapshotState<Map<Integer, Integer>> snapshotState66 = snapshotState60;
                                                                    SnapshotIntState2 snapshotIntState24 = snapshotIntState23;
                                                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer10, 0);
                                                                    CompositionLocalMap currentCompositionLocalMap = composer10.getCurrentCompositionLocalMap();
                                                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer10, modifierSystemGestureExclusion);
                                                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                                                    if (composer10.getApplier() == null) {
                                                                        Composables.invalidApplier();
                                                                    }
                                                                    composer10.startReusableNode();
                                                                    if (composer10.getInserting()) {
                                                                        composer10.createNode(constructor);
                                                                    } else {
                                                                        composer10.useNode();
                                                                    }
                                                                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer10);
                                                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                                    }
                                                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                                    Boolean boolValueOf7 = Boolean.valueOf(BentoTheme.INSTANCE.getColors(composer10, BentoTheme.$stable).getIsDay() && !AccountSelectorComposableKt.AccountSelectorComposable$lambda$32(snapshotState61));
                                                                    Boolean bool3 = Boolean.FALSE;
                                                                    BentoTheme2.BentoTheme(boolValueOf7, null, bool3, bool3, null, null, null, null, ComposableLambda3.rememberComposableLambda(1448713285, true, new AccountSelectorComposableKt$AccountSelectorComposable$15$1$1$1(animatable6, pagerState9, immutableList9, coroutineScope7, accountTabDuxo9, function22, navigator3, context8, lazyListState6, snapshotState413, snapshotState62, snapshotState63, immutableMap4, snapshotState64, snapshotState65, snapshotState66, snapshotIntState24), composer10, 54), composer10, 100666752, EnumC7081g.f2778x3356acf6);
                                                                    composer10.endNode();
                                                                }
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                }
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer10, Integer num3) {
                                                                invoke(composer10, num3.intValue());
                                                                return Unit.INSTANCE;
                                                            }
                                                        }, composer9, 54);
                                                        composer9.startReplaceGroup(570837533);
                                                        WindowInsets contentWindowInsets = immutableList72.isEmpty() ? ScaffoldDefaults.INSTANCE.getContentWindowInsets(composer9, ScaffoldDefaults.$stable) : WindowInsetsKt.WindowInsets(0, 0, 0, 0);
                                                        composer9.endReplaceGroup();
                                                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifierFillMaxSize$default, composableLambdaRememberComposableLambda, null, null, null, 0, 0L, 0L, contentWindowInsets, ComposableLambda3.rememberComposableLambda(811899923, true, new AnonymousClass2(animatable3, coroutineScope4, snapshotState47, snapshotState48, lazyListState42, pagerState4, snapshotFloatState242, snapshotState46, snapshotState502, snapshotState22, snapshotState25, snapshotState15, snapshotState522, snapshotState16, fragmentManager, snapshotState4112, accountTabDuxo72, snapshotState4102, snapshotState532, snapshotState7, immutableList72, z3, snapshotState512, snapshotState542), composer9, 54), composer9, 805306416, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }, composer82, 54), composer82, 48);
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                modifier5 = modifier62;
                                                composer7 = composer82;
                                                accountTabDuxo4 = accountTabDuxo72;
                                                z9 = z3;
                                                function110 = function18;
                                                function111 = function115;
                                            }
                                        } else {
                                            zChangedInstance5 = ((i21 <= 131072 && composer6.changedInstance(accountTabDuxo3)) || (i19 & 196608) == 131072) | composer6.changedInstance(animatable3);
                                            objRememberedValue37 = composer6.rememberedValue();
                                            if (zChangedInstance5) {
                                            }
                                        }
                                    }
                                } else {
                                    snapshotState21 = snapshotState20;
                                }
                                z6 = true;
                                z7 = z6 | zChanged12;
                                objRememberedValue35 = composer5.rememberedValue();
                                if (z7) {
                                    objRememberedValue35 = new AccountSelectorComposableKt$AccountSelectorComposable$12$1(snapshotState21, snapshotState42, lazyListState3, accountTabDuxo3, null);
                                    composer5.updateRememberedValue(objRememberedValue35);
                                    composer5.endReplaceGroup();
                                    EffectsKt.LaunchedEffect(lazyListState3, newUserExperienceStage, (Function2) objRememberedValue35, composer5, 0);
                                    AccountSelectorExpansionState accountSelectorExpansionStateAccountSelectorComposable$lambda$92 = AccountSelectorComposable$lambda$9(snapshotState12);
                                    NewUserExperienceStage newUserExperienceStage22 = AccountSelectorComposable$lambda$0(snapshotState42).getNewUserExperienceStage();
                                    composer5.startReplaceGroup(-1224400529);
                                    boolean zChanged132 = composer5.changed(snapshotState42) | composer5.changedInstance(eventLogger4);
                                    if (i20 > 131072) {
                                        snapshotState44 = snapshotState49;
                                        if ((i19 & 196608) != 131072) {
                                            z8 = true;
                                        }
                                        zChanged11 = z8 | zChanged132 | composer5.changed(pagerState3);
                                        objRememberedValue36 = composer5.rememberedValue();
                                        if (zChanged11) {
                                        }
                                    }
                                }
                            } else {
                                animatable = animatable4;
                            }
                            snapshotState7 = snapshotState5;
                            i13 = i24;
                            lazyListState = lazyListStateRememberLazyListState;
                            snapshotFloatState22 = snapshotFloatState2;
                            animatable2 = animatable;
                            function17 = function113;
                            i14 = i8;
                            eventLogger = current2;
                            context = context5;
                            coroutineScope2 = coroutineScope;
                            continuation = null;
                            SnapshotState snapshotState55 = snapshotState2;
                            bool = boolValueOf3;
                            snapshotState8 = snapshotState27;
                            SnapshotState snapshotState56 = snapshotState3;
                            bool2 = boolValueOf2;
                            i15 = 0;
                            accountSelectorComposableKt$AccountSelectorComposable$5$1 = new AccountSelectorComposableKt$AccountSelectorComposable$5$1(allTabs, fragmentManager2, snapshotState55, snapshotState37, snapshotState56, tabInfoIndexMap, pagerStateRememberPagerState, null);
                            immutableList = allTabs;
                            fragmentManager2 = fragmentManager2;
                            snapshotState9 = snapshotState55;
                            snapshotState10 = snapshotState37;
                            snapshotState11 = snapshotState56;
                            pagerStateRememberPagerState = pagerStateRememberPagerState;
                            immutableMap = tabInfoIndexMap;
                            composer3.updateRememberedValue(accountSelectorComposableKt$AccountSelectorComposable$5$1);
                            composer3.endReplaceGroup();
                            EffectsKt.LaunchedEffect(bool2, bool, (Function2) accountSelectorComposableKt$AccountSelectorComposable$5$1, composer3, i15);
                            Integer numValueOf32 = Integer.valueOf(pagerStateRememberPagerState.getCurrentPage());
                            Integer numValueOf42 = Integer.valueOf(immutableList.size());
                            composer3.startReplaceGroup(-1224400529);
                            i16 = i14;
                            if ((i16 & 896) == 256) {
                                i17 = i13;
                                if (i17 <= 131072) {
                                    zChanged5 = composer3.changed(pagerStateRememberPagerState) | composer3.changedInstance(immutableList) | composer3.changed(z4) | ((i16 & 896) == 256 || ((i16 & 512) != 0 && composer3.changedInstance(scrollableStateCache))) | ((i17 <= 131072 && composer3.changedInstance(accountTabDuxo3)) || (i16 & 196608) == 131072) | ((3670016 & i16) == 1048576);
                                    Object objRememberedValue412 = composer3.rememberedValue();
                                    if (zChanged5) {
                                        i18 = i17;
                                        PagerState pagerState52 = pagerStateRememberPagerState;
                                        composer4 = composer3;
                                        AccountTabDuxo accountTabDuxo52 = accountTabDuxo3;
                                        snapshotState12 = snapshotState8;
                                        continuation2 = continuation;
                                        ImmutableList<AccountTabInfo.Account> immutableList52 = immutableList;
                                        accountSelectorComposableKt$AccountSelectorComposable$6$1 = new AccountSelectorComposableKt$AccountSelectorComposable$6$1(pagerState52, immutableList52, z4, scrollableStateCache, accountTabDuxo52, function114, snapshotState31, snapshotState6, snapshotState32, null);
                                        pagerState = pagerState52;
                                        immutableList2 = immutableList52;
                                        accountTabDuxo3 = accountTabDuxo52;
                                        function18 = function114;
                                        snapshotState13 = snapshotState6;
                                        snapshotState14 = snapshotState32;
                                        modifier4 = modifier3;
                                        snapshotState15 = snapshotState34;
                                        snapshotState16 = snapshotState31;
                                        composer4.updateRememberedValue(accountSelectorComposableKt$AccountSelectorComposable$6$1);
                                        composer4.endReplaceGroup();
                                        EffectsKt.LaunchedEffect(numValueOf32, scrollableStateCache, numValueOf42, (Function2) accountSelectorComposableKt$AccountSelectorComposable$6$1, composer4, (AccountSelectorScrollable.$stable << 3) | ((i16 >> 3) & 112));
                                        Boolean boolValueOf42 = Boolean.valueOf(z4);
                                        composer4.startReplaceGroup(-1224400529);
                                        lazyListState2 = lazyListState;
                                        eventLogger2 = eventLogger;
                                        zChanged6 = composer4.changed(pagerState) | composer4.changed(lazyListState2) | composer4.changed(z4) | composer4.changedInstance(eventLogger2);
                                        objRememberedValue27 = composer4.rememberedValue();
                                        if (zChanged6) {
                                            eventLogger3 = eventLogger2;
                                            AccountSelectorComposableKt$AccountSelectorComposable$7$1 accountSelectorComposableKt$AccountSelectorComposable$7$12 = new AccountSelectorComposableKt$AccountSelectorComposable$7$1(pagerState, lazyListState2, z4, snapshotState35, eventLogger3, null);
                                            snapshotState17 = snapshotState35;
                                            composer4.updateRememberedValue(accountSelectorComposableKt$AccountSelectorComposable$7$12);
                                            objRememberedValue27 = accountSelectorComposableKt$AccountSelectorComposable$7$12;
                                            composer4.endReplaceGroup();
                                            composer5 = composer4;
                                            EffectsKt.LaunchedEffect(pagerState, lazyListState2, boolValueOf42, (Function2) objRememberedValue27, composer5, 0);
                                            composer5.startReplaceGroup(-1746271574);
                                            coroutineScope3 = coroutineScope2;
                                            zChangedInstance4 = ((29360128 & i16) != 8388608) | composer5.changedInstance(coroutineScope3) | composer5.changed(pagerState);
                                            objRememberedValue28 = composer5.rememberedValue();
                                            if (zChangedInstance4) {
                                                function19 = function17;
                                                objRememberedValue28 = new AccountSelectorComposableKt$AccountSelectorComposable$8$1(function19, coroutineScope3, pagerState, continuation2);
                                                composer5.updateRememberedValue(objRememberedValue28);
                                                composer5.endReplaceGroup();
                                                EffectsKt.LaunchedEffect(coroutineScope3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue28, composer5, 0);
                                                numValueOf = Integer.valueOf(pagerState.getCurrentPage());
                                                numValueOf2 = Integer.valueOf(immutableList2.size());
                                                composer5.startReplaceGroup(-1224400529);
                                                context2 = context;
                                                zChanged7 = composer5.changed(pagerState) | composer5.changedInstance(immutableList2) | composer5.changed(z4) | composer5.changedInstance(fragmentManager2) | composer5.changedInstance(context2);
                                                Function1<? super Function1<? super Integer, Unit>, Unit> function1152 = function19;
                                                objRememberedValue29 = composer5.rememberedValue();
                                                if (zChanged7) {
                                                    i19 = i16;
                                                    FragmentManager fragmentManager32 = fragmentManager2;
                                                    pagerState2 = pagerState;
                                                    num = numValueOf2;
                                                    context3 = context2;
                                                    snapshotState18 = snapshotState9;
                                                    boolean z112 = z4;
                                                    r8 = 0;
                                                    num2 = numValueOf;
                                                    immutableList3 = immutableList2;
                                                    i20 = i18;
                                                    objRememberedValue29 = new AccountSelectorComposableKt$AccountSelectorComposable$9$1(pagerState2, immutableList3, z112, fragmentManager32, context3, null);
                                                    composer5.updateRememberedValue(objRememberedValue29);
                                                    composer5.endReplaceGroup();
                                                    EffectsKt.LaunchedEffect(num2, num, (Function2) objRememberedValue29, composer5, r8);
                                                    AccountTabTarget deeplinkTarget2 = AccountSelectorComposable$lambda$0(snapshotState4).getDeeplinkTarget();
                                                    composer5.startReplaceGroup(-1224400529);
                                                    snapshotState42 = snapshotState4;
                                                    if (i20 > 131072) {
                                                        zChanged8 = composer5.changed(snapshotState42) | composer5.changed(immutableMap) | composer5.changed(pagerState2) | (((i20 > 131072 || !composer5.changedInstance(accountTabDuxo3)) && (i19 & 196608) != 131072) ? r8 : true);
                                                        objRememberedValue30 = composer5.rememberedValue();
                                                        if (zChanged8) {
                                                            PagerState pagerState62 = pagerState2;
                                                            objRememberedValue30 = new AccountSelectorComposableKt$AccountSelectorComposable$10$1(snapshotState42, pagerState62, accountTabDuxo3, immutableMap, null);
                                                            pagerState3 = pagerState62;
                                                            composer5.updateRememberedValue(objRememberedValue30);
                                                            composer5.endReplaceGroup();
                                                            EffectsKt.LaunchedEffect(deeplinkTarget2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue30, composer5, AccountTabTarget.$stable);
                                                            composer5.startReplaceGroup(5004770);
                                                            zChanged9 = composer5.changed(immutableList3);
                                                            objRememberedValue31 = composer5.rememberedValue();
                                                            if (!zChanged9) {
                                                                objRememberedValue31 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$$ExternalSyntheticLambda6
                                                                    @Override // kotlin.jvm.functions.Function0
                                                                    public final Object invoke() {
                                                                        return Boolean.valueOf(AccountSelectorComposableKt.AccountSelectorComposable$lambda$78$lambda$77(immutableList3, pagerState3));
                                                                    }
                                                                });
                                                                composer5.updateRememberedValue(objRememberedValue31);
                                                                SnapshotState4 snapshotState492 = (SnapshotState4) objRememberedValue31;
                                                                composer5.endReplaceGroup();
                                                                composer5.startReplaceGroup(1849434622);
                                                                objRememberedValue32 = composer5.rememberedValue();
                                                                if (objRememberedValue32 != companion.getEmpty()) {
                                                                }
                                                                snapshotState43 = (SnapshotState4) objRememberedValue32;
                                                                composer5.endReplaceGroup();
                                                                AccountSelectorTabRowScrollInfo accountSelectorTabRowScrollInfoAccountSelectorComposable$lambda$842 = AccountSelectorComposable$lambda$84(snapshotState43);
                                                                composer5.startReplaceGroup(-1224400529);
                                                                zChanged10 = composer5.changed(lazyListState3) | composer5.changed(pagerState3);
                                                                objRememberedValue33 = composer5.rememberedValue();
                                                                if (!zChanged10) {
                                                                    objRememberedValue33 = new AccountSelectorComposableKt$AccountSelectorComposable$11$1(snapshotState43, lazyListState3, pagerState3, snapshotState17, null);
                                                                    composer5.updateRememberedValue(objRememberedValue33);
                                                                    composer5.endReplaceGroup();
                                                                    EffectsKt.LaunchedEffect(accountSelectorTabRowScrollInfoAccountSelectorComposable$lambda$842, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue33, composer5, 0);
                                                                    composer5.startReplaceGroup(1849434622);
                                                                    objRememberedValue34 = composer5.rememberedValue();
                                                                    if (objRememberedValue34 != companion.getEmpty()) {
                                                                    }
                                                                    snapshotState20 = (SnapshotState) objRememberedValue34;
                                                                    composer5.endReplaceGroup();
                                                                    NewUserExperienceStage newUserExperienceStage3 = AccountSelectorComposable$lambda$0(snapshotState42).getNewUserExperienceStage();
                                                                    composer5.startReplaceGroup(-1224400529);
                                                                    boolean zChanged122 = composer5.changed(snapshotState42) | composer5.changed(lazyListState3);
                                                                    if (i20 > 131072) {
                                                                        snapshotState21 = snapshotState20;
                                                                        if ((i19 & 196608) != 131072) {
                                                                            z6 = true;
                                                                        }
                                                                        z7 = z6 | zChanged122;
                                                                        objRememberedValue35 = composer5.rememberedValue();
                                                                        if (z7) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        zChanged8 = composer5.changed(snapshotState42) | composer5.changed(immutableMap) | composer5.changed(pagerState2) | (((i20 > 131072 || !composer5.changedInstance(accountTabDuxo3)) && (i19 & 196608) != 131072) ? r8 : true);
                                                        objRememberedValue30 = composer5.rememberedValue();
                                                        if (zChanged8) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    zChanged5 = composer3.changed(pagerStateRememberPagerState) | composer3.changedInstance(immutableList) | composer3.changed(z4) | ((i16 & 896) == 256 || ((i16 & 512) != 0 && composer3.changedInstance(scrollableStateCache))) | ((i17 <= 131072 && composer3.changedInstance(accountTabDuxo3)) || (i16 & 196608) == 131072) | ((3670016 & i16) == 1048576);
                                    Object objRememberedValue4122 = composer3.rememberedValue();
                                    if (zChanged5) {
                                    }
                                }
                            }
                        } else {
                            snapshotFloatState2 = snapshotFloatState23;
                        }
                        snapshotState6 = snapshotState;
                        objRememberedValue39 = new AccountSelectorComposableKt$AccountSelectorComposable$2$1(accountsLoading, tabInfoIndexMap, pagerStateRememberPagerState, allTabs, snapshotState30, snapshotState33, null);
                        z4 = accountsLoading;
                        composer3.updateRememberedValue(objRememberedValue39);
                        composer3.endReplaceGroup();
                        EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue39, composer3, 0);
                        Unit unit2 = Unit.INSTANCE;
                        composer3.startReplaceGroup(-1633490746);
                        int i242 = (i8 & 458752) ^ 196608;
                        if (i242 > 131072) {
                            objRememberedValue25 = composer3.rememberedValue();
                            if (z5) {
                                objRememberedValue25 = new Function1() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        return AccountSelectorComposableKt.AccountSelectorComposable$lambda$69$lambda$68(accountTabDuxo3, snapshotState27, (DisposableEffectScope) obj2);
                                    }
                                };
                                composer3.updateRememberedValue(objRememberedValue25);
                                composer3.endReplaceGroup();
                                EffectsKt.DisposableEffect(unit2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue25, composer3, 6);
                                composer3.startReplaceGroup(-1633490746);
                                zChangedInstance2 = composer3.changedInstance(animatable4);
                                objRememberedValue26 = composer3.rememberedValue();
                                if (!zChangedInstance2) {
                                    objRememberedValue26 = new AccountSelectorComposableKt$AccountSelectorComposable$4$1(animatable4, snapshotState27, null);
                                    composer3.updateRememberedValue(objRememberedValue26);
                                    composer3.endReplaceGroup();
                                    EffectsKt.LaunchedEffect(animatable4, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue26, composer3, Animatable.$stable);
                                    Boolean boolValueOf22 = Boolean.valueOf(AccountSelectorComposable$lambda$47(snapshotState2));
                                    Boolean boolValueOf32 = Boolean.valueOf(AccountSelectorComposable$lambda$50(snapshotState37));
                                    composer3.startReplaceGroup(-1224400529);
                                    zChangedInstance3 = composer3.changedInstance(allTabs) | composer3.changedInstance(fragmentManager2) | composer3.changed(tabInfoIndexMap) | composer3.changed(pagerStateRememberPagerState);
                                    Object objRememberedValue402 = composer3.rememberedValue();
                                    if (zChangedInstance3) {
                                    }
                                    snapshotState7 = snapshotState5;
                                    i13 = i242;
                                    lazyListState = lazyListStateRememberLazyListState;
                                    snapshotFloatState22 = snapshotFloatState2;
                                    animatable2 = animatable;
                                    function17 = function113;
                                    i14 = i8;
                                    eventLogger = current2;
                                    context = context5;
                                    coroutineScope2 = coroutineScope;
                                    continuation = null;
                                    SnapshotState snapshotState552 = snapshotState2;
                                    bool = boolValueOf32;
                                    snapshotState8 = snapshotState27;
                                    SnapshotState snapshotState562 = snapshotState3;
                                    bool2 = boolValueOf22;
                                    i15 = 0;
                                    accountSelectorComposableKt$AccountSelectorComposable$5$1 = new AccountSelectorComposableKt$AccountSelectorComposable$5$1(allTabs, fragmentManager2, snapshotState552, snapshotState37, snapshotState562, tabInfoIndexMap, pagerStateRememberPagerState, null);
                                    immutableList = allTabs;
                                    fragmentManager2 = fragmentManager2;
                                    snapshotState9 = snapshotState552;
                                    snapshotState10 = snapshotState37;
                                    snapshotState11 = snapshotState562;
                                    pagerStateRememberPagerState = pagerStateRememberPagerState;
                                    immutableMap = tabInfoIndexMap;
                                    composer3.updateRememberedValue(accountSelectorComposableKt$AccountSelectorComposable$5$1);
                                    composer3.endReplaceGroup();
                                    EffectsKt.LaunchedEffect(bool2, bool, (Function2) accountSelectorComposableKt$AccountSelectorComposable$5$1, composer3, i15);
                                    Integer numValueOf322 = Integer.valueOf(pagerStateRememberPagerState.getCurrentPage());
                                    Integer numValueOf422 = Integer.valueOf(immutableList.size());
                                    composer3.startReplaceGroup(-1224400529);
                                    i16 = i14;
                                }
                            }
                        } else {
                            objRememberedValue25 = composer3.rememberedValue();
                            if (z5) {
                            }
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer7 = composerStartRestartGroup;
                        modifier5 = modifier2;
                        z9 = z2;
                        function111 = function14;
                        function110 = function13;
                        accountTabDuxo4 = accountTabDuxo;
                    }
                    scopeUpdateScopeEndRestartGroup = composer7.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                return AccountSelectorComposableKt.AccountSelectorComposable$lambda$92(fragmentManager, onTabReselected, scrollableStateCache, modifier5, z9, accountTabDuxo4, function110, function111, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 1572864;
                function13 = function1;
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                if ((i3 & 4793491) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i23 != 0) {
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 32) == 0) {
                        }
                        if (i5 == 0) {
                        }
                        z3 = z10;
                        if (i6 == 0) {
                        }
                        composer2.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(accountTabDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer2, 0, 7);
                        boolean accountsLoading2 = AccountSelectorComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2).getAccountsLoading();
                        ImmutableMap<String, Integer> tabInfoIndexMap2 = AccountSelectorComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2).getTabInfoIndexMap();
                        allTabs = AccountSelectorComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2).getAllTabs();
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composer2, 0, 3);
                        final Navigator navigator2 = (Navigator) composer2.consume(LocalNavigator.getLocalNavigator());
                        Context context52 = (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        objRememberedValue = composer2.rememberedValue();
                        companion = Composer.INSTANCE;
                        Function1<? super Function1<? super Integer, Unit>, Unit> function1132 = function16;
                        if (objRememberedValue == companion.getEmpty()) {
                        }
                        CoroutineScope coroutineScope52 = (CoroutineScope) objRememberedValue;
                        final Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        i8 = i7;
                        EventLogger current22 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer2, AutoLoggingCompositionLocals4.$stable);
                        composer2.startReplaceGroup(1849434622);
                        objRememberedValue2 = composer2.rememberedValue();
                        if (objRememberedValue2 != companion.getEmpty()) {
                        }
                        final SnapshotState snapshotState262 = (SnapshotState) objRememberedValue2;
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(1849434622);
                        objRememberedValue3 = composer2.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                        }
                        final SnapshotIntState2 snapshotIntState222 = (SnapshotIntState2) objRememberedValue3;
                        composer2.endReplaceGroup();
                        boolean isCollapsed2 = accountTabDuxo3.getIsCollapsed();
                        if (!isCollapsed2) {
                        }
                        if (!isCollapsed2) {
                        }
                        composer2.startReplaceGroup(1849434622);
                        objRememberedValue4 = composer2.rememberedValue();
                        if (objRememberedValue4 != companion.getEmpty()) {
                        }
                        Animatable animatable42 = (Animatable) objAnimatable$default;
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(1849434622);
                        objRememberedValue5 = composer2.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                        }
                        final SnapshotState snapshotState272 = (SnapshotState) objRememberedValue5;
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(1849434622);
                        objRememberedValue6 = composer2.rememberedValue();
                        if (objRememberedValue6 == companion.getEmpty()) {
                        }
                        SnapshotState snapshotState282 = (SnapshotState) objRememberedValue6;
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(1849434622);
                        objRememberedValue7 = composer2.rememberedValue();
                        if (objRememberedValue7 == companion.getEmpty()) {
                        }
                        SnapshotState snapshotState292 = (SnapshotState) objRememberedValue7;
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(1849434622);
                        objRememberedValue8 = composer2.rememberedValue();
                        if (objRememberedValue8 == companion.getEmpty()) {
                        }
                        final SnapshotFloatState2 snapshotFloatState232 = (SnapshotFloatState2) objRememberedValue8;
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(5004770);
                        zChangedInstance = composer2.changedInstance(allTabs);
                        objRememberedValue9 = composer2.rememberedValue();
                        if (!zChangedInstance) {
                            objRememberedValue9 = new Function0() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Integer.valueOf(allTabs.size());
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue9);
                            composer2.endReplaceGroup();
                            composer3 = composer2;
                            pagerStateRememberPagerState = PagerStateKt.rememberPagerState(0, 0.0f, (Function0) objRememberedValue9, composer3, 0, 3);
                            composer3.startReplaceGroup(1849434622);
                            objRememberedValue10 = composer3.rememberedValue();
                            if (objRememberedValue10 != companion.getEmpty()) {
                            }
                            SnapshotState snapshotState302 = (SnapshotState) objRememberedValue10;
                            composer3.endReplaceGroup();
                            composer3.startReplaceGroup(1849434622);
                            objRememberedValue11 = composer3.rememberedValue();
                            Function1<? super String, Unit> function1142 = function15;
                            if (objRememberedValue11 == companion.getEmpty()) {
                            }
                            SnapshotState snapshotState312 = (SnapshotState) objRememberedValue11;
                            composer3.endReplaceGroup();
                            composer3.startReplaceGroup(1849434622);
                            objRememberedValue12 = composer3.rememberedValue();
                            if (objRememberedValue12 == companion.getEmpty()) {
                            }
                            snapshotState = (SnapshotState) objRememberedValue12;
                            composer3.endReplaceGroup();
                            composer3.startReplaceGroup(1849434622);
                            objRememberedValue13 = composer3.rememberedValue();
                            if (objRememberedValue13 != companion.getEmpty()) {
                            }
                            SnapshotState snapshotState322 = (SnapshotState) objRememberedValue13;
                            composer3.endReplaceGroup();
                            composer3.startReplaceGroup(1849434622);
                            objRememberedValue14 = composer3.rememberedValue();
                            if (objRememberedValue14 == companion.getEmpty()) {
                            }
                            SnapshotState snapshotState332 = (SnapshotState) objRememberedValue14;
                            composer3.endReplaceGroup();
                            AccountSelectorScrollable accountSelectorScrollableAccountSelectorComposable$lambda$294 = AccountSelectorComposable$lambda$29(snapshotState);
                            composer3.startReplaceGroup(5004770);
                            zChanged = composer3.changed(accountSelectorScrollableAccountSelectorComposable$lambda$294);
                            objRememberedValue15 = composer3.rememberedValue();
                            if (!zChanged) {
                                objRememberedValue15 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Boolean.valueOf(AccountSelectorComposableKt.AccountSelectorComposable$lambda$38$lambda$37(snapshotState));
                                    }
                                });
                                composer3.updateRememberedValue(objRememberedValue15);
                                final SnapshotState4<Boolean> snapshotState462 = (SnapshotState4) objRememberedValue15;
                                composer3.endReplaceGroup();
                                composer3.startReplaceGroup(1849434622);
                                objRememberedValue16 = composer3.rememberedValue();
                                if (objRememberedValue16 != companion.getEmpty()) {
                                }
                                SnapshotState snapshotState342 = (SnapshotState) objRememberedValue16;
                                composer3.endReplaceGroup();
                                composer3.startReplaceGroup(1849434622);
                                objRememberedValue17 = composer3.rememberedValue();
                                if (objRememberedValue17 != companion.getEmpty()) {
                                }
                                SnapshotState snapshotState352 = (SnapshotState) objRememberedValue17;
                                composer3.endReplaceGroup();
                                composer3.startReplaceGroup(1849434622);
                                objRememberedValue18 = composer3.rememberedValue();
                                if (objRememberedValue18 != companion.getEmpty()) {
                                }
                                SnapshotState snapshotState362 = (SnapshotState) objRememberedValue18;
                                composer3.endReplaceGroup();
                                composer3.startReplaceGroup(1849434622);
                                objRememberedValue19 = composer3.rememberedValue();
                                if (objRememberedValue19 != companion.getEmpty()) {
                                }
                                SnapshotState snapshotState372 = (SnapshotState) objRememberedValue19;
                                composer3.endReplaceGroup();
                                composer3.startReplaceGroup(1849434622);
                                objRememberedValue20 = composer3.rememberedValue();
                                if (objRememberedValue20 != companion.getEmpty()) {
                                }
                                SnapshotState snapshotState382 = (SnapshotState) objRememberedValue20;
                                composer3.endReplaceGroup();
                                composer3.startReplaceGroup(1849434622);
                                objRememberedValue21 = composer3.rememberedValue();
                                if (objRememberedValue21 != companion.getEmpty()) {
                                }
                                snapshotState5 = (SnapshotState) objRememberedValue21;
                                composer3.endReplaceGroup();
                                AccountSelectorScrollable accountSelectorScrollableAccountSelectorComposable$lambda$2922 = AccountSelectorComposable$lambda$29(snapshotState);
                                composer3.startReplaceGroup(5004770);
                                zChanged2 = composer3.changed(accountSelectorScrollableAccountSelectorComposable$lambda$2922);
                                objRememberedValue22 = composer3.rememberedValue();
                                if (!zChanged2) {
                                    objRememberedValue22 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Boolean.valueOf(AccountSelectorComposableKt.AccountSelectorComposable$lambda$59$lambda$58(snapshotState, snapshotState5));
                                        }
                                    });
                                    composer3.updateRememberedValue(objRememberedValue22);
                                    final SnapshotState4<Boolean> snapshotState472 = (SnapshotState4) objRememberedValue22;
                                    composer3.endReplaceGroup();
                                    composer3.startReplaceGroup(-1633490746);
                                    zChanged3 = composer3.changed(lazyListStateRememberLazyListState) | composer3.changed(pagerStateRememberPagerState);
                                    objRememberedValue23 = composer3.rememberedValue();
                                    if (!zChanged3) {
                                        objRememberedValue23 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$$ExternalSyntheticLambda3
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return Boolean.valueOf(AccountSelectorComposableKt.AccountSelectorComposable$lambda$62$lambda$61(lazyListStateRememberLazyListState, pagerStateRememberPagerState));
                                            }
                                        });
                                        composer3.updateRememberedValue(objRememberedValue23);
                                        final SnapshotState4<Boolean> snapshotState482 = (SnapshotState4) objRememberedValue23;
                                        composer3.endReplaceGroup();
                                        boolean hasPrivacy2 = AccountSelectorComposable$lambda$0(snapshotState4).getHasPrivacy();
                                        composer3.startReplaceGroup(5004770);
                                        objRememberedValue24 = composer3.rememberedValue();
                                        if (objRememberedValue24 == companion.getEmpty()) {
                                        }
                                        composer3.endReplaceGroup();
                                        AccountSelectorThresholdMeasure.AccountSelectorThresholdMeasure(allTabs, hasPrivacy2, (Function1) objRememberedValue24, null, composer3, AccountTabInfo.Account.$stable | 384, 8);
                                        Boolean boolValueOf7 = Boolean.valueOf(accountsLoading2);
                                        composer3.startReplaceGroup(-1224400529);
                                        zChanged4 = composer3.changed(accountsLoading2) | composer3.changed(tabInfoIndexMap2) | composer3.changed(pagerStateRememberPagerState) | composer3.changedInstance(allTabs);
                                        Object objRememberedValue392 = composer3.rememberedValue();
                                        if (zChanged4) {
                                        }
                                        snapshotState6 = snapshotState;
                                        objRememberedValue392 = new AccountSelectorComposableKt$AccountSelectorComposable$2$1(accountsLoading2, tabInfoIndexMap2, pagerStateRememberPagerState, allTabs, snapshotState302, snapshotState332, null);
                                        z4 = accountsLoading2;
                                        composer3.updateRememberedValue(objRememberedValue392);
                                        composer3.endReplaceGroup();
                                        EffectsKt.LaunchedEffect(boolValueOf7, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue392, composer3, 0);
                                        Unit unit22 = Unit.INSTANCE;
                                        composer3.startReplaceGroup(-1633490746);
                                        int i2422 = (i8 & 458752) ^ 196608;
                                        if (i2422 > 131072) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer7.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 196608) == 0) {
            }
            i5 = i2 & 64;
            if (i5 == 0) {
            }
            function13 = function1;
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            if ((i3 & 4793491) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composer7.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 196608) == 0) {
        }
        i5 = i2 & 64;
        if (i5 == 0) {
        }
        function13 = function1;
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        if ((i3 & 4793491) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer7.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AccountSelectorComposable$lambda$10(SnapshotState<AccountSelectorExpansionState> snapshotState, AccountSelectorExpansionState accountSelectorExpansionState) {
        snapshotState.setValue(accountSelectorExpansionState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AccountSelectorComposable$lambda$13(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AccountSelectorComposable$lambda$16(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float AccountSelectorComposable$calculateTabHeightProgress(float f, float f2, float f3) {
        return f3 <= 0.0f ? f : RangesKt.coerceIn((f * f3) - f2, 0.0f, f3) / f3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountSelectorExpansionState AccountSelectorComposable$determineSnapTarget(float f) {
        if (f > 0.3f) {
            return AccountSelectorExpansionState.Collapsed.INSTANCE;
        }
        return AccountSelectorExpansionState.Expanded.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object AccountSelectorComposable$performSnapToTarget(SnapshotState<AccountSelectorExpansionState> snapshotState, Animatable<Float, AnimationVectors2> animatable, AccountSelectorExpansionState accountSelectorExpansionState, Continuation<? super AccountSelectorExpansionState> continuation) {
        C26435x8aaa4557 c26435x8aaa4557;
        if (continuation instanceof C26435x8aaa4557) {
            c26435x8aaa4557 = (C26435x8aaa4557) continuation;
            int i = c26435x8aaa4557.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26435x8aaa4557.label = i - Integer.MIN_VALUE;
            } else {
                c26435x8aaa4557 = new C26435x8aaa4557(continuation);
            }
        }
        C26435x8aaa4557 c26435x8aaa45572 = c26435x8aaa4557;
        Object obj = c26435x8aaa45572.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c26435x8aaa45572.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AccountSelectorExpansionState accountSelectorExpansionState2 = (AccountSelectorExpansionState) c26435x8aaa45572.L$0;
            ResultKt.throwOnFailure(obj);
            return accountSelectorExpansionState2;
        }
        ResultKt.throwOnFailure(obj);
        AccountSelectorExpansionState accountSelectorExpansionStateAccountSelectorComposable$determineSnapTarget = AccountSelectorComposable$determineSnapTarget(animatable.getValue().floatValue());
        AccountSelectorExpansionState.Expanded expanded = AccountSelectorExpansionState.Expanded.INSTANCE;
        float f = 0.0f;
        if (!Intrinsics.areEqual(accountSelectorExpansionStateAccountSelectorComposable$determineSnapTarget, expanded)) {
            AccountSelectorExpansionState.Collapsed collapsed = AccountSelectorExpansionState.Collapsed.INSTANCE;
            if (!Intrinsics.areEqual(accountSelectorExpansionStateAccountSelectorComposable$determineSnapTarget, collapsed)) {
                if (!(accountSelectorExpansionStateAccountSelectorComposable$determineSnapTarget instanceof AccountSelectorExpansionState.Transitioning)) {
                    throw new NoWhenBranchMatchedException();
                }
                AccountSelectorExpansionState to = ((AccountSelectorExpansionState.Transitioning) accountSelectorExpansionStateAccountSelectorComposable$determineSnapTarget).getTo();
                if (!Intrinsics.areEqual(to, expanded)) {
                    if (Intrinsics.areEqual(to, collapsed)) {
                        f = 1.0f;
                    } else {
                        if (!(to instanceof AccountSelectorExpansionState.Transitioning)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f = 0.9f;
                    }
                }
            }
        }
        snapshotState.setValue(new AccountSelectorExpansionState.Transitioning(accountSelectorExpansionState, accountSelectorExpansionStateAccountSelectorComposable$determineSnapTarget));
        Float fBoxFloat = boxing.boxFloat(f);
        SpringSpec springSpecSpring$default = AnimationSpecKt.spring$default(0.75f, 200.0f, null, 4, null);
        c26435x8aaa45572.L$0 = accountSelectorExpansionStateAccountSelectorComposable$determineSnapTarget;
        c26435x8aaa45572.label = 1;
        return Animatable.animateTo$default(animatable, fBoxFloat, springSpecSpring$default, null, null, c26435x8aaa45572, 12, null) == coroutine_suspended ? coroutine_suspended : accountSelectorExpansionStateAccountSelectorComposable$determineSnapTarget;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AccountSelectorComposable$animateExpansionState(CoroutineScope coroutineScope, SnapshotState<AccountSelectorExpansionState> snapshotState, SnapshotState<Boolean> snapshotState2, Animatable<Float, AnimationVectors2> animatable, AccountTabDuxo accountTabDuxo, AccountSelectorExpansionState accountSelectorExpansionState) {
        if (Intrinsics.areEqual(AccountSelectorComposable$lambda$9(snapshotState), accountSelectorExpansionState) || AccountSelectorComposable$lambda$12(snapshotState2)) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C26432x9b05be13(accountSelectorExpansionState, animatable, accountTabDuxo, snapshotState, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountSelectorExpansionState AccountSelectorComposable$determineToggledTargetState(AccountSelectorExpansionState accountSelectorExpansionState) {
        AccountSelectorExpansionState.Expanded expanded = AccountSelectorExpansionState.Expanded.INSTANCE;
        if (Intrinsics.areEqual(accountSelectorExpansionState, expanded)) {
            return AccountSelectorExpansionState.Collapsed.INSTANCE;
        }
        AccountSelectorExpansionState.Collapsed collapsed = AccountSelectorExpansionState.Collapsed.INSTANCE;
        if (!Intrinsics.areEqual(accountSelectorExpansionState, collapsed)) {
            if (!(accountSelectorExpansionState instanceof AccountSelectorExpansionState.Transitioning)) {
                throw new NoWhenBranchMatchedException();
            }
            AccountSelectorExpansionState to = ((AccountSelectorExpansionState.Transitioning) accountSelectorExpansionState).getTo();
            if (!Intrinsics.areEqual(to, expanded)) {
                if (!Intrinsics.areEqual(to, collapsed)) {
                    if (!(to instanceof AccountSelectorExpansionState.Transitioning)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            return collapsed;
        }
        return expanded;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AccountSelectorComposable$lambda$33(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AccountSelectorComposable$lambda$36(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AccountSelectorComposable$lambda$38$lambda$37(SnapshotState snapshotState) {
        AccountSelectorScrollable accountSelectorScrollableAccountSelectorComposable$lambda$29 = AccountSelectorComposable$lambda$29(snapshotState);
        if (accountSelectorScrollableAccountSelectorComposable$lambda$29 != null) {
            return accountSelectorScrollableAccountSelectorComposable$lambda$29.isAtTop();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AccountSelectorComposable$lambda$45(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AccountSelectorComposable$lambda$48(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AccountSelectorComposable$lambda$51(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AccountSelectorComposable$lambda$57(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AccountSelectorComposable$lambda$59$lambda$58(SnapshotState snapshotState, SnapshotState snapshotState2) {
        AccountSelectorScrollable accountSelectorScrollableAccountSelectorComposable$lambda$29 = AccountSelectorComposable$lambda$29(snapshotState);
        return (accountSelectorScrollableAccountSelectorComposable$lambda$29 != null && accountSelectorScrollableAccountSelectorComposable$lambda$29.isScrolling()) || AccountSelectorComposable$lambda$56(snapshotState2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AccountSelectorComposable$lambda$62$lambda$61(LazyListState lazyListState, PagerState pagerState) {
        LazyListLayoutInfo layoutInfo = lazyListState.getLayoutInfo();
        int currentPage = pagerState.getCurrentPage();
        List<LazyListItemInfo> visibleItemsInfo = layoutInfo.getVisibleItemsInfo();
        return (visibleItemsInfo.isEmpty() || ((LazyListItemInfo) CollectionsKt.first((List) visibleItemsInfo)).getIndex() == currentPage) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AccountSelectorComposable$scrollToSelectedTabWithDelay(CoroutineScope coroutineScope, SnapshotState<Job> snapshotState, SnapshotState<Boolean> snapshotState2, LazyListState lazyListState, int i) {
        Job jobAccountSelectorComposable$lambda$41 = AccountSelectorComposable$lambda$41(snapshotState);
        if (jobAccountSelectorComposable$lambda$41 != null) {
            Job.DefaultImpls.cancel$default(jobAccountSelectorComposable$lambda$41, null, 1, null);
        }
        snapshotState.setValue(BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C26436x755df145(snapshotState2, lazyListState, i, null), 3, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountSelectorComposable$handleGlobalVerticalScroll(Animatable<Float, AnimationVectors2> animatable, CoroutineScope coroutineScope, SnapshotState<Boolean> snapshotState, SnapshotState4<Boolean> snapshotState4, SnapshotState<Boolean> snapshotState2, SnapshotFloatState2 snapshotFloatState2, SnapshotState<AccountSelectorExpansionState> snapshotState3, float f) {
        boolean zAccountSelectorComposable$lambda$39;
        if (Math.abs(f) > 5.0f) {
            AccountSelectorComposable$lambda$16(snapshotState, false);
        }
        if (!AccountSelectorComposable$lambda$39(snapshotState4) || AccountSelectorComposable$lambda$12(snapshotState2)) {
            if (!AccountSelectorComposable$lambda$12(snapshotState2)) {
                zAccountSelectorComposable$lambda$39 = false;
            } else if (f < 0.0f) {
                zAccountSelectorComposable$lambda$39 = true;
            } else if (f > 0.0f) {
                zAccountSelectorComposable$lambda$39 = AccountSelectorComposable$lambda$39(snapshotState4);
            }
        }
        if (!zAccountSelectorComposable$lambda$39 || snapshotFloatState2.getFloatValue() <= 0.0f) {
            return;
        }
        if (!AccountSelectorComposable$lambda$12(snapshotState2)) {
            AccountSelectorComposable$lambda$13(snapshotState2, true);
            snapshotState3.setValue(new AccountSelectorExpansionState.Transitioning(AccountSelectorComposable$lambda$9(snapshotState3), f > 0.0f ? AccountSelectorExpansionState.Expanded.INSTANCE : AccountSelectorExpansionState.Collapsed.INSTANCE));
        }
        float fAccountSelectorComposable$calculateTabHeightProgress = AccountSelectorComposable$calculateTabHeightProgress(animatable.getValue().floatValue(), f, snapshotFloatState2.getFloatValue());
        if (fAccountSelectorComposable$calculateTabHeightProgress == animatable.getValue().floatValue()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C26434x1e9d55a8(animatable, fAccountSelectorComposable$calculateTabHeightProgress, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AccountSelectorComposable$handleGlobalGestureEnd(CoroutineScope coroutineScope, SnapshotState<Boolean> snapshotState, SnapshotState<Boolean> snapshotState2, Animatable<Float, AnimationVectors2> animatable, AccountTabDuxo accountTabDuxo, SnapshotState<AccountSelectorExpansionState> snapshotState3) {
        AccountSelectorComposable$lambda$16(snapshotState, true);
        if (AccountSelectorComposable$lambda$12(snapshotState2)) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C26433x92110ad7(animatable, accountTabDuxo, snapshotState3, snapshotState2, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSelectorComposable$lambda$65$lambda$64(SnapshotFloatState2 snapshotFloatState2, float f) {
        snapshotFloatState2.setFloatValue(f);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AccountSelectorComposable$lambda$78$lambda$77(ImmutableList immutableList, PagerState pagerState) {
        AccountTabInfo.Account account = (AccountTabInfo.Account) CollectionsKt.getOrNull(immutableList, pagerState.getCurrentPage());
        return (account == null || account.getNestedScrollCompatible()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountSelectorTabRowScrollInfo AccountSelectorComposable$lambda$83$lambda$82(ImmutableList immutableList, PagerState pagerState, Density density, SnapshotState snapshotState, SnapshotState snapshotState2, SnapshotIntState2 snapshotIntState2) {
        int iMo5010roundToPx0680j_4;
        if (AccountSelectorComposable$lambda$50(snapshotState) || immutableList.isEmpty()) {
            return null;
        }
        int currentPage = pagerState.getCurrentPage();
        float currentPageOffsetFraction = pagerState.getCurrentPageOffsetFraction();
        if (Math.abs(currentPageOffsetFraction) < 0.01f) {
            return new AccountSelectorTabRowScrollInfo.StaticPosition(currentPage);
        }
        if (!AccountSelectorComposable$lambda$2(snapshotState2).isEmpty()) {
            if (snapshotIntState2.getIntValue() > 0) {
                iMo5010roundToPx0680j_4 = snapshotIntState2.getIntValue();
            } else {
                iMo5010roundToPx0680j_4 = density.mo5010roundToPx0680j_4(C2002Dp.m7995constructorimpl(24));
            }
            Integer num = AccountSelectorComposable$lambda$2(snapshotState2).get(Integer.valueOf(currentPage));
            int iIntValue = num != null ? num.intValue() : 0;
            int i = currentPage - 1;
            Integer num2 = AccountSelectorComposable$lambda$2(snapshotState2).get(Integer.valueOf(i));
            if (num2 == null) {
                num2 = 0;
            }
            int iIntValue2 = num2.intValue();
            if (currentPageOffsetFraction > 0.0f) {
                return new AccountSelectorTabRowScrollInfo.PrecisePosition(currentPage, (int) (currentPageOffsetFraction * (iIntValue + iMo5010roundToPx0680j_4)));
            }
            if (currentPageOffsetFraction >= 0.0f) {
                return new AccountSelectorTabRowScrollInfo.StaticPosition(currentPage);
            }
            float f = iIntValue2 + iMo5010roundToPx0680j_4;
            float f2 = (-currentPageOffsetFraction) * f;
            if (currentPage > 0) {
                return new AccountSelectorTabRowScrollInfo.PrecisePosition(i, RangesKt.coerceAtLeast((int) (f - f2), 0));
            }
            return new AccountSelectorTabRowScrollInfo.StaticPosition(currentPage);
        }
        return new AccountSelectorTabRowScrollInfo.StaticPosition(currentPage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AccountSelectorComposable$lambda$88(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HorizontalPager$lambda$94$lambda$93(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HorizontalPager(final PagerState pagerState, final ImmutableList<AccountTabInfo.Account> immutableList, final boolean z, final boolean z2, final NestedScrollModifier nestedScrollModifier, final FragmentManager fragmentManager, Function1<? super Boolean, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        Function1<? super Boolean, Unit> function12;
        final Function1<? super Boolean, Unit> function13;
        boolean z3;
        Object objRememberedValue;
        int i4;
        boolean z4;
        boolean z5;
        Object objRememberedValue2;
        final Function1<? super Boolean, Unit> function14;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1053780107);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(pagerState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(immutableList) : composerStartRestartGroup.changedInstance(immutableList) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(nestedScrollModifier) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(fragmentManager) ? 131072 : 65536;
        }
        int i5 = i2 & 64;
        if (i5 == 0) {
            if ((1572864 & i) == 0) {
                function12 = function1;
                i3 |= composerStartRestartGroup.changedInstance(function12) ? 1048576 : 524288;
            }
            if ((599187 & i3) != 599186 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                function14 = function12;
            } else {
                if (i5 == 0) {
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function1() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AccountSelectorComposableKt.HorizontalPager$lambda$94$lambda$93(((Boolean) obj).booleanValue());
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    function13 = (Function1) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    function13 = function12;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1053780107, i3, -1, "com.robinhood.android.redesign.feature.accounttab.HorizontalPager (AccountSelectorComposable.kt:967)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(5004770);
                z3 = (3670016 & i3) != 1048576;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AccountSelectorComposableKt.HorizontalPager$lambda$96$lambda$95(function13, ((Boolean) obj).booleanValue());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(AccountSelectorDominantDirectionModifier.dominantDirectionDetector$default(companion, 0.0f, 0.0f, (Function1) objRememberedValue, 3, null), 0.0f, 1, null);
                if (z && z2) {
                    i4 = i3;
                    z4 = true;
                } else {
                    i4 = i3;
                    z4 = false;
                }
                composerStartRestartGroup.startReplaceGroup(5004770);
                z5 = (i4 & 112) != 32 || ((i4 & 64) != 0 && composerStartRestartGroup.changedInstance(immutableList));
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!z5 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AccountSelectorComposableKt.HorizontalPager$lambda$98$lambda$97(immutableList, ((Integer) obj).intValue());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                int i6 = (i4 & 14) | 24576;
                Function1<? super Boolean, Unit> function15 = function13;
                PagerKt.m5301HorizontalPager8jOkeI(pagerState, modifierFillMaxSize$default, null, null, 0, 0.0f, null, null, z4, false, (Function1) objRememberedValue2, null, null, null, ComposableLambda3.rememberComposableLambda(-820474838, true, new C264374(immutableList, pagerState, fragmentManager, nestedScrollModifier), composerStartRestartGroup, 54), composerStartRestartGroup, i6, 24576, 15084);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function14 = function15;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AccountSelectorComposableKt.HorizontalPager$lambda$99(pagerState, immutableList, z, z2, nestedScrollModifier, fragmentManager, function14, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 1572864;
        function12 = function1;
        if ((599187 & i3) != 599186) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(5004770);
            if ((3670016 & i3) != 1048576) {
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z3) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AccountSelectorComposableKt.HorizontalPager$lambda$96$lambda$95(function13, ((Boolean) obj).booleanValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(AccountSelectorDominantDirectionModifier.dominantDirectionDetector$default(companion2, 0.0f, 0.0f, (Function1) objRememberedValue, 3, null), 0.0f, 1, null);
                if (z) {
                    i4 = i3;
                    z4 = false;
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    if ((i4 & 112) != 32) {
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!z5) {
                            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$$ExternalSyntheticLambda11
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AccountSelectorComposableKt.HorizontalPager$lambda$98$lambda$97(immutableList, ((Integer) obj).intValue());
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            composerStartRestartGroup.endReplaceGroup();
                            int i62 = (i4 & 14) | 24576;
                            Function1<? super Boolean, Unit> function152 = function13;
                            PagerKt.m5301HorizontalPager8jOkeI(pagerState, modifierFillMaxSize$default2, null, null, 0, 0.0f, null, null, z4, false, (Function1) objRememberedValue2, null, null, null, ComposableLambda3.rememberComposableLambda(-820474838, true, new C264374(immutableList, pagerState, fragmentManager, nestedScrollModifier), composerStartRestartGroup, 54), composerStartRestartGroup, i62, 24576, 15084);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            function14 = function152;
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HorizontalPager$lambda$96$lambda$95(Function1 function1, boolean z) {
        function1.invoke(Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object HorizontalPager$lambda$98$lambda$97(ImmutableList immutableList, int i) {
        String id;
        AccountTabInfo.Account account = (AccountTabInfo.Account) CollectionsKt.getOrNull(immutableList, i);
        if (account != null && (id = account.getId()) != null) {
            return id;
        }
        return PdfRendererComposable4.PAGE + i;
    }

    /* compiled from: AccountSelectorComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$HorizontalPager$4 */
    static final class C264374 implements Function4<PagerScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ ImmutableList<AccountTabInfo.Account> $accountTabInfo;
        final /* synthetic */ FragmentManager $fragmentManager;
        final /* synthetic */ PagerState $pagerState;
        final /* synthetic */ NestedScrollModifier $tabScrollConnection;

        C264374(ImmutableList<AccountTabInfo.Account> immutableList, PagerState pagerState, FragmentManager fragmentManager, NestedScrollModifier nestedScrollModifier) {
            this.$accountTabInfo = immutableList;
            this.$pagerState = pagerState;
            this.$fragmentManager = fragmentManager;
            this.$tabScrollConnection = nestedScrollModifier;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer, Integer num2) {
            invoke(pagerScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PagerScope HorizontalPager, final int i, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-820474838, i2, -1, "com.robinhood.android.redesign.feature.accounttab.HorizontalPager.<anonymous> (AccountSelectorComposable.kt:992)");
            }
            AccountTabInfo.Account account = (AccountTabInfo.Account) CollectionsKt.getOrNull(this.$accountTabInfo, i);
            if (account == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.startReplaceGroup(1849434622);
            final PagerState pagerState = this.$pagerState;
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$HorizontalPager$4$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(AccountSelectorComposableKt.C264374.invoke$lambda$1$lambda$0(i, pagerState));
                    }
                });
                composer.updateRememberedValue(objRememberedValue);
            }
            SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue;
            composer.endReplaceGroup();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = ((((i2 & 112) ^ 48) > 32 && composer.changed(i)) || (i2 & 48) == 32) | composer.changed(this.$pagerState);
            final PagerState pagerState2 = this.$pagerState;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$HorizontalPager$4$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AccountSelectorComposableKt.C264374.invoke$lambda$3$lambda$2(pagerState2, i, (GraphicsLayerScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            Modifier modifierGraphicsLayer = GraphicsLayerModifier6.graphicsLayer(companion2, (Function1) objRememberedValue2);
            FragmentManager fragmentManager = this.$fragmentManager;
            NestedScrollModifier nestedScrollModifier = this.$tabScrollConnection;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierGraphicsLayer);
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
            AccountSelectorFragmentPage.AccountTabFragmentPage(account, ((Boolean) snapshotState4.getValue()).booleanValue(), fragmentManager, nestedScrollModifier, SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), composer, AccountTabInfo.Account.$stable | 24576, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invoke$lambda$1$lambda$0(int i, PagerState pagerState) {
            if (i == pagerState.getCurrentPage()) {
                return true;
            }
            if (pagerState.getCurrentPageOffsetFraction() <= 0.05f || pagerState.getCurrentPage() + 1 != i) {
                return pagerState.getCurrentPageOffsetFraction() < -0.05f && pagerState.getCurrentPage() - 1 == i;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(PagerState pagerState, int i, GraphicsLayerScope graphicsLayer) {
            Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
            float fAbs = Math.abs((pagerState.getCurrentPage() - i) + pagerState.getCurrentPageOffsetFraction());
            graphicsLayer.setAlpha(fAbs <= 1.0f ? 1.0f - fAbs : 0.0f);
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ Object switchToPage$default(PagerState pagerState, int i, boolean z, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return switchToPage(pagerState, i, z, continuation);
    }

    public static final Object switchToPage(PagerState pagerState, int i, boolean z, Continuation<? super Unit> continuation) {
        if (z) {
            Object objAnimateScrollToPage$default = PagerState.animateScrollToPage$default(pagerState, i, 0.0f, null, continuation, 6, null);
            return objAnimateScrollToPage$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateScrollToPage$default : Unit.INSTANCE;
        }
        Object objScrollToPage$default = PagerState.scrollToPage$default(pagerState, i, 0.0f, continuation, 2, null);
        return objScrollToPage$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objScrollToPage$default : Unit.INSTANCE;
    }
}
