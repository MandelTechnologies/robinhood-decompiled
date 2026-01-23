package com.robinhood.ceres.p284v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.odyssey.lib.Constants4;
import com.robinhood.ceres.p284v1.FuturesAccountOnboardingInfoDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.GovernmentIdNfcScan;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: FuturesAccountOnboardingInfoDto.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010$\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 I2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004HIJKB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007Bñ\u0001\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\t\u0012\b\b\u0002\u0010\u0015\u001a\u00020\t\u0012\b\b\u0002\u0010\u0016\u001a\u00020\t\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\b\b\u0002\u0010\u0018\u001a\u00020\t\u0012\b\b\u0002\u0010\u0019\u001a\u00020\t\u0012\b\b\u0002\u0010\u001a\u001a\u00020\t\u0012\b\b\u0002\u0010\u001b\u001a\u00020\t\u0012\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u001d\u0012\b\b\u0002\u0010\u001e\u001a\u00020\t\u0012\b\b\u0002\u0010\u001f\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010 Jî\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\t2\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\t2\b\b\u0002\u0010\u001f\u001a\u00020\tJ\b\u0010:\u001a\u00020\u0002H\u0016J\b\u0010;\u001a\u00020\tH\u0016J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?H\u0096\u0002J\b\u0010@\u001a\u00020AH\u0016J\u0018\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020AH\u0016J\b\u0010G\u001a\u00020AH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b#\u0010\"R\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b$\u0010\"R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b%\u0010\"R\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b&\u0010\"R\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b'\u0010\"R\u0011\u0010\u000f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b(\u0010\"R\u0011\u0010\u0010\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b)\u0010\"R\u0011\u0010\u0011\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b*\u0010\"R\u0011\u0010\u0012\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b+\u0010\"R\u0011\u0010\u0013\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b,\u0010\"R\u0011\u0010\u0014\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b-\u0010\"R\u0011\u0010\u0015\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b.\u0010\"R\u0011\u0010\u0016\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b/\u0010\"R\u0011\u0010\u0017\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b0\u0010\"R\u0011\u0010\u0018\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b1\u0010\"R\u0011\u0010\u0019\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b2\u0010\"R\u0011\u0010\u001a\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b3\u0010\"R\u0011\u0010\u001b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b4\u0010\"R\u001d\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u001d8F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0011\u0010\u001e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b7\u0010\"R\u0011\u0010\u001f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b8\u0010\"¨\u0006L"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesAccountOnboardingInfoDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/ceres/v1/FuturesAccountOnboardingInfo;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/ceres/v1/FuturesAccountOnboardingInfoDto$Surrogate;", "<init>", "(Lcom/robinhood/ceres/v1/FuturesAccountOnboardingInfoDto$Surrogate;)V", "first_name", "", "last_name", GovernmentIdNfcScan.dateOfBirthName, "email", Constants4.ENTITY_FIELD_PHONE_NUMBER, "citizenship", "marital_status", "ssn", "employment_status", "employer", "occupation", "industry", PlaceTypes.ADDRESS, "line1", "line2", "locality", "region", PlaceTypes.POSTAL_CODE, PlaceTypes.COUNTRY, "investor_profile_info", "", "approved_at", "approved_by", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "getFirst_name", "()Ljava/lang/String;", "getLast_name", "getDate_of_birth", "getEmail", "getPhone_number", "getCitizenship", "getMarital_status", "getSsn", "getEmployment_status", "getEmployer", "getOccupation", "getIndustry", "getAddress", "getLine1", "getLine2", "getLocality", "getRegion", "getPostal_code", "getCountry", "getInvestor_profile_info", "()Ljava/util/Map;", "getApproved_at", "getApproved_by", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class FuturesAccountOnboardingInfoDto implements Dto3<FuturesAccountOnboardingInfo>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<FuturesAccountOnboardingInfoDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FuturesAccountOnboardingInfoDto, FuturesAccountOnboardingInfo>> binaryBase64Serializer$delegate;
    private static final FuturesAccountOnboardingInfoDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ FuturesAccountOnboardingInfoDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FuturesAccountOnboardingInfoDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getFirst_name() {
        return this.surrogate.getFirst_name();
    }

    public final String getLast_name() {
        return this.surrogate.getLast_name();
    }

    public final String getDate_of_birth() {
        return this.surrogate.getDate_of_birth();
    }

    public final String getEmail() {
        return this.surrogate.getEmail();
    }

    public final String getPhone_number() {
        return this.surrogate.getPhone_number();
    }

    public final String getCitizenship() {
        return this.surrogate.getCitizenship();
    }

    public final String getMarital_status() {
        return this.surrogate.getMarital_status();
    }

    public final String getSsn() {
        return this.surrogate.getSsn();
    }

    public final String getEmployment_status() {
        return this.surrogate.getEmployment_status();
    }

    public final String getEmployer() {
        return this.surrogate.getEmployer();
    }

    public final String getOccupation() {
        return this.surrogate.getOccupation();
    }

    public final String getIndustry() {
        return this.surrogate.getIndustry();
    }

    public final String getAddress() {
        return this.surrogate.getAddress();
    }

    public final String getLine1() {
        return this.surrogate.getLine1();
    }

    public final String getLine2() {
        return this.surrogate.getLine2();
    }

    public final String getLocality() {
        return this.surrogate.getLocality();
    }

    public final String getRegion() {
        return this.surrogate.getRegion();
    }

    public final String getPostal_code() {
        return this.surrogate.getPostal_code();
    }

    public final String getCountry() {
        return this.surrogate.getCountry();
    }

    public final Map<String, String> getInvestor_profile_info() {
        return this.surrogate.getInvestor_profile_info();
    }

    public final String getApproved_at() {
        return this.surrogate.getApproved_at();
    }

    public final String getApproved_by() {
        return this.surrogate.getApproved_by();
    }

    public /* synthetic */ FuturesAccountOnboardingInfoDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, Map map, String str20, String str21, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17, (i & 131072) != 0 ? "" : str18, (i & 262144) != 0 ? "" : str19, (i & 524288) != 0 ? MapsKt.emptyMap() : map, (i & 1048576) != 0 ? "" : str20, (i & 2097152) != 0 ? "" : str21);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FuturesAccountOnboardingInfoDto(String first_name, String last_name, String date_of_birth, String email, String phone_number, String citizenship, String marital_status, String ssn, String employment_status, String employer, String occupation, String industry, String address, String line1, String line2, String locality, String region, String postal_code, String country, Map<String, String> investor_profile_info, String approved_at, String approved_by) {
        this(new Surrogate(first_name, last_name, date_of_birth, email, phone_number, citizenship, marital_status, ssn, employment_status, employer, occupation, industry, address, line1, line2, locality, region, postal_code, country, investor_profile_info, approved_at, approved_by));
        Intrinsics.checkNotNullParameter(first_name, "first_name");
        Intrinsics.checkNotNullParameter(last_name, "last_name");
        Intrinsics.checkNotNullParameter(date_of_birth, "date_of_birth");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(phone_number, "phone_number");
        Intrinsics.checkNotNullParameter(citizenship, "citizenship");
        Intrinsics.checkNotNullParameter(marital_status, "marital_status");
        Intrinsics.checkNotNullParameter(ssn, "ssn");
        Intrinsics.checkNotNullParameter(employment_status, "employment_status");
        Intrinsics.checkNotNullParameter(employer, "employer");
        Intrinsics.checkNotNullParameter(occupation, "occupation");
        Intrinsics.checkNotNullParameter(industry, "industry");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(line1, "line1");
        Intrinsics.checkNotNullParameter(line2, "line2");
        Intrinsics.checkNotNullParameter(locality, "locality");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(postal_code, "postal_code");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(investor_profile_info, "investor_profile_info");
        Intrinsics.checkNotNullParameter(approved_at, "approved_at");
        Intrinsics.checkNotNullParameter(approved_by, "approved_by");
    }

    public static /* synthetic */ FuturesAccountOnboardingInfoDto copy$default(FuturesAccountOnboardingInfoDto futuresAccountOnboardingInfoDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, Map map, String str20, String str21, int i, Object obj) {
        String approved_by;
        String str22;
        String first_name = (i & 1) != 0 ? futuresAccountOnboardingInfoDto.surrogate.getFirst_name() : str;
        String last_name = (i & 2) != 0 ? futuresAccountOnboardingInfoDto.surrogate.getLast_name() : str2;
        String date_of_birth = (i & 4) != 0 ? futuresAccountOnboardingInfoDto.surrogate.getDate_of_birth() : str3;
        String email = (i & 8) != 0 ? futuresAccountOnboardingInfoDto.surrogate.getEmail() : str4;
        String phone_number = (i & 16) != 0 ? futuresAccountOnboardingInfoDto.surrogate.getPhone_number() : str5;
        String citizenship = (i & 32) != 0 ? futuresAccountOnboardingInfoDto.surrogate.getCitizenship() : str6;
        String marital_status = (i & 64) != 0 ? futuresAccountOnboardingInfoDto.surrogate.getMarital_status() : str7;
        String ssn = (i & 128) != 0 ? futuresAccountOnboardingInfoDto.surrogate.getSsn() : str8;
        String employment_status = (i & 256) != 0 ? futuresAccountOnboardingInfoDto.surrogate.getEmployment_status() : str9;
        String employer = (i & 512) != 0 ? futuresAccountOnboardingInfoDto.surrogate.getEmployer() : str10;
        String occupation = (i & 1024) != 0 ? futuresAccountOnboardingInfoDto.surrogate.getOccupation() : str11;
        String industry = (i & 2048) != 0 ? futuresAccountOnboardingInfoDto.surrogate.getIndustry() : str12;
        String address = (i & 4096) != 0 ? futuresAccountOnboardingInfoDto.surrogate.getAddress() : str13;
        String line1 = (i & 8192) != 0 ? futuresAccountOnboardingInfoDto.surrogate.getLine1() : str14;
        String str23 = first_name;
        String line2 = (i & 16384) != 0 ? futuresAccountOnboardingInfoDto.surrogate.getLine2() : str15;
        String locality = (i & 32768) != 0 ? futuresAccountOnboardingInfoDto.surrogate.getLocality() : str16;
        String region = (i & 65536) != 0 ? futuresAccountOnboardingInfoDto.surrogate.getRegion() : str17;
        String postal_code = (i & 131072) != 0 ? futuresAccountOnboardingInfoDto.surrogate.getPostal_code() : str18;
        String country = (i & 262144) != 0 ? futuresAccountOnboardingInfoDto.surrogate.getCountry() : str19;
        Map investor_profile_info = (i & 524288) != 0 ? futuresAccountOnboardingInfoDto.surrogate.getInvestor_profile_info() : map;
        String approved_at = (i & 1048576) != 0 ? futuresAccountOnboardingInfoDto.surrogate.getApproved_at() : str20;
        if ((i & 2097152) != 0) {
            str22 = approved_at;
            approved_by = futuresAccountOnboardingInfoDto.surrogate.getApproved_by();
        } else {
            approved_by = str21;
            str22 = approved_at;
        }
        return futuresAccountOnboardingInfoDto.copy(str23, last_name, date_of_birth, email, phone_number, citizenship, marital_status, ssn, employment_status, employer, occupation, industry, address, line1, line2, locality, region, postal_code, country, investor_profile_info, str22, approved_by);
    }

    public final FuturesAccountOnboardingInfoDto copy(String first_name, String last_name, String date_of_birth, String email, String phone_number, String citizenship, String marital_status, String ssn, String employment_status, String employer, String occupation, String industry, String address, String line1, String line2, String locality, String region, String postal_code, String country, Map<String, String> investor_profile_info, String approved_at, String approved_by) {
        Intrinsics.checkNotNullParameter(first_name, "first_name");
        Intrinsics.checkNotNullParameter(last_name, "last_name");
        Intrinsics.checkNotNullParameter(date_of_birth, "date_of_birth");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(phone_number, "phone_number");
        Intrinsics.checkNotNullParameter(citizenship, "citizenship");
        Intrinsics.checkNotNullParameter(marital_status, "marital_status");
        Intrinsics.checkNotNullParameter(ssn, "ssn");
        Intrinsics.checkNotNullParameter(employment_status, "employment_status");
        Intrinsics.checkNotNullParameter(employer, "employer");
        Intrinsics.checkNotNullParameter(occupation, "occupation");
        Intrinsics.checkNotNullParameter(industry, "industry");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(line1, "line1");
        Intrinsics.checkNotNullParameter(line2, "line2");
        Intrinsics.checkNotNullParameter(locality, "locality");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(postal_code, "postal_code");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(investor_profile_info, "investor_profile_info");
        Intrinsics.checkNotNullParameter(approved_at, "approved_at");
        Intrinsics.checkNotNullParameter(approved_by, "approved_by");
        return new FuturesAccountOnboardingInfoDto(new Surrogate(first_name, last_name, date_of_birth, email, phone_number, citizenship, marital_status, ssn, employment_status, employer, occupation, industry, address, line1, line2, locality, region, postal_code, country, investor_profile_info, approved_at, approved_by));
    }

    @Override // com.robinhood.idl.Dto
    public FuturesAccountOnboardingInfo toProto() {
        String first_name = this.surrogate.getFirst_name();
        String last_name = this.surrogate.getLast_name();
        String date_of_birth = this.surrogate.getDate_of_birth();
        String email = this.surrogate.getEmail();
        String phone_number = this.surrogate.getPhone_number();
        String citizenship = this.surrogate.getCitizenship();
        String marital_status = this.surrogate.getMarital_status();
        String ssn = this.surrogate.getSsn();
        String employment_status = this.surrogate.getEmployment_status();
        String employer = this.surrogate.getEmployer();
        String occupation = this.surrogate.getOccupation();
        String industry = this.surrogate.getIndustry();
        String address = this.surrogate.getAddress();
        String line1 = this.surrogate.getLine1();
        String line2 = this.surrogate.getLine2();
        String locality = this.surrogate.getLocality();
        String region = this.surrogate.getRegion();
        String postal_code = this.surrogate.getPostal_code();
        String country = this.surrogate.getCountry();
        Set<Map.Entry<String, String>> setEntrySet = this.surrogate.getInvestor_profile_info().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        Iterator it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Iterator it2 = it;
            Tuples2 tuples2M3642to = Tuples4.m3642to((String) entry.getKey(), (String) entry.getValue());
            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
            first_name = first_name;
            it = it2;
        }
        return new FuturesAccountOnboardingInfo(first_name, last_name, date_of_birth, email, phone_number, citizenship, marital_status, ssn, employment_status, employer, occupation, industry, address, line1, line2, locality, region, postal_code, country, linkedHashMap, this.surrogate.getApproved_at(), this.surrogate.getApproved_by(), null, 4194304, null);
    }

    public String toString() {
        return "[FuturesAccountOnboardingInfoDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof FuturesAccountOnboardingInfoDto) && Intrinsics.areEqual(((FuturesAccountOnboardingInfoDto) other).surrogate, this.surrogate);
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
    /* compiled from: FuturesAccountOnboardingInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\bH\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 u2\u00020\u0001:\u0002tuBï\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003¢\u0006\u0004\b\u001a\u0010\u001bB\u0083\u0002\b\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001a\u0010 J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\t\u0010[\u001a\u00020\u0003HÆ\u0003J\t\u0010\\\u001a\u00020\u0003HÆ\u0003J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\t\u0010^\u001a\u00020\u0003HÆ\u0003J\t\u0010_\u001a\u00020\u0003HÆ\u0003J\t\u0010`\u001a\u00020\u0003HÆ\u0003J\t\u0010a\u001a\u00020\u0003HÆ\u0003J\t\u0010b\u001a\u00020\u0003HÆ\u0003J\u0015\u0010c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0017HÆ\u0003J\t\u0010d\u001a\u00020\u0003HÆ\u0003J\t\u0010e\u001a\u00020\u0003HÆ\u0003Jñ\u0001\u0010f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u0003HÆ\u0001J\u0013\u0010g\u001a\u00020h2\b\u0010i\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010j\u001a\u00020\u001dHÖ\u0001J\t\u0010k\u001a\u00020\u0003HÖ\u0001J%\u0010l\u001a\u00020m2\u0006\u0010n\u001a\u00020\u00002\u0006\u0010o\u001a\u00020p2\u0006\u0010q\u001a\u00020rH\u0001¢\u0006\u0002\bsR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\"\u001a\u0004\b(\u0010$R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\"\u001a\u0004\b*\u0010$R\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b+\u0010\"\u001a\u0004\b,\u0010$R\u001c\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b-\u0010\"\u001a\u0004\b.\u0010$R\u001c\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u0010\"\u001a\u0004\b0\u0010$R\u001c\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b1\u0010\"\u001a\u0004\b2\u0010$R\u001c\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b3\u0010\"\u001a\u0004\b4\u0010$R\u001c\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b5\u0010\"\u001a\u0004\b6\u0010$R\u001c\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b7\u0010\"\u001a\u0004\b8\u0010$R\u001c\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b9\u0010\"\u001a\u0004\b:\u0010$R\u001c\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b;\u0010\"\u001a\u0004\b<\u0010$R\u001c\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b=\u0010\"\u001a\u0004\b>\u0010$R\u001c\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b?\u0010\"\u001a\u0004\b@\u0010$R\u001c\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bA\u0010\"\u001a\u0004\bB\u0010$R\u001c\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bC\u0010\"\u001a\u0004\bD\u0010$R\u001c\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bE\u0010\"\u001a\u0004\bF\u0010$R\u001c\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bG\u0010\"\u001a\u0004\bH\u0010$R(\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00178\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bI\u0010\"\u001a\u0004\bJ\u0010KR\u001c\u0010\u0018\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bL\u0010\"\u001a\u0004\bM\u0010$R\u001c\u0010\u0019\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bN\u0010\"\u001a\u0004\bO\u0010$¨\u0006v"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesAccountOnboardingInfoDto$Surrogate;", "", "first_name", "", "last_name", GovernmentIdNfcScan.dateOfBirthName, "email", Constants4.ENTITY_FIELD_PHONE_NUMBER, "citizenship", "marital_status", "ssn", "employment_status", "employer", "occupation", "industry", PlaceTypes.ADDRESS, "line1", "line2", "locality", "region", PlaceTypes.POSTAL_CODE, PlaceTypes.COUNTRY, "investor_profile_info", "", "approved_at", "approved_by", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getFirst_name$annotations", "()V", "getFirst_name", "()Ljava/lang/String;", "getLast_name$annotations", "getLast_name", "getDate_of_birth$annotations", "getDate_of_birth", "getEmail$annotations", "getEmail", "getPhone_number$annotations", "getPhone_number", "getCitizenship$annotations", "getCitizenship", "getMarital_status$annotations", "getMarital_status", "getSsn$annotations", "getSsn", "getEmployment_status$annotations", "getEmployment_status", "getEmployer$annotations", "getEmployer", "getOccupation$annotations", "getOccupation", "getIndustry$annotations", "getIndustry", "getAddress$annotations", "getAddress", "getLine1$annotations", "getLine1", "getLine2$annotations", "getLine2", "getLocality$annotations", "getLocality", "getRegion$annotations", "getRegion", "getPostal_code$annotations", "getPostal_code", "getCountry$annotations", "getCountry", "getInvestor_profile_info$annotations", "getInvestor_profile_info", "()Ljava/util/Map;", "getApproved_at$annotations", "getApproved_at", "getApproved_by$annotations", "getApproved_by", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ceres_entity_v1_externalRelease", "$serializer", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final String address;
        private final String approved_at;
        private final String approved_by;
        private final String citizenship;
        private final String country;
        private final String date_of_birth;
        private final String email;
        private final String employer;
        private final String employment_status;
        private final String first_name;
        private final String industry;
        private final Map<String, String> investor_profile_info;
        private final String last_name;
        private final String line1;
        private final String line2;
        private final String locality;
        private final String marital_status;
        private final String occupation;
        private final String phone_number;
        private final String postal_code;
        private final String region;
        private final String ssn;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.ceres.v1.FuturesAccountOnboardingInfoDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesAccountOnboardingInfoDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null};

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Map) null, (String) null, (String) null, 4194303, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, Map map, String str20, String str21, int i, Object obj) {
            String str22;
            String str23;
            String str24 = (i & 1) != 0 ? surrogate.first_name : str;
            String str25 = (i & 2) != 0 ? surrogate.last_name : str2;
            String str26 = (i & 4) != 0 ? surrogate.date_of_birth : str3;
            String str27 = (i & 8) != 0 ? surrogate.email : str4;
            String str28 = (i & 16) != 0 ? surrogate.phone_number : str5;
            String str29 = (i & 32) != 0 ? surrogate.citizenship : str6;
            String str30 = (i & 64) != 0 ? surrogate.marital_status : str7;
            String str31 = (i & 128) != 0 ? surrogate.ssn : str8;
            String str32 = (i & 256) != 0 ? surrogate.employment_status : str9;
            String str33 = (i & 512) != 0 ? surrogate.employer : str10;
            String str34 = (i & 1024) != 0 ? surrogate.occupation : str11;
            String str35 = (i & 2048) != 0 ? surrogate.industry : str12;
            String str36 = (i & 4096) != 0 ? surrogate.address : str13;
            String str37 = (i & 8192) != 0 ? surrogate.line1 : str14;
            String str38 = str24;
            String str39 = (i & 16384) != 0 ? surrogate.line2 : str15;
            String str40 = (i & 32768) != 0 ? surrogate.locality : str16;
            String str41 = (i & 65536) != 0 ? surrogate.region : str17;
            String str42 = (i & 131072) != 0 ? surrogate.postal_code : str18;
            String str43 = (i & 262144) != 0 ? surrogate.country : str19;
            Map map2 = (i & 524288) != 0 ? surrogate.investor_profile_info : map;
            String str44 = (i & 1048576) != 0 ? surrogate.approved_at : str20;
            if ((i & 2097152) != 0) {
                str23 = str44;
                str22 = surrogate.approved_by;
            } else {
                str22 = str21;
                str23 = str44;
            }
            return surrogate.copy(str38, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str39, str40, str41, str42, str43, map2, str23, str22);
        }

        @SerialName(PlaceTypes.ADDRESS)
        @JsonAnnotations2(names = {PlaceTypes.ADDRESS})
        public static /* synthetic */ void getAddress$annotations() {
        }

        @SerialName("approvedAt")
        @JsonAnnotations2(names = {"approved_at"})
        public static /* synthetic */ void getApproved_at$annotations() {
        }

        @SerialName("approvedBy")
        @JsonAnnotations2(names = {"approved_by"})
        public static /* synthetic */ void getApproved_by$annotations() {
        }

        @SerialName("citizenship")
        @JsonAnnotations2(names = {"citizenship"})
        public static /* synthetic */ void getCitizenship$annotations() {
        }

        @SerialName(PlaceTypes.COUNTRY)
        @JsonAnnotations2(names = {PlaceTypes.COUNTRY})
        public static /* synthetic */ void getCountry$annotations() {
        }

        @SerialName("dateOfBirth")
        @JsonAnnotations2(names = {GovernmentIdNfcScan.dateOfBirthName})
        public static /* synthetic */ void getDate_of_birth$annotations() {
        }

        @SerialName("email")
        @JsonAnnotations2(names = {"email"})
        public static /* synthetic */ void getEmail$annotations() {
        }

        @SerialName("employer")
        @JsonAnnotations2(names = {"employer"})
        public static /* synthetic */ void getEmployer$annotations() {
        }

        @SerialName("employmentStatus")
        @JsonAnnotations2(names = {"employment_status"})
        public static /* synthetic */ void getEmployment_status$annotations() {
        }

        @SerialName("firstName")
        @JsonAnnotations2(names = {"first_name"})
        public static /* synthetic */ void getFirst_name$annotations() {
        }

        @SerialName("industry")
        @JsonAnnotations2(names = {"industry"})
        public static /* synthetic */ void getIndustry$annotations() {
        }

        @SerialName("investorProfileInfo")
        @JsonAnnotations2(names = {"investor_profile_info"})
        public static /* synthetic */ void getInvestor_profile_info$annotations() {
        }

        @SerialName("lastName")
        @JsonAnnotations2(names = {"last_name"})
        public static /* synthetic */ void getLast_name$annotations() {
        }

        @SerialName("line1")
        @JsonAnnotations2(names = {"line1"})
        public static /* synthetic */ void getLine1$annotations() {
        }

        @SerialName("line2")
        @JsonAnnotations2(names = {"line2"})
        public static /* synthetic */ void getLine2$annotations() {
        }

        @SerialName("locality")
        @JsonAnnotations2(names = {"locality"})
        public static /* synthetic */ void getLocality$annotations() {
        }

        @SerialName("maritalStatus")
        @JsonAnnotations2(names = {"marital_status"})
        public static /* synthetic */ void getMarital_status$annotations() {
        }

        @SerialName("occupation")
        @JsonAnnotations2(names = {"occupation"})
        public static /* synthetic */ void getOccupation$annotations() {
        }

        @SerialName("phoneNumber")
        @JsonAnnotations2(names = {Constants4.ENTITY_FIELD_PHONE_NUMBER})
        public static /* synthetic */ void getPhone_number$annotations() {
        }

        @SerialName("postalCode")
        @JsonAnnotations2(names = {PlaceTypes.POSTAL_CODE})
        public static /* synthetic */ void getPostal_code$annotations() {
        }

        @SerialName("region")
        @JsonAnnotations2(names = {"region"})
        public static /* synthetic */ void getRegion$annotations() {
        }

        @SerialName("ssn")
        @JsonAnnotations2(names = {"ssn"})
        public static /* synthetic */ void getSsn$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getFirst_name() {
            return this.first_name;
        }

        /* renamed from: component10, reason: from getter */
        public final String getEmployer() {
            return this.employer;
        }

        /* renamed from: component11, reason: from getter */
        public final String getOccupation() {
            return this.occupation;
        }

        /* renamed from: component12, reason: from getter */
        public final String getIndustry() {
            return this.industry;
        }

        /* renamed from: component13, reason: from getter */
        public final String getAddress() {
            return this.address;
        }

        /* renamed from: component14, reason: from getter */
        public final String getLine1() {
            return this.line1;
        }

        /* renamed from: component15, reason: from getter */
        public final String getLine2() {
            return this.line2;
        }

        /* renamed from: component16, reason: from getter */
        public final String getLocality() {
            return this.locality;
        }

        /* renamed from: component17, reason: from getter */
        public final String getRegion() {
            return this.region;
        }

        /* renamed from: component18, reason: from getter */
        public final String getPostal_code() {
            return this.postal_code;
        }

        /* renamed from: component19, reason: from getter */
        public final String getCountry() {
            return this.country;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLast_name() {
            return this.last_name;
        }

        public final Map<String, String> component20() {
            return this.investor_profile_info;
        }

        /* renamed from: component21, reason: from getter */
        public final String getApproved_at() {
            return this.approved_at;
        }

        /* renamed from: component22, reason: from getter */
        public final String getApproved_by() {
            return this.approved_by;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDate_of_birth() {
            return this.date_of_birth;
        }

        /* renamed from: component4, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        /* renamed from: component5, reason: from getter */
        public final String getPhone_number() {
            return this.phone_number;
        }

        /* renamed from: component6, reason: from getter */
        public final String getCitizenship() {
            return this.citizenship;
        }

        /* renamed from: component7, reason: from getter */
        public final String getMarital_status() {
            return this.marital_status;
        }

        /* renamed from: component8, reason: from getter */
        public final String getSsn() {
            return this.ssn;
        }

        /* renamed from: component9, reason: from getter */
        public final String getEmployment_status() {
            return this.employment_status;
        }

        public final Surrogate copy(String first_name, String last_name, String date_of_birth, String email, String phone_number, String citizenship, String marital_status, String ssn, String employment_status, String employer, String occupation, String industry, String address, String line1, String line2, String locality, String region, String postal_code, String country, Map<String, String> investor_profile_info, String approved_at, String approved_by) {
            Intrinsics.checkNotNullParameter(first_name, "first_name");
            Intrinsics.checkNotNullParameter(last_name, "last_name");
            Intrinsics.checkNotNullParameter(date_of_birth, "date_of_birth");
            Intrinsics.checkNotNullParameter(email, "email");
            Intrinsics.checkNotNullParameter(phone_number, "phone_number");
            Intrinsics.checkNotNullParameter(citizenship, "citizenship");
            Intrinsics.checkNotNullParameter(marital_status, "marital_status");
            Intrinsics.checkNotNullParameter(ssn, "ssn");
            Intrinsics.checkNotNullParameter(employment_status, "employment_status");
            Intrinsics.checkNotNullParameter(employer, "employer");
            Intrinsics.checkNotNullParameter(occupation, "occupation");
            Intrinsics.checkNotNullParameter(industry, "industry");
            Intrinsics.checkNotNullParameter(address, "address");
            Intrinsics.checkNotNullParameter(line1, "line1");
            Intrinsics.checkNotNullParameter(line2, "line2");
            Intrinsics.checkNotNullParameter(locality, "locality");
            Intrinsics.checkNotNullParameter(region, "region");
            Intrinsics.checkNotNullParameter(postal_code, "postal_code");
            Intrinsics.checkNotNullParameter(country, "country");
            Intrinsics.checkNotNullParameter(investor_profile_info, "investor_profile_info");
            Intrinsics.checkNotNullParameter(approved_at, "approved_at");
            Intrinsics.checkNotNullParameter(approved_by, "approved_by");
            return new Surrogate(first_name, last_name, date_of_birth, email, phone_number, citizenship, marital_status, ssn, employment_status, employer, occupation, industry, address, line1, line2, locality, region, postal_code, country, investor_profile_info, approved_at, approved_by);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.first_name, surrogate.first_name) && Intrinsics.areEqual(this.last_name, surrogate.last_name) && Intrinsics.areEqual(this.date_of_birth, surrogate.date_of_birth) && Intrinsics.areEqual(this.email, surrogate.email) && Intrinsics.areEqual(this.phone_number, surrogate.phone_number) && Intrinsics.areEqual(this.citizenship, surrogate.citizenship) && Intrinsics.areEqual(this.marital_status, surrogate.marital_status) && Intrinsics.areEqual(this.ssn, surrogate.ssn) && Intrinsics.areEqual(this.employment_status, surrogate.employment_status) && Intrinsics.areEqual(this.employer, surrogate.employer) && Intrinsics.areEqual(this.occupation, surrogate.occupation) && Intrinsics.areEqual(this.industry, surrogate.industry) && Intrinsics.areEqual(this.address, surrogate.address) && Intrinsics.areEqual(this.line1, surrogate.line1) && Intrinsics.areEqual(this.line2, surrogate.line2) && Intrinsics.areEqual(this.locality, surrogate.locality) && Intrinsics.areEqual(this.region, surrogate.region) && Intrinsics.areEqual(this.postal_code, surrogate.postal_code) && Intrinsics.areEqual(this.country, surrogate.country) && Intrinsics.areEqual(this.investor_profile_info, surrogate.investor_profile_info) && Intrinsics.areEqual(this.approved_at, surrogate.approved_at) && Intrinsics.areEqual(this.approved_by, surrogate.approved_by);
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((((((((((((this.first_name.hashCode() * 31) + this.last_name.hashCode()) * 31) + this.date_of_birth.hashCode()) * 31) + this.email.hashCode()) * 31) + this.phone_number.hashCode()) * 31) + this.citizenship.hashCode()) * 31) + this.marital_status.hashCode()) * 31) + this.ssn.hashCode()) * 31) + this.employment_status.hashCode()) * 31) + this.employer.hashCode()) * 31) + this.occupation.hashCode()) * 31) + this.industry.hashCode()) * 31) + this.address.hashCode()) * 31) + this.line1.hashCode()) * 31) + this.line2.hashCode()) * 31) + this.locality.hashCode()) * 31) + this.region.hashCode()) * 31) + this.postal_code.hashCode()) * 31) + this.country.hashCode()) * 31) + this.investor_profile_info.hashCode()) * 31) + this.approved_at.hashCode()) * 31) + this.approved_by.hashCode();
        }

        public String toString() {
            return "Surrogate(first_name=" + this.first_name + ", last_name=" + this.last_name + ", date_of_birth=" + this.date_of_birth + ", email=" + this.email + ", phone_number=" + this.phone_number + ", citizenship=" + this.citizenship + ", marital_status=" + this.marital_status + ", ssn=" + this.ssn + ", employment_status=" + this.employment_status + ", employer=" + this.employer + ", occupation=" + this.occupation + ", industry=" + this.industry + ", address=" + this.address + ", line1=" + this.line1 + ", line2=" + this.line2 + ", locality=" + this.locality + ", region=" + this.region + ", postal_code=" + this.postal_code + ", country=" + this.country + ", investor_profile_info=" + this.investor_profile_info + ", approved_at=" + this.approved_at + ", approved_by=" + this.approved_by + ")";
        }

        /* compiled from: FuturesAccountOnboardingInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesAccountOnboardingInfoDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/FuturesAccountOnboardingInfoDto$Surrogate;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return FuturesAccountOnboardingInfoDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, Map map, String str20, String str21, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.first_name = "";
            } else {
                this.first_name = str;
            }
            if ((i & 2) == 0) {
                this.last_name = "";
            } else {
                this.last_name = str2;
            }
            if ((i & 4) == 0) {
                this.date_of_birth = "";
            } else {
                this.date_of_birth = str3;
            }
            if ((i & 8) == 0) {
                this.email = "";
            } else {
                this.email = str4;
            }
            if ((i & 16) == 0) {
                this.phone_number = "";
            } else {
                this.phone_number = str5;
            }
            if ((i & 32) == 0) {
                this.citizenship = "";
            } else {
                this.citizenship = str6;
            }
            if ((i & 64) == 0) {
                this.marital_status = "";
            } else {
                this.marital_status = str7;
            }
            if ((i & 128) == 0) {
                this.ssn = "";
            } else {
                this.ssn = str8;
            }
            if ((i & 256) == 0) {
                this.employment_status = "";
            } else {
                this.employment_status = str9;
            }
            if ((i & 512) == 0) {
                this.employer = "";
            } else {
                this.employer = str10;
            }
            if ((i & 1024) == 0) {
                this.occupation = "";
            } else {
                this.occupation = str11;
            }
            if ((i & 2048) == 0) {
                this.industry = "";
            } else {
                this.industry = str12;
            }
            if ((i & 4096) == 0) {
                this.address = "";
            } else {
                this.address = str13;
            }
            if ((i & 8192) == 0) {
                this.line1 = "";
            } else {
                this.line1 = str14;
            }
            if ((i & 16384) == 0) {
                this.line2 = "";
            } else {
                this.line2 = str15;
            }
            if ((32768 & i) == 0) {
                this.locality = "";
            } else {
                this.locality = str16;
            }
            if ((65536 & i) == 0) {
                this.region = "";
            } else {
                this.region = str17;
            }
            if ((131072 & i) == 0) {
                this.postal_code = "";
            } else {
                this.postal_code = str18;
            }
            if ((262144 & i) == 0) {
                this.country = "";
            } else {
                this.country = str19;
            }
            this.investor_profile_info = (524288 & i) == 0 ? MapsKt.emptyMap() : map;
            if ((1048576 & i) == 0) {
                this.approved_at = "";
            } else {
                this.approved_at = str20;
            }
            if ((i & 2097152) == 0) {
                this.approved_by = "";
            } else {
                this.approved_by = str21;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$ceres_entity_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.first_name, "")) {
                output.encodeStringElement(serialDesc, 0, self.first_name);
            }
            if (!Intrinsics.areEqual(self.last_name, "")) {
                output.encodeStringElement(serialDesc, 1, self.last_name);
            }
            if (!Intrinsics.areEqual(self.date_of_birth, "")) {
                output.encodeStringElement(serialDesc, 2, self.date_of_birth);
            }
            if (!Intrinsics.areEqual(self.email, "")) {
                output.encodeStringElement(serialDesc, 3, self.email);
            }
            if (!Intrinsics.areEqual(self.phone_number, "")) {
                output.encodeStringElement(serialDesc, 4, self.phone_number);
            }
            if (!Intrinsics.areEqual(self.citizenship, "")) {
                output.encodeStringElement(serialDesc, 5, self.citizenship);
            }
            if (!Intrinsics.areEqual(self.marital_status, "")) {
                output.encodeStringElement(serialDesc, 6, self.marital_status);
            }
            if (!Intrinsics.areEqual(self.ssn, "")) {
                output.encodeStringElement(serialDesc, 7, self.ssn);
            }
            if (!Intrinsics.areEqual(self.employment_status, "")) {
                output.encodeStringElement(serialDesc, 8, self.employment_status);
            }
            if (!Intrinsics.areEqual(self.employer, "")) {
                output.encodeStringElement(serialDesc, 9, self.employer);
            }
            if (!Intrinsics.areEqual(self.occupation, "")) {
                output.encodeStringElement(serialDesc, 10, self.occupation);
            }
            if (!Intrinsics.areEqual(self.industry, "")) {
                output.encodeStringElement(serialDesc, 11, self.industry);
            }
            if (!Intrinsics.areEqual(self.address, "")) {
                output.encodeStringElement(serialDesc, 12, self.address);
            }
            if (!Intrinsics.areEqual(self.line1, "")) {
                output.encodeStringElement(serialDesc, 13, self.line1);
            }
            if (!Intrinsics.areEqual(self.line2, "")) {
                output.encodeStringElement(serialDesc, 14, self.line2);
            }
            if (!Intrinsics.areEqual(self.locality, "")) {
                output.encodeStringElement(serialDesc, 15, self.locality);
            }
            if (!Intrinsics.areEqual(self.region, "")) {
                output.encodeStringElement(serialDesc, 16, self.region);
            }
            if (!Intrinsics.areEqual(self.postal_code, "")) {
                output.encodeStringElement(serialDesc, 17, self.postal_code);
            }
            if (!Intrinsics.areEqual(self.country, "")) {
                output.encodeStringElement(serialDesc, 18, self.country);
            }
            if (!Intrinsics.areEqual(self.investor_profile_info, MapsKt.emptyMap())) {
                output.encodeSerializableElement(serialDesc, 19, lazyArr[19].getValue(), self.investor_profile_info);
            }
            if (!Intrinsics.areEqual(self.approved_at, "")) {
                output.encodeStringElement(serialDesc, 20, self.approved_at);
            }
            if (Intrinsics.areEqual(self.approved_by, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 21, self.approved_by);
        }

        public Surrogate(String first_name, String last_name, String date_of_birth, String email, String phone_number, String citizenship, String marital_status, String ssn, String employment_status, String employer, String occupation, String industry, String address, String line1, String line2, String locality, String region, String postal_code, String country, Map<String, String> investor_profile_info, String approved_at, String approved_by) {
            Intrinsics.checkNotNullParameter(first_name, "first_name");
            Intrinsics.checkNotNullParameter(last_name, "last_name");
            Intrinsics.checkNotNullParameter(date_of_birth, "date_of_birth");
            Intrinsics.checkNotNullParameter(email, "email");
            Intrinsics.checkNotNullParameter(phone_number, "phone_number");
            Intrinsics.checkNotNullParameter(citizenship, "citizenship");
            Intrinsics.checkNotNullParameter(marital_status, "marital_status");
            Intrinsics.checkNotNullParameter(ssn, "ssn");
            Intrinsics.checkNotNullParameter(employment_status, "employment_status");
            Intrinsics.checkNotNullParameter(employer, "employer");
            Intrinsics.checkNotNullParameter(occupation, "occupation");
            Intrinsics.checkNotNullParameter(industry, "industry");
            Intrinsics.checkNotNullParameter(address, "address");
            Intrinsics.checkNotNullParameter(line1, "line1");
            Intrinsics.checkNotNullParameter(line2, "line2");
            Intrinsics.checkNotNullParameter(locality, "locality");
            Intrinsics.checkNotNullParameter(region, "region");
            Intrinsics.checkNotNullParameter(postal_code, "postal_code");
            Intrinsics.checkNotNullParameter(country, "country");
            Intrinsics.checkNotNullParameter(investor_profile_info, "investor_profile_info");
            Intrinsics.checkNotNullParameter(approved_at, "approved_at");
            Intrinsics.checkNotNullParameter(approved_by, "approved_by");
            this.first_name = first_name;
            this.last_name = last_name;
            this.date_of_birth = date_of_birth;
            this.email = email;
            this.phone_number = phone_number;
            this.citizenship = citizenship;
            this.marital_status = marital_status;
            this.ssn = ssn;
            this.employment_status = employment_status;
            this.employer = employer;
            this.occupation = occupation;
            this.industry = industry;
            this.address = address;
            this.line1 = line1;
            this.line2 = line2;
            this.locality = locality;
            this.region = region;
            this.postal_code = postal_code;
            this.country = country;
            this.investor_profile_info = investor_profile_info;
            this.approved_at = approved_at;
            this.approved_by = approved_by;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, Map map, String str20, String str21, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17, (i & 131072) != 0 ? "" : str18, (i & 262144) != 0 ? "" : str19, (i & 524288) != 0 ? MapsKt.emptyMap() : map, (i & 1048576) != 0 ? "" : str20, (i & 2097152) != 0 ? "" : str21);
        }

        public final String getFirst_name() {
            return this.first_name;
        }

        public final String getLast_name() {
            return this.last_name;
        }

        public final String getDate_of_birth() {
            return this.date_of_birth;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getPhone_number() {
            return this.phone_number;
        }

        public final String getCitizenship() {
            return this.citizenship;
        }

        public final String getMarital_status() {
            return this.marital_status;
        }

        public final String getSsn() {
            return this.ssn;
        }

        public final String getEmployment_status() {
            return this.employment_status;
        }

        public final String getEmployer() {
            return this.employer;
        }

        public final String getOccupation() {
            return this.occupation;
        }

        public final String getIndustry() {
            return this.industry;
        }

        public final String getAddress() {
            return this.address;
        }

        public final String getLine1() {
            return this.line1;
        }

        public final String getLine2() {
            return this.line2;
        }

        public final String getLocality() {
            return this.locality;
        }

        public final String getRegion() {
            return this.region;
        }

        public final String getPostal_code() {
            return this.postal_code;
        }

        public final String getCountry() {
            return this.country;
        }

        public final Map<String, String> getInvestor_profile_info() {
            return this.investor_profile_info;
        }

        public final String getApproved_at() {
            return this.approved_at;
        }

        public final String getApproved_by() {
            return this.approved_by;
        }
    }

    /* compiled from: FuturesAccountOnboardingInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesAccountOnboardingInfoDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/ceres/v1/FuturesAccountOnboardingInfoDto;", "Lcom/robinhood/ceres/v1/FuturesAccountOnboardingInfo;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/FuturesAccountOnboardingInfoDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<FuturesAccountOnboardingInfoDto, FuturesAccountOnboardingInfo> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FuturesAccountOnboardingInfoDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FuturesAccountOnboardingInfoDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FuturesAccountOnboardingInfoDto> getBinaryBase64Serializer() {
            return (KSerializer) FuturesAccountOnboardingInfoDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<FuturesAccountOnboardingInfo> getProtoAdapter() {
            return FuturesAccountOnboardingInfo.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FuturesAccountOnboardingInfoDto getZeroValue() {
            return FuturesAccountOnboardingInfoDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FuturesAccountOnboardingInfoDto fromProto(FuturesAccountOnboardingInfo proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String first_name = proto.getFirst_name();
            String last_name = proto.getLast_name();
            String date_of_birth = proto.getDate_of_birth();
            String email = proto.getEmail();
            String phone_number = proto.getPhone_number();
            String citizenship = proto.getCitizenship();
            String marital_status = proto.getMarital_status();
            String ssn = proto.getSsn();
            String employment_status = proto.getEmployment_status();
            String employer = proto.getEmployer();
            String occupation = proto.getOccupation();
            String industry = proto.getIndustry();
            String address = proto.getAddress();
            String line1 = proto.getLine1();
            String line2 = proto.getLine2();
            String locality = proto.getLocality();
            String region = proto.getRegion();
            String postal_code = proto.getPostal_code();
            String country = proto.getCountry();
            Set<Map.Entry<String, String>> setEntrySet = proto.getInvestor_profile_info().entrySet();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
            Iterator it = setEntrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Iterator it2 = it;
                Tuples2 tuples2M3642to = Tuples4.m3642to((String) entry.getKey(), (String) entry.getValue());
                linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
                first_name = first_name;
                it = it2;
            }
            return new FuturesAccountOnboardingInfoDto(new Surrogate(first_name, last_name, date_of_birth, email, phone_number, citizenship, marital_status, ssn, employment_status, employer, occupation, industry, address, line1, line2, locality, region, postal_code, country, linkedHashMap, proto.getApproved_at(), proto.getApproved_by()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.FuturesAccountOnboardingInfoDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesAccountOnboardingInfoDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new FuturesAccountOnboardingInfoDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194303, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: FuturesAccountOnboardingInfoDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesAccountOnboardingInfoDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/FuturesAccountOnboardingInfoDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/ceres/v1/FuturesAccountOnboardingInfoDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<FuturesAccountOnboardingInfoDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ceres.entity.FuturesAccountOnboardingInfo", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FuturesAccountOnboardingInfoDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public FuturesAccountOnboardingInfoDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new FuturesAccountOnboardingInfoDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: FuturesAccountOnboardingInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesAccountOnboardingInfoDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "com.robinhood.ceres.v1.FuturesAccountOnboardingInfoDto";
        }
    }
}
