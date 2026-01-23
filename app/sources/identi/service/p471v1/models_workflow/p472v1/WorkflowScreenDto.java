package identi.service.p471v1.models_workflow.p472v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.squareup.wire.ProtoAdapter;
import identi.service.p471v1.models_workflow.p472v1.ChecklistDto6;
import identi.service.p471v1.models_workflow.p472v1.ContactSupportDto9;
import identi.service.p471v1.models_workflow.p472v1.DeviceApprovalChallengeDto9;
import identi.service.p471v1.models_workflow.p472v1.EmailChallengeDto9;
import identi.service.p471v1.models_workflow.p472v1.FreezeAccountDto8;
import identi.service.p471v1.models_workflow.p472v1.GKbaDto9;
import identi.service.p471v1.models_workflow.p472v1.InfoDto6;
import identi.service.p471v1.models_workflow.p472v1.KbaDto7;
import identi.service.p471v1.models_workflow.p472v1.KycStatusCheckDto$ScreenParamsDto;
import identi.service.p471v1.models_workflow.p472v1.PlaidAuthDto7;
import identi.service.p471v1.models_workflow.p472v1.PlaidBankListDto8;
import identi.service.p471v1.models_workflow.p472v1.RequestPhoneCallDto7;
import identi.service.p471v1.models_workflow.p472v1.SmsChallengeDto9;
import identi.service.p471v1.models_workflow.p472v1.SupportIntakeCaseConfirmationDto5;
import identi.service.p471v1.models_workflow.p472v1.UnverifiedAccountContactInformationDto9;
import identi.service.p471v1.models_workflow.p472v1.UpdateAppDto6;
import identi.service.p471v1.models_workflow.p472v1.WorkflowScreen;
import identi.service.p471v1.models_workflow.p472v1.WorkflowScreenDto;
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

/* compiled from: WorkflowScreenDto.kt */
@Metadata(m3635d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 N2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0007ONPQRSTB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BA\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0006\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001bH\u0016¢\u0006\u0004\b$\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b(\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0015R\u0013\u0010-\u001a\u0004\u0018\u00010*8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0013\u00101\u001a\u0004\u0018\u00010.8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0013\u00105\u001a\u0004\u0018\u0001028F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0013\u00109\u001a\u0004\u0018\u0001068F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0013\u0010=\u001a\u0004\u0018\u00010:8F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0013\u0010A\u001a\u0004\u0018\u00010>8F¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0013\u0010E\u001a\u0004\u0018\u00010B8F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0013\u0010I\u001a\u0004\u0018\u00010F8F¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0013\u0010M\u001a\u0004\u0018\u00010J8F¢\u0006\u0006\u001a\u0004\bK\u0010L¨\u0006U"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto;", "Lcom/robinhood/idl/MessageDto;", "Lidenti/service/v1/models_workflow/v1/WorkflowScreen;", "Landroid/os/Parcelable;", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$Surrogate;", "surrogate", "<init>", "(Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$Surrogate;)V", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$NameDto;", "name", "", "block_id", "logging_identifier", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$LayoutFormatDto;", "layout_format", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto;", "params", "(Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$NameDto;Ljava/lang/String;Ljava/lang/String;Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$LayoutFormatDto;Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto;)V", "toProto", "()Lidenti/service/v1/models_workflow/v1/WorkflowScreen;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$Surrogate;", "getName", "()Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$NameDto;", "getBlock_id", "getLogging_identifier", "Lidenti/service/v1/models_workflow/v1/UpdateAppDto$ScreenParamsDto;", "getUpdate_app_screen_params", "()Lidenti/service/v1/models_workflow/v1/UpdateAppDto$ScreenParamsDto;", "update_app_screen_params", "Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto;", "getInfo_screen_params", "()Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto;", "info_screen_params", "Lidenti/service/v1/models_workflow/v1/SmsChallengeDto$ScreenParamsDto;", "getSms_challenge_screen_params", "()Lidenti/service/v1/models_workflow/v1/SmsChallengeDto$ScreenParamsDto;", "sms_challenge_screen_params", "Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallengeDto$ScreenParamsDto;", "getDevice_approval_challenge_screen_params", "()Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallengeDto$ScreenParamsDto;", "device_approval_challenge_screen_params", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ScreenParamsDto;", "getKyc_status_check_screen_params", "()Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ScreenParamsDto;", "kyc_status_check_screen_params", "Lidenti/service/v1/models_workflow/v1/EmailChallengeDto$ScreenParamsDto;", "getEmail_challenge_screen_params", "()Lidenti/service/v1/models_workflow/v1/EmailChallengeDto$ScreenParamsDto;", "email_challenge_screen_params", "Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto;", "getGkba_screen_params", "()Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto;", "gkba_screen_params", "Lidenti/service/v1/models_workflow/v1/RequestPhoneCallDto$ScreenParamsDto;", "getRequest_phone_call_params", "()Lidenti/service/v1/models_workflow/v1/RequestPhoneCallDto$ScreenParamsDto;", "request_phone_call_params", "Lidenti/service/v1/models_workflow/v1/ChecklistDto$ScreenParamsDto;", "getChecklist_screen_params", "()Lidenti/service/v1/models_workflow/v1/ChecklistDto$ScreenParamsDto;", "checklist_screen_params", "Companion", "Surrogate", "ParamsDto", "NameDto", "LayoutFormatDto", "Serializer", "MultibindingModule", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class WorkflowScreenDto implements Dto3<WorkflowScreen>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<WorkflowScreenDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<WorkflowScreenDto, WorkflowScreen>> binaryBase64Serializer$delegate;
    private static final WorkflowScreenDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ WorkflowScreenDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private WorkflowScreenDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final NameDto getName() {
        return this.surrogate.getName();
    }

    public final String getBlock_id() {
        return this.surrogate.getBlock_id();
    }

    public final String getLogging_identifier() {
        return this.surrogate.getLogging_identifier();
    }

    public final UpdateAppDto6 getUpdate_app_screen_params() {
        return this.surrogate.getUpdate_app_screen_params();
    }

    public final InfoDto6 getInfo_screen_params() {
        return this.surrogate.getInfo_screen_params();
    }

    public final SmsChallengeDto9 getSms_challenge_screen_params() {
        return this.surrogate.getSms_challenge_screen_params();
    }

    public final DeviceApprovalChallengeDto9 getDevice_approval_challenge_screen_params() {
        return this.surrogate.getDevice_approval_challenge_screen_params();
    }

    public final KycStatusCheckDto$ScreenParamsDto getKyc_status_check_screen_params() {
        return this.surrogate.getKyc_status_check_screen_params();
    }

    public final EmailChallengeDto9 getEmail_challenge_screen_params() {
        return this.surrogate.getEmail_challenge_screen_params();
    }

    public final GKbaDto9 getGkba_screen_params() {
        return this.surrogate.getGkba_screen_params();
    }

    public final RequestPhoneCallDto7 getRequest_phone_call_params() {
        return this.surrogate.getRequest_phone_call_params();
    }

    public final ChecklistDto6 getChecklist_screen_params() {
        return this.surrogate.getChecklist_screen_params();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ WorkflowScreenDto(identi.service.v1.models_workflow.v1.WorkflowScreenDto.NameDto r2, java.lang.String r3, java.lang.String r4, identi.service.v1.models_workflow.v1.WorkflowScreenDto.LayoutFormatDto r5, identi.service.v1.models_workflow.v1.WorkflowScreenDto.ParamsDto r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto La
            identi.service.v1.models_workflow.v1.WorkflowScreenDto$NameDto$Companion r2 = identi.service.v1.models_workflow.v1.WorkflowScreenDto.NameDto.INSTANCE
            identi.service.v1.models_workflow.v1.WorkflowScreenDto$NameDto r2 = r2.getZeroValue()
        La:
            r8 = r7 & 2
            if (r8 == 0) goto L10
            java.lang.String r3 = ""
        L10:
            r8 = r7 & 4
            r0 = 0
            if (r8 == 0) goto L16
            r4 = r0
        L16:
            r8 = r7 & 8
            if (r8 == 0) goto L1b
            r5 = r0
        L1b:
            r7 = r7 & 16
            if (r7 == 0) goto L26
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L2c
        L26:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L2c:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: identi.service.p471v1.models_workflow.p472v1.WorkflowScreenDto.<init>(identi.service.v1.models_workflow.v1.WorkflowScreenDto$NameDto, java.lang.String, java.lang.String, identi.service.v1.models_workflow.v1.WorkflowScreenDto$LayoutFormatDto, identi.service.v1.models_workflow.v1.WorkflowScreenDto$ParamsDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public WorkflowScreenDto(NameDto name, String block_id, String str, LayoutFormatDto layoutFormatDto, ParamsDto paramsDto) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(block_id, "block_id");
        ParamsDto.UpdateAppScreenParams updateAppScreenParams = paramsDto instanceof ParamsDto.UpdateAppScreenParams ? (ParamsDto.UpdateAppScreenParams) paramsDto : null;
        UpdateAppDto6 value = updateAppScreenParams != null ? updateAppScreenParams.getValue() : null;
        ParamsDto.InfoScreenParams infoScreenParams = paramsDto instanceof ParamsDto.InfoScreenParams ? (ParamsDto.InfoScreenParams) paramsDto : null;
        InfoDto6 value2 = infoScreenParams != null ? infoScreenParams.getValue() : null;
        ParamsDto.ContactSupportScreenParams contactSupportScreenParams = paramsDto instanceof ParamsDto.ContactSupportScreenParams ? (ParamsDto.ContactSupportScreenParams) paramsDto : null;
        ContactSupportDto9 value3 = contactSupportScreenParams != null ? contactSupportScreenParams.getValue() : null;
        ParamsDto.SmsChallengeScreenParams smsChallengeScreenParams = paramsDto instanceof ParamsDto.SmsChallengeScreenParams ? (ParamsDto.SmsChallengeScreenParams) paramsDto : null;
        SmsChallengeDto9 value4 = smsChallengeScreenParams != null ? smsChallengeScreenParams.getValue() : null;
        ParamsDto.DeviceApprovalChallengeScreenParams deviceApprovalChallengeScreenParams = paramsDto instanceof ParamsDto.DeviceApprovalChallengeScreenParams ? (ParamsDto.DeviceApprovalChallengeScreenParams) paramsDto : null;
        DeviceApprovalChallengeDto9 value5 = deviceApprovalChallengeScreenParams != null ? deviceApprovalChallengeScreenParams.getValue() : null;
        ParamsDto.KycStatusCheckScreenParams kycStatusCheckScreenParams = paramsDto instanceof ParamsDto.KycStatusCheckScreenParams ? (ParamsDto.KycStatusCheckScreenParams) paramsDto : null;
        KycStatusCheckDto$ScreenParamsDto value6 = kycStatusCheckScreenParams != null ? kycStatusCheckScreenParams.getValue() : null;
        ParamsDto.PlaidBankListScreenParams plaidBankListScreenParams = paramsDto instanceof ParamsDto.PlaidBankListScreenParams ? (ParamsDto.PlaidBankListScreenParams) paramsDto : null;
        PlaidBankListDto8 value7 = plaidBankListScreenParams != null ? plaidBankListScreenParams.getValue() : null;
        ParamsDto.PlaidAuthScreenParams plaidAuthScreenParams = paramsDto instanceof ParamsDto.PlaidAuthScreenParams ? (ParamsDto.PlaidAuthScreenParams) paramsDto : null;
        PlaidAuthDto7 value8 = plaidAuthScreenParams != null ? plaidAuthScreenParams.getValue() : null;
        ParamsDto.KbaScreenParams kbaScreenParams = paramsDto instanceof ParamsDto.KbaScreenParams ? (ParamsDto.KbaScreenParams) paramsDto : null;
        KbaDto7 value9 = kbaScreenParams != null ? kbaScreenParams.getValue() : null;
        ParamsDto.EmailChallengeScreenParams emailChallengeScreenParams = paramsDto instanceof ParamsDto.EmailChallengeScreenParams ? (ParamsDto.EmailChallengeScreenParams) paramsDto : null;
        EmailChallengeDto9 value10 = emailChallengeScreenParams != null ? emailChallengeScreenParams.getValue() : null;
        ParamsDto.GkbaScreenParams gkbaScreenParams = paramsDto instanceof ParamsDto.GkbaScreenParams ? (ParamsDto.GkbaScreenParams) paramsDto : null;
        GKbaDto9 value11 = gkbaScreenParams != null ? gkbaScreenParams.getValue() : null;
        ParamsDto.RequestPhoneCallParams requestPhoneCallParams = paramsDto instanceof ParamsDto.RequestPhoneCallParams ? (ParamsDto.RequestPhoneCallParams) paramsDto : null;
        RequestPhoneCallDto7 value12 = requestPhoneCallParams != null ? requestPhoneCallParams.getValue() : null;
        ParamsDto.FreezeAccountScreenParams freezeAccountScreenParams = paramsDto instanceof ParamsDto.FreezeAccountScreenParams ? (ParamsDto.FreezeAccountScreenParams) paramsDto : null;
        FreezeAccountDto8 value13 = freezeAccountScreenParams != null ? freezeAccountScreenParams.getValue() : null;
        ParamsDto.UnverifiedAccountContactInformationScreenParams unverifiedAccountContactInformationScreenParams = paramsDto instanceof ParamsDto.UnverifiedAccountContactInformationScreenParams ? (ParamsDto.UnverifiedAccountContactInformationScreenParams) paramsDto : null;
        UnverifiedAccountContactInformationDto9 value14 = unverifiedAccountContactInformationScreenParams != null ? unverifiedAccountContactInformationScreenParams.getValue() : null;
        ParamsDto.SupportIntakeCaseConfirmationScreenParams supportIntakeCaseConfirmationScreenParams = paramsDto instanceof ParamsDto.SupportIntakeCaseConfirmationScreenParams ? (ParamsDto.SupportIntakeCaseConfirmationScreenParams) paramsDto : null;
        SupportIntakeCaseConfirmationDto5 value15 = supportIntakeCaseConfirmationScreenParams != null ? supportIntakeCaseConfirmationScreenParams.getValue() : null;
        ParamsDto.ChecklistScreenParams checklistScreenParams = paramsDto instanceof ParamsDto.ChecklistScreenParams ? (ParamsDto.ChecklistScreenParams) paramsDto : null;
        this(new Surrogate(name, block_id, str, layoutFormatDto, value, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, checklistScreenParams != null ? checklistScreenParams.getValue() : null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public WorkflowScreen toProto() {
        WorkflowScreen.Name name = (WorkflowScreen.Name) this.surrogate.getName().toProto();
        String block_id = this.surrogate.getBlock_id();
        String logging_identifier = this.surrogate.getLogging_identifier();
        LayoutFormatDto layout_format = this.surrogate.getLayout_format();
        WorkflowScreen.LayoutFormat layoutFormat = layout_format != null ? (WorkflowScreen.LayoutFormat) layout_format.toProto() : null;
        UpdateAppDto6 update_app_screen_params = this.surrogate.getUpdate_app_screen_params();
        UpdateApp5 proto = update_app_screen_params != null ? update_app_screen_params.toProto() : null;
        InfoDto6 info_screen_params = this.surrogate.getInfo_screen_params();
        Info$ScreenParams proto2 = info_screen_params != null ? info_screen_params.toProto() : null;
        ContactSupportDto9 contact_support_screen_params = this.surrogate.getContact_support_screen_params();
        ContactSupport$ScreenParams proto3 = contact_support_screen_params != null ? contact_support_screen_params.toProto() : null;
        SmsChallengeDto9 sms_challenge_screen_params = this.surrogate.getSms_challenge_screen_params();
        SmsChallenge$ScreenParams proto4 = sms_challenge_screen_params != null ? sms_challenge_screen_params.toProto() : null;
        DeviceApprovalChallengeDto9 device_approval_challenge_screen_params = this.surrogate.getDevice_approval_challenge_screen_params();
        DeviceApprovalChallenge$ScreenParams proto5 = device_approval_challenge_screen_params != null ? device_approval_challenge_screen_params.toProto() : null;
        KycStatusCheckDto$ScreenParamsDto kyc_status_check_screen_params = this.surrogate.getKyc_status_check_screen_params();
        KycStatusCheck$ScreenParams proto6 = kyc_status_check_screen_params != null ? kyc_status_check_screen_params.toProto() : null;
        PlaidBankListDto8 plaid_bank_list_screen_params = this.surrogate.getPlaid_bank_list_screen_params();
        PlaidBankList$ScreenParams proto7 = plaid_bank_list_screen_params != null ? plaid_bank_list_screen_params.toProto() : null;
        PlaidAuthDto7 plaid_auth_screen_params = this.surrogate.getPlaid_auth_screen_params();
        PlaidAuth6 proto8 = plaid_auth_screen_params != null ? plaid_auth_screen_params.toProto() : null;
        KbaDto7 kba_screen_params = this.surrogate.getKba_screen_params();
        Kba6 proto9 = kba_screen_params != null ? kba_screen_params.toProto() : null;
        EmailChallengeDto9 email_challenge_screen_params = this.surrogate.getEmail_challenge_screen_params();
        EmailChallenge$ScreenParams proto10 = email_challenge_screen_params != null ? email_challenge_screen_params.toProto() : null;
        GKbaDto9 gkba_screen_params = this.surrogate.getGkba_screen_params();
        GKba$ScreenParams proto11 = gkba_screen_params != null ? gkba_screen_params.toProto() : null;
        RequestPhoneCallDto7 request_phone_call_params = this.surrogate.getRequest_phone_call_params();
        RequestPhoneCall5 proto12 = request_phone_call_params != null ? request_phone_call_params.toProto() : null;
        FreezeAccountDto8 freeze_account_screen_params = this.surrogate.getFreeze_account_screen_params();
        FreezeAccount$ScreenParams proto13 = freeze_account_screen_params != null ? freeze_account_screen_params.toProto() : null;
        UnverifiedAccountContactInformationDto9 unverified_account_contact_information_screen_params = this.surrogate.getUnverified_account_contact_information_screen_params();
        UnverifiedAccountContactInformation5 proto14 = unverified_account_contact_information_screen_params != null ? unverified_account_contact_information_screen_params.toProto() : null;
        SupportIntakeCaseConfirmationDto5 support_intake_case_confirmation_screen_params = this.surrogate.getSupport_intake_case_confirmation_screen_params();
        SupportIntakeCaseConfirmation proto15 = support_intake_case_confirmation_screen_params != null ? support_intake_case_confirmation_screen_params.toProto() : null;
        ChecklistDto6 checklist_screen_params = this.surrogate.getChecklist_screen_params();
        return new WorkflowScreen(name, block_id, logging_identifier, layoutFormat, proto, proto2, proto3, proto4, proto5, proto6, proto7, proto8, proto9, proto10, proto11, proto12, proto13, proto14, proto15, checklist_screen_params != null ? checklist_screen_params.toProto() : null, null, 1048576, null);
    }

    public String toString() {
        return "[WorkflowScreenDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof WorkflowScreenDto) && Intrinsics.areEqual(((WorkflowScreenDto) other).surrogate, this.surrogate);
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
    /* compiled from: WorkflowScreenDto.kt */
    @Metadata(m3635d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\bS\b\u0083\b\u0018\u0000 \u008f\u00012\u00020\u0001:\u0004\u0090\u0001\u008f\u0001Bó\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b)\u0010*Bã\u0001\b\u0010\u0012\u0006\u0010,\u001a\u00020+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b)\u0010/J'\u00108\u001a\u0002052\u0006\u00100\u001a\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0001¢\u0006\u0004\b6\u00107J\u0010\u00109\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020+HÖ\u0001¢\u0006\u0004\b;\u0010<J\u001a\u0010?\u001a\u00020>2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b?\u0010@R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010A\u0012\u0004\bD\u0010E\u001a\u0004\bB\u0010CR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010F\u0012\u0004\bH\u0010E\u001a\u0004\bG\u0010:R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010F\u0012\u0004\bJ\u0010E\u001a\u0004\bI\u0010:R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010K\u0012\u0004\bN\u0010E\u001a\u0004\bL\u0010MR\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010O\u0012\u0004\bR\u0010E\u001a\u0004\bP\u0010QR\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010S\u0012\u0004\bV\u0010E\u001a\u0004\bT\u0010UR\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010W\u0012\u0004\bZ\u0010E\u001a\u0004\bX\u0010YR\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010[\u0012\u0004\b^\u0010E\u001a\u0004\b\\\u0010]R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010_\u0012\u0004\bb\u0010E\u001a\u0004\b`\u0010aR\"\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010c\u0012\u0004\bf\u0010E\u001a\u0004\bd\u0010eR\"\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010g\u0012\u0004\bj\u0010E\u001a\u0004\bh\u0010iR\"\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010k\u0012\u0004\bn\u0010E\u001a\u0004\bl\u0010mR\"\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010o\u0012\u0004\br\u0010E\u001a\u0004\bp\u0010qR\"\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010s\u0012\u0004\bv\u0010E\u001a\u0004\bt\u0010uR\"\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010w\u0012\u0004\bz\u0010E\u001a\u0004\bx\u0010yR\"\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010{\u0012\u0004\b~\u0010E\u001a\u0004\b|\u0010}R%\u0010\"\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\u0015\n\u0004\b\"\u0010\u007f\u0012\u0005\b\u0082\u0001\u0010E\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R&\u0010$\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b$\u0010\u0083\u0001\u0012\u0005\b\u0086\u0001\u0010E\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R&\u0010&\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b&\u0010\u0087\u0001\u0012\u0005\b\u008a\u0001\u0010E\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R&\u0010(\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b(\u0010\u008b\u0001\u0012\u0005\b\u008e\u0001\u0010E\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001¨\u0006\u0091\u0001"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$Surrogate;", "", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$NameDto;", "name", "", "block_id", "logging_identifier", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$LayoutFormatDto;", "layout_format", "Lidenti/service/v1/models_workflow/v1/UpdateAppDto$ScreenParamsDto;", "update_app_screen_params", "Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto;", "info_screen_params", "Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ScreenParamsDto;", "contact_support_screen_params", "Lidenti/service/v1/models_workflow/v1/SmsChallengeDto$ScreenParamsDto;", "sms_challenge_screen_params", "Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallengeDto$ScreenParamsDto;", "device_approval_challenge_screen_params", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ScreenParamsDto;", "kyc_status_check_screen_params", "Lidenti/service/v1/models_workflow/v1/PlaidBankListDto$ScreenParamsDto;", "plaid_bank_list_screen_params", "Lidenti/service/v1/models_workflow/v1/PlaidAuthDto$ScreenParamsDto;", "plaid_auth_screen_params", "Lidenti/service/v1/models_workflow/v1/KbaDto$ScreenParamsDto;", "kba_screen_params", "Lidenti/service/v1/models_workflow/v1/EmailChallengeDto$ScreenParamsDto;", "email_challenge_screen_params", "Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto;", "gkba_screen_params", "Lidenti/service/v1/models_workflow/v1/RequestPhoneCallDto$ScreenParamsDto;", "request_phone_call_params", "Lidenti/service/v1/models_workflow/v1/FreezeAccountDto$ScreenParamsDto;", "freeze_account_screen_params", "Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto;", "unverified_account_contact_information_screen_params", "Lidenti/service/v1/models_workflow/v1/SupportIntakeCaseConfirmationDto$ScreenParamsDto;", "support_intake_case_confirmation_screen_params", "Lidenti/service/v1/models_workflow/v1/ChecklistDto$ScreenParamsDto;", "checklist_screen_params", "<init>", "(Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$NameDto;Ljava/lang/String;Ljava/lang/String;Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$LayoutFormatDto;Lidenti/service/v1/models_workflow/v1/UpdateAppDto$ScreenParamsDto;Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto;Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ScreenParamsDto;Lidenti/service/v1/models_workflow/v1/SmsChallengeDto$ScreenParamsDto;Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallengeDto$ScreenParamsDto;Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ScreenParamsDto;Lidenti/service/v1/models_workflow/v1/PlaidBankListDto$ScreenParamsDto;Lidenti/service/v1/models_workflow/v1/PlaidAuthDto$ScreenParamsDto;Lidenti/service/v1/models_workflow/v1/KbaDto$ScreenParamsDto;Lidenti/service/v1/models_workflow/v1/EmailChallengeDto$ScreenParamsDto;Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto;Lidenti/service/v1/models_workflow/v1/RequestPhoneCallDto$ScreenParamsDto;Lidenti/service/v1/models_workflow/v1/FreezeAccountDto$ScreenParamsDto;Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto;Lidenti/service/v1/models_workflow/v1/SupportIntakeCaseConfirmationDto$ScreenParamsDto;Lidenti/service/v1/models_workflow/v1/ChecklistDto$ScreenParamsDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILidenti/service/v1/models_workflow/v1/WorkflowScreenDto$NameDto;Ljava/lang/String;Ljava/lang/String;Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$LayoutFormatDto;Lidenti/service/v1/models_workflow/v1/UpdateAppDto$ScreenParamsDto;Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto;Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ScreenParamsDto;Lidenti/service/v1/models_workflow/v1/SmsChallengeDto$ScreenParamsDto;Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallengeDto$ScreenParamsDto;Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ScreenParamsDto;Lidenti/service/v1/models_workflow/v1/PlaidBankListDto$ScreenParamsDto;Lidenti/service/v1/models_workflow/v1/PlaidAuthDto$ScreenParamsDto;Lidenti/service/v1/models_workflow/v1/KbaDto$ScreenParamsDto;Lidenti/service/v1/models_workflow/v1/EmailChallengeDto$ScreenParamsDto;Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto;Lidenti/service/v1/models_workflow/v1/RequestPhoneCallDto$ScreenParamsDto;Lidenti/service/v1/models_workflow/v1/FreezeAccountDto$ScreenParamsDto;Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto;Lidenti/service/v1/models_workflow/v1/SupportIntakeCaseConfirmationDto$ScreenParamsDto;Lidenti/service/v1/models_workflow/v1/ChecklistDto$ScreenParamsDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identi_v1_models_workflow_v1_externalRelease", "(Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$NameDto;", "getName", "()Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$NameDto;", "getName$annotations", "()V", "Ljava/lang/String;", "getBlock_id", "getBlock_id$annotations", "getLogging_identifier", "getLogging_identifier$annotations", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$LayoutFormatDto;", "getLayout_format", "()Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$LayoutFormatDto;", "getLayout_format$annotations", "Lidenti/service/v1/models_workflow/v1/UpdateAppDto$ScreenParamsDto;", "getUpdate_app_screen_params", "()Lidenti/service/v1/models_workflow/v1/UpdateAppDto$ScreenParamsDto;", "getUpdate_app_screen_params$annotations", "Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto;", "getInfo_screen_params", "()Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto;", "getInfo_screen_params$annotations", "Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ScreenParamsDto;", "getContact_support_screen_params", "()Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ScreenParamsDto;", "getContact_support_screen_params$annotations", "Lidenti/service/v1/models_workflow/v1/SmsChallengeDto$ScreenParamsDto;", "getSms_challenge_screen_params", "()Lidenti/service/v1/models_workflow/v1/SmsChallengeDto$ScreenParamsDto;", "getSms_challenge_screen_params$annotations", "Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallengeDto$ScreenParamsDto;", "getDevice_approval_challenge_screen_params", "()Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallengeDto$ScreenParamsDto;", "getDevice_approval_challenge_screen_params$annotations", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ScreenParamsDto;", "getKyc_status_check_screen_params", "()Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ScreenParamsDto;", "getKyc_status_check_screen_params$annotations", "Lidenti/service/v1/models_workflow/v1/PlaidBankListDto$ScreenParamsDto;", "getPlaid_bank_list_screen_params", "()Lidenti/service/v1/models_workflow/v1/PlaidBankListDto$ScreenParamsDto;", "getPlaid_bank_list_screen_params$annotations", "Lidenti/service/v1/models_workflow/v1/PlaidAuthDto$ScreenParamsDto;", "getPlaid_auth_screen_params", "()Lidenti/service/v1/models_workflow/v1/PlaidAuthDto$ScreenParamsDto;", "getPlaid_auth_screen_params$annotations", "Lidenti/service/v1/models_workflow/v1/KbaDto$ScreenParamsDto;", "getKba_screen_params", "()Lidenti/service/v1/models_workflow/v1/KbaDto$ScreenParamsDto;", "getKba_screen_params$annotations", "Lidenti/service/v1/models_workflow/v1/EmailChallengeDto$ScreenParamsDto;", "getEmail_challenge_screen_params", "()Lidenti/service/v1/models_workflow/v1/EmailChallengeDto$ScreenParamsDto;", "getEmail_challenge_screen_params$annotations", "Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto;", "getGkba_screen_params", "()Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto;", "getGkba_screen_params$annotations", "Lidenti/service/v1/models_workflow/v1/RequestPhoneCallDto$ScreenParamsDto;", "getRequest_phone_call_params", "()Lidenti/service/v1/models_workflow/v1/RequestPhoneCallDto$ScreenParamsDto;", "getRequest_phone_call_params$annotations", "Lidenti/service/v1/models_workflow/v1/FreezeAccountDto$ScreenParamsDto;", "getFreeze_account_screen_params", "()Lidenti/service/v1/models_workflow/v1/FreezeAccountDto$ScreenParamsDto;", "getFreeze_account_screen_params$annotations", "Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto;", "getUnverified_account_contact_information_screen_params", "()Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto;", "getUnverified_account_contact_information_screen_params$annotations", "Lidenti/service/v1/models_workflow/v1/SupportIntakeCaseConfirmationDto$ScreenParamsDto;", "getSupport_intake_case_confirmation_screen_params", "()Lidenti/service/v1/models_workflow/v1/SupportIntakeCaseConfirmationDto$ScreenParamsDto;", "getSupport_intake_case_confirmation_screen_params$annotations", "Lidenti/service/v1/models_workflow/v1/ChecklistDto$ScreenParamsDto;", "getChecklist_screen_params", "()Lidenti/service/v1/models_workflow/v1/ChecklistDto$ScreenParamsDto;", "getChecklist_screen_params$annotations", "Companion", "$serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String block_id;
        private final ChecklistDto6 checklist_screen_params;
        private final ContactSupportDto9 contact_support_screen_params;
        private final DeviceApprovalChallengeDto9 device_approval_challenge_screen_params;
        private final EmailChallengeDto9 email_challenge_screen_params;
        private final FreezeAccountDto8 freeze_account_screen_params;
        private final GKbaDto9 gkba_screen_params;
        private final InfoDto6 info_screen_params;
        private final KbaDto7 kba_screen_params;
        private final KycStatusCheckDto$ScreenParamsDto kyc_status_check_screen_params;
        private final LayoutFormatDto layout_format;
        private final String logging_identifier;
        private final NameDto name;
        private final PlaidAuthDto7 plaid_auth_screen_params;
        private final PlaidBankListDto8 plaid_bank_list_screen_params;
        private final RequestPhoneCallDto7 request_phone_call_params;
        private final SmsChallengeDto9 sms_challenge_screen_params;
        private final SupportIntakeCaseConfirmationDto5 support_intake_case_confirmation_screen_params;
        private final UnverifiedAccountContactInformationDto9 unverified_account_contact_information_screen_params;
        private final UpdateAppDto6 update_app_screen_params;

        public Surrogate() {
            this((NameDto) null, (String) null, (String) null, (LayoutFormatDto) null, (UpdateAppDto6) null, (InfoDto6) null, (ContactSupportDto9) null, (SmsChallengeDto9) null, (DeviceApprovalChallengeDto9) null, (KycStatusCheckDto$ScreenParamsDto) null, (PlaidBankListDto8) null, (PlaidAuthDto7) null, (KbaDto7) null, (EmailChallengeDto9) null, (GKbaDto9) null, (RequestPhoneCallDto7) null, (FreezeAccountDto8) null, (UnverifiedAccountContactInformationDto9) null, (SupportIntakeCaseConfirmationDto5) null, (ChecklistDto6) null, 1048575, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.name == surrogate.name && Intrinsics.areEqual(this.block_id, surrogate.block_id) && Intrinsics.areEqual(this.logging_identifier, surrogate.logging_identifier) && this.layout_format == surrogate.layout_format && Intrinsics.areEqual(this.update_app_screen_params, surrogate.update_app_screen_params) && Intrinsics.areEqual(this.info_screen_params, surrogate.info_screen_params) && Intrinsics.areEqual(this.contact_support_screen_params, surrogate.contact_support_screen_params) && Intrinsics.areEqual(this.sms_challenge_screen_params, surrogate.sms_challenge_screen_params) && Intrinsics.areEqual(this.device_approval_challenge_screen_params, surrogate.device_approval_challenge_screen_params) && Intrinsics.areEqual(this.kyc_status_check_screen_params, surrogate.kyc_status_check_screen_params) && Intrinsics.areEqual(this.plaid_bank_list_screen_params, surrogate.plaid_bank_list_screen_params) && Intrinsics.areEqual(this.plaid_auth_screen_params, surrogate.plaid_auth_screen_params) && Intrinsics.areEqual(this.kba_screen_params, surrogate.kba_screen_params) && Intrinsics.areEqual(this.email_challenge_screen_params, surrogate.email_challenge_screen_params) && Intrinsics.areEqual(this.gkba_screen_params, surrogate.gkba_screen_params) && Intrinsics.areEqual(this.request_phone_call_params, surrogate.request_phone_call_params) && Intrinsics.areEqual(this.freeze_account_screen_params, surrogate.freeze_account_screen_params) && Intrinsics.areEqual(this.unverified_account_contact_information_screen_params, surrogate.unverified_account_contact_information_screen_params) && Intrinsics.areEqual(this.support_intake_case_confirmation_screen_params, surrogate.support_intake_case_confirmation_screen_params) && Intrinsics.areEqual(this.checklist_screen_params, surrogate.checklist_screen_params);
        }

        public int hashCode() {
            int iHashCode = ((this.name.hashCode() * 31) + this.block_id.hashCode()) * 31;
            String str = this.logging_identifier;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            LayoutFormatDto layoutFormatDto = this.layout_format;
            int iHashCode3 = (iHashCode2 + (layoutFormatDto == null ? 0 : layoutFormatDto.hashCode())) * 31;
            UpdateAppDto6 updateAppDto6 = this.update_app_screen_params;
            int iHashCode4 = (iHashCode3 + (updateAppDto6 == null ? 0 : updateAppDto6.hashCode())) * 31;
            InfoDto6 infoDto6 = this.info_screen_params;
            int iHashCode5 = (iHashCode4 + (infoDto6 == null ? 0 : infoDto6.hashCode())) * 31;
            ContactSupportDto9 contactSupportDto9 = this.contact_support_screen_params;
            int iHashCode6 = (iHashCode5 + (contactSupportDto9 == null ? 0 : contactSupportDto9.hashCode())) * 31;
            SmsChallengeDto9 smsChallengeDto9 = this.sms_challenge_screen_params;
            int iHashCode7 = (iHashCode6 + (smsChallengeDto9 == null ? 0 : smsChallengeDto9.hashCode())) * 31;
            DeviceApprovalChallengeDto9 deviceApprovalChallengeDto9 = this.device_approval_challenge_screen_params;
            int iHashCode8 = (iHashCode7 + (deviceApprovalChallengeDto9 == null ? 0 : deviceApprovalChallengeDto9.hashCode())) * 31;
            KycStatusCheckDto$ScreenParamsDto kycStatusCheckDto$ScreenParamsDto = this.kyc_status_check_screen_params;
            int iHashCode9 = (iHashCode8 + (kycStatusCheckDto$ScreenParamsDto == null ? 0 : kycStatusCheckDto$ScreenParamsDto.hashCode())) * 31;
            PlaidBankListDto8 plaidBankListDto8 = this.plaid_bank_list_screen_params;
            int iHashCode10 = (iHashCode9 + (plaidBankListDto8 == null ? 0 : plaidBankListDto8.hashCode())) * 31;
            PlaidAuthDto7 plaidAuthDto7 = this.plaid_auth_screen_params;
            int iHashCode11 = (iHashCode10 + (plaidAuthDto7 == null ? 0 : plaidAuthDto7.hashCode())) * 31;
            KbaDto7 kbaDto7 = this.kba_screen_params;
            int iHashCode12 = (iHashCode11 + (kbaDto7 == null ? 0 : kbaDto7.hashCode())) * 31;
            EmailChallengeDto9 emailChallengeDto9 = this.email_challenge_screen_params;
            int iHashCode13 = (iHashCode12 + (emailChallengeDto9 == null ? 0 : emailChallengeDto9.hashCode())) * 31;
            GKbaDto9 gKbaDto9 = this.gkba_screen_params;
            int iHashCode14 = (iHashCode13 + (gKbaDto9 == null ? 0 : gKbaDto9.hashCode())) * 31;
            RequestPhoneCallDto7 requestPhoneCallDto7 = this.request_phone_call_params;
            int iHashCode15 = (iHashCode14 + (requestPhoneCallDto7 == null ? 0 : requestPhoneCallDto7.hashCode())) * 31;
            FreezeAccountDto8 freezeAccountDto8 = this.freeze_account_screen_params;
            int iHashCode16 = (iHashCode15 + (freezeAccountDto8 == null ? 0 : freezeAccountDto8.hashCode())) * 31;
            UnverifiedAccountContactInformationDto9 unverifiedAccountContactInformationDto9 = this.unverified_account_contact_information_screen_params;
            int iHashCode17 = (iHashCode16 + (unverifiedAccountContactInformationDto9 == null ? 0 : unverifiedAccountContactInformationDto9.hashCode())) * 31;
            SupportIntakeCaseConfirmationDto5 supportIntakeCaseConfirmationDto5 = this.support_intake_case_confirmation_screen_params;
            int iHashCode18 = (iHashCode17 + (supportIntakeCaseConfirmationDto5 == null ? 0 : supportIntakeCaseConfirmationDto5.hashCode())) * 31;
            ChecklistDto6 checklistDto6 = this.checklist_screen_params;
            return iHashCode18 + (checklistDto6 != null ? checklistDto6.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(name=" + this.name + ", block_id=" + this.block_id + ", logging_identifier=" + this.logging_identifier + ", layout_format=" + this.layout_format + ", update_app_screen_params=" + this.update_app_screen_params + ", info_screen_params=" + this.info_screen_params + ", contact_support_screen_params=" + this.contact_support_screen_params + ", sms_challenge_screen_params=" + this.sms_challenge_screen_params + ", device_approval_challenge_screen_params=" + this.device_approval_challenge_screen_params + ", kyc_status_check_screen_params=" + this.kyc_status_check_screen_params + ", plaid_bank_list_screen_params=" + this.plaid_bank_list_screen_params + ", plaid_auth_screen_params=" + this.plaid_auth_screen_params + ", kba_screen_params=" + this.kba_screen_params + ", email_challenge_screen_params=" + this.email_challenge_screen_params + ", gkba_screen_params=" + this.gkba_screen_params + ", request_phone_call_params=" + this.request_phone_call_params + ", freeze_account_screen_params=" + this.freeze_account_screen_params + ", unverified_account_contact_information_screen_params=" + this.unverified_account_contact_information_screen_params + ", support_intake_case_confirmation_screen_params=" + this.support_intake_case_confirmation_screen_params + ", checklist_screen_params=" + this.checklist_screen_params + ")";
        }

        /* compiled from: WorkflowScreenDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$Surrogate;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return WorkflowScreenDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, NameDto nameDto, String str, String str2, LayoutFormatDto layoutFormatDto, UpdateAppDto6 updateAppDto6, InfoDto6 infoDto6, ContactSupportDto9 contactSupportDto9, SmsChallengeDto9 smsChallengeDto9, DeviceApprovalChallengeDto9 deviceApprovalChallengeDto9, KycStatusCheckDto$ScreenParamsDto kycStatusCheckDto$ScreenParamsDto, PlaidBankListDto8 plaidBankListDto8, PlaidAuthDto7 plaidAuthDto7, KbaDto7 kbaDto7, EmailChallengeDto9 emailChallengeDto9, GKbaDto9 gKbaDto9, RequestPhoneCallDto7 requestPhoneCallDto7, FreezeAccountDto8 freezeAccountDto8, UnverifiedAccountContactInformationDto9 unverifiedAccountContactInformationDto9, SupportIntakeCaseConfirmationDto5 supportIntakeCaseConfirmationDto5, ChecklistDto6 checklistDto6, SerializationConstructorMarker serializationConstructorMarker) {
            this.name = (i & 1) == 0 ? NameDto.INSTANCE.getZeroValue() : nameDto;
            if ((i & 2) == 0) {
                this.block_id = "";
            } else {
                this.block_id = str;
            }
            if ((i & 4) == 0) {
                this.logging_identifier = null;
            } else {
                this.logging_identifier = str2;
            }
            if ((i & 8) == 0) {
                this.layout_format = null;
            } else {
                this.layout_format = layoutFormatDto;
            }
            if ((i & 16) == 0) {
                this.update_app_screen_params = null;
            } else {
                this.update_app_screen_params = updateAppDto6;
            }
            if ((i & 32) == 0) {
                this.info_screen_params = null;
            } else {
                this.info_screen_params = infoDto6;
            }
            if ((i & 64) == 0) {
                this.contact_support_screen_params = null;
            } else {
                this.contact_support_screen_params = contactSupportDto9;
            }
            if ((i & 128) == 0) {
                this.sms_challenge_screen_params = null;
            } else {
                this.sms_challenge_screen_params = smsChallengeDto9;
            }
            if ((i & 256) == 0) {
                this.device_approval_challenge_screen_params = null;
            } else {
                this.device_approval_challenge_screen_params = deviceApprovalChallengeDto9;
            }
            if ((i & 512) == 0) {
                this.kyc_status_check_screen_params = null;
            } else {
                this.kyc_status_check_screen_params = kycStatusCheckDto$ScreenParamsDto;
            }
            if ((i & 1024) == 0) {
                this.plaid_bank_list_screen_params = null;
            } else {
                this.plaid_bank_list_screen_params = plaidBankListDto8;
            }
            if ((i & 2048) == 0) {
                this.plaid_auth_screen_params = null;
            } else {
                this.plaid_auth_screen_params = plaidAuthDto7;
            }
            if ((i & 4096) == 0) {
                this.kba_screen_params = null;
            } else {
                this.kba_screen_params = kbaDto7;
            }
            if ((i & 8192) == 0) {
                this.email_challenge_screen_params = null;
            } else {
                this.email_challenge_screen_params = emailChallengeDto9;
            }
            if ((i & 16384) == 0) {
                this.gkba_screen_params = null;
            } else {
                this.gkba_screen_params = gKbaDto9;
            }
            if ((32768 & i) == 0) {
                this.request_phone_call_params = null;
            } else {
                this.request_phone_call_params = requestPhoneCallDto7;
            }
            if ((65536 & i) == 0) {
                this.freeze_account_screen_params = null;
            } else {
                this.freeze_account_screen_params = freezeAccountDto8;
            }
            if ((131072 & i) == 0) {
                this.unverified_account_contact_information_screen_params = null;
            } else {
                this.unverified_account_contact_information_screen_params = unverifiedAccountContactInformationDto9;
            }
            if ((262144 & i) == 0) {
                this.support_intake_case_confirmation_screen_params = null;
            } else {
                this.support_intake_case_confirmation_screen_params = supportIntakeCaseConfirmationDto5;
            }
            if ((i & 524288) == 0) {
                this.checklist_screen_params = null;
            } else {
                this.checklist_screen_params = checklistDto6;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$identi_v1_models_workflow_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.name != NameDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, NameDto.Serializer.INSTANCE, self.name);
            }
            if (!Intrinsics.areEqual(self.block_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.block_id);
            }
            String str = self.logging_identifier;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, str);
            }
            LayoutFormatDto layoutFormatDto = self.layout_format;
            if (layoutFormatDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, LayoutFormatDto.Serializer.INSTANCE, layoutFormatDto);
            }
            UpdateAppDto6 updateAppDto6 = self.update_app_screen_params;
            if (updateAppDto6 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, UpdateAppDto6.Serializer.INSTANCE, updateAppDto6);
            }
            InfoDto6 infoDto6 = self.info_screen_params;
            if (infoDto6 != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, InfoDto6.Serializer.INSTANCE, infoDto6);
            }
            ContactSupportDto9 contactSupportDto9 = self.contact_support_screen_params;
            if (contactSupportDto9 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, ContactSupportDto9.Serializer.INSTANCE, contactSupportDto9);
            }
            SmsChallengeDto9 smsChallengeDto9 = self.sms_challenge_screen_params;
            if (smsChallengeDto9 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, SmsChallengeDto9.Serializer.INSTANCE, smsChallengeDto9);
            }
            DeviceApprovalChallengeDto9 deviceApprovalChallengeDto9 = self.device_approval_challenge_screen_params;
            if (deviceApprovalChallengeDto9 != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, DeviceApprovalChallengeDto9.Serializer.INSTANCE, deviceApprovalChallengeDto9);
            }
            KycStatusCheckDto$ScreenParamsDto kycStatusCheckDto$ScreenParamsDto = self.kyc_status_check_screen_params;
            if (kycStatusCheckDto$ScreenParamsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, KycStatusCheckDto$ScreenParamsDto.Serializer.INSTANCE, kycStatusCheckDto$ScreenParamsDto);
            }
            PlaidBankListDto8 plaidBankListDto8 = self.plaid_bank_list_screen_params;
            if (plaidBankListDto8 != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, PlaidBankListDto8.Serializer.INSTANCE, plaidBankListDto8);
            }
            PlaidAuthDto7 plaidAuthDto7 = self.plaid_auth_screen_params;
            if (plaidAuthDto7 != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, PlaidAuthDto7.Serializer.INSTANCE, plaidAuthDto7);
            }
            KbaDto7 kbaDto7 = self.kba_screen_params;
            if (kbaDto7 != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, KbaDto7.Serializer.INSTANCE, kbaDto7);
            }
            EmailChallengeDto9 emailChallengeDto9 = self.email_challenge_screen_params;
            if (emailChallengeDto9 != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, EmailChallengeDto9.Serializer.INSTANCE, emailChallengeDto9);
            }
            GKbaDto9 gKbaDto9 = self.gkba_screen_params;
            if (gKbaDto9 != null) {
                output.encodeNullableSerializableElement(serialDesc, 14, GKbaDto9.Serializer.INSTANCE, gKbaDto9);
            }
            RequestPhoneCallDto7 requestPhoneCallDto7 = self.request_phone_call_params;
            if (requestPhoneCallDto7 != null) {
                output.encodeNullableSerializableElement(serialDesc, 15, RequestPhoneCallDto7.Serializer.INSTANCE, requestPhoneCallDto7);
            }
            FreezeAccountDto8 freezeAccountDto8 = self.freeze_account_screen_params;
            if (freezeAccountDto8 != null) {
                output.encodeNullableSerializableElement(serialDesc, 16, FreezeAccountDto8.Serializer.INSTANCE, freezeAccountDto8);
            }
            UnverifiedAccountContactInformationDto9 unverifiedAccountContactInformationDto9 = self.unverified_account_contact_information_screen_params;
            if (unverifiedAccountContactInformationDto9 != null) {
                output.encodeNullableSerializableElement(serialDesc, 17, UnverifiedAccountContactInformationDto9.Serializer.INSTANCE, unverifiedAccountContactInformationDto9);
            }
            SupportIntakeCaseConfirmationDto5 supportIntakeCaseConfirmationDto5 = self.support_intake_case_confirmation_screen_params;
            if (supportIntakeCaseConfirmationDto5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 18, SupportIntakeCaseConfirmationDto5.Serializer.INSTANCE, supportIntakeCaseConfirmationDto5);
            }
            ChecklistDto6 checklistDto6 = self.checklist_screen_params;
            if (checklistDto6 != null) {
                output.encodeNullableSerializableElement(serialDesc, 19, ChecklistDto6.Serializer.INSTANCE, checklistDto6);
            }
        }

        public Surrogate(NameDto name, String block_id, String str, LayoutFormatDto layoutFormatDto, UpdateAppDto6 updateAppDto6, InfoDto6 infoDto6, ContactSupportDto9 contactSupportDto9, SmsChallengeDto9 smsChallengeDto9, DeviceApprovalChallengeDto9 deviceApprovalChallengeDto9, KycStatusCheckDto$ScreenParamsDto kycStatusCheckDto$ScreenParamsDto, PlaidBankListDto8 plaidBankListDto8, PlaidAuthDto7 plaidAuthDto7, KbaDto7 kbaDto7, EmailChallengeDto9 emailChallengeDto9, GKbaDto9 gKbaDto9, RequestPhoneCallDto7 requestPhoneCallDto7, FreezeAccountDto8 freezeAccountDto8, UnverifiedAccountContactInformationDto9 unverifiedAccountContactInformationDto9, SupportIntakeCaseConfirmationDto5 supportIntakeCaseConfirmationDto5, ChecklistDto6 checklistDto6) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(block_id, "block_id");
            this.name = name;
            this.block_id = block_id;
            this.logging_identifier = str;
            this.layout_format = layoutFormatDto;
            this.update_app_screen_params = updateAppDto6;
            this.info_screen_params = infoDto6;
            this.contact_support_screen_params = contactSupportDto9;
            this.sms_challenge_screen_params = smsChallengeDto9;
            this.device_approval_challenge_screen_params = deviceApprovalChallengeDto9;
            this.kyc_status_check_screen_params = kycStatusCheckDto$ScreenParamsDto;
            this.plaid_bank_list_screen_params = plaidBankListDto8;
            this.plaid_auth_screen_params = plaidAuthDto7;
            this.kba_screen_params = kbaDto7;
            this.email_challenge_screen_params = emailChallengeDto9;
            this.gkba_screen_params = gKbaDto9;
            this.request_phone_call_params = requestPhoneCallDto7;
            this.freeze_account_screen_params = freezeAccountDto8;
            this.unverified_account_contact_information_screen_params = unverifiedAccountContactInformationDto9;
            this.support_intake_case_confirmation_screen_params = supportIntakeCaseConfirmationDto5;
            this.checklist_screen_params = checklistDto6;
        }

        public final NameDto getName() {
            return this.name;
        }

        public /* synthetic */ Surrogate(NameDto nameDto, String str, String str2, LayoutFormatDto layoutFormatDto, UpdateAppDto6 updateAppDto6, InfoDto6 infoDto6, ContactSupportDto9 contactSupportDto9, SmsChallengeDto9 smsChallengeDto9, DeviceApprovalChallengeDto9 deviceApprovalChallengeDto9, KycStatusCheckDto$ScreenParamsDto kycStatusCheckDto$ScreenParamsDto, PlaidBankListDto8 plaidBankListDto8, PlaidAuthDto7 plaidAuthDto7, KbaDto7 kbaDto7, EmailChallengeDto9 emailChallengeDto9, GKbaDto9 gKbaDto9, RequestPhoneCallDto7 requestPhoneCallDto7, FreezeAccountDto8 freezeAccountDto8, UnverifiedAccountContactInformationDto9 unverifiedAccountContactInformationDto9, SupportIntakeCaseConfirmationDto5 supportIntakeCaseConfirmationDto5, ChecklistDto6 checklistDto6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? NameDto.INSTANCE.getZeroValue() : nameDto, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : layoutFormatDto, (i & 16) != 0 ? null : updateAppDto6, (i & 32) != 0 ? null : infoDto6, (i & 64) != 0 ? null : contactSupportDto9, (i & 128) != 0 ? null : smsChallengeDto9, (i & 256) != 0 ? null : deviceApprovalChallengeDto9, (i & 512) != 0 ? null : kycStatusCheckDto$ScreenParamsDto, (i & 1024) != 0 ? null : plaidBankListDto8, (i & 2048) != 0 ? null : plaidAuthDto7, (i & 4096) != 0 ? null : kbaDto7, (i & 8192) != 0 ? null : emailChallengeDto9, (i & 16384) != 0 ? null : gKbaDto9, (i & 32768) != 0 ? null : requestPhoneCallDto7, (i & 65536) != 0 ? null : freezeAccountDto8, (i & 131072) != 0 ? null : unverifiedAccountContactInformationDto9, (i & 262144) != 0 ? null : supportIntakeCaseConfirmationDto5, (i & 524288) != 0 ? null : checklistDto6);
        }

        public final String getBlock_id() {
            return this.block_id;
        }

        public final String getLogging_identifier() {
            return this.logging_identifier;
        }

        public final LayoutFormatDto getLayout_format() {
            return this.layout_format;
        }

        public final UpdateAppDto6 getUpdate_app_screen_params() {
            return this.update_app_screen_params;
        }

        public final InfoDto6 getInfo_screen_params() {
            return this.info_screen_params;
        }

        public final ContactSupportDto9 getContact_support_screen_params() {
            return this.contact_support_screen_params;
        }

        public final SmsChallengeDto9 getSms_challenge_screen_params() {
            return this.sms_challenge_screen_params;
        }

        public final DeviceApprovalChallengeDto9 getDevice_approval_challenge_screen_params() {
            return this.device_approval_challenge_screen_params;
        }

        public final KycStatusCheckDto$ScreenParamsDto getKyc_status_check_screen_params() {
            return this.kyc_status_check_screen_params;
        }

        public final PlaidBankListDto8 getPlaid_bank_list_screen_params() {
            return this.plaid_bank_list_screen_params;
        }

        public final PlaidAuthDto7 getPlaid_auth_screen_params() {
            return this.plaid_auth_screen_params;
        }

        public final KbaDto7 getKba_screen_params() {
            return this.kba_screen_params;
        }

        public final EmailChallengeDto9 getEmail_challenge_screen_params() {
            return this.email_challenge_screen_params;
        }

        public final GKbaDto9 getGkba_screen_params() {
            return this.gkba_screen_params;
        }

        public final RequestPhoneCallDto7 getRequest_phone_call_params() {
            return this.request_phone_call_params;
        }

        public final FreezeAccountDto8 getFreeze_account_screen_params() {
            return this.freeze_account_screen_params;
        }

        public final UnverifiedAccountContactInformationDto9 getUnverified_account_contact_information_screen_params() {
            return this.unverified_account_contact_information_screen_params;
        }

        public final SupportIntakeCaseConfirmationDto5 getSupport_intake_case_confirmation_screen_params() {
            return this.support_intake_case_confirmation_screen_params;
        }

        public final ChecklistDto6 getChecklist_screen_params() {
            return this.checklist_screen_params;
        }
    }

    /* compiled from: WorkflowScreenDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto;", "Lidenti/service/v1/models_workflow/v1/WorkflowScreen;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<WorkflowScreenDto, WorkflowScreen> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<WorkflowScreenDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<WorkflowScreenDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<WorkflowScreenDto> getBinaryBase64Serializer() {
            return (KSerializer) WorkflowScreenDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<WorkflowScreen> getProtoAdapter() {
            return WorkflowScreen.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public WorkflowScreenDto getZeroValue() {
            return WorkflowScreenDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public WorkflowScreenDto fromProto(WorkflowScreen proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            NameDto nameDtoFromProto = NameDto.INSTANCE.fromProto(proto.getName());
            String block_id = proto.getBlock_id();
            String logging_identifier = proto.getLogging_identifier();
            WorkflowScreen.LayoutFormat layout_format = proto.getLayout_format();
            DefaultConstructorMarker defaultConstructorMarker = null;
            LayoutFormatDto layoutFormatDtoFromProto = layout_format != null ? LayoutFormatDto.INSTANCE.fromProto(layout_format) : null;
            UpdateApp5 update_app_screen_params = proto.getUpdate_app_screen_params();
            UpdateAppDto6 updateAppDto6FromProto = update_app_screen_params != null ? UpdateAppDto6.INSTANCE.fromProto(update_app_screen_params) : null;
            Info$ScreenParams info_screen_params = proto.getInfo_screen_params();
            InfoDto6 infoDto6FromProto = info_screen_params != null ? InfoDto6.INSTANCE.fromProto(info_screen_params) : null;
            ContactSupport$ScreenParams contact_support_screen_params = proto.getContact_support_screen_params();
            ContactSupportDto9 contactSupportDto9FromProto = contact_support_screen_params != null ? ContactSupportDto9.INSTANCE.fromProto(contact_support_screen_params) : null;
            SmsChallenge$ScreenParams sms_challenge_screen_params = proto.getSms_challenge_screen_params();
            SmsChallengeDto9 smsChallengeDto9FromProto = sms_challenge_screen_params != null ? SmsChallengeDto9.INSTANCE.fromProto(sms_challenge_screen_params) : null;
            DeviceApprovalChallenge$ScreenParams device_approval_challenge_screen_params = proto.getDevice_approval_challenge_screen_params();
            DeviceApprovalChallengeDto9 deviceApprovalChallengeDto9FromProto = device_approval_challenge_screen_params != null ? DeviceApprovalChallengeDto9.INSTANCE.fromProto(device_approval_challenge_screen_params) : null;
            KycStatusCheck$ScreenParams kyc_status_check_screen_params = proto.getKyc_status_check_screen_params();
            KycStatusCheckDto$ScreenParamsDto kycStatusCheckDto$ScreenParamsDtoFromProto = kyc_status_check_screen_params != null ? KycStatusCheckDto$ScreenParamsDto.INSTANCE.fromProto(kyc_status_check_screen_params) : null;
            PlaidBankList$ScreenParams plaid_bank_list_screen_params = proto.getPlaid_bank_list_screen_params();
            PlaidBankListDto8 plaidBankListDto8FromProto = plaid_bank_list_screen_params != null ? PlaidBankListDto8.INSTANCE.fromProto(plaid_bank_list_screen_params) : null;
            PlaidAuth6 plaid_auth_screen_params = proto.getPlaid_auth_screen_params();
            PlaidAuthDto7 plaidAuthDto7FromProto = plaid_auth_screen_params != null ? PlaidAuthDto7.INSTANCE.fromProto(plaid_auth_screen_params) : null;
            Kba6 kba_screen_params = proto.getKba_screen_params();
            KbaDto7 kbaDto7FromProto = kba_screen_params != null ? KbaDto7.INSTANCE.fromProto(kba_screen_params) : null;
            EmailChallenge$ScreenParams email_challenge_screen_params = proto.getEmail_challenge_screen_params();
            EmailChallengeDto9 emailChallengeDto9FromProto = email_challenge_screen_params != null ? EmailChallengeDto9.INSTANCE.fromProto(email_challenge_screen_params) : null;
            GKba$ScreenParams gkba_screen_params = proto.getGkba_screen_params();
            GKbaDto9 gKbaDto9FromProto = gkba_screen_params != null ? GKbaDto9.INSTANCE.fromProto(gkba_screen_params) : null;
            RequestPhoneCall5 request_phone_call_params = proto.getRequest_phone_call_params();
            RequestPhoneCallDto7 requestPhoneCallDto7FromProto = request_phone_call_params != null ? RequestPhoneCallDto7.INSTANCE.fromProto(request_phone_call_params) : null;
            FreezeAccount$ScreenParams freeze_account_screen_params = proto.getFreeze_account_screen_params();
            FreezeAccountDto8 freezeAccountDto8FromProto = freeze_account_screen_params != null ? FreezeAccountDto8.INSTANCE.fromProto(freeze_account_screen_params) : null;
            UnverifiedAccountContactInformation5 unverified_account_contact_information_screen_params = proto.getUnverified_account_contact_information_screen_params();
            UnverifiedAccountContactInformationDto9 unverifiedAccountContactInformationDto9FromProto = unverified_account_contact_information_screen_params != null ? UnverifiedAccountContactInformationDto9.INSTANCE.fromProto(unverified_account_contact_information_screen_params) : null;
            SupportIntakeCaseConfirmation support_intake_case_confirmation_screen_params = proto.getSupport_intake_case_confirmation_screen_params();
            SupportIntakeCaseConfirmationDto5 supportIntakeCaseConfirmationDto5FromProto = support_intake_case_confirmation_screen_params != null ? SupportIntakeCaseConfirmationDto5.INSTANCE.fromProto(support_intake_case_confirmation_screen_params) : null;
            Checklist7 checklist_screen_params = proto.getChecklist_screen_params();
            return new WorkflowScreenDto(new Surrogate(nameDtoFromProto, block_id, logging_identifier, layoutFormatDtoFromProto, updateAppDto6FromProto, infoDto6FromProto, contactSupportDto9FromProto, smsChallengeDto9FromProto, deviceApprovalChallengeDto9FromProto, kycStatusCheckDto$ScreenParamsDtoFromProto, plaidBankListDto8FromProto, plaidAuthDto7FromProto, kbaDto7FromProto, emailChallengeDto9FromProto, gKbaDto9FromProto, requestPhoneCallDto7FromProto, freezeAccountDto8FromProto, unverifiedAccountContactInformationDto9FromProto, supportIntakeCaseConfirmationDto5FromProto, checklist_screen_params != null ? ChecklistDto6.INSTANCE.fromProto(checklist_screen_params) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: identi.service.v1.models_workflow.v1.WorkflowScreenDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WorkflowScreenDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new WorkflowScreenDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: WorkflowScreenDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00142\u00020\u0001:\u0011\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0010\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$¨\u0006%"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "UpdateAppScreenParams", "InfoScreenParams", "ContactSupportScreenParams", "SmsChallengeScreenParams", "DeviceApprovalChallengeScreenParams", "KycStatusCheckScreenParams", "PlaidBankListScreenParams", "PlaidAuthScreenParams", "KbaScreenParams", "EmailChallengeScreenParams", "GkbaScreenParams", "RequestPhoneCallParams", "FreezeAccountScreenParams", "UnverifiedAccountContactInformationScreenParams", "SupportIntakeCaseConfirmationScreenParams", "ChecklistScreenParams", "Companion", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto$ChecklistScreenParams;", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto$ContactSupportScreenParams;", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto$DeviceApprovalChallengeScreenParams;", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto$EmailChallengeScreenParams;", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto$FreezeAccountScreenParams;", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto$GkbaScreenParams;", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto$InfoScreenParams;", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto$KbaScreenParams;", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto$KycStatusCheckScreenParams;", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto$PlaidAuthScreenParams;", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto$PlaidBankListScreenParams;", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto$RequestPhoneCallParams;", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto$SmsChallengeScreenParams;", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto$SupportIntakeCaseConfirmationScreenParams;", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto$UnverifiedAccountContactInformationScreenParams;", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto$UpdateAppScreenParams;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class ParamsDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ ParamsDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ParamsDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: WorkflowScreenDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto$UpdateAppScreenParams;", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto;", "Lidenti/service/v1/models_workflow/v1/UpdateAppDto$ScreenParamsDto;", "value", "<init>", "(Lidenti/service/v1/models_workflow/v1/UpdateAppDto$ScreenParamsDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/UpdateAppDto$ScreenParamsDto;", "getValue", "()Lidenti/service/v1/models_workflow/v1/UpdateAppDto$ScreenParamsDto;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class UpdateAppScreenParams extends ParamsDto {
            private final UpdateAppDto6 value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UpdateAppScreenParams) && Intrinsics.areEqual(this.value, ((UpdateAppScreenParams) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "UpdateAppScreenParams(value=" + this.value + ")";
            }

            public final UpdateAppDto6 getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpdateAppScreenParams(UpdateAppDto6 value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: WorkflowScreenDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto$InfoScreenParams;", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto;", "Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto;", "value", "<init>", "(Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto;", "getValue", "()Lidenti/service/v1/models_workflow/v1/InfoDto$ScreenParamsDto;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class InfoScreenParams extends ParamsDto {
            private final InfoDto6 value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof InfoScreenParams) && Intrinsics.areEqual(this.value, ((InfoScreenParams) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "InfoScreenParams(value=" + this.value + ")";
            }

            public final InfoDto6 getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InfoScreenParams(InfoDto6 value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: WorkflowScreenDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto$ContactSupportScreenParams;", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto;", "Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ScreenParamsDto;", "value", "<init>", "(Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ScreenParamsDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ScreenParamsDto;", "getValue", "()Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ScreenParamsDto;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ContactSupportScreenParams extends ParamsDto {
            private final ContactSupportDto9 value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ContactSupportScreenParams) && Intrinsics.areEqual(this.value, ((ContactSupportScreenParams) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ContactSupportScreenParams(value=" + this.value + ")";
            }

            public final ContactSupportDto9 getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ContactSupportScreenParams(ContactSupportDto9 value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: WorkflowScreenDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto$SmsChallengeScreenParams;", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto;", "Lidenti/service/v1/models_workflow/v1/SmsChallengeDto$ScreenParamsDto;", "value", "<init>", "(Lidenti/service/v1/models_workflow/v1/SmsChallengeDto$ScreenParamsDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/SmsChallengeDto$ScreenParamsDto;", "getValue", "()Lidenti/service/v1/models_workflow/v1/SmsChallengeDto$ScreenParamsDto;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SmsChallengeScreenParams extends ParamsDto {
            private final SmsChallengeDto9 value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SmsChallengeScreenParams) && Intrinsics.areEqual(this.value, ((SmsChallengeScreenParams) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "SmsChallengeScreenParams(value=" + this.value + ")";
            }

            public final SmsChallengeDto9 getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SmsChallengeScreenParams(SmsChallengeDto9 value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: WorkflowScreenDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto$DeviceApprovalChallengeScreenParams;", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto;", "Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallengeDto$ScreenParamsDto;", "value", "<init>", "(Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallengeDto$ScreenParamsDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallengeDto$ScreenParamsDto;", "getValue", "()Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallengeDto$ScreenParamsDto;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class DeviceApprovalChallengeScreenParams extends ParamsDto {
            private final DeviceApprovalChallengeDto9 value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DeviceApprovalChallengeScreenParams) && Intrinsics.areEqual(this.value, ((DeviceApprovalChallengeScreenParams) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "DeviceApprovalChallengeScreenParams(value=" + this.value + ")";
            }

            public final DeviceApprovalChallengeDto9 getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DeviceApprovalChallengeScreenParams(DeviceApprovalChallengeDto9 value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: WorkflowScreenDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto$KycStatusCheckScreenParams;", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto;", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ScreenParamsDto;", "value", "<init>", "(Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ScreenParamsDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ScreenParamsDto;", "getValue", "()Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ScreenParamsDto;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class KycStatusCheckScreenParams extends ParamsDto {
            private final KycStatusCheckDto$ScreenParamsDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof KycStatusCheckScreenParams) && Intrinsics.areEqual(this.value, ((KycStatusCheckScreenParams) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "KycStatusCheckScreenParams(value=" + this.value + ")";
            }

            public final KycStatusCheckDto$ScreenParamsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public KycStatusCheckScreenParams(KycStatusCheckDto$ScreenParamsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: WorkflowScreenDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto$PlaidBankListScreenParams;", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto;", "Lidenti/service/v1/models_workflow/v1/PlaidBankListDto$ScreenParamsDto;", "value", "<init>", "(Lidenti/service/v1/models_workflow/v1/PlaidBankListDto$ScreenParamsDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/PlaidBankListDto$ScreenParamsDto;", "getValue", "()Lidenti/service/v1/models_workflow/v1/PlaidBankListDto$ScreenParamsDto;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PlaidBankListScreenParams extends ParamsDto {
            private final PlaidBankListDto8 value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PlaidBankListScreenParams) && Intrinsics.areEqual(this.value, ((PlaidBankListScreenParams) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "PlaidBankListScreenParams(value=" + this.value + ")";
            }

            public final PlaidBankListDto8 getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PlaidBankListScreenParams(PlaidBankListDto8 value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: WorkflowScreenDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto$PlaidAuthScreenParams;", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto;", "Lidenti/service/v1/models_workflow/v1/PlaidAuthDto$ScreenParamsDto;", "value", "<init>", "(Lidenti/service/v1/models_workflow/v1/PlaidAuthDto$ScreenParamsDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/PlaidAuthDto$ScreenParamsDto;", "getValue", "()Lidenti/service/v1/models_workflow/v1/PlaidAuthDto$ScreenParamsDto;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PlaidAuthScreenParams extends ParamsDto {
            private final PlaidAuthDto7 value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PlaidAuthScreenParams) && Intrinsics.areEqual(this.value, ((PlaidAuthScreenParams) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "PlaidAuthScreenParams(value=" + this.value + ")";
            }

            public final PlaidAuthDto7 getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PlaidAuthScreenParams(PlaidAuthDto7 value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: WorkflowScreenDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto$KbaScreenParams;", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto;", "Lidenti/service/v1/models_workflow/v1/KbaDto$ScreenParamsDto;", "value", "<init>", "(Lidenti/service/v1/models_workflow/v1/KbaDto$ScreenParamsDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/KbaDto$ScreenParamsDto;", "getValue", "()Lidenti/service/v1/models_workflow/v1/KbaDto$ScreenParamsDto;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class KbaScreenParams extends ParamsDto {
            private final KbaDto7 value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof KbaScreenParams) && Intrinsics.areEqual(this.value, ((KbaScreenParams) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "KbaScreenParams(value=" + this.value + ")";
            }

            public final KbaDto7 getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public KbaScreenParams(KbaDto7 value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: WorkflowScreenDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto$EmailChallengeScreenParams;", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto;", "Lidenti/service/v1/models_workflow/v1/EmailChallengeDto$ScreenParamsDto;", "value", "<init>", "(Lidenti/service/v1/models_workflow/v1/EmailChallengeDto$ScreenParamsDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/EmailChallengeDto$ScreenParamsDto;", "getValue", "()Lidenti/service/v1/models_workflow/v1/EmailChallengeDto$ScreenParamsDto;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class EmailChallengeScreenParams extends ParamsDto {
            private final EmailChallengeDto9 value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof EmailChallengeScreenParams) && Intrinsics.areEqual(this.value, ((EmailChallengeScreenParams) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "EmailChallengeScreenParams(value=" + this.value + ")";
            }

            public final EmailChallengeDto9 getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EmailChallengeScreenParams(EmailChallengeDto9 value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: WorkflowScreenDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto$GkbaScreenParams;", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto;", "Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto;", "value", "<init>", "(Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto;", "getValue", "()Lidenti/service/v1/models_workflow/v1/GKbaDto$ScreenParamsDto;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes14.dex */
        public static final /* data */ class GkbaScreenParams extends ParamsDto {
            private final GKbaDto9 value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof GkbaScreenParams) && Intrinsics.areEqual(this.value, ((GkbaScreenParams) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "GkbaScreenParams(value=" + this.value + ")";
            }

            public final GKbaDto9 getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GkbaScreenParams(GKbaDto9 value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: WorkflowScreenDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto$RequestPhoneCallParams;", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto;", "Lidenti/service/v1/models_workflow/v1/RequestPhoneCallDto$ScreenParamsDto;", "value", "<init>", "(Lidenti/service/v1/models_workflow/v1/RequestPhoneCallDto$ScreenParamsDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/RequestPhoneCallDto$ScreenParamsDto;", "getValue", "()Lidenti/service/v1/models_workflow/v1/RequestPhoneCallDto$ScreenParamsDto;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes14.dex */
        public static final /* data */ class RequestPhoneCallParams extends ParamsDto {
            private final RequestPhoneCallDto7 value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RequestPhoneCallParams) && Intrinsics.areEqual(this.value, ((RequestPhoneCallParams) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "RequestPhoneCallParams(value=" + this.value + ")";
            }

            public final RequestPhoneCallDto7 getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RequestPhoneCallParams(RequestPhoneCallDto7 value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: WorkflowScreenDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto$FreezeAccountScreenParams;", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto;", "Lidenti/service/v1/models_workflow/v1/FreezeAccountDto$ScreenParamsDto;", "value", "<init>", "(Lidenti/service/v1/models_workflow/v1/FreezeAccountDto$ScreenParamsDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/FreezeAccountDto$ScreenParamsDto;", "getValue", "()Lidenti/service/v1/models_workflow/v1/FreezeAccountDto$ScreenParamsDto;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes14.dex */
        public static final /* data */ class FreezeAccountScreenParams extends ParamsDto {
            private final FreezeAccountDto8 value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof FreezeAccountScreenParams) && Intrinsics.areEqual(this.value, ((FreezeAccountScreenParams) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "FreezeAccountScreenParams(value=" + this.value + ")";
            }

            public final FreezeAccountDto8 getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FreezeAccountScreenParams(FreezeAccountDto8 value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: WorkflowScreenDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto$UnverifiedAccountContactInformationScreenParams;", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto;", "Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto;", "value", "<init>", "(Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto;", "getValue", "()Lidenti/service/v1/models_workflow/v1/UnverifiedAccountContactInformationDto$ScreenParamsDto;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes14.dex */
        public static final /* data */ class UnverifiedAccountContactInformationScreenParams extends ParamsDto {
            private final UnverifiedAccountContactInformationDto9 value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UnverifiedAccountContactInformationScreenParams) && Intrinsics.areEqual(this.value, ((UnverifiedAccountContactInformationScreenParams) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "UnverifiedAccountContactInformationScreenParams(value=" + this.value + ")";
            }

            public final UnverifiedAccountContactInformationDto9 getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UnverifiedAccountContactInformationScreenParams(UnverifiedAccountContactInformationDto9 value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: WorkflowScreenDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto$SupportIntakeCaseConfirmationScreenParams;", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto;", "Lidenti/service/v1/models_workflow/v1/SupportIntakeCaseConfirmationDto$ScreenParamsDto;", "value", "<init>", "(Lidenti/service/v1/models_workflow/v1/SupportIntakeCaseConfirmationDto$ScreenParamsDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/SupportIntakeCaseConfirmationDto$ScreenParamsDto;", "getValue", "()Lidenti/service/v1/models_workflow/v1/SupportIntakeCaseConfirmationDto$ScreenParamsDto;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes14.dex */
        public static final /* data */ class SupportIntakeCaseConfirmationScreenParams extends ParamsDto {
            private final SupportIntakeCaseConfirmationDto5 value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SupportIntakeCaseConfirmationScreenParams) && Intrinsics.areEqual(this.value, ((SupportIntakeCaseConfirmationScreenParams) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "SupportIntakeCaseConfirmationScreenParams(value=" + this.value + ")";
            }

            public final SupportIntakeCaseConfirmationDto5 getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SupportIntakeCaseConfirmationScreenParams(SupportIntakeCaseConfirmationDto5 value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: WorkflowScreenDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto$ChecklistScreenParams;", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto;", "Lidenti/service/v1/models_workflow/v1/ChecklistDto$ScreenParamsDto;", "value", "<init>", "(Lidenti/service/v1/models_workflow/v1/ChecklistDto$ScreenParamsDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/ChecklistDto$ScreenParamsDto;", "getValue", "()Lidenti/service/v1/models_workflow/v1/ChecklistDto$ScreenParamsDto;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes14.dex */
        public static final /* data */ class ChecklistScreenParams extends ParamsDto {
            private final ChecklistDto6 value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ChecklistScreenParams) && Intrinsics.areEqual(this.value, ((ChecklistScreenParams) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ChecklistScreenParams(value=" + this.value + ")";
            }

            public final ChecklistDto6 getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ChecklistScreenParams(ChecklistDto6 value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: WorkflowScreenDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$ParamsDto;", "Lidenti/service/v1/models_workflow/v1/WorkflowScreen;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes14.dex */
        public static final class Companion implements Dto4.Creator<ParamsDto, WorkflowScreen> {
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
            public ProtoAdapter<WorkflowScreen> getProtoAdapter() {
                return WorkflowScreen.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ParamsDto fromProto(WorkflowScreen proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getUpdate_app_screen_params() != null) {
                    return new UpdateAppScreenParams(UpdateAppDto6.INSTANCE.fromProto(proto.getUpdate_app_screen_params()));
                }
                if (proto.getInfo_screen_params() != null) {
                    return new InfoScreenParams(InfoDto6.INSTANCE.fromProto(proto.getInfo_screen_params()));
                }
                if (proto.getContact_support_screen_params() != null) {
                    return new ContactSupportScreenParams(ContactSupportDto9.INSTANCE.fromProto(proto.getContact_support_screen_params()));
                }
                if (proto.getSms_challenge_screen_params() != null) {
                    return new SmsChallengeScreenParams(SmsChallengeDto9.INSTANCE.fromProto(proto.getSms_challenge_screen_params()));
                }
                if (proto.getDevice_approval_challenge_screen_params() != null) {
                    return new DeviceApprovalChallengeScreenParams(DeviceApprovalChallengeDto9.INSTANCE.fromProto(proto.getDevice_approval_challenge_screen_params()));
                }
                if (proto.getKyc_status_check_screen_params() != null) {
                    return new KycStatusCheckScreenParams(KycStatusCheckDto$ScreenParamsDto.INSTANCE.fromProto(proto.getKyc_status_check_screen_params()));
                }
                if (proto.getPlaid_bank_list_screen_params() != null) {
                    return new PlaidBankListScreenParams(PlaidBankListDto8.INSTANCE.fromProto(proto.getPlaid_bank_list_screen_params()));
                }
                if (proto.getPlaid_auth_screen_params() != null) {
                    return new PlaidAuthScreenParams(PlaidAuthDto7.INSTANCE.fromProto(proto.getPlaid_auth_screen_params()));
                }
                if (proto.getKba_screen_params() != null) {
                    return new KbaScreenParams(KbaDto7.INSTANCE.fromProto(proto.getKba_screen_params()));
                }
                if (proto.getEmail_challenge_screen_params() != null) {
                    return new EmailChallengeScreenParams(EmailChallengeDto9.INSTANCE.fromProto(proto.getEmail_challenge_screen_params()));
                }
                if (proto.getGkba_screen_params() != null) {
                    return new GkbaScreenParams(GKbaDto9.INSTANCE.fromProto(proto.getGkba_screen_params()));
                }
                if (proto.getRequest_phone_call_params() != null) {
                    return new RequestPhoneCallParams(RequestPhoneCallDto7.INSTANCE.fromProto(proto.getRequest_phone_call_params()));
                }
                if (proto.getFreeze_account_screen_params() != null) {
                    return new FreezeAccountScreenParams(FreezeAccountDto8.INSTANCE.fromProto(proto.getFreeze_account_screen_params()));
                }
                if (proto.getUnverified_account_contact_information_screen_params() != null) {
                    return new UnverifiedAccountContactInformationScreenParams(UnverifiedAccountContactInformationDto9.INSTANCE.fromProto(proto.getUnverified_account_contact_information_screen_params()));
                }
                if (proto.getSupport_intake_case_confirmation_screen_params() != null) {
                    return new SupportIntakeCaseConfirmationScreenParams(SupportIntakeCaseConfirmationDto5.INSTANCE.fromProto(proto.getSupport_intake_case_confirmation_screen_params()));
                }
                if (proto.getChecklist_screen_params() != null) {
                    return new ChecklistScreenParams(ChecklistDto6.INSTANCE.fromProto(proto.getChecklist_screen_params()));
                }
                return null;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WorkflowScreenDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u001f B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006!"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$NameDto;", "Lcom/robinhood/idl/EnumDto;", "Lidenti/service/v1/models_workflow/v1/WorkflowScreen$Name;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "NAME_UNSPECIFIED", "UPDATE_APP", "INFO", "CONTACT_SUPPORT", "SMS_CHALLENGE", "DEVICE_APPROVAL_CHALLENGE", "PLAID_BANK_LIST", "PLAID_AUTH", "KBA", "EMAIL_CHALLENGE", "KYC_STATUS_CHECK", "GKBA", "REQUEST_PHONE_CALL", "FREEZE_ACCOUNT", "UNVERIFIED_ACCOUNT_CONTACT_INFORMATION", "SUPPORT_INTAKE_CASE_CONFIRMATION", "CHECKLIST", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class NameDto implements Dto2<WorkflowScreen.Name>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ NameDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<NameDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<NameDto, WorkflowScreen.Name>> binaryBase64Serializer$delegate;
        public static final NameDto NAME_UNSPECIFIED = new NAME_UNSPECIFIED("NAME_UNSPECIFIED", 0);
        public static final NameDto UPDATE_APP = new UPDATE_APP("UPDATE_APP", 1);
        public static final NameDto INFO = new INFO("INFO", 2);
        public static final NameDto CONTACT_SUPPORT = new CONTACT_SUPPORT("CONTACT_SUPPORT", 3);
        public static final NameDto SMS_CHALLENGE = new SMS_CHALLENGE("SMS_CHALLENGE", 4);
        public static final NameDto DEVICE_APPROVAL_CHALLENGE = new DEVICE_APPROVAL_CHALLENGE("DEVICE_APPROVAL_CHALLENGE", 5);
        public static final NameDto PLAID_BANK_LIST = new PLAID_BANK_LIST("PLAID_BANK_LIST", 6);
        public static final NameDto PLAID_AUTH = new PLAID_AUTH("PLAID_AUTH", 7);
        public static final NameDto KBA = new KBA("KBA", 8);
        public static final NameDto EMAIL_CHALLENGE = new EMAIL_CHALLENGE("EMAIL_CHALLENGE", 9);
        public static final NameDto KYC_STATUS_CHECK = new KYC_STATUS_CHECK("KYC_STATUS_CHECK", 10);
        public static final NameDto GKBA = new GKBA("GKBA", 11);
        public static final NameDto REQUEST_PHONE_CALL = new REQUEST_PHONE_CALL("REQUEST_PHONE_CALL", 12);
        public static final NameDto FREEZE_ACCOUNT = new FREEZE_ACCOUNT("FREEZE_ACCOUNT", 13);
        public static final NameDto UNVERIFIED_ACCOUNT_CONTACT_INFORMATION = new UNVERIFIED_ACCOUNT_CONTACT_INFORMATION("UNVERIFIED_ACCOUNT_CONTACT_INFORMATION", 14);
        public static final NameDto SUPPORT_INTAKE_CASE_CONFIRMATION = new SUPPORT_INTAKE_CASE_CONFIRMATION("SUPPORT_INTAKE_CASE_CONFIRMATION", 15);
        public static final NameDto CHECKLIST = new CHECKLIST("CHECKLIST", 16);

        private static final /* synthetic */ NameDto[] $values() {
            return new NameDto[]{NAME_UNSPECIFIED, UPDATE_APP, INFO, CONTACT_SUPPORT, SMS_CHALLENGE, DEVICE_APPROVAL_CHALLENGE, PLAID_BANK_LIST, PLAID_AUTH, KBA, EMAIL_CHALLENGE, KYC_STATUS_CHECK, GKBA, REQUEST_PHONE_CALL, FREEZE_ACCOUNT, UNVERIFIED_ACCOUNT_CONTACT_INFORMATION, SUPPORT_INTAKE_CASE_CONFIRMATION, CHECKLIST};
        }

        public /* synthetic */ NameDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<NameDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: WorkflowScreenDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/WorkflowScreenDto.NameDto.NAME_UNSPECIFIED", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$NameDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/WorkflowScreen$Name;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class NAME_UNSPECIFIED extends NameDto {
            NAME_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public WorkflowScreen.Name toProto() {
                return WorkflowScreen.Name.NAME_UNSPECIFIED;
            }
        }

        private NameDto(String str, int i) {
        }

        static {
            NameDto[] nameDtoArr$values = $values();
            $VALUES = nameDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(nameDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: identi.service.v1.models_workflow.v1.WorkflowScreenDto$NameDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WorkflowScreenDto.NameDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: WorkflowScreenDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/WorkflowScreenDto.NameDto.UPDATE_APP", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$NameDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/WorkflowScreen$Name;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class UPDATE_APP extends NameDto {
            UPDATE_APP(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public WorkflowScreen.Name toProto() {
                return WorkflowScreen.Name.UPDATE_APP;
            }
        }

        /* compiled from: WorkflowScreenDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/WorkflowScreenDto.NameDto.INFO", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$NameDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/WorkflowScreen$Name;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class INFO extends NameDto {
            INFO(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public WorkflowScreen.Name toProto() {
                return WorkflowScreen.Name.INFO;
            }
        }

        /* compiled from: WorkflowScreenDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/WorkflowScreenDto.NameDto.CONTACT_SUPPORT", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$NameDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/WorkflowScreen$Name;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CONTACT_SUPPORT extends NameDto {
            CONTACT_SUPPORT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public WorkflowScreen.Name toProto() {
                return WorkflowScreen.Name.CONTACT_SUPPORT;
            }
        }

        /* compiled from: WorkflowScreenDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/WorkflowScreenDto.NameDto.SMS_CHALLENGE", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$NameDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/WorkflowScreen$Name;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SMS_CHALLENGE extends NameDto {
            SMS_CHALLENGE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public WorkflowScreen.Name toProto() {
                return WorkflowScreen.Name.SMS_CHALLENGE;
            }
        }

        /* compiled from: WorkflowScreenDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/WorkflowScreenDto.NameDto.DEVICE_APPROVAL_CHALLENGE", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$NameDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/WorkflowScreen$Name;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DEVICE_APPROVAL_CHALLENGE extends NameDto {
            DEVICE_APPROVAL_CHALLENGE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public WorkflowScreen.Name toProto() {
                return WorkflowScreen.Name.DEVICE_APPROVAL_CHALLENGE;
            }
        }

        /* compiled from: WorkflowScreenDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/WorkflowScreenDto.NameDto.PLAID_BANK_LIST", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$NameDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/WorkflowScreen$Name;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PLAID_BANK_LIST extends NameDto {
            PLAID_BANK_LIST(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public WorkflowScreen.Name toProto() {
                return WorkflowScreen.Name.PLAID_BANK_LIST;
            }
        }

        /* compiled from: WorkflowScreenDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/WorkflowScreenDto.NameDto.PLAID_AUTH", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$NameDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/WorkflowScreen$Name;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PLAID_AUTH extends NameDto {
            PLAID_AUTH(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public WorkflowScreen.Name toProto() {
                return WorkflowScreen.Name.PLAID_AUTH;
            }
        }

        /* compiled from: WorkflowScreenDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/WorkflowScreenDto.NameDto.KBA", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$NameDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/WorkflowScreen$Name;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class KBA extends NameDto {
            KBA(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public WorkflowScreen.Name toProto() {
                return WorkflowScreen.Name.KBA;
            }
        }

        /* compiled from: WorkflowScreenDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/WorkflowScreenDto.NameDto.EMAIL_CHALLENGE", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$NameDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/WorkflowScreen$Name;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EMAIL_CHALLENGE extends NameDto {
            EMAIL_CHALLENGE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public WorkflowScreen.Name toProto() {
                return WorkflowScreen.Name.EMAIL_CHALLENGE;
            }
        }

        /* compiled from: WorkflowScreenDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/WorkflowScreenDto.NameDto.KYC_STATUS_CHECK", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$NameDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/WorkflowScreen$Name;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes14.dex */
        static final class KYC_STATUS_CHECK extends NameDto {
            KYC_STATUS_CHECK(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public WorkflowScreen.Name toProto() {
                return WorkflowScreen.Name.KYC_STATUS_CHECK;
            }
        }

        /* compiled from: WorkflowScreenDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/WorkflowScreenDto.NameDto.GKBA", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$NameDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/WorkflowScreen$Name;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes14.dex */
        static final class GKBA extends NameDto {
            GKBA(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public WorkflowScreen.Name toProto() {
                return WorkflowScreen.Name.GKBA;
            }
        }

        /* compiled from: WorkflowScreenDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/WorkflowScreenDto.NameDto.REQUEST_PHONE_CALL", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$NameDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/WorkflowScreen$Name;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes14.dex */
        static final class REQUEST_PHONE_CALL extends NameDto {
            REQUEST_PHONE_CALL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public WorkflowScreen.Name toProto() {
                return WorkflowScreen.Name.REQUEST_PHONE_CALL;
            }
        }

        /* compiled from: WorkflowScreenDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/WorkflowScreenDto.NameDto.FREEZE_ACCOUNT", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$NameDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/WorkflowScreen$Name;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes14.dex */
        static final class FREEZE_ACCOUNT extends NameDto {
            FREEZE_ACCOUNT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public WorkflowScreen.Name toProto() {
                return WorkflowScreen.Name.FREEZE_ACCOUNT;
            }
        }

        /* compiled from: WorkflowScreenDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/WorkflowScreenDto.NameDto.UNVERIFIED_ACCOUNT_CONTACT_INFORMATION", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$NameDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/WorkflowScreen$Name;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes14.dex */
        static final class UNVERIFIED_ACCOUNT_CONTACT_INFORMATION extends NameDto {
            UNVERIFIED_ACCOUNT_CONTACT_INFORMATION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public WorkflowScreen.Name toProto() {
                return WorkflowScreen.Name.UNVERIFIED_ACCOUNT_CONTACT_INFORMATION;
            }
        }

        /* compiled from: WorkflowScreenDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/WorkflowScreenDto.NameDto.SUPPORT_INTAKE_CASE_CONFIRMATION", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$NameDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/WorkflowScreen$Name;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes14.dex */
        static final class SUPPORT_INTAKE_CASE_CONFIRMATION extends NameDto {
            SUPPORT_INTAKE_CASE_CONFIRMATION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public WorkflowScreen.Name toProto() {
                return WorkflowScreen.Name.SUPPORT_INTAKE_CASE_CONFIRMATION;
            }
        }

        /* compiled from: WorkflowScreenDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/WorkflowScreenDto.NameDto.CHECKLIST", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$NameDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/WorkflowScreen$Name;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes14.dex */
        static final class CHECKLIST extends NameDto {
            CHECKLIST(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public WorkflowScreen.Name toProto() {
                return WorkflowScreen.Name.CHECKLIST;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: WorkflowScreenDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$NameDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$NameDto;", "Lidenti/service/v1/models_workflow/v1/WorkflowScreen$Name;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$NameDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<NameDto, WorkflowScreen.Name> {

            /* compiled from: WorkflowScreenDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes14.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[WorkflowScreen.Name.values().length];
                    try {
                        iArr[WorkflowScreen.Name.NAME_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[WorkflowScreen.Name.UPDATE_APP.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[WorkflowScreen.Name.INFO.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[WorkflowScreen.Name.CONTACT_SUPPORT.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[WorkflowScreen.Name.SMS_CHALLENGE.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[WorkflowScreen.Name.DEVICE_APPROVAL_CHALLENGE.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[WorkflowScreen.Name.PLAID_BANK_LIST.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[WorkflowScreen.Name.PLAID_AUTH.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[WorkflowScreen.Name.KBA.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[WorkflowScreen.Name.EMAIL_CHALLENGE.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
                    }
                    try {
                        iArr[WorkflowScreen.Name.KYC_STATUS_CHECK.ordinal()] = 11;
                    } catch (NoSuchFieldError unused11) {
                    }
                    try {
                        iArr[WorkflowScreen.Name.GKBA.ordinal()] = 12;
                    } catch (NoSuchFieldError unused12) {
                    }
                    try {
                        iArr[WorkflowScreen.Name.REQUEST_PHONE_CALL.ordinal()] = 13;
                    } catch (NoSuchFieldError unused13) {
                    }
                    try {
                        iArr[WorkflowScreen.Name.FREEZE_ACCOUNT.ordinal()] = 14;
                    } catch (NoSuchFieldError unused14) {
                    }
                    try {
                        iArr[WorkflowScreen.Name.UNVERIFIED_ACCOUNT_CONTACT_INFORMATION.ordinal()] = 15;
                    } catch (NoSuchFieldError unused15) {
                    }
                    try {
                        iArr[WorkflowScreen.Name.SUPPORT_INTAKE_CASE_CONFIRMATION.ordinal()] = 16;
                    } catch (NoSuchFieldError unused16) {
                    }
                    try {
                        iArr[WorkflowScreen.Name.CHECKLIST.ordinal()] = 17;
                    } catch (NoSuchFieldError unused17) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<NameDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<NameDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<NameDto> getBinaryBase64Serializer() {
                return (KSerializer) NameDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<WorkflowScreen.Name> getProtoAdapter() {
                return WorkflowScreen.Name.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public NameDto getZeroValue() {
                return NameDto.NAME_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public NameDto fromProto(WorkflowScreen.Name proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return NameDto.NAME_UNSPECIFIED;
                    case 2:
                        return NameDto.UPDATE_APP;
                    case 3:
                        return NameDto.INFO;
                    case 4:
                        return NameDto.CONTACT_SUPPORT;
                    case 5:
                        return NameDto.SMS_CHALLENGE;
                    case 6:
                        return NameDto.DEVICE_APPROVAL_CHALLENGE;
                    case 7:
                        return NameDto.PLAID_BANK_LIST;
                    case 8:
                        return NameDto.PLAID_AUTH;
                    case 9:
                        return NameDto.KBA;
                    case 10:
                        return NameDto.EMAIL_CHALLENGE;
                    case 11:
                        return NameDto.KYC_STATUS_CHECK;
                    case 12:
                        return NameDto.GKBA;
                    case 13:
                        return NameDto.REQUEST_PHONE_CALL;
                    case 14:
                        return NameDto.FREEZE_ACCOUNT;
                    case 15:
                        return NameDto.UNVERIFIED_ACCOUNT_CONTACT_INFORMATION;
                    case 16:
                        return NameDto.SUPPORT_INTAKE_CASE_CONFIRMATION;
                    case 17:
                        return NameDto.CHECKLIST;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: WorkflowScreenDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$NameDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$NameDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes14.dex */
        public static final class Serializer implements KSerializer<NameDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<NameDto, WorkflowScreen.Name> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/identi.service.v1.models_workflow.v1.WorkflowScreen.Name", NameDto.getEntries(), NameDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public NameDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (NameDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, NameDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static NameDto valueOf(String str) {
            return (NameDto) Enum.valueOf(NameDto.class, str);
        }

        public static NameDto[] values() {
            return (NameDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WorkflowScreenDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$LayoutFormatDto;", "Lcom/robinhood/idl/EnumDto;", "Lidenti/service/v1/models_workflow/v1/WorkflowScreen$LayoutFormat;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "LAYOUT_FORMAT_UNSPECIFIED", "MODAL", "TAKEOVER", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    /* loaded from: classes14.dex */
    public static final class LayoutFormatDto implements Dto2<WorkflowScreen.LayoutFormat>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ LayoutFormatDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<LayoutFormatDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final LayoutFormatDto LAYOUT_FORMAT_UNSPECIFIED = new LAYOUT_FORMAT_UNSPECIFIED("LAYOUT_FORMAT_UNSPECIFIED", 0);
        public static final LayoutFormatDto MODAL = new MODAL("MODAL", 1);
        public static final LayoutFormatDto TAKEOVER = new TAKEOVER("TAKEOVER", 2);
        private static final Lazy<BinaryBase64DtoSerializer<LayoutFormatDto, WorkflowScreen.LayoutFormat>> binaryBase64Serializer$delegate;

        private static final /* synthetic */ LayoutFormatDto[] $values() {
            return new LayoutFormatDto[]{LAYOUT_FORMAT_UNSPECIFIED, MODAL, TAKEOVER};
        }

        public /* synthetic */ LayoutFormatDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<LayoutFormatDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: WorkflowScreenDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/WorkflowScreenDto.LayoutFormatDto.LAYOUT_FORMAT_UNSPECIFIED", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$LayoutFormatDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/WorkflowScreen$LayoutFormat;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LAYOUT_FORMAT_UNSPECIFIED extends LayoutFormatDto {
            LAYOUT_FORMAT_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public WorkflowScreen.LayoutFormat toProto() {
                return WorkflowScreen.LayoutFormat.LAYOUT_FORMAT_UNSPECIFIED;
            }
        }

        private LayoutFormatDto(String str, int i) {
        }

        static {
            LayoutFormatDto[] layoutFormatDtoArr$values = $values();
            $VALUES = layoutFormatDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(layoutFormatDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: identi.service.v1.models_workflow.v1.WorkflowScreenDto$LayoutFormatDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WorkflowScreenDto.LayoutFormatDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: WorkflowScreenDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/WorkflowScreenDto.LayoutFormatDto.MODAL", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$LayoutFormatDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/WorkflowScreen$LayoutFormat;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MODAL extends LayoutFormatDto {
            MODAL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public WorkflowScreen.LayoutFormat toProto() {
                return WorkflowScreen.LayoutFormat.MODAL;
            }
        }

        /* compiled from: WorkflowScreenDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/WorkflowScreenDto.LayoutFormatDto.TAKEOVER", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$LayoutFormatDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/WorkflowScreen$LayoutFormat;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TAKEOVER extends LayoutFormatDto {
            TAKEOVER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public WorkflowScreen.LayoutFormat toProto() {
                return WorkflowScreen.LayoutFormat.TAKEOVER;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: WorkflowScreenDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$LayoutFormatDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$LayoutFormatDto;", "Lidenti/service/v1/models_workflow/v1/WorkflowScreen$LayoutFormat;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$LayoutFormatDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<LayoutFormatDto, WorkflowScreen.LayoutFormat> {

            /* compiled from: WorkflowScreenDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[WorkflowScreen.LayoutFormat.values().length];
                    try {
                        iArr[WorkflowScreen.LayoutFormat.LAYOUT_FORMAT_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[WorkflowScreen.LayoutFormat.MODAL.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[WorkflowScreen.LayoutFormat.TAKEOVER.ordinal()] = 3;
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

            public final KSerializer<LayoutFormatDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<LayoutFormatDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<LayoutFormatDto> getBinaryBase64Serializer() {
                return (KSerializer) LayoutFormatDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<WorkflowScreen.LayoutFormat> getProtoAdapter() {
                return WorkflowScreen.LayoutFormat.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public LayoutFormatDto getZeroValue() {
                return LayoutFormatDto.LAYOUT_FORMAT_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public LayoutFormatDto fromProto(WorkflowScreen.LayoutFormat proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return LayoutFormatDto.LAYOUT_FORMAT_UNSPECIFIED;
                }
                if (i == 2) {
                    return LayoutFormatDto.MODAL;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return LayoutFormatDto.TAKEOVER;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: WorkflowScreenDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$LayoutFormatDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$LayoutFormatDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<LayoutFormatDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<LayoutFormatDto, WorkflowScreen.LayoutFormat> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/identi.service.v1.models_workflow.v1.WorkflowScreen.LayoutFormat", LayoutFormatDto.getEntries(), LayoutFormatDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public LayoutFormatDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (LayoutFormatDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, LayoutFormatDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static LayoutFormatDto valueOf(String str) {
            return (LayoutFormatDto) Enum.valueOf(LayoutFormatDto.class, str);
        }

        public static LayoutFormatDto[] values() {
            return (LayoutFormatDto[]) $VALUES.clone();
        }
    }

    /* compiled from: WorkflowScreenDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto;", "<init>", "()V", "surrogateSerializer", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes14.dex */
    public static final class Serializer implements KSerializer<WorkflowScreenDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/identi.service.v1.models_workflow.v1.WorkflowScreen", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, WorkflowScreenDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public WorkflowScreenDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new WorkflowScreenDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: WorkflowScreenDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "identi.service.v1.models_workflow.v1.WorkflowScreenDto";
        }
    }
}
