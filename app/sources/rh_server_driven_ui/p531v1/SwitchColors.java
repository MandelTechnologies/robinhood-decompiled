package rh_server_driven_ui.p531v1;

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

/* compiled from: SwitchColors.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bBA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J@\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001c"}, m3636d2 = {"Lrh_server_driven_ui/v1/SwitchColors;", "Lcom/squareup/wire/Message;", "", "thumb_color", "Lrh_server_driven_ui/v1/ThemedColor;", "track_color", "border_color", "icon_color", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/ThemedColor;Lrh_server_driven_ui/v1/ThemedColor;Lrh_server_driven_ui/v1/ThemedColor;Lrh_server_driven_ui/v1/ThemedColor;Lokio/ByteString;)V", "getThumb_color", "()Lrh_server_driven_ui/v1/ThemedColor;", "getTrack_color", "getBorder_color", "getIcon_color", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class SwitchColors extends Message {

    @JvmField
    public static final ProtoAdapter<SwitchColors> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "borderColor", schemaIndex = 2, tag = 3)
    private final ThemedColor border_color;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "iconColor", schemaIndex = 3, tag = 4)
    private final ThemedColor icon_color;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "thumbColor", schemaIndex = 0, tag = 1)
    private final ThemedColor thumb_color;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "trackColor", schemaIndex = 1, tag = 2)
    private final ThemedColor track_color;

    public SwitchColors() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29822newBuilder();
    }

    public final ThemedColor getThumb_color() {
        return this.thumb_color;
    }

    public final ThemedColor getTrack_color() {
        return this.track_color;
    }

    public final ThemedColor getBorder_color() {
        return this.border_color;
    }

    public final ThemedColor getIcon_color() {
        return this.icon_color;
    }

    public /* synthetic */ SwitchColors(ThemedColor themedColor, ThemedColor themedColor2, ThemedColor themedColor3, ThemedColor themedColor4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : themedColor, (i & 2) != 0 ? null : themedColor2, (i & 4) != 0 ? null : themedColor3, (i & 8) != 0 ? null : themedColor4, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchColors(ThemedColor themedColor, ThemedColor themedColor2, ThemedColor themedColor3, ThemedColor themedColor4, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.thumb_color = themedColor;
        this.track_color = themedColor2;
        this.border_color = themedColor3;
        this.icon_color = themedColor4;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29822newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SwitchColors)) {
            return false;
        }
        SwitchColors switchColors = (SwitchColors) other;
        return Intrinsics.areEqual(unknownFields(), switchColors.unknownFields()) && Intrinsics.areEqual(this.thumb_color, switchColors.thumb_color) && Intrinsics.areEqual(this.track_color, switchColors.track_color) && Intrinsics.areEqual(this.border_color, switchColors.border_color) && Intrinsics.areEqual(this.icon_color, switchColors.icon_color);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ThemedColor themedColor = this.thumb_color;
        int iHashCode2 = (iHashCode + (themedColor != null ? themedColor.hashCode() : 0)) * 37;
        ThemedColor themedColor2 = this.track_color;
        int iHashCode3 = (iHashCode2 + (themedColor2 != null ? themedColor2.hashCode() : 0)) * 37;
        ThemedColor themedColor3 = this.border_color;
        int iHashCode4 = (iHashCode3 + (themedColor3 != null ? themedColor3.hashCode() : 0)) * 37;
        ThemedColor themedColor4 = this.icon_color;
        int iHashCode5 = iHashCode4 + (themedColor4 != null ? themedColor4.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ThemedColor themedColor = this.thumb_color;
        if (themedColor != null) {
            arrayList.add("thumb_color=" + themedColor);
        }
        ThemedColor themedColor2 = this.track_color;
        if (themedColor2 != null) {
            arrayList.add("track_color=" + themedColor2);
        }
        ThemedColor themedColor3 = this.border_color;
        if (themedColor3 != null) {
            arrayList.add("border_color=" + themedColor3);
        }
        ThemedColor themedColor4 = this.icon_color;
        if (themedColor4 != null) {
            arrayList.add("icon_color=" + themedColor4);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SwitchColors{", "}", 0, null, null, 56, null);
    }

    public final SwitchColors copy(ThemedColor thumb_color, ThemedColor track_color, ThemedColor border_color, ThemedColor icon_color, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SwitchColors(thumb_color, track_color, border_color, icon_color, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SwitchColors.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SwitchColors>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.SwitchColors$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SwitchColors value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<ThemedColor> protoAdapter = ThemedColor.ADAPTER;
                return size + protoAdapter.encodedSizeWithTag(1, value.getThumb_color()) + protoAdapter.encodedSizeWithTag(2, value.getTrack_color()) + protoAdapter.encodedSizeWithTag(3, value.getBorder_color()) + protoAdapter.encodedSizeWithTag(4, value.getIcon_color());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SwitchColors value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<ThemedColor> protoAdapter = ThemedColor.ADAPTER;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getThumb_color());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getTrack_color());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getBorder_color());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getIcon_color());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SwitchColors value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<ThemedColor> protoAdapter = ThemedColor.ADAPTER;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getIcon_color());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getBorder_color());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getTrack_color());
                protoAdapter.encodeWithTag(writer, 1, (int) value.getThumb_color());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SwitchColors redact(SwitchColors value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ThemedColor thumb_color = value.getThumb_color();
                ThemedColor themedColorRedact = thumb_color != null ? ThemedColor.ADAPTER.redact(thumb_color) : null;
                ThemedColor track_color = value.getTrack_color();
                ThemedColor themedColorRedact2 = track_color != null ? ThemedColor.ADAPTER.redact(track_color) : null;
                ThemedColor border_color = value.getBorder_color();
                ThemedColor themedColorRedact3 = border_color != null ? ThemedColor.ADAPTER.redact(border_color) : null;
                ThemedColor icon_color = value.getIcon_color();
                return value.copy(themedColorRedact, themedColorRedact2, themedColorRedact3, icon_color != null ? ThemedColor.ADAPTER.redact(icon_color) : null, ByteString.EMPTY);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SwitchColors decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                ThemedColor themedColorDecode = null;
                ThemedColor themedColorDecode2 = null;
                ThemedColor themedColorDecode3 = null;
                ThemedColor themedColorDecode4 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new SwitchColors(themedColorDecode, themedColorDecode2, themedColorDecode3, themedColorDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        themedColorDecode2 = ThemedColor.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        themedColorDecode3 = ThemedColor.ADAPTER.decode(reader);
                    } else if (iNextTag == 4) {
                        themedColorDecode4 = ThemedColor.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
