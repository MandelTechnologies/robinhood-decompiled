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
import rh_server_driven_ui.p531v1.OpacityReduceBackgroundWithBorder;

/* compiled from: OpacityReduceBackgroundWithBorder.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001f !BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J@\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, m3636d2 = {"Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorder;", "Lcom/squareup/wire/Message;", "", "background_color", "Lrh_server_driven_ui/v1/ThemedColor;", "highlight_color", "move_upward", "Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorder$MoveUpward;", "move_downward", "Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorder$MoveDownward;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/ThemedColor;Lrh_server_driven_ui/v1/ThemedColor;Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorder$MoveUpward;Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorder$MoveDownward;Lokio/ByteString;)V", "getBackground_color", "()Lrh_server_driven_ui/v1/ThemedColor;", "getHighlight_color", "getMove_upward", "()Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorder$MoveUpward;", "getMove_downward", "()Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorder$MoveDownward;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "MoveUpward", "MoveDownward", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class OpacityReduceBackgroundWithBorder extends Message {

    @JvmField
    public static final ProtoAdapter<OpacityReduceBackgroundWithBorder> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "backgroundColor", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ThemedColor background_color;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "highlightColor", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final ThemedColor highlight_color;

    @WireField(adapter = "rh_server_driven_ui.v1.OpacityReduceBackgroundWithBorder$MoveDownward#ADAPTER", jsonName = "moveDownward", oneofName = "highlight_animation", schemaIndex = 3, tag = 4)
    private final MoveDownward move_downward;

    @WireField(adapter = "rh_server_driven_ui.v1.OpacityReduceBackgroundWithBorder$MoveUpward#ADAPTER", jsonName = "moveUpward", oneofName = "highlight_animation", schemaIndex = 2, tag = 3)
    private final MoveUpward move_upward;

    public OpacityReduceBackgroundWithBorder() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29788newBuilder();
    }

    public final ThemedColor getBackground_color() {
        return this.background_color;
    }

    public final ThemedColor getHighlight_color() {
        return this.highlight_color;
    }

    public final MoveUpward getMove_upward() {
        return this.move_upward;
    }

    public final MoveDownward getMove_downward() {
        return this.move_downward;
    }

    public /* synthetic */ OpacityReduceBackgroundWithBorder(ThemedColor themedColor, ThemedColor themedColor2, MoveUpward moveUpward, MoveDownward moveDownward, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : themedColor, (i & 2) != 0 ? null : themedColor2, (i & 4) != 0 ? null : moveUpward, (i & 8) != 0 ? null : moveDownward, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpacityReduceBackgroundWithBorder(ThemedColor themedColor, ThemedColor themedColor2, MoveUpward moveUpward, MoveDownward moveDownward, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.background_color = themedColor;
        this.highlight_color = themedColor2;
        this.move_upward = moveUpward;
        this.move_downward = moveDownward;
        if (Internal.countNonNull(moveUpward, moveDownward) > 1) {
            throw new IllegalArgumentException("At most one of move_upward, move_downward may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29788newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OpacityReduceBackgroundWithBorder)) {
            return false;
        }
        OpacityReduceBackgroundWithBorder opacityReduceBackgroundWithBorder = (OpacityReduceBackgroundWithBorder) other;
        return Intrinsics.areEqual(unknownFields(), opacityReduceBackgroundWithBorder.unknownFields()) && Intrinsics.areEqual(this.background_color, opacityReduceBackgroundWithBorder.background_color) && Intrinsics.areEqual(this.highlight_color, opacityReduceBackgroundWithBorder.highlight_color) && Intrinsics.areEqual(this.move_upward, opacityReduceBackgroundWithBorder.move_upward) && Intrinsics.areEqual(this.move_downward, opacityReduceBackgroundWithBorder.move_downward);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ThemedColor themedColor = this.background_color;
        int iHashCode2 = (iHashCode + (themedColor != null ? themedColor.hashCode() : 0)) * 37;
        ThemedColor themedColor2 = this.highlight_color;
        int iHashCode3 = (iHashCode2 + (themedColor2 != null ? themedColor2.hashCode() : 0)) * 37;
        MoveUpward moveUpward = this.move_upward;
        int iHashCode4 = (iHashCode3 + (moveUpward != null ? moveUpward.hashCode() : 0)) * 37;
        MoveDownward moveDownward = this.move_downward;
        int iHashCode5 = iHashCode4 + (moveDownward != null ? moveDownward.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ThemedColor themedColor = this.background_color;
        if (themedColor != null) {
            arrayList.add("background_color=" + themedColor);
        }
        ThemedColor themedColor2 = this.highlight_color;
        if (themedColor2 != null) {
            arrayList.add("highlight_color=" + themedColor2);
        }
        MoveUpward moveUpward = this.move_upward;
        if (moveUpward != null) {
            arrayList.add("move_upward=" + moveUpward);
        }
        MoveDownward moveDownward = this.move_downward;
        if (moveDownward != null) {
            arrayList.add("move_downward=" + moveDownward);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OpacityReduceBackgroundWithBorder{", "}", 0, null, null, 56, null);
    }

    public final OpacityReduceBackgroundWithBorder copy(ThemedColor background_color, ThemedColor highlight_color, MoveUpward move_upward, MoveDownward move_downward, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new OpacityReduceBackgroundWithBorder(background_color, highlight_color, move_upward, move_downward, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OpacityReduceBackgroundWithBorder.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<OpacityReduceBackgroundWithBorder>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.OpacityReduceBackgroundWithBorder$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OpacityReduceBackgroundWithBorder value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getBackground_color() != null) {
                    size += ThemedColor.ADAPTER.encodedSizeWithTag(1, value.getBackground_color());
                }
                if (value.getHighlight_color() != null) {
                    size += ThemedColor.ADAPTER.encodedSizeWithTag(2, value.getHighlight_color());
                }
                return size + OpacityReduceBackgroundWithBorder.MoveUpward.ADAPTER.encodedSizeWithTag(3, value.getMove_upward()) + OpacityReduceBackgroundWithBorder.MoveDownward.ADAPTER.encodedSizeWithTag(4, value.getMove_downward());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OpacityReduceBackgroundWithBorder value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getBackground_color() != null) {
                    ThemedColor.ADAPTER.encodeWithTag(writer, 1, (int) value.getBackground_color());
                }
                if (value.getHighlight_color() != null) {
                    ThemedColor.ADAPTER.encodeWithTag(writer, 2, (int) value.getHighlight_color());
                }
                OpacityReduceBackgroundWithBorder.MoveUpward.ADAPTER.encodeWithTag(writer, 3, (int) value.getMove_upward());
                OpacityReduceBackgroundWithBorder.MoveDownward.ADAPTER.encodeWithTag(writer, 4, (int) value.getMove_downward());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OpacityReduceBackgroundWithBorder value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                OpacityReduceBackgroundWithBorder.MoveDownward.ADAPTER.encodeWithTag(writer, 4, (int) value.getMove_downward());
                OpacityReduceBackgroundWithBorder.MoveUpward.ADAPTER.encodeWithTag(writer, 3, (int) value.getMove_upward());
                if (value.getHighlight_color() != null) {
                    ThemedColor.ADAPTER.encodeWithTag(writer, 2, (int) value.getHighlight_color());
                }
                if (value.getBackground_color() != null) {
                    ThemedColor.ADAPTER.encodeWithTag(writer, 1, (int) value.getBackground_color());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OpacityReduceBackgroundWithBorder redact(OpacityReduceBackgroundWithBorder value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ThemedColor background_color = value.getBackground_color();
                ThemedColor themedColorRedact = background_color != null ? ThemedColor.ADAPTER.redact(background_color) : null;
                ThemedColor highlight_color = value.getHighlight_color();
                ThemedColor themedColorRedact2 = highlight_color != null ? ThemedColor.ADAPTER.redact(highlight_color) : null;
                OpacityReduceBackgroundWithBorder.MoveUpward move_upward = value.getMove_upward();
                OpacityReduceBackgroundWithBorder.MoveUpward moveUpwardRedact = move_upward != null ? OpacityReduceBackgroundWithBorder.MoveUpward.ADAPTER.redact(move_upward) : null;
                OpacityReduceBackgroundWithBorder.MoveDownward move_downward = value.getMove_downward();
                return value.copy(themedColorRedact, themedColorRedact2, moveUpwardRedact, move_downward != null ? OpacityReduceBackgroundWithBorder.MoveDownward.ADAPTER.redact(move_downward) : null, ByteString.EMPTY);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OpacityReduceBackgroundWithBorder decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                ThemedColor themedColorDecode = null;
                ThemedColor themedColorDecode2 = null;
                OpacityReduceBackgroundWithBorder.MoveUpward moveUpwardDecode = null;
                OpacityReduceBackgroundWithBorder.MoveDownward moveDownwardDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new OpacityReduceBackgroundWithBorder(themedColorDecode, themedColorDecode2, moveUpwardDecode, moveDownwardDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        themedColorDecode2 = ThemedColor.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        moveUpwardDecode = OpacityReduceBackgroundWithBorder.MoveUpward.ADAPTER.decode(reader);
                    } else if (iNextTag == 4) {
                        moveDownwardDecode = OpacityReduceBackgroundWithBorder.MoveDownward.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }

    /* compiled from: OpacityReduceBackgroundWithBorder.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorder$MoveUpward;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MoveUpward extends Message {

        @JvmField
        public static final ProtoAdapter<MoveUpward> ADAPTER;

        /* JADX WARN: Multi-variable type inference failed */
        public MoveUpward() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29790newBuilder();
        }

        public /* synthetic */ MoveUpward(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MoveUpward(ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29790newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            return (other instanceof MoveUpward) && Intrinsics.areEqual(unknownFields(), ((MoveUpward) other).unknownFields());
        }

        public int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            return "MoveUpward{}";
        }

        public final MoveUpward copy(ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new MoveUpward(unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MoveUpward.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<MoveUpward>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.OpacityReduceBackgroundWithBorder$MoveUpward$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(OpacityReduceBackgroundWithBorder.MoveUpward value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, OpacityReduceBackgroundWithBorder.MoveUpward value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, OpacityReduceBackgroundWithBorder.MoveUpward value) {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public OpacityReduceBackgroundWithBorder.MoveUpward redact(OpacityReduceBackgroundWithBorder.MoveUpward value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.copy(ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public OpacityReduceBackgroundWithBorder.MoveUpward decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            reader.readUnknownField(iNextTag);
                        } else {
                            return new OpacityReduceBackgroundWithBorder.MoveUpward(reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            };
        }
    }

    /* compiled from: OpacityReduceBackgroundWithBorder.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorder$MoveDownward;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MoveDownward extends Message {

        @JvmField
        public static final ProtoAdapter<MoveDownward> ADAPTER;

        /* JADX WARN: Multi-variable type inference failed */
        public MoveDownward() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29789newBuilder();
        }

        public /* synthetic */ MoveDownward(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MoveDownward(ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29789newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            return (other instanceof MoveDownward) && Intrinsics.areEqual(unknownFields(), ((MoveDownward) other).unknownFields());
        }

        public int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            return "MoveDownward{}";
        }

        public final MoveDownward copy(ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new MoveDownward(unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MoveDownward.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<MoveDownward>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.OpacityReduceBackgroundWithBorder$MoveDownward$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(OpacityReduceBackgroundWithBorder.MoveDownward value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, OpacityReduceBackgroundWithBorder.MoveDownward value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, OpacityReduceBackgroundWithBorder.MoveDownward value) {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public OpacityReduceBackgroundWithBorder.MoveDownward redact(OpacityReduceBackgroundWithBorder.MoveDownward value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.copy(ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public OpacityReduceBackgroundWithBorder.MoveDownward decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            reader.readUnknownField(iNextTag);
                        } else {
                            return new OpacityReduceBackgroundWithBorder.MoveDownward(reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            };
        }
    }
}
