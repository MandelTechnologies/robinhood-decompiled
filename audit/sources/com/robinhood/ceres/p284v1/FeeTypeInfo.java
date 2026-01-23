package com.robinhood.ceres.p284v1;

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

/* compiled from: FeeTypeInfo.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,Bo\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010$\u001a\u00020\u0002H\u0017J\u0013\u0010%\u001a\u00020\u00072\b\u0010&\u001a\u0004\u0018\u00010'H\u0096\u0002J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u0004H\u0016Jn\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0019R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\r\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u0006-"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FeeTypeInfo;", "Lcom/squareup/wire/Message;", "", "fee_type_name", "", "description", "is_active", "", "allow_override_schedules", "funding_destination", "Lcom/robinhood/ceres/v1/FeeTypeFundingDestination;", "fee_charge_event_type", "Lcom/robinhood/ceres/v1/FeeChargeEventType;", "supports_default_fees", "locality", "Lcom/robinhood/ceres/v1/Locality;", "exchange_source", "Lcom/robinhood/ceres/v1/ExchangeSource;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLcom/robinhood/ceres/v1/FeeTypeFundingDestination;Lcom/robinhood/ceres/v1/FeeChargeEventType;ZLcom/robinhood/ceres/v1/Locality;Lcom/robinhood/ceres/v1/ExchangeSource;Lokio/ByteString;)V", "getFee_type_name", "()Ljava/lang/String;", "getDescription", "()Z", "getAllow_override_schedules", "getFunding_destination", "()Lcom/robinhood/ceres/v1/FeeTypeFundingDestination;", "getFee_charge_event_type", "()Lcom/robinhood/ceres/v1/FeeChargeEventType;", "getSupports_default_fees", "getLocality", "()Lcom/robinhood/ceres/v1/Locality;", "getExchange_source", "()Lcom/robinhood/ceres/v1/ExchangeSource;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class FeeTypeInfo extends Message {

    @JvmField
    public static final ProtoAdapter<FeeTypeInfo> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "allowOverrideSchedules", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final boolean allow_override_schedules;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String description;

    @WireField(adapter = "com.robinhood.ceres.v1.ExchangeSource#ADAPTER", jsonName = "exchangeSource", schemaIndex = 8, tag = 10)
    private final ExchangeSource exchange_source;

    @WireField(adapter = "com.robinhood.ceres.v1.FeeChargeEventType#ADAPTER", jsonName = "feeChargeEventType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final FeeChargeEventType fee_charge_event_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "feeTypeName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String fee_type_name;

    @WireField(adapter = "com.robinhood.ceres.v1.FeeTypeFundingDestination#ADAPTER", jsonName = "fundingDestination", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final FeeTypeFundingDestination funding_destination;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isActive", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean is_active;

    @WireField(adapter = "com.robinhood.ceres.v1.Locality#ADAPTER", schemaIndex = 7, tag = 9)
    private final Locality locality;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "supportsDefaultFees", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 8)
    private final boolean supports_default_fees;

    public FeeTypeInfo() {
        this(null, null, false, false, null, null, false, null, null, null, 1023, null);
    }

    public /* synthetic */ FeeTypeInfo(String str, String str2, boolean z, boolean z2, FeeTypeFundingDestination feeTypeFundingDestination, FeeChargeEventType feeChargeEventType, boolean z3, Locality locality, ExchangeSource exchangeSource, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? FeeTypeFundingDestination.FEE_TYPE_FUNDING_DESTINATION_UNSPECIFIED : feeTypeFundingDestination, (i & 32) != 0 ? FeeChargeEventType.FEE_CHARGE_EVENT_TYPE_UNSPECIFIED : feeChargeEventType, (i & 64) != 0 ? false : z3, (i & 128) != 0 ? null : locality, (i & 256) != 0 ? null : exchangeSource, (i & 512) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20305newBuilder();
    }

    public final String getFee_type_name() {
        return this.fee_type_name;
    }

    public final String getDescription() {
        return this.description;
    }

    /* renamed from: is_active, reason: from getter */
    public final boolean getIs_active() {
        return this.is_active;
    }

    public final boolean getAllow_override_schedules() {
        return this.allow_override_schedules;
    }

    public final FeeTypeFundingDestination getFunding_destination() {
        return this.funding_destination;
    }

    public final FeeChargeEventType getFee_charge_event_type() {
        return this.fee_charge_event_type;
    }

    public final boolean getSupports_default_fees() {
        return this.supports_default_fees;
    }

    public final Locality getLocality() {
        return this.locality;
    }

    public final ExchangeSource getExchange_source() {
        return this.exchange_source;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeeTypeInfo(String fee_type_name, String description, boolean z, boolean z2, FeeTypeFundingDestination funding_destination, FeeChargeEventType fee_charge_event_type, boolean z3, Locality locality, ExchangeSource exchangeSource, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(fee_type_name, "fee_type_name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(funding_destination, "funding_destination");
        Intrinsics.checkNotNullParameter(fee_charge_event_type, "fee_charge_event_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.fee_type_name = fee_type_name;
        this.description = description;
        this.is_active = z;
        this.allow_override_schedules = z2;
        this.funding_destination = funding_destination;
        this.fee_charge_event_type = fee_charge_event_type;
        this.supports_default_fees = z3;
        this.locality = locality;
        this.exchange_source = exchangeSource;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20305newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FeeTypeInfo)) {
            return false;
        }
        FeeTypeInfo feeTypeInfo = (FeeTypeInfo) other;
        return Intrinsics.areEqual(unknownFields(), feeTypeInfo.unknownFields()) && Intrinsics.areEqual(this.fee_type_name, feeTypeInfo.fee_type_name) && Intrinsics.areEqual(this.description, feeTypeInfo.description) && this.is_active == feeTypeInfo.is_active && this.allow_override_schedules == feeTypeInfo.allow_override_schedules && this.funding_destination == feeTypeInfo.funding_destination && this.fee_charge_event_type == feeTypeInfo.fee_charge_event_type && this.supports_default_fees == feeTypeInfo.supports_default_fees && this.locality == feeTypeInfo.locality && this.exchange_source == feeTypeInfo.exchange_source;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((((unknownFields().hashCode() * 37) + this.fee_type_name.hashCode()) * 37) + this.description.hashCode()) * 37) + Boolean.hashCode(this.is_active)) * 37) + Boolean.hashCode(this.allow_override_schedules)) * 37) + this.funding_destination.hashCode()) * 37) + this.fee_charge_event_type.hashCode()) * 37) + Boolean.hashCode(this.supports_default_fees)) * 37;
        Locality locality = this.locality;
        int iHashCode2 = (iHashCode + (locality != null ? locality.hashCode() : 0)) * 37;
        ExchangeSource exchangeSource = this.exchange_source;
        int iHashCode3 = iHashCode2 + (exchangeSource != null ? exchangeSource.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("fee_type_name=" + Internal.sanitize(this.fee_type_name));
        arrayList.add("description=" + Internal.sanitize(this.description));
        arrayList.add("is_active=" + this.is_active);
        arrayList.add("allow_override_schedules=" + this.allow_override_schedules);
        arrayList.add("funding_destination=" + this.funding_destination);
        arrayList.add("fee_charge_event_type=" + this.fee_charge_event_type);
        arrayList.add("supports_default_fees=" + this.supports_default_fees);
        Locality locality = this.locality;
        if (locality != null) {
            arrayList.add("locality=" + locality);
        }
        ExchangeSource exchangeSource = this.exchange_source;
        if (exchangeSource != null) {
            arrayList.add("exchange_source=" + exchangeSource);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FeeTypeInfo{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ FeeTypeInfo copy$default(FeeTypeInfo feeTypeInfo, String str, String str2, boolean z, boolean z2, FeeTypeFundingDestination feeTypeFundingDestination, FeeChargeEventType feeChargeEventType, boolean z3, Locality locality, ExchangeSource exchangeSource, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feeTypeInfo.fee_type_name;
        }
        if ((i & 2) != 0) {
            str2 = feeTypeInfo.description;
        }
        if ((i & 4) != 0) {
            z = feeTypeInfo.is_active;
        }
        if ((i & 8) != 0) {
            z2 = feeTypeInfo.allow_override_schedules;
        }
        if ((i & 16) != 0) {
            feeTypeFundingDestination = feeTypeInfo.funding_destination;
        }
        if ((i & 32) != 0) {
            feeChargeEventType = feeTypeInfo.fee_charge_event_type;
        }
        if ((i & 64) != 0) {
            z3 = feeTypeInfo.supports_default_fees;
        }
        if ((i & 128) != 0) {
            locality = feeTypeInfo.locality;
        }
        if ((i & 256) != 0) {
            exchangeSource = feeTypeInfo.exchange_source;
        }
        if ((i & 512) != 0) {
            byteString = feeTypeInfo.unknownFields();
        }
        ExchangeSource exchangeSource2 = exchangeSource;
        ByteString byteString2 = byteString;
        boolean z4 = z3;
        Locality locality2 = locality;
        FeeTypeFundingDestination feeTypeFundingDestination2 = feeTypeFundingDestination;
        FeeChargeEventType feeChargeEventType2 = feeChargeEventType;
        return feeTypeInfo.copy(str, str2, z, z2, feeTypeFundingDestination2, feeChargeEventType2, z4, locality2, exchangeSource2, byteString2);
    }

    public final FeeTypeInfo copy(String fee_type_name, String description, boolean is_active, boolean allow_override_schedules, FeeTypeFundingDestination funding_destination, FeeChargeEventType fee_charge_event_type, boolean supports_default_fees, Locality locality, ExchangeSource exchange_source, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(fee_type_name, "fee_type_name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(funding_destination, "funding_destination");
        Intrinsics.checkNotNullParameter(fee_charge_event_type, "fee_charge_event_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FeeTypeInfo(fee_type_name, description, is_active, allow_override_schedules, funding_destination, fee_charge_event_type, supports_default_fees, locality, exchange_source, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FeeTypeInfo.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FeeTypeInfo>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.FeeTypeInfo$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FeeTypeInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getFee_type_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getFee_type_name());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getDescription());
                }
                if (value.getIs_active()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getIs_active()));
                }
                if (value.getAllow_override_schedules()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.getAllow_override_schedules()));
                }
                if (value.getFunding_destination() != FeeTypeFundingDestination.FEE_TYPE_FUNDING_DESTINATION_UNSPECIFIED) {
                    size += FeeTypeFundingDestination.ADAPTER.encodedSizeWithTag(5, value.getFunding_destination());
                }
                if (value.getFee_charge_event_type() != FeeChargeEventType.FEE_CHARGE_EVENT_TYPE_UNSPECIFIED) {
                    size += FeeChargeEventType.ADAPTER.encodedSizeWithTag(6, value.getFee_charge_event_type());
                }
                if (value.getSupports_default_fees()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(8, Boolean.valueOf(value.getSupports_default_fees()));
                }
                return size + Locality.ADAPTER.encodedSizeWithTag(9, value.getLocality()) + ExchangeSource.ADAPTER.encodedSizeWithTag(10, value.getExchange_source());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FeeTypeInfo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getFee_type_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getFee_type_name());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDescription());
                }
                if (value.getIs_active()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getIs_active()));
                }
                if (value.getAllow_override_schedules()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getAllow_override_schedules()));
                }
                if (value.getFunding_destination() != FeeTypeFundingDestination.FEE_TYPE_FUNDING_DESTINATION_UNSPECIFIED) {
                    FeeTypeFundingDestination.ADAPTER.encodeWithTag(writer, 5, (int) value.getFunding_destination());
                }
                if (value.getFee_charge_event_type() != FeeChargeEventType.FEE_CHARGE_EVENT_TYPE_UNSPECIFIED) {
                    FeeChargeEventType.ADAPTER.encodeWithTag(writer, 6, (int) value.getFee_charge_event_type());
                }
                if (value.getSupports_default_fees()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 8, (int) Boolean.valueOf(value.getSupports_default_fees()));
                }
                Locality.ADAPTER.encodeWithTag(writer, 9, (int) value.getLocality());
                ExchangeSource.ADAPTER.encodeWithTag(writer, 10, (int) value.getExchange_source());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FeeTypeInfo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ExchangeSource.ADAPTER.encodeWithTag(writer, 10, (int) value.getExchange_source());
                Locality.ADAPTER.encodeWithTag(writer, 9, (int) value.getLocality());
                if (value.getSupports_default_fees()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 8, (int) Boolean.valueOf(value.getSupports_default_fees()));
                }
                if (value.getFee_charge_event_type() != FeeChargeEventType.FEE_CHARGE_EVENT_TYPE_UNSPECIFIED) {
                    FeeChargeEventType.ADAPTER.encodeWithTag(writer, 6, (int) value.getFee_charge_event_type());
                }
                if (value.getFunding_destination() != FeeTypeFundingDestination.FEE_TYPE_FUNDING_DESTINATION_UNSPECIFIED) {
                    FeeTypeFundingDestination.ADAPTER.encodeWithTag(writer, 5, (int) value.getFunding_destination());
                }
                if (value.getAllow_override_schedules()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getAllow_override_schedules()));
                }
                if (value.getIs_active()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getIs_active()));
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDescription());
                }
                if (Intrinsics.areEqual(value.getFee_type_name(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getFee_type_name());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public FeeTypeInfo decode(ProtoReader reader) throws IOException {
                FeeChargeEventType feeChargeEventType;
                String str;
                String str2;
                Intrinsics.checkNotNullParameter(reader, "reader");
                FeeTypeFundingDestination feeTypeFundingDestination = FeeTypeFundingDestination.FEE_TYPE_FUNDING_DESTINATION_UNSPECIFIED;
                FeeChargeEventType feeChargeEventType2 = FeeChargeEventType.FEE_CHARGE_EVENT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                boolean zBooleanValue3 = false;
                Locality localityDecode = null;
                ExchangeSource exchangeSourceDecode = null;
                String strDecode = "";
                String strDecode2 = strDecode;
                FeeChargeEventType feeChargeEventTypeDecode = feeChargeEventType2;
                FeeTypeFundingDestination feeTypeFundingDestinationDecode = feeTypeFundingDestination;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 4:
                                zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 5:
                                feeChargeEventType = feeChargeEventTypeDecode;
                                str = strDecode;
                                str2 = strDecode2;
                                try {
                                    feeTypeFundingDestinationDecode = FeeTypeFundingDestination.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                                strDecode2 = str2;
                                feeChargeEventTypeDecode = feeChargeEventType;
                                strDecode = str;
                                break;
                            case 6:
                                feeChargeEventType = feeChargeEventTypeDecode;
                                str = strDecode;
                                str2 = strDecode2;
                                try {
                                    feeChargeEventTypeDecode = FeeChargeEventType.ADAPTER.decode(reader);
                                    strDecode2 = str2;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                                strDecode = str;
                                break;
                            case 7:
                            default:
                                reader.readUnknownField(iNextTag);
                                feeChargeEventType = feeChargeEventTypeDecode;
                                str = strDecode;
                                str2 = strDecode2;
                                strDecode2 = str2;
                                feeChargeEventTypeDecode = feeChargeEventType;
                                strDecode = str;
                                break;
                            case 8:
                                zBooleanValue3 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 9:
                                feeChargeEventType = feeChargeEventTypeDecode;
                                str = strDecode;
                                try {
                                    localityDecode = Locality.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    str2 = strDecode2;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                    break;
                                }
                                feeChargeEventTypeDecode = feeChargeEventType;
                                strDecode = str;
                                break;
                            case 10:
                                try {
                                    exchangeSourceDecode = ExchangeSource.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                    feeChargeEventType = feeChargeEventTypeDecode;
                                    str = strDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                    break;
                                }
                        }
                    } else {
                        return new FeeTypeInfo(strDecode, strDecode2, zBooleanValue, zBooleanValue2, feeTypeFundingDestinationDecode, feeChargeEventTypeDecode, zBooleanValue3, localityDecode, exchangeSourceDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FeeTypeInfo redact(FeeTypeInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return FeeTypeInfo.copy$default(value, null, null, false, false, null, null, false, null, null, ByteString.EMPTY, 511, null);
            }
        };
    }
}
