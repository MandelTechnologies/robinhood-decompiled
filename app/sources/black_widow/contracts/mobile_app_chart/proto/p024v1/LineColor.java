package black_widow.contracts.mobile_app_chart.proto.p024v1;

import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
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
import rh_server_driven_ui.p531v1.ThemedColor;

/* compiled from: LineColor.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u0006H\u0016J\b\u0010\u001f\u001a\u00020\nH\u0016JE\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010!R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006#"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/LineColor;", "Lcom/squareup/wire/Message;", "", ResourceTypes.COLOR, "Lrh_server_driven_ui/v1/ThemedColor;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "opacity", "", AnnotatedPrivateKey.LABEL, "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/ThemedColor;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Lokio/ByteString;)V", "getColor", "()Lrh_server_driven_ui/v1/ThemedColor;", "getIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOpacity", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLabel", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "(Lrh_server_driven_ui/v1/ThemedColor;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Lokio/ByteString;)Lblack_widow/contracts/mobile_app_chart/proto/v1/LineColor;", "Companion", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class LineColor extends Message {

    @JvmField
    public static final ProtoAdapter<LineColor> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ThemedColor color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 1, tag = 2)
    private final Integer index;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    private final String label;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", schemaIndex = 2, tag = 3)
    private final Double opacity;

    public LineColor() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8620newBuilder();
    }

    public final ThemedColor getColor() {
        return this.color;
    }

    public final Integer getIndex() {
        return this.index;
    }

    public final Double getOpacity() {
        return this.opacity;
    }

    public final String getLabel() {
        return this.label;
    }

    public /* synthetic */ LineColor(ThemedColor themedColor, Integer num, Double d, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : themedColor, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : d, (i & 8) != 0 ? null : str, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LineColor(ThemedColor themedColor, Integer num, Double d, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.color = themedColor;
        this.index = num;
        this.opacity = d;
        this.label = str;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8620newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof LineColor)) {
            return false;
        }
        LineColor lineColor = (LineColor) other;
        return Intrinsics.areEqual(unknownFields(), lineColor.unknownFields()) && Intrinsics.areEqual(this.color, lineColor.color) && Intrinsics.areEqual(this.index, lineColor.index) && Intrinsics.areEqual(this.opacity, lineColor.opacity) && Intrinsics.areEqual(this.label, lineColor.label);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ThemedColor themedColor = this.color;
        int iHashCode2 = (iHashCode + (themedColor != null ? themedColor.hashCode() : 0)) * 37;
        Integer num = this.index;
        int iHashCode3 = (iHashCode2 + (num != null ? num.hashCode() : 0)) * 37;
        Double d = this.opacity;
        int iHashCode4 = (iHashCode3 + (d != null ? d.hashCode() : 0)) * 37;
        String str = this.label;
        int iHashCode5 = iHashCode4 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ThemedColor themedColor = this.color;
        if (themedColor != null) {
            arrayList.add("color=" + themedColor);
        }
        Integer num = this.index;
        if (num != null) {
            arrayList.add("index=" + num);
        }
        Double d = this.opacity;
        if (d != null) {
            arrayList.add("opacity=" + d);
        }
        String str = this.label;
        if (str != null) {
            arrayList.add("label=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LineColor{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ LineColor copy$default(LineColor lineColor, ThemedColor themedColor, Integer num, Double d, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            themedColor = lineColor.color;
        }
        if ((i & 2) != 0) {
            num = lineColor.index;
        }
        if ((i & 4) != 0) {
            d = lineColor.opacity;
        }
        if ((i & 8) != 0) {
            str = lineColor.label;
        }
        if ((i & 16) != 0) {
            byteString = lineColor.unknownFields();
        }
        ByteString byteString2 = byteString;
        Double d2 = d;
        return lineColor.copy(themedColor, num, d2, str, byteString2);
    }

    public final LineColor copy(ThemedColor color, Integer index, Double opacity, String label, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new LineColor(color, index, opacity, label, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(LineColor.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<LineColor>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: black_widow.contracts.mobile_app_chart.proto.v1.LineColor$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(LineColor value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getColor() != null) {
                    size += ThemedColor.ADAPTER.encodedSizeWithTag(1, value.getColor());
                }
                return size + ProtoAdapter.INT32.encodedSizeWithTag(2, value.getIndex()) + ProtoAdapter.DOUBLE.encodedSizeWithTag(3, value.getOpacity()) + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getLabel());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, LineColor value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getColor() != null) {
                    ThemedColor.ADAPTER.encodeWithTag(writer, 1, (int) value.getColor());
                }
                ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) value.getIndex());
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) value.getOpacity());
                ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getLabel());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, LineColor value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getLabel());
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) value.getOpacity());
                ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) value.getIndex());
                if (value.getColor() != null) {
                    ThemedColor.ADAPTER.encodeWithTag(writer, 1, (int) value.getColor());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public LineColor redact(LineColor value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ThemedColor color = value.getColor();
                return LineColor.copy$default(value, color != null ? ThemedColor.ADAPTER.redact(color) : null, null, null, null, ByteString.EMPTY, 14, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public LineColor decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                ThemedColor themedColorDecode = null;
                Integer numDecode = null;
                Double dDecode = null;
                String strDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new LineColor(themedColorDecode, numDecode, dDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        numDecode = ProtoAdapter.INT32.decode(reader);
                    } else if (iNextTag == 3) {
                        dDecode = ProtoAdapter.DOUBLE.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
