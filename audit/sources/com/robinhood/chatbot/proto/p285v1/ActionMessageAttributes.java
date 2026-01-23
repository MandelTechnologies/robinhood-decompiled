package com.robinhood.chatbot.proto.p285v1;

import com.robinhood.android.car.result.CarResultComposable2;
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
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
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

/* compiled from: ActionMessageAttributes.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001c\u001a\u00020\u0002H\u0017J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u0004H\u0016JN\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006&"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/ActionMessageAttributes;", "Lcom/squareup/wire/Message;", "", CarResultComposable2.BODY, "", "actions", "", "Lcom/robinhood/chatbot/proto/v1/MessageAction;", Footer.f10637type, "Lcom/robinhood/chatbot/proto/v1/RichText;", ResourceTypes.STYLE, "Lcom/robinhood/chatbot/proto/v1/ActionMessageStyle;", "img_url", "Lcom/robinhood/chatbot/proto/v1/ImgUrl;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/robinhood/chatbot/proto/v1/RichText;Lcom/robinhood/chatbot/proto/v1/ActionMessageStyle;Lcom/robinhood/chatbot/proto/v1/ImgUrl;Lokio/ByteString;)V", "getBody", "()Ljava/lang/String;", "getFooter", "()Lcom/robinhood/chatbot/proto/v1/RichText;", "getStyle", "()Lcom/robinhood/chatbot/proto/v1/ActionMessageStyle;", "getImg_url", "()Lcom/robinhood/chatbot/proto/v1/ImgUrl;", "getActions", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class ActionMessageAttributes extends Message {

    @JvmField
    public static final ProtoAdapter<ActionMessageAttributes> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.chatbot.proto.v1.MessageAction#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<MessageAction> actions;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String body;

    @WireField(adapter = "com.robinhood.chatbot.proto.v1.RichText#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final RichText footer;

    @WireField(adapter = "com.robinhood.chatbot.proto.v1.ImgUrl#ADAPTER", jsonName = "imgUrl", schemaIndex = 4, tag = 5)
    private final ImgUrl img_url;

    @WireField(adapter = "com.robinhood.chatbot.proto.v1.ActionMessageStyle#ADAPTER", schemaIndex = 3, tag = 4)
    private final ActionMessageStyle style;

    public ActionMessageAttributes() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20464newBuilder();
    }

    public final String getBody() {
        return this.body;
    }

    public /* synthetic */ ActionMessageAttributes(String str, List list, RichText richText, ActionMessageStyle actionMessageStyle, ImgUrl imgUrl, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : richText, (i & 8) != 0 ? null : actionMessageStyle, (i & 16) != 0 ? null : imgUrl, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    public final RichText getFooter() {
        return this.footer;
    }

    public final ActionMessageStyle getStyle() {
        return this.style;
    }

    public final ImgUrl getImg_url() {
        return this.img_url;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionMessageAttributes(String body, List<MessageAction> actions, RichText richText, ActionMessageStyle actionMessageStyle, ImgUrl imgUrl, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.body = body;
        this.footer = richText;
        this.style = actionMessageStyle;
        this.img_url = imgUrl;
        this.actions = Internal.immutableCopyOf("actions", actions);
    }

    public final List<MessageAction> getActions() {
        return this.actions;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20464newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ActionMessageAttributes)) {
            return false;
        }
        ActionMessageAttributes actionMessageAttributes = (ActionMessageAttributes) other;
        return Intrinsics.areEqual(unknownFields(), actionMessageAttributes.unknownFields()) && Intrinsics.areEqual(this.body, actionMessageAttributes.body) && Intrinsics.areEqual(this.actions, actionMessageAttributes.actions) && Intrinsics.areEqual(this.footer, actionMessageAttributes.footer) && this.style == actionMessageAttributes.style && Intrinsics.areEqual(this.img_url, actionMessageAttributes.img_url);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.body.hashCode()) * 37) + this.actions.hashCode()) * 37;
        RichText richText = this.footer;
        int iHashCode2 = (iHashCode + (richText != null ? richText.hashCode() : 0)) * 37;
        ActionMessageStyle actionMessageStyle = this.style;
        int iHashCode3 = (iHashCode2 + (actionMessageStyle != null ? actionMessageStyle.hashCode() : 0)) * 37;
        ImgUrl imgUrl = this.img_url;
        int iHashCode4 = iHashCode3 + (imgUrl != null ? imgUrl.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("body=" + Internal.sanitize(this.body));
        if (!this.actions.isEmpty()) {
            arrayList.add("actions=" + this.actions);
        }
        RichText richText = this.footer;
        if (richText != null) {
            arrayList.add("footer=" + richText);
        }
        ActionMessageStyle actionMessageStyle = this.style;
        if (actionMessageStyle != null) {
            arrayList.add("style=" + actionMessageStyle);
        }
        ImgUrl imgUrl = this.img_url;
        if (imgUrl != null) {
            arrayList.add("img_url=" + imgUrl);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ActionMessageAttributes{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ActionMessageAttributes copy$default(ActionMessageAttributes actionMessageAttributes, String str, List list, RichText richText, ActionMessageStyle actionMessageStyle, ImgUrl imgUrl, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = actionMessageAttributes.body;
        }
        if ((i & 2) != 0) {
            list = actionMessageAttributes.actions;
        }
        if ((i & 4) != 0) {
            richText = actionMessageAttributes.footer;
        }
        if ((i & 8) != 0) {
            actionMessageStyle = actionMessageAttributes.style;
        }
        if ((i & 16) != 0) {
            imgUrl = actionMessageAttributes.img_url;
        }
        if ((i & 32) != 0) {
            byteString = actionMessageAttributes.unknownFields();
        }
        ImgUrl imgUrl2 = imgUrl;
        ByteString byteString2 = byteString;
        return actionMessageAttributes.copy(str, list, richText, actionMessageStyle, imgUrl2, byteString2);
    }

    public final ActionMessageAttributes copy(String body, List<MessageAction> actions, RichText footer, ActionMessageStyle style, ImgUrl img_url, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ActionMessageAttributes(body, actions, footer, style, img_url, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ActionMessageAttributes.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ActionMessageAttributes>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.chatbot.proto.v1.ActionMessageAttributes$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ActionMessageAttributes value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getBody(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getBody());
                }
                int iEncodedSizeWithTag = size + MessageAction.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getActions());
                if (value.getFooter() != null) {
                    iEncodedSizeWithTag += RichText.ADAPTER.encodedSizeWithTag(3, value.getFooter());
                }
                return iEncodedSizeWithTag + ActionMessageStyle.ADAPTER.encodedSizeWithTag(4, value.getStyle()) + ImgUrl.ADAPTER.encodedSizeWithTag(5, value.getImg_url());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ActionMessageAttributes value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getBody(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getBody());
                }
                MessageAction.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getActions());
                if (value.getFooter() != null) {
                    RichText.ADAPTER.encodeWithTag(writer, 3, (int) value.getFooter());
                }
                ActionMessageStyle.ADAPTER.encodeWithTag(writer, 4, (int) value.getStyle());
                ImgUrl.ADAPTER.encodeWithTag(writer, 5, (int) value.getImg_url());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ActionMessageAttributes value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ImgUrl.ADAPTER.encodeWithTag(writer, 5, (int) value.getImg_url());
                ActionMessageStyle.ADAPTER.encodeWithTag(writer, 4, (int) value.getStyle());
                if (value.getFooter() != null) {
                    RichText.ADAPTER.encodeWithTag(writer, 3, (int) value.getFooter());
                }
                MessageAction.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getActions());
                if (Intrinsics.areEqual(value.getBody(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getBody());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ActionMessageAttributes decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                RichText richTextDecode = null;
                ActionMessageStyle actionMessageStyleDecode = null;
                ImgUrl imgUrlDecode = null;
                while (true) {
                    String str = strDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new ActionMessageAttributes(str, arrayList, richTextDecode, actionMessageStyleDecode, imgUrlDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag != 1) {
                            if (iNextTag == 2) {
                                arrayList.add(MessageAction.ADAPTER.decode(reader));
                            } else if (iNextTag == 3) {
                                richTextDecode = RichText.ADAPTER.decode(reader);
                            } else if (iNextTag == 4) {
                                try {
                                    actionMessageStyleDecode = ActionMessageStyle.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            } else if (iNextTag == 5) {
                                imgUrlDecode = ImgUrl.ADAPTER.decode(reader);
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }
                    strDecode = ProtoAdapter.STRING.decode(reader);
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ActionMessageAttributes redact(ActionMessageAttributes value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List listM26823redactElements = Internal.m26823redactElements(value.getActions(), MessageAction.ADAPTER);
                RichText footer = value.getFooter();
                RichText richTextRedact = footer != null ? RichText.ADAPTER.redact(footer) : null;
                ImgUrl img_url = value.getImg_url();
                return ActionMessageAttributes.copy$default(value, null, listM26823redactElements, richTextRedact, null, img_url != null ? ImgUrl.ADAPTER.redact(img_url) : null, ByteString.EMPTY, 9, null);
            }
        };
    }
}
