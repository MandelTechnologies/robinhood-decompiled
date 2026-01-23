package com.robinhood.android.account.contracts.jointaccounts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JointAccountKeys.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/account/contracts/jointaccounts/JointAccountSecondarySetupKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "invitationId", "", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getInvitationId", "()Ljava/lang/String;", "getSource", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class JointAccountSecondarySetupKey implements TabFragmentKey {
    public static final Parcelable.Creator<JointAccountSecondarySetupKey> CREATOR = new Creator();
    private final String invitationId;
    private final String source;

    /* compiled from: JointAccountKeys.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<JointAccountSecondarySetupKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final JointAccountSecondarySetupKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JointAccountSecondarySetupKey(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final JointAccountSecondarySetupKey[] newArray(int i) {
            return new JointAccountSecondarySetupKey[i];
        }
    }

    public static /* synthetic */ JointAccountSecondarySetupKey copy$default(JointAccountSecondarySetupKey jointAccountSecondarySetupKey, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jointAccountSecondarySetupKey.invitationId;
        }
        if ((i & 2) != 0) {
            str2 = jointAccountSecondarySetupKey.source;
        }
        return jointAccountSecondarySetupKey.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getInvitationId() {
        return this.invitationId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final JointAccountSecondarySetupKey copy(String invitationId, String source) {
        Intrinsics.checkNotNullParameter(invitationId, "invitationId");
        Intrinsics.checkNotNullParameter(source, "source");
        return new JointAccountSecondarySetupKey(invitationId, source);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JointAccountSecondarySetupKey)) {
            return false;
        }
        JointAccountSecondarySetupKey jointAccountSecondarySetupKey = (JointAccountSecondarySetupKey) other;
        return Intrinsics.areEqual(this.invitationId, jointAccountSecondarySetupKey.invitationId) && Intrinsics.areEqual(this.source, jointAccountSecondarySetupKey.source);
    }

    public int hashCode() {
        return (this.invitationId.hashCode() * 31) + this.source.hashCode();
    }

    public String toString() {
        return "JointAccountSecondarySetupKey(invitationId=" + this.invitationId + ", source=" + this.source + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.invitationId);
        dest.writeString(this.source);
    }

    public JointAccountSecondarySetupKey(String invitationId, String source) {
        Intrinsics.checkNotNullParameter(invitationId, "invitationId");
        Intrinsics.checkNotNullParameter(source, "source");
        this.invitationId = invitationId;
        this.source = source;
    }

    public final String getInvitationId() {
        return this.invitationId;
    }

    public /* synthetic */ JointAccountSecondarySetupKey(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2);
    }

    public final String getSource() {
        return this.source;
    }

    @Override // com.robinhood.android.navigation.keys.TabFragmentKey
    public FragmentTab getDefaultTab() {
        return FragmentTab.SHOULD_NOT_BE_IN_TAB;
    }
}
