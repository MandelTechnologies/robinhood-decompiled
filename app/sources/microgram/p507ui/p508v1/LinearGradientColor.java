package microgram.p507ui.p508v1;

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
import microgram.p507ui.p508v1.LinearGradientColor;
import okio.ByteString;
import rh_server_driven_ui.p531v1.ThemedColor;

/* compiled from: LinearGradientColor.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bB+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J*\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m3636d2 = {"Lmicrogram/ui/v1/LinearGradientColor;", "Lcom/squareup/wire/Message;", "", "angle", "", "color_stops", "", "Lmicrogram/ui/v1/LinearGradientColor$ColorStop;", "unknownFields", "Lokio/ByteString;", "<init>", "(DLjava/util/List;Lokio/ByteString;)V", "getAngle", "()D", "getColor_stops", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "ColorStop", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class LinearGradientColor extends Message {

    @JvmField
    public static final ProtoAdapter<LinearGradientColor> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final double angle;

    @WireField(adapter = "microgram.ui.v1.LinearGradientColor$ColorStop#ADAPTER", jsonName = "colorStops", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<ColorStop> color_stops;

    public LinearGradientColor() {
        this(0.0d, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29255newBuilder();
    }

    public final double getAngle() {
        return this.angle;
    }

    public /* synthetic */ LinearGradientColor(double d, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinearGradientColor(double d, List<ColorStop> color_stops, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(color_stops, "color_stops");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.angle = d;
        this.color_stops = Internal.immutableCopyOf("color_stops", color_stops);
    }

    public final List<ColorStop> getColor_stops() {
        return this.color_stops;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29255newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof LinearGradientColor)) {
            return false;
        }
        LinearGradientColor linearGradientColor = (LinearGradientColor) other;
        return Intrinsics.areEqual(unknownFields(), linearGradientColor.unknownFields()) && this.angle == linearGradientColor.angle && Intrinsics.areEqual(this.color_stops, linearGradientColor.color_stops);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + Double.hashCode(this.angle)) * 37) + this.color_stops.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("angle=" + this.angle);
        if (!this.color_stops.isEmpty()) {
            arrayList.add("color_stops=" + this.color_stops);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LinearGradientColor{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LinearGradientColor copy$default(LinearGradientColor linearGradientColor, double d, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            d = linearGradientColor.angle;
        }
        if ((i & 2) != 0) {
            list = linearGradientColor.color_stops;
        }
        if ((i & 4) != 0) {
            byteString = linearGradientColor.unknownFields();
        }
        return linearGradientColor.copy(d, list, byteString);
    }

    public final LinearGradientColor copy(double angle, List<ColorStop> color_stops, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(color_stops, "color_stops");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new LinearGradientColor(angle, color_stops, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(LinearGradientColor.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<LinearGradientColor>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.ui.v1.LinearGradientColor$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(LinearGradientColor value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Double.valueOf(value.getAngle()).equals(Double.valueOf(0.0d))) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(1, Double.valueOf(value.getAngle()));
                }
                return size + LinearGradientColor.ColorStop.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getColor_stops());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, LinearGradientColor value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Double.valueOf(value.getAngle()).equals(Double.valueOf(0.0d))) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getAngle()));
                }
                LinearGradientColor.ColorStop.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getColor_stops());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, LinearGradientColor value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                LinearGradientColor.ColorStop.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getColor_stops());
                if (Double.valueOf(value.getAngle()).equals(Double.valueOf(0.0d))) {
                    return;
                }
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getAngle()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public LinearGradientColor decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                double dDoubleValue = 0.0d;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new LinearGradientColor(dDoubleValue, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                    } else if (iNextTag == 2) {
                        arrayList.add(LinearGradientColor.ColorStop.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public LinearGradientColor redact(LinearGradientColor value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return LinearGradientColor.copy$default(value, 0.0d, Internal.m26823redactElements(value.getColor_stops(), LinearGradientColor.ColorStop.ADAPTER), ByteString.EMPTY, 1, null);
            }
        };
    }

    /* compiled from: LinearGradientColor.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J&\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/ui/v1/LinearGradientColor$ColorStop;", "Lcom/squareup/wire/Message;", "", ResourceTypes.COLOR, "Lrh_server_driven_ui/v1/ThemedColor;", "stop", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/ThemedColor;DLokio/ByteString;)V", "getColor", "()Lrh_server_driven_ui/v1/ThemedColor;", "getStop", "()D", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ColorStop extends Message {

        @JvmField
        public static final ProtoAdapter<ColorStop> ADAPTER;

        @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final ThemedColor color;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final double stop;

        public ColorStop() {
            this(null, 0.0d, null, 7, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29256newBuilder();
        }

        public final ThemedColor getColor() {
            return this.color;
        }

        public final double getStop() {
            return this.stop;
        }

        public /* synthetic */ ColorStop(ThemedColor themedColor, double d, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : themedColor, (i & 2) != 0 ? 0.0d : d, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ColorStop(ThemedColor themedColor, double d, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.color = themedColor;
            this.stop = d;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29256newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ColorStop)) {
                return false;
            }
            ColorStop colorStop = (ColorStop) other;
            return Intrinsics.areEqual(unknownFields(), colorStop.unknownFields()) && Intrinsics.areEqual(this.color, colorStop.color) && this.stop == colorStop.stop;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            ThemedColor themedColor = this.color;
            int iHashCode2 = ((iHashCode + (themedColor != null ? themedColor.hashCode() : 0)) * 37) + Double.hashCode(this.stop);
            this.hashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            ThemedColor themedColor = this.color;
            if (themedColor != null) {
                arrayList.add("color=" + themedColor);
            }
            arrayList.add("stop=" + this.stop);
            return CollectionsKt.joinToString$default(arrayList, ", ", "ColorStop{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ ColorStop copy$default(ColorStop colorStop, ThemedColor themedColor, double d, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                themedColor = colorStop.color;
            }
            if ((i & 2) != 0) {
                d = colorStop.stop;
            }
            if ((i & 4) != 0) {
                byteString = colorStop.unknownFields();
            }
            return colorStop.copy(themedColor, d, byteString);
        }

        public final ColorStop copy(ThemedColor color, double stop, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new ColorStop(color, stop, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ColorStop.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<ColorStop>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.ui.v1.LinearGradientColor$ColorStop$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(LinearGradientColor.ColorStop value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (value.getColor() != null) {
                        size += ThemedColor.ADAPTER.encodedSizeWithTag(1, value.getColor());
                    }
                    return !Double.valueOf(value.getStop()).equals(Double.valueOf(0.0d)) ? size + ProtoAdapter.DOUBLE.encodedSizeWithTag(2, Double.valueOf(value.getStop())) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, LinearGradientColor.ColorStop value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.getColor() != null) {
                        ThemedColor.ADAPTER.encodeWithTag(writer, 1, (int) value.getColor());
                    }
                    if (!Double.valueOf(value.getStop()).equals(Double.valueOf(0.0d))) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getStop()));
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, LinearGradientColor.ColorStop value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (!Double.valueOf(value.getStop()).equals(Double.valueOf(0.0d))) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getStop()));
                    }
                    if (value.getColor() != null) {
                        ThemedColor.ADAPTER.encodeWithTag(writer, 1, (int) value.getColor());
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public LinearGradientColor.ColorStop redact(LinearGradientColor.ColorStop value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    ThemedColor color = value.getColor();
                    return LinearGradientColor.ColorStop.copy$default(value, color != null ? ThemedColor.ADAPTER.redact(color) : null, 0.0d, ByteString.EMPTY, 2, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public LinearGradientColor.ColorStop decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    ThemedColor themedColorDecode = null;
                    double dDoubleValue = 0.0d;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new LinearGradientColor.ColorStop(themedColorDecode, dDoubleValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                        } else if (iNextTag == 2) {
                            dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            };
        }
    }
}
