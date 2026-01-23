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
import rh_server_driven_ui.p531v1.Card;

/* compiled from: Card.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002'(BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001d\u001a\u00020\u0002H\u0017J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020\nH\u0016J\b\u0010#\u001a\u00020$H\u0016JQ\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010&R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006)"}, m3636d2 = {"Lrh_server_driven_ui/v1/Card;", "Lcom/squareup/wire/Message;", "", "content", "Lrh_server_driven_ui/v1/UIComponent;", "background_color", "Lrh_server_driven_ui/v1/ThemedColor;", "background_color_opacity", "", "corner_radius", "", "outline", "Lrh_server_driven_ui/v1/Card$Outline;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/UIComponent;Lrh_server_driven_ui/v1/ThemedColor;Ljava/lang/Float;Ljava/lang/Integer;Lrh_server_driven_ui/v1/Card$Outline;Lokio/ByteString;)V", "getContent", "()Lrh_server_driven_ui/v1/UIComponent;", "getBackground_color", "()Lrh_server_driven_ui/v1/ThemedColor;", "getBackground_color_opacity", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getCorner_radius", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOutline", "()Lrh_server_driven_ui/v1/Card$Outline;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "", "copy", "(Lrh_server_driven_ui/v1/UIComponent;Lrh_server_driven_ui/v1/ThemedColor;Ljava/lang/Float;Ljava/lang/Integer;Lrh_server_driven_ui/v1/Card$Outline;Lokio/ByteString;)Lrh_server_driven_ui/v1/Card;", "Companion", "Outline", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class Card extends Message {

    @JvmField
    public static final ProtoAdapter<Card> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "backgroundColor", schemaIndex = 1, tag = 2)
    private final ThemedColor background_color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "backgroundColorOpacity", schemaIndex = 2, tag = 3)
    private final Float background_color_opacity;

    @WireField(adapter = "rh_server_driven_ui.v1.UIComponent#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final UIComponent content;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "cornerRadius", schemaIndex = 3, tag = 4)
    private final Integer corner_radius;

    @WireField(adapter = "rh_server_driven_ui.v1.Card$Outline#ADAPTER", schemaIndex = 4, tag = 5)
    private final Outline outline;

    public Card() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29670newBuilder();
    }

    public final UIComponent getContent() {
        return this.content;
    }

    public final ThemedColor getBackground_color() {
        return this.background_color;
    }

    public final Float getBackground_color_opacity() {
        return this.background_color_opacity;
    }

    public final Integer getCorner_radius() {
        return this.corner_radius;
    }

    public final Outline getOutline() {
        return this.outline;
    }

    public /* synthetic */ Card(UIComponent uIComponent, ThemedColor themedColor, Float f, Integer num, Outline outline, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uIComponent, (i & 2) != 0 ? null : themedColor, (i & 4) != 0 ? null : f, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : outline, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Card(UIComponent uIComponent, ThemedColor themedColor, Float f, Integer num, Outline outline, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.content = uIComponent;
        this.background_color = themedColor;
        this.background_color_opacity = f;
        this.corner_radius = num;
        this.outline = outline;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29670newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Card)) {
            return false;
        }
        Card card = (Card) other;
        return Intrinsics.areEqual(unknownFields(), card.unknownFields()) && Intrinsics.areEqual(this.content, card.content) && Intrinsics.areEqual(this.background_color, card.background_color) && Intrinsics.areEqual(this.background_color_opacity, card.background_color_opacity) && Intrinsics.areEqual(this.corner_radius, card.corner_radius) && Intrinsics.areEqual(this.outline, card.outline);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        UIComponent uIComponent = this.content;
        int iHashCode2 = (iHashCode + (uIComponent != null ? uIComponent.hashCode() : 0)) * 37;
        ThemedColor themedColor = this.background_color;
        int iHashCode3 = (iHashCode2 + (themedColor != null ? themedColor.hashCode() : 0)) * 37;
        Float f = this.background_color_opacity;
        int iHashCode4 = (iHashCode3 + (f != null ? f.hashCode() : 0)) * 37;
        Integer num = this.corner_radius;
        int iHashCode5 = (iHashCode4 + (num != null ? num.hashCode() : 0)) * 37;
        Outline outline = this.outline;
        int iHashCode6 = iHashCode5 + (outline != null ? outline.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        UIComponent uIComponent = this.content;
        if (uIComponent != null) {
            arrayList.add("content=" + uIComponent);
        }
        ThemedColor themedColor = this.background_color;
        if (themedColor != null) {
            arrayList.add("background_color=" + themedColor);
        }
        Float f = this.background_color_opacity;
        if (f != null) {
            arrayList.add("background_color_opacity=" + f);
        }
        Integer num = this.corner_radius;
        if (num != null) {
            arrayList.add("corner_radius=" + num);
        }
        Outline outline = this.outline;
        if (outline != null) {
            arrayList.add("outline=" + outline);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Card{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Card copy$default(Card card, UIComponent uIComponent, ThemedColor themedColor, Float f, Integer num, Outline outline, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            uIComponent = card.content;
        }
        if ((i & 2) != 0) {
            themedColor = card.background_color;
        }
        if ((i & 4) != 0) {
            f = card.background_color_opacity;
        }
        if ((i & 8) != 0) {
            num = card.corner_radius;
        }
        if ((i & 16) != 0) {
            outline = card.outline;
        }
        if ((i & 32) != 0) {
            byteString = card.unknownFields();
        }
        Outline outline2 = outline;
        ByteString byteString2 = byteString;
        return card.copy(uIComponent, themedColor, f, num, outline2, byteString2);
    }

    public final Card copy(UIComponent content, ThemedColor background_color, Float background_color_opacity, Integer corner_radius, Outline outline, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Card(content, background_color, background_color_opacity, corner_radius, outline, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Card.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Card>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.Card$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Card value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getContent() != null) {
                    size += UIComponent.ADAPTER.encodedSizeWithTag(1, value.getContent());
                }
                return size + ThemedColor.ADAPTER.encodedSizeWithTag(2, value.getBackground_color()) + ProtoAdapter.FLOAT.encodedSizeWithTag(3, value.getBackground_color_opacity()) + ProtoAdapter.INT32.encodedSizeWithTag(4, value.getCorner_radius()) + Card.Outline.ADAPTER.encodedSizeWithTag(5, value.getOutline());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Card value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getContent() != null) {
                    UIComponent.ADAPTER.encodeWithTag(writer, 1, (int) value.getContent());
                }
                ThemedColor.ADAPTER.encodeWithTag(writer, 2, (int) value.getBackground_color());
                ProtoAdapter.FLOAT.encodeWithTag(writer, 3, (int) value.getBackground_color_opacity());
                ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) value.getCorner_radius());
                Card.Outline.ADAPTER.encodeWithTag(writer, 5, (int) value.getOutline());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Card value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                Card.Outline.ADAPTER.encodeWithTag(writer, 5, (int) value.getOutline());
                ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) value.getCorner_radius());
                ProtoAdapter.FLOAT.encodeWithTag(writer, 3, (int) value.getBackground_color_opacity());
                ThemedColor.ADAPTER.encodeWithTag(writer, 2, (int) value.getBackground_color());
                if (value.getContent() != null) {
                    UIComponent.ADAPTER.encodeWithTag(writer, 1, (int) value.getContent());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Card redact(Card value) {
                Intrinsics.checkNotNullParameter(value, "value");
                UIComponent content = value.getContent();
                UIComponent uIComponentRedact = content != null ? UIComponent.ADAPTER.redact(content) : null;
                ThemedColor background_color = value.getBackground_color();
                ThemedColor themedColorRedact = background_color != null ? ThemedColor.ADAPTER.redact(background_color) : null;
                Card.Outline outline = value.getOutline();
                return Card.copy$default(value, uIComponentRedact, themedColorRedact, null, null, outline != null ? Card.Outline.ADAPTER.redact(outline) : null, ByteString.EMPTY, 12, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Card decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                UIComponent uIComponentDecode = null;
                ThemedColor themedColorDecode = null;
                Float fDecode = null;
                Integer numDecode = null;
                Card.Outline outlineDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Card(uIComponentDecode, themedColorDecode, fDecode, numDecode, outlineDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        uIComponentDecode = UIComponent.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        fDecode = ProtoAdapter.FLOAT.decode(reader);
                    } else if (iNextTag == 4) {
                        numDecode = ProtoAdapter.INT32.decode(reader);
                    } else if (iNextTag == 5) {
                        outlineDecode = Card.Outline.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }

    /* compiled from: Card.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J-\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\u0019R\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lrh_server_driven_ui/v1/Card$Outline;", "Lcom/squareup/wire/Message;", "", "has_shadow", "", "border", "Lrh_server_driven_ui/v1/Border;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/Boolean;Lrh_server_driven_ui/v1/Border;Lokio/ByteString;)V", "getHas_shadow", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBorder", "()Lrh_server_driven_ui/v1/Border;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "(Ljava/lang/Boolean;Lrh_server_driven_ui/v1/Border;Lokio/ByteString;)Lrh_server_driven_ui/v1/Card$Outline;", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Outline extends Message {

        @JvmField
        public static final ProtoAdapter<Outline> ADAPTER;

        @WireField(adapter = "rh_server_driven_ui.v1.Border#ADAPTER", schemaIndex = 1, tag = 2)
        private final Border border;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hasShadow", schemaIndex = 0, tag = 1)
        private final Boolean has_shadow;

        public Outline() {
            this(null, null, null, 7, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29671newBuilder();
        }

        public final Boolean getHas_shadow() {
            return this.has_shadow;
        }

        public final Border getBorder() {
            return this.border;
        }

        public /* synthetic */ Outline(Boolean bool, Border border, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : border, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Outline(Boolean bool, Border border, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.has_shadow = bool;
            this.border = border;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29671newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Outline)) {
                return false;
            }
            Outline outline = (Outline) other;
            return Intrinsics.areEqual(unknownFields(), outline.unknownFields()) && Intrinsics.areEqual(this.has_shadow, outline.has_shadow) && Intrinsics.areEqual(this.border, outline.border);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            Boolean bool = this.has_shadow;
            int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 37;
            Border border = this.border;
            int iHashCode3 = iHashCode2 + (border != null ? border.hashCode() : 0);
            this.hashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            Boolean bool = this.has_shadow;
            if (bool != null) {
                arrayList.add("has_shadow=" + bool);
            }
            Border border = this.border;
            if (border != null) {
                arrayList.add("border=" + border);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Outline{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ Outline copy$default(Outline outline, Boolean bool, Border border, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = outline.has_shadow;
            }
            if ((i & 2) != 0) {
                border = outline.border;
            }
            if ((i & 4) != 0) {
                byteString = outline.unknownFields();
            }
            return outline.copy(bool, border, byteString);
        }

        public final Outline copy(Boolean has_shadow, Border border, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new Outline(has_shadow, border, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Outline.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<Outline>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.Card$Outline$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(Card.Outline value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size() + ProtoAdapter.BOOL.encodedSizeWithTag(1, value.getHas_shadow()) + Border.ADAPTER.encodedSizeWithTag(2, value.getBorder());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, Card.Outline value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) value.getHas_shadow());
                    Border.ADAPTER.encodeWithTag(writer, 2, (int) value.getBorder());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, Card.Outline value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    Border.ADAPTER.encodeWithTag(writer, 2, (int) value.getBorder());
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) value.getHas_shadow());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public Card.Outline redact(Card.Outline value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    Border border = value.getBorder();
                    return Card.Outline.copy$default(value, null, border != null ? Border.ADAPTER.redact(border) : null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public Card.Outline decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    Boolean boolDecode = null;
                    Border borderDecode = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new Card.Outline(boolDecode, borderDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            boolDecode = ProtoAdapter.BOOL.decode(reader);
                        } else if (iNextTag == 2) {
                            borderDecode = Border.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            };
        }
    }
}
