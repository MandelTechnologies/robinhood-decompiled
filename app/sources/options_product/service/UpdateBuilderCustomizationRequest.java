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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: UpdateBuilderCustomizationRequest.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, m3636d2 = {"Loptions_product/service/UpdateBuilderCustomizationRequest;", "Lcom/squareup/wire/Message;", "", "strategy_name", "", "metric_one", "metric_two", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getStrategy_name", "()Ljava/lang/String;", "getMetric_one", "getMetric_two", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "options_product.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class UpdateBuilderCustomizationRequest extends Message {

    @JvmField
    public static final ProtoAdapter<UpdateBuilderCustomizationRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "metricOne", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String metric_one;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "metricTwo", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String metric_two;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "strategyName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String strategy_name;

    public UpdateBuilderCustomizationRequest() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ UpdateBuilderCustomizationRequest(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29606newBuilder();
    }

    public final String getStrategy_name() {
        return this.strategy_name;
    }

    public final String getMetric_one() {
        return this.metric_one;
    }

    public final String getMetric_two() {
        return this.metric_two;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateBuilderCustomizationRequest(String strategy_name, String metric_one, String metric_two, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(strategy_name, "strategy_name");
        Intrinsics.checkNotNullParameter(metric_one, "metric_one");
        Intrinsics.checkNotNullParameter(metric_two, "metric_two");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.strategy_name = strategy_name;
        this.metric_one = metric_one;
        this.metric_two = metric_two;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29606newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof UpdateBuilderCustomizationRequest)) {
            return false;
        }
        UpdateBuilderCustomizationRequest updateBuilderCustomizationRequest = (UpdateBuilderCustomizationRequest) other;
        return Intrinsics.areEqual(unknownFields(), updateBuilderCustomizationRequest.unknownFields()) && Intrinsics.areEqual(this.strategy_name, updateBuilderCustomizationRequest.strategy_name) && Intrinsics.areEqual(this.metric_one, updateBuilderCustomizationRequest.metric_one) && Intrinsics.areEqual(this.metric_two, updateBuilderCustomizationRequest.metric_two);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.strategy_name.hashCode()) * 37) + this.metric_one.hashCode()) * 37) + this.metric_two.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("strategy_name=" + Internal.sanitize(this.strategy_name));
        arrayList.add("metric_one=" + Internal.sanitize(this.metric_one));
        arrayList.add("metric_two=" + Internal.sanitize(this.metric_two));
        return CollectionsKt.joinToString$default(arrayList, ", ", "UpdateBuilderCustomizationRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ UpdateBuilderCustomizationRequest copy$default(UpdateBuilderCustomizationRequest updateBuilderCustomizationRequest, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateBuilderCustomizationRequest.strategy_name;
        }
        if ((i & 2) != 0) {
            str2 = updateBuilderCustomizationRequest.metric_one;
        }
        if ((i & 4) != 0) {
            str3 = updateBuilderCustomizationRequest.metric_two;
        }
        if ((i & 8) != 0) {
            byteString = updateBuilderCustomizationRequest.unknownFields();
        }
        return updateBuilderCustomizationRequest.copy(str, str2, str3, byteString);
    }

    public final UpdateBuilderCustomizationRequest copy(String strategy_name, String metric_one, String metric_two, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(strategy_name, "strategy_name");
        Intrinsics.checkNotNullParameter(metric_one, "metric_one");
        Intrinsics.checkNotNullParameter(metric_two, "metric_two");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new UpdateBuilderCustomizationRequest(strategy_name, metric_one, metric_two, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UpdateBuilderCustomizationRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<UpdateBuilderCustomizationRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: options_product.service.UpdateBuilderCustomizationRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(UpdateBuilderCustomizationRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getStrategy_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getStrategy_name());
                }
                if (!Intrinsics.areEqual(value.getMetric_one(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getMetric_one());
                }
                return !Intrinsics.areEqual(value.getMetric_two(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getMetric_two()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, UpdateBuilderCustomizationRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getStrategy_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getStrategy_name());
                }
                if (!Intrinsics.areEqual(value.getMetric_one(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getMetric_one());
                }
                if (!Intrinsics.areEqual(value.getMetric_two(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getMetric_two());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, UpdateBuilderCustomizationRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getMetric_two(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getMetric_two());
                }
                if (!Intrinsics.areEqual(value.getMetric_one(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getMetric_one());
                }
                if (Intrinsics.areEqual(value.getStrategy_name(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getStrategy_name());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UpdateBuilderCustomizationRequest redact(UpdateBuilderCustomizationRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return UpdateBuilderCustomizationRequest.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UpdateBuilderCustomizationRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new UpdateBuilderCustomizationRequest(strDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
