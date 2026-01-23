package com.robinhood.shared.user.contracts.auth;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UserCreationFlow.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bj\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/user/contracts/auth/UserCreationFlow;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "RHC", "TRADER", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class UserCreationFlow implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ UserCreationFlow[] $VALUES;
    public static final Parcelable.Creator<UserCreationFlow> CREATOR;
    public static final UserCreationFlow RHC = new UserCreationFlow("RHC", 0);
    public static final UserCreationFlow TRADER = new UserCreationFlow("TRADER", 1);

    private static final /* synthetic */ UserCreationFlow[] $values() {
        return new UserCreationFlow[]{RHC, TRADER};
    }

    public static EnumEntries<UserCreationFlow> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }

    private UserCreationFlow(String str, int i) {
    }

    static {
        UserCreationFlow[] userCreationFlowArr$values = $values();
        $VALUES = userCreationFlowArr$values;
        $ENTRIES = EnumEntries2.enumEntries(userCreationFlowArr$values);
        CREATOR = new Parcelable.Creator<UserCreationFlow>() { // from class: com.robinhood.shared.user.contracts.auth.UserCreationFlow.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UserCreationFlow createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return UserCreationFlow.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UserCreationFlow[] newArray(int i) {
                return new UserCreationFlow[i];
            }
        };
    }

    public static UserCreationFlow valueOf(String str) {
        return (UserCreationFlow) Enum.valueOf(UserCreationFlow.class, str);
    }

    public static UserCreationFlow[] values() {
        return (UserCreationFlow[]) $VALUES.clone();
    }
}
