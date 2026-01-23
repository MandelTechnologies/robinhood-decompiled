package rh_server_driven_ui.p531v1;

import com.plaid.internal.EnumC7081g;
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

/* compiled from: ValuePropContent.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&BY\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001d\u001a\u00020\u0002H\u0017J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u0004H\u0016JX\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001b¨\u0006'"}, m3636d2 = {"Lrh_server_driven_ui/v1/ValuePropContent;", "Lcom/squareup/wire/Message;", "", "title", "", "content", "Lrh_server_driven_ui/v1/RenderableText;", "supplemental_action", "Lrh_server_driven_ui/v1/TextWithAction;", "text_style_override", "Lrh_server_driven_ui/v1/TextStyle;", "title_text_color_override", "Lrh_server_driven_ui/v1/ThemedColor;", "content_text_color_override", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lrh_server_driven_ui/v1/RenderableText;Lrh_server_driven_ui/v1/TextWithAction;Lrh_server_driven_ui/v1/TextStyle;Lrh_server_driven_ui/v1/ThemedColor;Lrh_server_driven_ui/v1/ThemedColor;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getContent", "()Lrh_server_driven_ui/v1/RenderableText;", "getSupplemental_action", "()Lrh_server_driven_ui/v1/TextWithAction;", "getText_style_override", "()Lrh_server_driven_ui/v1/TextStyle;", "getTitle_text_color_override", "()Lrh_server_driven_ui/v1/ThemedColor;", "getContent_text_color_override", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class ValuePropContent extends Message {

    @JvmField
    public static final ProtoAdapter<ValuePropContent> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.RenderableText#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 3)
    private final RenderableText content;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "contentTextColorOverride", schemaIndex = 5, tag = 8)
    private final ThemedColor content_text_color_override;

    @WireField(adapter = "rh_server_driven_ui.v1.TextWithAction#ADAPTER", jsonName = "supplementalAction", schemaIndex = 2, tag = 4)
    private final TextWithAction supplemental_action;

    @WireField(adapter = "rh_server_driven_ui.v1.TextStyle#ADAPTER", jsonName = "textStyleOverride", schemaIndex = 3, tag = 5)
    private final TextStyle text_style_override;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 2)
    private final String title;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "titleTextColorOverride", schemaIndex = 4, tag = 7)
    private final ThemedColor title_text_color_override;

    public ValuePropContent() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29862newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final RenderableText getContent() {
        return this.content;
    }

    public final TextWithAction getSupplemental_action() {
        return this.supplemental_action;
    }

    public final TextStyle getText_style_override() {
        return this.text_style_override;
    }

    public final ThemedColor getTitle_text_color_override() {
        return this.title_text_color_override;
    }

    public final ThemedColor getContent_text_color_override() {
        return this.content_text_color_override;
    }

    public /* synthetic */ ValuePropContent(String str, RenderableText renderableText, TextWithAction textWithAction, TextStyle textStyle, ThemedColor themedColor, ThemedColor themedColor2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : renderableText, (i & 4) != 0 ? null : textWithAction, (i & 8) != 0 ? null : textStyle, (i & 16) != 0 ? null : themedColor, (i & 32) != 0 ? null : themedColor2, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValuePropContent(String str, RenderableText renderableText, TextWithAction textWithAction, TextStyle textStyle, ThemedColor themedColor, ThemedColor themedColor2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = str;
        this.content = renderableText;
        this.supplemental_action = textWithAction;
        this.text_style_override = textStyle;
        this.title_text_color_override = themedColor;
        this.content_text_color_override = themedColor2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29862newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ValuePropContent)) {
            return false;
        }
        ValuePropContent valuePropContent = (ValuePropContent) other;
        return Intrinsics.areEqual(unknownFields(), valuePropContent.unknownFields()) && Intrinsics.areEqual(this.title, valuePropContent.title) && Intrinsics.areEqual(this.content, valuePropContent.content) && Intrinsics.areEqual(this.supplemental_action, valuePropContent.supplemental_action) && this.text_style_override == valuePropContent.text_style_override && Intrinsics.areEqual(this.title_text_color_override, valuePropContent.title_text_color_override) && Intrinsics.areEqual(this.content_text_color_override, valuePropContent.content_text_color_override);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        RenderableText renderableText = this.content;
        int iHashCode3 = (iHashCode2 + (renderableText != null ? renderableText.hashCode() : 0)) * 37;
        TextWithAction textWithAction = this.supplemental_action;
        int iHashCode4 = (iHashCode3 + (textWithAction != null ? textWithAction.hashCode() : 0)) * 37;
        TextStyle textStyle = this.text_style_override;
        int iHashCode5 = (iHashCode4 + (textStyle != null ? textStyle.hashCode() : 0)) * 37;
        ThemedColor themedColor = this.title_text_color_override;
        int iHashCode6 = (iHashCode5 + (themedColor != null ? themedColor.hashCode() : 0)) * 37;
        ThemedColor themedColor2 = this.content_text_color_override;
        int iHashCode7 = iHashCode6 + (themedColor2 != null ? themedColor2.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.title;
        if (str != null) {
            arrayList.add("title=" + Internal.sanitize(str));
        }
        RenderableText renderableText = this.content;
        if (renderableText != null) {
            arrayList.add("content=" + renderableText);
        }
        TextWithAction textWithAction = this.supplemental_action;
        if (textWithAction != null) {
            arrayList.add("supplemental_action=" + textWithAction);
        }
        TextStyle textStyle = this.text_style_override;
        if (textStyle != null) {
            arrayList.add("text_style_override=" + textStyle);
        }
        ThemedColor themedColor = this.title_text_color_override;
        if (themedColor != null) {
            arrayList.add("title_text_color_override=" + themedColor);
        }
        ThemedColor themedColor2 = this.content_text_color_override;
        if (themedColor2 != null) {
            arrayList.add("content_text_color_override=" + themedColor2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ValuePropContent{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ValuePropContent copy$default(ValuePropContent valuePropContent, String str, RenderableText renderableText, TextWithAction textWithAction, TextStyle textStyle, ThemedColor themedColor, ThemedColor themedColor2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = valuePropContent.title;
        }
        if ((i & 2) != 0) {
            renderableText = valuePropContent.content;
        }
        if ((i & 4) != 0) {
            textWithAction = valuePropContent.supplemental_action;
        }
        if ((i & 8) != 0) {
            textStyle = valuePropContent.text_style_override;
        }
        if ((i & 16) != 0) {
            themedColor = valuePropContent.title_text_color_override;
        }
        if ((i & 32) != 0) {
            themedColor2 = valuePropContent.content_text_color_override;
        }
        if ((i & 64) != 0) {
            byteString = valuePropContent.unknownFields();
        }
        ThemedColor themedColor3 = themedColor2;
        ByteString byteString2 = byteString;
        ThemedColor themedColor4 = themedColor;
        TextWithAction textWithAction2 = textWithAction;
        return valuePropContent.copy(str, renderableText, textWithAction2, textStyle, themedColor4, themedColor3, byteString2);
    }

    public final ValuePropContent copy(String title, RenderableText content, TextWithAction supplemental_action, TextStyle text_style_override, ThemedColor title_text_color_override, ThemedColor content_text_color_override, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ValuePropContent(title, content, supplemental_action, text_style_override, title_text_color_override, content_text_color_override, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ValuePropContent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ValuePropContent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.ValuePropContent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ValuePropContent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTitle());
                if (value.getContent() != null) {
                    size += RenderableText.ADAPTER.encodedSizeWithTag(3, value.getContent());
                }
                int iEncodedSizeWithTag = size + TextWithAction.ADAPTER.encodedSizeWithTag(4, value.getSupplemental_action()) + TextStyle.ADAPTER.encodedSizeWithTag(5, value.getText_style_override());
                ProtoAdapter<ThemedColor> protoAdapter = ThemedColor.ADAPTER;
                return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(7, value.getTitle_text_color_override()) + protoAdapter.encodedSizeWithTag(8, value.getContent_text_color_override());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ValuePropContent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                if (value.getContent() != null) {
                    RenderableText.ADAPTER.encodeWithTag(writer, 3, (int) value.getContent());
                }
                TextWithAction.ADAPTER.encodeWithTag(writer, 4, (int) value.getSupplemental_action());
                TextStyle.ADAPTER.encodeWithTag(writer, 5, (int) value.getText_style_override());
                ProtoAdapter<ThemedColor> protoAdapter = ThemedColor.ADAPTER;
                protoAdapter.encodeWithTag(writer, 7, (int) value.getTitle_text_color_override());
                protoAdapter.encodeWithTag(writer, 8, (int) value.getContent_text_color_override());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ValuePropContent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<ThemedColor> protoAdapter = ThemedColor.ADAPTER;
                protoAdapter.encodeWithTag(writer, 8, (int) value.getContent_text_color_override());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getTitle_text_color_override());
                TextStyle.ADAPTER.encodeWithTag(writer, 5, (int) value.getText_style_override());
                TextWithAction.ADAPTER.encodeWithTag(writer, 4, (int) value.getSupplemental_action());
                if (value.getContent() != null) {
                    RenderableText.ADAPTER.encodeWithTag(writer, 3, (int) value.getContent());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ValuePropContent redact(ValuePropContent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                RenderableText content = value.getContent();
                RenderableText renderableTextRedact = content != null ? RenderableText.ADAPTER.redact(content) : null;
                TextWithAction supplemental_action = value.getSupplemental_action();
                TextWithAction textWithActionRedact = supplemental_action != null ? TextWithAction.ADAPTER.redact(supplemental_action) : null;
                ThemedColor title_text_color_override = value.getTitle_text_color_override();
                ThemedColor themedColorRedact = title_text_color_override != null ? ThemedColor.ADAPTER.redact(title_text_color_override) : null;
                ThemedColor content_text_color_override = value.getContent_text_color_override();
                return ValuePropContent.copy$default(value, null, renderableTextRedact, textWithActionRedact, null, themedColorRedact, content_text_color_override != null ? ThemedColor.ADAPTER.redact(content_text_color_override) : null, ByteString.EMPTY, 9, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ValuePropContent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                RenderableText renderableTextDecode = null;
                TextWithAction textWithActionDecode = null;
                TextStyle textStyleDecode = null;
                ThemedColor themedColorDecode = null;
                ThemedColor themedColorDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ValuePropContent(strDecode, renderableTextDecode, textWithActionDecode, textStyleDecode, themedColorDecode, themedColorDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        renderableTextDecode = RenderableText.ADAPTER.decode(reader);
                    } else if (iNextTag == 4) {
                        textWithActionDecode = TextWithAction.ADAPTER.decode(reader);
                    } else if (iNextTag == 5) {
                        try {
                            textStyleDecode = TextStyle.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 7) {
                        themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                    } else if (iNextTag == 8) {
                        themedColorDecode2 = ThemedColor.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
