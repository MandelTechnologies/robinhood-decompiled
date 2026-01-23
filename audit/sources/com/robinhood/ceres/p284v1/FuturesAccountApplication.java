package com.robinhood.ceres.p284v1;

import com.robinhood.android.advisory.onboarding.outro.AdvisoryPostAgreementsDeeplinkTarget;
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
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* compiled from: FuturesAccountApplication.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 <2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001<BÇ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u00103\u001a\u00020\u0002H\u0017J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107H\u0096\u0002J\b\u00108\u001a\u000209H\u0016J\b\u0010:\u001a\u00020\u0004H\u0016JÆ\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00042\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001aR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001eR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001eR\u0016\u0010\u0015\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001eR\u0016\u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001eR\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102¨\u0006="}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesAccountApplication;", "Lcom/squareup/wire/Message;", "", "application_id", "", "user_uuid", "rhs_account_number", AdvisoryPostAgreementsDeeplinkTarget.ACCOUNT_TYPE_QUERY_PARAM, "Lcom/robinhood/ceres/v1/BrokerageAccountType;", "status", "Lcom/robinhood/ceres/v1/ApplicationStatus;", "manual_review_trigger", "Lcom/robinhood/ceres/v1/ManualReviewTrigger;", "last_updated_by_alias", "approved_by_alias", "approved_at", "rejected_by_alias", "rejected_at", "rejection_reason", "Lcom/robinhood/ceres/v1/ApplicationRejectionReason;", "annotation", "created_at", "updated_at", "manual_review_triggers", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/BrokerageAccountType;Lcom/robinhood/ceres/v1/ApplicationStatus;Lcom/robinhood/ceres/v1/ManualReviewTrigger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/ApplicationRejectionReason;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "getApplication_id", "()Ljava/lang/String;", "getUser_uuid", "getRhs_account_number", "getBrokerage_account_type", "()Lcom/robinhood/ceres/v1/BrokerageAccountType;", "getStatus", "()Lcom/robinhood/ceres/v1/ApplicationStatus;", "getManual_review_trigger", "()Lcom/robinhood/ceres/v1/ManualReviewTrigger;", "getLast_updated_by_alias", "getApproved_by_alias", "getApproved_at", "getRejected_by_alias", "getRejected_at", "getRejection_reason", "()Lcom/robinhood/ceres/v1/ApplicationRejectionReason;", "getAnnotation", "getCreated_at", "getUpdated_at", "getManual_review_triggers", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class FuturesAccountApplication extends Message {

    @JvmField
    public static final ProtoAdapter<FuturesAccountApplication> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 12, tag = 13)
    private final String annotation;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "applicationId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String application_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "approvedAt", schemaIndex = 8, tag = 9)
    private final String approved_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "approvedByAlias", schemaIndex = 7, tag = 8)
    private final String approved_by_alias;

    @WireField(adapter = "com.robinhood.ceres.v1.BrokerageAccountType#ADAPTER", jsonName = "brokerageAccountType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final BrokerageAccountType brokerage_account_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final String created_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lastUpdatedByAlias", schemaIndex = 6, tag = 7)
    private final String last_updated_by_alias;

    @WireField(adapter = "com.robinhood.ceres.v1.ManualReviewTrigger#ADAPTER", jsonName = "manualReviewTrigger", schemaIndex = 5, tag = 6)
    private final ManualReviewTrigger manual_review_trigger;

    @WireField(adapter = "com.robinhood.ceres.v1.ManualReviewTrigger#ADAPTER", jsonName = "manualReviewTriggers", label = WireField.Label.REPEATED, schemaIndex = 15, tag = 16)
    private final List<ManualReviewTrigger> manual_review_triggers;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rejectedAt", schemaIndex = 10, tag = 11)
    private final String rejected_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rejectedByAlias", schemaIndex = 9, tag = 10)
    private final String rejected_by_alias;

    @WireField(adapter = "com.robinhood.ceres.v1.ApplicationRejectionReason#ADAPTER", jsonName = "rejectionReason", schemaIndex = 11, tag = 12)
    private final ApplicationRejectionReason rejection_reason;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rhsAccountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String rhs_account_number;

    @WireField(adapter = "com.robinhood.ceres.v1.ApplicationStatus#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final ApplicationStatus status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "updatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 15)
    private final String updated_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "userUuid", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String user_uuid;

    public FuturesAccountApplication() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    public /* synthetic */ FuturesAccountApplication(String str, String str2, String str3, BrokerageAccountType brokerageAccountType, ApplicationStatus applicationStatus, ManualReviewTrigger manualReviewTrigger, String str4, String str5, String str6, String str7, String str8, ApplicationRejectionReason applicationRejectionReason, String str9, String str10, String str11, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED : brokerageAccountType, (i & 16) != 0 ? ApplicationStatus.APPLICATION_STATUS_UNSPECIFIED : applicationStatus, (i & 32) != 0 ? null : manualReviewTrigger, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : applicationRejectionReason, (i & 4096) == 0 ? str9 : null, (i & 8192) != 0 ? "" : str10, (i & 16384) == 0 ? str11 : "", (32768 & i) != 0 ? CollectionsKt.emptyList() : list, (i & 65536) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20312newBuilder();
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

    public final BrokerageAccountType getBrokerage_account_type() {
        return this.brokerage_account_type;
    }

    public final ApplicationStatus getStatus() {
        return this.status;
    }

    public final ManualReviewTrigger getManual_review_trigger() {
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

    public final ApplicationRejectionReason getRejection_reason() {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesAccountApplication(String application_id, String user_uuid, String rhs_account_number, BrokerageAccountType brokerage_account_type, ApplicationStatus status, ManualReviewTrigger manualReviewTrigger, String str, String str2, String str3, String str4, String str5, ApplicationRejectionReason applicationRejectionReason, String str6, String created_at, String updated_at, List<? extends ManualReviewTrigger> manual_review_triggers, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(application_id, "application_id");
        Intrinsics.checkNotNullParameter(user_uuid, "user_uuid");
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
        Intrinsics.checkNotNullParameter(brokerage_account_type, "brokerage_account_type");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(updated_at, "updated_at");
        Intrinsics.checkNotNullParameter(manual_review_triggers, "manual_review_triggers");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.application_id = application_id;
        this.user_uuid = user_uuid;
        this.rhs_account_number = rhs_account_number;
        this.brokerage_account_type = brokerage_account_type;
        this.status = status;
        this.manual_review_trigger = manualReviewTrigger;
        this.last_updated_by_alias = str;
        this.approved_by_alias = str2;
        this.approved_at = str3;
        this.rejected_by_alias = str4;
        this.rejected_at = str5;
        this.rejection_reason = applicationRejectionReason;
        this.annotation = str6;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.manual_review_triggers = Internal.immutableCopyOf("manual_review_triggers", manual_review_triggers);
    }

    public final List<ManualReviewTrigger> getManual_review_triggers() {
        return this.manual_review_triggers;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20312newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FuturesAccountApplication)) {
            return false;
        }
        FuturesAccountApplication futuresAccountApplication = (FuturesAccountApplication) other;
        return Intrinsics.areEqual(unknownFields(), futuresAccountApplication.unknownFields()) && Intrinsics.areEqual(this.application_id, futuresAccountApplication.application_id) && Intrinsics.areEqual(this.user_uuid, futuresAccountApplication.user_uuid) && Intrinsics.areEqual(this.rhs_account_number, futuresAccountApplication.rhs_account_number) && this.brokerage_account_type == futuresAccountApplication.brokerage_account_type && this.status == futuresAccountApplication.status && this.manual_review_trigger == futuresAccountApplication.manual_review_trigger && Intrinsics.areEqual(this.last_updated_by_alias, futuresAccountApplication.last_updated_by_alias) && Intrinsics.areEqual(this.approved_by_alias, futuresAccountApplication.approved_by_alias) && Intrinsics.areEqual(this.approved_at, futuresAccountApplication.approved_at) && Intrinsics.areEqual(this.rejected_by_alias, futuresAccountApplication.rejected_by_alias) && Intrinsics.areEqual(this.rejected_at, futuresAccountApplication.rejected_at) && this.rejection_reason == futuresAccountApplication.rejection_reason && Intrinsics.areEqual(this.annotation, futuresAccountApplication.annotation) && Intrinsics.areEqual(this.created_at, futuresAccountApplication.created_at) && Intrinsics.areEqual(this.updated_at, futuresAccountApplication.updated_at) && Intrinsics.areEqual(this.manual_review_triggers, futuresAccountApplication.manual_review_triggers);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((unknownFields().hashCode() * 37) + this.application_id.hashCode()) * 37) + this.user_uuid.hashCode()) * 37) + this.rhs_account_number.hashCode()) * 37) + this.brokerage_account_type.hashCode()) * 37) + this.status.hashCode()) * 37;
        ManualReviewTrigger manualReviewTrigger = this.manual_review_trigger;
        int iHashCode2 = (iHashCode + (manualReviewTrigger != null ? manualReviewTrigger.hashCode() : 0)) * 37;
        String str = this.last_updated_by_alias;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.approved_by_alias;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.approved_at;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.rejected_by_alias;
        int iHashCode6 = (iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.rejected_at;
        int iHashCode7 = (iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37;
        ApplicationRejectionReason applicationRejectionReason = this.rejection_reason;
        int iHashCode8 = (iHashCode7 + (applicationRejectionReason != null ? applicationRejectionReason.hashCode() : 0)) * 37;
        String str6 = this.annotation;
        int iHashCode9 = ((((((iHashCode8 + (str6 != null ? str6.hashCode() : 0)) * 37) + this.created_at.hashCode()) * 37) + this.updated_at.hashCode()) * 37) + this.manual_review_triggers.hashCode();
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("application_id=" + Internal.sanitize(this.application_id));
        arrayList.add("user_uuid=" + Internal.sanitize(this.user_uuid));
        arrayList.add("rhs_account_number=" + Internal.sanitize(this.rhs_account_number));
        arrayList.add("brokerage_account_type=" + this.brokerage_account_type);
        arrayList.add("status=" + this.status);
        ManualReviewTrigger manualReviewTrigger = this.manual_review_trigger;
        if (manualReviewTrigger != null) {
            arrayList.add("manual_review_trigger=" + manualReviewTrigger);
        }
        String str = this.last_updated_by_alias;
        if (str != null) {
            arrayList.add("last_updated_by_alias=" + Internal.sanitize(str));
        }
        String str2 = this.approved_by_alias;
        if (str2 != null) {
            arrayList.add("approved_by_alias=" + Internal.sanitize(str2));
        }
        String str3 = this.approved_at;
        if (str3 != null) {
            arrayList.add("approved_at=" + Internal.sanitize(str3));
        }
        String str4 = this.rejected_by_alias;
        if (str4 != null) {
            arrayList.add("rejected_by_alias=" + Internal.sanitize(str4));
        }
        String str5 = this.rejected_at;
        if (str5 != null) {
            arrayList.add("rejected_at=" + Internal.sanitize(str5));
        }
        ApplicationRejectionReason applicationRejectionReason = this.rejection_reason;
        if (applicationRejectionReason != null) {
            arrayList.add("rejection_reason=" + applicationRejectionReason);
        }
        String str6 = this.annotation;
        if (str6 != null) {
            arrayList.add("annotation=" + Internal.sanitize(str6));
        }
        arrayList.add("created_at=" + Internal.sanitize(this.created_at));
        arrayList.add("updated_at=" + Internal.sanitize(this.updated_at));
        if (!this.manual_review_triggers.isEmpty()) {
            arrayList.add("manual_review_triggers=" + this.manual_review_triggers);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FuturesAccountApplication{", "}", 0, null, null, 56, null);
    }

    public final FuturesAccountApplication copy(String application_id, String user_uuid, String rhs_account_number, BrokerageAccountType brokerage_account_type, ApplicationStatus status, ManualReviewTrigger manual_review_trigger, String last_updated_by_alias, String approved_by_alias, String approved_at, String rejected_by_alias, String rejected_at, ApplicationRejectionReason rejection_reason, String annotation, String created_at, String updated_at, List<? extends ManualReviewTrigger> manual_review_triggers, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(application_id, "application_id");
        Intrinsics.checkNotNullParameter(user_uuid, "user_uuid");
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
        Intrinsics.checkNotNullParameter(brokerage_account_type, "brokerage_account_type");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(updated_at, "updated_at");
        Intrinsics.checkNotNullParameter(manual_review_triggers, "manual_review_triggers");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FuturesAccountApplication(application_id, user_uuid, rhs_account_number, brokerage_account_type, status, manual_review_trigger, last_updated_by_alias, approved_by_alias, approved_at, rejected_by_alias, rejected_at, rejection_reason, annotation, created_at, updated_at, manual_review_triggers, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FuturesAccountApplication.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FuturesAccountApplication>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.FuturesAccountApplication$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FuturesAccountApplication value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getApplication_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getApplication_id());
                }
                if (!Intrinsics.areEqual(value.getUser_uuid(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getUser_uuid());
                }
                if (!Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getRhs_account_number());
                }
                if (value.getBrokerage_account_type() != BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED) {
                    size += BrokerageAccountType.ADAPTER.encodedSizeWithTag(4, value.getBrokerage_account_type());
                }
                if (value.getStatus() != ApplicationStatus.APPLICATION_STATUS_UNSPECIFIED) {
                    size += ApplicationStatus.ADAPTER.encodedSizeWithTag(5, value.getStatus());
                }
                ProtoAdapter<ManualReviewTrigger> protoAdapter = ManualReviewTrigger.ADAPTER;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(6, value.getManual_review_trigger());
                ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(7, value.getLast_updated_by_alias()) + protoAdapter2.encodedSizeWithTag(8, value.getApproved_by_alias()) + protoAdapter2.encodedSizeWithTag(9, value.getApproved_at()) + protoAdapter2.encodedSizeWithTag(10, value.getRejected_by_alias()) + protoAdapter2.encodedSizeWithTag(11, value.getRejected_at()) + ApplicationRejectionReason.ADAPTER.encodedSizeWithTag(12, value.getRejection_reason()) + protoAdapter2.encodedSizeWithTag(13, value.getAnnotation());
                if (!Intrinsics.areEqual(value.getCreated_at(), "")) {
                    iEncodedSizeWithTag2 += protoAdapter2.encodedSizeWithTag(14, value.getCreated_at());
                }
                if (!Intrinsics.areEqual(value.getUpdated_at(), "")) {
                    iEncodedSizeWithTag2 += protoAdapter2.encodedSizeWithTag(15, value.getUpdated_at());
                }
                return iEncodedSizeWithTag2 + protoAdapter.asRepeated().encodedSizeWithTag(16, value.getManual_review_triggers());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FuturesAccountApplication value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getApplication_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getApplication_id());
                }
                if (!Intrinsics.areEqual(value.getUser_uuid(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getUser_uuid());
                }
                if (!Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getRhs_account_number());
                }
                if (value.getBrokerage_account_type() != BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED) {
                    BrokerageAccountType.ADAPTER.encodeWithTag(writer, 4, (int) value.getBrokerage_account_type());
                }
                if (value.getStatus() != ApplicationStatus.APPLICATION_STATUS_UNSPECIFIED) {
                    ApplicationStatus.ADAPTER.encodeWithTag(writer, 5, (int) value.getStatus());
                }
                ProtoAdapter<ManualReviewTrigger> protoAdapter = ManualReviewTrigger.ADAPTER;
                protoAdapter.encodeWithTag(writer, 6, (int) value.getManual_review_trigger());
                ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 7, (int) value.getLast_updated_by_alias());
                protoAdapter2.encodeWithTag(writer, 8, (int) value.getApproved_by_alias());
                protoAdapter2.encodeWithTag(writer, 9, (int) value.getApproved_at());
                protoAdapter2.encodeWithTag(writer, 10, (int) value.getRejected_by_alias());
                protoAdapter2.encodeWithTag(writer, 11, (int) value.getRejected_at());
                ApplicationRejectionReason.ADAPTER.encodeWithTag(writer, 12, (int) value.getRejection_reason());
                protoAdapter2.encodeWithTag(writer, 13, (int) value.getAnnotation());
                if (!Intrinsics.areEqual(value.getCreated_at(), "")) {
                    protoAdapter2.encodeWithTag(writer, 14, (int) value.getCreated_at());
                }
                if (!Intrinsics.areEqual(value.getUpdated_at(), "")) {
                    protoAdapter2.encodeWithTag(writer, 15, (int) value.getUpdated_at());
                }
                protoAdapter.asRepeated().encodeWithTag(writer, 16, (int) value.getManual_review_triggers());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FuturesAccountApplication value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<ManualReviewTrigger> protoAdapter = ManualReviewTrigger.ADAPTER;
                protoAdapter.asRepeated().encodeWithTag(writer, 16, (int) value.getManual_review_triggers());
                if (!Intrinsics.areEqual(value.getUpdated_at(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 15, (int) value.getUpdated_at());
                }
                if (!Intrinsics.areEqual(value.getCreated_at(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 14, (int) value.getCreated_at());
                }
                ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 13, (int) value.getAnnotation());
                ApplicationRejectionReason.ADAPTER.encodeWithTag(writer, 12, (int) value.getRejection_reason());
                protoAdapter2.encodeWithTag(writer, 11, (int) value.getRejected_at());
                protoAdapter2.encodeWithTag(writer, 10, (int) value.getRejected_by_alias());
                protoAdapter2.encodeWithTag(writer, 9, (int) value.getApproved_at());
                protoAdapter2.encodeWithTag(writer, 8, (int) value.getApproved_by_alias());
                protoAdapter2.encodeWithTag(writer, 7, (int) value.getLast_updated_by_alias());
                protoAdapter.encodeWithTag(writer, 6, (int) value.getManual_review_trigger());
                if (value.getStatus() != ApplicationStatus.APPLICATION_STATUS_UNSPECIFIED) {
                    ApplicationStatus.ADAPTER.encodeWithTag(writer, 5, (int) value.getStatus());
                }
                if (value.getBrokerage_account_type() != BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED) {
                    BrokerageAccountType.ADAPTER.encodeWithTag(writer, 4, (int) value.getBrokerage_account_type());
                }
                if (!Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                    protoAdapter2.encodeWithTag(writer, 3, (int) value.getRhs_account_number());
                }
                if (!Intrinsics.areEqual(value.getUser_uuid(), "")) {
                    protoAdapter2.encodeWithTag(writer, 2, (int) value.getUser_uuid());
                }
                if (Intrinsics.areEqual(value.getApplication_id(), "")) {
                    return;
                }
                protoAdapter2.encodeWithTag(writer, 1, (int) value.getApplication_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public FuturesAccountApplication decode(ProtoReader reader) throws IOException {
                ArrayList arrayList;
                ApplicationStatus applicationStatus;
                String str;
                Intrinsics.checkNotNullParameter(reader, "reader");
                BrokerageAccountType brokerageAccountType = BrokerageAccountType.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED;
                ApplicationStatus applicationStatus2 = ApplicationStatus.APPLICATION_STATUS_UNSPECIFIED;
                ArrayList arrayList2 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                BrokerageAccountType brokerageAccountTypeDecode = brokerageAccountType;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                ManualReviewTrigger manualReviewTriggerDecode = null;
                String strDecode5 = null;
                String strDecode6 = null;
                String strDecode7 = null;
                String strDecode8 = null;
                String strDecode9 = null;
                ApplicationRejectionReason applicationRejectionReasonDecode = null;
                String strDecode10 = null;
                ApplicationStatus applicationStatusDecode = applicationStatus2;
                String strDecode11 = strDecode4;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                arrayList = arrayList2;
                                strDecode11 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                arrayList = arrayList2;
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                arrayList = arrayList2;
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                arrayList = arrayList2;
                                applicationStatus = applicationStatusDecode;
                                str = strDecode11;
                                try {
                                    brokerageAccountTypeDecode = BrokerageAccountType.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                                applicationStatusDecode = applicationStatus;
                                strDecode11 = str;
                                break;
                            case 5:
                                arrayList = arrayList2;
                                applicationStatus = applicationStatusDecode;
                                str = strDecode11;
                                try {
                                    applicationStatusDecode = ApplicationStatus.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                                strDecode11 = str;
                                break;
                            case 6:
                                arrayList = arrayList2;
                                applicationStatus = applicationStatusDecode;
                                str = strDecode11;
                                try {
                                    manualReviewTriggerDecode = ManualReviewTrigger.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                }
                                applicationStatusDecode = applicationStatus;
                                strDecode11 = str;
                                break;
                            case 7:
                                arrayList = arrayList2;
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                arrayList = arrayList2;
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 9:
                                arrayList = arrayList2;
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 10:
                                arrayList = arrayList2;
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 11:
                                arrayList = arrayList2;
                                strDecode9 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 12:
                                arrayList = arrayList2;
                                applicationStatus = applicationStatusDecode;
                                str = strDecode11;
                                try {
                                    applicationRejectionReasonDecode = ApplicationRejectionReason.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                }
                                applicationStatusDecode = applicationStatus;
                                strDecode11 = str;
                                break;
                            case 13:
                                arrayList = arrayList2;
                                strDecode10 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 14:
                                arrayList = arrayList2;
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 15:
                                arrayList = arrayList2;
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 16:
                                try {
                                    ManualReviewTrigger.ADAPTER.tryDecode(reader, arrayList2);
                                    arrayList = arrayList2;
                                    applicationStatus = applicationStatusDecode;
                                    str = strDecode11;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                    arrayList = arrayList2;
                                    applicationStatus = applicationStatusDecode;
                                    str = strDecode11;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                                }
                                applicationStatusDecode = applicationStatus;
                                strDecode11 = str;
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                arrayList = arrayList2;
                                applicationStatus = applicationStatusDecode;
                                str = strDecode11;
                                applicationStatusDecode = applicationStatus;
                                strDecode11 = str;
                                break;
                        }
                        arrayList2 = arrayList;
                    } else {
                        return new FuturesAccountApplication(strDecode11, strDecode, strDecode2, brokerageAccountTypeDecode, applicationStatusDecode, manualReviewTriggerDecode, strDecode5, strDecode6, strDecode7, strDecode8, strDecode9, applicationRejectionReasonDecode, strDecode10, strDecode3, strDecode4, arrayList2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FuturesAccountApplication redact(FuturesAccountApplication value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.copy((Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 1) != 0 ? value.application_id : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 2) != 0 ? value.user_uuid : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 4) != 0 ? value.rhs_account_number : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 8) != 0 ? value.brokerage_account_type : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 16) != 0 ? value.status : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 32) != 0 ? value.manual_review_trigger : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 64) != 0 ? value.last_updated_by_alias : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 128) != 0 ? value.approved_by_alias : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 256) != 0 ? value.approved_at : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 512) != 0 ? value.rejected_by_alias : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 1024) != 0 ? value.rejected_at : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 2048) != 0 ? value.rejection_reason : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 4096) != 0 ? value.annotation : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 8192) != 0 ? value.created_at : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 16384) != 0 ? value.updated_at : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 32768) != 0 ? value.manual_review_triggers : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 65536) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
