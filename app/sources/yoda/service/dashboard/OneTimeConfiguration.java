package yoda.service.dashboard;

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

/* compiled from: OneTimeConfiguration.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J:\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m3636d2 = {"Lyoda/service/dashboard/OneTimeConfiguration;", "Lcom/squareup/wire/Message;", "", "slider_minimum_value", "", "slider_maximum_value", "slider_increment_value", "projection_values", "Lyoda/service/dashboard/ProjectedValues;", "unknownFields", "Lokio/ByteString;", "<init>", "(DDDLyoda/service/dashboard/ProjectedValues;Lokio/ByteString;)V", "getSlider_minimum_value", "()D", "getSlider_maximum_value", "getSlider_increment_value", "getProjection_values", "()Lyoda/service/dashboard/ProjectedValues;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class OneTimeConfiguration extends Message {

    @JvmField
    public static final ProtoAdapter<OneTimeConfiguration> ADAPTER;

    @WireField(adapter = "yoda.service.dashboard.ProjectedValues#ADAPTER", jsonName = "projectionValues", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final ProjectedValues projection_values;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "sliderIncrementValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final double slider_increment_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "sliderMaximumValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final double slider_maximum_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "sliderMinimumValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final double slider_minimum_value;

    public OneTimeConfiguration() {
        this(0.0d, 0.0d, 0.0d, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m30100newBuilder();
    }

    public final double getSlider_minimum_value() {
        return this.slider_minimum_value;
    }

    public final double getSlider_maximum_value() {
        return this.slider_maximum_value;
    }

    public final double getSlider_increment_value() {
        return this.slider_increment_value;
    }

    public final ProjectedValues getProjection_values() {
        return this.projection_values;
    }

    public /* synthetic */ OneTimeConfiguration(double d, double d2, double d3, ProjectedValues projectedValues, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2, (i & 4) != 0 ? 0.0d : d3, (i & 8) != 0 ? null : projectedValues, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTimeConfiguration(double d, double d2, double d3, ProjectedValues projectedValues, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.slider_minimum_value = d;
        this.slider_maximum_value = d2;
        this.slider_increment_value = d3;
        this.projection_values = projectedValues;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m30100newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OneTimeConfiguration)) {
            return false;
        }
        OneTimeConfiguration oneTimeConfiguration = (OneTimeConfiguration) other;
        return Intrinsics.areEqual(unknownFields(), oneTimeConfiguration.unknownFields()) && this.slider_minimum_value == oneTimeConfiguration.slider_minimum_value && this.slider_maximum_value == oneTimeConfiguration.slider_maximum_value && this.slider_increment_value == oneTimeConfiguration.slider_increment_value && Intrinsics.areEqual(this.projection_values, oneTimeConfiguration.projection_values);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + Double.hashCode(this.slider_minimum_value)) * 37) + Double.hashCode(this.slider_maximum_value)) * 37) + Double.hashCode(this.slider_increment_value)) * 37;
        ProjectedValues projectedValues = this.projection_values;
        int iHashCode2 = iHashCode + (projectedValues != null ? projectedValues.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("slider_minimum_value=" + this.slider_minimum_value);
        arrayList.add("slider_maximum_value=" + this.slider_maximum_value);
        arrayList.add("slider_increment_value=" + this.slider_increment_value);
        ProjectedValues projectedValues = this.projection_values;
        if (projectedValues != null) {
            arrayList.add("projection_values=" + projectedValues);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OneTimeConfiguration{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ OneTimeConfiguration copy$default(OneTimeConfiguration oneTimeConfiguration, double d, double d2, double d3, ProjectedValues projectedValues, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            d = oneTimeConfiguration.slider_minimum_value;
        }
        double d4 = d;
        if ((i & 2) != 0) {
            d2 = oneTimeConfiguration.slider_maximum_value;
        }
        double d5 = d2;
        if ((i & 4) != 0) {
            d3 = oneTimeConfiguration.slider_increment_value;
        }
        return oneTimeConfiguration.copy(d4, d5, d3, (i & 8) != 0 ? oneTimeConfiguration.projection_values : projectedValues, (i & 16) != 0 ? oneTimeConfiguration.unknownFields() : byteString);
    }

    public final OneTimeConfiguration copy(double slider_minimum_value, double slider_maximum_value, double slider_increment_value, ProjectedValues projection_values, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new OneTimeConfiguration(slider_minimum_value, slider_maximum_value, slider_increment_value, projection_values, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OneTimeConfiguration.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<OneTimeConfiguration>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: yoda.service.dashboard.OneTimeConfiguration$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OneTimeConfiguration value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                Double dValueOf = Double.valueOf(value.getSlider_minimum_value());
                Double dValueOf2 = Double.valueOf(0.0d);
                if (!dValueOf.equals(dValueOf2)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(1, Double.valueOf(value.getSlider_minimum_value()));
                }
                if (!Double.valueOf(value.getSlider_maximum_value()).equals(dValueOf2)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(2, Double.valueOf(value.getSlider_maximum_value()));
                }
                if (!Double.valueOf(value.getSlider_increment_value()).equals(dValueOf2)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(3, Double.valueOf(value.getSlider_increment_value()));
                }
                return value.getProjection_values() != null ? size + ProjectedValues.ADAPTER.encodedSizeWithTag(4, value.getProjection_values()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OneTimeConfiguration value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                Double dValueOf = Double.valueOf(value.getSlider_minimum_value());
                Double dValueOf2 = Double.valueOf(0.0d);
                if (!dValueOf.equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getSlider_minimum_value()));
                }
                if (!Double.valueOf(value.getSlider_maximum_value()).equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getSlider_maximum_value()));
                }
                if (!Double.valueOf(value.getSlider_increment_value()).equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getSlider_increment_value()));
                }
                if (value.getProjection_values() != null) {
                    ProjectedValues.ADAPTER.encodeWithTag(writer, 4, (int) value.getProjection_values());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OneTimeConfiguration value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getProjection_values() != null) {
                    ProjectedValues.ADAPTER.encodeWithTag(writer, 4, (int) value.getProjection_values());
                }
                if (!Double.valueOf(value.getSlider_increment_value()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getSlider_increment_value()));
                }
                if (!Double.valueOf(value.getSlider_maximum_value()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getSlider_maximum_value()));
                }
                if (Double.valueOf(value.getSlider_minimum_value()).equals(dValueOf)) {
                    return;
                }
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getSlider_minimum_value()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OneTimeConfiguration redact(OneTimeConfiguration value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ProjectedValues projection_values = value.getProjection_values();
                return OneTimeConfiguration.copy$default(value, 0.0d, 0.0d, 0.0d, projection_values != null ? ProjectedValues.ADAPTER.redact(projection_values) : null, ByteString.EMPTY, 7, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OneTimeConfiguration decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                ProjectedValues projectedValuesDecode = null;
                double dDoubleValue = 0.0d;
                double dDoubleValue2 = 0.0d;
                double dDoubleValue3 = 0.0d;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new OneTimeConfiguration(dDoubleValue, dDoubleValue2, dDoubleValue3, projectedValuesDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                    } else if (iNextTag == 2) {
                        dDoubleValue2 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                    } else if (iNextTag == 3) {
                        dDoubleValue3 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                    } else if (iNextTag == 4) {
                        projectedValuesDecode = ProjectedValues.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
