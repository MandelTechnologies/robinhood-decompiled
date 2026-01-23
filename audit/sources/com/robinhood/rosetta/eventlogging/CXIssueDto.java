package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.rosetta.eventlogging.BooleanDto;
import com.robinhood.rosetta.eventlogging.CXIssue;
import com.robinhood.rosetta.eventlogging.CXIssueDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: CXIssueDto.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b%\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 T2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\nSTUVWXYZ[\\B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007Bå\u0001\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\t\u0012\b\b\u0002\u0010\u0015\u001a\u00020\t\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\t\u0012\b\b\u0002\u0010\u001b\u001a\u00020\t\u0012\b\b\u0002\u0010\u001c\u001a\u00020\t\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u0012\b\b\u0002\u0010\u001f\u001a\u00020\t\u0012\b\b\u0002\u0010 \u001a\u00020\t\u0012\b\b\u0002\u0010!\u001a\u00020\u0017\u0012\b\b\u0002\u0010\"\u001a\u00020#\u0012\b\b\u0002\u0010$\u001a\u00020%\u0012\b\b\u0002\u0010&\u001a\u00020\t\u0012\b\b\u0002\u0010'\u001a\u00020%¢\u0006\u0004\b\u0006\u0010(Jâ\u0001\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020\t2\b\b\u0002\u0010!\u001a\u00020\u00172\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020\t2\b\b\u0002\u0010'\u001a\u00020%J\b\u0010G\u001a\u00020\u0002H\u0016J\b\u0010H\u001a\u00020\tH\u0016J\u0013\u0010I\u001a\u00020%2\b\u0010J\u001a\u0004\u0018\u00010KH\u0096\u0002J\b\u0010L\u001a\u00020\u0017H\u0016J\u0018\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020\u0017H\u0016J\b\u0010R\u001a\u00020\u0017H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u0010\u0010\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b1\u0010*R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0011\u00102R\u0011\u0010\u0013\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b3\u0010*R\u0011\u0010\u0014\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b4\u0010*R\u0011\u0010\u0015\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b5\u0010*R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b8\u00109R\u0011\u0010\u001a\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b:\u0010*R\u0011\u0010\u001b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b;\u0010*R\u0011\u0010\u001c\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b<\u0010*R\u0011\u0010\u001d\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0011\u0010\u001f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b?\u0010*R\u0011\u0010 \u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b@\u0010*R\u0011\u0010!\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\bA\u00107R\u0011\u0010\"\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0011\u0010$\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\b$\u0010DR\u0011\u0010&\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bE\u0010*R\u0011\u0010'\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\b'\u0010D¨\u0006]"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CXIssueDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/CXIssue;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CXIssueDto$Surrogate;)V", "inquiry_id", "", "cx_call_status", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$CallStatusDto;", "phone_unavailable_reason", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$PhoneUnavailableReasonDto;", "enable_push_notifications_reason", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$EnablePushNotificationReasonDto;", "call_schedule_option_id", "is_text_form_focus", "Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "text_form_message_type", "deeplink", "opened_url", "case_count", "", "inbox_load_fail", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$InboxLoadFailDto;", "issue_id", "sub_action", "chatbot_id", "chat_message_sender", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$ChatMessageSenderDto;", "chat_message_id", "chat_link_title", "recommended_action_count", "agent_chat_type", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$AgentChatTypeDto;", "is_concierge", "", "appointment_id", "is_concierge_user", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/CXIssueDto$CallStatusDto;Lcom/robinhood/rosetta/eventlogging/CXIssueDto$PhoneUnavailableReasonDto;Lcom/robinhood/rosetta/eventlogging/CXIssueDto$EnablePushNotificationReasonDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/robinhood/rosetta/eventlogging/CXIssueDto$InboxLoadFailDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/CXIssueDto$ChatMessageSenderDto;Ljava/lang/String;Ljava/lang/String;ILcom/robinhood/rosetta/eventlogging/CXIssueDto$AgentChatTypeDto;ZLjava/lang/String;Z)V", "getInquiry_id", "()Ljava/lang/String;", "getCx_call_status", "()Lcom/robinhood/rosetta/eventlogging/CXIssueDto$CallStatusDto;", "getPhone_unavailable_reason", "()Lcom/robinhood/rosetta/eventlogging/CXIssueDto$PhoneUnavailableReasonDto;", "getEnable_push_notifications_reason", "()Lcom/robinhood/rosetta/eventlogging/CXIssueDto$EnablePushNotificationReasonDto;", "getCall_schedule_option_id", "()Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "getText_form_message_type", "getDeeplink", "getOpened_url", "getCase_count", "()I", "getInbox_load_fail", "()Lcom/robinhood/rosetta/eventlogging/CXIssueDto$InboxLoadFailDto;", "getIssue_id", "getSub_action", "getChatbot_id", "getChat_message_sender", "()Lcom/robinhood/rosetta/eventlogging/CXIssueDto$ChatMessageSenderDto;", "getChat_message_id", "getChat_link_title", "getRecommended_action_count", "getAgent_chat_type", "()Lcom/robinhood/rosetta/eventlogging/CXIssueDto$AgentChatTypeDto;", "()Z", "getAppointment_id", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "CallStatusDto", "PhoneUnavailableReasonDto", "EnablePushNotificationReasonDto", "InboxLoadFailDto", "ChatMessageSenderDto", "AgentChatTypeDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class CXIssueDto implements Dto3<CXIssue>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CXIssueDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CXIssueDto, CXIssue>> binaryBase64Serializer$delegate;
    private static final CXIssueDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CXIssueDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CXIssueDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getInquiry_id() {
        return this.surrogate.getInquiry_id();
    }

    public final CallStatusDto getCx_call_status() {
        return this.surrogate.getCx_call_status();
    }

    public final PhoneUnavailableReasonDto getPhone_unavailable_reason() {
        return this.surrogate.getPhone_unavailable_reason();
    }

    public final EnablePushNotificationReasonDto getEnable_push_notifications_reason() {
        return this.surrogate.getEnable_push_notifications_reason();
    }

    public final String getCall_schedule_option_id() {
        return this.surrogate.getCall_schedule_option_id();
    }

    public final BooleanDto is_text_form_focus() {
        return this.surrogate.is_text_form_focus();
    }

    public final String getText_form_message_type() {
        return this.surrogate.getText_form_message_type();
    }

    public final String getDeeplink() {
        return this.surrogate.getDeeplink();
    }

    public final String getOpened_url() {
        return this.surrogate.getOpened_url();
    }

    public final int getCase_count() {
        return this.surrogate.getCase_count();
    }

    public final InboxLoadFailDto getInbox_load_fail() {
        return this.surrogate.getInbox_load_fail();
    }

    public final String getIssue_id() {
        return this.surrogate.getIssue_id();
    }

    public final String getSub_action() {
        return this.surrogate.getSub_action();
    }

    public final String getChatbot_id() {
        return this.surrogate.getChatbot_id();
    }

    public final ChatMessageSenderDto getChat_message_sender() {
        return this.surrogate.getChat_message_sender();
    }

    public final String getChat_message_id() {
        return this.surrogate.getChat_message_id();
    }

    public final String getChat_link_title() {
        return this.surrogate.getChat_link_title();
    }

    public final int getRecommended_action_count() {
        return this.surrogate.getRecommended_action_count();
    }

    public final AgentChatTypeDto getAgent_chat_type() {
        return this.surrogate.getAgent_chat_type();
    }

    public final boolean is_concierge() {
        return this.surrogate.is_concierge();
    }

    public final String getAppointment_id() {
        return this.surrogate.getAppointment_id();
    }

    public final boolean is_concierge_user() {
        return this.surrogate.is_concierge_user();
    }

    public /* synthetic */ CXIssueDto(String str, CallStatusDto callStatusDto, PhoneUnavailableReasonDto phoneUnavailableReasonDto, EnablePushNotificationReasonDto enablePushNotificationReasonDto, String str2, BooleanDto booleanDto, String str3, String str4, String str5, int i, InboxLoadFailDto inboxLoadFailDto, String str6, String str7, String str8, ChatMessageSenderDto chatMessageSenderDto, String str9, String str10, int i2, AgentChatTypeDto agentChatTypeDto, boolean z, String str11, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? CallStatusDto.INSTANCE.getZeroValue() : callStatusDto, (i3 & 4) != 0 ? PhoneUnavailableReasonDto.INSTANCE.getZeroValue() : phoneUnavailableReasonDto, (i3 & 8) != 0 ? EnablePushNotificationReasonDto.INSTANCE.getZeroValue() : enablePushNotificationReasonDto, (i3 & 16) != 0 ? "" : str2, (i3 & 32) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto, (i3 & 64) != 0 ? "" : str3, (i3 & 128) != 0 ? "" : str4, (i3 & 256) != 0 ? "" : str5, (i3 & 512) != 0 ? 0 : i, (i3 & 1024) != 0 ? InboxLoadFailDto.INSTANCE.getZeroValue() : inboxLoadFailDto, (i3 & 2048) != 0 ? "" : str6, (i3 & 4096) != 0 ? "" : str7, (i3 & 8192) != 0 ? "" : str8, (i3 & 16384) != 0 ? ChatMessageSenderDto.INSTANCE.getZeroValue() : chatMessageSenderDto, (i3 & 32768) != 0 ? "" : str9, (i3 & 65536) != 0 ? "" : str10, (i3 & 131072) != 0 ? 0 : i2, (i3 & 262144) != 0 ? AgentChatTypeDto.INSTANCE.getZeroValue() : agentChatTypeDto, (i3 & 524288) != 0 ? false : z, (i3 & 1048576) == 0 ? str11 : "", (i3 & 2097152) != 0 ? false : z2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CXIssueDto(String inquiry_id, CallStatusDto cx_call_status, PhoneUnavailableReasonDto phone_unavailable_reason, EnablePushNotificationReasonDto enable_push_notifications_reason, String call_schedule_option_id, BooleanDto is_text_form_focus, String text_form_message_type, String deeplink, String opened_url, int i, InboxLoadFailDto inbox_load_fail, String issue_id, String sub_action, String chatbot_id, ChatMessageSenderDto chat_message_sender, String chat_message_id, String chat_link_title, int i2, AgentChatTypeDto agent_chat_type, boolean z, String appointment_id, boolean z2) {
        this(new Surrogate(inquiry_id, cx_call_status, phone_unavailable_reason, enable_push_notifications_reason, call_schedule_option_id, is_text_form_focus, text_form_message_type, deeplink, opened_url, i, inbox_load_fail, issue_id, sub_action, chatbot_id, chat_message_sender, chat_message_id, chat_link_title, i2, agent_chat_type, z, appointment_id, z2));
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
    }

    public static /* synthetic */ CXIssueDto copy$default(CXIssueDto cXIssueDto, String str, CallStatusDto callStatusDto, PhoneUnavailableReasonDto phoneUnavailableReasonDto, EnablePushNotificationReasonDto enablePushNotificationReasonDto, String str2, BooleanDto booleanDto, String str3, String str4, String str5, int i, InboxLoadFailDto inboxLoadFailDto, String str6, String str7, String str8, ChatMessageSenderDto chatMessageSenderDto, String str9, String str10, int i2, AgentChatTypeDto agentChatTypeDto, boolean z, String str11, boolean z2, int i3, Object obj) {
        boolean zIs_concierge_user;
        String str12;
        String inquiry_id = (i3 & 1) != 0 ? cXIssueDto.surrogate.getInquiry_id() : str;
        CallStatusDto cx_call_status = (i3 & 2) != 0 ? cXIssueDto.surrogate.getCx_call_status() : callStatusDto;
        PhoneUnavailableReasonDto phone_unavailable_reason = (i3 & 4) != 0 ? cXIssueDto.surrogate.getPhone_unavailable_reason() : phoneUnavailableReasonDto;
        EnablePushNotificationReasonDto enable_push_notifications_reason = (i3 & 8) != 0 ? cXIssueDto.surrogate.getEnable_push_notifications_reason() : enablePushNotificationReasonDto;
        String call_schedule_option_id = (i3 & 16) != 0 ? cXIssueDto.surrogate.getCall_schedule_option_id() : str2;
        BooleanDto booleanDtoIs_text_form_focus = (i3 & 32) != 0 ? cXIssueDto.surrogate.is_text_form_focus() : booleanDto;
        String text_form_message_type = (i3 & 64) != 0 ? cXIssueDto.surrogate.getText_form_message_type() : str3;
        String deeplink = (i3 & 128) != 0 ? cXIssueDto.surrogate.getDeeplink() : str4;
        String opened_url = (i3 & 256) != 0 ? cXIssueDto.surrogate.getOpened_url() : str5;
        int case_count = (i3 & 512) != 0 ? cXIssueDto.surrogate.getCase_count() : i;
        InboxLoadFailDto inbox_load_fail = (i3 & 1024) != 0 ? cXIssueDto.surrogate.getInbox_load_fail() : inboxLoadFailDto;
        String issue_id = (i3 & 2048) != 0 ? cXIssueDto.surrogate.getIssue_id() : str6;
        String sub_action = (i3 & 4096) != 0 ? cXIssueDto.surrogate.getSub_action() : str7;
        String chatbot_id = (i3 & 8192) != 0 ? cXIssueDto.surrogate.getChatbot_id() : str8;
        String str13 = inquiry_id;
        ChatMessageSenderDto chat_message_sender = (i3 & 16384) != 0 ? cXIssueDto.surrogate.getChat_message_sender() : chatMessageSenderDto;
        String chat_message_id = (i3 & 32768) != 0 ? cXIssueDto.surrogate.getChat_message_id() : str9;
        String chat_link_title = (i3 & 65536) != 0 ? cXIssueDto.surrogate.getChat_link_title() : str10;
        int recommended_action_count = (i3 & 131072) != 0 ? cXIssueDto.surrogate.getRecommended_action_count() : i2;
        AgentChatTypeDto agent_chat_type = (i3 & 262144) != 0 ? cXIssueDto.surrogate.getAgent_chat_type() : agentChatTypeDto;
        boolean zIs_concierge = (i3 & 524288) != 0 ? cXIssueDto.surrogate.is_concierge() : z;
        String appointment_id = (i3 & 1048576) != 0 ? cXIssueDto.surrogate.getAppointment_id() : str11;
        if ((i3 & 2097152) != 0) {
            str12 = appointment_id;
            zIs_concierge_user = cXIssueDto.surrogate.is_concierge_user();
        } else {
            zIs_concierge_user = z2;
            str12 = appointment_id;
        }
        return cXIssueDto.copy(str13, cx_call_status, phone_unavailable_reason, enable_push_notifications_reason, call_schedule_option_id, booleanDtoIs_text_form_focus, text_form_message_type, deeplink, opened_url, case_count, inbox_load_fail, issue_id, sub_action, chatbot_id, chat_message_sender, chat_message_id, chat_link_title, recommended_action_count, agent_chat_type, zIs_concierge, str12, zIs_concierge_user);
    }

    public final CXIssueDto copy(String inquiry_id, CallStatusDto cx_call_status, PhoneUnavailableReasonDto phone_unavailable_reason, EnablePushNotificationReasonDto enable_push_notifications_reason, String call_schedule_option_id, BooleanDto is_text_form_focus, String text_form_message_type, String deeplink, String opened_url, int case_count, InboxLoadFailDto inbox_load_fail, String issue_id, String sub_action, String chatbot_id, ChatMessageSenderDto chat_message_sender, String chat_message_id, String chat_link_title, int recommended_action_count, AgentChatTypeDto agent_chat_type, boolean is_concierge, String appointment_id, boolean is_concierge_user) {
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
        return new CXIssueDto(new Surrogate(inquiry_id, cx_call_status, phone_unavailable_reason, enable_push_notifications_reason, call_schedule_option_id, is_text_form_focus, text_form_message_type, deeplink, opened_url, case_count, inbox_load_fail, issue_id, sub_action, chatbot_id, chat_message_sender, chat_message_id, chat_link_title, recommended_action_count, agent_chat_type, is_concierge, appointment_id, is_concierge_user));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public CXIssue toProto() {
        return new CXIssue(this.surrogate.getInquiry_id(), (CXIssue.CallStatus) this.surrogate.getCx_call_status().toProto(), (CXIssue.PhoneUnavailableReason) this.surrogate.getPhone_unavailable_reason().toProto(), (CXIssue.EnablePushNotificationReason) this.surrogate.getEnable_push_notifications_reason().toProto(), this.surrogate.getCall_schedule_option_id(), (Boolean) this.surrogate.is_text_form_focus().toProto(), this.surrogate.getText_form_message_type(), this.surrogate.getDeeplink(), this.surrogate.getOpened_url(), this.surrogate.getCase_count(), (CXIssue.InboxLoadFail) this.surrogate.getInbox_load_fail().toProto(), this.surrogate.getIssue_id(), this.surrogate.getSub_action(), this.surrogate.getChatbot_id(), (CXIssue.ChatMessageSender) this.surrogate.getChat_message_sender().toProto(), this.surrogate.getChat_message_id(), this.surrogate.getChat_link_title(), this.surrogate.getRecommended_action_count(), (CXIssue.AgentChatType) this.surrogate.getAgent_chat_type().toProto(), this.surrogate.is_concierge(), this.surrogate.getAppointment_id(), this.surrogate.is_concierge_user(), null, 4194304, null);
    }

    public String toString() {
        return "[CXIssueDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CXIssueDto) && Intrinsics.areEqual(((CXIssueDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CXIssueDto.kt */
    @Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\bQ\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 \u0083\u00012\u00020\u0001:\u0004\u0082\u0001\u0083\u0001B\u0081\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u0010\u001a\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u001e\u001a\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u0014\u0012\b\b\u0002\u0010\u001f\u001a\u00020 \u0012\b\b\u0002\u0010!\u001a\u00020\"\u0012\b\b\u0002\u0010#\u001a\u00020\u0003\u0012\b\b\u0002\u0010$\u001a\u00020\"¢\u0006\u0004\b%\u0010&Bï\u0001\b\u0010\u0012\u0006\u0010'\u001a\u00020\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0011\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\u0006\u0010!\u001a\u00020\"\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010$\u001a\u00020\"\u0012\b\u0010(\u001a\u0004\u0018\u00010)¢\u0006\u0004\b%\u0010*J\t\u0010_\u001a\u00020\u0003HÆ\u0003J\t\u0010`\u001a\u00020\u0005HÆ\u0003J\t\u0010a\u001a\u00020\u0007HÆ\u0003J\t\u0010b\u001a\u00020\tHÆ\u0003J\t\u0010c\u001a\u00020\u0003HÆ\u0003J\t\u0010d\u001a\u00020\fHÆ\u0003J\t\u0010e\u001a\u00020\u0003HÆ\u0003J\t\u0010f\u001a\u00020\u0003HÆ\u0003J\t\u0010g\u001a\u00020\u0003HÆ\u0003J\u0018\u0010h\u001a\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u0014HÆ\u0003J\t\u0010i\u001a\u00020\u0016HÆ\u0003J\t\u0010j\u001a\u00020\u0003HÆ\u0003J\t\u0010k\u001a\u00020\u0003HÆ\u0003J\t\u0010l\u001a\u00020\u0003HÆ\u0003J\t\u0010m\u001a\u00020\u001bHÆ\u0003J\t\u0010n\u001a\u00020\u0003HÆ\u0003J\t\u0010o\u001a\u00020\u0003HÆ\u0003J\u0018\u0010p\u001a\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u0014HÆ\u0003J\t\u0010q\u001a\u00020 HÆ\u0003J\t\u0010r\u001a\u00020\"HÆ\u0003J\t\u0010s\u001a\u00020\u0003HÆ\u0003J\t\u0010t\u001a\u00020\"HÆ\u0003J\u0083\u0002\u0010u\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\u0017\b\u0002\u0010\u0010\u001a\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\u0017\b\u0002\u0010\u001e\u001a\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u00142\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\"HÆ\u0001J\u0013\u0010v\u001a\u00020\"2\b\u0010w\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010x\u001a\u00020\u0011HÖ\u0001J\t\u0010y\u001a\u00020\u0003HÖ\u0001J'\u0010z\u001a\u00020{2\u0006\u0010|\u001a\u00020\u00002\u0006\u0010}\u001a\u00020~2\u0007\u0010\u007f\u001a\u00030\u0080\u0001H\u0001¢\u0006\u0003\b\u0081\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u0010,\u001a\u0004\b0\u00101R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010,\u001a\u0004\b3\u00104R\u001c\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b5\u0010,\u001a\u0004\b6\u00107R\u001c\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b8\u0010,\u001a\u0004\b9\u0010.R\u001c\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b:\u0010,\u001a\u0004\b\u000b\u0010;R\u001c\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b<\u0010,\u001a\u0004\b=\u0010.R\u001c\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b>\u0010,\u001a\u0004\b?\u0010.R\u001c\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b@\u0010,\u001a\u0004\bA\u0010.R+\u0010\u0010\u001a\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u00148\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bB\u0010,\u001a\u0004\bC\u0010DR\u001c\u0010\u0015\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bE\u0010,\u001a\u0004\bF\u0010GR\u001c\u0010\u0017\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bH\u0010,\u001a\u0004\bI\u0010.R\u001c\u0010\u0018\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bJ\u0010,\u001a\u0004\bK\u0010.R\u001c\u0010\u0019\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bL\u0010,\u001a\u0004\bM\u0010.R\u001c\u0010\u001a\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bN\u0010,\u001a\u0004\bO\u0010PR\u001c\u0010\u001c\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bQ\u0010,\u001a\u0004\bR\u0010.R\u001c\u0010\u001d\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bS\u0010,\u001a\u0004\bT\u0010.R+\u0010\u001e\u001a\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u00148\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bU\u0010,\u001a\u0004\bV\u0010DR\u001c\u0010\u001f\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bW\u0010,\u001a\u0004\bX\u0010YR\u001c\u0010!\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bZ\u0010,\u001a\u0004\b!\u0010[R\u001c\u0010#\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\\\u0010,\u001a\u0004\b]\u0010.R\u001c\u0010$\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b^\u0010,\u001a\u0004\b$\u0010[¨\u0006\u0084\u0001"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CXIssueDto$Surrogate;", "", "inquiry_id", "", "cx_call_status", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$CallStatusDto;", "phone_unavailable_reason", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$PhoneUnavailableReasonDto;", "enable_push_notifications_reason", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$EnablePushNotificationReasonDto;", "call_schedule_option_id", "is_text_form_focus", "Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "text_form_message_type", "deeplink", "opened_url", "case_count", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "inbox_load_fail", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$InboxLoadFailDto;", "issue_id", "sub_action", "chatbot_id", "chat_message_sender", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$ChatMessageSenderDto;", "chat_message_id", "chat_link_title", "recommended_action_count", "agent_chat_type", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$AgentChatTypeDto;", "is_concierge", "", "appointment_id", "is_concierge_user", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/CXIssueDto$CallStatusDto;Lcom/robinhood/rosetta/eventlogging/CXIssueDto$PhoneUnavailableReasonDto;Lcom/robinhood/rosetta/eventlogging/CXIssueDto$EnablePushNotificationReasonDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/robinhood/rosetta/eventlogging/CXIssueDto$InboxLoadFailDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/CXIssueDto$ChatMessageSenderDto;Ljava/lang/String;Ljava/lang/String;ILcom/robinhood/rosetta/eventlogging/CXIssueDto$AgentChatTypeDto;ZLjava/lang/String;Z)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/rosetta/eventlogging/CXIssueDto$CallStatusDto;Lcom/robinhood/rosetta/eventlogging/CXIssueDto$PhoneUnavailableReasonDto;Lcom/robinhood/rosetta/eventlogging/CXIssueDto$EnablePushNotificationReasonDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/robinhood/rosetta/eventlogging/CXIssueDto$InboxLoadFailDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/CXIssueDto$ChatMessageSenderDto;Ljava/lang/String;Ljava/lang/String;ILcom/robinhood/rosetta/eventlogging/CXIssueDto$AgentChatTypeDto;ZLjava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getInquiry_id$annotations", "()V", "getInquiry_id", "()Ljava/lang/String;", "getCx_call_status$annotations", "getCx_call_status", "()Lcom/robinhood/rosetta/eventlogging/CXIssueDto$CallStatusDto;", "getPhone_unavailable_reason$annotations", "getPhone_unavailable_reason", "()Lcom/robinhood/rosetta/eventlogging/CXIssueDto$PhoneUnavailableReasonDto;", "getEnable_push_notifications_reason$annotations", "getEnable_push_notifications_reason", "()Lcom/robinhood/rosetta/eventlogging/CXIssueDto$EnablePushNotificationReasonDto;", "getCall_schedule_option_id$annotations", "getCall_schedule_option_id", "is_text_form_focus$annotations", "()Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "getText_form_message_type$annotations", "getText_form_message_type", "getDeeplink$annotations", "getDeeplink", "getOpened_url$annotations", "getOpened_url", "getCase_count$annotations", "getCase_count", "()I", "getInbox_load_fail$annotations", "getInbox_load_fail", "()Lcom/robinhood/rosetta/eventlogging/CXIssueDto$InboxLoadFailDto;", "getIssue_id$annotations", "getIssue_id", "getSub_action$annotations", "getSub_action", "getChatbot_id$annotations", "getChatbot_id", "getChat_message_sender$annotations", "getChat_message_sender", "()Lcom/robinhood/rosetta/eventlogging/CXIssueDto$ChatMessageSenderDto;", "getChat_message_id$annotations", "getChat_message_id", "getChat_link_title$annotations", "getChat_link_title", "getRecommended_action_count$annotations", "getRecommended_action_count", "getAgent_chat_type$annotations", "getAgent_chat_type", "()Lcom/robinhood/rosetta/eventlogging/CXIssueDto$AgentChatTypeDto;", "is_concierge$annotations", "()Z", "getAppointment_id$annotations", "getAppointment_id", "is_concierge_user$annotations", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final AgentChatTypeDto agent_chat_type;
        private final String appointment_id;
        private final String call_schedule_option_id;
        private final int case_count;
        private final String chat_link_title;
        private final String chat_message_id;
        private final ChatMessageSenderDto chat_message_sender;
        private final String chatbot_id;
        private final CallStatusDto cx_call_status;
        private final String deeplink;
        private final EnablePushNotificationReasonDto enable_push_notifications_reason;
        private final InboxLoadFailDto inbox_load_fail;
        private final String inquiry_id;
        private final boolean is_concierge;
        private final boolean is_concierge_user;
        private final BooleanDto is_text_form_focus;
        private final String issue_id;
        private final String opened_url;
        private final PhoneUnavailableReasonDto phone_unavailable_reason;
        private final int recommended_action_count;
        private final String sub_action;
        private final String text_form_message_type;

        public Surrogate() {
            this((String) null, (CallStatusDto) null, (PhoneUnavailableReasonDto) null, (EnablePushNotificationReasonDto) null, (String) null, (BooleanDto) null, (String) null, (String) null, (String) null, 0, (InboxLoadFailDto) null, (String) null, (String) null, (String) null, (ChatMessageSenderDto) null, (String) null, (String) null, 0, (AgentChatTypeDto) null, false, (String) null, false, 4194303, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, CallStatusDto callStatusDto, PhoneUnavailableReasonDto phoneUnavailableReasonDto, EnablePushNotificationReasonDto enablePushNotificationReasonDto, String str2, BooleanDto booleanDto, String str3, String str4, String str5, int i, InboxLoadFailDto inboxLoadFailDto, String str6, String str7, String str8, ChatMessageSenderDto chatMessageSenderDto, String str9, String str10, int i2, AgentChatTypeDto agentChatTypeDto, boolean z, String str11, boolean z2, int i3, Object obj) {
            boolean z3;
            String str12;
            String str13 = (i3 & 1) != 0 ? surrogate.inquiry_id : str;
            CallStatusDto callStatusDto2 = (i3 & 2) != 0 ? surrogate.cx_call_status : callStatusDto;
            PhoneUnavailableReasonDto phoneUnavailableReasonDto2 = (i3 & 4) != 0 ? surrogate.phone_unavailable_reason : phoneUnavailableReasonDto;
            EnablePushNotificationReasonDto enablePushNotificationReasonDto2 = (i3 & 8) != 0 ? surrogate.enable_push_notifications_reason : enablePushNotificationReasonDto;
            String str14 = (i3 & 16) != 0 ? surrogate.call_schedule_option_id : str2;
            BooleanDto booleanDto2 = (i3 & 32) != 0 ? surrogate.is_text_form_focus : booleanDto;
            String str15 = (i3 & 64) != 0 ? surrogate.text_form_message_type : str3;
            String str16 = (i3 & 128) != 0 ? surrogate.deeplink : str4;
            String str17 = (i3 & 256) != 0 ? surrogate.opened_url : str5;
            int i4 = (i3 & 512) != 0 ? surrogate.case_count : i;
            InboxLoadFailDto inboxLoadFailDto2 = (i3 & 1024) != 0 ? surrogate.inbox_load_fail : inboxLoadFailDto;
            String str18 = (i3 & 2048) != 0 ? surrogate.issue_id : str6;
            String str19 = (i3 & 4096) != 0 ? surrogate.sub_action : str7;
            String str20 = (i3 & 8192) != 0 ? surrogate.chatbot_id : str8;
            String str21 = str13;
            ChatMessageSenderDto chatMessageSenderDto2 = (i3 & 16384) != 0 ? surrogate.chat_message_sender : chatMessageSenderDto;
            String str22 = (i3 & 32768) != 0 ? surrogate.chat_message_id : str9;
            String str23 = (i3 & 65536) != 0 ? surrogate.chat_link_title : str10;
            int i5 = (i3 & 131072) != 0 ? surrogate.recommended_action_count : i2;
            AgentChatTypeDto agentChatTypeDto2 = (i3 & 262144) != 0 ? surrogate.agent_chat_type : agentChatTypeDto;
            boolean z4 = (i3 & 524288) != 0 ? surrogate.is_concierge : z;
            String str24 = (i3 & 1048576) != 0 ? surrogate.appointment_id : str11;
            if ((i3 & 2097152) != 0) {
                str12 = str24;
                z3 = surrogate.is_concierge_user;
            } else {
                z3 = z2;
                str12 = str24;
            }
            return surrogate.copy(str21, callStatusDto2, phoneUnavailableReasonDto2, enablePushNotificationReasonDto2, str14, booleanDto2, str15, str16, str17, i4, inboxLoadFailDto2, str18, str19, str20, chatMessageSenderDto2, str22, str23, i5, agentChatTypeDto2, z4, str12, z3);
        }

        @SerialName("agentChatType")
        @JsonAnnotations2(names = {"agent_chat_type"})
        public static /* synthetic */ void getAgent_chat_type$annotations() {
        }

        @SerialName("appointmentId")
        @JsonAnnotations2(names = {"appointment_id"})
        public static /* synthetic */ void getAppointment_id$annotations() {
        }

        @SerialName("callScheduleOptionId")
        @JsonAnnotations2(names = {"call_schedule_option_id"})
        public static /* synthetic */ void getCall_schedule_option_id$annotations() {
        }

        @SerialName("caseCount")
        @JsonAnnotations2(names = {"case_count"})
        public static /* synthetic */ void getCase_count$annotations() {
        }

        @SerialName("chatLinkTitle")
        @JsonAnnotations2(names = {"chat_link_title"})
        public static /* synthetic */ void getChat_link_title$annotations() {
        }

        @SerialName("chatMessageId")
        @JsonAnnotations2(names = {"chat_message_id"})
        public static /* synthetic */ void getChat_message_id$annotations() {
        }

        @SerialName("chatMessageSender")
        @JsonAnnotations2(names = {"chat_message_sender"})
        public static /* synthetic */ void getChat_message_sender$annotations() {
        }

        @SerialName("chatbotId")
        @JsonAnnotations2(names = {"chatbot_id"})
        public static /* synthetic */ void getChatbot_id$annotations() {
        }

        @SerialName("cxCallStatus")
        @JsonAnnotations2(names = {"cx_call_status"})
        public static /* synthetic */ void getCx_call_status$annotations() {
        }

        @SerialName("deeplink")
        @JsonAnnotations2(names = {"deeplink"})
        public static /* synthetic */ void getDeeplink$annotations() {
        }

        @SerialName("enablePushNotificationsReason")
        @JsonAnnotations2(names = {"enable_push_notifications_reason"})
        public static /* synthetic */ void getEnable_push_notifications_reason$annotations() {
        }

        @SerialName("inboxLoadFail")
        @JsonAnnotations2(names = {"inbox_load_fail"})
        public static /* synthetic */ void getInbox_load_fail$annotations() {
        }

        @SerialName("inquiryId")
        @JsonAnnotations2(names = {"inquiry_id"})
        public static /* synthetic */ void getInquiry_id$annotations() {
        }

        @SerialName("issueId")
        @JsonAnnotations2(names = {"issue_id"})
        public static /* synthetic */ void getIssue_id$annotations() {
        }

        @SerialName("openedUrl")
        @JsonAnnotations2(names = {"opened_url"})
        public static /* synthetic */ void getOpened_url$annotations() {
        }

        @SerialName("phoneUnavailableReason")
        @JsonAnnotations2(names = {"phone_unavailable_reason"})
        public static /* synthetic */ void getPhone_unavailable_reason$annotations() {
        }

        @SerialName("recommendedActionCount")
        @JsonAnnotations2(names = {"recommended_action_count"})
        public static /* synthetic */ void getRecommended_action_count$annotations() {
        }

        @SerialName("subAction")
        @JsonAnnotations2(names = {"sub_action"})
        public static /* synthetic */ void getSub_action$annotations() {
        }

        @SerialName("textFormMessageType")
        @JsonAnnotations2(names = {"text_form_message_type"})
        public static /* synthetic */ void getText_form_message_type$annotations() {
        }

        @SerialName("isConcierge")
        @JsonAnnotations2(names = {"is_concierge"})
        public static /* synthetic */ void is_concierge$annotations() {
        }

        @SerialName("isConciergeUser")
        @JsonAnnotations2(names = {"is_concierge_user"})
        public static /* synthetic */ void is_concierge_user$annotations() {
        }

        @SerialName("isTextFormFocus")
        @JsonAnnotations2(names = {"is_text_form_focus"})
        public static /* synthetic */ void is_text_form_focus$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getInquiry_id() {
            return this.inquiry_id;
        }

        /* renamed from: component10, reason: from getter */
        public final int getCase_count() {
            return this.case_count;
        }

        /* renamed from: component11, reason: from getter */
        public final InboxLoadFailDto getInbox_load_fail() {
            return this.inbox_load_fail;
        }

        /* renamed from: component12, reason: from getter */
        public final String getIssue_id() {
            return this.issue_id;
        }

        /* renamed from: component13, reason: from getter */
        public final String getSub_action() {
            return this.sub_action;
        }

        /* renamed from: component14, reason: from getter */
        public final String getChatbot_id() {
            return this.chatbot_id;
        }

        /* renamed from: component15, reason: from getter */
        public final ChatMessageSenderDto getChat_message_sender() {
            return this.chat_message_sender;
        }

        /* renamed from: component16, reason: from getter */
        public final String getChat_message_id() {
            return this.chat_message_id;
        }

        /* renamed from: component17, reason: from getter */
        public final String getChat_link_title() {
            return this.chat_link_title;
        }

        /* renamed from: component18, reason: from getter */
        public final int getRecommended_action_count() {
            return this.recommended_action_count;
        }

        /* renamed from: component19, reason: from getter */
        public final AgentChatTypeDto getAgent_chat_type() {
            return this.agent_chat_type;
        }

        /* renamed from: component2, reason: from getter */
        public final CallStatusDto getCx_call_status() {
            return this.cx_call_status;
        }

        /* renamed from: component20, reason: from getter */
        public final boolean getIs_concierge() {
            return this.is_concierge;
        }

        /* renamed from: component21, reason: from getter */
        public final String getAppointment_id() {
            return this.appointment_id;
        }

        /* renamed from: component22, reason: from getter */
        public final boolean getIs_concierge_user() {
            return this.is_concierge_user;
        }

        /* renamed from: component3, reason: from getter */
        public final PhoneUnavailableReasonDto getPhone_unavailable_reason() {
            return this.phone_unavailable_reason;
        }

        /* renamed from: component4, reason: from getter */
        public final EnablePushNotificationReasonDto getEnable_push_notifications_reason() {
            return this.enable_push_notifications_reason;
        }

        /* renamed from: component5, reason: from getter */
        public final String getCall_schedule_option_id() {
            return this.call_schedule_option_id;
        }

        /* renamed from: component6, reason: from getter */
        public final BooleanDto getIs_text_form_focus() {
            return this.is_text_form_focus;
        }

        /* renamed from: component7, reason: from getter */
        public final String getText_form_message_type() {
            return this.text_form_message_type;
        }

        /* renamed from: component8, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        /* renamed from: component9, reason: from getter */
        public final String getOpened_url() {
            return this.opened_url;
        }

        public final Surrogate copy(String inquiry_id, CallStatusDto cx_call_status, PhoneUnavailableReasonDto phone_unavailable_reason, EnablePushNotificationReasonDto enable_push_notifications_reason, String call_schedule_option_id, BooleanDto is_text_form_focus, String text_form_message_type, String deeplink, String opened_url, int case_count, InboxLoadFailDto inbox_load_fail, String issue_id, String sub_action, String chatbot_id, ChatMessageSenderDto chat_message_sender, String chat_message_id, String chat_link_title, int recommended_action_count, AgentChatTypeDto agent_chat_type, boolean is_concierge, String appointment_id, boolean is_concierge_user) {
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
            return new Surrogate(inquiry_id, cx_call_status, phone_unavailable_reason, enable_push_notifications_reason, call_schedule_option_id, is_text_form_focus, text_form_message_type, deeplink, opened_url, case_count, inbox_load_fail, issue_id, sub_action, chatbot_id, chat_message_sender, chat_message_id, chat_link_title, recommended_action_count, agent_chat_type, is_concierge, appointment_id, is_concierge_user);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.inquiry_id, surrogate.inquiry_id) && this.cx_call_status == surrogate.cx_call_status && this.phone_unavailable_reason == surrogate.phone_unavailable_reason && this.enable_push_notifications_reason == surrogate.enable_push_notifications_reason && Intrinsics.areEqual(this.call_schedule_option_id, surrogate.call_schedule_option_id) && this.is_text_form_focus == surrogate.is_text_form_focus && Intrinsics.areEqual(this.text_form_message_type, surrogate.text_form_message_type) && Intrinsics.areEqual(this.deeplink, surrogate.deeplink) && Intrinsics.areEqual(this.opened_url, surrogate.opened_url) && this.case_count == surrogate.case_count && this.inbox_load_fail == surrogate.inbox_load_fail && Intrinsics.areEqual(this.issue_id, surrogate.issue_id) && Intrinsics.areEqual(this.sub_action, surrogate.sub_action) && Intrinsics.areEqual(this.chatbot_id, surrogate.chatbot_id) && this.chat_message_sender == surrogate.chat_message_sender && Intrinsics.areEqual(this.chat_message_id, surrogate.chat_message_id) && Intrinsics.areEqual(this.chat_link_title, surrogate.chat_link_title) && this.recommended_action_count == surrogate.recommended_action_count && this.agent_chat_type == surrogate.agent_chat_type && this.is_concierge == surrogate.is_concierge && Intrinsics.areEqual(this.appointment_id, surrogate.appointment_id) && this.is_concierge_user == surrogate.is_concierge_user;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((((((((((((this.inquiry_id.hashCode() * 31) + this.cx_call_status.hashCode()) * 31) + this.phone_unavailable_reason.hashCode()) * 31) + this.enable_push_notifications_reason.hashCode()) * 31) + this.call_schedule_option_id.hashCode()) * 31) + this.is_text_form_focus.hashCode()) * 31) + this.text_form_message_type.hashCode()) * 31) + this.deeplink.hashCode()) * 31) + this.opened_url.hashCode()) * 31) + Integer.hashCode(this.case_count)) * 31) + this.inbox_load_fail.hashCode()) * 31) + this.issue_id.hashCode()) * 31) + this.sub_action.hashCode()) * 31) + this.chatbot_id.hashCode()) * 31) + this.chat_message_sender.hashCode()) * 31) + this.chat_message_id.hashCode()) * 31) + this.chat_link_title.hashCode()) * 31) + Integer.hashCode(this.recommended_action_count)) * 31) + this.agent_chat_type.hashCode()) * 31) + java.lang.Boolean.hashCode(this.is_concierge)) * 31) + this.appointment_id.hashCode()) * 31) + java.lang.Boolean.hashCode(this.is_concierge_user);
        }

        public String toString() {
            return "Surrogate(inquiry_id=" + this.inquiry_id + ", cx_call_status=" + this.cx_call_status + ", phone_unavailable_reason=" + this.phone_unavailable_reason + ", enable_push_notifications_reason=" + this.enable_push_notifications_reason + ", call_schedule_option_id=" + this.call_schedule_option_id + ", is_text_form_focus=" + this.is_text_form_focus + ", text_form_message_type=" + this.text_form_message_type + ", deeplink=" + this.deeplink + ", opened_url=" + this.opened_url + ", case_count=" + this.case_count + ", inbox_load_fail=" + this.inbox_load_fail + ", issue_id=" + this.issue_id + ", sub_action=" + this.sub_action + ", chatbot_id=" + this.chatbot_id + ", chat_message_sender=" + this.chat_message_sender + ", chat_message_id=" + this.chat_message_id + ", chat_link_title=" + this.chat_link_title + ", recommended_action_count=" + this.recommended_action_count + ", agent_chat_type=" + this.agent_chat_type + ", is_concierge=" + this.is_concierge + ", appointment_id=" + this.appointment_id + ", is_concierge_user=" + this.is_concierge_user + ")";
        }

        /* compiled from: CXIssueDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CXIssueDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CXIssueDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, CallStatusDto callStatusDto, PhoneUnavailableReasonDto phoneUnavailableReasonDto, EnablePushNotificationReasonDto enablePushNotificationReasonDto, String str2, BooleanDto booleanDto, String str3, String str4, String str5, int i2, InboxLoadFailDto inboxLoadFailDto, String str6, String str7, String str8, ChatMessageSenderDto chatMessageSenderDto, String str9, String str10, int i3, AgentChatTypeDto agentChatTypeDto, boolean z, String str11, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.inquiry_id = "";
            } else {
                this.inquiry_id = str;
            }
            if ((i & 2) == 0) {
                this.cx_call_status = CallStatusDto.INSTANCE.getZeroValue();
            } else {
                this.cx_call_status = callStatusDto;
            }
            if ((i & 4) == 0) {
                this.phone_unavailable_reason = PhoneUnavailableReasonDto.INSTANCE.getZeroValue();
            } else {
                this.phone_unavailable_reason = phoneUnavailableReasonDto;
            }
            if ((i & 8) == 0) {
                this.enable_push_notifications_reason = EnablePushNotificationReasonDto.INSTANCE.getZeroValue();
            } else {
                this.enable_push_notifications_reason = enablePushNotificationReasonDto;
            }
            if ((i & 16) == 0) {
                this.call_schedule_option_id = "";
            } else {
                this.call_schedule_option_id = str2;
            }
            if ((i & 32) == 0) {
                this.is_text_form_focus = BooleanDto.INSTANCE.getZeroValue();
            } else {
                this.is_text_form_focus = booleanDto;
            }
            if ((i & 64) == 0) {
                this.text_form_message_type = "";
            } else {
                this.text_form_message_type = str3;
            }
            if ((i & 128) == 0) {
                this.deeplink = "";
            } else {
                this.deeplink = str4;
            }
            if ((i & 256) == 0) {
                this.opened_url = "";
            } else {
                this.opened_url = str5;
            }
            if ((i & 512) == 0) {
                this.case_count = 0;
            } else {
                this.case_count = i2;
            }
            if ((i & 1024) == 0) {
                this.inbox_load_fail = InboxLoadFailDto.INSTANCE.getZeroValue();
            } else {
                this.inbox_load_fail = inboxLoadFailDto;
            }
            if ((i & 2048) == 0) {
                this.issue_id = "";
            } else {
                this.issue_id = str6;
            }
            if ((i & 4096) == 0) {
                this.sub_action = "";
            } else {
                this.sub_action = str7;
            }
            if ((i & 8192) == 0) {
                this.chatbot_id = "";
            } else {
                this.chatbot_id = str8;
            }
            this.chat_message_sender = (i & 16384) == 0 ? ChatMessageSenderDto.INSTANCE.getZeroValue() : chatMessageSenderDto;
            if ((32768 & i) == 0) {
                this.chat_message_id = "";
            } else {
                this.chat_message_id = str9;
            }
            if ((65536 & i) == 0) {
                this.chat_link_title = "";
            } else {
                this.chat_link_title = str10;
            }
            if ((131072 & i) == 0) {
                this.recommended_action_count = 0;
            } else {
                this.recommended_action_count = i3;
            }
            this.agent_chat_type = (262144 & i) == 0 ? AgentChatTypeDto.INSTANCE.getZeroValue() : agentChatTypeDto;
            if ((524288 & i) == 0) {
                this.is_concierge = false;
            } else {
                this.is_concierge = z;
            }
            if ((1048576 & i) == 0) {
                this.appointment_id = "";
            } else {
                this.appointment_id = str11;
            }
            if ((i & 2097152) == 0) {
                this.is_concierge_user = false;
            } else {
                this.is_concierge_user = z2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.inquiry_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.inquiry_id);
            }
            if (self.cx_call_status != CallStatusDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, CallStatusDto.Serializer.INSTANCE, self.cx_call_status);
            }
            if (self.phone_unavailable_reason != PhoneUnavailableReasonDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, PhoneUnavailableReasonDto.Serializer.INSTANCE, self.phone_unavailable_reason);
            }
            if (self.enable_push_notifications_reason != EnablePushNotificationReasonDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, EnablePushNotificationReasonDto.Serializer.INSTANCE, self.enable_push_notifications_reason);
            }
            if (!Intrinsics.areEqual(self.call_schedule_option_id, "")) {
                output.encodeStringElement(serialDesc, 4, self.call_schedule_option_id);
            }
            if (self.is_text_form_focus != BooleanDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, BooleanDto.Serializer.INSTANCE, self.is_text_form_focus);
            }
            if (!Intrinsics.areEqual(self.text_form_message_type, "")) {
                output.encodeStringElement(serialDesc, 6, self.text_form_message_type);
            }
            if (!Intrinsics.areEqual(self.deeplink, "")) {
                output.encodeStringElement(serialDesc, 7, self.deeplink);
            }
            if (!Intrinsics.areEqual(self.opened_url, "")) {
                output.encodeStringElement(serialDesc, 8, self.opened_url);
            }
            int i = self.case_count;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 9, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            if (self.inbox_load_fail != InboxLoadFailDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 10, InboxLoadFailDto.Serializer.INSTANCE, self.inbox_load_fail);
            }
            if (!Intrinsics.areEqual(self.issue_id, "")) {
                output.encodeStringElement(serialDesc, 11, self.issue_id);
            }
            if (!Intrinsics.areEqual(self.sub_action, "")) {
                output.encodeStringElement(serialDesc, 12, self.sub_action);
            }
            if (!Intrinsics.areEqual(self.chatbot_id, "")) {
                output.encodeStringElement(serialDesc, 13, self.chatbot_id);
            }
            if (self.chat_message_sender != ChatMessageSenderDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 14, ChatMessageSenderDto.Serializer.INSTANCE, self.chat_message_sender);
            }
            if (!Intrinsics.areEqual(self.chat_message_id, "")) {
                output.encodeStringElement(serialDesc, 15, self.chat_message_id);
            }
            if (!Intrinsics.areEqual(self.chat_link_title, "")) {
                output.encodeStringElement(serialDesc, 16, self.chat_link_title);
            }
            int i2 = self.recommended_action_count;
            if (i2 != 0) {
                output.encodeSerializableElement(serialDesc, 17, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i2));
            }
            if (self.agent_chat_type != AgentChatTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 18, AgentChatTypeDto.Serializer.INSTANCE, self.agent_chat_type);
            }
            boolean z = self.is_concierge;
            if (z) {
                output.encodeBooleanElement(serialDesc, 19, z);
            }
            if (!Intrinsics.areEqual(self.appointment_id, "")) {
                output.encodeStringElement(serialDesc, 20, self.appointment_id);
            }
            boolean z2 = self.is_concierge_user;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 21, z2);
            }
        }

        public Surrogate(String inquiry_id, CallStatusDto cx_call_status, PhoneUnavailableReasonDto phone_unavailable_reason, EnablePushNotificationReasonDto enable_push_notifications_reason, String call_schedule_option_id, BooleanDto is_text_form_focus, String text_form_message_type, String deeplink, String opened_url, int i, InboxLoadFailDto inbox_load_fail, String issue_id, String sub_action, String chatbot_id, ChatMessageSenderDto chat_message_sender, String chat_message_id, String chat_link_title, int i2, AgentChatTypeDto agent_chat_type, boolean z, String appointment_id, boolean z2) {
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

        public /* synthetic */ Surrogate(String str, CallStatusDto callStatusDto, PhoneUnavailableReasonDto phoneUnavailableReasonDto, EnablePushNotificationReasonDto enablePushNotificationReasonDto, String str2, BooleanDto booleanDto, String str3, String str4, String str5, int i, InboxLoadFailDto inboxLoadFailDto, String str6, String str7, String str8, ChatMessageSenderDto chatMessageSenderDto, String str9, String str10, int i2, AgentChatTypeDto agentChatTypeDto, boolean z, String str11, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? CallStatusDto.INSTANCE.getZeroValue() : callStatusDto, (i3 & 4) != 0 ? PhoneUnavailableReasonDto.INSTANCE.getZeroValue() : phoneUnavailableReasonDto, (i3 & 8) != 0 ? EnablePushNotificationReasonDto.INSTANCE.getZeroValue() : enablePushNotificationReasonDto, (i3 & 16) != 0 ? "" : str2, (i3 & 32) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto, (i3 & 64) != 0 ? "" : str3, (i3 & 128) != 0 ? "" : str4, (i3 & 256) != 0 ? "" : str5, (i3 & 512) != 0 ? 0 : i, (i3 & 1024) != 0 ? InboxLoadFailDto.INSTANCE.getZeroValue() : inboxLoadFailDto, (i3 & 2048) != 0 ? "" : str6, (i3 & 4096) != 0 ? "" : str7, (i3 & 8192) != 0 ? "" : str8, (i3 & 16384) != 0 ? ChatMessageSenderDto.INSTANCE.getZeroValue() : chatMessageSenderDto, (i3 & 32768) != 0 ? "" : str9, (i3 & 65536) != 0 ? "" : str10, (i3 & 131072) != 0 ? 0 : i2, (i3 & 262144) != 0 ? AgentChatTypeDto.INSTANCE.getZeroValue() : agentChatTypeDto, (i3 & 524288) != 0 ? false : z, (i3 & 1048576) == 0 ? str11 : "", (i3 & 2097152) != 0 ? false : z2);
        }

        public final String getInquiry_id() {
            return this.inquiry_id;
        }

        public final CallStatusDto getCx_call_status() {
            return this.cx_call_status;
        }

        public final PhoneUnavailableReasonDto getPhone_unavailable_reason() {
            return this.phone_unavailable_reason;
        }

        public final EnablePushNotificationReasonDto getEnable_push_notifications_reason() {
            return this.enable_push_notifications_reason;
        }

        public final String getCall_schedule_option_id() {
            return this.call_schedule_option_id;
        }

        public final BooleanDto is_text_form_focus() {
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

        public final InboxLoadFailDto getInbox_load_fail() {
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

        public final ChatMessageSenderDto getChat_message_sender() {
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

        public final AgentChatTypeDto getAgent_chat_type() {
            return this.agent_chat_type;
        }

        public final boolean is_concierge() {
            return this.is_concierge;
        }

        public final String getAppointment_id() {
            return this.appointment_id;
        }

        public final boolean is_concierge_user() {
            return this.is_concierge_user;
        }
    }

    /* compiled from: CXIssueDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CXIssueDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto;", "Lcom/robinhood/rosetta/eventlogging/CXIssue;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CXIssueDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<CXIssueDto, CXIssue> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CXIssueDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CXIssueDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CXIssueDto> getBinaryBase64Serializer() {
            return (KSerializer) CXIssueDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CXIssue> getProtoAdapter() {
            return CXIssue.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CXIssueDto getZeroValue() {
            return CXIssueDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CXIssueDto fromProto(CXIssue proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new CXIssueDto(new Surrogate(proto.getInquiry_id(), CallStatusDto.INSTANCE.fromProto(proto.getCx_call_status()), PhoneUnavailableReasonDto.INSTANCE.fromProto(proto.getPhone_unavailable_reason()), EnablePushNotificationReasonDto.INSTANCE.fromProto(proto.getEnable_push_notifications_reason()), proto.getCall_schedule_option_id(), BooleanDto.INSTANCE.fromProto(proto.getIs_text_form_focus()), proto.getText_form_message_type(), proto.getDeeplink(), proto.getOpened_url(), proto.getCase_count(), InboxLoadFailDto.INSTANCE.fromProto(proto.getInbox_load_fail()), proto.getIssue_id(), proto.getSub_action(), proto.getChatbot_id(), ChatMessageSenderDto.INSTANCE.fromProto(proto.getChat_message_sender()), proto.getChat_message_id(), proto.getChat_link_title(), proto.getRecommended_action_count(), AgentChatTypeDto.INSTANCE.fromProto(proto.getAgent_chat_type()), proto.getIs_concierge(), proto.getAppointment_id(), proto.getIs_concierge_user()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CXIssueDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CXIssueDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CXIssueDto(null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, null, false, null, false, 4194303, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CXIssueDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0018\u0019B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CXIssueDto$CallStatusDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/CXIssue$CallStatus;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "CALL_STATUS_UNSPECIFIED", "WAITING", "CONNECTING", "CONNECTED", "CANCELLED", "MISSED", "COMPLETED", "ASSIGNED", "SCHEDULED", "DEESCALATED", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class CallStatusDto implements Dto2<CXIssue.CallStatus>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CallStatusDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<CallStatusDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<CallStatusDto, CXIssue.CallStatus>> binaryBase64Serializer$delegate;
        public static final CallStatusDto CALL_STATUS_UNSPECIFIED = new CALL_STATUS_UNSPECIFIED("CALL_STATUS_UNSPECIFIED", 0);
        public static final CallStatusDto WAITING = new WAITING("WAITING", 1);
        public static final CallStatusDto CONNECTING = new CONNECTING("CONNECTING", 2);
        public static final CallStatusDto CONNECTED = new CONNECTED("CONNECTED", 3);
        public static final CallStatusDto CANCELLED = new CANCELLED("CANCELLED", 4);
        public static final CallStatusDto MISSED = new MISSED("MISSED", 5);
        public static final CallStatusDto COMPLETED = new COMPLETED("COMPLETED", 6);
        public static final CallStatusDto ASSIGNED = new ASSIGNED("ASSIGNED", 7);
        public static final CallStatusDto SCHEDULED = new SCHEDULED("SCHEDULED", 8);
        public static final CallStatusDto DEESCALATED = new DEESCALATED("DEESCALATED", 9);

        private static final /* synthetic */ CallStatusDto[] $values() {
            return new CallStatusDto[]{CALL_STATUS_UNSPECIFIED, WAITING, CONNECTING, CONNECTED, CANCELLED, MISSED, COMPLETED, ASSIGNED, SCHEDULED, DEESCALATED};
        }

        public /* synthetic */ CallStatusDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<CallStatusDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: CXIssueDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CXIssueDto.CallStatusDto.CALL_STATUS_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$CallStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CXIssue$CallStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CALL_STATUS_UNSPECIFIED extends CallStatusDto {
            CALL_STATUS_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CXIssue.CallStatus toProto() {
                return CXIssue.CallStatus.CALL_STATUS_UNSPECIFIED;
            }
        }

        private CallStatusDto(String str, int i) {
        }

        static {
            CallStatusDto[] callStatusDtoArr$values = $values();
            $VALUES = callStatusDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(callStatusDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CXIssueDto$CallStatusDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CXIssueDto.CallStatusDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: CXIssueDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CXIssueDto.CallStatusDto.WAITING", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$CallStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CXIssue$CallStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class WAITING extends CallStatusDto {
            WAITING(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CXIssue.CallStatus toProto() {
                return CXIssue.CallStatus.WAITING;
            }
        }

        /* compiled from: CXIssueDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CXIssueDto.CallStatusDto.CONNECTING", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$CallStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CXIssue$CallStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CONNECTING extends CallStatusDto {
            CONNECTING(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CXIssue.CallStatus toProto() {
                return CXIssue.CallStatus.CONNECTING;
            }
        }

        /* compiled from: CXIssueDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CXIssueDto.CallStatusDto.CONNECTED", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$CallStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CXIssue$CallStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CONNECTED extends CallStatusDto {
            CONNECTED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CXIssue.CallStatus toProto() {
                return CXIssue.CallStatus.CONNECTED;
            }
        }

        /* compiled from: CXIssueDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CXIssueDto.CallStatusDto.CANCELLED", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$CallStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CXIssue$CallStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CANCELLED extends CallStatusDto {
            CANCELLED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CXIssue.CallStatus toProto() {
                return CXIssue.CallStatus.CANCELLED;
            }
        }

        /* compiled from: CXIssueDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CXIssueDto.CallStatusDto.MISSED", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$CallStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CXIssue$CallStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MISSED extends CallStatusDto {
            MISSED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CXIssue.CallStatus toProto() {
                return CXIssue.CallStatus.MISSED;
            }
        }

        /* compiled from: CXIssueDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CXIssueDto.CallStatusDto.COMPLETED", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$CallStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CXIssue$CallStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class COMPLETED extends CallStatusDto {
            COMPLETED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CXIssue.CallStatus toProto() {
                return CXIssue.CallStatus.COMPLETED;
            }
        }

        /* compiled from: CXIssueDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CXIssueDto.CallStatusDto.ASSIGNED", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$CallStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CXIssue$CallStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ASSIGNED extends CallStatusDto {
            ASSIGNED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CXIssue.CallStatus toProto() {
                return CXIssue.CallStatus.ASSIGNED;
            }
        }

        /* compiled from: CXIssueDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CXIssueDto.CallStatusDto.SCHEDULED", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$CallStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CXIssue$CallStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SCHEDULED extends CallStatusDto {
            SCHEDULED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CXIssue.CallStatus toProto() {
                return CXIssue.CallStatus.SCHEDULED;
            }
        }

        /* compiled from: CXIssueDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CXIssueDto.CallStatusDto.DEESCALATED", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$CallStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CXIssue$CallStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DEESCALATED extends CallStatusDto {
            DEESCALATED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CXIssue.CallStatus toProto() {
                return CXIssue.CallStatus.DEESCALATED;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: CXIssueDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CXIssueDto$CallStatusDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$CallStatusDto;", "Lcom/robinhood/rosetta/eventlogging/CXIssue$CallStatus;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CXIssueDto$CallStatusDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<CallStatusDto, CXIssue.CallStatus> {

            /* compiled from: CXIssueDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CXIssue.CallStatus.values().length];
                    try {
                        iArr[CXIssue.CallStatus.CALL_STATUS_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CXIssue.CallStatus.WAITING.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[CXIssue.CallStatus.CONNECTING.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[CXIssue.CallStatus.CONNECTED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[CXIssue.CallStatus.CANCELLED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[CXIssue.CallStatus.MISSED.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[CXIssue.CallStatus.COMPLETED.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[CXIssue.CallStatus.ASSIGNED.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[CXIssue.CallStatus.SCHEDULED.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[CXIssue.CallStatus.DEESCALATED.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<CallStatusDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CallStatusDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CallStatusDto> getBinaryBase64Serializer() {
                return (KSerializer) CallStatusDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<CXIssue.CallStatus> getProtoAdapter() {
                return CXIssue.CallStatus.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CallStatusDto getZeroValue() {
                return CallStatusDto.CALL_STATUS_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CallStatusDto fromProto(CXIssue.CallStatus proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return CallStatusDto.CALL_STATUS_UNSPECIFIED;
                    case 2:
                        return CallStatusDto.WAITING;
                    case 3:
                        return CallStatusDto.CONNECTING;
                    case 4:
                        return CallStatusDto.CONNECTED;
                    case 5:
                        return CallStatusDto.CANCELLED;
                    case 6:
                        return CallStatusDto.MISSED;
                    case 7:
                        return CallStatusDto.COMPLETED;
                    case 8:
                        return CallStatusDto.ASSIGNED;
                    case 9:
                        return CallStatusDto.SCHEDULED;
                    case 10:
                        return CallStatusDto.DEESCALATED;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: CXIssueDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CXIssueDto$CallStatusDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$CallStatusDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<CallStatusDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<CallStatusDto, CXIssue.CallStatus> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.CXIssue.CallStatus", CallStatusDto.getEntries(), CallStatusDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public CallStatusDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (CallStatusDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, CallStatusDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static CallStatusDto valueOf(String str) {
            return (CallStatusDto) Enum.valueOf(CallStatusDto.class, str);
        }

        public static CallStatusDto[] values() {
            return (CallStatusDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CXIssueDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0014\u0015B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CXIssueDto$PhoneUnavailableReasonDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/CXIssue$PhoneUnavailableReason;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "PHONE_UNAVAILABLE_REASON_UNSPECIFIED", "OUT_OF_HOURS", "HIGH_TRAFFIC", "ALREADY_QUEUED", "EXTREME_TRAFFIC", "EXPERIMENT", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class PhoneUnavailableReasonDto implements Dto2<CXIssue.PhoneUnavailableReason>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PhoneUnavailableReasonDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<PhoneUnavailableReasonDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<PhoneUnavailableReasonDto, CXIssue.PhoneUnavailableReason>> binaryBase64Serializer$delegate;
        public static final PhoneUnavailableReasonDto PHONE_UNAVAILABLE_REASON_UNSPECIFIED = new PHONE_UNAVAILABLE_REASON_UNSPECIFIED("PHONE_UNAVAILABLE_REASON_UNSPECIFIED", 0);
        public static final PhoneUnavailableReasonDto OUT_OF_HOURS = new OUT_OF_HOURS("OUT_OF_HOURS", 1);
        public static final PhoneUnavailableReasonDto HIGH_TRAFFIC = new HIGH_TRAFFIC("HIGH_TRAFFIC", 2);
        public static final PhoneUnavailableReasonDto ALREADY_QUEUED = new ALREADY_QUEUED("ALREADY_QUEUED", 3);
        public static final PhoneUnavailableReasonDto EXTREME_TRAFFIC = new EXTREME_TRAFFIC("EXTREME_TRAFFIC", 4);
        public static final PhoneUnavailableReasonDto EXPERIMENT = new EXPERIMENT("EXPERIMENT", 5);

        private static final /* synthetic */ PhoneUnavailableReasonDto[] $values() {
            return new PhoneUnavailableReasonDto[]{PHONE_UNAVAILABLE_REASON_UNSPECIFIED, OUT_OF_HOURS, HIGH_TRAFFIC, ALREADY_QUEUED, EXTREME_TRAFFIC, EXPERIMENT};
        }

        public /* synthetic */ PhoneUnavailableReasonDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<PhoneUnavailableReasonDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private PhoneUnavailableReasonDto(String str, int i) {
        }

        /* compiled from: CXIssueDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CXIssueDto.PhoneUnavailableReasonDto.PHONE_UNAVAILABLE_REASON_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$PhoneUnavailableReasonDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CXIssue$PhoneUnavailableReason;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PHONE_UNAVAILABLE_REASON_UNSPECIFIED extends PhoneUnavailableReasonDto {
            PHONE_UNAVAILABLE_REASON_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CXIssue.PhoneUnavailableReason toProto() {
                return CXIssue.PhoneUnavailableReason.PHONE_UNAVAILABLE_REASON_UNSPECIFIED;
            }
        }

        static {
            PhoneUnavailableReasonDto[] phoneUnavailableReasonDtoArr$values = $values();
            $VALUES = phoneUnavailableReasonDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(phoneUnavailableReasonDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CXIssueDto$PhoneUnavailableReasonDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CXIssueDto.PhoneUnavailableReasonDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: CXIssueDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CXIssueDto.PhoneUnavailableReasonDto.OUT_OF_HOURS", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$PhoneUnavailableReasonDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CXIssue$PhoneUnavailableReason;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OUT_OF_HOURS extends PhoneUnavailableReasonDto {
            OUT_OF_HOURS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CXIssue.PhoneUnavailableReason toProto() {
                return CXIssue.PhoneUnavailableReason.OUT_OF_HOURS;
            }
        }

        /* compiled from: CXIssueDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CXIssueDto.PhoneUnavailableReasonDto.HIGH_TRAFFIC", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$PhoneUnavailableReasonDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CXIssue$PhoneUnavailableReason;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class HIGH_TRAFFIC extends PhoneUnavailableReasonDto {
            HIGH_TRAFFIC(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CXIssue.PhoneUnavailableReason toProto() {
                return CXIssue.PhoneUnavailableReason.HIGH_TRAFFIC;
            }
        }

        /* compiled from: CXIssueDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CXIssueDto.PhoneUnavailableReasonDto.ALREADY_QUEUED", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$PhoneUnavailableReasonDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CXIssue$PhoneUnavailableReason;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ALREADY_QUEUED extends PhoneUnavailableReasonDto {
            ALREADY_QUEUED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CXIssue.PhoneUnavailableReason toProto() {
                return CXIssue.PhoneUnavailableReason.ALREADY_QUEUED;
            }
        }

        /* compiled from: CXIssueDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CXIssueDto.PhoneUnavailableReasonDto.EXTREME_TRAFFIC", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$PhoneUnavailableReasonDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CXIssue$PhoneUnavailableReason;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EXTREME_TRAFFIC extends PhoneUnavailableReasonDto {
            EXTREME_TRAFFIC(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CXIssue.PhoneUnavailableReason toProto() {
                return CXIssue.PhoneUnavailableReason.EXTREME_TRAFFIC;
            }
        }

        /* compiled from: CXIssueDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CXIssueDto.PhoneUnavailableReasonDto.EXPERIMENT", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$PhoneUnavailableReasonDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CXIssue$PhoneUnavailableReason;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EXPERIMENT extends PhoneUnavailableReasonDto {
            EXPERIMENT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CXIssue.PhoneUnavailableReason toProto() {
                return CXIssue.PhoneUnavailableReason.EXPERIMENT;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: CXIssueDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CXIssueDto$PhoneUnavailableReasonDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$PhoneUnavailableReasonDto;", "Lcom/robinhood/rosetta/eventlogging/CXIssue$PhoneUnavailableReason;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CXIssueDto$PhoneUnavailableReasonDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<PhoneUnavailableReasonDto, CXIssue.PhoneUnavailableReason> {

            /* compiled from: CXIssueDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CXIssue.PhoneUnavailableReason.values().length];
                    try {
                        iArr[CXIssue.PhoneUnavailableReason.PHONE_UNAVAILABLE_REASON_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CXIssue.PhoneUnavailableReason.OUT_OF_HOURS.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[CXIssue.PhoneUnavailableReason.HIGH_TRAFFIC.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[CXIssue.PhoneUnavailableReason.ALREADY_QUEUED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[CXIssue.PhoneUnavailableReason.EXTREME_TRAFFIC.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[CXIssue.PhoneUnavailableReason.EXPERIMENT.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<PhoneUnavailableReasonDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<PhoneUnavailableReasonDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<PhoneUnavailableReasonDto> getBinaryBase64Serializer() {
                return (KSerializer) PhoneUnavailableReasonDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<CXIssue.PhoneUnavailableReason> getProtoAdapter() {
                return CXIssue.PhoneUnavailableReason.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public PhoneUnavailableReasonDto getZeroValue() {
                return PhoneUnavailableReasonDto.PHONE_UNAVAILABLE_REASON_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public PhoneUnavailableReasonDto fromProto(CXIssue.PhoneUnavailableReason proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return PhoneUnavailableReasonDto.PHONE_UNAVAILABLE_REASON_UNSPECIFIED;
                    case 2:
                        return PhoneUnavailableReasonDto.OUT_OF_HOURS;
                    case 3:
                        return PhoneUnavailableReasonDto.HIGH_TRAFFIC;
                    case 4:
                        return PhoneUnavailableReasonDto.ALREADY_QUEUED;
                    case 5:
                        return PhoneUnavailableReasonDto.EXTREME_TRAFFIC;
                    case 6:
                        return PhoneUnavailableReasonDto.EXPERIMENT;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: CXIssueDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CXIssueDto$PhoneUnavailableReasonDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$PhoneUnavailableReasonDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<PhoneUnavailableReasonDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<PhoneUnavailableReasonDto, CXIssue.PhoneUnavailableReason> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.CXIssue.PhoneUnavailableReason", PhoneUnavailableReasonDto.getEntries(), PhoneUnavailableReasonDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public PhoneUnavailableReasonDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (PhoneUnavailableReasonDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, PhoneUnavailableReasonDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static PhoneUnavailableReasonDto valueOf(String str) {
            return (PhoneUnavailableReasonDto) Enum.valueOf(PhoneUnavailableReasonDto.class, str);
        }

        public static PhoneUnavailableReasonDto[] values() {
            return (PhoneUnavailableReasonDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CXIssueDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0010\u0011B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016j\u0002\b\u0007j\u0002\b\b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CXIssueDto$EnablePushNotificationReasonDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/CXIssue$EnablePushNotificationReason;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ENABLE_PUSH_NOTIFICATION_REASON_UNSPECIFIED", "CX_CALL_REMINDER", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class EnablePushNotificationReasonDto implements Dto2<CXIssue.EnablePushNotificationReason>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EnablePushNotificationReasonDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<EnablePushNotificationReasonDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<EnablePushNotificationReasonDto, CXIssue.EnablePushNotificationReason>> binaryBase64Serializer$delegate;
        public static final EnablePushNotificationReasonDto ENABLE_PUSH_NOTIFICATION_REASON_UNSPECIFIED = new ENABLE_PUSH_NOTIFICATION_REASON_UNSPECIFIED("ENABLE_PUSH_NOTIFICATION_REASON_UNSPECIFIED", 0);
        public static final EnablePushNotificationReasonDto CX_CALL_REMINDER = new CX_CALL_REMINDER("CX_CALL_REMINDER", 1);

        private static final /* synthetic */ EnablePushNotificationReasonDto[] $values() {
            return new EnablePushNotificationReasonDto[]{ENABLE_PUSH_NOTIFICATION_REASON_UNSPECIFIED, CX_CALL_REMINDER};
        }

        public /* synthetic */ EnablePushNotificationReasonDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<EnablePushNotificationReasonDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private EnablePushNotificationReasonDto(String str, int i) {
        }

        /* compiled from: CXIssueDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CXIssueDto.EnablePushNotificationReasonDto.ENABLE_PUSH_NOTIFICATION_REASON_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$EnablePushNotificationReasonDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CXIssue$EnablePushNotificationReason;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ENABLE_PUSH_NOTIFICATION_REASON_UNSPECIFIED extends EnablePushNotificationReasonDto {
            ENABLE_PUSH_NOTIFICATION_REASON_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CXIssue.EnablePushNotificationReason toProto() {
                return CXIssue.EnablePushNotificationReason.ENABLE_PUSH_NOTIFICATION_REASON_UNSPECIFIED;
            }
        }

        static {
            EnablePushNotificationReasonDto[] enablePushNotificationReasonDtoArr$values = $values();
            $VALUES = enablePushNotificationReasonDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(enablePushNotificationReasonDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CXIssueDto$EnablePushNotificationReasonDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CXIssueDto.EnablePushNotificationReasonDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: CXIssueDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CXIssueDto.EnablePushNotificationReasonDto.CX_CALL_REMINDER", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$EnablePushNotificationReasonDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CXIssue$EnablePushNotificationReason;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CX_CALL_REMINDER extends EnablePushNotificationReasonDto {
            CX_CALL_REMINDER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CXIssue.EnablePushNotificationReason toProto() {
                return CXIssue.EnablePushNotificationReason.CX_CALL_REMINDER;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: CXIssueDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CXIssueDto$EnablePushNotificationReasonDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$EnablePushNotificationReasonDto;", "Lcom/robinhood/rosetta/eventlogging/CXIssue$EnablePushNotificationReason;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CXIssueDto$EnablePushNotificationReasonDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<EnablePushNotificationReasonDto, CXIssue.EnablePushNotificationReason> {

            /* compiled from: CXIssueDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CXIssue.EnablePushNotificationReason.values().length];
                    try {
                        iArr[CXIssue.EnablePushNotificationReason.ENABLE_PUSH_NOTIFICATION_REASON_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CXIssue.EnablePushNotificationReason.CX_CALL_REMINDER.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<EnablePushNotificationReasonDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<EnablePushNotificationReasonDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<EnablePushNotificationReasonDto> getBinaryBase64Serializer() {
                return (KSerializer) EnablePushNotificationReasonDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<CXIssue.EnablePushNotificationReason> getProtoAdapter() {
                return CXIssue.EnablePushNotificationReason.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EnablePushNotificationReasonDto getZeroValue() {
                return EnablePushNotificationReasonDto.ENABLE_PUSH_NOTIFICATION_REASON_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EnablePushNotificationReasonDto fromProto(CXIssue.EnablePushNotificationReason proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return EnablePushNotificationReasonDto.ENABLE_PUSH_NOTIFICATION_REASON_UNSPECIFIED;
                }
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return EnablePushNotificationReasonDto.CX_CALL_REMINDER;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: CXIssueDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CXIssueDto$EnablePushNotificationReasonDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$EnablePushNotificationReasonDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<EnablePushNotificationReasonDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<EnablePushNotificationReasonDto, CXIssue.EnablePushNotificationReason> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.CXIssue.EnablePushNotificationReason", EnablePushNotificationReasonDto.getEntries(), EnablePushNotificationReasonDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public EnablePushNotificationReasonDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (EnablePushNotificationReasonDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, EnablePushNotificationReasonDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static EnablePushNotificationReasonDto valueOf(String str) {
            return (EnablePushNotificationReasonDto) Enum.valueOf(EnablePushNotificationReasonDto.class, str);
        }

        public static EnablePushNotificationReasonDto[] values() {
            return (EnablePushNotificationReasonDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CXIssueDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CXIssueDto$InboxLoadFailDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/CXIssue$InboxLoadFail;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "INBOX_LOAD_FAIL_UNSPECIFIED", "NOTIFICATIONS", "SUPPORT_CASE", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class InboxLoadFailDto implements Dto2<CXIssue.InboxLoadFail>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ InboxLoadFailDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<InboxLoadFailDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final InboxLoadFailDto INBOX_LOAD_FAIL_UNSPECIFIED = new INBOX_LOAD_FAIL_UNSPECIFIED("INBOX_LOAD_FAIL_UNSPECIFIED", 0);
        public static final InboxLoadFailDto NOTIFICATIONS = new NOTIFICATIONS("NOTIFICATIONS", 1);
        public static final InboxLoadFailDto SUPPORT_CASE = new SUPPORT_CASE("SUPPORT_CASE", 2);
        private static final Lazy<BinaryBase64DtoSerializer<InboxLoadFailDto, CXIssue.InboxLoadFail>> binaryBase64Serializer$delegate;

        private static final /* synthetic */ InboxLoadFailDto[] $values() {
            return new InboxLoadFailDto[]{INBOX_LOAD_FAIL_UNSPECIFIED, NOTIFICATIONS, SUPPORT_CASE};
        }

        public /* synthetic */ InboxLoadFailDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<InboxLoadFailDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: CXIssueDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CXIssueDto.InboxLoadFailDto.INBOX_LOAD_FAIL_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$InboxLoadFailDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CXIssue$InboxLoadFail;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class INBOX_LOAD_FAIL_UNSPECIFIED extends InboxLoadFailDto {
            INBOX_LOAD_FAIL_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CXIssue.InboxLoadFail toProto() {
                return CXIssue.InboxLoadFail.INBOX_LOAD_FAIL_UNSPECIFIED;
            }
        }

        private InboxLoadFailDto(String str, int i) {
        }

        static {
            InboxLoadFailDto[] inboxLoadFailDtoArr$values = $values();
            $VALUES = inboxLoadFailDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(inboxLoadFailDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CXIssueDto$InboxLoadFailDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CXIssueDto.InboxLoadFailDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: CXIssueDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CXIssueDto.InboxLoadFailDto.NOTIFICATIONS", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$InboxLoadFailDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CXIssue$InboxLoadFail;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class NOTIFICATIONS extends InboxLoadFailDto {
            NOTIFICATIONS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CXIssue.InboxLoadFail toProto() {
                return CXIssue.InboxLoadFail.NOTIFICATIONS;
            }
        }

        /* compiled from: CXIssueDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CXIssueDto.InboxLoadFailDto.SUPPORT_CASE", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$InboxLoadFailDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CXIssue$InboxLoadFail;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SUPPORT_CASE extends InboxLoadFailDto {
            SUPPORT_CASE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CXIssue.InboxLoadFail toProto() {
                return CXIssue.InboxLoadFail.SUPPORT_CASE;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: CXIssueDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CXIssueDto$InboxLoadFailDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$InboxLoadFailDto;", "Lcom/robinhood/rosetta/eventlogging/CXIssue$InboxLoadFail;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CXIssueDto$InboxLoadFailDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<InboxLoadFailDto, CXIssue.InboxLoadFail> {

            /* compiled from: CXIssueDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CXIssue.InboxLoadFail.values().length];
                    try {
                        iArr[CXIssue.InboxLoadFail.INBOX_LOAD_FAIL_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CXIssue.InboxLoadFail.NOTIFICATIONS.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[CXIssue.InboxLoadFail.SUPPORT_CASE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<InboxLoadFailDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<InboxLoadFailDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<InboxLoadFailDto> getBinaryBase64Serializer() {
                return (KSerializer) InboxLoadFailDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<CXIssue.InboxLoadFail> getProtoAdapter() {
                return CXIssue.InboxLoadFail.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public InboxLoadFailDto getZeroValue() {
                return InboxLoadFailDto.INBOX_LOAD_FAIL_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public InboxLoadFailDto fromProto(CXIssue.InboxLoadFail proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return InboxLoadFailDto.INBOX_LOAD_FAIL_UNSPECIFIED;
                }
                if (i == 2) {
                    return InboxLoadFailDto.NOTIFICATIONS;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return InboxLoadFailDto.SUPPORT_CASE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: CXIssueDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CXIssueDto$InboxLoadFailDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$InboxLoadFailDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<InboxLoadFailDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<InboxLoadFailDto, CXIssue.InboxLoadFail> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.CXIssue.InboxLoadFail", InboxLoadFailDto.getEntries(), InboxLoadFailDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public InboxLoadFailDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (InboxLoadFailDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, InboxLoadFailDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static InboxLoadFailDto valueOf(String str) {
            return (InboxLoadFailDto) Enum.valueOf(InboxLoadFailDto.class, str);
        }

        public static InboxLoadFailDto[] values() {
            return (InboxLoadFailDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CXIssueDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CXIssueDto$ChatMessageSenderDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/CXIssue$ChatMessageSender;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "AGENT", "CHATBOT", "SYSTEM", "USER", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ChatMessageSenderDto implements Dto2<CXIssue.ChatMessageSender>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ChatMessageSenderDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<ChatMessageSenderDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ChatMessageSenderDto, CXIssue.ChatMessageSender>> binaryBase64Serializer$delegate;
        public static final ChatMessageSenderDto AGENT = new AGENT("AGENT", 0);
        public static final ChatMessageSenderDto CHATBOT = new CHATBOT("CHATBOT", 1);
        public static final ChatMessageSenderDto SYSTEM = new SYSTEM("SYSTEM", 2);
        public static final ChatMessageSenderDto USER = new USER("USER", 3);

        private static final /* synthetic */ ChatMessageSenderDto[] $values() {
            return new ChatMessageSenderDto[]{AGENT, CHATBOT, SYSTEM, USER};
        }

        public /* synthetic */ ChatMessageSenderDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<ChatMessageSenderDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: CXIssueDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CXIssueDto.ChatMessageSenderDto.AGENT", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$ChatMessageSenderDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CXIssue$ChatMessageSender;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class AGENT extends ChatMessageSenderDto {
            AGENT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CXIssue.ChatMessageSender toProto() {
                return CXIssue.ChatMessageSender.AGENT;
            }
        }

        private ChatMessageSenderDto(String str, int i) {
        }

        static {
            ChatMessageSenderDto[] chatMessageSenderDtoArr$values = $values();
            $VALUES = chatMessageSenderDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(chatMessageSenderDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CXIssueDto$ChatMessageSenderDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CXIssueDto.ChatMessageSenderDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: CXIssueDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CXIssueDto.ChatMessageSenderDto.CHATBOT", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$ChatMessageSenderDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CXIssue$ChatMessageSender;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CHATBOT extends ChatMessageSenderDto {
            CHATBOT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CXIssue.ChatMessageSender toProto() {
                return CXIssue.ChatMessageSender.CHATBOT;
            }
        }

        /* compiled from: CXIssueDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CXIssueDto.ChatMessageSenderDto.SYSTEM", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$ChatMessageSenderDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CXIssue$ChatMessageSender;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SYSTEM extends ChatMessageSenderDto {
            SYSTEM(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CXIssue.ChatMessageSender toProto() {
                return CXIssue.ChatMessageSender.SYSTEM;
            }
        }

        /* compiled from: CXIssueDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CXIssueDto.ChatMessageSenderDto.USER", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$ChatMessageSenderDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CXIssue$ChatMessageSender;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class USER extends ChatMessageSenderDto {
            USER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CXIssue.ChatMessageSender toProto() {
                return CXIssue.ChatMessageSender.USER;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: CXIssueDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CXIssueDto$ChatMessageSenderDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$ChatMessageSenderDto;", "Lcom/robinhood/rosetta/eventlogging/CXIssue$ChatMessageSender;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CXIssueDto$ChatMessageSenderDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<ChatMessageSenderDto, CXIssue.ChatMessageSender> {

            /* compiled from: CXIssueDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CXIssue.ChatMessageSender.values().length];
                    try {
                        iArr[CXIssue.ChatMessageSender.AGENT.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CXIssue.ChatMessageSender.CHATBOT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[CXIssue.ChatMessageSender.SYSTEM.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[CXIssue.ChatMessageSender.USER.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ChatMessageSenderDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ChatMessageSenderDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ChatMessageSenderDto> getBinaryBase64Serializer() {
                return (KSerializer) ChatMessageSenderDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<CXIssue.ChatMessageSender> getProtoAdapter() {
                return CXIssue.ChatMessageSender.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ChatMessageSenderDto getZeroValue() {
                return ChatMessageSenderDto.AGENT;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ChatMessageSenderDto fromProto(CXIssue.ChatMessageSender proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return ChatMessageSenderDto.AGENT;
                }
                if (i == 2) {
                    return ChatMessageSenderDto.CHATBOT;
                }
                if (i == 3) {
                    return ChatMessageSenderDto.SYSTEM;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return ChatMessageSenderDto.USER;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: CXIssueDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CXIssueDto$ChatMessageSenderDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$ChatMessageSenderDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<ChatMessageSenderDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<ChatMessageSenderDto, CXIssue.ChatMessageSender> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.CXIssue.ChatMessageSender", ChatMessageSenderDto.getEntries(), ChatMessageSenderDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public ChatMessageSenderDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (ChatMessageSenderDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ChatMessageSenderDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static ChatMessageSenderDto valueOf(String str) {
            return (ChatMessageSenderDto) Enum.valueOf(ChatMessageSenderDto.class, str);
        }

        public static ChatMessageSenderDto[] values() {
            return (ChatMessageSenderDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CXIssueDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CXIssueDto$AgentChatTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/CXIssue$AgentChatType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", "SALESFORCE", "TWILIO", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class AgentChatTypeDto implements Dto2<CXIssue.AgentChatType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AgentChatTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<AgentChatTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<AgentChatTypeDto, CXIssue.AgentChatType>> binaryBase64Serializer$delegate;
        public static final AgentChatTypeDto UNKNOWN = new UNKNOWN("UNKNOWN", 0);
        public static final AgentChatTypeDto SALESFORCE = new SALESFORCE("SALESFORCE", 1);
        public static final AgentChatTypeDto TWILIO = new TWILIO("TWILIO", 2);

        private static final /* synthetic */ AgentChatTypeDto[] $values() {
            return new AgentChatTypeDto[]{UNKNOWN, SALESFORCE, TWILIO};
        }

        public /* synthetic */ AgentChatTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<AgentChatTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: CXIssueDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CXIssueDto.AgentChatTypeDto.UNKNOWN", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$AgentChatTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CXIssue$AgentChatType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class UNKNOWN extends AgentChatTypeDto {
            UNKNOWN(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CXIssue.AgentChatType toProto() {
                return CXIssue.AgentChatType.UNKNOWN;
            }
        }

        private AgentChatTypeDto(String str, int i) {
        }

        static {
            AgentChatTypeDto[] agentChatTypeDtoArr$values = $values();
            $VALUES = agentChatTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(agentChatTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CXIssueDto$AgentChatTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CXIssueDto.AgentChatTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: CXIssueDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CXIssueDto.AgentChatTypeDto.SALESFORCE", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$AgentChatTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CXIssue$AgentChatType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SALESFORCE extends AgentChatTypeDto {
            SALESFORCE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CXIssue.AgentChatType toProto() {
                return CXIssue.AgentChatType.SALESFORCE;
            }
        }

        /* compiled from: CXIssueDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/CXIssueDto.AgentChatTypeDto.TWILIO", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$AgentChatTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/CXIssue$AgentChatType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TWILIO extends AgentChatTypeDto {
            TWILIO(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CXIssue.AgentChatType toProto() {
                return CXIssue.AgentChatType.TWILIO;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: CXIssueDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CXIssueDto$AgentChatTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$AgentChatTypeDto;", "Lcom/robinhood/rosetta/eventlogging/CXIssue$AgentChatType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CXIssueDto$AgentChatTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<AgentChatTypeDto, CXIssue.AgentChatType> {

            /* compiled from: CXIssueDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CXIssue.AgentChatType.values().length];
                    try {
                        iArr[CXIssue.AgentChatType.UNKNOWN.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CXIssue.AgentChatType.SALESFORCE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[CXIssue.AgentChatType.TWILIO.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<AgentChatTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<AgentChatTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<AgentChatTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) AgentChatTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<CXIssue.AgentChatType> getProtoAdapter() {
                return CXIssue.AgentChatType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AgentChatTypeDto getZeroValue() {
                return AgentChatTypeDto.UNKNOWN;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AgentChatTypeDto fromProto(CXIssue.AgentChatType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return AgentChatTypeDto.UNKNOWN;
                }
                if (i == 2) {
                    return AgentChatTypeDto.SALESFORCE;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return AgentChatTypeDto.TWILIO;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: CXIssueDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CXIssueDto$AgentChatTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$AgentChatTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<AgentChatTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<AgentChatTypeDto, CXIssue.AgentChatType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.CXIssue.AgentChatType", AgentChatTypeDto.getEntries(), AgentChatTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public AgentChatTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (AgentChatTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, AgentChatTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static AgentChatTypeDto valueOf(String str) {
            return (AgentChatTypeDto) Enum.valueOf(AgentChatTypeDto.class, str);
        }

        public static AgentChatTypeDto[] values() {
            return (AgentChatTypeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: CXIssueDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CXIssueDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/CXIssueDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<CXIssueDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.CXIssue", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CXIssueDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CXIssueDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CXIssueDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CXIssueDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CXIssueDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.CXIssueDto";
        }
    }
}
