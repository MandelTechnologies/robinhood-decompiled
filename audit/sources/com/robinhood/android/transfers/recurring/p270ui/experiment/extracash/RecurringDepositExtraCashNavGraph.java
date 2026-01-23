package com.robinhood.android.transfers.recurring.p270ui.experiment.extracash;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.navigation.NavBackStackEntry;
import com.robinhood.android.navigation.compose.ComposableCompanion;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.accountselection.AccountType;
import com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.accountselection.RecurringDepositExtraCashAccountSelectionComposable;
import com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.maxbalance.RecurringDepositExtraCashMaxBalanceInputComposable;
import com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.review.ReviewComposable;
import com.robinhood.android.transfers.recurring.p270ui.experiment.extracash.splash.RecurringDepositExtraCashSplashComposable3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringDepositExtraCashNavGraph.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.recurring.ui.experiment.extracash.ComposableSingletons$RecurringDepositExtraCashNavGraphKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class RecurringDepositExtraCashNavGraph {
    public static final RecurringDepositExtraCashNavGraph INSTANCE = new RecurringDepositExtraCashNavGraph();
    private static Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> lambda$313239529 = ComposableLambda3.composableLambdaInstance(313239529, false, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.ComposableSingletons$RecurringDepositExtraCashNavGraphKt$lambda$313239529$1
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
                ComposerKt.traceEventStart(313239529, i, -1, "com.robinhood.android.transfers.recurring.ui.experiment.extracash.ComposableSingletons$RecurringDepositExtraCashNavGraphKt.lambda$313239529.<anonymous> (RecurringDepositExtraCashNavGraph.kt:26)");
            }
            RecurringDepositExtraCashSplashComposable3.RecurringDepositExtraCashSplashComposable(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, composer, 6, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-898380846, reason: not valid java name */
    private static Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> f9282lambda$898380846 = ComposableLambda3.composableLambdaInstance(-898380846, false, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.ComposableSingletons$RecurringDepositExtraCashNavGraphKt$lambda$-898380846$1
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
                ComposerKt.traceEventStart(-898380846, i, -1, "com.robinhood.android.transfers.recurring.ui.experiment.extracash.ComposableSingletons$RecurringDepositExtraCashNavGraphKt.lambda$-898380846.<anonymous> (RecurringDepositExtraCashNavGraph.kt:33)");
            }
            RecurringDepositExtraCashAccountSelectionComposable.RecurringDepositExtraCashAccountSelectionComposable((RecurringExtraCashData) ComposableCompanion.args(entry), AccountType.INTERNAL, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, composer, 432, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> lambda$1440439537 = ComposableLambda3.composableLambdaInstance(1440439537, false, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.ComposableSingletons$RecurringDepositExtraCashNavGraphKt$lambda$1440439537$1
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
                ComposerKt.traceEventStart(1440439537, i, -1, "com.robinhood.android.transfers.recurring.ui.experiment.extracash.ComposableSingletons$RecurringDepositExtraCashNavGraphKt.lambda$1440439537.<anonymous> (RecurringDepositExtraCashNavGraph.kt:42)");
            }
            RecurringDepositExtraCashAccountSelectionComposable.RecurringDepositExtraCashAccountSelectionComposable((RecurringExtraCashData) ComposableCompanion.args(entry), AccountType.EXTERNAL, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, composer, 432, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-515707376, reason: not valid java name */
    private static Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> f9281lambda$515707376 = ComposableLambda3.composableLambdaInstance(-515707376, false, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.ComposableSingletons$RecurringDepositExtraCashNavGraphKt$lambda$-515707376$1
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
                ComposerKt.traceEventStart(-515707376, i, -1, "com.robinhood.android.transfers.recurring.ui.experiment.extracash.ComposableSingletons$RecurringDepositExtraCashNavGraphKt.lambda$-515707376.<anonymous> (RecurringDepositExtraCashNavGraph.kt:51)");
            }
            RecurringDepositExtraCashMaxBalanceInputComposable.RecurringDepositExtraCashMaxBalanceInputComposable((RecurringExtraCashData) ComposableCompanion.args(entry), SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> lambda$1823113007 = ComposableLambda3.composableLambdaInstance(1823113007, false, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.recurring.ui.experiment.extracash.ComposableSingletons$RecurringDepositExtraCashNavGraphKt$lambda$1823113007$1
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
                ComposerKt.traceEventStart(1823113007, i, -1, "com.robinhood.android.transfers.recurring.ui.experiment.extracash.ComposableSingletons$RecurringDepositExtraCashNavGraphKt.lambda$1823113007.<anonymous> (RecurringDepositExtraCashNavGraph.kt:59)");
            }
            ReviewComposable.ReviewComposable((RecurringExtraCashData) ComposableCompanion.args(entry), SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-515707376$feature_recurring_deposits_externalDebug, reason: not valid java name */
    public final Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> m19705getLambda$515707376$feature_recurring_deposits_externalDebug() {
        return f9281lambda$515707376;
    }

    /* renamed from: getLambda$-898380846$feature_recurring_deposits_externalDebug, reason: not valid java name */
    public final Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> m19706getLambda$898380846$feature_recurring_deposits_externalDebug() {
        return f9282lambda$898380846;
    }

    public final Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> getLambda$1440439537$feature_recurring_deposits_externalDebug() {
        return lambda$1440439537;
    }

    public final Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> getLambda$1823113007$feature_recurring_deposits_externalDebug() {
        return lambda$1823113007;
    }

    public final Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> getLambda$313239529$feature_recurring_deposits_externalDebug() {
        return lambda$313239529;
    }
}
