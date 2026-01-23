package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.FloatAsNumberSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: GeoIPDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b)\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 J2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004IJKLB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007Bå\u0001\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\t\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\b\b\u0002\u0010\u0018\u001a\u00020\t\u0012\b\b\u0002\u0010\u0019\u001a\u00020\t\u0012\b\b\u0002\u0010\u001a\u001a\u00020\t\u0012\b\b\u0002\u0010\u001b\u001a\u00020\t\u0012\b\b\u0002\u0010\u001c\u001a\u00020\t\u0012\b\b\u0002\u0010\u001d\u001a\u00020\t\u0012\b\b\u0002\u0010\u001e\u001a\u00020\t\u0012\b\b\u0002\u0010\u001f\u001a\u00020\t\u0012\b\b\u0002\u0010 \u001a\u00020\t¢\u0006\u0004\b\u0006\u0010!Jâ\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u001e\u001a\u00020\t2\b\b\u0002\u0010\u001f\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020\tJ\b\u0010<\u001a\u00020\u0002H\u0016J\b\u0010=\u001a\u00020\tH\u0016J\u0013\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010AH\u0096\u0002J\b\u0010B\u001a\u00020\u0015H\u0016J\u0018\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\u0015H\u0016J\b\u0010H\u001a\u00020\u0015H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b$\u0010#R\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b%\u0010#R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b&\u0010#R\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b'\u0010#R\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b(\u0010#R\u0011\u0010\u000f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b)\u0010#R\u0011\u0010\u0010\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b*\u0010#R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010\u0013\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b-\u0010,R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u0010\u0016\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b0\u0010#R\u0011\u0010\u0017\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b1\u0010#R\u0011\u0010\u0018\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b2\u0010#R\u0011\u0010\u0019\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b3\u0010#R\u0011\u0010\u001a\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b4\u0010#R\u0011\u0010\u001b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b5\u0010#R\u0011\u0010\u001c\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b6\u0010#R\u0011\u0010\u001d\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b7\u0010#R\u0011\u0010\u001e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b8\u0010#R\u0011\u0010\u001f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b9\u0010#R\u0011\u0010 \u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b:\u0010#¨\u0006M"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/GeoIPDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/GeoIP;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/GeoIPDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/GeoIPDto$Surrogate;)V", "ip", "", "country_code2", "country_code3", "country_name", "continent_code", "region_name", "city_name", PlaceTypes.POSTAL_CODE, "latitude", "", "longitude", "dma_code", "", "timezone", "location", "coordinates", "masked_ip", "masked_city_name", "masked_postal_code", "masked_latitude", "masked_longitude", "masked_dma_code", "masked_location", "masked_coordinates", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIp", "()Ljava/lang/String;", "getCountry_code2", "getCountry_code3", "getCountry_name", "getContinent_code", "getRegion_name", "getCity_name", "getPostal_code", "getLatitude", "()F", "getLongitude", "getDma_code", "()I", "getTimezone", "getLocation", "getCoordinates", "getMasked_ip", "getMasked_city_name", "getMasked_postal_code", "getMasked_latitude", "getMasked_longitude", "getMasked_dma_code", "getMasked_location", "getMasked_coordinates", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class GeoIPDto implements Dto3<GeoIP>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GeoIPDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GeoIPDto, GeoIP>> binaryBase64Serializer$delegate;
    private static final GeoIPDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GeoIPDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GeoIPDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getIp() {
        return this.surrogate.getIp();
    }

    public final String getCountry_code2() {
        return this.surrogate.getCountry_code2();
    }

    public final String getCountry_code3() {
        return this.surrogate.getCountry_code3();
    }

    public final String getCountry_name() {
        return this.surrogate.getCountry_name();
    }

    public final String getContinent_code() {
        return this.surrogate.getContinent_code();
    }

    public final String getRegion_name() {
        return this.surrogate.getRegion_name();
    }

    public final String getCity_name() {
        return this.surrogate.getCity_name();
    }

    public final String getPostal_code() {
        return this.surrogate.getPostal_code();
    }

    public final float getLatitude() {
        return this.surrogate.getLatitude();
    }

    public final float getLongitude() {
        return this.surrogate.getLongitude();
    }

    public final int getDma_code() {
        return this.surrogate.getDma_code();
    }

    public final String getTimezone() {
        return this.surrogate.getTimezone();
    }

    public final String getLocation() {
        return this.surrogate.getLocation();
    }

    public final String getCoordinates() {
        return this.surrogate.getCoordinates();
    }

    public final String getMasked_ip() {
        return this.surrogate.getMasked_ip();
    }

    public final String getMasked_city_name() {
        return this.surrogate.getMasked_city_name();
    }

    public final String getMasked_postal_code() {
        return this.surrogate.getMasked_postal_code();
    }

    public final String getMasked_latitude() {
        return this.surrogate.getMasked_latitude();
    }

    public final String getMasked_longitude() {
        return this.surrogate.getMasked_longitude();
    }

    public final String getMasked_dma_code() {
        return this.surrogate.getMasked_dma_code();
    }

    public final String getMasked_location() {
        return this.surrogate.getMasked_location();
    }

    public final String getMasked_coordinates() {
        return this.surrogate.getMasked_coordinates();
    }

    public /* synthetic */ GeoIPDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, float f, float f2, int i, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? "" : str7, (i2 & 128) != 0 ? "" : str8, (i2 & 256) != 0 ? 0.0f : f, (i2 & 512) == 0 ? f2 : 0.0f, (i2 & 1024) != 0 ? 0 : i, (i2 & 2048) != 0 ? "" : str9, (i2 & 4096) != 0 ? "" : str10, (i2 & 8192) != 0 ? "" : str11, (i2 & 16384) != 0 ? "" : str12, (i2 & 32768) != 0 ? "" : str13, (i2 & 65536) != 0 ? "" : str14, (i2 & 131072) != 0 ? "" : str15, (i2 & 262144) != 0 ? "" : str16, (i2 & 524288) != 0 ? "" : str17, (i2 & 1048576) != 0 ? "" : str18, (i2 & 2097152) != 0 ? "" : str19);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GeoIPDto(String ip, String country_code2, String country_code3, String country_name, String continent_code, String region_name, String city_name, String postal_code, float f, float f2, int i, String timezone, String location, String coordinates, String masked_ip, String masked_city_name, String masked_postal_code, String masked_latitude, String masked_longitude, String masked_dma_code, String masked_location, String masked_coordinates) {
        this(new Surrogate(ip, country_code2, country_code3, country_name, continent_code, region_name, city_name, postal_code, f, f2, i, timezone, location, coordinates, masked_ip, masked_city_name, masked_postal_code, masked_latitude, masked_longitude, masked_dma_code, masked_location, masked_coordinates));
        Intrinsics.checkNotNullParameter(ip, "ip");
        Intrinsics.checkNotNullParameter(country_code2, "country_code2");
        Intrinsics.checkNotNullParameter(country_code3, "country_code3");
        Intrinsics.checkNotNullParameter(country_name, "country_name");
        Intrinsics.checkNotNullParameter(continent_code, "continent_code");
        Intrinsics.checkNotNullParameter(region_name, "region_name");
        Intrinsics.checkNotNullParameter(city_name, "city_name");
        Intrinsics.checkNotNullParameter(postal_code, "postal_code");
        Intrinsics.checkNotNullParameter(timezone, "timezone");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        Intrinsics.checkNotNullParameter(masked_ip, "masked_ip");
        Intrinsics.checkNotNullParameter(masked_city_name, "masked_city_name");
        Intrinsics.checkNotNullParameter(masked_postal_code, "masked_postal_code");
        Intrinsics.checkNotNullParameter(masked_latitude, "masked_latitude");
        Intrinsics.checkNotNullParameter(masked_longitude, "masked_longitude");
        Intrinsics.checkNotNullParameter(masked_dma_code, "masked_dma_code");
        Intrinsics.checkNotNullParameter(masked_location, "masked_location");
        Intrinsics.checkNotNullParameter(masked_coordinates, "masked_coordinates");
    }

    public static /* synthetic */ GeoIPDto copy$default(GeoIPDto geoIPDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, float f, float f2, int i, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, int i2, Object obj) {
        String masked_coordinates;
        String str20;
        String ip = (i2 & 1) != 0 ? geoIPDto.surrogate.getIp() : str;
        String country_code2 = (i2 & 2) != 0 ? geoIPDto.surrogate.getCountry_code2() : str2;
        String country_code3 = (i2 & 4) != 0 ? geoIPDto.surrogate.getCountry_code3() : str3;
        String country_name = (i2 & 8) != 0 ? geoIPDto.surrogate.getCountry_name() : str4;
        String continent_code = (i2 & 16) != 0 ? geoIPDto.surrogate.getContinent_code() : str5;
        String region_name = (i2 & 32) != 0 ? geoIPDto.surrogate.getRegion_name() : str6;
        String city_name = (i2 & 64) != 0 ? geoIPDto.surrogate.getCity_name() : str7;
        String postal_code = (i2 & 128) != 0 ? geoIPDto.surrogate.getPostal_code() : str8;
        float latitude = (i2 & 256) != 0 ? geoIPDto.surrogate.getLatitude() : f;
        float longitude = (i2 & 512) != 0 ? geoIPDto.surrogate.getLongitude() : f2;
        int dma_code = (i2 & 1024) != 0 ? geoIPDto.surrogate.getDma_code() : i;
        String timezone = (i2 & 2048) != 0 ? geoIPDto.surrogate.getTimezone() : str9;
        String location = (i2 & 4096) != 0 ? geoIPDto.surrogate.getLocation() : str10;
        String coordinates = (i2 & 8192) != 0 ? geoIPDto.surrogate.getCoordinates() : str11;
        String str21 = ip;
        String masked_ip = (i2 & 16384) != 0 ? geoIPDto.surrogate.getMasked_ip() : str12;
        String masked_city_name = (i2 & 32768) != 0 ? geoIPDto.surrogate.getMasked_city_name() : str13;
        String masked_postal_code = (i2 & 65536) != 0 ? geoIPDto.surrogate.getMasked_postal_code() : str14;
        String masked_latitude = (i2 & 131072) != 0 ? geoIPDto.surrogate.getMasked_latitude() : str15;
        String masked_longitude = (i2 & 262144) != 0 ? geoIPDto.surrogate.getMasked_longitude() : str16;
        String masked_dma_code = (i2 & 524288) != 0 ? geoIPDto.surrogate.getMasked_dma_code() : str17;
        String masked_location = (i2 & 1048576) != 0 ? geoIPDto.surrogate.getMasked_location() : str18;
        if ((i2 & 2097152) != 0) {
            str20 = masked_location;
            masked_coordinates = geoIPDto.surrogate.getMasked_coordinates();
        } else {
            masked_coordinates = str19;
            str20 = masked_location;
        }
        return geoIPDto.copy(str21, country_code2, country_code3, country_name, continent_code, region_name, city_name, postal_code, latitude, longitude, dma_code, timezone, location, coordinates, masked_ip, masked_city_name, masked_postal_code, masked_latitude, masked_longitude, masked_dma_code, str20, masked_coordinates);
    }

    public final GeoIPDto copy(String ip, String country_code2, String country_code3, String country_name, String continent_code, String region_name, String city_name, String postal_code, float latitude, float longitude, int dma_code, String timezone, String location, String coordinates, String masked_ip, String masked_city_name, String masked_postal_code, String masked_latitude, String masked_longitude, String masked_dma_code, String masked_location, String masked_coordinates) {
        Intrinsics.checkNotNullParameter(ip, "ip");
        Intrinsics.checkNotNullParameter(country_code2, "country_code2");
        Intrinsics.checkNotNullParameter(country_code3, "country_code3");
        Intrinsics.checkNotNullParameter(country_name, "country_name");
        Intrinsics.checkNotNullParameter(continent_code, "continent_code");
        Intrinsics.checkNotNullParameter(region_name, "region_name");
        Intrinsics.checkNotNullParameter(city_name, "city_name");
        Intrinsics.checkNotNullParameter(postal_code, "postal_code");
        Intrinsics.checkNotNullParameter(timezone, "timezone");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        Intrinsics.checkNotNullParameter(masked_ip, "masked_ip");
        Intrinsics.checkNotNullParameter(masked_city_name, "masked_city_name");
        Intrinsics.checkNotNullParameter(masked_postal_code, "masked_postal_code");
        Intrinsics.checkNotNullParameter(masked_latitude, "masked_latitude");
        Intrinsics.checkNotNullParameter(masked_longitude, "masked_longitude");
        Intrinsics.checkNotNullParameter(masked_dma_code, "masked_dma_code");
        Intrinsics.checkNotNullParameter(masked_location, "masked_location");
        Intrinsics.checkNotNullParameter(masked_coordinates, "masked_coordinates");
        return new GeoIPDto(new Surrogate(ip, country_code2, country_code3, country_name, continent_code, region_name, city_name, postal_code, latitude, longitude, dma_code, timezone, location, coordinates, masked_ip, masked_city_name, masked_postal_code, masked_latitude, masked_longitude, masked_dma_code, masked_location, masked_coordinates));
    }

    @Override // com.robinhood.idl.Dto
    public GeoIP toProto() {
        return new GeoIP(this.surrogate.getIp(), this.surrogate.getCountry_code2(), this.surrogate.getCountry_code3(), this.surrogate.getCountry_name(), this.surrogate.getContinent_code(), this.surrogate.getRegion_name(), this.surrogate.getCity_name(), this.surrogate.getPostal_code(), this.surrogate.getLatitude(), this.surrogate.getLongitude(), this.surrogate.getDma_code(), this.surrogate.getTimezone(), this.surrogate.getLocation(), this.surrogate.getCoordinates(), this.surrogate.getMasked_ip(), this.surrogate.getMasked_city_name(), this.surrogate.getMasked_postal_code(), this.surrogate.getMasked_latitude(), this.surrogate.getMasked_longitude(), this.surrogate.getMasked_dma_code(), this.surrogate.getMasked_location(), this.surrogate.getMasked_coordinates(), null, 4194304, null);
    }

    public String toString() {
        return "[GeoIPDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GeoIPDto) && Intrinsics.areEqual(((GeoIPDto) other).surrogate, this.surrogate);
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
    /* compiled from: GeoIPDto.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\bI\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 z2\u00020\u0001:\u0002yzB\u0090\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u000b\u001a\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f\u0012\u0017\b\u0002\u0010\u0010\u001a\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f\u0012\u0017\b\u0002\u0010\u0011\u001a\u00110\u0012¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0003¢\u0006\u0004\b\u001f\u0010 Bñ\u0001\b\u0010\u0012\u0006\u0010!\u001a\u00020\u0012\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001a\u0004\u0018\u00010#¢\u0006\u0004\b\u001f\u0010$J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\t\u0010[\u001a\u00020\u0003HÆ\u0003J\t\u0010\\\u001a\u00020\u0003HÆ\u0003J\u0018\u0010]\u001a\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000fHÆ\u0003J\u0018\u0010^\u001a\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000fHÆ\u0003J\u0018\u0010_\u001a\u00110\u0012¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u0013HÆ\u0003J\t\u0010`\u001a\u00020\u0003HÆ\u0003J\t\u0010a\u001a\u00020\u0003HÆ\u0003J\t\u0010b\u001a\u00020\u0003HÆ\u0003J\t\u0010c\u001a\u00020\u0003HÆ\u0003J\t\u0010d\u001a\u00020\u0003HÆ\u0003J\t\u0010e\u001a\u00020\u0003HÆ\u0003J\t\u0010f\u001a\u00020\u0003HÆ\u0003J\t\u0010g\u001a\u00020\u0003HÆ\u0003J\t\u0010h\u001a\u00020\u0003HÆ\u0003J\t\u0010i\u001a\u00020\u0003HÆ\u0003J\t\u0010j\u001a\u00020\u0003HÆ\u0003J\u0092\u0002\u0010k\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\u0017\b\u0002\u0010\u000b\u001a\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f2\u0017\b\u0002\u0010\u0010\u001a\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f2\u0017\b\u0002\u0010\u0011\u001a\u00110\u0012¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010l\u001a\u00020m2\b\u0010n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010o\u001a\u00020\u0012HÖ\u0001J\t\u0010p\u001a\u00020\u0003HÖ\u0001J%\u0010q\u001a\u00020r2\u0006\u0010s\u001a\u00020\u00002\u0006\u0010t\u001a\u00020u2\u0006\u0010v\u001a\u00020wH\u0001¢\u0006\u0002\bxR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b+\u0010&\u001a\u0004\b,\u0010(R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b-\u0010&\u001a\u0004\b.\u0010(R\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u0010&\u001a\u0004\b0\u0010(R\u001c\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b1\u0010&\u001a\u0004\b2\u0010(R\u001c\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b3\u0010&\u001a\u0004\b4\u0010(R\u001c\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b5\u0010&\u001a\u0004\b6\u0010(R+\u0010\u000b\u001a\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b7\u0010&\u001a\u0004\b8\u00109R+\u0010\u0010\u001a\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b:\u0010&\u001a\u0004\b;\u00109R+\u0010\u0011\u001a\u00110\u0012¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b<\u0010&\u001a\u0004\b=\u0010>R\u001c\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b?\u0010&\u001a\u0004\b@\u0010(R\u001c\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bA\u0010&\u001a\u0004\bB\u0010(R\u001c\u0010\u0016\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bC\u0010&\u001a\u0004\bD\u0010(R\u001c\u0010\u0017\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bE\u0010&\u001a\u0004\bF\u0010(R\u001c\u0010\u0018\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bG\u0010&\u001a\u0004\bH\u0010(R\u001c\u0010\u0019\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bI\u0010&\u001a\u0004\bJ\u0010(R\u001c\u0010\u001a\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bK\u0010&\u001a\u0004\bL\u0010(R\u001c\u0010\u001b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bM\u0010&\u001a\u0004\bN\u0010(R\u001c\u0010\u001c\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bO\u0010&\u001a\u0004\bP\u0010(R\u001c\u0010\u001d\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bQ\u0010&\u001a\u0004\bR\u0010(R\u001c\u0010\u001e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bS\u0010&\u001a\u0004\bT\u0010(¨\u0006{"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/GeoIPDto$Surrogate;", "", "ip", "", "country_code2", "country_code3", "country_name", "continent_code", "region_name", "city_name", PlaceTypes.POSTAL_CODE, "latitude", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/FloatSerializer;", "longitude", "dma_code", "", "Lcom/robinhood/idl/serialization/Int32Serializer;", "timezone", "location", "coordinates", "masked_ip", "masked_city_name", "masked_postal_code", "masked_latitude", "masked_longitude", "masked_dma_code", "masked_location", "masked_coordinates", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getIp$annotations", "()V", "getIp", "()Ljava/lang/String;", "getCountry_code2$annotations", "getCountry_code2", "getCountry_code3$annotations", "getCountry_code3", "getCountry_name$annotations", "getCountry_name", "getContinent_code$annotations", "getContinent_code", "getRegion_name$annotations", "getRegion_name", "getCity_name$annotations", "getCity_name", "getPostal_code$annotations", "getPostal_code", "getLatitude$annotations", "getLatitude", "()F", "getLongitude$annotations", "getLongitude", "getDma_code$annotations", "getDma_code", "()I", "getTimezone$annotations", "getTimezone", "getLocation$annotations", "getLocation", "getCoordinates$annotations", "getCoordinates", "getMasked_ip$annotations", "getMasked_ip", "getMasked_city_name$annotations", "getMasked_city_name", "getMasked_postal_code$annotations", "getMasked_postal_code", "getMasked_latitude$annotations", "getMasked_latitude", "getMasked_longitude$annotations", "getMasked_longitude", "getMasked_dma_code$annotations", "getMasked_dma_code", "getMasked_location$annotations", "getMasked_location", "getMasked_coordinates$annotations", "getMasked_coordinates", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String city_name;
        private final String continent_code;
        private final String coordinates;
        private final String country_code2;
        private final String country_code3;
        private final String country_name;
        private final int dma_code;
        private final String ip;
        private final float latitude;
        private final String location;
        private final float longitude;
        private final String masked_city_name;
        private final String masked_coordinates;
        private final String masked_dma_code;
        private final String masked_ip;
        private final String masked_latitude;
        private final String masked_location;
        private final String masked_longitude;
        private final String masked_postal_code;
        private final String postal_code;
        private final String region_name;
        private final String timezone;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0.0f, 0.0f, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 4194303, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, float f, float f2, int i, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, int i2, Object obj) {
            String str20;
            String str21;
            String str22 = (i2 & 1) != 0 ? surrogate.ip : str;
            String str23 = (i2 & 2) != 0 ? surrogate.country_code2 : str2;
            String str24 = (i2 & 4) != 0 ? surrogate.country_code3 : str3;
            String str25 = (i2 & 8) != 0 ? surrogate.country_name : str4;
            String str26 = (i2 & 16) != 0 ? surrogate.continent_code : str5;
            String str27 = (i2 & 32) != 0 ? surrogate.region_name : str6;
            String str28 = (i2 & 64) != 0 ? surrogate.city_name : str7;
            String str29 = (i2 & 128) != 0 ? surrogate.postal_code : str8;
            float f3 = (i2 & 256) != 0 ? surrogate.latitude : f;
            float f4 = (i2 & 512) != 0 ? surrogate.longitude : f2;
            int i3 = (i2 & 1024) != 0 ? surrogate.dma_code : i;
            String str30 = (i2 & 2048) != 0 ? surrogate.timezone : str9;
            String str31 = (i2 & 4096) != 0 ? surrogate.location : str10;
            String str32 = (i2 & 8192) != 0 ? surrogate.coordinates : str11;
            String str33 = str22;
            String str34 = (i2 & 16384) != 0 ? surrogate.masked_ip : str12;
            String str35 = (i2 & 32768) != 0 ? surrogate.masked_city_name : str13;
            String str36 = (i2 & 65536) != 0 ? surrogate.masked_postal_code : str14;
            String str37 = (i2 & 131072) != 0 ? surrogate.masked_latitude : str15;
            String str38 = (i2 & 262144) != 0 ? surrogate.masked_longitude : str16;
            String str39 = (i2 & 524288) != 0 ? surrogate.masked_dma_code : str17;
            String str40 = (i2 & 1048576) != 0 ? surrogate.masked_location : str18;
            if ((i2 & 2097152) != 0) {
                str21 = str40;
                str20 = surrogate.masked_coordinates;
            } else {
                str20 = str19;
                str21 = str40;
            }
            return surrogate.copy(str33, str23, str24, str25, str26, str27, str28, str29, f3, f4, i3, str30, str31, str32, str34, str35, str36, str37, str38, str39, str21, str20);
        }

        @SerialName("cityName")
        @JsonAnnotations2(names = {"city_name"})
        public static /* synthetic */ void getCity_name$annotations() {
        }

        @SerialName("continentCode")
        @JsonAnnotations2(names = {"continent_code"})
        public static /* synthetic */ void getContinent_code$annotations() {
        }

        @SerialName("coordinates")
        @JsonAnnotations2(names = {"coordinates"})
        public static /* synthetic */ void getCoordinates$annotations() {
        }

        @SerialName("countryCode2")
        @JsonAnnotations2(names = {"country_code2"})
        public static /* synthetic */ void getCountry_code2$annotations() {
        }

        @SerialName("countryCode3")
        @JsonAnnotations2(names = {"country_code3"})
        public static /* synthetic */ void getCountry_code3$annotations() {
        }

        @SerialName("countryName")
        @JsonAnnotations2(names = {"country_name"})
        public static /* synthetic */ void getCountry_name$annotations() {
        }

        @SerialName("dmaCode")
        @JsonAnnotations2(names = {"dma_code"})
        public static /* synthetic */ void getDma_code$annotations() {
        }

        @SerialName("ip")
        @JsonAnnotations2(names = {"ip"})
        public static /* synthetic */ void getIp$annotations() {
        }

        @SerialName("latitude")
        @JsonAnnotations2(names = {"latitude"})
        public static /* synthetic */ void getLatitude$annotations() {
        }

        @SerialName("location")
        @JsonAnnotations2(names = {"location"})
        public static /* synthetic */ void getLocation$annotations() {
        }

        @SerialName("longitude")
        @JsonAnnotations2(names = {"longitude"})
        public static /* synthetic */ void getLongitude$annotations() {
        }

        @SerialName("maskedCityName")
        @JsonAnnotations2(names = {"masked_city_name"})
        public static /* synthetic */ void getMasked_city_name$annotations() {
        }

        @SerialName("maskedCoordinates")
        @JsonAnnotations2(names = {"masked_coordinates"})
        public static /* synthetic */ void getMasked_coordinates$annotations() {
        }

        @SerialName("maskedDmaCode")
        @JsonAnnotations2(names = {"masked_dma_code"})
        public static /* synthetic */ void getMasked_dma_code$annotations() {
        }

        @SerialName("maskedIp")
        @JsonAnnotations2(names = {"masked_ip"})
        public static /* synthetic */ void getMasked_ip$annotations() {
        }

        @SerialName("maskedLatitude")
        @JsonAnnotations2(names = {"masked_latitude"})
        public static /* synthetic */ void getMasked_latitude$annotations() {
        }

        @SerialName("maskedLocation")
        @JsonAnnotations2(names = {"masked_location"})
        public static /* synthetic */ void getMasked_location$annotations() {
        }

        @SerialName("maskedLongitude")
        @JsonAnnotations2(names = {"masked_longitude"})
        public static /* synthetic */ void getMasked_longitude$annotations() {
        }

        @SerialName("maskedPostalCode")
        @JsonAnnotations2(names = {"masked_postal_code"})
        public static /* synthetic */ void getMasked_postal_code$annotations() {
        }

        @SerialName("postalCode")
        @JsonAnnotations2(names = {PlaceTypes.POSTAL_CODE})
        public static /* synthetic */ void getPostal_code$annotations() {
        }

        @SerialName("regionName")
        @JsonAnnotations2(names = {"region_name"})
        public static /* synthetic */ void getRegion_name$annotations() {
        }

        @SerialName("timezone")
        @JsonAnnotations2(names = {"timezone"})
        public static /* synthetic */ void getTimezone$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getIp() {
            return this.ip;
        }

        /* renamed from: component10, reason: from getter */
        public final float getLongitude() {
            return this.longitude;
        }

        /* renamed from: component11, reason: from getter */
        public final int getDma_code() {
            return this.dma_code;
        }

        /* renamed from: component12, reason: from getter */
        public final String getTimezone() {
            return this.timezone;
        }

        /* renamed from: component13, reason: from getter */
        public final String getLocation() {
            return this.location;
        }

        /* renamed from: component14, reason: from getter */
        public final String getCoordinates() {
            return this.coordinates;
        }

        /* renamed from: component15, reason: from getter */
        public final String getMasked_ip() {
            return this.masked_ip;
        }

        /* renamed from: component16, reason: from getter */
        public final String getMasked_city_name() {
            return this.masked_city_name;
        }

        /* renamed from: component17, reason: from getter */
        public final String getMasked_postal_code() {
            return this.masked_postal_code;
        }

        /* renamed from: component18, reason: from getter */
        public final String getMasked_latitude() {
            return this.masked_latitude;
        }

        /* renamed from: component19, reason: from getter */
        public final String getMasked_longitude() {
            return this.masked_longitude;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCountry_code2() {
            return this.country_code2;
        }

        /* renamed from: component20, reason: from getter */
        public final String getMasked_dma_code() {
            return this.masked_dma_code;
        }

        /* renamed from: component21, reason: from getter */
        public final String getMasked_location() {
            return this.masked_location;
        }

        /* renamed from: component22, reason: from getter */
        public final String getMasked_coordinates() {
            return this.masked_coordinates;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCountry_code3() {
            return this.country_code3;
        }

        /* renamed from: component4, reason: from getter */
        public final String getCountry_name() {
            return this.country_name;
        }

        /* renamed from: component5, reason: from getter */
        public final String getContinent_code() {
            return this.continent_code;
        }

        /* renamed from: component6, reason: from getter */
        public final String getRegion_name() {
            return this.region_name;
        }

        /* renamed from: component7, reason: from getter */
        public final String getCity_name() {
            return this.city_name;
        }

        /* renamed from: component8, reason: from getter */
        public final String getPostal_code() {
            return this.postal_code;
        }

        /* renamed from: component9, reason: from getter */
        public final float getLatitude() {
            return this.latitude;
        }

        public final Surrogate copy(String ip, String country_code2, String country_code3, String country_name, String continent_code, String region_name, String city_name, String postal_code, float latitude, float longitude, int dma_code, String timezone, String location, String coordinates, String masked_ip, String masked_city_name, String masked_postal_code, String masked_latitude, String masked_longitude, String masked_dma_code, String masked_location, String masked_coordinates) {
            Intrinsics.checkNotNullParameter(ip, "ip");
            Intrinsics.checkNotNullParameter(country_code2, "country_code2");
            Intrinsics.checkNotNullParameter(country_code3, "country_code3");
            Intrinsics.checkNotNullParameter(country_name, "country_name");
            Intrinsics.checkNotNullParameter(continent_code, "continent_code");
            Intrinsics.checkNotNullParameter(region_name, "region_name");
            Intrinsics.checkNotNullParameter(city_name, "city_name");
            Intrinsics.checkNotNullParameter(postal_code, "postal_code");
            Intrinsics.checkNotNullParameter(timezone, "timezone");
            Intrinsics.checkNotNullParameter(location, "location");
            Intrinsics.checkNotNullParameter(coordinates, "coordinates");
            Intrinsics.checkNotNullParameter(masked_ip, "masked_ip");
            Intrinsics.checkNotNullParameter(masked_city_name, "masked_city_name");
            Intrinsics.checkNotNullParameter(masked_postal_code, "masked_postal_code");
            Intrinsics.checkNotNullParameter(masked_latitude, "masked_latitude");
            Intrinsics.checkNotNullParameter(masked_longitude, "masked_longitude");
            Intrinsics.checkNotNullParameter(masked_dma_code, "masked_dma_code");
            Intrinsics.checkNotNullParameter(masked_location, "masked_location");
            Intrinsics.checkNotNullParameter(masked_coordinates, "masked_coordinates");
            return new Surrogate(ip, country_code2, country_code3, country_name, continent_code, region_name, city_name, postal_code, latitude, longitude, dma_code, timezone, location, coordinates, masked_ip, masked_city_name, masked_postal_code, masked_latitude, masked_longitude, masked_dma_code, masked_location, masked_coordinates);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.ip, surrogate.ip) && Intrinsics.areEqual(this.country_code2, surrogate.country_code2) && Intrinsics.areEqual(this.country_code3, surrogate.country_code3) && Intrinsics.areEqual(this.country_name, surrogate.country_name) && Intrinsics.areEqual(this.continent_code, surrogate.continent_code) && Intrinsics.areEqual(this.region_name, surrogate.region_name) && Intrinsics.areEqual(this.city_name, surrogate.city_name) && Intrinsics.areEqual(this.postal_code, surrogate.postal_code) && Float.compare(this.latitude, surrogate.latitude) == 0 && Float.compare(this.longitude, surrogate.longitude) == 0 && this.dma_code == surrogate.dma_code && Intrinsics.areEqual(this.timezone, surrogate.timezone) && Intrinsics.areEqual(this.location, surrogate.location) && Intrinsics.areEqual(this.coordinates, surrogate.coordinates) && Intrinsics.areEqual(this.masked_ip, surrogate.masked_ip) && Intrinsics.areEqual(this.masked_city_name, surrogate.masked_city_name) && Intrinsics.areEqual(this.masked_postal_code, surrogate.masked_postal_code) && Intrinsics.areEqual(this.masked_latitude, surrogate.masked_latitude) && Intrinsics.areEqual(this.masked_longitude, surrogate.masked_longitude) && Intrinsics.areEqual(this.masked_dma_code, surrogate.masked_dma_code) && Intrinsics.areEqual(this.masked_location, surrogate.masked_location) && Intrinsics.areEqual(this.masked_coordinates, surrogate.masked_coordinates);
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((((((((((((this.ip.hashCode() * 31) + this.country_code2.hashCode()) * 31) + this.country_code3.hashCode()) * 31) + this.country_name.hashCode()) * 31) + this.continent_code.hashCode()) * 31) + this.region_name.hashCode()) * 31) + this.city_name.hashCode()) * 31) + this.postal_code.hashCode()) * 31) + Float.hashCode(this.latitude)) * 31) + Float.hashCode(this.longitude)) * 31) + Integer.hashCode(this.dma_code)) * 31) + this.timezone.hashCode()) * 31) + this.location.hashCode()) * 31) + this.coordinates.hashCode()) * 31) + this.masked_ip.hashCode()) * 31) + this.masked_city_name.hashCode()) * 31) + this.masked_postal_code.hashCode()) * 31) + this.masked_latitude.hashCode()) * 31) + this.masked_longitude.hashCode()) * 31) + this.masked_dma_code.hashCode()) * 31) + this.masked_location.hashCode()) * 31) + this.masked_coordinates.hashCode();
        }

        public String toString() {
            return "Surrogate(ip=" + this.ip + ", country_code2=" + this.country_code2 + ", country_code3=" + this.country_code3 + ", country_name=" + this.country_name + ", continent_code=" + this.continent_code + ", region_name=" + this.region_name + ", city_name=" + this.city_name + ", postal_code=" + this.postal_code + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ", dma_code=" + this.dma_code + ", timezone=" + this.timezone + ", location=" + this.location + ", coordinates=" + this.coordinates + ", masked_ip=" + this.masked_ip + ", masked_city_name=" + this.masked_city_name + ", masked_postal_code=" + this.masked_postal_code + ", masked_latitude=" + this.masked_latitude + ", masked_longitude=" + this.masked_longitude + ", masked_dma_code=" + this.masked_dma_code + ", masked_location=" + this.masked_location + ", masked_coordinates=" + this.masked_coordinates + ")";
        }

        /* compiled from: GeoIPDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/GeoIPDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/GeoIPDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GeoIPDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, float f, float f2, int i2, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.ip = "";
            } else {
                this.ip = str;
            }
            if ((i & 2) == 0) {
                this.country_code2 = "";
            } else {
                this.country_code2 = str2;
            }
            if ((i & 4) == 0) {
                this.country_code3 = "";
            } else {
                this.country_code3 = str3;
            }
            if ((i & 8) == 0) {
                this.country_name = "";
            } else {
                this.country_name = str4;
            }
            if ((i & 16) == 0) {
                this.continent_code = "";
            } else {
                this.continent_code = str5;
            }
            if ((i & 32) == 0) {
                this.region_name = "";
            } else {
                this.region_name = str6;
            }
            if ((i & 64) == 0) {
                this.city_name = "";
            } else {
                this.city_name = str7;
            }
            if ((i & 128) == 0) {
                this.postal_code = "";
            } else {
                this.postal_code = str8;
            }
            if ((i & 256) == 0) {
                this.latitude = 0.0f;
            } else {
                this.latitude = f;
            }
            if ((i & 512) == 0) {
                this.longitude = 0.0f;
            } else {
                this.longitude = f2;
            }
            if ((i & 1024) == 0) {
                this.dma_code = 0;
            } else {
                this.dma_code = i2;
            }
            if ((i & 2048) == 0) {
                this.timezone = "";
            } else {
                this.timezone = str9;
            }
            if ((i & 4096) == 0) {
                this.location = "";
            } else {
                this.location = str10;
            }
            if ((i & 8192) == 0) {
                this.coordinates = "";
            } else {
                this.coordinates = str11;
            }
            if ((i & 16384) == 0) {
                this.masked_ip = "";
            } else {
                this.masked_ip = str12;
            }
            if ((32768 & i) == 0) {
                this.masked_city_name = "";
            } else {
                this.masked_city_name = str13;
            }
            if ((65536 & i) == 0) {
                this.masked_postal_code = "";
            } else {
                this.masked_postal_code = str14;
            }
            if ((131072 & i) == 0) {
                this.masked_latitude = "";
            } else {
                this.masked_latitude = str15;
            }
            if ((262144 & i) == 0) {
                this.masked_longitude = "";
            } else {
                this.masked_longitude = str16;
            }
            if ((524288 & i) == 0) {
                this.masked_dma_code = "";
            } else {
                this.masked_dma_code = str17;
            }
            if ((1048576 & i) == 0) {
                this.masked_location = "";
            } else {
                this.masked_location = str18;
            }
            if ((i & 2097152) == 0) {
                this.masked_coordinates = "";
            } else {
                this.masked_coordinates = str19;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.ip, "")) {
                output.encodeStringElement(serialDesc, 0, self.ip);
            }
            if (!Intrinsics.areEqual(self.country_code2, "")) {
                output.encodeStringElement(serialDesc, 1, self.country_code2);
            }
            if (!Intrinsics.areEqual(self.country_code3, "")) {
                output.encodeStringElement(serialDesc, 2, self.country_code3);
            }
            if (!Intrinsics.areEqual(self.country_name, "")) {
                output.encodeStringElement(serialDesc, 3, self.country_name);
            }
            if (!Intrinsics.areEqual(self.continent_code, "")) {
                output.encodeStringElement(serialDesc, 4, self.continent_code);
            }
            if (!Intrinsics.areEqual(self.region_name, "")) {
                output.encodeStringElement(serialDesc, 5, self.region_name);
            }
            if (!Intrinsics.areEqual(self.city_name, "")) {
                output.encodeStringElement(serialDesc, 6, self.city_name);
            }
            if (!Intrinsics.areEqual(self.postal_code, "")) {
                output.encodeStringElement(serialDesc, 7, self.postal_code);
            }
            if (Float.compare(self.latitude, 0.0f) != 0) {
                output.encodeSerializableElement(serialDesc, 8, FloatAsNumberSerializer.INSTANCE, Float.valueOf(self.latitude));
            }
            if (Float.compare(self.longitude, 0.0f) != 0) {
                output.encodeSerializableElement(serialDesc, 9, FloatAsNumberSerializer.INSTANCE, Float.valueOf(self.longitude));
            }
            int i = self.dma_code;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 10, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            if (!Intrinsics.areEqual(self.timezone, "")) {
                output.encodeStringElement(serialDesc, 11, self.timezone);
            }
            if (!Intrinsics.areEqual(self.location, "")) {
                output.encodeStringElement(serialDesc, 12, self.location);
            }
            if (!Intrinsics.areEqual(self.coordinates, "")) {
                output.encodeStringElement(serialDesc, 13, self.coordinates);
            }
            if (!Intrinsics.areEqual(self.masked_ip, "")) {
                output.encodeStringElement(serialDesc, 14, self.masked_ip);
            }
            if (!Intrinsics.areEqual(self.masked_city_name, "")) {
                output.encodeStringElement(serialDesc, 15, self.masked_city_name);
            }
            if (!Intrinsics.areEqual(self.masked_postal_code, "")) {
                output.encodeStringElement(serialDesc, 16, self.masked_postal_code);
            }
            if (!Intrinsics.areEqual(self.masked_latitude, "")) {
                output.encodeStringElement(serialDesc, 17, self.masked_latitude);
            }
            if (!Intrinsics.areEqual(self.masked_longitude, "")) {
                output.encodeStringElement(serialDesc, 18, self.masked_longitude);
            }
            if (!Intrinsics.areEqual(self.masked_dma_code, "")) {
                output.encodeStringElement(serialDesc, 19, self.masked_dma_code);
            }
            if (!Intrinsics.areEqual(self.masked_location, "")) {
                output.encodeStringElement(serialDesc, 20, self.masked_location);
            }
            if (Intrinsics.areEqual(self.masked_coordinates, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 21, self.masked_coordinates);
        }

        public Surrogate(String ip, String country_code2, String country_code3, String country_name, String continent_code, String region_name, String city_name, String postal_code, float f, float f2, int i, String timezone, String location, String coordinates, String masked_ip, String masked_city_name, String masked_postal_code, String masked_latitude, String masked_longitude, String masked_dma_code, String masked_location, String masked_coordinates) {
            Intrinsics.checkNotNullParameter(ip, "ip");
            Intrinsics.checkNotNullParameter(country_code2, "country_code2");
            Intrinsics.checkNotNullParameter(country_code3, "country_code3");
            Intrinsics.checkNotNullParameter(country_name, "country_name");
            Intrinsics.checkNotNullParameter(continent_code, "continent_code");
            Intrinsics.checkNotNullParameter(region_name, "region_name");
            Intrinsics.checkNotNullParameter(city_name, "city_name");
            Intrinsics.checkNotNullParameter(postal_code, "postal_code");
            Intrinsics.checkNotNullParameter(timezone, "timezone");
            Intrinsics.checkNotNullParameter(location, "location");
            Intrinsics.checkNotNullParameter(coordinates, "coordinates");
            Intrinsics.checkNotNullParameter(masked_ip, "masked_ip");
            Intrinsics.checkNotNullParameter(masked_city_name, "masked_city_name");
            Intrinsics.checkNotNullParameter(masked_postal_code, "masked_postal_code");
            Intrinsics.checkNotNullParameter(masked_latitude, "masked_latitude");
            Intrinsics.checkNotNullParameter(masked_longitude, "masked_longitude");
            Intrinsics.checkNotNullParameter(masked_dma_code, "masked_dma_code");
            Intrinsics.checkNotNullParameter(masked_location, "masked_location");
            Intrinsics.checkNotNullParameter(masked_coordinates, "masked_coordinates");
            this.ip = ip;
            this.country_code2 = country_code2;
            this.country_code3 = country_code3;
            this.country_name = country_name;
            this.continent_code = continent_code;
            this.region_name = region_name;
            this.city_name = city_name;
            this.postal_code = postal_code;
            this.latitude = f;
            this.longitude = f2;
            this.dma_code = i;
            this.timezone = timezone;
            this.location = location;
            this.coordinates = coordinates;
            this.masked_ip = masked_ip;
            this.masked_city_name = masked_city_name;
            this.masked_postal_code = masked_postal_code;
            this.masked_latitude = masked_latitude;
            this.masked_longitude = masked_longitude;
            this.masked_dma_code = masked_dma_code;
            this.masked_location = masked_location;
            this.masked_coordinates = masked_coordinates;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, float f, float f2, int i, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? "" : str7, (i2 & 128) != 0 ? "" : str8, (i2 & 256) != 0 ? 0.0f : f, (i2 & 512) == 0 ? f2 : 0.0f, (i2 & 1024) != 0 ? 0 : i, (i2 & 2048) != 0 ? "" : str9, (i2 & 4096) != 0 ? "" : str10, (i2 & 8192) != 0 ? "" : str11, (i2 & 16384) != 0 ? "" : str12, (i2 & 32768) != 0 ? "" : str13, (i2 & 65536) != 0 ? "" : str14, (i2 & 131072) != 0 ? "" : str15, (i2 & 262144) != 0 ? "" : str16, (i2 & 524288) != 0 ? "" : str17, (i2 & 1048576) != 0 ? "" : str18, (i2 & 2097152) != 0 ? "" : str19);
        }

        public final String getIp() {
            return this.ip;
        }

        public final String getCountry_code2() {
            return this.country_code2;
        }

        public final String getCountry_code3() {
            return this.country_code3;
        }

        public final String getCountry_name() {
            return this.country_name;
        }

        public final String getContinent_code() {
            return this.continent_code;
        }

        public final String getRegion_name() {
            return this.region_name;
        }

        public final String getCity_name() {
            return this.city_name;
        }

        public final String getPostal_code() {
            return this.postal_code;
        }

        public final float getLatitude() {
            return this.latitude;
        }

        public final float getLongitude() {
            return this.longitude;
        }

        public final int getDma_code() {
            return this.dma_code;
        }

        public final String getTimezone() {
            return this.timezone;
        }

        public final String getLocation() {
            return this.location;
        }

        public final String getCoordinates() {
            return this.coordinates;
        }

        public final String getMasked_ip() {
            return this.masked_ip;
        }

        public final String getMasked_city_name() {
            return this.masked_city_name;
        }

        public final String getMasked_postal_code() {
            return this.masked_postal_code;
        }

        public final String getMasked_latitude() {
            return this.masked_latitude;
        }

        public final String getMasked_longitude() {
            return this.masked_longitude;
        }

        public final String getMasked_dma_code() {
            return this.masked_dma_code;
        }

        public final String getMasked_location() {
            return this.masked_location;
        }

        public final String getMasked_coordinates() {
            return this.masked_coordinates;
        }
    }

    /* compiled from: GeoIPDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/GeoIPDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/GeoIPDto;", "Lcom/robinhood/rosetta/eventlogging/GeoIP;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/GeoIPDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<GeoIPDto, GeoIP> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GeoIPDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GeoIPDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GeoIPDto> getBinaryBase64Serializer() {
            return (KSerializer) GeoIPDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GeoIP> getProtoAdapter() {
            return GeoIP.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GeoIPDto getZeroValue() {
            return GeoIPDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GeoIPDto fromProto(GeoIP proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new GeoIPDto(new Surrogate(proto.getIp(), proto.getCountry_code2(), proto.getCountry_code3(), proto.getCountry_name(), proto.getContinent_code(), proto.getRegion_name(), proto.getCity_name(), proto.getPostal_code(), proto.getLatitude(), proto.getLongitude(), proto.getDma_code(), proto.getTimezone(), proto.getLocation(), proto.getCoordinates(), proto.getMasked_ip(), proto.getMasked_city_name(), proto.getMasked_postal_code(), proto.getMasked_latitude(), proto.getMasked_longitude(), proto.getMasked_dma_code(), proto.getMasked_location(), proto.getMasked_coordinates()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.GeoIPDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GeoIPDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GeoIPDto(null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, null, null, null, null, null, null, null, null, null, null, null, 4194303, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GeoIPDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/GeoIPDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/GeoIPDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/GeoIPDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<GeoIPDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.GeoIP", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GeoIPDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GeoIPDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GeoIPDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GeoIPDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/GeoIPDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.GeoIPDto";
        }
    }
}
