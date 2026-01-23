package com.robinhood.shared.crypto.contracts.detail;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoDetailV2FragmentKey.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u000f\u0010R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0002\u0011\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/crypto/contracts/detail/CryptoDetailV2FragmentKey;", "Lcom/robinhood/shared/crypto/contracts/detail/CryptoDetailKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "currencyPairId", "Ljava/util/UUID;", "getCurrencyPairId", "()Ljava/util/UUID;", "source", "", "getSource", "()Ljava/lang/String;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "Crypto", "Tokenized", "Lcom/robinhood/shared/crypto/contracts/detail/CryptoDetailV2FragmentKey$Crypto;", "Lcom/robinhood/shared/crypto/contracts/detail/CryptoDetailV2FragmentKey$Tokenized;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public interface CryptoDetailV2FragmentKey extends CryptoDetailKey, TabFragmentKey {
    @Override // com.robinhood.shared.crypto.contracts.detail.CryptoDetailKey
    UUID getCurrencyPairId();

    @Override // com.robinhood.android.navigation.keys.TabFragmentKey
    FragmentTab getDefaultTab();

    @Override // com.robinhood.shared.crypto.contracts.detail.CryptoDetailKey
    String getSource();

    /* compiled from: CryptoDetailV2FragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static FragmentTab getDefaultTab(CryptoDetailV2FragmentKey cryptoDetailV2FragmentKey) {
            return FragmentTab.CURRENT_TAB;
        }
    }

    /* compiled from: CryptoDetailV2FragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/crypto/contracts/detail/CryptoDetailV2FragmentKey$Crypto;", "Lcom/robinhood/shared/crypto/contracts/detail/CryptoDetailV2FragmentKey;", "currencyPairId", "Ljava/util/UUID;", "source", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;)V", "getCurrencyPairId", "()Ljava/util/UUID;", "getSource", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Crypto implements CryptoDetailV2FragmentKey {
        public static final Parcelable.Creator<Crypto> CREATOR = new Creator();
        private final UUID currencyPairId;
        private final String source;

        /* compiled from: CryptoDetailV2FragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Crypto> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Crypto createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Crypto((UUID) parcel.readSerializable(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Crypto[] newArray(int i) {
                return new Crypto[i];
            }
        }

        public static /* synthetic */ Crypto copy$default(Crypto crypto2, UUID uuid, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = crypto2.currencyPairId;
            }
            if ((i & 2) != 0) {
                str = crypto2.source;
            }
            return crypto2.copy(uuid, str);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public final Crypto copy(UUID currencyPairId, String source) {
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            return new Crypto(currencyPairId, source);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Crypto)) {
                return false;
            }
            Crypto crypto2 = (Crypto) other;
            return Intrinsics.areEqual(this.currencyPairId, crypto2.currencyPairId) && Intrinsics.areEqual(this.source, crypto2.source);
        }

        public int hashCode() {
            int iHashCode = this.currencyPairId.hashCode() * 31;
            String str = this.source;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Crypto(currencyPairId=" + this.currencyPairId + ", source=" + this.source + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.currencyPairId);
            dest.writeString(this.source);
        }

        @Override // com.robinhood.shared.crypto.contracts.detail.CryptoDetailV2FragmentKey, com.robinhood.android.navigation.keys.TabFragmentKey
        public FragmentTab getDefaultTab() {
            return DefaultImpls.getDefaultTab(this);
        }

        public Crypto(UUID currencyPairId, String str) {
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            this.currencyPairId = currencyPairId;
            this.source = str;
        }

        public /* synthetic */ Crypto(UUID uuid, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, (i & 2) != 0 ? null : str);
        }

        @Override // com.robinhood.shared.crypto.contracts.detail.CryptoDetailV2FragmentKey, com.robinhood.shared.crypto.contracts.detail.CryptoDetailKey
        public UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        @Override // com.robinhood.shared.crypto.contracts.detail.CryptoDetailV2FragmentKey, com.robinhood.shared.crypto.contracts.detail.CryptoDetailKey
        public String getSource() {
            return this.source;
        }
    }

    /* compiled from: CryptoDetailV2FragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/crypto/contracts/detail/CryptoDetailV2FragmentKey$Tokenized;", "Lcom/robinhood/shared/crypto/contracts/detail/CryptoDetailV2FragmentKey;", "currencyPairId", "Ljava/util/UUID;", "source", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;)V", "getCurrencyPairId", "()Ljava/util/UUID;", "getSource", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Tokenized implements CryptoDetailV2FragmentKey {
        public static final Parcelable.Creator<Tokenized> CREATOR = new Creator();
        private final UUID currencyPairId;
        private final String source;

        /* compiled from: CryptoDetailV2FragmentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Tokenized> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Tokenized createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Tokenized((UUID) parcel.readSerializable(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Tokenized[] newArray(int i) {
                return new Tokenized[i];
            }
        }

        public static /* synthetic */ Tokenized copy$default(Tokenized tokenized, UUID uuid, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = tokenized.currencyPairId;
            }
            if ((i & 2) != 0) {
                str = tokenized.source;
            }
            return tokenized.copy(uuid, str);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public final Tokenized copy(UUID currencyPairId, String source) {
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            return new Tokenized(currencyPairId, source);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Tokenized)) {
                return false;
            }
            Tokenized tokenized = (Tokenized) other;
            return Intrinsics.areEqual(this.currencyPairId, tokenized.currencyPairId) && Intrinsics.areEqual(this.source, tokenized.source);
        }

        public int hashCode() {
            int iHashCode = this.currencyPairId.hashCode() * 31;
            String str = this.source;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Tokenized(currencyPairId=" + this.currencyPairId + ", source=" + this.source + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.currencyPairId);
            dest.writeString(this.source);
        }

        @Override // com.robinhood.shared.crypto.contracts.detail.CryptoDetailV2FragmentKey, com.robinhood.android.navigation.keys.TabFragmentKey
        public FragmentTab getDefaultTab() {
            return DefaultImpls.getDefaultTab(this);
        }

        public Tokenized(UUID currencyPairId, String str) {
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            this.currencyPairId = currencyPairId;
            this.source = str;
        }

        public /* synthetic */ Tokenized(UUID uuid, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, (i & 2) != 0 ? null : str);
        }

        @Override // com.robinhood.shared.crypto.contracts.detail.CryptoDetailV2FragmentKey, com.robinhood.shared.crypto.contracts.detail.CryptoDetailKey
        public UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        @Override // com.robinhood.shared.crypto.contracts.detail.CryptoDetailV2FragmentKey, com.robinhood.shared.crypto.contracts.detail.CryptoDetailKey
        public String getSource() {
            return this.source;
        }
    }
}
