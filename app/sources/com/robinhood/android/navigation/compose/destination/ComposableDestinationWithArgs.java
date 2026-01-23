package com.robinhood.android.navigation.compose.destination;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NamedNavArgument;
import androidx.navigation.NamedNavArgument2;
import androidx.navigation.NavDestinationBuilder2;
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
import com.robinhood.android.navigation.compose.navtype.ParcelableNavType;
import java.io.Serializable;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ComposableDestinationWithArgs.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003BC\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00028\u00002\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0002\u0010'JM\u0010(\u001a\u0013\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)¢\u0006\u0002\b,2\u0006\u0010\"\u001a\u00020#2\u0019\u0010-\u001a\u0015\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+\u0018\u00010)¢\u0006\u0002\b,2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0002\b.J)\u0010/\u001a\u0002002\u0006\u0010$\u001a\u00028\u00002\b\b\u0002\u0010%\u001a\u00020\u000b2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u00101J\b\u00102\u001a\u000203H\u0016J\u0018\u00104\u001a\u00020+2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000203H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R'\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118BX\u0082\u0084\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u0005X\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u00068"}, m3636d2 = {"Lcom/robinhood/android/navigation/compose/destination/ComposableDestinationWithArgs;", "T", "Landroid/os/Parcelable;", "Lcom/robinhood/android/navigation/compose/destination/BaseComposableDestination;", "routeScreenName", "", "argumentClass", "Ljava/lang/Class;", "defaultArgument", "Lkotlin/Function0;", "defaultTransition", "Lcom/robinhood/android/navigation/compose/NavTransition;", "defaultBottomBarConfig", "Lcom/robinhood/android/navigation/compose/BottomBarConfig;", "<init>", "(Ljava/lang/String;Ljava/lang/Class;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/navigation/compose/NavTransition;Lcom/robinhood/android/navigation/compose/BottomBarConfig;)V", "parcelableNavType", "Lcom/robinhood/android/navigation/compose/navtype/ParcelableNavType;", "getParcelableNavType$annotations", "()V", "getParcelableNavType", "()Lcom/robinhood/android/navigation/compose/navtype/ParcelableNavType;", "parcelableNavType$delegate", "Lkotlin/Lazy;", "routePath", "getRoutePath$annotations", "getRoutePath", "()Ljava/lang/String;", "argumentList", "", "Landroidx/navigation/NamedNavArgument;", "getArgumentList", "()Ljava/util/List;", "destinationRoute", "navController", "Landroidx/navigation/NavHostController;", "args", NavTransition2.KEY_TRANSITION, "bottomBarConfig", "(Landroidx/navigation/NavHostController;Landroid/os/Parcelable;Lcom/robinhood/android/navigation/compose/NavTransition;Lcom/robinhood/android/navigation/compose/BottomBarConfig;)Ljava/lang/String;", "navOptionsBuilder", "Lkotlin/Function1;", "Landroidx/navigation/NavOptionsBuilder;", "", "Lkotlin/ExtensionFunctionType;", "builder", "navOptionsBuilder$lib_navigation_compose_externalDebug", "composeNav", "Lcom/robinhood/android/navigation/compose/destination/ComposeNav$DestWithArgs;", "(Landroid/os/Parcelable;Lcom/robinhood/android/navigation/compose/NavTransition;Lcom/robinhood/android/navigation/compose/BottomBarConfig;)Lcom/robinhood/android/navigation/compose/destination/ComposeNav$DestWithArgs;", "describeContents", "", "writeToParcel", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public class ComposableDestinationWithArgs<T extends Parcelable> implements BaseComposableDestination {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ComposableDestinationWithArgs<?>> CREATOR = new Creator();
    private final Class<T> argumentClass;
    private final Function0<T> defaultArgument;
    private final BottomBarConfig defaultBottomBarConfig;
    private final NavTransition defaultTransition;

    /* renamed from: parcelableNavType$delegate, reason: from kotlin metadata */
    private final Lazy parcelableNavType;
    private final String routePath;
    private final String routeScreenName;

    /* compiled from: ComposableDestinationWithArgs.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ComposableDestinationWithArgs<?>> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ComposableDestinationWithArgs<?> createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ComposableDestinationWithArgs<>(parcel.readString(), (Class) parcel.readSerializable(), (Function0) parcel.readSerializable(), NavTransition.valueOf(parcel.readString()), (BottomBarConfig) parcel.readParcelable(ComposableDestinationWithArgs.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ComposableDestinationWithArgs<?>[] newArray(int i) {
            return new ComposableDestinationWithArgs[i];
        }
    }

    private static /* synthetic */ void getParcelableNavType$annotations() {
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
        dest.writeSerializable(this.argumentClass);
        dest.writeSerializable((Serializable) this.defaultArgument);
        dest.writeString(this.defaultTransition.name());
        dest.writeParcelable(this.defaultBottomBarConfig, flags);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ComposableDestinationWithArgs(String routeScreenName, Class<T> argumentClass, Function0<? extends T> function0, NavTransition defaultTransition, BottomBarConfig defaultBottomBarConfig) {
        Intrinsics.checkNotNullParameter(routeScreenName, "routeScreenName");
        Intrinsics.checkNotNullParameter(argumentClass, "argumentClass");
        Intrinsics.checkNotNullParameter(defaultTransition, "defaultTransition");
        Intrinsics.checkNotNullParameter(defaultBottomBarConfig, "defaultBottomBarConfig");
        this.routeScreenName = routeScreenName;
        this.argumentClass = argumentClass;
        this.defaultArgument = function0;
        this.defaultTransition = defaultTransition;
        this.defaultBottomBarConfig = defaultBottomBarConfig;
        this.parcelableNavType = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ComposableDestinationWithArgs.parcelableNavType_delegate$lambda$0(this.f$0);
            }
        });
        this.routePath = routeScreenName + "/{rh_navigation_args}/{transition}/{bottom_bar_vis}/{bottom_bar_tab_host_id}/{is_bottom_bar_tab_host}";
    }

    public /* synthetic */ ComposableDestinationWithArgs(String str, Class cls, Function0 function0, NavTransition navTransition, BottomBarConfig bottomBarConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, cls, (i & 4) != 0 ? null : function0, (i & 8) != 0 ? NavTransition.SLIDE_HORIZONTAL : navTransition, (i & 16) != 0 ? BottomBarConfig.NoBottomBar.INSTANCE : bottomBarConfig);
    }

    private final ParcelableNavType<T> getParcelableNavType() {
        return (ParcelableNavType) this.parcelableNavType.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ParcelableNavType parcelableNavType_delegate$lambda$0(ComposableDestinationWithArgs composableDestinationWithArgs) {
        return new ParcelableNavType(composableDestinationWithArgs.argumentClass);
    }

    @Override // com.robinhood.android.navigation.compose.destination.BaseComposableDestination
    public String getRoutePath() {
        return this.routePath;
    }

    @Override // com.robinhood.android.navigation.compose.destination.BaseComposableDestination
    public List<NamedNavArgument> getArgumentList() {
        return CollectionsKt.listOf((Object[]) new NamedNavArgument[]{NamedNavArgument2.navArgument("rh_navigation_args", new Function1() { // from class: com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComposableDestinationWithArgs._get_argumentList_$lambda$3(this.f$0, (NavDestinationBuilder2) obj);
            }
        }), NavTransition2.transitionNavArg(this.defaultTransition), BottomBarConfigNavArgs2.bottomBarVisibilityNavArg(), BottomBarConfigNavArgs2.bottomBarTabHostIdNavArg(), BottomBarConfigNavArgs2.bottomBarTabHostNavArg()});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _get_argumentList_$lambda$3(ComposableDestinationWithArgs composableDestinationWithArgs, NavDestinationBuilder2 navArgument) {
        T tInvoke;
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(composableDestinationWithArgs.getParcelableNavType());
        Function0<T> function0 = composableDestinationWithArgs.defaultArgument;
        if (function0 != null && (tInvoke = function0.invoke()) != null) {
            navArgument.setDefaultValue(tInvoke);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ String destinationRoute$default(ComposableDestinationWithArgs composableDestinationWithArgs, NavHostController navHostController, Parcelable parcelable, NavTransition navTransition, BottomBarConfig bottomBarConfig, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: destinationRoute");
        }
        if ((i & 4) != 0) {
            navTransition = null;
        }
        if ((i & 8) != 0) {
            bottomBarConfig = null;
        }
        return composableDestinationWithArgs.destinationRoute(navHostController, parcelable, navTransition, bottomBarConfig);
    }

    public String destinationRoute(NavHostController navController, T args, NavTransition transition, BottomBarConfig bottomBarConfig) {
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(args, "args");
        String strDeserialize = getParcelableNavType().deserialize(args);
        if (transition == null) {
            transition = this.defaultTransition;
        }
        if (bottomBarConfig == null) {
            bottomBarConfig = this.defaultBottomBarConfig;
        }
        BottomBarConfigNavArgs args2 = BottomBarConfigNavArgs2.toArgs(bottomBarConfig, navController);
        BottomBarConfigNavArgs3 bottomBarVisibility = args2.getBottomBarVisibility();
        Boolean boolIsTabHost = args2.isTabHost();
        String tabHostId = args2.getTabHostId();
        return this.routeScreenName + "/" + strDeserialize + "/" + transition + "/" + bottomBarVisibility + "/" + tabHostId + "/" + boolIsTabHost;
    }

    public static /* synthetic */ Function1 navOptionsBuilder$lib_navigation_compose_externalDebug$default(ComposableDestinationWithArgs composableDestinationWithArgs, NavHostController navHostController, Function1 function1, BottomBarConfig bottomBarConfig, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navOptionsBuilder");
        }
        if ((i & 4) != 0) {
            bottomBarConfig = null;
        }
        return composableDestinationWithArgs.navOptionsBuilder$lib_navigation_compose_externalDebug(navHostController, function1, bottomBarConfig);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Function1<NavOptionsBuilder, Unit> navOptionsBuilder$lib_navigation_compose_externalDebug(NavHostController navController, Function1<? super NavOptionsBuilder, Unit> builder, BottomBarConfig bottomBarConfig) {
        Intrinsics.checkNotNullParameter(navController, "navController");
        if (bottomBarConfig == null) {
            bottomBarConfig = this.defaultBottomBarConfig;
        }
        return builder == 0 ? bottomBarConfig instanceof BottomBarConfig.TabHost ? NavControllers.bottomBarHostDefaultNavOptions(navController) : new Function1() { // from class: com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComposableDestinationWithArgs.navOptionsBuilder$lambda$4((NavOptionsBuilder) obj);
            }
        } : builder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit navOptionsBuilder$lambda$4(NavOptionsBuilder navOptionsBuilder) {
        Intrinsics.checkNotNullParameter(navOptionsBuilder, "<this>");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ ComposeNav.DestWithArgs composeNav$default(ComposableDestinationWithArgs composableDestinationWithArgs, Parcelable parcelable, NavTransition navTransition, BottomBarConfig bottomBarConfig, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: composeNav");
        }
        if ((i & 2) != 0) {
            navTransition = composableDestinationWithArgs.defaultTransition;
        }
        if ((i & 4) != 0) {
            bottomBarConfig = composableDestinationWithArgs.defaultBottomBarConfig;
        }
        return composableDestinationWithArgs.composeNav(parcelable, navTransition, bottomBarConfig);
    }

    public final ComposeNav.DestWithArgs composeNav(T args, NavTransition transition, BottomBarConfig bottomBarConfig) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(transition, "transition");
        return new ComposeNav.DestWithArgs(this, args, transition, bottomBarConfig);
    }
}
