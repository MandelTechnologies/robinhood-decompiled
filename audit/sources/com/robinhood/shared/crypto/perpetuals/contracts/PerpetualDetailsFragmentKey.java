package com.robinhood.shared.crypto.perpetuals.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PerpetualDetailsFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001$B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J)\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006%"}, m3636d2 = {"Lcom/robinhood/shared/crypto/perpetuals/contracts/PerpetualDetailsFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "perpetualContractId", "Ljava/util/UUID;", "sourceScreen", "", "tabOverride", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/android/navigation/keys/FragmentTab;)V", "getPerpetualContractId", "()Ljava/util/UUID;", "getSourceScreen", "()Ljava/lang/String;", "getTabOverride", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "defaultTab", "getDefaultTab", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SourceScreen", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class PerpetualDetailsFragmentKey implements FragmentKey, TabFragmentKey {
    public static final Parcelable.Creator<PerpetualDetailsFragmentKey> CREATOR = new Creator();
    private final UUID perpetualContractId;
    private final String sourceScreen;
    private final FragmentTab tabOverride;

    /* compiled from: PerpetualDetailsFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<PerpetualDetailsFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PerpetualDetailsFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PerpetualDetailsFragmentKey((UUID) parcel.readSerializable(), parcel.readString(), parcel.readInt() == 0 ? null : FragmentTab.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PerpetualDetailsFragmentKey[] newArray(int i) {
            return new PerpetualDetailsFragmentKey[i];
        }
    }

    public static /* synthetic */ PerpetualDetailsFragmentKey copy$default(PerpetualDetailsFragmentKey perpetualDetailsFragmentKey, UUID uuid, String str, FragmentTab fragmentTab, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = perpetualDetailsFragmentKey.perpetualContractId;
        }
        if ((i & 2) != 0) {
            str = perpetualDetailsFragmentKey.sourceScreen;
        }
        if ((i & 4) != 0) {
            fragmentTab = perpetualDetailsFragmentKey.tabOverride;
        }
        return perpetualDetailsFragmentKey.copy(uuid, str, fragmentTab);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getPerpetualContractId() {
        return this.perpetualContractId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSourceScreen() {
        return this.sourceScreen;
    }

    /* renamed from: component3, reason: from getter */
    public final FragmentTab getTabOverride() {
        return this.tabOverride;
    }

    public final PerpetualDetailsFragmentKey copy(UUID perpetualContractId, String sourceScreen, FragmentTab tabOverride) {
        Intrinsics.checkNotNullParameter(perpetualContractId, "perpetualContractId");
        Intrinsics.checkNotNullParameter(sourceScreen, "sourceScreen");
        return new PerpetualDetailsFragmentKey(perpetualContractId, sourceScreen, tabOverride);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PerpetualDetailsFragmentKey)) {
            return false;
        }
        PerpetualDetailsFragmentKey perpetualDetailsFragmentKey = (PerpetualDetailsFragmentKey) other;
        return Intrinsics.areEqual(this.perpetualContractId, perpetualDetailsFragmentKey.perpetualContractId) && Intrinsics.areEqual(this.sourceScreen, perpetualDetailsFragmentKey.sourceScreen) && this.tabOverride == perpetualDetailsFragmentKey.tabOverride;
    }

    public int hashCode() {
        int iHashCode = ((this.perpetualContractId.hashCode() * 31) + this.sourceScreen.hashCode()) * 31;
        FragmentTab fragmentTab = this.tabOverride;
        return iHashCode + (fragmentTab == null ? 0 : fragmentTab.hashCode());
    }

    public String toString() {
        return "PerpetualDetailsFragmentKey(perpetualContractId=" + this.perpetualContractId + ", sourceScreen=" + this.sourceScreen + ", tabOverride=" + this.tabOverride + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.perpetualContractId);
        dest.writeString(this.sourceScreen);
        FragmentTab fragmentTab = this.tabOverride;
        if (fragmentTab == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(fragmentTab.name());
        }
    }

    public PerpetualDetailsFragmentKey(UUID perpetualContractId, String sourceScreen, FragmentTab fragmentTab) {
        Intrinsics.checkNotNullParameter(perpetualContractId, "perpetualContractId");
        Intrinsics.checkNotNullParameter(sourceScreen, "sourceScreen");
        this.perpetualContractId = perpetualContractId;
        this.sourceScreen = sourceScreen;
        this.tabOverride = fragmentTab;
    }

    public /* synthetic */ PerpetualDetailsFragmentKey(UUID uuid, String str, FragmentTab fragmentTab, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, str, (i & 4) != 0 ? null : fragmentTab);
    }

    public final UUID getPerpetualContractId() {
        return this.perpetualContractId;
    }

    public final String getSourceScreen() {
        return this.sourceScreen;
    }

    public final FragmentTab getTabOverride() {
        return this.tabOverride;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PerpetualDetailsFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/perpetuals/contracts/PerpetualDetailsFragmentKey$SourceScreen;", "", "<init>", "(Ljava/lang/String;I)V", "SEARCH_TAB", "CDP_TRADE_BAR", "POSITION_HUB_EXPLORE_SECTION", "PERPETUALS_EXPLORE_SCREEN", "CHT_HOLDINGS_SECTION", "PERPETUAL_ORDER_DETAILS", "POSITION_HUB_OPEN_POSITIONS", "UNKNOWN", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SourceScreen {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SourceScreen[] $VALUES;
        public static final SourceScreen SEARCH_TAB = new SourceScreen("SEARCH_TAB", 0);
        public static final SourceScreen CDP_TRADE_BAR = new SourceScreen("CDP_TRADE_BAR", 1);
        public static final SourceScreen POSITION_HUB_EXPLORE_SECTION = new SourceScreen("POSITION_HUB_EXPLORE_SECTION", 2);
        public static final SourceScreen PERPETUALS_EXPLORE_SCREEN = new SourceScreen("PERPETUALS_EXPLORE_SCREEN", 3);
        public static final SourceScreen CHT_HOLDINGS_SECTION = new SourceScreen("CHT_HOLDINGS_SECTION", 4);
        public static final SourceScreen PERPETUAL_ORDER_DETAILS = new SourceScreen("PERPETUAL_ORDER_DETAILS", 5);
        public static final SourceScreen POSITION_HUB_OPEN_POSITIONS = new SourceScreen("POSITION_HUB_OPEN_POSITIONS", 6);
        public static final SourceScreen UNKNOWN = new SourceScreen("UNKNOWN", 7);

        private static final /* synthetic */ SourceScreen[] $values() {
            return new SourceScreen[]{SEARCH_TAB, CDP_TRADE_BAR, POSITION_HUB_EXPLORE_SECTION, PERPETUALS_EXPLORE_SCREEN, CHT_HOLDINGS_SECTION, PERPETUAL_ORDER_DETAILS, POSITION_HUB_OPEN_POSITIONS, UNKNOWN};
        }

        public static EnumEntries<SourceScreen> getEntries() {
            return $ENTRIES;
        }

        private SourceScreen(String str, int i) {
        }

        static {
            SourceScreen[] sourceScreenArr$values = $values();
            $VALUES = sourceScreenArr$values;
            $ENTRIES = EnumEntries2.enumEntries(sourceScreenArr$values);
        }

        public static SourceScreen valueOf(String str) {
            return (SourceScreen) Enum.valueOf(SourceScreen.class, str);
        }

        public static SourceScreen[] values() {
            return (SourceScreen[]) $VALUES.clone();
        }
    }

    @Override // com.robinhood.android.navigation.keys.TabFragmentKey
    public FragmentTab getDefaultTab() {
        FragmentTab fragmentTab = this.tabOverride;
        return fragmentTab == null ? FragmentTab.PERPETUALS : fragmentTab;
    }
}
