package com.robinhood.shared.crypto.perpetuals.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PerpetualsOrderDetailFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\"B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, m3636d2 = {"Lcom/robinhood/shared/crypto/perpetuals/contracts/PerpetualsOrderDetailFragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "Landroid/os/Parcelable;", "orderId", "Ljava/util/UUID;", "navigationIcon", "Lcom/robinhood/shared/crypto/perpetuals/contracts/PerpetualsOrderDetailFragmentKey$NavigationIcon;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/shared/crypto/perpetuals/contracts/PerpetualsOrderDetailFragmentKey$NavigationIcon;)V", "getOrderId", "()Ljava/util/UUID;", "getNavigationIcon", "()Lcom/robinhood/shared/crypto/perpetuals/contracts/PerpetualsOrderDetailFragmentKey$NavigationIcon;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "NavigationIcon", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class PerpetualsOrderDetailFragmentKey implements TabFragmentKey, Parcelable {
    public static final Parcelable.Creator<PerpetualsOrderDetailFragmentKey> CREATOR = new Creator();
    private final NavigationIcon navigationIcon;
    private final UUID orderId;

    /* compiled from: PerpetualsOrderDetailFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<PerpetualsOrderDetailFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PerpetualsOrderDetailFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PerpetualsOrderDetailFragmentKey((UUID) parcel.readSerializable(), NavigationIcon.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PerpetualsOrderDetailFragmentKey[] newArray(int i) {
            return new PerpetualsOrderDetailFragmentKey[i];
        }
    }

    public static /* synthetic */ PerpetualsOrderDetailFragmentKey copy$default(PerpetualsOrderDetailFragmentKey perpetualsOrderDetailFragmentKey, UUID uuid, NavigationIcon navigationIcon, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = perpetualsOrderDetailFragmentKey.orderId;
        }
        if ((i & 2) != 0) {
            navigationIcon = perpetualsOrderDetailFragmentKey.navigationIcon;
        }
        return perpetualsOrderDetailFragmentKey.copy(uuid, navigationIcon);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getOrderId() {
        return this.orderId;
    }

    /* renamed from: component2, reason: from getter */
    public final NavigationIcon getNavigationIcon() {
        return this.navigationIcon;
    }

    public final PerpetualsOrderDetailFragmentKey copy(UUID orderId, NavigationIcon navigationIcon) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(navigationIcon, "navigationIcon");
        return new PerpetualsOrderDetailFragmentKey(orderId, navigationIcon);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PerpetualsOrderDetailFragmentKey)) {
            return false;
        }
        PerpetualsOrderDetailFragmentKey perpetualsOrderDetailFragmentKey = (PerpetualsOrderDetailFragmentKey) other;
        return Intrinsics.areEqual(this.orderId, perpetualsOrderDetailFragmentKey.orderId) && this.navigationIcon == perpetualsOrderDetailFragmentKey.navigationIcon;
    }

    public int hashCode() {
        return (this.orderId.hashCode() * 31) + this.navigationIcon.hashCode();
    }

    public String toString() {
        return "PerpetualsOrderDetailFragmentKey(orderId=" + this.orderId + ", navigationIcon=" + this.navigationIcon + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.orderId);
        dest.writeString(this.navigationIcon.name());
    }

    public PerpetualsOrderDetailFragmentKey(UUID orderId, NavigationIcon navigationIcon) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(navigationIcon, "navigationIcon");
        this.orderId = orderId;
        this.navigationIcon = navigationIcon;
    }

    public final UUID getOrderId() {
        return this.orderId;
    }

    public final NavigationIcon getNavigationIcon() {
        return this.navigationIcon;
    }

    @Override // com.robinhood.android.navigation.keys.TabFragmentKey
    public FragmentTab getDefaultTab() {
        return FragmentTab.CURRENT_TAB;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PerpetualsOrderDetailFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/perpetuals/contracts/PerpetualsOrderDetailFragmentKey$NavigationIcon;", "", "<init>", "(Ljava/lang/String;I)V", "BACK", "CLOSE", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class NavigationIcon {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ NavigationIcon[] $VALUES;
        public static final NavigationIcon BACK = new NavigationIcon("BACK", 0);
        public static final NavigationIcon CLOSE = new NavigationIcon("CLOSE", 1);

        private static final /* synthetic */ NavigationIcon[] $values() {
            return new NavigationIcon[]{BACK, CLOSE};
        }

        public static EnumEntries<NavigationIcon> getEntries() {
            return $ENTRIES;
        }

        private NavigationIcon(String str, int i) {
        }

        static {
            NavigationIcon[] navigationIconArr$values = $values();
            $VALUES = navigationIconArr$values;
            $ENTRIES = EnumEntries2.enumEntries(navigationIconArr$values);
        }

        public static NavigationIcon valueOf(String str) {
            return (NavigationIcon) Enum.valueOf(NavigationIcon.class, str);
        }

        public static NavigationIcon[] values() {
            return (NavigationIcon[]) $VALUES.clone();
        }
    }
}
