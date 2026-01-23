package com.robinhood.android.navigation.compose.destination;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NamedNavArgument;
import com.robinhood.android.navigation.compose.destination.ComposeNav;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SheetDestination.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0010\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0015H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/navigation/compose/destination/SheetDestination;", "Lcom/robinhood/android/navigation/compose/destination/BaseComposableDestination;", "routeScreenName", "", "<init>", "(Ljava/lang/String;)V", "routePath", "getRoutePath$annotations", "()V", "getRoutePath", "()Ljava/lang/String;", "argumentList", "", "Landroidx/navigation/NamedNavArgument;", "getArgumentList", "()Ljava/util/List;", "destinationRoute", "destinationRoute$lib_navigation_compose_externalDebug", "composeNav", "Lcom/robinhood/android/navigation/compose/destination/ComposeNav$SheetDest;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-navigation-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public class SheetDestination implements BaseComposableDestination {
    public static final int $stable = 0;
    public static final Parcelable.Creator<SheetDestination> CREATOR = new Creator();
    private final String routePath;
    private final String routeScreenName;

    /* compiled from: SheetDestination.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<SheetDestination> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SheetDestination createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SheetDestination(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SheetDestination[] newArray(int i) {
            return new SheetDestination[i];
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
    }

    public SheetDestination(String routeScreenName) {
        Intrinsics.checkNotNullParameter(routeScreenName, "routeScreenName");
        this.routeScreenName = routeScreenName;
        this.routePath = routeScreenName;
    }

    @Override // com.robinhood.android.navigation.compose.destination.BaseComposableDestination
    public String getRoutePath() {
        return this.routePath;
    }

    @Override // com.robinhood.android.navigation.compose.destination.BaseComposableDestination
    public List<NamedNavArgument> getArgumentList() {
        return CollectionsKt.emptyList();
    }

    /* renamed from: destinationRoute$lib_navigation_compose_externalDebug, reason: from getter */
    public final String getRouteScreenName() {
        return this.routeScreenName;
    }

    public final ComposeNav.SheetDest composeNav() {
        return new ComposeNav.SheetDest(this);
    }
}
