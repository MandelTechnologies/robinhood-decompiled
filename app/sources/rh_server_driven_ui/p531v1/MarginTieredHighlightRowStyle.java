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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: MarginTieredHighlightRowStyle.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J4\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m3636d2 = {"Lrh_server_driven_ui/v1/MarginTieredHighlightRowStyle;", "Lcom/squareup/wire/Message;", "", "unspecified", "Lrh_server_driven_ui/v1/Unspecified;", "solid_color_background", "Lrh_server_driven_ui/v1/SolidColorBackground;", "opacity_reduced_background_with_border", "Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorder;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/Unspecified;Lrh_server_driven_ui/v1/SolidColorBackground;Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorder;Lokio/ByteString;)V", "getUnspecified", "()Lrh_server_driven_ui/v1/Unspecified;", "getSolid_color_background", "()Lrh_server_driven_ui/v1/SolidColorBackground;", "getOpacity_reduced_background_with_border", "()Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorder;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class MarginTieredHighlightRowStyle extends Message {

    @JvmField
    public static final ProtoAdapter<MarginTieredHighlightRowStyle> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.OpacityReduceBackgroundWithBorder#ADAPTER", jsonName = "opacityReducedBackgroundWithBorder", oneofName = "highlight_row_style", schemaIndex = 2, tag = 3)
    private final OpacityReduceBackgroundWithBorder opacity_reduced_background_with_border;

    @WireField(adapter = "rh_server_driven_ui.v1.SolidColorBackground#ADAPTER", jsonName = "solidColorBackground", oneofName = "highlight_row_style", schemaIndex = 1, tag = 2)
    private final SolidColorBackground solid_color_background;

    @WireField(adapter = "rh_server_driven_ui.v1.Unspecified#ADAPTER", oneofName = "highlight_row_style", schemaIndex = 0, tag = 1)
    private final Unspecified unspecified;

    public MarginTieredHighlightRowStyle() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29776newBuilder();
    }

    public final Unspecified getUnspecified() {
        return this.unspecified;
    }

    public final SolidColorBackground getSolid_color_background() {
        return this.solid_color_background;
    }

    public final OpacityReduceBackgroundWithBorder getOpacity_reduced_background_with_border() {
        return this.opacity_reduced_background_with_border;
    }

    public /* synthetic */ MarginTieredHighlightRowStyle(Unspecified unspecified, SolidColorBackground solidColorBackground, OpacityReduceBackgroundWithBorder opacityReduceBackgroundWithBorder, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : unspecified, (i & 2) != 0 ? null : solidColorBackground, (i & 4) != 0 ? null : opacityReduceBackgroundWithBorder, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginTieredHighlightRowStyle(Unspecified unspecified, SolidColorBackground solidColorBackground, OpacityReduceBackgroundWithBorder opacityReduceBackgroundWithBorder, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.unspecified = unspecified;
        this.solid_color_background = solidColorBackground;
        this.opacity_reduced_background_with_border = opacityReduceBackgroundWithBorder;
        if (Internal.countNonNull(unspecified, solidColorBackground, opacityReduceBackgroundWithBorder) > 1) {
            throw new IllegalArgumentException("At most one of unspecified, solid_color_background, opacity_reduced_background_with_border may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29776newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MarginTieredHighlightRowStyle)) {
            return false;
        }
        MarginTieredHighlightRowStyle marginTieredHighlightRowStyle = (MarginTieredHighlightRowStyle) other;
        return Intrinsics.areEqual(unknownFields(), marginTieredHighlightRowStyle.unknownFields()) && Intrinsics.areEqual(this.unspecified, marginTieredHighlightRowStyle.unspecified) && Intrinsics.areEqual(this.solid_color_background, marginTieredHighlightRowStyle.solid_color_background) && Intrinsics.areEqual(this.opacity_reduced_background_with_border, marginTieredHighlightRowStyle.opacity_reduced_background_with_border);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Unspecified unspecified = this.unspecified;
        int iHashCode2 = (iHashCode + (unspecified != null ? unspecified.hashCode() : 0)) * 37;
        SolidColorBackground solidColorBackground = this.solid_color_background;
        int iHashCode3 = (iHashCode2 + (solidColorBackground != null ? solidColorBackground.hashCode() : 0)) * 37;
        OpacityReduceBackgroundWithBorder opacityReduceBackgroundWithBorder = this.opacity_reduced_background_with_border;
        int iHashCode4 = iHashCode3 + (opacityReduceBackgroundWithBorder != null ? opacityReduceBackgroundWithBorder.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Unspecified unspecified = this.unspecified;
        if (unspecified != null) {
            arrayList.add("unspecified=" + unspecified);
        }
        SolidColorBackground solidColorBackground = this.solid_color_background;
        if (solidColorBackground != null) {
            arrayList.add("solid_color_background=" + solidColorBackground);
        }
        OpacityReduceBackgroundWithBorder opacityReduceBackgroundWithBorder = this.opacity_reduced_background_with_border;
        if (opacityReduceBackgroundWithBorder != null) {
            arrayList.add("opacity_reduced_background_with_border=" + opacityReduceBackgroundWithBorder);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MarginTieredHighlightRowStyle{", "}", 0, null, null, 56, null);
    }

    public final MarginTieredHighlightRowStyle copy(Unspecified unspecified, SolidColorBackground solid_color_background, OpacityReduceBackgroundWithBorder opacity_reduced_background_with_border, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MarginTieredHighlightRowStyle(unspecified, solid_color_background, opacity_reduced_background_with_border, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MarginTieredHighlightRowStyle.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MarginTieredHighlightRowStyle>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.MarginTieredHighlightRowStyle$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MarginTieredHighlightRowStyle value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + Unspecified.ADAPTER.encodedSizeWithTag(1, value.getUnspecified()) + SolidColorBackground.ADAPTER.encodedSizeWithTag(2, value.getSolid_color_background()) + OpacityReduceBackgroundWithBorder.ADAPTER.encodedSizeWithTag(3, value.getOpacity_reduced_background_with_border());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MarginTieredHighlightRowStyle value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                Unspecified.ADAPTER.encodeWithTag(writer, 1, (int) value.getUnspecified());
                SolidColorBackground.ADAPTER.encodeWithTag(writer, 2, (int) value.getSolid_color_background());
                OpacityReduceBackgroundWithBorder.ADAPTER.encodeWithTag(writer, 3, (int) value.getOpacity_reduced_background_with_border());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MarginTieredHighlightRowStyle value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                OpacityReduceBackgroundWithBorder.ADAPTER.encodeWithTag(writer, 3, (int) value.getOpacity_reduced_background_with_border());
                SolidColorBackground.ADAPTER.encodeWithTag(writer, 2, (int) value.getSolid_color_background());
                Unspecified.ADAPTER.encodeWithTag(writer, 1, (int) value.getUnspecified());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MarginTieredHighlightRowStyle redact(MarginTieredHighlightRowStyle value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Unspecified unspecified = value.getUnspecified();
                Unspecified unspecifiedRedact = unspecified != null ? Unspecified.ADAPTER.redact(unspecified) : null;
                SolidColorBackground solid_color_background = value.getSolid_color_background();
                SolidColorBackground solidColorBackgroundRedact = solid_color_background != null ? SolidColorBackground.ADAPTER.redact(solid_color_background) : null;
                OpacityReduceBackgroundWithBorder opacity_reduced_background_with_border = value.getOpacity_reduced_background_with_border();
                return value.copy(unspecifiedRedact, solidColorBackgroundRedact, opacity_reduced_background_with_border != null ? OpacityReduceBackgroundWithBorder.ADAPTER.redact(opacity_reduced_background_with_border) : null, ByteString.EMPTY);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MarginTieredHighlightRowStyle decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Unspecified unspecifiedDecode = null;
                SolidColorBackground solidColorBackgroundDecode = null;
                OpacityReduceBackgroundWithBorder opacityReduceBackgroundWithBorderDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new MarginTieredHighlightRowStyle(unspecifiedDecode, solidColorBackgroundDecode, opacityReduceBackgroundWithBorderDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        unspecifiedDecode = Unspecified.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        solidColorBackgroundDecode = SolidColorBackground.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        opacityReduceBackgroundWithBorderDecode = OpacityReduceBackgroundWithBorder.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
