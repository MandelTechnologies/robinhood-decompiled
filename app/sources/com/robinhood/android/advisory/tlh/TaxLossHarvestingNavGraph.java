package com.robinhood.android.advisory.tlh;

import android.content.res.Resources;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptionsBuilder;
import com.robinhood.android.advisory.tlh.TaxLossHarvestingNavGraph;
import com.robinhood.android.advisory.tlh.entry.TaxLossHarvestEntryScreen;
import com.robinhood.android.advisory.tlh.flow.HarvestFlowHost;
import com.robinhood.android.advisory.tlh.gnl.GainsAndLossesScreen;
import com.robinhood.android.advisory.tlh.summary.TaxLossHarvestingDashboardScreen;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.NavGraphBuilders;
import com.robinhood.android.navigation.compose.NavOptionsBuilders;
import com.robinhood.android.navigation.compose.destination.ComposableDestination;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TaxLossHarvestingNavGraph.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0000¨\u0006\u0007"}, m3636d2 = {"taxLossHarvestingNavGraph", "", "Landroidx/navigation/NavGraphBuilder;", "navController", "Landroidx/navigation/NavHostController;", "onExitNavGraph", "Lkotlin/Function0;", "feature-tax-loss-harvesting_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.tlh.TaxLossHarvestingNavGraphKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class TaxLossHarvestingNavGraph {

    /* compiled from: TaxLossHarvestingNavGraph.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advisory.tlh.TaxLossHarvestingNavGraphKt$taxLossHarvestingNavGraph$1 */
    static final class C93811 implements Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> {
        final /* synthetic */ Function0<Unit> $onExitNavGraph;

        C93811(Function0<Unit> function0) {
            this.$onExitNavGraph = function0;
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, NavBackStackEntry navBackStackEntry, LifecycleAwareNavigator lifecycleAwareNavigator, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, navBackStackEntry, lifecycleAwareNavigator, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope composable, NavBackStackEntry unused$var$, final LifecycleAwareNavigator navigator, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(composable, "$this$composable");
            Intrinsics.checkNotNullParameter(unused$var$, "$unused$var$");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2070349472, i, -1, "com.robinhood.android.advisory.tlh.taxLossHarvestingNavGraph.<anonymous> (TaxLossHarvestingNavGraph.kt:16)");
            }
            Function0<Unit> function0 = this.$onExitNavGraph;
            composer.startReplaceGroup(5004770);
            boolean z = (((i & 896) ^ 384) > 256 && composer.changed(navigator)) || (i & 384) == 256;
            Object objRememberedValue = composer.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.tlh.TaxLossHarvestingNavGraphKt$taxLossHarvestingNavGraph$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TaxLossHarvestingNavGraph.C93811.invoke$lambda$2$lambda$1(navigator, (ComposableDestination) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            TaxLossHarvestEntryScreen.TaxLossHarvestEntryScreen(function0, null, (Function1) objRememberedValue, null, composer, 0, 10);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(LifecycleAwareNavigator lifecycleAwareNavigator, ComposableDestination destination) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(destination, "destination");
            LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, destination, null, null, false, new Function1() { // from class: com.robinhood.android.advisory.tlh.TaxLossHarvestingNavGraphKt$taxLossHarvestingNavGraph$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TaxLossHarvestingNavGraph.C93811.invoke$lambda$2$lambda$1$lambda$0((NavOptionsBuilder) obj);
                }
            }, 14, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(NavOptionsBuilder navigate) {
            Intrinsics.checkNotNullParameter(navigate, "$this$navigate");
            NavOptionsBuilders.popUpTo(navigate, TaxLossHarvestingEntryDestination.INSTANCE.getRoutePath(), true);
            navigate.setLaunchSingleTop(true);
            return Unit.INSTANCE;
        }
    }

    public static final void taxLossHarvestingNavGraph(NavGraphBuilder navGraphBuilder, NavHostController navController, final Function0<Unit> onExitNavGraph) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(onExitNavGraph, "onExitNavGraph");
        NavGraphBuilders.composable(navGraphBuilder, navController, TaxLossHarvestingEntryDestination.INSTANCE, ComposableLambda3.composableLambdaInstance(-2070349472, true, new C93811(onExitNavGraph)));
        NavGraphBuilders.composable(navGraphBuilder, navController, TaxLossHarvestDashboardDestination.INSTANCE, ComposableLambda3.composableLambdaInstance(258987607, true, new C93822(onExitNavGraph)));
        NavGraphBuilders.composable(navGraphBuilder, navController, TaxLossHarvestFlowDestination.INSTANCE, ComposableLambda3.composableLambdaInstance(-443608232, true, new C93833(navController, onExitNavGraph)));
        NavGraphBuilders.composable(navGraphBuilder, navController, GainsAndLossesDestination.INSTANCE, ComposableLambda3.composableLambdaInstance(-1146204071, true, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.tlh.TaxLossHarvestingNavGraphKt.taxLossHarvestingNavGraph.4
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
                    ComposerKt.traceEventStart(-1146204071, i, -1, "com.robinhood.android.advisory.tlh.taxLossHarvestingNavGraph.<anonymous> (TaxLossHarvestingNavGraph.kt:57)");
                }
                GainsAndLossesScreen.GainsAndLossesScreen(onExitNavGraph, null, null, composer, 0, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    /* compiled from: TaxLossHarvestingNavGraph.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advisory.tlh.TaxLossHarvestingNavGraphKt$taxLossHarvestingNavGraph$2 */
    static final class C93822 implements Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> {
        final /* synthetic */ Function0<Unit> $onExitNavGraph;

        C93822(Function0<Unit> function0) {
            this.$onExitNavGraph = function0;
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, NavBackStackEntry navBackStackEntry, LifecycleAwareNavigator lifecycleAwareNavigator, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, navBackStackEntry, lifecycleAwareNavigator, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope composable, NavBackStackEntry unused$var$, final LifecycleAwareNavigator navigator, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(composable, "$this$composable");
            Intrinsics.checkNotNullParameter(unused$var$, "$unused$var$");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(258987607, i, -1, "com.robinhood.android.advisory.tlh.taxLossHarvestingNavGraph.<anonymous> (TaxLossHarvestingNavGraph.kt:28)");
            }
            Function0<Unit> function0 = this.$onExitNavGraph;
            composer.startReplaceGroup(5004770);
            boolean z = (((i & 896) ^ 384) > 256 && composer.changed(navigator)) || (i & 384) == 256;
            Object objRememberedValue = composer.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.tlh.TaxLossHarvestingNavGraphKt$taxLossHarvestingNavGraph$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TaxLossHarvestingNavGraph.C93822.invoke$lambda$2$lambda$1(navigator, (ComposableDestination) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            TaxLossHarvestingDashboardScreen.TaxLossHarvestDashboardScreen(function0, null, (Function1) objRememberedValue, null, composer, 0, 10);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(LifecycleAwareNavigator lifecycleAwareNavigator, ComposableDestination destination) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(destination, "destination");
            LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, destination, null, null, false, new Function1() { // from class: com.robinhood.android.advisory.tlh.TaxLossHarvestingNavGraphKt$taxLossHarvestingNavGraph$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TaxLossHarvestingNavGraph.C93822.invoke$lambda$2$lambda$1$lambda$0((NavOptionsBuilder) obj);
                }
            }, 14, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(NavOptionsBuilder navigate) {
            Intrinsics.checkNotNullParameter(navigate, "$this$navigate");
            NavOptionsBuilders.popUpTo(navigate, TaxLossHarvestDashboardDestination.INSTANCE.getRoutePath(), true);
            navigate.setLaunchSingleTop(true);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: TaxLossHarvestingNavGraph.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advisory.tlh.TaxLossHarvestingNavGraphKt$taxLossHarvestingNavGraph$3 */
    static final class C93833 implements Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> {
        final /* synthetic */ NavHostController $navController;
        final /* synthetic */ Function0<Unit> $onExitNavGraph;

        C93833(NavHostController navHostController, Function0<Unit> function0) {
            this.$navController = navHostController;
            this.$onExitNavGraph = function0;
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, NavBackStackEntry navBackStackEntry, LifecycleAwareNavigator lifecycleAwareNavigator, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, navBackStackEntry, lifecycleAwareNavigator, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3(NavHostController navHostController, Function0 function0) {
            if (!navHostController.popBackStack()) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(LifecycleAwareNavigator lifecycleAwareNavigator) throws Resources.NotFoundException {
            LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, TaxLossHarvestDashboardDestination.INSTANCE, null, null, false, new Function1() { // from class: com.robinhood.android.advisory.tlh.TaxLossHarvestingNavGraphKt$taxLossHarvestingNavGraph$3$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TaxLossHarvestingNavGraph.C93833.invoke$lambda$2$lambda$1$lambda$0((NavOptionsBuilder) obj);
                }
            }, 14, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(NavOptionsBuilder navigate) {
            Intrinsics.checkNotNullParameter(navigate, "$this$navigate");
            NavOptionsBuilders.popUpTo(navigate, TaxLossHarvestFlowDestination.INSTANCE.getRoutePath(), true);
            navigate.setLaunchSingleTop(true);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$5(LifecycleAwareNavigator lifecycleAwareNavigator, ComposableDestination destination) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(destination, "destination");
            LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, destination, null, null, false, null, 30, null);
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope composable, NavBackStackEntry unused$var$, final LifecycleAwareNavigator navigator, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(composable, "$this$composable");
            Intrinsics.checkNotNullParameter(unused$var$, "$unused$var$");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-443608232, i, -1, "com.robinhood.android.advisory.tlh.taxLossHarvestingNavGraph.<anonymous> (TaxLossHarvestingNavGraph.kt:40)");
            }
            composer.startReplaceGroup(5004770);
            int i2 = (i & 896) ^ 384;
            boolean z = (i2 > 256 && composer.changed(navigator)) || (i & 384) == 256;
            Object objRememberedValue = composer.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.tlh.TaxLossHarvestingNavGraphKt$taxLossHarvestingNavGraph$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TaxLossHarvestingNavGraph.C93833.invoke$lambda$2$lambda$1(navigator);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(this.$navController) | composer.changed(this.$onExitNavGraph);
            final NavHostController navHostController = this.$navController;
            final Function0<Unit> function02 = this.$onExitNavGraph;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.tlh.TaxLossHarvestingNavGraphKt$taxLossHarvestingNavGraph$3$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TaxLossHarvestingNavGraph.C93833.invoke$lambda$4$lambda$3(navHostController, function02);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function0 function03 = (Function0) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean z2 = (i2 > 256 && composer.changed(navigator)) || (i & 384) == 256;
            Object objRememberedValue3 = composer.rememberedValue();
            if (z2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.advisory.tlh.TaxLossHarvestingNavGraphKt$taxLossHarvestingNavGraph$3$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TaxLossHarvestingNavGraph.C93833.invoke$lambda$6$lambda$5(navigator, (ComposableDestination) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            HarvestFlowHost.HarvestFlowHost(function0, function03, null, (Function1) objRememberedValue3, composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }
}
