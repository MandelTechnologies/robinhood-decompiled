package rh_server_driven_ui.p531v1;

import com.plaid.internal.EnumC7081g;
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

/* compiled from: AnimatedRevealText.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001b\u001a\u00020\u0002H\u0017J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u0004H\u0016JN\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006%"}, m3636d2 = {"Lrh_server_driven_ui/v1/AnimatedRevealText;", "Lcom/squareup/wire/Message;", "", "text", "", "initial_delay", "", "interval", "duration", ResourceTypes.STYLE, "Lrh_server_driven_ui/v1/TextStyle;", ResourceTypes.COLOR, "Lrh_server_driven_ui/v1/ThemedColor;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;FFFLrh_server_driven_ui/v1/TextStyle;Lrh_server_driven_ui/v1/ThemedColor;Lokio/ByteString;)V", "getText", "()Ljava/lang/String;", "getInitial_delay", "()F", "getInterval", "getDuration", "getStyle", "()Lrh_server_driven_ui/v1/TextStyle;", "getColor", "()Lrh_server_driven_ui/v1/ThemedColor;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class AnimatedRevealText extends Message {

    @JvmField
    public static final ProtoAdapter<AnimatedRevealText> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final ThemedColor color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final float duration;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "initialDelay", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final float initial_delay;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final float interval;

    @WireField(adapter = "rh_server_driven_ui.v1.TextStyle#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final TextStyle style;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String text;

    public AnimatedRevealText() {
        this(null, 0.0f, 0.0f, 0.0f, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29663newBuilder();
    }

    public final String getText() {
        return this.text;
    }

    public /* synthetic */ AnimatedRevealText(String str, float f, float f2, float f3, TextStyle textStyle, ThemedColor themedColor, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? 0.0f : f2, (i & 8) != 0 ? 0.0f : f3, (i & 16) != 0 ? TextStyle.TEXT_STYLE_UNSPECIFIED : textStyle, (i & 32) != 0 ? null : themedColor, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    public final float getInitial_delay() {
        return this.initial_delay;
    }

    public final float getInterval() {
        return this.interval;
    }

    public final float getDuration() {
        return this.duration;
    }

    public final TextStyle getStyle() {
        return this.style;
    }

    public final ThemedColor getColor() {
        return this.color;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedRevealText(String text, float f, float f2, float f3, TextStyle style, ThemedColor themedColor, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.text = text;
        this.initial_delay = f;
        this.interval = f2;
        this.duration = f3;
        this.style = style;
        this.color = themedColor;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29663newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AnimatedRevealText)) {
            return false;
        }
        AnimatedRevealText animatedRevealText = (AnimatedRevealText) other;
        return Intrinsics.areEqual(unknownFields(), animatedRevealText.unknownFields()) && Intrinsics.areEqual(this.text, animatedRevealText.text) && this.initial_delay == animatedRevealText.initial_delay && this.interval == animatedRevealText.interval && this.duration == animatedRevealText.duration && this.style == animatedRevealText.style && Intrinsics.areEqual(this.color, animatedRevealText.color);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((unknownFields().hashCode() * 37) + this.text.hashCode()) * 37) + Float.hashCode(this.initial_delay)) * 37) + Float.hashCode(this.interval)) * 37) + Float.hashCode(this.duration)) * 37) + this.style.hashCode()) * 37;
        ThemedColor themedColor = this.color;
        int iHashCode2 = iHashCode + (themedColor != null ? themedColor.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("text=" + Internal.sanitize(this.text));
        arrayList.add("initial_delay=" + this.initial_delay);
        arrayList.add("interval=" + this.interval);
        arrayList.add("duration=" + this.duration);
        arrayList.add("style=" + this.style);
        ThemedColor themedColor = this.color;
        if (themedColor != null) {
            arrayList.add("color=" + themedColor);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AnimatedRevealText{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AnimatedRevealText copy$default(AnimatedRevealText animatedRevealText, String str, float f, float f2, float f3, TextStyle textStyle, ThemedColor themedColor, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = animatedRevealText.text;
        }
        if ((i & 2) != 0) {
            f = animatedRevealText.initial_delay;
        }
        if ((i & 4) != 0) {
            f2 = animatedRevealText.interval;
        }
        if ((i & 8) != 0) {
            f3 = animatedRevealText.duration;
        }
        if ((i & 16) != 0) {
            textStyle = animatedRevealText.style;
        }
        if ((i & 32) != 0) {
            themedColor = animatedRevealText.color;
        }
        if ((i & 64) != 0) {
            byteString = animatedRevealText.unknownFields();
        }
        ThemedColor themedColor2 = themedColor;
        ByteString byteString2 = byteString;
        TextStyle textStyle2 = textStyle;
        float f4 = f2;
        return animatedRevealText.copy(str, f, f4, f3, textStyle2, themedColor2, byteString2);
    }

    public final AnimatedRevealText copy(String text, float initial_delay, float interval, float duration, TextStyle style, ThemedColor color, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AnimatedRevealText(text, initial_delay, interval, duration, style, color, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AnimatedRevealText.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AnimatedRevealText>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.AnimatedRevealText$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AnimatedRevealText value) {
                Float fValueOf = Float.valueOf(0.0f);
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getText(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getText());
                }
                if (!Float.valueOf(value.getInitial_delay()).equals(fValueOf)) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(2, Float.valueOf(value.getInitial_delay()));
                }
                if (!Float.valueOf(value.getInterval()).equals(fValueOf)) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(3, Float.valueOf(value.getInterval()));
                }
                if (!Float.valueOf(value.getDuration()).equals(fValueOf)) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(4, Float.valueOf(value.getDuration()));
                }
                if (value.getStyle() != TextStyle.TEXT_STYLE_UNSPECIFIED) {
                    size += TextStyle.ADAPTER.encodedSizeWithTag(5, value.getStyle());
                }
                return value.getColor() != null ? size + ThemedColor.ADAPTER.encodedSizeWithTag(6, value.getColor()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AnimatedRevealText value) throws IOException {
                Float fValueOf = Float.valueOf(0.0f);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getText(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getText());
                }
                if (!Float.valueOf(value.getInitial_delay()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 2, (int) Float.valueOf(value.getInitial_delay()));
                }
                if (!Float.valueOf(value.getInterval()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 3, (int) Float.valueOf(value.getInterval()));
                }
                if (!Float.valueOf(value.getDuration()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 4, (int) Float.valueOf(value.getDuration()));
                }
                if (value.getStyle() != TextStyle.TEXT_STYLE_UNSPECIFIED) {
                    TextStyle.ADAPTER.encodeWithTag(writer, 5, (int) value.getStyle());
                }
                if (value.getColor() != null) {
                    ThemedColor.ADAPTER.encodeWithTag(writer, 6, (int) value.getColor());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AnimatedRevealText value) throws IOException {
                Float fValueOf = Float.valueOf(0.0f);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getColor() != null) {
                    ThemedColor.ADAPTER.encodeWithTag(writer, 6, (int) value.getColor());
                }
                if (value.getStyle() != TextStyle.TEXT_STYLE_UNSPECIFIED) {
                    TextStyle.ADAPTER.encodeWithTag(writer, 5, (int) value.getStyle());
                }
                if (!Float.valueOf(value.getDuration()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 4, (int) Float.valueOf(value.getDuration()));
                }
                if (!Float.valueOf(value.getInterval()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 3, (int) Float.valueOf(value.getInterval()));
                }
                if (!Float.valueOf(value.getInitial_delay()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 2, (int) Float.valueOf(value.getInitial_delay()));
                }
                if (Intrinsics.areEqual(value.getText(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getText());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AnimatedRevealText decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                TextStyle textStyleDecode = TextStyle.TEXT_STYLE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                ThemedColor themedColorDecode = null;
                float fFloatValue = 0.0f;
                float fFloatValue2 = 0.0f;
                float fFloatValue3 = 0.0f;
                String strDecode = "";
                while (true) {
                    TextStyle textStyle = textStyleDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 2:
                                    fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                                    break;
                                case 3:
                                    fFloatValue2 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                                    break;
                                case 4:
                                    fFloatValue3 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                                    break;
                                case 5:
                                    try {
                                        textStyleDecode = TextStyle.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 6:
                                    themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new AnimatedRevealText(strDecode, fFloatValue, fFloatValue2, fFloatValue3, textStyle, themedColorDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AnimatedRevealText redact(AnimatedRevealText value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ThemedColor color = value.getColor();
                return AnimatedRevealText.copy$default(value, null, 0.0f, 0.0f, 0.0f, null, color != null ? ThemedColor.ADAPTER.redact(color) : null, ByteString.EMPTY, 31, null);
            }
        };
    }
}
