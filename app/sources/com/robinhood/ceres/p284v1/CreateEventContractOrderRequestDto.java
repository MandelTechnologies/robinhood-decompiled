package com.robinhood.ceres.p284v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.ceres.p284v1.CreateEventContractOrderRequestDto;
import com.robinhood.ceres.p284v1.FuturesOrderLegRequestDto;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;
import p479j$.time.Instant;
import rosetta.mainst.TimeInForce;
import rosetta.mainst.TimeInForceDto;

/* compiled from: CreateEventContractOrderRequestDto.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0019\b\u0007\u0018\u0000 B2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004CBDEB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0083\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\u001bJ\u0087\u0001\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0010\b\u0002\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020'H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020'H\u0016¢\u0006\u0004\b0\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00101R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b2\u0010!R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b7\u00106R\u0011\u0010\u0010\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b8\u0010!R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0011\u0010\u0014\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0019\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u00188F¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bA\u0010!¨\u0006F"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CreateEventContractOrderRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/ceres/v1/CreateEventContractOrderRequest;", "Landroid/os/Parcelable;", "Lcom/robinhood/ceres/v1/CreateEventContractOrderRequestDto$Surrogate;", "surrogate", "<init>", "(Lcom/robinhood/ceres/v1/CreateEventContractOrderRequestDto$Surrogate;)V", "", "account_id", "", "Lcom/robinhood/ceres/v1/FuturesOrderLegRequestDto;", "legs", "Lcom/robinhood/idl/IdlDecimal;", "quantity", "limit_price", "ref_id", "Lcom/robinhood/rosetta/mainst/ClientMarketdataDto;", "client_marketdata", "Lrosetta/mainst/TimeInForceDto;", "time_in_force", "Lcom/robinhood/rosetta/common/MoneyDto;", "entered_notional_amount", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "gtd_expiration_time", "quote_id", "(Ljava/lang/String;Ljava/util/List;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/ClientMarketdataDto;Lrosetta/mainst/TimeInForceDto;Lcom/robinhood/rosetta/common/MoneyDto;Lj$/time/Instant;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/ClientMarketdataDto;Lrosetta/mainst/TimeInForceDto;Lcom/robinhood/rosetta/common/MoneyDto;Lj$/time/Instant;Ljava/lang/String;)Lcom/robinhood/ceres/v1/CreateEventContractOrderRequestDto;", "toProto", "()Lcom/robinhood/ceres/v1/CreateEventContractOrderRequest;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/ceres/v1/CreateEventContractOrderRequestDto$Surrogate;", "getAccount_id", "getLegs", "()Ljava/util/List;", "getQuantity", "()Lcom/robinhood/idl/IdlDecimal;", "getLimit_price", "getRef_id", "getClient_marketdata", "()Lcom/robinhood/rosetta/mainst/ClientMarketdataDto;", "getTime_in_force", "()Lrosetta/mainst/TimeInForceDto;", "getEntered_notional_amount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getGtd_expiration_time", "()Lj$/time/Instant;", "getQuote_id", "Companion", "Surrogate", "Serializer", "MultibindingModule", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class CreateEventContractOrderRequestDto implements Dto3<CreateEventContractOrderRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CreateEventContractOrderRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CreateEventContractOrderRequestDto, CreateEventContractOrderRequest>> binaryBase64Serializer$delegate;
    private static final CreateEventContractOrderRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CreateEventContractOrderRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CreateEventContractOrderRequestDto(Surrogate surrogate) {
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

    public final IdlDecimal getLimit_price() {
        return this.surrogate.getLimit_price();
    }

    public final String getRef_id() {
        return this.surrogate.getRef_id();
    }

    public final ClientMarketdataDto getClient_marketdata() {
        return this.surrogate.getClient_marketdata();
    }

    public final TimeInForceDto getTime_in_force() {
        return this.surrogate.getTime_in_force();
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

    public /* synthetic */ CreateEventContractOrderRequestDto(String str, List list, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, String str2, ClientMarketdataDto clientMarketdataDto, TimeInForceDto timeInForceDto, MoneyDto moneyDto, Instant instant, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? new IdlDecimal("") : idlDecimal, (i & 8) != 0 ? null : idlDecimal2, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? null : clientMarketdataDto, (i & 64) != 0 ? TimeInForceDto.INSTANCE.getZeroValue() : timeInForceDto, (i & 128) != 0 ? null : moneyDto, (i & 256) != 0 ? null : instant, (i & 512) != 0 ? null : str3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreateEventContractOrderRequestDto(String account_id, List<FuturesOrderLegRequestDto> legs, IdlDecimal quantity, IdlDecimal idlDecimal, String ref_id, ClientMarketdataDto clientMarketdataDto, TimeInForceDto time_in_force, MoneyDto moneyDto, Instant instant, String str) {
        this(new Surrogate(account_id, legs, quantity, idlDecimal, ref_id, clientMarketdataDto, time_in_force, moneyDto, instant, str));
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(legs, "legs");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
    }

    public static /* synthetic */ CreateEventContractOrderRequestDto copy$default(CreateEventContractOrderRequestDto createEventContractOrderRequestDto, String str, List list, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, String str2, ClientMarketdataDto clientMarketdataDto, TimeInForceDto timeInForceDto, MoneyDto moneyDto, Instant instant, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createEventContractOrderRequestDto.surrogate.getAccount_id();
        }
        if ((i & 2) != 0) {
            list = createEventContractOrderRequestDto.surrogate.getLegs();
        }
        if ((i & 4) != 0) {
            idlDecimal = createEventContractOrderRequestDto.surrogate.getQuantity();
        }
        if ((i & 8) != 0) {
            idlDecimal2 = createEventContractOrderRequestDto.surrogate.getLimit_price();
        }
        if ((i & 16) != 0) {
            str2 = createEventContractOrderRequestDto.surrogate.getRef_id();
        }
        if ((i & 32) != 0) {
            clientMarketdataDto = createEventContractOrderRequestDto.surrogate.getClient_marketdata();
        }
        if ((i & 64) != 0) {
            timeInForceDto = createEventContractOrderRequestDto.surrogate.getTime_in_force();
        }
        if ((i & 128) != 0) {
            moneyDto = createEventContractOrderRequestDto.surrogate.getEntered_notional_amount();
        }
        if ((i & 256) != 0) {
            instant = createEventContractOrderRequestDto.surrogate.getGtd_expiration_time();
        }
        if ((i & 512) != 0) {
            str3 = createEventContractOrderRequestDto.surrogate.getQuote_id();
        }
        Instant instant2 = instant;
        String str4 = str3;
        TimeInForceDto timeInForceDto2 = timeInForceDto;
        MoneyDto moneyDto2 = moneyDto;
        String str5 = str2;
        ClientMarketdataDto clientMarketdataDto2 = clientMarketdataDto;
        return createEventContractOrderRequestDto.copy(str, list, idlDecimal, idlDecimal2, str5, clientMarketdataDto2, timeInForceDto2, moneyDto2, instant2, str4);
    }

    public final CreateEventContractOrderRequestDto copy(String account_id, List<FuturesOrderLegRequestDto> legs, IdlDecimal quantity, IdlDecimal limit_price, String ref_id, ClientMarketdataDto client_marketdata, TimeInForceDto time_in_force, MoneyDto entered_notional_amount, Instant gtd_expiration_time, String quote_id) {
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(legs, "legs");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
        return new CreateEventContractOrderRequestDto(new Surrogate(account_id, legs, quantity, limit_price, ref_id, client_marketdata, time_in_force, entered_notional_amount, gtd_expiration_time, quote_id));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public CreateEventContractOrderRequest toProto() {
        String account_id = this.surrogate.getAccount_id();
        List<FuturesOrderLegRequestDto> legs = this.surrogate.getLegs();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(legs, 10));
        Iterator<T> it = legs.iterator();
        while (it.hasNext()) {
            arrayList.add(((FuturesOrderLegRequestDto) it.next()).toProto());
        }
        String stringValue = this.surrogate.getQuantity().getStringValue();
        IdlDecimal limit_price = this.surrogate.getLimit_price();
        String stringValue2 = limit_price != null ? limit_price.getStringValue() : null;
        String ref_id = this.surrogate.getRef_id();
        ClientMarketdataDto client_marketdata = this.surrogate.getClient_marketdata();
        ClientMarketdata proto = client_marketdata != null ? client_marketdata.toProto() : null;
        TimeInForce timeInForce = (TimeInForce) this.surrogate.getTime_in_force().toProto();
        MoneyDto entered_notional_amount = this.surrogate.getEntered_notional_amount();
        return new CreateEventContractOrderRequest(account_id, arrayList, stringValue, stringValue2, ref_id, proto, timeInForce, entered_notional_amount != null ? entered_notional_amount.toProto() : null, this.surrogate.getGtd_expiration_time(), this.surrogate.getQuote_id(), null, 1024, null);
    }

    public String toString() {
        return "[CreateEventContractOrderRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CreateEventContractOrderRequestDto) && Intrinsics.areEqual(((CreateEventContractOrderRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: CreateEventContractOrderRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b!\b\u0083\b\u0018\u0000 _2\u00020\u0001:\u0002`_B½\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0017\b\u0002\u0010\u000b\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\u0019\b\u0002\u0010\f\u001a\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012.\b\u0002\u0010\u0017\u001a(\u0018\u00010\u0014j\u0013\u0018\u0001`\u0015¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\u0016¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0019\u0010\u001aB\u0085\u0001\b\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u0019\u0010\u001fJ'\u0010(\u001a\u00020%2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b+\u0010,J\u001f\u0010-\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003¢\u0006\u0004\b-\u0010.J!\u0010/\u001a\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003¢\u0006\u0004\b/\u0010.J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010*J\u0012\u00101\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b5\u00106J6\u00107\u001a(\u0018\u00010\u0014j\u0013\u0018\u0001`\u0015¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\u0016¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\u0016HÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b9\u0010*JÆ\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0017\b\u0002\u0010\u000b\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\u0019\b\u0002\u0010\f\u001a\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122.\b\u0002\u0010\u0017\u001a(\u0018\u00010\u0014j\u0013\u0018\u0001`\u0015¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\u0016¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b<\u0010*J\u0010\u0010=\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b=\u0010>J\u001a\u0010A\u001a\u00020@2\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bA\u0010BR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010C\u0012\u0004\bE\u0010F\u001a\u0004\bD\u0010*R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010G\u0012\u0004\bI\u0010F\u001a\u0004\bH\u0010,R/\u0010\u000b\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010J\u0012\u0004\bL\u0010F\u001a\u0004\bK\u0010.R1\u0010\f\u001a\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010J\u0012\u0004\bN\u0010F\u001a\u0004\bM\u0010.R \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010C\u0012\u0004\bP\u0010F\u001a\u0004\bO\u0010*R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010Q\u0012\u0004\bS\u0010F\u001a\u0004\bR\u00102R \u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010T\u0012\u0004\bV\u0010F\u001a\u0004\bU\u00104R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010W\u0012\u0004\bY\u0010F\u001a\u0004\bX\u00106RF\u0010\u0017\u001a(\u0018\u00010\u0014j\u0013\u0018\u0001`\u0015¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\u0016¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010Z\u0012\u0004\b\\\u0010F\u001a\u0004\b[\u00108R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010C\u0012\u0004\b^\u0010F\u001a\u0004\b]\u0010*¨\u0006a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CreateEventContractOrderRequestDto$Surrogate;", "", "", "account_id", "", "Lcom/robinhood/ceres/v1/FuturesOrderLegRequestDto;", "legs", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "quantity", "limit_price", "ref_id", "Lcom/robinhood/rosetta/mainst/ClientMarketdataDto;", "client_marketdata", "Lrosetta/mainst/TimeInForceDto;", "time_in_force", "Lcom/robinhood/rosetta/common/MoneyDto;", "entered_notional_amount", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "gtd_expiration_time", "quote_id", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/ClientMarketdataDto;Lrosetta/mainst/TimeInForceDto;Lcom/robinhood/rosetta/common/MoneyDto;Lj$/time/Instant;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/ClientMarketdataDto;Lrosetta/mainst/TimeInForceDto;Lcom/robinhood/rosetta/common/MoneyDto;Lj$/time/Instant;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$ceres_v1_externalRelease", "(Lcom/robinhood/ceres/v1/CreateEventContractOrderRequestDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/robinhood/idl/IdlDecimal;", "component4", "component5", "component6", "()Lcom/robinhood/rosetta/mainst/ClientMarketdataDto;", "component7", "()Lrosetta/mainst/TimeInForceDto;", "component8", "()Lcom/robinhood/rosetta/common/MoneyDto;", "component9", "()Lj$/time/Instant;", "component10", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/ClientMarketdataDto;Lrosetta/mainst/TimeInForceDto;Lcom/robinhood/rosetta/common/MoneyDto;Lj$/time/Instant;Ljava/lang/String;)Lcom/robinhood/ceres/v1/CreateEventContractOrderRequestDto$Surrogate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccount_id", "getAccount_id$annotations", "()V", "Ljava/util/List;", "getLegs", "getLegs$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getQuantity", "getQuantity$annotations", "getLimit_price", "getLimit_price$annotations", "getRef_id", "getRef_id$annotations", "Lcom/robinhood/rosetta/mainst/ClientMarketdataDto;", "getClient_marketdata", "getClient_marketdata$annotations", "Lrosetta/mainst/TimeInForceDto;", "getTime_in_force", "getTime_in_force$annotations", "Lcom/robinhood/rosetta/common/MoneyDto;", "getEntered_notional_amount", "getEntered_notional_amount$annotations", "Lj$/time/Instant;", "getGtd_expiration_time", "getGtd_expiration_time$annotations", "getQuote_id", "getQuote_id$annotations", "Companion", "$serializer", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final String account_id;
        private final ClientMarketdataDto client_marketdata;
        private final MoneyDto entered_notional_amount;
        private final Instant gtd_expiration_time;
        private final List<FuturesOrderLegRequestDto> legs;
        private final IdlDecimal limit_price;
        private final IdlDecimal quantity;
        private final String quote_id;
        private final String ref_id;
        private final TimeInForceDto time_in_force;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.ceres.v1.CreateEventContractOrderRequestDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateEventContractOrderRequestDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null, null, null, null, null, null};

        public Surrogate() {
            this((String) null, (List) null, (IdlDecimal) null, (IdlDecimal) null, (String) null, (ClientMarketdataDto) null, (TimeInForceDto) null, (MoneyDto) null, (Instant) null, (String) null, 1023, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(FuturesOrderLegRequestDto.Serializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, List list, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, String str2, ClientMarketdataDto clientMarketdataDto, TimeInForceDto timeInForceDto, MoneyDto moneyDto, Instant instant, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.account_id;
            }
            if ((i & 2) != 0) {
                list = surrogate.legs;
            }
            if ((i & 4) != 0) {
                idlDecimal = surrogate.quantity;
            }
            if ((i & 8) != 0) {
                idlDecimal2 = surrogate.limit_price;
            }
            if ((i & 16) != 0) {
                str2 = surrogate.ref_id;
            }
            if ((i & 32) != 0) {
                clientMarketdataDto = surrogate.client_marketdata;
            }
            if ((i & 64) != 0) {
                timeInForceDto = surrogate.time_in_force;
            }
            if ((i & 128) != 0) {
                moneyDto = surrogate.entered_notional_amount;
            }
            if ((i & 256) != 0) {
                instant = surrogate.gtd_expiration_time;
            }
            if ((i & 512) != 0) {
                str3 = surrogate.quote_id;
            }
            Instant instant2 = instant;
            String str4 = str3;
            TimeInForceDto timeInForceDto2 = timeInForceDto;
            MoneyDto moneyDto2 = moneyDto;
            String str5 = str2;
            ClientMarketdataDto clientMarketdataDto2 = clientMarketdataDto;
            return surrogate.copy(str, list, idlDecimal, idlDecimal2, str5, clientMarketdataDto2, timeInForceDto2, moneyDto2, instant2, str4);
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

        @SerialName("timeInForce")
        @JsonAnnotations2(names = {"time_in_force"})
        public static /* synthetic */ void getTime_in_force$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccount_id() {
            return this.account_id;
        }

        /* renamed from: component10, reason: from getter */
        public final String getQuote_id() {
            return this.quote_id;
        }

        public final List<FuturesOrderLegRequestDto> component2() {
            return this.legs;
        }

        /* renamed from: component3, reason: from getter */
        public final IdlDecimal getQuantity() {
            return this.quantity;
        }

        /* renamed from: component4, reason: from getter */
        public final IdlDecimal getLimit_price() {
            return this.limit_price;
        }

        /* renamed from: component5, reason: from getter */
        public final String getRef_id() {
            return this.ref_id;
        }

        /* renamed from: component6, reason: from getter */
        public final ClientMarketdataDto getClient_marketdata() {
            return this.client_marketdata;
        }

        /* renamed from: component7, reason: from getter */
        public final TimeInForceDto getTime_in_force() {
            return this.time_in_force;
        }

        /* renamed from: component8, reason: from getter */
        public final MoneyDto getEntered_notional_amount() {
            return this.entered_notional_amount;
        }

        /* renamed from: component9, reason: from getter */
        public final Instant getGtd_expiration_time() {
            return this.gtd_expiration_time;
        }

        public final Surrogate copy(String account_id, List<FuturesOrderLegRequestDto> legs, IdlDecimal quantity, IdlDecimal limit_price, String ref_id, ClientMarketdataDto client_marketdata, TimeInForceDto time_in_force, MoneyDto entered_notional_amount, Instant gtd_expiration_time, String quote_id) {
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            Intrinsics.checkNotNullParameter(legs, "legs");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(ref_id, "ref_id");
            Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
            return new Surrogate(account_id, legs, quantity, limit_price, ref_id, client_marketdata, time_in_force, entered_notional_amount, gtd_expiration_time, quote_id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.account_id, surrogate.account_id) && Intrinsics.areEqual(this.legs, surrogate.legs) && Intrinsics.areEqual(this.quantity, surrogate.quantity) && Intrinsics.areEqual(this.limit_price, surrogate.limit_price) && Intrinsics.areEqual(this.ref_id, surrogate.ref_id) && Intrinsics.areEqual(this.client_marketdata, surrogate.client_marketdata) && this.time_in_force == surrogate.time_in_force && Intrinsics.areEqual(this.entered_notional_amount, surrogate.entered_notional_amount) && Intrinsics.areEqual(this.gtd_expiration_time, surrogate.gtd_expiration_time) && Intrinsics.areEqual(this.quote_id, surrogate.quote_id);
        }

        public int hashCode() {
            int iHashCode = ((((this.account_id.hashCode() * 31) + this.legs.hashCode()) * 31) + this.quantity.hashCode()) * 31;
            IdlDecimal idlDecimal = this.limit_price;
            int iHashCode2 = (((iHashCode + (idlDecimal == null ? 0 : idlDecimal.hashCode())) * 31) + this.ref_id.hashCode()) * 31;
            ClientMarketdataDto clientMarketdataDto = this.client_marketdata;
            int iHashCode3 = (((iHashCode2 + (clientMarketdataDto == null ? 0 : clientMarketdataDto.hashCode())) * 31) + this.time_in_force.hashCode()) * 31;
            MoneyDto moneyDto = this.entered_notional_amount;
            int iHashCode4 = (iHashCode3 + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31;
            Instant instant = this.gtd_expiration_time;
            int iHashCode5 = (iHashCode4 + (instant == null ? 0 : instant.hashCode())) * 31;
            String str = this.quote_id;
            return iHashCode5 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(account_id=" + this.account_id + ", legs=" + this.legs + ", quantity=" + this.quantity + ", limit_price=" + this.limit_price + ", ref_id=" + this.ref_id + ", client_marketdata=" + this.client_marketdata + ", time_in_force=" + this.time_in_force + ", entered_notional_amount=" + this.entered_notional_amount + ", gtd_expiration_time=" + this.gtd_expiration_time + ", quote_id=" + this.quote_id + ")";
        }

        /* compiled from: CreateEventContractOrderRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CreateEventContractOrderRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/CreateEventContractOrderRequestDto$Surrogate;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CreateEventContractOrderRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, List list, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, String str2, ClientMarketdataDto clientMarketdataDto, TimeInForceDto timeInForceDto, MoneyDto moneyDto, Instant instant, String str3, SerializationConstructorMarker serializationConstructorMarker) {
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
                this.limit_price = null;
            } else {
                this.limit_price = idlDecimal2;
            }
            if ((i & 16) == 0) {
                this.ref_id = "";
            } else {
                this.ref_id = str2;
            }
            if ((i & 32) == 0) {
                this.client_marketdata = null;
            } else {
                this.client_marketdata = clientMarketdataDto;
            }
            if ((i & 64) == 0) {
                this.time_in_force = TimeInForceDto.INSTANCE.getZeroValue();
            } else {
                this.time_in_force = timeInForceDto;
            }
            if ((i & 128) == 0) {
                this.entered_notional_amount = null;
            } else {
                this.entered_notional_amount = moneyDto;
            }
            if ((i & 256) == 0) {
                this.gtd_expiration_time = null;
            } else {
                this.gtd_expiration_time = instant;
            }
            if ((i & 512) == 0) {
                this.quote_id = null;
            } else {
                this.quote_id = str3;
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
            IdlDecimal idlDecimal = self.limit_price;
            if (idlDecimal != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, IdlDecimalSerializer.INSTANCE, idlDecimal);
            }
            if (!Intrinsics.areEqual(self.ref_id, "")) {
                output.encodeStringElement(serialDesc, 4, self.ref_id);
            }
            ClientMarketdataDto clientMarketdataDto = self.client_marketdata;
            if (clientMarketdataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, ClientMarketdataDto.Serializer.INSTANCE, clientMarketdataDto);
            }
            if (self.time_in_force != TimeInForceDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 6, TimeInForceDto.Serializer.INSTANCE, self.time_in_force);
            }
            MoneyDto moneyDto = self.entered_notional_amount;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            Instant instant = self.gtd_expiration_time;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, WireInstantSerializer.INSTANCE, instant);
            }
            String str = self.quote_id;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, str);
            }
        }

        public Surrogate(String account_id, List<FuturesOrderLegRequestDto> legs, IdlDecimal quantity, IdlDecimal idlDecimal, String ref_id, ClientMarketdataDto clientMarketdataDto, TimeInForceDto time_in_force, MoneyDto moneyDto, Instant instant, String str) {
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            Intrinsics.checkNotNullParameter(legs, "legs");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(ref_id, "ref_id");
            Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
            this.account_id = account_id;
            this.legs = legs;
            this.quantity = quantity;
            this.limit_price = idlDecimal;
            this.ref_id = ref_id;
            this.client_marketdata = clientMarketdataDto;
            this.time_in_force = time_in_force;
            this.entered_notional_amount = moneyDto;
            this.gtd_expiration_time = instant;
            this.quote_id = str;
        }

        public /* synthetic */ Surrogate(String str, List list, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, String str2, ClientMarketdataDto clientMarketdataDto, TimeInForceDto timeInForceDto, MoneyDto moneyDto, Instant instant, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? new IdlDecimal("") : idlDecimal, (i & 8) != 0 ? null : idlDecimal2, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? null : clientMarketdataDto, (i & 64) != 0 ? TimeInForceDto.INSTANCE.getZeroValue() : timeInForceDto, (i & 128) != 0 ? null : moneyDto, (i & 256) != 0 ? null : instant, (i & 512) != 0 ? null : str3);
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

        public final IdlDecimal getLimit_price() {
            return this.limit_price;
        }

        public final String getRef_id() {
            return this.ref_id;
        }

        public final ClientMarketdataDto getClient_marketdata() {
            return this.client_marketdata;
        }

        public final TimeInForceDto getTime_in_force() {
            return this.time_in_force;
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
    }

    /* compiled from: CreateEventContractOrderRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CreateEventContractOrderRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/ceres/v1/CreateEventContractOrderRequestDto;", "Lcom/robinhood/ceres/v1/CreateEventContractOrderRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/CreateEventContractOrderRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<CreateEventContractOrderRequestDto, CreateEventContractOrderRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CreateEventContractOrderRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CreateEventContractOrderRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CreateEventContractOrderRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) CreateEventContractOrderRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CreateEventContractOrderRequest> getProtoAdapter() {
            return CreateEventContractOrderRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CreateEventContractOrderRequestDto getZeroValue() {
            return CreateEventContractOrderRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CreateEventContractOrderRequestDto fromProto(CreateEventContractOrderRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String account_id = proto.getAccount_id();
            List<FuturesOrderLegRequest> legs = proto.getLegs();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(legs, 10));
            Iterator<T> it = legs.iterator();
            while (it.hasNext()) {
                arrayList.add(FuturesOrderLegRequestDto.INSTANCE.fromProto((FuturesOrderLegRequest) it.next()));
            }
            IdlDecimal idlDecimal = new IdlDecimal(proto.getQuantity());
            String limit_price = proto.getLimit_price();
            DefaultConstructorMarker defaultConstructorMarker = null;
            IdlDecimal idlDecimal2 = limit_price != null ? new IdlDecimal(limit_price) : null;
            String ref_id = proto.getRef_id();
            ClientMarketdata client_marketdata = proto.getClient_marketdata();
            ClientMarketdataDto clientMarketdataDtoFromProto = client_marketdata != null ? ClientMarketdataDto.INSTANCE.fromProto(client_marketdata) : null;
            TimeInForceDto timeInForceDtoFromProto = TimeInForceDto.INSTANCE.fromProto(proto.getTime_in_force());
            Money entered_notional_amount = proto.getEntered_notional_amount();
            return new CreateEventContractOrderRequestDto(new Surrogate(account_id, arrayList, idlDecimal, idlDecimal2, ref_id, clientMarketdataDtoFromProto, timeInForceDtoFromProto, entered_notional_amount != null ? MoneyDto.INSTANCE.fromProto(entered_notional_amount) : null, proto.getGtd_expiration_time(), proto.getQuote_id()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.CreateEventContractOrderRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateEventContractOrderRequestDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new CreateEventContractOrderRequestDto(null, null, null, null, null, null, null, null, null, null, 1023, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CreateEventContractOrderRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CreateEventContractOrderRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/CreateEventContractOrderRequestDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/ceres/v1/CreateEventContractOrderRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<CreateEventContractOrderRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ceres.service.CreateEventContractOrderRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CreateEventContractOrderRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CreateEventContractOrderRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CreateEventContractOrderRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CreateEventContractOrderRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CreateEventContractOrderRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "com.robinhood.ceres.v1.CreateEventContractOrderRequestDto";
        }
    }
}
