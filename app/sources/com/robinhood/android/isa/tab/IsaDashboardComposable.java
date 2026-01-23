package com.robinhood.android.isa.tab;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavHostController2;
import com.robinhood.android.navigation.compose.destination.ComposableDestination;
import com.robinhood.compose.app.composeNavigation.GenericNavHost;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.p320db.Account;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: IsaDashboardComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"IsaDashboardComposable", "", "accounts", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/robinhood/models/db/Account;", "(Lkotlinx/collections/immutable/PersistentList;Landroidx/compose/runtime/Composer;I)V", "feature-isa-tab_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.isa.tab.IsaDashboardComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class IsaDashboardComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IsaDashboardComposable$lambda$2(ImmutableList3 immutableList3, int i, Composer composer, int i2) {
        IsaDashboardComposable(immutableList3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void IsaDashboardComposable(final ImmutableList3<Account> accounts2, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1507439863);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(accounts2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1507439863, i2, -1, "com.robinhood.android.isa.tab.IsaDashboardComposable (IsaDashboardComposable.kt:13)");
            }
            final Account account = (Account) CollectionsKt.first((List) accounts2);
            NavHostController navHostControllerRememberNavController = NavHostController2.rememberNavController(new Navigator[0], composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(account);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function2() { // from class: com.robinhood.android.isa.tab.IsaDashboardComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return IsaDashboardComposable.IsaDashboardComposable$lambda$1$lambda$0(account, (NavGraphBuilder) obj, (NavHostController) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            GenericNavHost.m20570GenericNavHostuDo3WH8(navHostControllerRememberNavController, extensions2.persistentSetOf((Function2) objRememberedValue), IsaDashboardDestinations2.INSTANCE, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), null, composerStartRestartGroup, ComposableDestination.$stable << 6, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.isa.tab.IsaDashboardComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IsaDashboardComposable.IsaDashboardComposable$lambda$2(accounts2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IsaDashboardComposable$lambda$1$lambda$0(Account account, NavGraphBuilder persistentSetOf, NavHostController controller) {
        Intrinsics.checkNotNullParameter(persistentSetOf, "$this$persistentSetOf");
        Intrinsics.checkNotNullParameter(controller, "controller");
        IsaDashboardNavGraph.isaDashboardNavGraph(persistentSetOf, controller, account.getAccountNumber());
        return Unit.INSTANCE;
    }
}
