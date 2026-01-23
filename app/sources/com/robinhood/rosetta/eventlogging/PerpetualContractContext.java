package com.robinhood.rosetta.eventlogging;

import com.plaid.internal.EnumC7081g;
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

/* compiled from: PerpetualContractContext.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016JL\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PerpetualContractContext;", "Lcom/squareup/wire/Message;", "", "contract_id", "", "name", "symbol", "base_currency_id", "quote_currency_id", "min_order_price_increment", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLokio/ByteString;)V", "getContract_id", "()Ljava/lang/String;", "getName", "getSymbol", "getBase_currency_id", "getQuote_currency_id", "getMin_order_price_increment", "()D", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class PerpetualContractContext extends Message {

    @JvmField
    public static final ProtoAdapter<PerpetualContractContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "baseCurrencyId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String base_currency_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contractId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String contract_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "minOrderPriceIncrement", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final double min_order_price_increment;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "quoteCurrencyId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String quote_currency_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String symbol;

    public PerpetualContractContext() {
        this(null, null, null, null, null, 0.0d, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ PerpetualContractContext(String str, String str2, String str3, String str4, String str5, double d, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? 0.0d : d, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24488newBuilder();
    }

    public final String getContract_id() {
        return this.contract_id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final String getBase_currency_id() {
        return this.base_currency_id;
    }

    public final String getQuote_currency_id() {
        return this.quote_currency_id;
    }

    public final double getMin_order_price_increment() {
        return this.min_order_price_increment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerpetualContractContext(String contract_id, String name, String symbol, String base_currency_id, String quote_currency_id, double d, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(base_currency_id, "base_currency_id");
        Intrinsics.checkNotNullParameter(quote_currency_id, "quote_currency_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.contract_id = contract_id;
        this.name = name;
        this.symbol = symbol;
        this.base_currency_id = base_currency_id;
        this.quote_currency_id = quote_currency_id;
        this.min_order_price_increment = d;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24488newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PerpetualContractContext)) {
            return false;
        }
        PerpetualContractContext perpetualContractContext = (PerpetualContractContext) other;
        return Intrinsics.areEqual(unknownFields(), perpetualContractContext.unknownFields()) && Intrinsics.areEqual(this.contract_id, perpetualContractContext.contract_id) && Intrinsics.areEqual(this.name, perpetualContractContext.name) && Intrinsics.areEqual(this.symbol, perpetualContractContext.symbol) && Intrinsics.areEqual(this.base_currency_id, perpetualContractContext.base_currency_id) && Intrinsics.areEqual(this.quote_currency_id, perpetualContractContext.quote_currency_id) && this.min_order_price_increment == perpetualContractContext.min_order_price_increment;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + this.contract_id.hashCode()) * 37) + this.name.hashCode()) * 37) + this.symbol.hashCode()) * 37) + this.base_currency_id.hashCode()) * 37) + this.quote_currency_id.hashCode()) * 37) + Double.hashCode(this.min_order_price_increment);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("contract_id=" + Internal.sanitize(this.contract_id));
        arrayList.add("name=" + Internal.sanitize(this.name));
        arrayList.add("symbol=" + Internal.sanitize(this.symbol));
        arrayList.add("base_currency_id=" + Internal.sanitize(this.base_currency_id));
        arrayList.add("quote_currency_id=" + Internal.sanitize(this.quote_currency_id));
        arrayList.add("min_order_price_increment=" + this.min_order_price_increment);
        return CollectionsKt.joinToString$default(arrayList, ", ", "PerpetualContractContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PerpetualContractContext copy$default(PerpetualContractContext perpetualContractContext, String str, String str2, String str3, String str4, String str5, double d, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = perpetualContractContext.contract_id;
        }
        if ((i & 2) != 0) {
            str2 = perpetualContractContext.name;
        }
        if ((i & 4) != 0) {
            str3 = perpetualContractContext.symbol;
        }
        if ((i & 8) != 0) {
            str4 = perpetualContractContext.base_currency_id;
        }
        if ((i & 16) != 0) {
            str5 = perpetualContractContext.quote_currency_id;
        }
        if ((i & 32) != 0) {
            d = perpetualContractContext.min_order_price_increment;
        }
        if ((i & 64) != 0) {
            byteString = perpetualContractContext.unknownFields();
        }
        ByteString byteString2 = byteString;
        double d2 = d;
        String str6 = str5;
        String str7 = str3;
        return perpetualContractContext.copy(str, str2, str7, str4, str6, d2, byteString2);
    }

    public final PerpetualContractContext copy(String contract_id, String name, String symbol, String base_currency_id, String quote_currency_id, double min_order_price_increment, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(base_currency_id, "base_currency_id");
        Intrinsics.checkNotNullParameter(quote_currency_id, "quote_currency_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PerpetualContractContext(contract_id, name, symbol, base_currency_id, quote_currency_id, min_order_price_increment, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PerpetualContractContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PerpetualContractContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.PerpetualContractContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PerpetualContractContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getContract_id());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getName());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getBase_currency_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getBase_currency_id());
                }
                if (!Intrinsics.areEqual(value.getQuote_currency_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getQuote_currency_id());
                }
                return !Double.valueOf(value.getMin_order_price_increment()).equals(Double.valueOf(0.0d)) ? size + ProtoAdapter.DOUBLE.encodedSizeWithTag(6, Double.valueOf(value.getMin_order_price_increment())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PerpetualContractContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getContract_id());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getName());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getBase_currency_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getBase_currency_id());
                }
                if (!Intrinsics.areEqual(value.getQuote_currency_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getQuote_currency_id());
                }
                if (!Double.valueOf(value.getMin_order_price_increment()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 6, (int) Double.valueOf(value.getMin_order_price_increment()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PerpetualContractContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Double.valueOf(value.getMin_order_price_increment()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 6, (int) Double.valueOf(value.getMin_order_price_increment()));
                }
                if (!Intrinsics.areEqual(value.getQuote_currency_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getQuote_currency_id());
                }
                if (!Intrinsics.areEqual(value.getBase_currency_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getBase_currency_id());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getName());
                }
                if (Intrinsics.areEqual(value.getContract_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getContract_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PerpetualContractContext redact(PerpetualContractContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return PerpetualContractContext.copy$default(value, null, null, null, null, null, 0.0d, ByteString.EMPTY, 63, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PerpetualContractContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                double dDoubleValue = 0.0d;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new PerpetualContractContext(strDecode, strDecode4, strDecode5, strDecode2, strDecode3, dDoubleValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
