package com.robinhood.android.navigation.compose;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NamedNavArgument;
import androidx.navigation.NamedNavArgument2;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestinationBuilder2;
import androidx.navigation.NavType;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NavTransition.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00078F¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\f8F¢\u0006\u0006\u001a\u0004\b\n\u0010\r¨\u0006\u000e"}, m3636d2 = {"KEY_TRANSITION", "", "transitionNavArg", "Landroidx/navigation/NamedNavArgument;", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "Lcom/robinhood/android/navigation/compose/NavTransition;", NavTransition2.KEY_TRANSITION, "Landroidx/navigation/NavBackStackEntry;", "getTransition$annotations", "(Landroidx/navigation/NavBackStackEntry;)V", "getTransition", "(Landroidx/navigation/NavBackStackEntry;)Lcom/robinhood/android/navigation/compose/NavTransition;", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)Lcom/robinhood/android/navigation/compose/NavTransition;", "lib-navigation-compose_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.navigation.compose.NavTransitionKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class NavTransition2 {
    public static final String KEY_TRANSITION = "transition";

    public static /* synthetic */ void getTransition$annotations(NavBackStackEntry navBackStackEntry) {
    }

    public static final NamedNavArgument transitionNavArg(final NavTransition navTransition) {
        Intrinsics.checkNotNullParameter(navTransition, "default");
        return NamedNavArgument2.navArgument(KEY_TRANSITION, new Function1() { // from class: com.robinhood.android.navigation.compose.NavTransitionKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NavTransition2.transitionNavArg$lambda$0(navTransition, (NavDestinationBuilder2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit transitionNavArg$lambda$0(NavTransition navTransition, NavDestinationBuilder2 navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(new NavType.EnumType(NavTransition.class));
        navArgument.setDefaultValue(navTransition);
        return Unit.INSTANCE;
    }

    public static final NavTransition getTransition(NavBackStackEntry navBackStackEntry) {
        Intrinsics.checkNotNullParameter(navBackStackEntry, "<this>");
        Bundle arguments = navBackStackEntry.getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable(KEY_TRANSITION) : null;
        if (serializable instanceof NavTransition) {
            return (NavTransition) serializable;
        }
        return null;
    }

    public static final NavTransition getTransition(SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "<this>");
        return (NavTransition) savedStateHandle.get(KEY_TRANSITION);
    }
}
