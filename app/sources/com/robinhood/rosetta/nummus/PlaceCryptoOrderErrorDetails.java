package com.robinhood.rosetta.nummus;

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

/* compiled from: PlaceCryptoOrderErrorDetails.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/PlaceCryptoOrderErrorDetails;", "Lcom/squareup/wire/Message;", "", "order_id", "", "error_type", "Lcom/robinhood/rosetta/nummus/PlaceCryptoOrderErrorType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/nummus/PlaceCryptoOrderErrorType;Lokio/ByteString;)V", "getOrder_id", "()Ljava/lang/String;", "getError_type", "()Lcom/robinhood/rosetta/nummus/PlaceCryptoOrderErrorType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class PlaceCryptoOrderErrorDetails extends Message {

    @JvmField
    public static final ProtoAdapter<PlaceCryptoOrderErrorDetails> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.nummus.PlaceCryptoOrderErrorType#ADAPTER", jsonName = "errorType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final PlaceCryptoOrderErrorType error_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "orderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String order_id;

    public PlaceCryptoOrderErrorDetails() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24737newBuilder();
    }

    public final String getOrder_id() {
        return this.order_id;
    }

    public /* synthetic */ PlaceCryptoOrderErrorDetails(String str, PlaceCryptoOrderErrorType placeCryptoOrderErrorType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? PlaceCryptoOrderErrorType.PLACE_CRYPTO_ORDER_ERROR_UNSPECIFIED : placeCryptoOrderErrorType, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final PlaceCryptoOrderErrorType getError_type() {
        return this.error_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaceCryptoOrderErrorDetails(String order_id, PlaceCryptoOrderErrorType error_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(error_type, "error_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.order_id = order_id;
        this.error_type = error_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24737newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PlaceCryptoOrderErrorDetails)) {
            return false;
        }
        PlaceCryptoOrderErrorDetails placeCryptoOrderErrorDetails = (PlaceCryptoOrderErrorDetails) other;
        return Intrinsics.areEqual(unknownFields(), placeCryptoOrderErrorDetails.unknownFields()) && Intrinsics.areEqual(this.order_id, placeCryptoOrderErrorDetails.order_id) && this.error_type == placeCryptoOrderErrorDetails.error_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.order_id.hashCode()) * 37) + this.error_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("order_id=" + Internal.sanitize(this.order_id));
        arrayList.add("error_type=" + this.error_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "PlaceCryptoOrderErrorDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PlaceCryptoOrderErrorDetails copy$default(PlaceCryptoOrderErrorDetails placeCryptoOrderErrorDetails, String str, PlaceCryptoOrderErrorType placeCryptoOrderErrorType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = placeCryptoOrderErrorDetails.order_id;
        }
        if ((i & 2) != 0) {
            placeCryptoOrderErrorType = placeCryptoOrderErrorDetails.error_type;
        }
        if ((i & 4) != 0) {
            byteString = placeCryptoOrderErrorDetails.unknownFields();
        }
        return placeCryptoOrderErrorDetails.copy(str, placeCryptoOrderErrorType, byteString);
    }

    public final PlaceCryptoOrderErrorDetails copy(String order_id, PlaceCryptoOrderErrorType error_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(error_type, "error_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PlaceCryptoOrderErrorDetails(order_id, error_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PlaceCryptoOrderErrorDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PlaceCryptoOrderErrorDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.nummus.PlaceCryptoOrderErrorDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PlaceCryptoOrderErrorDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getOrder_id());
                }
                return value.getError_type() != PlaceCryptoOrderErrorType.PLACE_CRYPTO_ORDER_ERROR_UNSPECIFIED ? size + PlaceCryptoOrderErrorType.ADAPTER.encodedSizeWithTag(2, value.getError_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PlaceCryptoOrderErrorDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getOrder_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getOrder_id());
                }
                if (value.getError_type() != PlaceCryptoOrderErrorType.PLACE_CRYPTO_ORDER_ERROR_UNSPECIFIED) {
                    PlaceCryptoOrderErrorType.ADAPTER.encodeWithTag(writer, 2, (int) value.getError_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PlaceCryptoOrderErrorDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getError_type() != PlaceCryptoOrderErrorType.PLACE_CRYPTO_ORDER_ERROR_UNSPECIFIED) {
                    PlaceCryptoOrderErrorType.ADAPTER.encodeWithTag(writer, 2, (int) value.getError_type());
                }
                if (Intrinsics.areEqual(value.getOrder_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getOrder_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PlaceCryptoOrderErrorDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                PlaceCryptoOrderErrorType placeCryptoOrderErrorTypeDecode = PlaceCryptoOrderErrorType.PLACE_CRYPTO_ORDER_ERROR_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new PlaceCryptoOrderErrorDetails(strDecode, placeCryptoOrderErrorTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        try {
                            placeCryptoOrderErrorTypeDecode = PlaceCryptoOrderErrorType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PlaceCryptoOrderErrorDetails redact(PlaceCryptoOrderErrorDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return PlaceCryptoOrderErrorDetails.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }
        };
    }
}
