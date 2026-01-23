package rh_server_driven_ui.p531v1;

import com.adjust.sdk.network.ErrorCodes;
import com.robinhood.utils.extensions.ResourceTypes;
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
import rh_server_driven_ui.p531v1.TickerText;

/* compiled from: TickerText.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 32\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u000234B{\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010+\u001a\u00020\u0002H\u0017J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0096\u0002J\b\u00100\u001a\u00020\u0011H\u0016J\b\u00101\u001a\u00020\u0004H\u0016Jz\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u0016R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001a¨\u00065"}, m3636d2 = {"Lrh_server_driven_ui/v1/TickerText;", "Lcom/squareup/wire/Message;", "", "initial_value", "", "end_value", "font", "Lrh_server_driven_ui/v1/Font;", ResourceTypes.STYLE, "Lrh_server_driven_ui/v1/TextStyle;", ResourceTypes.COLOR, "Lrh_server_driven_ui/v1/ThemedColor;", "animation_duration", "", "text_alignment", "Lrh_server_driven_ui/v1/TextAlignment;", "decimals_count", "", "currency_code", "Lrh_server_driven_ui/v1/TickerText$Currency;", "suffix", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/Font;Lrh_server_driven_ui/v1/TextStyle;Lrh_server_driven_ui/v1/ThemedColor;FLrh_server_driven_ui/v1/TextAlignment;ILrh_server_driven_ui/v1/TickerText$Currency;Ljava/lang/String;Lokio/ByteString;)V", "getInitial_value", "()Ljava/lang/String;", "getEnd_value", "getFont", "()Lrh_server_driven_ui/v1/Font;", "getStyle", "()Lrh_server_driven_ui/v1/TextStyle;", "getColor", "()Lrh_server_driven_ui/v1/ThemedColor;", "getAnimation_duration", "()F", "getText_alignment", "()Lrh_server_driven_ui/v1/TextAlignment;", "getDecimals_count", "()I", "getCurrency_code", "()Lrh_server_driven_ui/v1/TickerText$Currency;", "getSuffix", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "Currency", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class TickerText extends Message {

    @JvmField
    public static final ProtoAdapter<TickerText> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "animationDuration", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final float animation_duration;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final ThemedColor color;

    @WireField(adapter = "rh_server_driven_ui.v1.TickerText$Currency#ADAPTER", jsonName = "currencyCode", schemaIndex = 8, tag = 9)
    private final Currency currency_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "decimalsCount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final int decimals_count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "endValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String end_value;

    @WireField(adapter = "rh_server_driven_ui.v1.Font#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Font font;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "initialValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String initial_value;

    @WireField(adapter = "rh_server_driven_ui.v1.TextStyle#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final TextStyle style;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 9, tag = 10)
    private final String suffix;

    @WireField(adapter = "rh_server_driven_ui.v1.TextAlignment#ADAPTER", jsonName = "textAlignment", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final TextAlignment text_alignment;

    public TickerText() {
        this(null, null, null, null, null, 0.0f, null, 0, null, null, null, 2047, null);
    }

    public /* synthetic */ TickerText(String str, String str2, Font font, TextStyle textStyle, ThemedColor themedColor, float f, TextAlignment textAlignment, int i, Currency currency, String str3, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? Font.FONT_UNSPECIFIED : font, (i2 & 8) != 0 ? TextStyle.TEXT_STYLE_UNSPECIFIED : textStyle, (i2 & 16) != 0 ? null : themedColor, (i2 & 32) != 0 ? 0.0f : f, (i2 & 64) != 0 ? TextAlignment.TEXT_ALIGNMENT_UNSPECIFIED : textAlignment, (i2 & 128) != 0 ? 0 : i, (i2 & 256) != 0 ? null : currency, (i2 & 512) != 0 ? null : str3, (i2 & 1024) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29849newBuilder();
    }

    public final String getInitial_value() {
        return this.initial_value;
    }

    public final String getEnd_value() {
        return this.end_value;
    }

    public final Font getFont() {
        return this.font;
    }

    public final TextStyle getStyle() {
        return this.style;
    }

    public final ThemedColor getColor() {
        return this.color;
    }

    public final float getAnimation_duration() {
        return this.animation_duration;
    }

    public final TextAlignment getText_alignment() {
        return this.text_alignment;
    }

    public final int getDecimals_count() {
        return this.decimals_count;
    }

    public final Currency getCurrency_code() {
        return this.currency_code;
    }

    public final String getSuffix() {
        return this.suffix;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TickerText(String initial_value, String end_value, Font font, TextStyle style, ThemedColor themedColor, float f, TextAlignment text_alignment, int i, Currency currency, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(initial_value, "initial_value");
        Intrinsics.checkNotNullParameter(end_value, "end_value");
        Intrinsics.checkNotNullParameter(font, "font");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(text_alignment, "text_alignment");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.initial_value = initial_value;
        this.end_value = end_value;
        this.font = font;
        this.style = style;
        this.color = themedColor;
        this.animation_duration = f;
        this.text_alignment = text_alignment;
        this.decimals_count = i;
        this.currency_code = currency;
        this.suffix = str;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29849newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TickerText)) {
            return false;
        }
        TickerText tickerText = (TickerText) other;
        return Intrinsics.areEqual(unknownFields(), tickerText.unknownFields()) && Intrinsics.areEqual(this.initial_value, tickerText.initial_value) && Intrinsics.areEqual(this.end_value, tickerText.end_value) && this.font == tickerText.font && this.style == tickerText.style && Intrinsics.areEqual(this.color, tickerText.color) && this.animation_duration == tickerText.animation_duration && this.text_alignment == tickerText.text_alignment && this.decimals_count == tickerText.decimals_count && this.currency_code == tickerText.currency_code && Intrinsics.areEqual(this.suffix, tickerText.suffix);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.initial_value.hashCode()) * 37) + this.end_value.hashCode()) * 37) + this.font.hashCode()) * 37) + this.style.hashCode()) * 37;
        ThemedColor themedColor = this.color;
        int iHashCode2 = (((((((iHashCode + (themedColor != null ? themedColor.hashCode() : 0)) * 37) + Float.hashCode(this.animation_duration)) * 37) + this.text_alignment.hashCode()) * 37) + Integer.hashCode(this.decimals_count)) * 37;
        Currency currency = this.currency_code;
        int iHashCode3 = (iHashCode2 + (currency != null ? currency.hashCode() : 0)) * 37;
        String str = this.suffix;
        int iHashCode4 = iHashCode3 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("initial_value=" + Internal.sanitize(this.initial_value));
        arrayList.add("end_value=" + Internal.sanitize(this.end_value));
        arrayList.add("font=" + this.font);
        arrayList.add("style=" + this.style);
        ThemedColor themedColor = this.color;
        if (themedColor != null) {
            arrayList.add("color=" + themedColor);
        }
        arrayList.add("animation_duration=" + this.animation_duration);
        arrayList.add("text_alignment=" + this.text_alignment);
        arrayList.add("decimals_count=" + this.decimals_count);
        Currency currency = this.currency_code;
        if (currency != null) {
            arrayList.add("currency_code=" + currency);
        }
        String str = this.suffix;
        if (str != null) {
            arrayList.add("suffix=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TickerText{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TickerText copy$default(TickerText tickerText, String str, String str2, Font font, TextStyle textStyle, ThemedColor themedColor, float f, TextAlignment textAlignment, int i, Currency currency, String str3, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = tickerText.initial_value;
        }
        if ((i2 & 2) != 0) {
            str2 = tickerText.end_value;
        }
        if ((i2 & 4) != 0) {
            font = tickerText.font;
        }
        if ((i2 & 8) != 0) {
            textStyle = tickerText.style;
        }
        if ((i2 & 16) != 0) {
            themedColor = tickerText.color;
        }
        if ((i2 & 32) != 0) {
            f = tickerText.animation_duration;
        }
        if ((i2 & 64) != 0) {
            textAlignment = tickerText.text_alignment;
        }
        if ((i2 & 128) != 0) {
            i = tickerText.decimals_count;
        }
        if ((i2 & 256) != 0) {
            currency = tickerText.currency_code;
        }
        if ((i2 & 512) != 0) {
            str3 = tickerText.suffix;
        }
        if ((i2 & 1024) != 0) {
            byteString = tickerText.unknownFields();
        }
        String str4 = str3;
        ByteString byteString2 = byteString;
        int i3 = i;
        Currency currency2 = currency;
        float f2 = f;
        TextAlignment textAlignment2 = textAlignment;
        ThemedColor themedColor2 = themedColor;
        Font font2 = font;
        return tickerText.copy(str, str2, font2, textStyle, themedColor2, f2, textAlignment2, i3, currency2, str4, byteString2);
    }

    public final TickerText copy(String initial_value, String end_value, Font font, TextStyle style, ThemedColor color, float animation_duration, TextAlignment text_alignment, int decimals_count, Currency currency_code, String suffix, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(initial_value, "initial_value");
        Intrinsics.checkNotNullParameter(end_value, "end_value");
        Intrinsics.checkNotNullParameter(font, "font");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(text_alignment, "text_alignment");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TickerText(initial_value, end_value, font, style, color, animation_duration, text_alignment, decimals_count, currency_code, suffix, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TickerText.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TickerText>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.TickerText$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TickerText value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getInitial_value(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getInitial_value());
                }
                if (!Intrinsics.areEqual(value.getEnd_value(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getEnd_value());
                }
                if (value.getFont() != Font.FONT_UNSPECIFIED) {
                    size += Font.ADAPTER.encodedSizeWithTag(3, value.getFont());
                }
                if (value.getStyle() != TextStyle.TEXT_STYLE_UNSPECIFIED) {
                    size += TextStyle.ADAPTER.encodedSizeWithTag(4, value.getStyle());
                }
                if (value.getColor() != null) {
                    size += ThemedColor.ADAPTER.encodedSizeWithTag(5, value.getColor());
                }
                if (!Float.valueOf(value.getAnimation_duration()).equals(Float.valueOf(0.0f))) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(6, Float.valueOf(value.getAnimation_duration()));
                }
                if (value.getText_alignment() != TextAlignment.TEXT_ALIGNMENT_UNSPECIFIED) {
                    size += TextAlignment.ADAPTER.encodedSizeWithTag(7, value.getText_alignment());
                }
                if (value.getDecimals_count() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(8, Integer.valueOf(value.getDecimals_count()));
                }
                return size + TickerText.Currency.ADAPTER.encodedSizeWithTag(9, value.getCurrency_code()) + ProtoAdapter.STRING.encodedSizeWithTag(10, value.getSuffix());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TickerText value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getInitial_value(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getInitial_value());
                }
                if (!Intrinsics.areEqual(value.getEnd_value(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getEnd_value());
                }
                if (value.getFont() != Font.FONT_UNSPECIFIED) {
                    Font.ADAPTER.encodeWithTag(writer, 3, (int) value.getFont());
                }
                if (value.getStyle() != TextStyle.TEXT_STYLE_UNSPECIFIED) {
                    TextStyle.ADAPTER.encodeWithTag(writer, 4, (int) value.getStyle());
                }
                if (value.getColor() != null) {
                    ThemedColor.ADAPTER.encodeWithTag(writer, 5, (int) value.getColor());
                }
                if (!Float.valueOf(value.getAnimation_duration()).equals(Float.valueOf(0.0f))) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 6, (int) Float.valueOf(value.getAnimation_duration()));
                }
                if (value.getText_alignment() != TextAlignment.TEXT_ALIGNMENT_UNSPECIFIED) {
                    TextAlignment.ADAPTER.encodeWithTag(writer, 7, (int) value.getText_alignment());
                }
                if (value.getDecimals_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 8, (int) Integer.valueOf(value.getDecimals_count()));
                }
                TickerText.Currency.ADAPTER.encodeWithTag(writer, 9, (int) value.getCurrency_code());
                ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getSuffix());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TickerText value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 10, (int) value.getSuffix());
                TickerText.Currency.ADAPTER.encodeWithTag(writer, 9, (int) value.getCurrency_code());
                if (value.getDecimals_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 8, (int) Integer.valueOf(value.getDecimals_count()));
                }
                if (value.getText_alignment() != TextAlignment.TEXT_ALIGNMENT_UNSPECIFIED) {
                    TextAlignment.ADAPTER.encodeWithTag(writer, 7, (int) value.getText_alignment());
                }
                if (!Float.valueOf(value.getAnimation_duration()).equals(Float.valueOf(0.0f))) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 6, (int) Float.valueOf(value.getAnimation_duration()));
                }
                if (value.getColor() != null) {
                    ThemedColor.ADAPTER.encodeWithTag(writer, 5, (int) value.getColor());
                }
                if (value.getStyle() != TextStyle.TEXT_STYLE_UNSPECIFIED) {
                    TextStyle.ADAPTER.encodeWithTag(writer, 4, (int) value.getStyle());
                }
                if (value.getFont() != Font.FONT_UNSPECIFIED) {
                    Font.ADAPTER.encodeWithTag(writer, 3, (int) value.getFont());
                }
                if (!Intrinsics.areEqual(value.getEnd_value(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getEnd_value());
                }
                if (Intrinsics.areEqual(value.getInitial_value(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getInitial_value());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TickerText decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Font fontDecode = Font.FONT_UNSPECIFIED;
                TextStyle textStyle = TextStyle.TEXT_STYLE_UNSPECIFIED;
                TextAlignment textAlignment = TextAlignment.TEXT_ALIGNMENT_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                TickerText.Currency currencyDecode = null;
                String strDecode = null;
                float fFloatValue = 0.0f;
                int iIntValue = 0;
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                ThemedColor themedColorDecode = null;
                TextAlignment textAlignmentDecode = textAlignment;
                TextStyle textStyleDecode = textStyle;
                while (true) {
                    Font font = fontDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 2:
                                    strDecode3 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 3:
                                    try {
                                        fontDecode = Font.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 4:
                                    try {
                                        textStyleDecode = TextStyle.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                case 5:
                                    themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                                    break;
                                case 6:
                                    fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                                    break;
                                case 7:
                                    try {
                                        textAlignmentDecode = TextAlignment.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                        break;
                                    }
                                case 8:
                                    iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                    break;
                                case 9:
                                    try {
                                        currencyDecode = TickerText.Currency.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                        break;
                                    }
                                case 10:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new TickerText(strDecode2, strDecode3, font, textStyleDecode, themedColorDecode, fFloatValue, textAlignmentDecode, iIntValue, currencyDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TickerText redact(TickerText value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ThemedColor color = value.getColor();
                return TickerText.copy$default(value, null, null, null, null, color != null ? ThemedColor.ADAPTER.redact(color) : null, 0.0f, null, 0, null, null, ByteString.EMPTY, ErrorCodes.IO_EXCEPTION, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TickerText.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lrh_server_driven_ui/v1/TickerText$Currency;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CURRENCY_UNSPECIFIED", "USD", "GBP", "EUR", "SGD", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Currency implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Currency[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Currency> ADAPTER;
        public static final Currency CURRENCY_UNSPECIFIED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Currency EUR;
        public static final Currency GBP;
        public static final Currency SGD;
        public static final Currency USD;
        private final int value;

        private static final /* synthetic */ Currency[] $values() {
            return new Currency[]{CURRENCY_UNSPECIFIED, USD, GBP, EUR, SGD};
        }

        @JvmStatic
        public static final Currency fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Currency> getEntries() {
            return $ENTRIES;
        }

        private Currency(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Currency currency = new Currency("CURRENCY_UNSPECIFIED", 0, 0);
            CURRENCY_UNSPECIFIED = currency;
            USD = new Currency("USD", 1, 1);
            GBP = new Currency("GBP", 2, 2);
            EUR = new Currency("EUR", 3, 3);
            SGD = new Currency("SGD", 4, 4);
            Currency[] currencyArr$values = $values();
            $VALUES = currencyArr$values;
            $ENTRIES = EnumEntries2.enumEntries(currencyArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Currency.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Currency>(orCreateKotlinClass, syntax, currency) { // from class: rh_server_driven_ui.v1.TickerText$Currency$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public TickerText.Currency fromValue(int value) {
                    return TickerText.Currency.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: TickerText.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrh_server_driven_ui/v1/TickerText$Currency$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrh_server_driven_ui/v1/TickerText$Currency;", "fromValue", "value", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Currency fromValue(int value) {
                if (value == 0) {
                    return Currency.CURRENCY_UNSPECIFIED;
                }
                if (value == 1) {
                    return Currency.USD;
                }
                if (value == 2) {
                    return Currency.GBP;
                }
                if (value == 3) {
                    return Currency.EUR;
                }
                if (value != 4) {
                    return null;
                }
                return Currency.SGD;
            }
        }

        public static Currency valueOf(String str) {
            return (Currency) Enum.valueOf(Currency.class, str);
        }

        public static Currency[] values() {
            return (Currency[]) $VALUES.clone();
        }
    }
}
