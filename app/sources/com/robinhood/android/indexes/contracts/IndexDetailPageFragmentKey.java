package com.robinhood.android.indexes.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndexDetailPageFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B/\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\rB#\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J7\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020 HÖ\u0001J\t\u0010&\u001a\u00020\u0006HÖ\u0001J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020 R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/indexes/contracts/IndexDetailPageFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "indexId", "Ljava/util/UUID;", "symbol", "", "initialAccountNumber", "source", "Lcom/robinhood/android/indexes/contracts/IndexDetailPageSource;", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/indexes/contracts/IndexDetailPageSource;)V", "accountNumber", "(Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/android/indexes/contracts/IndexDetailPageSource;)V", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/indexes/contracts/IndexDetailPageSource;)V", "getIndexId", "()Ljava/util/UUID;", "getSymbol", "()Ljava/lang/String;", "getInitialAccountNumber", "getSource", "()Lcom/robinhood/android/indexes/contracts/IndexDetailPageSource;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class IndexDetailPageFragmentKey implements FragmentKey, TabFragmentKey {
    public static final Parcelable.Creator<IndexDetailPageFragmentKey> CREATOR = new Creator();
    private final UUID indexId;
    private final String initialAccountNumber;
    private final IndexDetailPageFragmentKey2 source;
    private final String symbol;

    /* compiled from: IndexDetailPageFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes10.dex */
    public static final class Creator implements Parcelable.Creator<IndexDetailPageFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IndexDetailPageFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IndexDetailPageFragmentKey((UUID) parcel.readSerializable(), parcel.readString(), parcel.readString(), (IndexDetailPageFragmentKey2) parcel.readParcelable(IndexDetailPageFragmentKey.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IndexDetailPageFragmentKey[] newArray(int i) {
            return new IndexDetailPageFragmentKey[i];
        }
    }

    public static /* synthetic */ IndexDetailPageFragmentKey copy$default(IndexDetailPageFragmentKey indexDetailPageFragmentKey, UUID uuid, String str, String str2, IndexDetailPageFragmentKey2 indexDetailPageFragmentKey2, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = indexDetailPageFragmentKey.indexId;
        }
        if ((i & 2) != 0) {
            str = indexDetailPageFragmentKey.symbol;
        }
        if ((i & 4) != 0) {
            str2 = indexDetailPageFragmentKey.initialAccountNumber;
        }
        if ((i & 8) != 0) {
            indexDetailPageFragmentKey2 = indexDetailPageFragmentKey.source;
        }
        return indexDetailPageFragmentKey.copy(uuid, str, str2, indexDetailPageFragmentKey2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getIndexId() {
        return this.indexId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    /* renamed from: component3, reason: from getter */
    public final String getInitialAccountNumber() {
        return this.initialAccountNumber;
    }

    /* renamed from: component4, reason: from getter */
    public final IndexDetailPageFragmentKey2 getSource() {
        return this.source;
    }

    public final IndexDetailPageFragmentKey copy(UUID indexId, String symbol, String initialAccountNumber, IndexDetailPageFragmentKey2 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new IndexDetailPageFragmentKey(indexId, symbol, initialAccountNumber, source);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndexDetailPageFragmentKey)) {
            return false;
        }
        IndexDetailPageFragmentKey indexDetailPageFragmentKey = (IndexDetailPageFragmentKey) other;
        return Intrinsics.areEqual(this.indexId, indexDetailPageFragmentKey.indexId) && Intrinsics.areEqual(this.symbol, indexDetailPageFragmentKey.symbol) && Intrinsics.areEqual(this.initialAccountNumber, indexDetailPageFragmentKey.initialAccountNumber) && Intrinsics.areEqual(this.source, indexDetailPageFragmentKey.source);
    }

    public int hashCode() {
        UUID uuid = this.indexId;
        int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
        String str = this.symbol;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.initialAccountNumber;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.source.hashCode();
    }

    public String toString() {
        return "IndexDetailPageFragmentKey(indexId=" + this.indexId + ", symbol=" + this.symbol + ", initialAccountNumber=" + this.initialAccountNumber + ", source=" + this.source + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.indexId);
        dest.writeString(this.symbol);
        dest.writeString(this.initialAccountNumber);
        dest.writeParcelable(this.source, flags);
    }

    protected IndexDetailPageFragmentKey(UUID uuid, String str, String str2, IndexDetailPageFragmentKey2 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.indexId = uuid;
        this.symbol = str;
        this.initialAccountNumber = str2;
        this.source = source;
    }

    public final UUID getIndexId() {
        return this.indexId;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final String getInitialAccountNumber() {
        return this.initialAccountNumber;
    }

    public final IndexDetailPageFragmentKey2 getSource() {
        return this.source;
    }

    @Override // com.robinhood.android.navigation.keys.TabFragmentKey
    public FragmentTab getDefaultTab() {
        return FragmentTab.HOME;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IndexDetailPageFragmentKey(UUID indexId, String str, IndexDetailPageFragmentKey2 source) {
        this(indexId, null, str, source);
        Intrinsics.checkNotNullParameter(indexId, "indexId");
        Intrinsics.checkNotNullParameter(source, "source");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IndexDetailPageFragmentKey(String symbol, String str, IndexDetailPageFragmentKey2 source) {
        this(null, symbol, str, source);
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(source, "source");
    }
}
