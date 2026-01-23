package identi.service.p471v1.models_workflow.p472v1;

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
import identi.service.p471v1.models_workflow.p472v1.WorkflowScreen;
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

/* compiled from: WorkflowScreen.kt */
@Metadata(m3635d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 ^2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003^_`Bý\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)\u0012\b\b\u0002\u0010*\u001a\u00020+¢\u0006\u0004\b,\u0010-J\b\u0010U\u001a\u00020\u0002H\u0017J\u0013\u0010V\u001a\u00020W2\b\u0010X\u001a\u0004\u0018\u00010YH\u0096\u0002J\b\u0010Z\u001a\u00020[H\u0016J\b\u0010\\\u001a\u00020\u0006H\u0016Jü\u0001\u0010]\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\b\b\u0002\u0010*\u001a\u00020+R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00101R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0018\u0010 \u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0018\u0010\"\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0018\u0010$\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0018\u0010&\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0018\u0010(\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u0010T¨\u0006a"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowScreen;", "Lcom/squareup/wire/Message;", "", "name", "Lidenti/service/v1/models_workflow/v1/WorkflowScreen$Name;", "block_id", "", "logging_identifier", "layout_format", "Lidenti/service/v1/models_workflow/v1/WorkflowScreen$LayoutFormat;", "update_app_screen_params", "Lidenti/service/v1/models_workflow/v1/UpdateApp$ScreenParams;", "info_screen_params", "Lidenti/service/v1/models_workflow/v1/Info$ScreenParams;", "contact_support_screen_params", "Lidenti/service/v1/models_workflow/v1/ContactSupport$ScreenParams;", "sms_challenge_screen_params", "Lidenti/service/v1/models_workflow/v1/SmsChallenge$ScreenParams;", "device_approval_challenge_screen_params", "Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallenge$ScreenParams;", "kyc_status_check_screen_params", "Lidenti/service/v1/models_workflow/v1/KycStatusCheck$ScreenParams;", "plaid_bank_list_screen_params", "Lidenti/service/v1/models_workflow/v1/PlaidBankList$ScreenParams;", "plaid_auth_screen_params", "Lidenti/service/v1/models_workflow/v1/PlaidAuth$ScreenParams;", "kba_screen_params", "Lidenti/service/v1/models_workflow/v1/Kba$ScreenParams;", "email_challenge_screen_params", "Lidenti/service/v1/models_workflow/v1/EmailChallenge$ScreenParams;", "gkba_screen_params", "Lidenti/service/v1/models_workflow/v1/GKba$ScreenParams;", "request_phone_call_params", "Lidenti/service/v1/models_workflow/v1/RequestPhoneCall$ScreenParams;", "freeze_account_screen_params", "Lidenti/service/v1/models_workflow/v1/FreezeAccount$ScreenParams;", "unverified_account_contact_information_screen_params", "Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformation$ScreenParams;", "support_intake_case_confirmation_screen_params", "Lidenti/service/v1/models_workflow/v1/SupportIntakeCaseConfirmation$ScreenParams;", "checklist_screen_params", "Lidenti/service/v1/models_workflow/v1/Checklist$ScreenParams;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lidenti/service/v1/models_workflow/v1/WorkflowScreen$Name;Ljava/lang/String;Ljava/lang/String;Lidenti/service/v1/models_workflow/v1/WorkflowScreen$LayoutFormat;Lidenti/service/v1/models_workflow/v1/UpdateApp$ScreenParams;Lidenti/service/v1/models_workflow/v1/Info$ScreenParams;Lidenti/service/v1/models_workflow/v1/ContactSupport$ScreenParams;Lidenti/service/v1/models_workflow/v1/SmsChallenge$ScreenParams;Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallenge$ScreenParams;Lidenti/service/v1/models_workflow/v1/KycStatusCheck$ScreenParams;Lidenti/service/v1/models_workflow/v1/PlaidBankList$ScreenParams;Lidenti/service/v1/models_workflow/v1/PlaidAuth$ScreenParams;Lidenti/service/v1/models_workflow/v1/Kba$ScreenParams;Lidenti/service/v1/models_workflow/v1/EmailChallenge$ScreenParams;Lidenti/service/v1/models_workflow/v1/GKba$ScreenParams;Lidenti/service/v1/models_workflow/v1/RequestPhoneCall$ScreenParams;Lidenti/service/v1/models_workflow/v1/FreezeAccount$ScreenParams;Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformation$ScreenParams;Lidenti/service/v1/models_workflow/v1/SupportIntakeCaseConfirmation$ScreenParams;Lidenti/service/v1/models_workflow/v1/Checklist$ScreenParams;Lokio/ByteString;)V", "getName", "()Lidenti/service/v1/models_workflow/v1/WorkflowScreen$Name;", "getBlock_id", "()Ljava/lang/String;", "getLogging_identifier", "getLayout_format", "()Lidenti/service/v1/models_workflow/v1/WorkflowScreen$LayoutFormat;", "getUpdate_app_screen_params", "()Lidenti/service/v1/models_workflow/v1/UpdateApp$ScreenParams;", "getInfo_screen_params", "()Lidenti/service/v1/models_workflow/v1/Info$ScreenParams;", "getContact_support_screen_params", "()Lidenti/service/v1/models_workflow/v1/ContactSupport$ScreenParams;", "getSms_challenge_screen_params", "()Lidenti/service/v1/models_workflow/v1/SmsChallenge$ScreenParams;", "getDevice_approval_challenge_screen_params", "()Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallenge$ScreenParams;", "getKyc_status_check_screen_params", "()Lidenti/service/v1/models_workflow/v1/KycStatusCheck$ScreenParams;", "getPlaid_bank_list_screen_params", "()Lidenti/service/v1/models_workflow/v1/PlaidBankList$ScreenParams;", "getPlaid_auth_screen_params", "()Lidenti/service/v1/models_workflow/v1/PlaidAuth$ScreenParams;", "getKba_screen_params", "()Lidenti/service/v1/models_workflow/v1/Kba$ScreenParams;", "getEmail_challenge_screen_params", "()Lidenti/service/v1/models_workflow/v1/EmailChallenge$ScreenParams;", "getGkba_screen_params", "()Lidenti/service/v1/models_workflow/v1/GKba$ScreenParams;", "getRequest_phone_call_params", "()Lidenti/service/v1/models_workflow/v1/RequestPhoneCall$ScreenParams;", "getFreeze_account_screen_params", "()Lidenti/service/v1/models_workflow/v1/FreezeAccount$ScreenParams;", "getUnverified_account_contact_information_screen_params", "()Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformation$ScreenParams;", "getSupport_intake_case_confirmation_screen_params", "()Lidenti/service/v1/models_workflow/v1/SupportIntakeCaseConfirmation$ScreenParams;", "getChecklist_screen_params", "()Lidenti/service/v1/models_workflow/v1/Checklist$ScreenParams;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "Name", "LayoutFormat", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class WorkflowScreen extends Message {

    @JvmField
    public static final ProtoAdapter<WorkflowScreen> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "blockId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String block_id;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.Checklist$ScreenParams#ADAPTER", jsonName = "checklistScreenParams", oneofName = "params", schemaIndex = 19, tag = 31)
    private final Checklist7 checklist_screen_params;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.ContactSupport$ScreenParams#ADAPTER", jsonName = "contactSupportScreenParams", oneofName = "params", schemaIndex = 6, tag = 18)
    private final ContactSupport$ScreenParams contact_support_screen_params;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.DeviceApprovalChallenge$ScreenParams#ADAPTER", jsonName = "deviceApprovalChallengeScreenParams", oneofName = "params", schemaIndex = 8, tag = 20)
    private final DeviceApprovalChallenge$ScreenParams device_approval_challenge_screen_params;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.EmailChallenge$ScreenParams#ADAPTER", jsonName = "emailChallengeScreenParams", oneofName = "params", schemaIndex = 13, tag = 25)
    private final EmailChallenge$ScreenParams email_challenge_screen_params;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.FreezeAccount$ScreenParams#ADAPTER", jsonName = "freezeAccountScreenParams", oneofName = "params", schemaIndex = 16, tag = 28)
    private final FreezeAccount$ScreenParams freeze_account_screen_params;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.GKba$ScreenParams#ADAPTER", jsonName = "gkbaScreenParams", oneofName = "params", schemaIndex = 14, tag = 26)
    private final GKba$ScreenParams gkba_screen_params;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.Info$ScreenParams#ADAPTER", jsonName = "infoScreenParams", oneofName = "params", schemaIndex = 5, tag = 17)
    private final Info$ScreenParams info_screen_params;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.Kba$ScreenParams#ADAPTER", jsonName = "kbaScreenParams", oneofName = "params", schemaIndex = 12, tag = 24)
    private final Kba6 kba_screen_params;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.KycStatusCheck$ScreenParams#ADAPTER", jsonName = "kycStatusCheckScreenParams", oneofName = "params", schemaIndex = 9, tag = 21)
    private final KycStatusCheck$ScreenParams kyc_status_check_screen_params;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.WorkflowScreen$LayoutFormat#ADAPTER", jsonName = "layoutFormat", schemaIndex = 3, tag = 4)
    private final LayoutFormat layout_format;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "loggingIdentifier", schemaIndex = 2, tag = 3)
    private final String logging_identifier;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.WorkflowScreen$Name#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Name name;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.PlaidAuth$ScreenParams#ADAPTER", jsonName = "plaidAuthScreenParams", oneofName = "params", schemaIndex = 11, tag = 23)
    private final PlaidAuth6 plaid_auth_screen_params;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.PlaidBankList$ScreenParams#ADAPTER", jsonName = "plaidBankListScreenParams", oneofName = "params", schemaIndex = 10, tag = 22)
    private final PlaidBankList$ScreenParams plaid_bank_list_screen_params;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.RequestPhoneCall$ScreenParams#ADAPTER", jsonName = "requestPhoneCallParams", oneofName = "params", schemaIndex = 15, tag = 27)
    private final RequestPhoneCall5 request_phone_call_params;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.SmsChallenge$ScreenParams#ADAPTER", jsonName = "smsChallengeScreenParams", oneofName = "params", schemaIndex = 7, tag = 19)
    private final SmsChallenge$ScreenParams sms_challenge_screen_params;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.SupportIntakeCaseConfirmation$ScreenParams#ADAPTER", jsonName = "supportIntakeCaseConfirmationScreenParams", oneofName = "params", schemaIndex = 18, tag = 30)
    private final SupportIntakeCaseConfirmation support_intake_case_confirmation_screen_params;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.UnverifiedAccountContactInformation$ScreenParams#ADAPTER", jsonName = "unverifiedAccountContactInformationScreenParams", oneofName = "params", schemaIndex = 17, tag = 29)
    private final UnverifiedAccountContactInformation5 unverified_account_contact_information_screen_params;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.UpdateApp$ScreenParams#ADAPTER", jsonName = "updateAppScreenParams", oneofName = "params", schemaIndex = 4, tag = 16)
    private final UpdateApp5 update_app_screen_params;

    public WorkflowScreen() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097151, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28426newBuilder();
    }

    public final Name getName() {
        return this.name;
    }

    public /* synthetic */ WorkflowScreen(Name name, String str, String str2, LayoutFormat layoutFormat, UpdateApp5 updateApp5, Info$ScreenParams info$ScreenParams, ContactSupport$ScreenParams contactSupport$ScreenParams, SmsChallenge$ScreenParams smsChallenge$ScreenParams, DeviceApprovalChallenge$ScreenParams deviceApprovalChallenge$ScreenParams, KycStatusCheck$ScreenParams kycStatusCheck$ScreenParams, PlaidBankList$ScreenParams plaidBankList$ScreenParams, PlaidAuth6 plaidAuth6, Kba6 kba6, EmailChallenge$ScreenParams emailChallenge$ScreenParams, GKba$ScreenParams gKba$ScreenParams, RequestPhoneCall5 requestPhoneCall5, FreezeAccount$ScreenParams freezeAccount$ScreenParams, UnverifiedAccountContactInformation5 unverifiedAccountContactInformation5, SupportIntakeCaseConfirmation supportIntakeCaseConfirmation, Checklist7 checklist7, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Name.NAME_UNSPECIFIED : name, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : layoutFormat, (i & 16) != 0 ? null : updateApp5, (i & 32) != 0 ? null : info$ScreenParams, (i & 64) != 0 ? null : contactSupport$ScreenParams, (i & 128) != 0 ? null : smsChallenge$ScreenParams, (i & 256) != 0 ? null : deviceApprovalChallenge$ScreenParams, (i & 512) != 0 ? null : kycStatusCheck$ScreenParams, (i & 1024) != 0 ? null : plaidBankList$ScreenParams, (i & 2048) != 0 ? null : plaidAuth6, (i & 4096) != 0 ? null : kba6, (i & 8192) != 0 ? null : emailChallenge$ScreenParams, (i & 16384) != 0 ? null : gKba$ScreenParams, (i & 32768) != 0 ? null : requestPhoneCall5, (i & 65536) != 0 ? null : freezeAccount$ScreenParams, (i & 131072) != 0 ? null : unverifiedAccountContactInformation5, (i & 262144) != 0 ? null : supportIntakeCaseConfirmation, (i & 524288) != 0 ? null : checklist7, (i & 1048576) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getBlock_id() {
        return this.block_id;
    }

    public final String getLogging_identifier() {
        return this.logging_identifier;
    }

    public final LayoutFormat getLayout_format() {
        return this.layout_format;
    }

    public final UpdateApp5 getUpdate_app_screen_params() {
        return this.update_app_screen_params;
    }

    public final Info$ScreenParams getInfo_screen_params() {
        return this.info_screen_params;
    }

    public final ContactSupport$ScreenParams getContact_support_screen_params() {
        return this.contact_support_screen_params;
    }

    public final SmsChallenge$ScreenParams getSms_challenge_screen_params() {
        return this.sms_challenge_screen_params;
    }

    public final DeviceApprovalChallenge$ScreenParams getDevice_approval_challenge_screen_params() {
        return this.device_approval_challenge_screen_params;
    }

    public final KycStatusCheck$ScreenParams getKyc_status_check_screen_params() {
        return this.kyc_status_check_screen_params;
    }

    public final PlaidBankList$ScreenParams getPlaid_bank_list_screen_params() {
        return this.plaid_bank_list_screen_params;
    }

    public final PlaidAuth6 getPlaid_auth_screen_params() {
        return this.plaid_auth_screen_params;
    }

    public final Kba6 getKba_screen_params() {
        return this.kba_screen_params;
    }

    public final EmailChallenge$ScreenParams getEmail_challenge_screen_params() {
        return this.email_challenge_screen_params;
    }

    public final GKba$ScreenParams getGkba_screen_params() {
        return this.gkba_screen_params;
    }

    public final RequestPhoneCall5 getRequest_phone_call_params() {
        return this.request_phone_call_params;
    }

    public final FreezeAccount$ScreenParams getFreeze_account_screen_params() {
        return this.freeze_account_screen_params;
    }

    public final UnverifiedAccountContactInformation5 getUnverified_account_contact_information_screen_params() {
        return this.unverified_account_contact_information_screen_params;
    }

    public final SupportIntakeCaseConfirmation getSupport_intake_case_confirmation_screen_params() {
        return this.support_intake_case_confirmation_screen_params;
    }

    public final Checklist7 getChecklist_screen_params() {
        return this.checklist_screen_params;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkflowScreen(Name name, String block_id, String str, LayoutFormat layoutFormat, UpdateApp5 updateApp5, Info$ScreenParams info$ScreenParams, ContactSupport$ScreenParams contactSupport$ScreenParams, SmsChallenge$ScreenParams smsChallenge$ScreenParams, DeviceApprovalChallenge$ScreenParams deviceApprovalChallenge$ScreenParams, KycStatusCheck$ScreenParams kycStatusCheck$ScreenParams, PlaidBankList$ScreenParams plaidBankList$ScreenParams, PlaidAuth6 plaidAuth6, Kba6 kba6, EmailChallenge$ScreenParams emailChallenge$ScreenParams, GKba$ScreenParams gKba$ScreenParams, RequestPhoneCall5 requestPhoneCall5, FreezeAccount$ScreenParams freezeAccount$ScreenParams, UnverifiedAccountContactInformation5 unverifiedAccountContactInformation5, SupportIntakeCaseConfirmation supportIntakeCaseConfirmation, Checklist7 checklist7, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(block_id, "block_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.name = name;
        this.block_id = block_id;
        this.logging_identifier = str;
        this.layout_format = layoutFormat;
        this.update_app_screen_params = updateApp5;
        this.info_screen_params = info$ScreenParams;
        this.contact_support_screen_params = contactSupport$ScreenParams;
        this.sms_challenge_screen_params = smsChallenge$ScreenParams;
        this.device_approval_challenge_screen_params = deviceApprovalChallenge$ScreenParams;
        this.kyc_status_check_screen_params = kycStatusCheck$ScreenParams;
        this.plaid_bank_list_screen_params = plaidBankList$ScreenParams;
        this.plaid_auth_screen_params = plaidAuth6;
        this.kba_screen_params = kba6;
        this.email_challenge_screen_params = emailChallenge$ScreenParams;
        this.gkba_screen_params = gKba$ScreenParams;
        this.request_phone_call_params = requestPhoneCall5;
        this.freeze_account_screen_params = freezeAccount$ScreenParams;
        this.unverified_account_contact_information_screen_params = unverifiedAccountContactInformation5;
        this.support_intake_case_confirmation_screen_params = supportIntakeCaseConfirmation;
        this.checklist_screen_params = checklist7;
        if (Internal.countNonNull(updateApp5, info$ScreenParams, contactSupport$ScreenParams, smsChallenge$ScreenParams, deviceApprovalChallenge$ScreenParams, kycStatusCheck$ScreenParams, plaidBankList$ScreenParams, plaidAuth6, kba6, emailChallenge$ScreenParams, gKba$ScreenParams, requestPhoneCall5, freezeAccount$ScreenParams, unverifiedAccountContactInformation5, supportIntakeCaseConfirmation, checklist7) > 1) {
            throw new IllegalArgumentException("At most one of update_app_screen_params, info_screen_params, contact_support_screen_params, sms_challenge_screen_params, device_approval_challenge_screen_params, kyc_status_check_screen_params, plaid_bank_list_screen_params, plaid_auth_screen_params, kba_screen_params, email_challenge_screen_params, gkba_screen_params, request_phone_call_params, freeze_account_screen_params, unverified_account_contact_information_screen_params, support_intake_case_confirmation_screen_params, checklist_screen_params may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28426newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof WorkflowScreen)) {
            return false;
        }
        WorkflowScreen workflowScreen = (WorkflowScreen) other;
        return Intrinsics.areEqual(unknownFields(), workflowScreen.unknownFields()) && this.name == workflowScreen.name && Intrinsics.areEqual(this.block_id, workflowScreen.block_id) && Intrinsics.areEqual(this.logging_identifier, workflowScreen.logging_identifier) && this.layout_format == workflowScreen.layout_format && Intrinsics.areEqual(this.update_app_screen_params, workflowScreen.update_app_screen_params) && Intrinsics.areEqual(this.info_screen_params, workflowScreen.info_screen_params) && Intrinsics.areEqual(this.contact_support_screen_params, workflowScreen.contact_support_screen_params) && Intrinsics.areEqual(this.sms_challenge_screen_params, workflowScreen.sms_challenge_screen_params) && Intrinsics.areEqual(this.device_approval_challenge_screen_params, workflowScreen.device_approval_challenge_screen_params) && Intrinsics.areEqual(this.kyc_status_check_screen_params, workflowScreen.kyc_status_check_screen_params) && Intrinsics.areEqual(this.plaid_bank_list_screen_params, workflowScreen.plaid_bank_list_screen_params) && Intrinsics.areEqual(this.plaid_auth_screen_params, workflowScreen.plaid_auth_screen_params) && Intrinsics.areEqual(this.kba_screen_params, workflowScreen.kba_screen_params) && Intrinsics.areEqual(this.email_challenge_screen_params, workflowScreen.email_challenge_screen_params) && Intrinsics.areEqual(this.gkba_screen_params, workflowScreen.gkba_screen_params) && Intrinsics.areEqual(this.request_phone_call_params, workflowScreen.request_phone_call_params) && Intrinsics.areEqual(this.freeze_account_screen_params, workflowScreen.freeze_account_screen_params) && Intrinsics.areEqual(this.unverified_account_contact_information_screen_params, workflowScreen.unverified_account_contact_information_screen_params) && Intrinsics.areEqual(this.support_intake_case_confirmation_screen_params, workflowScreen.support_intake_case_confirmation_screen_params) && Intrinsics.areEqual(this.checklist_screen_params, workflowScreen.checklist_screen_params);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.name.hashCode()) * 37) + this.block_id.hashCode()) * 37;
        String str = this.logging_identifier;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        LayoutFormat layoutFormat = this.layout_format;
        int iHashCode3 = (iHashCode2 + (layoutFormat != null ? layoutFormat.hashCode() : 0)) * 37;
        UpdateApp5 updateApp5 = this.update_app_screen_params;
        int iHashCode4 = (iHashCode3 + (updateApp5 != null ? updateApp5.hashCode() : 0)) * 37;
        Info$ScreenParams info$ScreenParams = this.info_screen_params;
        int iHashCode5 = (iHashCode4 + (info$ScreenParams != null ? info$ScreenParams.hashCode() : 0)) * 37;
        ContactSupport$ScreenParams contactSupport$ScreenParams = this.contact_support_screen_params;
        int iHashCode6 = (iHashCode5 + (contactSupport$ScreenParams != null ? contactSupport$ScreenParams.hashCode() : 0)) * 37;
        SmsChallenge$ScreenParams smsChallenge$ScreenParams = this.sms_challenge_screen_params;
        int iHashCode7 = (iHashCode6 + (smsChallenge$ScreenParams != null ? smsChallenge$ScreenParams.hashCode() : 0)) * 37;
        DeviceApprovalChallenge$ScreenParams deviceApprovalChallenge$ScreenParams = this.device_approval_challenge_screen_params;
        int iHashCode8 = (iHashCode7 + (deviceApprovalChallenge$ScreenParams != null ? deviceApprovalChallenge$ScreenParams.hashCode() : 0)) * 37;
        KycStatusCheck$ScreenParams kycStatusCheck$ScreenParams = this.kyc_status_check_screen_params;
        int iHashCode9 = (iHashCode8 + (kycStatusCheck$ScreenParams != null ? kycStatusCheck$ScreenParams.hashCode() : 0)) * 37;
        PlaidBankList$ScreenParams plaidBankList$ScreenParams = this.plaid_bank_list_screen_params;
        int iHashCode10 = (iHashCode9 + (plaidBankList$ScreenParams != null ? plaidBankList$ScreenParams.hashCode() : 0)) * 37;
        PlaidAuth6 plaidAuth6 = this.plaid_auth_screen_params;
        int iHashCode11 = (iHashCode10 + (plaidAuth6 != null ? plaidAuth6.hashCode() : 0)) * 37;
        Kba6 kba6 = this.kba_screen_params;
        int iHashCode12 = (iHashCode11 + (kba6 != null ? kba6.hashCode() : 0)) * 37;
        EmailChallenge$ScreenParams emailChallenge$ScreenParams = this.email_challenge_screen_params;
        int iHashCode13 = (iHashCode12 + (emailChallenge$ScreenParams != null ? emailChallenge$ScreenParams.hashCode() : 0)) * 37;
        GKba$ScreenParams gKba$ScreenParams = this.gkba_screen_params;
        int iHashCode14 = (iHashCode13 + (gKba$ScreenParams != null ? gKba$ScreenParams.hashCode() : 0)) * 37;
        RequestPhoneCall5 requestPhoneCall5 = this.request_phone_call_params;
        int iHashCode15 = (iHashCode14 + (requestPhoneCall5 != null ? requestPhoneCall5.hashCode() : 0)) * 37;
        FreezeAccount$ScreenParams freezeAccount$ScreenParams = this.freeze_account_screen_params;
        int iHashCode16 = (iHashCode15 + (freezeAccount$ScreenParams != null ? freezeAccount$ScreenParams.hashCode() : 0)) * 37;
        UnverifiedAccountContactInformation5 unverifiedAccountContactInformation5 = this.unverified_account_contact_information_screen_params;
        int iHashCode17 = (iHashCode16 + (unverifiedAccountContactInformation5 != null ? unverifiedAccountContactInformation5.hashCode() : 0)) * 37;
        SupportIntakeCaseConfirmation supportIntakeCaseConfirmation = this.support_intake_case_confirmation_screen_params;
        int iHashCode18 = (iHashCode17 + (supportIntakeCaseConfirmation != null ? supportIntakeCaseConfirmation.hashCode() : 0)) * 37;
        Checklist7 checklist7 = this.checklist_screen_params;
        int iHashCode19 = iHashCode18 + (checklist7 != null ? checklist7.hashCode() : 0);
        this.hashCode = iHashCode19;
        return iHashCode19;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("name=" + this.name);
        arrayList.add("block_id=" + Internal.sanitize(this.block_id));
        String str = this.logging_identifier;
        if (str != null) {
            arrayList.add("logging_identifier=" + Internal.sanitize(str));
        }
        LayoutFormat layoutFormat = this.layout_format;
        if (layoutFormat != null) {
            arrayList.add("layout_format=" + layoutFormat);
        }
        UpdateApp5 updateApp5 = this.update_app_screen_params;
        if (updateApp5 != null) {
            arrayList.add("update_app_screen_params=" + updateApp5);
        }
        Info$ScreenParams info$ScreenParams = this.info_screen_params;
        if (info$ScreenParams != null) {
            arrayList.add("info_screen_params=" + info$ScreenParams);
        }
        ContactSupport$ScreenParams contactSupport$ScreenParams = this.contact_support_screen_params;
        if (contactSupport$ScreenParams != null) {
            arrayList.add("contact_support_screen_params=" + contactSupport$ScreenParams);
        }
        SmsChallenge$ScreenParams smsChallenge$ScreenParams = this.sms_challenge_screen_params;
        if (smsChallenge$ScreenParams != null) {
            arrayList.add("sms_challenge_screen_params=" + smsChallenge$ScreenParams);
        }
        DeviceApprovalChallenge$ScreenParams deviceApprovalChallenge$ScreenParams = this.device_approval_challenge_screen_params;
        if (deviceApprovalChallenge$ScreenParams != null) {
            arrayList.add("device_approval_challenge_screen_params=" + deviceApprovalChallenge$ScreenParams);
        }
        KycStatusCheck$ScreenParams kycStatusCheck$ScreenParams = this.kyc_status_check_screen_params;
        if (kycStatusCheck$ScreenParams != null) {
            arrayList.add("kyc_status_check_screen_params=" + kycStatusCheck$ScreenParams);
        }
        PlaidBankList$ScreenParams plaidBankList$ScreenParams = this.plaid_bank_list_screen_params;
        if (plaidBankList$ScreenParams != null) {
            arrayList.add("plaid_bank_list_screen_params=" + plaidBankList$ScreenParams);
        }
        PlaidAuth6 plaidAuth6 = this.plaid_auth_screen_params;
        if (plaidAuth6 != null) {
            arrayList.add("plaid_auth_screen_params=" + plaidAuth6);
        }
        Kba6 kba6 = this.kba_screen_params;
        if (kba6 != null) {
            arrayList.add("kba_screen_params=" + kba6);
        }
        EmailChallenge$ScreenParams emailChallenge$ScreenParams = this.email_challenge_screen_params;
        if (emailChallenge$ScreenParams != null) {
            arrayList.add("email_challenge_screen_params=" + emailChallenge$ScreenParams);
        }
        GKba$ScreenParams gKba$ScreenParams = this.gkba_screen_params;
        if (gKba$ScreenParams != null) {
            arrayList.add("gkba_screen_params=" + gKba$ScreenParams);
        }
        RequestPhoneCall5 requestPhoneCall5 = this.request_phone_call_params;
        if (requestPhoneCall5 != null) {
            arrayList.add("request_phone_call_params=" + requestPhoneCall5);
        }
        FreezeAccount$ScreenParams freezeAccount$ScreenParams = this.freeze_account_screen_params;
        if (freezeAccount$ScreenParams != null) {
            arrayList.add("freeze_account_screen_params=" + freezeAccount$ScreenParams);
        }
        UnverifiedAccountContactInformation5 unverifiedAccountContactInformation5 = this.unverified_account_contact_information_screen_params;
        if (unverifiedAccountContactInformation5 != null) {
            arrayList.add("unverified_account_contact_information_screen_params=" + unverifiedAccountContactInformation5);
        }
        SupportIntakeCaseConfirmation supportIntakeCaseConfirmation = this.support_intake_case_confirmation_screen_params;
        if (supportIntakeCaseConfirmation != null) {
            arrayList.add("support_intake_case_confirmation_screen_params=" + supportIntakeCaseConfirmation);
        }
        Checklist7 checklist7 = this.checklist_screen_params;
        if (checklist7 != null) {
            arrayList.add("checklist_screen_params=" + checklist7);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "WorkflowScreen{", "}", 0, null, null, 56, null);
    }

    public final WorkflowScreen copy(Name name, String block_id, String logging_identifier, LayoutFormat layout_format, UpdateApp5 update_app_screen_params, Info$ScreenParams info_screen_params, ContactSupport$ScreenParams contact_support_screen_params, SmsChallenge$ScreenParams sms_challenge_screen_params, DeviceApprovalChallenge$ScreenParams device_approval_challenge_screen_params, KycStatusCheck$ScreenParams kyc_status_check_screen_params, PlaidBankList$ScreenParams plaid_bank_list_screen_params, PlaidAuth6 plaid_auth_screen_params, Kba6 kba_screen_params, EmailChallenge$ScreenParams email_challenge_screen_params, GKba$ScreenParams gkba_screen_params, RequestPhoneCall5 request_phone_call_params, FreezeAccount$ScreenParams freeze_account_screen_params, UnverifiedAccountContactInformation5 unverified_account_contact_information_screen_params, SupportIntakeCaseConfirmation support_intake_case_confirmation_screen_params, Checklist7 checklist_screen_params, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(block_id, "block_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new WorkflowScreen(name, block_id, logging_identifier, layout_format, update_app_screen_params, info_screen_params, contact_support_screen_params, sms_challenge_screen_params, device_approval_challenge_screen_params, kyc_status_check_screen_params, plaid_bank_list_screen_params, plaid_auth_screen_params, kba_screen_params, email_challenge_screen_params, gkba_screen_params, request_phone_call_params, freeze_account_screen_params, unverified_account_contact_information_screen_params, support_intake_case_confirmation_screen_params, checklist_screen_params, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(WorkflowScreen.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<WorkflowScreen>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.WorkflowScreen$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(WorkflowScreen value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getName() != WorkflowScreen.Name.NAME_UNSPECIFIED) {
                    size += WorkflowScreen.Name.ADAPTER.encodedSizeWithTag(1, value.getName());
                }
                if (!Intrinsics.areEqual(value.getBlock_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getBlock_id());
                }
                return size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getLogging_identifier()) + WorkflowScreen.LayoutFormat.ADAPTER.encodedSizeWithTag(4, value.getLayout_format()) + UpdateApp5.ADAPTER.encodedSizeWithTag(16, value.getUpdate_app_screen_params()) + Info$ScreenParams.ADAPTER.encodedSizeWithTag(17, value.getInfo_screen_params()) + ContactSupport$ScreenParams.ADAPTER.encodedSizeWithTag(18, value.getContact_support_screen_params()) + SmsChallenge$ScreenParams.ADAPTER.encodedSizeWithTag(19, value.getSms_challenge_screen_params()) + DeviceApprovalChallenge$ScreenParams.ADAPTER.encodedSizeWithTag(20, value.getDevice_approval_challenge_screen_params()) + KycStatusCheck$ScreenParams.ADAPTER.encodedSizeWithTag(21, value.getKyc_status_check_screen_params()) + PlaidBankList$ScreenParams.ADAPTER.encodedSizeWithTag(22, value.getPlaid_bank_list_screen_params()) + PlaidAuth6.ADAPTER.encodedSizeWithTag(23, value.getPlaid_auth_screen_params()) + Kba6.ADAPTER.encodedSizeWithTag(24, value.getKba_screen_params()) + EmailChallenge$ScreenParams.ADAPTER.encodedSizeWithTag(25, value.getEmail_challenge_screen_params()) + GKba$ScreenParams.ADAPTER.encodedSizeWithTag(26, value.getGkba_screen_params()) + RequestPhoneCall5.ADAPTER.encodedSizeWithTag(27, value.getRequest_phone_call_params()) + FreezeAccount$ScreenParams.ADAPTER.encodedSizeWithTag(28, value.getFreeze_account_screen_params()) + UnverifiedAccountContactInformation5.ADAPTER.encodedSizeWithTag(29, value.getUnverified_account_contact_information_screen_params()) + SupportIntakeCaseConfirmation.ADAPTER.encodedSizeWithTag(30, value.getSupport_intake_case_confirmation_screen_params()) + Checklist7.ADAPTER.encodedSizeWithTag(31, value.getChecklist_screen_params());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, WorkflowScreen value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getName() != WorkflowScreen.Name.NAME_UNSPECIFIED) {
                    WorkflowScreen.Name.ADAPTER.encodeWithTag(writer, 1, (int) value.getName());
                }
                if (!Intrinsics.areEqual(value.getBlock_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getBlock_id());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getLogging_identifier());
                WorkflowScreen.LayoutFormat.ADAPTER.encodeWithTag(writer, 4, (int) value.getLayout_format());
                UpdateApp5.ADAPTER.encodeWithTag(writer, 16, (int) value.getUpdate_app_screen_params());
                Info$ScreenParams.ADAPTER.encodeWithTag(writer, 17, (int) value.getInfo_screen_params());
                ContactSupport$ScreenParams.ADAPTER.encodeWithTag(writer, 18, (int) value.getContact_support_screen_params());
                SmsChallenge$ScreenParams.ADAPTER.encodeWithTag(writer, 19, (int) value.getSms_challenge_screen_params());
                DeviceApprovalChallenge$ScreenParams.ADAPTER.encodeWithTag(writer, 20, (int) value.getDevice_approval_challenge_screen_params());
                KycStatusCheck$ScreenParams.ADAPTER.encodeWithTag(writer, 21, (int) value.getKyc_status_check_screen_params());
                PlaidBankList$ScreenParams.ADAPTER.encodeWithTag(writer, 22, (int) value.getPlaid_bank_list_screen_params());
                PlaidAuth6.ADAPTER.encodeWithTag(writer, 23, (int) value.getPlaid_auth_screen_params());
                Kba6.ADAPTER.encodeWithTag(writer, 24, (int) value.getKba_screen_params());
                EmailChallenge$ScreenParams.ADAPTER.encodeWithTag(writer, 25, (int) value.getEmail_challenge_screen_params());
                GKba$ScreenParams.ADAPTER.encodeWithTag(writer, 26, (int) value.getGkba_screen_params());
                RequestPhoneCall5.ADAPTER.encodeWithTag(writer, 27, (int) value.getRequest_phone_call_params());
                FreezeAccount$ScreenParams.ADAPTER.encodeWithTag(writer, 28, (int) value.getFreeze_account_screen_params());
                UnverifiedAccountContactInformation5.ADAPTER.encodeWithTag(writer, 29, (int) value.getUnverified_account_contact_information_screen_params());
                SupportIntakeCaseConfirmation.ADAPTER.encodeWithTag(writer, 30, (int) value.getSupport_intake_case_confirmation_screen_params());
                Checklist7.ADAPTER.encodeWithTag(writer, 31, (int) value.getChecklist_screen_params());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, WorkflowScreen value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                Checklist7.ADAPTER.encodeWithTag(writer, 31, (int) value.getChecklist_screen_params());
                SupportIntakeCaseConfirmation.ADAPTER.encodeWithTag(writer, 30, (int) value.getSupport_intake_case_confirmation_screen_params());
                UnverifiedAccountContactInformation5.ADAPTER.encodeWithTag(writer, 29, (int) value.getUnverified_account_contact_information_screen_params());
                FreezeAccount$ScreenParams.ADAPTER.encodeWithTag(writer, 28, (int) value.getFreeze_account_screen_params());
                RequestPhoneCall5.ADAPTER.encodeWithTag(writer, 27, (int) value.getRequest_phone_call_params());
                GKba$ScreenParams.ADAPTER.encodeWithTag(writer, 26, (int) value.getGkba_screen_params());
                EmailChallenge$ScreenParams.ADAPTER.encodeWithTag(writer, 25, (int) value.getEmail_challenge_screen_params());
                Kba6.ADAPTER.encodeWithTag(writer, 24, (int) value.getKba_screen_params());
                PlaidAuth6.ADAPTER.encodeWithTag(writer, 23, (int) value.getPlaid_auth_screen_params());
                PlaidBankList$ScreenParams.ADAPTER.encodeWithTag(writer, 22, (int) value.getPlaid_bank_list_screen_params());
                KycStatusCheck$ScreenParams.ADAPTER.encodeWithTag(writer, 21, (int) value.getKyc_status_check_screen_params());
                DeviceApprovalChallenge$ScreenParams.ADAPTER.encodeWithTag(writer, 20, (int) value.getDevice_approval_challenge_screen_params());
                SmsChallenge$ScreenParams.ADAPTER.encodeWithTag(writer, 19, (int) value.getSms_challenge_screen_params());
                ContactSupport$ScreenParams.ADAPTER.encodeWithTag(writer, 18, (int) value.getContact_support_screen_params());
                Info$ScreenParams.ADAPTER.encodeWithTag(writer, 17, (int) value.getInfo_screen_params());
                UpdateApp5.ADAPTER.encodeWithTag(writer, 16, (int) value.getUpdate_app_screen_params());
                WorkflowScreen.LayoutFormat.ADAPTER.encodeWithTag(writer, 4, (int) value.getLayout_format());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getLogging_identifier());
                if (!Intrinsics.areEqual(value.getBlock_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getBlock_id());
                }
                if (value.getName() != WorkflowScreen.Name.NAME_UNSPECIFIED) {
                    WorkflowScreen.Name.ADAPTER.encodeWithTag(writer, 1, (int) value.getName());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public WorkflowScreen decode(ProtoReader reader) throws IOException {
                String str;
                String str2;
                WorkflowScreen.LayoutFormat layoutFormat;
                Intrinsics.checkNotNullParameter(reader, "reader");
                WorkflowScreen.Name name = WorkflowScreen.Name.NAME_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                WorkflowScreen.Name nameDecode = name;
                String strDecode = null;
                WorkflowScreen.LayoutFormat layoutFormatDecode = null;
                UpdateApp5 updateApp5Decode = null;
                Info$ScreenParams info$ScreenParamsDecode = null;
                ContactSupport$ScreenParams contactSupport$ScreenParamsDecode = null;
                SmsChallenge$ScreenParams smsChallenge$ScreenParamsDecode = null;
                DeviceApprovalChallenge$ScreenParams deviceApprovalChallenge$ScreenParamsDecode = null;
                KycStatusCheck$ScreenParams kycStatusCheck$ScreenParamsDecode = null;
                PlaidBankList$ScreenParams plaidBankList$ScreenParamsDecode = null;
                PlaidAuth6 plaidAuth6Decode = null;
                Kba6 kba6Decode = null;
                EmailChallenge$ScreenParams emailChallenge$ScreenParamsDecode = null;
                GKba$ScreenParams gKba$ScreenParamsDecode = null;
                RequestPhoneCall5 requestPhoneCall5Decode = null;
                FreezeAccount$ScreenParams freezeAccount$ScreenParamsDecode = null;
                UnverifiedAccountContactInformation5 unverifiedAccountContactInformation5Decode = null;
                SupportIntakeCaseConfirmation supportIntakeCaseConfirmationDecode = null;
                Checklist7 checklist7Decode = null;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new WorkflowScreen(nameDecode, strDecode2, strDecode, layoutFormatDecode, updateApp5Decode, info$ScreenParamsDecode, contactSupport$ScreenParamsDecode, smsChallenge$ScreenParamsDecode, deviceApprovalChallenge$ScreenParamsDecode, kycStatusCheck$ScreenParamsDecode, plaidBankList$ScreenParamsDecode, plaidAuth6Decode, kba6Decode, emailChallenge$ScreenParamsDecode, gKba$ScreenParamsDecode, requestPhoneCall5Decode, freezeAccount$ScreenParamsDecode, unverifiedAccountContactInformation5Decode, supportIntakeCaseConfirmationDecode, checklist7Decode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        str = strDecode2;
                        str2 = strDecode;
                        layoutFormat = layoutFormatDecode;
                        try {
                            nameDecode = WorkflowScreen.Name.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        try {
                            layoutFormatDecode = WorkflowScreen.LayoutFormat.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            str = strDecode2;
                            str2 = strDecode;
                            layoutFormat = layoutFormatDecode;
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    } else {
                        switch (iNextTag) {
                            case 16:
                                updateApp5Decode = UpdateApp5.ADAPTER.decode(reader);
                                continue;
                            case 17:
                                info$ScreenParamsDecode = Info$ScreenParams.ADAPTER.decode(reader);
                                continue;
                            case 18:
                                contactSupport$ScreenParamsDecode = ContactSupport$ScreenParams.ADAPTER.decode(reader);
                                continue;
                            case 19:
                                smsChallenge$ScreenParamsDecode = SmsChallenge$ScreenParams.ADAPTER.decode(reader);
                                continue;
                            case 20:
                                deviceApprovalChallenge$ScreenParamsDecode = DeviceApprovalChallenge$ScreenParams.ADAPTER.decode(reader);
                                continue;
                            case 21:
                                kycStatusCheck$ScreenParamsDecode = KycStatusCheck$ScreenParams.ADAPTER.decode(reader);
                                continue;
                            case 22:
                                plaidBankList$ScreenParamsDecode = PlaidBankList$ScreenParams.ADAPTER.decode(reader);
                                continue;
                            case 23:
                                plaidAuth6Decode = PlaidAuth6.ADAPTER.decode(reader);
                                continue;
                            case 24:
                                kba6Decode = Kba6.ADAPTER.decode(reader);
                                continue;
                            case 25:
                                emailChallenge$ScreenParamsDecode = EmailChallenge$ScreenParams.ADAPTER.decode(reader);
                                continue;
                            case 26:
                                gKba$ScreenParamsDecode = GKba$ScreenParams.ADAPTER.decode(reader);
                                continue;
                            case 27:
                                requestPhoneCall5Decode = RequestPhoneCall5.ADAPTER.decode(reader);
                                continue;
                            case 28:
                                freezeAccount$ScreenParamsDecode = FreezeAccount$ScreenParams.ADAPTER.decode(reader);
                                continue;
                            case 29:
                                unverifiedAccountContactInformation5Decode = UnverifiedAccountContactInformation5.ADAPTER.decode(reader);
                                continue;
                            case 30:
                                supportIntakeCaseConfirmationDecode = SupportIntakeCaseConfirmation.ADAPTER.decode(reader);
                                continue;
                            case 31:
                                checklist7Decode = Checklist7.ADAPTER.decode(reader);
                                continue;
                            default:
                                reader.readUnknownField(iNextTag);
                                str = strDecode2;
                                str2 = strDecode;
                                layoutFormat = layoutFormatDecode;
                                break;
                        }
                    }
                    strDecode2 = str;
                    strDecode = str2;
                    layoutFormatDecode = layoutFormat;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public WorkflowScreen redact(WorkflowScreen value) {
                Intrinsics.checkNotNullParameter(value, "value");
                UpdateApp5 update_app_screen_params = value.getUpdate_app_screen_params();
                UpdateApp5 updateApp5Redact = update_app_screen_params != null ? UpdateApp5.ADAPTER.redact(update_app_screen_params) : null;
                Info$ScreenParams info_screen_params = value.getInfo_screen_params();
                Info$ScreenParams info$ScreenParamsRedact = info_screen_params != null ? Info$ScreenParams.ADAPTER.redact(info_screen_params) : null;
                ContactSupport$ScreenParams contact_support_screen_params = value.getContact_support_screen_params();
                ContactSupport$ScreenParams contactSupport$ScreenParamsRedact = contact_support_screen_params != null ? ContactSupport$ScreenParams.ADAPTER.redact(contact_support_screen_params) : null;
                SmsChallenge$ScreenParams sms_challenge_screen_params = value.getSms_challenge_screen_params();
                SmsChallenge$ScreenParams smsChallenge$ScreenParamsRedact = sms_challenge_screen_params != null ? SmsChallenge$ScreenParams.ADAPTER.redact(sms_challenge_screen_params) : null;
                DeviceApprovalChallenge$ScreenParams device_approval_challenge_screen_params = value.getDevice_approval_challenge_screen_params();
                DeviceApprovalChallenge$ScreenParams deviceApprovalChallenge$ScreenParamsRedact = device_approval_challenge_screen_params != null ? DeviceApprovalChallenge$ScreenParams.ADAPTER.redact(device_approval_challenge_screen_params) : null;
                KycStatusCheck$ScreenParams kyc_status_check_screen_params = value.getKyc_status_check_screen_params();
                KycStatusCheck$ScreenParams kycStatusCheck$ScreenParamsRedact = kyc_status_check_screen_params != null ? KycStatusCheck$ScreenParams.ADAPTER.redact(kyc_status_check_screen_params) : null;
                PlaidBankList$ScreenParams plaid_bank_list_screen_params = value.getPlaid_bank_list_screen_params();
                PlaidBankList$ScreenParams plaidBankList$ScreenParamsRedact = plaid_bank_list_screen_params != null ? PlaidBankList$ScreenParams.ADAPTER.redact(plaid_bank_list_screen_params) : null;
                PlaidAuth6 plaid_auth_screen_params = value.getPlaid_auth_screen_params();
                PlaidAuth6 plaidAuth6Redact = plaid_auth_screen_params != null ? PlaidAuth6.ADAPTER.redact(plaid_auth_screen_params) : null;
                Kba6 kba_screen_params = value.getKba_screen_params();
                Kba6 kba6Redact = kba_screen_params != null ? Kba6.ADAPTER.redact(kba_screen_params) : null;
                EmailChallenge$ScreenParams email_challenge_screen_params = value.getEmail_challenge_screen_params();
                EmailChallenge$ScreenParams emailChallenge$ScreenParamsRedact = email_challenge_screen_params != null ? EmailChallenge$ScreenParams.ADAPTER.redact(email_challenge_screen_params) : null;
                GKba$ScreenParams gkba_screen_params = value.getGkba_screen_params();
                GKba$ScreenParams gKba$ScreenParamsRedact = gkba_screen_params != null ? GKba$ScreenParams.ADAPTER.redact(gkba_screen_params) : null;
                RequestPhoneCall5 request_phone_call_params = value.getRequest_phone_call_params();
                RequestPhoneCall5 requestPhoneCall5Redact = request_phone_call_params != null ? RequestPhoneCall5.ADAPTER.redact(request_phone_call_params) : null;
                FreezeAccount$ScreenParams freeze_account_screen_params = value.getFreeze_account_screen_params();
                FreezeAccount$ScreenParams freezeAccount$ScreenParamsRedact = freeze_account_screen_params != null ? FreezeAccount$ScreenParams.ADAPTER.redact(freeze_account_screen_params) : null;
                UnverifiedAccountContactInformation5 unverified_account_contact_information_screen_params = value.getUnverified_account_contact_information_screen_params();
                UnverifiedAccountContactInformation5 unverifiedAccountContactInformation5Redact = unverified_account_contact_information_screen_params != null ? UnverifiedAccountContactInformation5.ADAPTER.redact(unverified_account_contact_information_screen_params) : null;
                SupportIntakeCaseConfirmation support_intake_case_confirmation_screen_params = value.getSupport_intake_case_confirmation_screen_params();
                SupportIntakeCaseConfirmation supportIntakeCaseConfirmationRedact = support_intake_case_confirmation_screen_params != null ? SupportIntakeCaseConfirmation.ADAPTER.redact(support_intake_case_confirmation_screen_params) : null;
                Checklist7 checklist_screen_params = value.getChecklist_screen_params();
                return value.copy((15 & 1) != 0 ? value.name : null, (15 & 2) != 0 ? value.block_id : null, (15 & 4) != 0 ? value.logging_identifier : null, (15 & 8) != 0 ? value.layout_format : null, (15 & 16) != 0 ? value.update_app_screen_params : updateApp5Redact, (15 & 32) != 0 ? value.info_screen_params : info$ScreenParamsRedact, (15 & 64) != 0 ? value.contact_support_screen_params : contactSupport$ScreenParamsRedact, (15 & 128) != 0 ? value.sms_challenge_screen_params : smsChallenge$ScreenParamsRedact, (15 & 256) != 0 ? value.device_approval_challenge_screen_params : deviceApprovalChallenge$ScreenParamsRedact, (15 & 512) != 0 ? value.kyc_status_check_screen_params : kycStatusCheck$ScreenParamsRedact, (15 & 1024) != 0 ? value.plaid_bank_list_screen_params : plaidBankList$ScreenParamsRedact, (15 & 2048) != 0 ? value.plaid_auth_screen_params : plaidAuth6Redact, (15 & 4096) != 0 ? value.kba_screen_params : kba6Redact, (15 & 8192) != 0 ? value.email_challenge_screen_params : emailChallenge$ScreenParamsRedact, (15 & 16384) != 0 ? value.gkba_screen_params : gKba$ScreenParamsRedact, (15 & 32768) != 0 ? value.request_phone_call_params : requestPhoneCall5Redact, (15 & 65536) != 0 ? value.freeze_account_screen_params : freezeAccount$ScreenParamsRedact, (15 & 131072) != 0 ? value.unverified_account_contact_information_screen_params : unverifiedAccountContactInformation5Redact, (15 & 262144) != 0 ? value.support_intake_case_confirmation_screen_params : supportIntakeCaseConfirmationRedact, (15 & 524288) != 0 ? value.checklist_screen_params : checklist_screen_params != null ? Checklist7.ADAPTER.redact(checklist_screen_params) : null, (15 & 1048576) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WorkflowScreen.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\u0081\u0002\u0018\u0000 \u001a2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u001aB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001b"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowScreen$Name;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "NAME_UNSPECIFIED", "UPDATE_APP", "INFO", "CONTACT_SUPPORT", "SMS_CHALLENGE", "DEVICE_APPROVAL_CHALLENGE", "PLAID_BANK_LIST", "PLAID_AUTH", "KBA", "EMAIL_CHALLENGE", "KYC_STATUS_CHECK", "GKBA", "REQUEST_PHONE_CALL", "FREEZE_ACCOUNT", "UNVERIFIED_ACCOUNT_CONTACT_INFORMATION", "SUPPORT_INTAKE_CASE_CONFIRMATION", "CHECKLIST", "Companion", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes14.dex */
    public static final class Name implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Name[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Name> ADAPTER;
        public static final Name CHECKLIST;
        public static final Name CONTACT_SUPPORT;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Name DEVICE_APPROVAL_CHALLENGE;
        public static final Name EMAIL_CHALLENGE;
        public static final Name FREEZE_ACCOUNT;
        public static final Name GKBA;
        public static final Name INFO;
        public static final Name KBA;
        public static final Name KYC_STATUS_CHECK;
        public static final Name NAME_UNSPECIFIED;
        public static final Name PLAID_AUTH;
        public static final Name PLAID_BANK_LIST;
        public static final Name REQUEST_PHONE_CALL;
        public static final Name SMS_CHALLENGE;
        public static final Name SUPPORT_INTAKE_CASE_CONFIRMATION;
        public static final Name UNVERIFIED_ACCOUNT_CONTACT_INFORMATION;
        public static final Name UPDATE_APP;
        private final int value;

        private static final /* synthetic */ Name[] $values() {
            return new Name[]{NAME_UNSPECIFIED, UPDATE_APP, INFO, CONTACT_SUPPORT, SMS_CHALLENGE, DEVICE_APPROVAL_CHALLENGE, PLAID_BANK_LIST, PLAID_AUTH, KBA, EMAIL_CHALLENGE, KYC_STATUS_CHECK, GKBA, REQUEST_PHONE_CALL, FREEZE_ACCOUNT, UNVERIFIED_ACCOUNT_CONTACT_INFORMATION, SUPPORT_INTAKE_CASE_CONFIRMATION, CHECKLIST};
        }

        @JvmStatic
        public static final Name fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Name> getEntries() {
            return $ENTRIES;
        }

        private Name(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Name name = new Name("NAME_UNSPECIFIED", 0, 0);
            NAME_UNSPECIFIED = name;
            UPDATE_APP = new Name("UPDATE_APP", 1, 1);
            INFO = new Name("INFO", 2, 2);
            CONTACT_SUPPORT = new Name("CONTACT_SUPPORT", 3, 3);
            SMS_CHALLENGE = new Name("SMS_CHALLENGE", 4, 4);
            DEVICE_APPROVAL_CHALLENGE = new Name("DEVICE_APPROVAL_CHALLENGE", 5, 5);
            PLAID_BANK_LIST = new Name("PLAID_BANK_LIST", 6, 6);
            PLAID_AUTH = new Name("PLAID_AUTH", 7, 7);
            KBA = new Name("KBA", 8, 8);
            EMAIL_CHALLENGE = new Name("EMAIL_CHALLENGE", 9, 9);
            KYC_STATUS_CHECK = new Name("KYC_STATUS_CHECK", 10, 10);
            GKBA = new Name("GKBA", 11, 11);
            REQUEST_PHONE_CALL = new Name("REQUEST_PHONE_CALL", 12, 12);
            FREEZE_ACCOUNT = new Name("FREEZE_ACCOUNT", 13, 13);
            UNVERIFIED_ACCOUNT_CONTACT_INFORMATION = new Name("UNVERIFIED_ACCOUNT_CONTACT_INFORMATION", 14, 14);
            SUPPORT_INTAKE_CASE_CONFIRMATION = new Name("SUPPORT_INTAKE_CASE_CONFIRMATION", 15, 15);
            CHECKLIST = new Name("CHECKLIST", 16, 16);
            Name[] nameArr$values = $values();
            $VALUES = nameArr$values;
            $ENTRIES = EnumEntries2.enumEntries(nameArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Name.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Name>(orCreateKotlinClass, syntax, name) { // from class: identi.service.v1.models_workflow.v1.WorkflowScreen$Name$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public WorkflowScreen.Name fromValue(int value) {
                    return WorkflowScreen.Name.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: WorkflowScreen.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowScreen$Name$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lidenti/service/v1/models_workflow/v1/WorkflowScreen$Name;", "fromValue", "value", "", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Name fromValue(int value) {
                switch (value) {
                    case 0:
                        return Name.NAME_UNSPECIFIED;
                    case 1:
                        return Name.UPDATE_APP;
                    case 2:
                        return Name.INFO;
                    case 3:
                        return Name.CONTACT_SUPPORT;
                    case 4:
                        return Name.SMS_CHALLENGE;
                    case 5:
                        return Name.DEVICE_APPROVAL_CHALLENGE;
                    case 6:
                        return Name.PLAID_BANK_LIST;
                    case 7:
                        return Name.PLAID_AUTH;
                    case 8:
                        return Name.KBA;
                    case 9:
                        return Name.EMAIL_CHALLENGE;
                    case 10:
                        return Name.KYC_STATUS_CHECK;
                    case 11:
                        return Name.GKBA;
                    case 12:
                        return Name.REQUEST_PHONE_CALL;
                    case 13:
                        return Name.FREEZE_ACCOUNT;
                    case 14:
                        return Name.UNVERIFIED_ACCOUNT_CONTACT_INFORMATION;
                    case 15:
                        return Name.SUPPORT_INTAKE_CASE_CONFIRMATION;
                    case 16:
                        return Name.CHECKLIST;
                    default:
                        return null;
                }
            }
        }

        public static Name valueOf(String str) {
            return (Name) Enum.valueOf(Name.class, str);
        }

        public static Name[] values() {
            return (Name[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WorkflowScreen.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowScreen$LayoutFormat;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "LAYOUT_FORMAT_UNSPECIFIED", "MODAL", "TAKEOVER", "Companion", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes14.dex */
    public static final class LayoutFormat implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ LayoutFormat[] $VALUES;

        @JvmField
        public static final ProtoAdapter<LayoutFormat> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final LayoutFormat LAYOUT_FORMAT_UNSPECIFIED;
        public static final LayoutFormat MODAL;
        public static final LayoutFormat TAKEOVER;
        private final int value;

        private static final /* synthetic */ LayoutFormat[] $values() {
            return new LayoutFormat[]{LAYOUT_FORMAT_UNSPECIFIED, MODAL, TAKEOVER};
        }

        @JvmStatic
        public static final LayoutFormat fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<LayoutFormat> getEntries() {
            return $ENTRIES;
        }

        private LayoutFormat(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final LayoutFormat layoutFormat = new LayoutFormat("LAYOUT_FORMAT_UNSPECIFIED", 0, 0);
            LAYOUT_FORMAT_UNSPECIFIED = layoutFormat;
            MODAL = new LayoutFormat("MODAL", 1, 1);
            TAKEOVER = new LayoutFormat("TAKEOVER", 2, 2);
            LayoutFormat[] layoutFormatArr$values = $values();
            $VALUES = layoutFormatArr$values;
            $ENTRIES = EnumEntries2.enumEntries(layoutFormatArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(LayoutFormat.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<LayoutFormat>(orCreateKotlinClass, syntax, layoutFormat) { // from class: identi.service.v1.models_workflow.v1.WorkflowScreen$LayoutFormat$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public WorkflowScreen.LayoutFormat fromValue(int value) {
                    return WorkflowScreen.LayoutFormat.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: WorkflowScreen.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowScreen$LayoutFormat$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lidenti/service/v1/models_workflow/v1/WorkflowScreen$LayoutFormat;", "fromValue", "value", "", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final LayoutFormat fromValue(int value) {
                if (value == 0) {
                    return LayoutFormat.LAYOUT_FORMAT_UNSPECIFIED;
                }
                if (value == 1) {
                    return LayoutFormat.MODAL;
                }
                if (value != 2) {
                    return null;
                }
                return LayoutFormat.TAKEOVER;
            }
        }

        public static LayoutFormat valueOf(String str) {
            return (LayoutFormat) Enum.valueOf(LayoutFormat.class, str);
        }

        public static LayoutFormat[] values() {
            return (LayoutFormat[]) $VALUES.clone();
        }
    }
}
