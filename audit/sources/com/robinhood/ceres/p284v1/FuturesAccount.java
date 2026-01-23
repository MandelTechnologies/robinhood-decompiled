package com.robinhood.ceres.p284v1;

import com.robinhood.android.instant.p160ui.InstantCashConstants;
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
import rosetta.identi.agreements.AgreementType;
import rosetta.midas.p538v1.FuturesDiscountFeature;

/* compiled from: FuturesAccount.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 R2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001RB\u0093\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f\u0012\b\b\u0002\u0010!\u001a\u00020\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u001f\u0012\b\b\u0002\u0010%\u001a\u00020&¢\u0006\u0004\b'\u0010(J\b\u0010J\u001a\u00020\u0002H\u0017J\u0013\u0010K\u001a\u00020\u00182\b\u0010L\u001a\u0004\u0018\u00010MH\u0096\u0002J\b\u0010N\u001a\u00020OH\u0016J\b\u0010P\u001a\u00020\u0004H\u0016J\u0092\u0002\u0010Q\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00042\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\b\b\u0002\u0010!\u001a\u00020\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u001f2\b\b\u0002\u0010%\u001a\u00020&R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010*R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010*R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010*R\u0016\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010*R\u0016\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010*R\u0016\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010*R\u0016\u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010*R\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0016\u0010\u0017\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0016\u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010*R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010*R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010*R\u0016\u0010!\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0018\u0010#\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010*R\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u001f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010H¨\u0006S"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesAccount;", "Lcom/squareup/wire/Message;", "", "id", "", "account_number", "user_uuid", "rhs_account_number", "client_type", "Lcom/robinhood/ceres/v1/AccountClientType;", "status", "Lcom/robinhood/ceres/v1/AccountStatus;", "status_reason_code", "Lcom/robinhood/ceres/v1/AccountStatusReasonCode;", "description", "operator_id", "sender_location_id", "created_at", "updated_at", "mark_type", "Lcom/robinhood/ceres/v1/AccountMarkType;", "rhs_account_type", "Lcom/robinhood/ceres/v1/BrokerageAccountType;", "pco_restricted", "", "pco_restricted_updated_at", "gold_subscription_status", "Lrosetta/midas/v1/FuturesDiscountFeature;", "gold_subscription_started_at", "gold_subscription_ended_at", "signed_attestations", "", "Lrosetta/identi/agreements/AgreementType;", InstantCashConstants.ACCOUNT_TYPE_KEY, "Lcom/robinhood/ceres/v1/AccountType;", "rhf_account_number", "signed_attestations_as_strings", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/AccountClientType;Lcom/robinhood/ceres/v1/AccountStatus;Lcom/robinhood/ceres/v1/AccountStatusReasonCode;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/AccountMarkType;Lcom/robinhood/ceres/v1/BrokerageAccountType;ZLjava/lang/String;Lrosetta/midas/v1/FuturesDiscountFeature;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/ceres/v1/AccountType;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getAccount_number", "getUser_uuid", "getRhs_account_number", "getClient_type", "()Lcom/robinhood/ceres/v1/AccountClientType;", "getStatus", "()Lcom/robinhood/ceres/v1/AccountStatus;", "getStatus_reason_code", "()Lcom/robinhood/ceres/v1/AccountStatusReasonCode;", "getDescription", "getOperator_id", "getSender_location_id", "getCreated_at", "getUpdated_at", "getMark_type", "()Lcom/robinhood/ceres/v1/AccountMarkType;", "getRhs_account_type", "()Lcom/robinhood/ceres/v1/BrokerageAccountType;", "getPco_restricted", "()Z", "getPco_restricted_updated_at", "getGold_subscription_status", "()Lrosetta/midas/v1/FuturesDiscountFeature;", "getGold_subscription_started_at", "getGold_subscription_ended_at", "getAccount_type", "()Lcom/robinhood/ceres/v1/AccountType;", "getRhf_account_number", "getSigned_attestations", "()Ljava/util/List;", "getSigned_attestations_as_strings", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class FuturesAccount extends Message {

    @JvmField
    public static final ProtoAdapter<FuturesAccount> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String account_number;

    @WireField(adapter = "com.robinhood.ceres.v1.AccountType#ADAPTER", jsonName = "accountType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 20, tag = 21)
    private final AccountType account_type;

    @WireField(adapter = "com.robinhood.ceres.v1.AccountClientType#ADAPTER", jsonName = "clientType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final AccountClientType client_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final String created_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 7, tag = 8)
    private final String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "goldSubscriptionEndedAt", schemaIndex = 18, tag = 19)
    private final String gold_subscription_ended_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "goldSubscriptionStartedAt", schemaIndex = 17, tag = 18)
    private final String gold_subscription_started_at;

    @WireField(adapter = "rosetta.midas.v1.FuturesDiscountFeature#ADAPTER", jsonName = "goldSubscriptionStatus", schemaIndex = 16, tag = 17)
    private final FuturesDiscountFeature gold_subscription_status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.robinhood.ceres.v1.AccountMarkType#ADAPTER", jsonName = "markType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final AccountMarkType mark_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "operatorId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String operator_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "pcoRestricted", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 15)
    private final boolean pco_restricted;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "pcoRestrictedUpdatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 16)
    private final String pco_restricted_updated_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rhfAccountNumber", schemaIndex = 21, tag = 22)
    private final String rhf_account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rhsAccountNumber", schemaIndex = 3, tag = 4)
    private final String rhs_account_number;

    @WireField(adapter = "com.robinhood.ceres.v1.BrokerageAccountType#ADAPTER", jsonName = "rhsAccountType", schemaIndex = 13, tag = 14)
    private final BrokerageAccountType rhs_account_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "senderLocationId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final String sender_location_id;

    @WireField(adapter = "rosetta.identi.agreements.AgreementType#ADAPTER", jsonName = "signedAttestations", label = WireField.Label.REPEATED, schemaIndex = 19, tag = 20)
    private final List<AgreementType> signed_attestations;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "signedAttestationsAsStrings", label = WireField.Label.REPEATED, schemaIndex = 22, tag = 23)
    private final List<String> signed_attestations_as_strings;

    @WireField(adapter = "com.robinhood.ceres.v1.AccountStatus#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final AccountStatus status;

    @WireField(adapter = "com.robinhood.ceres.v1.AccountStatusReasonCode#ADAPTER", jsonName = "statusReasonCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final AccountStatusReasonCode status_reason_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "updatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final String updated_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "userUuid", schemaIndex = 2, tag = 3)
    private final String user_uuid;

    public FuturesAccount() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 16777215, null);
    }

    public /* synthetic */ FuturesAccount(String str, String str2, String str3, String str4, AccountClientType accountClientType, AccountStatus accountStatus, AccountStatusReasonCode accountStatusReasonCode, String str5, String str6, String str7, String str8, String str9, AccountMarkType accountMarkType, BrokerageAccountType brokerageAccountType, boolean z, String str10, FuturesDiscountFeature futuresDiscountFeature, String str11, String str12, List list, AccountType accountType, String str13, List list2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? AccountClientType.ACCOUNT_CLIENT_TYPE_UNSPECIFIED : accountClientType, (i & 32) != 0 ? AccountStatus.ACCOUNT_STATUS_UNSPECIFIED : accountStatus, (i & 64) != 0 ? AccountStatusReasonCode.ACCOUNT_STATUS_REASON_CODE_UNSPECIFIED : accountStatusReasonCode, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? "" : str6, (i & 512) != 0 ? "" : str7, (i & 1024) != 0 ? "" : str8, (i & 2048) != 0 ? "" : str9, (i & 4096) != 0 ? AccountMarkType.ACCOUNT_MARK_TYPE_UNSPECIFIED : accountMarkType, (i & 8192) != 0 ? null : brokerageAccountType, (i & 16384) != 0 ? false : z, (i & 32768) == 0 ? str10 : "", (i & 65536) != 0 ? null : futuresDiscountFeature, (i & 131072) != 0 ? null : str11, (i & 262144) != 0 ? null : str12, (i & 524288) != 0 ? CollectionsKt.emptyList() : list, (i & 1048576) != 0 ? AccountType.ACCOUNT_TYPE_UNSPECIFIED : accountType, (i & 2097152) != 0 ? null : str13, (i & 4194304) != 0 ? CollectionsKt.emptyList() : list2, (i & 8388608) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20311newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final String getUser_uuid() {
        return this.user_uuid;
    }

    public final String getRhs_account_number() {
        return this.rhs_account_number;
    }

    public final AccountClientType getClient_type() {
        return this.client_type;
    }

    public final AccountStatus getStatus() {
        return this.status;
    }

    public final AccountStatusReasonCode getStatus_reason_code() {
        return this.status_reason_code;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getOperator_id() {
        return this.operator_id;
    }

    public final String getSender_location_id() {
        return this.sender_location_id;
    }

    public final String getCreated_at() {
        return this.created_at;
    }

    public final String getUpdated_at() {
        return this.updated_at;
    }

    public final AccountMarkType getMark_type() {
        return this.mark_type;
    }

    public final BrokerageAccountType getRhs_account_type() {
        return this.rhs_account_type;
    }

    public final boolean getPco_restricted() {
        return this.pco_restricted;
    }

    public final String getPco_restricted_updated_at() {
        return this.pco_restricted_updated_at;
    }

    public final FuturesDiscountFeature getGold_subscription_status() {
        return this.gold_subscription_status;
    }

    public final String getGold_subscription_started_at() {
        return this.gold_subscription_started_at;
    }

    public final String getGold_subscription_ended_at() {
        return this.gold_subscription_ended_at;
    }

    public final AccountType getAccount_type() {
        return this.account_type;
    }

    public final String getRhf_account_number() {
        return this.rhf_account_number;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesAccount(String id, String account_number, String str, String str2, AccountClientType client_type, AccountStatus status, AccountStatusReasonCode status_reason_code, String str3, String operator_id, String sender_location_id, String created_at, String updated_at, AccountMarkType mark_type, BrokerageAccountType brokerageAccountType, boolean z, String pco_restricted_updated_at, FuturesDiscountFeature futuresDiscountFeature, String str4, String str5, List<? extends AgreementType> signed_attestations, AccountType account_type, String str6, List<String> signed_attestations_as_strings, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(client_type, "client_type");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(status_reason_code, "status_reason_code");
        Intrinsics.checkNotNullParameter(operator_id, "operator_id");
        Intrinsics.checkNotNullParameter(sender_location_id, "sender_location_id");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(updated_at, "updated_at");
        Intrinsics.checkNotNullParameter(mark_type, "mark_type");
        Intrinsics.checkNotNullParameter(pco_restricted_updated_at, "pco_restricted_updated_at");
        Intrinsics.checkNotNullParameter(signed_attestations, "signed_attestations");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(signed_attestations_as_strings, "signed_attestations_as_strings");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.account_number = account_number;
        this.user_uuid = str;
        this.rhs_account_number = str2;
        this.client_type = client_type;
        this.status = status;
        this.status_reason_code = status_reason_code;
        this.description = str3;
        this.operator_id = operator_id;
        this.sender_location_id = sender_location_id;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.mark_type = mark_type;
        this.rhs_account_type = brokerageAccountType;
        this.pco_restricted = z;
        this.pco_restricted_updated_at = pco_restricted_updated_at;
        this.gold_subscription_status = futuresDiscountFeature;
        this.gold_subscription_started_at = str4;
        this.gold_subscription_ended_at = str5;
        this.account_type = account_type;
        this.rhf_account_number = str6;
        this.signed_attestations = Internal.immutableCopyOf("signed_attestations", signed_attestations);
        this.signed_attestations_as_strings = Internal.immutableCopyOf("signed_attestations_as_strings", signed_attestations_as_strings);
    }

    public final List<AgreementType> getSigned_attestations() {
        return this.signed_attestations;
    }

    public final List<String> getSigned_attestations_as_strings() {
        return this.signed_attestations_as_strings;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20311newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FuturesAccount)) {
            return false;
        }
        FuturesAccount futuresAccount = (FuturesAccount) other;
        return Intrinsics.areEqual(unknownFields(), futuresAccount.unknownFields()) && Intrinsics.areEqual(this.id, futuresAccount.id) && Intrinsics.areEqual(this.account_number, futuresAccount.account_number) && Intrinsics.areEqual(this.user_uuid, futuresAccount.user_uuid) && Intrinsics.areEqual(this.rhs_account_number, futuresAccount.rhs_account_number) && this.client_type == futuresAccount.client_type && this.status == futuresAccount.status && this.status_reason_code == futuresAccount.status_reason_code && Intrinsics.areEqual(this.description, futuresAccount.description) && Intrinsics.areEqual(this.operator_id, futuresAccount.operator_id) && Intrinsics.areEqual(this.sender_location_id, futuresAccount.sender_location_id) && Intrinsics.areEqual(this.created_at, futuresAccount.created_at) && Intrinsics.areEqual(this.updated_at, futuresAccount.updated_at) && this.mark_type == futuresAccount.mark_type && this.rhs_account_type == futuresAccount.rhs_account_type && this.pco_restricted == futuresAccount.pco_restricted && Intrinsics.areEqual(this.pco_restricted_updated_at, futuresAccount.pco_restricted_updated_at) && this.gold_subscription_status == futuresAccount.gold_subscription_status && Intrinsics.areEqual(this.gold_subscription_started_at, futuresAccount.gold_subscription_started_at) && Intrinsics.areEqual(this.gold_subscription_ended_at, futuresAccount.gold_subscription_ended_at) && Intrinsics.areEqual(this.signed_attestations, futuresAccount.signed_attestations) && this.account_type == futuresAccount.account_type && Intrinsics.areEqual(this.rhf_account_number, futuresAccount.rhf_account_number) && Intrinsics.areEqual(this.signed_attestations_as_strings, futuresAccount.signed_attestations_as_strings);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.account_number.hashCode()) * 37;
        String str = this.user_uuid;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.rhs_account_number;
        int iHashCode3 = (((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37) + this.client_type.hashCode()) * 37) + this.status.hashCode()) * 37) + this.status_reason_code.hashCode()) * 37;
        String str3 = this.description;
        int iHashCode4 = (((((((((((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37) + this.operator_id.hashCode()) * 37) + this.sender_location_id.hashCode()) * 37) + this.created_at.hashCode()) * 37) + this.updated_at.hashCode()) * 37) + this.mark_type.hashCode()) * 37;
        BrokerageAccountType brokerageAccountType = this.rhs_account_type;
        int iHashCode5 = (((((iHashCode4 + (brokerageAccountType != null ? brokerageAccountType.hashCode() : 0)) * 37) + Boolean.hashCode(this.pco_restricted)) * 37) + this.pco_restricted_updated_at.hashCode()) * 37;
        FuturesDiscountFeature futuresDiscountFeature = this.gold_subscription_status;
        int iHashCode6 = (iHashCode5 + (futuresDiscountFeature != null ? futuresDiscountFeature.hashCode() : 0)) * 37;
        String str4 = this.gold_subscription_started_at;
        int iHashCode7 = (iHashCode6 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.gold_subscription_ended_at;
        int iHashCode8 = (((((iHashCode7 + (str5 != null ? str5.hashCode() : 0)) * 37) + this.signed_attestations.hashCode()) * 37) + this.account_type.hashCode()) * 37;
        String str6 = this.rhf_account_number;
        int iHashCode9 = ((iHashCode8 + (str6 != null ? str6.hashCode() : 0)) * 37) + this.signed_attestations_as_strings.hashCode();
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        String str = this.user_uuid;
        if (str != null) {
            arrayList.add("user_uuid=" + Internal.sanitize(str));
        }
        String str2 = this.rhs_account_number;
        if (str2 != null) {
            arrayList.add("rhs_account_number=" + Internal.sanitize(str2));
        }
        arrayList.add("client_type=" + this.client_type);
        arrayList.add("status=" + this.status);
        arrayList.add("status_reason_code=" + this.status_reason_code);
        String str3 = this.description;
        if (str3 != null) {
            arrayList.add("description=" + Internal.sanitize(str3));
        }
        arrayList.add("operator_id=" + Internal.sanitize(this.operator_id));
        arrayList.add("sender_location_id=" + Internal.sanitize(this.sender_location_id));
        arrayList.add("created_at=" + Internal.sanitize(this.created_at));
        arrayList.add("updated_at=" + Internal.sanitize(this.updated_at));
        arrayList.add("mark_type=" + this.mark_type);
        BrokerageAccountType brokerageAccountType = this.rhs_account_type;
        if (brokerageAccountType != null) {
            arrayList.add("rhs_account_type=" + brokerageAccountType);
        }
        arrayList.add("pco_restricted=" + this.pco_restricted);
        arrayList.add("pco_restricted_updated_at=" + Internal.sanitize(this.pco_restricted_updated_at));
        FuturesDiscountFeature futuresDiscountFeature = this.gold_subscription_status;
        if (futuresDiscountFeature != null) {
            arrayList.add("gold_subscription_status=" + futuresDiscountFeature);
        }
        String str4 = this.gold_subscription_started_at;
        if (str4 != null) {
            arrayList.add("gold_subscription_started_at=" + Internal.sanitize(str4));
        }
        String str5 = this.gold_subscription_ended_at;
        if (str5 != null) {
            arrayList.add("gold_subscription_ended_at=" + Internal.sanitize(str5));
        }
        if (!this.signed_attestations.isEmpty()) {
            arrayList.add("signed_attestations=" + this.signed_attestations);
        }
        arrayList.add("account_type=" + this.account_type);
        String str6 = this.rhf_account_number;
        if (str6 != null) {
            arrayList.add("rhf_account_number=" + Internal.sanitize(str6));
        }
        if (!this.signed_attestations_as_strings.isEmpty()) {
            arrayList.add("signed_attestations_as_strings=" + Internal.sanitize(this.signed_attestations_as_strings));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FuturesAccount{", "}", 0, null, null, 56, null);
    }

    public final FuturesAccount copy(String id, String account_number, String user_uuid, String rhs_account_number, AccountClientType client_type, AccountStatus status, AccountStatusReasonCode status_reason_code, String description, String operator_id, String sender_location_id, String created_at, String updated_at, AccountMarkType mark_type, BrokerageAccountType rhs_account_type, boolean pco_restricted, String pco_restricted_updated_at, FuturesDiscountFeature gold_subscription_status, String gold_subscription_started_at, String gold_subscription_ended_at, List<? extends AgreementType> signed_attestations, AccountType account_type, String rhf_account_number, List<String> signed_attestations_as_strings, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(client_type, "client_type");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(status_reason_code, "status_reason_code");
        Intrinsics.checkNotNullParameter(operator_id, "operator_id");
        Intrinsics.checkNotNullParameter(sender_location_id, "sender_location_id");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(updated_at, "updated_at");
        Intrinsics.checkNotNullParameter(mark_type, "mark_type");
        Intrinsics.checkNotNullParameter(pco_restricted_updated_at, "pco_restricted_updated_at");
        Intrinsics.checkNotNullParameter(signed_attestations, "signed_attestations");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(signed_attestations_as_strings, "signed_attestations_as_strings");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FuturesAccount(id, account_number, user_uuid, rhs_account_number, client_type, status, status_reason_code, description, operator_id, sender_location_id, created_at, updated_at, mark_type, rhs_account_type, pco_restricted, pco_restricted_updated_at, gold_subscription_status, gold_subscription_started_at, gold_subscription_ended_at, signed_attestations, account_type, rhf_account_number, signed_attestations_as_strings, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FuturesAccount.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FuturesAccount>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.FuturesAccount$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FuturesAccount value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAccount_number());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(3, value.getUser_uuid()) + protoAdapter.encodedSizeWithTag(4, value.getRhs_account_number());
                if (value.getClient_type() != AccountClientType.ACCOUNT_CLIENT_TYPE_UNSPECIFIED) {
                    iEncodedSizeWithTag += AccountClientType.ADAPTER.encodedSizeWithTag(5, value.getClient_type());
                }
                if (value.getStatus() != AccountStatus.ACCOUNT_STATUS_UNSPECIFIED) {
                    iEncodedSizeWithTag += AccountStatus.ADAPTER.encodedSizeWithTag(6, value.getStatus());
                }
                if (value.getStatus_reason_code() != AccountStatusReasonCode.ACCOUNT_STATUS_REASON_CODE_UNSPECIFIED) {
                    iEncodedSizeWithTag += AccountStatusReasonCode.ADAPTER.encodedSizeWithTag(7, value.getStatus_reason_code());
                }
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(8, value.getDescription());
                if (!Intrinsics.areEqual(value.getOperator_id(), "")) {
                    iEncodedSizeWithTag2 += protoAdapter.encodedSizeWithTag(9, value.getOperator_id());
                }
                if (!Intrinsics.areEqual(value.getSender_location_id(), "")) {
                    iEncodedSizeWithTag2 += protoAdapter.encodedSizeWithTag(10, value.getSender_location_id());
                }
                if (!Intrinsics.areEqual(value.getCreated_at(), "")) {
                    iEncodedSizeWithTag2 += protoAdapter.encodedSizeWithTag(11, value.getCreated_at());
                }
                if (!Intrinsics.areEqual(value.getUpdated_at(), "")) {
                    iEncodedSizeWithTag2 += protoAdapter.encodedSizeWithTag(12, value.getUpdated_at());
                }
                if (value.getMark_type() != AccountMarkType.ACCOUNT_MARK_TYPE_UNSPECIFIED) {
                    iEncodedSizeWithTag2 += AccountMarkType.ADAPTER.encodedSizeWithTag(13, value.getMark_type());
                }
                int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + BrokerageAccountType.ADAPTER.encodedSizeWithTag(14, value.getRhs_account_type());
                if (value.getPco_restricted()) {
                    iEncodedSizeWithTag3 += ProtoAdapter.BOOL.encodedSizeWithTag(15, Boolean.valueOf(value.getPco_restricted()));
                }
                if (!Intrinsics.areEqual(value.getPco_restricted_updated_at(), "")) {
                    iEncodedSizeWithTag3 += protoAdapter.encodedSizeWithTag(16, value.getPco_restricted_updated_at());
                }
                int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + FuturesDiscountFeature.ADAPTER.encodedSizeWithTag(17, value.getGold_subscription_status()) + protoAdapter.encodedSizeWithTag(18, value.getGold_subscription_started_at()) + protoAdapter.encodedSizeWithTag(19, value.getGold_subscription_ended_at()) + AgreementType.ADAPTER.asRepeated().encodedSizeWithTag(20, value.getSigned_attestations());
                if (value.getAccount_type() != AccountType.ACCOUNT_TYPE_UNSPECIFIED) {
                    iEncodedSizeWithTag4 += AccountType.ADAPTER.encodedSizeWithTag(21, value.getAccount_type());
                }
                return iEncodedSizeWithTag4 + protoAdapter.encodedSizeWithTag(22, value.getRhf_account_number()) + protoAdapter.asRepeated().encodedSizeWithTag(23, value.getSigned_attestations_as_strings());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FuturesAccount value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_number());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getUser_uuid());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getRhs_account_number());
                if (value.getClient_type() != AccountClientType.ACCOUNT_CLIENT_TYPE_UNSPECIFIED) {
                    AccountClientType.ADAPTER.encodeWithTag(writer, 5, (int) value.getClient_type());
                }
                if (value.getStatus() != AccountStatus.ACCOUNT_STATUS_UNSPECIFIED) {
                    AccountStatus.ADAPTER.encodeWithTag(writer, 6, (int) value.getStatus());
                }
                if (value.getStatus_reason_code() != AccountStatusReasonCode.ACCOUNT_STATUS_REASON_CODE_UNSPECIFIED) {
                    AccountStatusReasonCode.ADAPTER.encodeWithTag(writer, 7, (int) value.getStatus_reason_code());
                }
                protoAdapter.encodeWithTag(writer, 8, (int) value.getDescription());
                if (!Intrinsics.areEqual(value.getOperator_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 9, (int) value.getOperator_id());
                }
                if (!Intrinsics.areEqual(value.getSender_location_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 10, (int) value.getSender_location_id());
                }
                if (!Intrinsics.areEqual(value.getCreated_at(), "")) {
                    protoAdapter.encodeWithTag(writer, 11, (int) value.getCreated_at());
                }
                if (!Intrinsics.areEqual(value.getUpdated_at(), "")) {
                    protoAdapter.encodeWithTag(writer, 12, (int) value.getUpdated_at());
                }
                if (value.getMark_type() != AccountMarkType.ACCOUNT_MARK_TYPE_UNSPECIFIED) {
                    AccountMarkType.ADAPTER.encodeWithTag(writer, 13, (int) value.getMark_type());
                }
                BrokerageAccountType.ADAPTER.encodeWithTag(writer, 14, (int) value.getRhs_account_type());
                if (value.getPco_restricted()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 15, (int) Boolean.valueOf(value.getPco_restricted()));
                }
                if (!Intrinsics.areEqual(value.getPco_restricted_updated_at(), "")) {
                    protoAdapter.encodeWithTag(writer, 16, (int) value.getPco_restricted_updated_at());
                }
                FuturesDiscountFeature.ADAPTER.encodeWithTag(writer, 17, (int) value.getGold_subscription_status());
                protoAdapter.encodeWithTag(writer, 18, (int) value.getGold_subscription_started_at());
                protoAdapter.encodeWithTag(writer, 19, (int) value.getGold_subscription_ended_at());
                AgreementType.ADAPTER.asRepeated().encodeWithTag(writer, 20, (int) value.getSigned_attestations());
                if (value.getAccount_type() != AccountType.ACCOUNT_TYPE_UNSPECIFIED) {
                    AccountType.ADAPTER.encodeWithTag(writer, 21, (int) value.getAccount_type());
                }
                protoAdapter.encodeWithTag(writer, 22, (int) value.getRhf_account_number());
                protoAdapter.asRepeated().encodeWithTag(writer, 23, (int) value.getSigned_attestations_as_strings());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FuturesAccount value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 23, (int) value.getSigned_attestations_as_strings());
                protoAdapter.encodeWithTag(writer, 22, (int) value.getRhf_account_number());
                if (value.getAccount_type() != AccountType.ACCOUNT_TYPE_UNSPECIFIED) {
                    AccountType.ADAPTER.encodeWithTag(writer, 21, (int) value.getAccount_type());
                }
                AgreementType.ADAPTER.asRepeated().encodeWithTag(writer, 20, (int) value.getSigned_attestations());
                protoAdapter.encodeWithTag(writer, 19, (int) value.getGold_subscription_ended_at());
                protoAdapter.encodeWithTag(writer, 18, (int) value.getGold_subscription_started_at());
                FuturesDiscountFeature.ADAPTER.encodeWithTag(writer, 17, (int) value.getGold_subscription_status());
                if (!Intrinsics.areEqual(value.getPco_restricted_updated_at(), "")) {
                    protoAdapter.encodeWithTag(writer, 16, (int) value.getPco_restricted_updated_at());
                }
                if (value.getPco_restricted()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 15, (int) Boolean.valueOf(value.getPco_restricted()));
                }
                BrokerageAccountType.ADAPTER.encodeWithTag(writer, 14, (int) value.getRhs_account_type());
                if (value.getMark_type() != AccountMarkType.ACCOUNT_MARK_TYPE_UNSPECIFIED) {
                    AccountMarkType.ADAPTER.encodeWithTag(writer, 13, (int) value.getMark_type());
                }
                if (!Intrinsics.areEqual(value.getUpdated_at(), "")) {
                    protoAdapter.encodeWithTag(writer, 12, (int) value.getUpdated_at());
                }
                if (!Intrinsics.areEqual(value.getCreated_at(), "")) {
                    protoAdapter.encodeWithTag(writer, 11, (int) value.getCreated_at());
                }
                if (!Intrinsics.areEqual(value.getSender_location_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 10, (int) value.getSender_location_id());
                }
                if (!Intrinsics.areEqual(value.getOperator_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 9, (int) value.getOperator_id());
                }
                protoAdapter.encodeWithTag(writer, 8, (int) value.getDescription());
                if (value.getStatus_reason_code() != AccountStatusReasonCode.ACCOUNT_STATUS_REASON_CODE_UNSPECIFIED) {
                    AccountStatusReasonCode.ADAPTER.encodeWithTag(writer, 7, (int) value.getStatus_reason_code());
                }
                if (value.getStatus() != AccountStatus.ACCOUNT_STATUS_UNSPECIFIED) {
                    AccountStatus.ADAPTER.encodeWithTag(writer, 6, (int) value.getStatus());
                }
                if (value.getClient_type() != AccountClientType.ACCOUNT_CLIENT_TYPE_UNSPECIFIED) {
                    AccountClientType.ADAPTER.encodeWithTag(writer, 5, (int) value.getClient_type());
                }
                protoAdapter.encodeWithTag(writer, 4, (int) value.getRhs_account_number());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getUser_uuid());
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getAccount_number());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public FuturesAccount decode(ProtoReader reader) throws IOException {
                AccountStatus accountStatus;
                AccountMarkType accountMarkType;
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(reader, "reader");
                AccountClientType accountClientType = AccountClientType.ACCOUNT_CLIENT_TYPE_UNSPECIFIED;
                AccountStatus accountStatus2 = AccountStatus.ACCOUNT_STATUS_UNSPECIFIED;
                AccountStatusReasonCode accountStatusReasonCode = AccountStatusReasonCode.ACCOUNT_STATUS_REASON_CODE_UNSPECIFIED;
                AccountMarkType accountMarkType2 = AccountMarkType.ACCOUNT_MARK_TYPE_UNSPECIFIED;
                ArrayList arrayList2 = new ArrayList();
                AccountType accountType = AccountType.ACCOUNT_TYPE_UNSPECIFIED;
                ArrayList arrayList3 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                AccountClientType accountClientTypeDecode = accountClientType;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = null;
                String strDecode7 = null;
                String strDecode8 = null;
                BrokerageAccountType brokerageAccountTypeDecode = null;
                FuturesDiscountFeature futuresDiscountFeatureDecode = null;
                String strDecode9 = null;
                String strDecode10 = null;
                String strDecode11 = null;
                boolean zBooleanValue = false;
                AccountType accountTypeDecode = accountType;
                String strDecode12 = strDecode5;
                String strDecode13 = strDecode12;
                AccountMarkType accountMarkTypeDecode = accountMarkType2;
                AccountStatusReasonCode accountStatusReasonCodeDecode = accountStatusReasonCode;
                AccountStatus accountStatusDecode = accountStatus2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new FuturesAccount(strDecode12, strDecode13, strDecode6, strDecode7, accountClientTypeDecode, accountStatusDecode, accountStatusReasonCodeDecode, strDecode8, strDecode, strDecode2, strDecode3, strDecode4, accountMarkTypeDecode, brokerageAccountTypeDecode, zBooleanValue, strDecode5, futuresDiscountFeatureDecode, strDecode9, strDecode10, arrayList2, accountTypeDecode, strDecode11, arrayList3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    switch (iNextTag) {
                        case 1:
                            arrayList = arrayList3;
                            strDecode12 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            arrayList = arrayList3;
                            strDecode13 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 3:
                            arrayList = arrayList3;
                            strDecode6 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 4:
                            arrayList = arrayList3;
                            strDecode7 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 5:
                            accountStatus = accountStatusDecode;
                            accountMarkType = accountMarkTypeDecode;
                            arrayList = arrayList3;
                            try {
                                accountClientTypeDecode = AccountClientType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            accountStatusDecode = accountStatus;
                            accountMarkTypeDecode = accountMarkType;
                            break;
                        case 6:
                            accountStatus = accountStatusDecode;
                            accountMarkType = accountMarkTypeDecode;
                            arrayList = arrayList3;
                            try {
                                accountStatusDecode = AccountStatus.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                break;
                            }
                            accountMarkTypeDecode = accountMarkType;
                            break;
                        case 7:
                            accountStatus = accountStatusDecode;
                            accountMarkType = accountMarkTypeDecode;
                            arrayList = arrayList3;
                            try {
                                accountStatusReasonCodeDecode = AccountStatusReasonCode.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                            }
                            accountStatusDecode = accountStatus;
                            accountMarkTypeDecode = accountMarkType;
                            break;
                        case 8:
                            arrayList = arrayList3;
                            strDecode8 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 9:
                            arrayList = arrayList3;
                            strDecode = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 10:
                            arrayList = arrayList3;
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 11:
                            arrayList = arrayList3;
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 12:
                            arrayList = arrayList3;
                            strDecode4 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 13:
                            accountStatus = accountStatusDecode;
                            accountMarkType = accountMarkTypeDecode;
                            arrayList = arrayList3;
                            try {
                                accountMarkTypeDecode = AccountMarkType.ADAPTER.decode(reader);
                                accountStatusDecode = accountStatus;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                break;
                            }
                        case 14:
                            accountStatus = accountStatusDecode;
                            accountMarkType = accountMarkTypeDecode;
                            arrayList = arrayList3;
                            try {
                                brokerageAccountTypeDecode = BrokerageAccountType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                            }
                            accountStatusDecode = accountStatus;
                            accountMarkTypeDecode = accountMarkType;
                            break;
                        case 15:
                            arrayList = arrayList3;
                            zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 16:
                            arrayList = arrayList3;
                            strDecode5 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 17:
                            accountStatus = accountStatusDecode;
                            accountMarkType = accountMarkTypeDecode;
                            arrayList = arrayList3;
                            try {
                                futuresDiscountFeatureDecode = FuturesDiscountFeature.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e6.value));
                            }
                            accountStatusDecode = accountStatus;
                            accountMarkTypeDecode = accountMarkType;
                            break;
                        case 18:
                            arrayList = arrayList3;
                            strDecode9 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 19:
                            arrayList = arrayList3;
                            strDecode10 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 20:
                            accountStatus = accountStatusDecode;
                            accountMarkType = accountMarkTypeDecode;
                            arrayList = arrayList3;
                            try {
                                AgreementType.ADAPTER.tryDecode(reader, arrayList2);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e7) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e7.value));
                            }
                            accountStatusDecode = accountStatus;
                            accountMarkTypeDecode = accountMarkType;
                            break;
                        case 21:
                            try {
                                accountTypeDecode = AccountType.ADAPTER.decode(reader);
                                arrayList = arrayList3;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e8) {
                                accountStatus = accountStatusDecode;
                                accountMarkType = accountMarkTypeDecode;
                                arrayList = arrayList3;
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e8.value));
                                break;
                            }
                        case 22:
                            strDecode11 = ProtoAdapter.STRING.decode(reader);
                            arrayList = arrayList3;
                            break;
                        case 23:
                            arrayList3.add(ProtoAdapter.STRING.decode(reader));
                            accountStatus = accountStatusDecode;
                            accountMarkType = accountMarkTypeDecode;
                            arrayList = arrayList3;
                            accountStatusDecode = accountStatus;
                            accountMarkTypeDecode = accountMarkType;
                            break;
                        default:
                            reader.readUnknownField(iNextTag);
                            accountStatus = accountStatusDecode;
                            accountMarkType = accountMarkTypeDecode;
                            arrayList = arrayList3;
                            accountStatusDecode = accountStatus;
                            accountMarkTypeDecode = accountMarkType;
                            break;
                    }
                    arrayList3 = arrayList;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FuturesAccount redact(FuturesAccount value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.copy((8388607 & 1) != 0 ? value.id : null, (8388607 & 2) != 0 ? value.account_number : null, (8388607 & 4) != 0 ? value.user_uuid : null, (8388607 & 8) != 0 ? value.rhs_account_number : null, (8388607 & 16) != 0 ? value.client_type : null, (8388607 & 32) != 0 ? value.status : null, (8388607 & 64) != 0 ? value.status_reason_code : null, (8388607 & 128) != 0 ? value.description : null, (8388607 & 256) != 0 ? value.operator_id : null, (8388607 & 512) != 0 ? value.sender_location_id : null, (8388607 & 1024) != 0 ? value.created_at : null, (8388607 & 2048) != 0 ? value.updated_at : null, (8388607 & 4096) != 0 ? value.mark_type : null, (8388607 & 8192) != 0 ? value.rhs_account_type : null, (8388607 & 16384) != 0 ? value.pco_restricted : false, (8388607 & 32768) != 0 ? value.pco_restricted_updated_at : null, (8388607 & 65536) != 0 ? value.gold_subscription_status : null, (8388607 & 131072) != 0 ? value.gold_subscription_started_at : null, (8388607 & 262144) != 0 ? value.gold_subscription_ended_at : null, (8388607 & 524288) != 0 ? value.signed_attestations : null, (8388607 & 1048576) != 0 ? value.account_type : null, (8388607 & 2097152) != 0 ? value.rhf_account_number : null, (8388607 & 4194304) != 0 ? value.signed_attestations_as_strings : null, (8388607 & 8388608) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
