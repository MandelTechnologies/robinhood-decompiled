package rh_server_driven_ui.p531v1;

import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
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
import rh_server_driven_ui.p531v1.InfoBanner;

/* compiled from: InfoBanner.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003$%&BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001b\u001a\u00020\u0002H\u0017J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\fH\u0016JL\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006'"}, m3636d2 = {"Lrh_server_driven_ui/v1/InfoBanner;", "Lcom/squareup/wire/Message;", "", "text", "Lrh_server_driven_ui/v1/RenderableText;", "icon", "Lrh_server_driven_ui/v1/Icon;", AccountOverviewOptionsSettingCard4.CTA, "Lrh_server_driven_ui/v1/InfoBanner$Cta;", ResourceTypes.STYLE, "Lrh_server_driven_ui/v1/InfoBanner$Style;", "logging_identifier", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/RenderableText;Lrh_server_driven_ui/v1/Icon;Lrh_server_driven_ui/v1/InfoBanner$Cta;Lrh_server_driven_ui/v1/InfoBanner$Style;Ljava/lang/String;Lokio/ByteString;)V", "getText", "()Lrh_server_driven_ui/v1/RenderableText;", "getIcon", "()Lrh_server_driven_ui/v1/Icon;", "getCta", "()Lrh_server_driven_ui/v1/InfoBanner$Cta;", "getStyle", "()Lrh_server_driven_ui/v1/InfoBanner$Style;", "getLogging_identifier", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "Style", "Cta", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class InfoBanner extends Message {

    @JvmField
    public static final ProtoAdapter<InfoBanner> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.InfoBanner$Cta#ADAPTER", schemaIndex = 2, tag = 3)
    private final Cta cta;

    @WireField(adapter = "rh_server_driven_ui.v1.Icon#ADAPTER", schemaIndex = 1, tag = 2)
    private final Icon icon;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "loggingIdentifier", schemaIndex = 4, tag = 5)
    private final String logging_identifier;

    @WireField(adapter = "rh_server_driven_ui.v1.InfoBanner$Style#ADAPTER", schemaIndex = 3, tag = 4)
    private final Style style;

    @WireField(adapter = "rh_server_driven_ui.v1.RenderableText#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final RenderableText text;

    public InfoBanner() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29763newBuilder();
    }

    public final RenderableText getText() {
        return this.text;
    }

    public final Icon getIcon() {
        return this.icon;
    }

    public final Cta getCta() {
        return this.cta;
    }

    public final Style getStyle() {
        return this.style;
    }

    public final String getLogging_identifier() {
        return this.logging_identifier;
    }

    public /* synthetic */ InfoBanner(RenderableText renderableText, Icon icon, Cta cta, Style style, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : renderableText, (i & 2) != 0 ? null : icon, (i & 4) != 0 ? null : cta, (i & 8) != 0 ? null : style, (i & 16) != 0 ? null : str, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoBanner(RenderableText renderableText, Icon icon, Cta cta, Style style, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.text = renderableText;
        this.icon = icon;
        this.cta = cta;
        this.style = style;
        this.logging_identifier = str;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29763newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InfoBanner)) {
            return false;
        }
        InfoBanner infoBanner = (InfoBanner) other;
        return Intrinsics.areEqual(unknownFields(), infoBanner.unknownFields()) && Intrinsics.areEqual(this.text, infoBanner.text) && this.icon == infoBanner.icon && Intrinsics.areEqual(this.cta, infoBanner.cta) && Intrinsics.areEqual(this.style, infoBanner.style) && Intrinsics.areEqual(this.logging_identifier, infoBanner.logging_identifier);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        RenderableText renderableText = this.text;
        int iHashCode2 = (iHashCode + (renderableText != null ? renderableText.hashCode() : 0)) * 37;
        Icon icon = this.icon;
        int iHashCode3 = (iHashCode2 + (icon != null ? icon.hashCode() : 0)) * 37;
        Cta cta = this.cta;
        int iHashCode4 = (iHashCode3 + (cta != null ? cta.hashCode() : 0)) * 37;
        Style style = this.style;
        int iHashCode5 = (iHashCode4 + (style != null ? style.hashCode() : 0)) * 37;
        String str = this.logging_identifier;
        int iHashCode6 = iHashCode5 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        RenderableText renderableText = this.text;
        if (renderableText != null) {
            arrayList.add("text=" + renderableText);
        }
        Icon icon = this.icon;
        if (icon != null) {
            arrayList.add("icon=" + icon);
        }
        Cta cta = this.cta;
        if (cta != null) {
            arrayList.add("cta=" + cta);
        }
        Style style = this.style;
        if (style != null) {
            arrayList.add("style=" + style);
        }
        String str = this.logging_identifier;
        if (str != null) {
            arrayList.add("logging_identifier=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InfoBanner{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ InfoBanner copy$default(InfoBanner infoBanner, RenderableText renderableText, Icon icon, Cta cta, Style style, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            renderableText = infoBanner.text;
        }
        if ((i & 2) != 0) {
            icon = infoBanner.icon;
        }
        if ((i & 4) != 0) {
            cta = infoBanner.cta;
        }
        if ((i & 8) != 0) {
            style = infoBanner.style;
        }
        if ((i & 16) != 0) {
            str = infoBanner.logging_identifier;
        }
        if ((i & 32) != 0) {
            byteString = infoBanner.unknownFields();
        }
        String str2 = str;
        ByteString byteString2 = byteString;
        return infoBanner.copy(renderableText, icon, cta, style, str2, byteString2);
    }

    public final InfoBanner copy(RenderableText text, Icon icon, Cta cta, Style style, String logging_identifier, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new InfoBanner(text, icon, cta, style, logging_identifier, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InfoBanner.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<InfoBanner>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.InfoBanner$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InfoBanner value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getText() != null) {
                    size += RenderableText.ADAPTER.encodedSizeWithTag(1, value.getText());
                }
                return size + Icon.ADAPTER.encodedSizeWithTag(2, value.getIcon()) + InfoBanner.Cta.ADAPTER.encodedSizeWithTag(3, value.getCta()) + InfoBanner.Style.ADAPTER.encodedSizeWithTag(4, value.getStyle()) + ProtoAdapter.STRING.encodedSizeWithTag(5, value.getLogging_identifier());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InfoBanner value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getText() != null) {
                    RenderableText.ADAPTER.encodeWithTag(writer, 1, (int) value.getText());
                }
                Icon.ADAPTER.encodeWithTag(writer, 2, (int) value.getIcon());
                InfoBanner.Cta.ADAPTER.encodeWithTag(writer, 3, (int) value.getCta());
                InfoBanner.Style.ADAPTER.encodeWithTag(writer, 4, (int) value.getStyle());
                ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getLogging_identifier());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InfoBanner value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getLogging_identifier());
                InfoBanner.Style.ADAPTER.encodeWithTag(writer, 4, (int) value.getStyle());
                InfoBanner.Cta.ADAPTER.encodeWithTag(writer, 3, (int) value.getCta());
                Icon.ADAPTER.encodeWithTag(writer, 2, (int) value.getIcon());
                if (value.getText() != null) {
                    RenderableText.ADAPTER.encodeWithTag(writer, 1, (int) value.getText());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InfoBanner redact(InfoBanner value) {
                Intrinsics.checkNotNullParameter(value, "value");
                RenderableText text = value.getText();
                RenderableText renderableTextRedact = text != null ? RenderableText.ADAPTER.redact(text) : null;
                InfoBanner.Cta cta = value.getCta();
                InfoBanner.Cta ctaRedact = cta != null ? InfoBanner.Cta.ADAPTER.redact(cta) : null;
                InfoBanner.Style style = value.getStyle();
                return InfoBanner.copy$default(value, renderableTextRedact, null, ctaRedact, style != null ? InfoBanner.Style.ADAPTER.redact(style) : null, null, ByteString.EMPTY, 18, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InfoBanner decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                RenderableText renderableTextDecode = null;
                Icon iconDecode = null;
                InfoBanner.Cta ctaDecode = null;
                InfoBanner.Style styleDecode = null;
                String strDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new InfoBanner(renderableTextDecode, iconDecode, ctaDecode, styleDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        renderableTextDecode = RenderableText.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        try {
                            iconDecode = Icon.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 3) {
                        ctaDecode = InfoBanner.Cta.ADAPTER.decode(reader);
                    } else if (iNextTag == 4) {
                        styleDecode = InfoBanner.Style.ADAPTER.decode(reader);
                    } else if (iNextTag == 5) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }

    /* compiled from: InfoBanner.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J(\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0018"}, m3636d2 = {"Lrh_server_driven_ui/v1/InfoBanner$Style;", "Lcom/squareup/wire/Message;", "", "text_color_override", "Lrh_server_driven_ui/v1/ThemedColor;", "background_color_override", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/ThemedColor;Lrh_server_driven_ui/v1/ThemedColor;Lokio/ByteString;)V", "getText_color_override", "()Lrh_server_driven_ui/v1/ThemedColor;", "getBackground_color_override", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Style extends Message {

        @JvmField
        public static final ProtoAdapter<Style> ADAPTER;

        @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "backgroundColorOverride", schemaIndex = 1, tag = 2)
        private final ThemedColor background_color_override;

        @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "textColorOverride", schemaIndex = 0, tag = 1)
        private final ThemedColor text_color_override;

        public Style() {
            this(null, null, null, 7, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29765newBuilder();
        }

        public final ThemedColor getText_color_override() {
            return this.text_color_override;
        }

        public final ThemedColor getBackground_color_override() {
            return this.background_color_override;
        }

        public /* synthetic */ Style(ThemedColor themedColor, ThemedColor themedColor2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : themedColor, (i & 2) != 0 ? null : themedColor2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Style(ThemedColor themedColor, ThemedColor themedColor2, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.text_color_override = themedColor;
            this.background_color_override = themedColor2;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29765newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Style)) {
                return false;
            }
            Style style = (Style) other;
            return Intrinsics.areEqual(unknownFields(), style.unknownFields()) && Intrinsics.areEqual(this.text_color_override, style.text_color_override) && Intrinsics.areEqual(this.background_color_override, style.background_color_override);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            ThemedColor themedColor = this.text_color_override;
            int iHashCode2 = (iHashCode + (themedColor != null ? themedColor.hashCode() : 0)) * 37;
            ThemedColor themedColor2 = this.background_color_override;
            int iHashCode3 = iHashCode2 + (themedColor2 != null ? themedColor2.hashCode() : 0);
            this.hashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            ThemedColor themedColor = this.text_color_override;
            if (themedColor != null) {
                arrayList.add("text_color_override=" + themedColor);
            }
            ThemedColor themedColor2 = this.background_color_override;
            if (themedColor2 != null) {
                arrayList.add("background_color_override=" + themedColor2);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Style{", "}", 0, null, null, 56, null);
        }

        public final Style copy(ThemedColor text_color_override, ThemedColor background_color_override, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new Style(text_color_override, background_color_override, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Style.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<Style>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.InfoBanner$Style$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(InfoBanner.Style value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    ProtoAdapter<ThemedColor> protoAdapter = ThemedColor.ADAPTER;
                    return size + protoAdapter.encodedSizeWithTag(1, value.getText_color_override()) + protoAdapter.encodedSizeWithTag(2, value.getBackground_color_override());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, InfoBanner.Style value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    ProtoAdapter<ThemedColor> protoAdapter = ThemedColor.ADAPTER;
                    protoAdapter.encodeWithTag(writer, 1, (int) value.getText_color_override());
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getBackground_color_override());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, InfoBanner.Style value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter<ThemedColor> protoAdapter = ThemedColor.ADAPTER;
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getBackground_color_override());
                    protoAdapter.encodeWithTag(writer, 1, (int) value.getText_color_override());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public InfoBanner.Style redact(InfoBanner.Style value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    ThemedColor text_color_override = value.getText_color_override();
                    ThemedColor themedColorRedact = text_color_override != null ? ThemedColor.ADAPTER.redact(text_color_override) : null;
                    ThemedColor background_color_override = value.getBackground_color_override();
                    return value.copy(themedColorRedact, background_color_override != null ? ThemedColor.ADAPTER.redact(background_color_override) : null, ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public InfoBanner.Style decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    ThemedColor themedColorDecode = null;
                    ThemedColor themedColorDecode2 = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new InfoBanner.Style(themedColorDecode, themedColorDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                        } else if (iNextTag == 2) {
                            themedColorDecode2 = ThemedColor.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            };
        }
    }

    /* compiled from: InfoBanner.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J&\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lrh_server_driven_ui/v1/InfoBanner$Cta;", "Lcom/squareup/wire/Message;", "", "text", "", "action", "Lrh_server_driven_ui/v1/Action;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lrh_server_driven_ui/v1/Action;Lokio/ByteString;)V", "getText", "()Ljava/lang/String;", "getAction", "()Lrh_server_driven_ui/v1/Action;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Cta extends Message {

        @JvmField
        public static final ProtoAdapter<Cta> ADAPTER;

        @WireField(adapter = "rh_server_driven_ui.v1.Action#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final Action action;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String text;

        public Cta() {
            this(null, null, null, 7, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29764newBuilder();
        }

        public final String getText() {
            return this.text;
        }

        public /* synthetic */ Cta(String str, Action action, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : action, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public final Action getAction() {
            return this.action;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Cta(String text, Action action, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.text = text;
            this.action = action;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29764newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Cta)) {
                return false;
            }
            Cta cta = (Cta) other;
            return Intrinsics.areEqual(unknownFields(), cta.unknownFields()) && Intrinsics.areEqual(this.text, cta.text) && Intrinsics.areEqual(this.action, cta.action);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = ((unknownFields().hashCode() * 37) + this.text.hashCode()) * 37;
            Action action = this.action;
            int iHashCode2 = iHashCode + (action != null ? action.hashCode() : 0);
            this.hashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("text=" + Internal.sanitize(this.text));
            Action action = this.action;
            if (action != null) {
                arrayList.add("action=" + action);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Cta{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ Cta copy$default(Cta cta, String str, Action action, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cta.text;
            }
            if ((i & 2) != 0) {
                action = cta.action;
            }
            if ((i & 4) != 0) {
                byteString = cta.unknownFields();
            }
            return cta.copy(str, action, byteString);
        }

        public final Cta copy(String text, Action action, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new Cta(text, action, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Cta.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<Cta>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.InfoBanner$Cta$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(InfoBanner.Cta value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (!Intrinsics.areEqual(value.getText(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getText());
                    }
                    return value.getAction() != null ? size + Action.ADAPTER.encodedSizeWithTag(2, value.getAction()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, InfoBanner.Cta value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getText(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getText());
                    }
                    if (value.getAction() != null) {
                        Action.ADAPTER.encodeWithTag(writer, 2, (int) value.getAction());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, InfoBanner.Cta value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getAction() != null) {
                        Action.ADAPTER.encodeWithTag(writer, 2, (int) value.getAction());
                    }
                    if (Intrinsics.areEqual(value.getText(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getText());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public InfoBanner.Cta redact(InfoBanner.Cta value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    Action action = value.getAction();
                    return InfoBanner.Cta.copy$default(value, null, action != null ? Action.ADAPTER.redact(action) : null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public InfoBanner.Cta decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    Action actionDecode = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new InfoBanner.Cta(strDecode, actionDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            actionDecode = Action.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            };
        }
    }
}
