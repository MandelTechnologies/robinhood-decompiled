package com.robinhood.android.navigation.compose;

import androidx.navigation.NavController;
import androidx.navigation.NavGraph;
import androidx.navigation.NavOptionsBuilder;
import androidx.navigation.NavOptionsBuilder4;
import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NavOptionsBuilders.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u001a\u001a\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\n"}, m3636d2 = {"popUpToStartDestination", "", "Landroidx/navigation/NavOptionsBuilder;", "navController", "Landroidx/navigation/NavController;", "inclusive", "", "popUpTo", PlaceTypes.ROUTE, "", "lib-navigation-compose_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.navigation.compose.NavOptionsBuildersKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class NavOptionsBuilders {
    public static /* synthetic */ void popUpToStartDestination$default(NavOptionsBuilder navOptionsBuilder, NavController navController, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        popUpToStartDestination(navOptionsBuilder, navController, z);
    }

    public static final void popUpToStartDestination(NavOptionsBuilder navOptionsBuilder, NavController navController, final boolean z) {
        Intrinsics.checkNotNullParameter(navOptionsBuilder, "<this>");
        Intrinsics.checkNotNullParameter(navController, "navController");
        navOptionsBuilder.popUpTo(NavGraph.INSTANCE.findStartDestination(navController.getGraph()).getId(), new Function1() { // from class: com.robinhood.android.navigation.compose.NavOptionsBuildersKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NavOptionsBuilders.popUpToStartDestination$lambda$0(z, (NavOptionsBuilder4) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit popUpToStartDestination$lambda$0(boolean z, NavOptionsBuilder4 popUpTo) {
        Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
        popUpTo.setInclusive(z);
        return Unit.INSTANCE;
    }

    public static final void popUpTo(NavOptionsBuilder navOptionsBuilder, String route, final boolean z) {
        Intrinsics.checkNotNullParameter(navOptionsBuilder, "<this>");
        Intrinsics.checkNotNullParameter(route, "route");
        navOptionsBuilder.popUpTo(route, new Function1() { // from class: com.robinhood.android.navigation.compose.NavOptionsBuildersKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NavOptionsBuilders.popUpTo$lambda$1(z, (NavOptionsBuilder4) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit popUpTo$lambda$1(boolean z, NavOptionsBuilder4 popUpTo) {
        Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
        popUpTo.setInclusive(z);
        return Unit.INSTANCE;
    }
}
