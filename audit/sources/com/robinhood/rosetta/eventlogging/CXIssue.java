package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.CXIssue;
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

/* compiled from: CXIssue.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u0000\n\u0002\b\u000b\u0018\u0000 M2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0007MNOPQRSBí\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u0012\b\b\u0002\u0010\u001f\u001a\u00020 \u0012\b\b\u0002\u0010!\u001a\u00020\u0004\u0012\b\b\u0002\u0010\"\u001a\u00020 \u0012\b\b\u0002\u0010#\u001a\u00020$¢\u0006\u0004\b%\u0010&J\b\u0010F\u001a\u00020\u0002H\u0017J\u0013\u0010G\u001a\u00020 2\b\u0010H\u001a\u0004\u0018\u00010IH\u0096\u0002J\b\u0010J\u001a\u00020\u0012H\u0016J\b\u0010K\u001a\u00020\u0004H\u0016Jì\u0001\u0010L\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020$R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010(R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u00100R\u0016\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010(R\u0016\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010(R\u0016\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010(R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0016\u0010\u0015\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010(R\u0016\u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010(R\u0016\u0010\u0017\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010(R\u0016\u0010\u0018\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0016\u0010\u001a\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010(R\u0016\u0010\u001b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010(R\u0016\u0010\u001c\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u00105R\u0016\u0010\u001d\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u001c\u0010\u001f\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bB\u0010C\u001a\u0004\b\u001f\u0010DR\u0016\u0010!\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010(R\u0016\u0010\"\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010D¨\u0006T"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CXIssue;", "Lcom/squareup/wire/Message;", "", "inquiry_id", "", "cx_call_status", "Lcom/robinhood/rosetta/eventlogging/CXIssue$CallStatus;", "phone_unavailable_reason", "Lcom/robinhood/rosetta/eventlogging/CXIssue$PhoneUnavailableReason;", "enable_push_notifications_reason", "Lcom/robinhood/rosetta/eventlogging/CXIssue$EnablePushNotificationReason;", "call_schedule_option_id", "is_text_form_focus", "Lcom/robinhood/rosetta/eventlogging/Boolean;", "text_form_message_type", "deeplink", "opened_url", "case_count", "", "inbox_load_fail", "Lcom/robinhood/rosetta/eventlogging/CXIssue$InboxLoadFail;", "issue_id", "sub_action", "chatbot_id", "chat_message_sender", "Lcom/robinhood/rosetta/eventlogging/CXIssue$ChatMessageSender;", "chat_message_id", "chat_link_title", "recommended_action_count", "agent_chat_type", "Lcom/robinhood/rosetta/eventlogging/CXIssue$AgentChatType;", "is_concierge", "", "appointment_id", "is_concierge_user", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/CXIssue$CallStatus;Lcom/robinhood/rosetta/eventlogging/CXIssue$PhoneUnavailableReason;Lcom/robinhood/rosetta/eventlogging/CXIssue$EnablePushNotificationReason;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/robinhood/rosetta/eventlogging/CXIssue$InboxLoadFail;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/CXIssue$ChatMessageSender;Ljava/lang/String;Ljava/lang/String;ILcom/robinhood/rosetta/eventlogging/CXIssue$AgentChatType;ZLjava/lang/String;ZLokio/ByteString;)V", "getInquiry_id", "()Ljava/lang/String;", "getCx_call_status", "()Lcom/robinhood/rosetta/eventlogging/CXIssue$CallStatus;", "getPhone_unavailable_reason", "()Lcom/robinhood/rosetta/eventlogging/CXIssue$PhoneUnavailableReason;", "getEnable_push_notifications_reason", "()Lcom/robinhood/rosetta/eventlogging/CXIssue$EnablePushNotificationReason;", "getCall_schedule_option_id", "()Lcom/robinhood/rosetta/eventlogging/Boolean;", "getText_form_message_type", "getDeeplink", "getOpened_url", "getCase_count", "()I", "getInbox_load_fail", "()Lcom/robinhood/rosetta/eventlogging/CXIssue$InboxLoadFail;", "getIssue_id", "getSub_action", "getChatbot_id", "getChat_message_sender", "()Lcom/robinhood/rosetta/eventlogging/CXIssue$ChatMessageSender;", "getChat_message_id", "getChat_link_title", "getRecommended_action_count", "getAgent_chat_type", "()Lcom/robinhood/rosetta/eventlogging/CXIssue$AgentChatType;", "is_concierge$annotations", "()V", "()Z", "getAppointment_id", "newBuilder", "equals", "other", "", "hashCode", "toString", "copy", "Companion", "CallStatus", "PhoneUnavailableReason", "EnablePushNotificationReason", "InboxLoadFail", "ChatMessageSender", "AgentChatType", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class CXIssue extends Message {

    @JvmField
    public static final ProtoAdapter<CXIssue> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CXIssue$AgentChatType#ADAPTER", jsonName = "agentChatType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 18, tag = 18)
    private final AgentChatType agent_chat_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "appointmentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 20, tag = 20)
    private final String appointment_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "callScheduleOptionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 35)
    private final String call_schedule_option_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "caseCount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 9)
    private final int case_count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "chatLinkTitle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 16)
    private final String chat_link_title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "chatMessageId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 15)
    private final String chat_message_id;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CXIssue$ChatMessageSender#ADAPTER", jsonName = "chatMessageSender", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 14)
    private final ChatMessageSender chat_message_sender;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "chatbotId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 13)
    private final String chatbot_id;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CXIssue$CallStatus#ADAPTER", jsonName = "cxCallStatus", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final CallStatus cx_call_status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 7)
    private final String deeplink;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CXIssue$EnablePushNotificationReason#ADAPTER", jsonName = "enablePushNotificationsReason", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final EnablePushNotificationReason enable_push_notifications_reason;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CXIssue$InboxLoadFail#ADAPTER", jsonName = "inboxLoadFail", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 10)
    private final InboxLoadFail inbox_load_fail;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "inquiryId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String inquiry_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isConcierge", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 19, tag = 19)
    private final boolean is_concierge;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isConciergeUser", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 21, tag = 21)
    private final boolean is_concierge_user;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Boolean#ADAPTER", jsonName = "isTextFormFocus", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 5)
    private final Boolean is_text_form_focus;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "issueId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 11)
    private final String issue_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "openedUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 8)
    private final String opened_url;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CXIssue$PhoneUnavailableReason#ADAPTER", jsonName = "phoneUnavailableReason", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final PhoneUnavailableReason phone_unavailable_reason;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "recommendedActionCount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 17)
    private final int recommended_action_count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "subAction", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 12)
    private final String sub_action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "textFormMessageType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 6)
    private final String text_form_message_type;

    public CXIssue() {
        this(null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, null, false, null, false, null, 8388607, null);
    }

    @Deprecated
    public static /* synthetic */ void is_concierge$annotations() {
    }

    public /* synthetic */ CXIssue(String str, CallStatus callStatus, PhoneUnavailableReason phoneUnavailableReason, EnablePushNotificationReason enablePushNotificationReason, String str2, Boolean r29, String str3, String str4, String str5, int i, InboxLoadFail inboxLoadFail, String str6, String str7, String str8, ChatMessageSender chatMessageSender, String str9, String str10, int i2, AgentChatType agentChatType, boolean z, String str11, boolean z2, ByteString byteString, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? CallStatus.CALL_STATUS_UNSPECIFIED : callStatus, (i3 & 4) != 0 ? PhoneUnavailableReason.PHONE_UNAVAILABLE_REASON_UNSPECIFIED : phoneUnavailableReason, (i3 & 8) != 0 ? EnablePushNotificationReason.ENABLE_PUSH_NOTIFICATION_REASON_UNSPECIFIED : enablePushNotificationReason, (i3 & 16) != 0 ? "" : str2, (i3 & 32) != 0 ? Boolean.BOOLEAN_UNSPECIFIED : r29, (i3 & 64) != 0 ? "" : str3, (i3 & 128) != 0 ? "" : str4, (i3 & 256) != 0 ? "" : str5, (i3 & 512) != 0 ? 0 : i, (i3 & 1024) != 0 ? InboxLoadFail.INBOX_LOAD_FAIL_UNSPECIFIED : inboxLoadFail, (i3 & 2048) != 0 ? "" : str6, (i3 & 4096) != 0 ? "" : str7, (i3 & 8192) != 0 ? "" : str8, (i3 & 16384) != 0 ? ChatMessageSender.AGENT : chatMessageSender, (i3 & 32768) != 0 ? "" : str9, (i3 & 65536) != 0 ? "" : str10, (i3 & 131072) != 0 ? 0 : i2, (i3 & 262144) != 0 ? AgentChatType.UNKNOWN : agentChatType, (i3 & 524288) != 0 ? false : z, (i3 & 1048576) == 0 ? str11 : "", (i3 & 2097152) != 0 ? false : z2, (i3 & 4194304) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24045newBuilder();
    }

    public final String getInquiry_id() {
        return this.inquiry_id;
    }

    public final CallStatus getCx_call_status() {
        return this.cx_call_status;
    }

    public final PhoneUnavailableReason getPhone_unavailable_reason() {
        return this.phone_unavailable_reason;
    }

    public final EnablePushNotificationReason getEnable_push_notifications_reason() {
        return this.enable_push_notifications_reason;
    }

    public final String getCall_schedule_option_id() {
        return this.call_schedule_option_id;
    }

    /* renamed from: is_text_form_focus, reason: from getter */
    public final Boolean getIs_text_form_focus() {
        return this.is_text_form_focus;
    }

    public final String getText_form_message_type() {
        return this.text_form_message_type;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final String getOpened_url() {
        return this.opened_url;
    }

    public final int getCase_count() {
        return this.case_count;
    }

    public final InboxLoadFail getInbox_load_fail() {
        return this.inbox_load_fail;
    }

    public final String getIssue_id() {
        return this.issue_id;
    }

    public final String getSub_action() {
        return this.sub_action;
    }

    public final String getChatbot_id() {
        return this.chatbot_id;
    }

    public final ChatMessageSender getChat_message_sender() {
        return this.chat_message_sender;
    }

    public final String getChat_message_id() {
        return this.chat_message_id;
    }

    public final String getChat_link_title() {
        return this.chat_link_title;
    }

    public final int getRecommended_action_count() {
        return this.recommended_action_count;
    }

    public final AgentChatType getAgent_chat_type() {
        return this.agent_chat_type;
    }

    /* renamed from: is_concierge, reason: from getter */
    public final boolean getIs_concierge() {
        return this.is_concierge;
    }

    public final String getAppointment_id() {
        return this.appointment_id;
    }

    /* renamed from: is_concierge_user, reason: from getter */
    public final boolean getIs_concierge_user() {
        return this.is_concierge_user;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CXIssue(String inquiry_id, CallStatus cx_call_status, PhoneUnavailableReason phone_unavailable_reason, EnablePushNotificationReason enable_push_notifications_reason, String call_schedule_option_id, Boolean is_text_form_focus, String text_form_message_type, String deeplink, String opened_url, int i, InboxLoadFail inbox_load_fail, String issue_id, String sub_action, String chatbot_id, ChatMessageSender chat_message_sender, String chat_message_id, String chat_link_title, int i2, AgentChatType agent_chat_type, boolean z, String appointment_id, boolean z2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(inquiry_id, "inquiry_id");
        Intrinsics.checkNotNullParameter(cx_call_status, "cx_call_status");
        Intrinsics.checkNotNullParameter(phone_unavailable_reason, "phone_unavailable_reason");
        Intrinsics.checkNotNullParameter(enable_push_notifications_reason, "enable_push_notifications_reason");
        Intrinsics.checkNotNullParameter(call_schedule_option_id, "call_schedule_option_id");
        Intrinsics.checkNotNullParameter(is_text_form_focus, "is_text_form_focus");
        Intrinsics.checkNotNullParameter(text_form_message_type, "text_form_message_type");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(opened_url, "opened_url");
        Intrinsics.checkNotNullParameter(inbox_load_fail, "inbox_load_fail");
        Intrinsics.checkNotNullParameter(issue_id, "issue_id");
        Intrinsics.checkNotNullParameter(sub_action, "sub_action");
        Intrinsics.checkNotNullParameter(chatbot_id, "chatbot_id");
        Intrinsics.checkNotNullParameter(chat_message_sender, "chat_message_sender");
        Intrinsics.checkNotNullParameter(chat_message_id, "chat_message_id");
        Intrinsics.checkNotNullParameter(chat_link_title, "chat_link_title");
        Intrinsics.checkNotNullParameter(agent_chat_type, "agent_chat_type");
        Intrinsics.checkNotNullParameter(appointment_id, "appointment_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.inquiry_id = inquiry_id;
        this.cx_call_status = cx_call_status;
        this.phone_unavailable_reason = phone_unavailable_reason;
        this.enable_push_notifications_reason = enable_push_notifications_reason;
        this.call_schedule_option_id = call_schedule_option_id;
        this.is_text_form_focus = is_text_form_focus;
        this.text_form_message_type = text_form_message_type;
        this.deeplink = deeplink;
        this.opened_url = opened_url;
        this.case_count = i;
        this.inbox_load_fail = inbox_load_fail;
        this.issue_id = issue_id;
        this.sub_action = sub_action;
        this.chatbot_id = chatbot_id;
        this.chat_message_sender = chat_message_sender;
        this.chat_message_id = chat_message_id;
        this.chat_link_title = chat_link_title;
        this.recommended_action_count = i2;
        this.agent_chat_type = agent_chat_type;
        this.is_concierge = z;
        this.appointment_id = appointment_id;
        this.is_concierge_user = z2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24045newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CXIssue)) {
            return false;
        }
        CXIssue cXIssue = (CXIssue) other;
        return Intrinsics.areEqual(unknownFields(), cXIssue.unknownFields()) && Intrinsics.areEqual(this.inquiry_id, cXIssue.inquiry_id) && this.cx_call_status == cXIssue.cx_call_status && this.phone_unavailable_reason == cXIssue.phone_unavailable_reason && this.enable_push_notifications_reason == cXIssue.enable_push_notifications_reason && Intrinsics.areEqual(this.call_schedule_option_id, cXIssue.call_schedule_option_id) && this.is_text_form_focus == cXIssue.is_text_form_focus && Intrinsics.areEqual(this.text_form_message_type, cXIssue.text_form_message_type) && Intrinsics.areEqual(this.deeplink, cXIssue.deeplink) && Intrinsics.areEqual(this.opened_url, cXIssue.opened_url) && this.case_count == cXIssue.case_count && this.inbox_load_fail == cXIssue.inbox_load_fail && Intrinsics.areEqual(this.issue_id, cXIssue.issue_id) && Intrinsics.areEqual(this.sub_action, cXIssue.sub_action) && Intrinsics.areEqual(this.chatbot_id, cXIssue.chatbot_id) && this.chat_message_sender == cXIssue.chat_message_sender && Intrinsics.areEqual(this.chat_message_id, cXIssue.chat_message_id) && Intrinsics.areEqual(this.chat_link_title, cXIssue.chat_link_title) && this.recommended_action_count == cXIssue.recommended_action_count && this.agent_chat_type == cXIssue.agent_chat_type && this.is_concierge == cXIssue.is_concierge && Intrinsics.areEqual(this.appointment_id, cXIssue.appointment_id) && this.is_concierge_user == cXIssue.is_concierge_user;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((((((((((((((((((((((((((((((((unknownFields().hashCode() * 37) + this.inquiry_id.hashCode()) * 37) + this.cx_call_status.hashCode()) * 37) + this.phone_unavailable_reason.hashCode()) * 37) + this.enable_push_notifications_reason.hashCode()) * 37) + this.call_schedule_option_id.hashCode()) * 37) + this.is_text_form_focus.hashCode()) * 37) + this.text_form_message_type.hashCode()) * 37) + this.deeplink.hashCode()) * 37) + this.opened_url.hashCode()) * 37) + Integer.hashCode(this.case_count)) * 37) + this.inbox_load_fail.hashCode()) * 37) + this.issue_id.hashCode()) * 37) + this.sub_action.hashCode()) * 37) + this.chatbot_id.hashCode()) * 37) + this.chat_message_sender.hashCode()) * 37) + this.chat_message_id.hashCode()) * 37) + this.chat_link_title.hashCode()) * 37) + Integer.hashCode(this.recommended_action_count)) * 37) + this.agent_chat_type.hashCode()) * 37) + java.lang.Boolean.hashCode(this.is_concierge)) * 37) + this.appointment_id.hashCode()) * 37) + java.lang.Boolean.hashCode(this.is_concierge_user);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("inquiry_id=" + Internal.sanitize(this.inquiry_id));
        arrayList.add("cx_call_status=" + this.cx_call_status);
        arrayList.add("phone_unavailable_reason=" + this.phone_unavailable_reason);
        arrayList.add("enable_push_notifications_reason=" + this.enable_push_notifications_reason);
        arrayList.add("call_schedule_option_id=" + Internal.sanitize(this.call_schedule_option_id));
        arrayList.add("is_text_form_focus=" + this.is_text_form_focus);
        arrayList.add("text_form_message_type=" + Internal.sanitize(this.text_form_message_type));
        arrayList.add("deeplink=" + Internal.sanitize(this.deeplink));
        arrayList.add("opened_url=" + Internal.sanitize(this.opened_url));
        arrayList.add("case_count=" + this.case_count);
        arrayList.add("inbox_load_fail=" + this.inbox_load_fail);
        arrayList.add("issue_id=" + Internal.sanitize(this.issue_id));
        arrayList.add("sub_action=" + Internal.sanitize(this.sub_action));
        arrayList.add("chatbot_id=" + Internal.sanitize(this.chatbot_id));
        arrayList.add("chat_message_sender=" + this.chat_message_sender);
        arrayList.add("chat_message_id=" + Internal.sanitize(this.chat_message_id));
        arrayList.add("chat_link_title=" + Internal.sanitize(this.chat_link_title));
        arrayList.add("recommended_action_count=" + this.recommended_action_count);
        arrayList.add("agent_chat_type=" + this.agent_chat_type);
        arrayList.add("is_concierge=" + this.is_concierge);
        arrayList.add("appointment_id=" + Internal.sanitize(this.appointment_id));
        arrayList.add("is_concierge_user=" + this.is_concierge_user);
        return CollectionsKt.joinToString$default(arrayList, ", ", "CXIssue{", "}", 0, null, null, 56, null);
    }

    public final CXIssue copy(String inquiry_id, CallStatus cx_call_status, PhoneUnavailableReason phone_unavailable_reason, EnablePushNotificationReason enable_push_notifications_reason, String call_schedule_option_id, Boolean is_text_form_focus, String text_form_message_type, String deeplink, String opened_url, int case_count, InboxLoadFail inbox_load_fail, String issue_id, String sub_action, String chatbot_id, ChatMessageSender chat_message_sender, String chat_message_id, String chat_link_title, int recommended_action_count, AgentChatType agent_chat_type, boolean is_concierge, String appointment_id, boolean is_concierge_user, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(inquiry_id, "inquiry_id");
        Intrinsics.checkNotNullParameter(cx_call_status, "cx_call_status");
        Intrinsics.checkNotNullParameter(phone_unavailable_reason, "phone_unavailable_reason");
        Intrinsics.checkNotNullParameter(enable_push_notifications_reason, "enable_push_notifications_reason");
        Intrinsics.checkNotNullParameter(call_schedule_option_id, "call_schedule_option_id");
        Intrinsics.checkNotNullParameter(is_text_form_focus, "is_text_form_focus");
        Intrinsics.checkNotNullParameter(text_form_message_type, "text_form_message_type");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(opened_url, "opened_url");
        Intrinsics.checkNotNullParameter(inbox_load_fail, "inbox_load_fail");
        Intrinsics.checkNotNullParameter(issue_id, "issue_id");
        Intrinsics.checkNotNullParameter(sub_action, "sub_action");
        Intrinsics.checkNotNullParameter(chatbot_id, "chatbot_id");
        Intrinsics.checkNotNullParameter(chat_message_sender, "chat_message_sender");
        Intrinsics.checkNotNullParameter(chat_message_id, "chat_message_id");
        Intrinsics.checkNotNullParameter(chat_link_title, "chat_link_title");
        Intrinsics.checkNotNullParameter(agent_chat_type, "agent_chat_type");
        Intrinsics.checkNotNullParameter(appointment_id, "appointment_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CXIssue(inquiry_id, cx_call_status, phone_unavailable_reason, enable_push_notifications_reason, call_schedule_option_id, is_text_form_focus, text_form_message_type, deeplink, opened_url, case_count, inbox_load_fail, issue_id, sub_action, chatbot_id, chat_message_sender, chat_message_id, chat_link_title, recommended_action_count, agent_chat_type, is_concierge, appointment_id, is_concierge_user, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CXIssue.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CXIssue>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.CXIssue$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CXIssue value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getInquiry_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getInquiry_id());
                }
                if (value.getCx_call_status() != CXIssue.CallStatus.CALL_STATUS_UNSPECIFIED) {
                    size += CXIssue.CallStatus.ADAPTER.encodedSizeWithTag(2, value.getCx_call_status());
                }
                if (value.getPhone_unavailable_reason() != CXIssue.PhoneUnavailableReason.PHONE_UNAVAILABLE_REASON_UNSPECIFIED) {
                    size += CXIssue.PhoneUnavailableReason.ADAPTER.encodedSizeWithTag(3, value.getPhone_unavailable_reason());
                }
                if (value.getEnable_push_notifications_reason() != CXIssue.EnablePushNotificationReason.ENABLE_PUSH_NOTIFICATION_REASON_UNSPECIFIED) {
                    size += CXIssue.EnablePushNotificationReason.ADAPTER.encodedSizeWithTag(4, value.getEnable_push_notifications_reason());
                }
                if (!Intrinsics.areEqual(value.getCall_schedule_option_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(35, value.getCall_schedule_option_id());
                }
                if (value.getIs_text_form_focus() != Boolean.BOOLEAN_UNSPECIFIED) {
                    size += Boolean.ADAPTER.encodedSizeWithTag(5, value.getIs_text_form_focus());
                }
                if (!Intrinsics.areEqual(value.getText_form_message_type(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getText_form_message_type());
                }
                if (!Intrinsics.areEqual(value.getDeeplink(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getDeeplink());
                }
                if (!Intrinsics.areEqual(value.getOpened_url(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getOpened_url());
                }
                if (value.getCase_count() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(9, Integer.valueOf(value.getCase_count()));
                }
                if (value.getInbox_load_fail() != CXIssue.InboxLoadFail.INBOX_LOAD_FAIL_UNSPECIFIED) {
                    size += CXIssue.InboxLoadFail.ADAPTER.encodedSizeWithTag(10, value.getInbox_load_fail());
                }
                if (!Intrinsics.areEqual(value.getIssue_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(11, value.getIssue_id());
                }
                if (!Intrinsics.areEqual(value.getSub_action(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(12, value.getSub_action());
                }
                if (!Intrinsics.areEqual(value.getChatbot_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(13, value.getChatbot_id());
                }
                if (value.getChat_message_sender() != CXIssue.ChatMessageSender.AGENT) {
                    size += CXIssue.ChatMessageSender.ADAPTER.encodedSizeWithTag(14, value.getChat_message_sender());
                }
                if (!Intrinsics.areEqual(value.getChat_message_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(15, value.getChat_message_id());
                }
                if (!Intrinsics.areEqual(value.getChat_link_title(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(16, value.getChat_link_title());
                }
                if (value.getRecommended_action_count() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(17, Integer.valueOf(value.getRecommended_action_count()));
                }
                if (value.getAgent_chat_type() != CXIssue.AgentChatType.UNKNOWN) {
                    size += CXIssue.AgentChatType.ADAPTER.encodedSizeWithTag(18, value.getAgent_chat_type());
                }
                if (value.getIs_concierge()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(19, java.lang.Boolean.valueOf(value.getIs_concierge()));
                }
                if (!Intrinsics.areEqual(value.getAppointment_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(20, value.getAppointment_id());
                }
                return value.getIs_concierge_user() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(21, java.lang.Boolean.valueOf(value.getIs_concierge_user())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CXIssue value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getInquiry_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getInquiry_id());
                }
                if (value.getCx_call_status() != CXIssue.CallStatus.CALL_STATUS_UNSPECIFIED) {
                    CXIssue.CallStatus.ADAPTER.encodeWithTag(writer, 2, (int) value.getCx_call_status());
                }
                if (value.getPhone_unavailable_reason() != CXIssue.PhoneUnavailableReason.PHONE_UNAVAILABLE_REASON_UNSPECIFIED) {
                    CXIssue.PhoneUnavailableReason.ADAPTER.encodeWithTag(writer, 3, (int) value.getPhone_unavailable_reason());
                }
                if (value.getEnable_push_notifications_reason() != CXIssue.EnablePushNotificationReason.ENABLE_PUSH_NOTIFICATION_REASON_UNSPECIFIED) {
                    CXIssue.EnablePushNotificationReason.ADAPTER.encodeWithTag(writer, 4, (int) value.getEnable_push_notifications_reason());
                }
                if (!Intrinsics.areEqual(value.getCall_schedule_option_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 35, (int) value.getCall_schedule_option_id());
                }
                if (value.getIs_text_form_focus() != Boolean.BOOLEAN_UNSPECIFIED) {
                    Boolean.ADAPTER.encodeWithTag(writer, 5, (int) value.getIs_text_form_focus());
                }
                if (!Intrinsics.areEqual(value.getText_form_message_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getText_form_message_type());
                }
                if (!Intrinsics.areEqual(value.getDeeplink(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getDeeplink());
                }
                if (!Intrinsics.areEqual(value.getOpened_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getOpened_url());
                }
                if (value.getCase_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 9, (int) Integer.valueOf(value.getCase_count()));
                }
                if (value.getInbox_load_fail() != CXIssue.InboxLoadFail.INBOX_LOAD_FAIL_UNSPECIFIED) {
                    CXIssue.InboxLoadFail.ADAPTER.encodeWithTag(writer, 10, (int) value.getInbox_load_fail());
                }
                if (!Intrinsics.areEqual(value.getIssue_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getIssue_id());
                }
                if (!Intrinsics.areEqual(value.getSub_action(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getSub_action());
                }
                if (!Intrinsics.areEqual(value.getChatbot_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getChatbot_id());
                }
                if (value.getChat_message_sender() != CXIssue.ChatMessageSender.AGENT) {
                    CXIssue.ChatMessageSender.ADAPTER.encodeWithTag(writer, 14, (int) value.getChat_message_sender());
                }
                if (!Intrinsics.areEqual(value.getChat_message_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 15, (int) value.getChat_message_id());
                }
                if (!Intrinsics.areEqual(value.getChat_link_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 16, (int) value.getChat_link_title());
                }
                if (value.getRecommended_action_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 17, (int) Integer.valueOf(value.getRecommended_action_count()));
                }
                if (value.getAgent_chat_type() != CXIssue.AgentChatType.UNKNOWN) {
                    CXIssue.AgentChatType.ADAPTER.encodeWithTag(writer, 18, (int) value.getAgent_chat_type());
                }
                if (value.getIs_concierge()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 19, (int) java.lang.Boolean.valueOf(value.getIs_concierge()));
                }
                if (!Intrinsics.areEqual(value.getAppointment_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 20, (int) value.getAppointment_id());
                }
                if (value.getIs_concierge_user()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 21, (int) java.lang.Boolean.valueOf(value.getIs_concierge_user()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CXIssue value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getIs_concierge_user()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 21, (int) java.lang.Boolean.valueOf(value.getIs_concierge_user()));
                }
                if (!Intrinsics.areEqual(value.getAppointment_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 20, (int) value.getAppointment_id());
                }
                if (value.getIs_concierge()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 19, (int) java.lang.Boolean.valueOf(value.getIs_concierge()));
                }
                if (value.getAgent_chat_type() != CXIssue.AgentChatType.UNKNOWN) {
                    CXIssue.AgentChatType.ADAPTER.encodeWithTag(writer, 18, (int) value.getAgent_chat_type());
                }
                if (value.getRecommended_action_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 17, (int) Integer.valueOf(value.getRecommended_action_count()));
                }
                if (!Intrinsics.areEqual(value.getChat_link_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 16, (int) value.getChat_link_title());
                }
                if (!Intrinsics.areEqual(value.getChat_message_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 15, (int) value.getChat_message_id());
                }
                if (value.getChat_message_sender() != CXIssue.ChatMessageSender.AGENT) {
                    CXIssue.ChatMessageSender.ADAPTER.encodeWithTag(writer, 14, (int) value.getChat_message_sender());
                }
                if (!Intrinsics.areEqual(value.getChatbot_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getChatbot_id());
                }
                if (!Intrinsics.areEqual(value.getSub_action(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getSub_action());
                }
                if (!Intrinsics.areEqual(value.getIssue_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getIssue_id());
                }
                if (value.getInbox_load_fail() != CXIssue.InboxLoadFail.INBOX_LOAD_FAIL_UNSPECIFIED) {
                    CXIssue.InboxLoadFail.ADAPTER.encodeWithTag(writer, 10, (int) value.getInbox_load_fail());
                }
                if (value.getCase_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 9, (int) Integer.valueOf(value.getCase_count()));
                }
                if (!Intrinsics.areEqual(value.getOpened_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getOpened_url());
                }
                if (!Intrinsics.areEqual(value.getDeeplink(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getDeeplink());
                }
                if (!Intrinsics.areEqual(value.getText_form_message_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getText_form_message_type());
                }
                if (value.getIs_text_form_focus() != Boolean.BOOLEAN_UNSPECIFIED) {
                    Boolean.ADAPTER.encodeWithTag(writer, 5, (int) value.getIs_text_form_focus());
                }
                if (!Intrinsics.areEqual(value.getCall_schedule_option_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 35, (int) value.getCall_schedule_option_id());
                }
                if (value.getEnable_push_notifications_reason() != CXIssue.EnablePushNotificationReason.ENABLE_PUSH_NOTIFICATION_REASON_UNSPECIFIED) {
                    CXIssue.EnablePushNotificationReason.ADAPTER.encodeWithTag(writer, 4, (int) value.getEnable_push_notifications_reason());
                }
                if (value.getPhone_unavailable_reason() != CXIssue.PhoneUnavailableReason.PHONE_UNAVAILABLE_REASON_UNSPECIFIED) {
                    CXIssue.PhoneUnavailableReason.ADAPTER.encodeWithTag(writer, 3, (int) value.getPhone_unavailable_reason());
                }
                if (value.getCx_call_status() != CXIssue.CallStatus.CALL_STATUS_UNSPECIFIED) {
                    CXIssue.CallStatus.ADAPTER.encodeWithTag(writer, 2, (int) value.getCx_call_status());
                }
                if (Intrinsics.areEqual(value.getInquiry_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getInquiry_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CXIssue decode(ProtoReader reader) throws IOException {
                CXIssue.PhoneUnavailableReason phoneUnavailableReason;
                CXIssue.EnablePushNotificationReason enablePushNotificationReason;
                Boolean r25;
                Intrinsics.checkNotNullParameter(reader, "reader");
                CXIssue.CallStatus callStatus = CXIssue.CallStatus.CALL_STATUS_UNSPECIFIED;
                CXIssue.PhoneUnavailableReason phoneUnavailableReason2 = CXIssue.PhoneUnavailableReason.PHONE_UNAVAILABLE_REASON_UNSPECIFIED;
                CXIssue.EnablePushNotificationReason enablePushNotificationReason2 = CXIssue.EnablePushNotificationReason.ENABLE_PUSH_NOTIFICATION_REASON_UNSPECIFIED;
                Boolean r4 = Boolean.BOOLEAN_UNSPECIFIED;
                CXIssue.InboxLoadFail inboxLoadFail = CXIssue.InboxLoadFail.INBOX_LOAD_FAIL_UNSPECIFIED;
                CXIssue.ChatMessageSender chatMessageSender = CXIssue.ChatMessageSender.AGENT;
                CXIssue.AgentChatType agentChatType = CXIssue.AgentChatType.UNKNOWN;
                long jBeginMessage = reader.beginMessage();
                CXIssue.CallStatus callStatusDecode = callStatus;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                String strDecode7 = strDecode6;
                String strDecode8 = strDecode7;
                String strDecode9 = strDecode8;
                String strDecode10 = strDecode9;
                int iIntValue = 0;
                int iIntValue2 = 0;
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                CXIssue.AgentChatType agentChatTypeDecode = agentChatType;
                String strDecode11 = strDecode10;
                CXIssue.ChatMessageSender chatMessageSenderDecode = chatMessageSender;
                CXIssue.InboxLoadFail inboxLoadFailDecode = inboxLoadFail;
                Boolean booleanDecode = r4;
                CXIssue.EnablePushNotificationReason enablePushNotificationReasonDecode = enablePushNotificationReason2;
                CXIssue.PhoneUnavailableReason phoneUnavailableReasonDecode = phoneUnavailableReason2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new CXIssue(strDecode11, callStatusDecode, phoneUnavailableReasonDecode, enablePushNotificationReasonDecode, strDecode, booleanDecode, strDecode2, strDecode3, strDecode4, iIntValue, inboxLoadFailDecode, strDecode5, strDecode6, strDecode7, chatMessageSenderDecode, strDecode8, strDecode9, iIntValue2, agentChatTypeDecode, zBooleanValue, strDecode10, zBooleanValue2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag != 35) {
                        switch (iNextTag) {
                            case 1:
                                strDecode11 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                phoneUnavailableReason = phoneUnavailableReasonDecode;
                                enablePushNotificationReason = enablePushNotificationReasonDecode;
                                r25 = booleanDecode;
                                try {
                                    callStatusDecode = CXIssue.CallStatus.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                                phoneUnavailableReasonDecode = phoneUnavailableReason;
                                enablePushNotificationReasonDecode = enablePushNotificationReason;
                                booleanDecode = r25;
                                break;
                            case 3:
                                phoneUnavailableReason = phoneUnavailableReasonDecode;
                                enablePushNotificationReason = enablePushNotificationReasonDecode;
                                r25 = booleanDecode;
                                try {
                                    phoneUnavailableReasonDecode = CXIssue.PhoneUnavailableReason.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                                enablePushNotificationReasonDecode = enablePushNotificationReason;
                                booleanDecode = r25;
                                break;
                            case 4:
                                phoneUnavailableReason = phoneUnavailableReasonDecode;
                                enablePushNotificationReason = enablePushNotificationReasonDecode;
                                r25 = booleanDecode;
                                try {
                                    enablePushNotificationReasonDecode = CXIssue.EnablePushNotificationReason.ADAPTER.decode(reader);
                                    phoneUnavailableReasonDecode = phoneUnavailableReason;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                    break;
                                }
                                booleanDecode = r25;
                                break;
                            case 5:
                                phoneUnavailableReason = phoneUnavailableReasonDecode;
                                enablePushNotificationReason = enablePushNotificationReasonDecode;
                                r25 = booleanDecode;
                                try {
                                    booleanDecode = Boolean.ADAPTER.decode(reader);
                                    phoneUnavailableReasonDecode = phoneUnavailableReason;
                                    enablePushNotificationReasonDecode = enablePushNotificationReason;
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                    break;
                                }
                            case 6:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 9:
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 10:
                                phoneUnavailableReason = phoneUnavailableReasonDecode;
                                enablePushNotificationReason = enablePushNotificationReasonDecode;
                                r25 = booleanDecode;
                                try {
                                    inboxLoadFailDecode = CXIssue.InboxLoadFail.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                                }
                                phoneUnavailableReasonDecode = phoneUnavailableReason;
                                enablePushNotificationReasonDecode = enablePushNotificationReason;
                                booleanDecode = r25;
                                break;
                            case 11:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 12:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 13:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 14:
                                phoneUnavailableReason = phoneUnavailableReasonDecode;
                                enablePushNotificationReason = enablePushNotificationReasonDecode;
                                r25 = booleanDecode;
                                try {
                                    chatMessageSenderDecode = CXIssue.ChatMessageSender.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e6.value));
                                }
                                phoneUnavailableReasonDecode = phoneUnavailableReason;
                                enablePushNotificationReasonDecode = enablePushNotificationReason;
                                booleanDecode = r25;
                                break;
                            case 15:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 16:
                                strDecode9 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 17:
                                iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 18:
                                try {
                                    agentChatTypeDecode = CXIssue.AgentChatType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e7) {
                                    phoneUnavailableReason = phoneUnavailableReasonDecode;
                                    enablePushNotificationReason = enablePushNotificationReasonDecode;
                                    r25 = booleanDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e7.value));
                                    break;
                                }
                            case 19:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 20:
                                strDecode10 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 21:
                                zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                phoneUnavailableReason = phoneUnavailableReasonDecode;
                                enablePushNotificationReason = enablePushNotificationReasonDecode;
                                r25 = booleanDecode;
                                phoneUnavailableReasonDecode = phoneUnavailableReason;
                                enablePushNotificationReasonDecode = enablePushNotificationReason;
                                booleanDecode = r25;
                                break;
                        }
                    } else {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CXIssue redact(CXIssue value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.copy((4194303 & 1) != 0 ? value.inquiry_id : null, (4194303 & 2) != 0 ? value.cx_call_status : null, (4194303 & 4) != 0 ? value.phone_unavailable_reason : null, (4194303 & 8) != 0 ? value.enable_push_notifications_reason : null, (4194303 & 16) != 0 ? value.call_schedule_option_id : null, (4194303 & 32) != 0 ? value.is_text_form_focus : null, (4194303 & 64) != 0 ? value.text_form_message_type : null, (4194303 & 128) != 0 ? value.deeplink : null, (4194303 & 256) != 0 ? value.opened_url : null, (4194303 & 512) != 0 ? value.case_count : 0, (4194303 & 1024) != 0 ? value.inbox_load_fail : null, (4194303 & 2048) != 0 ? value.issue_id : null, (4194303 & 4096) != 0 ? value.sub_action : null, (4194303 & 8192) != 0 ? value.chatbot_id : null, (4194303 & 16384) != 0 ? value.chat_message_sender : null, (4194303 & 32768) != 0 ? value.chat_message_id : null, (4194303 & 65536) != 0 ? value.chat_link_title : null, (4194303 & 131072) != 0 ? value.recommended_action_count : 0, (4194303 & 262144) != 0 ? value.agent_chat_type : null, (4194303 & 524288) != 0 ? value.is_concierge : false, (4194303 & 1048576) != 0 ? value.appointment_id : null, (4194303 & 2097152) != 0 ? value.is_concierge_user : false, (4194303 & 4194304) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CXIssue.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u00132\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CXIssue$CallStatus;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CALL_STATUS_UNSPECIFIED", "WAITING", "CONNECTING", "CONNECTED", "CANCELLED", "MISSED", "COMPLETED", "ASSIGNED", "SCHEDULED", "DEESCALATED", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CallStatus implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CallStatus[] $VALUES;

        @JvmField
        public static final ProtoAdapter<CallStatus> ADAPTER;
        public static final CallStatus ASSIGNED;
        public static final CallStatus CALL_STATUS_UNSPECIFIED;
        public static final CallStatus CANCELLED;
        public static final CallStatus COMPLETED;
        public static final CallStatus CONNECTED;
        public static final CallStatus CONNECTING;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final CallStatus DEESCALATED;
        public static final CallStatus MISSED;
        public static final CallStatus SCHEDULED;
        public static final CallStatus WAITING;
        private final int value;

        private static final /* synthetic */ CallStatus[] $values() {
            return new CallStatus[]{CALL_STATUS_UNSPECIFIED, WAITING, CONNECTING, CONNECTED, CANCELLED, MISSED, COMPLETED, ASSIGNED, SCHEDULED, DEESCALATED};
        }

        @JvmStatic
        public static final CallStatus fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<CallStatus> getEntries() {
            return $ENTRIES;
        }

        private CallStatus(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final CallStatus callStatus = new CallStatus("CALL_STATUS_UNSPECIFIED", 0, 0);
            CALL_STATUS_UNSPECIFIED = callStatus;
            WAITING = new CallStatus("WAITING", 1, 1);
            CONNECTING = new CallStatus("CONNECTING", 2, 2);
            CONNECTED = new CallStatus("CONNECTED", 3, 3);
            CANCELLED = new CallStatus("CANCELLED", 4, 4);
            MISSED = new CallStatus("MISSED", 5, 5);
            COMPLETED = new CallStatus("COMPLETED", 6, 6);
            ASSIGNED = new CallStatus("ASSIGNED", 7, 7);
            SCHEDULED = new CallStatus("SCHEDULED", 8, 33);
            DEESCALATED = new CallStatus("DEESCALATED", 9, 155);
            CallStatus[] callStatusArr$values = $values();
            $VALUES = callStatusArr$values;
            $ENTRIES = EnumEntries2.enumEntries(callStatusArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CallStatus.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<CallStatus>(orCreateKotlinClass, syntax, callStatus) { // from class: com.robinhood.rosetta.eventlogging.CXIssue$CallStatus$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public CXIssue.CallStatus fromValue(int value) {
                    return CXIssue.CallStatus.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: CXIssue.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CXIssue$CallStatus$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/CXIssue$CallStatus;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final CallStatus fromValue(int value) {
                if (value == 33) {
                    return CallStatus.SCHEDULED;
                }
                if (value != 155) {
                    switch (value) {
                        case 0:
                            return CallStatus.CALL_STATUS_UNSPECIFIED;
                        case 1:
                            return CallStatus.WAITING;
                        case 2:
                            return CallStatus.CONNECTING;
                        case 3:
                            return CallStatus.CONNECTED;
                        case 4:
                            return CallStatus.CANCELLED;
                        case 5:
                            return CallStatus.MISSED;
                        case 6:
                            return CallStatus.COMPLETED;
                        case 7:
                            return CallStatus.ASSIGNED;
                        default:
                            return null;
                    }
                }
                return CallStatus.DEESCALATED;
            }
        }

        public static CallStatus valueOf(String str) {
            return (CallStatus) Enum.valueOf(CallStatus.class, str);
        }

        public static CallStatus[] values() {
            return (CallStatus[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CXIssue.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CXIssue$PhoneUnavailableReason;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "PHONE_UNAVAILABLE_REASON_UNSPECIFIED", "OUT_OF_HOURS", "HIGH_TRAFFIC", "ALREADY_QUEUED", "EXTREME_TRAFFIC", "EXPERIMENT", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PhoneUnavailableReason implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PhoneUnavailableReason[] $VALUES;

        @JvmField
        public static final ProtoAdapter<PhoneUnavailableReason> ADAPTER;
        public static final PhoneUnavailableReason ALREADY_QUEUED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final PhoneUnavailableReason EXPERIMENT;
        public static final PhoneUnavailableReason EXTREME_TRAFFIC;
        public static final PhoneUnavailableReason HIGH_TRAFFIC;
        public static final PhoneUnavailableReason OUT_OF_HOURS;
        public static final PhoneUnavailableReason PHONE_UNAVAILABLE_REASON_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ PhoneUnavailableReason[] $values() {
            return new PhoneUnavailableReason[]{PHONE_UNAVAILABLE_REASON_UNSPECIFIED, OUT_OF_HOURS, HIGH_TRAFFIC, ALREADY_QUEUED, EXTREME_TRAFFIC, EXPERIMENT};
        }

        @JvmStatic
        public static final PhoneUnavailableReason fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<PhoneUnavailableReason> getEntries() {
            return $ENTRIES;
        }

        private PhoneUnavailableReason(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final PhoneUnavailableReason phoneUnavailableReason = new PhoneUnavailableReason("PHONE_UNAVAILABLE_REASON_UNSPECIFIED", 0, 0);
            PHONE_UNAVAILABLE_REASON_UNSPECIFIED = phoneUnavailableReason;
            OUT_OF_HOURS = new PhoneUnavailableReason("OUT_OF_HOURS", 1, 1);
            HIGH_TRAFFIC = new PhoneUnavailableReason("HIGH_TRAFFIC", 2, 2);
            ALREADY_QUEUED = new PhoneUnavailableReason("ALREADY_QUEUED", 3, 3);
            EXTREME_TRAFFIC = new PhoneUnavailableReason("EXTREME_TRAFFIC", 4, 4);
            EXPERIMENT = new PhoneUnavailableReason("EXPERIMENT", 5, 5);
            PhoneUnavailableReason[] phoneUnavailableReasonArr$values = $values();
            $VALUES = phoneUnavailableReasonArr$values;
            $ENTRIES = EnumEntries2.enumEntries(phoneUnavailableReasonArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PhoneUnavailableReason.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<PhoneUnavailableReason>(orCreateKotlinClass, syntax, phoneUnavailableReason) { // from class: com.robinhood.rosetta.eventlogging.CXIssue$PhoneUnavailableReason$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public CXIssue.PhoneUnavailableReason fromValue(int value) {
                    return CXIssue.PhoneUnavailableReason.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: CXIssue.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CXIssue$PhoneUnavailableReason$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/CXIssue$PhoneUnavailableReason;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final PhoneUnavailableReason fromValue(int value) {
                if (value == 0) {
                    return PhoneUnavailableReason.PHONE_UNAVAILABLE_REASON_UNSPECIFIED;
                }
                if (value == 1) {
                    return PhoneUnavailableReason.OUT_OF_HOURS;
                }
                if (value == 2) {
                    return PhoneUnavailableReason.HIGH_TRAFFIC;
                }
                if (value == 3) {
                    return PhoneUnavailableReason.ALREADY_QUEUED;
                }
                if (value == 4) {
                    return PhoneUnavailableReason.EXTREME_TRAFFIC;
                }
                if (value != 5) {
                    return null;
                }
                return PhoneUnavailableReason.EXPERIMENT;
            }
        }

        public static PhoneUnavailableReason valueOf(String str) {
            return (PhoneUnavailableReason) Enum.valueOf(PhoneUnavailableReason.class, str);
        }

        public static PhoneUnavailableReason[] values() {
            return (PhoneUnavailableReason[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CXIssue.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CXIssue$EnablePushNotificationReason;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ENABLE_PUSH_NOTIFICATION_REASON_UNSPECIFIED", "CX_CALL_REMINDER", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class EnablePushNotificationReason implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EnablePushNotificationReason[] $VALUES;

        @JvmField
        public static final ProtoAdapter<EnablePushNotificationReason> ADAPTER;
        public static final EnablePushNotificationReason CX_CALL_REMINDER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final EnablePushNotificationReason ENABLE_PUSH_NOTIFICATION_REASON_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ EnablePushNotificationReason[] $values() {
            return new EnablePushNotificationReason[]{ENABLE_PUSH_NOTIFICATION_REASON_UNSPECIFIED, CX_CALL_REMINDER};
        }

        @JvmStatic
        public static final EnablePushNotificationReason fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<EnablePushNotificationReason> getEntries() {
            return $ENTRIES;
        }

        private EnablePushNotificationReason(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final EnablePushNotificationReason enablePushNotificationReason = new EnablePushNotificationReason("ENABLE_PUSH_NOTIFICATION_REASON_UNSPECIFIED", 0, 0);
            ENABLE_PUSH_NOTIFICATION_REASON_UNSPECIFIED = enablePushNotificationReason;
            CX_CALL_REMINDER = new EnablePushNotificationReason("CX_CALL_REMINDER", 1, 1);
            EnablePushNotificationReason[] enablePushNotificationReasonArr$values = $values();
            $VALUES = enablePushNotificationReasonArr$values;
            $ENTRIES = EnumEntries2.enumEntries(enablePushNotificationReasonArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EnablePushNotificationReason.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<EnablePushNotificationReason>(orCreateKotlinClass, syntax, enablePushNotificationReason) { // from class: com.robinhood.rosetta.eventlogging.CXIssue$EnablePushNotificationReason$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public CXIssue.EnablePushNotificationReason fromValue(int value) {
                    return CXIssue.EnablePushNotificationReason.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: CXIssue.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CXIssue$EnablePushNotificationReason$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/CXIssue$EnablePushNotificationReason;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final EnablePushNotificationReason fromValue(int value) {
                if (value == 0) {
                    return EnablePushNotificationReason.ENABLE_PUSH_NOTIFICATION_REASON_UNSPECIFIED;
                }
                if (value != 1) {
                    return null;
                }
                return EnablePushNotificationReason.CX_CALL_REMINDER;
            }
        }

        public static EnablePushNotificationReason valueOf(String str) {
            return (EnablePushNotificationReason) Enum.valueOf(EnablePushNotificationReason.class, str);
        }

        public static EnablePushNotificationReason[] values() {
            return (EnablePushNotificationReason[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CXIssue.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CXIssue$InboxLoadFail;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "INBOX_LOAD_FAIL_UNSPECIFIED", "NOTIFICATIONS", "SUPPORT_CASE", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class InboxLoadFail implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ InboxLoadFail[] $VALUES;

        @JvmField
        public static final ProtoAdapter<InboxLoadFail> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final InboxLoadFail INBOX_LOAD_FAIL_UNSPECIFIED;
        public static final InboxLoadFail NOTIFICATIONS;
        public static final InboxLoadFail SUPPORT_CASE;
        private final int value;

        private static final /* synthetic */ InboxLoadFail[] $values() {
            return new InboxLoadFail[]{INBOX_LOAD_FAIL_UNSPECIFIED, NOTIFICATIONS, SUPPORT_CASE};
        }

        @JvmStatic
        public static final InboxLoadFail fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<InboxLoadFail> getEntries() {
            return $ENTRIES;
        }

        private InboxLoadFail(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final InboxLoadFail inboxLoadFail = new InboxLoadFail("INBOX_LOAD_FAIL_UNSPECIFIED", 0, 0);
            INBOX_LOAD_FAIL_UNSPECIFIED = inboxLoadFail;
            NOTIFICATIONS = new InboxLoadFail("NOTIFICATIONS", 1, 1);
            SUPPORT_CASE = new InboxLoadFail("SUPPORT_CASE", 2, 2);
            InboxLoadFail[] inboxLoadFailArr$values = $values();
            $VALUES = inboxLoadFailArr$values;
            $ENTRIES = EnumEntries2.enumEntries(inboxLoadFailArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InboxLoadFail.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<InboxLoadFail>(orCreateKotlinClass, syntax, inboxLoadFail) { // from class: com.robinhood.rosetta.eventlogging.CXIssue$InboxLoadFail$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public CXIssue.InboxLoadFail fromValue(int value) {
                    return CXIssue.InboxLoadFail.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: CXIssue.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CXIssue$InboxLoadFail$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/CXIssue$InboxLoadFail;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final InboxLoadFail fromValue(int value) {
                if (value == 0) {
                    return InboxLoadFail.INBOX_LOAD_FAIL_UNSPECIFIED;
                }
                if (value == 1) {
                    return InboxLoadFail.NOTIFICATIONS;
                }
                if (value != 2) {
                    return null;
                }
                return InboxLoadFail.SUPPORT_CASE;
            }
        }

        public static InboxLoadFail valueOf(String str) {
            return (InboxLoadFail) Enum.valueOf(InboxLoadFail.class, str);
        }

        public static InboxLoadFail[] values() {
            return (InboxLoadFail[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CXIssue.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CXIssue$ChatMessageSender;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "AGENT", "CHATBOT", "SYSTEM", "USER", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ChatMessageSender implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ChatMessageSender[] $VALUES;

        @JvmField
        public static final ProtoAdapter<ChatMessageSender> ADAPTER;
        public static final ChatMessageSender AGENT;
        public static final ChatMessageSender CHATBOT;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final ChatMessageSender SYSTEM;
        public static final ChatMessageSender USER;
        private final int value;

        private static final /* synthetic */ ChatMessageSender[] $values() {
            return new ChatMessageSender[]{AGENT, CHATBOT, SYSTEM, USER};
        }

        @JvmStatic
        public static final ChatMessageSender fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<ChatMessageSender> getEntries() {
            return $ENTRIES;
        }

        private ChatMessageSender(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final ChatMessageSender chatMessageSender = new ChatMessageSender("AGENT", 0, 0);
            AGENT = chatMessageSender;
            CHATBOT = new ChatMessageSender("CHATBOT", 1, 1);
            SYSTEM = new ChatMessageSender("SYSTEM", 2, 2);
            USER = new ChatMessageSender("USER", 3, 3);
            ChatMessageSender[] chatMessageSenderArr$values = $values();
            $VALUES = chatMessageSenderArr$values;
            $ENTRIES = EnumEntries2.enumEntries(chatMessageSenderArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ChatMessageSender.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<ChatMessageSender>(orCreateKotlinClass, syntax, chatMessageSender) { // from class: com.robinhood.rosetta.eventlogging.CXIssue$ChatMessageSender$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public CXIssue.ChatMessageSender fromValue(int value) {
                    return CXIssue.ChatMessageSender.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: CXIssue.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CXIssue$ChatMessageSender$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/CXIssue$ChatMessageSender;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final ChatMessageSender fromValue(int value) {
                if (value == 0) {
                    return ChatMessageSender.AGENT;
                }
                if (value == 1) {
                    return ChatMessageSender.CHATBOT;
                }
                if (value == 2) {
                    return ChatMessageSender.SYSTEM;
                }
                if (value != 3) {
                    return null;
                }
                return ChatMessageSender.USER;
            }
        }

        public static ChatMessageSender valueOf(String str) {
            return (ChatMessageSender) Enum.valueOf(ChatMessageSender.class, str);
        }

        public static ChatMessageSender[] values() {
            return (ChatMessageSender[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CXIssue.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CXIssue$AgentChatType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "UNKNOWN", "SALESFORCE", "TWILIO", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AgentChatType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AgentChatType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<AgentChatType> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final AgentChatType SALESFORCE;
        public static final AgentChatType TWILIO;
        public static final AgentChatType UNKNOWN;
        private final int value;

        private static final /* synthetic */ AgentChatType[] $values() {
            return new AgentChatType[]{UNKNOWN, SALESFORCE, TWILIO};
        }

        @JvmStatic
        public static final AgentChatType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<AgentChatType> getEntries() {
            return $ENTRIES;
        }

        private AgentChatType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final AgentChatType agentChatType = new AgentChatType("UNKNOWN", 0, 0);
            UNKNOWN = agentChatType;
            SALESFORCE = new AgentChatType("SALESFORCE", 1, 1);
            TWILIO = new AgentChatType("TWILIO", 2, 2);
            AgentChatType[] agentChatTypeArr$values = $values();
            $VALUES = agentChatTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(agentChatTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AgentChatType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<AgentChatType>(orCreateKotlinClass, syntax, agentChatType) { // from class: com.robinhood.rosetta.eventlogging.CXIssue$AgentChatType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public CXIssue.AgentChatType fromValue(int value) {
                    return CXIssue.AgentChatType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: CXIssue.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CXIssue$AgentChatType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/CXIssue$AgentChatType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final AgentChatType fromValue(int value) {
                if (value == 0) {
                    return AgentChatType.UNKNOWN;
                }
                if (value == 1) {
                    return AgentChatType.SALESFORCE;
                }
                if (value != 2) {
                    return null;
                }
                return AgentChatType.TWILIO;
            }
        }

        public static AgentChatType valueOf(String str) {
            return (AgentChatType) Enum.valueOf(AgentChatType.class, str);
        }

        public static AgentChatType[] values() {
            return (AgentChatType[]) $VALUES.clone();
        }
    }
}
