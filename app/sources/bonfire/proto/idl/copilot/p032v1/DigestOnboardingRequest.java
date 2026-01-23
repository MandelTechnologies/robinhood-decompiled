package bonfire.proto.idl.copilot.p032v1;

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

/* compiled from: DigestOnboardingRequest.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/DigestOnboardingRequest;", "Lcom/squareup/wire/Message;", "", "flow_type", "Lbonfire/proto/idl/copilot/v1/FlowType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lbonfire/proto/idl/copilot/v1/FlowType;Lokio/ByteString;)V", "getFlow_type", "()Lbonfire/proto/idl/copilot/v1/FlowType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class DigestOnboardingRequest extends Message {

    @JvmField
    public static final ProtoAdapter<DigestOnboardingRequest> ADAPTER;

    @WireField(adapter = "bonfire.proto.idl.copilot.v1.FlowType#ADAPTER", jsonName = "flowType", schemaIndex = 0, tag = 1)
    private final FlowType flow_type;

    /* JADX WARN: Multi-variable type inference failed */
    public DigestOnboardingRequest() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8848newBuilder();
    }

    public final FlowType getFlow_type() {
        return this.flow_type;
    }

    public /* synthetic */ DigestOnboardingRequest(FlowType flowType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : flowType, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DigestOnboardingRequest(FlowType flowType, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.flow_type = flowType;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8848newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DigestOnboardingRequest)) {
            return false;
        }
        DigestOnboardingRequest digestOnboardingRequest = (DigestOnboardingRequest) other;
        return Intrinsics.areEqual(unknownFields(), digestOnboardingRequest.unknownFields()) && this.flow_type == digestOnboardingRequest.flow_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        FlowType flowType = this.flow_type;
        int iHashCode2 = iHashCode + (flowType != null ? flowType.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        FlowType flowType = this.flow_type;
        if (flowType != null) {
            arrayList.add("flow_type=" + flowType);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DigestOnboardingRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ DigestOnboardingRequest copy$default(DigestOnboardingRequest digestOnboardingRequest, FlowType flowType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            flowType = digestOnboardingRequest.flow_type;
        }
        if ((i & 2) != 0) {
            byteString = digestOnboardingRequest.unknownFields();
        }
        return digestOnboardingRequest.copy(flowType, byteString);
    }

    public final DigestOnboardingRequest copy(FlowType flow_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new DigestOnboardingRequest(flow_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DigestOnboardingRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<DigestOnboardingRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.copilot.v1.DigestOnboardingRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DigestOnboardingRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + FlowType.ADAPTER.encodedSizeWithTag(1, value.getFlow_type());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, DigestOnboardingRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                FlowType.ADAPTER.encodeWithTag(writer, 1, (int) value.getFlow_type());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DigestOnboardingRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                FlowType.ADAPTER.encodeWithTag(writer, 1, (int) value.getFlow_type());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DigestOnboardingRequest redact(DigestOnboardingRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return DigestOnboardingRequest.copy$default(value, null, ByteString.EMPTY, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public DigestOnboardingRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                FlowType flowTypeDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new DigestOnboardingRequest(flowTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            flowTypeDecode = FlowType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
