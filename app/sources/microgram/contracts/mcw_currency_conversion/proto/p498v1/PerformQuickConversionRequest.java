package microgram.contracts.mcw_currency_conversion.proto.p498v1;

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

/* compiled from: PerformQuickConversionRequest.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J8\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001d"}, m3636d2 = {"Lmicrogram/contracts/mcw_currency_conversion/proto/v1/PerformQuickConversionRequest;", "Lcom/squareup/wire/Message;", "", "ref_id", "", "account_number", "source_currency", "Lcom/robinhood/rosetta/common/Currency;", "usd_to_purchase", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/Currency;Ljava/lang/String;Lokio/ByteString;)V", "getRef_id", "()Ljava/lang/String;", "getAccount_number", "getSource_currency", "()Lcom/robinhood/rosetta/common/Currency;", "getUsd_to_purchase", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "microgram.contracts.mcw_currency_conversion.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class PerformQuickConversionRequest extends Message {

    @JvmField
    public static final ProtoAdapter<PerformQuickConversionRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "refId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String ref_id;

    @WireField(adapter = "com.robinhood.rosetta.common.Currency#ADAPTER", jsonName = "sourceCurrency", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Currency source_currency;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "usdToPurchase", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String usd_to_purchase;

    public PerformQuickConversionRequest() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ PerformQuickConversionRequest(String str, String str2, Currency currency, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? Currency.CURRENCY_UNSPECIFIED : currency, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29171newBuilder();
    }

    public final String getRef_id() {
        return this.ref_id;
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final Currency getSource_currency() {
        return this.source_currency;
    }

    public final String getUsd_to_purchase() {
        return this.usd_to_purchase;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerformQuickConversionRequest(String ref_id, String account_number, Currency source_currency, String usd_to_purchase, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(source_currency, "source_currency");
        Intrinsics.checkNotNullParameter(usd_to_purchase, "usd_to_purchase");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.ref_id = ref_id;
        this.account_number = account_number;
        this.source_currency = source_currency;
        this.usd_to_purchase = usd_to_purchase;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29171newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PerformQuickConversionRequest)) {
            return false;
        }
        PerformQuickConversionRequest performQuickConversionRequest = (PerformQuickConversionRequest) other;
        return Intrinsics.areEqual(unknownFields(), performQuickConversionRequest.unknownFields()) && Intrinsics.areEqual(this.ref_id, performQuickConversionRequest.ref_id) && Intrinsics.areEqual(this.account_number, performQuickConversionRequest.account_number) && this.source_currency == performQuickConversionRequest.source_currency && Intrinsics.areEqual(this.usd_to_purchase, performQuickConversionRequest.usd_to_purchase);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.ref_id.hashCode()) * 37) + this.account_number.hashCode()) * 37) + this.source_currency.hashCode()) * 37) + this.usd_to_purchase.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ref_id=" + Internal.sanitize(this.ref_id));
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        arrayList.add("source_currency=" + this.source_currency);
        arrayList.add("usd_to_purchase=" + Internal.sanitize(this.usd_to_purchase));
        return CollectionsKt.joinToString$default(arrayList, ", ", "PerformQuickConversionRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PerformQuickConversionRequest copy$default(PerformQuickConversionRequest performQuickConversionRequest, String str, String str2, Currency currency, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = performQuickConversionRequest.ref_id;
        }
        if ((i & 2) != 0) {
            str2 = performQuickConversionRequest.account_number;
        }
        if ((i & 4) != 0) {
            currency = performQuickConversionRequest.source_currency;
        }
        if ((i & 8) != 0) {
            str3 = performQuickConversionRequest.usd_to_purchase;
        }
        if ((i & 16) != 0) {
            byteString = performQuickConversionRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        Currency currency2 = currency;
        return performQuickConversionRequest.copy(str, str2, currency2, str3, byteString2);
    }

    public final PerformQuickConversionRequest copy(String ref_id, String account_number, Currency source_currency, String usd_to_purchase, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(source_currency, "source_currency");
        Intrinsics.checkNotNullParameter(usd_to_purchase, "usd_to_purchase");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PerformQuickConversionRequest(ref_id, account_number, source_currency, usd_to_purchase, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PerformQuickConversionRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PerformQuickConversionRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.mcw_currency_conversion.proto.v1.PerformQuickConversionRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PerformQuickConversionRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getRef_id());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAccount_number());
                }
                if (value.getSource_currency() != Currency.CURRENCY_UNSPECIFIED) {
                    size += Currency.ADAPTER.encodedSizeWithTag(3, value.getSource_currency());
                }
                return !Intrinsics.areEqual(value.getUsd_to_purchase(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getUsd_to_purchase()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PerformQuickConversionRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRef_id());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_number());
                }
                if (value.getSource_currency() != Currency.CURRENCY_UNSPECIFIED) {
                    Currency.ADAPTER.encodeWithTag(writer, 3, (int) value.getSource_currency());
                }
                if (!Intrinsics.areEqual(value.getUsd_to_purchase(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getUsd_to_purchase());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PerformQuickConversionRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getUsd_to_purchase(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getUsd_to_purchase());
                }
                if (value.getSource_currency() != Currency.CURRENCY_UNSPECIFIED) {
                    Currency.ADAPTER.encodeWithTag(writer, 3, (int) value.getSource_currency());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_number());
                }
                if (Intrinsics.areEqual(value.getRef_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRef_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PerformQuickConversionRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Currency currencyDecode = Currency.CURRENCY_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                while (true) {
                    Currency currency = currencyDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new PerformQuickConversionRequest(strDecode, strDecode2, currency, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            try {
                                currencyDecode = Currency.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 4) {
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PerformQuickConversionRequest redact(PerformQuickConversionRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return PerformQuickConversionRequest.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }
        };
    }
}
