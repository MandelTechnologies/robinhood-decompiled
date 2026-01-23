package com.robinhood.shared.user.contracts.auth;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.utils.data.LogoutType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.OptIn3;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Logout.kt */
@InternalAuthNavigation
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001eB=\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0017\u001a\u00020\u0018J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0018R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0014¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/shared/user/contracts/auth/Logout;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "type", "Lcom/robinhood/utils/data/LogoutType;", "username", "", "routeToSignup", "", "postLogoutIntents", "", "Landroid/content/Intent;", "isDay", "<init>", "(Lcom/robinhood/utils/data/LogoutType;Ljava/lang/String;ZLjava/util/List;Z)V", "getType", "()Lcom/robinhood/utils/data/LogoutType;", "getUsername", "()Ljava/lang/String;", "getRouteToSignup", "()Z", "getPostLogoutIntents", "()Ljava/util/List;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "InternalAuthNavigation", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class Logout implements IntentKey, Parcelable {
    public static final Parcelable.Creator<Logout> CREATOR = new Creator();
    private final boolean isDay;
    private final List<Intent> postLogoutIntents;
    private final boolean routeToSignup;
    private final LogoutType type;
    private final String username;

    /* compiled from: Logout.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes12.dex */
    public static final class Creator implements Parcelable.Creator<Logout> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Logout createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            LogoutType logoutTypeValueOf = LogoutType.valueOf(parcel.readString());
            String string2 = parcel.readString();
            boolean z2 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = true;
                z2 = false;
            }
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(Logout.class.getClassLoader()));
            }
            return new Logout(logoutTypeValueOf, string2, z2, arrayList, parcel.readInt() != 0 ? z : false);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Logout[] newArray(int i) {
            return new Logout[i];
        }
    }

    /* compiled from: Logout.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m3636d2 = {"Lcom/robinhood/shared/user/contracts/auth/Logout$InternalAuthNavigation;", "", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @OptIn3
    @Retention(RetentionPolicy.CLASS)
    @kotlin.annotation.Retention
    /* loaded from: classes12.dex */
    public @interface InternalAuthNavigation {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.type.name());
        dest.writeString(this.username);
        dest.writeInt(this.routeToSignup ? 1 : 0);
        List<Intent> list = this.postLogoutIntents;
        dest.writeInt(list.size());
        Iterator<Intent> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
        dest.writeInt(this.isDay ? 1 : 0);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Logout(LogoutType type2, String str, boolean z, List<? extends Intent> postLogoutIntents, boolean z2) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(postLogoutIntents, "postLogoutIntents");
        this.type = type2;
        this.username = str;
        this.routeToSignup = z;
        this.postLogoutIntents = postLogoutIntents;
        this.isDay = z2;
    }

    public final LogoutType getType() {
        return this.type;
    }

    public final String getUsername() {
        return this.username;
    }

    public final boolean getRouteToSignup() {
        return this.routeToSignup;
    }

    public /* synthetic */ Logout(LogoutType logoutType, String str, boolean z, List list, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(logoutType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? CollectionsKt.emptyList() : list, z2);
    }

    public final List<Intent> getPostLogoutIntents() {
        return this.postLogoutIntents;
    }

    /* renamed from: isDay, reason: from getter */
    public final boolean getIsDay() {
        return this.isDay;
    }
}
