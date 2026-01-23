package com.robinhood.android.navigation.compose;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.navigation.NamedNavArgument;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.compose.NavGraphBuilder2;
import com.google.accompanist.navigation.material.NavGraphBuilder3;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.navigation.compose.destination.BaseComposableDestination;
import com.robinhood.android.navigation.compose.destination.ComposableDestination;
import com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs;
import com.robinhood.android.navigation.compose.destination.DialogDestination;
import com.robinhood.android.navigation.compose.destination.DialogDestinationWithArgs;
import com.robinhood.android.navigation.compose.destination.SheetDestination;
import com.robinhood.android.navigation.compose.destination.SheetDestinationWithArgs;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NavGraphBuilders.kt */
@Metadata(m3635d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a:\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006¢\u0006\u0004\b\b\u0010\t\u001aF\u0010\u0012\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\f2#\u0010\u0011\u001a\u001f\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\r¢\u0006\u0002\b\u0006¢\u0006\u0004\b\u0012\u0010\u0013\u001aJ\u0010\u0012\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00142#\u0010\u0011\u001a\u001f\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\r¢\u0006\u0002\b\u0006¢\u0006\u0004\b\u0012\u0010\u0015\u001aF\u0010\u0018\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00162#\u0010\u0011\u001a\u001f\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\r¢\u0006\u0002\b\u0006¢\u0006\u0004\b\u0018\u0010\u0019\u001aJ\u0010\u0018\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u001a2#\u0010\u0011\u001a\u001f\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\r¢\u0006\u0002\b\u0006¢\u0006\u0004\b\u0018\u0010\u001b\u001aX\u0010!\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2#\u0010\u0011\u001a\u001f\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\r¢\u0006\u0002\b\u0006H\u0002¢\u0006\u0004\b!\u0010\"\u001a;\u0010%\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020#2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050$¢\u0006\u0004\b%\u0010&\u001a?\u0010%\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030'2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050$¢\u0006\u0004\b%\u0010(\u001aM\u0010)\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050$H\u0002¢\u0006\u0004\b)\u0010*\u001ah\u0010-\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u001e2#\u0010\u0011\u001a\u001f\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\r¢\u0006\u0002\b\u0006H\u0000¢\u0006\u0004\b-\u0010.\u001a\u0019\u00101\u001a\u000200*\b\u0012\u0004\u0012\u00020\u000f0/H\u0002¢\u0006\u0004\b1\u00102\u001a\u0019\u00103\u001a\u000200*\b\u0012\u0004\u0012\u00020\u000f0/H\u0002¢\u0006\u0004\b3\u00102\u001a\u0019\u00104\u001a\u000200*\b\u0012\u0004\u0012\u00020\u000f0/H\u0002¢\u0006\u0004\b4\u00102\u001a\u0019\u00106\u001a\u000205*\b\u0012\u0004\u0012\u00020\u000f0/H\u0002¢\u0006\u0004\b6\u00107\u001a\u0019\u00108\u001a\u000205*\b\u0012\u0004\u0012\u00020\u000f0/H\u0002¢\u0006\u0004\b8\u00107\u001a\u0019\u00109\u001a\u000205*\b\u0012\u0004\u0012\u00020\u000f0/H\u0002¢\u0006\u0004\b9\u00107\u001a\u001f\u0010=\u001a\u00020<2\u0006\u0010:\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020\u000fH\u0002¢\u0006\u0004\b=\u0010>\"\u0014\u0010@\u001a\u00020?8\u0002X\u0082T¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006B"}, m3636d2 = {"Landroidx/navigation/NavGraphBuilder;", "Lcom/robinhood/android/navigation/compose/destination/BaseComposableDestination;", "startDestination", "destination", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "builder", "navigation", "(Landroidx/navigation/NavGraphBuilder;Lcom/robinhood/android/navigation/compose/destination/BaseComposableDestination;Lcom/robinhood/android/navigation/compose/destination/BaseComposableDestination;Lkotlin/jvm/functions/Function1;)V", "Landroidx/navigation/NavHostController;", "navController", "Lcom/robinhood/android/navigation/compose/destination/ComposableDestination;", "Lkotlin/Function3;", "Landroidx/compose/animation/AnimatedVisibilityScope;", "Landroidx/navigation/NavBackStackEntry;", "Lcom/robinhood/android/navigation/compose/LifecycleAwareNavigator;", "content", "composable", "(Landroidx/navigation/NavGraphBuilder;Landroidx/navigation/NavHostController;Lcom/robinhood/android/navigation/compose/destination/ComposableDestination;Lkotlin/jvm/functions/Function5;)V", "Lcom/robinhood/android/navigation/compose/destination/ComposableDestinationWithArgs;", "(Landroidx/navigation/NavGraphBuilder;Landroidx/navigation/NavHostController;Lcom/robinhood/android/navigation/compose/destination/ComposableDestinationWithArgs;Lkotlin/jvm/functions/Function5;)V", "Lcom/robinhood/android/navigation/compose/destination/SheetDestination;", "Landroidx/compose/foundation/layout/ColumnScope;", "bottomSheet", "(Landroidx/navigation/NavGraphBuilder;Landroidx/navigation/NavHostController;Lcom/robinhood/android/navigation/compose/destination/SheetDestination;Lkotlin/jvm/functions/Function5;)V", "Lcom/robinhood/android/navigation/compose/destination/SheetDestinationWithArgs;", "(Landroidx/navigation/NavGraphBuilder;Landroidx/navigation/NavHostController;Lcom/robinhood/android/navigation/compose/destination/SheetDestinationWithArgs;Lkotlin/jvm/functions/Function5;)V", "", PlaceTypes.ROUTE, "", "Landroidx/navigation/NamedNavArgument;", "arguments", "bottomSheetInternal", "(Landroidx/navigation/NavGraphBuilder;Landroidx/navigation/NavHostController;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function5;)V", "Lcom/robinhood/android/navigation/compose/destination/DialogDestination;", "Lkotlin/Function2;", "dialog", "(Landroidx/navigation/NavGraphBuilder;Landroidx/navigation/NavHostController;Lcom/robinhood/android/navigation/compose/destination/DialogDestination;Lkotlin/jvm/functions/Function4;)V", "Lcom/robinhood/android/navigation/compose/destination/DialogDestinationWithArgs;", "(Landroidx/navigation/NavGraphBuilder;Landroidx/navigation/NavHostController;Lcom/robinhood/android/navigation/compose/destination/DialogDestinationWithArgs;Lkotlin/jvm/functions/Function4;)V", "dialogInternal", "(Landroidx/navigation/NavGraphBuilder;Landroidx/navigation/NavHostController;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function4;)V", "Landroidx/navigation/NavDeepLink;", "deepLinks", "composableInternal", "(Landroidx/navigation/NavGraphBuilder;Landroidx/navigation/NavHostController;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function5;)V", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/compose/animation/EnterTransition;", "slideIntoContainerFromStart", "(Landroidx/compose/animation/AnimatedContentTransitionScope;)Landroidx/compose/animation/EnterTransition;", "slideIntoContainerFromEnd", "slideIntoContainerUp", "Landroidx/compose/animation/ExitTransition;", "slideOutOfContainerToStart", "(Landroidx/compose/animation/AnimatedContentTransitionScope;)Landroidx/compose/animation/ExitTransition;", "slideOutOfContainerToEnd", "slideOutOfContainerDown", "initialState", "targetState", "", "isTabSwitch", "(Landroidx/navigation/NavBackStackEntry;Landroidx/navigation/NavBackStackEntry;)Z", "", "DEFAULT_DURATION", "I", "lib-navigation-compose_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.navigation.compose.NavGraphBuildersKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class NavGraphBuilders {
    private static final int DEFAULT_DURATION = 300;

    /* compiled from: NavGraphBuilders.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.navigation.compose.NavGraphBuildersKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NavTransition.values().length];
            try {
                iArr[NavTransition.CROSS_FADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NavTransition.ENTER_NONE_POP_SLIDE_HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NavTransition.SLIDE_HORIZONTAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NavTransition.SLIDE_HORIZONTAL_REVERSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NavTransition.SLIDE_VERTICAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[NavTransition.NONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void navigation(NavGraphBuilder navGraphBuilder, BaseComposableDestination startDestination, BaseComposableDestination destination, Function1<? super NavGraphBuilder, Unit> builder) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(builder, "builder");
        NavGraphBuilder2.navigation$default(navGraphBuilder, startDestination.getRoutePath(), destination.getRoutePath(), destination.getArgumentList(), null, null, null, null, null, builder, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null);
    }

    public static final void composable(NavGraphBuilder navGraphBuilder, NavHostController navController, ComposableDestination destination, Function5<? super AnimatedVisibilityScope, ? super NavBackStackEntry, ? super LifecycleAwareNavigator, ? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(content, "content");
        composableInternal$default(navGraphBuilder, navController, destination.getRoutePath(), destination.getArgumentList(), null, content, 8, null);
    }

    public static final void composable(NavGraphBuilder navGraphBuilder, NavHostController navController, ComposableDestinationWithArgs<?> destination, Function5<? super AnimatedVisibilityScope, ? super NavBackStackEntry, ? super LifecycleAwareNavigator, ? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(content, "content");
        composableInternal$default(navGraphBuilder, navController, destination.getRoutePath(), destination.getArgumentList(), null, content, 8, null);
    }

    public static final void bottomSheet(NavGraphBuilder navGraphBuilder, NavHostController navController, SheetDestination destination, Function5<? super Column5, ? super NavBackStackEntry, ? super LifecycleAwareNavigator, ? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(content, "content");
        bottomSheetInternal(navGraphBuilder, navController, destination.getRoutePath(), destination.getArgumentList(), content);
    }

    public static final void bottomSheet(NavGraphBuilder navGraphBuilder, NavHostController navController, SheetDestinationWithArgs<?> destination, Function5<? super Column5, ? super NavBackStackEntry, ? super LifecycleAwareNavigator, ? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(content, "content");
        bottomSheetInternal(navGraphBuilder, navController, destination.getRoutePath(), destination.getArgumentList(), content);
    }

    static /* synthetic */ void bottomSheetInternal$default(NavGraphBuilder navGraphBuilder, NavHostController navHostController, String str, List list, Function5 function5, int i, Object obj) {
        if ((i & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        bottomSheetInternal(navGraphBuilder, navHostController, str, list, function5);
    }

    private static final void bottomSheetInternal(NavGraphBuilder navGraphBuilder, final NavHostController navHostController, String str, List<NamedNavArgument> list, final Function5<? super Column5, ? super NavBackStackEntry, ? super LifecycleAwareNavigator, ? super Composer, ? super Integer, Unit> function5) {
        NavGraphBuilder3.bottomSheet$default(navGraphBuilder, str, list, null, ComposableLambda3.composableLambdaInstance(-1553887332, true, new Function4<Column5, NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.robinhood.android.navigation.compose.NavGraphBuildersKt.bottomSheetInternal.1
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
                invoke(column5, navBackStackEntry, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(final Column5 bottomSheet, final NavBackStackEntry entry, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(bottomSheet, "$this$bottomSheet");
                Intrinsics.checkNotNullParameter(entry, "entry");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1553887332, i, -1, "com.robinhood.android.navigation.compose.bottomSheetInternal.<anonymous> (NavGraphBuilders.kt:109)");
                }
                composer.startReplaceGroup(1849434622);
                NavHostController navHostController2 = navHostController;
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new LifecycleAwareNavigator(navHostController2, entry);
                    composer.updateRememberedValue(objRememberedValue);
                }
                final LifecycleAwareNavigator lifecycleAwareNavigator = (LifecycleAwareNavigator) objRememberedValue;
                composer.endReplaceGroup();
                ProvidedValue[] providedValueArr = {LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator().provides(lifecycleAwareNavigator), LocalLifecycleAwareNavigator.getLocalOptionalLifecycleAwareNavigator().provides(lifecycleAwareNavigator)};
                final Function5<Column5, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> function52 = function5;
                CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambda3.rememberComposableLambda(-1480191268, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.navigation.compose.NavGraphBuildersKt.bottomSheetInternal.1.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1480191268, i2, -1, "com.robinhood.android.navigation.compose.bottomSheetInternal.<anonymous>.<anonymous> (NavGraphBuilders.kt:114)");
                        }
                        function52.invoke(bottomSheet, entry, lifecycleAwareNavigator, composer2, 384);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 4, null);
    }

    public static final void dialog(NavGraphBuilder navGraphBuilder, NavHostController navController, DialogDestination destination, Function4<? super NavBackStackEntry, ? super LifecycleAwareNavigator, ? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(content, "content");
        dialogInternal(navGraphBuilder, navController, destination.getRoutePath(), destination.getArgumentList(), content);
    }

    public static final void dialog(NavGraphBuilder navGraphBuilder, NavHostController navController, DialogDestinationWithArgs<?> destination, Function4<? super NavBackStackEntry, ? super LifecycleAwareNavigator, ? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(content, "content");
        dialogInternal(navGraphBuilder, navController, destination.getRoutePath(), destination.getArgumentList(), content);
    }

    static /* synthetic */ void dialogInternal$default(NavGraphBuilder navGraphBuilder, NavHostController navHostController, String str, List list, Function4 function4, int i, Object obj) {
        if ((i & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        dialogInternal(navGraphBuilder, navHostController, str, list, function4);
    }

    private static final void dialogInternal(NavGraphBuilder navGraphBuilder, final NavHostController navHostController, String str, List<NamedNavArgument> list, final Function4<? super NavBackStackEntry, ? super LifecycleAwareNavigator, ? super Composer, ? super Integer, Unit> function4) {
        NavGraphBuilder2.dialog$default(navGraphBuilder, str, list, null, null, ComposableLambda3.composableLambdaInstance(-1096793632, true, new Function3<NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.robinhood.android.navigation.compose.NavGraphBuildersKt.dialogInternal.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
                invoke(navBackStackEntry, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(final NavBackStackEntry entry, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(entry, "entry");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1096793632, i, -1, "com.robinhood.android.navigation.compose.dialogInternal.<anonymous> (NavGraphBuilders.kt:156)");
                }
                composer.startReplaceGroup(1849434622);
                NavHostController navHostController2 = navHostController;
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new LifecycleAwareNavigator(navHostController2, entry);
                    composer.updateRememberedValue(objRememberedValue);
                }
                final LifecycleAwareNavigator lifecycleAwareNavigator = (LifecycleAwareNavigator) objRememberedValue;
                composer.endReplaceGroup();
                ProvidedValue[] providedValueArr = {LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator().provides(lifecycleAwareNavigator), LocalLifecycleAwareNavigator.getLocalOptionalLifecycleAwareNavigator().provides(lifecycleAwareNavigator)};
                final Function4<NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> function42 = function4;
                CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambda3.rememberComposableLambda(-1891191520, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.navigation.compose.NavGraphBuildersKt.dialogInternal.1.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1891191520, i2, -1, "com.robinhood.android.navigation.compose.dialogInternal.<anonymous>.<anonymous> (NavGraphBuilders.kt:161)");
                        }
                        function42.invoke(entry, lifecycleAwareNavigator, composer2, 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 12, null);
    }

    public static /* synthetic */ void composableInternal$default(NavGraphBuilder navGraphBuilder, NavHostController navHostController, String str, List list, List list2, Function5 function5, int i, Object obj) {
        if ((i & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        List list3 = list;
        if ((i & 8) != 0) {
            list2 = CollectionsKt.emptyList();
        }
        composableInternal(navGraphBuilder, navHostController, str, list3, list2, function5);
    }

    public static final void composableInternal(NavGraphBuilder navGraphBuilder, final NavHostController navController, String route, List<NamedNavArgument> arguments, List<NavDeepLink> deepLinks, final Function5<? super AnimatedVisibilityScope, ? super NavBackStackEntry, ? super LifecycleAwareNavigator, ? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(deepLinks, "deepLinks");
        Intrinsics.checkNotNullParameter(content, "content");
        NavGraphBuilder2.composable(navGraphBuilder, route, arguments, deepLinks, new Function1() { // from class: com.robinhood.android.navigation.compose.NavGraphBuildersKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NavGraphBuilders.composableInternal$lambda$0((AnimatedContentTransitionScope) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.navigation.compose.NavGraphBuildersKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NavGraphBuilders.composableInternal$lambda$1((AnimatedContentTransitionScope) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.navigation.compose.NavGraphBuildersKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NavGraphBuilders.composableInternal$lambda$2((AnimatedContentTransitionScope) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.navigation.compose.NavGraphBuildersKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NavGraphBuilders.composableInternal$lambda$3((AnimatedContentTransitionScope) obj);
            }
        }, ComposableLambda3.composableLambdaInstance(-1964697854, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: com.robinhood.android.navigation.compose.NavGraphBuildersKt.composableInternal.5
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
                invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(final AnimatedContentScope composable, final NavBackStackEntry entry, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composable, "$this$composable");
                Intrinsics.checkNotNullParameter(entry, "entry");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1964697854, i, -1, "com.robinhood.android.navigation.compose.composableInternal.<anonymous> (NavGraphBuilders.kt:249)");
                }
                composer.startReplaceGroup(1849434622);
                NavHostController navHostController = navController;
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new LifecycleAwareNavigator(navHostController, entry);
                    composer.updateRememberedValue(objRememberedValue);
                }
                final LifecycleAwareNavigator lifecycleAwareNavigator = (LifecycleAwareNavigator) objRememberedValue;
                composer.endReplaceGroup();
                ProvidedValue[] providedValueArr = {LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator().provides(lifecycleAwareNavigator), LocalLifecycleAwareNavigator.getLocalOptionalLifecycleAwareNavigator().provides(lifecycleAwareNavigator)};
                final Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> function5 = content;
                CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambda3.rememberComposableLambda(-966870462, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.navigation.compose.NavGraphBuildersKt.composableInternal.5.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-966870462, i2, -1, "com.robinhood.android.navigation.compose.composableInternal.<anonymous>.<anonymous> (NavGraphBuilders.kt:254)");
                        }
                        function5.invoke(composable, entry, lifecycleAwareNavigator, composer2, 384);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final EnterTransition composableInternal$lambda$0(AnimatedContentTransitionScope composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        if (isTabSwitch((NavBackStackEntry) composable.getInitialState(), (NavBackStackEntry) composable.getTargetState())) {
            return EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null);
        }
        NavTransition transition = NavTransition2.getTransition((NavBackStackEntry) composable.getTargetState());
        switch (transition == null ? -1 : WhenMappings.$EnumSwitchMapping$0[transition.ordinal()]) {
            case -1:
            case 6:
                return EnterTransition.INSTANCE.getNone();
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null);
            case 2:
                return EnterTransition.INSTANCE.getNone();
            case 3:
                return slideIntoContainerFromStart(composable);
            case 4:
                return slideIntoContainerFromEnd(composable);
            case 5:
                return slideIntoContainerUp(composable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ExitTransition composableInternal$lambda$1(AnimatedContentTransitionScope composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        if (isTabSwitch((NavBackStackEntry) composable.getInitialState(), (NavBackStackEntry) composable.getTargetState())) {
            return EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null);
        }
        NavTransition transition = NavTransition2.getTransition((NavBackStackEntry) composable.getTargetState());
        switch (transition == null ? -1 : WhenMappings.$EnumSwitchMapping$0[transition.ordinal()]) {
            case -1:
            case 6:
                return ExitTransition.INSTANCE.getNone();
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null);
            case 2:
                return ExitTransition.INSTANCE.getNone();
            case 3:
                return slideOutOfContainerToStart(composable);
            case 4:
                return slideOutOfContainerToEnd(composable);
            case 5:
                return EnterExitTransitionKt.fadeOut(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.9f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final EnterTransition composableInternal$lambda$2(AnimatedContentTransitionScope composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        if (isTabSwitch((NavBackStackEntry) composable.getInitialState(), (NavBackStackEntry) composable.getTargetState())) {
            return EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null);
        }
        NavTransition transition = NavTransition2.getTransition((NavBackStackEntry) composable.getInitialState());
        switch (transition == null ? -1 : WhenMappings.$EnumSwitchMapping$0[transition.ordinal()]) {
            case -1:
            case 6:
                return EnterTransition.INSTANCE.getNone();
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null);
            case 2:
                return slideIntoContainerFromEnd(composable);
            case 3:
                return slideIntoContainerFromEnd(composable);
            case 4:
                return slideIntoContainerFromStart(composable);
            case 5:
                return EnterExitTransitionKt.fadeIn(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ExitTransition composableInternal$lambda$3(AnimatedContentTransitionScope composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        if (isTabSwitch((NavBackStackEntry) composable.getInitialState(), (NavBackStackEntry) composable.getTargetState())) {
            return EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null);
        }
        NavTransition transition = NavTransition2.getTransition((NavBackStackEntry) composable.getInitialState());
        switch (transition == null ? -1 : WhenMappings.$EnumSwitchMapping$0[transition.ordinal()]) {
            case -1:
            case 6:
                return ExitTransition.INSTANCE.getNone();
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null);
            case 2:
                return slideOutOfContainerToEnd(composable);
            case 3:
                return slideOutOfContainerToEnd(composable);
            case 4:
                return slideOutOfContainerToStart(composable);
            case 5:
                return slideOutOfContainerDown(composable);
        }
    }

    private static final EnterTransition slideIntoContainerFromStart(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        return AnimatedContentTransitionScope.m4749slideIntoContainermOhB8PU$default(animatedContentTransitionScope, AnimatedContentTransitionScope.SlideDirection.INSTANCE.m4759getStartDKzdypw(), AnimationSpecKt.tween$default(300, 0, null, 6, null), null, 4, null);
    }

    private static final EnterTransition slideIntoContainerFromEnd(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        return AnimatedContentTransitionScope.m4749slideIntoContainermOhB8PU$default(animatedContentTransitionScope, AnimatedContentTransitionScope.SlideDirection.INSTANCE.m4756getEndDKzdypw(), AnimationSpecKt.tween$default(300, 0, null, 6, null), null, 4, null);
    }

    private static final EnterTransition slideIntoContainerUp(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        return AnimatedContentTransitionScope.m4749slideIntoContainermOhB8PU$default(animatedContentTransitionScope, AnimatedContentTransitionScope.SlideDirection.INSTANCE.m4760getUpDKzdypw(), AnimationSpecKt.tween$default(300, 0, null, 6, null), null, 4, null);
    }

    private static final ExitTransition slideOutOfContainerToStart(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        return AnimatedContentTransitionScope.m4750slideOutOfContainermOhB8PU$default(animatedContentTransitionScope, AnimatedContentTransitionScope.SlideDirection.INSTANCE.m4759getStartDKzdypw(), AnimationSpecKt.tween$default(300, 0, null, 6, null), null, 4, null);
    }

    private static final ExitTransition slideOutOfContainerToEnd(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        return AnimatedContentTransitionScope.m4750slideOutOfContainermOhB8PU$default(animatedContentTransitionScope, AnimatedContentTransitionScope.SlideDirection.INSTANCE.m4756getEndDKzdypw(), AnimationSpecKt.tween$default(300, 0, null, 6, null), null, 4, null);
    }

    private static final ExitTransition slideOutOfContainerDown(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        return AnimatedContentTransitionScope.m4750slideOutOfContainermOhB8PU$default(animatedContentTransitionScope, AnimatedContentTransitionScope.SlideDirection.INSTANCE.m4755getDownDKzdypw(), AnimationSpecKt.tween$default(300, 0, null, 6, null), null, 4, null);
    }

    private static final boolean isTabSwitch(NavBackStackEntry navBackStackEntry, NavBackStackEntry navBackStackEntry2) {
        String bottomBarTabHostId = BottomBarConfigNavArgs2.getBottomBarTabHostId(navBackStackEntry);
        String bottomBarTabHostId2 = BottomBarConfigNavArgs2.getBottomBarTabHostId(navBackStackEntry2);
        return (bottomBarTabHostId == null || bottomBarTabHostId2 == null || Intrinsics.areEqual(bottomBarTabHostId, bottomBarTabHostId2)) ? false : true;
    }
}
