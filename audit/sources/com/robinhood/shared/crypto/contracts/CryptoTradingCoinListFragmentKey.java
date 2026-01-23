package com.robinhood.shared.crypto.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.utils.Preconditions;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: CryptoTradingCoinListFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/crypto/contracts/CryptoTradingCoinListFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "entryPoint", "Lcom/robinhood/shared/crypto/contracts/CryptoTradingCoinListFragmentKey$EntryPoint;", "<init>", "(Lcom/robinhood/shared/crypto/contracts/CryptoTradingCoinListFragmentKey$EntryPoint;)V", "getEntryPoint", "()Lcom/robinhood/shared/crypto/contracts/CryptoTradingCoinListFragmentKey$EntryPoint;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "EntryPoint", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class CryptoTradingCoinListFragmentKey implements FragmentKey {
    public static final Parcelable.Creator<CryptoTradingCoinListFragmentKey> CREATOR = new Creator();
    private final EntryPoint entryPoint;

    /* compiled from: CryptoTradingCoinListFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<CryptoTradingCoinListFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoTradingCoinListFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoTradingCoinListFragmentKey(parcel.readInt() == 0 ? null : EntryPoint.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoTradingCoinListFragmentKey[] newArray(int i) {
            return new CryptoTradingCoinListFragmentKey[i];
        }
    }

    public static /* synthetic */ CryptoTradingCoinListFragmentKey copy$default(CryptoTradingCoinListFragmentKey cryptoTradingCoinListFragmentKey, EntryPoint entryPoint, int i, Object obj) {
        if ((i & 1) != 0) {
            entryPoint = cryptoTradingCoinListFragmentKey.entryPoint;
        }
        return cryptoTradingCoinListFragmentKey.copy(entryPoint);
    }

    /* renamed from: component1, reason: from getter */
    public final EntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    public final CryptoTradingCoinListFragmentKey copy(EntryPoint entryPoint) {
        return new CryptoTradingCoinListFragmentKey(entryPoint);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CryptoTradingCoinListFragmentKey) && this.entryPoint == ((CryptoTradingCoinListFragmentKey) other).entryPoint;
    }

    public int hashCode() {
        EntryPoint entryPoint = this.entryPoint;
        if (entryPoint == null) {
            return 0;
        }
        return entryPoint.hashCode();
    }

    public String toString() {
        return "CryptoTradingCoinListFragmentKey(entryPoint=" + this.entryPoint + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        EntryPoint entryPoint = this.entryPoint;
        if (entryPoint == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(entryPoint.name());
        }
    }

    public CryptoTradingCoinListFragmentKey(EntryPoint entryPoint) {
        this.entryPoint = entryPoint;
    }

    public final EntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CryptoTradingCoinListFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/crypto/contracts/CryptoTradingCoinListFragmentKey$EntryPoint;", "", "queryParamString", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "TAX_LOTS", "CRYPTO_EDUCATION_TRADING_1_DOLLAR", "CRYPTO_EDUCATION_TRADING_5_DOLLAR", "Companion", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* loaded from: classes6.dex */
    public static final class EntryPoint {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EntryPoint[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Map<String, EntryPoint> map;
        private final String queryParamString;
        public static final EntryPoint TAX_LOTS = new EntryPoint("TAX_LOTS", 0, "tax_lots");
        public static final EntryPoint CRYPTO_EDUCATION_TRADING_1_DOLLAR = new EntryPoint("CRYPTO_EDUCATION_TRADING_1_DOLLAR", 1, "crypto_education_trading_1_dollar");
        public static final EntryPoint CRYPTO_EDUCATION_TRADING_5_DOLLAR = new EntryPoint("CRYPTO_EDUCATION_TRADING_5_DOLLAR", 2, "crypto_education_trading_5_dollar");

        private static final /* synthetic */ EntryPoint[] $values() {
            return new EntryPoint[]{TAX_LOTS, CRYPTO_EDUCATION_TRADING_1_DOLLAR, CRYPTO_EDUCATION_TRADING_5_DOLLAR};
        }

        public static EnumEntries<EntryPoint> getEntries() {
            return $ENTRIES;
        }

        private EntryPoint(String str, int i, String str2) {
            this.queryParamString = str2;
        }

        static {
            EntryPoint[] entryPointArr$values = $values();
            $VALUES = entryPointArr$values;
            $ENTRIES = EnumEntries2.enumEntries(entryPointArr$values);
            INSTANCE = new Companion(null);
            EnumEntries<EntryPoint> entries = getEntries();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(entries, 10)), 16));
            for (EntryPoint entryPoint : entries) {
                linkedHashMap.put(entryPoint.queryParamString, entryPoint);
            }
            map = linkedHashMap;
        }

        /* compiled from: CryptoTradingCoinListFragmentKey.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/crypto/contracts/CryptoTradingCoinListFragmentKey$EntryPoint$Companion;", "", "<init>", "()V", "map", "", "", "Lcom/robinhood/shared/crypto/contracts/CryptoTradingCoinListFragmentKey$EntryPoint;", "fromQueryParam", "queryParam", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final EntryPoint fromQueryParam(String queryParam) {
                if (queryParam == null) {
                    return null;
                }
                EntryPoint entryPoint = (EntryPoint) EntryPoint.map.get(queryParam);
                if (entryPoint != null) {
                    return entryPoint;
                }
                Preconditions.INSTANCE.failUnexpectedItemKotlin(queryParam);
                throw new ExceptionsH();
            }
        }

        public static EntryPoint valueOf(String str) {
            return (EntryPoint) Enum.valueOf(EntryPoint.class, str);
        }

        public static EntryPoint[] values() {
            return (EntryPoint[]) $VALUES.clone();
        }
    }
}
