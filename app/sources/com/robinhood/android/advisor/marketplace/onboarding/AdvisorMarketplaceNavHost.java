package com.robinhood.android.advisor.marketplace.onboarding;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
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
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavHostController2;
import com.robinhood.android.advisor.marketplace.onboarding.OnboardingInitialDestination;
import com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.app.composeNavigation.GenericNavHost;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.advisor.marketplace.p303db.onboarding.AdvisorDashboardState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableSet;
import kotlinx.collections.immutable.extensions2;

/* compiled from: AdvisorMarketplaceNavHost.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\u001ac\u0010\u0000\u001a\u00020\u00012@\u0010\u0002\u001a<\u00128\u00126\u0012\u0004\u0012\u00020\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u0004j\u0007`\f¢\u0006\u0002\b\n¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b0\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0011\"\u0019\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0013*\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u0084\u0002"}, m3636d2 = {"AdvisorMarketplaceNavHost", "", "navGraphsBuilders", "Lkotlinx/collections/immutable/ImmutableSet;", "Lkotlin/Function2;", "Landroidx/navigation/NavGraphBuilder;", "Landroidx/navigation/NavHostController;", "Lkotlin/ParameterName;", "name", "navController", "Lkotlin/jvm/JvmSuppressWildcards;", "Lkotlin/ExtensionFunctionType;", "Lcom/robinhood/android/navigation/compose/NavGraphBuilderFn;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/advisor/marketplace/onboarding/AdvisorMarketplaceOnboardingDashboardDuxo;", "(Lkotlinx/collections/immutable/ImmutableSet;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/advisor/marketplace/onboarding/AdvisorMarketplaceOnboardingDashboardDuxo;Landroidx/compose/runtime/Composer;II)V", "destination", "Lcom/robinhood/android/advisor/marketplace/onboarding/OnboardingInitialDestination;", "Lcom/robinhood/models/advisor/marketplace/db/onboarding/AdvisorDashboardState;", "getDestination", "(Lcom/robinhood/models/advisor/marketplace/db/onboarding/AdvisorDashboardState;)Lcom/robinhood/android/advisor/marketplace/onboarding/OnboardingInitialDestination;", "feature-advisor-marketplace-onboarding_externalDebug", "viewState", "Lcom/robinhood/android/advisor/marketplace/onboarding/AdvisorMarketplaceOnboardingDashboardViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisor.marketplace.onboarding.AdvisorMarketplaceNavHostKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AdvisorMarketplaceNavHost {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvisorMarketplaceNavHost$lambda$3(ImmutableSet immutableSet, Modifier modifier, AdvisorMarketplaceOnboardingDashboardDuxo advisorMarketplaceOnboardingDashboardDuxo, int i, int i2, Composer composer, int i3) {
        AdvisorMarketplaceNavHost(immutableSet, modifier, advisorMarketplaceOnboardingDashboardDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AdvisorMarketplaceNavHost(final ImmutableSet<Function2<NavGraphBuilder, NavHostController, Unit>> navGraphsBuilders, Modifier modifier, AdvisorMarketplaceOnboardingDashboardDuxo advisorMarketplaceOnboardingDashboardDuxo, Composer composer, final int i, final int i2) {
        int i3;
        AdvisorMarketplaceOnboardingDashboardDuxo advisorMarketplaceOnboardingDashboardDuxo2;
        Modifier modifier2;
        int i4;
        final AdvisorMarketplaceOnboardingDashboardDuxo advisorMarketplaceOnboardingDashboardDuxo3;
        final AdvisorDashboardState state;
        final Modifier modifier3;
        final AdvisorMarketplaceOnboardingDashboardDuxo advisorMarketplaceOnboardingDashboardDuxo4;
        Intrinsics.checkNotNullParameter(navGraphsBuilders, "navGraphsBuilders");
        Composer composerStartRestartGroup = composer.startRestartGroup(-793011661);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(navGraphsBuilders) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                advisorMarketplaceOnboardingDashboardDuxo2 = advisorMarketplaceOnboardingDashboardDuxo;
                int i6 = composerStartRestartGroup.changedInstance(advisorMarketplaceOnboardingDashboardDuxo2) ? 256 : 128;
                i3 |= i6;
            } else {
                advisorMarketplaceOnboardingDashboardDuxo2 = advisorMarketplaceOnboardingDashboardDuxo;
            }
            i3 |= i6;
        } else {
            advisorMarketplaceOnboardingDashboardDuxo2 = advisorMarketplaceOnboardingDashboardDuxo;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier;
            advisorMarketplaceOnboardingDashboardDuxo4 = advisorMarketplaceOnboardingDashboardDuxo2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                modifier2 = i5 != 0 ? Modifier.INSTANCE : modifier;
                if ((i2 & 4) != 0) {
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(AdvisorMarketplaceOnboardingDashboardDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.advisor.marketplace.onboarding.AdvisorMarketplaceNavHostKt$AdvisorMarketplaceNavHost$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.advisor.marketplace.onboarding.AdvisorMarketplaceNavHostKt$AdvisorMarketplaceNavHost$$inlined$duxo$1.1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                    }
                                };
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    i4 = i3 & (-897);
                    advisorMarketplaceOnboardingDashboardDuxo3 = (AdvisorMarketplaceOnboardingDashboardDuxo) baseDuxo;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-793011661, i4, -1, "com.robinhood.android.advisor.marketplace.onboarding.AdvisorMarketplaceNavHost (AdvisorMarketplaceNavHost.kt:20)");
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(advisorMarketplaceOnboardingDashboardDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup = composerStartRestartGroup;
                state = AdvisorMarketplaceNavHost$lambda$0(snapshotState4CollectAsStateWithLifecycle).getState();
                if (state == null) {
                    composerStartRestartGroup.startReplaceGroup(2005065023);
                    final NavHostController navHostControllerRememberNavController = NavHostController2.rememberNavController(new Navigator[0], composerStartRestartGroup, 0);
                    long jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU();
                    OnboardingInitialDestination<?> destination = getDestination(state);
                    SpreadBuilder spreadBuilder = new SpreadBuilder(2);
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(navHostControllerRememberNavController) | composerStartRestartGroup.changedInstance(state) | composerStartRestartGroup.changedInstance(advisorMarketplaceOnboardingDashboardDuxo3);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function2() { // from class: com.robinhood.android.advisor.marketplace.onboarding.AdvisorMarketplaceNavHostKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return AdvisorMarketplaceNavHost.AdvisorMarketplaceNavHost$lambda$2$lambda$1(navHostControllerRememberNavController, state, advisorMarketplaceOnboardingDashboardDuxo3, (NavGraphBuilder) obj, (NavHostController) obj2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    spreadBuilder.add((Function2) objRememberedValue2);
                    spreadBuilder.addSpread(navGraphsBuilders.toArray(new Function2[0]));
                    GenericNavHost.m20570GenericNavHostuDo3WH8(navHostControllerRememberNavController, extensions2.persistentSetOf(spreadBuilder.toArray(new Function2[spreadBuilder.size()])), destination, jM21371getBg0d7_KjU, modifier2, composerStartRestartGroup, (ComposableDestinationWithArgs.$stable << 6) | ((i4 << 9) & 57344), 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(2005704336);
                    AdvisorMarketplaceOnboardingComponents.AdvisorMarketplacePlaceholderScreen(modifier2, composerStartRestartGroup, (i4 >> 3) & 14, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                advisorMarketplaceOnboardingDashboardDuxo4 = advisorMarketplaceOnboardingDashboardDuxo3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                modifier2 = modifier;
            }
            i4 = i3;
            advisorMarketplaceOnboardingDashboardDuxo3 = advisorMarketplaceOnboardingDashboardDuxo2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(advisorMarketplaceOnboardingDashboardDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            composerStartRestartGroup = composerStartRestartGroup;
            state = AdvisorMarketplaceNavHost$lambda$0(snapshotState4CollectAsStateWithLifecycle2).getState();
            if (state == null) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier2;
            advisorMarketplaceOnboardingDashboardDuxo4 = advisorMarketplaceOnboardingDashboardDuxo3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisor.marketplace.onboarding.AdvisorMarketplaceNavHostKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AdvisorMarketplaceNavHost.AdvisorMarketplaceNavHost$lambda$3(navGraphsBuilders, modifier3, advisorMarketplaceOnboardingDashboardDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvisorMarketplaceNavHost$lambda$2$lambda$1(NavHostController navHostController, AdvisorDashboardState advisorDashboardState, AdvisorMarketplaceOnboardingDashboardDuxo advisorMarketplaceOnboardingDashboardDuxo, NavGraphBuilder persistentSetOf, NavHostController it) {
        Intrinsics.checkNotNullParameter(persistentSetOf, "$this$persistentSetOf");
        Intrinsics.checkNotNullParameter(it, "it");
        MarketplaceOnboardingNavGraph4.marketplaceOnboardingNavGraph(persistentSetOf, navHostController, advisorDashboardState, new AdvisorMarketplaceNavHost2(advisorMarketplaceOnboardingDashboardDuxo));
        return Unit.INSTANCE;
    }

    public static final OnboardingInitialDestination<?> getDestination(AdvisorDashboardState advisorDashboardState) {
        Intrinsics.checkNotNullParameter(advisorDashboardState, "<this>");
        if (advisorDashboardState instanceof AdvisorDashboardState.NotEnrolled) {
            return new OnboardingInitialDestination.NotEnrolled((AdvisorDashboardState.NotEnrolled) advisorDashboardState);
        }
        if (advisorDashboardState instanceof AdvisorDashboardState.Error) {
            return new OnboardingInitialDestination.Error((AdvisorDashboardState.Error) advisorDashboardState);
        }
        if (!(advisorDashboardState instanceof AdvisorDashboardState.FirstBooking) && !(advisorDashboardState instanceof AdvisorDashboardState.EnrolledNoBooking) && !(advisorDashboardState instanceof AdvisorDashboardState.PostBooking) && !Intrinsics.areEqual(advisorDashboardState, AdvisorDashboardState.RelationshipActive.INSTANCE) && !(advisorDashboardState instanceof AdvisorDashboardState.RelationshipInitiated)) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("Unsupported right now");
    }

    private static final AdvisorMarketplaceOnboardingDashboardViewState AdvisorMarketplaceNavHost$lambda$0(SnapshotState4<AdvisorMarketplaceOnboardingDashboardViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
