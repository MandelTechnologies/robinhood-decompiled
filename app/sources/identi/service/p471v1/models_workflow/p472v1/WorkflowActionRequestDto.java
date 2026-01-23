package identi.service.p471v1.models_workflow.p472v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import identi.service.p471v1.models_workflow.p472v1.ChecklistDto4;
import identi.service.p471v1.models_workflow.p472v1.ContactSupportDto6;
import identi.service.p471v1.models_workflow.p472v1.DeviceApprovalChallengeDto6;
import identi.service.p471v1.models_workflow.p472v1.EmailChallengeDto6;
import identi.service.p471v1.models_workflow.p472v1.EntryPointDto4;
import identi.service.p471v1.models_workflow.p472v1.FreezeAccountDto5;
import identi.service.p471v1.models_workflow.p472v1.GKbaDto7;
import identi.service.p471v1.models_workflow.p472v1.InfoDto4;
import identi.service.p471v1.models_workflow.p472v1.KbaDto5;
import identi.service.p471v1.models_workflow.p472v1.KycStatusCheckDto$ActionDto;
import identi.service.p471v1.models_workflow.p472v1.PlaidAuthDto5;
import identi.service.p471v1.models_workflow.p472v1.PlaidBankListDto6;
import identi.service.p471v1.models_workflow.p472v1.RequestPhoneCallDto5;
import identi.service.p471v1.models_workflow.p472v1.SmsChallengeDto6;
import identi.service.p471v1.models_workflow.p472v1.UnverifiedAccountContactInformationDto7;
import identi.service.p471v1.models_workflow.p472v1.UpdateAppDto4;
import identi.service.p471v1.models_workflow.p472v1.WorkflowScreen;
import identi.service.p471v1.models_workflow.p472v1.WorkflowScreenDto;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: WorkflowActionRequestDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005+*,-.B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BA\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0013\u0010\f\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b(\u0010\u0014R\u0011\u0010\r\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0014¨\u0006/"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionRequest;", "Landroid/os/Parcelable;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$Surrogate;", "surrogate", "<init>", "(Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$Surrogate;)V", "", "client_version", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$NameDto;", "screen_name", "block_id", "id", "Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto;", "action", "(Ljava/lang/String;Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$NameDto;Ljava/lang/String;Ljava/lang/String;Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto;)V", "toProto", "()Lidenti/service/v1/models_workflow/v1/WorkflowActionRequest;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$Surrogate;", "getClient_version", "getScreen_name", "()Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$NameDto;", "getBlock_id", "getId", "Companion", "Surrogate", "ActionDto", "Serializer", "MultibindingModule", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class WorkflowActionRequestDto implements Dto3<WorkflowActionRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<WorkflowActionRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<WorkflowActionRequestDto, WorkflowActionRequest>> binaryBase64Serializer$delegate;
    private static final WorkflowActionRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ WorkflowActionRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private WorkflowActionRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getClient_version() {
        return this.surrogate.getClient_version();
    }

    public final WorkflowScreenDto.NameDto getScreen_name() {
        return this.surrogate.getScreen_name();
    }

    public final String getBlock_id() {
        return this.surrogate.getBlock_id();
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public /* synthetic */ WorkflowActionRequestDto(String str, WorkflowScreenDto.NameDto nameDto, String str2, String str3, ActionDto actionDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : nameDto, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : actionDto);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public WorkflowActionRequestDto(String client_version, WorkflowScreenDto.NameDto nameDto, String str, String id, ActionDto actionDto) {
        Intrinsics.checkNotNullParameter(client_version, "client_version");
        Intrinsics.checkNotNullParameter(id, "id");
        ActionDto.EntryPointAction entryPointAction = actionDto instanceof ActionDto.EntryPointAction ? (ActionDto.EntryPointAction) actionDto : null;
        EntryPointDto4 value = entryPointAction != null ? entryPointAction.getValue() : null;
        ActionDto.UpdateAppAction updateAppAction = actionDto instanceof ActionDto.UpdateAppAction ? (ActionDto.UpdateAppAction) actionDto : null;
        UpdateAppDto4 value2 = updateAppAction != null ? updateAppAction.getValue() : null;
        ActionDto.InfoAction infoAction = actionDto instanceof ActionDto.InfoAction ? (ActionDto.InfoAction) actionDto : null;
        InfoDto4 value3 = infoAction != null ? infoAction.getValue() : null;
        ActionDto.ContactSupportAction contactSupportAction = actionDto instanceof ActionDto.ContactSupportAction ? (ActionDto.ContactSupportAction) actionDto : null;
        ContactSupportDto6 value4 = contactSupportAction != null ? contactSupportAction.getValue() : null;
        ActionDto.SmsChallengeAction smsChallengeAction = actionDto instanceof ActionDto.SmsChallengeAction ? (ActionDto.SmsChallengeAction) actionDto : null;
        SmsChallengeDto6 value5 = smsChallengeAction != null ? smsChallengeAction.getValue() : null;
        ActionDto.DeviceApprovalChallengeAction deviceApprovalChallengeAction = actionDto instanceof ActionDto.DeviceApprovalChallengeAction ? (ActionDto.DeviceApprovalChallengeAction) actionDto : null;
        DeviceApprovalChallengeDto6 value6 = deviceApprovalChallengeAction != null ? deviceApprovalChallengeAction.getValue() : null;
        ActionDto.KycStatusCheckAction kycStatusCheckAction = actionDto instanceof ActionDto.KycStatusCheckAction ? (ActionDto.KycStatusCheckAction) actionDto : null;
        KycStatusCheckDto$ActionDto value7 = kycStatusCheckAction != null ? kycStatusCheckAction.getValue() : null;
        ActionDto.PlaidBankListAction plaidBankListAction = actionDto instanceof ActionDto.PlaidBankListAction ? (ActionDto.PlaidBankListAction) actionDto : null;
        PlaidBankListDto6 value8 = plaidBankListAction != null ? plaidBankListAction.getValue() : null;
        ActionDto.PlaidAuthAction plaidAuthAction = actionDto instanceof ActionDto.PlaidAuthAction ? (ActionDto.PlaidAuthAction) actionDto : null;
        PlaidAuthDto5 value9 = plaidAuthAction != null ? plaidAuthAction.getValue() : null;
        ActionDto.KbaAction kbaAction = actionDto instanceof ActionDto.KbaAction ? (ActionDto.KbaAction) actionDto : null;
        KbaDto5 value10 = kbaAction != null ? kbaAction.getValue() : null;
        ActionDto.EmailChallengeAction emailChallengeAction = actionDto instanceof ActionDto.EmailChallengeAction ? (ActionDto.EmailChallengeAction) actionDto : null;
        EmailChallengeDto6 value11 = emailChallengeAction != null ? emailChallengeAction.getValue() : null;
        ActionDto.GkbaAction gkbaAction = actionDto instanceof ActionDto.GkbaAction ? (ActionDto.GkbaAction) actionDto : null;
        GKbaDto7 value12 = gkbaAction != null ? gkbaAction.getValue() : null;
        ActionDto.RequestPhoneCallAction requestPhoneCallAction = actionDto instanceof ActionDto.RequestPhoneCallAction ? (ActionDto.RequestPhoneCallAction) actionDto : null;
        RequestPhoneCallDto5 value13 = requestPhoneCallAction != null ? requestPhoneCallAction.getValue() : null;
        ActionDto.FreezeAccountAction freezeAccountAction = actionDto instanceof ActionDto.FreezeAccountAction ? (ActionDto.FreezeAccountAction) actionDto : null;
        FreezeAccountDto5 value14 = freezeAccountAction != null ? freezeAccountAction.getValue() : null;
        ActionDto.UnverifiedAccountContactInformationAction unverifiedAccountContactInformationAction = actionDto instanceof ActionDto.UnverifiedAccountContactInformationAction ? (ActionDto.UnverifiedAccountContactInformationAction) actionDto : null;
        UnverifiedAccountContactInformationDto7 value15 = unverifiedAccountContactInformationAction != null ? unverifiedAccountContactInformationAction.getValue() : null;
        ActionDto.ChecklistAction checklistAction = actionDto instanceof ActionDto.ChecklistAction ? (ActionDto.ChecklistAction) actionDto : null;
        this(new Surrogate(client_version, nameDto, str, id, value, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, checklistAction != null ? checklistAction.getValue() : null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public WorkflowActionRequest toProto() {
        String client_version = this.surrogate.getClient_version();
        WorkflowScreenDto.NameDto screen_name = this.surrogate.getScreen_name();
        WorkflowScreen.Name name = screen_name != null ? (WorkflowScreen.Name) screen_name.toProto() : null;
        String block_id = this.surrogate.getBlock_id();
        String id = this.surrogate.getId();
        EntryPointDto4 entry_point_action = this.surrogate.getEntry_point_action();
        EntryPoint2 proto = entry_point_action != null ? entry_point_action.toProto() : null;
        UpdateAppDto4 update_app_action = this.surrogate.getUpdate_app_action();
        UpdateApp proto2 = update_app_action != null ? update_app_action.toProto() : null;
        InfoDto4 info_action = this.surrogate.getInfo_action();
        Info$Action proto3 = info_action != null ? info_action.toProto() : null;
        ContactSupportDto6 contact_support_action = this.surrogate.getContact_support_action();
        ContactSupport$Action proto4 = contact_support_action != null ? contact_support_action.toProto() : null;
        SmsChallengeDto6 sms_challenge_action = this.surrogate.getSms_challenge_action();
        SmsChallenge$Action proto5 = sms_challenge_action != null ? sms_challenge_action.toProto() : null;
        DeviceApprovalChallengeDto6 device_approval_challenge_action = this.surrogate.getDevice_approval_challenge_action();
        DeviceApprovalChallenge$Action proto6 = device_approval_challenge_action != null ? device_approval_challenge_action.toProto() : null;
        KycStatusCheckDto$ActionDto kyc_status_check_action = this.surrogate.getKyc_status_check_action();
        KycStatusCheck$Action proto7 = kyc_status_check_action != null ? kyc_status_check_action.toProto() : null;
        PlaidBankListDto6 plaid_bank_list_action = this.surrogate.getPlaid_bank_list_action();
        PlaidBankList$Action proto8 = plaid_bank_list_action != null ? plaid_bank_list_action.toProto() : null;
        PlaidAuthDto5 plaid_auth_action = this.surrogate.getPlaid_auth_action();
        PlaidAuth proto9 = plaid_auth_action != null ? plaid_auth_action.toProto() : null;
        KbaDto5 kba_action = this.surrogate.getKba_action();
        Kba2 proto10 = kba_action != null ? kba_action.toProto() : null;
        EmailChallengeDto6 email_challenge_action = this.surrogate.getEmail_challenge_action();
        EmailChallenge$Action proto11 = email_challenge_action != null ? email_challenge_action.toProto() : null;
        GKbaDto7 gkba_action = this.surrogate.getGkba_action();
        GKba$Action proto12 = gkba_action != null ? gkba_action.toProto() : null;
        RequestPhoneCallDto5 request_phone_call_action = this.surrogate.getRequest_phone_call_action();
        RequestPhoneCall proto13 = request_phone_call_action != null ? request_phone_call_action.toProto() : null;
        FreezeAccountDto5 freeze_account_action = this.surrogate.getFreeze_account_action();
        FreezeAccount$Action proto14 = freeze_account_action != null ? freeze_account_action.toProto() : null;
        UnverifiedAccountContactInformationDto7 unverified_account_contact_information_action = this.surrogate.getUnverified_account_contact_information_action();
        UnverifiedAccountContactInformation proto15 = unverified_account_contact_information_action != null ? unverified_account_contact_information_action.toProto() : null;
        ChecklistDto4 checklist_action = this.surrogate.getChecklist_action();
        return new WorkflowActionRequest(client_version, name, block_id, id, proto, proto2, proto3, proto4, proto5, proto6, proto7, proto8, proto9, proto10, proto11, proto12, proto13, proto14, proto15, checklist_action != null ? checklist_action.toProto() : null, null, 1048576, null);
    }

    public String toString() {
        return "[WorkflowActionRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof WorkflowActionRequestDto) && Intrinsics.areEqual(((WorkflowActionRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: WorkflowActionRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\bQ\b\u0083\b\u0018\u0000 \u008c\u00012\u00020\u0001:\u0004\u008d\u0001\u008c\u0001Bó\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)Bã\u0001\b\u0010\u0012\u0006\u0010+\u001a\u00020*\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b(\u0010.J'\u00107\u001a\u0002042\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0001¢\u0006\u0004\b5\u00106J\u0010\u00108\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020*HÖ\u0001¢\u0006\u0004\b:\u0010;J\u001a\u0010>\u001a\u00020=2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b>\u0010?R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010@\u0012\u0004\bB\u0010C\u001a\u0004\bA\u00109R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010D\u0012\u0004\bG\u0010C\u001a\u0004\bE\u0010FR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010@\u0012\u0004\bI\u0010C\u001a\u0004\bH\u00109R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010@\u0012\u0004\bK\u0010C\u001a\u0004\bJ\u00109R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010L\u0012\u0004\bO\u0010C\u001a\u0004\bM\u0010NR\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010P\u0012\u0004\bS\u0010C\u001a\u0004\bQ\u0010RR\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010T\u0012\u0004\bW\u0010C\u001a\u0004\bU\u0010VR\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010X\u0012\u0004\b[\u0010C\u001a\u0004\bY\u0010ZR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\\\u0012\u0004\b_\u0010C\u001a\u0004\b]\u0010^R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010`\u0012\u0004\bc\u0010C\u001a\u0004\ba\u0010bR\"\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010d\u0012\u0004\bg\u0010C\u001a\u0004\be\u0010fR\"\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010h\u0012\u0004\bk\u0010C\u001a\u0004\bi\u0010jR\"\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010l\u0012\u0004\bo\u0010C\u001a\u0004\bm\u0010nR\"\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010p\u0012\u0004\bs\u0010C\u001a\u0004\bq\u0010rR\"\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010t\u0012\u0004\bw\u0010C\u001a\u0004\bu\u0010vR\"\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010x\u0012\u0004\b{\u0010C\u001a\u0004\by\u0010zR\"\u0010!\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010|\u0012\u0004\b\u007f\u0010C\u001a\u0004\b}\u0010~R&\u0010#\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b#\u0010\u0080\u0001\u0012\u0005\b\u0083\u0001\u0010C\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R&\u0010%\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b%\u0010\u0084\u0001\u0012\u0005\b\u0087\u0001\u0010C\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R&\u0010'\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b'\u0010\u0088\u0001\u0012\u0005\b\u008b\u0001\u0010C\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001¨\u0006\u008e\u0001"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$Surrogate;", "", "", "client_version", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$NameDto;", "screen_name", "block_id", "id", "Lidenti/service/v1/models_workflow/v1/EntryPointDto$ActionDto;", "entry_point_action", "Lidenti/service/v1/models_workflow/v1/UpdateAppDto$ActionDto;", "update_app_action", "Lidenti/service/v1/models_workflow/v1/InfoDto$ActionDto;", "info_action", "Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionDto;", "contact_support_action", "Lidenti/service/v1/models_workflow/v1/SmsChallengeDto$ActionDto;", "sms_challenge_action", "Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallengeDto$ActionDto;", "device_approval_challenge_action", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto;", "kyc_status_check_action", "Lidenti/service/v1/models_workflow/v1/PlaidBankListDto$ActionDto;", "plaid_bank_list_action", "Lidenti/service/v1/models_workflow/v1/PlaidAuthDto$ActionDto;", "plaid_auth_action", "Lidenti/service/v1/models_workflow/v1/KbaDto$ActionDto;", "kba_action", "Lidenti/service/v1/models_workflow/v1/EmailChallengeDto$ActionDto;", "email_challenge_action", "Lidenti/service/v1/models_workflow/v1/GKbaDto$ActionDto;", "gkba_action", "Lidenti/service/v1/models_workflow/v1/RequestPhoneCallDto$ActionDto;", "request_phone_call_action", "Lidenti/service/v1/models_workflow/v1/FreezeAccountDto$ActionDto;", "freeze_account_action", "Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ActionDto;", "unverified_account_contact_information_action", "Lidenti/service/v1/models_workflow/v1/ChecklistDto$ActionDto;", "checklist_action", "<init>", "(Ljava/lang/String;Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$NameDto;Ljava/lang/String;Ljava/lang/String;Lidenti/service/v1/models_workflow/v1/EntryPointDto$ActionDto;Lidenti/service/v1/models_workflow/v1/UpdateAppDto$ActionDto;Lidenti/service/v1/models_workflow/v1/InfoDto$ActionDto;Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionDto;Lidenti/service/v1/models_workflow/v1/SmsChallengeDto$ActionDto;Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallengeDto$ActionDto;Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto;Lidenti/service/v1/models_workflow/v1/PlaidBankListDto$ActionDto;Lidenti/service/v1/models_workflow/v1/PlaidAuthDto$ActionDto;Lidenti/service/v1/models_workflow/v1/KbaDto$ActionDto;Lidenti/service/v1/models_workflow/v1/EmailChallengeDto$ActionDto;Lidenti/service/v1/models_workflow/v1/GKbaDto$ActionDto;Lidenti/service/v1/models_workflow/v1/RequestPhoneCallDto$ActionDto;Lidenti/service/v1/models_workflow/v1/FreezeAccountDto$ActionDto;Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ActionDto;Lidenti/service/v1/models_workflow/v1/ChecklistDto$ActionDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$NameDto;Ljava/lang/String;Ljava/lang/String;Lidenti/service/v1/models_workflow/v1/EntryPointDto$ActionDto;Lidenti/service/v1/models_workflow/v1/UpdateAppDto$ActionDto;Lidenti/service/v1/models_workflow/v1/InfoDto$ActionDto;Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionDto;Lidenti/service/v1/models_workflow/v1/SmsChallengeDto$ActionDto;Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallengeDto$ActionDto;Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto;Lidenti/service/v1/models_workflow/v1/PlaidBankListDto$ActionDto;Lidenti/service/v1/models_workflow/v1/PlaidAuthDto$ActionDto;Lidenti/service/v1/models_workflow/v1/KbaDto$ActionDto;Lidenti/service/v1/models_workflow/v1/EmailChallengeDto$ActionDto;Lidenti/service/v1/models_workflow/v1/GKbaDto$ActionDto;Lidenti/service/v1/models_workflow/v1/RequestPhoneCallDto$ActionDto;Lidenti/service/v1/models_workflow/v1/FreezeAccountDto$ActionDto;Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ActionDto;Lidenti/service/v1/models_workflow/v1/ChecklistDto$ActionDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identi_v1_models_workflow_v1_externalRelease", "(Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getClient_version", "getClient_version$annotations", "()V", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$NameDto;", "getScreen_name", "()Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$NameDto;", "getScreen_name$annotations", "getBlock_id", "getBlock_id$annotations", "getId", "getId$annotations", "Lidenti/service/v1/models_workflow/v1/EntryPointDto$ActionDto;", "getEntry_point_action", "()Lidenti/service/v1/models_workflow/v1/EntryPointDto$ActionDto;", "getEntry_point_action$annotations", "Lidenti/service/v1/models_workflow/v1/UpdateAppDto$ActionDto;", "getUpdate_app_action", "()Lidenti/service/v1/models_workflow/v1/UpdateAppDto$ActionDto;", "getUpdate_app_action$annotations", "Lidenti/service/v1/models_workflow/v1/InfoDto$ActionDto;", "getInfo_action", "()Lidenti/service/v1/models_workflow/v1/InfoDto$ActionDto;", "getInfo_action$annotations", "Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionDto;", "getContact_support_action", "()Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionDto;", "getContact_support_action$annotations", "Lidenti/service/v1/models_workflow/v1/SmsChallengeDto$ActionDto;", "getSms_challenge_action", "()Lidenti/service/v1/models_workflow/v1/SmsChallengeDto$ActionDto;", "getSms_challenge_action$annotations", "Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallengeDto$ActionDto;", "getDevice_approval_challenge_action", "()Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallengeDto$ActionDto;", "getDevice_approval_challenge_action$annotations", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto;", "getKyc_status_check_action", "()Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto;", "getKyc_status_check_action$annotations", "Lidenti/service/v1/models_workflow/v1/PlaidBankListDto$ActionDto;", "getPlaid_bank_list_action", "()Lidenti/service/v1/models_workflow/v1/PlaidBankListDto$ActionDto;", "getPlaid_bank_list_action$annotations", "Lidenti/service/v1/models_workflow/v1/PlaidAuthDto$ActionDto;", "getPlaid_auth_action", "()Lidenti/service/v1/models_workflow/v1/PlaidAuthDto$ActionDto;", "getPlaid_auth_action$annotations", "Lidenti/service/v1/models_workflow/v1/KbaDto$ActionDto;", "getKba_action", "()Lidenti/service/v1/models_workflow/v1/KbaDto$ActionDto;", "getKba_action$annotations", "Lidenti/service/v1/models_workflow/v1/EmailChallengeDto$ActionDto;", "getEmail_challenge_action", "()Lidenti/service/v1/models_workflow/v1/EmailChallengeDto$ActionDto;", "getEmail_challenge_action$annotations", "Lidenti/service/v1/models_workflow/v1/GKbaDto$ActionDto;", "getGkba_action", "()Lidenti/service/v1/models_workflow/v1/GKbaDto$ActionDto;", "getGkba_action$annotations", "Lidenti/service/v1/models_workflow/v1/RequestPhoneCallDto$ActionDto;", "getRequest_phone_call_action", "()Lidenti/service/v1/models_workflow/v1/RequestPhoneCallDto$ActionDto;", "getRequest_phone_call_action$annotations", "Lidenti/service/v1/models_workflow/v1/FreezeAccountDto$ActionDto;", "getFreeze_account_action", "()Lidenti/service/v1/models_workflow/v1/FreezeAccountDto$ActionDto;", "getFreeze_account_action$annotations", "Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ActionDto;", "getUnverified_account_contact_information_action", "()Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ActionDto;", "getUnverified_account_contact_information_action$annotations", "Lidenti/service/v1/models_workflow/v1/ChecklistDto$ActionDto;", "getChecklist_action", "()Lidenti/service/v1/models_workflow/v1/ChecklistDto$ActionDto;", "getChecklist_action$annotations", "Companion", "$serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String block_id;
        private final ChecklistDto4 checklist_action;
        private final String client_version;
        private final ContactSupportDto6 contact_support_action;
        private final DeviceApprovalChallengeDto6 device_approval_challenge_action;
        private final EmailChallengeDto6 email_challenge_action;
        private final EntryPointDto4 entry_point_action;
        private final FreezeAccountDto5 freeze_account_action;
        private final GKbaDto7 gkba_action;
        private final String id;
        private final InfoDto4 info_action;
        private final KbaDto5 kba_action;
        private final KycStatusCheckDto$ActionDto kyc_status_check_action;
        private final PlaidAuthDto5 plaid_auth_action;
        private final PlaidBankListDto6 plaid_bank_list_action;
        private final RequestPhoneCallDto5 request_phone_call_action;
        private final WorkflowScreenDto.NameDto screen_name;
        private final SmsChallengeDto6 sms_challenge_action;
        private final UnverifiedAccountContactInformationDto7 unverified_account_contact_information_action;
        private final UpdateAppDto4 update_app_action;

        public Surrogate() {
            this((String) null, (WorkflowScreenDto.NameDto) null, (String) null, (String) null, (EntryPointDto4) null, (UpdateAppDto4) null, (InfoDto4) null, (ContactSupportDto6) null, (SmsChallengeDto6) null, (DeviceApprovalChallengeDto6) null, (KycStatusCheckDto$ActionDto) null, (PlaidBankListDto6) null, (PlaidAuthDto5) null, (KbaDto5) null, (EmailChallengeDto6) null, (GKbaDto7) null, (RequestPhoneCallDto5) null, (FreezeAccountDto5) null, (UnverifiedAccountContactInformationDto7) null, (ChecklistDto4) null, 1048575, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.client_version, surrogate.client_version) && this.screen_name == surrogate.screen_name && Intrinsics.areEqual(this.block_id, surrogate.block_id) && Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.entry_point_action, surrogate.entry_point_action) && Intrinsics.areEqual(this.update_app_action, surrogate.update_app_action) && Intrinsics.areEqual(this.info_action, surrogate.info_action) && Intrinsics.areEqual(this.contact_support_action, surrogate.contact_support_action) && Intrinsics.areEqual(this.sms_challenge_action, surrogate.sms_challenge_action) && Intrinsics.areEqual(this.device_approval_challenge_action, surrogate.device_approval_challenge_action) && Intrinsics.areEqual(this.kyc_status_check_action, surrogate.kyc_status_check_action) && Intrinsics.areEqual(this.plaid_bank_list_action, surrogate.plaid_bank_list_action) && Intrinsics.areEqual(this.plaid_auth_action, surrogate.plaid_auth_action) && Intrinsics.areEqual(this.kba_action, surrogate.kba_action) && Intrinsics.areEqual(this.email_challenge_action, surrogate.email_challenge_action) && Intrinsics.areEqual(this.gkba_action, surrogate.gkba_action) && Intrinsics.areEqual(this.request_phone_call_action, surrogate.request_phone_call_action) && Intrinsics.areEqual(this.freeze_account_action, surrogate.freeze_account_action) && Intrinsics.areEqual(this.unverified_account_contact_information_action, surrogate.unverified_account_contact_information_action) && Intrinsics.areEqual(this.checklist_action, surrogate.checklist_action);
        }

        public int hashCode() {
            int iHashCode = this.client_version.hashCode() * 31;
            WorkflowScreenDto.NameDto nameDto = this.screen_name;
            int iHashCode2 = (iHashCode + (nameDto == null ? 0 : nameDto.hashCode())) * 31;
            String str = this.block_id;
            int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.id.hashCode()) * 31;
            EntryPointDto4 entryPointDto4 = this.entry_point_action;
            int iHashCode4 = (iHashCode3 + (entryPointDto4 == null ? 0 : entryPointDto4.hashCode())) * 31;
            UpdateAppDto4 updateAppDto4 = this.update_app_action;
            int iHashCode5 = (iHashCode4 + (updateAppDto4 == null ? 0 : updateAppDto4.hashCode())) * 31;
            InfoDto4 infoDto4 = this.info_action;
            int iHashCode6 = (iHashCode5 + (infoDto4 == null ? 0 : infoDto4.hashCode())) * 31;
            ContactSupportDto6 contactSupportDto6 = this.contact_support_action;
            int iHashCode7 = (iHashCode6 + (contactSupportDto6 == null ? 0 : contactSupportDto6.hashCode())) * 31;
            SmsChallengeDto6 smsChallengeDto6 = this.sms_challenge_action;
            int iHashCode8 = (iHashCode7 + (smsChallengeDto6 == null ? 0 : smsChallengeDto6.hashCode())) * 31;
            DeviceApprovalChallengeDto6 deviceApprovalChallengeDto6 = this.device_approval_challenge_action;
            int iHashCode9 = (iHashCode8 + (deviceApprovalChallengeDto6 == null ? 0 : deviceApprovalChallengeDto6.hashCode())) * 31;
            KycStatusCheckDto$ActionDto kycStatusCheckDto$ActionDto = this.kyc_status_check_action;
            int iHashCode10 = (iHashCode9 + (kycStatusCheckDto$ActionDto == null ? 0 : kycStatusCheckDto$ActionDto.hashCode())) * 31;
            PlaidBankListDto6 plaidBankListDto6 = this.plaid_bank_list_action;
            int iHashCode11 = (iHashCode10 + (plaidBankListDto6 == null ? 0 : plaidBankListDto6.hashCode())) * 31;
            PlaidAuthDto5 plaidAuthDto5 = this.plaid_auth_action;
            int iHashCode12 = (iHashCode11 + (plaidAuthDto5 == null ? 0 : plaidAuthDto5.hashCode())) * 31;
            KbaDto5 kbaDto5 = this.kba_action;
            int iHashCode13 = (iHashCode12 + (kbaDto5 == null ? 0 : kbaDto5.hashCode())) * 31;
            EmailChallengeDto6 emailChallengeDto6 = this.email_challenge_action;
            int iHashCode14 = (iHashCode13 + (emailChallengeDto6 == null ? 0 : emailChallengeDto6.hashCode())) * 31;
            GKbaDto7 gKbaDto7 = this.gkba_action;
            int iHashCode15 = (iHashCode14 + (gKbaDto7 == null ? 0 : gKbaDto7.hashCode())) * 31;
            RequestPhoneCallDto5 requestPhoneCallDto5 = this.request_phone_call_action;
            int iHashCode16 = (iHashCode15 + (requestPhoneCallDto5 == null ? 0 : requestPhoneCallDto5.hashCode())) * 31;
            FreezeAccountDto5 freezeAccountDto5 = this.freeze_account_action;
            int iHashCode17 = (iHashCode16 + (freezeAccountDto5 == null ? 0 : freezeAccountDto5.hashCode())) * 31;
            UnverifiedAccountContactInformationDto7 unverifiedAccountContactInformationDto7 = this.unverified_account_contact_information_action;
            int iHashCode18 = (iHashCode17 + (unverifiedAccountContactInformationDto7 == null ? 0 : unverifiedAccountContactInformationDto7.hashCode())) * 31;
            ChecklistDto4 checklistDto4 = this.checklist_action;
            return iHashCode18 + (checklistDto4 != null ? checklistDto4.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(client_version=" + this.client_version + ", screen_name=" + this.screen_name + ", block_id=" + this.block_id + ", id=" + this.id + ", entry_point_action=" + this.entry_point_action + ", update_app_action=" + this.update_app_action + ", info_action=" + this.info_action + ", contact_support_action=" + this.contact_support_action + ", sms_challenge_action=" + this.sms_challenge_action + ", device_approval_challenge_action=" + this.device_approval_challenge_action + ", kyc_status_check_action=" + this.kyc_status_check_action + ", plaid_bank_list_action=" + this.plaid_bank_list_action + ", plaid_auth_action=" + this.plaid_auth_action + ", kba_action=" + this.kba_action + ", email_challenge_action=" + this.email_challenge_action + ", gkba_action=" + this.gkba_action + ", request_phone_call_action=" + this.request_phone_call_action + ", freeze_account_action=" + this.freeze_account_action + ", unverified_account_contact_information_action=" + this.unverified_account_contact_information_action + ", checklist_action=" + this.checklist_action + ")";
        }

        /* compiled from: WorkflowActionRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$Surrogate;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return WorkflowActionRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, WorkflowScreenDto.NameDto nameDto, String str2, String str3, EntryPointDto4 entryPointDto4, UpdateAppDto4 updateAppDto4, InfoDto4 infoDto4, ContactSupportDto6 contactSupportDto6, SmsChallengeDto6 smsChallengeDto6, DeviceApprovalChallengeDto6 deviceApprovalChallengeDto6, KycStatusCheckDto$ActionDto kycStatusCheckDto$ActionDto, PlaidBankListDto6 plaidBankListDto6, PlaidAuthDto5 plaidAuthDto5, KbaDto5 kbaDto5, EmailChallengeDto6 emailChallengeDto6, GKbaDto7 gKbaDto7, RequestPhoneCallDto5 requestPhoneCallDto5, FreezeAccountDto5 freezeAccountDto5, UnverifiedAccountContactInformationDto7 unverifiedAccountContactInformationDto7, ChecklistDto4 checklistDto4, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.client_version = "";
            } else {
                this.client_version = str;
            }
            if ((i & 2) == 0) {
                this.screen_name = null;
            } else {
                this.screen_name = nameDto;
            }
            if ((i & 4) == 0) {
                this.block_id = null;
            } else {
                this.block_id = str2;
            }
            if ((i & 8) == 0) {
                this.id = "";
            } else {
                this.id = str3;
            }
            if ((i & 16) == 0) {
                this.entry_point_action = null;
            } else {
                this.entry_point_action = entryPointDto4;
            }
            if ((i & 32) == 0) {
                this.update_app_action = null;
            } else {
                this.update_app_action = updateAppDto4;
            }
            if ((i & 64) == 0) {
                this.info_action = null;
            } else {
                this.info_action = infoDto4;
            }
            if ((i & 128) == 0) {
                this.contact_support_action = null;
            } else {
                this.contact_support_action = contactSupportDto6;
            }
            if ((i & 256) == 0) {
                this.sms_challenge_action = null;
            } else {
                this.sms_challenge_action = smsChallengeDto6;
            }
            if ((i & 512) == 0) {
                this.device_approval_challenge_action = null;
            } else {
                this.device_approval_challenge_action = deviceApprovalChallengeDto6;
            }
            if ((i & 1024) == 0) {
                this.kyc_status_check_action = null;
            } else {
                this.kyc_status_check_action = kycStatusCheckDto$ActionDto;
            }
            if ((i & 2048) == 0) {
                this.plaid_bank_list_action = null;
            } else {
                this.plaid_bank_list_action = plaidBankListDto6;
            }
            if ((i & 4096) == 0) {
                this.plaid_auth_action = null;
            } else {
                this.plaid_auth_action = plaidAuthDto5;
            }
            if ((i & 8192) == 0) {
                this.kba_action = null;
            } else {
                this.kba_action = kbaDto5;
            }
            if ((i & 16384) == 0) {
                this.email_challenge_action = null;
            } else {
                this.email_challenge_action = emailChallengeDto6;
            }
            if ((32768 & i) == 0) {
                this.gkba_action = null;
            } else {
                this.gkba_action = gKbaDto7;
            }
            if ((65536 & i) == 0) {
                this.request_phone_call_action = null;
            } else {
                this.request_phone_call_action = requestPhoneCallDto5;
            }
            if ((131072 & i) == 0) {
                this.freeze_account_action = null;
            } else {
                this.freeze_account_action = freezeAccountDto5;
            }
            if ((262144 & i) == 0) {
                this.unverified_account_contact_information_action = null;
            } else {
                this.unverified_account_contact_information_action = unverifiedAccountContactInformationDto7;
            }
            if ((i & 524288) == 0) {
                this.checklist_action = null;
            } else {
                this.checklist_action = checklistDto4;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$identi_v1_models_workflow_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.client_version, "")) {
                output.encodeStringElement(serialDesc, 0, self.client_version);
            }
            WorkflowScreenDto.NameDto nameDto = self.screen_name;
            if (nameDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, WorkflowScreenDto.NameDto.Serializer.INSTANCE, nameDto);
            }
            String str = self.block_id;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, str);
            }
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 3, self.id);
            }
            EntryPointDto4 entryPointDto4 = self.entry_point_action;
            if (entryPointDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, EntryPointDto4.Serializer.INSTANCE, entryPointDto4);
            }
            UpdateAppDto4 updateAppDto4 = self.update_app_action;
            if (updateAppDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, UpdateAppDto4.Serializer.INSTANCE, updateAppDto4);
            }
            InfoDto4 infoDto4 = self.info_action;
            if (infoDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, InfoDto4.Serializer.INSTANCE, infoDto4);
            }
            ContactSupportDto6 contactSupportDto6 = self.contact_support_action;
            if (contactSupportDto6 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, ContactSupportDto6.Serializer.INSTANCE, contactSupportDto6);
            }
            SmsChallengeDto6 smsChallengeDto6 = self.sms_challenge_action;
            if (smsChallengeDto6 != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, SmsChallengeDto6.Serializer.INSTANCE, smsChallengeDto6);
            }
            DeviceApprovalChallengeDto6 deviceApprovalChallengeDto6 = self.device_approval_challenge_action;
            if (deviceApprovalChallengeDto6 != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, DeviceApprovalChallengeDto6.Serializer.INSTANCE, deviceApprovalChallengeDto6);
            }
            KycStatusCheckDto$ActionDto kycStatusCheckDto$ActionDto = self.kyc_status_check_action;
            if (kycStatusCheckDto$ActionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, KycStatusCheckDto$ActionDto.Serializer.INSTANCE, kycStatusCheckDto$ActionDto);
            }
            PlaidBankListDto6 plaidBankListDto6 = self.plaid_bank_list_action;
            if (plaidBankListDto6 != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, PlaidBankListDto6.Serializer.INSTANCE, plaidBankListDto6);
            }
            PlaidAuthDto5 plaidAuthDto5 = self.plaid_auth_action;
            if (plaidAuthDto5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, PlaidAuthDto5.Serializer.INSTANCE, plaidAuthDto5);
            }
            KbaDto5 kbaDto5 = self.kba_action;
            if (kbaDto5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, KbaDto5.Serializer.INSTANCE, kbaDto5);
            }
            EmailChallengeDto6 emailChallengeDto6 = self.email_challenge_action;
            if (emailChallengeDto6 != null) {
                output.encodeNullableSerializableElement(serialDesc, 14, EmailChallengeDto6.Serializer.INSTANCE, emailChallengeDto6);
            }
            GKbaDto7 gKbaDto7 = self.gkba_action;
            if (gKbaDto7 != null) {
                output.encodeNullableSerializableElement(serialDesc, 15, GKbaDto7.Serializer.INSTANCE, gKbaDto7);
            }
            RequestPhoneCallDto5 requestPhoneCallDto5 = self.request_phone_call_action;
            if (requestPhoneCallDto5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 16, RequestPhoneCallDto5.Serializer.INSTANCE, requestPhoneCallDto5);
            }
            FreezeAccountDto5 freezeAccountDto5 = self.freeze_account_action;
            if (freezeAccountDto5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 17, FreezeAccountDto5.Serializer.INSTANCE, freezeAccountDto5);
            }
            UnverifiedAccountContactInformationDto7 unverifiedAccountContactInformationDto7 = self.unverified_account_contact_information_action;
            if (unverifiedAccountContactInformationDto7 != null) {
                output.encodeNullableSerializableElement(serialDesc, 18, UnverifiedAccountContactInformationDto7.Serializer.INSTANCE, unverifiedAccountContactInformationDto7);
            }
            ChecklistDto4 checklistDto4 = self.checklist_action;
            if (checklistDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 19, ChecklistDto4.Serializer.INSTANCE, checklistDto4);
            }
        }

        public Surrogate(String client_version, WorkflowScreenDto.NameDto nameDto, String str, String id, EntryPointDto4 entryPointDto4, UpdateAppDto4 updateAppDto4, InfoDto4 infoDto4, ContactSupportDto6 contactSupportDto6, SmsChallengeDto6 smsChallengeDto6, DeviceApprovalChallengeDto6 deviceApprovalChallengeDto6, KycStatusCheckDto$ActionDto kycStatusCheckDto$ActionDto, PlaidBankListDto6 plaidBankListDto6, PlaidAuthDto5 plaidAuthDto5, KbaDto5 kbaDto5, EmailChallengeDto6 emailChallengeDto6, GKbaDto7 gKbaDto7, RequestPhoneCallDto5 requestPhoneCallDto5, FreezeAccountDto5 freezeAccountDto5, UnverifiedAccountContactInformationDto7 unverifiedAccountContactInformationDto7, ChecklistDto4 checklistDto4) {
            Intrinsics.checkNotNullParameter(client_version, "client_version");
            Intrinsics.checkNotNullParameter(id, "id");
            this.client_version = client_version;
            this.screen_name = nameDto;
            this.block_id = str;
            this.id = id;
            this.entry_point_action = entryPointDto4;
            this.update_app_action = updateAppDto4;
            this.info_action = infoDto4;
            this.contact_support_action = contactSupportDto6;
            this.sms_challenge_action = smsChallengeDto6;
            this.device_approval_challenge_action = deviceApprovalChallengeDto6;
            this.kyc_status_check_action = kycStatusCheckDto$ActionDto;
            this.plaid_bank_list_action = plaidBankListDto6;
            this.plaid_auth_action = plaidAuthDto5;
            this.kba_action = kbaDto5;
            this.email_challenge_action = emailChallengeDto6;
            this.gkba_action = gKbaDto7;
            this.request_phone_call_action = requestPhoneCallDto5;
            this.freeze_account_action = freezeAccountDto5;
            this.unverified_account_contact_information_action = unverifiedAccountContactInformationDto7;
            this.checklist_action = checklistDto4;
        }

        public /* synthetic */ Surrogate(String str, WorkflowScreenDto.NameDto nameDto, String str2, String str3, EntryPointDto4 entryPointDto4, UpdateAppDto4 updateAppDto4, InfoDto4 infoDto4, ContactSupportDto6 contactSupportDto6, SmsChallengeDto6 smsChallengeDto6, DeviceApprovalChallengeDto6 deviceApprovalChallengeDto6, KycStatusCheckDto$ActionDto kycStatusCheckDto$ActionDto, PlaidBankListDto6 plaidBankListDto6, PlaidAuthDto5 plaidAuthDto5, KbaDto5 kbaDto5, EmailChallengeDto6 emailChallengeDto6, GKbaDto7 gKbaDto7, RequestPhoneCallDto5 requestPhoneCallDto5, FreezeAccountDto5 freezeAccountDto5, UnverifiedAccountContactInformationDto7 unverifiedAccountContactInformationDto7, ChecklistDto4 checklistDto4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : nameDto, (i & 4) != 0 ? null : str2, (i & 8) == 0 ? str3 : "", (i & 16) != 0 ? null : entryPointDto4, (i & 32) != 0 ? null : updateAppDto4, (i & 64) != 0 ? null : infoDto4, (i & 128) != 0 ? null : contactSupportDto6, (i & 256) != 0 ? null : smsChallengeDto6, (i & 512) != 0 ? null : deviceApprovalChallengeDto6, (i & 1024) != 0 ? null : kycStatusCheckDto$ActionDto, (i & 2048) != 0 ? null : plaidBankListDto6, (i & 4096) != 0 ? null : plaidAuthDto5, (i & 8192) != 0 ? null : kbaDto5, (i & 16384) != 0 ? null : emailChallengeDto6, (i & 32768) != 0 ? null : gKbaDto7, (i & 65536) != 0 ? null : requestPhoneCallDto5, (i & 131072) != 0 ? null : freezeAccountDto5, (i & 262144) != 0 ? null : unverifiedAccountContactInformationDto7, (i & 524288) != 0 ? null : checklistDto4);
        }

        public final String getClient_version() {
            return this.client_version;
        }

        public final WorkflowScreenDto.NameDto getScreen_name() {
            return this.screen_name;
        }

        public final String getBlock_id() {
            return this.block_id;
        }

        public final String getId() {
            return this.id;
        }

        public final EntryPointDto4 getEntry_point_action() {
            return this.entry_point_action;
        }

        public final UpdateAppDto4 getUpdate_app_action() {
            return this.update_app_action;
        }

        public final InfoDto4 getInfo_action() {
            return this.info_action;
        }

        public final ContactSupportDto6 getContact_support_action() {
            return this.contact_support_action;
        }

        public final SmsChallengeDto6 getSms_challenge_action() {
            return this.sms_challenge_action;
        }

        public final DeviceApprovalChallengeDto6 getDevice_approval_challenge_action() {
            return this.device_approval_challenge_action;
        }

        public final KycStatusCheckDto$ActionDto getKyc_status_check_action() {
            return this.kyc_status_check_action;
        }

        public final PlaidBankListDto6 getPlaid_bank_list_action() {
            return this.plaid_bank_list_action;
        }

        public final PlaidAuthDto5 getPlaid_auth_action() {
            return this.plaid_auth_action;
        }

        public final KbaDto5 getKba_action() {
            return this.kba_action;
        }

        public final EmailChallengeDto6 getEmail_challenge_action() {
            return this.email_challenge_action;
        }

        public final GKbaDto7 getGkba_action() {
            return this.gkba_action;
        }

        public final RequestPhoneCallDto5 getRequest_phone_call_action() {
            return this.request_phone_call_action;
        }

        public final FreezeAccountDto5 getFreeze_account_action() {
            return this.freeze_account_action;
        }

        public final UnverifiedAccountContactInformationDto7 getUnverified_account_contact_information_action() {
            return this.unverified_account_contact_information_action;
        }

        public final ChecklistDto4 getChecklist_action() {
            return this.checklist_action;
        }
    }

    /* compiled from: WorkflowActionRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<WorkflowActionRequestDto, WorkflowActionRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<WorkflowActionRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<WorkflowActionRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<WorkflowActionRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) WorkflowActionRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<WorkflowActionRequest> getProtoAdapter() {
            return WorkflowActionRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public WorkflowActionRequestDto getZeroValue() {
            return WorkflowActionRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public WorkflowActionRequestDto fromProto(WorkflowActionRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String client_version = proto.getClient_version();
            WorkflowScreen.Name screen_name = proto.getScreen_name();
            WorkflowScreenDto.NameDto nameDtoFromProto = screen_name != null ? WorkflowScreenDto.NameDto.INSTANCE.fromProto(screen_name) : null;
            String block_id = proto.getBlock_id();
            String id = proto.getId();
            EntryPoint2 entry_point_action = proto.getEntry_point_action();
            EntryPointDto4 entryPointDto4FromProto = entry_point_action != null ? EntryPointDto4.INSTANCE.fromProto(entry_point_action) : null;
            UpdateApp update_app_action = proto.getUpdate_app_action();
            UpdateAppDto4 updateAppDto4FromProto = update_app_action != null ? UpdateAppDto4.INSTANCE.fromProto(update_app_action) : null;
            Info$Action info_action = proto.getInfo_action();
            InfoDto4 infoDto4FromProto = info_action != null ? InfoDto4.INSTANCE.fromProto(info_action) : null;
            ContactSupport$Action contact_support_action = proto.getContact_support_action();
            ContactSupportDto6 contactSupportDto6FromProto = contact_support_action != null ? ContactSupportDto6.INSTANCE.fromProto(contact_support_action) : null;
            SmsChallenge$Action sms_challenge_action = proto.getSms_challenge_action();
            SmsChallengeDto6 smsChallengeDto6FromProto = sms_challenge_action != null ? SmsChallengeDto6.INSTANCE.fromProto(sms_challenge_action) : null;
            DeviceApprovalChallenge$Action device_approval_challenge_action = proto.getDevice_approval_challenge_action();
            DeviceApprovalChallengeDto6 deviceApprovalChallengeDto6FromProto = device_approval_challenge_action != null ? DeviceApprovalChallengeDto6.INSTANCE.fromProto(device_approval_challenge_action) : null;
            KycStatusCheck$Action kyc_status_check_action = proto.getKyc_status_check_action();
            KycStatusCheckDto$ActionDto kycStatusCheckDto$ActionDtoFromProto = kyc_status_check_action != null ? KycStatusCheckDto$ActionDto.INSTANCE.fromProto(kyc_status_check_action) : null;
            PlaidBankList$Action plaid_bank_list_action = proto.getPlaid_bank_list_action();
            PlaidBankListDto6 plaidBankListDto6FromProto = plaid_bank_list_action != null ? PlaidBankListDto6.INSTANCE.fromProto(plaid_bank_list_action) : null;
            PlaidAuth plaid_auth_action = proto.getPlaid_auth_action();
            PlaidAuthDto5 plaidAuthDto5FromProto = plaid_auth_action != null ? PlaidAuthDto5.INSTANCE.fromProto(plaid_auth_action) : null;
            Kba2 kba_action = proto.getKba_action();
            KbaDto5 kbaDto5FromProto = kba_action != null ? KbaDto5.INSTANCE.fromProto(kba_action) : null;
            EmailChallenge$Action email_challenge_action = proto.getEmail_challenge_action();
            WorkflowScreenDto.NameDto nameDto = nameDtoFromProto;
            EmailChallengeDto6 emailChallengeDto6FromProto = email_challenge_action != null ? EmailChallengeDto6.INSTANCE.fromProto(email_challenge_action) : null;
            GKba$Action gkba_action = proto.getGkba_action();
            EmailChallengeDto6 emailChallengeDto6 = emailChallengeDto6FromProto;
            GKbaDto7 gKbaDto7FromProto = gkba_action != null ? GKbaDto7.INSTANCE.fromProto(gkba_action) : null;
            RequestPhoneCall request_phone_call_action = proto.getRequest_phone_call_action();
            GKbaDto7 gKbaDto7 = gKbaDto7FromProto;
            RequestPhoneCallDto5 requestPhoneCallDto5FromProto = request_phone_call_action != null ? RequestPhoneCallDto5.INSTANCE.fromProto(request_phone_call_action) : null;
            FreezeAccount$Action freeze_account_action = proto.getFreeze_account_action();
            RequestPhoneCallDto5 requestPhoneCallDto5 = requestPhoneCallDto5FromProto;
            FreezeAccountDto5 freezeAccountDto5FromProto = freeze_account_action != null ? FreezeAccountDto5.INSTANCE.fromProto(freeze_account_action) : null;
            UnverifiedAccountContactInformation unverified_account_contact_information_action = proto.getUnverified_account_contact_information_action();
            FreezeAccountDto5 freezeAccountDto5 = freezeAccountDto5FromProto;
            UnverifiedAccountContactInformationDto7 unverifiedAccountContactInformationDto7FromProto = unverified_account_contact_information_action != null ? UnverifiedAccountContactInformationDto7.INSTANCE.fromProto(unverified_account_contact_information_action) : null;
            Checklist2 checklist_action = proto.getChecklist_action();
            return new WorkflowActionRequestDto(new Surrogate(client_version, nameDto, block_id, id, entryPointDto4FromProto, updateAppDto4FromProto, infoDto4FromProto, contactSupportDto6FromProto, smsChallengeDto6FromProto, deviceApprovalChallengeDto6FromProto, kycStatusCheckDto$ActionDtoFromProto, plaidBankListDto6FromProto, plaidAuthDto5FromProto, kbaDto5FromProto, emailChallengeDto6, gKbaDto7, requestPhoneCallDto5, freezeAccountDto5, unverifiedAccountContactInformationDto7FromProto, checklist_action != null ? ChecklistDto4.INSTANCE.fromProto(checklist_action) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: identi.service.v1.models_workflow.v1.WorkflowActionRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WorkflowActionRequestDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new WorkflowActionRequestDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: WorkflowActionRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00142\u00020\u0001:\u0011\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0010\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$¨\u0006%"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "EntryPointAction", "UpdateAppAction", "InfoAction", "ContactSupportAction", "SmsChallengeAction", "DeviceApprovalChallengeAction", "KycStatusCheckAction", "PlaidBankListAction", "PlaidAuthAction", "KbaAction", "EmailChallengeAction", "GkbaAction", "RequestPhoneCallAction", "FreezeAccountAction", "UnverifiedAccountContactInformationAction", "ChecklistAction", "Companion", "Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto$ChecklistAction;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto$ContactSupportAction;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto$DeviceApprovalChallengeAction;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto$EmailChallengeAction;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto$EntryPointAction;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto$FreezeAccountAction;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto$GkbaAction;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto$InfoAction;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto$KbaAction;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto$KycStatusCheckAction;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto$PlaidAuthAction;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto$PlaidBankListAction;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto$RequestPhoneCallAction;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto$SmsChallengeAction;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto$UnverifiedAccountContactInformationAction;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto$UpdateAppAction;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class ActionDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ ActionDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: WorkflowActionRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto$EntryPointAction;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto;", "Lidenti/service/v1/models_workflow/v1/EntryPointDto$ActionDto;", "value", "<init>", "(Lidenti/service/v1/models_workflow/v1/EntryPointDto$ActionDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/EntryPointDto$ActionDto;", "getValue", "()Lidenti/service/v1/models_workflow/v1/EntryPointDto$ActionDto;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class EntryPointAction extends ActionDto {
            private final EntryPointDto4 value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof EntryPointAction) && Intrinsics.areEqual(this.value, ((EntryPointAction) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "EntryPointAction(value=" + this.value + ")";
            }

            public final EntryPointDto4 getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EntryPointAction(EntryPointDto4 value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: WorkflowActionRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto$UpdateAppAction;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto;", "Lidenti/service/v1/models_workflow/v1/UpdateAppDto$ActionDto;", "value", "<init>", "(Lidenti/service/v1/models_workflow/v1/UpdateAppDto$ActionDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/UpdateAppDto$ActionDto;", "getValue", "()Lidenti/service/v1/models_workflow/v1/UpdateAppDto$ActionDto;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class UpdateAppAction extends ActionDto {
            private final UpdateAppDto4 value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UpdateAppAction) && Intrinsics.areEqual(this.value, ((UpdateAppAction) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "UpdateAppAction(value=" + this.value + ")";
            }

            public final UpdateAppDto4 getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpdateAppAction(UpdateAppDto4 value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: WorkflowActionRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto$InfoAction;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto;", "Lidenti/service/v1/models_workflow/v1/InfoDto$ActionDto;", "value", "<init>", "(Lidenti/service/v1/models_workflow/v1/InfoDto$ActionDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/InfoDto$ActionDto;", "getValue", "()Lidenti/service/v1/models_workflow/v1/InfoDto$ActionDto;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class InfoAction extends ActionDto {
            private final InfoDto4 value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof InfoAction) && Intrinsics.areEqual(this.value, ((InfoAction) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "InfoAction(value=" + this.value + ")";
            }

            public final InfoDto4 getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InfoAction(InfoDto4 value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: WorkflowActionRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto$ContactSupportAction;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto;", "Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionDto;", "value", "<init>", "(Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionDto;", "getValue", "()Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionDto;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ContactSupportAction extends ActionDto {
            private final ContactSupportDto6 value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ContactSupportAction) && Intrinsics.areEqual(this.value, ((ContactSupportAction) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ContactSupportAction(value=" + this.value + ")";
            }

            public final ContactSupportDto6 getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ContactSupportAction(ContactSupportDto6 value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: WorkflowActionRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto$SmsChallengeAction;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto;", "Lidenti/service/v1/models_workflow/v1/SmsChallengeDto$ActionDto;", "value", "<init>", "(Lidenti/service/v1/models_workflow/v1/SmsChallengeDto$ActionDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/SmsChallengeDto$ActionDto;", "getValue", "()Lidenti/service/v1/models_workflow/v1/SmsChallengeDto$ActionDto;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SmsChallengeAction extends ActionDto {
            private final SmsChallengeDto6 value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SmsChallengeAction) && Intrinsics.areEqual(this.value, ((SmsChallengeAction) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "SmsChallengeAction(value=" + this.value + ")";
            }

            public final SmsChallengeDto6 getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SmsChallengeAction(SmsChallengeDto6 value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: WorkflowActionRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto$DeviceApprovalChallengeAction;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto;", "Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallengeDto$ActionDto;", "value", "<init>", "(Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallengeDto$ActionDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallengeDto$ActionDto;", "getValue", "()Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallengeDto$ActionDto;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class DeviceApprovalChallengeAction extends ActionDto {
            private final DeviceApprovalChallengeDto6 value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DeviceApprovalChallengeAction) && Intrinsics.areEqual(this.value, ((DeviceApprovalChallengeAction) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "DeviceApprovalChallengeAction(value=" + this.value + ")";
            }

            public final DeviceApprovalChallengeDto6 getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DeviceApprovalChallengeAction(DeviceApprovalChallengeDto6 value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: WorkflowActionRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto$KycStatusCheckAction;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto;", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto;", "value", "<init>", "(Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto;", "getValue", "()Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionDto;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class KycStatusCheckAction extends ActionDto {
            private final KycStatusCheckDto$ActionDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof KycStatusCheckAction) && Intrinsics.areEqual(this.value, ((KycStatusCheckAction) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "KycStatusCheckAction(value=" + this.value + ")";
            }

            public final KycStatusCheckDto$ActionDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public KycStatusCheckAction(KycStatusCheckDto$ActionDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: WorkflowActionRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto$PlaidBankListAction;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto;", "Lidenti/service/v1/models_workflow/v1/PlaidBankListDto$ActionDto;", "value", "<init>", "(Lidenti/service/v1/models_workflow/v1/PlaidBankListDto$ActionDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/PlaidBankListDto$ActionDto;", "getValue", "()Lidenti/service/v1/models_workflow/v1/PlaidBankListDto$ActionDto;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PlaidBankListAction extends ActionDto {
            private final PlaidBankListDto6 value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PlaidBankListAction) && Intrinsics.areEqual(this.value, ((PlaidBankListAction) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "PlaidBankListAction(value=" + this.value + ")";
            }

            public final PlaidBankListDto6 getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PlaidBankListAction(PlaidBankListDto6 value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: WorkflowActionRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto$PlaidAuthAction;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto;", "Lidenti/service/v1/models_workflow/v1/PlaidAuthDto$ActionDto;", "value", "<init>", "(Lidenti/service/v1/models_workflow/v1/PlaidAuthDto$ActionDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/PlaidAuthDto$ActionDto;", "getValue", "()Lidenti/service/v1/models_workflow/v1/PlaidAuthDto$ActionDto;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PlaidAuthAction extends ActionDto {
            private final PlaidAuthDto5 value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PlaidAuthAction) && Intrinsics.areEqual(this.value, ((PlaidAuthAction) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "PlaidAuthAction(value=" + this.value + ")";
            }

            public final PlaidAuthDto5 getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PlaidAuthAction(PlaidAuthDto5 value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: WorkflowActionRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto$KbaAction;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto;", "Lidenti/service/v1/models_workflow/v1/KbaDto$ActionDto;", "value", "<init>", "(Lidenti/service/v1/models_workflow/v1/KbaDto$ActionDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/KbaDto$ActionDto;", "getValue", "()Lidenti/service/v1/models_workflow/v1/KbaDto$ActionDto;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class KbaAction extends ActionDto {
            private final KbaDto5 value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof KbaAction) && Intrinsics.areEqual(this.value, ((KbaAction) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "KbaAction(value=" + this.value + ")";
            }

            public final KbaDto5 getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public KbaAction(KbaDto5 value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: WorkflowActionRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto$EmailChallengeAction;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto;", "Lidenti/service/v1/models_workflow/v1/EmailChallengeDto$ActionDto;", "value", "<init>", "(Lidenti/service/v1/models_workflow/v1/EmailChallengeDto$ActionDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/EmailChallengeDto$ActionDto;", "getValue", "()Lidenti/service/v1/models_workflow/v1/EmailChallengeDto$ActionDto;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes14.dex */
        public static final /* data */ class EmailChallengeAction extends ActionDto {
            private final EmailChallengeDto6 value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof EmailChallengeAction) && Intrinsics.areEqual(this.value, ((EmailChallengeAction) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "EmailChallengeAction(value=" + this.value + ")";
            }

            public final EmailChallengeDto6 getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EmailChallengeAction(EmailChallengeDto6 value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: WorkflowActionRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto$GkbaAction;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto;", "Lidenti/service/v1/models_workflow/v1/GKbaDto$ActionDto;", "value", "<init>", "(Lidenti/service/v1/models_workflow/v1/GKbaDto$ActionDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/GKbaDto$ActionDto;", "getValue", "()Lidenti/service/v1/models_workflow/v1/GKbaDto$ActionDto;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes14.dex */
        public static final /* data */ class GkbaAction extends ActionDto {
            private final GKbaDto7 value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof GkbaAction) && Intrinsics.areEqual(this.value, ((GkbaAction) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "GkbaAction(value=" + this.value + ")";
            }

            public final GKbaDto7 getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GkbaAction(GKbaDto7 value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: WorkflowActionRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto$RequestPhoneCallAction;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto;", "Lidenti/service/v1/models_workflow/v1/RequestPhoneCallDto$ActionDto;", "value", "<init>", "(Lidenti/service/v1/models_workflow/v1/RequestPhoneCallDto$ActionDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/RequestPhoneCallDto$ActionDto;", "getValue", "()Lidenti/service/v1/models_workflow/v1/RequestPhoneCallDto$ActionDto;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes14.dex */
        public static final /* data */ class RequestPhoneCallAction extends ActionDto {
            private final RequestPhoneCallDto5 value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RequestPhoneCallAction) && Intrinsics.areEqual(this.value, ((RequestPhoneCallAction) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "RequestPhoneCallAction(value=" + this.value + ")";
            }

            public final RequestPhoneCallDto5 getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RequestPhoneCallAction(RequestPhoneCallDto5 value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: WorkflowActionRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto$FreezeAccountAction;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto;", "Lidenti/service/v1/models_workflow/v1/FreezeAccountDto$ActionDto;", "value", "<init>", "(Lidenti/service/v1/models_workflow/v1/FreezeAccountDto$ActionDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/FreezeAccountDto$ActionDto;", "getValue", "()Lidenti/service/v1/models_workflow/v1/FreezeAccountDto$ActionDto;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes14.dex */
        public static final /* data */ class FreezeAccountAction extends ActionDto {
            private final FreezeAccountDto5 value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof FreezeAccountAction) && Intrinsics.areEqual(this.value, ((FreezeAccountAction) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "FreezeAccountAction(value=" + this.value + ")";
            }

            public final FreezeAccountDto5 getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FreezeAccountAction(FreezeAccountDto5 value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: WorkflowActionRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto$UnverifiedAccountContactInformationAction;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto;", "Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ActionDto;", "value", "<init>", "(Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ActionDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ActionDto;", "getValue", "()Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ActionDto;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes14.dex */
        public static final /* data */ class UnverifiedAccountContactInformationAction extends ActionDto {
            private final UnverifiedAccountContactInformationDto7 value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UnverifiedAccountContactInformationAction) && Intrinsics.areEqual(this.value, ((UnverifiedAccountContactInformationAction) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "UnverifiedAccountContactInformationAction(value=" + this.value + ")";
            }

            public final UnverifiedAccountContactInformationDto7 getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UnverifiedAccountContactInformationAction(UnverifiedAccountContactInformationDto7 value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: WorkflowActionRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto$ChecklistAction;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto;", "Lidenti/service/v1/models_workflow/v1/ChecklistDto$ActionDto;", "value", "<init>", "(Lidenti/service/v1/models_workflow/v1/ChecklistDto$ActionDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/ChecklistDto$ActionDto;", "getValue", "()Lidenti/service/v1/models_workflow/v1/ChecklistDto$ActionDto;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes14.dex */
        public static final /* data */ class ChecklistAction extends ActionDto {
            private final ChecklistDto4 value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ChecklistAction) && Intrinsics.areEqual(this.value, ((ChecklistAction) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ChecklistAction(value=" + this.value + ")";
            }

            public final ChecklistDto4 getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ChecklistAction(ChecklistDto4 value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: WorkflowActionRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$ActionDto;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionRequest;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes14.dex */
        public static final class Companion implements Dto4.Creator<ActionDto, WorkflowActionRequest> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @Override // com.robinhood.idl.Dto.Creator
            public Void getZeroValue() {
                return Dto4.Creator.DefaultImpls.getZeroValue(this);
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<WorkflowActionRequest> getProtoAdapter() {
                return WorkflowActionRequest.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ActionDto fromProto(WorkflowActionRequest proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getEntry_point_action() != null) {
                    return new EntryPointAction(EntryPointDto4.INSTANCE.fromProto(proto.getEntry_point_action()));
                }
                if (proto.getUpdate_app_action() != null) {
                    return new UpdateAppAction(UpdateAppDto4.INSTANCE.fromProto(proto.getUpdate_app_action()));
                }
                if (proto.getInfo_action() != null) {
                    return new InfoAction(InfoDto4.INSTANCE.fromProto(proto.getInfo_action()));
                }
                if (proto.getContact_support_action() != null) {
                    return new ContactSupportAction(ContactSupportDto6.INSTANCE.fromProto(proto.getContact_support_action()));
                }
                if (proto.getSms_challenge_action() != null) {
                    return new SmsChallengeAction(SmsChallengeDto6.INSTANCE.fromProto(proto.getSms_challenge_action()));
                }
                if (proto.getDevice_approval_challenge_action() != null) {
                    return new DeviceApprovalChallengeAction(DeviceApprovalChallengeDto6.INSTANCE.fromProto(proto.getDevice_approval_challenge_action()));
                }
                if (proto.getKyc_status_check_action() != null) {
                    return new KycStatusCheckAction(KycStatusCheckDto$ActionDto.INSTANCE.fromProto(proto.getKyc_status_check_action()));
                }
                if (proto.getPlaid_bank_list_action() != null) {
                    return new PlaidBankListAction(PlaidBankListDto6.INSTANCE.fromProto(proto.getPlaid_bank_list_action()));
                }
                if (proto.getPlaid_auth_action() != null) {
                    return new PlaidAuthAction(PlaidAuthDto5.INSTANCE.fromProto(proto.getPlaid_auth_action()));
                }
                if (proto.getKba_action() != null) {
                    return new KbaAction(KbaDto5.INSTANCE.fromProto(proto.getKba_action()));
                }
                if (proto.getEmail_challenge_action() != null) {
                    return new EmailChallengeAction(EmailChallengeDto6.INSTANCE.fromProto(proto.getEmail_challenge_action()));
                }
                if (proto.getGkba_action() != null) {
                    return new GkbaAction(GKbaDto7.INSTANCE.fromProto(proto.getGkba_action()));
                }
                if (proto.getRequest_phone_call_action() != null) {
                    return new RequestPhoneCallAction(RequestPhoneCallDto5.INSTANCE.fromProto(proto.getRequest_phone_call_action()));
                }
                if (proto.getFreeze_account_action() != null) {
                    return new FreezeAccountAction(FreezeAccountDto5.INSTANCE.fromProto(proto.getFreeze_account_action()));
                }
                if (proto.getUnverified_account_contact_information_action() != null) {
                    return new UnverifiedAccountContactInformationAction(UnverifiedAccountContactInformationDto7.INSTANCE.fromProto(proto.getUnverified_account_contact_information_action()));
                }
                if (proto.getChecklist_action() != null) {
                    return new ChecklistAction(ChecklistDto4.INSTANCE.fromProto(proto.getChecklist_action()));
                }
                return null;
            }
        }
    }

    /* compiled from: WorkflowActionRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto;", "<init>", "()V", "surrogateSerializer", "Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes14.dex */
    public static final class Serializer implements KSerializer<WorkflowActionRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/identi.service.v1.models_workflow.v1.WorkflowActionRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, WorkflowActionRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public WorkflowActionRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new WorkflowActionRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: WorkflowActionRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowActionRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "identi.service.v1.models_workflow.v1.WorkflowActionRequestDto";
        }
    }
}
