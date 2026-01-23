package identi.service.p471v1.models_workflow.p472v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import identi.service.p471v1.models_workflow.p472v1.ContactSupportDto7;
import identi.service.p471v1.models_workflow.p472v1.DeviceApprovalChallengeDto7;
import identi.service.p471v1.models_workflow.p472v1.EmailChallengeDto7;
import identi.service.p471v1.models_workflow.p472v1.KycStatusCheckDto$ActionResponseDto;
import identi.service.p471v1.models_workflow.p472v1.SmsChallengeDto7;
import identi.service.p471v1.models_workflow.p472v1.WorkflowRouteDto;
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

/* compiled from: WorkflowActionResponseDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005'&()*B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006+"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowActionResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionResponse;", "Landroid/os/Parcelable;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionResponseDto$Surrogate;", "surrogate", "<init>", "(Lidenti/service/v1/models_workflow/v1/WorkflowActionResponseDto$Surrogate;)V", "Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto;", PlaceTypes.ROUTE, "Lidenti/service/v1/models_workflow/v1/WorkflowActionResponseDto$ActionResponseDto;", "action_response", "(Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto;Lidenti/service/v1/models_workflow/v1/WorkflowActionResponseDto$ActionResponseDto;)V", "toProto", "()Lidenti/service/v1/models_workflow/v1/WorkflowActionResponse;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lidenti/service/v1/models_workflow/v1/WorkflowActionResponseDto$Surrogate;", "getRoute", "()Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto;", "getAction_response", "()Lidenti/service/v1/models_workflow/v1/WorkflowActionResponseDto$ActionResponseDto;", "Companion", "Surrogate", "ActionResponseDto", "Serializer", "MultibindingModule", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class WorkflowActionResponseDto implements Dto3<WorkflowActionResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<WorkflowActionResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<WorkflowActionResponseDto, WorkflowActionResponse>> binaryBase64Serializer$delegate;
    private static final WorkflowActionResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ WorkflowActionResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private WorkflowActionResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final WorkflowRouteDto getRoute() {
        return this.surrogate.getRoute();
    }

    public final ActionResponseDto getAction_response() {
        if (this.surrogate.getContact_support_action_response() != null) {
            return new ActionResponseDto.ContactSupportActionResponse(this.surrogate.getContact_support_action_response());
        }
        if (this.surrogate.getDevice_approval_challenge_action_response() != null) {
            return new ActionResponseDto.DeviceApprovalChallengeActionResponse(this.surrogate.getDevice_approval_challenge_action_response());
        }
        if (this.surrogate.getSms_challenge_action_response() != null) {
            return new ActionResponseDto.SmsChallengeActionResponse(this.surrogate.getSms_challenge_action_response());
        }
        if (this.surrogate.getEmail_challenge_action_response() != null) {
            return new ActionResponseDto.EmailChallengeActionResponse(this.surrogate.getEmail_challenge_action_response());
        }
        if (this.surrogate.getKyc_status_check_action_response() != null) {
            return new ActionResponseDto.KycStatusCheckActionResponse(this.surrogate.getKyc_status_check_action_response());
        }
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public WorkflowActionResponseDto(WorkflowRouteDto workflowRouteDto, ActionResponseDto actionResponseDto) {
        ActionResponseDto.ContactSupportActionResponse contactSupportActionResponse = actionResponseDto instanceof ActionResponseDto.ContactSupportActionResponse ? (ActionResponseDto.ContactSupportActionResponse) actionResponseDto : null;
        ContactSupportDto7 value = contactSupportActionResponse != null ? contactSupportActionResponse.getValue() : null;
        ActionResponseDto.DeviceApprovalChallengeActionResponse deviceApprovalChallengeActionResponse = actionResponseDto instanceof ActionResponseDto.DeviceApprovalChallengeActionResponse ? (ActionResponseDto.DeviceApprovalChallengeActionResponse) actionResponseDto : null;
        DeviceApprovalChallengeDto7 value2 = deviceApprovalChallengeActionResponse != null ? deviceApprovalChallengeActionResponse.getValue() : null;
        ActionResponseDto.SmsChallengeActionResponse smsChallengeActionResponse = actionResponseDto instanceof ActionResponseDto.SmsChallengeActionResponse ? (ActionResponseDto.SmsChallengeActionResponse) actionResponseDto : null;
        SmsChallengeDto7 value3 = smsChallengeActionResponse != null ? smsChallengeActionResponse.getValue() : null;
        ActionResponseDto.EmailChallengeActionResponse emailChallengeActionResponse = actionResponseDto instanceof ActionResponseDto.EmailChallengeActionResponse ? (ActionResponseDto.EmailChallengeActionResponse) actionResponseDto : null;
        EmailChallengeDto7 value4 = emailChallengeActionResponse != null ? emailChallengeActionResponse.getValue() : null;
        ActionResponseDto.KycStatusCheckActionResponse kycStatusCheckActionResponse = actionResponseDto instanceof ActionResponseDto.KycStatusCheckActionResponse ? (ActionResponseDto.KycStatusCheckActionResponse) actionResponseDto : null;
        this(new Surrogate(workflowRouteDto, value, value2, value3, value4, kycStatusCheckActionResponse != null ? kycStatusCheckActionResponse.getValue() : null));
    }

    public /* synthetic */ WorkflowActionResponseDto(WorkflowRouteDto workflowRouteDto, ActionResponseDto actionResponseDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : workflowRouteDto, (i & 2) != 0 ? null : actionResponseDto);
    }

    @Override // com.robinhood.idl.Dto
    public WorkflowActionResponse toProto() {
        WorkflowRouteDto route = this.surrogate.getRoute();
        WorkflowRoute proto = route != null ? route.toProto() : null;
        ContactSupportDto7 contact_support_action_response = this.surrogate.getContact_support_action_response();
        ContactSupport$ActionResponse proto2 = contact_support_action_response != null ? contact_support_action_response.toProto() : null;
        DeviceApprovalChallengeDto7 device_approval_challenge_action_response = this.surrogate.getDevice_approval_challenge_action_response();
        DeviceApprovalChallenge$ActionResponse proto3 = device_approval_challenge_action_response != null ? device_approval_challenge_action_response.toProto() : null;
        SmsChallengeDto7 sms_challenge_action_response = this.surrogate.getSms_challenge_action_response();
        SmsChallenge$ActionResponse proto4 = sms_challenge_action_response != null ? sms_challenge_action_response.toProto() : null;
        EmailChallengeDto7 email_challenge_action_response = this.surrogate.getEmail_challenge_action_response();
        EmailChallenge$ActionResponse proto5 = email_challenge_action_response != null ? email_challenge_action_response.toProto() : null;
        KycStatusCheckDto$ActionResponseDto kyc_status_check_action_response = this.surrogate.getKyc_status_check_action_response();
        return new WorkflowActionResponse(proto, proto2, proto3, proto4, proto5, kyc_status_check_action_response != null ? kyc_status_check_action_response.toProto() : null, null, 64, null);
    }

    public String toString() {
        return "[WorkflowActionResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof WorkflowActionResponseDto) && Intrinsics.areEqual(((WorkflowActionResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: WorkflowActionResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0083\b\u0018\u0000 @2\u00020\u0001:\u0002A@BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBW\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010,\u0012\u0004\b/\u0010+\u001a\u0004\b-\u0010.R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00100\u0012\u0004\b3\u0010+\u001a\u0004\b1\u00102R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00104\u0012\u0004\b7\u0010+\u001a\u0004\b5\u00106R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00108\u0012\u0004\b;\u0010+\u001a\u0004\b9\u0010:R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010<\u0012\u0004\b?\u0010+\u001a\u0004\b=\u0010>¨\u0006B"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowActionResponseDto$Surrogate;", "", "Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto;", PlaceTypes.ROUTE, "Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto;", "contact_support_action_response", "Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallengeDto$ActionResponseDto;", "device_approval_challenge_action_response", "Lidenti/service/v1/models_workflow/v1/SmsChallengeDto$ActionResponseDto;", "sms_challenge_action_response", "Lidenti/service/v1/models_workflow/v1/EmailChallengeDto$ActionResponseDto;", "email_challenge_action_response", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionResponseDto;", "kyc_status_check_action_response", "<init>", "(Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto;Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto;Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallengeDto$ActionResponseDto;Lidenti/service/v1/models_workflow/v1/SmsChallengeDto$ActionResponseDto;Lidenti/service/v1/models_workflow/v1/EmailChallengeDto$ActionResponseDto;Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionResponseDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILidenti/service/v1/models_workflow/v1/WorkflowRouteDto;Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto;Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallengeDto$ActionResponseDto;Lidenti/service/v1/models_workflow/v1/SmsChallengeDto$ActionResponseDto;Lidenti/service/v1/models_workflow/v1/EmailChallengeDto$ActionResponseDto;Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionResponseDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identi_v1_models_workflow_v1_externalRelease", "(Lidenti/service/v1/models_workflow/v1/WorkflowActionResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto;", "getRoute", "()Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto;", "getRoute$annotations", "()V", "Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto;", "getContact_support_action_response", "()Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto;", "getContact_support_action_response$annotations", "Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallengeDto$ActionResponseDto;", "getDevice_approval_challenge_action_response", "()Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallengeDto$ActionResponseDto;", "getDevice_approval_challenge_action_response$annotations", "Lidenti/service/v1/models_workflow/v1/SmsChallengeDto$ActionResponseDto;", "getSms_challenge_action_response", "()Lidenti/service/v1/models_workflow/v1/SmsChallengeDto$ActionResponseDto;", "getSms_challenge_action_response$annotations", "Lidenti/service/v1/models_workflow/v1/EmailChallengeDto$ActionResponseDto;", "getEmail_challenge_action_response", "()Lidenti/service/v1/models_workflow/v1/EmailChallengeDto$ActionResponseDto;", "getEmail_challenge_action_response$annotations", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionResponseDto;", "getKyc_status_check_action_response", "()Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionResponseDto;", "getKyc_status_check_action_response$annotations", "Companion", "$serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ContactSupportDto7 contact_support_action_response;
        private final DeviceApprovalChallengeDto7 device_approval_challenge_action_response;
        private final EmailChallengeDto7 email_challenge_action_response;
        private final KycStatusCheckDto$ActionResponseDto kyc_status_check_action_response;
        private final WorkflowRouteDto route;
        private final SmsChallengeDto7 sms_challenge_action_response;

        public Surrogate() {
            this((WorkflowRouteDto) null, (ContactSupportDto7) null, (DeviceApprovalChallengeDto7) null, (SmsChallengeDto7) null, (EmailChallengeDto7) null, (KycStatusCheckDto$ActionResponseDto) null, 63, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.route, surrogate.route) && Intrinsics.areEqual(this.contact_support_action_response, surrogate.contact_support_action_response) && Intrinsics.areEqual(this.device_approval_challenge_action_response, surrogate.device_approval_challenge_action_response) && Intrinsics.areEqual(this.sms_challenge_action_response, surrogate.sms_challenge_action_response) && Intrinsics.areEqual(this.email_challenge_action_response, surrogate.email_challenge_action_response) && Intrinsics.areEqual(this.kyc_status_check_action_response, surrogate.kyc_status_check_action_response);
        }

        public int hashCode() {
            WorkflowRouteDto workflowRouteDto = this.route;
            int iHashCode = (workflowRouteDto == null ? 0 : workflowRouteDto.hashCode()) * 31;
            ContactSupportDto7 contactSupportDto7 = this.contact_support_action_response;
            int iHashCode2 = (iHashCode + (contactSupportDto7 == null ? 0 : contactSupportDto7.hashCode())) * 31;
            DeviceApprovalChallengeDto7 deviceApprovalChallengeDto7 = this.device_approval_challenge_action_response;
            int iHashCode3 = (iHashCode2 + (deviceApprovalChallengeDto7 == null ? 0 : deviceApprovalChallengeDto7.hashCode())) * 31;
            SmsChallengeDto7 smsChallengeDto7 = this.sms_challenge_action_response;
            int iHashCode4 = (iHashCode3 + (smsChallengeDto7 == null ? 0 : smsChallengeDto7.hashCode())) * 31;
            EmailChallengeDto7 emailChallengeDto7 = this.email_challenge_action_response;
            int iHashCode5 = (iHashCode4 + (emailChallengeDto7 == null ? 0 : emailChallengeDto7.hashCode())) * 31;
            KycStatusCheckDto$ActionResponseDto kycStatusCheckDto$ActionResponseDto = this.kyc_status_check_action_response;
            return iHashCode5 + (kycStatusCheckDto$ActionResponseDto != null ? kycStatusCheckDto$ActionResponseDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(route=" + this.route + ", contact_support_action_response=" + this.contact_support_action_response + ", device_approval_challenge_action_response=" + this.device_approval_challenge_action_response + ", sms_challenge_action_response=" + this.sms_challenge_action_response + ", email_challenge_action_response=" + this.email_challenge_action_response + ", kyc_status_check_action_response=" + this.kyc_status_check_action_response + ")";
        }

        /* compiled from: WorkflowActionResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowActionResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionResponseDto$Surrogate;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return WorkflowActionResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, WorkflowRouteDto workflowRouteDto, ContactSupportDto7 contactSupportDto7, DeviceApprovalChallengeDto7 deviceApprovalChallengeDto7, SmsChallengeDto7 smsChallengeDto7, EmailChallengeDto7 emailChallengeDto7, KycStatusCheckDto$ActionResponseDto kycStatusCheckDto$ActionResponseDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.route = null;
            } else {
                this.route = workflowRouteDto;
            }
            if ((i & 2) == 0) {
                this.contact_support_action_response = null;
            } else {
                this.contact_support_action_response = contactSupportDto7;
            }
            if ((i & 4) == 0) {
                this.device_approval_challenge_action_response = null;
            } else {
                this.device_approval_challenge_action_response = deviceApprovalChallengeDto7;
            }
            if ((i & 8) == 0) {
                this.sms_challenge_action_response = null;
            } else {
                this.sms_challenge_action_response = smsChallengeDto7;
            }
            if ((i & 16) == 0) {
                this.email_challenge_action_response = null;
            } else {
                this.email_challenge_action_response = emailChallengeDto7;
            }
            if ((i & 32) == 0) {
                this.kyc_status_check_action_response = null;
            } else {
                this.kyc_status_check_action_response = kycStatusCheckDto$ActionResponseDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$identi_v1_models_workflow_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            WorkflowRouteDto workflowRouteDto = self.route;
            if (workflowRouteDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, WorkflowRouteDto.Serializer.INSTANCE, workflowRouteDto);
            }
            ContactSupportDto7 contactSupportDto7 = self.contact_support_action_response;
            if (contactSupportDto7 != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, ContactSupportDto7.Serializer.INSTANCE, contactSupportDto7);
            }
            DeviceApprovalChallengeDto7 deviceApprovalChallengeDto7 = self.device_approval_challenge_action_response;
            if (deviceApprovalChallengeDto7 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, DeviceApprovalChallengeDto7.Serializer.INSTANCE, deviceApprovalChallengeDto7);
            }
            SmsChallengeDto7 smsChallengeDto7 = self.sms_challenge_action_response;
            if (smsChallengeDto7 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, SmsChallengeDto7.Serializer.INSTANCE, smsChallengeDto7);
            }
            EmailChallengeDto7 emailChallengeDto7 = self.email_challenge_action_response;
            if (emailChallengeDto7 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, EmailChallengeDto7.Serializer.INSTANCE, emailChallengeDto7);
            }
            KycStatusCheckDto$ActionResponseDto kycStatusCheckDto$ActionResponseDto = self.kyc_status_check_action_response;
            if (kycStatusCheckDto$ActionResponseDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, KycStatusCheckDto$ActionResponseDto.Serializer.INSTANCE, kycStatusCheckDto$ActionResponseDto);
            }
        }

        public Surrogate(WorkflowRouteDto workflowRouteDto, ContactSupportDto7 contactSupportDto7, DeviceApprovalChallengeDto7 deviceApprovalChallengeDto7, SmsChallengeDto7 smsChallengeDto7, EmailChallengeDto7 emailChallengeDto7, KycStatusCheckDto$ActionResponseDto kycStatusCheckDto$ActionResponseDto) {
            this.route = workflowRouteDto;
            this.contact_support_action_response = contactSupportDto7;
            this.device_approval_challenge_action_response = deviceApprovalChallengeDto7;
            this.sms_challenge_action_response = smsChallengeDto7;
            this.email_challenge_action_response = emailChallengeDto7;
            this.kyc_status_check_action_response = kycStatusCheckDto$ActionResponseDto;
        }

        public /* synthetic */ Surrogate(WorkflowRouteDto workflowRouteDto, ContactSupportDto7 contactSupportDto7, DeviceApprovalChallengeDto7 deviceApprovalChallengeDto7, SmsChallengeDto7 smsChallengeDto7, EmailChallengeDto7 emailChallengeDto7, KycStatusCheckDto$ActionResponseDto kycStatusCheckDto$ActionResponseDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : workflowRouteDto, (i & 2) != 0 ? null : contactSupportDto7, (i & 4) != 0 ? null : deviceApprovalChallengeDto7, (i & 8) != 0 ? null : smsChallengeDto7, (i & 16) != 0 ? null : emailChallengeDto7, (i & 32) != 0 ? null : kycStatusCheckDto$ActionResponseDto);
        }

        public final WorkflowRouteDto getRoute() {
            return this.route;
        }

        public final ContactSupportDto7 getContact_support_action_response() {
            return this.contact_support_action_response;
        }

        public final DeviceApprovalChallengeDto7 getDevice_approval_challenge_action_response() {
            return this.device_approval_challenge_action_response;
        }

        public final SmsChallengeDto7 getSms_challenge_action_response() {
            return this.sms_challenge_action_response;
        }

        public final EmailChallengeDto7 getEmail_challenge_action_response() {
            return this.email_challenge_action_response;
        }

        public final KycStatusCheckDto$ActionResponseDto getKyc_status_check_action_response() {
            return this.kyc_status_check_action_response;
        }
    }

    /* compiled from: WorkflowActionResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowActionResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionResponseDto;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lidenti/service/v1/models_workflow/v1/WorkflowActionResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<WorkflowActionResponseDto, WorkflowActionResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<WorkflowActionResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<WorkflowActionResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<WorkflowActionResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) WorkflowActionResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<WorkflowActionResponse> getProtoAdapter() {
            return WorkflowActionResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public WorkflowActionResponseDto getZeroValue() {
            return WorkflowActionResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public WorkflowActionResponseDto fromProto(WorkflowActionResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            WorkflowRoute route = proto.getRoute();
            DefaultConstructorMarker defaultConstructorMarker = null;
            WorkflowRouteDto workflowRouteDtoFromProto = route != null ? WorkflowRouteDto.INSTANCE.fromProto(route) : null;
            ContactSupport$ActionResponse contact_support_action_response = proto.getContact_support_action_response();
            ContactSupportDto7 contactSupportDto7FromProto = contact_support_action_response != null ? ContactSupportDto7.INSTANCE.fromProto(contact_support_action_response) : null;
            DeviceApprovalChallenge$ActionResponse device_approval_challenge_action_response = proto.getDevice_approval_challenge_action_response();
            DeviceApprovalChallengeDto7 deviceApprovalChallengeDto7FromProto = device_approval_challenge_action_response != null ? DeviceApprovalChallengeDto7.INSTANCE.fromProto(device_approval_challenge_action_response) : null;
            SmsChallenge$ActionResponse sms_challenge_action_response = proto.getSms_challenge_action_response();
            SmsChallengeDto7 smsChallengeDto7FromProto = sms_challenge_action_response != null ? SmsChallengeDto7.INSTANCE.fromProto(sms_challenge_action_response) : null;
            EmailChallenge$ActionResponse email_challenge_action_response = proto.getEmail_challenge_action_response();
            EmailChallengeDto7 emailChallengeDto7FromProto = email_challenge_action_response != null ? EmailChallengeDto7.INSTANCE.fromProto(email_challenge_action_response) : null;
            KycStatusCheck$ActionResponse kyc_status_check_action_response = proto.getKyc_status_check_action_response();
            return new WorkflowActionResponseDto(new Surrogate(workflowRouteDtoFromProto, contactSupportDto7FromProto, deviceApprovalChallengeDto7FromProto, smsChallengeDto7FromProto, emailChallengeDto7FromProto, kyc_status_check_action_response != null ? KycStatusCheckDto$ActionResponseDto.INSTANCE.fromProto(kyc_status_check_action_response) : null), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: identi.service.v1.models_workflow.v1.WorkflowActionResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WorkflowActionResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new WorkflowActionResponseDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: WorkflowActionResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \t2\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowActionResponseDto$ActionResponseDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "ContactSupportActionResponse", "DeviceApprovalChallengeActionResponse", "SmsChallengeActionResponse", "EmailChallengeActionResponse", "KycStatusCheckActionResponse", "Companion", "Lidenti/service/v1/models_workflow/v1/WorkflowActionResponseDto$ActionResponseDto$ContactSupportActionResponse;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionResponseDto$ActionResponseDto$DeviceApprovalChallengeActionResponse;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionResponseDto$ActionResponseDto$EmailChallengeActionResponse;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionResponseDto$ActionResponseDto$KycStatusCheckActionResponse;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionResponseDto$ActionResponseDto$SmsChallengeActionResponse;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class ActionResponseDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ ActionResponseDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionResponseDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: WorkflowActionResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowActionResponseDto$ActionResponseDto$ContactSupportActionResponse;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionResponseDto$ActionResponseDto;", "Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto;", "value", "<init>", "(Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto;", "getValue", "()Lidenti/service/v1/models_workflow/v1/ContactSupportDto$ActionResponseDto;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ContactSupportActionResponse extends ActionResponseDto {
            private final ContactSupportDto7 value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ContactSupportActionResponse) && Intrinsics.areEqual(this.value, ((ContactSupportActionResponse) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ContactSupportActionResponse(value=" + this.value + ")";
            }

            public final ContactSupportDto7 getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ContactSupportActionResponse(ContactSupportDto7 value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: WorkflowActionResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowActionResponseDto$ActionResponseDto$DeviceApprovalChallengeActionResponse;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionResponseDto$ActionResponseDto;", "Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallengeDto$ActionResponseDto;", "value", "<init>", "(Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallengeDto$ActionResponseDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallengeDto$ActionResponseDto;", "getValue", "()Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallengeDto$ActionResponseDto;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class DeviceApprovalChallengeActionResponse extends ActionResponseDto {
            private final DeviceApprovalChallengeDto7 value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DeviceApprovalChallengeActionResponse) && Intrinsics.areEqual(this.value, ((DeviceApprovalChallengeActionResponse) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "DeviceApprovalChallengeActionResponse(value=" + this.value + ")";
            }

            public final DeviceApprovalChallengeDto7 getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DeviceApprovalChallengeActionResponse(DeviceApprovalChallengeDto7 value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: WorkflowActionResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowActionResponseDto$ActionResponseDto$SmsChallengeActionResponse;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionResponseDto$ActionResponseDto;", "Lidenti/service/v1/models_workflow/v1/SmsChallengeDto$ActionResponseDto;", "value", "<init>", "(Lidenti/service/v1/models_workflow/v1/SmsChallengeDto$ActionResponseDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/SmsChallengeDto$ActionResponseDto;", "getValue", "()Lidenti/service/v1/models_workflow/v1/SmsChallengeDto$ActionResponseDto;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SmsChallengeActionResponse extends ActionResponseDto {
            private final SmsChallengeDto7 value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SmsChallengeActionResponse) && Intrinsics.areEqual(this.value, ((SmsChallengeActionResponse) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "SmsChallengeActionResponse(value=" + this.value + ")";
            }

            public final SmsChallengeDto7 getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SmsChallengeActionResponse(SmsChallengeDto7 value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: WorkflowActionResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowActionResponseDto$ActionResponseDto$EmailChallengeActionResponse;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionResponseDto$ActionResponseDto;", "Lidenti/service/v1/models_workflow/v1/EmailChallengeDto$ActionResponseDto;", "value", "<init>", "(Lidenti/service/v1/models_workflow/v1/EmailChallengeDto$ActionResponseDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/EmailChallengeDto$ActionResponseDto;", "getValue", "()Lidenti/service/v1/models_workflow/v1/EmailChallengeDto$ActionResponseDto;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class EmailChallengeActionResponse extends ActionResponseDto {
            private final EmailChallengeDto7 value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof EmailChallengeActionResponse) && Intrinsics.areEqual(this.value, ((EmailChallengeActionResponse) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "EmailChallengeActionResponse(value=" + this.value + ")";
            }

            public final EmailChallengeDto7 getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EmailChallengeActionResponse(EmailChallengeDto7 value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: WorkflowActionResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowActionResponseDto$ActionResponseDto$KycStatusCheckActionResponse;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionResponseDto$ActionResponseDto;", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionResponseDto;", "value", "<init>", "(Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionResponseDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionResponseDto;", "getValue", "()Lidenti/service/v1/models_workflow/v1/KycStatusCheckDto$ActionResponseDto;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class KycStatusCheckActionResponse extends ActionResponseDto {
            private final KycStatusCheckDto$ActionResponseDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof KycStatusCheckActionResponse) && Intrinsics.areEqual(this.value, ((KycStatusCheckActionResponse) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "KycStatusCheckActionResponse(value=" + this.value + ")";
            }

            public final KycStatusCheckDto$ActionResponseDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public KycStatusCheckActionResponse(KycStatusCheckDto$ActionResponseDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: WorkflowActionResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowActionResponseDto$ActionResponseDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionResponseDto$ActionResponseDto;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionResponse;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes14.dex */
        public static final class Companion implements Dto4.Creator<ActionResponseDto, WorkflowActionResponse> {
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
            public ProtoAdapter<WorkflowActionResponse> getProtoAdapter() {
                return WorkflowActionResponse.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ActionResponseDto fromProto(WorkflowActionResponse proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getContact_support_action_response() != null) {
                    return new ContactSupportActionResponse(ContactSupportDto7.INSTANCE.fromProto(proto.getContact_support_action_response()));
                }
                if (proto.getDevice_approval_challenge_action_response() != null) {
                    return new DeviceApprovalChallengeActionResponse(DeviceApprovalChallengeDto7.INSTANCE.fromProto(proto.getDevice_approval_challenge_action_response()));
                }
                if (proto.getSms_challenge_action_response() != null) {
                    return new SmsChallengeActionResponse(SmsChallengeDto7.INSTANCE.fromProto(proto.getSms_challenge_action_response()));
                }
                if (proto.getEmail_challenge_action_response() != null) {
                    return new EmailChallengeActionResponse(EmailChallengeDto7.INSTANCE.fromProto(proto.getEmail_challenge_action_response()));
                }
                if (proto.getKyc_status_check_action_response() != null) {
                    return new KycStatusCheckActionResponse(KycStatusCheckDto$ActionResponseDto.INSTANCE.fromProto(proto.getKyc_status_check_action_response()));
                }
                return null;
            }
        }
    }

    /* compiled from: WorkflowActionResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowActionResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lidenti/service/v1/models_workflow/v1/WorkflowActionResponseDto;", "<init>", "()V", "surrogateSerializer", "Lidenti/service/v1/models_workflow/v1/WorkflowActionResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes14.dex */
    public static final class Serializer implements KSerializer<WorkflowActionResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/identi.service.v1.models_workflow.v1.WorkflowActionResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, WorkflowActionResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public WorkflowActionResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new WorkflowActionResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: WorkflowActionResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowActionResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "identi.service.v1.models_workflow.v1.WorkflowActionResponseDto";
        }
    }
}
