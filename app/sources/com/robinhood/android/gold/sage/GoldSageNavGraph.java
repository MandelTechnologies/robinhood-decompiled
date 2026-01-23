package com.robinhood.android.gold.sage;

import android.net.Uri;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.gold.sage.GoldSageDestinations6;
import com.robinhood.android.navigation.compose.ComposableCompanion;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.NavGraphBuilders;
import com.robinhood.rosetta.eventlogging.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldSageNavGraph.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a£\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042#\u0010\u0005\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00010\u00062#\u0010\u000b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0000¨\u0006\u0015"}, m3636d2 = {"goldSageNavGraph", "", "Landroidx/navigation/NavGraphBuilder;", "navController", "Landroidx/navigation/NavHostController;", "openUrlExternally", "Lkotlin/Function1;", "Landroid/net/Uri;", "Lkotlin/ParameterName;", "name", "uri", "openUrlInApp", "finishActivity", "Lkotlin/Function0;", "handleError", "", "error", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "sageId", "", "feature-gold-sage_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.sage.GoldSageNavGraphKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldSageNavGraph {
    public static final void goldSageNavGraph(NavGraphBuilder navGraphBuilder, final NavHostController navController, final Function1<? super Uri, Unit> openUrlExternally, final Function1<? super Uri, Unit> openUrlInApp, final Function0<Unit> finishActivity, final Function1<? super Throwable, Unit> handleError, final Context loggingContext, final String str) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(openUrlExternally, "openUrlExternally");
        Intrinsics.checkNotNullParameter(openUrlInApp, "openUrlInApp");
        Intrinsics.checkNotNullParameter(finishActivity, "finishActivity");
        Intrinsics.checkNotNullParameter(handleError, "handleError");
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        NavGraphBuilders.navigation(navGraphBuilder, GoldSageDestinations2.INSTANCE, GoldSageDestinations.INSTANCE, new Function1() { // from class: com.robinhood.android.gold.sage.GoldSageNavGraphKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GoldSageNavGraph.goldSageNavGraph$lambda$0(navController, handleError, loggingContext, str, openUrlExternally, openUrlInApp, finishActivity, (NavGraphBuilder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit goldSageNavGraph$lambda$0(NavHostController navHostController, Function1 function1, final Context context, String str, final Function1 function12, final Function1 function13, final Function0 function0, NavGraphBuilder navigation) {
        Intrinsics.checkNotNullParameter(navigation, "$this$navigation");
        NavGraphBuilders.composable(navigation, navHostController, GoldSageDestinations2.INSTANCE, ComposableLambda3.composableLambdaInstance(-135606725, true, new GoldSageNavGraph2(function1)));
        NavGraphBuilders.composable(navigation, navHostController, GoldSageDestinations3.INSTANCE, ComposableLambda3.composableLambdaInstance(-1359392334, true, new GoldSageNavGraph3(context)));
        NavGraphBuilders.composable(navigation, navHostController, GoldSageDestinations5.INSTANCE, ComposableLambda3.composableLambdaInstance(-711164877, true, new GoldSageNavGraph4(context)));
        NavGraphBuilders.composable(navigation, navHostController, GoldSageDestinations4.INSTANCE, ComposableLambda3.composableLambdaInstance(-62937420, true, new GoldSageNavGraph5(function1, context, str)));
        NavGraphBuilders.composable(navigation, navHostController, GoldSageDestinations6.INSTANCE, ComposableLambda3.composableLambdaInstance(585290037, true, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.sage.GoldSageNavGraphKt$goldSageNavGraph$1$5
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
                    ComposerKt.traceEventStart(585290037, i, -1, "com.robinhood.android.gold.sage.goldSageNavGraph.<anonymous>.<anonymous> (GoldSageNavGraph.kt:74)");
                }
                GoldSageApplicationComposable.GoldSageApplicationComposable(((GoldSageDestinations6.Args) ComposableCompanion.args(entry)).getSageApplicationResponse(), function12, function13, function0, null, null, context, composer, 0, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }
}
