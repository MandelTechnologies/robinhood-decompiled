package black_widow.contracts.mobile_app_chart.proto.p024v1;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
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

/* compiled from: IndicatorParamValidation.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dBA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016JE\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\u001cR\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0011\u0010\r¨\u0006\u001e"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParamValidation;", "Lcom/squareup/wire/Message;", "", "min", "", AnalyticsStrings.MAX_WELCOME_TAG, "precision", "step", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lokio/ByteString;)V", "getMin", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getMax", "getPrecision", "getStep", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lokio/ByteString;)Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParamValidation;", "Companion", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class IndicatorParamValidation extends Message {

    @JvmField
    public static final ProtoAdapter<IndicatorParamValidation> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", schemaIndex = 1, tag = 2)
    private final Double max;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", schemaIndex = 0, tag = 1)
    private final Double min;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", schemaIndex = 2, tag = 3)
    private final Double precision;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", schemaIndex = 3, tag = 4)
    private final Double step;

    public IndicatorParamValidation() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8605newBuilder();
    }

    public final Double getMin() {
        return this.min;
    }

    public final Double getMax() {
        return this.max;
    }

    public final Double getPrecision() {
        return this.precision;
    }

    public final Double getStep() {
        return this.step;
    }

    public /* synthetic */ IndicatorParamValidation(Double d, Double d2, Double d3, Double d4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : d2, (i & 4) != 0 ? null : d3, (i & 8) != 0 ? null : d4, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndicatorParamValidation(Double d, Double d2, Double d3, Double d4, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.min = d;
        this.max = d2;
        this.precision = d3;
        this.step = d4;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8605newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof IndicatorParamValidation)) {
            return false;
        }
        IndicatorParamValidation indicatorParamValidation = (IndicatorParamValidation) other;
        return Intrinsics.areEqual(unknownFields(), indicatorParamValidation.unknownFields()) && Intrinsics.areEqual(this.min, indicatorParamValidation.min) && Intrinsics.areEqual(this.max, indicatorParamValidation.max) && Intrinsics.areEqual(this.precision, indicatorParamValidation.precision) && Intrinsics.areEqual(this.step, indicatorParamValidation.step);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Double d = this.min;
        int iHashCode2 = (iHashCode + (d != null ? d.hashCode() : 0)) * 37;
        Double d2 = this.max;
        int iHashCode3 = (iHashCode2 + (d2 != null ? d2.hashCode() : 0)) * 37;
        Double d3 = this.precision;
        int iHashCode4 = (iHashCode3 + (d3 != null ? d3.hashCode() : 0)) * 37;
        Double d4 = this.step;
        int iHashCode5 = iHashCode4 + (d4 != null ? d4.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Double d = this.min;
        if (d != null) {
            arrayList.add("min=" + d);
        }
        Double d2 = this.max;
        if (d2 != null) {
            arrayList.add("max=" + d2);
        }
        Double d3 = this.precision;
        if (d3 != null) {
            arrayList.add("precision=" + d3);
        }
        Double d4 = this.step;
        if (d4 != null) {
            arrayList.add("step=" + d4);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "IndicatorParamValidation{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ IndicatorParamValidation copy$default(IndicatorParamValidation indicatorParamValidation, Double d, Double d2, Double d3, Double d4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            d = indicatorParamValidation.min;
        }
        if ((i & 2) != 0) {
            d2 = indicatorParamValidation.max;
        }
        if ((i & 4) != 0) {
            d3 = indicatorParamValidation.precision;
        }
        if ((i & 8) != 0) {
            d4 = indicatorParamValidation.step;
        }
        if ((i & 16) != 0) {
            byteString = indicatorParamValidation.unknownFields();
        }
        ByteString byteString2 = byteString;
        Double d5 = d3;
        return indicatorParamValidation.copy(d, d2, d5, d4, byteString2);
    }

    public final IndicatorParamValidation copy(Double min, Double max, Double precision, Double step, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new IndicatorParamValidation(min, max, precision, step, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(IndicatorParamValidation.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<IndicatorParamValidation>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: black_widow.contracts.mobile_app_chart.proto.v1.IndicatorParamValidation$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(IndicatorParamValidation value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<Double> protoAdapter = ProtoAdapter.DOUBLE;
                return size + protoAdapter.encodedSizeWithTag(1, value.getMin()) + protoAdapter.encodedSizeWithTag(2, value.getMax()) + protoAdapter.encodedSizeWithTag(3, value.getPrecision()) + protoAdapter.encodedSizeWithTag(4, value.getStep());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, IndicatorParamValidation value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<Double> protoAdapter = ProtoAdapter.DOUBLE;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getMin());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getMax());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getPrecision());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getStep());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, IndicatorParamValidation value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<Double> protoAdapter = ProtoAdapter.DOUBLE;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getStep());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getPrecision());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getMax());
                protoAdapter.encodeWithTag(writer, 1, (int) value.getMin());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public IndicatorParamValidation redact(IndicatorParamValidation value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return IndicatorParamValidation.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public IndicatorParamValidation decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Double dDecode = null;
                Double dDecode2 = null;
                Double dDecode3 = null;
                Double dDecode4 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new IndicatorParamValidation(dDecode, dDecode2, dDecode3, dDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        dDecode = ProtoAdapter.DOUBLE.decode(reader);
                    } else if (iNextTag == 2) {
                        dDecode2 = ProtoAdapter.DOUBLE.decode(reader);
                    } else if (iNextTag == 3) {
                        dDecode3 = ProtoAdapter.DOUBLE.decode(reader);
                    } else if (iNextTag == 4) {
                        dDecode4 = ProtoAdapter.DOUBLE.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
