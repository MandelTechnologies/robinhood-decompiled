package com.withpersona.sdk2.inquiry.p424ui.network;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AddressDetailsResponse.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006\u0016"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/LocationData;", "", "id", "", "addressStreet1", "addressStreet2", "addressCity", "addressSubdivision", "addressPostalCode", "addressCountryCode", "addressBusinessName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getAddressStreet1", "getAddressStreet2", "getAddressCity", "getAddressSubdivision", "getAddressPostalCode", "getAddressCountryCode", "getAddressBusinessName", "ui_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.ui.network.LocationData, reason: use source file name */
/* loaded from: classes18.dex */
public final class AddressDetailsResponse2 {

    @Json(name = "address_business_name")
    private final String addressBusinessName;

    @Json(name = "address_city")
    private final String addressCity;

    @Json(name = "address_country_code")
    private final String addressCountryCode;

    @Json(name = "address_postal_code")
    private final String addressPostalCode;

    @Json(name = "address_street_1")
    private final String addressStreet1;

    @Json(name = "address_street_2")
    private final String addressStreet2;

    @Json(name = "address_subdivision")
    private final String addressSubdivision;
    private final String id;

    public AddressDetailsResponse2(String id, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
        this.addressStreet1 = str;
        this.addressStreet2 = str2;
        this.addressCity = str3;
        this.addressSubdivision = str4;
        this.addressPostalCode = str5;
        this.addressCountryCode = str6;
        this.addressBusinessName = str7;
    }

    public /* synthetic */ AddressDetailsResponse2(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8);
    }

    public final String getId() {
        return this.id;
    }

    public final String getAddressStreet1() {
        return this.addressStreet1;
    }

    public final String getAddressStreet2() {
        return this.addressStreet2;
    }

    public final String getAddressCity() {
        return this.addressCity;
    }

    public final String getAddressSubdivision() {
        return this.addressSubdivision;
    }

    public final String getAddressPostalCode() {
        return this.addressPostalCode;
    }

    public final String getAddressCountryCode() {
        return this.addressCountryCode;
    }

    public final String getAddressBusinessName() {
        return this.addressBusinessName;
    }
}
