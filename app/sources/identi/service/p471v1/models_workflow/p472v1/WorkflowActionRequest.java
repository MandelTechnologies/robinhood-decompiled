package identi.service.p471v1.models_workflow.p472v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import identi.service.p471v1.models_workflow.p472v1.WorkflowScreen;
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

/* compiled from: WorkflowActionRequest.kt */
@Metadata(m3635d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \\2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\\Bý\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(\u0012\b\b\u0002\u0010)\u001a\u00020*¢\u0006\u0004\b+\u0010,J\b\u0010S\u001a\u00020\u0002H\u0017J\u0013\u0010T\u001a\u00020U2\b\u0010V\u001a\u0004\u0018\u00010WH\u0096\u0002J\b\u0010X\u001a\u00020YH\u0016J\b\u0010Z\u001a\u00020\u0004H\u0016Jü\u0001\u0010[\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(2\b\b\u0002\u0010)\u001a\u00020*R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010.R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010.R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0018\u0010\u001f\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0018\u0010!\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0018\u0010#\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0018\u0010%\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0018\u0010'\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010R¨\u0006]"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowActionRequest;", "Lcom/squareup/wire/Message;", "", "client_version", "", "screen_name", "Lidenti/service/v1/models_workflow/v1/WorkflowScreen$Name;", "block_id", "id", "entry_point_action", "Lidenti/service/v1/models_workflow/v1/EntryPoint$Action;", "update_app_action", "Lidenti/service/v1/models_workflow/v1/UpdateApp$Action;", "info_action", "Lidenti/service/v1/models_workflow/v1/Info$Action;", "contact_support_action", "Lidenti/service/v1/models_workflow/v1/ContactSupport$Action;", "sms_challenge_action", "Lidenti/service/v1/models_workflow/v1/SmsChallenge$Action;", "device_approval_challenge_action", "Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallenge$Action;", "kyc_status_check_action", "Lidenti/service/v1/models_workflow/v1/KycStatusCheck$Action;", "plaid_bank_list_action", "Lidenti/service/v1/models_workflow/v1/PlaidBankList$Action;", "plaid_auth_action", "Lidenti/service/v1/models_workflow/v1/PlaidAuth$Action;", "kba_action", "Lidenti/service/v1/models_workflow/v1/Kba$Action;", "email_challenge_action", "Lidenti/service/v1/models_workflow/v1/EmailChallenge$Action;", "gkba_action", "Lidenti/service/v1/models_workflow/v1/GKba$Action;", "request_phone_call_action", "Lidenti/service/v1/models_workflow/v1/RequestPhoneCall$Action;", "freeze_account_action", "Lidenti/service/v1/models_workflow/v1/FreezeAccount$Action;", "unverified_account_contact_information_action", "Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformation$Action;", "checklist_action", "Lidenti/service/v1/models_workflow/v1/Checklist$Action;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lidenti/service/v1/models_workflow/v1/WorkflowScreen$Name;Ljava/lang/String;Ljava/lang/String;Lidenti/service/v1/models_workflow/v1/EntryPoint$Action;Lidenti/service/v1/models_workflow/v1/UpdateApp$Action;Lidenti/service/v1/models_workflow/v1/Info$Action;Lidenti/service/v1/models_workflow/v1/ContactSupport$Action;Lidenti/service/v1/models_workflow/v1/SmsChallenge$Action;Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallenge$Action;Lidenti/service/v1/models_workflow/v1/KycStatusCheck$Action;Lidenti/service/v1/models_workflow/v1/PlaidBankList$Action;Lidenti/service/v1/models_workflow/v1/PlaidAuth$Action;Lidenti/service/v1/models_workflow/v1/Kba$Action;Lidenti/service/v1/models_workflow/v1/EmailChallenge$Action;Lidenti/service/v1/models_workflow/v1/GKba$Action;Lidenti/service/v1/models_workflow/v1/RequestPhoneCall$Action;Lidenti/service/v1/models_workflow/v1/FreezeAccount$Action;Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformation$Action;Lidenti/service/v1/models_workflow/v1/Checklist$Action;Lokio/ByteString;)V", "getClient_version", "()Ljava/lang/String;", "getScreen_name", "()Lidenti/service/v1/models_workflow/v1/WorkflowScreen$Name;", "getBlock_id", "getId", "getEntry_point_action", "()Lidenti/service/v1/models_workflow/v1/EntryPoint$Action;", "getUpdate_app_action", "()Lidenti/service/v1/models_workflow/v1/UpdateApp$Action;", "getInfo_action", "()Lidenti/service/v1/models_workflow/v1/Info$Action;", "getContact_support_action", "()Lidenti/service/v1/models_workflow/v1/ContactSupport$Action;", "getSms_challenge_action", "()Lidenti/service/v1/models_workflow/v1/SmsChallenge$Action;", "getDevice_approval_challenge_action", "()Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallenge$Action;", "getKyc_status_check_action", "()Lidenti/service/v1/models_workflow/v1/KycStatusCheck$Action;", "getPlaid_bank_list_action", "()Lidenti/service/v1/models_workflow/v1/PlaidBankList$Action;", "getPlaid_auth_action", "()Lidenti/service/v1/models_workflow/v1/PlaidAuth$Action;", "getKba_action", "()Lidenti/service/v1/models_workflow/v1/Kba$Action;", "getEmail_challenge_action", "()Lidenti/service/v1/models_workflow/v1/EmailChallenge$Action;", "getGkba_action", "()Lidenti/service/v1/models_workflow/v1/GKba$Action;", "getRequest_phone_call_action", "()Lidenti/service/v1/models_workflow/v1/RequestPhoneCall$Action;", "getFreeze_account_action", "()Lidenti/service/v1/models_workflow/v1/FreezeAccount$Action;", "getUnverified_account_contact_information_action", "()Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformation$Action;", "getChecklist_action", "()Lidenti/service/v1/models_workflow/v1/Checklist$Action;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class WorkflowActionRequest extends Message {

    @JvmField
    public static final ProtoAdapter<WorkflowActionRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "blockId", schemaIndex = 2, tag = 3)
    private final String block_id;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.Checklist$Action#ADAPTER", jsonName = "checklistAction", oneofName = "action", schemaIndex = 19, tag = 31)
    private final Checklist2 checklist_action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "clientVersion", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String client_version;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.ContactSupport$Action#ADAPTER", jsonName = "contactSupportAction", oneofName = "action", schemaIndex = 7, tag = 19)
    private final ContactSupport$Action contact_support_action;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.DeviceApprovalChallenge$Action#ADAPTER", jsonName = "deviceApprovalChallengeAction", oneofName = "action", schemaIndex = 9, tag = 21)
    private final DeviceApprovalChallenge$Action device_approval_challenge_action;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.EmailChallenge$Action#ADAPTER", jsonName = "emailChallengeAction", oneofName = "action", schemaIndex = 14, tag = 26)
    private final EmailChallenge$Action email_challenge_action;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.EntryPoint$Action#ADAPTER", jsonName = "entryPointAction", oneofName = "action", schemaIndex = 4, tag = 16)
    private final EntryPoint2 entry_point_action;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.FreezeAccount$Action#ADAPTER", jsonName = "freezeAccountAction", oneofName = "action", schemaIndex = 17, tag = 29)
    private final FreezeAccount$Action freeze_account_action;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.GKba$Action#ADAPTER", jsonName = "gkbaAction", oneofName = "action", schemaIndex = 15, tag = 27)
    private final GKba$Action gkba_action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String id;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.Info$Action#ADAPTER", jsonName = "infoAction", oneofName = "action", schemaIndex = 6, tag = 18)
    private final Info$Action info_action;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.Kba$Action#ADAPTER", jsonName = "kbaAction", oneofName = "action", schemaIndex = 13, tag = 25)
    private final Kba2 kba_action;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.KycStatusCheck$Action#ADAPTER", jsonName = "kycStatusCheckAction", oneofName = "action", schemaIndex = 10, tag = 22)
    private final KycStatusCheck$Action kyc_status_check_action;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.PlaidAuth$Action#ADAPTER", jsonName = "plaidAuthAction", oneofName = "action", schemaIndex = 12, tag = 24)
    private final PlaidAuth plaid_auth_action;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.PlaidBankList$Action#ADAPTER", jsonName = "plaidBankListAction", oneofName = "action", schemaIndex = 11, tag = 23)
    private final PlaidBankList$Action plaid_bank_list_action;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.RequestPhoneCall$Action#ADAPTER", jsonName = "requestPhoneCallAction", oneofName = "action", schemaIndex = 16, tag = 28)
    private final RequestPhoneCall request_phone_call_action;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.WorkflowScreen$Name#ADAPTER", jsonName = "screenName", schemaIndex = 1, tag = 2)
    private final WorkflowScreen.Name screen_name;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.SmsChallenge$Action#ADAPTER", jsonName = "smsChallengeAction", oneofName = "action", schemaIndex = 8, tag = 20)
    private final SmsChallenge$Action sms_challenge_action;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.UnverifiedAccountContactInformation$Action#ADAPTER", jsonName = "unverifiedAccountContactInformationAction", oneofName = "action", schemaIndex = 18, tag = 30)
    private final UnverifiedAccountContactInformation unverified_account_contact_information_action;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.UpdateApp$Action#ADAPTER", jsonName = "updateAppAction", oneofName = "action", schemaIndex = 5, tag = 17)
    private final UpdateApp update_app_action;

    public WorkflowActionRequest() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097151, null);
    }

    public /* synthetic */ WorkflowActionRequest(String str, WorkflowScreen.Name name, String str2, String str3, EntryPoint2 entryPoint2, UpdateApp updateApp, Info$Action info$Action, ContactSupport$Action contactSupport$Action, SmsChallenge$Action smsChallenge$Action, DeviceApprovalChallenge$Action deviceApprovalChallenge$Action, KycStatusCheck$Action kycStatusCheck$Action, PlaidBankList$Action plaidBankList$Action, PlaidAuth plaidAuth, Kba2 kba2, EmailChallenge$Action emailChallenge$Action, GKba$Action gKba$Action, RequestPhoneCall requestPhoneCall, FreezeAccount$Action freezeAccount$Action, UnverifiedAccountContactInformation unverifiedAccountContactInformation, Checklist2 checklist2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : name, (i & 4) != 0 ? null : str2, (i & 8) == 0 ? str3 : "", (i & 16) != 0 ? null : entryPoint2, (i & 32) != 0 ? null : updateApp, (i & 64) != 0 ? null : info$Action, (i & 128) != 0 ? null : contactSupport$Action, (i & 256) != 0 ? null : smsChallenge$Action, (i & 512) != 0 ? null : deviceApprovalChallenge$Action, (i & 1024) != 0 ? null : kycStatusCheck$Action, (i & 2048) != 0 ? null : plaidBankList$Action, (i & 4096) != 0 ? null : plaidAuth, (i & 8192) != 0 ? null : kba2, (i & 16384) != 0 ? null : emailChallenge$Action, (i & 32768) != 0 ? null : gKba$Action, (i & 65536) != 0 ? null : requestPhoneCall, (i & 131072) != 0 ? null : freezeAccount$Action, (i & 262144) != 0 ? null : unverifiedAccountContactInformation, (i & 524288) != 0 ? null : checklist2, (i & 1048576) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28419newBuilder();
    }

    public final String getClient_version() {
        return this.client_version;
    }

    public final WorkflowScreen.Name getScreen_name() {
        return this.screen_name;
    }

    public final String getBlock_id() {
        return this.block_id;
    }

    public final String getId() {
        return this.id;
    }

    public final EntryPoint2 getEntry_point_action() {
        return this.entry_point_action;
    }

    public final UpdateApp getUpdate_app_action() {
        return this.update_app_action;
    }

    public final Info$Action getInfo_action() {
        return this.info_action;
    }

    public final ContactSupport$Action getContact_support_action() {
        return this.contact_support_action;
    }

    public final SmsChallenge$Action getSms_challenge_action() {
        return this.sms_challenge_action;
    }

    public final DeviceApprovalChallenge$Action getDevice_approval_challenge_action() {
        return this.device_approval_challenge_action;
    }

    public final KycStatusCheck$Action getKyc_status_check_action() {
        return this.kyc_status_check_action;
    }

    public final PlaidBankList$Action getPlaid_bank_list_action() {
        return this.plaid_bank_list_action;
    }

    public final PlaidAuth getPlaid_auth_action() {
        return this.plaid_auth_action;
    }

    public final Kba2 getKba_action() {
        return this.kba_action;
    }

    public final EmailChallenge$Action getEmail_challenge_action() {
        return this.email_challenge_action;
    }

    public final GKba$Action getGkba_action() {
        return this.gkba_action;
    }

    public final RequestPhoneCall getRequest_phone_call_action() {
        return this.request_phone_call_action;
    }

    public final FreezeAccount$Action getFreeze_account_action() {
        return this.freeze_account_action;
    }

    public final UnverifiedAccountContactInformation getUnverified_account_contact_information_action() {
        return this.unverified_account_contact_information_action;
    }

    public final Checklist2 getChecklist_action() {
        return this.checklist_action;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkflowActionRequest(String client_version, WorkflowScreen.Name name, String str, String id, EntryPoint2 entryPoint2, UpdateApp updateApp, Info$Action info$Action, ContactSupport$Action contactSupport$Action, SmsChallenge$Action smsChallenge$Action, DeviceApprovalChallenge$Action deviceApprovalChallenge$Action, KycStatusCheck$Action kycStatusCheck$Action, PlaidBankList$Action plaidBankList$Action, PlaidAuth plaidAuth, Kba2 kba2, EmailChallenge$Action emailChallenge$Action, GKba$Action gKba$Action, RequestPhoneCall requestPhoneCall, FreezeAccount$Action freezeAccount$Action, UnverifiedAccountContactInformation unverifiedAccountContactInformation, Checklist2 checklist2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(client_version, "client_version");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.client_version = client_version;
        this.screen_name = name;
        this.block_id = str;
        this.id = id;
        this.entry_point_action = entryPoint2;
        this.update_app_action = updateApp;
        this.info_action = info$Action;
        this.contact_support_action = contactSupport$Action;
        this.sms_challenge_action = smsChallenge$Action;
        this.device_approval_challenge_action = deviceApprovalChallenge$Action;
        this.kyc_status_check_action = kycStatusCheck$Action;
        this.plaid_bank_list_action = plaidBankList$Action;
        this.plaid_auth_action = plaidAuth;
        this.kba_action = kba2;
        this.email_challenge_action = emailChallenge$Action;
        this.gkba_action = gKba$Action;
        this.request_phone_call_action = requestPhoneCall;
        this.freeze_account_action = freezeAccount$Action;
        this.unverified_account_contact_information_action = unverifiedAccountContactInformation;
        this.checklist_action = checklist2;
        if (Internal.countNonNull(entryPoint2, updateApp, info$Action, contactSupport$Action, smsChallenge$Action, deviceApprovalChallenge$Action, kycStatusCheck$Action, plaidBankList$Action, plaidAuth, kba2, emailChallenge$Action, gKba$Action, requestPhoneCall, freezeAccount$Action, unverifiedAccountContactInformation, checklist2) > 1) {
            throw new IllegalArgumentException("At most one of entry_point_action, update_app_action, info_action, contact_support_action, sms_challenge_action, device_approval_challenge_action, kyc_status_check_action, plaid_bank_list_action, plaid_auth_action, kba_action, email_challenge_action, gkba_action, request_phone_call_action, freeze_account_action, unverified_account_contact_information_action, checklist_action may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28419newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof WorkflowActionRequest)) {
            return false;
        }
        WorkflowActionRequest workflowActionRequest = (WorkflowActionRequest) other;
        return Intrinsics.areEqual(unknownFields(), workflowActionRequest.unknownFields()) && Intrinsics.areEqual(this.client_version, workflowActionRequest.client_version) && this.screen_name == workflowActionRequest.screen_name && Intrinsics.areEqual(this.block_id, workflowActionRequest.block_id) && Intrinsics.areEqual(this.id, workflowActionRequest.id) && Intrinsics.areEqual(this.entry_point_action, workflowActionRequest.entry_point_action) && Intrinsics.areEqual(this.update_app_action, workflowActionRequest.update_app_action) && Intrinsics.areEqual(this.info_action, workflowActionRequest.info_action) && Intrinsics.areEqual(this.contact_support_action, workflowActionRequest.contact_support_action) && Intrinsics.areEqual(this.sms_challenge_action, workflowActionRequest.sms_challenge_action) && Intrinsics.areEqual(this.device_approval_challenge_action, workflowActionRequest.device_approval_challenge_action) && Intrinsics.areEqual(this.kyc_status_check_action, workflowActionRequest.kyc_status_check_action) && Intrinsics.areEqual(this.plaid_bank_list_action, workflowActionRequest.plaid_bank_list_action) && Intrinsics.areEqual(this.plaid_auth_action, workflowActionRequest.plaid_auth_action) && Intrinsics.areEqual(this.kba_action, workflowActionRequest.kba_action) && Intrinsics.areEqual(this.email_challenge_action, workflowActionRequest.email_challenge_action) && Intrinsics.areEqual(this.gkba_action, workflowActionRequest.gkba_action) && Intrinsics.areEqual(this.request_phone_call_action, workflowActionRequest.request_phone_call_action) && Intrinsics.areEqual(this.freeze_account_action, workflowActionRequest.freeze_account_action) && Intrinsics.areEqual(this.unverified_account_contact_information_action, workflowActionRequest.unverified_account_contact_information_action) && Intrinsics.areEqual(this.checklist_action, workflowActionRequest.checklist_action);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.client_version.hashCode()) * 37;
        WorkflowScreen.Name name = this.screen_name;
        int iHashCode2 = (iHashCode + (name != null ? name.hashCode() : 0)) * 37;
        String str = this.block_id;
        int iHashCode3 = (((iHashCode2 + (str != null ? str.hashCode() : 0)) * 37) + this.id.hashCode()) * 37;
        EntryPoint2 entryPoint2 = this.entry_point_action;
        int iHashCode4 = (iHashCode3 + (entryPoint2 != null ? entryPoint2.hashCode() : 0)) * 37;
        UpdateApp updateApp = this.update_app_action;
        int iHashCode5 = (iHashCode4 + (updateApp != null ? updateApp.hashCode() : 0)) * 37;
        Info$Action info$Action = this.info_action;
        int iHashCode6 = (iHashCode5 + (info$Action != null ? info$Action.hashCode() : 0)) * 37;
        ContactSupport$Action contactSupport$Action = this.contact_support_action;
        int iHashCode7 = (iHashCode6 + (contactSupport$Action != null ? contactSupport$Action.hashCode() : 0)) * 37;
        SmsChallenge$Action smsChallenge$Action = this.sms_challenge_action;
        int iHashCode8 = (iHashCode7 + (smsChallenge$Action != null ? smsChallenge$Action.hashCode() : 0)) * 37;
        DeviceApprovalChallenge$Action deviceApprovalChallenge$Action = this.device_approval_challenge_action;
        int iHashCode9 = (iHashCode8 + (deviceApprovalChallenge$Action != null ? deviceApprovalChallenge$Action.hashCode() : 0)) * 37;
        KycStatusCheck$Action kycStatusCheck$Action = this.kyc_status_check_action;
        int iHashCode10 = (iHashCode9 + (kycStatusCheck$Action != null ? kycStatusCheck$Action.hashCode() : 0)) * 37;
        PlaidBankList$Action plaidBankList$Action = this.plaid_bank_list_action;
        int iHashCode11 = (iHashCode10 + (plaidBankList$Action != null ? plaidBankList$Action.hashCode() : 0)) * 37;
        PlaidAuth plaidAuth = this.plaid_auth_action;
        int iHashCode12 = (iHashCode11 + (plaidAuth != null ? plaidAuth.hashCode() : 0)) * 37;
        Kba2 kba2 = this.kba_action;
        int iHashCode13 = (iHashCode12 + (kba2 != null ? kba2.hashCode() : 0)) * 37;
        EmailChallenge$Action emailChallenge$Action = this.email_challenge_action;
        int iHashCode14 = (iHashCode13 + (emailChallenge$Action != null ? emailChallenge$Action.hashCode() : 0)) * 37;
        GKba$Action gKba$Action = this.gkba_action;
        int iHashCode15 = (iHashCode14 + (gKba$Action != null ? gKba$Action.hashCode() : 0)) * 37;
        RequestPhoneCall requestPhoneCall = this.request_phone_call_action;
        int iHashCode16 = (iHashCode15 + (requestPhoneCall != null ? requestPhoneCall.hashCode() : 0)) * 37;
        FreezeAccount$Action freezeAccount$Action = this.freeze_account_action;
        int iHashCode17 = (iHashCode16 + (freezeAccount$Action != null ? freezeAccount$Action.hashCode() : 0)) * 37;
        UnverifiedAccountContactInformation unverifiedAccountContactInformation = this.unverified_account_contact_information_action;
        int iHashCode18 = (iHashCode17 + (unverifiedAccountContactInformation != null ? unverifiedAccountContactInformation.hashCode() : 0)) * 37;
        Checklist2 checklist2 = this.checklist_action;
        int iHashCode19 = iHashCode18 + (checklist2 != null ? checklist2.hashCode() : 0);
        this.hashCode = iHashCode19;
        return iHashCode19;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("client_version=" + Internal.sanitize(this.client_version));
        WorkflowScreen.Name name = this.screen_name;
        if (name != null) {
            arrayList.add("screen_name=" + name);
        }
        String str = this.block_id;
        if (str != null) {
            arrayList.add("block_id=" + Internal.sanitize(str));
        }
        arrayList.add("id=" + Internal.sanitize(this.id));
        EntryPoint2 entryPoint2 = this.entry_point_action;
        if (entryPoint2 != null) {
            arrayList.add("entry_point_action=" + entryPoint2);
        }
        UpdateApp updateApp = this.update_app_action;
        if (updateApp != null) {
            arrayList.add("update_app_action=" + updateApp);
        }
        Info$Action info$Action = this.info_action;
        if (info$Action != null) {
            arrayList.add("info_action=" + info$Action);
        }
        ContactSupport$Action contactSupport$Action = this.contact_support_action;
        if (contactSupport$Action != null) {
            arrayList.add("contact_support_action=" + contactSupport$Action);
        }
        SmsChallenge$Action smsChallenge$Action = this.sms_challenge_action;
        if (smsChallenge$Action != null) {
            arrayList.add("sms_challenge_action=" + smsChallenge$Action);
        }
        DeviceApprovalChallenge$Action deviceApprovalChallenge$Action = this.device_approval_challenge_action;
        if (deviceApprovalChallenge$Action != null) {
            arrayList.add("device_approval_challenge_action=" + deviceApprovalChallenge$Action);
        }
        KycStatusCheck$Action kycStatusCheck$Action = this.kyc_status_check_action;
        if (kycStatusCheck$Action != null) {
            arrayList.add("kyc_status_check_action=" + kycStatusCheck$Action);
        }
        PlaidBankList$Action plaidBankList$Action = this.plaid_bank_list_action;
        if (plaidBankList$Action != null) {
            arrayList.add("plaid_bank_list_action=" + plaidBankList$Action);
        }
        PlaidAuth plaidAuth = this.plaid_auth_action;
        if (plaidAuth != null) {
            arrayList.add("plaid_auth_action=" + plaidAuth);
        }
        Kba2 kba2 = this.kba_action;
        if (kba2 != null) {
            arrayList.add("kba_action=" + kba2);
        }
        EmailChallenge$Action emailChallenge$Action = this.email_challenge_action;
        if (emailChallenge$Action != null) {
            arrayList.add("email_challenge_action=" + emailChallenge$Action);
        }
        GKba$Action gKba$Action = this.gkba_action;
        if (gKba$Action != null) {
            arrayList.add("gkba_action=" + gKba$Action);
        }
        RequestPhoneCall requestPhoneCall = this.request_phone_call_action;
        if (requestPhoneCall != null) {
            arrayList.add("request_phone_call_action=" + requestPhoneCall);
        }
        FreezeAccount$Action freezeAccount$Action = this.freeze_account_action;
        if (freezeAccount$Action != null) {
            arrayList.add("freeze_account_action=" + freezeAccount$Action);
        }
        UnverifiedAccountContactInformation unverifiedAccountContactInformation = this.unverified_account_contact_information_action;
        if (unverifiedAccountContactInformation != null) {
            arrayList.add("unverified_account_contact_information_action=" + unverifiedAccountContactInformation);
        }
        Checklist2 checklist2 = this.checklist_action;
        if (checklist2 != null) {
            arrayList.add("checklist_action=" + checklist2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "WorkflowActionRequest{", "}", 0, null, null, 56, null);
    }

    public final WorkflowActionRequest copy(String client_version, WorkflowScreen.Name screen_name, String block_id, String id, EntryPoint2 entry_point_action, UpdateApp update_app_action, Info$Action info_action, ContactSupport$Action contact_support_action, SmsChallenge$Action sms_challenge_action, DeviceApprovalChallenge$Action device_approval_challenge_action, KycStatusCheck$Action kyc_status_check_action, PlaidBankList$Action plaid_bank_list_action, PlaidAuth plaid_auth_action, Kba2 kba_action, EmailChallenge$Action email_challenge_action, GKba$Action gkba_action, RequestPhoneCall request_phone_call_action, FreezeAccount$Action freeze_account_action, UnverifiedAccountContactInformation unverified_account_contact_information_action, Checklist2 checklist_action, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(client_version, "client_version");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new WorkflowActionRequest(client_version, screen_name, block_id, id, entry_point_action, update_app_action, info_action, contact_support_action, sms_challenge_action, device_approval_challenge_action, kyc_status_check_action, plaid_bank_list_action, plaid_auth_action, kba_action, email_challenge_action, gkba_action, request_phone_call_action, freeze_account_action, unverified_account_contact_information_action, checklist_action, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(WorkflowActionRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<WorkflowActionRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.WorkflowActionRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(WorkflowActionRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getClient_version(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getClient_version());
                }
                int iEncodedSizeWithTag = size + WorkflowScreen.Name.ADAPTER.encodedSizeWithTag(2, value.getScreen_name());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, value.getBlock_id());
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    iEncodedSizeWithTag2 += protoAdapter.encodedSizeWithTag(4, value.getId());
                }
                return iEncodedSizeWithTag2 + EntryPoint2.ADAPTER.encodedSizeWithTag(16, value.getEntry_point_action()) + UpdateApp.ADAPTER.encodedSizeWithTag(17, value.getUpdate_app_action()) + Info$Action.ADAPTER.encodedSizeWithTag(18, value.getInfo_action()) + ContactSupport$Action.ADAPTER.encodedSizeWithTag(19, value.getContact_support_action()) + SmsChallenge$Action.ADAPTER.encodedSizeWithTag(20, value.getSms_challenge_action()) + DeviceApprovalChallenge$Action.ADAPTER.encodedSizeWithTag(21, value.getDevice_approval_challenge_action()) + KycStatusCheck$Action.ADAPTER.encodedSizeWithTag(22, value.getKyc_status_check_action()) + PlaidBankList$Action.ADAPTER.encodedSizeWithTag(23, value.getPlaid_bank_list_action()) + PlaidAuth.ADAPTER.encodedSizeWithTag(24, value.getPlaid_auth_action()) + Kba2.ADAPTER.encodedSizeWithTag(25, value.getKba_action()) + EmailChallenge$Action.ADAPTER.encodedSizeWithTag(26, value.getEmail_challenge_action()) + GKba$Action.ADAPTER.encodedSizeWithTag(27, value.getGkba_action()) + RequestPhoneCall.ADAPTER.encodedSizeWithTag(28, value.getRequest_phone_call_action()) + FreezeAccount$Action.ADAPTER.encodedSizeWithTag(29, value.getFreeze_account_action()) + UnverifiedAccountContactInformation.ADAPTER.encodedSizeWithTag(30, value.getUnverified_account_contact_information_action()) + Checklist2.ADAPTER.encodedSizeWithTag(31, value.getChecklist_action());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, WorkflowActionRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getClient_version(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getClient_version());
                }
                WorkflowScreen.Name.ADAPTER.encodeWithTag(writer, 2, (int) value.getScreen_name());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getBlock_id());
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getId());
                }
                EntryPoint2.ADAPTER.encodeWithTag(writer, 16, (int) value.getEntry_point_action());
                UpdateApp.ADAPTER.encodeWithTag(writer, 17, (int) value.getUpdate_app_action());
                Info$Action.ADAPTER.encodeWithTag(writer, 18, (int) value.getInfo_action());
                ContactSupport$Action.ADAPTER.encodeWithTag(writer, 19, (int) value.getContact_support_action());
                SmsChallenge$Action.ADAPTER.encodeWithTag(writer, 20, (int) value.getSms_challenge_action());
                DeviceApprovalChallenge$Action.ADAPTER.encodeWithTag(writer, 21, (int) value.getDevice_approval_challenge_action());
                KycStatusCheck$Action.ADAPTER.encodeWithTag(writer, 22, (int) value.getKyc_status_check_action());
                PlaidBankList$Action.ADAPTER.encodeWithTag(writer, 23, (int) value.getPlaid_bank_list_action());
                PlaidAuth.ADAPTER.encodeWithTag(writer, 24, (int) value.getPlaid_auth_action());
                Kba2.ADAPTER.encodeWithTag(writer, 25, (int) value.getKba_action());
                EmailChallenge$Action.ADAPTER.encodeWithTag(writer, 26, (int) value.getEmail_challenge_action());
                GKba$Action.ADAPTER.encodeWithTag(writer, 27, (int) value.getGkba_action());
                RequestPhoneCall.ADAPTER.encodeWithTag(writer, 28, (int) value.getRequest_phone_call_action());
                FreezeAccount$Action.ADAPTER.encodeWithTag(writer, 29, (int) value.getFreeze_account_action());
                UnverifiedAccountContactInformation.ADAPTER.encodeWithTag(writer, 30, (int) value.getUnverified_account_contact_information_action());
                Checklist2.ADAPTER.encodeWithTag(writer, 31, (int) value.getChecklist_action());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, WorkflowActionRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                Checklist2.ADAPTER.encodeWithTag(writer, 31, (int) value.getChecklist_action());
                UnverifiedAccountContactInformation.ADAPTER.encodeWithTag(writer, 30, (int) value.getUnverified_account_contact_information_action());
                FreezeAccount$Action.ADAPTER.encodeWithTag(writer, 29, (int) value.getFreeze_account_action());
                RequestPhoneCall.ADAPTER.encodeWithTag(writer, 28, (int) value.getRequest_phone_call_action());
                GKba$Action.ADAPTER.encodeWithTag(writer, 27, (int) value.getGkba_action());
                EmailChallenge$Action.ADAPTER.encodeWithTag(writer, 26, (int) value.getEmail_challenge_action());
                Kba2.ADAPTER.encodeWithTag(writer, 25, (int) value.getKba_action());
                PlaidAuth.ADAPTER.encodeWithTag(writer, 24, (int) value.getPlaid_auth_action());
                PlaidBankList$Action.ADAPTER.encodeWithTag(writer, 23, (int) value.getPlaid_bank_list_action());
                KycStatusCheck$Action.ADAPTER.encodeWithTag(writer, 22, (int) value.getKyc_status_check_action());
                DeviceApprovalChallenge$Action.ADAPTER.encodeWithTag(writer, 21, (int) value.getDevice_approval_challenge_action());
                SmsChallenge$Action.ADAPTER.encodeWithTag(writer, 20, (int) value.getSms_challenge_action());
                ContactSupport$Action.ADAPTER.encodeWithTag(writer, 19, (int) value.getContact_support_action());
                Info$Action.ADAPTER.encodeWithTag(writer, 18, (int) value.getInfo_action());
                UpdateApp.ADAPTER.encodeWithTag(writer, 17, (int) value.getUpdate_app_action());
                EntryPoint2.ADAPTER.encodeWithTag(writer, 16, (int) value.getEntry_point_action());
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getId());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getBlock_id());
                WorkflowScreen.Name.ADAPTER.encodeWithTag(writer, 2, (int) value.getScreen_name());
                if (Intrinsics.areEqual(value.getClient_version(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getClient_version());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public WorkflowActionRequest decode(ProtoReader reader) throws IOException {
                String str;
                WorkflowScreen.Name name;
                String str2;
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                WorkflowScreen.Name nameDecode = null;
                String strDecode3 = null;
                EntryPoint2 entryPoint2Decode = null;
                UpdateApp updateAppDecode = null;
                Info$Action info$ActionDecode = null;
                ContactSupport$Action contactSupport$ActionDecode = null;
                SmsChallenge$Action smsChallenge$ActionDecode = null;
                DeviceApprovalChallenge$Action deviceApprovalChallenge$ActionDecode = null;
                KycStatusCheck$Action kycStatusCheck$ActionDecode = null;
                PlaidBankList$Action plaidBankList$ActionDecode = null;
                PlaidAuth plaidAuthDecode = null;
                Kba2 kba2Decode = null;
                EmailChallenge$Action emailChallenge$ActionDecode = null;
                GKba$Action gKba$ActionDecode = null;
                RequestPhoneCall requestPhoneCallDecode = null;
                FreezeAccount$Action freezeAccount$ActionDecode = null;
                UnverifiedAccountContactInformation unverifiedAccountContactInformationDecode = null;
                Checklist2 checklist2Decode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new WorkflowActionRequest(strDecode2, nameDecode, strDecode3, strDecode, entryPoint2Decode, updateAppDecode, info$ActionDecode, contactSupport$ActionDecode, smsChallenge$ActionDecode, deviceApprovalChallenge$ActionDecode, kycStatusCheck$ActionDecode, plaidBankList$ActionDecode, plaidAuthDecode, kba2Decode, emailChallenge$ActionDecode, gKba$ActionDecode, requestPhoneCallDecode, freezeAccount$ActionDecode, unverifiedAccountContactInformationDecode, checklist2Decode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        try {
                            nameDecode = WorkflowScreen.Name.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            str = strDecode;
                            name = nameDecode;
                            str2 = strDecode3;
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 3) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        switch (iNextTag) {
                            case 16:
                                entryPoint2Decode = EntryPoint2.ADAPTER.decode(reader);
                                continue;
                            case 17:
                                updateAppDecode = UpdateApp.ADAPTER.decode(reader);
                                continue;
                            case 18:
                                info$ActionDecode = Info$Action.ADAPTER.decode(reader);
                                continue;
                            case 19:
                                contactSupport$ActionDecode = ContactSupport$Action.ADAPTER.decode(reader);
                                continue;
                            case 20:
                                smsChallenge$ActionDecode = SmsChallenge$Action.ADAPTER.decode(reader);
                                continue;
                            case 21:
                                deviceApprovalChallenge$ActionDecode = DeviceApprovalChallenge$Action.ADAPTER.decode(reader);
                                continue;
                            case 22:
                                kycStatusCheck$ActionDecode = KycStatusCheck$Action.ADAPTER.decode(reader);
                                continue;
                            case 23:
                                plaidBankList$ActionDecode = PlaidBankList$Action.ADAPTER.decode(reader);
                                continue;
                            case 24:
                                plaidAuthDecode = PlaidAuth.ADAPTER.decode(reader);
                                continue;
                            case 25:
                                kba2Decode = Kba2.ADAPTER.decode(reader);
                                continue;
                            case 26:
                                emailChallenge$ActionDecode = EmailChallenge$Action.ADAPTER.decode(reader);
                                continue;
                            case 27:
                                gKba$ActionDecode = GKba$Action.ADAPTER.decode(reader);
                                continue;
                            case 28:
                                requestPhoneCallDecode = RequestPhoneCall.ADAPTER.decode(reader);
                                continue;
                            case 29:
                                freezeAccount$ActionDecode = FreezeAccount$Action.ADAPTER.decode(reader);
                                continue;
                            case 30:
                                unverifiedAccountContactInformationDecode = UnverifiedAccountContactInformation.ADAPTER.decode(reader);
                                continue;
                            case 31:
                                checklist2Decode = Checklist2.ADAPTER.decode(reader);
                                continue;
                            default:
                                reader.readUnknownField(iNextTag);
                                str = strDecode;
                                name = nameDecode;
                                str2 = strDecode3;
                                break;
                        }
                        strDecode = str;
                        strDecode3 = str2;
                        nameDecode = name;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public WorkflowActionRequest redact(WorkflowActionRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                EntryPoint2 entry_point_action = value.getEntry_point_action();
                EntryPoint2 entryPoint2Redact = entry_point_action != null ? EntryPoint2.ADAPTER.redact(entry_point_action) : null;
                UpdateApp update_app_action = value.getUpdate_app_action();
                UpdateApp updateAppRedact = update_app_action != null ? UpdateApp.ADAPTER.redact(update_app_action) : null;
                Info$Action info_action = value.getInfo_action();
                Info$Action info$ActionRedact = info_action != null ? Info$Action.ADAPTER.redact(info_action) : null;
                ContactSupport$Action contact_support_action = value.getContact_support_action();
                ContactSupport$Action contactSupport$ActionRedact = contact_support_action != null ? ContactSupport$Action.ADAPTER.redact(contact_support_action) : null;
                SmsChallenge$Action sms_challenge_action = value.getSms_challenge_action();
                SmsChallenge$Action smsChallenge$ActionRedact = sms_challenge_action != null ? SmsChallenge$Action.ADAPTER.redact(sms_challenge_action) : null;
                DeviceApprovalChallenge$Action device_approval_challenge_action = value.getDevice_approval_challenge_action();
                DeviceApprovalChallenge$Action deviceApprovalChallenge$ActionRedact = device_approval_challenge_action != null ? DeviceApprovalChallenge$Action.ADAPTER.redact(device_approval_challenge_action) : null;
                KycStatusCheck$Action kyc_status_check_action = value.getKyc_status_check_action();
                KycStatusCheck$Action kycStatusCheck$ActionRedact = kyc_status_check_action != null ? KycStatusCheck$Action.ADAPTER.redact(kyc_status_check_action) : null;
                PlaidBankList$Action plaid_bank_list_action = value.getPlaid_bank_list_action();
                PlaidBankList$Action plaidBankList$ActionRedact = plaid_bank_list_action != null ? PlaidBankList$Action.ADAPTER.redact(plaid_bank_list_action) : null;
                PlaidAuth plaid_auth_action = value.getPlaid_auth_action();
                PlaidAuth plaidAuthRedact = plaid_auth_action != null ? PlaidAuth.ADAPTER.redact(plaid_auth_action) : null;
                Kba2 kba_action = value.getKba_action();
                Kba2 kba2Redact = kba_action != null ? Kba2.ADAPTER.redact(kba_action) : null;
                EmailChallenge$Action email_challenge_action = value.getEmail_challenge_action();
                EmailChallenge$Action emailChallenge$ActionRedact = email_challenge_action != null ? EmailChallenge$Action.ADAPTER.redact(email_challenge_action) : null;
                GKba$Action gkba_action = value.getGkba_action();
                GKba$Action gKba$ActionRedact = gkba_action != null ? GKba$Action.ADAPTER.redact(gkba_action) : null;
                RequestPhoneCall request_phone_call_action = value.getRequest_phone_call_action();
                RequestPhoneCall requestPhoneCallRedact = request_phone_call_action != null ? RequestPhoneCall.ADAPTER.redact(request_phone_call_action) : null;
                FreezeAccount$Action freeze_account_action = value.getFreeze_account_action();
                FreezeAccount$Action freezeAccount$ActionRedact = freeze_account_action != null ? FreezeAccount$Action.ADAPTER.redact(freeze_account_action) : null;
                UnverifiedAccountContactInformation unverified_account_contact_information_action = value.getUnverified_account_contact_information_action();
                UnverifiedAccountContactInformation unverifiedAccountContactInformationRedact = unverified_account_contact_information_action != null ? UnverifiedAccountContactInformation.ADAPTER.redact(unverified_account_contact_information_action) : null;
                Checklist2 checklist_action = value.getChecklist_action();
                return value.copy((2097143 & 1) != 0 ? value.client_version : null, (2097143 & 2) != 0 ? value.screen_name : null, (2097143 & 4) != 0 ? value.block_id : null, (2097143 & 8) != 0 ? value.id : null, (2097143 & 16) != 0 ? value.entry_point_action : entryPoint2Redact, (2097143 & 32) != 0 ? value.update_app_action : updateAppRedact, (2097143 & 64) != 0 ? value.info_action : info$ActionRedact, (2097143 & 128) != 0 ? value.contact_support_action : contactSupport$ActionRedact, (2097143 & 256) != 0 ? value.sms_challenge_action : smsChallenge$ActionRedact, (2097143 & 512) != 0 ? value.device_approval_challenge_action : deviceApprovalChallenge$ActionRedact, (2097143 & 1024) != 0 ? value.kyc_status_check_action : kycStatusCheck$ActionRedact, (2097143 & 2048) != 0 ? value.plaid_bank_list_action : plaidBankList$ActionRedact, (2097143 & 4096) != 0 ? value.plaid_auth_action : plaidAuthRedact, (2097143 & 8192) != 0 ? value.kba_action : kba2Redact, (2097143 & 16384) != 0 ? value.email_challenge_action : emailChallenge$ActionRedact, (2097143 & 32768) != 0 ? value.gkba_action : gKba$ActionRedact, (2097143 & 65536) != 0 ? value.request_phone_call_action : requestPhoneCallRedact, (2097143 & 131072) != 0 ? value.freeze_account_action : freezeAccount$ActionRedact, (2097143 & 262144) != 0 ? value.unverified_account_contact_information_action : unverifiedAccountContactInformationRedact, (2097143 & 524288) != 0 ? value.checklist_action : checklist_action != null ? Checklist2.ADAPTER.redact(checklist_action) : null, (2097143 & 1048576) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
