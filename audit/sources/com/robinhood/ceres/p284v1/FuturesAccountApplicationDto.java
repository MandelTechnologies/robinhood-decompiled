package com.robinhood.ceres.p284v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDeeplinkTarget;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.ceres.p284v1.ApplicationRejectionReasonDto;
import com.robinhood.ceres.p284v1.ApplicationStatusDto;
import com.robinhood.ceres.p284v1.BrokerageAccountTypeDto;
import com.robinhood.ceres.p284v1.FuturesAccountApplicationDto;
import com.robinhood.ceres.p284v1.ManualReviewTriggerDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* compiled from: FuturesAccountApplicationDto.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 E2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004DEFGB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B¿\u0001\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u001a\u001a\u00020\t\u0012\b\b\u0002\u0010\u001b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u001d¢\u0006\u0004\b\u0006\u0010\u001eJ¼\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\t2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u001dJ\b\u00106\u001a\u00020\u0002H\u0016J\b\u00107\u001a\u00020\tH\u0016J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;H\u0096\u0002J\b\u0010<\u001a\u00020=H\u0016J\u0018\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020=H\u0016J\b\u0010C\u001a\u00020=H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b!\u0010 R\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b)\u0010 R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b*\u0010 R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b+\u0010 R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b,\u0010 R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b-\u0010 R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b0\u0010 R\u0011\u0010\u001a\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b1\u0010 R\u0011\u0010\u001b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b2\u0010 R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u001d8F¢\u0006\u0006\u001a\u0004\b3\u00104¨\u0006H"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesAccountApplicationDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/ceres/v1/FuturesAccountApplication;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/ceres/v1/FuturesAccountApplicationDto$Surrogate;", "<init>", "(Lcom/robinhood/ceres/v1/FuturesAccountApplicationDto$Surrogate;)V", "application_id", "", "user_uuid", "rhs_account_number", AdvisoryPostAgreementsDeeplinkTarget.ACCOUNT_TYPE_QUERY_PARAM, "Lcom/robinhood/ceres/v1/BrokerageAccountTypeDto;", "status", "Lcom/robinhood/ceres/v1/ApplicationStatusDto;", "manual_review_trigger", "Lcom/robinhood/ceres/v1/ManualReviewTriggerDto;", "last_updated_by_alias", "approved_by_alias", "approved_at", "rejected_by_alias", "rejected_at", "rejection_reason", "Lcom/robinhood/ceres/v1/ApplicationRejectionReasonDto;", "annotation", "created_at", "updated_at", "manual_review_triggers", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/BrokerageAccountTypeDto;Lcom/robinhood/ceres/v1/ApplicationStatusDto;Lcom/robinhood/ceres/v1/ManualReviewTriggerDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/ApplicationRejectionReasonDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getApplication_id", "()Ljava/lang/String;", "getUser_uuid", "getRhs_account_number", "getBrokerage_account_type", "()Lcom/robinhood/ceres/v1/BrokerageAccountTypeDto;", "getStatus", "()Lcom/robinhood/ceres/v1/ApplicationStatusDto;", "getManual_review_trigger", "()Lcom/robinhood/ceres/v1/ManualReviewTriggerDto;", "getLast_updated_by_alias", "getApproved_by_alias", "getApproved_at", "getRejected_by_alias", "getRejected_at", "getRejection_reason", "()Lcom/robinhood/ceres/v1/ApplicationRejectionReasonDto;", "getAnnotation", "getCreated_at", "getUpdated_at", "getManual_review_triggers", "()Ljava/util/List;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class FuturesAccountApplicationDto implements Dto3<FuturesAccountApplication>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<FuturesAccountApplicationDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FuturesAccountApplicationDto, FuturesAccountApplication>> binaryBase64Serializer$delegate;
    private static final FuturesAccountApplicationDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ FuturesAccountApplicationDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FuturesAccountApplicationDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getApplication_id() {
        return this.surrogate.getApplication_id();
    }

    public final String getUser_uuid() {
        return this.surrogate.getUser_uuid();
    }

    public final String getRhs_account_number() {
        return this.surrogate.getRhs_account_number();
    }

    public final BrokerageAccountTypeDto getBrokerage_account_type() {
        return this.surrogate.getBrokerage_account_type();
    }

    public final ApplicationStatusDto getStatus() {
        return this.surrogate.getStatus();
    }

    public final ManualReviewTriggerDto getManual_review_trigger() {
        return this.surrogate.getManual_review_trigger();
    }

    public final String getLast_updated_by_alias() {
        return this.surrogate.getLast_updated_by_alias();
    }

    public final String getApproved_by_alias() {
        return this.surrogate.getApproved_by_alias();
    }

    public final String getApproved_at() {
        return this.surrogate.getApproved_at();
    }

    public final String getRejected_by_alias() {
        return this.surrogate.getRejected_by_alias();
    }

    public final String getRejected_at() {
        return this.surrogate.getRejected_at();
    }

    public final ApplicationRejectionReasonDto getRejection_reason() {
        return this.surrogate.getRejection_reason();
    }

    public final String getAnnotation() {
        return this.surrogate.getAnnotation();
    }

    public final String getCreated_at() {
        return this.surrogate.getCreated_at();
    }

    public final String getUpdated_at() {
        return this.surrogate.getUpdated_at();
    }

    public final List<ManualReviewTriggerDto> getManual_review_triggers() {
        return this.surrogate.getManual_review_triggers();
    }

    public /* synthetic */ FuturesAccountApplicationDto(String str, String str2, String str3, BrokerageAccountTypeDto brokerageAccountTypeDto, ApplicationStatusDto applicationStatusDto, ManualReviewTriggerDto manualReviewTriggerDto, String str4, String str5, String str6, String str7, String str8, ApplicationRejectionReasonDto applicationRejectionReasonDto, String str9, String str10, String str11, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? BrokerageAccountTypeDto.INSTANCE.getZeroValue() : brokerageAccountTypeDto, (i & 16) != 0 ? ApplicationStatusDto.INSTANCE.getZeroValue() : applicationStatusDto, (i & 32) != 0 ? null : manualReviewTriggerDto, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : applicationRejectionReasonDto, (i & 4096) == 0 ? str9 : null, (i & 8192) != 0 ? "" : str10, (i & 16384) == 0 ? str11 : "", (i & 32768) != 0 ? CollectionsKt.emptyList() : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FuturesAccountApplicationDto(String application_id, String user_uuid, String rhs_account_number, BrokerageAccountTypeDto brokerage_account_type, ApplicationStatusDto status, ManualReviewTriggerDto manualReviewTriggerDto, String str, String str2, String str3, String str4, String str5, ApplicationRejectionReasonDto applicationRejectionReasonDto, String str6, String created_at, String updated_at, List<? extends ManualReviewTriggerDto> manual_review_triggers) {
        this(new Surrogate(application_id, user_uuid, rhs_account_number, brokerage_account_type, status, manualReviewTriggerDto, str, str2, str3, str4, str5, applicationRejectionReasonDto, str6, created_at, updated_at, manual_review_triggers));
        Intrinsics.checkNotNullParameter(application_id, "application_id");
        Intrinsics.checkNotNullParameter(user_uuid, "user_uuid");
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
        Intrinsics.checkNotNullParameter(brokerage_account_type, "brokerage_account_type");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(updated_at, "updated_at");
        Intrinsics.checkNotNullParameter(manual_review_triggers, "manual_review_triggers");
    }

    public final FuturesAccountApplicationDto copy(String application_id, String user_uuid, String rhs_account_number, BrokerageAccountTypeDto brokerage_account_type, ApplicationStatusDto status, ManualReviewTriggerDto manual_review_trigger, String last_updated_by_alias, String approved_by_alias, String approved_at, String rejected_by_alias, String rejected_at, ApplicationRejectionReasonDto rejection_reason, String annotation, String created_at, String updated_at, List<? extends ManualReviewTriggerDto> manual_review_triggers) {
        Intrinsics.checkNotNullParameter(application_id, "application_id");
        Intrinsics.checkNotNullParameter(user_uuid, "user_uuid");
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
        Intrinsics.checkNotNullParameter(brokerage_account_type, "brokerage_account_type");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(updated_at, "updated_at");
        Intrinsics.checkNotNullParameter(manual_review_triggers, "manual_review_triggers");
        return new FuturesAccountApplicationDto(new Surrogate(application_id, user_uuid, rhs_account_number, brokerage_account_type, status, manual_review_trigger, last_updated_by_alias, approved_by_alias, approved_at, rejected_by_alias, rejected_at, rejection_reason, annotation, created_at, updated_at, manual_review_triggers));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public FuturesAccountApplication toProto() {
        String application_id = this.surrogate.getApplication_id();
        String user_uuid = this.surrogate.getUser_uuid();
        String rhs_account_number = this.surrogate.getRhs_account_number();
        BrokerageAccountType brokerageAccountType = (BrokerageAccountType) this.surrogate.getBrokerage_account_type().toProto();
        ApplicationStatus applicationStatus = (ApplicationStatus) this.surrogate.getStatus().toProto();
        ManualReviewTriggerDto manual_review_trigger = this.surrogate.getManual_review_trigger();
        ManualReviewTrigger manualReviewTrigger = manual_review_trigger != null ? (ManualReviewTrigger) manual_review_trigger.toProto() : null;
        String last_updated_by_alias = this.surrogate.getLast_updated_by_alias();
        String approved_by_alias = this.surrogate.getApproved_by_alias();
        String approved_at = this.surrogate.getApproved_at();
        String rejected_by_alias = this.surrogate.getRejected_by_alias();
        String rejected_at = this.surrogate.getRejected_at();
        ApplicationRejectionReasonDto rejection_reason = this.surrogate.getRejection_reason();
        ApplicationRejectionReason applicationRejectionReason = rejection_reason != null ? (ApplicationRejectionReason) rejection_reason.toProto() : null;
        String annotation = this.surrogate.getAnnotation();
        String created_at = this.surrogate.getCreated_at();
        String updated_at = this.surrogate.getUpdated_at();
        List<ManualReviewTriggerDto> manual_review_triggers = this.surrogate.getManual_review_triggers();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(manual_review_triggers, 10));
        Iterator<T> it = manual_review_triggers.iterator();
        while (it.hasNext()) {
            arrayList.add((ManualReviewTrigger) ((ManualReviewTriggerDto) it.next()).toProto());
        }
        return new FuturesAccountApplication(application_id, user_uuid, rhs_account_number, brokerageAccountType, applicationStatus, manualReviewTrigger, last_updated_by_alias, approved_by_alias, approved_at, rejected_by_alias, rejected_at, applicationRejectionReason, annotation, created_at, updated_at, arrayList, null, 65536, null);
    }

    public String toString() {
        return "[FuturesAccountApplicationDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof FuturesAccountApplicationDto) && Intrinsics.areEqual(((FuturesAccountApplicationDto) other).surrogate, this.surrogate);
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
    /* compiled from: FuturesAccountApplicationDto.kt */
    @Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b:\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 e2\u00020\u0001:\u0002deB½\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0017¢\u0006\u0004\b\u0018\u0010\u0019BÁ\u0001\b\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0017\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u0018\u0010\u001eJ\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0007HÆ\u0003J\t\u0010J\u001a\u00020\tHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\u000f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0017HÆ\u0003J¿\u0001\u0010V\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0017HÆ\u0001J\u0013\u0010W\u001a\u00020X2\b\u0010Y\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Z\u001a\u00020\u001bHÖ\u0001J\t\u0010[\u001a\u00020\u0003HÖ\u0001J%\u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020\u00002\u0006\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020bH\u0001¢\u0006\u0002\bcR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010 \u001a\u0004\b&\u0010\"R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010 \u001a\u0004\b(\u0010)R\u001c\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010 \u001a\u0004\b+\u0010,R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b-\u0010 \u001a\u0004\b.\u0010/R\u001e\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u0010 \u001a\u0004\b1\u0010\"R\u001e\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010 \u001a\u0004\b3\u0010\"R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b4\u0010 \u001a\u0004\b5\u0010\"R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b6\u0010 \u001a\u0004\b7\u0010\"R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b8\u0010 \u001a\u0004\b9\u0010\"R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b:\u0010 \u001a\u0004\b;\u0010<R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b=\u0010 \u001a\u0004\b>\u0010\"R\u001c\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b?\u0010 \u001a\u0004\b@\u0010\"R\u001c\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bA\u0010 \u001a\u0004\bB\u0010\"R\"\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00178\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bC\u0010 \u001a\u0004\bD\u0010E¨\u0006f"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesAccountApplicationDto$Surrogate;", "", "application_id", "", "user_uuid", "rhs_account_number", AdvisoryPostAgreementsDeeplinkTarget.ACCOUNT_TYPE_QUERY_PARAM, "Lcom/robinhood/ceres/v1/BrokerageAccountTypeDto;", "status", "Lcom/robinhood/ceres/v1/ApplicationStatusDto;", "manual_review_trigger", "Lcom/robinhood/ceres/v1/ManualReviewTriggerDto;", "last_updated_by_alias", "approved_by_alias", "approved_at", "rejected_by_alias", "rejected_at", "rejection_reason", "Lcom/robinhood/ceres/v1/ApplicationRejectionReasonDto;", "annotation", "created_at", "updated_at", "manual_review_triggers", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/BrokerageAccountTypeDto;Lcom/robinhood/ceres/v1/ApplicationStatusDto;Lcom/robinhood/ceres/v1/ManualReviewTriggerDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/ApplicationRejectionReasonDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/BrokerageAccountTypeDto;Lcom/robinhood/ceres/v1/ApplicationStatusDto;Lcom/robinhood/ceres/v1/ManualReviewTriggerDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/ApplicationRejectionReasonDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getApplication_id$annotations", "()V", "getApplication_id", "()Ljava/lang/String;", "getUser_uuid$annotations", "getUser_uuid", "getRhs_account_number$annotations", "getRhs_account_number", "getBrokerage_account_type$annotations", "getBrokerage_account_type", "()Lcom/robinhood/ceres/v1/BrokerageAccountTypeDto;", "getStatus$annotations", "getStatus", "()Lcom/robinhood/ceres/v1/ApplicationStatusDto;", "getManual_review_trigger$annotations", "getManual_review_trigger", "()Lcom/robinhood/ceres/v1/ManualReviewTriggerDto;", "getLast_updated_by_alias$annotations", "getLast_updated_by_alias", "getApproved_by_alias$annotations", "getApproved_by_alias", "getApproved_at$annotations", "getApproved_at", "getRejected_by_alias$annotations", "getRejected_by_alias", "getRejected_at$annotations", "getRejected_at", "getRejection_reason$annotations", "getRejection_reason", "()Lcom/robinhood/ceres/v1/ApplicationRejectionReasonDto;", "getAnnotation$annotations", "getAnnotation", "getCreated_at$annotations", "getCreated_at", "getUpdated_at$annotations", "getUpdated_at", "getManual_review_triggers$annotations", "getManual_review_triggers", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ceres_entity_v1_externalRelease", "$serializer", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final String annotation;
        private final String application_id;
        private final String approved_at;
        private final String approved_by_alias;
        private final BrokerageAccountTypeDto brokerage_account_type;
        private final String created_at;
        private final String last_updated_by_alias;
        private final ManualReviewTriggerDto manual_review_trigger;
        private final List<ManualReviewTriggerDto> manual_review_triggers;
        private final String rejected_at;
        private final String rejected_by_alias;
        private final ApplicationRejectionReasonDto rejection_reason;
        private final String rhs_account_number;
        private final ApplicationStatusDto status;
        private final String updated_at;
        private final String user_uuid;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.ceres.v1.FuturesAccountApplicationDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesAccountApplicationDto.Surrogate._childSerializers$_anonymous_();
            }
        })};

        public Surrogate() {
            this((String) null, (String) null, (String) null, (BrokerageAccountTypeDto) null, (ApplicationStatusDto) null, (ManualReviewTriggerDto) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ApplicationRejectionReasonDto) null, (String) null, (String) null, (String) null, (List) null, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(ManualReviewTriggerDto.Serializer.INSTANCE);
        }

        @SerialName("annotation")
        @JsonAnnotations2(names = {"annotation"})
        public static /* synthetic */ void getAnnotation$annotations() {
        }

        @SerialName("applicationId")
        @JsonAnnotations2(names = {"application_id"})
        public static /* synthetic */ void getApplication_id$annotations() {
        }

        @SerialName("approvedAt")
        @JsonAnnotations2(names = {"approved_at"})
        public static /* synthetic */ void getApproved_at$annotations() {
        }

        @SerialName("approvedByAlias")
        @JsonAnnotations2(names = {"approved_by_alias"})
        public static /* synthetic */ void getApproved_by_alias$annotations() {
        }

        @SerialName("brokerageAccountType")
        @JsonAnnotations2(names = {AdvisoryPostAgreementsDeeplinkTarget.ACCOUNT_TYPE_QUERY_PARAM})
        public static /* synthetic */ void getBrokerage_account_type$annotations() {
        }

        @SerialName("createdAt")
        @JsonAnnotations2(names = {"created_at"})
        public static /* synthetic */ void getCreated_at$annotations() {
        }

        @SerialName("lastUpdatedByAlias")
        @JsonAnnotations2(names = {"last_updated_by_alias"})
        public static /* synthetic */ void getLast_updated_by_alias$annotations() {
        }

        @SerialName("manualReviewTrigger")
        @JsonAnnotations2(names = {"manual_review_trigger"})
        public static /* synthetic */ void getManual_review_trigger$annotations() {
        }

        @SerialName("manualReviewTriggers")
        @JsonAnnotations2(names = {"manual_review_triggers"})
        public static /* synthetic */ void getManual_review_triggers$annotations() {
        }

        @SerialName("rejectedAt")
        @JsonAnnotations2(names = {"rejected_at"})
        public static /* synthetic */ void getRejected_at$annotations() {
        }

        @SerialName("rejectedByAlias")
        @JsonAnnotations2(names = {"rejected_by_alias"})
        public static /* synthetic */ void getRejected_by_alias$annotations() {
        }

        @SerialName("rejectionReason")
        @JsonAnnotations2(names = {"rejection_reason"})
        public static /* synthetic */ void getRejection_reason$annotations() {
        }

        @SerialName("rhsAccountNumber")
        @JsonAnnotations2(names = {"rhs_account_number"})
        public static /* synthetic */ void getRhs_account_number$annotations() {
        }

        @SerialName("status")
        @JsonAnnotations2(names = {"status"})
        public static /* synthetic */ void getStatus$annotations() {
        }

        @SerialName("updatedAt")
        @JsonAnnotations2(names = {"updated_at"})
        public static /* synthetic */ void getUpdated_at$annotations() {
        }

        @SerialName("userUuid")
        @JsonAnnotations2(names = {"user_uuid"})
        public static /* synthetic */ void getUser_uuid$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getApplication_id() {
            return this.application_id;
        }

        /* renamed from: component10, reason: from getter */
        public final String getRejected_by_alias() {
            return this.rejected_by_alias;
        }

        /* renamed from: component11, reason: from getter */
        public final String getRejected_at() {
            return this.rejected_at;
        }

        /* renamed from: component12, reason: from getter */
        public final ApplicationRejectionReasonDto getRejection_reason() {
            return this.rejection_reason;
        }

        /* renamed from: component13, reason: from getter */
        public final String getAnnotation() {
            return this.annotation;
        }

        /* renamed from: component14, reason: from getter */
        public final String getCreated_at() {
            return this.created_at;
        }

        /* renamed from: component15, reason: from getter */
        public final String getUpdated_at() {
            return this.updated_at;
        }

        public final List<ManualReviewTriggerDto> component16() {
            return this.manual_review_triggers;
        }

        /* renamed from: component2, reason: from getter */
        public final String getUser_uuid() {
            return this.user_uuid;
        }

        /* renamed from: component3, reason: from getter */
        public final String getRhs_account_number() {
            return this.rhs_account_number;
        }

        /* renamed from: component4, reason: from getter */
        public final BrokerageAccountTypeDto getBrokerage_account_type() {
            return this.brokerage_account_type;
        }

        /* renamed from: component5, reason: from getter */
        public final ApplicationStatusDto getStatus() {
            return this.status;
        }

        /* renamed from: component6, reason: from getter */
        public final ManualReviewTriggerDto getManual_review_trigger() {
            return this.manual_review_trigger;
        }

        /* renamed from: component7, reason: from getter */
        public final String getLast_updated_by_alias() {
            return this.last_updated_by_alias;
        }

        /* renamed from: component8, reason: from getter */
        public final String getApproved_by_alias() {
            return this.approved_by_alias;
        }

        /* renamed from: component9, reason: from getter */
        public final String getApproved_at() {
            return this.approved_at;
        }

        public final Surrogate copy(String application_id, String user_uuid, String rhs_account_number, BrokerageAccountTypeDto brokerage_account_type, ApplicationStatusDto status, ManualReviewTriggerDto manual_review_trigger, String last_updated_by_alias, String approved_by_alias, String approved_at, String rejected_by_alias, String rejected_at, ApplicationRejectionReasonDto rejection_reason, String annotation, String created_at, String updated_at, List<? extends ManualReviewTriggerDto> manual_review_triggers) {
            Intrinsics.checkNotNullParameter(application_id, "application_id");
            Intrinsics.checkNotNullParameter(user_uuid, "user_uuid");
            Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
            Intrinsics.checkNotNullParameter(brokerage_account_type, "brokerage_account_type");
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(created_at, "created_at");
            Intrinsics.checkNotNullParameter(updated_at, "updated_at");
            Intrinsics.checkNotNullParameter(manual_review_triggers, "manual_review_triggers");
            return new Surrogate(application_id, user_uuid, rhs_account_number, brokerage_account_type, status, manual_review_trigger, last_updated_by_alias, approved_by_alias, approved_at, rejected_by_alias, rejected_at, rejection_reason, annotation, created_at, updated_at, manual_review_triggers);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.application_id, surrogate.application_id) && Intrinsics.areEqual(this.user_uuid, surrogate.user_uuid) && Intrinsics.areEqual(this.rhs_account_number, surrogate.rhs_account_number) && this.brokerage_account_type == surrogate.brokerage_account_type && this.status == surrogate.status && this.manual_review_trigger == surrogate.manual_review_trigger && Intrinsics.areEqual(this.last_updated_by_alias, surrogate.last_updated_by_alias) && Intrinsics.areEqual(this.approved_by_alias, surrogate.approved_by_alias) && Intrinsics.areEqual(this.approved_at, surrogate.approved_at) && Intrinsics.areEqual(this.rejected_by_alias, surrogate.rejected_by_alias) && Intrinsics.areEqual(this.rejected_at, surrogate.rejected_at) && this.rejection_reason == surrogate.rejection_reason && Intrinsics.areEqual(this.annotation, surrogate.annotation) && Intrinsics.areEqual(this.created_at, surrogate.created_at) && Intrinsics.areEqual(this.updated_at, surrogate.updated_at) && Intrinsics.areEqual(this.manual_review_triggers, surrogate.manual_review_triggers);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.application_id.hashCode() * 31) + this.user_uuid.hashCode()) * 31) + this.rhs_account_number.hashCode()) * 31) + this.brokerage_account_type.hashCode()) * 31) + this.status.hashCode()) * 31;
            ManualReviewTriggerDto manualReviewTriggerDto = this.manual_review_trigger;
            int iHashCode2 = (iHashCode + (manualReviewTriggerDto == null ? 0 : manualReviewTriggerDto.hashCode())) * 31;
            String str = this.last_updated_by_alias;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.approved_by_alias;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.approved_at;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.rejected_by_alias;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.rejected_at;
            int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            ApplicationRejectionReasonDto applicationRejectionReasonDto = this.rejection_reason;
            int iHashCode8 = (iHashCode7 + (applicationRejectionReasonDto == null ? 0 : applicationRejectionReasonDto.hashCode())) * 31;
            String str6 = this.annotation;
            return ((((((iHashCode8 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.created_at.hashCode()) * 31) + this.updated_at.hashCode()) * 31) + this.manual_review_triggers.hashCode();
        }

        public String toString() {
            return "Surrogate(application_id=" + this.application_id + ", user_uuid=" + this.user_uuid + ", rhs_account_number=" + this.rhs_account_number + ", brokerage_account_type=" + this.brokerage_account_type + ", status=" + this.status + ", manual_review_trigger=" + this.manual_review_trigger + ", last_updated_by_alias=" + this.last_updated_by_alias + ", approved_by_alias=" + this.approved_by_alias + ", approved_at=" + this.approved_at + ", rejected_by_alias=" + this.rejected_by_alias + ", rejected_at=" + this.rejected_at + ", rejection_reason=" + this.rejection_reason + ", annotation=" + this.annotation + ", created_at=" + this.created_at + ", updated_at=" + this.updated_at + ", manual_review_triggers=" + this.manual_review_triggers + ")";
        }

        /* compiled from: FuturesAccountApplicationDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesAccountApplicationDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/FuturesAccountApplicationDto$Surrogate;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return FuturesAccountApplicationDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, BrokerageAccountTypeDto brokerageAccountTypeDto, ApplicationStatusDto applicationStatusDto, ManualReviewTriggerDto manualReviewTriggerDto, String str4, String str5, String str6, String str7, String str8, ApplicationRejectionReasonDto applicationRejectionReasonDto, String str9, String str10, String str11, List list, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.application_id = "";
            } else {
                this.application_id = str;
            }
            if ((i & 2) == 0) {
                this.user_uuid = "";
            } else {
                this.user_uuid = str2;
            }
            if ((i & 4) == 0) {
                this.rhs_account_number = "";
            } else {
                this.rhs_account_number = str3;
            }
            if ((i & 8) == 0) {
                this.brokerage_account_type = BrokerageAccountTypeDto.INSTANCE.getZeroValue();
            } else {
                this.brokerage_account_type = brokerageAccountTypeDto;
            }
            if ((i & 16) == 0) {
                this.status = ApplicationStatusDto.INSTANCE.getZeroValue();
            } else {
                this.status = applicationStatusDto;
            }
            if ((i & 32) == 0) {
                this.manual_review_trigger = null;
            } else {
                this.manual_review_trigger = manualReviewTriggerDto;
            }
            if ((i & 64) == 0) {
                this.last_updated_by_alias = null;
            } else {
                this.last_updated_by_alias = str4;
            }
            if ((i & 128) == 0) {
                this.approved_by_alias = null;
            } else {
                this.approved_by_alias = str5;
            }
            if ((i & 256) == 0) {
                this.approved_at = null;
            } else {
                this.approved_at = str6;
            }
            if ((i & 512) == 0) {
                this.rejected_by_alias = null;
            } else {
                this.rejected_by_alias = str7;
            }
            if ((i & 1024) == 0) {
                this.rejected_at = null;
            } else {
                this.rejected_at = str8;
            }
            if ((i & 2048) == 0) {
                this.rejection_reason = null;
            } else {
                this.rejection_reason = applicationRejectionReasonDto;
            }
            if ((i & 4096) == 0) {
                this.annotation = null;
            } else {
                this.annotation = str9;
            }
            if ((i & 8192) == 0) {
                this.created_at = "";
            } else {
                this.created_at = str10;
            }
            if ((i & 16384) == 0) {
                this.updated_at = "";
            } else {
                this.updated_at = str11;
            }
            this.manual_review_triggers = (i & 32768) == 0 ? CollectionsKt.emptyList() : list;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$ceres_entity_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.application_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.application_id);
            }
            if (!Intrinsics.areEqual(self.user_uuid, "")) {
                output.encodeStringElement(serialDesc, 1, self.user_uuid);
            }
            if (!Intrinsics.areEqual(self.rhs_account_number, "")) {
                output.encodeStringElement(serialDesc, 2, self.rhs_account_number);
            }
            if (self.brokerage_account_type != BrokerageAccountTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, BrokerageAccountTypeDto.Serializer.INSTANCE, self.brokerage_account_type);
            }
            if (self.status != ApplicationStatusDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, ApplicationStatusDto.Serializer.INSTANCE, self.status);
            }
            ManualReviewTriggerDto manualReviewTriggerDto = self.manual_review_trigger;
            if (manualReviewTriggerDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, ManualReviewTriggerDto.Serializer.INSTANCE, manualReviewTriggerDto);
            }
            String str = self.last_updated_by_alias;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, str);
            }
            String str2 = self.approved_by_alias;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, str2);
            }
            String str3 = self.approved_at;
            if (str3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, str3);
            }
            String str4 = self.rejected_by_alias;
            if (str4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, str4);
            }
            String str5 = self.rejected_at;
            if (str5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, StringSerializer.INSTANCE, str5);
            }
            ApplicationRejectionReasonDto applicationRejectionReasonDto = self.rejection_reason;
            if (applicationRejectionReasonDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, ApplicationRejectionReasonDto.Serializer.INSTANCE, applicationRejectionReasonDto);
            }
            String str6 = self.annotation;
            if (str6 != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, StringSerializer.INSTANCE, str6);
            }
            if (!Intrinsics.areEqual(self.created_at, "")) {
                output.encodeStringElement(serialDesc, 13, self.created_at);
            }
            if (!Intrinsics.areEqual(self.updated_at, "")) {
                output.encodeStringElement(serialDesc, 14, self.updated_at);
            }
            if (Intrinsics.areEqual(self.manual_review_triggers, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 15, lazyArr[15].getValue(), self.manual_review_triggers);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate(String application_id, String user_uuid, String rhs_account_number, BrokerageAccountTypeDto brokerage_account_type, ApplicationStatusDto status, ManualReviewTriggerDto manualReviewTriggerDto, String str, String str2, String str3, String str4, String str5, ApplicationRejectionReasonDto applicationRejectionReasonDto, String str6, String created_at, String updated_at, List<? extends ManualReviewTriggerDto> manual_review_triggers) {
            Intrinsics.checkNotNullParameter(application_id, "application_id");
            Intrinsics.checkNotNullParameter(user_uuid, "user_uuid");
            Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
            Intrinsics.checkNotNullParameter(brokerage_account_type, "brokerage_account_type");
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(created_at, "created_at");
            Intrinsics.checkNotNullParameter(updated_at, "updated_at");
            Intrinsics.checkNotNullParameter(manual_review_triggers, "manual_review_triggers");
            this.application_id = application_id;
            this.user_uuid = user_uuid;
            this.rhs_account_number = rhs_account_number;
            this.brokerage_account_type = brokerage_account_type;
            this.status = status;
            this.manual_review_trigger = manualReviewTriggerDto;
            this.last_updated_by_alias = str;
            this.approved_by_alias = str2;
            this.approved_at = str3;
            this.rejected_by_alias = str4;
            this.rejected_at = str5;
            this.rejection_reason = applicationRejectionReasonDto;
            this.annotation = str6;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.manual_review_triggers = manual_review_triggers;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, BrokerageAccountTypeDto brokerageAccountTypeDto, ApplicationStatusDto applicationStatusDto, ManualReviewTriggerDto manualReviewTriggerDto, String str4, String str5, String str6, String str7, String str8, ApplicationRejectionReasonDto applicationRejectionReasonDto, String str9, String str10, String str11, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? BrokerageAccountTypeDto.INSTANCE.getZeroValue() : brokerageAccountTypeDto, (i & 16) != 0 ? ApplicationStatusDto.INSTANCE.getZeroValue() : applicationStatusDto, (i & 32) != 0 ? null : manualReviewTriggerDto, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : applicationRejectionReasonDto, (i & 4096) == 0 ? str9 : null, (i & 8192) != 0 ? "" : str10, (i & 16384) == 0 ? str11 : "", (i & 32768) != 0 ? CollectionsKt.emptyList() : list);
        }

        public final String getApplication_id() {
            return this.application_id;
        }

        public final String getUser_uuid() {
            return this.user_uuid;
        }

        public final String getRhs_account_number() {
            return this.rhs_account_number;
        }

        public final BrokerageAccountTypeDto getBrokerage_account_type() {
            return this.brokerage_account_type;
        }

        public final ApplicationStatusDto getStatus() {
            return this.status;
        }

        public final ManualReviewTriggerDto getManual_review_trigger() {
            return this.manual_review_trigger;
        }

        public final String getLast_updated_by_alias() {
            return this.last_updated_by_alias;
        }

        public final String getApproved_by_alias() {
            return this.approved_by_alias;
        }

        public final String getApproved_at() {
            return this.approved_at;
        }

        public final String getRejected_by_alias() {
            return this.rejected_by_alias;
        }

        public final String getRejected_at() {
            return this.rejected_at;
        }

        public final ApplicationRejectionReasonDto getRejection_reason() {
            return this.rejection_reason;
        }

        public final String getAnnotation() {
            return this.annotation;
        }

        public final String getCreated_at() {
            return this.created_at;
        }

        public final String getUpdated_at() {
            return this.updated_at;
        }

        public final List<ManualReviewTriggerDto> getManual_review_triggers() {
            return this.manual_review_triggers;
        }
    }

    /* compiled from: FuturesAccountApplicationDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesAccountApplicationDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/ceres/v1/FuturesAccountApplicationDto;", "Lcom/robinhood/ceres/v1/FuturesAccountApplication;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/FuturesAccountApplicationDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<FuturesAccountApplicationDto, FuturesAccountApplication> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FuturesAccountApplicationDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FuturesAccountApplicationDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FuturesAccountApplicationDto> getBinaryBase64Serializer() {
            return (KSerializer) FuturesAccountApplicationDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<FuturesAccountApplication> getProtoAdapter() {
            return FuturesAccountApplication.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FuturesAccountApplicationDto getZeroValue() {
            return FuturesAccountApplicationDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FuturesAccountApplicationDto fromProto(FuturesAccountApplication proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String application_id = proto.getApplication_id();
            String user_uuid = proto.getUser_uuid();
            String rhs_account_number = proto.getRhs_account_number();
            BrokerageAccountTypeDto brokerageAccountTypeDtoFromProto = BrokerageAccountTypeDto.INSTANCE.fromProto(proto.getBrokerage_account_type());
            ApplicationStatusDto applicationStatusDtoFromProto = ApplicationStatusDto.INSTANCE.fromProto(proto.getStatus());
            ManualReviewTrigger manual_review_trigger = proto.getManual_review_trigger();
            ManualReviewTriggerDto manualReviewTriggerDtoFromProto = manual_review_trigger != null ? ManualReviewTriggerDto.INSTANCE.fromProto(manual_review_trigger) : null;
            String last_updated_by_alias = proto.getLast_updated_by_alias();
            String approved_by_alias = proto.getApproved_by_alias();
            String approved_at = proto.getApproved_at();
            String rejected_by_alias = proto.getRejected_by_alias();
            String rejected_at = proto.getRejected_at();
            ApplicationRejectionReason rejection_reason = proto.getRejection_reason();
            ApplicationRejectionReasonDto applicationRejectionReasonDtoFromProto = rejection_reason != null ? ApplicationRejectionReasonDto.INSTANCE.fromProto(rejection_reason) : null;
            String annotation = proto.getAnnotation();
            String created_at = proto.getCreated_at();
            String updated_at = proto.getUpdated_at();
            List<ManualReviewTrigger> manual_review_triggers = proto.getManual_review_triggers();
            ManualReviewTriggerDto manualReviewTriggerDto = manualReviewTriggerDtoFromProto;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(manual_review_triggers, 10));
            for (Iterator it = manual_review_triggers.iterator(); it.hasNext(); it = it) {
                arrayList.add(ManualReviewTriggerDto.INSTANCE.fromProto((ManualReviewTrigger) it.next()));
            }
            return new FuturesAccountApplicationDto(new Surrogate(application_id, user_uuid, rhs_account_number, brokerageAccountTypeDtoFromProto, applicationStatusDtoFromProto, manualReviewTriggerDto, last_updated_by_alias, approved_by_alias, approved_at, rejected_by_alias, rejected_at, applicationRejectionReasonDtoFromProto, annotation, created_at, updated_at, arrayList), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.FuturesAccountApplicationDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesAccountApplicationDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new FuturesAccountApplicationDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: FuturesAccountApplicationDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesAccountApplicationDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/FuturesAccountApplicationDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/ceres/v1/FuturesAccountApplicationDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<FuturesAccountApplicationDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ceres.entity.FuturesAccountApplication", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FuturesAccountApplicationDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public FuturesAccountApplicationDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new FuturesAccountApplicationDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: FuturesAccountApplicationDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesAccountApplicationDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "com.robinhood.ceres.v1.FuturesAccountApplicationDto";
        }
    }
}
