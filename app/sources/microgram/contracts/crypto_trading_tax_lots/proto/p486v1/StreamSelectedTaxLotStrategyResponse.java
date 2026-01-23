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

/* compiled from: StreamSelectedTaxLotStrategyResponse.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamSelectedTaxLotStrategyResponse;", "Lcom/squareup/wire/Message;", "", "strategy_name", "", "strategy_type", "Lnummus/v1/TaxLotStrategyType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lnummus/v1/TaxLotStrategyType;Lokio/ByteString;)V", "getStrategy_name", "()Ljava/lang/String;", "getStrategy_type", "()Lnummus/v1/TaxLotStrategyType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class StreamSelectedTaxLotStrategyResponse extends Message {

    @JvmField
    public static final ProtoAdapter<StreamSelectedTaxLotStrategyResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "strategyName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String strategy_name;

    @WireField(adapter = "nummus.v1.TaxLotStrategyType#ADAPTER", jsonName = "strategyType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final TaxLotStrategyType strategy_type;

    public StreamSelectedTaxLotStrategyResponse() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28998newBuilder();
    }

    public final String getStrategy_name() {
        return this.strategy_name;
    }

    public /* synthetic */ StreamSelectedTaxLotStrategyResponse(String str, TaxLotStrategyType taxLotStrategyType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? TaxLotStrategyType.TAX_LOT_STRATEGY_TYPE_UNSPECIFIED : taxLotStrategyType, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final TaxLotStrategyType getStrategy_type() {
        return this.strategy_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamSelectedTaxLotStrategyResponse(String strategy_name, TaxLotStrategyType strategy_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(strategy_name, "strategy_name");
        Intrinsics.checkNotNullParameter(strategy_type, "strategy_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.strategy_name = strategy_name;
        this.strategy_type = strategy_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28998newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StreamSelectedTaxLotStrategyResponse)) {
            return false;
        }
        StreamSelectedTaxLotStrategyResponse streamSelectedTaxLotStrategyResponse = (StreamSelectedTaxLotStrategyResponse) other;
        return Intrinsics.areEqual(unknownFields(), streamSelectedTaxLotStrategyResponse.unknownFields()) && Intrinsics.areEqual(this.strategy_name, streamSelectedTaxLotStrategyResponse.strategy_name) && this.strategy_type == streamSelectedTaxLotStrategyResponse.strategy_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.strategy_name.hashCode()) * 37) + this.strategy_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("strategy_name=" + Internal.sanitize(this.strategy_name));
        arrayList.add("strategy_type=" + this.strategy_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "StreamSelectedTaxLotStrategyResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ StreamSelectedTaxLotStrategyResponse copy$default(StreamSelectedTaxLotStrategyResponse streamSelectedTaxLotStrategyResponse, String str, TaxLotStrategyType taxLotStrategyType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = streamSelectedTaxLotStrategyResponse.strategy_name;
        }
        if ((i & 2) != 0) {
            taxLotStrategyType = streamSelectedTaxLotStrategyResponse.strategy_type;
        }
        if ((i & 4) != 0) {
            byteString = streamSelectedTaxLotStrategyResponse.unknownFields();
        }
        return streamSelectedTaxLotStrategyResponse.copy(str, taxLotStrategyType, byteString);
    }

    public final StreamSelectedTaxLotStrategyResponse copy(String strategy_name, TaxLotStrategyType strategy_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(strategy_name, "strategy_name");
        Intrinsics.checkNotNullParameter(strategy_type, "strategy_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StreamSelectedTaxLotStrategyResponse(strategy_name, strategy_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StreamSelectedTaxLotStrategyResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StreamSelectedTaxLotStrategyResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamSelectedTaxLotStrategyResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StreamSelectedTaxLotStrategyResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getStrategy_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getStrategy_name());
                }
                return value.getStrategy_type() != TaxLotStrategyType.TAX_LOT_STRATEGY_TYPE_UNSPECIFIED ? size + TaxLotStrategyType.ADAPTER.encodedSizeWithTag(2, value.getStrategy_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StreamSelectedTaxLotStrategyResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getStrategy_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getStrategy_name());
                }
                if (value.getStrategy_type() != TaxLotStrategyType.TAX_LOT_STRATEGY_TYPE_UNSPECIFIED) {
                    TaxLotStrategyType.ADAPTER.encodeWithTag(writer, 2, (int) value.getStrategy_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StreamSelectedTaxLotStrategyResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getStrategy_type() != TaxLotStrategyType.TAX_LOT_STRATEGY_TYPE_UNSPECIFIED) {
                    TaxLotStrategyType.ADAPTER.encodeWithTag(writer, 2, (int) value.getStrategy_type());
                }
                if (Intrinsics.areEqual(value.getStrategy_name(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getStrategy_name());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamSelectedTaxLotStrategyResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                TaxLotStrategyType taxLotStrategyTypeDecode = TaxLotStrategyType.TAX_LOT_STRATEGY_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new StreamSelectedTaxLotStrategyResponse(strDecode, taxLotStrategyTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        try {
                            taxLotStrategyTypeDecode = TaxLotStrategyType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamSelectedTaxLotStrategyResponse redact(StreamSelectedTaxLotStrategyResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return StreamSelectedTaxLotStrategyResponse.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }
        };
    }
}
