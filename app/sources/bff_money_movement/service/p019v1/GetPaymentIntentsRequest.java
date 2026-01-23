package bff_money_movement.service.p019v1;

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

/* compiled from: GetPaymentIntentsRequest.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016J$\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m3636d2 = {"Lbff_money_movement/service/v1/GetPaymentIntentsRequest;", "Lcom/squareup/wire/Message;", "", "cursor", "", "page_size", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;ILokio/ByteString;)V", "getCursor", "()Ljava/lang/String;", "getPage_size", "()I", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class GetPaymentIntentsRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetPaymentIntentsRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String cursor;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "pageSize", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final int page_size;

    public GetPaymentIntentsRequest() {
        this(null, 0, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8427newBuilder();
    }

    public final String getCursor() {
        return this.cursor;
    }

    public /* synthetic */ GetPaymentIntentsRequest(String str, int i, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final int getPage_size() {
        return this.page_size;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPaymentIntentsRequest(String cursor, int i, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.cursor = cursor;
        this.page_size = i;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8427newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetPaymentIntentsRequest)) {
            return false;
        }
        GetPaymentIntentsRequest getPaymentIntentsRequest = (GetPaymentIntentsRequest) other;
        return Intrinsics.areEqual(unknownFields(), getPaymentIntentsRequest.unknownFields()) && Intrinsics.areEqual(this.cursor, getPaymentIntentsRequest.cursor) && this.page_size == getPaymentIntentsRequest.page_size;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.cursor.hashCode()) * 37) + Integer.hashCode(this.page_size);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("cursor=" + Internal.sanitize(this.cursor));
        arrayList.add("page_size=" + this.page_size);
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetPaymentIntentsRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetPaymentIntentsRequest copy$default(GetPaymentIntentsRequest getPaymentIntentsRequest, String str, int i, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = getPaymentIntentsRequest.cursor;
        }
        if ((i2 & 2) != 0) {
            i = getPaymentIntentsRequest.page_size;
        }
        if ((i2 & 4) != 0) {
            byteString = getPaymentIntentsRequest.unknownFields();
        }
        return getPaymentIntentsRequest.copy(str, i, byteString);
    }

    public final GetPaymentIntentsRequest copy(String cursor, int page_size, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetPaymentIntentsRequest(cursor, page_size, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetPaymentIntentsRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetPaymentIntentsRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.GetPaymentIntentsRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetPaymentIntentsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getCursor(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getCursor());
                }
                return value.getPage_size() != 0 ? size + ProtoAdapter.UINT32.encodedSizeWithTag(2, Integer.valueOf(value.getPage_size())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetPaymentIntentsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getCursor(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCursor());
                }
                if (value.getPage_size() != 0) {
                    ProtoAdapter.UINT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getPage_size()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetPaymentIntentsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getPage_size() != 0) {
                    ProtoAdapter.UINT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getPage_size()));
                }
                if (Intrinsics.areEqual(value.getCursor(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCursor());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetPaymentIntentsRequest redact(GetPaymentIntentsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetPaymentIntentsRequest.copy$default(value, null, 0, ByteString.EMPTY, 3, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetPaymentIntentsRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                int iIntValue = 0;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetPaymentIntentsRequest(strDecode, iIntValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        iIntValue = ProtoAdapter.UINT32.decode(reader).intValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
