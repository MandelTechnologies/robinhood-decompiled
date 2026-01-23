package com.robinhood.rosetta.mainst;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import rosetta.mainst.CurrencyType;
import rosetta.mainst.InstrumentState;

/* compiled from: CurrencyDetails.kt */
@kotlin.Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 02\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00010B\u0093\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010'\u001a\u00020\u0002H\u0017J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0096\u0002J\b\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020\u0004H\u0016J\u0092\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\f2\b\b\u0002\u0010\u0013\u001a\u00020\u0014R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\"\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\"\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%¨\u00061"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/CurrencyDetails;", "Lcom/squareup/wire/Message;", "", "code", "", "name", "brand_color", "currency_type", "Lrosetta/mainst/CurrencyType;", "Increment", "Lcom/robinhood/rosetta/mainst/Decimal;", "crypto_metadata", "", "created_at", "Lcom/robinhood/rosetta/mainst/Time;", "updated_at", "state", "Lrosetta/mainst/InstrumentState;", "state_by_region", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/mainst/CurrencyType;Lcom/robinhood/rosetta/mainst/Decimal;Ljava/util/Map;Lcom/robinhood/rosetta/mainst/Time;Lcom/robinhood/rosetta/mainst/Time;Lrosetta/mainst/InstrumentState;Ljava/util/Map;Lokio/ByteString;)V", "getCode", "()Ljava/lang/String;", "getName", "getBrand_color", "getCurrency_type", "()Lrosetta/mainst/CurrencyType;", "getIncrement", "()Lcom/robinhood/rosetta/mainst/Decimal;", "getCreated_at", "()Lcom/robinhood/rosetta/mainst/Time;", "getUpdated_at", "getState", "()Lrosetta/mainst/InstrumentState;", "getCrypto_metadata", "()Ljava/util/Map;", "getState_by_region", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class CurrencyDetails extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Decimal Increment;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "brandColor", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String brand_color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String code;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final Time created_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "cryptoMetadata", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
    private final Map<String, String> crypto_metadata;

    @WireField(adapter = "rosetta.mainst.CurrencyType#ADAPTER", jsonName = "currencyType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final CurrencyType currency_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String name;

    @WireField(adapter = "rosetta.mainst.InstrumentState#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final InstrumentState state;

    @WireField(adapter = "rosetta.mainst.InstrumentState#ADAPTER", jsonName = "stateByRegion", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 9, tag = 10)
    private final Map<String, InstrumentState> state_by_region;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "updatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final Time updated_at;

    @JvmField
    public static final ProtoAdapter<CurrencyDetails> ADAPTER = new CurrencyDetails2(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(CurrencyDetails.class), Syntax.PROTO_3);

    public CurrencyDetails() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public /* synthetic */ CurrencyDetails(String str, String str2, String str3, CurrencyType currencyType, Decimal decimal, Map map, Time time, Time time2, InstrumentState instrumentState, Map map2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? CurrencyType.CURRENCY_TYPE_UNSPECIFIED : currencyType, (i & 16) != 0 ? null : decimal, (i & 32) != 0 ? MapsKt.emptyMap() : map, (i & 64) != 0 ? null : time, (i & 128) != 0 ? null : time2, (i & 256) != 0 ? InstrumentState.INSTRUMENT_STATE_UNSPECIFIED : instrumentState, (i & 512) != 0 ? MapsKt.emptyMap() : map2, (i & 1024) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24646newBuilder();
    }

    public final String getCode() {
        return this.code;
    }

    public final String getName() {
        return this.name;
    }

    public final String getBrand_color() {
        return this.brand_color;
    }

    public final CurrencyType getCurrency_type() {
        return this.currency_type;
    }

    public final Decimal getIncrement() {
        return this.Increment;
    }

    public final Time getCreated_at() {
        return this.created_at;
    }

    public final Time getUpdated_at() {
        return this.updated_at;
    }

    public final InstrumentState getState() {
        return this.state;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurrencyDetails(String code, String name, String brand_color, CurrencyType currency_type, Decimal decimal, Map<String, String> crypto_metadata, Time time, Time time2, InstrumentState state, Map<String, ? extends InstrumentState> state_by_region, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(brand_color, "brand_color");
        Intrinsics.checkNotNullParameter(currency_type, "currency_type");
        Intrinsics.checkNotNullParameter(crypto_metadata, "crypto_metadata");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(state_by_region, "state_by_region");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.code = code;
        this.name = name;
        this.brand_color = brand_color;
        this.currency_type = currency_type;
        this.Increment = decimal;
        this.created_at = time;
        this.updated_at = time2;
        this.state = state;
        this.crypto_metadata = Internal.immutableCopyOf("crypto_metadata", crypto_metadata);
        this.state_by_region = Internal.immutableCopyOf("state_by_region", state_by_region);
    }

    public final Map<String, String> getCrypto_metadata() {
        return this.crypto_metadata;
    }

    public final Map<String, InstrumentState> getState_by_region() {
        return this.state_by_region;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24646newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CurrencyDetails)) {
            return false;
        }
        CurrencyDetails currencyDetails = (CurrencyDetails) other;
        return Intrinsics.areEqual(unknownFields(), currencyDetails.unknownFields()) && Intrinsics.areEqual(this.code, currencyDetails.code) && Intrinsics.areEqual(this.name, currencyDetails.name) && Intrinsics.areEqual(this.brand_color, currencyDetails.brand_color) && this.currency_type == currencyDetails.currency_type && Intrinsics.areEqual(this.Increment, currencyDetails.Increment) && Intrinsics.areEqual(this.crypto_metadata, currencyDetails.crypto_metadata) && Intrinsics.areEqual(this.created_at, currencyDetails.created_at) && Intrinsics.areEqual(this.updated_at, currencyDetails.updated_at) && this.state == currencyDetails.state && Intrinsics.areEqual(this.state_by_region, currencyDetails.state_by_region);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.code.hashCode()) * 37) + this.name.hashCode()) * 37) + this.brand_color.hashCode()) * 37) + this.currency_type.hashCode()) * 37;
        Decimal decimal = this.Increment;
        int iHashCode2 = (((iHashCode + (decimal != null ? decimal.hashCode() : 0)) * 37) + this.crypto_metadata.hashCode()) * 37;
        Time time = this.created_at;
        int iHashCode3 = (iHashCode2 + (time != null ? time.hashCode() : 0)) * 37;
        Time time2 = this.updated_at;
        int iHashCode4 = ((((iHashCode3 + (time2 != null ? time2.hashCode() : 0)) * 37) + this.state.hashCode()) * 37) + this.state_by_region.hashCode();
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("code=" + Internal.sanitize(this.code));
        arrayList.add("name=" + Internal.sanitize(this.name));
        arrayList.add("brand_color=" + Internal.sanitize(this.brand_color));
        arrayList.add("currency_type=" + this.currency_type);
        Decimal decimal = this.Increment;
        if (decimal != null) {
            arrayList.add("Increment=" + decimal);
        }
        if (!this.crypto_metadata.isEmpty()) {
            arrayList.add("crypto_metadata=" + this.crypto_metadata);
        }
        Time time = this.created_at;
        if (time != null) {
            arrayList.add("created_at=" + time);
        }
        Time time2 = this.updated_at;
        if (time2 != null) {
            arrayList.add("updated_at=" + time2);
        }
        arrayList.add("state=" + this.state);
        if (!this.state_by_region.isEmpty()) {
            arrayList.add("state_by_region=" + this.state_by_region);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CurrencyDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CurrencyDetails copy$default(CurrencyDetails currencyDetails, String str, String str2, String str3, CurrencyType currencyType, Decimal decimal, Map map, Time time, Time time2, InstrumentState instrumentState, Map map2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = currencyDetails.code;
        }
        if ((i & 2) != 0) {
            str2 = currencyDetails.name;
        }
        if ((i & 4) != 0) {
            str3 = currencyDetails.brand_color;
        }
        if ((i & 8) != 0) {
            currencyType = currencyDetails.currency_type;
        }
        if ((i & 16) != 0) {
            decimal = currencyDetails.Increment;
        }
        if ((i & 32) != 0) {
            map = currencyDetails.crypto_metadata;
        }
        if ((i & 64) != 0) {
            time = currencyDetails.created_at;
        }
        if ((i & 128) != 0) {
            time2 = currencyDetails.updated_at;
        }
        if ((i & 256) != 0) {
            instrumentState = currencyDetails.state;
        }
        if ((i & 512) != 0) {
            map2 = currencyDetails.state_by_region;
        }
        if ((i & 1024) != 0) {
            byteString = currencyDetails.unknownFields();
        }
        Map map3 = map2;
        ByteString byteString2 = byteString;
        Time time3 = time2;
        InstrumentState instrumentState2 = instrumentState;
        Map map4 = map;
        Time time4 = time;
        Decimal decimal2 = decimal;
        String str4 = str3;
        return currencyDetails.copy(str, str2, str4, currencyType, decimal2, map4, time4, time3, instrumentState2, map3, byteString2);
    }

    public final CurrencyDetails copy(String code, String name, String brand_color, CurrencyType currency_type, Decimal Increment, Map<String, String> crypto_metadata, Time created_at, Time updated_at, InstrumentState state, Map<String, ? extends InstrumentState> state_by_region, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(brand_color, "brand_color");
        Intrinsics.checkNotNullParameter(currency_type, "currency_type");
        Intrinsics.checkNotNullParameter(crypto_metadata, "crypto_metadata");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(state_by_region, "state_by_region");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CurrencyDetails(code, name, brand_color, currency_type, Increment, crypto_metadata, created_at, updated_at, state, state_by_region, unknownFields);
    }
}
