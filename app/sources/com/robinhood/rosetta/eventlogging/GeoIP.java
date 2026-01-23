package com.robinhood.rosetta.eventlogging;

import com.adjust.sdk.network.ErrorCodes;
import com.google.android.libraries.places.api.model.PlaceTypes;
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

/* compiled from: GeoIP.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 A2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001ABí\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u00109\u001a\u00020\u0002H\u0017J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010=H\u0096\u0002J\b\u0010>\u001a\u00020\u0010H\u0016J\b\u0010?\u001a\u00020\u0004H\u0016Jì\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u001dR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010!R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010!R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0016\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010!R\u0016\u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010!R\u0016\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010!R\u0016\u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010!R\u0016\u0010\u0015\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010!R\u0016\u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010!R\u0016\u0010\u0017\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010!R\u0016\u0010\u0018\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010!R\u0016\u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010!R\u0016\u0010\u001a\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010!R\u0016\u0010\u001b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010!¨\u0006B"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/GeoIP;", "Lcom/squareup/wire/Message;", "", "ip", "", "country_code2", "country_code3", "country_name", "continent_code", "region_name", "city_name", PlaceTypes.POSTAL_CODE, "latitude", "", "longitude", "dma_code", "", "timezone", "location", "coordinates", "masked_ip", "masked_city_name", "masked_postal_code", "masked_latitude", "masked_longitude", "masked_dma_code", "masked_location", "masked_coordinates", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getIp", "()Ljava/lang/String;", "getCountry_code2", "getCountry_code3", "getCountry_name", "getContinent_code", "getRegion_name", "getCity_name", "getPostal_code", "getLatitude", "()F", "getLongitude", "getDma_code", "()I", "getTimezone", "getLocation", "getCoordinates", "getMasked_ip", "getMasked_city_name", "getMasked_postal_code", "getMasked_latitude", "getMasked_longitude", "getMasked_dma_code", "getMasked_location", "getMasked_coordinates", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class GeoIP extends Message {

    @JvmField
    public static final ProtoAdapter<GeoIP> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "cityName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String city_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "continentCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String continent_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final String coordinates;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "countryCode2", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String country_code2;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "countryCode3", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String country_code3;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "countryName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String country_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "dmaCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final int dma_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String ip;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final float latitude;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final String location;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final float longitude;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maskedCityName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = ErrorCodes.IO_EXCEPTION)
    private final String masked_city_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maskedCoordinates", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 21, tag = 1014)
    private final String masked_coordinates;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maskedDmaCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 19, tag = 1011)
    private final String masked_dma_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maskedIp", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 1001)
    private final String masked_ip;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maskedLatitude", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 1009)
    private final String masked_latitude;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maskedLocation", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 20, tag = 1013)
    private final String masked_location;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maskedLongitude", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 18, tag = 1010)
    private final String masked_longitude;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maskedPostalCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 1008)
    private final String masked_postal_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "postalCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String postal_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "regionName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String region_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final String timezone;

    public GeoIP() {
        this(null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, null, null, null, null, null, null, null, null, null, null, null, null, 8388607, null);
    }

    public /* synthetic */ GeoIP(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, float f, float f2, int i, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? "" : str7, (i2 & 128) != 0 ? "" : str8, (i2 & 256) != 0 ? 0.0f : f, (i2 & 512) == 0 ? f2 : 0.0f, (i2 & 1024) != 0 ? 0 : i, (i2 & 2048) != 0 ? "" : str9, (i2 & 4096) != 0 ? "" : str10, (i2 & 8192) != 0 ? "" : str11, (i2 & 16384) != 0 ? "" : str12, (i2 & 32768) != 0 ? "" : str13, (i2 & 65536) != 0 ? "" : str14, (i2 & 131072) != 0 ? "" : str15, (i2 & 262144) != 0 ? "" : str16, (i2 & 524288) != 0 ? "" : str17, (i2 & 1048576) != 0 ? "" : str18, (i2 & 2097152) == 0 ? str19 : "", (i2 & 4194304) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24290newBuilder();
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeoIP(String ip, String country_code2, String country_code3, String country_name, String continent_code, String region_name, String city_name, String postal_code, float f, float f2, int i, String timezone, String location, String coordinates, String masked_ip, String masked_city_name, String masked_postal_code, String masked_latitude, String masked_longitude, String masked_dma_code, String masked_location, String masked_coordinates, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
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
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
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

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24290newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GeoIP)) {
            return false;
        }
        GeoIP geoIP = (GeoIP) other;
        return Intrinsics.areEqual(unknownFields(), geoIP.unknownFields()) && Intrinsics.areEqual(this.ip, geoIP.ip) && Intrinsics.areEqual(this.country_code2, geoIP.country_code2) && Intrinsics.areEqual(this.country_code3, geoIP.country_code3) && Intrinsics.areEqual(this.country_name, geoIP.country_name) && Intrinsics.areEqual(this.continent_code, geoIP.continent_code) && Intrinsics.areEqual(this.region_name, geoIP.region_name) && Intrinsics.areEqual(this.city_name, geoIP.city_name) && Intrinsics.areEqual(this.postal_code, geoIP.postal_code) && this.latitude == geoIP.latitude && this.longitude == geoIP.longitude && this.dma_code == geoIP.dma_code && Intrinsics.areEqual(this.timezone, geoIP.timezone) && Intrinsics.areEqual(this.location, geoIP.location) && Intrinsics.areEqual(this.coordinates, geoIP.coordinates) && Intrinsics.areEqual(this.masked_ip, geoIP.masked_ip) && Intrinsics.areEqual(this.masked_city_name, geoIP.masked_city_name) && Intrinsics.areEqual(this.masked_postal_code, geoIP.masked_postal_code) && Intrinsics.areEqual(this.masked_latitude, geoIP.masked_latitude) && Intrinsics.areEqual(this.masked_longitude, geoIP.masked_longitude) && Intrinsics.areEqual(this.masked_dma_code, geoIP.masked_dma_code) && Intrinsics.areEqual(this.masked_location, geoIP.masked_location) && Intrinsics.areEqual(this.masked_coordinates, geoIP.masked_coordinates);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((((((((((((((((((((((((((((((((unknownFields().hashCode() * 37) + this.ip.hashCode()) * 37) + this.country_code2.hashCode()) * 37) + this.country_code3.hashCode()) * 37) + this.country_name.hashCode()) * 37) + this.continent_code.hashCode()) * 37) + this.region_name.hashCode()) * 37) + this.city_name.hashCode()) * 37) + this.postal_code.hashCode()) * 37) + Float.hashCode(this.latitude)) * 37) + Float.hashCode(this.longitude)) * 37) + Integer.hashCode(this.dma_code)) * 37) + this.timezone.hashCode()) * 37) + this.location.hashCode()) * 37) + this.coordinates.hashCode()) * 37) + this.masked_ip.hashCode()) * 37) + this.masked_city_name.hashCode()) * 37) + this.masked_postal_code.hashCode()) * 37) + this.masked_latitude.hashCode()) * 37) + this.masked_longitude.hashCode()) * 37) + this.masked_dma_code.hashCode()) * 37) + this.masked_location.hashCode()) * 37) + this.masked_coordinates.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ip=" + Internal.sanitize(this.ip));
        arrayList.add("country_code2=" + Internal.sanitize(this.country_code2));
        arrayList.add("country_code3=" + Internal.sanitize(this.country_code3));
        arrayList.add("country_name=" + Internal.sanitize(this.country_name));
        arrayList.add("continent_code=" + Internal.sanitize(this.continent_code));
        arrayList.add("region_name=" + Internal.sanitize(this.region_name));
        arrayList.add("city_name=" + Internal.sanitize(this.city_name));
        arrayList.add("postal_code=" + Internal.sanitize(this.postal_code));
        arrayList.add("latitude=" + this.latitude);
        arrayList.add("longitude=" + this.longitude);
        arrayList.add("dma_code=" + this.dma_code);
        arrayList.add("timezone=" + Internal.sanitize(this.timezone));
        arrayList.add("location=" + Internal.sanitize(this.location));
        arrayList.add("coordinates=" + Internal.sanitize(this.coordinates));
        arrayList.add("masked_ip=" + Internal.sanitize(this.masked_ip));
        arrayList.add("masked_city_name=" + Internal.sanitize(this.masked_city_name));
        arrayList.add("masked_postal_code=" + Internal.sanitize(this.masked_postal_code));
        arrayList.add("masked_latitude=" + Internal.sanitize(this.masked_latitude));
        arrayList.add("masked_longitude=" + Internal.sanitize(this.masked_longitude));
        arrayList.add("masked_dma_code=" + Internal.sanitize(this.masked_dma_code));
        arrayList.add("masked_location=" + Internal.sanitize(this.masked_location));
        arrayList.add("masked_coordinates=" + Internal.sanitize(this.masked_coordinates));
        return CollectionsKt.joinToString$default(arrayList, ", ", "GeoIP{", "}", 0, null, null, 56, null);
    }

    public final GeoIP copy(String ip, String country_code2, String country_code3, String country_name, String continent_code, String region_name, String city_name, String postal_code, float latitude, float longitude, int dma_code, String timezone, String location, String coordinates, String masked_ip, String masked_city_name, String masked_postal_code, String masked_latitude, String masked_longitude, String masked_dma_code, String masked_location, String masked_coordinates, ByteString unknownFields) {
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
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GeoIP(ip, country_code2, country_code3, country_name, continent_code, region_name, city_name, postal_code, latitude, longitude, dma_code, timezone, location, coordinates, masked_ip, masked_city_name, masked_postal_code, masked_latitude, masked_longitude, masked_dma_code, masked_location, masked_coordinates, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GeoIP.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GeoIP>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.GeoIP$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GeoIP value) {
                Float fValueOf = Float.valueOf(0.0f);
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getIp(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getIp());
                }
                if (!Intrinsics.areEqual(value.getCountry_code2(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getCountry_code2());
                }
                if (!Intrinsics.areEqual(value.getCountry_code3(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getCountry_code3());
                }
                if (!Intrinsics.areEqual(value.getCountry_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getCountry_name());
                }
                if (!Intrinsics.areEqual(value.getContinent_code(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getContinent_code());
                }
                if (!Intrinsics.areEqual(value.getRegion_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getRegion_name());
                }
                if (!Intrinsics.areEqual(value.getCity_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getCity_name());
                }
                if (!Intrinsics.areEqual(value.getPostal_code(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getPostal_code());
                }
                if (!Float.valueOf(value.getLatitude()).equals(fValueOf)) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(9, Float.valueOf(value.getLatitude()));
                }
                if (!Float.valueOf(value.getLongitude()).equals(fValueOf)) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(10, Float.valueOf(value.getLongitude()));
                }
                if (value.getDma_code() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(11, Integer.valueOf(value.getDma_code()));
                }
                if (!Intrinsics.areEqual(value.getTimezone(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(12, value.getTimezone());
                }
                if (!Intrinsics.areEqual(value.getLocation(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(13, value.getLocation());
                }
                if (!Intrinsics.areEqual(value.getCoordinates(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(14, value.getCoordinates());
                }
                if (!Intrinsics.areEqual(value.getMasked_ip(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1001, value.getMasked_ip());
                }
                if (!Intrinsics.areEqual(value.getMasked_city_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(ErrorCodes.IO_EXCEPTION, value.getMasked_city_name());
                }
                if (!Intrinsics.areEqual(value.getMasked_postal_code(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1008, value.getMasked_postal_code());
                }
                if (!Intrinsics.areEqual(value.getMasked_latitude(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1009, value.getMasked_latitude());
                }
                if (!Intrinsics.areEqual(value.getMasked_longitude(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1010, value.getMasked_longitude());
                }
                if (!Intrinsics.areEqual(value.getMasked_dma_code(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1011, value.getMasked_dma_code());
                }
                if (!Intrinsics.areEqual(value.getMasked_location(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1013, value.getMasked_location());
                }
                return !Intrinsics.areEqual(value.getMasked_coordinates(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(1014, value.getMasked_coordinates()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GeoIP value) throws IOException {
                Float fValueOf = Float.valueOf(0.0f);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getIp(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getIp());
                }
                if (!Intrinsics.areEqual(value.getCountry_code2(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getCountry_code2());
                }
                if (!Intrinsics.areEqual(value.getCountry_code3(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getCountry_code3());
                }
                if (!Intrinsics.areEqual(value.getCountry_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getCountry_name());
                }
                if (!Intrinsics.areEqual(value.getContinent_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getContinent_code());
                }
                if (!Intrinsics.areEqual(value.getRegion_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getRegion_name());
                }
                if (!Intrinsics.areEqual(value.getCity_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getCity_name());
                }
                if (!Intrinsics.areEqual(value.getPostal_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getPostal_code());
                }
                if (!Float.valueOf(value.getLatitude()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 9, (int) Float.valueOf(value.getLatitude()));
                }
                if (!Float.valueOf(value.getLongitude()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 10, (int) Float.valueOf(value.getLongitude()));
                }
                if (value.getDma_code() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 11, (int) Integer.valueOf(value.getDma_code()));
                }
                if (!Intrinsics.areEqual(value.getTimezone(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getTimezone());
                }
                if (!Intrinsics.areEqual(value.getLocation(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getLocation());
                }
                if (!Intrinsics.areEqual(value.getCoordinates(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 14, (int) value.getCoordinates());
                }
                if (!Intrinsics.areEqual(value.getMasked_ip(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1001, (int) value.getMasked_ip());
                }
                if (!Intrinsics.areEqual(value.getMasked_city_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, ErrorCodes.IO_EXCEPTION, (int) value.getMasked_city_name());
                }
                if (!Intrinsics.areEqual(value.getMasked_postal_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1008, (int) value.getMasked_postal_code());
                }
                if (!Intrinsics.areEqual(value.getMasked_latitude(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1009, (int) value.getMasked_latitude());
                }
                if (!Intrinsics.areEqual(value.getMasked_longitude(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1010, (int) value.getMasked_longitude());
                }
                if (!Intrinsics.areEqual(value.getMasked_dma_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1011, (int) value.getMasked_dma_code());
                }
                if (!Intrinsics.areEqual(value.getMasked_location(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1013, (int) value.getMasked_location());
                }
                if (!Intrinsics.areEqual(value.getMasked_coordinates(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1014, (int) value.getMasked_coordinates());
                }
                writer.writeBytes(value.unknownFields());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GeoIP decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                String strDecode7 = strDecode6;
                String strDecode8 = strDecode7;
                String strDecode9 = strDecode8;
                String strDecode10 = strDecode9;
                String strDecode11 = strDecode10;
                String strDecode12 = strDecode11;
                String strDecode13 = strDecode12;
                String strDecode14 = strDecode13;
                String strDecode15 = strDecode14;
                String strDecode16 = strDecode15;
                String strDecode17 = strDecode16;
                float fFloatValue = 0.0f;
                float fFloatValue2 = 0.0f;
                int iIntValue = 0;
                String strDecode18 = strDecode17;
                String strDecode19 = strDecode18;
                while (true) {
                    int iNextTag = reader.nextTag();
                    String str = strDecode18;
                    if (iNextTag == -1) {
                        return new GeoIP(strDecode17, str, strDecode19, strDecode, strDecode2, strDecode3, strDecode4, strDecode5, fFloatValue, fFloatValue2, iIntValue, strDecode6, strDecode7, strDecode8, strDecode9, strDecode10, strDecode11, strDecode12, strDecode13, strDecode14, strDecode15, strDecode16, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1001) {
                        strDecode9 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 1013) {
                        strDecode15 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag != 1014) {
                        switch (iNextTag) {
                            case 1:
                                strDecode17 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode18 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 3:
                                strDecode19 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 9:
                                fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                                break;
                            case 10:
                                fFloatValue2 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                                break;
                            case 11:
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 12:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 13:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 14:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                switch (iNextTag) {
                                    case ErrorCodes.IO_EXCEPTION /* 1007 */:
                                        strDecode10 = ProtoAdapter.STRING.decode(reader);
                                        break;
                                    case 1008:
                                        strDecode11 = ProtoAdapter.STRING.decode(reader);
                                        break;
                                    case 1009:
                                        strDecode12 = ProtoAdapter.STRING.decode(reader);
                                        break;
                                    case 1010:
                                        strDecode13 = ProtoAdapter.STRING.decode(reader);
                                        break;
                                    case 1011:
                                        strDecode14 = ProtoAdapter.STRING.decode(reader);
                                        break;
                                    default:
                                        reader.readUnknownField(iNextTag);
                                        break;
                                }
                        }
                    } else {
                        strDecode16 = ProtoAdapter.STRING.decode(reader);
                    }
                    strDecode18 = str;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GeoIP value) throws IOException {
                Float fValueOf = Float.valueOf(0.0f);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getMasked_coordinates(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1014, (int) value.getMasked_coordinates());
                }
                if (!Intrinsics.areEqual(value.getMasked_location(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1013, (int) value.getMasked_location());
                }
                if (!Intrinsics.areEqual(value.getMasked_dma_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1011, (int) value.getMasked_dma_code());
                }
                if (!Intrinsics.areEqual(value.getMasked_longitude(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1010, (int) value.getMasked_longitude());
                }
                if (!Intrinsics.areEqual(value.getMasked_latitude(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1009, (int) value.getMasked_latitude());
                }
                if (!Intrinsics.areEqual(value.getMasked_postal_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1008, (int) value.getMasked_postal_code());
                }
                if (!Intrinsics.areEqual(value.getMasked_city_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, ErrorCodes.IO_EXCEPTION, (int) value.getMasked_city_name());
                }
                if (!Intrinsics.areEqual(value.getMasked_ip(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1001, (int) value.getMasked_ip());
                }
                if (!Intrinsics.areEqual(value.getCoordinates(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 14, (int) value.getCoordinates());
                }
                if (!Intrinsics.areEqual(value.getLocation(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getLocation());
                }
                if (!Intrinsics.areEqual(value.getTimezone(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getTimezone());
                }
                if (value.getDma_code() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 11, (int) Integer.valueOf(value.getDma_code()));
                }
                if (!Float.valueOf(value.getLongitude()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 10, (int) Float.valueOf(value.getLongitude()));
                }
                if (!Float.valueOf(value.getLatitude()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 9, (int) Float.valueOf(value.getLatitude()));
                }
                if (!Intrinsics.areEqual(value.getPostal_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getPostal_code());
                }
                if (!Intrinsics.areEqual(value.getCity_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getCity_name());
                }
                if (!Intrinsics.areEqual(value.getRegion_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getRegion_name());
                }
                if (!Intrinsics.areEqual(value.getContinent_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getContinent_code());
                }
                if (!Intrinsics.areEqual(value.getCountry_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getCountry_name());
                }
                if (!Intrinsics.areEqual(value.getCountry_code3(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getCountry_code3());
                }
                if (!Intrinsics.areEqual(value.getCountry_code2(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getCountry_code2());
                }
                if (Intrinsics.areEqual(value.getIp(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getIp());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GeoIP redact(GeoIP value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.copy((4194303 & 1) != 0 ? value.ip : null, (4194303 & 2) != 0 ? value.country_code2 : null, (4194303 & 4) != 0 ? value.country_code3 : null, (4194303 & 8) != 0 ? value.country_name : null, (4194303 & 16) != 0 ? value.continent_code : null, (4194303 & 32) != 0 ? value.region_name : null, (4194303 & 64) != 0 ? value.city_name : null, (4194303 & 128) != 0 ? value.postal_code : null, (4194303 & 256) != 0 ? value.latitude : 0.0f, (4194303 & 512) != 0 ? value.longitude : 0.0f, (4194303 & 1024) != 0 ? value.dma_code : 0, (4194303 & 2048) != 0 ? value.timezone : null, (4194303 & 4096) != 0 ? value.location : null, (4194303 & 8192) != 0 ? value.coordinates : null, (4194303 & 16384) != 0 ? value.masked_ip : null, (4194303 & 32768) != 0 ? value.masked_city_name : null, (4194303 & 65536) != 0 ? value.masked_postal_code : null, (4194303 & 131072) != 0 ? value.masked_latitude : null, (4194303 & 262144) != 0 ? value.masked_longitude : null, (4194303 & 524288) != 0 ? value.masked_dma_code : null, (4194303 & 1048576) != 0 ? value.masked_location : null, (4194303 & 2097152) != 0 ? value.masked_coordinates : null, (4194303 & 4194304) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
