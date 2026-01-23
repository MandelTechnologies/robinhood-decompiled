package options_product.service;

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

/* compiled from: SbsChainCustomization.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Loptions_product/service/SbsChainCustomization;", "Lcom/squareup/wire/Message;", "", "metric", "Loptions_product/service/MetricType;", "enabled", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Loptions_product/service/MetricType;ZLokio/ByteString;)V", "getMetric", "()Loptions_product/service/MetricType;", "getEnabled", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "options_product.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class SbsChainCustomization extends Message {

    @JvmField
    public static final ProtoAdapter<SbsChainCustomization> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final boolean enabled;

    @WireField(adapter = "options_product.service.MetricType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final MetricType metric;

    public SbsChainCustomization() {
        this(null, false, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29557newBuilder();
    }

    public final MetricType getMetric() {
        return this.metric;
    }

    public /* synthetic */ SbsChainCustomization(MetricType metricType, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MetricType.METRIC_TYPE_UNSPECIFIED : metricType, (i & 2) != 0 ? false : z, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SbsChainCustomization(MetricType metric, boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(metric, "metric");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.metric = metric;
        this.enabled = z;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29557newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SbsChainCustomization)) {
            return false;
        }
        SbsChainCustomization sbsChainCustomization = (SbsChainCustomization) other;
        return Intrinsics.areEqual(unknownFields(), sbsChainCustomization.unknownFields()) && this.metric == sbsChainCustomization.metric && this.enabled == sbsChainCustomization.enabled;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.metric.hashCode()) * 37) + Boolean.hashCode(this.enabled);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("metric=" + this.metric);
        arrayList.add("enabled=" + this.enabled);
        return CollectionsKt.joinToString$default(arrayList, ", ", "SbsChainCustomization{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ SbsChainCustomization copy$default(SbsChainCustomization sbsChainCustomization, MetricType metricType, boolean z, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            metricType = sbsChainCustomization.metric;
        }
        if ((i & 2) != 0) {
            z = sbsChainCustomization.enabled;
        }
        if ((i & 4) != 0) {
            byteString = sbsChainCustomization.unknownFields();
        }
        return sbsChainCustomization.copy(metricType, z, byteString);
    }

    public final SbsChainCustomization copy(MetricType metric, boolean enabled, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(metric, "metric");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SbsChainCustomization(metric, enabled, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SbsChainCustomization.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SbsChainCustomization>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: options_product.service.SbsChainCustomization$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SbsChainCustomization value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getMetric() != MetricType.METRIC_TYPE_UNSPECIFIED) {
                    size += MetricType.ADAPTER.encodedSizeWithTag(1, value.getMetric());
                }
                return value.getEnabled() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getEnabled())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SbsChainCustomization value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getMetric() != MetricType.METRIC_TYPE_UNSPECIFIED) {
                    MetricType.ADAPTER.encodeWithTag(writer, 1, (int) value.getMetric());
                }
                if (value.getEnabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getEnabled()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SbsChainCustomization value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getEnabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getEnabled()));
                }
                if (value.getMetric() != MetricType.METRIC_TYPE_UNSPECIFIED) {
                    MetricType.ADAPTER.encodeWithTag(writer, 1, (int) value.getMetric());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SbsChainCustomization decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                MetricType metricTypeDecode = MetricType.METRIC_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                boolean zBooleanValue = false;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new SbsChainCustomization(metricTypeDecode, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            metricTypeDecode = MetricType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SbsChainCustomization redact(SbsChainCustomization value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return SbsChainCustomization.copy$default(value, null, false, ByteString.EMPTY, 3, null);
            }
        };
    }
}
