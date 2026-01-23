package bff_money_movement.service.p019v1;

import com.robinhood.utils.extensions.ResourceTypes;
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
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: InvestmentsTrackerRuleMark.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u001f\u001a\u00020\u0002H\u0017J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\nH\u0016JX\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006)"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerRuleMark;", "Lcom/squareup/wire/Message;", "", "axis", "Lbff_money_movement/service/v1/Axis;", "value", "", "start", "end", AnnotatedPrivateKey.LABEL, "", ResourceTypes.STYLE, "Lbff_money_movement/service/v1/LineStyle;", "gradient", "Lbff_money_movement/service/v1/InvestmentsTrackerGradientData;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lbff_money_movement/service/v1/Axis;DDDLjava/lang/String;Lbff_money_movement/service/v1/LineStyle;Lbff_money_movement/service/v1/InvestmentsTrackerGradientData;Lokio/ByteString;)V", "getAxis", "()Lbff_money_movement/service/v1/Axis;", "getValue", "()D", "getStart", "getEnd", "getLabel", "()Ljava/lang/String;", "getStyle", "()Lbff_money_movement/service/v1/LineStyle;", "getGradient", "()Lbff_money_movement/service/v1/InvestmentsTrackerGradientData;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class InvestmentsTrackerRuleMark extends Message {

    @JvmField
    public static final ProtoAdapter<InvestmentsTrackerRuleMark> ADAPTER;

    @WireField(adapter = "bff_money_movement.service.v1.Axis#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Axis axis;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final double end;

    @WireField(adapter = "bff_money_movement.service.v1.InvestmentsTrackerGradientData#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final InvestmentsTrackerGradientData gradient;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String label;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final double start;

    @WireField(adapter = "bff_money_movement.service.v1.LineStyle#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final LineStyle style;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final double value;

    public InvestmentsTrackerRuleMark() {
        this(null, 0.0d, 0.0d, 0.0d, null, null, null, null, 255, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8488newBuilder();
    }

    public final Axis getAxis() {
        return this.axis;
    }

    public /* synthetic */ InvestmentsTrackerRuleMark(Axis axis, double d, double d2, double d3, String str, LineStyle lineStyle, InvestmentsTrackerGradientData investmentsTrackerGradientData, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Axis.AXIS_UNSPECIFIED : axis, (i & 2) != 0 ? 0.0d : d, (i & 4) != 0 ? 0.0d : d2, (i & 8) != 0 ? 0.0d : d3, (i & 16) != 0 ? "" : str, (i & 32) != 0 ? LineStyle.LINE_STYLE_UNSPECIFIED : lineStyle, (i & 64) != 0 ? null : investmentsTrackerGradientData, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    public final double getValue() {
        return this.value;
    }

    public final double getStart() {
        return this.start;
    }

    public final double getEnd() {
        return this.end;
    }

    public final String getLabel() {
        return this.label;
    }

    public final LineStyle getStyle() {
        return this.style;
    }

    public final InvestmentsTrackerGradientData getGradient() {
        return this.gradient;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestmentsTrackerRuleMark(Axis axis, double d, double d2, double d3, String label, LineStyle style, InvestmentsTrackerGradientData investmentsTrackerGradientData, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(axis, "axis");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.axis = axis;
        this.value = d;
        this.start = d2;
        this.end = d3;
        this.label = label;
        this.style = style;
        this.gradient = investmentsTrackerGradientData;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8488newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InvestmentsTrackerRuleMark)) {
            return false;
        }
        InvestmentsTrackerRuleMark investmentsTrackerRuleMark = (InvestmentsTrackerRuleMark) other;
        return Intrinsics.areEqual(unknownFields(), investmentsTrackerRuleMark.unknownFields()) && this.axis == investmentsTrackerRuleMark.axis && this.value == investmentsTrackerRuleMark.value && this.start == investmentsTrackerRuleMark.start && this.end == investmentsTrackerRuleMark.end && Intrinsics.areEqual(this.label, investmentsTrackerRuleMark.label) && this.style == investmentsTrackerRuleMark.style && Intrinsics.areEqual(this.gradient, investmentsTrackerRuleMark.gradient);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((unknownFields().hashCode() * 37) + this.axis.hashCode()) * 37) + Double.hashCode(this.value)) * 37) + Double.hashCode(this.start)) * 37) + Double.hashCode(this.end)) * 37) + this.label.hashCode()) * 37) + this.style.hashCode()) * 37;
        InvestmentsTrackerGradientData investmentsTrackerGradientData = this.gradient;
        int iHashCode2 = iHashCode + (investmentsTrackerGradientData != null ? investmentsTrackerGradientData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("axis=" + this.axis);
        arrayList.add("value=" + this.value);
        arrayList.add("start=" + this.start);
        arrayList.add("end=" + this.end);
        arrayList.add("label=" + Internal.sanitize(this.label));
        arrayList.add("style=" + this.style);
        InvestmentsTrackerGradientData investmentsTrackerGradientData = this.gradient;
        if (investmentsTrackerGradientData != null) {
            arrayList.add("gradient=" + investmentsTrackerGradientData);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InvestmentsTrackerRuleMark{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ InvestmentsTrackerRuleMark copy$default(InvestmentsTrackerRuleMark investmentsTrackerRuleMark, Axis axis, double d, double d2, double d3, String str, LineStyle lineStyle, InvestmentsTrackerGradientData investmentsTrackerGradientData, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            axis = investmentsTrackerRuleMark.axis;
        }
        if ((i & 2) != 0) {
            d = investmentsTrackerRuleMark.value;
        }
        if ((i & 4) != 0) {
            d2 = investmentsTrackerRuleMark.start;
        }
        if ((i & 8) != 0) {
            d3 = investmentsTrackerRuleMark.end;
        }
        if ((i & 16) != 0) {
            str = investmentsTrackerRuleMark.label;
        }
        if ((i & 32) != 0) {
            lineStyle = investmentsTrackerRuleMark.style;
        }
        if ((i & 64) != 0) {
            investmentsTrackerGradientData = investmentsTrackerRuleMark.gradient;
        }
        if ((i & 128) != 0) {
            byteString = investmentsTrackerRuleMark.unknownFields();
        }
        double d4 = d3;
        double d5 = d2;
        return investmentsTrackerRuleMark.copy(axis, d, d5, d4, str, lineStyle, investmentsTrackerGradientData, byteString);
    }

    public final InvestmentsTrackerRuleMark copy(Axis axis, double value, double start, double end, String label, LineStyle style, InvestmentsTrackerGradientData gradient, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(axis, "axis");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new InvestmentsTrackerRuleMark(axis, value, start, end, label, style, gradient, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InvestmentsTrackerRuleMark.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<InvestmentsTrackerRuleMark>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.InvestmentsTrackerRuleMark$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InvestmentsTrackerRuleMark value) {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getAxis() != Axis.AXIS_UNSPECIFIED) {
                    size += Axis.ADAPTER.encodedSizeWithTag(1, value.getAxis());
                }
                if (!Double.valueOf(value.getValue()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(2, Double.valueOf(value.getValue()));
                }
                if (!Double.valueOf(value.getStart()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(3, Double.valueOf(value.getStart()));
                }
                if (!Double.valueOf(value.getEnd()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(4, Double.valueOf(value.getEnd()));
                }
                if (!Intrinsics.areEqual(value.getLabel(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getLabel());
                }
                if (value.getStyle() != LineStyle.LINE_STYLE_UNSPECIFIED) {
                    size += LineStyle.ADAPTER.encodedSizeWithTag(6, value.getStyle());
                }
                return value.getGradient() != null ? size + InvestmentsTrackerGradientData.ADAPTER.encodedSizeWithTag(7, value.getGradient()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InvestmentsTrackerRuleMark value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getAxis() != Axis.AXIS_UNSPECIFIED) {
                    Axis.ADAPTER.encodeWithTag(writer, 1, (int) value.getAxis());
                }
                if (!Double.valueOf(value.getValue()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getValue()));
                }
                if (!Double.valueOf(value.getStart()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getStart()));
                }
                if (!Double.valueOf(value.getEnd()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, (int) Double.valueOf(value.getEnd()));
                }
                if (!Intrinsics.areEqual(value.getLabel(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getLabel());
                }
                if (value.getStyle() != LineStyle.LINE_STYLE_UNSPECIFIED) {
                    LineStyle.ADAPTER.encodeWithTag(writer, 6, (int) value.getStyle());
                }
                if (value.getGradient() != null) {
                    InvestmentsTrackerGradientData.ADAPTER.encodeWithTag(writer, 7, (int) value.getGradient());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InvestmentsTrackerRuleMark value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getGradient() != null) {
                    InvestmentsTrackerGradientData.ADAPTER.encodeWithTag(writer, 7, (int) value.getGradient());
                }
                if (value.getStyle() != LineStyle.LINE_STYLE_UNSPECIFIED) {
                    LineStyle.ADAPTER.encodeWithTag(writer, 6, (int) value.getStyle());
                }
                if (!Intrinsics.areEqual(value.getLabel(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getLabel());
                }
                if (!Double.valueOf(value.getEnd()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, (int) Double.valueOf(value.getEnd()));
                }
                if (!Double.valueOf(value.getStart()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getStart()));
                }
                if (!Double.valueOf(value.getValue()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getValue()));
                }
                if (value.getAxis() != Axis.AXIS_UNSPECIFIED) {
                    Axis.ADAPTER.encodeWithTag(writer, 1, (int) value.getAxis());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerRuleMark decode(ProtoReader reader) throws IOException {
                LineStyle lineStyle;
                InvestmentsTrackerGradientData investmentsTrackerGradientData;
                String str;
                Intrinsics.checkNotNullParameter(reader, "reader");
                Axis axis = Axis.AXIS_UNSPECIFIED;
                LineStyle lineStyle2 = LineStyle.LINE_STYLE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                double dDoubleValue = 0.0d;
                double dDoubleValue2 = 0.0d;
                LineStyle lineStyleDecode = lineStyle2;
                InvestmentsTrackerGradientData investmentsTrackerGradientDataDecode = null;
                Axis axisDecode = axis;
                double dDoubleValue3 = 0.0d;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                lineStyle = lineStyleDecode;
                                investmentsTrackerGradientData = investmentsTrackerGradientDataDecode;
                                try {
                                    axisDecode = Axis.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    str = strDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                                investmentsTrackerGradientDataDecode = investmentsTrackerGradientData;
                                lineStyleDecode = lineStyle;
                                break;
                            case 2:
                                lineStyle = lineStyleDecode;
                                investmentsTrackerGradientData = investmentsTrackerGradientDataDecode;
                                dDoubleValue3 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                investmentsTrackerGradientDataDecode = investmentsTrackerGradientData;
                                lineStyleDecode = lineStyle;
                                break;
                            case 3:
                                lineStyle = lineStyleDecode;
                                investmentsTrackerGradientData = investmentsTrackerGradientDataDecode;
                                dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                investmentsTrackerGradientDataDecode = investmentsTrackerGradientData;
                                lineStyleDecode = lineStyle;
                                break;
                            case 4:
                                lineStyle = lineStyleDecode;
                                investmentsTrackerGradientData = investmentsTrackerGradientDataDecode;
                                dDoubleValue2 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                investmentsTrackerGradientDataDecode = investmentsTrackerGradientData;
                                lineStyleDecode = lineStyle;
                                break;
                            case 5:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                try {
                                    lineStyleDecode = LineStyle.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    lineStyle = lineStyleDecode;
                                    investmentsTrackerGradientData = investmentsTrackerGradientDataDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 7:
                                investmentsTrackerGradientDataDecode = InvestmentsTrackerGradientData.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                lineStyle = lineStyleDecode;
                                investmentsTrackerGradientData = investmentsTrackerGradientDataDecode;
                                str = strDecode;
                                strDecode = str;
                                investmentsTrackerGradientDataDecode = investmentsTrackerGradientData;
                                lineStyleDecode = lineStyle;
                                break;
                        }
                    } else {
                        return new InvestmentsTrackerRuleMark(axisDecode, dDoubleValue3, dDoubleValue, dDoubleValue2, strDecode, lineStyleDecode, investmentsTrackerGradientDataDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerRuleMark redact(InvestmentsTrackerRuleMark value) {
                Intrinsics.checkNotNullParameter(value, "value");
                InvestmentsTrackerGradientData gradient = value.getGradient();
                return InvestmentsTrackerRuleMark.copy$default(value, null, 0.0d, 0.0d, 0.0d, null, null, gradient != null ? InvestmentsTrackerGradientData.ADAPTER.redact(gradient) : null, ByteString.EMPTY, 63, null);
            }
        };
    }
}
