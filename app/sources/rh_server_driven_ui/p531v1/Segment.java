package rh_server_driven_ui.p531v1;

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

/* compiled from: Segment.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB-\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J,\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lrh_server_driven_ui/v1/Segment;", "Lcom/squareup/wire/Message;", "", "points", "", "Lrh_server_driven_ui/v1/Point;", "styles", "Lrh_server_driven_ui/v1/StylesWithStates;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lrh_server_driven_ui/v1/StylesWithStates;Lokio/ByteString;)V", "getStyles", "()Lrh_server_driven_ui/v1/StylesWithStates;", "getPoints", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class Segment extends Message {

    @JvmField
    public static final ProtoAdapter<Segment> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.Point#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<Point> points;

    @WireField(adapter = "rh_server_driven_ui.v1.StylesWithStates#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final StylesWithStates styles;

    public Segment() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29803newBuilder();
    }

    public /* synthetic */ Segment(List list, StylesWithStates stylesWithStates, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : stylesWithStates, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final StylesWithStates getStyles() {
        return this.styles;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Segment(List<Point> points, StylesWithStates stylesWithStates, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.styles = stylesWithStates;
        this.points = Internal.immutableCopyOf("points", points);
    }

    public final List<Point> getPoints() {
        return this.points;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29803newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Segment)) {
            return false;
        }
        Segment segment = (Segment) other;
        return Intrinsics.areEqual(unknownFields(), segment.unknownFields()) && Intrinsics.areEqual(this.points, segment.points) && Intrinsics.areEqual(this.styles, segment.styles);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.points.hashCode()) * 37;
        StylesWithStates stylesWithStates = this.styles;
        int iHashCode2 = iHashCode + (stylesWithStates != null ? stylesWithStates.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.points.isEmpty()) {
            arrayList.add("points=" + this.points);
        }
        StylesWithStates stylesWithStates = this.styles;
        if (stylesWithStates != null) {
            arrayList.add("styles=" + stylesWithStates);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Segment{", "}", 0, null, null, 56, null);
    }

    public final Segment copy(List<Point> points, StylesWithStates styles, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Segment(points, styles, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Segment.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Segment>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.Segment$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Segment value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + Point.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getPoints());
                return value.getStyles() != null ? size + StylesWithStates.ADAPTER.encodedSizeWithTag(2, value.getStyles()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Segment value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                Point.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getPoints());
                if (value.getStyles() != null) {
                    StylesWithStates.ADAPTER.encodeWithTag(writer, 2, (int) value.getStyles());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Segment value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getStyles() != null) {
                    StylesWithStates.ADAPTER.encodeWithTag(writer, 2, (int) value.getStyles());
                }
                Point.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getPoints());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Segment decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                StylesWithStates stylesWithStatesDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Segment(arrayList, stylesWithStatesDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(Point.ADAPTER.decode(reader));
                    } else if (iNextTag == 2) {
                        stylesWithStatesDecode = StylesWithStates.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Segment redact(Segment value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List<Point> listM26823redactElements = Internal.m26823redactElements(value.getPoints(), Point.ADAPTER);
                StylesWithStates styles = value.getStyles();
                return value.copy(listM26823redactElements, styles != null ? StylesWithStates.ADAPTER.redact(styles) : null, ByteString.EMPTY);
            }
        };
    }
}
