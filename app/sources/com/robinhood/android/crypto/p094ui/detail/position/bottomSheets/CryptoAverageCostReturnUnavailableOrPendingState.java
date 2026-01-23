package com.robinhood.android.crypto.p094ui.detail.position.bottomSheets;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoAverageCostReturnUnavailableOrPendingBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/position/bottomSheets/CryptoAverageCostReturnUnavailableOrPendingState;", "", "assetCurrencyCode", "", "type", "Lcom/robinhood/android/crypto/ui/detail/position/bottomSheets/CryptoAverageCostReturnUnavailableOrPendingState$Type;", "isCryptoUsCostBasisExperimentEnabled", "", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/crypto/ui/detail/position/bottomSheets/CryptoAverageCostReturnUnavailableOrPendingState$Type;Z)V", "getAssetCurrencyCode", "()Ljava/lang/String;", "getType", "()Lcom/robinhood/android/crypto/ui/detail/position/bottomSheets/CryptoAverageCostReturnUnavailableOrPendingState$Type;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "Type", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoAverageCostReturnUnavailableOrPendingState {
    public static final int $stable = 0;
    private final String assetCurrencyCode;
    private final boolean isCryptoUsCostBasisExperimentEnabled;
    private final Type type;

    public static /* synthetic */ CryptoAverageCostReturnUnavailableOrPendingState copy$default(CryptoAverageCostReturnUnavailableOrPendingState cryptoAverageCostReturnUnavailableOrPendingState, String str, Type type2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cryptoAverageCostReturnUnavailableOrPendingState.assetCurrencyCode;
        }
        if ((i & 2) != 0) {
            type2 = cryptoAverageCostReturnUnavailableOrPendingState.type;
        }
        if ((i & 4) != 0) {
            z = cryptoAverageCostReturnUnavailableOrPendingState.isCryptoUsCostBasisExperimentEnabled;
        }
        return cryptoAverageCostReturnUnavailableOrPendingState.copy(str, type2, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAssetCurrencyCode() {
        return this.assetCurrencyCode;
    }

    /* renamed from: component2, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsCryptoUsCostBasisExperimentEnabled() {
        return this.isCryptoUsCostBasisExperimentEnabled;
    }

    public final CryptoAverageCostReturnUnavailableOrPendingState copy(String assetCurrencyCode, Type type2, boolean isCryptoUsCostBasisExperimentEnabled) {
        Intrinsics.checkNotNullParameter(assetCurrencyCode, "assetCurrencyCode");
        Intrinsics.checkNotNullParameter(type2, "type");
        return new CryptoAverageCostReturnUnavailableOrPendingState(assetCurrencyCode, type2, isCryptoUsCostBasisExperimentEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoAverageCostReturnUnavailableOrPendingState)) {
            return false;
        }
        CryptoAverageCostReturnUnavailableOrPendingState cryptoAverageCostReturnUnavailableOrPendingState = (CryptoAverageCostReturnUnavailableOrPendingState) other;
        return Intrinsics.areEqual(this.assetCurrencyCode, cryptoAverageCostReturnUnavailableOrPendingState.assetCurrencyCode) && this.type == cryptoAverageCostReturnUnavailableOrPendingState.type && this.isCryptoUsCostBasisExperimentEnabled == cryptoAverageCostReturnUnavailableOrPendingState.isCryptoUsCostBasisExperimentEnabled;
    }

    public int hashCode() {
        return (((this.assetCurrencyCode.hashCode() * 31) + this.type.hashCode()) * 31) + Boolean.hashCode(this.isCryptoUsCostBasisExperimentEnabled);
    }

    public String toString() {
        return "CryptoAverageCostReturnUnavailableOrPendingState(assetCurrencyCode=" + this.assetCurrencyCode + ", type=" + this.type + ", isCryptoUsCostBasisExperimentEnabled=" + this.isCryptoUsCostBasisExperimentEnabled + ")";
    }

    public CryptoAverageCostReturnUnavailableOrPendingState(String assetCurrencyCode, Type type2, boolean z) {
        Intrinsics.checkNotNullParameter(assetCurrencyCode, "assetCurrencyCode");
        Intrinsics.checkNotNullParameter(type2, "type");
        this.assetCurrencyCode = assetCurrencyCode;
        this.type = type2;
        this.isCryptoUsCostBasisExperimentEnabled = z;
    }

    public final String getAssetCurrencyCode() {
        return this.assetCurrencyCode;
    }

    public final Type getType() {
        return this.type;
    }

    public final boolean isCryptoUsCostBasisExperimentEnabled() {
        return this.isCryptoUsCostBasisExperimentEnabled;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CryptoAverageCostReturnUnavailableOrPendingBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/position/bottomSheets/CryptoAverageCostReturnUnavailableOrPendingState$Type;", "", "<init>", "(Ljava/lang/String;I)V", "UNAVAILABLE", "PENDING", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Type {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type UNAVAILABLE = new Type("UNAVAILABLE", 0);
        public static final Type PENDING = new Type("PENDING", 1);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{UNAVAILABLE, PENDING};
        }

        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        private Type(String str, int i) {
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(typeArr$values);
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }
}
