package com.robinhood.compose.app.composeNavigation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import com.robinhood.android.navigation.compose.ProvidesNavGraph;
import com.robinhood.compose.app.GenericComposeFragment;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableSet;
import kotlinx.collections.immutable.extensions2;

/* compiled from: BaseComposeNavHostFragment.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u0019\u001a\u00020\u00102@\u0010\u001a\u001a<\u00128\u00126\u0012\u0004\u0012\u00020\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\nj\u0007`\u0013¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00120\u001bH'¢\u0006\u0002\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u001eJ\b\u0010\u001f\u001a\u00020\u0005H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R^\u0010\b\u001a<\u00128\u00126\u0012\u0004\u0012\u00020\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\nj\u0007`\u0013¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00120\t8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006 "}, m3636d2 = {"Lcom/robinhood/compose/app/composeNavigation/BaseComposeNavHostFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "toolbarVisible", "", "getToolbarVisible", "()Z", "navGraphs", "", "Lkotlin/Function2;", "Landroidx/navigation/NavGraphBuilder;", "Landroidx/navigation/NavHostController;", "Lkotlin/ParameterName;", "name", "navController", "", "Lkotlin/jvm/JvmSuppressWildcards;", "Lkotlin/ExtensionFunctionType;", "Lcom/robinhood/android/navigation/compose/NavGraphBuilderFn;", "getNavGraphs$annotations", "getNavGraphs", "()Ljava/util/Set;", "setNavGraphs", "(Ljava/util/Set;)V", "NavHostComposeContent", "navGraphsBuilders", "Lkotlinx/collections/immutable/ImmutableSet;", "(Lkotlinx/collections/immutable/ImmutableSet;Landroidx/compose/runtime/Composer;I)V", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onBackPressed", "lib-compose-app_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public abstract class BaseComposeNavHostFragment extends GenericComposeFragment {
    public static final int $stable = 8;
    public Set<Function2<NavGraphBuilder, NavHostController, Unit>> navGraphs;
    private final boolean toolbarVisible;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(BaseComposeNavHostFragment baseComposeNavHostFragment, int i, Composer composer, int i2) {
        baseComposeNavHostFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @ProvidesNavGraph
    public static /* synthetic */ void getNavGraphs$annotations() {
    }

    public abstract void NavHostComposeContent(ImmutableSet<Function2<NavGraphBuilder, NavHostController, Unit>> immutableSet, Composer composer, int i);

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    public final Set<Function2<NavGraphBuilder, NavHostController, Unit>> getNavGraphs() {
        Set<Function2<NavGraphBuilder, NavHostController, Unit>> set = this.navGraphs;
        if (set != null) {
            return set;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navGraphs");
        return null;
    }

    public final void setNavGraphs(Set<Function2<NavGraphBuilder, NavHostController, Unit>> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.navGraphs = set;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public final void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1439553215);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1439553215, i2, -1, "com.robinhood.compose.app.composeNavigation.BaseComposeNavHostFragment.ComposeContent (BaseComposeNavHostFragment.kt:34)");
            }
            NavHostComposeContent(extensions2.toImmutableSet(getNavGraphs()), composerStartRestartGroup, (i2 << 3) & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.app.composeNavigation.BaseComposeNavHostFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BaseComposeNavHostFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        return BaseComposeNavHostFragment2.handleBackPressForComposeNavHostFragment(this);
    }
}
