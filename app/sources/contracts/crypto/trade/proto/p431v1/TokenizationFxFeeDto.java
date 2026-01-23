package contracts.crypto.trade.proto.p431v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.squareup.wire.ProtoAdapter;
import contracts.crypto.trade.proto.p431v1.TokenizationFxFee;
import contracts.crypto.trade.proto.p431v1.TokenizationFxFeeDto;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import rosetta.nummus.order.Side;
import rosetta.nummus.order.SideDto;

/* compiled from: TokenizationFxFeeDto.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005(')*+B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BE\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0006\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001cH\u0016¢\u0006\u0004\b%\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&¨\u0006,"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/TokenizationFxFeeDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/TokenizationFxFee;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/TokenizationFxFeeDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/TokenizationFxFeeDto$Surrogate;)V", "Lcom/robinhood/idl/IdlDecimal;", "exchange_rate", "exchange_fee_percentage", "", "primary_currency_code", "secondary_currency_code", "Lcontracts/crypto/trade/proto/v1/TokenizationFxFeeDto$TouchPointDto;", "touchpoint", "Lrosetta/nummus/order/SideDto;", "order_side", "(Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;Lcontracts/crypto/trade/proto/v1/TokenizationFxFeeDto$TouchPointDto;Lrosetta/nummus/order/SideDto;)V", "toProto", "()Lcontracts/crypto/trade/proto/v1/TokenizationFxFee;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/TokenizationFxFeeDto$Surrogate;", "Companion", "Surrogate", "TouchPointDto", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes18.dex */
public final class TokenizationFxFeeDto implements Dto3<TokenizationFxFee>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<TokenizationFxFeeDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TokenizationFxFeeDto, TokenizationFxFee>> binaryBase64Serializer$delegate;
    private static final TokenizationFxFeeDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ TokenizationFxFeeDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TokenizationFxFeeDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ TokenizationFxFeeDto(IdlDecimal idlDecimal, IdlDecimal idlDecimal2, String str, String str2, TouchPointDto touchPointDto, SideDto sideDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal, (i & 2) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? TouchPointDto.INSTANCE.getZeroValue() : touchPointDto, (i & 32) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TokenizationFxFeeDto(IdlDecimal exchange_rate, IdlDecimal exchange_fee_percentage, String primary_currency_code, String secondary_currency_code, TouchPointDto touchpoint, SideDto order_side) {
        this(new Surrogate(exchange_rate, exchange_fee_percentage, primary_currency_code, secondary_currency_code, touchpoint, order_side));
        Intrinsics.checkNotNullParameter(exchange_rate, "exchange_rate");
        Intrinsics.checkNotNullParameter(exchange_fee_percentage, "exchange_fee_percentage");
        Intrinsics.checkNotNullParameter(primary_currency_code, "primary_currency_code");
        Intrinsics.checkNotNullParameter(secondary_currency_code, "secondary_currency_code");
        Intrinsics.checkNotNullParameter(touchpoint, "touchpoint");
        Intrinsics.checkNotNullParameter(order_side, "order_side");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public TokenizationFxFee toProto() {
        return new TokenizationFxFee(this.surrogate.getExchange_rate().getStringValue(), this.surrogate.getExchange_fee_percentage().getStringValue(), this.surrogate.getPrimary_currency_code(), this.surrogate.getSecondary_currency_code(), (TokenizationFxFee.TouchPoint) this.surrogate.getTouchpoint().toProto(), (Side) this.surrogate.getOrder_side().toProto(), null, 64, null);
    }

    public String toString() {
        return "[TokenizationFxFeeDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof TokenizationFxFeeDto) && Intrinsics.areEqual(((TokenizationFxFeeDto) other).surrogate, this.surrogate);
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
    /* compiled from: TokenizationFxFeeDto.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0083\b\u0018\u0000 ;2\u00020\u0001:\u0002<;Ba\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010BW\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010'\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)R/\u0010\u0007\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010'\u0012\u0004\b-\u0010+\u001a\u0004\b,\u0010)R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010.\u0012\u0004\b0\u0010+\u001a\u0004\b/\u0010 R \u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010.\u0012\u0004\b2\u0010+\u001a\u0004\b1\u0010 R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00103\u0012\u0004\b6\u0010+\u001a\u0004\b4\u00105R \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00107\u0012\u0004\b:\u0010+\u001a\u0004\b8\u00109¨\u0006="}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/TokenizationFxFeeDto$Surrogate;", "", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "exchange_rate", "exchange_fee_percentage", "", "primary_currency_code", "secondary_currency_code", "Lcontracts/crypto/trade/proto/v1/TokenizationFxFeeDto$TouchPointDto;", "touchpoint", "Lrosetta/nummus/order/SideDto;", "order_side", "<init>", "(Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;Lcontracts/crypto/trade/proto/v1/TokenizationFxFeeDto$TouchPointDto;Lrosetta/nummus/order/SideDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;Lcontracts/crypto/trade/proto/v1/TokenizationFxFeeDto$TouchPointDto;Lrosetta/nummus/order/SideDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_crypto_trade_proto_v1_externalRelease", "(Lcontracts/crypto/trade/proto/v1/TokenizationFxFeeDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/idl/IdlDecimal;", "getExchange_rate", "()Lcom/robinhood/idl/IdlDecimal;", "getExchange_rate$annotations", "()V", "getExchange_fee_percentage", "getExchange_fee_percentage$annotations", "Ljava/lang/String;", "getPrimary_currency_code", "getPrimary_currency_code$annotations", "getSecondary_currency_code", "getSecondary_currency_code$annotations", "Lcontracts/crypto/trade/proto/v1/TokenizationFxFeeDto$TouchPointDto;", "getTouchpoint", "()Lcontracts/crypto/trade/proto/v1/TokenizationFxFeeDto$TouchPointDto;", "getTouchpoint$annotations", "Lrosetta/nummus/order/SideDto;", "getOrder_side", "()Lrosetta/nummus/order/SideDto;", "getOrder_side$annotations", "Companion", "$serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final IdlDecimal exchange_fee_percentage;
        private final IdlDecimal exchange_rate;
        private final SideDto order_side;
        private final String primary_currency_code;
        private final String secondary_currency_code;
        private final TouchPointDto touchpoint;

        public Surrogate() {
            this((IdlDecimal) null, (IdlDecimal) null, (String) null, (String) null, (TouchPointDto) null, (SideDto) null, 63, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.exchange_rate, surrogate.exchange_rate) && Intrinsics.areEqual(this.exchange_fee_percentage, surrogate.exchange_fee_percentage) && Intrinsics.areEqual(this.primary_currency_code, surrogate.primary_currency_code) && Intrinsics.areEqual(this.secondary_currency_code, surrogate.secondary_currency_code) && this.touchpoint == surrogate.touchpoint && this.order_side == surrogate.order_side;
        }

        public int hashCode() {
            return (((((((((this.exchange_rate.hashCode() * 31) + this.exchange_fee_percentage.hashCode()) * 31) + this.primary_currency_code.hashCode()) * 31) + this.secondary_currency_code.hashCode()) * 31) + this.touchpoint.hashCode()) * 31) + this.order_side.hashCode();
        }

        public String toString() {
            return "Surrogate(exchange_rate=" + this.exchange_rate + ", exchange_fee_percentage=" + this.exchange_fee_percentage + ", primary_currency_code=" + this.primary_currency_code + ", secondary_currency_code=" + this.secondary_currency_code + ", touchpoint=" + this.touchpoint + ", order_side=" + this.order_side + ")";
        }

        /* compiled from: TokenizationFxFeeDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/TokenizationFxFeeDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/TokenizationFxFeeDto$Surrogate;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return TokenizationFxFeeDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, String str, String str2, TouchPointDto touchPointDto, SideDto sideDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.exchange_rate = (i & 1) == 0 ? new IdlDecimal("") : idlDecimal;
            if ((i & 2) == 0) {
                this.exchange_fee_percentage = new IdlDecimal("");
            } else {
                this.exchange_fee_percentage = idlDecimal2;
            }
            if ((i & 4) == 0) {
                this.primary_currency_code = "";
            } else {
                this.primary_currency_code = str;
            }
            if ((i & 8) == 0) {
                this.secondary_currency_code = "";
            } else {
                this.secondary_currency_code = str2;
            }
            if ((i & 16) == 0) {
                this.touchpoint = TouchPointDto.INSTANCE.getZeroValue();
            } else {
                this.touchpoint = touchPointDto;
            }
            if ((i & 32) == 0) {
                this.order_side = SideDto.INSTANCE.getZeroValue();
            } else {
                this.order_side = sideDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$contracts_crypto_trade_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.exchange_rate, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 0, IdlDecimalSerializer.INSTANCE, self.exchange_rate);
            }
            if (!Intrinsics.areEqual(self.exchange_fee_percentage, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 1, IdlDecimalSerializer.INSTANCE, self.exchange_fee_percentage);
            }
            if (!Intrinsics.areEqual(self.primary_currency_code, "")) {
                output.encodeStringElement(serialDesc, 2, self.primary_currency_code);
            }
            if (!Intrinsics.areEqual(self.secondary_currency_code, "")) {
                output.encodeStringElement(serialDesc, 3, self.secondary_currency_code);
            }
            if (self.touchpoint != TouchPointDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, TouchPointDto.Serializer.INSTANCE, self.touchpoint);
            }
            if (self.order_side != SideDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, SideDto.Serializer.INSTANCE, self.order_side);
            }
        }

        public Surrogate(IdlDecimal exchange_rate, IdlDecimal exchange_fee_percentage, String primary_currency_code, String secondary_currency_code, TouchPointDto touchpoint, SideDto order_side) {
            Intrinsics.checkNotNullParameter(exchange_rate, "exchange_rate");
            Intrinsics.checkNotNullParameter(exchange_fee_percentage, "exchange_fee_percentage");
            Intrinsics.checkNotNullParameter(primary_currency_code, "primary_currency_code");
            Intrinsics.checkNotNullParameter(secondary_currency_code, "secondary_currency_code");
            Intrinsics.checkNotNullParameter(touchpoint, "touchpoint");
            Intrinsics.checkNotNullParameter(order_side, "order_side");
            this.exchange_rate = exchange_rate;
            this.exchange_fee_percentage = exchange_fee_percentage;
            this.primary_currency_code = primary_currency_code;
            this.secondary_currency_code = secondary_currency_code;
            this.touchpoint = touchpoint;
            this.order_side = order_side;
        }

        public /* synthetic */ Surrogate(IdlDecimal idlDecimal, IdlDecimal idlDecimal2, String str, String str2, TouchPointDto touchPointDto, SideDto sideDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal, (i & 2) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? TouchPointDto.INSTANCE.getZeroValue() : touchPointDto, (i & 32) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto);
        }

        public final IdlDecimal getExchange_rate() {
            return this.exchange_rate;
        }

        public final IdlDecimal getExchange_fee_percentage() {
            return this.exchange_fee_percentage;
        }

        public final String getPrimary_currency_code() {
            return this.primary_currency_code;
        }

        public final String getSecondary_currency_code() {
            return this.secondary_currency_code;
        }

        public final TouchPointDto getTouchpoint() {
            return this.touchpoint;
        }

        public final SideDto getOrder_side() {
            return this.order_side;
        }
    }

    /* compiled from: TokenizationFxFeeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/TokenizationFxFeeDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/TokenizationFxFeeDto;", "Lcontracts/crypto/trade/proto/v1/TokenizationFxFee;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/TokenizationFxFeeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<TokenizationFxFeeDto, TokenizationFxFee> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TokenizationFxFeeDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TokenizationFxFeeDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TokenizationFxFeeDto> getBinaryBase64Serializer() {
            return (KSerializer) TokenizationFxFeeDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TokenizationFxFee> getProtoAdapter() {
            return TokenizationFxFee.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TokenizationFxFeeDto getZeroValue() {
            return TokenizationFxFeeDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TokenizationFxFeeDto fromProto(TokenizationFxFee proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new TokenizationFxFeeDto(new Surrogate(new IdlDecimal(proto.getExchange_rate()), new IdlDecimal(proto.getExchange_fee_percentage()), proto.getPrimary_currency_code(), proto.getSecondary_currency_code(), TouchPointDto.INSTANCE.fromProto(proto.getTouchpoint()), SideDto.INSTANCE.fromProto(proto.getOrder_side())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.TokenizationFxFeeDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TokenizationFxFeeDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new TokenizationFxFeeDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TokenizationFxFeeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/TokenizationFxFeeDto$TouchPointDto;", "Lcom/robinhood/idl/EnumDto;", "Lcontracts/crypto/trade/proto/v1/TokenizationFxFee$TouchPoint;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "TOUCHPOINT_UNSPECIFIED", "PRETRADE", "CONFIRMATION", "ORDER_HISTORY_DETAILS", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class TouchPointDto implements Dto2<TokenizationFxFee.TouchPoint>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TouchPointDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<TouchPointDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<TouchPointDto, TokenizationFxFee.TouchPoint>> binaryBase64Serializer$delegate;
        public static final TouchPointDto TOUCHPOINT_UNSPECIFIED = new TOUCHPOINT_UNSPECIFIED("TOUCHPOINT_UNSPECIFIED", 0);
        public static final TouchPointDto PRETRADE = new PRETRADE("PRETRADE", 1);
        public static final TouchPointDto CONFIRMATION = new CONFIRMATION("CONFIRMATION", 2);
        public static final TouchPointDto ORDER_HISTORY_DETAILS = new ORDER_HISTORY_DETAILS("ORDER_HISTORY_DETAILS", 3);

        private static final /* synthetic */ TouchPointDto[] $values() {
            return new TouchPointDto[]{TOUCHPOINT_UNSPECIFIED, PRETRADE, CONFIRMATION, ORDER_HISTORY_DETAILS};
        }

        public /* synthetic */ TouchPointDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<TouchPointDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: TokenizationFxFeeDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"contracts/crypto/trade/proto/v1/TokenizationFxFeeDto.TouchPointDto.TOUCHPOINT_UNSPECIFIED", "Lcontracts/crypto/trade/proto/v1/TokenizationFxFeeDto$TouchPointDto;", "toProto", "Lcontracts/crypto/trade/proto/v1/TokenizationFxFee$TouchPoint;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TOUCHPOINT_UNSPECIFIED extends TouchPointDto {
            TOUCHPOINT_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TokenizationFxFee.TouchPoint toProto() {
                return TokenizationFxFee.TouchPoint.TOUCHPOINT_UNSPECIFIED;
            }
        }

        private TouchPointDto(String str, int i) {
        }

        static {
            TouchPointDto[] touchPointDtoArr$values = $values();
            $VALUES = touchPointDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(touchPointDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.TokenizationFxFeeDto$TouchPointDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TokenizationFxFeeDto.TouchPointDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: TokenizationFxFeeDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"contracts/crypto/trade/proto/v1/TokenizationFxFeeDto.TouchPointDto.PRETRADE", "Lcontracts/crypto/trade/proto/v1/TokenizationFxFeeDto$TouchPointDto;", "toProto", "Lcontracts/crypto/trade/proto/v1/TokenizationFxFee$TouchPoint;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PRETRADE extends TouchPointDto {
            PRETRADE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TokenizationFxFee.TouchPoint toProto() {
                return TokenizationFxFee.TouchPoint.PRETRADE;
            }
        }

        /* compiled from: TokenizationFxFeeDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"contracts/crypto/trade/proto/v1/TokenizationFxFeeDto.TouchPointDto.CONFIRMATION", "Lcontracts/crypto/trade/proto/v1/TokenizationFxFeeDto$TouchPointDto;", "toProto", "Lcontracts/crypto/trade/proto/v1/TokenizationFxFee$TouchPoint;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CONFIRMATION extends TouchPointDto {
            CONFIRMATION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TokenizationFxFee.TouchPoint toProto() {
                return TokenizationFxFee.TouchPoint.CONFIRMATION;
            }
        }

        /* compiled from: TokenizationFxFeeDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"contracts/crypto/trade/proto/v1/TokenizationFxFeeDto.TouchPointDto.ORDER_HISTORY_DETAILS", "Lcontracts/crypto/trade/proto/v1/TokenizationFxFeeDto$TouchPointDto;", "toProto", "Lcontracts/crypto/trade/proto/v1/TokenizationFxFee$TouchPoint;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ORDER_HISTORY_DETAILS extends TouchPointDto {
            ORDER_HISTORY_DETAILS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TokenizationFxFee.TouchPoint toProto() {
                return TokenizationFxFee.TouchPoint.ORDER_HISTORY_DETAILS;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: TokenizationFxFeeDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/TokenizationFxFeeDto$TouchPointDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcontracts/crypto/trade/proto/v1/TokenizationFxFeeDto$TouchPointDto;", "Lcontracts/crypto/trade/proto/v1/TokenizationFxFee$TouchPoint;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/TokenizationFxFeeDto$TouchPointDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<TouchPointDto, TokenizationFxFee.TouchPoint> {

            /* compiled from: TokenizationFxFeeDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[TokenizationFxFee.TouchPoint.values().length];
                    try {
                        iArr[TokenizationFxFee.TouchPoint.TOUCHPOINT_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[TokenizationFxFee.TouchPoint.PRETRADE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[TokenizationFxFee.TouchPoint.CONFIRMATION.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[TokenizationFxFee.TouchPoint.ORDER_HISTORY_DETAILS.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<TouchPointDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TouchPointDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TouchPointDto> getBinaryBase64Serializer() {
                return (KSerializer) TouchPointDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<TokenizationFxFee.TouchPoint> getProtoAdapter() {
                return TokenizationFxFee.TouchPoint.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TouchPointDto getZeroValue() {
                return TouchPointDto.TOUCHPOINT_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TouchPointDto fromProto(TokenizationFxFee.TouchPoint proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return TouchPointDto.TOUCHPOINT_UNSPECIFIED;
                }
                if (i == 2) {
                    return TouchPointDto.PRETRADE;
                }
                if (i == 3) {
                    return TouchPointDto.CONFIRMATION;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return TouchPointDto.ORDER_HISTORY_DETAILS;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: TokenizationFxFeeDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/TokenizationFxFeeDto$TouchPointDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/TokenizationFxFeeDto$TouchPointDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<TouchPointDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<TouchPointDto, TokenizationFxFee.TouchPoint> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/contracts.crypto.trade.proto.v1.TokenizationFxFee.TouchPoint", TouchPointDto.getEntries(), TouchPointDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public TouchPointDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (TouchPointDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, TouchPointDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static TouchPointDto valueOf(String str) {
            return (TouchPointDto) Enum.valueOf(TouchPointDto.class, str);
        }

        public static TouchPointDto[] values() {
            return (TouchPointDto[]) $VALUES.clone();
        }
    }

    /* compiled from: TokenizationFxFeeDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/TokenizationFxFeeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/TokenizationFxFeeDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/TokenizationFxFeeDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<TokenizationFxFeeDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.TokenizationFxFee", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TokenizationFxFeeDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public TokenizationFxFeeDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new TokenizationFxFeeDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: TokenizationFxFeeDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/TokenizationFxFeeDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "contracts.crypto.trade.proto.v1.TokenizationFxFeeDto";
        }
    }
}
