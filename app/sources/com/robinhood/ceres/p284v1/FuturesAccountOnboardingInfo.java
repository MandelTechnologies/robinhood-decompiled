package com.robinhood.ceres.p284v1;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.odyssey.lib.Constants4;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.GovernmentIdNfcScan;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* compiled from: FuturesAccountOnboardingInfo.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 @2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001@Bù\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u00107\u001a\u00020\u0002H\u0017J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;H\u0096\u0002J\b\u0010<\u001a\u00020=H\u0016J\b\u0010>\u001a\u00020\u0004H\u0016Jø\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00042\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u001cR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010 R\u0016\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0016\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010 R\u0016\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u0016\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010 R\u0016\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010 R\u0016\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0016\u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010 R\u0016\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010 R\u0016\u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010 R\u0016\u0010\u0015\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010 R\u0016\u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010 R\u0016\u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010 R\u0016\u0010\u001a\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010 R\"\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106¨\u0006A"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesAccountOnboardingInfo;", "Lcom/squareup/wire/Message;", "", "first_name", "", "last_name", GovernmentIdNfcScan.dateOfBirthName, "email", Constants4.ENTITY_FIELD_PHONE_NUMBER, "citizenship", "marital_status", "ssn", "employment_status", "employer", "occupation", "industry", PlaceTypes.ADDRESS, "line1", "line2", "locality", "region", PlaceTypes.POSTAL_CODE, PlaceTypes.COUNTRY, "investor_profile_info", "", "approved_at", "approved_by", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getFirst_name", "()Ljava/lang/String;", "getLast_name", "getDate_of_birth", "getEmail", "getPhone_number", "getCitizenship", "getMarital_status", "getSsn", "getEmployment_status", "getEmployer", "getOccupation", "getIndustry", "getAddress", "getLine1", "getLine2", "getLocality", "getRegion", "getPostal_code", "getCountry", "getApproved_at", "getApproved_by", "getInvestor_profile_info", "()Ljava/util/Map;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class FuturesAccountOnboardingInfo extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final String address;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "approvedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 20, tag = 21)
    private final String approved_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "approvedBy", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 21, tag = 22)
    private final String approved_by;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String citizenship;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 18, tag = 19)
    private final String country;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "dateOfBirth", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String date_of_birth;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String email;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final String employer;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "employmentStatus", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String employment_status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "firstName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String first_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final String industry;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "investorProfileInfo", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 19, tag = 20)
    private final Map<String, String> investor_profile_info;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lastName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String last_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final String line1;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 15)
    private final String line2;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 16)
    private final String locality;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maritalStatus", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String marital_status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final String occupation;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "phoneNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String phone_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "postalCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 18)
    private final String postal_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 17)
    private final String region;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String ssn;

    @JvmField
    public static final ProtoAdapter<FuturesAccountOnboardingInfo> ADAPTER = new FuturesAccountOnboardingInfo2(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(FuturesAccountOnboardingInfo.class), Syntax.PROTO_3);

    public FuturesAccountOnboardingInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388607, null);
    }

    public /* synthetic */ FuturesAccountOnboardingInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, Map map, String str20, String str21, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17, (i & 131072) != 0 ? "" : str18, (i & 262144) != 0 ? "" : str19, (i & 524288) != 0 ? MapsKt.emptyMap() : map, (i & 1048576) != 0 ? "" : str20, (i & 2097152) == 0 ? str21 : "", (i & 4194304) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20314newBuilder();
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

    public final String getApproved_at() {
        return this.approved_at;
    }

    public final String getApproved_by() {
        return this.approved_by;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesAccountOnboardingInfo(String first_name, String last_name, String date_of_birth, String email, String phone_number, String citizenship, String marital_status, String ssn, String employment_status, String employer, String occupation, String industry, String address, String line1, String line2, String locality, String region, String postal_code, String country, Map<String, String> investor_profile_info, String approved_at, String approved_by, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
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
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
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
        this.approved_at = approved_at;
        this.approved_by = approved_by;
        this.investor_profile_info = Internal.immutableCopyOf("investor_profile_info", investor_profile_info);
    }

    public final Map<String, String> getInvestor_profile_info() {
        return this.investor_profile_info;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20314newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FuturesAccountOnboardingInfo)) {
            return false;
        }
        FuturesAccountOnboardingInfo futuresAccountOnboardingInfo = (FuturesAccountOnboardingInfo) other;
        return Intrinsics.areEqual(unknownFields(), futuresAccountOnboardingInfo.unknownFields()) && Intrinsics.areEqual(this.first_name, futuresAccountOnboardingInfo.first_name) && Intrinsics.areEqual(this.last_name, futuresAccountOnboardingInfo.last_name) && Intrinsics.areEqual(this.date_of_birth, futuresAccountOnboardingInfo.date_of_birth) && Intrinsics.areEqual(this.email, futuresAccountOnboardingInfo.email) && Intrinsics.areEqual(this.phone_number, futuresAccountOnboardingInfo.phone_number) && Intrinsics.areEqual(this.citizenship, futuresAccountOnboardingInfo.citizenship) && Intrinsics.areEqual(this.marital_status, futuresAccountOnboardingInfo.marital_status) && Intrinsics.areEqual(this.ssn, futuresAccountOnboardingInfo.ssn) && Intrinsics.areEqual(this.employment_status, futuresAccountOnboardingInfo.employment_status) && Intrinsics.areEqual(this.employer, futuresAccountOnboardingInfo.employer) && Intrinsics.areEqual(this.occupation, futuresAccountOnboardingInfo.occupation) && Intrinsics.areEqual(this.industry, futuresAccountOnboardingInfo.industry) && Intrinsics.areEqual(this.address, futuresAccountOnboardingInfo.address) && Intrinsics.areEqual(this.line1, futuresAccountOnboardingInfo.line1) && Intrinsics.areEqual(this.line2, futuresAccountOnboardingInfo.line2) && Intrinsics.areEqual(this.locality, futuresAccountOnboardingInfo.locality) && Intrinsics.areEqual(this.region, futuresAccountOnboardingInfo.region) && Intrinsics.areEqual(this.postal_code, futuresAccountOnboardingInfo.postal_code) && Intrinsics.areEqual(this.country, futuresAccountOnboardingInfo.country) && Intrinsics.areEqual(this.investor_profile_info, futuresAccountOnboardingInfo.investor_profile_info) && Intrinsics.areEqual(this.approved_at, futuresAccountOnboardingInfo.approved_at) && Intrinsics.areEqual(this.approved_by, futuresAccountOnboardingInfo.approved_by);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((((((((((((((((((((((((((((((((unknownFields().hashCode() * 37) + this.first_name.hashCode()) * 37) + this.last_name.hashCode()) * 37) + this.date_of_birth.hashCode()) * 37) + this.email.hashCode()) * 37) + this.phone_number.hashCode()) * 37) + this.citizenship.hashCode()) * 37) + this.marital_status.hashCode()) * 37) + this.ssn.hashCode()) * 37) + this.employment_status.hashCode()) * 37) + this.employer.hashCode()) * 37) + this.occupation.hashCode()) * 37) + this.industry.hashCode()) * 37) + this.address.hashCode()) * 37) + this.line1.hashCode()) * 37) + this.line2.hashCode()) * 37) + this.locality.hashCode()) * 37) + this.region.hashCode()) * 37) + this.postal_code.hashCode()) * 37) + this.country.hashCode()) * 37) + this.investor_profile_info.hashCode()) * 37) + this.approved_at.hashCode()) * 37) + this.approved_by.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("first_name=" + Internal.sanitize(this.first_name));
        arrayList.add("last_name=" + Internal.sanitize(this.last_name));
        arrayList.add("date_of_birth=" + Internal.sanitize(this.date_of_birth));
        arrayList.add("email=" + Internal.sanitize(this.email));
        arrayList.add("phone_number=" + Internal.sanitize(this.phone_number));
        arrayList.add("citizenship=" + Internal.sanitize(this.citizenship));
        arrayList.add("marital_status=" + Internal.sanitize(this.marital_status));
        arrayList.add("ssn=" + Internal.sanitize(this.ssn));
        arrayList.add("employment_status=" + Internal.sanitize(this.employment_status));
        arrayList.add("employer=" + Internal.sanitize(this.employer));
        arrayList.add("occupation=" + Internal.sanitize(this.occupation));
        arrayList.add("industry=" + Internal.sanitize(this.industry));
        arrayList.add("address=" + Internal.sanitize(this.address));
        arrayList.add("line1=" + Internal.sanitize(this.line1));
        arrayList.add("line2=" + Internal.sanitize(this.line2));
        arrayList.add("locality=" + Internal.sanitize(this.locality));
        arrayList.add("region=" + Internal.sanitize(this.region));
        arrayList.add("postal_code=" + Internal.sanitize(this.postal_code));
        arrayList.add("country=" + Internal.sanitize(this.country));
        if (!this.investor_profile_info.isEmpty()) {
            arrayList.add("investor_profile_info=" + this.investor_profile_info);
        }
        arrayList.add("approved_at=" + Internal.sanitize(this.approved_at));
        arrayList.add("approved_by=" + Internal.sanitize(this.approved_by));
        return CollectionsKt.joinToString$default(arrayList, ", ", "FuturesAccountOnboardingInfo{", "}", 0, null, null, 56, null);
    }

    public final FuturesAccountOnboardingInfo copy(String first_name, String last_name, String date_of_birth, String email, String phone_number, String citizenship, String marital_status, String ssn, String employment_status, String employer, String occupation, String industry, String address, String line1, String line2, String locality, String region, String postal_code, String country, Map<String, String> investor_profile_info, String approved_at, String approved_by, ByteString unknownFields) {
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
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FuturesAccountOnboardingInfo(first_name, last_name, date_of_birth, email, phone_number, citizenship, marital_status, ssn, employment_status, employer, occupation, industry, address, line1, line2, locality, region, postal_code, country, investor_profile_info, approved_at, approved_by, unknownFields);
    }
}
