package com.robinhood.android.transfers.recurring.p270ui.experiment.extracash;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import com.robinhood.android.navigation.compose.ComposableCompanion;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.NavGraphBuilders;
import com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.create.CreateComposable5;
import com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.create.CreateComposable6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringDepositExtraCashNavGraph.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¨\u0006\u0007"}, m3636d2 = {"recurringDepositExtraCashNavGraph", "", "Landroidx/navigation/NavGraphBuilder;", "navController", "Landroidx/navigation/NavHostController;", "createCallbacks", "Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/create/CreateCallbacks;", "feature-recurring-deposits_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.extracash.RecurringDepositExtraCashNavGraphKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class RecurringDepositExtraCashNavGraph7 {
    public static final void recurringDepositExtraCashNavGraph(NavGraphBuilder navGraphBuilder, final NavHostController navController, final CreateComposable5 createCallbacks) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(createCallbacks, "createCallbacks");
        NavGraphBuilders.navigation(navGraphBuilder, RecurringDepositExtraCashDestinations8.INSTANCE, RecurringDepositExtraCashDestinations5.INSTANCE, new Function1() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.RecurringDepositExtraCashNavGraphKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecurringDepositExtraCashNavGraph7.recurringDepositExtraCashNavGraph$lambda$0(navController, createCallbacks, (NavGraphBuilder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit recurringDepositExtraCashNavGraph$lambda$0(NavHostController navHostController, final CreateComposable5 createComposable5, NavGraphBuilder navigation) {
        Intrinsics.checkNotNullParameter(navigation, "$this$navigation");
        RecurringDepositExtraCashDestinations8 recurringDepositExtraCashDestinations8 = RecurringDepositExtraCashDestinations8.INSTANCE;
        RecurringDepositExtraCashNavGraph recurringDepositExtraCashNavGraph = RecurringDepositExtraCashNavGraph.INSTANCE;
        NavGraphBuilders.composable(navigation, navHostController, recurringDepositExtraCashDestinations8, recurringDepositExtraCashNavGraph.getLambda$313239529$feature_recurring_deposits_externalDebug());
        NavGraphBuilders.composable(navigation, navHostController, RecurringDepositExtraCashDestinations3.INSTANCE, recurringDepositExtraCashNavGraph.m19706getLambda$898380846$feature_recurring_deposits_externalDebug());
        NavGraphBuilders.composable(navigation, navHostController, RecurringDepositExtraCashDestinations2.INSTANCE, recurringDepositExtraCashNavGraph.getLambda$1440439537$feature_recurring_deposits_externalDebug());
        NavGraphBuilders.composable(navigation, navHostController, RecurringDepositExtraCashDestinations4.INSTANCE, recurringDepositExtraCashNavGraph.m19705getLambda$515707376$feature_recurring_deposits_externalDebug());
        NavGraphBuilders.composable(navigation, navHostController, RecurringDepositExtraCashDestinations7.INSTANCE, recurringDepositExtraCashNavGraph.getLambda$1823113007$feature_recurring_deposits_externalDebug());
        NavGraphBuilders.composable(navigation, navHostController, RecurringDepositExtraCashDestinations.INSTANCE, ComposableLambda3.composableLambdaInstance(-133033906, true, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.RecurringDepositExtraCashNavGraphKt$recurringDepositExtraCashNavGraph$1$1
            @Override // kotlin.jvm.functions.Function5
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, NavBackStackEntry navBackStackEntry, LifecycleAwareNavigator lifecycleAwareNavigator, Composer composer, Integer num) {
                invoke(animatedVisibilityScope, navBackStackEntry, lifecycleAwareNavigator, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AnimatedVisibilityScope composable, NavBackStackEntry entry, LifecycleAwareNavigator unused$var$, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composable, "$this$composable");
                Intrinsics.checkNotNullParameter(entry, "entry");
                Intrinsics.checkNotNullParameter(unused$var$, "$unused$var$");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-133033906, i, -1, "com.robinhood.android.transfers.recurring.ui.experiment.extracash.recurringDepositExtraCashNavGraph.<anonymous>.<anonymous> (RecurringDepositExtraCashNavGraph.kt:67)");
                }
                CreateComposable6.CreateComposable((RecurringExtraCashData) ComposableCompanion.args(entry), createComposable5, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, composer, 384, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }
}
