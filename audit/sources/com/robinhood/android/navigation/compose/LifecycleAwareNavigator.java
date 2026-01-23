package com.robinhood.android.navigation.compose;

import android.content.res.Resources;
import android.os.Parcelable;
import androidx.lifecycle.Lifecycle;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptionsBuilder;
import com.robinhood.android.navigation.compose.destination.BaseComposableDestination;
import com.robinhood.android.navigation.compose.destination.ComposableDestination;
import com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs;
import com.robinhood.android.navigation.compose.destination.ComposeNav;
import com.robinhood.android.navigation.compose.destination.DialogDestination;
import com.robinhood.android.navigation.compose.destination.DialogDestinationWithArgs;
import com.robinhood.android.navigation.compose.destination.SheetDestination;
import com.robinhood.android.navigation.compose.destination.SheetDestinationWithArgs;
import com.robinhood.android.navigation.compose.result.SetResultToPreviousEntry;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LifecycleAwareNavigator.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007JK\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0019\b\u0002\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u0017¢\u0006\u0002\b\u0019Jh\u0010\f\u001a\u00020\r\"\b\b\u0000\u0010\u001a*\u00020\u001b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u001c2\u0006\u0010\u001d\u001a\u0002H\u001a2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0019\b\u0002\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u0017¢\u0006\u0002\b\u0019¢\u0006\u0002\u0010\u001eJ3\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u001f2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0019\b\u0002\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u0017¢\u0006\u0002\b\u0019JP\u0010\f\u001a\u00020\r\"\b\b\u0000\u0010\u001a*\u00020\u001b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u001a0 2\u0006\u0010\u001d\u001a\u0002H\u001a2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0019\b\u0002\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u0017¢\u0006\u0002\b\u0019¢\u0006\u0002\u0010!J3\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\"2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0019\b\u0002\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u0017¢\u0006\u0002\b\u0019JP\u0010\f\u001a\u00020\r\"\b\b\u0000\u0010\u001a*\u00020\u001b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u001a0#2\u0006\u0010\u001d\u001a\u0002H\u001a2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0019\b\u0002\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u0017¢\u0006\u0002\b\u0019¢\u0006\u0002\u0010$J3\u0010\f\u001a\u00020\r2\u0006\u0010%\u001a\u00020&2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0019\b\u0002\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u0017¢\u0006\u0002\b\u0019J\u0010\u0010'\u001a\u00020\u00152\b\b\u0002\u0010\u0014\u001a\u00020\u0015J*\u0010'\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00152\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010*\u001a\u00020\u0015J\u0010\u0010+\u001a\u00020\u00152\b\b\u0002\u0010\u0014\u001a\u00020\u0015J/\u0010,\u001a\u00020\r\"\b\b\u0000\u0010\u001a*\u00020\u00012\u0006\u0010-\u001a\u0002H\u001a2\u0006\u0010.\u001a\u00020/2\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u00100J\f\u00101\u001a\u00020\u0015*\u00020\u0005H\u0002J\f\u00102\u001a\u00020\u0015*\u00020\u0005H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/navigation/compose/LifecycleAwareNavigator;", "", "navController", "Landroidx/navigation/NavHostController;", "entry", "Landroidx/navigation/NavBackStackEntry;", "<init>", "(Landroidx/navigation/NavHostController;Landroidx/navigation/NavBackStackEntry;)V", "getNavController", "()Landroidx/navigation/NavHostController;", "getEntry", "()Landroidx/navigation/NavBackStackEntry;", "navigate", "", "destination", "Lcom/robinhood/android/navigation/compose/destination/ComposableDestination;", NavTransition2.KEY_TRANSITION, "Lcom/robinhood/android/navigation/compose/NavTransition;", "bottomBarConfig", "Lcom/robinhood/android/navigation/compose/BottomBarConfig;", "skipLifecycleCheck", "", "builder", "Lkotlin/Function1;", "Landroidx/navigation/NavOptionsBuilder;", "Lkotlin/ExtensionFunctionType;", "T", "Landroid/os/Parcelable;", "Lcom/robinhood/android/navigation/compose/destination/ComposableDestinationWithArgs;", "args", "(Lcom/robinhood/android/navigation/compose/destination/ComposableDestinationWithArgs;Landroid/os/Parcelable;Lcom/robinhood/android/navigation/compose/NavTransition;Lcom/robinhood/android/navigation/compose/BottomBarConfig;ZLkotlin/jvm/functions/Function1;)V", "Lcom/robinhood/android/navigation/compose/destination/SheetDestination;", "Lcom/robinhood/android/navigation/compose/destination/SheetDestinationWithArgs;", "(Lcom/robinhood/android/navigation/compose/destination/SheetDestinationWithArgs;Landroid/os/Parcelable;ZLkotlin/jvm/functions/Function1;)V", "Lcom/robinhood/android/navigation/compose/destination/DialogDestination;", "Lcom/robinhood/android/navigation/compose/destination/DialogDestinationWithArgs;", "(Lcom/robinhood/android/navigation/compose/destination/DialogDestinationWithArgs;Landroid/os/Parcelable;ZLkotlin/jvm/functions/Function1;)V", "nav", "Lcom/robinhood/android/navigation/compose/destination/ComposeNav;", "popBackStack", "Lcom/robinhood/android/navigation/compose/destination/BaseComposableDestination;", "inclusive", "saveState", "navigateUp", "setResultAndPop", "result", "key", "", "(Ljava/lang/Object;Ljava/lang/String;Z)V", "isLifecycleAtLeastStarted", "isLifecycleAtLeastResumed", "lib-navigation-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class LifecycleAwareNavigator {
    public static final int $stable = 0;
    private final NavBackStackEntry entry;
    private final NavHostController navController;

    public LifecycleAwareNavigator(NavHostController navController, NavBackStackEntry entry) {
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.navController = navController;
        this.entry = entry;
    }

    public final NavHostController getNavController() {
        return this.navController;
    }

    public final NavBackStackEntry getEntry() {
        return this.entry;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void navigate$default(LifecycleAwareNavigator lifecycleAwareNavigator, ComposableDestination composableDestination, NavTransition navTransition, BottomBarConfig bottomBarConfig, boolean z, Function1 function1, int i, Object obj) throws Resources.NotFoundException {
        if ((i & 2) != 0) {
            navTransition = null;
        }
        if ((i & 4) != 0) {
            bottomBarConfig = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        if ((i & 16) != 0) {
            function1 = new Function1() { // from class: com.robinhood.android.navigation.compose.LifecycleAwareNavigator$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return LifecycleAwareNavigator.navigate$lambda$0((NavOptionsBuilder) obj2);
                }
            };
        }
        lifecycleAwareNavigator.navigate(composableDestination, navTransition, bottomBarConfig, z, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit navigate$lambda$0(NavOptionsBuilder navOptionsBuilder) {
        Intrinsics.checkNotNullParameter(navOptionsBuilder, "<this>");
        return Unit.INSTANCE;
    }

    public final void navigate(ComposableDestination destination, NavTransition transition, BottomBarConfig bottomBarConfig, boolean skipLifecycleCheck, Function1<? super NavOptionsBuilder, Unit> builder) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (skipLifecycleCheck || isLifecycleAtLeastStarted(this.entry)) {
            NavControllers.navigate(this.navController, destination, transition, bottomBarConfig, builder);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void navigate$default(LifecycleAwareNavigator lifecycleAwareNavigator, ComposableDestinationWithArgs composableDestinationWithArgs, Parcelable parcelable, NavTransition navTransition, BottomBarConfig bottomBarConfig, boolean z, Function1 function1, int i, Object obj) throws Resources.NotFoundException {
        if ((i & 4) != 0) {
            navTransition = null;
        }
        if ((i & 8) != 0) {
            bottomBarConfig = null;
        }
        if ((i & 16) != 0) {
            z = false;
        }
        if ((i & 32) != 0) {
            function1 = new Function1() { // from class: com.robinhood.android.navigation.compose.LifecycleAwareNavigator$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return LifecycleAwareNavigator.navigate$lambda$1((NavOptionsBuilder) obj2);
                }
            };
        }
        lifecycleAwareNavigator.navigate(composableDestinationWithArgs, parcelable, navTransition, bottomBarConfig, z, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit navigate$lambda$1(NavOptionsBuilder navOptionsBuilder) {
        Intrinsics.checkNotNullParameter(navOptionsBuilder, "<this>");
        return Unit.INSTANCE;
    }

    public final <T extends Parcelable> void navigate(ComposableDestinationWithArgs<T> destination, T args, NavTransition transition, BottomBarConfig bottomBarConfig, boolean skipLifecycleCheck, Function1<? super NavOptionsBuilder, Unit> builder) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (skipLifecycleCheck || isLifecycleAtLeastStarted(this.entry)) {
            NavControllers.navigate(this.navController, destination, args, transition, bottomBarConfig, builder);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void navigate$default(LifecycleAwareNavigator lifecycleAwareNavigator, SheetDestination sheetDestination, boolean z, Function1 function1, int i, Object obj) throws Resources.NotFoundException {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: com.robinhood.android.navigation.compose.LifecycleAwareNavigator$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return LifecycleAwareNavigator.navigate$lambda$2((NavOptionsBuilder) obj2);
                }
            };
        }
        lifecycleAwareNavigator.navigate(sheetDestination, z, (Function1<? super NavOptionsBuilder, Unit>) function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit navigate$lambda$2(NavOptionsBuilder navOptionsBuilder) {
        Intrinsics.checkNotNullParameter(navOptionsBuilder, "<this>");
        return Unit.INSTANCE;
    }

    public final void navigate(SheetDestination destination, boolean skipLifecycleCheck, Function1<? super NavOptionsBuilder, Unit> builder) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (skipLifecycleCheck || isLifecycleAtLeastResumed(this.entry)) {
            NavControllers.navigate(this.navController, destination, builder);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void navigate$default(LifecycleAwareNavigator lifecycleAwareNavigator, SheetDestinationWithArgs sheetDestinationWithArgs, Parcelable parcelable, boolean z, Function1 function1, int i, Object obj) throws Resources.NotFoundException {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            function1 = new Function1() { // from class: com.robinhood.android.navigation.compose.LifecycleAwareNavigator$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return LifecycleAwareNavigator.navigate$lambda$3((NavOptionsBuilder) obj2);
                }
            };
        }
        lifecycleAwareNavigator.navigate((SheetDestinationWithArgs<SheetDestinationWithArgs>) sheetDestinationWithArgs, (SheetDestinationWithArgs) parcelable, z, (Function1<? super NavOptionsBuilder, Unit>) function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit navigate$lambda$3(NavOptionsBuilder navOptionsBuilder) {
        Intrinsics.checkNotNullParameter(navOptionsBuilder, "<this>");
        return Unit.INSTANCE;
    }

    public final <T extends Parcelable> void navigate(SheetDestinationWithArgs<T> destination, T args, boolean skipLifecycleCheck, Function1<? super NavOptionsBuilder, Unit> builder) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (skipLifecycleCheck || isLifecycleAtLeastResumed(this.entry)) {
            NavControllers.navigate(this.navController, destination, args, builder);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void navigate$default(LifecycleAwareNavigator lifecycleAwareNavigator, DialogDestination dialogDestination, boolean z, Function1 function1, int i, Object obj) throws Resources.NotFoundException {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: com.robinhood.android.navigation.compose.LifecycleAwareNavigator$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return LifecycleAwareNavigator.navigate$lambda$4((NavOptionsBuilder) obj2);
                }
            };
        }
        lifecycleAwareNavigator.navigate(dialogDestination, z, (Function1<? super NavOptionsBuilder, Unit>) function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit navigate$lambda$4(NavOptionsBuilder navOptionsBuilder) {
        Intrinsics.checkNotNullParameter(navOptionsBuilder, "<this>");
        return Unit.INSTANCE;
    }

    public final void navigate(DialogDestination destination, boolean skipLifecycleCheck, Function1<? super NavOptionsBuilder, Unit> builder) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (skipLifecycleCheck || isLifecycleAtLeastResumed(this.entry)) {
            NavControllers.navigate(this.navController, destination, builder);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void navigate$default(LifecycleAwareNavigator lifecycleAwareNavigator, DialogDestinationWithArgs dialogDestinationWithArgs, Parcelable parcelable, boolean z, Function1 function1, int i, Object obj) throws Resources.NotFoundException {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            function1 = new Function1() { // from class: com.robinhood.android.navigation.compose.LifecycleAwareNavigator$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return LifecycleAwareNavigator.navigate$lambda$5((NavOptionsBuilder) obj2);
                }
            };
        }
        lifecycleAwareNavigator.navigate((DialogDestinationWithArgs<DialogDestinationWithArgs>) dialogDestinationWithArgs, (DialogDestinationWithArgs) parcelable, z, (Function1<? super NavOptionsBuilder, Unit>) function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit navigate$lambda$5(NavOptionsBuilder navOptionsBuilder) {
        Intrinsics.checkNotNullParameter(navOptionsBuilder, "<this>");
        return Unit.INSTANCE;
    }

    public final <T extends Parcelable> void navigate(DialogDestinationWithArgs<T> destination, T args, boolean skipLifecycleCheck, Function1<? super NavOptionsBuilder, Unit> builder) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (skipLifecycleCheck || isLifecycleAtLeastResumed(this.entry)) {
            NavControllers.navigate(this.navController, destination, args, builder);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void navigate$default(LifecycleAwareNavigator lifecycleAwareNavigator, ComposeNav composeNav, boolean z, Function1 function1, int i, Object obj) throws Resources.NotFoundException {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: com.robinhood.android.navigation.compose.LifecycleAwareNavigator$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return LifecycleAwareNavigator.navigate$lambda$6((NavOptionsBuilder) obj2);
                }
            };
        }
        lifecycleAwareNavigator.navigate(composeNav, z, (Function1<? super NavOptionsBuilder, Unit>) function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit navigate$lambda$6(NavOptionsBuilder navOptionsBuilder) {
        Intrinsics.checkNotNullParameter(navOptionsBuilder, "<this>");
        return Unit.INSTANCE;
    }

    public final void navigate(ComposeNav nav, boolean skipLifecycleCheck, Function1<? super NavOptionsBuilder, Unit> builder) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(nav, "nav");
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (skipLifecycleCheck || isLifecycleAtLeastStarted(this.entry)) {
            NavControllers.navigate(this.navController, nav, builder);
        }
    }

    public static /* synthetic */ boolean popBackStack$default(LifecycleAwareNavigator lifecycleAwareNavigator, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return lifecycleAwareNavigator.popBackStack(z);
    }

    public final boolean popBackStack(boolean skipLifecycleCheck) {
        if (skipLifecycleCheck || isLifecycleAtLeastStarted(this.entry)) {
            return this.navController.popBackStack();
        }
        return false;
    }

    public static /* synthetic */ boolean popBackStack$default(LifecycleAwareNavigator lifecycleAwareNavigator, BaseComposableDestination baseComposableDestination, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = false;
        }
        return lifecycleAwareNavigator.popBackStack(baseComposableDestination, z, z2, z3);
    }

    public final boolean popBackStack(BaseComposableDestination destination, boolean inclusive, boolean skipLifecycleCheck, boolean saveState) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (skipLifecycleCheck || isLifecycleAtLeastStarted(this.entry)) {
            return this.navController.popBackStack(destination.getRoutePath(), inclusive, saveState);
        }
        return false;
    }

    public static /* synthetic */ boolean navigateUp$default(LifecycleAwareNavigator lifecycleAwareNavigator, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return lifecycleAwareNavigator.navigateUp(z);
    }

    public final boolean navigateUp(boolean skipLifecycleCheck) {
        if (skipLifecycleCheck || isLifecycleAtLeastStarted(this.entry)) {
            return this.navController.navigateUp();
        }
        return false;
    }

    public static /* synthetic */ void setResultAndPop$default(LifecycleAwareNavigator lifecycleAwareNavigator, Object obj, String str, boolean z, int i, Object obj2) {
        if ((i & 4) != 0) {
            z = false;
        }
        lifecycleAwareNavigator.setResultAndPop(obj, str, z);
    }

    public final <T> void setResultAndPop(T result, String key, boolean skipLifecycleCheck) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(key, "key");
        if (skipLifecycleCheck || isLifecycleAtLeastStarted(this.entry)) {
            SetResultToPreviousEntry.setResultToPreviousEntry(this.navController, result, key);
            this.navController.popBackStack();
        }
    }

    private final boolean isLifecycleAtLeastStarted(NavBackStackEntry navBackStackEntry) {
        return navBackStackEntry.getLifecycle().getState().isAtLeast(Lifecycle.State.STARTED);
    }

    private final boolean isLifecycleAtLeastResumed(NavBackStackEntry navBackStackEntry) {
        return navBackStackEntry.getLifecycle().getState().isAtLeast(Lifecycle.State.RESUMED);
    }
}
