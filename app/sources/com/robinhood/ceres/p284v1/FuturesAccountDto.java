package com.robinhood.ceres.p284v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.instant.p160ui.InstantCashConstants;
import com.robinhood.ceres.p284v1.AccountClientTypeDto;
import com.robinhood.ceres.p284v1.AccountMarkTypeDto;
import com.robinhood.ceres.p284v1.AccountStatusDto;
import com.robinhood.ceres.p284v1.AccountStatusReasonCodeDto;
import com.robinhood.ceres.p284v1.AccountTypeDto;
import com.robinhood.ceres.p284v1.BrokerageAccountTypeDto;
import com.robinhood.ceres.p284v1.FuturesAccountDto;
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
import rosetta.identi.agreements.AgreementType;
import rosetta.identi.agreements.AgreementTypeDto;
import rosetta.midas.p538v1.FuturesDiscountFeature;
import rosetta.midas.p538v1.FuturesDiscountFeatureDto;

/* compiled from: FuturesAccountDto.kt */
@Metadata(m3635d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 [2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004Z[\\]B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u008b\u0002\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\t\u0012\b\b\u0002\u0010\u0015\u001a\u00020\t\u0012\b\b\u0002\u0010\u0016\u001a\u00020\t\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001d\u0012\b\b\u0002\u0010\u001e\u001a\u00020\t\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$\u0012\b\b\u0002\u0010&\u001a\u00020'\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020\t0$¢\u0006\u0004\b\u0006\u0010*J\u0088\u0002\u0010L\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\t2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$2\b\b\u0002\u0010&\u001a\u00020'2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020\t0$J\b\u0010M\u001a\u00020\u0002H\u0016J\b\u0010N\u001a\u00020\tH\u0016J\u0013\u0010O\u001a\u00020\u001d2\b\u0010P\u001a\u0004\u0018\u00010QH\u0096\u0002J\b\u0010R\u001a\u00020SH\u0016J\u0018\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020SH\u0016J\b\u0010Y\u001a\u00020SH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b-\u0010,R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b.\u0010,R\u0013\u0010\f\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b/\u0010,R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b6\u0010,R\u0011\u0010\u0014\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b7\u0010,R\u0011\u0010\u0015\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b8\u0010,R\u0011\u0010\u0016\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b9\u0010,R\u0011\u0010\u0017\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b:\u0010,R\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0011\u0010\u001e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bA\u0010,R\u0013\u0010\u001f\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0013\u0010!\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\bD\u0010,R\u0013\u0010\"\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\bE\u0010,R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$8F¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0011\u0010&\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0013\u0010(\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\bJ\u0010,R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\t0$8F¢\u0006\u0006\u001a\u0004\bK\u0010G¨\u0006^"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesAccountDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/ceres/v1/FuturesAccount;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/ceres/v1/FuturesAccountDto$Surrogate;", "<init>", "(Lcom/robinhood/ceres/v1/FuturesAccountDto$Surrogate;)V", "id", "", "account_number", "user_uuid", "rhs_account_number", "client_type", "Lcom/robinhood/ceres/v1/AccountClientTypeDto;", "status", "Lcom/robinhood/ceres/v1/AccountStatusDto;", "status_reason_code", "Lcom/robinhood/ceres/v1/AccountStatusReasonCodeDto;", "description", "operator_id", "sender_location_id", "created_at", "updated_at", "mark_type", "Lcom/robinhood/ceres/v1/AccountMarkTypeDto;", "rhs_account_type", "Lcom/robinhood/ceres/v1/BrokerageAccountTypeDto;", "pco_restricted", "", "pco_restricted_updated_at", "gold_subscription_status", "Lrosetta/midas/v1/FuturesDiscountFeatureDto;", "gold_subscription_started_at", "gold_subscription_ended_at", "signed_attestations", "", "Lrosetta/identi/agreements/AgreementTypeDto;", InstantCashConstants.ACCOUNT_TYPE_KEY, "Lcom/robinhood/ceres/v1/AccountTypeDto;", "rhf_account_number", "signed_attestations_as_strings", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/AccountClientTypeDto;Lcom/robinhood/ceres/v1/AccountStatusDto;Lcom/robinhood/ceres/v1/AccountStatusReasonCodeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/AccountMarkTypeDto;Lcom/robinhood/ceres/v1/BrokerageAccountTypeDto;ZLjava/lang/String;Lrosetta/midas/v1/FuturesDiscountFeatureDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/ceres/v1/AccountTypeDto;Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getAccount_number", "getUser_uuid", "getRhs_account_number", "getClient_type", "()Lcom/robinhood/ceres/v1/AccountClientTypeDto;", "getStatus", "()Lcom/robinhood/ceres/v1/AccountStatusDto;", "getStatus_reason_code", "()Lcom/robinhood/ceres/v1/AccountStatusReasonCodeDto;", "getDescription", "getOperator_id", "getSender_location_id", "getCreated_at", "getUpdated_at", "getMark_type", "()Lcom/robinhood/ceres/v1/AccountMarkTypeDto;", "getRhs_account_type", "()Lcom/robinhood/ceres/v1/BrokerageAccountTypeDto;", "getPco_restricted", "()Z", "getPco_restricted_updated_at", "getGold_subscription_status", "()Lrosetta/midas/v1/FuturesDiscountFeatureDto;", "getGold_subscription_started_at", "getGold_subscription_ended_at", "getSigned_attestations", "()Ljava/util/List;", "getAccount_type", "()Lcom/robinhood/ceres/v1/AccountTypeDto;", "getRhf_account_number", "getSigned_attestations_as_strings", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class FuturesAccountDto implements Dto3<FuturesAccount>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<FuturesAccountDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FuturesAccountDto, FuturesAccount>> binaryBase64Serializer$delegate;
    private static final FuturesAccountDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ FuturesAccountDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FuturesAccountDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final String getAccount_number() {
        return this.surrogate.getAccount_number();
    }

    public final String getUser_uuid() {
        return this.surrogate.getUser_uuid();
    }

    public final String getRhs_account_number() {
        return this.surrogate.getRhs_account_number();
    }

    public final AccountClientTypeDto getClient_type() {
        return this.surrogate.getClient_type();
    }

    public final AccountStatusDto getStatus() {
        return this.surrogate.getStatus();
    }

    public final AccountStatusReasonCodeDto getStatus_reason_code() {
        return this.surrogate.getStatus_reason_code();
    }

    public final String getDescription() {
        return this.surrogate.getDescription();
    }

    public final String getOperator_id() {
        return this.surrogate.getOperator_id();
    }

    public final String getSender_location_id() {
        return this.surrogate.getSender_location_id();
    }

    public final String getCreated_at() {
        return this.surrogate.getCreated_at();
    }

    public final String getUpdated_at() {
        return this.surrogate.getUpdated_at();
    }

    public final AccountMarkTypeDto getMark_type() {
        return this.surrogate.getMark_type();
    }

    public final BrokerageAccountTypeDto getRhs_account_type() {
        return this.surrogate.getRhs_account_type();
    }

    public final boolean getPco_restricted() {
        return this.surrogate.getPco_restricted();
    }

    public final String getPco_restricted_updated_at() {
        return this.surrogate.getPco_restricted_updated_at();
    }

    public final FuturesDiscountFeatureDto getGold_subscription_status() {
        return this.surrogate.getGold_subscription_status();
    }

    public final String getGold_subscription_started_at() {
        return this.surrogate.getGold_subscription_started_at();
    }

    public final String getGold_subscription_ended_at() {
        return this.surrogate.getGold_subscription_ended_at();
    }

    public final List<AgreementTypeDto> getSigned_attestations() {
        return this.surrogate.getSigned_attestations();
    }

    public final AccountTypeDto getAccount_type() {
        return this.surrogate.getAccount_type();
    }

    public final String getRhf_account_number() {
        return this.surrogate.getRhf_account_number();
    }

    public final List<String> getSigned_attestations_as_strings() {
        return this.surrogate.getSigned_attestations_as_strings();
    }

    public /* synthetic */ FuturesAccountDto(String str, String str2, String str3, String str4, AccountClientTypeDto accountClientTypeDto, AccountStatusDto accountStatusDto, AccountStatusReasonCodeDto accountStatusReasonCodeDto, String str5, String str6, String str7, String str8, String str9, AccountMarkTypeDto accountMarkTypeDto, BrokerageAccountTypeDto brokerageAccountTypeDto, boolean z, String str10, FuturesDiscountFeatureDto futuresDiscountFeatureDto, String str11, String str12, List list, AccountTypeDto accountTypeDto, String str13, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? AccountClientTypeDto.INSTANCE.getZeroValue() : accountClientTypeDto, (i & 32) != 0 ? AccountStatusDto.INSTANCE.getZeroValue() : accountStatusDto, (i & 64) != 0 ? AccountStatusReasonCodeDto.INSTANCE.getZeroValue() : accountStatusReasonCodeDto, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? "" : str6, (i & 512) != 0 ? "" : str7, (i & 1024) != 0 ? "" : str8, (i & 2048) != 0 ? "" : str9, (i & 4096) != 0 ? AccountMarkTypeDto.INSTANCE.getZeroValue() : accountMarkTypeDto, (i & 8192) != 0 ? null : brokerageAccountTypeDto, (i & 16384) != 0 ? false : z, (i & 32768) == 0 ? str10 : "", (i & 65536) != 0 ? null : futuresDiscountFeatureDto, (i & 131072) != 0 ? null : str11, (i & 262144) != 0 ? null : str12, (i & 524288) != 0 ? CollectionsKt.emptyList() : list, (i & 1048576) != 0 ? AccountTypeDto.INSTANCE.getZeroValue() : accountTypeDto, (i & 2097152) != 0 ? null : str13, (i & 4194304) != 0 ? CollectionsKt.emptyList() : list2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FuturesAccountDto(String id, String account_number, String str, String str2, AccountClientTypeDto client_type, AccountStatusDto status, AccountStatusReasonCodeDto status_reason_code, String str3, String operator_id, String sender_location_id, String created_at, String updated_at, AccountMarkTypeDto mark_type, BrokerageAccountTypeDto brokerageAccountTypeDto, boolean z, String pco_restricted_updated_at, FuturesDiscountFeatureDto futuresDiscountFeatureDto, String str4, String str5, List<? extends AgreementTypeDto> signed_attestations, AccountTypeDto account_type, String str6, List<String> signed_attestations_as_strings) {
        this(new Surrogate(id, account_number, str, str2, client_type, status, status_reason_code, str3, operator_id, sender_location_id, created_at, updated_at, mark_type, brokerageAccountTypeDto, z, pco_restricted_updated_at, futuresDiscountFeatureDto, str4, str5, signed_attestations, account_type, str6, signed_attestations_as_strings));
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
    }

    public static /* synthetic */ FuturesAccountDto copy$default(FuturesAccountDto futuresAccountDto, String str, String str2, String str3, String str4, AccountClientTypeDto accountClientTypeDto, AccountStatusDto accountStatusDto, AccountStatusReasonCodeDto accountStatusReasonCodeDto, String str5, String str6, String str7, String str8, String str9, AccountMarkTypeDto accountMarkTypeDto, BrokerageAccountTypeDto brokerageAccountTypeDto, boolean z, String str10, FuturesDiscountFeatureDto futuresDiscountFeatureDto, String str11, String str12, List list, AccountTypeDto accountTypeDto, String str13, List list2, int i, Object obj) {
        List signed_attestations_as_strings;
        String str14;
        String id = (i & 1) != 0 ? futuresAccountDto.surrogate.getId() : str;
        String account_number = (i & 2) != 0 ? futuresAccountDto.surrogate.getAccount_number() : str2;
        String user_uuid = (i & 4) != 0 ? futuresAccountDto.surrogate.getUser_uuid() : str3;
        String rhs_account_number = (i & 8) != 0 ? futuresAccountDto.surrogate.getRhs_account_number() : str4;
        AccountClientTypeDto client_type = (i & 16) != 0 ? futuresAccountDto.surrogate.getClient_type() : accountClientTypeDto;
        AccountStatusDto status = (i & 32) != 0 ? futuresAccountDto.surrogate.getStatus() : accountStatusDto;
        AccountStatusReasonCodeDto status_reason_code = (i & 64) != 0 ? futuresAccountDto.surrogate.getStatus_reason_code() : accountStatusReasonCodeDto;
        String description = (i & 128) != 0 ? futuresAccountDto.surrogate.getDescription() : str5;
        String operator_id = (i & 256) != 0 ? futuresAccountDto.surrogate.getOperator_id() : str6;
        String sender_location_id = (i & 512) != 0 ? futuresAccountDto.surrogate.getSender_location_id() : str7;
        String created_at = (i & 1024) != 0 ? futuresAccountDto.surrogate.getCreated_at() : str8;
        String updated_at = (i & 2048) != 0 ? futuresAccountDto.surrogate.getUpdated_at() : str9;
        AccountMarkTypeDto mark_type = (i & 4096) != 0 ? futuresAccountDto.surrogate.getMark_type() : accountMarkTypeDto;
        BrokerageAccountTypeDto rhs_account_type = (i & 8192) != 0 ? futuresAccountDto.surrogate.getRhs_account_type() : brokerageAccountTypeDto;
        String str15 = id;
        boolean pco_restricted = (i & 16384) != 0 ? futuresAccountDto.surrogate.getPco_restricted() : z;
        String pco_restricted_updated_at = (i & 32768) != 0 ? futuresAccountDto.surrogate.getPco_restricted_updated_at() : str10;
        FuturesDiscountFeatureDto gold_subscription_status = (i & 65536) != 0 ? futuresAccountDto.surrogate.getGold_subscription_status() : futuresDiscountFeatureDto;
        String gold_subscription_started_at = (i & 131072) != 0 ? futuresAccountDto.surrogate.getGold_subscription_started_at() : str11;
        String gold_subscription_ended_at = (i & 262144) != 0 ? futuresAccountDto.surrogate.getGold_subscription_ended_at() : str12;
        List signed_attestations = (i & 524288) != 0 ? futuresAccountDto.surrogate.getSigned_attestations() : list;
        AccountTypeDto account_type = (i & 1048576) != 0 ? futuresAccountDto.surrogate.getAccount_type() : accountTypeDto;
        String rhf_account_number = (i & 2097152) != 0 ? futuresAccountDto.surrogate.getRhf_account_number() : str13;
        if ((i & 4194304) != 0) {
            str14 = rhf_account_number;
            signed_attestations_as_strings = futuresAccountDto.surrogate.getSigned_attestations_as_strings();
        } else {
            signed_attestations_as_strings = list2;
            str14 = rhf_account_number;
        }
        return futuresAccountDto.copy(str15, account_number, user_uuid, rhs_account_number, client_type, status, status_reason_code, description, operator_id, sender_location_id, created_at, updated_at, mark_type, rhs_account_type, pco_restricted, pco_restricted_updated_at, gold_subscription_status, gold_subscription_started_at, gold_subscription_ended_at, signed_attestations, account_type, str14, signed_attestations_as_strings);
    }

    public final FuturesAccountDto copy(String id, String account_number, String user_uuid, String rhs_account_number, AccountClientTypeDto client_type, AccountStatusDto status, AccountStatusReasonCodeDto status_reason_code, String description, String operator_id, String sender_location_id, String created_at, String updated_at, AccountMarkTypeDto mark_type, BrokerageAccountTypeDto rhs_account_type, boolean pco_restricted, String pco_restricted_updated_at, FuturesDiscountFeatureDto gold_subscription_status, String gold_subscription_started_at, String gold_subscription_ended_at, List<? extends AgreementTypeDto> signed_attestations, AccountTypeDto account_type, String rhf_account_number, List<String> signed_attestations_as_strings) {
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
        return new FuturesAccountDto(new Surrogate(id, account_number, user_uuid, rhs_account_number, client_type, status, status_reason_code, description, operator_id, sender_location_id, created_at, updated_at, mark_type, rhs_account_type, pco_restricted, pco_restricted_updated_at, gold_subscription_status, gold_subscription_started_at, gold_subscription_ended_at, signed_attestations, account_type, rhf_account_number, signed_attestations_as_strings));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public FuturesAccount toProto() {
        String id = this.surrogate.getId();
        String account_number = this.surrogate.getAccount_number();
        String user_uuid = this.surrogate.getUser_uuid();
        String rhs_account_number = this.surrogate.getRhs_account_number();
        AccountClientType accountClientType = (AccountClientType) this.surrogate.getClient_type().toProto();
        AccountStatus accountStatus = (AccountStatus) this.surrogate.getStatus().toProto();
        AccountStatusReasonCode accountStatusReasonCode = (AccountStatusReasonCode) this.surrogate.getStatus_reason_code().toProto();
        String description = this.surrogate.getDescription();
        String operator_id = this.surrogate.getOperator_id();
        String sender_location_id = this.surrogate.getSender_location_id();
        String created_at = this.surrogate.getCreated_at();
        String updated_at = this.surrogate.getUpdated_at();
        AccountMarkType accountMarkType = (AccountMarkType) this.surrogate.getMark_type().toProto();
        BrokerageAccountTypeDto rhs_account_type = this.surrogate.getRhs_account_type();
        BrokerageAccountType brokerageAccountType = rhs_account_type != null ? (BrokerageAccountType) rhs_account_type.toProto() : null;
        boolean pco_restricted = this.surrogate.getPco_restricted();
        String pco_restricted_updated_at = this.surrogate.getPco_restricted_updated_at();
        FuturesDiscountFeatureDto gold_subscription_status = this.surrogate.getGold_subscription_status();
        FuturesDiscountFeature futuresDiscountFeature = gold_subscription_status != null ? (FuturesDiscountFeature) gold_subscription_status.toProto() : null;
        String gold_subscription_started_at = this.surrogate.getGold_subscription_started_at();
        String gold_subscription_ended_at = this.surrogate.getGold_subscription_ended_at();
        List<AgreementTypeDto> signed_attestations = this.surrogate.getSigned_attestations();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(signed_attestations, 10));
        Iterator<T> it = signed_attestations.iterator();
        while (it.hasNext()) {
            arrayList.add((AgreementType) ((AgreementTypeDto) it.next()).toProto());
        }
        AccountType accountType = (AccountType) this.surrogate.getAccount_type().toProto();
        String rhf_account_number = this.surrogate.getRhf_account_number();
        List<String> signed_attestations_as_strings = this.surrogate.getSigned_attestations_as_strings();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(signed_attestations_as_strings, 10));
        Iterator<T> it2 = signed_attestations_as_strings.iterator();
        while (it2.hasNext()) {
            arrayList2.add((String) it2.next());
        }
        return new FuturesAccount(id, account_number, user_uuid, rhs_account_number, accountClientType, accountStatus, accountStatusReasonCode, description, operator_id, sender_location_id, created_at, updated_at, accountMarkType, brokerageAccountType, pco_restricted, pco_restricted_updated_at, futuresDiscountFeature, gold_subscription_started_at, gold_subscription_ended_at, arrayList, accountType, rhf_account_number, arrayList2, null, 8388608, null);
    }

    public String toString() {
        return "[FuturesAccountDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof FuturesAccountDto) && Intrinsics.areEqual(((FuturesAccountDto) other).surrogate, this.surrogate);
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
    /* compiled from: FuturesAccountDto.kt */
    @Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\bW\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 \u0089\u00012\u00020\u0001:\u0004\u0088\u0001\u0089\u0001B\u0089\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e\u0012\b\b\u0002\u0010 \u001a\u00020!\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e¢\u0006\u0004\b$\u0010%B\u008b\u0002\b\u0010\u0012\u0006\u0010&\u001a\u00020'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e\u0012\b\u0010 \u001a\u0004\u0018\u00010!\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001e\u0012\b\u0010(\u001a\u0004\u0018\u00010)¢\u0006\u0004\b$\u0010*J\t\u0010d\u001a\u00020\u0003HÆ\u0003J\t\u0010e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010h\u001a\u00020\bHÆ\u0003J\t\u0010i\u001a\u00020\nHÆ\u0003J\t\u0010j\u001a\u00020\fHÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010l\u001a\u00020\u0003HÆ\u0003J\t\u0010m\u001a\u00020\u0003HÆ\u0003J\t\u0010n\u001a\u00020\u0003HÆ\u0003J\t\u0010o\u001a\u00020\u0003HÆ\u0003J\t\u0010p\u001a\u00020\u0013HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\t\u0010r\u001a\u00020\u0017HÆ\u0003J\t\u0010s\u001a\u00020\u0003HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010w\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eHÆ\u0003J\t\u0010x\u001a\u00020!HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010z\u001a\b\u0012\u0004\u0012\u00020\u00030\u001eHÆ\u0003J\u008b\u0002\u0010{\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\b\b\u0002\u0010 \u001a\u00020!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\u001eHÆ\u0001J\u0013\u0010|\u001a\u00020\u00172\b\u0010}\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010~\u001a\u00020'HÖ\u0001J\t\u0010\u007f\u001a\u00020\u0003HÖ\u0001J-\u0010\u0080\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0082\u0001\u001a\u00020\u00002\b\u0010\u0083\u0001\u001a\u00030\u0084\u00012\b\u0010\u0085\u0001\u001a\u00030\u0086\u0001H\u0001¢\u0006\u0003\b\u0087\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b1\u0010,\u001a\u0004\b2\u0010.R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b3\u0010,\u001a\u0004\b4\u0010.R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b5\u0010,\u001a\u0004\b6\u00107R\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b8\u0010,\u001a\u0004\b9\u0010:R\u001c\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b;\u0010,\u001a\u0004\b<\u0010=R\u001e\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b>\u0010,\u001a\u0004\b?\u0010.R\u001c\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b@\u0010,\u001a\u0004\bA\u0010.R\u001c\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bB\u0010,\u001a\u0004\bC\u0010.R\u001c\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bD\u0010,\u001a\u0004\bE\u0010.R\u001c\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bF\u0010,\u001a\u0004\bG\u0010.R\u001c\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bH\u0010,\u001a\u0004\bI\u0010JR\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bK\u0010,\u001a\u0004\bL\u0010MR\u001c\u0010\u0016\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bN\u0010,\u001a\u0004\bO\u0010PR\u001c\u0010\u0018\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bQ\u0010,\u001a\u0004\bR\u0010.R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bS\u0010,\u001a\u0004\bT\u0010UR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bV\u0010,\u001a\u0004\bW\u0010.R\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bX\u0010,\u001a\u0004\bY\u0010.R\"\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bZ\u0010,\u001a\u0004\b[\u0010\\R\u001c\u0010 \u001a\u00020!8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b]\u0010,\u001a\u0004\b^\u0010_R\u001e\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b`\u0010,\u001a\u0004\ba\u0010.R\"\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bb\u0010,\u001a\u0004\bc\u0010\\¨\u0006\u008a\u0001"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesAccountDto$Surrogate;", "", "id", "", "account_number", "user_uuid", "rhs_account_number", "client_type", "Lcom/robinhood/ceres/v1/AccountClientTypeDto;", "status", "Lcom/robinhood/ceres/v1/AccountStatusDto;", "status_reason_code", "Lcom/robinhood/ceres/v1/AccountStatusReasonCodeDto;", "description", "operator_id", "sender_location_id", "created_at", "updated_at", "mark_type", "Lcom/robinhood/ceres/v1/AccountMarkTypeDto;", "rhs_account_type", "Lcom/robinhood/ceres/v1/BrokerageAccountTypeDto;", "pco_restricted", "", "pco_restricted_updated_at", "gold_subscription_status", "Lrosetta/midas/v1/FuturesDiscountFeatureDto;", "gold_subscription_started_at", "gold_subscription_ended_at", "signed_attestations", "", "Lrosetta/identi/agreements/AgreementTypeDto;", InstantCashConstants.ACCOUNT_TYPE_KEY, "Lcom/robinhood/ceres/v1/AccountTypeDto;", "rhf_account_number", "signed_attestations_as_strings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/AccountClientTypeDto;Lcom/robinhood/ceres/v1/AccountStatusDto;Lcom/robinhood/ceres/v1/AccountStatusReasonCodeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/AccountMarkTypeDto;Lcom/robinhood/ceres/v1/BrokerageAccountTypeDto;ZLjava/lang/String;Lrosetta/midas/v1/FuturesDiscountFeatureDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/ceres/v1/AccountTypeDto;Ljava/lang/String;Ljava/util/List;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/AccountClientTypeDto;Lcom/robinhood/ceres/v1/AccountStatusDto;Lcom/robinhood/ceres/v1/AccountStatusReasonCodeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/AccountMarkTypeDto;Lcom/robinhood/ceres/v1/BrokerageAccountTypeDto;ZLjava/lang/String;Lrosetta/midas/v1/FuturesDiscountFeatureDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/ceres/v1/AccountTypeDto;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId$annotations", "()V", "getId", "()Ljava/lang/String;", "getAccount_number$annotations", "getAccount_number", "getUser_uuid$annotations", "getUser_uuid", "getRhs_account_number$annotations", "getRhs_account_number", "getClient_type$annotations", "getClient_type", "()Lcom/robinhood/ceres/v1/AccountClientTypeDto;", "getStatus$annotations", "getStatus", "()Lcom/robinhood/ceres/v1/AccountStatusDto;", "getStatus_reason_code$annotations", "getStatus_reason_code", "()Lcom/robinhood/ceres/v1/AccountStatusReasonCodeDto;", "getDescription$annotations", "getDescription", "getOperator_id$annotations", "getOperator_id", "getSender_location_id$annotations", "getSender_location_id", "getCreated_at$annotations", "getCreated_at", "getUpdated_at$annotations", "getUpdated_at", "getMark_type$annotations", "getMark_type", "()Lcom/robinhood/ceres/v1/AccountMarkTypeDto;", "getRhs_account_type$annotations", "getRhs_account_type", "()Lcom/robinhood/ceres/v1/BrokerageAccountTypeDto;", "getPco_restricted$annotations", "getPco_restricted", "()Z", "getPco_restricted_updated_at$annotations", "getPco_restricted_updated_at", "getGold_subscription_status$annotations", "getGold_subscription_status", "()Lrosetta/midas/v1/FuturesDiscountFeatureDto;", "getGold_subscription_started_at$annotations", "getGold_subscription_started_at", "getGold_subscription_ended_at$annotations", "getGold_subscription_ended_at", "getSigned_attestations$annotations", "getSigned_attestations", "()Ljava/util/List;", "getAccount_type$annotations", "getAccount_type", "()Lcom/robinhood/ceres/v1/AccountTypeDto;", "getRhf_account_number$annotations", "getRhf_account_number", "getSigned_attestations_as_strings$annotations", "getSigned_attestations_as_strings", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ceres_entity_v1_externalRelease", "$serializer", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_number;
        private final AccountTypeDto account_type;
        private final AccountClientTypeDto client_type;
        private final String created_at;
        private final String description;
        private final String gold_subscription_ended_at;
        private final String gold_subscription_started_at;
        private final FuturesDiscountFeatureDto gold_subscription_status;
        private final String id;
        private final AccountMarkTypeDto mark_type;
        private final String operator_id;
        private final boolean pco_restricted;
        private final String pco_restricted_updated_at;
        private final String rhf_account_number;
        private final String rhs_account_number;
        private final BrokerageAccountTypeDto rhs_account_type;
        private final String sender_location_id;
        private final List<AgreementTypeDto> signed_attestations;
        private final List<String> signed_attestations_as_strings;
        private final AccountStatusDto status;
        private final AccountStatusReasonCodeDto status_reason_code;
        private final String updated_at;
        private final String user_uuid;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (AccountClientTypeDto) null, (AccountStatusDto) null, (AccountStatusReasonCodeDto) null, (String) null, (String) null, (String) null, (String) null, (String) null, (AccountMarkTypeDto) null, (BrokerageAccountTypeDto) null, false, (String) null, (FuturesDiscountFeatureDto) null, (String) null, (String) null, (List) null, (AccountTypeDto) null, (String) null, (List) null, 8388607, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(AgreementTypeDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, String str4, AccountClientTypeDto accountClientTypeDto, AccountStatusDto accountStatusDto, AccountStatusReasonCodeDto accountStatusReasonCodeDto, String str5, String str6, String str7, String str8, String str9, AccountMarkTypeDto accountMarkTypeDto, BrokerageAccountTypeDto brokerageAccountTypeDto, boolean z, String str10, FuturesDiscountFeatureDto futuresDiscountFeatureDto, String str11, String str12, List list, AccountTypeDto accountTypeDto, String str13, List list2, int i, Object obj) {
            List list3;
            String str14;
            String str15 = (i & 1) != 0 ? surrogate.id : str;
            String str16 = (i & 2) != 0 ? surrogate.account_number : str2;
            String str17 = (i & 4) != 0 ? surrogate.user_uuid : str3;
            String str18 = (i & 8) != 0 ? surrogate.rhs_account_number : str4;
            AccountClientTypeDto accountClientTypeDto2 = (i & 16) != 0 ? surrogate.client_type : accountClientTypeDto;
            AccountStatusDto accountStatusDto2 = (i & 32) != 0 ? surrogate.status : accountStatusDto;
            AccountStatusReasonCodeDto accountStatusReasonCodeDto2 = (i & 64) != 0 ? surrogate.status_reason_code : accountStatusReasonCodeDto;
            String str19 = (i & 128) != 0 ? surrogate.description : str5;
            String str20 = (i & 256) != 0 ? surrogate.operator_id : str6;
            String str21 = (i & 512) != 0 ? surrogate.sender_location_id : str7;
            String str22 = (i & 1024) != 0 ? surrogate.created_at : str8;
            String str23 = (i & 2048) != 0 ? surrogate.updated_at : str9;
            AccountMarkTypeDto accountMarkTypeDto2 = (i & 4096) != 0 ? surrogate.mark_type : accountMarkTypeDto;
            BrokerageAccountTypeDto brokerageAccountTypeDto2 = (i & 8192) != 0 ? surrogate.rhs_account_type : brokerageAccountTypeDto;
            String str24 = str15;
            boolean z2 = (i & 16384) != 0 ? surrogate.pco_restricted : z;
            String str25 = (i & 32768) != 0 ? surrogate.pco_restricted_updated_at : str10;
            FuturesDiscountFeatureDto futuresDiscountFeatureDto2 = (i & 65536) != 0 ? surrogate.gold_subscription_status : futuresDiscountFeatureDto;
            String str26 = (i & 131072) != 0 ? surrogate.gold_subscription_started_at : str11;
            String str27 = (i & 262144) != 0 ? surrogate.gold_subscription_ended_at : str12;
            List list4 = (i & 524288) != 0 ? surrogate.signed_attestations : list;
            AccountTypeDto accountTypeDto2 = (i & 1048576) != 0 ? surrogate.account_type : accountTypeDto;
            String str28 = (i & 2097152) != 0 ? surrogate.rhf_account_number : str13;
            if ((i & 4194304) != 0) {
                str14 = str28;
                list3 = surrogate.signed_attestations_as_strings;
            } else {
                list3 = list2;
                str14 = str28;
            }
            return surrogate.copy(str24, str16, str17, str18, accountClientTypeDto2, accountStatusDto2, accountStatusReasonCodeDto2, str19, str20, str21, str22, str23, accountMarkTypeDto2, brokerageAccountTypeDto2, z2, str25, futuresDiscountFeatureDto2, str26, str27, list4, accountTypeDto2, str14, list3);
        }

        @SerialName("accountNumber")
        @JsonAnnotations2(names = {"account_number"})
        public static /* synthetic */ void getAccount_number$annotations() {
        }

        @SerialName("accountType")
        @JsonAnnotations2(names = {InstantCashConstants.ACCOUNT_TYPE_KEY})
        public static /* synthetic */ void getAccount_type$annotations() {
        }

        @SerialName("clientType")
        @JsonAnnotations2(names = {"client_type"})
        public static /* synthetic */ void getClient_type$annotations() {
        }

        @SerialName("createdAt")
        @JsonAnnotations2(names = {"created_at"})
        public static /* synthetic */ void getCreated_at$annotations() {
        }

        @SerialName("description")
        @JsonAnnotations2(names = {"description"})
        public static /* synthetic */ void getDescription$annotations() {
        }

        @SerialName("goldSubscriptionEndedAt")
        @JsonAnnotations2(names = {"gold_subscription_ended_at"})
        public static /* synthetic */ void getGold_subscription_ended_at$annotations() {
        }

        @SerialName("goldSubscriptionStartedAt")
        @JsonAnnotations2(names = {"gold_subscription_started_at"})
        public static /* synthetic */ void getGold_subscription_started_at$annotations() {
        }

        @SerialName("goldSubscriptionStatus")
        @JsonAnnotations2(names = {"gold_subscription_status"})
        public static /* synthetic */ void getGold_subscription_status$annotations() {
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("markType")
        @JsonAnnotations2(names = {"mark_type"})
        public static /* synthetic */ void getMark_type$annotations() {
        }

        @SerialName("operatorId")
        @JsonAnnotations2(names = {"operator_id"})
        public static /* synthetic */ void getOperator_id$annotations() {
        }

        @SerialName("pcoRestricted")
        @JsonAnnotations2(names = {"pco_restricted"})
        public static /* synthetic */ void getPco_restricted$annotations() {
        }

        @SerialName("pcoRestrictedUpdatedAt")
        @JsonAnnotations2(names = {"pco_restricted_updated_at"})
        public static /* synthetic */ void getPco_restricted_updated_at$annotations() {
        }

        @SerialName("rhfAccountNumber")
        @JsonAnnotations2(names = {"rhf_account_number"})
        public static /* synthetic */ void getRhf_account_number$annotations() {
        }

        @SerialName("rhsAccountNumber")
        @JsonAnnotations2(names = {"rhs_account_number"})
        public static /* synthetic */ void getRhs_account_number$annotations() {
        }

        @SerialName("rhsAccountType")
        @JsonAnnotations2(names = {"rhs_account_type"})
        public static /* synthetic */ void getRhs_account_type$annotations() {
        }

        @SerialName("senderLocationId")
        @JsonAnnotations2(names = {"sender_location_id"})
        public static /* synthetic */ void getSender_location_id$annotations() {
        }

        @SerialName("signedAttestations")
        @JsonAnnotations2(names = {"signed_attestations"})
        public static /* synthetic */ void getSigned_attestations$annotations() {
        }

        @SerialName("signedAttestationsAsStrings")
        @JsonAnnotations2(names = {"signed_attestations_as_strings"})
        public static /* synthetic */ void getSigned_attestations_as_strings$annotations() {
        }

        @SerialName("status")
        @JsonAnnotations2(names = {"status"})
        public static /* synthetic */ void getStatus$annotations() {
        }

        @SerialName("statusReasonCode")
        @JsonAnnotations2(names = {"status_reason_code"})
        public static /* synthetic */ void getStatus_reason_code$annotations() {
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
        public final String getId() {
            return this.id;
        }

        /* renamed from: component10, reason: from getter */
        public final String getSender_location_id() {
            return this.sender_location_id;
        }

        /* renamed from: component11, reason: from getter */
        public final String getCreated_at() {
            return this.created_at;
        }

        /* renamed from: component12, reason: from getter */
        public final String getUpdated_at() {
            return this.updated_at;
        }

        /* renamed from: component13, reason: from getter */
        public final AccountMarkTypeDto getMark_type() {
            return this.mark_type;
        }

        /* renamed from: component14, reason: from getter */
        public final BrokerageAccountTypeDto getRhs_account_type() {
            return this.rhs_account_type;
        }

        /* renamed from: component15, reason: from getter */
        public final boolean getPco_restricted() {
            return this.pco_restricted;
        }

        /* renamed from: component16, reason: from getter */
        public final String getPco_restricted_updated_at() {
            return this.pco_restricted_updated_at;
        }

        /* renamed from: component17, reason: from getter */
        public final FuturesDiscountFeatureDto getGold_subscription_status() {
            return this.gold_subscription_status;
        }

        /* renamed from: component18, reason: from getter */
        public final String getGold_subscription_started_at() {
            return this.gold_subscription_started_at;
        }

        /* renamed from: component19, reason: from getter */
        public final String getGold_subscription_ended_at() {
            return this.gold_subscription_ended_at;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccount_number() {
            return this.account_number;
        }

        public final List<AgreementTypeDto> component20() {
            return this.signed_attestations;
        }

        /* renamed from: component21, reason: from getter */
        public final AccountTypeDto getAccount_type() {
            return this.account_type;
        }

        /* renamed from: component22, reason: from getter */
        public final String getRhf_account_number() {
            return this.rhf_account_number;
        }

        public final List<String> component23() {
            return this.signed_attestations_as_strings;
        }

        /* renamed from: component3, reason: from getter */
        public final String getUser_uuid() {
            return this.user_uuid;
        }

        /* renamed from: component4, reason: from getter */
        public final String getRhs_account_number() {
            return this.rhs_account_number;
        }

        /* renamed from: component5, reason: from getter */
        public final AccountClientTypeDto getClient_type() {
            return this.client_type;
        }

        /* renamed from: component6, reason: from getter */
        public final AccountStatusDto getStatus() {
            return this.status;
        }

        /* renamed from: component7, reason: from getter */
        public final AccountStatusReasonCodeDto getStatus_reason_code() {
            return this.status_reason_code;
        }

        /* renamed from: component8, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component9, reason: from getter */
        public final String getOperator_id() {
            return this.operator_id;
        }

        public final Surrogate copy(String id, String account_number, String user_uuid, String rhs_account_number, AccountClientTypeDto client_type, AccountStatusDto status, AccountStatusReasonCodeDto status_reason_code, String description, String operator_id, String sender_location_id, String created_at, String updated_at, AccountMarkTypeDto mark_type, BrokerageAccountTypeDto rhs_account_type, boolean pco_restricted, String pco_restricted_updated_at, FuturesDiscountFeatureDto gold_subscription_status, String gold_subscription_started_at, String gold_subscription_ended_at, List<? extends AgreementTypeDto> signed_attestations, AccountTypeDto account_type, String rhf_account_number, List<String> signed_attestations_as_strings) {
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
            return new Surrogate(id, account_number, user_uuid, rhs_account_number, client_type, status, status_reason_code, description, operator_id, sender_location_id, created_at, updated_at, mark_type, rhs_account_type, pco_restricted, pco_restricted_updated_at, gold_subscription_status, gold_subscription_started_at, gold_subscription_ended_at, signed_attestations, account_type, rhf_account_number, signed_attestations_as_strings);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.account_number, surrogate.account_number) && Intrinsics.areEqual(this.user_uuid, surrogate.user_uuid) && Intrinsics.areEqual(this.rhs_account_number, surrogate.rhs_account_number) && this.client_type == surrogate.client_type && this.status == surrogate.status && this.status_reason_code == surrogate.status_reason_code && Intrinsics.areEqual(this.description, surrogate.description) && Intrinsics.areEqual(this.operator_id, surrogate.operator_id) && Intrinsics.areEqual(this.sender_location_id, surrogate.sender_location_id) && Intrinsics.areEqual(this.created_at, surrogate.created_at) && Intrinsics.areEqual(this.updated_at, surrogate.updated_at) && this.mark_type == surrogate.mark_type && this.rhs_account_type == surrogate.rhs_account_type && this.pco_restricted == surrogate.pco_restricted && Intrinsics.areEqual(this.pco_restricted_updated_at, surrogate.pco_restricted_updated_at) && this.gold_subscription_status == surrogate.gold_subscription_status && Intrinsics.areEqual(this.gold_subscription_started_at, surrogate.gold_subscription_started_at) && Intrinsics.areEqual(this.gold_subscription_ended_at, surrogate.gold_subscription_ended_at) && Intrinsics.areEqual(this.signed_attestations, surrogate.signed_attestations) && this.account_type == surrogate.account_type && Intrinsics.areEqual(this.rhf_account_number, surrogate.rhf_account_number) && Intrinsics.areEqual(this.signed_attestations_as_strings, surrogate.signed_attestations_as_strings);
        }

        public int hashCode() {
            int iHashCode = ((this.id.hashCode() * 31) + this.account_number.hashCode()) * 31;
            String str = this.user_uuid;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.rhs_account_number;
            int iHashCode3 = (((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.client_type.hashCode()) * 31) + this.status.hashCode()) * 31) + this.status_reason_code.hashCode()) * 31;
            String str3 = this.description;
            int iHashCode4 = (((((((((((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.operator_id.hashCode()) * 31) + this.sender_location_id.hashCode()) * 31) + this.created_at.hashCode()) * 31) + this.updated_at.hashCode()) * 31) + this.mark_type.hashCode()) * 31;
            BrokerageAccountTypeDto brokerageAccountTypeDto = this.rhs_account_type;
            int iHashCode5 = (((((iHashCode4 + (brokerageAccountTypeDto == null ? 0 : brokerageAccountTypeDto.hashCode())) * 31) + Boolean.hashCode(this.pco_restricted)) * 31) + this.pco_restricted_updated_at.hashCode()) * 31;
            FuturesDiscountFeatureDto futuresDiscountFeatureDto = this.gold_subscription_status;
            int iHashCode6 = (iHashCode5 + (futuresDiscountFeatureDto == null ? 0 : futuresDiscountFeatureDto.hashCode())) * 31;
            String str4 = this.gold_subscription_started_at;
            int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.gold_subscription_ended_at;
            int iHashCode8 = (((((iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.signed_attestations.hashCode()) * 31) + this.account_type.hashCode()) * 31;
            String str6 = this.rhf_account_number;
            return ((iHashCode8 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.signed_attestations_as_strings.hashCode();
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", account_number=" + this.account_number + ", user_uuid=" + this.user_uuid + ", rhs_account_number=" + this.rhs_account_number + ", client_type=" + this.client_type + ", status=" + this.status + ", status_reason_code=" + this.status_reason_code + ", description=" + this.description + ", operator_id=" + this.operator_id + ", sender_location_id=" + this.sender_location_id + ", created_at=" + this.created_at + ", updated_at=" + this.updated_at + ", mark_type=" + this.mark_type + ", rhs_account_type=" + this.rhs_account_type + ", pco_restricted=" + this.pco_restricted + ", pco_restricted_updated_at=" + this.pco_restricted_updated_at + ", gold_subscription_status=" + this.gold_subscription_status + ", gold_subscription_started_at=" + this.gold_subscription_started_at + ", gold_subscription_ended_at=" + this.gold_subscription_ended_at + ", signed_attestations=" + this.signed_attestations + ", account_type=" + this.account_type + ", rhf_account_number=" + this.rhf_account_number + ", signed_attestations_as_strings=" + this.signed_attestations_as_strings + ")";
        }

        /* compiled from: FuturesAccountDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesAccountDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/FuturesAccountDto$Surrogate;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return FuturesAccountDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.ceres.v1.FuturesAccountDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FuturesAccountDto.Surrogate._childSerializers$_anonymous_();
                }
            }), null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.ceres.v1.FuturesAccountDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FuturesAccountDto.Surrogate._childSerializers$_anonymous_$0();
                }
            })};
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, AccountClientTypeDto accountClientTypeDto, AccountStatusDto accountStatusDto, AccountStatusReasonCodeDto accountStatusReasonCodeDto, String str5, String str6, String str7, String str8, String str9, AccountMarkTypeDto accountMarkTypeDto, BrokerageAccountTypeDto brokerageAccountTypeDto, boolean z, String str10, FuturesDiscountFeatureDto futuresDiscountFeatureDto, String str11, String str12, List list, AccountTypeDto accountTypeDto, String str13, List list2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.account_number = "";
            } else {
                this.account_number = str2;
            }
            if ((i & 4) == 0) {
                this.user_uuid = null;
            } else {
                this.user_uuid = str3;
            }
            if ((i & 8) == 0) {
                this.rhs_account_number = null;
            } else {
                this.rhs_account_number = str4;
            }
            if ((i & 16) == 0) {
                this.client_type = AccountClientTypeDto.INSTANCE.getZeroValue();
            } else {
                this.client_type = accountClientTypeDto;
            }
            if ((i & 32) == 0) {
                this.status = AccountStatusDto.INSTANCE.getZeroValue();
            } else {
                this.status = accountStatusDto;
            }
            if ((i & 64) == 0) {
                this.status_reason_code = AccountStatusReasonCodeDto.INSTANCE.getZeroValue();
            } else {
                this.status_reason_code = accountStatusReasonCodeDto;
            }
            if ((i & 128) == 0) {
                this.description = null;
            } else {
                this.description = str5;
            }
            if ((i & 256) == 0) {
                this.operator_id = "";
            } else {
                this.operator_id = str6;
            }
            if ((i & 512) == 0) {
                this.sender_location_id = "";
            } else {
                this.sender_location_id = str7;
            }
            if ((i & 1024) == 0) {
                this.created_at = "";
            } else {
                this.created_at = str8;
            }
            if ((i & 2048) == 0) {
                this.updated_at = "";
            } else {
                this.updated_at = str9;
            }
            this.mark_type = (i & 4096) == 0 ? AccountMarkTypeDto.INSTANCE.getZeroValue() : accountMarkTypeDto;
            if ((i & 8192) == 0) {
                this.rhs_account_type = null;
            } else {
                this.rhs_account_type = brokerageAccountTypeDto;
            }
            this.pco_restricted = (i & 16384) == 0 ? false : z;
            if ((32768 & i) == 0) {
                this.pco_restricted_updated_at = "";
            } else {
                this.pco_restricted_updated_at = str10;
            }
            if ((65536 & i) == 0) {
                this.gold_subscription_status = null;
            } else {
                this.gold_subscription_status = futuresDiscountFeatureDto;
            }
            if ((131072 & i) == 0) {
                this.gold_subscription_started_at = null;
            } else {
                this.gold_subscription_started_at = str11;
            }
            if ((262144 & i) == 0) {
                this.gold_subscription_ended_at = null;
            } else {
                this.gold_subscription_ended_at = str12;
            }
            this.signed_attestations = (524288 & i) == 0 ? CollectionsKt.emptyList() : list;
            this.account_type = (1048576 & i) == 0 ? AccountTypeDto.INSTANCE.getZeroValue() : accountTypeDto;
            if ((2097152 & i) == 0) {
                this.rhf_account_number = null;
            } else {
                this.rhf_account_number = str13;
            }
            this.signed_attestations_as_strings = (i & 4194304) == 0 ? CollectionsKt.emptyList() : list2;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$ceres_entity_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (!Intrinsics.areEqual(self.account_number, "")) {
                output.encodeStringElement(serialDesc, 1, self.account_number);
            }
            String str = self.user_uuid;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, str);
            }
            String str2 = self.rhs_account_number;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, str2);
            }
            if (self.client_type != AccountClientTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, AccountClientTypeDto.Serializer.INSTANCE, self.client_type);
            }
            if (self.status != AccountStatusDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, AccountStatusDto.Serializer.INSTANCE, self.status);
            }
            if (self.status_reason_code != AccountStatusReasonCodeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 6, AccountStatusReasonCodeDto.Serializer.INSTANCE, self.status_reason_code);
            }
            String str3 = self.description;
            if (str3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, str3);
            }
            if (!Intrinsics.areEqual(self.operator_id, "")) {
                output.encodeStringElement(serialDesc, 8, self.operator_id);
            }
            if (!Intrinsics.areEqual(self.sender_location_id, "")) {
                output.encodeStringElement(serialDesc, 9, self.sender_location_id);
            }
            if (!Intrinsics.areEqual(self.created_at, "")) {
                output.encodeStringElement(serialDesc, 10, self.created_at);
            }
            if (!Intrinsics.areEqual(self.updated_at, "")) {
                output.encodeStringElement(serialDesc, 11, self.updated_at);
            }
            if (self.mark_type != AccountMarkTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 12, AccountMarkTypeDto.Serializer.INSTANCE, self.mark_type);
            }
            BrokerageAccountTypeDto brokerageAccountTypeDto = self.rhs_account_type;
            if (brokerageAccountTypeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, BrokerageAccountTypeDto.Serializer.INSTANCE, brokerageAccountTypeDto);
            }
            boolean z = self.pco_restricted;
            if (z) {
                output.encodeBooleanElement(serialDesc, 14, z);
            }
            if (!Intrinsics.areEqual(self.pco_restricted_updated_at, "")) {
                output.encodeStringElement(serialDesc, 15, self.pco_restricted_updated_at);
            }
            FuturesDiscountFeatureDto futuresDiscountFeatureDto = self.gold_subscription_status;
            if (futuresDiscountFeatureDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 16, FuturesDiscountFeatureDto.Serializer.INSTANCE, futuresDiscountFeatureDto);
            }
            String str4 = self.gold_subscription_started_at;
            if (str4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 17, StringSerializer.INSTANCE, str4);
            }
            String str5 = self.gold_subscription_ended_at;
            if (str5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 18, StringSerializer.INSTANCE, str5);
            }
            if (!Intrinsics.areEqual(self.signed_attestations, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 19, lazyArr[19].getValue(), self.signed_attestations);
            }
            if (self.account_type != AccountTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 20, AccountTypeDto.Serializer.INSTANCE, self.account_type);
            }
            String str6 = self.rhf_account_number;
            if (str6 != null) {
                output.encodeNullableSerializableElement(serialDesc, 21, StringSerializer.INSTANCE, str6);
            }
            if (Intrinsics.areEqual(self.signed_attestations_as_strings, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 22, lazyArr[22].getValue(), self.signed_attestations_as_strings);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate(String id, String account_number, String str, String str2, AccountClientTypeDto client_type, AccountStatusDto status, AccountStatusReasonCodeDto status_reason_code, String str3, String operator_id, String sender_location_id, String created_at, String updated_at, AccountMarkTypeDto mark_type, BrokerageAccountTypeDto brokerageAccountTypeDto, boolean z, String pco_restricted_updated_at, FuturesDiscountFeatureDto futuresDiscountFeatureDto, String str4, String str5, List<? extends AgreementTypeDto> signed_attestations, AccountTypeDto account_type, String str6, List<String> signed_attestations_as_strings) {
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
            this.rhs_account_type = brokerageAccountTypeDto;
            this.pco_restricted = z;
            this.pco_restricted_updated_at = pco_restricted_updated_at;
            this.gold_subscription_status = futuresDiscountFeatureDto;
            this.gold_subscription_started_at = str4;
            this.gold_subscription_ended_at = str5;
            this.signed_attestations = signed_attestations;
            this.account_type = account_type;
            this.rhf_account_number = str6;
            this.signed_attestations_as_strings = signed_attestations_as_strings;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, AccountClientTypeDto accountClientTypeDto, AccountStatusDto accountStatusDto, AccountStatusReasonCodeDto accountStatusReasonCodeDto, String str5, String str6, String str7, String str8, String str9, AccountMarkTypeDto accountMarkTypeDto, BrokerageAccountTypeDto brokerageAccountTypeDto, boolean z, String str10, FuturesDiscountFeatureDto futuresDiscountFeatureDto, String str11, String str12, List list, AccountTypeDto accountTypeDto, String str13, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? AccountClientTypeDto.INSTANCE.getZeroValue() : accountClientTypeDto, (i & 32) != 0 ? AccountStatusDto.INSTANCE.getZeroValue() : accountStatusDto, (i & 64) != 0 ? AccountStatusReasonCodeDto.INSTANCE.getZeroValue() : accountStatusReasonCodeDto, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? "" : str6, (i & 512) != 0 ? "" : str7, (i & 1024) != 0 ? "" : str8, (i & 2048) != 0 ? "" : str9, (i & 4096) != 0 ? AccountMarkTypeDto.INSTANCE.getZeroValue() : accountMarkTypeDto, (i & 8192) != 0 ? null : brokerageAccountTypeDto, (i & 16384) != 0 ? false : z, (i & 32768) == 0 ? str10 : "", (i & 65536) != 0 ? null : futuresDiscountFeatureDto, (i & 131072) != 0 ? null : str11, (i & 262144) != 0 ? null : str12, (i & 524288) != 0 ? CollectionsKt.emptyList() : list, (i & 1048576) != 0 ? AccountTypeDto.INSTANCE.getZeroValue() : accountTypeDto, (i & 2097152) != 0 ? null : str13, (i & 4194304) != 0 ? CollectionsKt.emptyList() : list2);
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

        public final AccountClientTypeDto getClient_type() {
            return this.client_type;
        }

        public final AccountStatusDto getStatus() {
            return this.status;
        }

        public final AccountStatusReasonCodeDto getStatus_reason_code() {
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

        public final AccountMarkTypeDto getMark_type() {
            return this.mark_type;
        }

        public final BrokerageAccountTypeDto getRhs_account_type() {
            return this.rhs_account_type;
        }

        public final boolean getPco_restricted() {
            return this.pco_restricted;
        }

        public final String getPco_restricted_updated_at() {
            return this.pco_restricted_updated_at;
        }

        public final FuturesDiscountFeatureDto getGold_subscription_status() {
            return this.gold_subscription_status;
        }

        public final String getGold_subscription_started_at() {
            return this.gold_subscription_started_at;
        }

        public final String getGold_subscription_ended_at() {
            return this.gold_subscription_ended_at;
        }

        public final List<AgreementTypeDto> getSigned_attestations() {
            return this.signed_attestations;
        }

        public final AccountTypeDto getAccount_type() {
            return this.account_type;
        }

        public final String getRhf_account_number() {
            return this.rhf_account_number;
        }

        public final List<String> getSigned_attestations_as_strings() {
            return this.signed_attestations_as_strings;
        }
    }

    /* compiled from: FuturesAccountDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesAccountDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/ceres/v1/FuturesAccountDto;", "Lcom/robinhood/ceres/v1/FuturesAccount;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/FuturesAccountDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<FuturesAccountDto, FuturesAccount> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FuturesAccountDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FuturesAccountDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FuturesAccountDto> getBinaryBase64Serializer() {
            return (KSerializer) FuturesAccountDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<FuturesAccount> getProtoAdapter() {
            return FuturesAccount.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FuturesAccountDto getZeroValue() {
            return FuturesAccountDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FuturesAccountDto fromProto(FuturesAccount proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String id = proto.getId();
            String account_number = proto.getAccount_number();
            String user_uuid = proto.getUser_uuid();
            String rhs_account_number = proto.getRhs_account_number();
            AccountClientTypeDto accountClientTypeDtoFromProto = AccountClientTypeDto.INSTANCE.fromProto(proto.getClient_type());
            AccountStatusDto accountStatusDtoFromProto = AccountStatusDto.INSTANCE.fromProto(proto.getStatus());
            AccountStatusReasonCodeDto accountStatusReasonCodeDtoFromProto = AccountStatusReasonCodeDto.INSTANCE.fromProto(proto.getStatus_reason_code());
            String description = proto.getDescription();
            String operator_id = proto.getOperator_id();
            String sender_location_id = proto.getSender_location_id();
            String created_at = proto.getCreated_at();
            String updated_at = proto.getUpdated_at();
            AccountMarkTypeDto accountMarkTypeDtoFromProto = AccountMarkTypeDto.INSTANCE.fromProto(proto.getMark_type());
            BrokerageAccountType rhs_account_type = proto.getRhs_account_type();
            BrokerageAccountTypeDto brokerageAccountTypeDtoFromProto = rhs_account_type != null ? BrokerageAccountTypeDto.INSTANCE.fromProto(rhs_account_type) : null;
            boolean pco_restricted = proto.getPco_restricted();
            String pco_restricted_updated_at = proto.getPco_restricted_updated_at();
            FuturesDiscountFeature gold_subscription_status = proto.getGold_subscription_status();
            FuturesDiscountFeatureDto futuresDiscountFeatureDtoFromProto = gold_subscription_status != null ? FuturesDiscountFeatureDto.INSTANCE.fromProto(gold_subscription_status) : null;
            String gold_subscription_started_at = proto.getGold_subscription_started_at();
            String gold_subscription_ended_at = proto.getGold_subscription_ended_at();
            List<AgreementType> signed_attestations = proto.getSigned_attestations();
            FuturesDiscountFeatureDto futuresDiscountFeatureDto = futuresDiscountFeatureDtoFromProto;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(signed_attestations, 10));
            Iterator<T> it = signed_attestations.iterator();
            while (it.hasNext()) {
                arrayList.add(AgreementTypeDto.INSTANCE.fromProto((AgreementType) it.next()));
            }
            AccountTypeDto accountTypeDtoFromProto = AccountTypeDto.INSTANCE.fromProto(proto.getAccount_type());
            String rhf_account_number = proto.getRhf_account_number();
            List<String> signed_attestations_as_strings = proto.getSigned_attestations_as_strings();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(signed_attestations_as_strings, 10));
            Iterator<T> it2 = signed_attestations_as_strings.iterator();
            while (it2.hasNext()) {
                arrayList2.add((String) it2.next());
            }
            return new FuturesAccountDto(new Surrogate(id, account_number, user_uuid, rhs_account_number, accountClientTypeDtoFromProto, accountStatusDtoFromProto, accountStatusReasonCodeDtoFromProto, description, operator_id, sender_location_id, created_at, updated_at, accountMarkTypeDtoFromProto, brokerageAccountTypeDtoFromProto, pco_restricted, pco_restricted_updated_at, futuresDiscountFeatureDto, gold_subscription_started_at, gold_subscription_ended_at, arrayList, accountTypeDtoFromProto, rhf_account_number, arrayList2), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.FuturesAccountDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesAccountDto.binaryBase64Serializer_delegate$lambda$2();
            }
        });
        zeroValue = new FuturesAccountDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 8388607, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$2() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: FuturesAccountDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesAccountDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/FuturesAccountDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/ceres/v1/FuturesAccountDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<FuturesAccountDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ceres.entity.FuturesAccount", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FuturesAccountDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public FuturesAccountDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new FuturesAccountDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: FuturesAccountDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesAccountDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "com.robinhood.ceres.v1.FuturesAccountDto";
        }
    }
}
