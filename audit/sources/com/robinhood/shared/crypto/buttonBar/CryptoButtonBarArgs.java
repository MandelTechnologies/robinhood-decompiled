package com.robinhood.shared.crypto.buttonBar;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.crypto.models.perpetuals.p288db.SourceScreen;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoButtonBarArgs.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarArgs;", "Landroid/os/Parcelable;", "<init>", "()V", "Perpetuals", "Crypto", "Home", "Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarArgs$Crypto;", "Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarArgs$Home;", "Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarArgs$Perpetuals;", "lib-crypto-button-bar_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public abstract class CryptoButtonBarArgs implements Parcelable {
    public static final int $stable = 0;

    public /* synthetic */ CryptoButtonBarArgs(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CryptoButtonBarArgs() {
    }

    /* compiled from: CryptoButtonBarArgs.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarArgs$Perpetuals;", "Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarArgs;", "sourceScreen", "Lcom/robinhood/crypto/models/perpetuals/db/SourceScreen;", "perpetualContractId", "Ljava/util/UUID;", "<init>", "(Lcom/robinhood/crypto/models/perpetuals/db/SourceScreen;Ljava/util/UUID;)V", "getSourceScreen", "()Lcom/robinhood/crypto/models/perpetuals/db/SourceScreen;", "getPerpetualContractId", "()Ljava/util/UUID;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-crypto-button-bar_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Perpetuals extends CryptoButtonBarArgs {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Perpetuals> CREATOR = new Creator();
        private final UUID perpetualContractId;
        private final SourceScreen sourceScreen;

        /* compiled from: CryptoButtonBarArgs.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Perpetuals> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Perpetuals createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Perpetuals(SourceScreen.valueOf(parcel.readString()), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Perpetuals[] newArray(int i) {
                return new Perpetuals[i];
            }
        }

        public static /* synthetic */ Perpetuals copy$default(Perpetuals perpetuals, SourceScreen sourceScreen, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                sourceScreen = perpetuals.sourceScreen;
            }
            if ((i & 2) != 0) {
                uuid = perpetuals.perpetualContractId;
            }
            return perpetuals.copy(sourceScreen, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final SourceScreen getSourceScreen() {
            return this.sourceScreen;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getPerpetualContractId() {
            return this.perpetualContractId;
        }

        public final Perpetuals copy(SourceScreen sourceScreen, UUID perpetualContractId) {
            Intrinsics.checkNotNullParameter(sourceScreen, "sourceScreen");
            return new Perpetuals(sourceScreen, perpetualContractId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Perpetuals)) {
                return false;
            }
            Perpetuals perpetuals = (Perpetuals) other;
            return this.sourceScreen == perpetuals.sourceScreen && Intrinsics.areEqual(this.perpetualContractId, perpetuals.perpetualContractId);
        }

        public int hashCode() {
            int iHashCode = this.sourceScreen.hashCode() * 31;
            UUID uuid = this.perpetualContractId;
            return iHashCode + (uuid == null ? 0 : uuid.hashCode());
        }

        public String toString() {
            return "Perpetuals(sourceScreen=" + this.sourceScreen + ", perpetualContractId=" + this.perpetualContractId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.sourceScreen.name());
            dest.writeSerializable(this.perpetualContractId);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Perpetuals(SourceScreen sourceScreen, UUID uuid) {
            super(null);
            Intrinsics.checkNotNullParameter(sourceScreen, "sourceScreen");
            this.sourceScreen = sourceScreen;
            this.perpetualContractId = uuid;
        }

        public final UUID getPerpetualContractId() {
            return this.perpetualContractId;
        }

        public final SourceScreen getSourceScreen() {
            return this.sourceScreen;
        }
    }

    /* compiled from: CryptoButtonBarArgs.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarArgs$Crypto;", "Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarArgs;", "currencyPairId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getCurrencyPairId", "()Ljava/util/UUID;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-crypto-button-bar_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Crypto extends CryptoButtonBarArgs {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Crypto> CREATOR = new Creator();
        private final UUID currencyPairId;

        /* compiled from: CryptoButtonBarArgs.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Crypto> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Crypto createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Crypto((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Crypto[] newArray(int i) {
                return new Crypto[i];
            }
        }

        public static /* synthetic */ Crypto copy$default(Crypto crypto2, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = crypto2.currencyPairId;
            }
            return crypto2.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        public final Crypto copy(UUID currencyPairId) {
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            return new Crypto(currencyPairId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Crypto) && Intrinsics.areEqual(this.currencyPairId, ((Crypto) other).currencyPairId);
        }

        public int hashCode() {
            return this.currencyPairId.hashCode();
        }

        public String toString() {
            return "Crypto(currencyPairId=" + this.currencyPairId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.currencyPairId);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Crypto(UUID currencyPairId) {
            super(null);
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            this.currencyPairId = currencyPairId;
        }

        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }
    }

    /* compiled from: CryptoButtonBarArgs.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarArgs$Home;", "Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarArgs;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-crypto-button-bar_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Home extends CryptoButtonBarArgs {
        public static final int $stable = 0;
        public static final Home INSTANCE = new Home();
        public static final Parcelable.Creator<Home> CREATOR = new Creator();

        /* compiled from: CryptoButtonBarArgs.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Home> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Home createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Home.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Home[] newArray(int i) {
                return new Home[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Home);
        }

        public int hashCode() {
            return 940729142;
        }

        public String toString() {
            return "Home";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private Home() {
            super(null);
        }
    }
}
