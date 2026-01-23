package contracts.crypto.trade.proto.p431v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
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

/* compiled from: TokenizationEstimatedPriceDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004'&()B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BE\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0006\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001bH\u0016¢\u0006\u0004\b$\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%¨\u0006*"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedPriceDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedPrice;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedPriceDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedPriceDto$Surrogate;)V", "", "primary_currency_code", "secondary_currency_code", "primary_price_formatted", "secondary_price_formatted", "Lcom/robinhood/idl/IdlDecimal;", "exchange_rate", "Lrosetta/nummus/order/SideDto;", "order_side", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lrosetta/nummus/order/SideDto;)V", "toProto", "()Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedPrice;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedPriceDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes18.dex */
public final class TokenizationEstimatedPriceDto implements Dto3<TokenizationEstimatedPrice>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<TokenizationEstimatedPriceDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TokenizationEstimatedPriceDto, TokenizationEstimatedPrice>> binaryBase64Serializer$delegate;
    private static final TokenizationEstimatedPriceDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ TokenizationEstimatedPriceDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TokenizationEstimatedPriceDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ TokenizationEstimatedPriceDto(String str, String str2, String str3, String str4, IdlDecimal idlDecimal, SideDto sideDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? new IdlDecimal("") : idlDecimal, (i & 32) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TokenizationEstimatedPriceDto(String primary_currency_code, String secondary_currency_code, String primary_price_formatted, String secondary_price_formatted, IdlDecimal exchange_rate, SideDto order_side) {
        this(new Surrogate(primary_currency_code, secondary_currency_code, primary_price_formatted, secondary_price_formatted, exchange_rate, order_side));
        Intrinsics.checkNotNullParameter(primary_currency_code, "primary_currency_code");
        Intrinsics.checkNotNullParameter(secondary_currency_code, "secondary_currency_code");
        Intrinsics.checkNotNullParameter(primary_price_formatted, "primary_price_formatted");
        Intrinsics.checkNotNullParameter(secondary_price_formatted, "secondary_price_formatted");
        Intrinsics.checkNotNullParameter(exchange_rate, "exchange_rate");
        Intrinsics.checkNotNullParameter(order_side, "order_side");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public TokenizationEstimatedPrice toProto() {
        return new TokenizationEstimatedPrice(this.surrogate.getPrimary_currency_code(), this.surrogate.getSecondary_currency_code(), this.surrogate.getPrimary_price_formatted(), this.surrogate.getSecondary_price_formatted(), this.surrogate.getExchange_rate().getStringValue(), (Side) this.surrogate.getOrder_side().toProto(), null, 64, null);
    }

    public String toString() {
        return "[TokenizationEstimatedPriceDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof TokenizationEstimatedPriceDto) && Intrinsics.areEqual(((TokenizationEstimatedPriceDto) other).surrogate, this.surrogate);
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
    /* compiled from: TokenizationEstimatedPriceDto.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0083\b\u0018\u0000 82\u00020\u0001:\u000298BR\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0017\b\u0002\u0010\u000b\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fBW\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u001fR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010&\u0012\u0004\b+\u0010)\u001a\u0004\b*\u0010\u001fR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b-\u0010)\u001a\u0004\b,\u0010\u001fR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010&\u0012\u0004\b/\u0010)\u001a\u0004\b.\u0010\u001fR/\u0010\u000b\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00100\u0012\u0004\b3\u0010)\u001a\u0004\b1\u00102R \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00104\u0012\u0004\b7\u0010)\u001a\u0004\b5\u00106¨\u0006:"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedPriceDto$Surrogate;", "", "", "primary_currency_code", "secondary_currency_code", "primary_price_formatted", "secondary_price_formatted", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "exchange_rate", "Lrosetta/nummus/order/SideDto;", "order_side", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lrosetta/nummus/order/SideDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lrosetta/nummus/order/SideDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_crypto_trade_proto_v1_externalRelease", "(Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedPriceDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPrimary_currency_code", "getPrimary_currency_code$annotations", "()V", "getSecondary_currency_code", "getSecondary_currency_code$annotations", "getPrimary_price_formatted", "getPrimary_price_formatted$annotations", "getSecondary_price_formatted", "getSecondary_price_formatted$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getExchange_rate", "()Lcom/robinhood/idl/IdlDecimal;", "getExchange_rate$annotations", "Lrosetta/nummus/order/SideDto;", "getOrder_side", "()Lrosetta/nummus/order/SideDto;", "getOrder_side$annotations", "Companion", "$serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final IdlDecimal exchange_rate;
        private final SideDto order_side;
        private final String primary_currency_code;
        private final String primary_price_formatted;
        private final String secondary_currency_code;
        private final String secondary_price_formatted;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (IdlDecimal) null, (SideDto) null, 63, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.primary_currency_code, surrogate.primary_currency_code) && Intrinsics.areEqual(this.secondary_currency_code, surrogate.secondary_currency_code) && Intrinsics.areEqual(this.primary_price_formatted, surrogate.primary_price_formatted) && Intrinsics.areEqual(this.secondary_price_formatted, surrogate.secondary_price_formatted) && Intrinsics.areEqual(this.exchange_rate, surrogate.exchange_rate) && this.order_side == surrogate.order_side;
        }

        public int hashCode() {
            return (((((((((this.primary_currency_code.hashCode() * 31) + this.secondary_currency_code.hashCode()) * 31) + this.primary_price_formatted.hashCode()) * 31) + this.secondary_price_formatted.hashCode()) * 31) + this.exchange_rate.hashCode()) * 31) + this.order_side.hashCode();
        }

        public String toString() {
            return "Surrogate(primary_currency_code=" + this.primary_currency_code + ", secondary_currency_code=" + this.secondary_currency_code + ", primary_price_formatted=" + this.primary_price_formatted + ", secondary_price_formatted=" + this.secondary_price_formatted + ", exchange_rate=" + this.exchange_rate + ", order_side=" + this.order_side + ")";
        }

        /* compiled from: TokenizationEstimatedPriceDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedPriceDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedPriceDto$Surrogate;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return TokenizationEstimatedPriceDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, IdlDecimal idlDecimal, SideDto sideDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.primary_currency_code = "";
            } else {
                this.primary_currency_code = str;
            }
            if ((i & 2) == 0) {
                this.secondary_currency_code = "";
            } else {
                this.secondary_currency_code = str2;
            }
            if ((i & 4) == 0) {
                this.primary_price_formatted = "";
            } else {
                this.primary_price_formatted = str3;
            }
            if ((i & 8) == 0) {
                this.secondary_price_formatted = "";
            } else {
                this.secondary_price_formatted = str4;
            }
            if ((i & 16) == 0) {
                this.exchange_rate = new IdlDecimal("");
            } else {
                this.exchange_rate = idlDecimal;
            }
            if ((i & 32) == 0) {
                this.order_side = SideDto.INSTANCE.getZeroValue();
            } else {
                this.order_side = sideDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$contracts_crypto_trade_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.primary_currency_code, "")) {
                output.encodeStringElement(serialDesc, 0, self.primary_currency_code);
            }
            if (!Intrinsics.areEqual(self.secondary_currency_code, "")) {
                output.encodeStringElement(serialDesc, 1, self.secondary_currency_code);
            }
            if (!Intrinsics.areEqual(self.primary_price_formatted, "")) {
                output.encodeStringElement(serialDesc, 2, self.primary_price_formatted);
            }
            if (!Intrinsics.areEqual(self.secondary_price_formatted, "")) {
                output.encodeStringElement(serialDesc, 3, self.secondary_price_formatted);
            }
            if (!Intrinsics.areEqual(self.exchange_rate, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 4, IdlDecimalSerializer.INSTANCE, self.exchange_rate);
            }
            if (self.order_side != SideDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, SideDto.Serializer.INSTANCE, self.order_side);
            }
        }

        public Surrogate(String primary_currency_code, String secondary_currency_code, String primary_price_formatted, String secondary_price_formatted, IdlDecimal exchange_rate, SideDto order_side) {
            Intrinsics.checkNotNullParameter(primary_currency_code, "primary_currency_code");
            Intrinsics.checkNotNullParameter(secondary_currency_code, "secondary_currency_code");
            Intrinsics.checkNotNullParameter(primary_price_formatted, "primary_price_formatted");
            Intrinsics.checkNotNullParameter(secondary_price_formatted, "secondary_price_formatted");
            Intrinsics.checkNotNullParameter(exchange_rate, "exchange_rate");
            Intrinsics.checkNotNullParameter(order_side, "order_side");
            this.primary_currency_code = primary_currency_code;
            this.secondary_currency_code = secondary_currency_code;
            this.primary_price_formatted = primary_price_formatted;
            this.secondary_price_formatted = secondary_price_formatted;
            this.exchange_rate = exchange_rate;
            this.order_side = order_side;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, IdlDecimal idlDecimal, SideDto sideDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? new IdlDecimal("") : idlDecimal, (i & 32) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto);
        }

        public final String getPrimary_currency_code() {
            return this.primary_currency_code;
        }

        public final String getSecondary_currency_code() {
            return this.secondary_currency_code;
        }

        public final String getPrimary_price_formatted() {
            return this.primary_price_formatted;
        }

        public final String getSecondary_price_formatted() {
            return this.secondary_price_formatted;
        }

        public final IdlDecimal getExchange_rate() {
            return this.exchange_rate;
        }

        public final SideDto getOrder_side() {
            return this.order_side;
        }
    }

    /* compiled from: TokenizationEstimatedPriceDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedPriceDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedPriceDto;", "Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedPrice;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedPriceDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<TokenizationEstimatedPriceDto, TokenizationEstimatedPrice> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TokenizationEstimatedPriceDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TokenizationEstimatedPriceDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TokenizationEstimatedPriceDto> getBinaryBase64Serializer() {
            return (KSerializer) TokenizationEstimatedPriceDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TokenizationEstimatedPrice> getProtoAdapter() {
            return TokenizationEstimatedPrice.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TokenizationEstimatedPriceDto getZeroValue() {
            return TokenizationEstimatedPriceDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TokenizationEstimatedPriceDto fromProto(TokenizationEstimatedPrice proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new TokenizationEstimatedPriceDto(new Surrogate(proto.getPrimary_currency_code(), proto.getSecondary_currency_code(), proto.getPrimary_price_formatted(), proto.getSecondary_price_formatted(), new IdlDecimal(proto.getExchange_rate()), SideDto.INSTANCE.fromProto(proto.getOrder_side())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.TokenizationEstimatedPriceDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TokenizationEstimatedPriceDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new TokenizationEstimatedPriceDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: TokenizationEstimatedPriceDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedPriceDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedPriceDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedPriceDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<TokenizationEstimatedPriceDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.TokenizationEstimatedPrice", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TokenizationEstimatedPriceDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public TokenizationEstimatedPriceDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new TokenizationEstimatedPriceDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: TokenizationEstimatedPriceDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/TokenizationEstimatedPriceDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "contracts.crypto.trade.proto.v1.TokenizationEstimatedPriceDto";
        }
    }
}
