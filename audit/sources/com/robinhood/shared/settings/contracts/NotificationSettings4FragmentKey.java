package com.robinhood.shared.settings.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NotificationSettings4FragmentKey.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/settings/contracts/NotificationSettings4FragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "subPageReference", "Lcom/robinhood/shared/settings/contracts/SubPageReference;", "<init>", "(Lcom/robinhood/shared/settings/contracts/SubPageReference;)V", "getSubPageReference", "()Lcom/robinhood/shared/settings/contracts/SubPageReference;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class NotificationSettings4FragmentKey implements TabFragmentKey {
    public static final String SETTINGS_EMAIL = "email";
    public static final String SETTINGS_MESSAGES = "messages";
    public static final String SETTINGS_MUTED = "muted";
    public static final String SETTINGS_PUSH = "push";
    private final NotificationSettings4FragmentKey3 subPageReference;
    public static final Parcelable.Creator<NotificationSettings4FragmentKey> CREATOR = new Creator();

    /* compiled from: NotificationSettings4FragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<NotificationSettings4FragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NotificationSettings4FragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NotificationSettings4FragmentKey((NotificationSettings4FragmentKey3) parcel.readParcelable(NotificationSettings4FragmentKey.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NotificationSettings4FragmentKey[] newArray(int i) {
            return new NotificationSettings4FragmentKey[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NotificationSettings4FragmentKey() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ NotificationSettings4FragmentKey copy$default(NotificationSettings4FragmentKey notificationSettings4FragmentKey, NotificationSettings4FragmentKey3 notificationSettings4FragmentKey3, int i, Object obj) {
        if ((i & 1) != 0) {
            notificationSettings4FragmentKey3 = notificationSettings4FragmentKey.subPageReference;
        }
        return notificationSettings4FragmentKey.copy(notificationSettings4FragmentKey3);
    }

    /* renamed from: component1, reason: from getter */
    public final NotificationSettings4FragmentKey3 getSubPageReference() {
        return this.subPageReference;
    }

    public final NotificationSettings4FragmentKey copy(NotificationSettings4FragmentKey3 subPageReference) {
        return new NotificationSettings4FragmentKey(subPageReference);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof NotificationSettings4FragmentKey) && Intrinsics.areEqual(this.subPageReference, ((NotificationSettings4FragmentKey) other).subPageReference);
    }

    public int hashCode() {
        NotificationSettings4FragmentKey3 notificationSettings4FragmentKey3 = this.subPageReference;
        if (notificationSettings4FragmentKey3 == null) {
            return 0;
        }
        return notificationSettings4FragmentKey3.hashCode();
    }

    public String toString() {
        return "NotificationSettings4FragmentKey(subPageReference=" + this.subPageReference + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.subPageReference, flags);
    }

    public NotificationSettings4FragmentKey(NotificationSettings4FragmentKey3 notificationSettings4FragmentKey3) {
        this.subPageReference = notificationSettings4FragmentKey3;
    }

    public /* synthetic */ NotificationSettings4FragmentKey(NotificationSettings4FragmentKey3 notificationSettings4FragmentKey3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : notificationSettings4FragmentKey3);
    }

    public final NotificationSettings4FragmentKey3 getSubPageReference() {
        return this.subPageReference;
    }

    @Override // com.robinhood.android.navigation.keys.TabFragmentKey
    public FragmentTab getDefaultTab() {
        return FragmentTab.CURRENT_TAB;
    }
}
