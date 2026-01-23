package contracts.crypto.trade.proto.p431v1;

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

/* compiled from: StreamBottomSheetDynamicDataResponse.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/StreamBottomSheetDynamicDataResponse;", "Lcom/squareup/wire/Message;", "", "bottom_sheet_type", "Lcontracts/crypto/trade/proto/v1/BottomSheetType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcontracts/crypto/trade/proto/v1/BottomSheetType;Lokio/ByteString;)V", "getBottom_sheet_type", "()Lcontracts/crypto/trade/proto/v1/BottomSheetType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class StreamBottomSheetDynamicDataResponse extends Message {

    @JvmField
    public static final ProtoAdapter<StreamBottomSheetDynamicDataResponse> ADAPTER;

    @WireField(adapter = "contracts.crypto.trade.proto.v1.BottomSheetType#ADAPTER", jsonName = "bottomSheetType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final BottomSheetType bottom_sheet_type;

    /* JADX WARN: Multi-variable type inference failed */
    public StreamBottomSheetDynamicDataResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27701newBuilder();
    }

    public final BottomSheetType getBottom_sheet_type() {
        return this.bottom_sheet_type;
    }

    public /* synthetic */ StreamBottomSheetDynamicDataResponse(BottomSheetType bottomSheetType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bottomSheetType, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamBottomSheetDynamicDataResponse(BottomSheetType bottomSheetType, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.bottom_sheet_type = bottomSheetType;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27701newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StreamBottomSheetDynamicDataResponse)) {
            return false;
        }
        StreamBottomSheetDynamicDataResponse streamBottomSheetDynamicDataResponse = (StreamBottomSheetDynamicDataResponse) other;
        return Intrinsics.areEqual(unknownFields(), streamBottomSheetDynamicDataResponse.unknownFields()) && Intrinsics.areEqual(this.bottom_sheet_type, streamBottomSheetDynamicDataResponse.bottom_sheet_type);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        BottomSheetType bottomSheetType = this.bottom_sheet_type;
        int iHashCode2 = iHashCode + (bottomSheetType != null ? bottomSheetType.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        BottomSheetType bottomSheetType = this.bottom_sheet_type;
        if (bottomSheetType != null) {
            arrayList.add("bottom_sheet_type=" + bottomSheetType);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StreamBottomSheetDynamicDataResponse{", "}", 0, null, null, 56, null);
    }

    public final StreamBottomSheetDynamicDataResponse copy(BottomSheetType bottom_sheet_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StreamBottomSheetDynamicDataResponse(bottom_sheet_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StreamBottomSheetDynamicDataResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StreamBottomSheetDynamicDataResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.crypto.trade.proto.v1.StreamBottomSheetDynamicDataResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StreamBottomSheetDynamicDataResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getBottom_sheet_type() != null ? size + BottomSheetType.ADAPTER.encodedSizeWithTag(1, value.getBottom_sheet_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StreamBottomSheetDynamicDataResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getBottom_sheet_type() != null) {
                    BottomSheetType.ADAPTER.encodeWithTag(writer, 1, (int) value.getBottom_sheet_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StreamBottomSheetDynamicDataResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getBottom_sheet_type() != null) {
                    BottomSheetType.ADAPTER.encodeWithTag(writer, 1, (int) value.getBottom_sheet_type());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamBottomSheetDynamicDataResponse redact(StreamBottomSheetDynamicDataResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                BottomSheetType bottom_sheet_type = value.getBottom_sheet_type();
                return value.copy(bottom_sheet_type != null ? BottomSheetType.ADAPTER.redact(bottom_sheet_type) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public StreamBottomSheetDynamicDataResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                BottomSheetType bottomSheetTypeDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new StreamBottomSheetDynamicDataResponse(bottomSheetTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        bottomSheetTypeDecode = BottomSheetType.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
