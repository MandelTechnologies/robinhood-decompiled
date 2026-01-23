package com.robinhood.librobinhood.data.store.fee;

import com.robinhood.models.crypto.p314db.fee.CryptoFeeTierInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoFeeTierPreferencesProvider.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierPreferences;", "", "<init>", "()V", "Ineligible", "Enabled", "Disabled", "Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierPreferences$Disabled;", "Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierPreferences$Enabled;", "Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierPreferences$Ineligible;", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.fee.CryptoFeeTierPreferences, reason: use source file name */
/* loaded from: classes13.dex */
public abstract class CryptoFeeTierPreferencesProvider2 {
    public /* synthetic */ CryptoFeeTierPreferencesProvider2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CryptoFeeTierPreferencesProvider2() {
    }

    /* compiled from: CryptoFeeTierPreferencesProvider.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierPreferences$Ineligible;", "Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierPreferences;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.fee.CryptoFeeTierPreferences$Ineligible */
    public static final /* data */ class Ineligible extends CryptoFeeTierPreferencesProvider2 {
        public static final Ineligible INSTANCE = new Ineligible();

        public boolean equals(Object other) {
            return this == other || (other instanceof Ineligible);
        }

        public int hashCode() {
            return 867708472;
        }

        public String toString() {
            return "Ineligible";
        }

        private Ineligible() {
            super(null);
        }
    }

    /* compiled from: CryptoFeeTierPreferencesProvider.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierPreferences$Enabled;", "Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierPreferences;", "feeTierInfo", "Lcom/robinhood/models/crypto/db/fee/CryptoFeeTierInfo;", "<init>", "(Lcom/robinhood/models/crypto/db/fee/CryptoFeeTierInfo;)V", "getFeeTierInfo", "()Lcom/robinhood/models/crypto/db/fee/CryptoFeeTierInfo;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.fee.CryptoFeeTierPreferences$Enabled, reason: from toString */
    public static final /* data */ class Enabled extends CryptoFeeTierPreferencesProvider2 {
        private final CryptoFeeTierInfo feeTierInfo;

        public static /* synthetic */ Enabled copy$default(Enabled enabled, CryptoFeeTierInfo cryptoFeeTierInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                cryptoFeeTierInfo = enabled.feeTierInfo;
            }
            return enabled.copy(cryptoFeeTierInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoFeeTierInfo getFeeTierInfo() {
            return this.feeTierInfo;
        }

        public final Enabled copy(CryptoFeeTierInfo feeTierInfo) {
            Intrinsics.checkNotNullParameter(feeTierInfo, "feeTierInfo");
            return new Enabled(feeTierInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Enabled) && Intrinsics.areEqual(this.feeTierInfo, ((Enabled) other).feeTierInfo);
        }

        public int hashCode() {
            return this.feeTierInfo.hashCode();
        }

        public String toString() {
            return "Enabled(feeTierInfo=" + this.feeTierInfo + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Enabled(CryptoFeeTierInfo feeTierInfo) {
            super(null);
            Intrinsics.checkNotNullParameter(feeTierInfo, "feeTierInfo");
            this.feeTierInfo = feeTierInfo;
        }

        public final CryptoFeeTierInfo getFeeTierInfo() {
            return this.feeTierInfo;
        }
    }

    /* compiled from: CryptoFeeTierPreferencesProvider.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierPreferences$Disabled;", "Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierPreferences;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.fee.CryptoFeeTierPreferences$Disabled */
    public static final /* data */ class Disabled extends CryptoFeeTierPreferencesProvider2 {
        public static final Disabled INSTANCE = new Disabled();

        public boolean equals(Object other) {
            return this == other || (other instanceof Disabled);
        }

        public int hashCode() {
            return 2077750712;
        }

        public String toString() {
            return "Disabled";
        }

        private Disabled() {
            super(null);
        }
    }
}
