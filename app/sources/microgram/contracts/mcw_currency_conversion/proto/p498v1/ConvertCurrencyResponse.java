package microgram.contracts.mcw_currency_conversion.proto.p498v1;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
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

/* compiled from: ConvertCurrencyResponse.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lmicrogram/contracts/mcw_currency_conversion/proto/v1/ConvertCurrencyResponse;", "Lcom/squareup/wire/Message;", "", WebsocketGatewayConstants.DATA_KEY, "Lmicrogram/contracts/mcw_currency_conversion/proto/v1/FxOrderResponse;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lmicrogram/contracts/mcw_currency_conversion/proto/v1/FxOrderResponse;Lokio/ByteString;)V", "getData", "()Lmicrogram/contracts/mcw_currency_conversion/proto/v1/FxOrderResponse;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "microgram.contracts.mcw_currency_conversion.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class ConvertCurrencyResponse extends Message {

    @JvmField
    public static final ProtoAdapter<ConvertCurrencyResponse> ADAPTER;

    @WireField(adapter = "microgram.contracts.mcw_currency_conversion.proto.v1.FxOrderResponse#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final FxOrderResponse data;

    /* JADX WARN: Multi-variable type inference failed */
    public ConvertCurrencyResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29163newBuilder();
    }

    public final FxOrderResponse getData() {
        return this.data;
    }

    public /* synthetic */ ConvertCurrencyResponse(FxOrderResponse fxOrderResponse, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : fxOrderResponse, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConvertCurrencyResponse(FxOrderResponse fxOrderResponse, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.data = fxOrderResponse;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29163newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ConvertCurrencyResponse)) {
            return false;
        }
        ConvertCurrencyResponse convertCurrencyResponse = (ConvertCurrencyResponse) other;
        return Intrinsics.areEqual(unknownFields(), convertCurrencyResponse.unknownFields()) && Intrinsics.areEqual(this.data, convertCurrencyResponse.data);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        FxOrderResponse fxOrderResponse = this.data;
        int iHashCode2 = iHashCode + (fxOrderResponse != null ? fxOrderResponse.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        FxOrderResponse fxOrderResponse = this.data;
        if (fxOrderResponse != null) {
            arrayList.add("data=" + fxOrderResponse);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ConvertCurrencyResponse{", "}", 0, null, null, 56, null);
    }

    public final ConvertCurrencyResponse copy(FxOrderResponse data, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ConvertCurrencyResponse(data, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ConvertCurrencyResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ConvertCurrencyResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.mcw_currency_conversion.proto.v1.ConvertCurrencyResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ConvertCurrencyResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getData() != null ? size + FxOrderResponse.ADAPTER.encodedSizeWithTag(1, value.getData()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ConvertCurrencyResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getData() != null) {
                    FxOrderResponse.ADAPTER.encodeWithTag(writer, 1, (int) value.getData());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ConvertCurrencyResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getData() != null) {
                    FxOrderResponse.ADAPTER.encodeWithTag(writer, 1, (int) value.getData());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ConvertCurrencyResponse redact(ConvertCurrencyResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                FxOrderResponse data = value.getData();
                return value.copy(data != null ? FxOrderResponse.ADAPTER.redact(data) : null, ByteString.EMPTY);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ConvertCurrencyResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                FxOrderResponse fxOrderResponseDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ConvertCurrencyResponse(fxOrderResponseDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        fxOrderResponseDecode = FxOrderResponse.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
