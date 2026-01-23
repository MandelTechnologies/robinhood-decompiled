package com.robinhood.android.navigation.compose.destination;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NamedNavArgument;
import androidx.navigation.NamedNavArgument2;
import androidx.navigation.NavDestinationBuilder2;
import com.robinhood.android.navigation.compose.destination.ComposeNav;
import com.robinhood.android.navigation.compose.navtype.ParcelableNavType;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DialogDestinationWithArgs.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\u0006\u0010\u001c\u001a\u00028\u0000¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020#H\u0016J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020#H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R'\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8BX\u0082\u0084\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u0005X\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/navigation/compose/destination/DialogDestinationWithArgs;", "T", "Landroid/os/Parcelable;", "Lcom/robinhood/android/navigation/compose/destination/BaseComposableDestination;", "routeScreenName", "", "argumentClass", "Ljava/lang/Class;", "<init>", "(Ljava/lang/String;Ljava/lang/Class;)V", "parcelableNavType", "Lcom/robinhood/android/navigation/compose/navtype/ParcelableNavType;", "getParcelableNavType$annotations", "()V", "getParcelableNavType", "()Lcom/robinhood/android/navigation/compose/navtype/ParcelableNavType;", "parcelableNavType$delegate", "Lkotlin/Lazy;", "routePath", "getRoutePath$annotations", "getRoutePath", "()Ljava/lang/String;", "argumentList", "", "Landroidx/navigation/NamedNavArgument;", "getArgumentList", "()Ljava/util/List;", "destinationRoute", "args", "destinationRoute$lib_navigation_compose_externalDebug", "(Landroid/os/Parcelable;)Ljava/lang/String;", "composeNav", "Lcom/robinhood/android/navigation/compose/destination/ComposeNav$DialogDestWithArgs;", "(Landroid/os/Parcelable;)Lcom/robinhood/android/navigation/compose/destination/ComposeNav$DialogDestWithArgs;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public class DialogDestinationWithArgs<T extends Parcelable> implements BaseComposableDestination {
    public static final int $stable = 8;
    public static final Parcelable.Creator<DialogDestinationWithArgs<?>> CREATOR = new Creator();
    private final Class<T> argumentClass;

    /* renamed from: parcelableNavType$delegate, reason: from kotlin metadata */
    private final Lazy parcelableNavType;
    private final String routePath;
    private final String routeScreenName;

    /* compiled from: DialogDestinationWithArgs.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<DialogDestinationWithArgs<?>> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DialogDestinationWithArgs<?> createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DialogDestinationWithArgs<>(parcel.readString(), (Class) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DialogDestinationWithArgs<?>[] newArray(int i) {
            return new DialogDestinationWithArgs[i];
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
    }

    public DialogDestinationWithArgs(String routeScreenName, Class<T> argumentClass) {
        Intrinsics.checkNotNullParameter(routeScreenName, "routeScreenName");
        Intrinsics.checkNotNullParameter(argumentClass, "argumentClass");
        this.routeScreenName = routeScreenName;
        this.argumentClass = argumentClass;
        this.parcelableNavType = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.navigation.compose.destination.DialogDestinationWithArgs$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DialogDestinationWithArgs.parcelableNavType_delegate$lambda$0(this.f$0);
            }
        });
        this.routePath = routeScreenName + "/{rh_navigation_args}";
    }

    private final ParcelableNavType<T> getParcelableNavType() {
        return (ParcelableNavType) this.parcelableNavType.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ParcelableNavType parcelableNavType_delegate$lambda$0(DialogDestinationWithArgs dialogDestinationWithArgs) {
        return new ParcelableNavType(dialogDestinationWithArgs.argumentClass);
    }

    @Override // com.robinhood.android.navigation.compose.destination.BaseComposableDestination
    public String getRoutePath() {
        return this.routePath;
    }

    @Override // com.robinhood.android.navigation.compose.destination.BaseComposableDestination
    public List<NamedNavArgument> getArgumentList() {
        return CollectionsKt.listOf(NamedNavArgument2.navArgument("rh_navigation_args", new Function1() { // from class: com.robinhood.android.navigation.compose.destination.DialogDestinationWithArgs$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DialogDestinationWithArgs._get_argumentList_$lambda$1(this.f$0, (NavDestinationBuilder2) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _get_argumentList_$lambda$1(DialogDestinationWithArgs dialogDestinationWithArgs, NavDestinationBuilder2 navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(dialogDestinationWithArgs.getParcelableNavType());
        return Unit.INSTANCE;
    }

    public final String destinationRoute$lib_navigation_compose_externalDebug(T args) {
        Intrinsics.checkNotNullParameter(args, "args");
        String strDeserialize = getParcelableNavType().deserialize(args);
        return this.routeScreenName + "/" + strDeserialize;
    }

    public final ComposeNav.DialogDestWithArgs composeNav(T args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return new ComposeNav.DialogDestWithArgs(this, args);
    }
}
