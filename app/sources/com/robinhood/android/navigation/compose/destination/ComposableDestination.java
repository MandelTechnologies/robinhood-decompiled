package com.robinhood.android.navigation.compose.destination;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NamedNavArgument;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptionsBuilder;
import com.robinhood.android.navigation.compose.BottomBarConfig;
import com.robinhood.android.navigation.compose.BottomBarConfigNavArgs;
import com.robinhood.android.navigation.compose.BottomBarConfigNavArgs2;
import com.robinhood.android.navigation.compose.BottomBarConfigNavArgs3;
import com.robinhood.android.navigation.compose.NavControllers;
import com.robinhood.android.navigation.compose.NavTransition;
import com.robinhood.android.navigation.compose.NavTransition2;
import com.robinhood.android.navigation.compose.destination.ComposeNav;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ComposableDestination.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0007H\u0016JM\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a¢\u0006\u0002\b\u001d2\u0006\u0010\u0015\u001a\u00020\u00162\u0019\u0010\u001e\u001a\u0015\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001a¢\u0006\u0002\b\u001d2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0002\b\u001fJ\u001a\u0010 \u001a\u00020!2\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u0007J\b\u0010\"\u001a\u00020#H\u0016J\u0018\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020#H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u0003X\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/navigation/compose/destination/ComposableDestination;", "Lcom/robinhood/android/navigation/compose/destination/BaseComposableDestination;", "routeScreenName", "", "defaultTransition", "Lcom/robinhood/android/navigation/compose/NavTransition;", "defaultBottomBarConfig", "Lcom/robinhood/android/navigation/compose/BottomBarConfig;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/navigation/compose/NavTransition;Lcom/robinhood/android/navigation/compose/BottomBarConfig;)V", "routePath", "getRoutePath$annotations", "()V", "getRoutePath", "()Ljava/lang/String;", "argumentList", "", "Landroidx/navigation/NamedNavArgument;", "getArgumentList", "()Ljava/util/List;", "destinationRoute", "navController", "Landroidx/navigation/NavHostController;", NavTransition2.KEY_TRANSITION, "bottomBarConfig", "navOptionsBuilder", "Lkotlin/Function1;", "Landroidx/navigation/NavOptionsBuilder;", "", "Lkotlin/ExtensionFunctionType;", "builder", "navOptionsBuilder$lib_navigation_compose_externalDebug", "composeNav", "Lcom/robinhood/android/navigation/compose/destination/ComposeNav$Dest;", "describeContents", "", "writeToParcel", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public class ComposableDestination implements BaseComposableDestination {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ComposableDestination> CREATOR = new Creator();
    private final BottomBarConfig defaultBottomBarConfig;
    private final NavTransition defaultTransition;
    private final String routePath;
    private final String routeScreenName;

    /* compiled from: ComposableDestination.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ComposableDestination> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ComposableDestination createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ComposableDestination(parcel.readString(), NavTransition.valueOf(parcel.readString()), (BottomBarConfig) parcel.readParcelable(ComposableDestination.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ComposableDestination[] newArray(int i) {
            return new ComposableDestination[i];
        }
    }

    public static /* synthetic */ void getRoutePath$annotations() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.routeScreenName);
        dest.writeString(this.defaultTransition.name());
        dest.writeParcelable(this.defaultBottomBarConfig, flags);
    }

    public ComposableDestination(String routeScreenName, NavTransition defaultTransition, BottomBarConfig defaultBottomBarConfig) {
        Intrinsics.checkNotNullParameter(routeScreenName, "routeScreenName");
        Intrinsics.checkNotNullParameter(defaultTransition, "defaultTransition");
        Intrinsics.checkNotNullParameter(defaultBottomBarConfig, "defaultBottomBarConfig");
        this.routeScreenName = routeScreenName;
        this.defaultTransition = defaultTransition;
        this.defaultBottomBarConfig = defaultBottomBarConfig;
        this.routePath = routeScreenName + "/{transition}/{bottom_bar_vis}/{bottom_bar_tab_host_id}/{is_bottom_bar_tab_host}";
    }

    public /* synthetic */ ComposableDestination(String str, NavTransition navTransition, BottomBarConfig bottomBarConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? NavTransition.SLIDE_HORIZONTAL : navTransition, (i & 4) != 0 ? BottomBarConfig.NoBottomBar.INSTANCE : bottomBarConfig);
    }

    @Override // com.robinhood.android.navigation.compose.destination.BaseComposableDestination
    public String getRoutePath() {
        return this.routePath;
    }

    @Override // com.robinhood.android.navigation.compose.destination.BaseComposableDestination
    public List<NamedNavArgument> getArgumentList() {
        return CollectionsKt.listOf((Object[]) new NamedNavArgument[]{NavTransition2.transitionNavArg(this.defaultTransition), BottomBarConfigNavArgs2.bottomBarVisibilityNavArg(), BottomBarConfigNavArgs2.bottomBarTabHostIdNavArg(), BottomBarConfigNavArgs2.bottomBarTabHostNavArg()});
    }

    public static /* synthetic */ String destinationRoute$default(ComposableDestination composableDestination, NavHostController navHostController, NavTransition navTransition, BottomBarConfig bottomBarConfig, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: destinationRoute");
        }
        if ((i & 2) != 0) {
            navTransition = null;
        }
        if ((i & 4) != 0) {
            bottomBarConfig = null;
        }
        return composableDestination.destinationRoute(navHostController, navTransition, bottomBarConfig);
    }

    public String destinationRoute(NavHostController navController, NavTransition transition, BottomBarConfig bottomBarConfig) {
        Intrinsics.checkNotNullParameter(navController, "navController");
        if (transition == null) {
            transition = this.defaultTransition;
        }
        if (bottomBarConfig == null) {
            bottomBarConfig = this.defaultBottomBarConfig;
        }
        BottomBarConfigNavArgs args = BottomBarConfigNavArgs2.toArgs(bottomBarConfig, navController);
        BottomBarConfigNavArgs3 bottomBarVisibility = args.getBottomBarVisibility();
        Boolean boolIsTabHost = args.isTabHost();
        String tabHostId = args.getTabHostId();
        return this.routeScreenName + "/" + transition + "/" + bottomBarVisibility + "/" + tabHostId + "/" + boolIsTabHost;
    }

    public static /* synthetic */ Function1 navOptionsBuilder$lib_navigation_compose_externalDebug$default(ComposableDestination composableDestination, NavHostController navHostController, Function1 function1, BottomBarConfig bottomBarConfig, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navOptionsBuilder");
        }
        if ((i & 4) != 0) {
            bottomBarConfig = null;
        }
        return composableDestination.navOptionsBuilder$lib_navigation_compose_externalDebug(navHostController, function1, bottomBarConfig);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Function1<NavOptionsBuilder, Unit> navOptionsBuilder$lib_navigation_compose_externalDebug(NavHostController navController, Function1<? super NavOptionsBuilder, Unit> builder, BottomBarConfig bottomBarConfig) {
        Intrinsics.checkNotNullParameter(navController, "navController");
        if (bottomBarConfig == null) {
            bottomBarConfig = this.defaultBottomBarConfig;
        }
        return builder == 0 ? bottomBarConfig instanceof BottomBarConfig.TabHost ? NavControllers.bottomBarHostDefaultNavOptions(navController) : new Function1() { // from class: com.robinhood.android.navigation.compose.destination.ComposableDestination$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComposableDestination.navOptionsBuilder$lambda$0((NavOptionsBuilder) obj);
            }
        } : builder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit navOptionsBuilder$lambda$0(NavOptionsBuilder navOptionsBuilder) {
        Intrinsics.checkNotNullParameter(navOptionsBuilder, "<this>");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ ComposeNav.Dest composeNav$default(ComposableDestination composableDestination, NavTransition navTransition, BottomBarConfig bottomBarConfig, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: composeNav");
        }
        if ((i & 1) != 0) {
            navTransition = composableDestination.defaultTransition;
        }
        if ((i & 2) != 0) {
            bottomBarConfig = composableDestination.defaultBottomBarConfig;
        }
        return composableDestination.composeNav(navTransition, bottomBarConfig);
    }

    public final ComposeNav.Dest composeNav(NavTransition transition, BottomBarConfig bottomBarConfig) {
        Intrinsics.checkNotNullParameter(transition, "transition");
        Intrinsics.checkNotNullParameter(bottomBarConfig, "bottomBarConfig");
        return new ComposeNav.Dest(this, transition, bottomBarConfig);
    }
}
