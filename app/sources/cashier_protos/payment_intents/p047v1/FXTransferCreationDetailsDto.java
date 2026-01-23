package cashier_protos.payment_intents.p047v1;

import android.os.Parcel;
import android.os.Parcelable;
import cashier_protos.payment_intents.p047v1.FXAcctSchemaDto;
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

/* compiled from: FXTransferCreationDetailsDto.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004/.01B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0006\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001bH\u0016¢\u0006\u0004\b$\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b*\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b+\u0010\u0015R\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00062"}, m3636d2 = {"Lcashier_protos/payment_intents/v1/FXTransferCreationDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcashier_protos/payment_intents/v1/FXTransferCreationDetails;", "Landroid/os/Parcelable;", "Lcashier_protos/payment_intents/v1/FXTransferCreationDetailsDto$Surrogate;", "surrogate", "<init>", "(Lcashier_protos/payment_intents/v1/FXTransferCreationDetailsDto$Surrogate;)V", "Lcom/robinhood/idl/IdlDecimal;", "target_amount", "Lcom/robinhood/rosetta/common/CurrencyDto;", "target_currency", "", "target_fx_rate", "target_fx_rate_id", "Lcashier_protos/payment_intents/v1/FXAcctSchemaDto;", "fx_acct_schema", "(Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/CurrencyDto;Ljava/lang/String;Ljava/lang/String;Lcashier_protos/payment_intents/v1/FXAcctSchemaDto;)V", "toProto", "()Lcashier_protos/payment_intents/v1/FXTransferCreationDetails;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcashier_protos/payment_intents/v1/FXTransferCreationDetailsDto$Surrogate;", "getTarget_amount", "()Lcom/robinhood/idl/IdlDecimal;", "getTarget_currency", "()Lcom/robinhood/rosetta/common/CurrencyDto;", "getTarget_fx_rate", "getTarget_fx_rate_id", "getFx_acct_schema", "()Lcashier_protos/payment_intents/v1/FXAcctSchemaDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "cashier_protos.payment_intents.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes.dex */
public final class FXTransferCreationDetailsDto implements Dto3<FXTransferCreationDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<FXTransferCreationDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FXTransferCreationDetailsDto, FXTransferCreationDetails>> binaryBase64Serializer$delegate;
    private static final FXTransferCreationDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ FXTransferCreationDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FXTransferCreationDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final IdlDecimal getTarget_amount() {
        return this.surrogate.getTarget_amount();
    }

    public final CurrencyDto getTarget_currency() {
        return this.surrogate.getTarget_currency();
    }

    public final String getTarget_fx_rate() {
        return this.surrogate.getTarget_fx_rate();
    }

    public final String getTarget_fx_rate_id() {
        return this.surrogate.getTarget_fx_rate_id();
    }

    public final FXAcctSchemaDto getFx_acct_schema() {
        return this.surrogate.getFx_acct_schema();
    }

    public /* synthetic */ FXTransferCreationDetailsDto(IdlDecimal idlDecimal, CurrencyDto currencyDto, String str, String str2, FXAcctSchemaDto fXAcctSchemaDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal, (i & 2) != 0 ? CurrencyDto.INSTANCE.getZeroValue() : currencyDto, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? FXAcctSchemaDto.INSTANCE.getZeroValue() : fXAcctSchemaDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FXTransferCreationDetailsDto(IdlDecimal target_amount, CurrencyDto target_currency, String target_fx_rate, String target_fx_rate_id, FXAcctSchemaDto fx_acct_schema) {
        this(new Surrogate(target_amount, target_currency, target_fx_rate, target_fx_rate_id, fx_acct_schema));
        Intrinsics.checkNotNullParameter(target_amount, "target_amount");
        Intrinsics.checkNotNullParameter(target_currency, "target_currency");
        Intrinsics.checkNotNullParameter(target_fx_rate, "target_fx_rate");
        Intrinsics.checkNotNullParameter(target_fx_rate_id, "target_fx_rate_id");
        Intrinsics.checkNotNullParameter(fx_acct_schema, "fx_acct_schema");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public FXTransferCreationDetails toProto() {
        return new FXTransferCreationDetails(this.surrogate.getTarget_amount().getStringValue(), (Currency) this.surrogate.getTarget_currency().toProto(), this.surrogate.getTarget_fx_rate(), this.surrogate.getTarget_fx_rate_id(), (FXAcctSchema) this.surrogate.getFx_acct_schema().toProto(), null, 32, null);
    }

    public String toString() {
        return "[FXTransferCreationDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof FXTransferCreationDetailsDto) && Intrinsics.areEqual(((FXTransferCreationDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: FXTransferCreationDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0083\b\u0018\u0000 82\u00020\u0001:\u000298BH\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fBM\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010&\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010+\u0012\u0004\b.\u0010*\u001a\u0004\b,\u0010-R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010/\u0012\u0004\b1\u0010*\u001a\u0004\b0\u0010\u001fR \u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010/\u0012\u0004\b3\u0010*\u001a\u0004\b2\u0010\u001fR \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00104\u0012\u0004\b7\u0010*\u001a\u0004\b5\u00106¨\u0006:"}, m3636d2 = {"Lcashier_protos/payment_intents/v1/FXTransferCreationDetailsDto$Surrogate;", "", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "target_amount", "Lcom/robinhood/rosetta/common/CurrencyDto;", "target_currency", "", "target_fx_rate", "target_fx_rate_id", "Lcashier_protos/payment_intents/v1/FXAcctSchemaDto;", "fx_acct_schema", "<init>", "(Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/CurrencyDto;Ljava/lang/String;Ljava/lang/String;Lcashier_protos/payment_intents/v1/FXAcctSchemaDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/CurrencyDto;Ljava/lang/String;Ljava/lang/String;Lcashier_protos/payment_intents/v1/FXAcctSchemaDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$cashier_protos_payment_intents_v1_externalRelease", "(Lcashier_protos/payment_intents/v1/FXTransferCreationDetailsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/idl/IdlDecimal;", "getTarget_amount", "()Lcom/robinhood/idl/IdlDecimal;", "getTarget_amount$annotations", "()V", "Lcom/robinhood/rosetta/common/CurrencyDto;", "getTarget_currency", "()Lcom/robinhood/rosetta/common/CurrencyDto;", "getTarget_currency$annotations", "Ljava/lang/String;", "getTarget_fx_rate", "getTarget_fx_rate$annotations", "getTarget_fx_rate_id", "getTarget_fx_rate_id$annotations", "Lcashier_protos/payment_intents/v1/FXAcctSchemaDto;", "getFx_acct_schema", "()Lcashier_protos/payment_intents/v1/FXAcctSchemaDto;", "getFx_acct_schema$annotations", "Companion", "$serializer", "cashier_protos.payment_intents.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final FXAcctSchemaDto fx_acct_schema;
        private final IdlDecimal target_amount;
        private final CurrencyDto target_currency;
        private final String target_fx_rate;
        private final String target_fx_rate_id;

        public Surrogate() {
            this((IdlDecimal) null, (CurrencyDto) null, (String) null, (String) null, (FXAcctSchemaDto) null, 31, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.target_amount, surrogate.target_amount) && this.target_currency == surrogate.target_currency && Intrinsics.areEqual(this.target_fx_rate, surrogate.target_fx_rate) && Intrinsics.areEqual(this.target_fx_rate_id, surrogate.target_fx_rate_id) && this.fx_acct_schema == surrogate.fx_acct_schema;
        }

        public int hashCode() {
            return (((((((this.target_amount.hashCode() * 31) + this.target_currency.hashCode()) * 31) + this.target_fx_rate.hashCode()) * 31) + this.target_fx_rate_id.hashCode()) * 31) + this.fx_acct_schema.hashCode();
        }

        public String toString() {
            return "Surrogate(target_amount=" + this.target_amount + ", target_currency=" + this.target_currency + ", target_fx_rate=" + this.target_fx_rate + ", target_fx_rate_id=" + this.target_fx_rate_id + ", fx_acct_schema=" + this.fx_acct_schema + ")";
        }

        /* compiled from: FXTransferCreationDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcashier_protos/payment_intents/v1/FXTransferCreationDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcashier_protos/payment_intents/v1/FXTransferCreationDetailsDto$Surrogate;", "cashier_protos.payment_intents.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return FXTransferCreationDetailsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, IdlDecimal idlDecimal, CurrencyDto currencyDto, String str, String str2, FXAcctSchemaDto fXAcctSchemaDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.target_amount = (i & 1) == 0 ? new IdlDecimal("") : idlDecimal;
            if ((i & 2) == 0) {
                this.target_currency = CurrencyDto.INSTANCE.getZeroValue();
            } else {
                this.target_currency = currencyDto;
            }
            if ((i & 4) == 0) {
                this.target_fx_rate = "";
            } else {
                this.target_fx_rate = str;
            }
            if ((i & 8) == 0) {
                this.target_fx_rate_id = "";
            } else {
                this.target_fx_rate_id = str2;
            }
            if ((i & 16) == 0) {
                this.fx_acct_schema = FXAcctSchemaDto.INSTANCE.getZeroValue();
            } else {
                this.fx_acct_schema = fXAcctSchemaDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$cashier_protos_payment_intents_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.target_amount, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 0, IdlDecimalSerializer.INSTANCE, self.target_amount);
            }
            if (self.target_currency != CurrencyDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, CurrencyDto.Serializer.INSTANCE, self.target_currency);
            }
            if (!Intrinsics.areEqual(self.target_fx_rate, "")) {
                output.encodeStringElement(serialDesc, 2, self.target_fx_rate);
            }
            if (!Intrinsics.areEqual(self.target_fx_rate_id, "")) {
                output.encodeStringElement(serialDesc, 3, self.target_fx_rate_id);
            }
            if (self.fx_acct_schema != FXAcctSchemaDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, FXAcctSchemaDto.Serializer.INSTANCE, self.fx_acct_schema);
            }
        }

        public Surrogate(IdlDecimal target_amount, CurrencyDto target_currency, String target_fx_rate, String target_fx_rate_id, FXAcctSchemaDto fx_acct_schema) {
            Intrinsics.checkNotNullParameter(target_amount, "target_amount");
            Intrinsics.checkNotNullParameter(target_currency, "target_currency");
            Intrinsics.checkNotNullParameter(target_fx_rate, "target_fx_rate");
            Intrinsics.checkNotNullParameter(target_fx_rate_id, "target_fx_rate_id");
            Intrinsics.checkNotNullParameter(fx_acct_schema, "fx_acct_schema");
            this.target_amount = target_amount;
            this.target_currency = target_currency;
            this.target_fx_rate = target_fx_rate;
            this.target_fx_rate_id = target_fx_rate_id;
            this.fx_acct_schema = fx_acct_schema;
        }

        public /* synthetic */ Surrogate(IdlDecimal idlDecimal, CurrencyDto currencyDto, String str, String str2, FXAcctSchemaDto fXAcctSchemaDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal, (i & 2) != 0 ? CurrencyDto.INSTANCE.getZeroValue() : currencyDto, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? FXAcctSchemaDto.INSTANCE.getZeroValue() : fXAcctSchemaDto);
        }

        public final IdlDecimal getTarget_amount() {
            return this.target_amount;
        }

        public final CurrencyDto getTarget_currency() {
            return this.target_currency;
        }

        public final String getTarget_fx_rate() {
            return this.target_fx_rate;
        }

        public final String getTarget_fx_rate_id() {
            return this.target_fx_rate_id;
        }

        public final FXAcctSchemaDto getFx_acct_schema() {
            return this.fx_acct_schema;
        }
    }

    /* compiled from: FXTransferCreationDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcashier_protos/payment_intents/v1/FXTransferCreationDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcashier_protos/payment_intents/v1/FXTransferCreationDetailsDto;", "Lcashier_protos/payment_intents/v1/FXTransferCreationDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcashier_protos/payment_intents/v1/FXTransferCreationDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "cashier_protos.payment_intents.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<FXTransferCreationDetailsDto, FXTransferCreationDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FXTransferCreationDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FXTransferCreationDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FXTransferCreationDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) FXTransferCreationDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<FXTransferCreationDetails> getProtoAdapter() {
            return FXTransferCreationDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FXTransferCreationDetailsDto getZeroValue() {
            return FXTransferCreationDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FXTransferCreationDetailsDto fromProto(FXTransferCreationDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new FXTransferCreationDetailsDto(new Surrogate(new IdlDecimal(proto.getTarget_amount()), CurrencyDto.INSTANCE.fromProto(proto.getTarget_currency()), proto.getTarget_fx_rate(), proto.getTarget_fx_rate_id(), FXAcctSchemaDto.INSTANCE.fromProto(proto.getFx_acct_schema())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: cashier_protos.payment_intents.v1.FXTransferCreationDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FXTransferCreationDetailsDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new FXTransferCreationDetailsDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: FXTransferCreationDetailsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcashier_protos/payment_intents/v1/FXTransferCreationDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcashier_protos/payment_intents/v1/FXTransferCreationDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lcashier_protos/payment_intents/v1/FXTransferCreationDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "cashier_protos.payment_intents.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes16.dex */
    public static final class Serializer implements KSerializer<FXTransferCreationDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/cashier_protos.payment_intents.v1.FXTransferCreationDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FXTransferCreationDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public FXTransferCreationDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new FXTransferCreationDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: FXTransferCreationDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcashier_protos/payment_intents/v1/FXTransferCreationDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "cashier_protos.payment_intents.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "cashier_protos.payment_intents.v1.FXTransferCreationDetailsDto";
        }
    }
}
