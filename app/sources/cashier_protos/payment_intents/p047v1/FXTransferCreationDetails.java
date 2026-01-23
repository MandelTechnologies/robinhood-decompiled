package cashier_protos.payment_intents.p047v1;

import com.robinhood.rosetta.common.Currency;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: FXTransferCreationDetails.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016JB\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, m3636d2 = {"Lcashier_protos/payment_intents/v1/FXTransferCreationDetails;", "Lcom/squareup/wire/Message;", "", "target_amount", "", "target_currency", "Lcom/robinhood/rosetta/common/Currency;", "target_fx_rate", "target_fx_rate_id", "fx_acct_schema", "Lcashier_protos/payment_intents/v1/FXAcctSchema;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/common/Currency;Ljava/lang/String;Ljava/lang/String;Lcashier_protos/payment_intents/v1/FXAcctSchema;Lokio/ByteString;)V", "getTarget_amount", "()Ljava/lang/String;", "getTarget_currency", "()Lcom/robinhood/rosetta/common/Currency;", "getTarget_fx_rate", "getTarget_fx_rate_id", "getFx_acct_schema", "()Lcashier_protos/payment_intents/v1/FXAcctSchema;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "cashier_protos.payment_intents.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class FXTransferCreationDetails extends Message {

    @JvmField
    public static final ProtoAdapter<FXTransferCreationDetails> ADAPTER;

    @WireField(adapter = "cashier_protos.payment_intents.v1.FXAcctSchema#ADAPTER", jsonName = "fxAcctSchema", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final FXAcctSchema fx_acct_schema;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "targetAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String target_amount;

    @WireField(adapter = "com.robinhood.rosetta.common.Currency#ADAPTER", jsonName = "targetCurrency", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Currency target_currency;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "targetFxRate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String target_fx_rate;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "targetFxRateId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String target_fx_rate_id;

    public FXTransferCreationDetails() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ FXTransferCreationDetails(String str, Currency currency, String str2, String str3, FXAcctSchema fXAcctSchema, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? Currency.CURRENCY_UNSPECIFIED : currency, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? FXAcctSchema.FX_ACCT_SCHEMA_UNSPECIFIED : fXAcctSchema, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m9085newBuilder();
    }

    public final String getTarget_amount() {
        return this.target_amount;
    }

    public final Currency getTarget_currency() {
        return this.target_currency;
    }

    public final String getTarget_fx_rate() {
        return this.target_fx_rate;
    }

    public final String getTarget_fx_rate_id() {
        return this.target_fx_rate_id;
    }

    public final FXAcctSchema getFx_acct_schema() {
        return this.fx_acct_schema;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FXTransferCreationDetails(String target_amount, Currency target_currency, String target_fx_rate, String target_fx_rate_id, FXAcctSchema fx_acct_schema, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(target_amount, "target_amount");
        Intrinsics.checkNotNullParameter(target_currency, "target_currency");
        Intrinsics.checkNotNullParameter(target_fx_rate, "target_fx_rate");
        Intrinsics.checkNotNullParameter(target_fx_rate_id, "target_fx_rate_id");
        Intrinsics.checkNotNullParameter(fx_acct_schema, "fx_acct_schema");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.target_amount = target_amount;
        this.target_currency = target_currency;
        this.target_fx_rate = target_fx_rate;
        this.target_fx_rate_id = target_fx_rate_id;
        this.fx_acct_schema = fx_acct_schema;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m9085newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FXTransferCreationDetails)) {
            return false;
        }
        FXTransferCreationDetails fXTransferCreationDetails = (FXTransferCreationDetails) other;
        return Intrinsics.areEqual(unknownFields(), fXTransferCreationDetails.unknownFields()) && Intrinsics.areEqual(this.target_amount, fXTransferCreationDetails.target_amount) && this.target_currency == fXTransferCreationDetails.target_currency && Intrinsics.areEqual(this.target_fx_rate, fXTransferCreationDetails.target_fx_rate) && Intrinsics.areEqual(this.target_fx_rate_id, fXTransferCreationDetails.target_fx_rate_id) && this.fx_acct_schema == fXTransferCreationDetails.fx_acct_schema;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.target_amount.hashCode()) * 37) + this.target_currency.hashCode()) * 37) + this.target_fx_rate.hashCode()) * 37) + this.target_fx_rate_id.hashCode()) * 37) + this.fx_acct_schema.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("target_amount=" + Internal.sanitize(this.target_amount));
        arrayList.add("target_currency=" + this.target_currency);
        arrayList.add("target_fx_rate=" + Internal.sanitize(this.target_fx_rate));
        arrayList.add("target_fx_rate_id=" + Internal.sanitize(this.target_fx_rate_id));
        arrayList.add("fx_acct_schema=" + this.fx_acct_schema);
        return CollectionsKt.joinToString$default(arrayList, ", ", "FXTransferCreationDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ FXTransferCreationDetails copy$default(FXTransferCreationDetails fXTransferCreationDetails, String str, Currency currency, String str2, String str3, FXAcctSchema fXAcctSchema, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fXTransferCreationDetails.target_amount;
        }
        if ((i & 2) != 0) {
            currency = fXTransferCreationDetails.target_currency;
        }
        if ((i & 4) != 0) {
            str2 = fXTransferCreationDetails.target_fx_rate;
        }
        if ((i & 8) != 0) {
            str3 = fXTransferCreationDetails.target_fx_rate_id;
        }
        if ((i & 16) != 0) {
            fXAcctSchema = fXTransferCreationDetails.fx_acct_schema;
        }
        if ((i & 32) != 0) {
            byteString = fXTransferCreationDetails.unknownFields();
        }
        FXAcctSchema fXAcctSchema2 = fXAcctSchema;
        ByteString byteString2 = byteString;
        return fXTransferCreationDetails.copy(str, currency, str2, str3, fXAcctSchema2, byteString2);
    }

    public final FXTransferCreationDetails copy(String target_amount, Currency target_currency, String target_fx_rate, String target_fx_rate_id, FXAcctSchema fx_acct_schema, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(target_amount, "target_amount");
        Intrinsics.checkNotNullParameter(target_currency, "target_currency");
        Intrinsics.checkNotNullParameter(target_fx_rate, "target_fx_rate");
        Intrinsics.checkNotNullParameter(target_fx_rate_id, "target_fx_rate_id");
        Intrinsics.checkNotNullParameter(fx_acct_schema, "fx_acct_schema");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FXTransferCreationDetails(target_amount, target_currency, target_fx_rate, target_fx_rate_id, fx_acct_schema, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FXTransferCreationDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FXTransferCreationDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: cashier_protos.payment_intents.v1.FXTransferCreationDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FXTransferCreationDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTarget_amount(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTarget_amount());
                }
                if (value.getTarget_currency() != Currency.CURRENCY_UNSPECIFIED) {
                    size += Currency.ADAPTER.encodedSizeWithTag(2, value.getTarget_currency());
                }
                if (!Intrinsics.areEqual(value.getTarget_fx_rate(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getTarget_fx_rate());
                }
                if (!Intrinsics.areEqual(value.getTarget_fx_rate_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getTarget_fx_rate_id());
                }
                return value.getFx_acct_schema() != FXAcctSchema.FX_ACCT_SCHEMA_UNSPECIFIED ? size + FXAcctSchema.ADAPTER.encodedSizeWithTag(5, value.getFx_acct_schema()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FXTransferCreationDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTarget_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTarget_amount());
                }
                if (value.getTarget_currency() != Currency.CURRENCY_UNSPECIFIED) {
                    Currency.ADAPTER.encodeWithTag(writer, 2, (int) value.getTarget_currency());
                }
                if (!Intrinsics.areEqual(value.getTarget_fx_rate(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getTarget_fx_rate());
                }
                if (!Intrinsics.areEqual(value.getTarget_fx_rate_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getTarget_fx_rate_id());
                }
                if (value.getFx_acct_schema() != FXAcctSchema.FX_ACCT_SCHEMA_UNSPECIFIED) {
                    FXAcctSchema.ADAPTER.encodeWithTag(writer, 5, (int) value.getFx_acct_schema());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FXTransferCreationDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getFx_acct_schema() != FXAcctSchema.FX_ACCT_SCHEMA_UNSPECIFIED) {
                    FXAcctSchema.ADAPTER.encodeWithTag(writer, 5, (int) value.getFx_acct_schema());
                }
                if (!Intrinsics.areEqual(value.getTarget_fx_rate_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getTarget_fx_rate_id());
                }
                if (!Intrinsics.areEqual(value.getTarget_fx_rate(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getTarget_fx_rate());
                }
                if (value.getTarget_currency() != Currency.CURRENCY_UNSPECIFIED) {
                    Currency.ADAPTER.encodeWithTag(writer, 2, (int) value.getTarget_currency());
                }
                if (Intrinsics.areEqual(value.getTarget_amount(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTarget_amount());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public FXTransferCreationDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Currency currencyDecode = Currency.CURRENCY_UNSPECIFIED;
                FXAcctSchema fXAcctSchema = FXAcctSchema.FX_ACCT_SCHEMA_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                FXAcctSchema fXAcctSchemaDecode = fXAcctSchema;
                while (true) {
                    Currency currency = currencyDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new FXTransferCreationDetails(strDecode, currency, strDecode2, strDecode3, fXAcctSchemaDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            try {
                                currencyDecode = Currency.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 3) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 4) {
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 5) {
                            try {
                                fXAcctSchemaDecode = FXAcctSchema.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FXTransferCreationDetails redact(FXTransferCreationDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return FXTransferCreationDetails.copy$default(value, null, null, null, null, null, ByteString.EMPTY, 31, null);
            }
        };
    }
}
