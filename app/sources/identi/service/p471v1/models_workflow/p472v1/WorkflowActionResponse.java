package identi.service.p471v1.models_workflow.p472v1;

import com.google.android.libraries.places.api.model.PlaceTypes;
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

/* compiled from: WorkflowActionResponse.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)BY\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u001f\u001a\u00020\u0002H\u0017J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020'H\u0016JX\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006*"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowActionResponse;", "Lcom/squareup/wire/Message;", "", PlaceTypes.ROUTE, "Lidenti/service/v1/models_workflow/v1/WorkflowRoute;", "contact_support_action_response", "Lidenti/service/v1/models_workflow/v1/ContactSupport$ActionResponse;", "device_approval_challenge_action_response", "Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallenge$ActionResponse;", "sms_challenge_action_response", "Lidenti/service/v1/models_workflow/v1/SmsChallenge$ActionResponse;", "email_challenge_action_response", "Lidenti/service/v1/models_workflow/v1/EmailChallenge$ActionResponse;", "kyc_status_check_action_response", "Lidenti/service/v1/models_workflow/v1/KycStatusCheck$ActionResponse;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lidenti/service/v1/models_workflow/v1/WorkflowRoute;Lidenti/service/v1/models_workflow/v1/ContactSupport$ActionResponse;Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallenge$ActionResponse;Lidenti/service/v1/models_workflow/v1/SmsChallenge$ActionResponse;Lidenti/service/v1/models_workflow/v1/EmailChallenge$ActionResponse;Lidenti/service/v1/models_workflow/v1/KycStatusCheck$ActionResponse;Lokio/ByteString;)V", "getRoute", "()Lidenti/service/v1/models_workflow/v1/WorkflowRoute;", "getContact_support_action_response", "()Lidenti/service/v1/models_workflow/v1/ContactSupport$ActionResponse;", "getDevice_approval_challenge_action_response", "()Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallenge$ActionResponse;", "getSms_challenge_action_response", "()Lidenti/service/v1/models_workflow/v1/SmsChallenge$ActionResponse;", "getEmail_challenge_action_response", "()Lidenti/service/v1/models_workflow/v1/EmailChallenge$ActionResponse;", "getKyc_status_check_action_response", "()Lidenti/service/v1/models_workflow/v1/KycStatusCheck$ActionResponse;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class WorkflowActionResponse extends Message {

    @JvmField
    public static final ProtoAdapter<WorkflowActionResponse> ADAPTER;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.ContactSupport$ActionResponse#ADAPTER", jsonName = "contactSupportActionResponse", oneofName = "action_response", schemaIndex = 1, tag = 16)
    private final ContactSupport$ActionResponse contact_support_action_response;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.DeviceApprovalChallenge$ActionResponse#ADAPTER", jsonName = "deviceApprovalChallengeActionResponse", oneofName = "action_response", schemaIndex = 2, tag = 17)
    private final DeviceApprovalChallenge$ActionResponse device_approval_challenge_action_response;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.EmailChallenge$ActionResponse#ADAPTER", jsonName = "emailChallengeActionResponse", oneofName = "action_response", schemaIndex = 4, tag = 19)
    private final EmailChallenge$ActionResponse email_challenge_action_response;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.KycStatusCheck$ActionResponse#ADAPTER", jsonName = "kycStatusCheckActionResponse", oneofName = "action_response", schemaIndex = 5, tag = 20)
    private final KycStatusCheck$ActionResponse kyc_status_check_action_response;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.WorkflowRoute#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final WorkflowRoute route;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.SmsChallenge$ActionResponse#ADAPTER", jsonName = "smsChallengeActionResponse", oneofName = "action_response", schemaIndex = 3, tag = 18)
    private final SmsChallenge$ActionResponse sms_challenge_action_response;

    public WorkflowActionResponse() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28421newBuilder();
    }

    public final WorkflowRoute getRoute() {
        return this.route;
    }

    public final ContactSupport$ActionResponse getContact_support_action_response() {
        return this.contact_support_action_response;
    }

    public final DeviceApprovalChallenge$ActionResponse getDevice_approval_challenge_action_response() {
        return this.device_approval_challenge_action_response;
    }

    public final SmsChallenge$ActionResponse getSms_challenge_action_response() {
        return this.sms_challenge_action_response;
    }

    public final EmailChallenge$ActionResponse getEmail_challenge_action_response() {
        return this.email_challenge_action_response;
    }

    public final KycStatusCheck$ActionResponse getKyc_status_check_action_response() {
        return this.kyc_status_check_action_response;
    }

    public /* synthetic */ WorkflowActionResponse(WorkflowRoute workflowRoute, ContactSupport$ActionResponse contactSupport$ActionResponse, DeviceApprovalChallenge$ActionResponse deviceApprovalChallenge$ActionResponse, SmsChallenge$ActionResponse smsChallenge$ActionResponse, EmailChallenge$ActionResponse emailChallenge$ActionResponse, KycStatusCheck$ActionResponse kycStatusCheck$ActionResponse, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : workflowRoute, (i & 2) != 0 ? null : contactSupport$ActionResponse, (i & 4) != 0 ? null : deviceApprovalChallenge$ActionResponse, (i & 8) != 0 ? null : smsChallenge$ActionResponse, (i & 16) != 0 ? null : emailChallenge$ActionResponse, (i & 32) != 0 ? null : kycStatusCheck$ActionResponse, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkflowActionResponse(WorkflowRoute workflowRoute, ContactSupport$ActionResponse contactSupport$ActionResponse, DeviceApprovalChallenge$ActionResponse deviceApprovalChallenge$ActionResponse, SmsChallenge$ActionResponse smsChallenge$ActionResponse, EmailChallenge$ActionResponse emailChallenge$ActionResponse, KycStatusCheck$ActionResponse kycStatusCheck$ActionResponse, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.route = workflowRoute;
        this.contact_support_action_response = contactSupport$ActionResponse;
        this.device_approval_challenge_action_response = deviceApprovalChallenge$ActionResponse;
        this.sms_challenge_action_response = smsChallenge$ActionResponse;
        this.email_challenge_action_response = emailChallenge$ActionResponse;
        this.kyc_status_check_action_response = kycStatusCheck$ActionResponse;
        if (Internal.countNonNull(contactSupport$ActionResponse, deviceApprovalChallenge$ActionResponse, smsChallenge$ActionResponse, emailChallenge$ActionResponse, kycStatusCheck$ActionResponse) > 1) {
            throw new IllegalArgumentException("At most one of contact_support_action_response, device_approval_challenge_action_response, sms_challenge_action_response, email_challenge_action_response, kyc_status_check_action_response may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28421newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof WorkflowActionResponse)) {
            return false;
        }
        WorkflowActionResponse workflowActionResponse = (WorkflowActionResponse) other;
        return Intrinsics.areEqual(unknownFields(), workflowActionResponse.unknownFields()) && Intrinsics.areEqual(this.route, workflowActionResponse.route) && Intrinsics.areEqual(this.contact_support_action_response, workflowActionResponse.contact_support_action_response) && Intrinsics.areEqual(this.device_approval_challenge_action_response, workflowActionResponse.device_approval_challenge_action_response) && Intrinsics.areEqual(this.sms_challenge_action_response, workflowActionResponse.sms_challenge_action_response) && Intrinsics.areEqual(this.email_challenge_action_response, workflowActionResponse.email_challenge_action_response) && Intrinsics.areEqual(this.kyc_status_check_action_response, workflowActionResponse.kyc_status_check_action_response);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        WorkflowRoute workflowRoute = this.route;
        int iHashCode2 = (iHashCode + (workflowRoute != null ? workflowRoute.hashCode() : 0)) * 37;
        ContactSupport$ActionResponse contactSupport$ActionResponse = this.contact_support_action_response;
        int iHashCode3 = (iHashCode2 + (contactSupport$ActionResponse != null ? contactSupport$ActionResponse.hashCode() : 0)) * 37;
        DeviceApprovalChallenge$ActionResponse deviceApprovalChallenge$ActionResponse = this.device_approval_challenge_action_response;
        int iHashCode4 = (iHashCode3 + (deviceApprovalChallenge$ActionResponse != null ? deviceApprovalChallenge$ActionResponse.hashCode() : 0)) * 37;
        SmsChallenge$ActionResponse smsChallenge$ActionResponse = this.sms_challenge_action_response;
        int iHashCode5 = (iHashCode4 + (smsChallenge$ActionResponse != null ? smsChallenge$ActionResponse.hashCode() : 0)) * 37;
        EmailChallenge$ActionResponse emailChallenge$ActionResponse = this.email_challenge_action_response;
        int iHashCode6 = (iHashCode5 + (emailChallenge$ActionResponse != null ? emailChallenge$ActionResponse.hashCode() : 0)) * 37;
        KycStatusCheck$ActionResponse kycStatusCheck$ActionResponse = this.kyc_status_check_action_response;
        int iHashCode7 = iHashCode6 + (kycStatusCheck$ActionResponse != null ? kycStatusCheck$ActionResponse.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        WorkflowRoute workflowRoute = this.route;
        if (workflowRoute != null) {
            arrayList.add("route=" + workflowRoute);
        }
        ContactSupport$ActionResponse contactSupport$ActionResponse = this.contact_support_action_response;
        if (contactSupport$ActionResponse != null) {
            arrayList.add("contact_support_action_response=" + contactSupport$ActionResponse);
        }
        DeviceApprovalChallenge$ActionResponse deviceApprovalChallenge$ActionResponse = this.device_approval_challenge_action_response;
        if (deviceApprovalChallenge$ActionResponse != null) {
            arrayList.add("device_approval_challenge_action_response=" + deviceApprovalChallenge$ActionResponse);
        }
        SmsChallenge$ActionResponse smsChallenge$ActionResponse = this.sms_challenge_action_response;
        if (smsChallenge$ActionResponse != null) {
            arrayList.add("sms_challenge_action_response=" + smsChallenge$ActionResponse);
        }
        EmailChallenge$ActionResponse emailChallenge$ActionResponse = this.email_challenge_action_response;
        if (emailChallenge$ActionResponse != null) {
            arrayList.add("email_challenge_action_response=" + emailChallenge$ActionResponse);
        }
        KycStatusCheck$ActionResponse kycStatusCheck$ActionResponse = this.kyc_status_check_action_response;
        if (kycStatusCheck$ActionResponse != null) {
            arrayList.add("kyc_status_check_action_response=" + kycStatusCheck$ActionResponse);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "WorkflowActionResponse{", "}", 0, null, null, 56, null);
    }

    public final WorkflowActionResponse copy(WorkflowRoute route, ContactSupport$ActionResponse contact_support_action_response, DeviceApprovalChallenge$ActionResponse device_approval_challenge_action_response, SmsChallenge$ActionResponse sms_challenge_action_response, EmailChallenge$ActionResponse email_challenge_action_response, KycStatusCheck$ActionResponse kyc_status_check_action_response, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new WorkflowActionResponse(route, contact_support_action_response, device_approval_challenge_action_response, sms_challenge_action_response, email_challenge_action_response, kyc_status_check_action_response, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(WorkflowActionResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<WorkflowActionResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.WorkflowActionResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(WorkflowActionResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getRoute() != null) {
                    size += WorkflowRoute.ADAPTER.encodedSizeWithTag(1, value.getRoute());
                }
                return size + ContactSupport$ActionResponse.ADAPTER.encodedSizeWithTag(16, value.getContact_support_action_response()) + DeviceApprovalChallenge$ActionResponse.ADAPTER.encodedSizeWithTag(17, value.getDevice_approval_challenge_action_response()) + SmsChallenge$ActionResponse.ADAPTER.encodedSizeWithTag(18, value.getSms_challenge_action_response()) + EmailChallenge$ActionResponse.ADAPTER.encodedSizeWithTag(19, value.getEmail_challenge_action_response()) + KycStatusCheck$ActionResponse.ADAPTER.encodedSizeWithTag(20, value.getKyc_status_check_action_response());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, WorkflowActionResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getRoute() != null) {
                    WorkflowRoute.ADAPTER.encodeWithTag(writer, 1, (int) value.getRoute());
                }
                ContactSupport$ActionResponse.ADAPTER.encodeWithTag(writer, 16, (int) value.getContact_support_action_response());
                DeviceApprovalChallenge$ActionResponse.ADAPTER.encodeWithTag(writer, 17, (int) value.getDevice_approval_challenge_action_response());
                SmsChallenge$ActionResponse.ADAPTER.encodeWithTag(writer, 18, (int) value.getSms_challenge_action_response());
                EmailChallenge$ActionResponse.ADAPTER.encodeWithTag(writer, 19, (int) value.getEmail_challenge_action_response());
                KycStatusCheck$ActionResponse.ADAPTER.encodeWithTag(writer, 20, (int) value.getKyc_status_check_action_response());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, WorkflowActionResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                KycStatusCheck$ActionResponse.ADAPTER.encodeWithTag(writer, 20, (int) value.getKyc_status_check_action_response());
                EmailChallenge$ActionResponse.ADAPTER.encodeWithTag(writer, 19, (int) value.getEmail_challenge_action_response());
                SmsChallenge$ActionResponse.ADAPTER.encodeWithTag(writer, 18, (int) value.getSms_challenge_action_response());
                DeviceApprovalChallenge$ActionResponse.ADAPTER.encodeWithTag(writer, 17, (int) value.getDevice_approval_challenge_action_response());
                ContactSupport$ActionResponse.ADAPTER.encodeWithTag(writer, 16, (int) value.getContact_support_action_response());
                if (value.getRoute() != null) {
                    WorkflowRoute.ADAPTER.encodeWithTag(writer, 1, (int) value.getRoute());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public WorkflowActionResponse redact(WorkflowActionResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                WorkflowRoute route = value.getRoute();
                WorkflowRoute workflowRouteRedact = route != null ? WorkflowRoute.ADAPTER.redact(route) : null;
                ContactSupport$ActionResponse contact_support_action_response = value.getContact_support_action_response();
                ContactSupport$ActionResponse contactSupport$ActionResponseRedact = contact_support_action_response != null ? ContactSupport$ActionResponse.ADAPTER.redact(contact_support_action_response) : null;
                DeviceApprovalChallenge$ActionResponse device_approval_challenge_action_response = value.getDevice_approval_challenge_action_response();
                DeviceApprovalChallenge$ActionResponse deviceApprovalChallenge$ActionResponseRedact = device_approval_challenge_action_response != null ? DeviceApprovalChallenge$ActionResponse.ADAPTER.redact(device_approval_challenge_action_response) : null;
                SmsChallenge$ActionResponse sms_challenge_action_response = value.getSms_challenge_action_response();
                SmsChallenge$ActionResponse smsChallenge$ActionResponseRedact = sms_challenge_action_response != null ? SmsChallenge$ActionResponse.ADAPTER.redact(sms_challenge_action_response) : null;
                EmailChallenge$ActionResponse email_challenge_action_response = value.getEmail_challenge_action_response();
                EmailChallenge$ActionResponse emailChallenge$ActionResponseRedact = email_challenge_action_response != null ? EmailChallenge$ActionResponse.ADAPTER.redact(email_challenge_action_response) : null;
                KycStatusCheck$ActionResponse kyc_status_check_action_response = value.getKyc_status_check_action_response();
                return value.copy(workflowRouteRedact, contactSupport$ActionResponseRedact, deviceApprovalChallenge$ActionResponseRedact, smsChallenge$ActionResponseRedact, emailChallenge$ActionResponseRedact, kyc_status_check_action_response != null ? KycStatusCheck$ActionResponse.ADAPTER.redact(kyc_status_check_action_response) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public WorkflowActionResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                WorkflowRoute workflowRouteDecode = null;
                ContactSupport$ActionResponse contactSupport$ActionResponseDecode = null;
                DeviceApprovalChallenge$ActionResponse deviceApprovalChallenge$ActionResponseDecode = null;
                SmsChallenge$ActionResponse smsChallenge$ActionResponseDecode = null;
                EmailChallenge$ActionResponse emailChallenge$ActionResponseDecode = null;
                KycStatusCheck$ActionResponse kycStatusCheck$ActionResponseDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new WorkflowActionResponse(workflowRouteDecode, contactSupport$ActionResponseDecode, deviceApprovalChallenge$ActionResponseDecode, smsChallenge$ActionResponseDecode, emailChallenge$ActionResponseDecode, kycStatusCheck$ActionResponseDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        workflowRouteDecode = WorkflowRoute.ADAPTER.decode(reader);
                    } else {
                        switch (iNextTag) {
                            case 16:
                                contactSupport$ActionResponseDecode = ContactSupport$ActionResponse.ADAPTER.decode(reader);
                                break;
                            case 17:
                                deviceApprovalChallenge$ActionResponseDecode = DeviceApprovalChallenge$ActionResponse.ADAPTER.decode(reader);
                                break;
                            case 18:
                                smsChallenge$ActionResponseDecode = SmsChallenge$ActionResponse.ADAPTER.decode(reader);
                                break;
                            case 19:
                                emailChallenge$ActionResponseDecode = EmailChallenge$ActionResponse.ADAPTER.decode(reader);
                                break;
                            case 20:
                                kycStatusCheck$ActionResponseDecode = KycStatusCheck$ActionResponse.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    }
                }
            }
        };
    }
}
