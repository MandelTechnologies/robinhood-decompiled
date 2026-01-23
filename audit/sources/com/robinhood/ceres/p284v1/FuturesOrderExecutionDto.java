package com.robinhood.ceres.p284v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.robinhood.rosetta.common.Date;
import com.robinhood.rosetta.common.DateDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: FuturesOrderExecutionDto.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004./01B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B[\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0006\u0010\u0013JX\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\b\u0010 \u001a\u00020\u0002H\u0016J\b\u0010!\u001a\u00020\tH\u0016J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\b\u0010&\u001a\u00020'H\u0016J\u0018\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020'H\u0016J\b\u0010-\u001a\u00020'H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\u0010\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0015R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u00062"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesOrderExecutionDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/ceres/v1/FuturesOrderExecution;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/ceres/v1/FuturesOrderExecutionDto$Surrogate;", "<init>", "(Lcom/robinhood/ceres/v1/FuturesOrderExecutionDto$Surrogate;)V", "id", "", "order_id", "account_id", "quantity", "Lcom/robinhood/idl/IdlDecimal;", "price_per_contract", "event_time", "master_id", "trade_date", "Lcom/robinhood/rosetta/common/DateDto;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/DateDto;)V", "getId", "()Ljava/lang/String;", "getOrder_id", "getAccount_id", "getQuantity", "()Lcom/robinhood/idl/IdlDecimal;", "getPrice_per_contract", "getEvent_time", "getMaster_id", "getTrade_date", "()Lcom/robinhood/rosetta/common/DateDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public final class FuturesOrderExecutionDto implements Dto3<FuturesOrderExecution>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<FuturesOrderExecutionDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FuturesOrderExecutionDto, FuturesOrderExecution>> binaryBase64Serializer$delegate;
    private static final FuturesOrderExecutionDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ FuturesOrderExecutionDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FuturesOrderExecutionDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final String getOrder_id() {
        return this.surrogate.getOrder_id();
    }

    public final String getAccount_id() {
        return this.surrogate.getAccount_id();
    }

    public final IdlDecimal getQuantity() {
        return this.surrogate.getQuantity();
    }

    public final IdlDecimal getPrice_per_contract() {
        return this.surrogate.getPrice_per_contract();
    }

    public final String getEvent_time() {
        return this.surrogate.getEvent_time();
    }

    public final String getMaster_id() {
        return this.surrogate.getMaster_id();
    }

    public final DateDto getTrade_date() {
        return this.surrogate.getTrade_date();
    }

    public /* synthetic */ FuturesOrderExecutionDto(String str, String str2, String str3, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, String str4, String str5, DateDto dateDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? new IdlDecimal("") : idlDecimal, (i & 16) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? null : dateDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FuturesOrderExecutionDto(String id, String order_id, String account_id, IdlDecimal quantity, IdlDecimal price_per_contract, String event_time, String master_id, DateDto dateDto) {
        this(new Surrogate(id, order_id, account_id, quantity, price_per_contract, event_time, master_id, dateDto));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(price_per_contract, "price_per_contract");
        Intrinsics.checkNotNullParameter(event_time, "event_time");
        Intrinsics.checkNotNullParameter(master_id, "master_id");
    }

    public static /* synthetic */ FuturesOrderExecutionDto copy$default(FuturesOrderExecutionDto futuresOrderExecutionDto, String str, String str2, String str3, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, String str4, String str5, DateDto dateDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = futuresOrderExecutionDto.surrogate.getId();
        }
        if ((i & 2) != 0) {
            str2 = futuresOrderExecutionDto.surrogate.getOrder_id();
        }
        if ((i & 4) != 0) {
            str3 = futuresOrderExecutionDto.surrogate.getAccount_id();
        }
        if ((i & 8) != 0) {
            idlDecimal = futuresOrderExecutionDto.surrogate.getQuantity();
        }
        if ((i & 16) != 0) {
            idlDecimal2 = futuresOrderExecutionDto.surrogate.getPrice_per_contract();
        }
        if ((i & 32) != 0) {
            str4 = futuresOrderExecutionDto.surrogate.getEvent_time();
        }
        if ((i & 64) != 0) {
            str5 = futuresOrderExecutionDto.surrogate.getMaster_id();
        }
        if ((i & 128) != 0) {
            dateDto = futuresOrderExecutionDto.surrogate.getTrade_date();
        }
        String str6 = str5;
        DateDto dateDto2 = dateDto;
        IdlDecimal idlDecimal3 = idlDecimal2;
        String str7 = str4;
        return futuresOrderExecutionDto.copy(str, str2, str3, idlDecimal, idlDecimal3, str7, str6, dateDto2);
    }

    public final FuturesOrderExecutionDto copy(String id, String order_id, String account_id, IdlDecimal quantity, IdlDecimal price_per_contract, String event_time, String master_id, DateDto trade_date) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(price_per_contract, "price_per_contract");
        Intrinsics.checkNotNullParameter(event_time, "event_time");
        Intrinsics.checkNotNullParameter(master_id, "master_id");
        return new FuturesOrderExecutionDto(new Surrogate(id, order_id, account_id, quantity, price_per_contract, event_time, master_id, trade_date));
    }

    @Override // com.robinhood.idl.Dto
    public FuturesOrderExecution toProto() {
        String id = this.surrogate.getId();
        String order_id = this.surrogate.getOrder_id();
        String account_id = this.surrogate.getAccount_id();
        String stringValue = this.surrogate.getQuantity().getStringValue();
        String stringValue2 = this.surrogate.getPrice_per_contract().getStringValue();
        String event_time = this.surrogate.getEvent_time();
        String master_id = this.surrogate.getMaster_id();
        DateDto trade_date = this.surrogate.getTrade_date();
        return new FuturesOrderExecution(id, order_id, account_id, stringValue, stringValue2, event_time, master_id, trade_date != null ? trade_date.toProto() : null, null, 256, null);
    }

    public String toString() {
        return "[FuturesOrderExecutionDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof FuturesOrderExecutionDto) && Intrinsics.areEqual(((FuturesOrderExecutionDto) other).surrogate, this.surrogate);
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
    /* compiled from: FuturesOrderExecutionDto.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 B2\u00020\u0001:\u0002ABBw\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\u0017\b\u0002\u0010\u000b\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011Bk\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0010\u0010\u0016J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u0018\u0010.\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003J\u0018\u0010/\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jy\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0017\b\u0002\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\u0017\b\u0002\u0010\u000b\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u00020\u0013HÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001J%\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u00002\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0001¢\u0006\u0002\b@R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR+\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010!R+\u0010\u000b\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010!R\u001c\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0018\u001a\u0004\b%\u0010\u001aR\u001c\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u0018\u001a\u0004\b'\u0010\u001aR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u0018\u001a\u0004\b)\u0010*¨\u0006C"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesOrderExecutionDto$Surrogate;", "", "id", "", "order_id", "account_id", "quantity", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "price_per_contract", "event_time", "master_id", "trade_date", "Lcom/robinhood/rosetta/common/DateDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/DateDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/DateDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId$annotations", "()V", "getId", "()Ljava/lang/String;", "getOrder_id$annotations", "getOrder_id", "getAccount_id$annotations", "getAccount_id", "getQuantity$annotations", "getQuantity", "()Lcom/robinhood/idl/IdlDecimal;", "getPrice_per_contract$annotations", "getPrice_per_contract", "getEvent_time$annotations", "getEvent_time", "getMaster_id$annotations", "getMaster_id", "getTrade_date$annotations", "getTrade_date", "()Lcom/robinhood/rosetta/common/DateDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ceres_entity_v1_externalRelease", "$serializer", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_id;
        private final String event_time;
        private final String id;
        private final String master_id;
        private final String order_id;
        private final IdlDecimal price_per_contract;
        private final IdlDecimal quantity;
        private final DateDto trade_date;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (IdlDecimal) null, (IdlDecimal) null, (String) null, (String) null, (DateDto) null, 255, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, String str4, String str5, DateDto dateDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.id;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.order_id;
            }
            if ((i & 4) != 0) {
                str3 = surrogate.account_id;
            }
            if ((i & 8) != 0) {
                idlDecimal = surrogate.quantity;
            }
            if ((i & 16) != 0) {
                idlDecimal2 = surrogate.price_per_contract;
            }
            if ((i & 32) != 0) {
                str4 = surrogate.event_time;
            }
            if ((i & 64) != 0) {
                str5 = surrogate.master_id;
            }
            if ((i & 128) != 0) {
                dateDto = surrogate.trade_date;
            }
            String str6 = str5;
            DateDto dateDto2 = dateDto;
            IdlDecimal idlDecimal3 = idlDecimal2;
            String str7 = str4;
            return surrogate.copy(str, str2, str3, idlDecimal, idlDecimal3, str7, str6, dateDto2);
        }

        @SerialName("accountId")
        @JsonAnnotations2(names = {"account_id"})
        public static /* synthetic */ void getAccount_id$annotations() {
        }

        @SerialName("eventTime")
        @JsonAnnotations2(names = {"event_time"})
        public static /* synthetic */ void getEvent_time$annotations() {
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("masterId")
        @JsonAnnotations2(names = {"master_id"})
        public static /* synthetic */ void getMaster_id$annotations() {
        }

        @SerialName("orderId")
        @JsonAnnotations2(names = {"order_id"})
        public static /* synthetic */ void getOrder_id$annotations() {
        }

        @SerialName("pricePerContract")
        @JsonAnnotations2(names = {"price_per_contract"})
        public static /* synthetic */ void getPrice_per_contract$annotations() {
        }

        @SerialName("quantity")
        @JsonAnnotations2(names = {"quantity"})
        public static /* synthetic */ void getQuantity$annotations() {
        }

        @SerialName("tradeDate")
        @JsonAnnotations2(names = {"trade_date"})
        public static /* synthetic */ void getTrade_date$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getOrder_id() {
            return this.order_id;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAccount_id() {
            return this.account_id;
        }

        /* renamed from: component4, reason: from getter */
        public final IdlDecimal getQuantity() {
            return this.quantity;
        }

        /* renamed from: component5, reason: from getter */
        public final IdlDecimal getPrice_per_contract() {
            return this.price_per_contract;
        }

        /* renamed from: component6, reason: from getter */
        public final String getEvent_time() {
            return this.event_time;
        }

        /* renamed from: component7, reason: from getter */
        public final String getMaster_id() {
            return this.master_id;
        }

        /* renamed from: component8, reason: from getter */
        public final DateDto getTrade_date() {
            return this.trade_date;
        }

        public final Surrogate copy(String id, String order_id, String account_id, IdlDecimal quantity, IdlDecimal price_per_contract, String event_time, String master_id, DateDto trade_date) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(order_id, "order_id");
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(price_per_contract, "price_per_contract");
            Intrinsics.checkNotNullParameter(event_time, "event_time");
            Intrinsics.checkNotNullParameter(master_id, "master_id");
            return new Surrogate(id, order_id, account_id, quantity, price_per_contract, event_time, master_id, trade_date);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.order_id, surrogate.order_id) && Intrinsics.areEqual(this.account_id, surrogate.account_id) && Intrinsics.areEqual(this.quantity, surrogate.quantity) && Intrinsics.areEqual(this.price_per_contract, surrogate.price_per_contract) && Intrinsics.areEqual(this.event_time, surrogate.event_time) && Intrinsics.areEqual(this.master_id, surrogate.master_id) && Intrinsics.areEqual(this.trade_date, surrogate.trade_date);
        }

        public int hashCode() {
            int iHashCode = ((((((((((((this.id.hashCode() * 31) + this.order_id.hashCode()) * 31) + this.account_id.hashCode()) * 31) + this.quantity.hashCode()) * 31) + this.price_per_contract.hashCode()) * 31) + this.event_time.hashCode()) * 31) + this.master_id.hashCode()) * 31;
            DateDto dateDto = this.trade_date;
            return iHashCode + (dateDto == null ? 0 : dateDto.hashCode());
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", order_id=" + this.order_id + ", account_id=" + this.account_id + ", quantity=" + this.quantity + ", price_per_contract=" + this.price_per_contract + ", event_time=" + this.event_time + ", master_id=" + this.master_id + ", trade_date=" + this.trade_date + ")";
        }

        /* compiled from: FuturesOrderExecutionDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesOrderExecutionDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/FuturesOrderExecutionDto$Surrogate;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return FuturesOrderExecutionDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, String str4, String str5, DateDto dateDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.order_id = "";
            } else {
                this.order_id = str2;
            }
            if ((i & 4) == 0) {
                this.account_id = "";
            } else {
                this.account_id = str3;
            }
            if ((i & 8) == 0) {
                this.quantity = new IdlDecimal("");
            } else {
                this.quantity = idlDecimal;
            }
            if ((i & 16) == 0) {
                this.price_per_contract = new IdlDecimal("");
            } else {
                this.price_per_contract = idlDecimal2;
            }
            if ((i & 32) == 0) {
                this.event_time = "";
            } else {
                this.event_time = str4;
            }
            if ((i & 64) == 0) {
                this.master_id = "";
            } else {
                this.master_id = str5;
            }
            if ((i & 128) == 0) {
                this.trade_date = null;
            } else {
                this.trade_date = dateDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$ceres_entity_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (!Intrinsics.areEqual(self.order_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.order_id);
            }
            if (!Intrinsics.areEqual(self.account_id, "")) {
                output.encodeStringElement(serialDesc, 2, self.account_id);
            }
            if (!Intrinsics.areEqual(self.quantity, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 3, IdlDecimalSerializer.INSTANCE, self.quantity);
            }
            if (!Intrinsics.areEqual(self.price_per_contract, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 4, IdlDecimalSerializer.INSTANCE, self.price_per_contract);
            }
            if (!Intrinsics.areEqual(self.event_time, "")) {
                output.encodeStringElement(serialDesc, 5, self.event_time);
            }
            if (!Intrinsics.areEqual(self.master_id, "")) {
                output.encodeStringElement(serialDesc, 6, self.master_id);
            }
            DateDto dateDto = self.trade_date;
            if (dateDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, DateDto.Serializer.INSTANCE, dateDto);
            }
        }

        public Surrogate(String id, String order_id, String account_id, IdlDecimal quantity, IdlDecimal price_per_contract, String event_time, String master_id, DateDto dateDto) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(order_id, "order_id");
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(price_per_contract, "price_per_contract");
            Intrinsics.checkNotNullParameter(event_time, "event_time");
            Intrinsics.checkNotNullParameter(master_id, "master_id");
            this.id = id;
            this.order_id = order_id;
            this.account_id = account_id;
            this.quantity = quantity;
            this.price_per_contract = price_per_contract;
            this.event_time = event_time;
            this.master_id = master_id;
            this.trade_date = dateDto;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, String str4, String str5, DateDto dateDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? new IdlDecimal("") : idlDecimal, (i & 16) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? null : dateDto);
        }

        public final String getId() {
            return this.id;
        }

        public final String getOrder_id() {
            return this.order_id;
        }

        public final String getAccount_id() {
            return this.account_id;
        }

        public final IdlDecimal getQuantity() {
            return this.quantity;
        }

        public final IdlDecimal getPrice_per_contract() {
            return this.price_per_contract;
        }

        public final String getEvent_time() {
            return this.event_time;
        }

        public final String getMaster_id() {
            return this.master_id;
        }

        public final DateDto getTrade_date() {
            return this.trade_date;
        }
    }

    /* compiled from: FuturesOrderExecutionDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesOrderExecutionDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/ceres/v1/FuturesOrderExecutionDto;", "Lcom/robinhood/ceres/v1/FuturesOrderExecution;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/FuturesOrderExecutionDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<FuturesOrderExecutionDto, FuturesOrderExecution> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FuturesOrderExecutionDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FuturesOrderExecutionDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FuturesOrderExecutionDto> getBinaryBase64Serializer() {
            return (KSerializer) FuturesOrderExecutionDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<FuturesOrderExecution> getProtoAdapter() {
            return FuturesOrderExecution.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FuturesOrderExecutionDto getZeroValue() {
            return FuturesOrderExecutionDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FuturesOrderExecutionDto fromProto(FuturesOrderExecution proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String id = proto.getId();
            String order_id = proto.getOrder_id();
            String account_id = proto.getAccount_id();
            IdlDecimal idlDecimal = new IdlDecimal(proto.getQuantity());
            IdlDecimal idlDecimal2 = new IdlDecimal(proto.getPrice_per_contract());
            String event_time = proto.getEvent_time();
            String master_id = proto.getMaster_id();
            Date trade_date = proto.getTrade_date();
            return new FuturesOrderExecutionDto(new Surrogate(id, order_id, account_id, idlDecimal, idlDecimal2, event_time, master_id, trade_date != null ? DateDto.INSTANCE.fromProto(trade_date) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.FuturesOrderExecutionDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesOrderExecutionDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new FuturesOrderExecutionDto(null, null, null, null, null, null, null, null, 255, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: FuturesOrderExecutionDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesOrderExecutionDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/FuturesOrderExecutionDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/ceres/v1/FuturesOrderExecutionDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<FuturesOrderExecutionDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ceres.entity.FuturesOrderExecution", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FuturesOrderExecutionDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public FuturesOrderExecutionDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new FuturesOrderExecutionDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: FuturesOrderExecutionDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesOrderExecutionDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "com.robinhood.ceres.v1.FuturesOrderExecutionDto";
        }
    }
}
