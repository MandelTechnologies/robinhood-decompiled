package microgram.contracts.mcw_currency_conversion.proto.p498v1;

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
import com.robinhood.rosetta.common.Currency;
import com.robinhood.rosetta.common.CurrencyDto;
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

/* compiled from: ConvertCurrencyRequestDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004'&()B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BE\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0006\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001bH\u0016¢\u0006\u0004\b$\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%¨\u0006*"}, m3636d2 = {"Lmicrogram/contracts/mcw_currency_conversion/proto/v1/ConvertCurrencyRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/contracts/mcw_currency_conversion/proto/v1/ConvertCurrencyRequest;", "Landroid/os/Parcelable;", "Lmicrogram/contracts/mcw_currency_conversion/proto/v1/ConvertCurrencyRequestDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/contracts/mcw_currency_conversion/proto/v1/ConvertCurrencyRequestDto$Surrogate;)V", "", "ref_id", "account_number", "symbol_id", "Lcom/robinhood/idl/IdlDecimal;", "amount_to_convert", "Lcom/robinhood/rosetta/common/CurrencyDto;", "from_currency", "to_currency", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/CurrencyDto;Lcom/robinhood/rosetta/common/CurrencyDto;)V", "toProto", "()Lmicrogram/contracts/mcw_currency_conversion/proto/v1/ConvertCurrencyRequest;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/contracts/mcw_currency_conversion/proto/v1/ConvertCurrencyRequestDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "microgram.contracts.mcw_currency_conversion.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes14.dex */
public final class ConvertCurrencyRequestDto implements Dto3<ConvertCurrencyRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ConvertCurrencyRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ConvertCurrencyRequestDto, ConvertCurrencyRequest>> binaryBase64Serializer$delegate;
    private static final ConvertCurrencyRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ConvertCurrencyRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ConvertCurrencyRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ ConvertCurrencyRequestDto(String str, String str2, String str3, IdlDecimal idlDecimal, CurrencyDto currencyDto, CurrencyDto currencyDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? new IdlDecimal("") : idlDecimal, (i & 16) != 0 ? CurrencyDto.INSTANCE.getZeroValue() : currencyDto, (i & 32) != 0 ? CurrencyDto.INSTANCE.getZeroValue() : currencyDto2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConvertCurrencyRequestDto(String ref_id, String account_number, String symbol_id, IdlDecimal amount_to_convert, CurrencyDto from_currency, CurrencyDto to_currency) {
        this(new Surrogate(ref_id, account_number, symbol_id, amount_to_convert, from_currency, to_currency));
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(symbol_id, "symbol_id");
        Intrinsics.checkNotNullParameter(amount_to_convert, "amount_to_convert");
        Intrinsics.checkNotNullParameter(from_currency, "from_currency");
        Intrinsics.checkNotNullParameter(to_currency, "to_currency");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ConvertCurrencyRequest toProto() {
        return new ConvertCurrencyRequest(this.surrogate.getRef_id(), this.surrogate.getAccount_number(), this.surrogate.getSymbol_id(), this.surrogate.getAmount_to_convert().getStringValue(), (Currency) this.surrogate.getFrom_currency().toProto(), (Currency) this.surrogate.getTo_currency().toProto(), null, 64, null);
    }

    public String toString() {
        return "[ConvertCurrencyRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ConvertCurrencyRequestDto) && Intrinsics.areEqual(((ConvertCurrencyRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: ConvertCurrencyRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0083\b\u0018\u0000 82\u00020\u0001:\u000298BR\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0017\b\u0002\u0010\n\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fBW\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u001fR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010&\u0012\u0004\b+\u0010)\u001a\u0004\b*\u0010\u001fR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b-\u0010)\u001a\u0004\b,\u0010\u001fR/\u0010\n\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010.\u0012\u0004\b1\u0010)\u001a\u0004\b/\u00100R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00102\u0012\u0004\b5\u0010)\u001a\u0004\b3\u00104R \u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00102\u0012\u0004\b7\u0010)\u001a\u0004\b6\u00104¨\u0006:"}, m3636d2 = {"Lmicrogram/contracts/mcw_currency_conversion/proto/v1/ConvertCurrencyRequestDto$Surrogate;", "", "", "ref_id", "account_number", "symbol_id", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "amount_to_convert", "Lcom/robinhood/rosetta/common/CurrencyDto;", "from_currency", "to_currency", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/CurrencyDto;Lcom/robinhood/rosetta/common/CurrencyDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/CurrencyDto;Lcom/robinhood/rosetta/common/CurrencyDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_contracts_mcw_currency_conversion_proto_v1_externalRelease", "(Lmicrogram/contracts/mcw_currency_conversion/proto/v1/ConvertCurrencyRequestDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRef_id", "getRef_id$annotations", "()V", "getAccount_number", "getAccount_number$annotations", "getSymbol_id", "getSymbol_id$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getAmount_to_convert", "()Lcom/robinhood/idl/IdlDecimal;", "getAmount_to_convert$annotations", "Lcom/robinhood/rosetta/common/CurrencyDto;", "getFrom_currency", "()Lcom/robinhood/rosetta/common/CurrencyDto;", "getFrom_currency$annotations", "getTo_currency", "getTo_currency$annotations", "Companion", "$serializer", "microgram.contracts.mcw_currency_conversion.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_number;
        private final IdlDecimal amount_to_convert;
        private final CurrencyDto from_currency;
        private final String ref_id;
        private final String symbol_id;
        private final CurrencyDto to_currency;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (IdlDecimal) null, (CurrencyDto) null, (CurrencyDto) null, 63, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.ref_id, surrogate.ref_id) && Intrinsics.areEqual(this.account_number, surrogate.account_number) && Intrinsics.areEqual(this.symbol_id, surrogate.symbol_id) && Intrinsics.areEqual(this.amount_to_convert, surrogate.amount_to_convert) && this.from_currency == surrogate.from_currency && this.to_currency == surrogate.to_currency;
        }

        public int hashCode() {
            return (((((((((this.ref_id.hashCode() * 31) + this.account_number.hashCode()) * 31) + this.symbol_id.hashCode()) * 31) + this.amount_to_convert.hashCode()) * 31) + this.from_currency.hashCode()) * 31) + this.to_currency.hashCode();
        }

        public String toString() {
            return "Surrogate(ref_id=" + this.ref_id + ", account_number=" + this.account_number + ", symbol_id=" + this.symbol_id + ", amount_to_convert=" + this.amount_to_convert + ", from_currency=" + this.from_currency + ", to_currency=" + this.to_currency + ")";
        }

        /* compiled from: ConvertCurrencyRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/mcw_currency_conversion/proto/v1/ConvertCurrencyRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/mcw_currency_conversion/proto/v1/ConvertCurrencyRequestDto$Surrogate;", "microgram.contracts.mcw_currency_conversion.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ConvertCurrencyRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, IdlDecimal idlDecimal, CurrencyDto currencyDto, CurrencyDto currencyDto2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.ref_id = "";
            } else {
                this.ref_id = str;
            }
            if ((i & 2) == 0) {
                this.account_number = "";
            } else {
                this.account_number = str2;
            }
            if ((i & 4) == 0) {
                this.symbol_id = "";
            } else {
                this.symbol_id = str3;
            }
            if ((i & 8) == 0) {
                this.amount_to_convert = new IdlDecimal("");
            } else {
                this.amount_to_convert = idlDecimal;
            }
            if ((i & 16) == 0) {
                this.from_currency = CurrencyDto.INSTANCE.getZeroValue();
            } else {
                this.from_currency = currencyDto;
            }
            if ((i & 32) == 0) {
                this.to_currency = CurrencyDto.INSTANCE.getZeroValue();
            } else {
                this.to_currency = currencyDto2;
            }
        }

        @JvmStatic
        /* renamed from: write$Self$microgram_contracts_mcw_currency_conversion_proto_v1_externalRelease */
        public static final /* synthetic */ void m3779x2cc4d99d(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.ref_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.ref_id);
            }
            if (!Intrinsics.areEqual(self.account_number, "")) {
                output.encodeStringElement(serialDesc, 1, self.account_number);
            }
            if (!Intrinsics.areEqual(self.symbol_id, "")) {
                output.encodeStringElement(serialDesc, 2, self.symbol_id);
            }
            if (!Intrinsics.areEqual(self.amount_to_convert, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 3, IdlDecimalSerializer.INSTANCE, self.amount_to_convert);
            }
            CurrencyDto currencyDto = self.from_currency;
            CurrencyDto.Companion companion = CurrencyDto.INSTANCE;
            if (currencyDto != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, CurrencyDto.Serializer.INSTANCE, self.from_currency);
            }
            if (self.to_currency != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, CurrencyDto.Serializer.INSTANCE, self.to_currency);
            }
        }

        public Surrogate(String ref_id, String account_number, String symbol_id, IdlDecimal amount_to_convert, CurrencyDto from_currency, CurrencyDto to_currency) {
            Intrinsics.checkNotNullParameter(ref_id, "ref_id");
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            Intrinsics.checkNotNullParameter(symbol_id, "symbol_id");
            Intrinsics.checkNotNullParameter(amount_to_convert, "amount_to_convert");
            Intrinsics.checkNotNullParameter(from_currency, "from_currency");
            Intrinsics.checkNotNullParameter(to_currency, "to_currency");
            this.ref_id = ref_id;
            this.account_number = account_number;
            this.symbol_id = symbol_id;
            this.amount_to_convert = amount_to_convert;
            this.from_currency = from_currency;
            this.to_currency = to_currency;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, IdlDecimal idlDecimal, CurrencyDto currencyDto, CurrencyDto currencyDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? new IdlDecimal("") : idlDecimal, (i & 16) != 0 ? CurrencyDto.INSTANCE.getZeroValue() : currencyDto, (i & 32) != 0 ? CurrencyDto.INSTANCE.getZeroValue() : currencyDto2);
        }

        public final String getRef_id() {
            return this.ref_id;
        }

        public final String getAccount_number() {
            return this.account_number;
        }

        public final String getSymbol_id() {
            return this.symbol_id;
        }

        public final IdlDecimal getAmount_to_convert() {
            return this.amount_to_convert;
        }

        public final CurrencyDto getFrom_currency() {
            return this.from_currency;
        }

        public final CurrencyDto getTo_currency() {
            return this.to_currency;
        }
    }

    /* compiled from: ConvertCurrencyRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/mcw_currency_conversion/proto/v1/ConvertCurrencyRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/contracts/mcw_currency_conversion/proto/v1/ConvertCurrencyRequestDto;", "Lmicrogram/contracts/mcw_currency_conversion/proto/v1/ConvertCurrencyRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/mcw_currency_conversion/proto/v1/ConvertCurrencyRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "microgram.contracts.mcw_currency_conversion.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<ConvertCurrencyRequestDto, ConvertCurrencyRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ConvertCurrencyRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ConvertCurrencyRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ConvertCurrencyRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) ConvertCurrencyRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ConvertCurrencyRequest> getProtoAdapter() {
            return ConvertCurrencyRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ConvertCurrencyRequestDto getZeroValue() {
            return ConvertCurrencyRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ConvertCurrencyRequestDto fromProto(ConvertCurrencyRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String ref_id = proto.getRef_id();
            String account_number = proto.getAccount_number();
            String symbol_id = proto.getSymbol_id();
            IdlDecimal idlDecimal = new IdlDecimal(proto.getAmount_to_convert());
            CurrencyDto.Companion companion = CurrencyDto.INSTANCE;
            return new ConvertCurrencyRequestDto(new Surrogate(ref_id, account_number, symbol_id, idlDecimal, companion.fromProto(proto.getFrom_currency()), companion.fromProto(proto.getTo_currency())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.mcw_currency_conversion.proto.v1.ConvertCurrencyRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ConvertCurrencyRequestDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ConvertCurrencyRequestDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ConvertCurrencyRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/mcw_currency_conversion/proto/v1/ConvertCurrencyRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/mcw_currency_conversion/proto/v1/ConvertCurrencyRequestDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/contracts/mcw_currency_conversion/proto/v1/ConvertCurrencyRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "microgram.contracts.mcw_currency_conversion.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ConvertCurrencyRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.contracts.mcw_currency_conversion.proto.v1.ConvertCurrencyRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ConvertCurrencyRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ConvertCurrencyRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ConvertCurrencyRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ConvertCurrencyRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/contracts/mcw_currency_conversion/proto/v1/ConvertCurrencyRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "microgram.contracts.mcw_currency_conversion.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "microgram.contracts.mcw_currency_conversion.proto.v1.ConvertCurrencyRequestDto";
        }
    }
}
