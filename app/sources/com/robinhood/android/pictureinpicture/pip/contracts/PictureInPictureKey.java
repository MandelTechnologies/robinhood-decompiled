package com.robinhood.android.pictureinpicture.pip.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PictureInPictureKey.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0006\t\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0006\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/pictureinpicture/pip/contracts/PictureInPictureKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "entrypointIdentifier", "", "<init>", "(Ljava/lang/String;)V", "getEntrypointIdentifier", "()Ljava/lang/String;", "Instrument", "Crypto", "FuturesOutright", "Event", "Option", "Index", "Lcom/robinhood/android/pictureinpicture/pip/contracts/PictureInPictureKey$Crypto;", "Lcom/robinhood/android/pictureinpicture/pip/contracts/PictureInPictureKey$Event;", "Lcom/robinhood/android/pictureinpicture/pip/contracts/PictureInPictureKey$FuturesOutright;", "Lcom/robinhood/android/pictureinpicture/pip/contracts/PictureInPictureKey$Index;", "Lcom/robinhood/android/pictureinpicture/pip/contracts/PictureInPictureKey$Instrument;", "Lcom/robinhood/android/pictureinpicture/pip/contracts/PictureInPictureKey$Option;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public abstract class PictureInPictureKey implements IntentKey, Parcelable {
    private final String entrypointIdentifier;

    public /* synthetic */ PictureInPictureKey(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    private PictureInPictureKey(String str) {
        this.entrypointIdentifier = str;
    }

    public final String getEntrypointIdentifier() {
        return this.entrypointIdentifier;
    }

    /* compiled from: PictureInPictureKey.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/pictureinpicture/pip/contracts/PictureInPictureKey$Instrument;", "Lcom/robinhood/android/pictureinpicture/pip/contracts/PictureInPictureKey;", "Landroid/os/Parcelable;", "instrumentId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getInstrumentId", "()Ljava/util/UUID;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Instrument extends PictureInPictureKey implements Parcelable {
        public static final Parcelable.Creator<Instrument> CREATOR = new Creator();
        private final UUID instrumentId;

        /* compiled from: PictureInPictureKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes11.dex */
        public static final class Creator implements Parcelable.Creator<Instrument> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Instrument createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Instrument((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Instrument[] newArray(int i) {
                return new Instrument[i];
            }
        }

        public static /* synthetic */ Instrument copy$default(Instrument instrument, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = instrument.instrumentId;
            }
            return instrument.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final Instrument copy(UUID instrumentId) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            return new Instrument(instrumentId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Instrument) && Intrinsics.areEqual(this.instrumentId, ((Instrument) other).instrumentId);
        }

        public int hashCode() {
            return this.instrumentId.hashCode();
        }

        public String toString() {
            return "Instrument(instrumentId=" + this.instrumentId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.instrumentId);
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Instrument(UUID instrumentId) {
            super("instrument_" + instrumentId, null);
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            this.instrumentId = instrumentId;
        }
    }

    /* compiled from: PictureInPictureKey.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/pictureinpicture/pip/contracts/PictureInPictureKey$Crypto;", "Lcom/robinhood/android/pictureinpicture/pip/contracts/PictureInPictureKey;", "Landroid/os/Parcelable;", "currencyPairId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getCurrencyPairId", "()Ljava/util/UUID;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Crypto extends PictureInPictureKey implements Parcelable {
        public static final Parcelable.Creator<Crypto> CREATOR = new Creator();
        private final UUID currencyPairId;

        /* compiled from: PictureInPictureKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes11.dex */
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

        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Crypto(UUID currencyPairId) {
            super("crypto_" + currencyPairId, null);
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            this.currencyPairId = currencyPairId;
        }
    }

    /* compiled from: PictureInPictureKey.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/pictureinpicture/pip/contracts/PictureInPictureKey$FuturesOutright;", "Lcom/robinhood/android/pictureinpicture/pip/contracts/PictureInPictureKey;", "Landroid/os/Parcelable;", "contractId", "Ljava/util/UUID;", "isContinuous", "", "<init>", "(Ljava/util/UUID;Z)V", "getContractId", "()Ljava/util/UUID;", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final /* data */ class FuturesOutright extends PictureInPictureKey implements Parcelable {
        public static final Parcelable.Creator<FuturesOutright> CREATOR = new Creator();
        private final UUID contractId;
        private final boolean isContinuous;

        /* compiled from: PictureInPictureKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<FuturesOutright> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FuturesOutright createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FuturesOutright((UUID) parcel.readSerializable(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FuturesOutright[] newArray(int i) {
                return new FuturesOutright[i];
            }
        }

        public static /* synthetic */ FuturesOutright copy$default(FuturesOutright futuresOutright, UUID uuid, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = futuresOutright.contractId;
            }
            if ((i & 2) != 0) {
                z = futuresOutright.isContinuous;
            }
            return futuresOutright.copy(uuid, z);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getContractId() {
            return this.contractId;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsContinuous() {
            return this.isContinuous;
        }

        public final FuturesOutright copy(UUID contractId, boolean isContinuous) {
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            return new FuturesOutright(contractId, isContinuous);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FuturesOutright)) {
                return false;
            }
            FuturesOutright futuresOutright = (FuturesOutright) other;
            return Intrinsics.areEqual(this.contractId, futuresOutright.contractId) && this.isContinuous == futuresOutright.isContinuous;
        }

        public int hashCode() {
            return (this.contractId.hashCode() * 31) + Boolean.hashCode(this.isContinuous);
        }

        public String toString() {
            return "FuturesOutright(contractId=" + this.contractId + ", isContinuous=" + this.isContinuous + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.contractId);
            dest.writeInt(this.isContinuous ? 1 : 0);
        }

        public final UUID getContractId() {
            return this.contractId;
        }

        public final boolean isContinuous() {
            return this.isContinuous;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public FuturesOutright(UUID contractId, boolean z) {
            String str;
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            if (z) {
                str = "futures_outright_" + contractId;
            } else {
                str = "futures_outright_continuous_" + contractId;
            }
            super(str, null);
            this.contractId = contractId;
            this.isContinuous = z;
        }
    }

    /* compiled from: PictureInPictureKey.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/pictureinpicture/pip/contracts/PictureInPictureKey$Event;", "Lcom/robinhood/android/pictureinpicture/pip/contracts/PictureInPictureKey;", "Landroid/os/Parcelable;", "eventId", "Ljava/util/UUID;", "contractIds", "", "span", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "<init>", "(Ljava/util/UUID;Ljava/util/List;Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;)V", "getEventId", "()Ljava/util/UUID;", "getContractIds", "()Ljava/util/List;", "getSpan", "()Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final /* data */ class Event extends PictureInPictureKey implements Parcelable {
        public static final Parcelable.Creator<Event> CREATOR = new Creator();
        private final List<UUID> contractIds;
        private final UUID eventId;
        private final DisplaySpan span;

        /* compiled from: PictureInPictureKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Event> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Event createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                UUID uuid = (UUID) parcel.readSerializable();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readSerializable());
                }
                return new Event(uuid, arrayList, DisplaySpan.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Event[] newArray(int i) {
                return new Event[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Event copy$default(Event event, UUID uuid, List list, DisplaySpan displaySpan, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = event.eventId;
            }
            if ((i & 2) != 0) {
                list = event.contractIds;
            }
            if ((i & 4) != 0) {
                displaySpan = event.span;
            }
            return event.copy(uuid, list, displaySpan);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getEventId() {
            return this.eventId;
        }

        public final List<UUID> component2() {
            return this.contractIds;
        }

        /* renamed from: component3, reason: from getter */
        public final DisplaySpan getSpan() {
            return this.span;
        }

        public final Event copy(UUID eventId, List<UUID> contractIds, DisplaySpan span) {
            Intrinsics.checkNotNullParameter(eventId, "eventId");
            Intrinsics.checkNotNullParameter(contractIds, "contractIds");
            Intrinsics.checkNotNullParameter(span, "span");
            return new Event(eventId, contractIds, span);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Event)) {
                return false;
            }
            Event event = (Event) other;
            return Intrinsics.areEqual(this.eventId, event.eventId) && Intrinsics.areEqual(this.contractIds, event.contractIds) && this.span == event.span;
        }

        public int hashCode() {
            return (((this.eventId.hashCode() * 31) + this.contractIds.hashCode()) * 31) + this.span.hashCode();
        }

        public String toString() {
            return "Event(eventId=" + this.eventId + ", contractIds=" + this.contractIds + ", span=" + this.span + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.eventId);
            List<UUID> list = this.contractIds;
            dest.writeInt(list.size());
            Iterator<UUID> it = list.iterator();
            while (it.hasNext()) {
                dest.writeSerializable(it.next());
            }
            dest.writeString(this.span.name());
        }

        public final UUID getEventId() {
            return this.eventId;
        }

        public final List<UUID> getContractIds() {
            return this.contractIds;
        }

        public final DisplaySpan getSpan() {
            return this.span;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Event(UUID eventId, List<UUID> contractIds, DisplaySpan span) {
            super("event_" + eventId, null);
            Intrinsics.checkNotNullParameter(eventId, "eventId");
            Intrinsics.checkNotNullParameter(contractIds, "contractIds");
            Intrinsics.checkNotNullParameter(span, "span");
            this.eventId = eventId;
            this.contractIds = contractIds;
            this.span = span;
        }
    }

    /* compiled from: PictureInPictureKey.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BG\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\u000eHÆ\u0003JY\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0006\u0010%\u001a\u00020&J\u0013\u0010'\u001a\u00020\u000e2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020&HÖ\u0001J\t\u0010+\u001a\u00020\tHÖ\u0001J\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020&R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001b¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/pictureinpicture/pip/contracts/PictureInPictureKey$Option;", "Lcom/robinhood/android/pictureinpicture/pip/contracts/PictureInPictureKey;", "Landroid/os/Parcelable;", "instrumentId", "Ljava/util/UUID;", "optionChainId", "underlyingType", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "tickerSymbol", "", "strategyCode", "displayName", "accountNumber", "isLegContext", "", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;Lcom/robinhood/models/db/OptionChain$UnderlyingType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getInstrumentId", "()Ljava/util/UUID;", "getOptionChainId", "getUnderlyingType", "()Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "getTickerSymbol", "()Ljava/lang/String;", "getStrategyCode", "getDisplayName", "getAccountNumber", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final /* data */ class Option extends PictureInPictureKey implements Parcelable {
        public static final Parcelable.Creator<Option> CREATOR = new Creator();
        private final String accountNumber;
        private final String displayName;
        private final UUID instrumentId;
        private final boolean isLegContext;
        private final UUID optionChainId;
        private final String strategyCode;
        private final String tickerSymbol;
        private final OptionChain.UnderlyingType underlyingType;

        /* compiled from: PictureInPictureKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Option> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Option createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Option((UUID) parcel.readSerializable(), (UUID) parcel.readSerializable(), OptionChain.UnderlyingType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Option[] newArray(int i) {
                return new Option[i];
            }
        }

        public static /* synthetic */ Option copy$default(Option option, UUID uuid, UUID uuid2, OptionChain.UnderlyingType underlyingType, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = option.instrumentId;
            }
            if ((i & 2) != 0) {
                uuid2 = option.optionChainId;
            }
            if ((i & 4) != 0) {
                underlyingType = option.underlyingType;
            }
            if ((i & 8) != 0) {
                str = option.tickerSymbol;
            }
            if ((i & 16) != 0) {
                str2 = option.strategyCode;
            }
            if ((i & 32) != 0) {
                str3 = option.displayName;
            }
            if ((i & 64) != 0) {
                str4 = option.accountNumber;
            }
            if ((i & 128) != 0) {
                z = option.isLegContext;
            }
            String str5 = str4;
            boolean z2 = z;
            String str6 = str2;
            String str7 = str3;
            return option.copy(uuid, uuid2, underlyingType, str, str6, str7, str5, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getOptionChainId() {
            return this.optionChainId;
        }

        /* renamed from: component3, reason: from getter */
        public final OptionChain.UnderlyingType getUnderlyingType() {
            return this.underlyingType;
        }

        /* renamed from: component4, reason: from getter */
        public final String getTickerSymbol() {
            return this.tickerSymbol;
        }

        /* renamed from: component5, reason: from getter */
        public final String getStrategyCode() {
            return this.strategyCode;
        }

        /* renamed from: component6, reason: from getter */
        public final String getDisplayName() {
            return this.displayName;
        }

        /* renamed from: component7, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getIsLegContext() {
            return this.isLegContext;
        }

        public final Option copy(UUID instrumentId, UUID optionChainId, OptionChain.UnderlyingType underlyingType, String tickerSymbol, String strategyCode, String displayName, String accountNumber, boolean isLegContext) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(optionChainId, "optionChainId");
            Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
            Intrinsics.checkNotNullParameter(tickerSymbol, "tickerSymbol");
            Intrinsics.checkNotNullParameter(strategyCode, "strategyCode");
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new Option(instrumentId, optionChainId, underlyingType, tickerSymbol, strategyCode, displayName, accountNumber, isLegContext);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Option)) {
                return false;
            }
            Option option = (Option) other;
            return Intrinsics.areEqual(this.instrumentId, option.instrumentId) && Intrinsics.areEqual(this.optionChainId, option.optionChainId) && this.underlyingType == option.underlyingType && Intrinsics.areEqual(this.tickerSymbol, option.tickerSymbol) && Intrinsics.areEqual(this.strategyCode, option.strategyCode) && Intrinsics.areEqual(this.displayName, option.displayName) && Intrinsics.areEqual(this.accountNumber, option.accountNumber) && this.isLegContext == option.isLegContext;
        }

        public int hashCode() {
            return (((((((((((((this.instrumentId.hashCode() * 31) + this.optionChainId.hashCode()) * 31) + this.underlyingType.hashCode()) * 31) + this.tickerSymbol.hashCode()) * 31) + this.strategyCode.hashCode()) * 31) + this.displayName.hashCode()) * 31) + this.accountNumber.hashCode()) * 31) + Boolean.hashCode(this.isLegContext);
        }

        public String toString() {
            return "Option(instrumentId=" + this.instrumentId + ", optionChainId=" + this.optionChainId + ", underlyingType=" + this.underlyingType + ", tickerSymbol=" + this.tickerSymbol + ", strategyCode=" + this.strategyCode + ", displayName=" + this.displayName + ", accountNumber=" + this.accountNumber + ", isLegContext=" + this.isLegContext + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.instrumentId);
            dest.writeSerializable(this.optionChainId);
            dest.writeString(this.underlyingType.name());
            dest.writeString(this.tickerSymbol);
            dest.writeString(this.strategyCode);
            dest.writeString(this.displayName);
            dest.writeString(this.accountNumber);
            dest.writeInt(this.isLegContext ? 1 : 0);
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final UUID getOptionChainId() {
            return this.optionChainId;
        }

        public final OptionChain.UnderlyingType getUnderlyingType() {
            return this.underlyingType;
        }

        public final String getTickerSymbol() {
            return this.tickerSymbol;
        }

        public final String getStrategyCode() {
            return this.strategyCode;
        }

        public final String getDisplayName() {
            return this.displayName;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final boolean isLegContext() {
            return this.isLegContext;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Option(UUID instrumentId, UUID optionChainId, OptionChain.UnderlyingType underlyingType, String tickerSymbol, String strategyCode, String displayName, String accountNumber, boolean z) {
            super("option_detail_" + instrumentId + "_" + strategyCode, null);
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(optionChainId, "optionChainId");
            Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
            Intrinsics.checkNotNullParameter(tickerSymbol, "tickerSymbol");
            Intrinsics.checkNotNullParameter(strategyCode, "strategyCode");
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.instrumentId = instrumentId;
            this.optionChainId = optionChainId;
            this.underlyingType = underlyingType;
            this.tickerSymbol = tickerSymbol;
            this.strategyCode = strategyCode;
            this.displayName = displayName;
            this.accountNumber = accountNumber;
            this.isLegContext = z;
        }
    }

    /* compiled from: PictureInPictureKey.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/pictureinpicture/pip/contracts/PictureInPictureKey$Index;", "Lcom/robinhood/android/pictureinpicture/pip/contracts/PictureInPictureKey;", "Landroid/os/Parcelable;", "instrumentIndexId", "Ljava/util/UUID;", "accountNumber", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;)V", "getInstrumentIndexId", "()Ljava/util/UUID;", "getAccountNumber", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final /* data */ class Index extends PictureInPictureKey implements Parcelable {
        public static final Parcelable.Creator<Index> CREATOR = new Creator();
        private final String accountNumber;
        private final UUID instrumentIndexId;

        /* compiled from: PictureInPictureKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Index> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Index createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Index((UUID) parcel.readSerializable(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Index[] newArray(int i) {
                return new Index[i];
            }
        }

        public static /* synthetic */ Index copy$default(Index index, UUID uuid, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = index.instrumentIndexId;
            }
            if ((i & 2) != 0) {
                str = index.accountNumber;
            }
            return index.copy(uuid, str);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInstrumentIndexId() {
            return this.instrumentIndexId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final Index copy(UUID instrumentIndexId, String accountNumber) {
            Intrinsics.checkNotNullParameter(instrumentIndexId, "instrumentIndexId");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new Index(instrumentIndexId, accountNumber);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Index)) {
                return false;
            }
            Index index = (Index) other;
            return Intrinsics.areEqual(this.instrumentIndexId, index.instrumentIndexId) && Intrinsics.areEqual(this.accountNumber, index.accountNumber);
        }

        public int hashCode() {
            return (this.instrumentIndexId.hashCode() * 31) + this.accountNumber.hashCode();
        }

        public String toString() {
            return "Index(instrumentIndexId=" + this.instrumentIndexId + ", accountNumber=" + this.accountNumber + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.instrumentIndexId);
            dest.writeString(this.accountNumber);
        }

        public final UUID getInstrumentIndexId() {
            return this.instrumentIndexId;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Index(UUID instrumentIndexId, String accountNumber) {
            super("index_" + instrumentIndexId, null);
            Intrinsics.checkNotNullParameter(instrumentIndexId, "instrumentIndexId");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.instrumentIndexId = instrumentIndexId;
            this.accountNumber = accountNumber;
        }
    }
}
