package com.robinhood.android.navigation.compose;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.os.Parcelable;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptionsBuilder;
import androidx.navigation.NavOptionsBuilder4;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.navigation.compose.destination.ComposableDestination;
import com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs;
import com.robinhood.android.navigation.compose.destination.ComposeNav;
import com.robinhood.android.navigation.compose.destination.DialogDestination;
import com.robinhood.android.navigation.compose.destination.DialogDestinationWithArgs;
import com.robinhood.android.navigation.compose.destination.SheetDestination;
import com.robinhood.android.navigation.compose.destination.SheetDestinationWithArgs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: NavControllers.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aG\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u001b\b\u0002\u0010\t\u001a\u0015\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n¢\u0006\u0002\b\f\u001ad\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\r*\u00020\u000e*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\r0\u000f2\u0006\u0010\u0010\u001a\u0002H\r2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u001b\b\u0002\u0010\t\u001a\u0015\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n¢\u0006\u0002\b\f¢\u0006\u0002\u0010\u0011\u001a/\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00122\u001b\b\u0002\u0010\t\u001a\u0015\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n¢\u0006\u0002\b\f\u001aL\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\r*\u00020\u000e*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\r0\u00132\u0006\u0010\u0010\u001a\u0002H\r2\u001b\b\u0002\u0010\t\u001a\u0015\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n¢\u0006\u0002\b\f¢\u0006\u0002\u0010\u0014\u001a/\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00152\u001b\b\u0002\u0010\t\u001a\u0015\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n¢\u0006\u0002\b\f\u001aL\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\r*\u00020\u000e*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\r0\u00162\u0006\u0010\u0010\u001a\u0002H\r2\u001b\b\u0002\u0010\t\u001a\u0015\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n¢\u0006\u0002\b\f¢\u0006\u0002\u0010\u0017\u001a/\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u001b\b\u0002\u0010\t\u001a\u0015\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n¢\u0006\u0002\b\f\u001a\u0012\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b*\u00020\u001dH\u0007\u001a\u0014\u0010\u001e\u001a\u00020\u001f*\u00020\u00022\u0006\u0010 \u001a\u00020!H\u0007\u001a\u0016\u0010\"\u001a\u0004\u0018\u00010#*\u00020\u001d2\u0006\u0010$\u001a\u00020!H\u0007\u001a\u000e\u0010%\u001a\u0004\u0018\u00010!*\u00020\u001dH\u0000\u001a\u000e\u0010&\u001a\u0004\u0018\u00010\u001c*\u00020\u001dH\u0000\u001a\u001d\u0010'\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\f*\u00020\u001dH\u0000¨\u0006("}, m3636d2 = {"navigate", "", "Landroidx/navigation/NavController;", "destination", "Lcom/robinhood/android/navigation/compose/destination/ComposableDestination;", NavTransition2.KEY_TRANSITION, "Lcom/robinhood/android/navigation/compose/NavTransition;", "bottomBarConfig", "Lcom/robinhood/android/navigation/compose/BottomBarConfig;", "builder", "Lkotlin/Function1;", "Landroidx/navigation/NavOptionsBuilder;", "Lkotlin/ExtensionFunctionType;", "T", "Landroid/os/Parcelable;", "Lcom/robinhood/android/navigation/compose/destination/ComposableDestinationWithArgs;", "args", "(Landroidx/navigation/NavController;Lcom/robinhood/android/navigation/compose/destination/ComposableDestinationWithArgs;Landroid/os/Parcelable;Lcom/robinhood/android/navigation/compose/NavTransition;Lcom/robinhood/android/navigation/compose/BottomBarConfig;Lkotlin/jvm/functions/Function1;)V", "Lcom/robinhood/android/navigation/compose/destination/SheetDestination;", "Lcom/robinhood/android/navigation/compose/destination/SheetDestinationWithArgs;", "(Landroidx/navigation/NavController;Lcom/robinhood/android/navigation/compose/destination/SheetDestinationWithArgs;Landroid/os/Parcelable;Lkotlin/jvm/functions/Function1;)V", "Lcom/robinhood/android/navigation/compose/destination/DialogDestination;", "Lcom/robinhood/android/navigation/compose/destination/DialogDestinationWithArgs;", "(Landroidx/navigation/NavController;Lcom/robinhood/android/navigation/compose/destination/DialogDestinationWithArgs;Landroid/os/Parcelable;Lkotlin/jvm/functions/Function1;)V", "nav", "Lcom/robinhood/android/navigation/compose/destination/ComposeNav;", "destinationBackStack", "", "Landroidx/navigation/NavBackStackEntry;", "Landroidx/navigation/NavHostController;", "isInBackStack", "", "destinationRoute", "", "findNonGraphDestination", "Landroidx/navigation/NavDestination;", PlaceTypes.ROUTE, "findCurrentBottomBarTabHostId", "findBottomBarFirstTabHost", "bottomBarHostDefaultNavOptions", "lib-navigation-compose_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.navigation.compose.NavControllersKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class NavControllers {
    public static /* synthetic */ void navigate$default(NavController navController, ComposableDestination composableDestination, NavTransition navTransition, BottomBarConfig bottomBarConfig, Function1 function1, int i, Object obj) throws Resources.NotFoundException {
        if ((i & 2) != 0) {
            navTransition = null;
        }
        if ((i & 4) != 0) {
            bottomBarConfig = null;
        }
        if ((i & 8) != 0) {
            function1 = null;
        }
        navigate(navController, composableDestination, navTransition, bottomBarConfig, function1);
    }

    public static final void navigate(NavController navController, ComposableDestination destination, NavTransition navTransition, BottomBarConfig bottomBarConfig, Function1<? super NavOptionsBuilder, Unit> function1) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(navController, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        NavHostController navHostController = (NavHostController) navController;
        navController.navigate(destination.destinationRoute(navHostController, navTransition, bottomBarConfig), destination.navOptionsBuilder$lib_navigation_compose_externalDebug(navHostController, function1, bottomBarConfig));
    }

    public static /* synthetic */ void navigate$default(NavController navController, ComposableDestinationWithArgs composableDestinationWithArgs, Parcelable parcelable, NavTransition navTransition, BottomBarConfig bottomBarConfig, Function1 function1, int i, Object obj) throws Resources.NotFoundException {
        if ((i & 4) != 0) {
            navTransition = null;
        }
        if ((i & 8) != 0) {
            bottomBarConfig = null;
        }
        if ((i & 16) != 0) {
            function1 = null;
        }
        navigate(navController, composableDestinationWithArgs, parcelable, navTransition, bottomBarConfig, function1);
    }

    public static final <T extends Parcelable> void navigate(NavController navController, ComposableDestinationWithArgs<T> destination, T args, NavTransition navTransition, BottomBarConfig bottomBarConfig, Function1<? super NavOptionsBuilder, Unit> function1) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(navController, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(args, "args");
        NavHostController navHostController = (NavHostController) navController;
        navController.navigate(destination.destinationRoute(navHostController, args, navTransition, bottomBarConfig), destination.navOptionsBuilder$lib_navigation_compose_externalDebug(navHostController, function1, bottomBarConfig));
    }

    public static /* synthetic */ void navigate$default(NavController navController, SheetDestination sheetDestination, Function1 function1, int i, Object obj) throws Resources.NotFoundException {
        if ((i & 2) != 0) {
            function1 = null;
        }
        navigate(navController, sheetDestination, (Function1<? super NavOptionsBuilder, Unit>) function1);
    }

    public static final void navigate(NavController navController, SheetDestination destination, Function1<? super NavOptionsBuilder, Unit> function1) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(navController, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        String routeScreenName = destination.getRouteScreenName();
        if (function1 == null) {
            function1 = new Function1() { // from class: com.robinhood.android.navigation.compose.NavControllersKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NavControllers.navigate$lambda$0((NavOptionsBuilder) obj);
                }
            };
        }
        navController.navigate(routeScreenName, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit navigate$lambda$0(NavOptionsBuilder navOptionsBuilder) {
        Intrinsics.checkNotNullParameter(navOptionsBuilder, "<this>");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void navigate$default(NavController navController, SheetDestinationWithArgs sheetDestinationWithArgs, Parcelable parcelable, Function1 function1, int i, Object obj) throws Resources.NotFoundException {
        if ((i & 4) != 0) {
            function1 = null;
        }
        navigate(navController, (SheetDestinationWithArgs<Parcelable>) sheetDestinationWithArgs, parcelable, (Function1<? super NavOptionsBuilder, Unit>) function1);
    }

    public static final <T extends Parcelable> void navigate(NavController navController, SheetDestinationWithArgs<T> destination, T args, Function1<? super NavOptionsBuilder, Unit> function1) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(navController, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(args, "args");
        String strDestinationRoute$lib_navigation_compose_externalDebug = destination.destinationRoute$lib_navigation_compose_externalDebug(args);
        if (function1 == null) {
            function1 = new Function1() { // from class: com.robinhood.android.navigation.compose.NavControllersKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NavControllers.navigate$lambda$1((NavOptionsBuilder) obj);
                }
            };
        }
        navController.navigate(strDestinationRoute$lib_navigation_compose_externalDebug, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit navigate$lambda$1(NavOptionsBuilder navOptionsBuilder) {
        Intrinsics.checkNotNullParameter(navOptionsBuilder, "<this>");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void navigate$default(NavController navController, DialogDestination dialogDestination, Function1 function1, int i, Object obj) throws Resources.NotFoundException {
        if ((i & 2) != 0) {
            function1 = null;
        }
        navigate(navController, dialogDestination, (Function1<? super NavOptionsBuilder, Unit>) function1);
    }

    public static final void navigate(NavController navController, DialogDestination destination, Function1<? super NavOptionsBuilder, Unit> function1) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(navController, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        String routeScreenName = destination.getRouteScreenName();
        if (function1 == null) {
            function1 = new Function1() { // from class: com.robinhood.android.navigation.compose.NavControllersKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NavControllers.navigate$lambda$2((NavOptionsBuilder) obj);
                }
            };
        }
        navController.navigate(routeScreenName, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit navigate$lambda$2(NavOptionsBuilder navOptionsBuilder) {
        Intrinsics.checkNotNullParameter(navOptionsBuilder, "<this>");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void navigate$default(NavController navController, DialogDestinationWithArgs dialogDestinationWithArgs, Parcelable parcelable, Function1 function1, int i, Object obj) throws Resources.NotFoundException {
        if ((i & 4) != 0) {
            function1 = null;
        }
        navigate(navController, (DialogDestinationWithArgs<Parcelable>) dialogDestinationWithArgs, parcelable, (Function1<? super NavOptionsBuilder, Unit>) function1);
    }

    public static final <T extends Parcelable> void navigate(NavController navController, DialogDestinationWithArgs<T> destination, T args, Function1<? super NavOptionsBuilder, Unit> function1) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(navController, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(args, "args");
        String strDestinationRoute$lib_navigation_compose_externalDebug = destination.destinationRoute$lib_navigation_compose_externalDebug(args);
        if (function1 == null) {
            function1 = new Function1() { // from class: com.robinhood.android.navigation.compose.NavControllersKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NavControllers.navigate$lambda$3((NavOptionsBuilder) obj);
                }
            };
        }
        navController.navigate(strDestinationRoute$lib_navigation_compose_externalDebug, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit navigate$lambda$3(NavOptionsBuilder navOptionsBuilder) {
        Intrinsics.checkNotNullParameter(navOptionsBuilder, "<this>");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void navigate$default(NavController navController, ComposeNav composeNav, Function1 function1, int i, Object obj) throws Resources.NotFoundException {
        if ((i & 2) != 0) {
            function1 = null;
        }
        navigate(navController, composeNav, (Function1<? super NavOptionsBuilder, Unit>) function1);
    }

    public static final void navigate(NavController navController, ComposeNav nav, Function1<? super NavOptionsBuilder, Unit> function1) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(navController, "<this>");
        Intrinsics.checkNotNullParameter(nav, "nav");
        if (nav instanceof ComposeNav.Dest) {
            ComposeNav.Dest dest = (ComposeNav.Dest) nav;
            navigate(navController, dest.getDest(), dest.getTransition(), dest.getBottomBarConfig(), function1);
            return;
        }
        if (nav instanceof ComposeNav.DestWithArgs) {
            ComposeNav.DestWithArgs destWithArgs = (ComposeNav.DestWithArgs) nav;
            ComposableDestinationWithArgs<?> dest2 = destWithArgs.getDest();
            Intrinsics.checkNotNull(dest2, "null cannot be cast to non-null type com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs<android.os.Parcelable>");
            navigate(navController, dest2, destWithArgs.getArgs(), destWithArgs.getTransition(), destWithArgs.getBottomBarConfig(), function1);
            return;
        }
        if (nav instanceof ComposeNav.SheetDest) {
            navigate(navController, ((ComposeNav.SheetDest) nav).getDest(), function1);
            return;
        }
        if (nav instanceof ComposeNav.SheetDestWithArgs) {
            ComposeNav.SheetDestWithArgs sheetDestWithArgs = (ComposeNav.SheetDestWithArgs) nav;
            SheetDestinationWithArgs<?> dest3 = sheetDestWithArgs.getDest();
            Intrinsics.checkNotNull(dest3, "null cannot be cast to non-null type com.robinhood.android.navigation.compose.destination.SheetDestinationWithArgs<android.os.Parcelable>");
            navigate(navController, (SheetDestinationWithArgs<Parcelable>) dest3, sheetDestWithArgs.getArgs(), function1);
            return;
        }
        if (nav instanceof ComposeNav.DialogDest) {
            navigate(navController, ((ComposeNav.DialogDest) nav).getDest(), function1);
        } else {
            if (!(nav instanceof ComposeNav.DialogDestWithArgs)) {
                throw new NoWhenBranchMatchedException();
            }
            ComposeNav.DialogDestWithArgs dialogDestWithArgs = (ComposeNav.DialogDestWithArgs) nav;
            DialogDestinationWithArgs<?> dest4 = dialogDestWithArgs.getDest();
            Intrinsics.checkNotNull(dest4, "null cannot be cast to non-null type com.robinhood.android.navigation.compose.destination.DialogDestinationWithArgs<android.os.Parcelable>");
            navigate(navController, (DialogDestinationWithArgs<Parcelable>) dest4, dialogDestWithArgs.getArgs(), function1);
        }
    }

    @SuppressLint({"RestrictedApi"})
    public static final List<NavBackStackEntry> destinationBackStack(NavHostController navHostController) {
        Intrinsics.checkNotNullParameter(navHostController, "<this>");
        List<NavBackStackEntry> value = navHostController.getCurrentBackStack().getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : value) {
            if (!(((NavBackStackEntry) obj).getDestination() instanceof NavGraph)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @SuppressLint({"RestrictedApi"})
    public static final boolean isInBackStack(NavController navController, String destinationRoute) {
        Intrinsics.checkNotNullParameter(navController, "<this>");
        Intrinsics.checkNotNullParameter(destinationRoute, "destinationRoute");
        List<NavBackStackEntry> value = navController.getCurrentBackStack().getValue();
        if ((value instanceof Collection) && value.isEmpty()) {
            return false;
        }
        Iterator<T> it = value.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(((NavBackStackEntry) it.next()).getDestination().getRoute(), destinationRoute)) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"RestrictedApi"})
    public static final NavDestination findNonGraphDestination(NavHostController navHostController, String route) {
        NavDestination navDestinationFindStartDestination;
        Intrinsics.checkNotNullParameter(navHostController, "<this>");
        Intrinsics.checkNotNullParameter(route, "route");
        NavDestination navDestinationFindDestination = navHostController.findDestination(route);
        if (navDestinationFindDestination == null) {
            return null;
        }
        NavGraph navGraph = navDestinationFindDestination instanceof NavGraph ? (NavGraph) navDestinationFindDestination : null;
        return (navGraph == null || (navDestinationFindStartDestination = NavGraph.INSTANCE.findStartDestination(navGraph)) == null) ? navDestinationFindDestination : navDestinationFindStartDestination;
    }

    public static final String findCurrentBottomBarTabHostId(NavHostController navHostController) {
        NavBackStackEntry navBackStackEntryPrevious;
        Intrinsics.checkNotNullParameter(navHostController, "<this>");
        List<NavBackStackEntry> listDestinationBackStack = destinationBackStack(navHostController);
        ListIterator<NavBackStackEntry> listIterator = listDestinationBackStack.listIterator(listDestinationBackStack.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                navBackStackEntryPrevious = null;
                break;
            }
            navBackStackEntryPrevious = listIterator.previous();
            if (BottomBarConfigNavArgs2.isBottomBarTabHost(navBackStackEntryPrevious)) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry = navBackStackEntryPrevious;
        if (navBackStackEntry != null) {
            return BottomBarConfigNavArgs2.getBottomBarTabHostId(navBackStackEntry);
        }
        return null;
    }

    public static final NavBackStackEntry findBottomBarFirstTabHost(NavHostController navHostController) {
        Object next;
        Intrinsics.checkNotNullParameter(navHostController, "<this>");
        Iterator<T> it = destinationBackStack(navHostController).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (BottomBarConfigNavArgs2.isBottomBarTabHost((NavBackStackEntry) next)) {
                break;
            }
        }
        return (NavBackStackEntry) next;
    }

    public static final Function1<NavOptionsBuilder, Unit> bottomBarHostDefaultNavOptions(NavHostController navHostController) {
        NavDestination destination;
        final String route;
        Intrinsics.checkNotNullParameter(navHostController, "<this>");
        NavBackStackEntry navBackStackEntryFindBottomBarFirstTabHost = findBottomBarFirstTabHost(navHostController);
        if (navBackStackEntryFindBottomBarFirstTabHost == null || (destination = navBackStackEntryFindBottomBarFirstTabHost.getDestination()) == null || (route = destination.getRoute()) == null) {
            return new Function1() { // from class: com.robinhood.android.navigation.compose.NavControllersKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NavControllers.bottomBarHostDefaultNavOptions$lambda$9((NavOptionsBuilder) obj);
                }
            };
        }
        return new Function1() { // from class: com.robinhood.android.navigation.compose.NavControllersKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NavControllers.bottomBarHostDefaultNavOptions$lambda$11(route, (NavOptionsBuilder) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bottomBarHostDefaultNavOptions$lambda$9(NavOptionsBuilder navOptionsBuilder) {
        Intrinsics.checkNotNullParameter(navOptionsBuilder, "<this>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bottomBarHostDefaultNavOptions$lambda$11(String str, NavOptionsBuilder navOptionsBuilder) {
        Intrinsics.checkNotNullParameter(navOptionsBuilder, "<this>");
        navOptionsBuilder.popUpTo(str, new Function1() { // from class: com.robinhood.android.navigation.compose.NavControllersKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NavControllers.bottomBarHostDefaultNavOptions$lambda$11$lambda$10((NavOptionsBuilder4) obj);
            }
        });
        navOptionsBuilder.setLaunchSingleTop(true);
        navOptionsBuilder.setRestoreState(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bottomBarHostDefaultNavOptions$lambda$11$lambda$10(NavOptionsBuilder4 popUpTo) {
        Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
        popUpTo.setSaveState(true);
        return Unit.INSTANCE;
    }
}
