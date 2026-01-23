package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.DoubleAsNumberSerializer;
import com.robinhood.rosetta.eventlogging.CryptoAssetContextDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: CryptoWalletAssetBalanceDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004#$%&B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B)\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\rJ&\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bJ\b\u0010\u0014\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001cH\u0016J\b\u0010\"\u001a\u00020\u001cH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011¨\u0006'"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoWalletAssetBalanceDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoWalletAssetBalance;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/CryptoWalletAssetBalanceDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CryptoWalletAssetBalanceDto$Surrogate;)V", "asset", "Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto;", "balance", "", "token_balance", "(Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto;DD)V", "getAsset", "()Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto;", "getBalance", "()D", "getToken_balance", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class CryptoWalletAssetBalanceDto implements Dto3<CryptoWalletAssetBalance>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CryptoWalletAssetBalanceDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CryptoWalletAssetBalanceDto, CryptoWalletAssetBalance>> binaryBase64Serializer$delegate;
    private static final CryptoWalletAssetBalanceDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CryptoWalletAssetBalanceDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CryptoWalletAssetBalanceDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final CryptoAssetContextDto getAsset() {
        return this.surrogate.getAsset();
    }

    public final double getBalance() {
        return this.surrogate.getBalance();
    }

    public final double getToken_balance() {
        return this.surrogate.getToken_balance();
    }

    public /* synthetic */ CryptoWalletAssetBalanceDto(CryptoAssetContextDto cryptoAssetContextDto, double d, double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cryptoAssetContextDto, (i & 2) != 0 ? 0.0d : d, (i & 4) != 0 ? 0.0d : d2);
    }

    public CryptoWalletAssetBalanceDto(CryptoAssetContextDto cryptoAssetContextDto, double d, double d2) {
        this(new Surrogate(cryptoAssetContextDto, d, d2));
    }

    public static /* synthetic */ CryptoWalletAssetBalanceDto copy$default(CryptoWalletAssetBalanceDto cryptoWalletAssetBalanceDto, CryptoAssetContextDto cryptoAssetContextDto, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            cryptoAssetContextDto = cryptoWalletAssetBalanceDto.surrogate.getAsset();
        }
        if ((i & 2) != 0) {
            d = cryptoWalletAssetBalanceDto.surrogate.getBalance();
        }
        if ((i & 4) != 0) {
            d2 = cryptoWalletAssetBalanceDto.surrogate.getToken_balance();
        }
        return cryptoWalletAssetBalanceDto.copy(cryptoAssetContextDto, d, d2);
    }

    public final CryptoWalletAssetBalanceDto copy(CryptoAssetContextDto asset, double balance, double token_balance) {
        return new CryptoWalletAssetBalanceDto(new Surrogate(asset, balance, token_balance));
    }

    @Override // com.robinhood.idl.Dto
    public CryptoWalletAssetBalance toProto() {
        CryptoAssetContextDto asset = this.surrogate.getAsset();
        return new CryptoWalletAssetBalance(asset != null ? asset.toProto() : null, this.surrogate.getBalance(), this.surrogate.getToken_balance(), null, 8, null);
    }

    public String toString() {
        return "[CryptoWalletAssetBalanceDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CryptoWalletAssetBalanceDto) && Intrinsics.areEqual(((CryptoWalletAssetBalanceDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CryptoWalletAssetBalanceDto.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 -2\u00020\u0001:\u0002,-BE\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0017\b\u0002\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\u0017\b\u0002\u0010\t\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\u0004\b\n\u0010\u000bB5\b\u0010\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\n\u0010\u0010J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0018\u0010\u001b\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003J\u0018\u0010\u001c\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003JG\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0017\b\u0002\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\u0017\b\u0002\u0010\t\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\rHÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001J%\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0001¢\u0006\u0002\b+R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R+\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0017R+\u0010\t\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0017¨\u0006."}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoWalletAssetBalanceDto$Surrogate;", "", "asset", "Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto;", "balance", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "token_balance", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto;DD)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto;DDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAsset$annotations", "()V", "getAsset", "()Lcom/robinhood/rosetta/eventlogging/CryptoAssetContextDto;", "getBalance$annotations", "getBalance", "()D", "getToken_balance$annotations", "getToken_balance", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final CryptoAssetContextDto asset;
        private final double balance;
        private final double token_balance;

        public Surrogate() {
            this((CryptoAssetContextDto) null, 0.0d, 0.0d, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, CryptoAssetContextDto cryptoAssetContextDto, double d, double d2, int i, Object obj) {
            if ((i & 1) != 0) {
                cryptoAssetContextDto = surrogate.asset;
            }
            if ((i & 2) != 0) {
                d = surrogate.balance;
            }
            if ((i & 4) != 0) {
                d2 = surrogate.token_balance;
            }
            return surrogate.copy(cryptoAssetContextDto, d, d2);
        }

        @SerialName("asset")
        @JsonAnnotations2(names = {"asset"})
        public static /* synthetic */ void getAsset$annotations() {
        }

        @SerialName("balance")
        @JsonAnnotations2(names = {"balance"})
        public static /* synthetic */ void getBalance$annotations() {
        }

        @SerialName("tokenBalance")
        @JsonAnnotations2(names = {"token_balance"})
        public static /* synthetic */ void getToken_balance$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoAssetContextDto getAsset() {
            return this.asset;
        }

        /* renamed from: component2, reason: from getter */
        public final double getBalance() {
            return this.balance;
        }

        /* renamed from: component3, reason: from getter */
        public final double getToken_balance() {
            return this.token_balance;
        }

        public final Surrogate copy(CryptoAssetContextDto asset, double balance, double token_balance) {
            return new Surrogate(asset, balance, token_balance);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.asset, surrogate.asset) && Double.compare(this.balance, surrogate.balance) == 0 && Double.compare(this.token_balance, surrogate.token_balance) == 0;
        }

        public int hashCode() {
            CryptoAssetContextDto cryptoAssetContextDto = this.asset;
            return ((((cryptoAssetContextDto == null ? 0 : cryptoAssetContextDto.hashCode()) * 31) + Double.hashCode(this.balance)) * 31) + Double.hashCode(this.token_balance);
        }

        public String toString() {
            return "Surrogate(asset=" + this.asset + ", balance=" + this.balance + ", token_balance=" + this.token_balance + ")";
        }

        /* compiled from: CryptoWalletAssetBalanceDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoWalletAssetBalanceDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CryptoWalletAssetBalanceDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CryptoWalletAssetBalanceDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, CryptoAssetContextDto cryptoAssetContextDto, double d, double d2, SerializationConstructorMarker serializationConstructorMarker) {
            this.asset = (i & 1) == 0 ? null : cryptoAssetContextDto;
            if ((i & 2) == 0) {
                this.balance = 0.0d;
            } else {
                this.balance = d;
            }
            if ((i & 4) == 0) {
                this.token_balance = 0.0d;
            } else {
                this.token_balance = d2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            CryptoAssetContextDto cryptoAssetContextDto = self.asset;
            if (cryptoAssetContextDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, CryptoAssetContextDto.Serializer.INSTANCE, cryptoAssetContextDto);
            }
            if (Double.compare(self.balance, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 1, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.balance));
            }
            if (Double.compare(self.token_balance, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 2, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.token_balance));
            }
        }

        public Surrogate(CryptoAssetContextDto cryptoAssetContextDto, double d, double d2) {
            this.asset = cryptoAssetContextDto;
            this.balance = d;
            this.token_balance = d2;
        }

        public /* synthetic */ Surrogate(CryptoAssetContextDto cryptoAssetContextDto, double d, double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : cryptoAssetContextDto, (i & 2) != 0 ? 0.0d : d, (i & 4) != 0 ? 0.0d : d2);
        }

        public final CryptoAssetContextDto getAsset() {
            return this.asset;
        }

        public final double getBalance() {
            return this.balance;
        }

        public final double getToken_balance() {
            return this.token_balance;
        }
    }

    /* compiled from: CryptoWalletAssetBalanceDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoWalletAssetBalanceDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CryptoWalletAssetBalanceDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoWalletAssetBalance;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CryptoWalletAssetBalanceDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<CryptoWalletAssetBalanceDto, CryptoWalletAssetBalance> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CryptoWalletAssetBalanceDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CryptoWalletAssetBalanceDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CryptoWalletAssetBalanceDto> getBinaryBase64Serializer() {
            return (KSerializer) CryptoWalletAssetBalanceDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CryptoWalletAssetBalance> getProtoAdapter() {
            return CryptoWalletAssetBalance.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CryptoWalletAssetBalanceDto getZeroValue() {
            return CryptoWalletAssetBalanceDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CryptoWalletAssetBalanceDto fromProto(CryptoWalletAssetBalance proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            CryptoAssetContext asset = proto.getAsset();
            return new CryptoWalletAssetBalanceDto(new Surrogate(asset != null ? CryptoAssetContextDto.INSTANCE.fromProto(asset) : null, proto.getBalance(), proto.getToken_balance()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CryptoWalletAssetBalanceDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CryptoWalletAssetBalanceDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CryptoWalletAssetBalanceDto(null, 0.0d, 0.0d, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CryptoWalletAssetBalanceDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoWalletAssetBalanceDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CryptoWalletAssetBalanceDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/CryptoWalletAssetBalanceDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<CryptoWalletAssetBalanceDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.CryptoWalletAssetBalance", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CryptoWalletAssetBalanceDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CryptoWalletAssetBalanceDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CryptoWalletAssetBalanceDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CryptoWalletAssetBalanceDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoWalletAssetBalanceDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.CryptoWalletAssetBalanceDto";
        }
    }
}
