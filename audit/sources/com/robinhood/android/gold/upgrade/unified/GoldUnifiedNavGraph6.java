package com.robinhood.android.gold.upgrade.unified;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.gold.upgrade.unified.AgreementDisplayDest;
import com.robinhood.android.gold.upgrade.unified.ErrorDest;
import com.robinhood.android.gold.upgrade.unified.MultiAgreementsDest;
import com.robinhood.android.gold.upgrade.unified.SingleAgreementDest;
import com.robinhood.android.gold.upgrade.unified.ValuePropsPromoDest;
import com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedAgreementDisplayComposable3;
import com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedConfirmationComposable3;
import com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedErrorComposable;
import com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedMicrogramUiComposable;
import com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedMultiAgreementsComposable;
import com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedPlanSelectionComposable;
import com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSingleAgreementComposable3;
import com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedSuggestedActionComposable;
import com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsComposable3;
import com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedValuePropsPromoComposable;
import com.robinhood.android.navigation.compose.ComposableCompanion;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.NavGraphBuilders;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.p409ui.context.BaseContexts;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldUnifiedNavGraph.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007H\u0000¨\u0006\b"}, m3636d2 = {"goldUnifiedNavGraph", "", "Landroidx/navigation/NavGraphBuilder;", "navController", "Landroidx/navigation/NavHostController;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "feature-gold-upgrade_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.upgrade.unified.GoldUnifiedNavGraphKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldUnifiedNavGraph6 {
    public static final void goldUnifiedNavGraph(NavGraphBuilder navGraphBuilder, final NavHostController navController, final Context context) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        Intrinsics.checkNotNullParameter(navController, "navController");
        NavGraphBuilders.composable(navGraphBuilder, navController, LoadingDest.INSTANCE, ComposableLambda3.composableLambdaInstance(-1426220786, true, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.GoldUnifiedNavGraphKt.goldUnifiedNavGraph.1
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
                    ComposerKt.traceEventStart(-1426220786, i, -1, "com.robinhood.android.gold.upgrade.unified.goldUnifiedNavGraph.<anonymous> (GoldUnifiedNavGraph.kt:31)");
                }
                GoldUnifiedHostComposable3.Loading(context, composer, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        NavGraphBuilders.composable(navGraphBuilder, navController, ValuePropsDest.INSTANCE, ComposableLambda3.composableLambdaInstance(-476103867, true, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.GoldUnifiedNavGraphKt.goldUnifiedNavGraph.2
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
                    ComposerKt.traceEventStart(-476103867, i, -1, "com.robinhood.android.gold.upgrade.unified.goldUnifiedNavGraph.<anonymous> (GoldUnifiedNavGraph.kt:36)");
                }
                GoldUnifiedValuePropsComposable3.GoldUnifiedValuePropsComposable(null, null, null, context, composer, 0, 7);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        ValuePropsSduiDest valuePropsSduiDest = ValuePropsSduiDest.INSTANCE;
        GoldUnifiedNavGraph goldUnifiedNavGraph = GoldUnifiedNavGraph.INSTANCE;
        NavGraphBuilders.composable(navGraphBuilder, navController, valuePropsSduiDest, goldUnifiedNavGraph.getLambda$489458950$feature_gold_upgrade_externalRelease());
        NavGraphBuilders.composable(navGraphBuilder, navController, ValuePropsPromoDest.INSTANCE, ComposableLambda3.composableLambdaInstance(1455021767, true, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.GoldUnifiedNavGraphKt.goldUnifiedNavGraph.3
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
                    ComposerKt.traceEventStart(1455021767, i, -1, "com.robinhood.android.gold.upgrade.unified.goldUnifiedNavGraph.<anonymous> (GoldUnifiedNavGraph.kt:44)");
                }
                ValuePropsPromoDest.Args args = (ValuePropsPromoDest.Args) ComposableCompanion.args(entry);
                boolean buttonColorChangeWhenScrolling = args.getButtonColorChangeWhenScrolling();
                Screen.Name name = Screen.Name.GOLD_VALUE_PROPS;
                String screenLoggingIdentifier = args.getScreenLoggingIdentifier();
                if (screenLoggingIdentifier == null) {
                    screenLoggingIdentifier = "";
                }
                GoldUnifiedValuePropsPromoComposable.GoldUnifiedValuePropsPromoComposable(null, null, buttonColorChangeWhenScrolling, new Screen(name, null, screenLoggingIdentifier, null, 10, null), context, args.getForceLightMode(), composer, 0, 3);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        NavGraphBuilders.composable(navGraphBuilder, navController, MultiAgreementsDest.INSTANCE, ComposableLambda3.composableLambdaInstance(-1874382712, true, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.GoldUnifiedNavGraphKt.goldUnifiedNavGraph.4
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
                    ComposerKt.traceEventStart(-1874382712, i, -1, "com.robinhood.android.gold.upgrade.unified.goldUnifiedNavGraph.<anonymous> (GoldUnifiedNavGraph.kt:56)");
                }
                GoldUnifiedMultiAgreementsComposable.GoldUnifiedMultiAgreementsComposable(null, null, null, context, ((MultiAgreementsDest.Args) ComposableCompanion.args(entry)).getThemeOverride(), composer, 0, 7);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        NavGraphBuilders.composable(navGraphBuilder, navController, SingleAgreementDest.INSTANCE, ComposableLambda3.composableLambdaInstance(-908819895, true, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.GoldUnifiedNavGraphKt.goldUnifiedNavGraph.5
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
                    ComposerKt.traceEventStart(-908819895, i, -1, "com.robinhood.android.gold.upgrade.unified.goldUnifiedNavGraph.<anonymous> (GoldUnifiedNavGraph.kt:63)");
                }
                GoldUnifiedSingleAgreementComposable3.GoldUnifiedSingleAgreementComposable(null, null, context, null, ((SingleAgreementDest.Args) ComposableCompanion.args(entry)).getThemeOverride(), composer, 0, 11);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        NavGraphBuilders.composable(navGraphBuilder, navController, ConfirmationDest.INSTANCE, ComposableLambda3.composableLambdaInstance(56742922, true, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.GoldUnifiedNavGraphKt.goldUnifiedNavGraph.6
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
                    ComposerKt.traceEventStart(56742922, i, -1, "com.robinhood.android.gold.upgrade.unified.goldUnifiedNavGraph.<anonymous> (GoldUnifiedNavGraph.kt:70)");
                }
                GoldUnifiedConfirmationComposable3.GoldUnifiedConfirmationComposable(null, null, null, context, composer, 0, 7);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        NavGraphBuilders.composable(navGraphBuilder, navController, SuggestedActionDest.INSTANCE, ComposableLambda3.composableLambdaInstance(1022305739, true, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.GoldUnifiedNavGraphKt.goldUnifiedNavGraph.7
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
                    ComposerKt.traceEventStart(1022305739, i, -1, "com.robinhood.android.gold.upgrade.unified.goldUnifiedNavGraph.<anonymous> (GoldUnifiedNavGraph.kt:75)");
                }
                GoldUnifiedSuggestedActionComposable.GoldUnifiedSuggestedActionComposable(null, null, null, context, composer, 0, 7);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        NavGraphBuilders.composable(navGraphBuilder, navController, AgreementDisplayDest.INSTANCE, ComposableLambda3.composableLambdaInstance(1987868556, true, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.GoldUnifiedNavGraphKt.goldUnifiedNavGraph.8
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
                    ComposerKt.traceEventStart(1987868556, i, -1, "com.robinhood.android.gold.upgrade.unified.goldUnifiedNavGraph.<anonymous> (GoldUnifiedNavGraph.kt:80)");
                }
                GoldUnifiedAgreementDisplayComposable3.GoldUnifiedAgreementDisplayComposable(null, null, context, ((AgreementDisplayDest.Args) ComposableCompanion.args(entry)).getThemeOverride(), composer, 0, 3);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        NavGraphBuilders.composable(navGraphBuilder, navController, PlanSelectionDest.INSTANCE, ComposableLambda3.composableLambdaInstance(-1341535923, true, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.GoldUnifiedNavGraphKt.goldUnifiedNavGraph.9
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
                    ComposerKt.traceEventStart(-1341535923, i, -1, "com.robinhood.android.gold.upgrade.unified.goldUnifiedNavGraph.<anonymous> (GoldUnifiedNavGraph.kt:87)");
                }
                GoldUnifiedPlanSelectionComposable.GoldUnifiedPlanSelectionComposable(null, null, null, context, composer, 0, 7);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        NavGraphBuilders.composable(navGraphBuilder, navController, ErrorDest.INSTANCE, ComposableLambda3.composableLambdaInstance(1090508861, true, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.GoldUnifiedNavGraphKt.goldUnifiedNavGraph.10
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
                    ComposerKt.traceEventStart(1090508861, i, -1, "com.robinhood.android.gold.upgrade.unified.goldUnifiedNavGraph.<anonymous> (GoldUnifiedNavGraph.kt:92)");
                }
                GoldUnifiedErrorComposable.GoldUnifiedErrorComposable(context, null, null, ((ErrorDest.Args) ComposableCompanion.args(entry)).getErrorDescription(), composer, 48, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        NavGraphBuilders.composable(navGraphBuilder, navController, UpdateAppDest.INSTANCE, goldUnifiedNavGraph.getLambda$2056071678$feature_gold_upgrade_externalRelease());
        NavGraphBuilders.composable(navGraphBuilder, navController, ScreenUnspecifiedDest.INSTANCE, ComposableLambda3.composableLambdaInstance(-1273332801, true, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.GoldUnifiedNavGraphKt.goldUnifiedNavGraph.11
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
                    ComposerKt.traceEventStart(-1273332801, i, -1, "com.robinhood.android.gold.upgrade.unified.goldUnifiedNavGraph.<anonymous> (GoldUnifiedNavGraph.kt:102)");
                }
                GoldUnifiedErrorComposable.GoldUnifiedErrorComposable(context, null, null, null, composer, 48, 12);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        NavGraphBuilders.composable(navGraphBuilder, navController, MicrogramUiFragmentDest.INSTANCE, ComposableLambda3.composableLambdaInstance(-307769984, true, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.GoldUnifiedNavGraphKt.goldUnifiedNavGraph.12
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
                    ComposerKt.traceEventStart(-307769984, i, -1, "com.robinhood.android.gold.upgrade.unified.goldUnifiedNavGraph.<anonymous> (GoldUnifiedNavGraph.kt:108)");
                }
                FragmentKey fragmentKey = (FragmentKey) ComposableCompanion.args(entry);
                FragmentManager supportFragmentManager = BaseContexts.requireActivityBaseContext(navController.getContext()).getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                GoldUnifiedMicrogramUiComposable.GoldUnifiedMicrogramUiComposable(fragmentKey, supportFragmentManager, navController, null, null, composer, 0, 24);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        NavGraphBuilders.composable(navGraphBuilder, navController, StartSageApplicationDest.INSTANCE, goldUnifiedNavGraph.getLambda$657792833$feature_gold_upgrade_externalRelease());
        NavGraphBuilders.composable(navGraphBuilder, navController, SageApplicationDest.INSTANCE, goldUnifiedNavGraph.getLambda$1623355650$feature_gold_upgrade_externalRelease());
    }
}
