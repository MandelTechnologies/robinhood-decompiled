package com.withpersona.sdk2.inquiry.shared.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NavigationState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B3\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "Landroid/os/Parcelable;", "showBackButton", "", "showCancelButton", "showNavBar", "handleBackPress", "isNavigationEnabled", "<init>", "(ZZZZZ)V", "getShowBackButton", "()Z", "getShowCancelButton", "getShowNavBar", "getHandleBackPress", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class NavigationState implements Parcelable {
    public static final Parcelable.Creator<NavigationState> CREATOR = new Creator();
    private final boolean handleBackPress;
    private final boolean isNavigationEnabled;
    private final boolean showBackButton;
    private final boolean showCancelButton;
    private final boolean showNavBar;

    /* compiled from: NavigationState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<NavigationState> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NavigationState createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z5 = false;
            boolean z6 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z5 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z6 = z;
            }
            if (parcel.readInt() != 0) {
                z3 = z2;
            } else {
                z3 = z2;
                z2 = z;
            }
            if (parcel.readInt() != 0) {
                z4 = z3;
            } else {
                z4 = z3;
                z3 = z;
            }
            if (parcel.readInt() == 0) {
                z4 = z;
            }
            return new NavigationState(z5, z6, z2, z3, z4);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NavigationState[] newArray(int i) {
            return new NavigationState[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.showBackButton ? 1 : 0);
        dest.writeInt(this.showCancelButton ? 1 : 0);
        dest.writeInt(this.showNavBar ? 1 : 0);
        dest.writeInt(this.handleBackPress ? 1 : 0);
        dest.writeInt(this.isNavigationEnabled ? 1 : 0);
    }

    public NavigationState(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.showBackButton = z;
        this.showCancelButton = z2;
        this.showNavBar = z3;
        this.handleBackPress = z4;
        this.isNavigationEnabled = z5;
    }

    public final boolean getShowBackButton() {
        return this.showBackButton;
    }

    public final boolean getShowCancelButton() {
        return this.showCancelButton;
    }

    public final boolean getShowNavBar() {
        return this.showNavBar;
    }

    public final boolean getHandleBackPress() {
        return this.handleBackPress;
    }

    /* renamed from: isNavigationEnabled, reason: from getter */
    public final boolean getIsNavigationEnabled() {
        return this.isNavigationEnabled;
    }
}
