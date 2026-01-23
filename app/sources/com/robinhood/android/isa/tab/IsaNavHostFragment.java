package com.robinhood.android.isa.tab;

import android.os.Parcelable;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.isa.contracts.IsaNavHostFragmentKey;
import com.robinhood.android.isa.onboarding.IsaSignUpComposable;
import com.robinhood.android.isa.tab.IsaNavHostDuxo2;
import com.robinhood.android.navigation.FragmentResolverCompanion;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.StocksAndSharesIsaRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.composeNavigation.BaseComposeNavHostFragment;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableSet;
import kotlinx.collections.immutable.extensions2;

/* compiled from: IsaNavHostFragment.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0001%B\u0007¢\u0006\u0004\b\u0003\u0010\u0004JO\u0010\u0011\u001a\u00020\u00122@\u0010\u0013\u001a<\u00128\u00126\u0012\u0004\u0012\u00020\u0016\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00120\u0015j\u0007`\u001d¢\u0006\u0002\b\u001b¢\u0006\u0002\b\u001b¢\u0006\u0002\b\u001c0\u0014H\u0017¢\u0006\u0002\u0010\u001eJ\t\u0010\u001f\u001a\u00020\u0006H\u0096\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0018\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!X\u0096\u0005¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&²\u0006\n\u0010'\u001a\u00020(X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/isa/tab/IsaNavHostFragment;", "Lcom/robinhood/compose/app/composeNavigation/BaseComposeNavHostFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "toolbarVisible", "", "getToolbarVisible", "()Z", "hasBottomBar", "getHasBottomBar", "duxo", "Lcom/robinhood/android/isa/tab/IsaNavHostDuxo;", "getDuxo", "()Lcom/robinhood/android/isa/tab/IsaNavHostDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "NavHostComposeContent", "", "navGraphsBuilders", "Lkotlinx/collections/immutable/ImmutableSet;", "Lkotlin/Function2;", "Landroidx/navigation/NavGraphBuilder;", "Landroidx/navigation/NavHostController;", "Lkotlin/ParameterName;", "name", "navController", "Lkotlin/jvm/JvmSuppressWildcards;", "Lkotlin/ExtensionFunctionType;", "Lcom/robinhood/android/navigation/compose/NavGraphBuilderFn;", "(Lkotlinx/collections/immutable/ImmutableSet;Landroidx/compose/runtime/Composer;I)V", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-isa-tab_externalDebug", "viewState", "Lcom/robinhood/android/isa/tab/IsaLoadingViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class IsaNavHostFragment extends BaseComposeNavHostFragment implements RegionGated {
    private final boolean toolbarVisible;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(StocksAndSharesIsaRegionGate.INSTANCE);
    private final boolean hasBottomBar = true;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, IsaNavHostDuxo.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavHostComposeContent$lambda$1(IsaNavHostFragment isaNavHostFragment, ImmutableSet immutableSet, int i, Composer composer, int i2) {
        isaNavHostFragment.NavHostComposeContent(immutableSet, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    @Override // com.robinhood.compose.app.composeNavigation.BaseComposeNavHostFragment, com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getHasBottomBar() {
        return this.hasBottomBar;
    }

    private final IsaNavHostDuxo getDuxo() {
        return (IsaNavHostDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.composeNavigation.BaseComposeNavHostFragment
    public void NavHostComposeContent(final ImmutableSet<Function2<NavGraphBuilder, NavHostController, Unit>> navGraphsBuilders, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(navGraphsBuilders, "navGraphsBuilders");
        Composer composerStartRestartGroup = composer.startRestartGroup(603971832);
        if ((i & 48) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 17) != 16 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(603971832, i2, -1, "com.robinhood.android.isa.tab.IsaNavHostFragment.NavHostComposeContent (IsaNavHostFragment.kt:31)");
            }
            IsaNavHostDuxo2 dashboardState = NavHostComposeContent$lambda$0(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)).getDashboardState();
            if (Intrinsics.areEqual(dashboardState, IsaNavHostDuxo2.Loading.INSTANCE)) {
                composerStartRestartGroup.startReplaceGroup(596355070);
                LoadingScreenComposablesKt.GenericLoadingScreenComposable(WindowInsetsPadding_androidKt.statusBarsPadding(Modifier.INSTANCE), false, composerStartRestartGroup, 0, 2);
                composerStartRestartGroup.endReplaceGroup();
            } else if (Intrinsics.areEqual(dashboardState, IsaNavHostDuxo2.SignUp.INSTANCE)) {
                composerStartRestartGroup.startReplaceGroup(596359597);
                IsaSignUpComposable.IsaSignUpComposable(null, null, composerStartRestartGroup, 0, 3);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(dashboardState instanceof IsaNavHostDuxo2.Dashboard)) {
                    composerStartRestartGroup.startReplaceGroup(596352593);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(596361883);
                IsaDashboardComposable.IsaDashboardComposable(extensions2.toPersistentList(((IsaNavHostDuxo2.Dashboard) dashboardState).getAccounts()), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.isa.tab.IsaNavHostFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IsaNavHostFragment.NavHostComposeContent$lambda$1(this.f$0, navGraphsBuilders, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: IsaNavHostFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/isa/tab/IsaNavHostFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverCompanion;", "Lcom/robinhood/android/isa/tab/IsaNavHostFragment;", "Lcom/robinhood/android/isa/contracts/IsaNavHostFragmentKey;", "<init>", "()V", "feature-isa-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverCompanion<IsaNavHostFragment, IsaNavHostFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(IsaNavHostFragmentKey isaNavHostFragmentKey) {
            return FragmentResolverCompanion.DefaultImpls.createFragment(this, isaNavHostFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public /* bridge */ /* synthetic */ Parcelable getArgs(Fragment fragment) {
            return (Parcelable) getArgs((IsaNavHostFragment) fragment);
        }

        public Void getArgs(IsaNavHostFragment isaNavHostFragment) {
            return FragmentResolverCompanion.DefaultImpls.getArgs(this, isaNavHostFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public IsaNavHostFragment newInstance() {
            return (IsaNavHostFragment) FragmentResolverCompanion.DefaultImpls.newInstance(this);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public IsaNavHostFragment newInstance(Void r1) {
            return (IsaNavHostFragment) FragmentResolverCompanion.DefaultImpls.newInstance(this, r1);
        }
    }

    private static final IsaLoadingViewState NavHostComposeContent$lambda$0(SnapshotState4<IsaLoadingViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
