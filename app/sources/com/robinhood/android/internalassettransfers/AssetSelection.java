package com.robinhood.android.internalassettransfers;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternalAssetTransferViewState.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/AssetSelection;", "Landroid/os/Parcelable;", AnalyticsStrings.BUTTON_GROUP_TITLE_CASH, "Ljava/math/BigDecimal;", "equities", "", "Ljava/util/UUID;", "<init>", "(Ljava/math/BigDecimal;Ljava/util/Map;)V", "getCash", "()Ljava/math/BigDecimal;", "getEquities", "()Ljava/util/Map;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AssetSelection implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<AssetSelection> CREATOR = new Creator();
    private final BigDecimal cash;
    private final Map<UUID, BigDecimal> equities;

    /* compiled from: InternalAssetTransferViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<AssetSelection> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetSelection createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readSerializable(), parcel.readSerializable());
            }
            return new AssetSelection(bigDecimal, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetSelection[] newArray(int i) {
            return new AssetSelection[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AssetSelection() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AssetSelection copy$default(AssetSelection assetSelection, BigDecimal bigDecimal, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = assetSelection.cash;
        }
        if ((i & 2) != 0) {
            map = assetSelection.equities;
        }
        return assetSelection.copy(bigDecimal, map);
    }

    /* renamed from: component1, reason: from getter */
    public final BigDecimal getCash() {
        return this.cash;
    }

    public final Map<UUID, BigDecimal> component2() {
        return this.equities;
    }

    public final AssetSelection copy(BigDecimal cash, Map<UUID, ? extends BigDecimal> equities) {
        Intrinsics.checkNotNullParameter(cash, "cash");
        Intrinsics.checkNotNullParameter(equities, "equities");
        return new AssetSelection(cash, equities);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssetSelection)) {
            return false;
        }
        AssetSelection assetSelection = (AssetSelection) other;
        return Intrinsics.areEqual(this.cash, assetSelection.cash) && Intrinsics.areEqual(this.equities, assetSelection.equities);
    }

    public int hashCode() {
        return (this.cash.hashCode() * 31) + this.equities.hashCode();
    }

    public String toString() {
        return "AssetSelection(cash=" + this.cash + ", equities=" + this.equities + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.cash);
        Map<UUID, BigDecimal> map = this.equities;
        dest.writeInt(map.size());
        for (Map.Entry<UUID, BigDecimal> entry : map.entrySet()) {
            dest.writeSerializable(entry.getKey());
            dest.writeSerializable(entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AssetSelection(BigDecimal cash, Map<UUID, ? extends BigDecimal> equities) {
        Intrinsics.checkNotNullParameter(cash, "cash");
        Intrinsics.checkNotNullParameter(equities, "equities");
        this.cash = cash;
        this.equities = equities;
    }

    public /* synthetic */ AssetSelection(BigDecimal bigDecimal, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BigDecimal.ZERO : bigDecimal, (i & 2) != 0 ? MapsKt.emptyMap() : map);
    }

    public final BigDecimal getCash() {
        return this.cash;
    }

    public final Map<UUID, BigDecimal> getEquities() {
        return this.equities;
    }
}
