package com.robinhood.android.dashboard.lib;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier7;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
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
import com.robinhood.android.autoeventlogging.LoggableViewState2;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ScreenLoggable2;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.dashboard.lib.DashboardEvent;
import com.robinhood.android.dashboard.lib.DashboardScreen;
import com.robinhood.android.dashboard.lib.DashboardViewState;
import com.robinhood.android.dashboard.lib.appbar.DashboardAppBar3;
import com.robinhood.android.dashboard.lib.footer.DashboardFooterContent;
import com.robinhood.android.dashboard.lib.footer.FooterVisibilityState;
import com.robinhood.android.dashboard.lib.footer.FooterVisibilityState2;
import com.robinhood.android.dashboard.lib.mcw.fxswitcherftux.FxSwitcherFtux4;
import com.robinhood.android.home.contracts.HomeDashboardType;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.TopBarScrollState;
import com.robinhood.compose.bento.component.TopBarScrollState3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
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
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: DashboardScreen.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001aI\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0001¢\u0006\u0002\u0010\u000e\u001a;\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010\u0012¨\u0006\u0013²\u0006\n\u0010\u0002\u001a\u00020\u0003X\u008a\u0084\u0002²\u0006\u0012\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015X\u008a\u0084\u0002²\u0006\n\u0010\u0017\u001a\u00020\u0007X\u008a\u008e\u0002"}, m3636d2 = {"InternalDashboardScreen", "", "state", "Lcom/robinhood/android/dashboard/lib/DashboardViewState;", "dashboardType", "Lcom/robinhood/android/home/contracts/HomeDashboardType;", "isEmbedded", "", "modifier", "Landroidx/compose/ui/Modifier;", "listState", "Landroidx/compose/foundation/lazy/LazyListState;", "onFxSwitcherClicked", "Lkotlin/Function0;", "(Lcom/robinhood/android/dashboard/lib/DashboardViewState;Lcom/robinhood/android/home/contracts/HomeDashboardType;ZLandroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "DashboardScreen", "duxo", "Lcom/robinhood/android/dashboard/lib/DashboardDuxo;", "(Lcom/robinhood/android/home/contracts/HomeDashboardType;ZLandroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Lcom/robinhood/android/dashboard/lib/DashboardDuxo;Landroidx/compose/runtime/Composer;II)V", "lib-account-home_externalDebug", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/dashboard/lib/DashboardEvent;", "showFxSwitcherFtux"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.dashboard.lib.DashboardScreenKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class DashboardScreen {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DashboardScreen$lambda$10(HomeDashboardType homeDashboardType, boolean z, Modifier modifier, LazyListState lazyListState, DashboardDuxo dashboardDuxo, int i, int i2, Composer composer, int i3) {
        DashboardScreen(homeDashboardType, z, modifier, lazyListState, dashboardDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternalDashboardScreen$lambda$2(DashboardViewState dashboardViewState, HomeDashboardType homeDashboardType, boolean z, Modifier modifier, LazyListState lazyListState, Function0 function0, int i, int i2, Composer composer, int i3) {
        InternalDashboardScreen(dashboardViewState, homeDashboardType, z, modifier, lazyListState, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InternalDashboardScreen(final DashboardViewState state, final HomeDashboardType dashboardType, final boolean z, Modifier modifier, LazyListState lazyListState, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        LazyListState lazyListStateRememberLazyListState;
        int i5;
        Function0<Unit> function02;
        Modifier modifier3;
        final LazyListState lazyListState2;
        final Function0<Unit> function03;
        final LazyListState lazyListState3;
        final Function0<Unit> function04;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(dashboardType, "dashboardType");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1722785035);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(dashboardType) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        lazyListStateRememberLazyListState = lazyListState;
                        int i6 = composerStartRestartGroup.changed(lazyListStateRememberLazyListState) ? 16384 : 8192;
                        i3 |= i6;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    i3 |= i6;
                } else {
                    lazyListStateRememberLazyListState = lazyListState;
                }
                i5 = i2 & 32;
                if (i5 == 0) {
                    if ((196608 & i) == 0) {
                        function02 = function0;
                        i3 |= composerStartRestartGroup.changedInstance(function02) ? 131072 : 65536;
                    }
                    if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            }
                            if (i5 == 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.dashboard.lib.DashboardScreenKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                lazyListState2 = lazyListStateRememberLazyListState;
                                function03 = (Function0) objRememberedValue;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1722785035, i3, -1, "com.robinhood.android.dashboard.lib.InternalDashboardScreen (DashboardScreen.kt:45)");
                            }
                            final TopBarScrollState topBarScrollStateRememberTopBarScrollState = TopBarScrollState3.rememberTopBarScrollState(0.0f, composerStartRestartGroup, 0, 1);
                            final FooterVisibilityState footerVisibilityStateRememberFooterVisibilityState = FooterVisibilityState2.rememberFooterVisibilityState(false, composerStartRestartGroup, 0, 1);
                            final String accountNumber = dashboardType.getAccountNumber();
                            final Modifier modifier5 = modifier3;
                            AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, state.getScreen(), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, state.getBrokerageAccountContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -257, -1, -1, 16383, null), null, null, 53, null)), ComposableLambda3.rememberComposableLambda(95360298, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.DashboardScreenKt.InternalDashboardScreen.2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i7) {
                                    if ((i7 & 3) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(95360298, i7, -1, "com.robinhood.android.dashboard.lib.InternalDashboardScreen.<anonymous> (DashboardScreen.kt:60)");
                                    }
                                    BentoTheme4 pageDirection = state.getPageDirection();
                                    final Modifier modifier6 = modifier5;
                                    final boolean z2 = z;
                                    final LazyListState lazyListState4 = lazyListState2;
                                    final TopBarScrollState topBarScrollState = topBarScrollStateRememberTopBarScrollState;
                                    final HomeDashboardType homeDashboardType = dashboardType;
                                    final Function0<Unit> function05 = function03;
                                    final DashboardViewState dashboardViewState = state;
                                    final FooterVisibilityState footerVisibilityState = footerVisibilityStateRememberFooterVisibilityState;
                                    final String str = accountNumber;
                                    DashboardThemeOverlay.DashboardThemeOverlay(pageDirection, ComposableLambda3.rememberComposableLambda(906524953, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.DashboardScreenKt.InternalDashboardScreen.2.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i8) {
                                            if ((i8 & 3) == 2 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(906524953, i8, -1, "com.robinhood.android.dashboard.lib.InternalDashboardScreen.<anonymous>.<anonymous> (DashboardScreen.kt:61)");
                                            }
                                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                            int i9 = BentoTheme.$stable;
                                            long jM21371getBg0d7_KjU = bentoTheme.getColors(composer3, i9).m21371getBg0d7_KjU();
                                            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer3, i9).m21425getFg0d7_KjU();
                                            WindowInsets windowInsetsWindowInsets$default = WindowInsetsKt.WindowInsets$default(0, 0, 0, 0, 14, null);
                                            Modifier modifier7 = modifier6;
                                            final boolean z3 = z2;
                                            final LazyListState lazyListState5 = lazyListState4;
                                            final TopBarScrollState topBarScrollState2 = topBarScrollState;
                                            final HomeDashboardType homeDashboardType2 = homeDashboardType;
                                            final Function0<Unit> function06 = function05;
                                            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(341181909, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.DashboardScreenKt.InternalDashboardScreen.2.1.1
                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                    invoke(composer4, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer4, int i10) {
                                                    if ((i10 & 3) == 2 && composer4.getSkipping()) {
                                                        composer4.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(341181909, i10, -1, "com.robinhood.android.dashboard.lib.InternalDashboardScreen.<anonymous>.<anonymous>.<anonymous> (DashboardScreen.kt:67)");
                                                    }
                                                    if (!z3) {
                                                        DashboardAppBar3.DashboardAppBar(homeDashboardType2, topBarScrollState2, TopBarScrollState3.scrollableTopBarState(Modifier.INSTANCE, lazyListState5, topBarScrollState2), null, function06, false, composer4, TopBarScrollState.$stable << 3, 40);
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }, composer3, 54);
                                            final DashboardViewState dashboardViewState2 = dashboardViewState;
                                            final FooterVisibilityState footerVisibilityState2 = footerVisibilityState;
                                            final boolean z4 = z2;
                                            final LazyListState lazyListState6 = lazyListState4;
                                            final String str2 = str;
                                            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier7, composableLambdaRememberComposableLambda, null, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, windowInsetsWindowInsets$default, ComposableLambda3.rememberComposableLambda(-1908599510, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.DashboardScreenKt.InternalDashboardScreen.2.1.2
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer4, Integer num) {
                                                    invoke(paddingValues, composer4, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(PaddingValues paddingValues, Composer composer4, int i10) {
                                                    int i11;
                                                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                                    if ((i10 & 6) == 0) {
                                                        i11 = i10 | (composer4.changed(paddingValues) ? 4 : 2);
                                                    } else {
                                                        i11 = i10;
                                                    }
                                                    if ((i11 & 19) == 18 && composer4.getSkipping()) {
                                                        composer4.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1908599510, i11, -1, "com.robinhood.android.dashboard.lib.InternalDashboardScreen.<anonymous>.<anonymous>.<anonymous> (DashboardScreen.kt:80)");
                                                    }
                                                    DashboardViewState dashboardViewState3 = dashboardViewState2;
                                                    if (dashboardViewState3 instanceof DashboardViewState.Loaded) {
                                                        composer4.startReplaceGroup(1984162171);
                                                        FooterVisibilityState footerVisibilityState3 = footerVisibilityState2;
                                                        DashboardViewState dashboardViewState4 = dashboardViewState2;
                                                        boolean z5 = z4;
                                                        LazyListState lazyListState7 = lazyListState6;
                                                        String str3 = str2;
                                                        Modifier.Companion companion = Modifier.INSTANCE;
                                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                                        CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, companion);
                                                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                        }
                                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                                        DashboardViewState.Loaded loaded = (DashboardViewState.Loaded) dashboardViewState4;
                                                        LoadedDashboardKt.DashboardComponentColumn(z5, loaded.getComponents(), loaded.getPageDirection(), lazyListState7, NestedScrollModifier7.nestedScroll$default(Column5.weight$default(Column6.INSTANCE, PaddingKt.padding(companion, paddingValues), 1.0f, false, 2, null), footerVisibilityState3, null, 2, null), composer4, 0, 0);
                                                        composer4.startReplaceGroup(-624582893);
                                                        if (loaded.isDashboardFundingCtaEnabled() && str3 != null) {
                                                            DashboardFooterContent.DashboardFooterContent(str3, footerVisibilityState3.getShowFooterButton(), null, null, composer4, 0, 12);
                                                        }
                                                        composer4.endReplaceGroup();
                                                        composer4.endNode();
                                                        composer4.endReplaceGroup();
                                                    } else {
                                                        if (!(dashboardViewState3 instanceof DashboardViewState.Loading)) {
                                                            composer4.startReplaceGroup(-213091260);
                                                            composer4.endReplaceGroup();
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        composer4.startReplaceGroup(1985203399);
                                                        PlaceholderDashboard5.PlaceholderDashboardComponents(PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer4, 0, 0);
                                                        composer4.endReplaceGroup();
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }, composer3, 54), composer3, 805306416, 60);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer2, 54), composer2, 48);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            lazyListState3 = lazyListState2;
                            function04 = function03;
                            modifier4 = modifier5;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            modifier3 = modifier2;
                        }
                        lazyListState2 = lazyListStateRememberLazyListState;
                        function03 = function02;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        final TopBarScrollState topBarScrollStateRememberTopBarScrollState2 = TopBarScrollState3.rememberTopBarScrollState(0.0f, composerStartRestartGroup, 0, 1);
                        final FooterVisibilityState footerVisibilityStateRememberFooterVisibilityState2 = FooterVisibilityState2.rememberFooterVisibilityState(false, composerStartRestartGroup, 0, 1);
                        final String accountNumber2 = dashboardType.getAccountNumber();
                        final Modifier modifier52 = modifier3;
                        AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, state.getScreen(), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, state.getBrokerageAccountContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -257, -1, -1, 16383, null), null, null, 53, null)), ComposableLambda3.rememberComposableLambda(95360298, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.DashboardScreenKt.InternalDashboardScreen.2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i7) {
                                if ((i7 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(95360298, i7, -1, "com.robinhood.android.dashboard.lib.InternalDashboardScreen.<anonymous> (DashboardScreen.kt:60)");
                                }
                                BentoTheme4 pageDirection = state.getPageDirection();
                                final Modifier modifier6 = modifier52;
                                final boolean z2 = z;
                                final LazyListState lazyListState4 = lazyListState2;
                                final TopBarScrollState topBarScrollState = topBarScrollStateRememberTopBarScrollState2;
                                final HomeDashboardType homeDashboardType = dashboardType;
                                final Function0<Unit> function05 = function03;
                                final DashboardViewState dashboardViewState = state;
                                final FooterVisibilityState footerVisibilityState = footerVisibilityStateRememberFooterVisibilityState2;
                                final String str = accountNumber2;
                                DashboardThemeOverlay.DashboardThemeOverlay(pageDirection, ComposableLambda3.rememberComposableLambda(906524953, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.DashboardScreenKt.InternalDashboardScreen.2.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i8) {
                                        if ((i8 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(906524953, i8, -1, "com.robinhood.android.dashboard.lib.InternalDashboardScreen.<anonymous>.<anonymous> (DashboardScreen.kt:61)");
                                        }
                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                        int i9 = BentoTheme.$stable;
                                        long jM21371getBg0d7_KjU = bentoTheme.getColors(composer3, i9).m21371getBg0d7_KjU();
                                        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer3, i9).m21425getFg0d7_KjU();
                                        WindowInsets windowInsetsWindowInsets$default = WindowInsetsKt.WindowInsets$default(0, 0, 0, 0, 14, null);
                                        Modifier modifier7 = modifier6;
                                        final boolean z3 = z2;
                                        final LazyListState lazyListState5 = lazyListState4;
                                        final TopBarScrollState topBarScrollState2 = topBarScrollState;
                                        final HomeDashboardType homeDashboardType2 = homeDashboardType;
                                        final Function0<Unit> function06 = function05;
                                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(341181909, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.DashboardScreenKt.InternalDashboardScreen.2.1.1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer4, int i10) {
                                                if ((i10 & 3) == 2 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(341181909, i10, -1, "com.robinhood.android.dashboard.lib.InternalDashboardScreen.<anonymous>.<anonymous>.<anonymous> (DashboardScreen.kt:67)");
                                                }
                                                if (!z3) {
                                                    DashboardAppBar3.DashboardAppBar(homeDashboardType2, topBarScrollState2, TopBarScrollState3.scrollableTopBarState(Modifier.INSTANCE, lazyListState5, topBarScrollState2), null, function06, false, composer4, TopBarScrollState.$stable << 3, 40);
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer3, 54);
                                        final DashboardViewState dashboardViewState2 = dashboardViewState;
                                        final FooterVisibilityState footerVisibilityState2 = footerVisibilityState;
                                        final boolean z4 = z2;
                                        final LazyListState lazyListState6 = lazyListState4;
                                        final String str2 = str;
                                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifier7, composableLambdaRememberComposableLambda, null, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, windowInsetsWindowInsets$default, ComposableLambda3.rememberComposableLambda(-1908599510, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.DashboardScreenKt.InternalDashboardScreen.2.1.2
                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer4, Integer num) {
                                                invoke(paddingValues, composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(PaddingValues paddingValues, Composer composer4, int i10) {
                                                int i11;
                                                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                                if ((i10 & 6) == 0) {
                                                    i11 = i10 | (composer4.changed(paddingValues) ? 4 : 2);
                                                } else {
                                                    i11 = i10;
                                                }
                                                if ((i11 & 19) == 18 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1908599510, i11, -1, "com.robinhood.android.dashboard.lib.InternalDashboardScreen.<anonymous>.<anonymous>.<anonymous> (DashboardScreen.kt:80)");
                                                }
                                                DashboardViewState dashboardViewState3 = dashboardViewState2;
                                                if (dashboardViewState3 instanceof DashboardViewState.Loaded) {
                                                    composer4.startReplaceGroup(1984162171);
                                                    FooterVisibilityState footerVisibilityState3 = footerVisibilityState2;
                                                    DashboardViewState dashboardViewState4 = dashboardViewState2;
                                                    boolean z5 = z4;
                                                    LazyListState lazyListState7 = lazyListState6;
                                                    String str3 = str2;
                                                    Modifier.Companion companion = Modifier.INSTANCE;
                                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, companion);
                                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                    }
                                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                                    DashboardViewState.Loaded loaded = (DashboardViewState.Loaded) dashboardViewState4;
                                                    LoadedDashboardKt.DashboardComponentColumn(z5, loaded.getComponents(), loaded.getPageDirection(), lazyListState7, NestedScrollModifier7.nestedScroll$default(Column5.weight$default(Column6.INSTANCE, PaddingKt.padding(companion, paddingValues), 1.0f, false, 2, null), footerVisibilityState3, null, 2, null), composer4, 0, 0);
                                                    composer4.startReplaceGroup(-624582893);
                                                    if (loaded.isDashboardFundingCtaEnabled() && str3 != null) {
                                                        DashboardFooterContent.DashboardFooterContent(str3, footerVisibilityState3.getShowFooterButton(), null, null, composer4, 0, 12);
                                                    }
                                                    composer4.endReplaceGroup();
                                                    composer4.endNode();
                                                    composer4.endReplaceGroup();
                                                } else {
                                                    if (!(dashboardViewState3 instanceof DashboardViewState.Loading)) {
                                                        composer4.startReplaceGroup(-213091260);
                                                        composer4.endReplaceGroup();
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    composer4.startReplaceGroup(1985203399);
                                                    PlaceholderDashboard5.PlaceholderDashboardComponents(PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer4, 0, 0);
                                                    composer4.endReplaceGroup();
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer3, 54), composer3, 805306416, 60);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54), composer2, 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        lazyListState3 = lazyListState2;
                        function04 = function03;
                        modifier4 = modifier52;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier4 = modifier2;
                        lazyListState3 = lazyListStateRememberLazyListState;
                        function04 = function02;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.dashboard.lib.DashboardScreenKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return DashboardScreen.InternalDashboardScreen$lambda$2(state, dashboardType, z, modifier4, lazyListState3, function04, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 196608;
                function02 = function0;
                if ((74899 & i3) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                        }
                        if (i5 == 0) {
                            lazyListState2 = lazyListStateRememberLazyListState;
                            function03 = function02;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        final TopBarScrollState topBarScrollStateRememberTopBarScrollState22 = TopBarScrollState3.rememberTopBarScrollState(0.0f, composerStartRestartGroup, 0, 1);
                        final FooterVisibilityState footerVisibilityStateRememberFooterVisibilityState22 = FooterVisibilityState2.rememberFooterVisibilityState(false, composerStartRestartGroup, 0, 1);
                        final String accountNumber22 = dashboardType.getAccountNumber();
                        final Modifier modifier522 = modifier3;
                        AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, state.getScreen(), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, state.getBrokerageAccountContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -257, -1, -1, 16383, null), null, null, 53, null)), ComposableLambda3.rememberComposableLambda(95360298, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.DashboardScreenKt.InternalDashboardScreen.2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i7) {
                                if ((i7 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(95360298, i7, -1, "com.robinhood.android.dashboard.lib.InternalDashboardScreen.<anonymous> (DashboardScreen.kt:60)");
                                }
                                BentoTheme4 pageDirection = state.getPageDirection();
                                final Modifier modifier6 = modifier522;
                                final boolean z2 = z;
                                final LazyListState lazyListState4 = lazyListState2;
                                final TopBarScrollState topBarScrollState = topBarScrollStateRememberTopBarScrollState22;
                                final HomeDashboardType homeDashboardType = dashboardType;
                                final Function0<Unit> function05 = function03;
                                final DashboardViewState dashboardViewState = state;
                                final FooterVisibilityState footerVisibilityState = footerVisibilityStateRememberFooterVisibilityState22;
                                final String str = accountNumber22;
                                DashboardThemeOverlay.DashboardThemeOverlay(pageDirection, ComposableLambda3.rememberComposableLambda(906524953, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.DashboardScreenKt.InternalDashboardScreen.2.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i8) {
                                        if ((i8 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(906524953, i8, -1, "com.robinhood.android.dashboard.lib.InternalDashboardScreen.<anonymous>.<anonymous> (DashboardScreen.kt:61)");
                                        }
                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                        int i9 = BentoTheme.$stable;
                                        long jM21371getBg0d7_KjU = bentoTheme.getColors(composer3, i9).m21371getBg0d7_KjU();
                                        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer3, i9).m21425getFg0d7_KjU();
                                        WindowInsets windowInsetsWindowInsets$default = WindowInsetsKt.WindowInsets$default(0, 0, 0, 0, 14, null);
                                        Modifier modifier7 = modifier6;
                                        final boolean z3 = z2;
                                        final LazyListState lazyListState5 = lazyListState4;
                                        final TopBarScrollState topBarScrollState2 = topBarScrollState;
                                        final HomeDashboardType homeDashboardType2 = homeDashboardType;
                                        final Function0<Unit> function06 = function05;
                                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(341181909, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.DashboardScreenKt.InternalDashboardScreen.2.1.1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer4, int i10) {
                                                if ((i10 & 3) == 2 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(341181909, i10, -1, "com.robinhood.android.dashboard.lib.InternalDashboardScreen.<anonymous>.<anonymous>.<anonymous> (DashboardScreen.kt:67)");
                                                }
                                                if (!z3) {
                                                    DashboardAppBar3.DashboardAppBar(homeDashboardType2, topBarScrollState2, TopBarScrollState3.scrollableTopBarState(Modifier.INSTANCE, lazyListState5, topBarScrollState2), null, function06, false, composer4, TopBarScrollState.$stable << 3, 40);
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer3, 54);
                                        final DashboardViewState dashboardViewState2 = dashboardViewState;
                                        final FooterVisibilityState footerVisibilityState2 = footerVisibilityState;
                                        final boolean z4 = z2;
                                        final LazyListState lazyListState6 = lazyListState4;
                                        final String str2 = str;
                                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifier7, composableLambdaRememberComposableLambda, null, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, windowInsetsWindowInsets$default, ComposableLambda3.rememberComposableLambda(-1908599510, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.lib.DashboardScreenKt.InternalDashboardScreen.2.1.2
                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer4, Integer num) {
                                                invoke(paddingValues, composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(PaddingValues paddingValues, Composer composer4, int i10) {
                                                int i11;
                                                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                                if ((i10 & 6) == 0) {
                                                    i11 = i10 | (composer4.changed(paddingValues) ? 4 : 2);
                                                } else {
                                                    i11 = i10;
                                                }
                                                if ((i11 & 19) == 18 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1908599510, i11, -1, "com.robinhood.android.dashboard.lib.InternalDashboardScreen.<anonymous>.<anonymous>.<anonymous> (DashboardScreen.kt:80)");
                                                }
                                                DashboardViewState dashboardViewState3 = dashboardViewState2;
                                                if (dashboardViewState3 instanceof DashboardViewState.Loaded) {
                                                    composer4.startReplaceGroup(1984162171);
                                                    FooterVisibilityState footerVisibilityState3 = footerVisibilityState2;
                                                    DashboardViewState dashboardViewState4 = dashboardViewState2;
                                                    boolean z5 = z4;
                                                    LazyListState lazyListState7 = lazyListState6;
                                                    String str3 = str2;
                                                    Modifier.Companion companion = Modifier.INSTANCE;
                                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, companion);
                                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                    }
                                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                                    DashboardViewState.Loaded loaded = (DashboardViewState.Loaded) dashboardViewState4;
                                                    LoadedDashboardKt.DashboardComponentColumn(z5, loaded.getComponents(), loaded.getPageDirection(), lazyListState7, NestedScrollModifier7.nestedScroll$default(Column5.weight$default(Column6.INSTANCE, PaddingKt.padding(companion, paddingValues), 1.0f, false, 2, null), footerVisibilityState3, null, 2, null), composer4, 0, 0);
                                                    composer4.startReplaceGroup(-624582893);
                                                    if (loaded.isDashboardFundingCtaEnabled() && str3 != null) {
                                                        DashboardFooterContent.DashboardFooterContent(str3, footerVisibilityState3.getShowFooterButton(), null, null, composer4, 0, 12);
                                                    }
                                                    composer4.endReplaceGroup();
                                                    composer4.endNode();
                                                    composer4.endReplaceGroup();
                                                } else {
                                                    if (!(dashboardViewState3 instanceof DashboardViewState.Loading)) {
                                                        composer4.startReplaceGroup(-213091260);
                                                        composer4.endReplaceGroup();
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    composer4.startReplaceGroup(1985203399);
                                                    PlaceholderDashboard5.PlaceholderDashboardComponents(PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer4, 0, 0);
                                                    composer4.endReplaceGroup();
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer3, 54), composer3, 805306416, 60);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54), composer2, 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        lazyListState3 = lazyListState2;
                        function04 = function03;
                        modifier4 = modifier522;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 == 0) {
            }
            function02 = function0;
            if ((74899 & i3) == 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        function02 = function0;
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DashboardViewState DashboardScreen$lambda$3(SnapshotState4<? extends DashboardViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<DashboardEvent> DashboardScreen$lambda$4(SnapshotState4<Event<DashboardEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean DashboardScreen$lambda$6(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DashboardScreen(final HomeDashboardType dashboardType, boolean z, Modifier modifier, LazyListState lazyListState, DashboardDuxo dashboardDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        LazyListState lazyListStateRememberLazyListState;
        DashboardDuxo dashboardDuxo2;
        int i4;
        final Modifier modifier3;
        int i5;
        DashboardDuxo dashboardDuxo3;
        String str;
        Event<DashboardEvent> event;
        Object objRememberedValue;
        Composer.Companion companion;
        Continuation continuation;
        final SnapshotState snapshotState;
        final Event<DashboardEvent> eventDashboardScreen$lambda$4;
        Continuation continuation2;
        boolean zChangedInstance;
        Object objRememberedValue2;
        final DashboardDuxo dashboardDuxo4;
        EventConsumer<DashboardEvent> eventConsumerInvoke;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final boolean z2 = z;
        Intrinsics.checkNotNullParameter(dashboardType, "dashboardType");
        Composer composerStartRestartGroup = composer.startRestartGroup(-716417060);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(dashboardType) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    lazyListStateRememberLazyListState = lazyListState;
                    int i7 = composerStartRestartGroup.changed(lazyListStateRememberLazyListState) ? 2048 : 1024;
                    i3 |= i7;
                } else {
                    lazyListStateRememberLazyListState = lazyListState;
                }
                i3 |= i7;
            } else {
                lazyListStateRememberLazyListState = lazyListState;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    dashboardDuxo2 = dashboardDuxo;
                    int i8 = composerStartRestartGroup.changedInstance(dashboardDuxo2) ? 16384 : 8192;
                    i3 |= i8;
                } else {
                    dashboardDuxo2 = dashboardDuxo;
                }
                i3 |= i8;
            } else {
                dashboardDuxo2 = dashboardDuxo;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    }
                    if ((i2 & 16) != 0) {
                        if (z2) {
                            str = "dashboard_duxo_" + dashboardType.getAccountNumber();
                        } else {
                            str = null;
                        }
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(DashboardDuxo.class), current, str, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.dashboard.lib.DashboardScreenKt$DashboardScreen$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.dashboard.lib.DashboardScreenKt$DashboardScreen$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        dashboardDuxo2 = (DashboardDuxo) baseDuxo;
                        i3 &= -57345;
                    }
                    Modifier modifier5 = modifier4;
                    i4 = i3;
                    modifier3 = modifier5;
                    i5 = 32;
                    dashboardDuxo3 = dashboardDuxo2;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    i4 = i3;
                    i5 = 32;
                    modifier3 = modifier2;
                    dashboardDuxo3 = dashboardDuxo2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-716417060, i4, -1, "com.robinhood.android.dashboard.lib.DashboardScreen (DashboardScreen.kt:129)");
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(dashboardDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                DashboardViewState dashboardViewStateDashboardScreen$lambda$3 = DashboardScreen$lambda$3(snapshotState4CollectAsStateWithLifecycle);
                DashboardViewState.Loaded loaded = !(dashboardViewStateDashboardScreen$lambda$3 instanceof DashboardViewState.Loaded) ? (DashboardViewState.Loaded) dashboardViewStateDashboardScreen$lambda$3 : null;
                final StateFlow<Event<DashboardEvent>> eventFlow = dashboardDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.android.dashboard.lib.DashboardScreenKt$DashboardScreen$$inlined$collectEventAsStateWithLifecycle$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation3) {
                        Object objCollect = eventFlow.collect(new AnonymousClass2(flowCollector), continuation3);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.dashboard.lib.DashboardScreenKt$DashboardScreen$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.DashboardScreenKt$DashboardScreen$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "DashboardScreen.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.dashboard.lib.DashboardScreenKt$DashboardScreen$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof DashboardEvent) {
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
                Event<DashboardEvent> value = eventFlow.getValue();
                event = value;
                if (!((event == null ? event.getData() : null) instanceof DashboardEvent)) {
                    value = null;
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue != companion.getEmpty()) {
                    continuation = null;
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    continuation = null;
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                eventDashboardScreen$lambda$4 = DashboardScreen$lambda$4(snapshotState4CollectAsStateWithLifecycle2);
                if (eventDashboardScreen$lambda$4 != null && (eventDashboardScreen$lambda$4.getData() instanceof DashboardEvent.ShowFxSwitcherFtux) && (eventConsumerInvoke = eventDashboardScreen$lambda$4.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke.consume(eventDashboardScreen$lambda$4, new Function1() { // from class: com.robinhood.android.dashboard.lib.DashboardScreenKt$DashboardScreen$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m13180invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m13180invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            DashboardScreen.DashboardScreen$lambda$7(snapshotState, true);
                        }
                    });
                }
                LoggableViewState2 loggableViewState2LoadedState = DashboardScreen$lambda$3(snapshotState4CollectAsStateWithLifecycle).loadedState();
                UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, new Screen(Screen.Name.HOME, null, null, null, 14, null), null, null, null, null, 61, null);
                int i9 = i4;
                C136772 c136772 = new C136772(dashboardType, loaded, modifier3, snapshotState, snapshotState4CollectAsStateWithLifecycle, dashboardDuxo3, z, lazyListStateRememberLazyListState);
                z2 = z;
                int i10 = i5;
                continuation2 = continuation;
                ScreenLoggable2.ScreenLoggable(loggableViewState2LoadedState, userInteractionEventDescriptor, true, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(192006778, true, c136772, composerStartRestartGroup, 54), composerStartRestartGroup, 100663680, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = composerStartRestartGroup.changedInstance(dashboardDuxo3) | composerStartRestartGroup.changedInstance(dashboardType) | ((i9 & 112) != i10);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new DashboardScreen3(dashboardDuxo3, dashboardType, z2, continuation2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(dashboardType, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i9 & 14);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                dashboardDuxo4 = dashboardDuxo3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                dashboardDuxo4 = dashboardDuxo2;
            }
            final LazyListState lazyListState2 = lazyListStateRememberLazyListState;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.dashboard.lib.DashboardScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return DashboardScreen.DashboardScreen$lambda$10(dashboardType, z2, modifier3, lazyListState2, dashboardDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        if ((i3 & 9363) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i6 == 0) {
                }
                if ((i2 & 8) != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                Modifier modifier52 = modifier4;
                i4 = i3;
                modifier3 = modifier52;
                i5 = 32;
                dashboardDuxo3 = dashboardDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(dashboardDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                DashboardViewState dashboardViewStateDashboardScreen$lambda$32 = DashboardScreen$lambda$3(snapshotState4CollectAsStateWithLifecycle3);
                if (!(dashboardViewStateDashboardScreen$lambda$32 instanceof DashboardViewState.Loaded)) {
                }
                final Flow eventFlow2 = dashboardDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state2 = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.android.dashboard.lib.DashboardScreenKt$DashboardScreen$$inlined$collectEventAsStateWithLifecycle$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation3) {
                        Object objCollect = eventFlow2.collect(new AnonymousClass2(flowCollector), continuation3);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.dashboard.lib.DashboardScreenKt$DashboardScreen$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.dashboard.lib.DashboardScreenKt$DashboardScreen$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "DashboardScreen.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.dashboard.lib.DashboardScreenKt$DashboardScreen$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof DashboardEvent) {
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
                Event<DashboardEvent> value2 = eventFlow2.getValue();
                event = value2;
                if (!((event == null ? event.getData() : null) instanceof DashboardEvent)) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue != companion.getEmpty()) {
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                eventDashboardScreen$lambda$4 = DashboardScreen$lambda$4(snapshotState4CollectAsStateWithLifecycle22);
                if (eventDashboardScreen$lambda$4 != null) {
                    eventConsumerInvoke.consume(eventDashboardScreen$lambda$4, new Function1() { // from class: com.robinhood.android.dashboard.lib.DashboardScreenKt$DashboardScreen$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m13180invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m13180invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            DashboardScreen.DashboardScreen$lambda$7(snapshotState, true);
                        }
                    });
                }
                LoggableViewState2 loggableViewState2LoadedState2 = DashboardScreen$lambda$3(snapshotState4CollectAsStateWithLifecycle3).loadedState();
                UserInteractionEventDescriptor userInteractionEventDescriptor2 = new UserInteractionEventDescriptor(null, new Screen(Screen.Name.HOME, null, null, null, 14, null), null, null, null, null, 61, null);
                int i92 = i4;
                C136772 c1367722 = new C136772(dashboardType, loaded, modifier3, snapshotState, snapshotState4CollectAsStateWithLifecycle3, dashboardDuxo3, z, lazyListStateRememberLazyListState);
                z2 = z;
                int i102 = i5;
                continuation2 = continuation;
                ScreenLoggable2.ScreenLoggable(loggableViewState2LoadedState2, userInteractionEventDescriptor2, true, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(192006778, true, c1367722, composerStartRestartGroup, 54), composerStartRestartGroup, 100663680, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = composerStartRestartGroup.changedInstance(dashboardDuxo3) | composerStartRestartGroup.changedInstance(dashboardType) | ((i92 & 112) != i102);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue2 = new DashboardScreen3(dashboardDuxo3, dashboardType, z2, continuation2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(dashboardType, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i92 & 14);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    dashboardDuxo4 = dashboardDuxo3;
                }
            }
        }
        final LazyListState lazyListState22 = lazyListStateRememberLazyListState;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DashboardScreen$lambda$7(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: DashboardScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.dashboard.lib.DashboardScreenKt$DashboardScreen$2 */
    static final class C136772 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ DashboardViewState.Loaded $concreteState;
        final /* synthetic */ HomeDashboardType $dashboardType;
        final /* synthetic */ DashboardDuxo $duxo;
        final /* synthetic */ boolean $isEmbedded;
        final /* synthetic */ LazyListState $listState;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ SnapshotState<Boolean> $showFxSwitcherFtux$delegate;
        final /* synthetic */ SnapshotState4<DashboardViewState> $state$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        C136772(HomeDashboardType homeDashboardType, DashboardViewState.Loaded loaded, Modifier modifier, SnapshotState<Boolean> snapshotState, SnapshotState4<? extends DashboardViewState> snapshotState4, DashboardDuxo dashboardDuxo, boolean z, LazyListState lazyListState) {
            this.$dashboardType = homeDashboardType;
            this.$concreteState = loaded;
            this.$modifier = modifier;
            this.$showFxSwitcherFtux$delegate = snapshotState;
            this.$state$delegate = snapshotState4;
            this.$duxo = dashboardDuxo;
            this.$isEmbedded = z;
            this.$listState = lazyListState;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState) {
            DashboardScreen.DashboardScreen$lambda$7(snapshotState, false);
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(192006778, i, -1, "com.robinhood.android.dashboard.lib.DashboardScreen.<anonymous> (DashboardScreen.kt:148)");
            }
            String accountNumber = this.$dashboardType.getAccountNumber();
            if (!DashboardScreen.DashboardScreen$lambda$6(this.$showFxSwitcherFtux$delegate) || this.$concreteState == null || accountNumber == null) {
                composer.startReplaceGroup(-822087320);
                Modifier modifierPerformanceIndicator = com.robinhood.android.compose.autoeventlogging.ModifiersKt.performanceIndicator(Modifier.INSTANCE, DashboardScreen.DashboardScreen$lambda$3(this.$state$delegate).loadedState());
                DashboardDuxo dashboardDuxo = this.$duxo;
                HomeDashboardType homeDashboardType = this.$dashboardType;
                boolean z = this.$isEmbedded;
                Modifier modifier = this.$modifier;
                LazyListState lazyListState = this.$listState;
                SnapshotState4<DashboardViewState> snapshotState4 = this.$state$delegate;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierPerformanceIndicator);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                DashboardViewState dashboardViewStateDashboardScreen$lambda$3 = DashboardScreen.DashboardScreen$lambda$3(snapshotState4);
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance = composer.changedInstance(dashboardDuxo);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new DashboardScreen2(dashboardDuxo);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                DashboardScreen.InternalDashboardScreen(dashboardViewStateDashboardScreen$lambda$3, homeDashboardType, z, modifier, lazyListState, (Function0) ((KFunction) objRememberedValue), composer, 0, 0);
                composer.endNode();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-822367622);
                DashboardViewState.Loaded loaded = this.$concreteState;
                Modifier modifier2 = this.$modifier;
                composer.startReplaceGroup(5004770);
                final SnapshotState<Boolean> snapshotState = this.$showFxSwitcherFtux$delegate;
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.dashboard.lib.DashboardScreenKt$DashboardScreen$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DashboardScreen.C136772.invoke$lambda$1$lambda$0(snapshotState);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                FxSwitcherFtux4.FxSwitcherFtux(accountNumber, loaded, modifier2, null, (Function0) objRememberedValue2, composer, 24576, 8);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }
}
