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

/* compiled from: InvestmentsTrackerPerformanceChartLine.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB5\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0007H\u0016J4\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerPerformanceChartLine;", "Lcom/squareup/wire/Message;", "", "points", "", "Lbff_money_movement/service/v1/Point2D;", ResourceTypes.COLOR, "", "color_dark", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getColor", "()Ljava/lang/String;", "getColor_dark", "getPoints", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class InvestmentsTrackerPerformanceChartLine extends Message {

    @JvmField
    public static final ProtoAdapter<InvestmentsTrackerPerformanceChartLine> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "colorDark", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String color_dark;

    @WireField(adapter = "bff_money_movement.service.v1.Point2D#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<Point2D> points;

    public InvestmentsTrackerPerformanceChartLine() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8487newBuilder();
    }

    public /* synthetic */ InvestmentsTrackerPerformanceChartLine(List list, String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getColor() {
        return this.color;
    }

    public final String getColor_dark() {
        return this.color_dark;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestmentsTrackerPerformanceChartLine(List<Point2D> points, String color, String color_dark, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(color_dark, "color_dark");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.color = color;
        this.color_dark = color_dark;
        this.points = Internal.immutableCopyOf("points", points);
    }

    public final List<Point2D> getPoints() {
        return this.points;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8487newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InvestmentsTrackerPerformanceChartLine)) {
            return false;
        }
        InvestmentsTrackerPerformanceChartLine investmentsTrackerPerformanceChartLine = (InvestmentsTrackerPerformanceChartLine) other;
        return Intrinsics.areEqual(unknownFields(), investmentsTrackerPerformanceChartLine.unknownFields()) && Intrinsics.areEqual(this.points, investmentsTrackerPerformanceChartLine.points) && Intrinsics.areEqual(this.color, investmentsTrackerPerformanceChartLine.color) && Intrinsics.areEqual(this.color_dark, investmentsTrackerPerformanceChartLine.color_dark);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.points.hashCode()) * 37) + this.color.hashCode()) * 37) + this.color_dark.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.points.isEmpty()) {
            arrayList.add("points=" + this.points);
        }
        arrayList.add("color=" + Internal.sanitize(this.color));
        arrayList.add("color_dark=" + Internal.sanitize(this.color_dark));
        return CollectionsKt.joinToString$default(arrayList, ", ", "InvestmentsTrackerPerformanceChartLine{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InvestmentsTrackerPerformanceChartLine copy$default(InvestmentsTrackerPerformanceChartLine investmentsTrackerPerformanceChartLine, List list, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = investmentsTrackerPerformanceChartLine.points;
        }
        if ((i & 2) != 0) {
            str = investmentsTrackerPerformanceChartLine.color;
        }
        if ((i & 4) != 0) {
            str2 = investmentsTrackerPerformanceChartLine.color_dark;
        }
        if ((i & 8) != 0) {
            byteString = investmentsTrackerPerformanceChartLine.unknownFields();
        }
        return investmentsTrackerPerformanceChartLine.copy(list, str, str2, byteString);
    }

    public final InvestmentsTrackerPerformanceChartLine copy(List<Point2D> points, String color, String color_dark, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(color_dark, "color_dark");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new InvestmentsTrackerPerformanceChartLine(points, color, color_dark, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InvestmentsTrackerPerformanceChartLine.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<InvestmentsTrackerPerformanceChartLine>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.InvestmentsTrackerPerformanceChartLine$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InvestmentsTrackerPerformanceChartLine value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + Point2D.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getPoints());
                if (!Intrinsics.areEqual(value.getColor(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getColor());
                }
                return !Intrinsics.areEqual(value.getColor_dark(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getColor_dark()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InvestmentsTrackerPerformanceChartLine value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                Point2D.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getPoints());
                if (!Intrinsics.areEqual(value.getColor(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getColor());
                }
                if (!Intrinsics.areEqual(value.getColor_dark(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getColor_dark());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InvestmentsTrackerPerformanceChartLine value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getColor_dark(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getColor_dark());
                }
                if (!Intrinsics.areEqual(value.getColor(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getColor());
                }
                Point2D.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getPoints());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerPerformanceChartLine decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new InvestmentsTrackerPerformanceChartLine(arrayList, strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(Point2D.ADAPTER.decode(reader));
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InvestmentsTrackerPerformanceChartLine redact(InvestmentsTrackerPerformanceChartLine value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return InvestmentsTrackerPerformanceChartLine.copy$default(value, Internal.m26823redactElements(value.getPoints(), Point2D.ADAPTER), null, null, ByteString.EMPTY, 6, null);
            }
        };
    }
}
