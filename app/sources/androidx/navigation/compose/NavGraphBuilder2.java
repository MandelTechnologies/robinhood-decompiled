package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.p011ui.window.DialogProperties;
import androidx.compose.p011ui.window.SecureFlagPolicy;
import androidx.compose.runtime.Composer;
import androidx.navigation.NamedNavArgument;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavGraph;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.compose.ComposeNavGraphNavigator;
import androidx.navigation.compose.ComposeNavigator;
import androidx.navigation.compose.DialogNavigator;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: NavGraphBuilder.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0080\u0002\u0010\u0017\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032(\b\u0002\u0010\u000e\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\b¢\u0006\u0002\b\f¢\u0006\u0002\b\r2(\b\u0002\u0010\u0010\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\b¢\u0006\u0002\b\f¢\u0006\u0002\b\r2(\b\u0002\u0010\u0011\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\b¢\u0006\u0002\b\f¢\u0006\u0002\b\r2(\b\u0002\u0010\u0012\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\b¢\u0006\u0002\b\f¢\u0006\u0002\b\r2\u001d\u0010\u0016\u001a\u0019\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\r¢\u0006\u0004\b\u0017\u0010\u0018\u001aî\u0001\u0010\u001b\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032#\b\u0002\u0010\u000e\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\b¢\u0006\u0002\b\r2#\b\u0002\u0010\u0010\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\b¢\u0006\u0002\b\r2#\b\u0002\u0010\u0011\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\b¢\u0006\u0002\b\r2#\b\u0002\u0010\u0012\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\b¢\u0006\u0002\b\r2\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00150\b¢\u0006\u0002\b\r¢\u0006\u0004\b\u001b\u0010\u001c\u001aW\u0010\u001f\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00150\b¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, m3636d2 = {"Landroidx/navigation/NavGraphBuilder;", "", PlaceTypes.ROUTE, "", "Landroidx/navigation/NamedNavArgument;", "arguments", "Landroidx/navigation/NavDeepLink;", "deepLinks", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/navigation/NavBackStackEntry;", "Landroidx/compose/animation/EnterTransition;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lkotlin/ExtensionFunctionType;", "enterTransition", "Landroidx/compose/animation/ExitTransition;", "exitTransition", "popEnterTransition", "popExitTransition", "Lkotlin/Function2;", "Landroidx/compose/animation/AnimatedContentScope;", "", "content", "composable", "(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "startDestination", "builder", "navigation", "(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/window/DialogProperties;", "dialogProperties", "dialog", "(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/window/DialogProperties;Lkotlin/jvm/functions/Function3;)V", "navigation-compose_release"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.navigation.compose.NavGraphBuilderKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class NavGraphBuilder2 {
    public static final void composable(NavGraphBuilder navGraphBuilder, String str, List<NamedNavArgument> list, List<NavDeepLink> list2, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function1, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function12, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function13, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function14, Function4<? super AnimatedContentScope, ? super NavBackStackEntry, ? super Composer, ? super Integer, Unit> function4) {
        ComposeNavigator.Destination destination = new ComposeNavigator.Destination((ComposeNavigator) navGraphBuilder.getProvider().getNavigator(ComposeNavigator.class), function4);
        destination.setRoute(str);
        for (NamedNavArgument namedNavArgument : list) {
            destination.addArgument(namedNavArgument.getName(), namedNavArgument.getArgument());
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            destination.addDeepLink((NavDeepLink) it.next());
        }
        destination.setEnterTransition$navigation_compose_release(function1);
        destination.setExitTransition$navigation_compose_release(function12);
        destination.setPopEnterTransition$navigation_compose_release(function13);
        destination.setPopExitTransition$navigation_compose_release(function14);
        navGraphBuilder.addDestination(destination);
    }

    public static /* synthetic */ void navigation$default(NavGraphBuilder navGraphBuilder, String str, String str2, List list, List list2, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, int i, Object obj) {
        if ((i & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        List list3 = list;
        List listEmptyList = (i & 8) != 0 ? CollectionsKt.emptyList() : list2;
        Function1 function16 = (i & 16) != 0 ? null : function1;
        Function1 function17 = (i & 32) != 0 ? null : function12;
        navigation(navGraphBuilder, str, str2, list3, listEmptyList, function16, function17, (i & 64) != 0 ? function16 : function13, (i & 128) != 0 ? function17 : function14, function15);
    }

    public static final void navigation(NavGraphBuilder navGraphBuilder, String str, String str2, List<NamedNavArgument> list, List<NavDeepLink> list2, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function1, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function12, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function13, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function14, Function1<? super NavGraphBuilder, Unit> function15) {
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.getProvider(), str, str2);
        function15.invoke(navGraphBuilder2);
        NavGraph navGraphBuild = navGraphBuilder2.build();
        for (NamedNavArgument namedNavArgument : list) {
            navGraphBuild.addArgument(namedNavArgument.getName(), namedNavArgument.getArgument());
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            navGraphBuild.addDeepLink((NavDeepLink) it.next());
        }
        if (navGraphBuild instanceof ComposeNavGraphNavigator.ComposeNavGraph) {
            ComposeNavGraphNavigator.ComposeNavGraph composeNavGraph = (ComposeNavGraphNavigator.ComposeNavGraph) navGraphBuild;
            composeNavGraph.setEnterTransition$navigation_compose_release(function1);
            composeNavGraph.setExitTransition$navigation_compose_release(function12);
            composeNavGraph.setPopEnterTransition$navigation_compose_release(function13);
            composeNavGraph.setPopExitTransition$navigation_compose_release(function14);
        }
        navGraphBuilder.addDestination(navGraphBuild);
    }

    public static /* synthetic */ void dialog$default(NavGraphBuilder navGraphBuilder, String str, List list, List list2, DialogProperties dialogProperties, Function3 function3, int i, Object obj) {
        if ((i & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        List list3 = list;
        if ((i & 4) != 0) {
            list2 = CollectionsKt.emptyList();
        }
        dialog(navGraphBuilder, str, list3, list2, (i & 8) != 0 ? new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null) : dialogProperties, function3);
    }

    public static final void dialog(NavGraphBuilder navGraphBuilder, String str, List<NamedNavArgument> list, List<NavDeepLink> list2, DialogProperties dialogProperties, Function3<? super NavBackStackEntry, ? super Composer, ? super Integer, Unit> function3) {
        DialogNavigator.Destination destination = new DialogNavigator.Destination((DialogNavigator) navGraphBuilder.getProvider().getNavigator(DialogNavigator.class), dialogProperties, function3);
        destination.setRoute(str);
        for (NamedNavArgument namedNavArgument : list) {
            destination.addArgument(namedNavArgument.getName(), namedNavArgument.getArgument());
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            destination.addDeepLink((NavDeepLink) it.next());
        }
        navGraphBuilder.addDestination(destination);
    }
}
