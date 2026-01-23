package com.robinhood.compose.app.composeNavigation;

import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavHostController2;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableSet;

/* compiled from: ComposeNavHostFragment.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u0004\u001a\u00020\u00052@\u0010\u0006\u001a<\u00128\u00126\u0012\u0004\u0012\u00020\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00050\bj\u0007`\u0010¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000f0\u0007H\u0017¢\u0006\u0002\u0010\u0011¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/compose/app/composeNavigation/ComposeNavHostFragment;", "Lcom/robinhood/compose/app/composeNavigation/BaseComposeNavHostFragment;", "<init>", "()V", "NavHostComposeContent", "", "navGraphsBuilders", "Lkotlinx/collections/immutable/ImmutableSet;", "Lkotlin/Function2;", "Landroidx/navigation/NavGraphBuilder;", "Landroidx/navigation/NavHostController;", "Lkotlin/ParameterName;", "name", "navController", "Lkotlin/jvm/JvmSuppressWildcards;", "Lkotlin/ExtensionFunctionType;", "Lcom/robinhood/android/navigation/compose/NavGraphBuilderFn;", "(Lkotlinx/collections/immutable/ImmutableSet;Landroidx/compose/runtime/Composer;I)V", "Companion", "lib-compose-app_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class ComposeNavHostFragment extends BaseComposeNavHostFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavHostComposeContent$lambda$0(ComposeNavHostFragment composeNavHostFragment, ImmutableSet immutableSet, int i, Composer composer, int i2) {
        composeNavHostFragment.NavHostComposeContent(immutableSet, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.compose.app.composeNavigation.BaseComposeNavHostFragment
    public void NavHostComposeContent(ImmutableSet<Function2<NavGraphBuilder, NavHostController, Unit>> navGraphsBuilders, Composer composer, final int i) {
        int i2;
        final ImmutableSet<Function2<NavGraphBuilder, NavHostController, Unit>> immutableSet;
        Intrinsics.checkNotNullParameter(navGraphsBuilders, "navGraphsBuilders");
        Composer composerStartRestartGroup = composer.startRestartGroup(1451634608);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(navGraphsBuilders) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1451634608, i2, -1, "com.robinhood.compose.app.composeNavigation.ComposeNavHostFragment.NavHostComposeContent (ComposeNavHostFragment.kt:27)");
            }
            immutableSet = navGraphsBuilders;
            GenericNavHost.m20570GenericNavHostuDo3WH8(NavHostController2.rememberNavController(new Navigator[0], composerStartRestartGroup, 0), immutableSet, ((ComposeNavHostFragmentKey) INSTANCE.getArgs((Fragment) this)).getStartDestination(), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), WindowInsetsPadding_androidKt.navigationBarsPadding(Modifier.INSTANCE), composerStartRestartGroup, (i2 << 3) & 112, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            immutableSet = navGraphsBuilders;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.app.composeNavigation.ComposeNavHostFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ComposeNavHostFragment.NavHostComposeContent$lambda$0(this.f$0, immutableSet, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: ComposeNavHostFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/compose/app/composeNavigation/ComposeNavHostFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/compose/app/composeNavigation/ComposeNavHostFragment;", "Lcom/robinhood/compose/app/composeNavigation/ComposeNavHostFragmentKey;", "<init>", "()V", "lib-compose-app_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<ComposeNavHostFragment, ComposeNavHostFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(ComposeNavHostFragmentKey composeNavHostFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, composeNavHostFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public ComposeNavHostFragmentKey getArgs(ComposeNavHostFragment composeNavHostFragment) {
            return (ComposeNavHostFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, composeNavHostFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ComposeNavHostFragment newInstance(ComposeNavHostFragmentKey composeNavHostFragmentKey) {
            return (ComposeNavHostFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, composeNavHostFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ComposeNavHostFragment composeNavHostFragment, ComposeNavHostFragmentKey composeNavHostFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, composeNavHostFragment, composeNavHostFragmentKey);
        }
    }
}
