package crypto_perpetuals.service.p440v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import crypto_perpetuals.common.p435v1.PositionHubComponentType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: GetPositionHubStateResponse.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B!\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u00020\u0002H\u0017J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcrypto_perpetuals/service/v1/GetPositionHubStateResponse;", "Lcom/squareup/wire/Message;", "", "component_types", "", "Lcrypto_perpetuals/common/v1/PositionHubComponentType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lokio/ByteString;)V", "getComponent_types", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "crypto_perpetuals.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class GetPositionHubStateResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetPositionHubStateResponse> ADAPTER;

    @WireField(adapter = "crypto_perpetuals.common.v1.PositionHubComponentType#ADAPTER", jsonName = "componentTypes", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<PositionHubComponentType> component_types;

    /* JADX WARN: Multi-variable type inference failed */
    public GetPositionHubStateResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27877newBuilder();
    }

    public /* synthetic */ GetPositionHubStateResponse(List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPositionHubStateResponse(List<? extends PositionHubComponentType> component_types, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(component_types, "component_types");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.component_types = Internal.immutableCopyOf("component_types", component_types);
    }

    public final List<PositionHubComponentType> getComponent_types() {
        return this.component_types;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27877newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetPositionHubStateResponse)) {
            return false;
        }
        GetPositionHubStateResponse getPositionHubStateResponse = (GetPositionHubStateResponse) other;
        return Intrinsics.areEqual(unknownFields(), getPositionHubStateResponse.unknownFields()) && Intrinsics.areEqual(this.component_types, getPositionHubStateResponse.component_types);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.component_types.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.component_types.isEmpty()) {
            arrayList.add("component_types=" + this.component_types);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetPositionHubStateResponse{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetPositionHubStateResponse copy$default(GetPositionHubStateResponse getPositionHubStateResponse, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getPositionHubStateResponse.component_types;
        }
        if ((i & 2) != 0) {
            byteString = getPositionHubStateResponse.unknownFields();
        }
        return getPositionHubStateResponse.copy(list, byteString);
    }

    public final GetPositionHubStateResponse copy(List<? extends PositionHubComponentType> component_types, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(component_types, "component_types");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetPositionHubStateResponse(component_types, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetPositionHubStateResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetPositionHubStateResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_perpetuals.service.v1.GetPositionHubStateResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetPositionHubStateResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + PositionHubComponentType.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getComponent_types());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetPositionHubStateResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                PositionHubComponentType.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getComponent_types());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetPositionHubStateResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                PositionHubComponentType.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getComponent_types());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetPositionHubStateResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetPositionHubStateResponse(arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            PositionHubComponentType.ADAPTER.tryDecode(reader, arrayList);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetPositionHubStateResponse redact(GetPositionHubStateResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetPositionHubStateResponse.copy$default(value, null, ByteString.EMPTY, 1, null);
            }
        };
    }
}
