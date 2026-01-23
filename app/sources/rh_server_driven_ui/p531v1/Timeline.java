package rh_server_driven_ui.p531v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import rh_server_driven_ui.p531v1.Timeline;

/* compiled from: Timeline.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003#$%BC\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0002H\u0017J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u000bH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016JG\u0010!\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\"R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, m3636d2 = {"Lrh_server_driven_ui/v1/Timeline;", "Lcom/squareup/wire/Message;", "", "rows", "", "Lrh_server_driven_ui/v1/TimelineRow;", "color_overrides", "Lrh_server_driven_ui/v1/Timeline$ColorOverride;", "web_orientation", "Lrh_server_driven_ui/v1/Timeline$WebOrientation;", "max_lines", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lrh_server_driven_ui/v1/Timeline$ColorOverride;Lrh_server_driven_ui/v1/Timeline$WebOrientation;Ljava/lang/Integer;Lokio/ByteString;)V", "getColor_overrides", "()Lrh_server_driven_ui/v1/Timeline$ColorOverride;", "getWeb_orientation", "()Lrh_server_driven_ui/v1/Timeline$WebOrientation;", "getMax_lines", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRows", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "", "copy", "(Ljava/util/List;Lrh_server_driven_ui/v1/Timeline$ColorOverride;Lrh_server_driven_ui/v1/Timeline$WebOrientation;Ljava/lang/Integer;Lokio/ByteString;)Lrh_server_driven_ui/v1/Timeline;", "Companion", "ColorOverride", "WebOrientation", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class Timeline extends Message {

    @JvmField
    public static final ProtoAdapter<Timeline> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.Timeline$ColorOverride#ADAPTER", jsonName = "colorOverrides", schemaIndex = 1, tag = 2)
    private final ColorOverride color_overrides;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "maxLines", schemaIndex = 3, tag = 4)
    private final Integer max_lines;

    @WireField(adapter = "rh_server_driven_ui.v1.TimelineRow#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<TimelineRow> rows;

    @WireField(adapter = "rh_server_driven_ui.v1.Timeline$WebOrientation#ADAPTER", jsonName = "webOrientation", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final WebOrientation web_orientation;

    public Timeline() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29850newBuilder();
    }

    public /* synthetic */ Timeline(List list, ColorOverride colorOverride, WebOrientation webOrientation, Integer num, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : colorOverride, (i & 4) != 0 ? WebOrientation.WEB_ORIENTATION_UNSPECIFIED : webOrientation, (i & 8) != 0 ? null : num, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final ColorOverride getColor_overrides() {
        return this.color_overrides;
    }

    public final WebOrientation getWeb_orientation() {
        return this.web_orientation;
    }

    public final Integer getMax_lines() {
        return this.max_lines;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Timeline(List<TimelineRow> rows, ColorOverride colorOverride, WebOrientation web_orientation, Integer num, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(web_orientation, "web_orientation");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.color_overrides = colorOverride;
        this.web_orientation = web_orientation;
        this.max_lines = num;
        this.rows = Internal.immutableCopyOf("rows", rows);
    }

    public final List<TimelineRow> getRows() {
        return this.rows;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29850newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Timeline)) {
            return false;
        }
        Timeline timeline = (Timeline) other;
        return Intrinsics.areEqual(unknownFields(), timeline.unknownFields()) && Intrinsics.areEqual(this.rows, timeline.rows) && Intrinsics.areEqual(this.color_overrides, timeline.color_overrides) && this.web_orientation == timeline.web_orientation && Intrinsics.areEqual(this.max_lines, timeline.max_lines);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.rows.hashCode()) * 37;
        ColorOverride colorOverride = this.color_overrides;
        int iHashCode2 = (((iHashCode + (colorOverride != null ? colorOverride.hashCode() : 0)) * 37) + this.web_orientation.hashCode()) * 37;
        Integer num = this.max_lines;
        int iHashCode3 = iHashCode2 + (num != null ? num.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.rows.isEmpty()) {
            arrayList.add("rows=" + this.rows);
        }
        ColorOverride colorOverride = this.color_overrides;
        if (colorOverride != null) {
            arrayList.add("color_overrides=" + colorOverride);
        }
        arrayList.add("web_orientation=" + this.web_orientation);
        Integer num = this.max_lines;
        if (num != null) {
            arrayList.add("max_lines=" + num);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Timeline{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Timeline copy$default(Timeline timeline, List list, ColorOverride colorOverride, WebOrientation webOrientation, Integer num, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = timeline.rows;
        }
        if ((i & 2) != 0) {
            colorOverride = timeline.color_overrides;
        }
        if ((i & 4) != 0) {
            webOrientation = timeline.web_orientation;
        }
        if ((i & 8) != 0) {
            num = timeline.max_lines;
        }
        if ((i & 16) != 0) {
            byteString = timeline.unknownFields();
        }
        ByteString byteString2 = byteString;
        WebOrientation webOrientation2 = webOrientation;
        return timeline.copy(list, colorOverride, webOrientation2, num, byteString2);
    }

    public final Timeline copy(List<TimelineRow> rows, ColorOverride color_overrides, WebOrientation web_orientation, Integer max_lines, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(web_orientation, "web_orientation");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Timeline(rows, color_overrides, web_orientation, max_lines, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Timeline.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Timeline>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.Timeline$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Timeline value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + TimelineRow.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getRows()) + Timeline.ColorOverride.ADAPTER.encodedSizeWithTag(2, value.getColor_overrides());
                if (value.getWeb_orientation() != Timeline.WebOrientation.WEB_ORIENTATION_UNSPECIFIED) {
                    size += Timeline.WebOrientation.ADAPTER.encodedSizeWithTag(3, value.getWeb_orientation());
                }
                return size + ProtoAdapter.INT32.encodedSizeWithTag(4, value.getMax_lines());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Timeline value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                TimelineRow.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getRows());
                Timeline.ColorOverride.ADAPTER.encodeWithTag(writer, 2, (int) value.getColor_overrides());
                if (value.getWeb_orientation() != Timeline.WebOrientation.WEB_ORIENTATION_UNSPECIFIED) {
                    Timeline.WebOrientation.ADAPTER.encodeWithTag(writer, 3, (int) value.getWeb_orientation());
                }
                ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) value.getMax_lines());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Timeline value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) value.getMax_lines());
                if (value.getWeb_orientation() != Timeline.WebOrientation.WEB_ORIENTATION_UNSPECIFIED) {
                    Timeline.WebOrientation.ADAPTER.encodeWithTag(writer, 3, (int) value.getWeb_orientation());
                }
                Timeline.ColorOverride.ADAPTER.encodeWithTag(writer, 2, (int) value.getColor_overrides());
                TimelineRow.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getRows());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Timeline decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                Timeline.WebOrientation webOrientationDecode = Timeline.WebOrientation.WEB_ORIENTATION_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Timeline.ColorOverride colorOverrideDecode = null;
                Integer numDecode = null;
                while (true) {
                    Timeline.WebOrientation webOrientation = webOrientationDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new Timeline(arrayList, colorOverrideDecode, webOrientation, numDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            arrayList.add(TimelineRow.ADAPTER.decode(reader));
                        } else if (iNextTag == 2) {
                            colorOverrideDecode = Timeline.ColorOverride.ADAPTER.decode(reader);
                        } else if (iNextTag == 3) {
                            try {
                                webOrientationDecode = Timeline.WebOrientation.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 4) {
                            numDecode = ProtoAdapter.INT32.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Timeline redact(Timeline value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List listM26823redactElements = Internal.m26823redactElements(value.getRows(), TimelineRow.ADAPTER);
                Timeline.ColorOverride color_overrides = value.getColor_overrides();
                return Timeline.copy$default(value, listM26823redactElements, color_overrides != null ? Timeline.ColorOverride.ADAPTER.redact(color_overrides) : null, null, null, ByteString.EMPTY, 12, null);
            }
        };
    }

    /* compiled from: Timeline.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dBM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016JL\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\nR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001e"}, m3636d2 = {"Lrh_server_driven_ui/v1/Timeline$ColorOverride;", "Lcom/squareup/wire/Message;", "", "incomplete", "Lrh_server_driven_ui/v1/ThemedColor;", "complete", "error", "warning", "ongoing", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/ThemedColor;Lrh_server_driven_ui/v1/ThemedColor;Lrh_server_driven_ui/v1/ThemedColor;Lrh_server_driven_ui/v1/ThemedColor;Lrh_server_driven_ui/v1/ThemedColor;Lokio/ByteString;)V", "getIncomplete", "()Lrh_server_driven_ui/v1/ThemedColor;", "getComplete", "getError", "getWarning", "getOngoing", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ColorOverride extends Message {

        @JvmField
        public static final ProtoAdapter<ColorOverride> ADAPTER;

        @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", schemaIndex = 1, tag = 2)
        private final ThemedColor complete;

        @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", schemaIndex = 2, tag = 3)
        private final ThemedColor error;

        @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", schemaIndex = 0, tag = 1)
        private final ThemedColor incomplete;

        @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", schemaIndex = 4, tag = 5)
        private final ThemedColor ongoing;

        @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", schemaIndex = 3, tag = 4)
        private final ThemedColor warning;

        public ColorOverride() {
            this(null, null, null, null, null, null, 63, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29851newBuilder();
        }

        public final ThemedColor getIncomplete() {
            return this.incomplete;
        }

        public final ThemedColor getComplete() {
            return this.complete;
        }

        public final ThemedColor getError() {
            return this.error;
        }

        public final ThemedColor getWarning() {
            return this.warning;
        }

        public final ThemedColor getOngoing() {
            return this.ongoing;
        }

        public /* synthetic */ ColorOverride(ThemedColor themedColor, ThemedColor themedColor2, ThemedColor themedColor3, ThemedColor themedColor4, ThemedColor themedColor5, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : themedColor, (i & 2) != 0 ? null : themedColor2, (i & 4) != 0 ? null : themedColor3, (i & 8) != 0 ? null : themedColor4, (i & 16) != 0 ? null : themedColor5, (i & 32) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ColorOverride(ThemedColor themedColor, ThemedColor themedColor2, ThemedColor themedColor3, ThemedColor themedColor4, ThemedColor themedColor5, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.incomplete = themedColor;
            this.complete = themedColor2;
            this.error = themedColor3;
            this.warning = themedColor4;
            this.ongoing = themedColor5;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29851newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ColorOverride)) {
                return false;
            }
            ColorOverride colorOverride = (ColorOverride) other;
            return Intrinsics.areEqual(unknownFields(), colorOverride.unknownFields()) && Intrinsics.areEqual(this.incomplete, colorOverride.incomplete) && Intrinsics.areEqual(this.complete, colorOverride.complete) && Intrinsics.areEqual(this.error, colorOverride.error) && Intrinsics.areEqual(this.warning, colorOverride.warning) && Intrinsics.areEqual(this.ongoing, colorOverride.ongoing);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            ThemedColor themedColor = this.incomplete;
            int iHashCode2 = (iHashCode + (themedColor != null ? themedColor.hashCode() : 0)) * 37;
            ThemedColor themedColor2 = this.complete;
            int iHashCode3 = (iHashCode2 + (themedColor2 != null ? themedColor2.hashCode() : 0)) * 37;
            ThemedColor themedColor3 = this.error;
            int iHashCode4 = (iHashCode3 + (themedColor3 != null ? themedColor3.hashCode() : 0)) * 37;
            ThemedColor themedColor4 = this.warning;
            int iHashCode5 = (iHashCode4 + (themedColor4 != null ? themedColor4.hashCode() : 0)) * 37;
            ThemedColor themedColor5 = this.ongoing;
            int iHashCode6 = iHashCode5 + (themedColor5 != null ? themedColor5.hashCode() : 0);
            this.hashCode = iHashCode6;
            return iHashCode6;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            ThemedColor themedColor = this.incomplete;
            if (themedColor != null) {
                arrayList.add("incomplete=" + themedColor);
            }
            ThemedColor themedColor2 = this.complete;
            if (themedColor2 != null) {
                arrayList.add("complete=" + themedColor2);
            }
            ThemedColor themedColor3 = this.error;
            if (themedColor3 != null) {
                arrayList.add("error=" + themedColor3);
            }
            ThemedColor themedColor4 = this.warning;
            if (themedColor4 != null) {
                arrayList.add("warning=" + themedColor4);
            }
            ThemedColor themedColor5 = this.ongoing;
            if (themedColor5 != null) {
                arrayList.add("ongoing=" + themedColor5);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ColorOverride{", "}", 0, null, null, 56, null);
        }

        public final ColorOverride copy(ThemedColor incomplete, ThemedColor complete, ThemedColor error, ThemedColor warning, ThemedColor ongoing, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new ColorOverride(incomplete, complete, error, warning, ongoing, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ColorOverride.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<ColorOverride>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.Timeline$ColorOverride$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(Timeline.ColorOverride value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    ProtoAdapter<ThemedColor> protoAdapter = ThemedColor.ADAPTER;
                    return size + protoAdapter.encodedSizeWithTag(1, value.getIncomplete()) + protoAdapter.encodedSizeWithTag(2, value.getComplete()) + protoAdapter.encodedSizeWithTag(3, value.getError()) + protoAdapter.encodedSizeWithTag(4, value.getWarning()) + protoAdapter.encodedSizeWithTag(5, value.getOngoing());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, Timeline.ColorOverride value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    ProtoAdapter<ThemedColor> protoAdapter = ThemedColor.ADAPTER;
                    protoAdapter.encodeWithTag(writer, 1, (int) value.getIncomplete());
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getComplete());
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getError());
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getWarning());
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getOngoing());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, Timeline.ColorOverride value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter<ThemedColor> protoAdapter = ThemedColor.ADAPTER;
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getOngoing());
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getWarning());
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getError());
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getComplete());
                    protoAdapter.encodeWithTag(writer, 1, (int) value.getIncomplete());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public Timeline.ColorOverride redact(Timeline.ColorOverride value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    ThemedColor incomplete = value.getIncomplete();
                    ThemedColor themedColorRedact = incomplete != null ? ThemedColor.ADAPTER.redact(incomplete) : null;
                    ThemedColor complete = value.getComplete();
                    ThemedColor themedColorRedact2 = complete != null ? ThemedColor.ADAPTER.redact(complete) : null;
                    ThemedColor error = value.getError();
                    ThemedColor themedColorRedact3 = error != null ? ThemedColor.ADAPTER.redact(error) : null;
                    ThemedColor warning = value.getWarning();
                    ThemedColor themedColorRedact4 = warning != null ? ThemedColor.ADAPTER.redact(warning) : null;
                    ThemedColor ongoing = value.getOngoing();
                    return value.copy(themedColorRedact, themedColorRedact2, themedColorRedact3, themedColorRedact4, ongoing != null ? ThemedColor.ADAPTER.redact(ongoing) : null, ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public Timeline.ColorOverride decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    ThemedColor themedColorDecode = null;
                    ThemedColor themedColorDecode2 = null;
                    ThemedColor themedColorDecode3 = null;
                    ThemedColor themedColorDecode4 = null;
                    ThemedColor themedColorDecode5 = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new Timeline.ColorOverride(themedColorDecode, themedColorDecode2, themedColorDecode3, themedColorDecode4, themedColorDecode5, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                        } else if (iNextTag == 2) {
                            themedColorDecode2 = ThemedColor.ADAPTER.decode(reader);
                        } else if (iNextTag == 3) {
                            themedColorDecode3 = ThemedColor.ADAPTER.decode(reader);
                        } else if (iNextTag == 4) {
                            themedColorDecode4 = ThemedColor.ADAPTER.decode(reader);
                        } else if (iNextTag == 5) {
                            themedColorDecode5 = ThemedColor.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            };
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Timeline.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lrh_server_driven_ui/v1/Timeline$WebOrientation;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "WEB_ORIENTATION_UNSPECIFIED", "WEB_ORIENTATION_VERTICAL", "WEB_ORIENTATION_HORIZONTAL_CENTER_ALIGN", "WEB_ORIENTATION_HORIZONTAL_LEFT_ALIGN", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class WebOrientation implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ WebOrientation[] $VALUES;

        @JvmField
        public static final ProtoAdapter<WebOrientation> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final WebOrientation WEB_ORIENTATION_HORIZONTAL_CENTER_ALIGN;
        public static final WebOrientation WEB_ORIENTATION_HORIZONTAL_LEFT_ALIGN;
        public static final WebOrientation WEB_ORIENTATION_UNSPECIFIED;
        public static final WebOrientation WEB_ORIENTATION_VERTICAL;
        private final int value;

        private static final /* synthetic */ WebOrientation[] $values() {
            return new WebOrientation[]{WEB_ORIENTATION_UNSPECIFIED, WEB_ORIENTATION_VERTICAL, WEB_ORIENTATION_HORIZONTAL_CENTER_ALIGN, WEB_ORIENTATION_HORIZONTAL_LEFT_ALIGN};
        }

        @JvmStatic
        public static final WebOrientation fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<WebOrientation> getEntries() {
            return $ENTRIES;
        }

        private WebOrientation(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final WebOrientation webOrientation = new WebOrientation("WEB_ORIENTATION_UNSPECIFIED", 0, 0);
            WEB_ORIENTATION_UNSPECIFIED = webOrientation;
            WEB_ORIENTATION_VERTICAL = new WebOrientation("WEB_ORIENTATION_VERTICAL", 1, 1);
            WEB_ORIENTATION_HORIZONTAL_CENTER_ALIGN = new WebOrientation("WEB_ORIENTATION_HORIZONTAL_CENTER_ALIGN", 2, 2);
            WEB_ORIENTATION_HORIZONTAL_LEFT_ALIGN = new WebOrientation("WEB_ORIENTATION_HORIZONTAL_LEFT_ALIGN", 3, 3);
            WebOrientation[] webOrientationArr$values = $values();
            $VALUES = webOrientationArr$values;
            $ENTRIES = EnumEntries2.enumEntries(webOrientationArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(WebOrientation.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<WebOrientation>(orCreateKotlinClass, syntax, webOrientation) { // from class: rh_server_driven_ui.v1.Timeline$WebOrientation$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public Timeline.WebOrientation fromValue(int value) {
                    return Timeline.WebOrientation.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: Timeline.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrh_server_driven_ui/v1/Timeline$WebOrientation$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrh_server_driven_ui/v1/Timeline$WebOrientation;", "fromValue", "value", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final WebOrientation fromValue(int value) {
                if (value == 0) {
                    return WebOrientation.WEB_ORIENTATION_UNSPECIFIED;
                }
                if (value == 1) {
                    return WebOrientation.WEB_ORIENTATION_VERTICAL;
                }
                if (value == 2) {
                    return WebOrientation.WEB_ORIENTATION_HORIZONTAL_CENTER_ALIGN;
                }
                if (value != 3) {
                    return null;
                }
                return WebOrientation.WEB_ORIENTATION_HORIZONTAL_LEFT_ALIGN;
            }
        }

        public static WebOrientation valueOf(String str) {
            return (WebOrientation) Enum.valueOf(WebOrientation.class, str);
        }

        public static WebOrientation[] values() {
            return (WebOrientation[]) $VALUES.clone();
        }
    }
}
