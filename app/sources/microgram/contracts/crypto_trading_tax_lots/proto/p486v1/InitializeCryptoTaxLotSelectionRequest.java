package microgram.contracts.crypto_trading_tax_lots.proto.p486v1;

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
import nummus.p512v1.TaxLotStrategyType;
import okio.ByteString;

/* compiled from: InitializeCryptoTaxLotSelectionRequest.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J:\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001d"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/InitializeCryptoTaxLotSelectionRequest;", "Lcom/squareup/wire/Message;", "", "currency_pair_id", "", "strategy_type", "Lnummus/v1/TaxLotStrategyType;", "quantity", "account_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lnummus/v1/TaxLotStrategyType;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getCurrency_pair_id", "()Ljava/lang/String;", "getStrategy_type", "()Lnummus/v1/TaxLotStrategyType;", "getQuantity", "getAccount_id", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class InitializeCryptoTaxLotSelectionRequest extends Message {

    @JvmField
    public static final ProtoAdapter<InitializeCryptoTaxLotSelectionRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", schemaIndex = 3, tag = 4)
    private final String account_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "currencyPairId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String currency_pair_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String quantity;

    @WireField(adapter = "nummus.v1.TaxLotStrategyType#ADAPTER", jsonName = "strategyType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final TaxLotStrategyType strategy_type;

    public InitializeCryptoTaxLotSelectionRequest() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ InitializeCryptoTaxLotSelectionRequest(String str, TaxLotStrategyType taxLotStrategyType, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? TaxLotStrategyType.TAX_LOT_STRATEGY_TYPE_UNSPECIFIED : taxLotStrategyType, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28974newBuilder();
    }

    public final String getCurrency_pair_id() {
        return this.currency_pair_id;
    }

    public final TaxLotStrategyType getStrategy_type() {
        return this.strategy_type;
    }

    public final String getQuantity() {
        return this.quantity;
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeCryptoTaxLotSelectionRequest(String currency_pair_id, TaxLotStrategyType strategy_type, String quantity, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
        Intrinsics.checkNotNullParameter(strategy_type, "strategy_type");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.currency_pair_id = currency_pair_id;
        this.strategy_type = strategy_type;
        this.quantity = quantity;
        this.account_id = str;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28974newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InitializeCryptoTaxLotSelectionRequest)) {
            return false;
        }
        InitializeCryptoTaxLotSelectionRequest initializeCryptoTaxLotSelectionRequest = (InitializeCryptoTaxLotSelectionRequest) other;
        return Intrinsics.areEqual(unknownFields(), initializeCryptoTaxLotSelectionRequest.unknownFields()) && Intrinsics.areEqual(this.currency_pair_id, initializeCryptoTaxLotSelectionRequest.currency_pair_id) && this.strategy_type == initializeCryptoTaxLotSelectionRequest.strategy_type && Intrinsics.areEqual(this.quantity, initializeCryptoTaxLotSelectionRequest.quantity) && Intrinsics.areEqual(this.account_id, initializeCryptoTaxLotSelectionRequest.account_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.currency_pair_id.hashCode()) * 37) + this.strategy_type.hashCode()) * 37) + this.quantity.hashCode()) * 37;
        String str = this.account_id;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("currency_pair_id=" + Internal.sanitize(this.currency_pair_id));
        arrayList.add("strategy_type=" + this.strategy_type);
        arrayList.add("quantity=" + Internal.sanitize(this.quantity));
        String str = this.account_id;
        if (str != null) {
            arrayList.add("account_id=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InitializeCryptoTaxLotSelectionRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ InitializeCryptoTaxLotSelectionRequest copy$default(InitializeCryptoTaxLotSelectionRequest initializeCryptoTaxLotSelectionRequest, String str, TaxLotStrategyType taxLotStrategyType, String str2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = initializeCryptoTaxLotSelectionRequest.currency_pair_id;
        }
        if ((i & 2) != 0) {
            taxLotStrategyType = initializeCryptoTaxLotSelectionRequest.strategy_type;
        }
        if ((i & 4) != 0) {
            str2 = initializeCryptoTaxLotSelectionRequest.quantity;
        }
        if ((i & 8) != 0) {
            str3 = initializeCryptoTaxLotSelectionRequest.account_id;
        }
        if ((i & 16) != 0) {
            byteString = initializeCryptoTaxLotSelectionRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str4 = str2;
        return initializeCryptoTaxLotSelectionRequest.copy(str, taxLotStrategyType, str4, str3, byteString2);
    }

    public final InitializeCryptoTaxLotSelectionRequest copy(String currency_pair_id, TaxLotStrategyType strategy_type, String quantity, String account_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
        Intrinsics.checkNotNullParameter(strategy_type, "strategy_type");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new InitializeCryptoTaxLotSelectionRequest(currency_pair_id, strategy_type, quantity, account_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InitializeCryptoTaxLotSelectionRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<InitializeCryptoTaxLotSelectionRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.InitializeCryptoTaxLotSelectionRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InitializeCryptoTaxLotSelectionRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getCurrency_pair_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getCurrency_pair_id());
                }
                if (value.getStrategy_type() != TaxLotStrategyType.TAX_LOT_STRATEGY_TYPE_UNSPECIFIED) {
                    size += TaxLotStrategyType.ADAPTER.encodedSizeWithTag(2, value.getStrategy_type());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getQuantity());
                }
                return size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getAccount_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InitializeCryptoTaxLotSelectionRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getCurrency_pair_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCurrency_pair_id());
                }
                if (value.getStrategy_type() != TaxLotStrategyType.TAX_LOT_STRATEGY_TYPE_UNSPECIFIED) {
                    TaxLotStrategyType.ADAPTER.encodeWithTag(writer, 2, (int) value.getStrategy_type());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getQuantity());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAccount_id());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InitializeCryptoTaxLotSelectionRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getAccount_id());
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getQuantity());
                }
                if (value.getStrategy_type() != TaxLotStrategyType.TAX_LOT_STRATEGY_TYPE_UNSPECIFIED) {
                    TaxLotStrategyType.ADAPTER.encodeWithTag(writer, 2, (int) value.getStrategy_type());
                }
                if (Intrinsics.areEqual(value.getCurrency_pair_id(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getCurrency_pair_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InitializeCryptoTaxLotSelectionRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                TaxLotStrategyType taxLotStrategyType = TaxLotStrategyType.TAX_LOT_STRATEGY_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = null;
                TaxLotStrategyType taxLotStrategyTypeDecode = taxLotStrategyType;
                String strDecode3 = strDecode;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new InitializeCryptoTaxLotSelectionRequest(strDecode3, taxLotStrategyTypeDecode, strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        try {
                            taxLotStrategyTypeDecode = TaxLotStrategyType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 3) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InitializeCryptoTaxLotSelectionRequest redact(InitializeCryptoTaxLotSelectionRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return InitializeCryptoTaxLotSelectionRequest.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }
        };
    }
}
