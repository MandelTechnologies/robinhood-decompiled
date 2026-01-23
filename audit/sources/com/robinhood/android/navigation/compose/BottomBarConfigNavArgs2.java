package com.robinhood.android.navigation.compose;

import android.os.Bundle;
import androidx.navigation.NamedNavArgument;
import androidx.navigation.NamedNavArgument2;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestinationBuilder2;
import androidx.navigation.NavHostController;
import androidx.navigation.NavType;
import com.robinhood.android.navigation.compose.BottomBarConfig;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BottomBarConfigNavArgs.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\b\u0010\u0007\u001a\u00020\bH\u0000\u001a\b\u0010\u0011\u001a\u00020\bH\u0000\u001a\b\u0010\u0016\u001a\u00020\bH\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000\"\u001d\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u000b8F¢\u0006\f\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u000e\u0010\u0010\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000\"\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u0006*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u000e\u0010\u0015\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000\"\u0015\u0010\u0017\u001a\u00020\u0018*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, m3636d2 = {"toArgs", "Lcom/robinhood/android/navigation/compose/BottomBarConfigNavArgs;", "Lcom/robinhood/android/navigation/compose/BottomBarConfig;", "navController", "Landroidx/navigation/NavHostController;", "KEY_BOTTOM_BAR_VISIBILITY", "", "bottomBarVisibilityNavArg", "Landroidx/navigation/NamedNavArgument;", "bottomBarVisibility", "Lcom/robinhood/android/navigation/compose/BottomBarVisibility;", "Landroidx/navigation/NavBackStackEntry;", "getBottomBarVisibility$annotations", "(Landroidx/navigation/NavBackStackEntry;)V", "getBottomBarVisibility", "(Landroidx/navigation/NavBackStackEntry;)Lcom/robinhood/android/navigation/compose/BottomBarVisibility;", "KEY_BOTTOM_BAR_TAB_HOST_ID", "bottomBarTabHostIdNavArg", "bottomBarTabHostId", "getBottomBarTabHostId", "(Landroidx/navigation/NavBackStackEntry;)Ljava/lang/String;", "KEY_IS_BOTTOM_BAR_TAB_HOST", "bottomBarTabHostNavArg", "isBottomBarTabHost", "", "(Landroidx/navigation/NavBackStackEntry;)Z", "lib-navigation-compose_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.navigation.compose.BottomBarConfigNavArgsKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class BottomBarConfigNavArgs2 {
    public static final String KEY_BOTTOM_BAR_TAB_HOST_ID = "bottom_bar_tab_host_id";
    public static final String KEY_BOTTOM_BAR_VISIBILITY = "bottom_bar_vis";
    public static final String KEY_IS_BOTTOM_BAR_TAB_HOST = "is_bottom_bar_tab_host";

    public static /* synthetic */ void getBottomBarVisibility$annotations(NavBackStackEntry navBackStackEntry) {
    }

    public static final BottomBarConfigNavArgs toArgs(BottomBarConfig bottomBarConfig, NavHostController navController) {
        Intrinsics.checkNotNullParameter(bottomBarConfig, "<this>");
        Intrinsics.checkNotNullParameter(navController, "navController");
        if (Intrinsics.areEqual(bottomBarConfig, BottomBarConfig.NoBottomBar.INSTANCE)) {
            return new BottomBarConfigNavArgs(BottomBarConfigNavArgs3.HIDE, Boolean.FALSE, null);
        }
        if (Intrinsics.areEqual(bottomBarConfig, BottomBarConfig.Show.INSTANCE)) {
            return new BottomBarConfigNavArgs(BottomBarConfigNavArgs3.SHOW, Boolean.FALSE, NavControllers.findCurrentBottomBarTabHostId(navController));
        }
        if (!(bottomBarConfig instanceof BottomBarConfig.TabHost)) {
            throw new NoWhenBranchMatchedException();
        }
        return new BottomBarConfigNavArgs(BottomBarConfigNavArgs3.SHOW, Boolean.TRUE, ((BottomBarConfig.TabHost) bottomBarConfig).getTabHostId());
    }

    public static final NamedNavArgument bottomBarVisibilityNavArg() {
        return NamedNavArgument2.navArgument(KEY_BOTTOM_BAR_VISIBILITY, new Function1() { // from class: com.robinhood.android.navigation.compose.BottomBarConfigNavArgsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BottomBarConfigNavArgs2.bottomBarVisibilityNavArg$lambda$0((NavDestinationBuilder2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bottomBarVisibilityNavArg$lambda$0(NavDestinationBuilder2 navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(new NavType.EnumType(BottomBarConfigNavArgs3.class));
        navArgument.setDefaultValue(BottomBarConfigNavArgs3.HIDE);
        return Unit.INSTANCE;
    }

    public static final BottomBarConfigNavArgs3 getBottomBarVisibility(NavBackStackEntry navBackStackEntry) {
        Intrinsics.checkNotNullParameter(navBackStackEntry, "<this>");
        Bundle arguments = navBackStackEntry.getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable(KEY_BOTTOM_BAR_VISIBILITY) : null;
        if (serializable instanceof BottomBarConfigNavArgs3) {
            return (BottomBarConfigNavArgs3) serializable;
        }
        return null;
    }

    public static final NamedNavArgument bottomBarTabHostIdNavArg() {
        return NamedNavArgument2.navArgument(KEY_BOTTOM_BAR_TAB_HOST_ID, new Function1() { // from class: com.robinhood.android.navigation.compose.BottomBarConfigNavArgsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BottomBarConfigNavArgs2.bottomBarTabHostIdNavArg$lambda$1((NavDestinationBuilder2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bottomBarTabHostIdNavArg$lambda$1(NavDestinationBuilder2 navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(NavType.StringType);
        navArgument.setNullable(true);
        return Unit.INSTANCE;
    }

    public static final String getBottomBarTabHostId(NavBackStackEntry navBackStackEntry) {
        Intrinsics.checkNotNullParameter(navBackStackEntry, "<this>");
        Bundle arguments = navBackStackEntry.getArguments();
        if (arguments != null) {
            return arguments.getString(KEY_BOTTOM_BAR_TAB_HOST_ID);
        }
        return null;
    }

    public static final NamedNavArgument bottomBarTabHostNavArg() {
        return NamedNavArgument2.navArgument(KEY_IS_BOTTOM_BAR_TAB_HOST, new Function1() { // from class: com.robinhood.android.navigation.compose.BottomBarConfigNavArgsKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BottomBarConfigNavArgs2.bottomBarTabHostNavArg$lambda$2((NavDestinationBuilder2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bottomBarTabHostNavArg$lambda$2(NavDestinationBuilder2 navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(NavType.BoolType);
        return Unit.INSTANCE;
    }

    public static final boolean isBottomBarTabHost(NavBackStackEntry navBackStackEntry) {
        Intrinsics.checkNotNullParameter(navBackStackEntry, "<this>");
        Bundle arguments = navBackStackEntry.getArguments();
        if (arguments != null) {
            return arguments.getBoolean(KEY_IS_BOTTOM_BAR_TAB_HOST);
        }
        return false;
    }
}
