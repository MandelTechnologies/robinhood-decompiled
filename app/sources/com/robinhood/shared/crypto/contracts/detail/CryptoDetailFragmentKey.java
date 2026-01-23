package com.robinhood.shared.crypto.contracts.detail;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoDetailFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BM\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001f\u001a\u00020\u0004HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003JQ\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0006\u0010&\u001a\u00020'J\u0013\u0010(\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020'HÖ\u0001J\t\u0010,\u001a\u00020\fHÖ\u0001J\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020'R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0011R\u0014\u0010\u001d\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0017¨\u00062"}, m3636d2 = {"Lcom/robinhood/shared/crypto/contracts/detail/CryptoDetailFragmentKey;", "Lcom/robinhood/shared/crypto/contracts/detail/CryptoDetailKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "initialCurrencyPairId", "Ljava/util/UUID;", "currencyPairIds", "", "overrideCryptoToolbarTheme", "", "tabOverride", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "source", "", "rhsAccountNumber", "<init>", "(Ljava/util/UUID;Ljava/util/List;ZLcom/robinhood/android/navigation/keys/FragmentTab;Ljava/lang/String;Ljava/lang/String;)V", "getInitialCurrencyPairId", "()Ljava/util/UUID;", "getCurrencyPairIds", "()Ljava/util/List;", "getOverrideCryptoToolbarTheme", "()Z", "getTabOverride", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "getSource", "()Ljava/lang/String;", "getRhsAccountNumber", "currencyPairId", "getCurrencyPairId", "defaultTab", "getDefaultTab", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class CryptoDetailFragmentKey implements CryptoDetailKey, TabFragmentKey {
    public static final Parcelable.Creator<CryptoDetailFragmentKey> CREATOR = new Creator();
    private final List<UUID> currencyPairIds;
    private final UUID initialCurrencyPairId;
    private final boolean overrideCryptoToolbarTheme;
    private final String rhsAccountNumber;
    private final String source;
    private final FragmentTab tabOverride;

    /* compiled from: CryptoDetailFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<CryptoDetailFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoDetailFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            UUID uuid = (UUID) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readSerializable());
            }
            return new CryptoDetailFragmentKey(uuid, arrayList, parcel.readInt() != 0, parcel.readInt() == 0 ? null : FragmentTab.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoDetailFragmentKey[] newArray(int i) {
            return new CryptoDetailFragmentKey[i];
        }
    }

    public static /* synthetic */ CryptoDetailFragmentKey copy$default(CryptoDetailFragmentKey cryptoDetailFragmentKey, UUID uuid, List list, boolean z, FragmentTab fragmentTab, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = cryptoDetailFragmentKey.initialCurrencyPairId;
        }
        if ((i & 2) != 0) {
            list = cryptoDetailFragmentKey.currencyPairIds;
        }
        if ((i & 4) != 0) {
            z = cryptoDetailFragmentKey.overrideCryptoToolbarTheme;
        }
        if ((i & 8) != 0) {
            fragmentTab = cryptoDetailFragmentKey.tabOverride;
        }
        if ((i & 16) != 0) {
            str = cryptoDetailFragmentKey.source;
        }
        if ((i & 32) != 0) {
            str2 = cryptoDetailFragmentKey.rhsAccountNumber;
        }
        String str3 = str;
        String str4 = str2;
        return cryptoDetailFragmentKey.copy(uuid, list, z, fragmentTab, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getInitialCurrencyPairId() {
        return this.initialCurrencyPairId;
    }

    public final List<UUID> component2() {
        return this.currencyPairIds;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getOverrideCryptoToolbarTheme() {
        return this.overrideCryptoToolbarTheme;
    }

    /* renamed from: component4, reason: from getter */
    public final FragmentTab getTabOverride() {
        return this.tabOverride;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component6, reason: from getter */
    public final String getRhsAccountNumber() {
        return this.rhsAccountNumber;
    }

    public final CryptoDetailFragmentKey copy(UUID initialCurrencyPairId, List<UUID> currencyPairIds, boolean overrideCryptoToolbarTheme, FragmentTab tabOverride, String source, String rhsAccountNumber) {
        Intrinsics.checkNotNullParameter(initialCurrencyPairId, "initialCurrencyPairId");
        Intrinsics.checkNotNullParameter(currencyPairIds, "currencyPairIds");
        return new CryptoDetailFragmentKey(initialCurrencyPairId, currencyPairIds, overrideCryptoToolbarTheme, tabOverride, source, rhsAccountNumber);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoDetailFragmentKey)) {
            return false;
        }
        CryptoDetailFragmentKey cryptoDetailFragmentKey = (CryptoDetailFragmentKey) other;
        return Intrinsics.areEqual(this.initialCurrencyPairId, cryptoDetailFragmentKey.initialCurrencyPairId) && Intrinsics.areEqual(this.currencyPairIds, cryptoDetailFragmentKey.currencyPairIds) && this.overrideCryptoToolbarTheme == cryptoDetailFragmentKey.overrideCryptoToolbarTheme && this.tabOverride == cryptoDetailFragmentKey.tabOverride && Intrinsics.areEqual(this.source, cryptoDetailFragmentKey.source) && Intrinsics.areEqual(this.rhsAccountNumber, cryptoDetailFragmentKey.rhsAccountNumber);
    }

    public int hashCode() {
        int iHashCode = ((((this.initialCurrencyPairId.hashCode() * 31) + this.currencyPairIds.hashCode()) * 31) + Boolean.hashCode(this.overrideCryptoToolbarTheme)) * 31;
        FragmentTab fragmentTab = this.tabOverride;
        int iHashCode2 = (iHashCode + (fragmentTab == null ? 0 : fragmentTab.hashCode())) * 31;
        String str = this.source;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.rhsAccountNumber;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "CryptoDetailFragmentKey(initialCurrencyPairId=" + this.initialCurrencyPairId + ", currencyPairIds=" + this.currencyPairIds + ", overrideCryptoToolbarTheme=" + this.overrideCryptoToolbarTheme + ", tabOverride=" + this.tabOverride + ", source=" + this.source + ", rhsAccountNumber=" + this.rhsAccountNumber + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.initialCurrencyPairId);
        List<UUID> list = this.currencyPairIds;
        dest.writeInt(list.size());
        Iterator<UUID> it = list.iterator();
        while (it.hasNext()) {
            dest.writeSerializable(it.next());
        }
        dest.writeInt(this.overrideCryptoToolbarTheme ? 1 : 0);
        FragmentTab fragmentTab = this.tabOverride;
        if (fragmentTab == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(fragmentTab.name());
        }
        dest.writeString(this.source);
        dest.writeString(this.rhsAccountNumber);
    }

    public CryptoDetailFragmentKey(UUID initialCurrencyPairId, List<UUID> currencyPairIds, boolean z, FragmentTab fragmentTab, String str, String str2) {
        Intrinsics.checkNotNullParameter(initialCurrencyPairId, "initialCurrencyPairId");
        Intrinsics.checkNotNullParameter(currencyPairIds, "currencyPairIds");
        this.initialCurrencyPairId = initialCurrencyPairId;
        this.currencyPairIds = currencyPairIds;
        this.overrideCryptoToolbarTheme = z;
        this.tabOverride = fragmentTab;
        this.source = str;
        this.rhsAccountNumber = str2;
    }

    public final UUID getInitialCurrencyPairId() {
        return this.initialCurrencyPairId;
    }

    public /* synthetic */ CryptoDetailFragmentKey(UUID uuid, List list, boolean z, FragmentTab fragmentTab, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, (i & 2) != 0 ? CollectionsKt.listOf(uuid) : list, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : fragmentTab, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : str2);
    }

    public final List<UUID> getCurrencyPairIds() {
        return this.currencyPairIds;
    }

    public final boolean getOverrideCryptoToolbarTheme() {
        return this.overrideCryptoToolbarTheme;
    }

    public final FragmentTab getTabOverride() {
        return this.tabOverride;
    }

    @Override // com.robinhood.shared.crypto.contracts.detail.CryptoDetailKey
    public String getSource() {
        return this.source;
    }

    public final String getRhsAccountNumber() {
        return this.rhsAccountNumber;
    }

    @Override // com.robinhood.shared.crypto.contracts.detail.CryptoDetailKey
    public UUID getCurrencyPairId() {
        return this.initialCurrencyPairId;
    }

    @Override // com.robinhood.android.navigation.keys.TabFragmentKey
    public FragmentTab getDefaultTab() {
        FragmentTab fragmentTab = this.tabOverride;
        return fragmentTab == null ? FragmentTab.HOME : fragmentTab;
    }
}
