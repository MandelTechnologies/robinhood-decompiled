package com.robinhood.android.equities.rhvtrailer;

import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavHostController2;
import androidx.view.OnBackPressedDispatcher;
import androidx.view.OnBackPressedDispatcherOwner;
import androidx.view.compose.BackHandler5;
import com.robinhood.android.equities.contracts.ventures.RhvTrailerFragmentKey;
import com.robinhood.android.equities.rhvtrailer.RhvTrailerNavHostFragment;
import com.robinhood.android.navigation.FragmentResolverCompanion;
import com.robinhood.android.navigation.compose.destination.ComposableDestination;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.VenturesRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.composeNavigation.BaseComposeNavHostFragment;
import com.robinhood.compose.app.composeNavigation.BaseComposeNavHostFragment2;
import com.robinhood.compose.app.composeNavigation.GenericNavHost;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.utils.p409ui.edge2edge.EdgeToEdgeHost;
import com.robinhood.utils.p409ui.edge2edge.LocalEdgeToEdgeHost;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.collections.immutable.ImmutableSet;
import kotlinx.collections.immutable.extensions2;

/* compiled from: RhvTrailerNavHostFragment.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u0007¢\u0006\u0004\b\u0003\u0010\u0004JE\u0010\u0005\u001a\u00020\u000626\u0010\u0007\u001a2\u0012.\u0012,\u0012\u0004\u0012\u00020\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00060\tj\u0002`\u0010¢\u0006\u0002\b\u000f0\bH\u0017¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\t\u0010\u0014\u001a\u00020\u0013H\u0096\u0001R\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/equities/rhvtrailer/RhvTrailerNavHostFragment;", "Lcom/robinhood/compose/app/composeNavigation/BaseComposeNavHostFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "NavHostComposeContent", "", "navGraphsBuilders", "Lkotlinx/collections/immutable/ImmutableSet;", "Lkotlin/Function2;", "Landroidx/navigation/NavGraphBuilder;", "Landroidx/navigation/NavHostController;", "Lkotlin/ParameterName;", "name", "navController", "Lkotlin/ExtensionFunctionType;", "Lcom/robinhood/android/navigation/compose/NavGraphBuilderFn;", "(Lkotlinx/collections/immutable/ImmutableSet;Landroidx/compose/runtime/Composer;I)V", "onBackPressed", "", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-rhv-trailer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RhvTrailerNavHostFragment extends BaseComposeNavHostFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(VenturesRegionGate.INSTANCE);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavHostComposeContent$lambda$0(RhvTrailerNavHostFragment rhvTrailerNavHostFragment, ImmutableSet immutableSet, int i, Composer composer, int i2) {
        rhvTrailerNavHostFragment.NavHostComposeContent(immutableSet, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    @Override // com.robinhood.compose.app.composeNavigation.BaseComposeNavHostFragment
    public void NavHostComposeContent(final ImmutableSet<? extends Function2<? super NavGraphBuilder, ? super NavHostController, Unit>> navGraphsBuilders, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(navGraphsBuilders, "navGraphsBuilders");
        Composer composerStartRestartGroup = composer.startRestartGroup(-595280712);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(navGraphsBuilders) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-595280712, i2, -1, "com.robinhood.android.equities.rhvtrailer.RhvTrailerNavHostFragment.NavHostComposeContent (RhvTrailerNavHostFragment.kt:27)");
            }
            NavHostController navHostControllerRememberNavController = NavHostController2.rememberNavController(new Navigator[0], composerStartRestartGroup, 0);
            OnBackPressedDispatcherOwner current = BackHandler5.INSTANCE.getCurrent(composerStartRestartGroup, BackHandler5.$stable);
            OnBackPressedDispatcher onBackPressedDispatcher = current != null ? current.getOnBackPressedDispatcher() : null;
            EdgeToEdgeHost edgeToEdgeHost = (EdgeToEdgeHost) composerStartRestartGroup.consume(LocalEdgeToEdgeHost.getLocalEdgeToEdgeHost());
            if (edgeToEdgeHost != null) {
                edgeToEdgeHost.overrideSystemBarsStyle(false);
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(318085744, true, new C147611(navGraphsBuilders, navHostControllerRememberNavController, onBackPressedDispatcher), composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.rhvtrailer.RhvTrailerNavHostFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhvTrailerNavHostFragment.NavHostComposeContent$lambda$0(this.f$0, navGraphsBuilders, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: RhvTrailerNavHostFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equities.rhvtrailer.RhvTrailerNavHostFragment$NavHostComposeContent$1 */
    static final class C147611 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ OnBackPressedDispatcher $backPressedDispatcher;
        final /* synthetic */ NavHostController $navController;
        final /* synthetic */ ImmutableSet<Function2<NavGraphBuilder, NavHostController, Unit>> $navGraphsBuilders;

        /* JADX WARN: Multi-variable type inference failed */
        C147611(ImmutableSet<? extends Function2<? super NavGraphBuilder, ? super NavHostController, Unit>> immutableSet, NavHostController navHostController, OnBackPressedDispatcher onBackPressedDispatcher) {
            this.$navGraphsBuilders = immutableSet;
            this.$navController = navHostController;
            this.$backPressedDispatcher = onBackPressedDispatcher;
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
                ComposerKt.traceEventStart(318085744, i, -1, "com.robinhood.android.equities.rhvtrailer.RhvTrailerNavHostFragment.NavHostComposeContent.<anonymous> (RhvTrailerNavHostFragment.kt:34)");
            }
            long jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU();
            TrailerLandingDestination trailerLandingDestination = TrailerLandingDestination.INSTANCE;
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.addSpread(this.$navGraphsBuilders.toArray(new Function2[0]));
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(this.$navController) | composer.changedInstance(this.$backPressedDispatcher);
            final NavHostController navHostController = this.$navController;
            final OnBackPressedDispatcher onBackPressedDispatcher = this.$backPressedDispatcher;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function2() { // from class: com.robinhood.android.equities.rhvtrailer.RhvTrailerNavHostFragment$NavHostComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RhvTrailerNavHostFragment.C147611.invoke$lambda$2$lambda$1(navHostController, onBackPressedDispatcher, (NavGraphBuilder) obj, (NavHostController) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            spreadBuilder.add((Function2) objRememberedValue);
            GenericNavHost.m20570GenericNavHostuDo3WH8(this.$navController, extensions2.persistentSetOf(spreadBuilder.toArray(new Function2[spreadBuilder.size()])), trailerLandingDestination, jM21371getBg0d7_KjU, null, composer, ComposableDestination.$stable << 6, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(NavHostController navHostController, final OnBackPressedDispatcher onBackPressedDispatcher, NavGraphBuilder persistentSetOf, NavHostController it) {
            Intrinsics.checkNotNullParameter(persistentSetOf, "$this$persistentSetOf");
            Intrinsics.checkNotNullParameter(it, "it");
            RhvTrailerNavGraph.rhvTrailerNavGraph(persistentSetOf, navHostController, new Function0() { // from class: com.robinhood.android.equities.rhvtrailer.RhvTrailerNavHostFragment$NavHostComposeContent$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RhvTrailerNavHostFragment.C147611.invoke$lambda$2$lambda$1$lambda$0(onBackPressedDispatcher);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(OnBackPressedDispatcher onBackPressedDispatcher) {
            if (onBackPressedDispatcher != null) {
                onBackPressedDispatcher.onBackPressed();
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.compose.app.composeNavigation.BaseComposeNavHostFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        return BaseComposeNavHostFragment2.handleBackPressForComposeNavHostFragment(this);
    }

    /* compiled from: RhvTrailerNavHostFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equities/rhvtrailer/RhvTrailerNavHostFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverCompanion;", "Lcom/robinhood/android/equities/rhvtrailer/RhvTrailerNavHostFragment;", "Lcom/robinhood/android/equities/contracts/ventures/RhvTrailerFragmentKey;", "<init>", "()V", "feature-rhv-trailer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverCompanion<RhvTrailerNavHostFragment, RhvTrailerFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(RhvTrailerFragmentKey rhvTrailerFragmentKey) {
            return FragmentResolverCompanion.DefaultImpls.createFragment(this, rhvTrailerFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public /* bridge */ /* synthetic */ Parcelable getArgs(Fragment fragment) {
            return (Parcelable) getArgs((RhvTrailerNavHostFragment) fragment);
        }

        public Void getArgs(RhvTrailerNavHostFragment rhvTrailerNavHostFragment) {
            return FragmentResolverCompanion.DefaultImpls.getArgs(this, rhvTrailerNavHostFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public RhvTrailerNavHostFragment newInstance() {
            return (RhvTrailerNavHostFragment) FragmentResolverCompanion.DefaultImpls.newInstance(this);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public RhvTrailerNavHostFragment newInstance(Void r1) {
            return (RhvTrailerNavHostFragment) FragmentResolverCompanion.DefaultImpls.newInstance(this, r1);
        }
    }
}
