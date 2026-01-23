package options_product.service;

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

/* compiled from: UpdateSbsChainCustomizationRequest.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B!\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u00020\u0002H\u0017J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Loptions_product/service/UpdateSbsChainCustomizationRequest;", "Lcom/squareup/wire/Message;", "", "enabled_metrics", "", "Loptions_product/service/MetricType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lokio/ByteString;)V", "getEnabled_metrics", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "options_product.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class UpdateSbsChainCustomizationRequest extends Message {

    @JvmField
    public static final ProtoAdapter<UpdateSbsChainCustomizationRequest> ADAPTER;

    @WireField(adapter = "options_product.service.MetricType#ADAPTER", jsonName = "enabledMetrics", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<MetricType> enabled_metrics;

    /* JADX WARN: Multi-variable type inference failed */
    public UpdateSbsChainCustomizationRequest() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29609newBuilder();
    }

    public /* synthetic */ UpdateSbsChainCustomizationRequest(List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateSbsChainCustomizationRequest(List<? extends MetricType> enabled_metrics, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(enabled_metrics, "enabled_metrics");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.enabled_metrics = Internal.immutableCopyOf("enabled_metrics", enabled_metrics);
    }

    public final List<MetricType> getEnabled_metrics() {
        return this.enabled_metrics;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29609newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof UpdateSbsChainCustomizationRequest)) {
            return false;
        }
        UpdateSbsChainCustomizationRequest updateSbsChainCustomizationRequest = (UpdateSbsChainCustomizationRequest) other;
        return Intrinsics.areEqual(unknownFields(), updateSbsChainCustomizationRequest.unknownFields()) && Intrinsics.areEqual(this.enabled_metrics, updateSbsChainCustomizationRequest.enabled_metrics);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.enabled_metrics.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.enabled_metrics.isEmpty()) {
            arrayList.add("enabled_metrics=" + this.enabled_metrics);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UpdateSbsChainCustomizationRequest{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpdateSbsChainCustomizationRequest copy$default(UpdateSbsChainCustomizationRequest updateSbsChainCustomizationRequest, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = updateSbsChainCustomizationRequest.enabled_metrics;
        }
        if ((i & 2) != 0) {
            byteString = updateSbsChainCustomizationRequest.unknownFields();
        }
        return updateSbsChainCustomizationRequest.copy(list, byteString);
    }

    public final UpdateSbsChainCustomizationRequest copy(List<? extends MetricType> enabled_metrics, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(enabled_metrics, "enabled_metrics");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new UpdateSbsChainCustomizationRequest(enabled_metrics, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UpdateSbsChainCustomizationRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<UpdateSbsChainCustomizationRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: options_product.service.UpdateSbsChainCustomizationRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(UpdateSbsChainCustomizationRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + MetricType.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getEnabled_metrics());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, UpdateSbsChainCustomizationRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                MetricType.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getEnabled_metrics());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, UpdateSbsChainCustomizationRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                MetricType.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getEnabled_metrics());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UpdateSbsChainCustomizationRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new UpdateSbsChainCustomizationRequest(arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            MetricType.ADAPTER.tryDecode(reader, arrayList);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UpdateSbsChainCustomizationRequest redact(UpdateSbsChainCustomizationRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return UpdateSbsChainCustomizationRequest.copy$default(value, null, ByteString.EMPTY, 1, null);
            }
        };
    }
}
