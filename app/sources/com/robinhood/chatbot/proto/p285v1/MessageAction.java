package com.robinhood.chatbot.proto.p285v1;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
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

/* compiled from: MessageAction.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 12\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00011B\u0081\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010)\u001a\u00020\u0002H\u0017J\u0013\u0010*\u001a\u00020\u00122\b\u0010+\u001a\u0004\u0018\u00010,H\u0096\u0002J\b\u0010-\u001a\u00020.H\u0016J\b\u0010/\u001a\u00020\u0006H\u0016J\u0080\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0015R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0016\u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'¨\u00062"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/MessageAction;", "Lcom/squareup/wire/Message;", "", "type", "Lcom/robinhood/chatbot/proto/v1/MessageActionType;", "title", "", "subtitle", "Lcom/robinhood/chatbot/proto/v1/RichText;", "triage_action_attributes", "Lcom/robinhood/chatbot/proto/v1/TriageActionAttributes;", "icon", "button_style", "deeplink_data", "Lcom/robinhood/chatbot/proto/v1/DeepLinkData;", "cta_data", "Lcom/robinhood/chatbot/proto/v1/CTAData;", "disable_after_escalation", "", "disabled", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/chatbot/proto/v1/MessageActionType;Ljava/lang/String;Lcom/robinhood/chatbot/proto/v1/RichText;Lcom/robinhood/chatbot/proto/v1/TriageActionAttributes;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/chatbot/proto/v1/DeepLinkData;Lcom/robinhood/chatbot/proto/v1/CTAData;ZZLokio/ByteString;)V", "getType", "()Lcom/robinhood/chatbot/proto/v1/MessageActionType;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "()Lcom/robinhood/chatbot/proto/v1/RichText;", "getTriage_action_attributes", "()Lcom/robinhood/chatbot/proto/v1/TriageActionAttributes;", "getIcon", "getButton_style", "getDeeplink_data", "()Lcom/robinhood/chatbot/proto/v1/DeepLinkData;", "getCta_data", "()Lcom/robinhood/chatbot/proto/v1/CTAData;", "getDisable_after_escalation", "()Z", "getDisabled", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class MessageAction extends Message {

    @JvmField
    public static final ProtoAdapter<MessageAction> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "buttonStyle", schemaIndex = 5, tag = 5)
    private final String button_style;

    @WireField(adapter = "com.robinhood.chatbot.proto.v1.CTAData#ADAPTER", jsonName = "ctaData", oneofName = WebsocketGatewayConstants.DATA_KEY, schemaIndex = 7, tag = 9)
    private final CTAData cta_data;

    @WireField(adapter = "com.robinhood.chatbot.proto.v1.DeepLinkData#ADAPTER", jsonName = "deeplinkData", oneofName = WebsocketGatewayConstants.DATA_KEY, schemaIndex = 6, tag = 6)
    private final DeepLinkData deeplink_data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "disableAfterEscalation", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 7)
    private final boolean disable_after_escalation;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 8)
    private final boolean disabled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 4)
    private final String icon;

    @WireField(adapter = "com.robinhood.chatbot.proto.v1.RichText#ADAPTER", schemaIndex = 2, tag = 10)
    private final RichText subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String title;

    @WireField(adapter = "com.robinhood.chatbot.proto.v1.TriageActionAttributes#ADAPTER", jsonName = "triageActionAttributes", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 3)
    private final TriageActionAttributes triage_action_attributes;

    @WireField(adapter = "com.robinhood.chatbot.proto.v1.MessageActionType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final MessageActionType type;

    public MessageAction() {
        this(null, null, null, null, null, null, null, null, false, false, null, 2047, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20523newBuilder();
    }

    public final MessageActionType getType() {
        return this.type;
    }

    public /* synthetic */ MessageAction(MessageActionType messageActionType, String str, RichText richText, TriageActionAttributes triageActionAttributes, String str2, String str3, DeepLinkData deepLinkData, CTAData cTAData, boolean z, boolean z2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MessageActionType.MESSAGE_ACTION_TYPE_UNSPECIFIED : messageActionType, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : richText, (i & 8) != 0 ? null : triageActionAttributes, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : deepLinkData, (i & 128) != 0 ? null : cTAData, (i & 256) != 0 ? false : z, (i & 512) != 0 ? false : z2, (i & 1024) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getTitle() {
        return this.title;
    }

    public final RichText getSubtitle() {
        return this.subtitle;
    }

    public final TriageActionAttributes getTriage_action_attributes() {
        return this.triage_action_attributes;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getButton_style() {
        return this.button_style;
    }

    public final DeepLinkData getDeeplink_data() {
        return this.deeplink_data;
    }

    public final CTAData getCta_data() {
        return this.cta_data;
    }

    public final boolean getDisable_after_escalation() {
        return this.disable_after_escalation;
    }

    public final boolean getDisabled() {
        return this.disabled;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageAction(MessageActionType type2, String title, RichText richText, TriageActionAttributes triageActionAttributes, String str, String str2, DeepLinkData deepLinkData, CTAData cTAData, boolean z, boolean z2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.type = type2;
        this.title = title;
        this.subtitle = richText;
        this.triage_action_attributes = triageActionAttributes;
        this.icon = str;
        this.button_style = str2;
        this.deeplink_data = deepLinkData;
        this.cta_data = cTAData;
        this.disable_after_escalation = z;
        this.disabled = z2;
        if (Internal.countNonNull(deepLinkData, cTAData) > 1) {
            throw new IllegalArgumentException("At most one of deeplink_data, cta_data may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20523newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MessageAction)) {
            return false;
        }
        MessageAction messageAction = (MessageAction) other;
        return Intrinsics.areEqual(unknownFields(), messageAction.unknownFields()) && this.type == messageAction.type && Intrinsics.areEqual(this.title, messageAction.title) && Intrinsics.areEqual(this.subtitle, messageAction.subtitle) && Intrinsics.areEqual(this.triage_action_attributes, messageAction.triage_action_attributes) && Intrinsics.areEqual(this.icon, messageAction.icon) && Intrinsics.areEqual(this.button_style, messageAction.button_style) && Intrinsics.areEqual(this.deeplink_data, messageAction.deeplink_data) && Intrinsics.areEqual(this.cta_data, messageAction.cta_data) && this.disable_after_escalation == messageAction.disable_after_escalation && this.disabled == messageAction.disabled;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.type.hashCode()) * 37) + this.title.hashCode()) * 37;
        RichText richText = this.subtitle;
        int iHashCode2 = (iHashCode + (richText != null ? richText.hashCode() : 0)) * 37;
        TriageActionAttributes triageActionAttributes = this.triage_action_attributes;
        int iHashCode3 = (iHashCode2 + (triageActionAttributes != null ? triageActionAttributes.hashCode() : 0)) * 37;
        String str = this.icon;
        int iHashCode4 = (iHashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.button_style;
        int iHashCode5 = (iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        DeepLinkData deepLinkData = this.deeplink_data;
        int iHashCode6 = (iHashCode5 + (deepLinkData != null ? deepLinkData.hashCode() : 0)) * 37;
        CTAData cTAData = this.cta_data;
        int iHashCode7 = ((((iHashCode6 + (cTAData != null ? cTAData.hashCode() : 0)) * 37) + Boolean.hashCode(this.disable_after_escalation)) * 37) + Boolean.hashCode(this.disabled);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("type=" + this.type);
        arrayList.add("title=" + Internal.sanitize(this.title));
        RichText richText = this.subtitle;
        if (richText != null) {
            arrayList.add("subtitle=" + richText);
        }
        TriageActionAttributes triageActionAttributes = this.triage_action_attributes;
        if (triageActionAttributes != null) {
            arrayList.add("triage_action_attributes=" + triageActionAttributes);
        }
        String str = this.icon;
        if (str != null) {
            arrayList.add("icon=" + Internal.sanitize(str));
        }
        String str2 = this.button_style;
        if (str2 != null) {
            arrayList.add("button_style=" + Internal.sanitize(str2));
        }
        DeepLinkData deepLinkData = this.deeplink_data;
        if (deepLinkData != null) {
            arrayList.add("deeplink_data=" + deepLinkData);
        }
        CTAData cTAData = this.cta_data;
        if (cTAData != null) {
            arrayList.add("cta_data=" + cTAData);
        }
        arrayList.add("disable_after_escalation=" + this.disable_after_escalation);
        arrayList.add("disabled=" + this.disabled);
        return CollectionsKt.joinToString$default(arrayList, ", ", "MessageAction{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ MessageAction copy$default(MessageAction messageAction, MessageActionType messageActionType, String str, RichText richText, TriageActionAttributes triageActionAttributes, String str2, String str3, DeepLinkData deepLinkData, CTAData cTAData, boolean z, boolean z2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            messageActionType = messageAction.type;
        }
        if ((i & 2) != 0) {
            str = messageAction.title;
        }
        if ((i & 4) != 0) {
            richText = messageAction.subtitle;
        }
        if ((i & 8) != 0) {
            triageActionAttributes = messageAction.triage_action_attributes;
        }
        if ((i & 16) != 0) {
            str2 = messageAction.icon;
        }
        if ((i & 32) != 0) {
            str3 = messageAction.button_style;
        }
        if ((i & 64) != 0) {
            deepLinkData = messageAction.deeplink_data;
        }
        if ((i & 128) != 0) {
            cTAData = messageAction.cta_data;
        }
        if ((i & 256) != 0) {
            z = messageAction.disable_after_escalation;
        }
        if ((i & 512) != 0) {
            z2 = messageAction.disabled;
        }
        if ((i & 1024) != 0) {
            byteString = messageAction.unknownFields();
        }
        boolean z3 = z2;
        ByteString byteString2 = byteString;
        CTAData cTAData2 = cTAData;
        boolean z4 = z;
        String str4 = str3;
        DeepLinkData deepLinkData2 = deepLinkData;
        String str5 = str2;
        RichText richText2 = richText;
        return messageAction.copy(messageActionType, str, richText2, triageActionAttributes, str5, str4, deepLinkData2, cTAData2, z4, z3, byteString2);
    }

    public final MessageAction copy(MessageActionType type2, String title, RichText subtitle, TriageActionAttributes triage_action_attributes, String icon, String button_style, DeepLinkData deeplink_data, CTAData cta_data, boolean disable_after_escalation, boolean disabled, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MessageAction(type2, title, subtitle, triage_action_attributes, icon, button_style, deeplink_data, cta_data, disable_after_escalation, disabled, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MessageAction.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MessageAction>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.chatbot.proto.v1.MessageAction$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MessageAction value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getType() != MessageActionType.MESSAGE_ACTION_TYPE_UNSPECIFIED) {
                    size += MessageActionType.ADAPTER.encodedSizeWithTag(1, value.getType());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTitle());
                }
                int iEncodedSizeWithTag = size + RichText.ADAPTER.encodedSizeWithTag(10, value.getSubtitle());
                if (value.getTriage_action_attributes() != null) {
                    iEncodedSizeWithTag += TriageActionAttributes.ADAPTER.encodedSizeWithTag(3, value.getTriage_action_attributes());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(4, value.getIcon()) + protoAdapter.encodedSizeWithTag(5, value.getButton_style()) + DeepLinkData.ADAPTER.encodedSizeWithTag(6, value.getDeeplink_data()) + CTAData.ADAPTER.encodedSizeWithTag(9, value.getCta_data());
                if (value.getDisable_after_escalation()) {
                    iEncodedSizeWithTag2 += ProtoAdapter.BOOL.encodedSizeWithTag(7, Boolean.valueOf(value.getDisable_after_escalation()));
                }
                return value.getDisabled() ? iEncodedSizeWithTag2 + ProtoAdapter.BOOL.encodedSizeWithTag(8, Boolean.valueOf(value.getDisabled())) : iEncodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MessageAction value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getType() != MessageActionType.MESSAGE_ACTION_TYPE_UNSPECIFIED) {
                    MessageActionType.ADAPTER.encodeWithTag(writer, 1, (int) value.getType());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                RichText.ADAPTER.encodeWithTag(writer, 10, (int) value.getSubtitle());
                if (value.getTriage_action_attributes() != null) {
                    TriageActionAttributes.ADAPTER.encodeWithTag(writer, 3, (int) value.getTriage_action_attributes());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getIcon());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getButton_style());
                if (value.getDisable_after_escalation()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 7, (int) Boolean.valueOf(value.getDisable_after_escalation()));
                }
                if (value.getDisabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 8, (int) Boolean.valueOf(value.getDisabled()));
                }
                DeepLinkData.ADAPTER.encodeWithTag(writer, 6, (int) value.getDeeplink_data());
                CTAData.ADAPTER.encodeWithTag(writer, 9, (int) value.getCta_data());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MessageAction value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                CTAData.ADAPTER.encodeWithTag(writer, 9, (int) value.getCta_data());
                DeepLinkData.ADAPTER.encodeWithTag(writer, 6, (int) value.getDeeplink_data());
                if (value.getDisabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 8, (int) Boolean.valueOf(value.getDisabled()));
                }
                if (value.getDisable_after_escalation()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 7, (int) Boolean.valueOf(value.getDisable_after_escalation()));
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 5, (int) value.getButton_style());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getIcon());
                if (value.getTriage_action_attributes() != null) {
                    TriageActionAttributes.ADAPTER.encodeWithTag(writer, 3, (int) value.getTriage_action_attributes());
                }
                RichText.ADAPTER.encodeWithTag(writer, 10, (int) value.getSubtitle());
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                if (value.getType() != MessageActionType.MESSAGE_ACTION_TYPE_UNSPECIFIED) {
                    MessageActionType.ADAPTER.encodeWithTag(writer, 1, (int) value.getType());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public MessageAction decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                MessageActionType messageActionTypeDecode = MessageActionType.MESSAGE_ACTION_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                TriageActionAttributes triageActionAttributesDecode = null;
                String strDecode = null;
                String strDecode2 = null;
                DeepLinkData deepLinkDataDecode = null;
                CTAData cTADataDecode = null;
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                String strDecode3 = "";
                RichText richTextDecode = null;
                while (true) {
                    MessageActionType messageActionType = messageActionTypeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    try {
                                        messageActionTypeDecode = MessageActionType.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 2:
                                    strDecode3 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 3:
                                    triageActionAttributesDecode = TriageActionAttributes.ADAPTER.decode(reader);
                                    break;
                                case 4:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 5:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 6:
                                    deepLinkDataDecode = DeepLinkData.ADAPTER.decode(reader);
                                    break;
                                case 7:
                                    zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    break;
                                case 8:
                                    zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    break;
                                case 9:
                                    cTADataDecode = CTAData.ADAPTER.decode(reader);
                                    break;
                                case 10:
                                    richTextDecode = RichText.ADAPTER.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new MessageAction(messageActionType, strDecode3, richTextDecode, triageActionAttributesDecode, strDecode, strDecode2, deepLinkDataDecode, cTADataDecode, zBooleanValue, zBooleanValue2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MessageAction redact(MessageAction value) {
                Intrinsics.checkNotNullParameter(value, "value");
                RichText subtitle = value.getSubtitle();
                RichText richTextRedact = subtitle != null ? RichText.ADAPTER.redact(subtitle) : null;
                TriageActionAttributes triage_action_attributes = value.getTriage_action_attributes();
                TriageActionAttributes triageActionAttributesRedact = triage_action_attributes != null ? TriageActionAttributes.ADAPTER.redact(triage_action_attributes) : null;
                DeepLinkData deeplink_data = value.getDeeplink_data();
                DeepLinkData deepLinkDataRedact = deeplink_data != null ? DeepLinkData.ADAPTER.redact(deeplink_data) : null;
                CTAData cta_data = value.getCta_data();
                return MessageAction.copy$default(value, null, null, richTextRedact, triageActionAttributesRedact, null, null, deepLinkDataRedact, cta_data != null ? CTAData.ADAPTER.redact(cta_data) : null, false, false, ByteString.EMPTY, 819, null);
            }
        };
    }
}
