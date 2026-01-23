package com.robinhood.android.transfers.recurring.p270ui.experiment;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.PaddingKt;
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
import com.robinhood.android.transfers.recurring.p270ui.experiment.RecurringDepositHubDestinations;
import com.robinhood.android.transfers.recurring.p270ui.experiment.details.DetailsComposable;
import com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.RecurringDepositExtraCashNavGraph7;
import com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.create.CreateComposable5;
import com.robinhood.android.transfers.recurring.p270ui.experiment.hub.RecurringDepositHubComposable4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.userleap.survey.Survey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringDepositHubNavGraph.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aD\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\bH\u0000¨\u0006\f"}, m3636d2 = {"recurringDepositHubNavGraph", "", "Landroidx/navigation/NavGraphBuilder;", "navController", "Landroidx/navigation/NavHostController;", "createCallbacks", "Lcom/robinhood/android/transfers/recurring/ui/experiment/extracash/create/CreateCallbacks;", "onLegacyRecurringDepositRowClick", "Lkotlin/Function1;", "", "showSurvey", "Lcom/robinhood/userleap/survey/Survey;", "feature-recurring-deposits_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.RecurringDepositHubNavGraphKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class RecurringDepositHubNavGraph {
    public static final void recurringDepositHubNavGraph(NavGraphBuilder navGraphBuilder, NavHostController navController, CreateComposable5 createCallbacks, final Function1<? super String, Unit> onLegacyRecurringDepositRowClick, final Function1<? super Survey, Unit> showSurvey) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(createCallbacks, "createCallbacks");
        Intrinsics.checkNotNullParameter(onLegacyRecurringDepositRowClick, "onLegacyRecurringDepositRowClick");
        Intrinsics.checkNotNullParameter(showSurvey, "showSurvey");
        NavGraphBuilders.composable(navGraphBuilder, navController, RecurringDepositHubDestinations.INSTANCE, ComposableLambda3.composableLambdaInstance(1674587931, true, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.RecurringDepositHubNavGraphKt.recurringDepositHubNavGraph.1
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
                    ComposerKt.traceEventStart(1674587931, i, -1, "com.robinhood.android.transfers.recurring.ui.experiment.recurringDepositHubNavGraph.<anonymous> (RecurringDepositHubNavGraph.kt:23)");
                }
                DetailsComposable.DetailsComposable((RecurringDepositHubDestinations.Args) ComposableCompanion.args(entry), showSurvey, PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null), null, composer, 0, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        NavGraphBuilders.composable(navGraphBuilder, navController, RecurringDepositHubDestinations2.INSTANCE, ComposableLambda3.composableLambdaInstance(98616516, true, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.RecurringDepositHubNavGraphKt.recurringDepositHubNavGraph.2
            @Override // kotlin.jvm.functions.Function5
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, NavBackStackEntry navBackStackEntry, LifecycleAwareNavigator lifecycleAwareNavigator, Composer composer, Integer num) {
                invoke(animatedVisibilityScope, navBackStackEntry, lifecycleAwareNavigator, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AnimatedVisibilityScope composable, NavBackStackEntry unused$var$, LifecycleAwareNavigator unused$var$2, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composable, "$this$composable");
                Intrinsics.checkNotNullParameter(unused$var$, "$unused$var$");
                Intrinsics.checkNotNullParameter(unused$var$2, "$unused$var$");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(98616516, i, -1, "com.robinhood.android.transfers.recurring.ui.experiment.recurringDepositHubNavGraph.<anonymous> (RecurringDepositHubNavGraph.kt:34)");
                }
                RecurringDepositHubComposable4.RecurringDepositHubComposable(onLegacyRecurringDepositRowClick, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, composer, 48, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        RecurringDepositExtraCashNavGraph7.recurringDepositExtraCashNavGraph(navGraphBuilder, navController, createCallbacks);
    }
}
