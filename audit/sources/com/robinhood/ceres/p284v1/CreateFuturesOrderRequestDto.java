package com.robinhood.ceres.p284v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.ceres.p284v1.CreateFuturesOrderRequestDto;
import com.robinhood.ceres.p284v1.FuturesOrderLegRequestDto;
import com.robinhood.ceres.p284v1.OrderEntryMetadataDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.common.MoneyDto;
import com.robinhood.rosetta.mainst.ClientMarketdata;
import com.robinhood.rosetta.mainst.ClientMarketdataDto;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import p479j$.time.Instant;
import rosetta.mainst.OrderTrigger;
import rosetta.mainst.OrderTriggerDto;
import rosetta.mainst.OrderType;
import rosetta.mainst.OrderTypeDto;
import rosetta.mainst.TimeInForce;
import rosetta.mainst.TimeInForceDto;

/* compiled from: CreateFuturesOrderRequestDto.kt */
@Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\"\b\u0007\u0018\u0000 T2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004UTVWB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BÇ\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0018\u001a\u00020\b\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u0010\b\u0002\u0010!\u001a\n\u0018\u00010\u001fj\u0004\u0018\u0001` \u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b\u0006\u0010%JË\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0018\u001a\u00020\b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0010\b\u0002\u0010!\u001a\n\u0018\u00010\u001fj\u0004\u0018\u0001` 2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0002H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\bH\u0016¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020\u001b2\b\u0010-\u001a\u0004\u0018\u00010,H\u0096\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u001f\u00107\u001a\u0002062\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u000200H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u000200H\u0016¢\u0006\u0004\b9\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010:R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b;\u0010+R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b@\u0010?R\u0011\u0010\u0011\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0011\u0010\u0013\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0011\u0010\u0015\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\bG\u0010?R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\bH\u0010?R\u0011\u0010\u0018\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bI\u0010+R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010LR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0019\u0010!\u001a\n\u0018\u00010\u001fj\u0004\u0018\u0001` 8F¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0013\u0010\"\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bQ\u0010+R\u0013\u0010$\u001a\u0004\u0018\u00010#8F¢\u0006\u0006\u001a\u0004\bR\u0010S¨\u0006X"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CreateFuturesOrderRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/ceres/v1/CreateFuturesOrderRequest;", "Landroid/os/Parcelable;", "Lcom/robinhood/ceres/v1/CreateFuturesOrderRequestDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/ceres/v1/CreateFuturesOrderRequestDto$Surrogate;)V", "", "account_id", "", "Lcom/robinhood/ceres/v1/FuturesOrderLegRequestDto;", "legs", "Lcom/robinhood/idl/IdlDecimal;", "quantity", "max_show", "Lrosetta/mainst/OrderTypeDto;", "order_type", "Lrosetta/mainst/OrderTriggerDto;", "order_trigger", "Lrosetta/mainst/TimeInForceDto;", "time_in_force", "limit_price", "stop_price", "ref_id", "Lcom/robinhood/rosetta/mainst/ClientMarketdataDto;", "client_marketdata", "", "is_auto_send_enabled", "Lcom/robinhood/rosetta/common/MoneyDto;", "entered_notional_amount", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "gtd_expiration_time", "quote_id", "Lcom/robinhood/ceres/v1/OrderEntryMetadataDto;", "order_entry_metadata", "(Ljava/lang/String;Ljava/util/List;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lrosetta/mainst/OrderTypeDto;Lrosetta/mainst/OrderTriggerDto;Lrosetta/mainst/TimeInForceDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/ClientMarketdataDto;Ljava/lang/Boolean;Lcom/robinhood/rosetta/common/MoneyDto;Lj$/time/Instant;Ljava/lang/String;Lcom/robinhood/ceres/v1/OrderEntryMetadataDto;)V", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lrosetta/mainst/OrderTypeDto;Lrosetta/mainst/OrderTriggerDto;Lrosetta/mainst/TimeInForceDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/ClientMarketdataDto;Ljava/lang/Boolean;Lcom/robinhood/rosetta/common/MoneyDto;Lj$/time/Instant;Ljava/lang/String;Lcom/robinhood/ceres/v1/OrderEntryMetadataDto;)Lcom/robinhood/ceres/v1/CreateFuturesOrderRequestDto;", "toProto", "()Lcom/robinhood/ceres/v1/CreateFuturesOrderRequest;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/ceres/v1/CreateFuturesOrderRequestDto$Surrogate;", "getAccount_id", "getLegs", "()Ljava/util/List;", "getQuantity", "()Lcom/robinhood/idl/IdlDecimal;", "getMax_show", "getOrder_type", "()Lrosetta/mainst/OrderTypeDto;", "getOrder_trigger", "()Lrosetta/mainst/OrderTriggerDto;", "getTime_in_force", "()Lrosetta/mainst/TimeInForceDto;", "getLimit_price", "getStop_price", "getRef_id", "getClient_marketdata", "()Lcom/robinhood/rosetta/mainst/ClientMarketdataDto;", "()Ljava/lang/Boolean;", "getEntered_notional_amount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getGtd_expiration_time", "()Lj$/time/Instant;", "getQuote_id", "getOrder_entry_metadata", "()Lcom/robinhood/ceres/v1/OrderEntryMetadataDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class CreateFuturesOrderRequestDto implements Dto3<CreateFuturesOrderRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CreateFuturesOrderRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CreateFuturesOrderRequestDto, CreateFuturesOrderRequest>> binaryBase64Serializer$delegate;
    private static final CreateFuturesOrderRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CreateFuturesOrderRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CreateFuturesOrderRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getAccount_id() {
        return this.surrogate.getAccount_id();
    }

    public final List<FuturesOrderLegRequestDto> getLegs() {
        return this.surrogate.getLegs();
    }

    public final IdlDecimal getQuantity() {
        return this.surrogate.getQuantity();
    }

    public final IdlDecimal getMax_show() {
        return this.surrogate.getMax_show();
    }

    public final OrderTypeDto getOrder_type() {
        return this.surrogate.getOrder_type();
    }

    public final OrderTriggerDto getOrder_trigger() {
        return this.surrogate.getOrder_trigger();
    }

    public final TimeInForceDto getTime_in_force() {
        return this.surrogate.getTime_in_force();
    }

    public final IdlDecimal getLimit_price() {
        return this.surrogate.getLimit_price();
    }

    public final IdlDecimal getStop_price() {
        return this.surrogate.getStop_price();
    }

    public final String getRef_id() {
        return this.surrogate.getRef_id();
    }

    public final ClientMarketdataDto getClient_marketdata() {
        return this.surrogate.getClient_marketdata();
    }

    public final Boolean is_auto_send_enabled() {
        return this.surrogate.is_auto_send_enabled();
    }

    public final MoneyDto getEntered_notional_amount() {
        return this.surrogate.getEntered_notional_amount();
    }

    public final Instant getGtd_expiration_time() {
        return this.surrogate.getGtd_expiration_time();
    }

    public final String getQuote_id() {
        return this.surrogate.getQuote_id();
    }

    public final OrderEntryMetadataDto getOrder_entry_metadata() {
        return this.surrogate.getOrder_entry_metadata();
    }

    public /* synthetic */ CreateFuturesOrderRequestDto(String str, List list, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, OrderTypeDto orderTypeDto, OrderTriggerDto orderTriggerDto, TimeInForceDto timeInForceDto, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, String str2, ClientMarketdataDto clientMarketdataDto, Boolean bool, MoneyDto moneyDto, Instant instant, String str3, OrderEntryMetadataDto orderEntryMetadataDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? new IdlDecimal("") : idlDecimal, (i & 8) != 0 ? null : idlDecimal2, (i & 16) != 0 ? OrderTypeDto.INSTANCE.getZeroValue() : orderTypeDto, (i & 32) != 0 ? OrderTriggerDto.INSTANCE.getZeroValue() : orderTriggerDto, (i & 64) != 0 ? TimeInForceDto.INSTANCE.getZeroValue() : timeInForceDto, (i & 128) != 0 ? null : idlDecimal3, (i & 256) != 0 ? null : idlDecimal4, (i & 512) == 0 ? str2 : "", (i & 1024) != 0 ? null : clientMarketdataDto, (i & 2048) != 0 ? null : bool, (i & 4096) != 0 ? null : moneyDto, (i & 8192) != 0 ? null : instant, (i & 16384) != 0 ? null : str3, (i & 32768) != 0 ? null : orderEntryMetadataDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreateFuturesOrderRequestDto(String account_id, List<FuturesOrderLegRequestDto> legs, IdlDecimal quantity, IdlDecimal idlDecimal, OrderTypeDto order_type, OrderTriggerDto order_trigger, TimeInForceDto time_in_force, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, String ref_id, ClientMarketdataDto clientMarketdataDto, Boolean bool, MoneyDto moneyDto, Instant instant, String str, OrderEntryMetadataDto orderEntryMetadataDto) {
        this(new Surrogate(account_id, legs, quantity, idlDecimal, order_type, order_trigger, time_in_force, idlDecimal2, idlDecimal3, ref_id, clientMarketdataDto, bool, moneyDto, instant, str, orderEntryMetadataDto));
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(legs, "legs");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(order_type, "order_type");
        Intrinsics.checkNotNullParameter(order_trigger, "order_trigger");
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
    }

    public final CreateFuturesOrderRequestDto copy(String account_id, List<FuturesOrderLegRequestDto> legs, IdlDecimal quantity, IdlDecimal max_show, OrderTypeDto order_type, OrderTriggerDto order_trigger, TimeInForceDto time_in_force, IdlDecimal limit_price, IdlDecimal stop_price, String ref_id, ClientMarketdataDto client_marketdata, Boolean is_auto_send_enabled, MoneyDto entered_notional_amount, Instant gtd_expiration_time, String quote_id, OrderEntryMetadataDto order_entry_metadata) {
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(legs, "legs");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(order_type, "order_type");
        Intrinsics.checkNotNullParameter(order_trigger, "order_trigger");
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        return new CreateFuturesOrderRequestDto(new Surrogate(account_id, legs, quantity, max_show, order_type, order_trigger, time_in_force, limit_price, stop_price, ref_id, client_marketdata, is_auto_send_enabled, entered_notional_amount, gtd_expiration_time, quote_id, order_entry_metadata));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public CreateFuturesOrderRequest toProto() {
        String account_id = this.surrogate.getAccount_id();
        List<FuturesOrderLegRequestDto> legs = this.surrogate.getLegs();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(legs, 10));
        Iterator<T> it = legs.iterator();
        while (it.hasNext()) {
            arrayList.add(((FuturesOrderLegRequestDto) it.next()).toProto());
        }
        String stringValue = this.surrogate.getQuantity().getStringValue();
        IdlDecimal max_show = this.surrogate.getMax_show();
        String stringValue2 = max_show != null ? max_show.getStringValue() : null;
        OrderType orderType = (OrderType) this.surrogate.getOrder_type().toProto();
        OrderTrigger orderTrigger = (OrderTrigger) this.surrogate.getOrder_trigger().toProto();
        TimeInForce timeInForce = (TimeInForce) this.surrogate.getTime_in_force().toProto();
        IdlDecimal limit_price = this.surrogate.getLimit_price();
        String stringValue3 = limit_price != null ? limit_price.getStringValue() : null;
        IdlDecimal stop_price = this.surrogate.getStop_price();
        String stringValue4 = stop_price != null ? stop_price.getStringValue() : null;
        String ref_id = this.surrogate.getRef_id();
        ClientMarketdataDto client_marketdata = this.surrogate.getClient_marketdata();
        ClientMarketdata proto = client_marketdata != null ? client_marketdata.toProto() : null;
        Boolean boolIs_auto_send_enabled = this.surrogate.is_auto_send_enabled();
        MoneyDto entered_notional_amount = this.surrogate.getEntered_notional_amount();
        Money proto2 = entered_notional_amount != null ? entered_notional_amount.toProto() : null;
        Instant gtd_expiration_time = this.surrogate.getGtd_expiration_time();
        String quote_id = this.surrogate.getQuote_id();
        OrderEntryMetadataDto order_entry_metadata = this.surrogate.getOrder_entry_metadata();
        return new CreateFuturesOrderRequest(account_id, arrayList, stringValue, stringValue2, orderType, orderTrigger, timeInForce, stringValue3, stringValue4, ref_id, proto, boolIs_auto_send_enabled, proto2, gtd_expiration_time, quote_id, order_entry_metadata != null ? order_entry_metadata.toProto() : null, null, 65536, null);
    }

    public String toString() {
        return "[CreateFuturesOrderRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CreateFuturesOrderRequestDto) && Intrinsics.areEqual(((CreateFuturesOrderRequestDto) other).surrogate, this.surrogate);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CreateFuturesOrderRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\bT\b\u0083\b\u0018\u0000 \u0081\u00012\u00020\u0001:\u0004\u0082\u0001\u0081\u0001B\u009f\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0017\b\u0002\u0010\u000b\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\u0019\b\u0002\u0010\f\u001a\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\u0019\b\u0002\u0010\u0013\u001a\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\u0019\b\u0002\u0010\u0014\u001a\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012.\b\u0002\u0010\u001f\u001a(\u0018\u00010\u001cj\u0013\u0018\u0001`\u001d¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\u001e¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\u001e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$BÁ\u0001\b\u0010\u0012\u0006\u0010&\u001a\u00020%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b#\u0010)J'\u00102\u001a\u00020/2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0001¢\u0006\u0004\b0\u00101J\u0010\u00103\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b3\u00104J\u0016\u00105\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b5\u00106J\u001f\u00107\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003¢\u0006\u0004\b7\u00108J!\u00109\u001a\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003¢\u0006\u0004\b9\u00108J\u0010\u0010:\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b>\u0010?J!\u0010@\u001a\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003¢\u0006\u0004\b@\u00108J!\u0010A\u001a\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003¢\u0006\u0004\bA\u00108J\u0010\u0010B\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bB\u00104J\u0012\u0010C\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\bC\u0010DJ\u0012\u0010E\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\bE\u0010FJ\u0012\u0010G\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\bG\u0010HJ6\u0010I\u001a(\u0018\u00010\u001cj\u0013\u0018\u0001`\u001d¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\u001e¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\u001eHÆ\u0003¢\u0006\u0004\bI\u0010JJ\u0012\u0010K\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bK\u00104J\u0012\u0010L\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0004\bL\u0010MJ¨\u0002\u0010N\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0017\b\u0002\u0010\u000b\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\u0019\b\u0002\u0010\f\u001a\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0019\b\u0002\u0010\u0013\u001a\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\u0019\b\u0002\u0010\u0014\u001a\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\b\b\u0002\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2.\b\u0002\u0010\u001f\u001a(\u0018\u00010\u001cj\u0013\u0018\u0001`\u001d¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\u001e¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!HÆ\u0001¢\u0006\u0004\bN\u0010OJ\u0010\u0010P\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bP\u00104J\u0010\u0010Q\u001a\u00020%HÖ\u0001¢\u0006\u0004\bQ\u0010RJ\u001a\u0010T\u001a\u00020\u00182\b\u0010S\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bT\u0010UR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010V\u0012\u0004\bX\u0010Y\u001a\u0004\bW\u00104R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010Z\u0012\u0004\b\\\u0010Y\u001a\u0004\b[\u00106R/\u0010\u000b\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010]\u0012\u0004\b_\u0010Y\u001a\u0004\b^\u00108R1\u0010\f\u001a\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010]\u0012\u0004\ba\u0010Y\u001a\u0004\b`\u00108R \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010b\u0012\u0004\bd\u0010Y\u001a\u0004\bc\u0010;R \u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010e\u0012\u0004\bg\u0010Y\u001a\u0004\bf\u0010=R \u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010h\u0012\u0004\bj\u0010Y\u001a\u0004\bi\u0010?R1\u0010\u0013\u001a\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010]\u0012\u0004\bl\u0010Y\u001a\u0004\bk\u00108R1\u0010\u0014\u001a\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010]\u0012\u0004\bn\u0010Y\u001a\u0004\bm\u00108R \u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010V\u0012\u0004\bp\u0010Y\u001a\u0004\bo\u00104R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010q\u0012\u0004\bs\u0010Y\u001a\u0004\br\u0010DR\"\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010t\u0012\u0004\bu\u0010Y\u001a\u0004\b\u0019\u0010FR\"\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010v\u0012\u0004\bx\u0010Y\u001a\u0004\bw\u0010HRF\u0010\u001f\u001a(\u0018\u00010\u001cj\u0013\u0018\u0001`\u001d¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\u001e¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\u001e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010y\u0012\u0004\b{\u0010Y\u001a\u0004\bz\u0010JR\"\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010V\u0012\u0004\b}\u0010Y\u001a\u0004\b|\u00104R#\u0010\"\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\u0013\n\u0004\b\"\u0010~\u0012\u0005\b\u0080\u0001\u0010Y\u001a\u0004\b\u007f\u0010M¨\u0006\u0083\u0001"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CreateFuturesOrderRequestDto$Surrogate;", "", "", "account_id", "", "Lcom/robinhood/ceres/v1/FuturesOrderLegRequestDto;", "legs", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "quantity", "max_show", "Lrosetta/mainst/OrderTypeDto;", "order_type", "Lrosetta/mainst/OrderTriggerDto;", "order_trigger", "Lrosetta/mainst/TimeInForceDto;", "time_in_force", "limit_price", "stop_price", "ref_id", "Lcom/robinhood/rosetta/mainst/ClientMarketdataDto;", "client_marketdata", "", "is_auto_send_enabled", "Lcom/robinhood/rosetta/common/MoneyDto;", "entered_notional_amount", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "gtd_expiration_time", "quote_id", "Lcom/robinhood/ceres/v1/OrderEntryMetadataDto;", "order_entry_metadata", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lrosetta/mainst/OrderTypeDto;Lrosetta/mainst/OrderTriggerDto;Lrosetta/mainst/TimeInForceDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/ClientMarketdataDto;Ljava/lang/Boolean;Lcom/robinhood/rosetta/common/MoneyDto;Lj$/time/Instant;Ljava/lang/String;Lcom/robinhood/ceres/v1/OrderEntryMetadataDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lrosetta/mainst/OrderTypeDto;Lrosetta/mainst/OrderTriggerDto;Lrosetta/mainst/TimeInForceDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/ClientMarketdataDto;Ljava/lang/Boolean;Lcom/robinhood/rosetta/common/MoneyDto;Lj$/time/Instant;Ljava/lang/String;Lcom/robinhood/ceres/v1/OrderEntryMetadataDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$ceres_v1_externalRelease", "(Lcom/robinhood/ceres/v1/CreateFuturesOrderRequestDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/robinhood/idl/IdlDecimal;", "component4", "component5", "()Lrosetta/mainst/OrderTypeDto;", "component6", "()Lrosetta/mainst/OrderTriggerDto;", "component7", "()Lrosetta/mainst/TimeInForceDto;", "component8", "component9", "component10", "component11", "()Lcom/robinhood/rosetta/mainst/ClientMarketdataDto;", "component12", "()Ljava/lang/Boolean;", "component13", "()Lcom/robinhood/rosetta/common/MoneyDto;", "component14", "()Lj$/time/Instant;", "component15", "component16", "()Lcom/robinhood/ceres/v1/OrderEntryMetadataDto;", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lrosetta/mainst/OrderTypeDto;Lrosetta/mainst/OrderTriggerDto;Lrosetta/mainst/TimeInForceDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/ClientMarketdataDto;Ljava/lang/Boolean;Lcom/robinhood/rosetta/common/MoneyDto;Lj$/time/Instant;Ljava/lang/String;Lcom/robinhood/ceres/v1/OrderEntryMetadataDto;)Lcom/robinhood/ceres/v1/CreateFuturesOrderRequestDto$Surrogate;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccount_id", "getAccount_id$annotations", "()V", "Ljava/util/List;", "getLegs", "getLegs$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getQuantity", "getQuantity$annotations", "getMax_show", "getMax_show$annotations", "Lrosetta/mainst/OrderTypeDto;", "getOrder_type", "getOrder_type$annotations", "Lrosetta/mainst/OrderTriggerDto;", "getOrder_trigger", "getOrder_trigger$annotations", "Lrosetta/mainst/TimeInForceDto;", "getTime_in_force", "getTime_in_force$annotations", "getLimit_price", "getLimit_price$annotations", "getStop_price", "getStop_price$annotations", "getRef_id", "getRef_id$annotations", "Lcom/robinhood/rosetta/mainst/ClientMarketdataDto;", "getClient_marketdata", "getClient_marketdata$annotations", "Ljava/lang/Boolean;", "is_auto_send_enabled$annotations", "Lcom/robinhood/rosetta/common/MoneyDto;", "getEntered_notional_amount", "getEntered_notional_amount$annotations", "Lj$/time/Instant;", "getGtd_expiration_time", "getGtd_expiration_time$annotations", "getQuote_id", "getQuote_id$annotations", "Lcom/robinhood/ceres/v1/OrderEntryMetadataDto;", "getOrder_entry_metadata", "getOrder_entry_metadata$annotations", "Companion", "$serializer", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    public static final /* data */ class Surrogate {
        private final String account_id;
        private final ClientMarketdataDto client_marketdata;
        private final MoneyDto entered_notional_amount;
        private final Instant gtd_expiration_time;
        private final Boolean is_auto_send_enabled;
        private final List<FuturesOrderLegRequestDto> legs;
        private final IdlDecimal limit_price;
        private final IdlDecimal max_show;
        private final OrderEntryMetadataDto order_entry_metadata;
        private final OrderTriggerDto order_trigger;
        private final OrderTypeDto order_type;
        private final IdlDecimal quantity;
        private final String quote_id;
        private final String ref_id;
        private final IdlDecimal stop_price;
        private final TimeInForceDto time_in_force;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.ceres.v1.CreateFuturesOrderRequestDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateFuturesOrderRequestDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null, null, null, null, null, null, null, null, null, null, null, null};

        public Surrogate() {
            this((String) null, (List) null, (IdlDecimal) null, (IdlDecimal) null, (OrderTypeDto) null, (OrderTriggerDto) null, (TimeInForceDto) null, (IdlDecimal) null, (IdlDecimal) null, (String) null, (ClientMarketdataDto) null, (Boolean) null, (MoneyDto) null, (Instant) null, (String) null, (OrderEntryMetadataDto) null, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(FuturesOrderLegRequestDto.Serializer.INSTANCE);
        }

        @SerialName("accountId")
        @JsonAnnotations2(names = {"account_id"})
        public static /* synthetic */ void getAccount_id$annotations() {
        }

        @SerialName("clientMarketdata")
        @JsonAnnotations2(names = {"client_marketdata"})
        public static /* synthetic */ void getClient_marketdata$annotations() {
        }

        @SerialName("enteredNotionalAmount")
        @JsonAnnotations2(names = {"entered_notional_amount"})
        public static /* synthetic */ void getEntered_notional_amount$annotations() {
        }

        @SerialName("gtdExpirationTime")
        @JsonAnnotations2(names = {"gtd_expiration_time"})
        public static /* synthetic */ void getGtd_expiration_time$annotations() {
        }

        @SerialName("legs")
        @JsonAnnotations2(names = {"legs"})
        public static /* synthetic */ void getLegs$annotations() {
        }

        @SerialName("limitPrice")
        @JsonAnnotations2(names = {"limit_price"})
        public static /* synthetic */ void getLimit_price$annotations() {
        }

        @SerialName("maxShow")
        @JsonAnnotations2(names = {"max_show"})
        public static /* synthetic */ void getMax_show$annotations() {
        }

        @SerialName("orderEntryMetadata")
        @JsonAnnotations2(names = {"order_entry_metadata"})
        public static /* synthetic */ void getOrder_entry_metadata$annotations() {
        }

        @SerialName("orderTrigger")
        @JsonAnnotations2(names = {"order_trigger"})
        public static /* synthetic */ void getOrder_trigger$annotations() {
        }

        @SerialName("orderType")
        @JsonAnnotations2(names = {"order_type"})
        public static /* synthetic */ void getOrder_type$annotations() {
        }

        @SerialName("quantity")
        @JsonAnnotations2(names = {"quantity"})
        public static /* synthetic */ void getQuantity$annotations() {
        }

        @SerialName("quoteId")
        @JsonAnnotations2(names = {"quote_id"})
        public static /* synthetic */ void getQuote_id$annotations() {
        }

        @SerialName("refId")
        @JsonAnnotations2(names = {"ref_id"})
        public static /* synthetic */ void getRef_id$annotations() {
        }

        @SerialName("stopPrice")
        @JsonAnnotations2(names = {"stop_price"})
        public static /* synthetic */ void getStop_price$annotations() {
        }

        @SerialName("timeInForce")
        @JsonAnnotations2(names = {"time_in_force"})
        public static /* synthetic */ void getTime_in_force$annotations() {
        }

        @SerialName("isAutoSendEnabled")
        @JsonAnnotations2(names = {"is_auto_send_enabled"})
        public static /* synthetic */ void is_auto_send_enabled$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccount_id() {
            return this.account_id;
        }

        /* renamed from: component10, reason: from getter */
        public final String getRef_id() {
            return this.ref_id;
        }

        /* renamed from: component11, reason: from getter */
        public final ClientMarketdataDto getClient_marketdata() {
            return this.client_marketdata;
        }

        /* renamed from: component12, reason: from getter */
        public final Boolean getIs_auto_send_enabled() {
            return this.is_auto_send_enabled;
        }

        /* renamed from: component13, reason: from getter */
        public final MoneyDto getEntered_notional_amount() {
            return this.entered_notional_amount;
        }

        /* renamed from: component14, reason: from getter */
        public final Instant getGtd_expiration_time() {
            return this.gtd_expiration_time;
        }

        /* renamed from: component15, reason: from getter */
        public final String getQuote_id() {
            return this.quote_id;
        }

        /* renamed from: component16, reason: from getter */
        public final OrderEntryMetadataDto getOrder_entry_metadata() {
            return this.order_entry_metadata;
        }

        public final List<FuturesOrderLegRequestDto> component2() {
            return this.legs;
        }

        /* renamed from: component3, reason: from getter */
        public final IdlDecimal getQuantity() {
            return this.quantity;
        }

        /* renamed from: component4, reason: from getter */
        public final IdlDecimal getMax_show() {
            return this.max_show;
        }

        /* renamed from: component5, reason: from getter */
        public final OrderTypeDto getOrder_type() {
            return this.order_type;
        }

        /* renamed from: component6, reason: from getter */
        public final OrderTriggerDto getOrder_trigger() {
            return this.order_trigger;
        }

        /* renamed from: component7, reason: from getter */
        public final TimeInForceDto getTime_in_force() {
            return this.time_in_force;
        }

        /* renamed from: component8, reason: from getter */
        public final IdlDecimal getLimit_price() {
            return this.limit_price;
        }

        /* renamed from: component9, reason: from getter */
        public final IdlDecimal getStop_price() {
            return this.stop_price;
        }

        public final Surrogate copy(String account_id, List<FuturesOrderLegRequestDto> legs, IdlDecimal quantity, IdlDecimal max_show, OrderTypeDto order_type, OrderTriggerDto order_trigger, TimeInForceDto time_in_force, IdlDecimal limit_price, IdlDecimal stop_price, String ref_id, ClientMarketdataDto client_marketdata, Boolean is_auto_send_enabled, MoneyDto entered_notional_amount, Instant gtd_expiration_time, String quote_id, OrderEntryMetadataDto order_entry_metadata) {
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            Intrinsics.checkNotNullParameter(legs, "legs");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(order_type, "order_type");
            Intrinsics.checkNotNullParameter(order_trigger, "order_trigger");
            Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
            Intrinsics.checkNotNullParameter(ref_id, "ref_id");
            return new Surrogate(account_id, legs, quantity, max_show, order_type, order_trigger, time_in_force, limit_price, stop_price, ref_id, client_marketdata, is_auto_send_enabled, entered_notional_amount, gtd_expiration_time, quote_id, order_entry_metadata);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.account_id, surrogate.account_id) && Intrinsics.areEqual(this.legs, surrogate.legs) && Intrinsics.areEqual(this.quantity, surrogate.quantity) && Intrinsics.areEqual(this.max_show, surrogate.max_show) && this.order_type == surrogate.order_type && this.order_trigger == surrogate.order_trigger && this.time_in_force == surrogate.time_in_force && Intrinsics.areEqual(this.limit_price, surrogate.limit_price) && Intrinsics.areEqual(this.stop_price, surrogate.stop_price) && Intrinsics.areEqual(this.ref_id, surrogate.ref_id) && Intrinsics.areEqual(this.client_marketdata, surrogate.client_marketdata) && Intrinsics.areEqual(this.is_auto_send_enabled, surrogate.is_auto_send_enabled) && Intrinsics.areEqual(this.entered_notional_amount, surrogate.entered_notional_amount) && Intrinsics.areEqual(this.gtd_expiration_time, surrogate.gtd_expiration_time) && Intrinsics.areEqual(this.quote_id, surrogate.quote_id) && Intrinsics.areEqual(this.order_entry_metadata, surrogate.order_entry_metadata);
        }

        public int hashCode() {
            int iHashCode = ((((this.account_id.hashCode() * 31) + this.legs.hashCode()) * 31) + this.quantity.hashCode()) * 31;
            IdlDecimal idlDecimal = this.max_show;
            int iHashCode2 = (((((((iHashCode + (idlDecimal == null ? 0 : idlDecimal.hashCode())) * 31) + this.order_type.hashCode()) * 31) + this.order_trigger.hashCode()) * 31) + this.time_in_force.hashCode()) * 31;
            IdlDecimal idlDecimal2 = this.limit_price;
            int iHashCode3 = (iHashCode2 + (idlDecimal2 == null ? 0 : idlDecimal2.hashCode())) * 31;
            IdlDecimal idlDecimal3 = this.stop_price;
            int iHashCode4 = (((iHashCode3 + (idlDecimal3 == null ? 0 : idlDecimal3.hashCode())) * 31) + this.ref_id.hashCode()) * 31;
            ClientMarketdataDto clientMarketdataDto = this.client_marketdata;
            int iHashCode5 = (iHashCode4 + (clientMarketdataDto == null ? 0 : clientMarketdataDto.hashCode())) * 31;
            Boolean bool = this.is_auto_send_enabled;
            int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
            MoneyDto moneyDto = this.entered_notional_amount;
            int iHashCode7 = (iHashCode6 + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31;
            Instant instant = this.gtd_expiration_time;
            int iHashCode8 = (iHashCode7 + (instant == null ? 0 : instant.hashCode())) * 31;
            String str = this.quote_id;
            int iHashCode9 = (iHashCode8 + (str == null ? 0 : str.hashCode())) * 31;
            OrderEntryMetadataDto orderEntryMetadataDto = this.order_entry_metadata;
            return iHashCode9 + (orderEntryMetadataDto != null ? orderEntryMetadataDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(account_id=" + this.account_id + ", legs=" + this.legs + ", quantity=" + this.quantity + ", max_show=" + this.max_show + ", order_type=" + this.order_type + ", order_trigger=" + this.order_trigger + ", time_in_force=" + this.time_in_force + ", limit_price=" + this.limit_price + ", stop_price=" + this.stop_price + ", ref_id=" + this.ref_id + ", client_marketdata=" + this.client_marketdata + ", is_auto_send_enabled=" + this.is_auto_send_enabled + ", entered_notional_amount=" + this.entered_notional_amount + ", gtd_expiration_time=" + this.gtd_expiration_time + ", quote_id=" + this.quote_id + ", order_entry_metadata=" + this.order_entry_metadata + ")";
        }

        /* compiled from: CreateFuturesOrderRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CreateFuturesOrderRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/CreateFuturesOrderRequestDto$Surrogate;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CreateFuturesOrderRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, List list, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, OrderTypeDto orderTypeDto, OrderTriggerDto orderTriggerDto, TimeInForceDto timeInForceDto, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, String str2, ClientMarketdataDto clientMarketdataDto, Boolean bool, MoneyDto moneyDto, Instant instant, String str3, OrderEntryMetadataDto orderEntryMetadataDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.account_id = "";
            } else {
                this.account_id = str;
            }
            if ((i & 2) == 0) {
                this.legs = CollectionsKt.emptyList();
            } else {
                this.legs = list;
            }
            if ((i & 4) == 0) {
                this.quantity = new IdlDecimal("");
            } else {
                this.quantity = idlDecimal;
            }
            if ((i & 8) == 0) {
                this.max_show = null;
            } else {
                this.max_show = idlDecimal2;
            }
            if ((i & 16) == 0) {
                this.order_type = OrderTypeDto.INSTANCE.getZeroValue();
            } else {
                this.order_type = orderTypeDto;
            }
            if ((i & 32) == 0) {
                this.order_trigger = OrderTriggerDto.INSTANCE.getZeroValue();
            } else {
                this.order_trigger = orderTriggerDto;
            }
            if ((i & 64) == 0) {
                this.time_in_force = TimeInForceDto.INSTANCE.getZeroValue();
            } else {
                this.time_in_force = timeInForceDto;
            }
            if ((i & 128) == 0) {
                this.limit_price = null;
            } else {
                this.limit_price = idlDecimal3;
            }
            if ((i & 256) == 0) {
                this.stop_price = null;
            } else {
                this.stop_price = idlDecimal4;
            }
            if ((i & 512) == 0) {
                this.ref_id = "";
            } else {
                this.ref_id = str2;
            }
            if ((i & 1024) == 0) {
                this.client_marketdata = null;
            } else {
                this.client_marketdata = clientMarketdataDto;
            }
            if ((i & 2048) == 0) {
                this.is_auto_send_enabled = null;
            } else {
                this.is_auto_send_enabled = bool;
            }
            if ((i & 4096) == 0) {
                this.entered_notional_amount = null;
            } else {
                this.entered_notional_amount = moneyDto;
            }
            if ((i & 8192) == 0) {
                this.gtd_expiration_time = null;
            } else {
                this.gtd_expiration_time = instant;
            }
            if ((i & 16384) == 0) {
                this.quote_id = null;
            } else {
                this.quote_id = str3;
            }
            if ((i & 32768) == 0) {
                this.order_entry_metadata = null;
            } else {
                this.order_entry_metadata = orderEntryMetadataDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$ceres_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.account_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.account_id);
            }
            if (!Intrinsics.areEqual(self.legs, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.legs);
            }
            if (!Intrinsics.areEqual(self.quantity, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 2, IdlDecimalSerializer.INSTANCE, self.quantity);
            }
            IdlDecimal idlDecimal = self.max_show;
            if (idlDecimal != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, IdlDecimalSerializer.INSTANCE, idlDecimal);
            }
            if (self.order_type != OrderTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, OrderTypeDto.Serializer.INSTANCE, self.order_type);
            }
            if (self.order_trigger != OrderTriggerDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, OrderTriggerDto.Serializer.INSTANCE, self.order_trigger);
            }
            if (self.time_in_force != TimeInForceDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 6, TimeInForceDto.Serializer.INSTANCE, self.time_in_force);
            }
            IdlDecimal idlDecimal2 = self.limit_price;
            if (idlDecimal2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, IdlDecimalSerializer.INSTANCE, idlDecimal2);
            }
            IdlDecimal idlDecimal3 = self.stop_price;
            if (idlDecimal3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, IdlDecimalSerializer.INSTANCE, idlDecimal3);
            }
            if (!Intrinsics.areEqual(self.ref_id, "")) {
                output.encodeStringElement(serialDesc, 9, self.ref_id);
            }
            ClientMarketdataDto clientMarketdataDto = self.client_marketdata;
            if (clientMarketdataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, ClientMarketdataDto.Serializer.INSTANCE, clientMarketdataDto);
            }
            Boolean bool = self.is_auto_send_enabled;
            if (bool != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, BooleanSerializer.INSTANCE, bool);
            }
            MoneyDto moneyDto = self.entered_notional_amount;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            Instant instant = self.gtd_expiration_time;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, WireInstantSerializer.INSTANCE, instant);
            }
            String str = self.quote_id;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 14, StringSerializer.INSTANCE, str);
            }
            OrderEntryMetadataDto orderEntryMetadataDto = self.order_entry_metadata;
            if (orderEntryMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 15, OrderEntryMetadataDto.Serializer.INSTANCE, orderEntryMetadataDto);
            }
        }

        public Surrogate(String account_id, List<FuturesOrderLegRequestDto> legs, IdlDecimal quantity, IdlDecimal idlDecimal, OrderTypeDto order_type, OrderTriggerDto order_trigger, TimeInForceDto time_in_force, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, String ref_id, ClientMarketdataDto clientMarketdataDto, Boolean bool, MoneyDto moneyDto, Instant instant, String str, OrderEntryMetadataDto orderEntryMetadataDto) {
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            Intrinsics.checkNotNullParameter(legs, "legs");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(order_type, "order_type");
            Intrinsics.checkNotNullParameter(order_trigger, "order_trigger");
            Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
            Intrinsics.checkNotNullParameter(ref_id, "ref_id");
            this.account_id = account_id;
            this.legs = legs;
            this.quantity = quantity;
            this.max_show = idlDecimal;
            this.order_type = order_type;
            this.order_trigger = order_trigger;
            this.time_in_force = time_in_force;
            this.limit_price = idlDecimal2;
            this.stop_price = idlDecimal3;
            this.ref_id = ref_id;
            this.client_marketdata = clientMarketdataDto;
            this.is_auto_send_enabled = bool;
            this.entered_notional_amount = moneyDto;
            this.gtd_expiration_time = instant;
            this.quote_id = str;
            this.order_entry_metadata = orderEntryMetadataDto;
        }

        public /* synthetic */ Surrogate(String str, List list, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, OrderTypeDto orderTypeDto, OrderTriggerDto orderTriggerDto, TimeInForceDto timeInForceDto, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, String str2, ClientMarketdataDto clientMarketdataDto, Boolean bool, MoneyDto moneyDto, Instant instant, String str3, OrderEntryMetadataDto orderEntryMetadataDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? new IdlDecimal("") : idlDecimal, (i & 8) != 0 ? null : idlDecimal2, (i & 16) != 0 ? OrderTypeDto.INSTANCE.getZeroValue() : orderTypeDto, (i & 32) != 0 ? OrderTriggerDto.INSTANCE.getZeroValue() : orderTriggerDto, (i & 64) != 0 ? TimeInForceDto.INSTANCE.getZeroValue() : timeInForceDto, (i & 128) != 0 ? null : idlDecimal3, (i & 256) != 0 ? null : idlDecimal4, (i & 512) == 0 ? str2 : "", (i & 1024) != 0 ? null : clientMarketdataDto, (i & 2048) != 0 ? null : bool, (i & 4096) != 0 ? null : moneyDto, (i & 8192) != 0 ? null : instant, (i & 16384) != 0 ? null : str3, (i & 32768) != 0 ? null : orderEntryMetadataDto);
        }

        public final String getAccount_id() {
            return this.account_id;
        }

        public final List<FuturesOrderLegRequestDto> getLegs() {
            return this.legs;
        }

        public final IdlDecimal getQuantity() {
            return this.quantity;
        }

        public final IdlDecimal getMax_show() {
            return this.max_show;
        }

        public final OrderTypeDto getOrder_type() {
            return this.order_type;
        }

        public final OrderTriggerDto getOrder_trigger() {
            return this.order_trigger;
        }

        public final TimeInForceDto getTime_in_force() {
            return this.time_in_force;
        }

        public final IdlDecimal getLimit_price() {
            return this.limit_price;
        }

        public final IdlDecimal getStop_price() {
            return this.stop_price;
        }

        public final String getRef_id() {
            return this.ref_id;
        }

        public final ClientMarketdataDto getClient_marketdata() {
            return this.client_marketdata;
        }

        public final Boolean is_auto_send_enabled() {
            return this.is_auto_send_enabled;
        }

        public final MoneyDto getEntered_notional_amount() {
            return this.entered_notional_amount;
        }

        public final Instant getGtd_expiration_time() {
            return this.gtd_expiration_time;
        }

        public final String getQuote_id() {
            return this.quote_id;
        }

        public final OrderEntryMetadataDto getOrder_entry_metadata() {
            return this.order_entry_metadata;
        }
    }

    /* compiled from: CreateFuturesOrderRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CreateFuturesOrderRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/ceres/v1/CreateFuturesOrderRequestDto;", "Lcom/robinhood/ceres/v1/CreateFuturesOrderRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/CreateFuturesOrderRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<CreateFuturesOrderRequestDto, CreateFuturesOrderRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CreateFuturesOrderRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CreateFuturesOrderRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CreateFuturesOrderRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) CreateFuturesOrderRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CreateFuturesOrderRequest> getProtoAdapter() {
            return CreateFuturesOrderRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CreateFuturesOrderRequestDto getZeroValue() {
            return CreateFuturesOrderRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CreateFuturesOrderRequestDto fromProto(CreateFuturesOrderRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String account_id = proto.getAccount_id();
            List<FuturesOrderLegRequest> legs = proto.getLegs();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(legs, 10));
            Iterator<T> it = legs.iterator();
            while (it.hasNext()) {
                arrayList.add(FuturesOrderLegRequestDto.INSTANCE.fromProto((FuturesOrderLegRequest) it.next()));
            }
            IdlDecimal idlDecimal = new IdlDecimal(proto.getQuantity());
            String max_show = proto.getMax_show();
            IdlDecimal idlDecimal2 = max_show != null ? new IdlDecimal(max_show) : null;
            OrderTypeDto orderTypeDtoFromProto = OrderTypeDto.INSTANCE.fromProto(proto.getOrder_type());
            OrderTriggerDto orderTriggerDtoFromProto = OrderTriggerDto.INSTANCE.fromProto(proto.getOrder_trigger());
            TimeInForceDto timeInForceDtoFromProto = TimeInForceDto.INSTANCE.fromProto(proto.getTime_in_force());
            String limit_price = proto.getLimit_price();
            IdlDecimal idlDecimal3 = limit_price != null ? new IdlDecimal(limit_price) : null;
            String stop_price = proto.getStop_price();
            IdlDecimal idlDecimal4 = stop_price != null ? new IdlDecimal(stop_price) : null;
            String ref_id = proto.getRef_id();
            ClientMarketdata client_marketdata = proto.getClient_marketdata();
            ClientMarketdataDto clientMarketdataDtoFromProto = client_marketdata != null ? ClientMarketdataDto.INSTANCE.fromProto(client_marketdata) : null;
            Boolean is_auto_send_enabled = proto.getIs_auto_send_enabled();
            Money entered_notional_amount = proto.getEntered_notional_amount();
            MoneyDto moneyDtoFromProto = entered_notional_amount != null ? MoneyDto.INSTANCE.fromProto(entered_notional_amount) : null;
            Instant gtd_expiration_time = proto.getGtd_expiration_time();
            String quote_id = proto.getQuote_id();
            OrderEntryMetadata order_entry_metadata = proto.getOrder_entry_metadata();
            return new CreateFuturesOrderRequestDto(new Surrogate(account_id, arrayList, idlDecimal, idlDecimal2, orderTypeDtoFromProto, orderTriggerDtoFromProto, timeInForceDtoFromProto, idlDecimal3, idlDecimal4, ref_id, clientMarketdataDtoFromProto, is_auto_send_enabled, moneyDtoFromProto, gtd_expiration_time, quote_id, order_entry_metadata != null ? OrderEntryMetadataDto.INSTANCE.fromProto(order_entry_metadata) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.CreateFuturesOrderRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateFuturesOrderRequestDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new CreateFuturesOrderRequestDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CreateFuturesOrderRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CreateFuturesOrderRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/CreateFuturesOrderRequestDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/ceres/v1/CreateFuturesOrderRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<CreateFuturesOrderRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ceres.service.CreateFuturesOrderRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CreateFuturesOrderRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CreateFuturesOrderRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CreateFuturesOrderRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CreateFuturesOrderRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CreateFuturesOrderRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "com.robinhood.ceres.v1.CreateFuturesOrderRequestDto";
        }
    }
}
