package advisory.proto.p008v1;

import com.robinhood.android.car.result.CarResultComposable2;
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

/* compiled from: MarkAdvisoryInsightAsSeenRequest.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Ladvisory/proto/v1/MarkAdvisoryInsightAsSeenRequest;", "Lcom/squareup/wire/Message;", "", CarResultComposable2.BODY, "Ladvisory/proto/v1/MarkAdvisoryInsightAsSeenBody;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ladvisory/proto/v1/MarkAdvisoryInsightAsSeenBody;Lokio/ByteString;)V", "getBody", "()Ladvisory/proto/v1/MarkAdvisoryInsightAsSeenBody;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class MarkAdvisoryInsightAsSeenRequest extends Message {

    @JvmField
    public static final ProtoAdapter<MarkAdvisoryInsightAsSeenRequest> ADAPTER;

    @WireField(adapter = "advisory.proto.v1.MarkAdvisoryInsightAsSeenBody#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final MarkAdvisoryInsightAsSeenBody body;

    /* JADX WARN: Multi-variable type inference failed */
    public MarkAdvisoryInsightAsSeenRequest() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4517newBuilder();
    }

    public final MarkAdvisoryInsightAsSeenBody getBody() {
        return this.body;
    }

    public /* synthetic */ MarkAdvisoryInsightAsSeenRequest(MarkAdvisoryInsightAsSeenBody markAdvisoryInsightAsSeenBody, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : markAdvisoryInsightAsSeenBody, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarkAdvisoryInsightAsSeenRequest(MarkAdvisoryInsightAsSeenBody markAdvisoryInsightAsSeenBody, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.body = markAdvisoryInsightAsSeenBody;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4517newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MarkAdvisoryInsightAsSeenRequest)) {
            return false;
        }
        MarkAdvisoryInsightAsSeenRequest markAdvisoryInsightAsSeenRequest = (MarkAdvisoryInsightAsSeenRequest) other;
        return Intrinsics.areEqual(unknownFields(), markAdvisoryInsightAsSeenRequest.unknownFields()) && Intrinsics.areEqual(this.body, markAdvisoryInsightAsSeenRequest.body);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        MarkAdvisoryInsightAsSeenBody markAdvisoryInsightAsSeenBody = this.body;
        int iHashCode2 = iHashCode + (markAdvisoryInsightAsSeenBody != null ? markAdvisoryInsightAsSeenBody.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        MarkAdvisoryInsightAsSeenBody markAdvisoryInsightAsSeenBody = this.body;
        if (markAdvisoryInsightAsSeenBody != null) {
            arrayList.add("body=" + markAdvisoryInsightAsSeenBody);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MarkAdvisoryInsightAsSeenRequest{", "}", 0, null, null, 56, null);
    }

    public final MarkAdvisoryInsightAsSeenRequest copy(MarkAdvisoryInsightAsSeenBody body, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MarkAdvisoryInsightAsSeenRequest(body, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MarkAdvisoryInsightAsSeenRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MarkAdvisoryInsightAsSeenRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.MarkAdvisoryInsightAsSeenRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MarkAdvisoryInsightAsSeenRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getBody() != null ? size + MarkAdvisoryInsightAsSeenBody.ADAPTER.encodedSizeWithTag(1, value.getBody()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MarkAdvisoryInsightAsSeenRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getBody() != null) {
                    MarkAdvisoryInsightAsSeenBody.ADAPTER.encodeWithTag(writer, 1, (int) value.getBody());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MarkAdvisoryInsightAsSeenRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getBody() != null) {
                    MarkAdvisoryInsightAsSeenBody.ADAPTER.encodeWithTag(writer, 1, (int) value.getBody());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MarkAdvisoryInsightAsSeenRequest redact(MarkAdvisoryInsightAsSeenRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                MarkAdvisoryInsightAsSeenBody body = value.getBody();
                return value.copy(body != null ? MarkAdvisoryInsightAsSeenBody.ADAPTER.redact(body) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public MarkAdvisoryInsightAsSeenRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                MarkAdvisoryInsightAsSeenBody markAdvisoryInsightAsSeenBodyDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new MarkAdvisoryInsightAsSeenRequest(markAdvisoryInsightAsSeenBodyDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        markAdvisoryInsightAsSeenBodyDecode = MarkAdvisoryInsightAsSeenBody.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
