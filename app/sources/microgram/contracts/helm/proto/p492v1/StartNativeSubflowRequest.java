package microgram.contracts.helm.proto.p492v1;

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

/* compiled from: StartNativeSubflowRequest.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lmicrogram/contracts/helm/proto/v1/StartNativeSubflowRequest;", "Lcom/squareup/wire/Message;", "", "subflow_id", "", "flow_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getSubflow_id", "()Ljava/lang/String;", "getFlow_id", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "helm.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class StartNativeSubflowRequest extends Message {

    @JvmField
    public static final ProtoAdapter<StartNativeSubflowRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "flowId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String flow_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "subflowId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String subflow_id;

    public StartNativeSubflowRequest() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ StartNativeSubflowRequest(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29115newBuilder();
    }

    public final String getSubflow_id() {
        return this.subflow_id;
    }

    public final String getFlow_id() {
        return this.flow_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartNativeSubflowRequest(String subflow_id, String flow_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(subflow_id, "subflow_id");
        Intrinsics.checkNotNullParameter(flow_id, "flow_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.subflow_id = subflow_id;
        this.flow_id = flow_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29115newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StartNativeSubflowRequest)) {
            return false;
        }
        StartNativeSubflowRequest startNativeSubflowRequest = (StartNativeSubflowRequest) other;
        return Intrinsics.areEqual(unknownFields(), startNativeSubflowRequest.unknownFields()) && Intrinsics.areEqual(this.subflow_id, startNativeSubflowRequest.subflow_id) && Intrinsics.areEqual(this.flow_id, startNativeSubflowRequest.flow_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.subflow_id.hashCode()) * 37) + this.flow_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("subflow_id=" + Internal.sanitize(this.subflow_id));
        arrayList.add("flow_id=" + Internal.sanitize(this.flow_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "StartNativeSubflowRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ StartNativeSubflowRequest copy$default(StartNativeSubflowRequest startNativeSubflowRequest, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = startNativeSubflowRequest.subflow_id;
        }
        if ((i & 2) != 0) {
            str2 = startNativeSubflowRequest.flow_id;
        }
        if ((i & 4) != 0) {
            byteString = startNativeSubflowRequest.unknownFields();
        }
        return startNativeSubflowRequest.copy(str, str2, byteString);
    }

    public final StartNativeSubflowRequest copy(String subflow_id, String flow_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(subflow_id, "subflow_id");
        Intrinsics.checkNotNullParameter(flow_id, "flow_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StartNativeSubflowRequest(subflow_id, flow_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StartNativeSubflowRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StartNativeSubflowRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.helm.proto.v1.StartNativeSubflowRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StartNativeSubflowRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getSubflow_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getSubflow_id());
                }
                return !Intrinsics.areEqual(value.getFlow_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getFlow_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StartNativeSubflowRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getSubflow_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getSubflow_id());
                }
                if (!Intrinsics.areEqual(value.getFlow_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getFlow_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StartNativeSubflowRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getFlow_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getFlow_id());
                }
                if (Intrinsics.areEqual(value.getSubflow_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getSubflow_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StartNativeSubflowRequest redact(StartNativeSubflowRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return StartNativeSubflowRequest.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StartNativeSubflowRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new StartNativeSubflowRequest(strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
