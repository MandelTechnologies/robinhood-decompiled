package com.robinhood.arsenal.proto.p281v1.idl;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.arsenal.proto.p281v1.idl.FuturesStateDto;
import com.robinhood.arsenal.proto.p281v1.idl.FuturesTradabilityDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
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
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: FuturesContractDto.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 ?2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004>?@AB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B©\u0001\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u001bJ¦\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\tJ\b\u00100\u001a\u00020\u0002H\u0016J\b\u00101\u001a\u00020\tH\u0016J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105H\u0096\u0002J\b\u00106\u001a\u000207H\u0016J\u0018\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u000207H\u0016J\b\u0010=\u001a\u000207H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b \u0010\u001dR\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010\u0010\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b$\u0010\u001dR\u0011\u0010\u0011\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b%\u0010\u001dR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b&\u0010\u001dR\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b+\u0010\u001dR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b,\u0010\u001dR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b-\u0010\u001dR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b.\u0010\u001d¨\u0006B"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/FuturesContractDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/arsenal/proto/v1/idl/FuturesContract;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/arsenal/proto/v1/idl/FuturesContractDto$Surrogate;", "<init>", "(Lcom/robinhood/arsenal/proto/v1/idl/FuturesContractDto$Surrogate;)V", "id", "", "product_id", "symbol", "display_symbol", "description", "multiplier", "Lcom/robinhood/idl/IdlDecimal;", "expiration_mmy", "expiration", "customer_last_close_date", "tradability", "Lcom/robinhood/arsenal/proto/v1/idl/FuturesTradabilityDto;", "state", "Lcom/robinhood/arsenal/proto/v1/idl/FuturesStateDto;", "isin", "settlement_start_time", "first_trade_date", "settlement_date", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/FuturesTradabilityDto;Lcom/robinhood/arsenal/proto/v1/idl/FuturesStateDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getProduct_id", "getSymbol", "getDisplay_symbol", "getDescription", "getMultiplier", "()Lcom/robinhood/idl/IdlDecimal;", "getExpiration_mmy", "getExpiration", "getCustomer_last_close_date", "getTradability", "()Lcom/robinhood/arsenal/proto/v1/idl/FuturesTradabilityDto;", "getState", "()Lcom/robinhood/arsenal/proto/v1/idl/FuturesStateDto;", "getIsin", "getSettlement_start_time", "getFirst_trade_date", "getSettlement_date", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes20.dex */
public final class FuturesContractDto implements Dto3<FuturesContract>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<FuturesContractDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FuturesContractDto, FuturesContract>> binaryBase64Serializer$delegate;
    private static final FuturesContractDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ FuturesContractDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FuturesContractDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final String getProduct_id() {
        return this.surrogate.getProduct_id();
    }

    public final String getSymbol() {
        return this.surrogate.getSymbol();
    }

    public final String getDisplay_symbol() {
        return this.surrogate.getDisplay_symbol();
    }

    public final String getDescription() {
        return this.surrogate.getDescription();
    }

    public final IdlDecimal getMultiplier() {
        return this.surrogate.getMultiplier();
    }

    public final String getExpiration_mmy() {
        return this.surrogate.getExpiration_mmy();
    }

    public final String getExpiration() {
        return this.surrogate.getExpiration();
    }

    public final String getCustomer_last_close_date() {
        return this.surrogate.getCustomer_last_close_date();
    }

    public final FuturesTradabilityDto getTradability() {
        return this.surrogate.getTradability();
    }

    public final FuturesStateDto getState() {
        return this.surrogate.getState();
    }

    public final String getIsin() {
        return this.surrogate.getIsin();
    }

    public final String getSettlement_start_time() {
        return this.surrogate.getSettlement_start_time();
    }

    public final String getFirst_trade_date() {
        return this.surrogate.getFirst_trade_date();
    }

    public final String getSettlement_date() {
        return this.surrogate.getSettlement_date();
    }

    public /* synthetic */ FuturesContractDto(String str, String str2, String str3, String str4, String str5, IdlDecimal idlDecimal, String str6, String str7, String str8, FuturesTradabilityDto futuresTradabilityDto, FuturesStateDto futuresStateDto, String str9, String str10, String str11, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? new IdlDecimal("") : idlDecimal, (i & 64) != 0 ? "" : str6, (i & 128) == 0 ? str7 : "", (i & 256) != 0 ? null : str8, (i & 512) != 0 ? FuturesTradabilityDto.INSTANCE.getZeroValue() : futuresTradabilityDto, (i & 1024) != 0 ? FuturesStateDto.INSTANCE.getZeroValue() : futuresStateDto, (i & 2048) != 0 ? null : str9, (i & 4096) != 0 ? null : str10, (i & 8192) != 0 ? null : str11, (i & 16384) != 0 ? null : str12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FuturesContractDto(String id, String product_id, String symbol, String display_symbol, String description, IdlDecimal multiplier, String expiration_mmy, String expiration, String str, FuturesTradabilityDto tradability, FuturesStateDto state, String str2, String str3, String str4, String str5) {
        this(new Surrogate(id, product_id, symbol, display_symbol, description, multiplier, expiration_mmy, expiration, str, tradability, state, str2, str3, str4, str5));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(product_id, "product_id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(display_symbol, "display_symbol");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(multiplier, "multiplier");
        Intrinsics.checkNotNullParameter(expiration_mmy, "expiration_mmy");
        Intrinsics.checkNotNullParameter(expiration, "expiration");
        Intrinsics.checkNotNullParameter(tradability, "tradability");
        Intrinsics.checkNotNullParameter(state, "state");
    }

    public final FuturesContractDto copy(String id, String product_id, String symbol, String display_symbol, String description, IdlDecimal multiplier, String expiration_mmy, String expiration, String customer_last_close_date, FuturesTradabilityDto tradability, FuturesStateDto state, String isin, String settlement_start_time, String first_trade_date, String settlement_date) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(product_id, "product_id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(display_symbol, "display_symbol");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(multiplier, "multiplier");
        Intrinsics.checkNotNullParameter(expiration_mmy, "expiration_mmy");
        Intrinsics.checkNotNullParameter(expiration, "expiration");
        Intrinsics.checkNotNullParameter(tradability, "tradability");
        Intrinsics.checkNotNullParameter(state, "state");
        return new FuturesContractDto(new Surrogate(id, product_id, symbol, display_symbol, description, multiplier, expiration_mmy, expiration, customer_last_close_date, tradability, state, isin, settlement_start_time, first_trade_date, settlement_date));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public FuturesContract toProto() {
        return new FuturesContract(this.surrogate.getId(), this.surrogate.getProduct_id(), this.surrogate.getSymbol(), this.surrogate.getDisplay_symbol(), this.surrogate.getDescription(), this.surrogate.getMultiplier().getStringValue(), this.surrogate.getExpiration_mmy(), this.surrogate.getExpiration(), this.surrogate.getCustomer_last_close_date(), (FuturesTradability) this.surrogate.getTradability().toProto(), (FuturesState) this.surrogate.getState().toProto(), this.surrogate.getIsin(), this.surrogate.getSettlement_start_time(), this.surrogate.getFirst_trade_date(), this.surrogate.getSettlement_date(), null, 32768, null);
    }

    public String toString() {
        return "[FuturesContractDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof FuturesContractDto) && Intrinsics.areEqual(((FuturesContractDto) other).surrogate, this.surrogate);
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
    /* compiled from: FuturesContractDto.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 `2\u00020\u0001:\u0002_`B¶\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\b\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0018\u0010\u0019B±\u0001\b\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u0018\u0010\u001eJ\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\u0018\u0010G\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\fHÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0011HÆ\u0003J\t\u0010L\u001a\u00020\u0013HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¸\u0001\u0010Q\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u0017\b\u0002\u0010\b\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010R\u001a\u00020S2\b\u0010T\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010U\u001a\u00020\u001bHÖ\u0001J\t\u0010V\u001a\u00020\u0003HÖ\u0001J%\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020\u00002\u0006\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020]H\u0001¢\u0006\u0002\b^R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010 \u001a\u0004\b&\u0010\"R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010 \u001a\u0004\b(\u0010\"R\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010 \u001a\u0004\b*\u0010\"R+\u0010\b\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b+\u0010 \u001a\u0004\b,\u0010-R\u001c\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010 \u001a\u0004\b/\u0010\"R\u001c\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u0010 \u001a\u0004\b1\u0010\"R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010 \u001a\u0004\b3\u0010\"R\u001c\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b4\u0010 \u001a\u0004\b5\u00106R\u001c\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b7\u0010 \u001a\u0004\b8\u00109R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b:\u0010 \u001a\u0004\b;\u0010\"R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b<\u0010 \u001a\u0004\b=\u0010\"R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b>\u0010 \u001a\u0004\b?\u0010\"R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b@\u0010 \u001a\u0004\bA\u0010\"¨\u0006a"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/FuturesContractDto$Surrogate;", "", "id", "", "product_id", "symbol", "display_symbol", "description", "multiplier", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "expiration_mmy", "expiration", "customer_last_close_date", "tradability", "Lcom/robinhood/arsenal/proto/v1/idl/FuturesTradabilityDto;", "state", "Lcom/robinhood/arsenal/proto/v1/idl/FuturesStateDto;", "isin", "settlement_start_time", "first_trade_date", "settlement_date", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/FuturesTradabilityDto;Lcom/robinhood/arsenal/proto/v1/idl/FuturesStateDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/FuturesTradabilityDto;Lcom/robinhood/arsenal/proto/v1/idl/FuturesStateDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId$annotations", "()V", "getId", "()Ljava/lang/String;", "getProduct_id$annotations", "getProduct_id", "getSymbol$annotations", "getSymbol", "getDisplay_symbol$annotations", "getDisplay_symbol", "getDescription$annotations", "getDescription", "getMultiplier$annotations", "getMultiplier", "()Lcom/robinhood/idl/IdlDecimal;", "getExpiration_mmy$annotations", "getExpiration_mmy", "getExpiration$annotations", "getExpiration", "getCustomer_last_close_date$annotations", "getCustomer_last_close_date", "getTradability$annotations", "getTradability", "()Lcom/robinhood/arsenal/proto/v1/idl/FuturesTradabilityDto;", "getState$annotations", "getState", "()Lcom/robinhood/arsenal/proto/v1/idl/FuturesStateDto;", "getIsin$annotations", "getIsin", "getSettlement_start_time$annotations", "getSettlement_start_time", "getFirst_trade_date$annotations", "getFirst_trade_date", "getSettlement_date$annotations", "getSettlement_date", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$arsenal_v1_public_externalRelease", "$serializer", "Companion", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String customer_last_close_date;
        private final String description;
        private final String display_symbol;
        private final String expiration;
        private final String expiration_mmy;
        private final String first_trade_date;
        private final String id;
        private final String isin;
        private final IdlDecimal multiplier;
        private final String product_id;
        private final String settlement_date;
        private final String settlement_start_time;
        private final FuturesStateDto state;
        private final String symbol;
        private final FuturesTradabilityDto tradability;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (IdlDecimal) null, (String) null, (String) null, (String) null, (FuturesTradabilityDto) null, (FuturesStateDto) null, (String) null, (String) null, (String) null, (String) null, 32767, (DefaultConstructorMarker) null);
        }

        @SerialName("customerLastCloseDate")
        @JsonAnnotations2(names = {"customer_last_close_date"})
        public static /* synthetic */ void getCustomer_last_close_date$annotations() {
        }

        @SerialName("description")
        @JsonAnnotations2(names = {"description"})
        public static /* synthetic */ void getDescription$annotations() {
        }

        @SerialName("displaySymbol")
        @JsonAnnotations2(names = {"display_symbol"})
        public static /* synthetic */ void getDisplay_symbol$annotations() {
        }

        @SerialName("expiration")
        @JsonAnnotations2(names = {"expiration"})
        public static /* synthetic */ void getExpiration$annotations() {
        }

        @SerialName("expirationMmy")
        @JsonAnnotations2(names = {"expiration_mmy"})
        public static /* synthetic */ void getExpiration_mmy$annotations() {
        }

        @SerialName("firstTradeDate")
        @JsonAnnotations2(names = {"first_trade_date"})
        public static /* synthetic */ void getFirst_trade_date$annotations() {
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("isin")
        @JsonAnnotations2(names = {"isin"})
        public static /* synthetic */ void getIsin$annotations() {
        }

        @SerialName("multiplier")
        @JsonAnnotations2(names = {"multiplier"})
        public static /* synthetic */ void getMultiplier$annotations() {
        }

        @SerialName("productId")
        @JsonAnnotations2(names = {"product_id"})
        public static /* synthetic */ void getProduct_id$annotations() {
        }

        @SerialName("settlementDate")
        @JsonAnnotations2(names = {"settlement_date"})
        public static /* synthetic */ void getSettlement_date$annotations() {
        }

        @SerialName("settlementStartTime")
        @JsonAnnotations2(names = {"settlement_start_time"})
        public static /* synthetic */ void getSettlement_start_time$annotations() {
        }

        @SerialName("state")
        @JsonAnnotations2(names = {"state"})
        public static /* synthetic */ void getState$annotations() {
        }

        @SerialName("symbol")
        @JsonAnnotations2(names = {"symbol"})
        public static /* synthetic */ void getSymbol$annotations() {
        }

        @SerialName("tradability")
        @JsonAnnotations2(names = {"tradability"})
        public static /* synthetic */ void getTradability$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component10, reason: from getter */
        public final FuturesTradabilityDto getTradability() {
            return this.tradability;
        }

        /* renamed from: component11, reason: from getter */
        public final FuturesStateDto getState() {
            return this.state;
        }

        /* renamed from: component12, reason: from getter */
        public final String getIsin() {
            return this.isin;
        }

        /* renamed from: component13, reason: from getter */
        public final String getSettlement_start_time() {
            return this.settlement_start_time;
        }

        /* renamed from: component14, reason: from getter */
        public final String getFirst_trade_date() {
            return this.first_trade_date;
        }

        /* renamed from: component15, reason: from getter */
        public final String getSettlement_date() {
            return this.settlement_date;
        }

        /* renamed from: component2, reason: from getter */
        public final String getProduct_id() {
            return this.product_id;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component4, reason: from getter */
        public final String getDisplay_symbol() {
            return this.display_symbol;
        }

        /* renamed from: component5, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component6, reason: from getter */
        public final IdlDecimal getMultiplier() {
            return this.multiplier;
        }

        /* renamed from: component7, reason: from getter */
        public final String getExpiration_mmy() {
            return this.expiration_mmy;
        }

        /* renamed from: component8, reason: from getter */
        public final String getExpiration() {
            return this.expiration;
        }

        /* renamed from: component9, reason: from getter */
        public final String getCustomer_last_close_date() {
            return this.customer_last_close_date;
        }

        public final Surrogate copy(String id, String product_id, String symbol, String display_symbol, String description, IdlDecimal multiplier, String expiration_mmy, String expiration, String customer_last_close_date, FuturesTradabilityDto tradability, FuturesStateDto state, String isin, String settlement_start_time, String first_trade_date, String settlement_date) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(product_id, "product_id");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(display_symbol, "display_symbol");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(multiplier, "multiplier");
            Intrinsics.checkNotNullParameter(expiration_mmy, "expiration_mmy");
            Intrinsics.checkNotNullParameter(expiration, "expiration");
            Intrinsics.checkNotNullParameter(tradability, "tradability");
            Intrinsics.checkNotNullParameter(state, "state");
            return new Surrogate(id, product_id, symbol, display_symbol, description, multiplier, expiration_mmy, expiration, customer_last_close_date, tradability, state, isin, settlement_start_time, first_trade_date, settlement_date);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.product_id, surrogate.product_id) && Intrinsics.areEqual(this.symbol, surrogate.symbol) && Intrinsics.areEqual(this.display_symbol, surrogate.display_symbol) && Intrinsics.areEqual(this.description, surrogate.description) && Intrinsics.areEqual(this.multiplier, surrogate.multiplier) && Intrinsics.areEqual(this.expiration_mmy, surrogate.expiration_mmy) && Intrinsics.areEqual(this.expiration, surrogate.expiration) && Intrinsics.areEqual(this.customer_last_close_date, surrogate.customer_last_close_date) && this.tradability == surrogate.tradability && this.state == surrogate.state && Intrinsics.areEqual(this.isin, surrogate.isin) && Intrinsics.areEqual(this.settlement_start_time, surrogate.settlement_start_time) && Intrinsics.areEqual(this.first_trade_date, surrogate.first_trade_date) && Intrinsics.areEqual(this.settlement_date, surrogate.settlement_date);
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((this.id.hashCode() * 31) + this.product_id.hashCode()) * 31) + this.symbol.hashCode()) * 31) + this.display_symbol.hashCode()) * 31) + this.description.hashCode()) * 31) + this.multiplier.hashCode()) * 31) + this.expiration_mmy.hashCode()) * 31) + this.expiration.hashCode()) * 31;
            String str = this.customer_last_close_date;
            int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.tradability.hashCode()) * 31) + this.state.hashCode()) * 31;
            String str2 = this.isin;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.settlement_start_time;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.first_trade_date;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.settlement_date;
            return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", product_id=" + this.product_id + ", symbol=" + this.symbol + ", display_symbol=" + this.display_symbol + ", description=" + this.description + ", multiplier=" + this.multiplier + ", expiration_mmy=" + this.expiration_mmy + ", expiration=" + this.expiration + ", customer_last_close_date=" + this.customer_last_close_date + ", tradability=" + this.tradability + ", state=" + this.state + ", isin=" + this.isin + ", settlement_start_time=" + this.settlement_start_time + ", first_trade_date=" + this.first_trade_date + ", settlement_date=" + this.settlement_date + ")";
        }

        /* compiled from: FuturesContractDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/FuturesContractDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/arsenal/proto/v1/idl/FuturesContractDto$Surrogate;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return FuturesContractDto4.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, String str5, IdlDecimal idlDecimal, String str6, String str7, String str8, FuturesTradabilityDto futuresTradabilityDto, FuturesStateDto futuresStateDto, String str9, String str10, String str11, String str12, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.product_id = "";
            } else {
                this.product_id = str2;
            }
            if ((i & 4) == 0) {
                this.symbol = "";
            } else {
                this.symbol = str3;
            }
            if ((i & 8) == 0) {
                this.display_symbol = "";
            } else {
                this.display_symbol = str4;
            }
            if ((i & 16) == 0) {
                this.description = "";
            } else {
                this.description = str5;
            }
            if ((i & 32) == 0) {
                this.multiplier = new IdlDecimal("");
            } else {
                this.multiplier = idlDecimal;
            }
            if ((i & 64) == 0) {
                this.expiration_mmy = "";
            } else {
                this.expiration_mmy = str6;
            }
            if ((i & 128) == 0) {
                this.expiration = "";
            } else {
                this.expiration = str7;
            }
            if ((i & 256) == 0) {
                this.customer_last_close_date = null;
            } else {
                this.customer_last_close_date = str8;
            }
            if ((i & 512) == 0) {
                this.tradability = FuturesTradabilityDto.INSTANCE.getZeroValue();
            } else {
                this.tradability = futuresTradabilityDto;
            }
            if ((i & 1024) == 0) {
                this.state = FuturesStateDto.INSTANCE.getZeroValue();
            } else {
                this.state = futuresStateDto;
            }
            if ((i & 2048) == 0) {
                this.isin = null;
            } else {
                this.isin = str9;
            }
            if ((i & 4096) == 0) {
                this.settlement_start_time = null;
            } else {
                this.settlement_start_time = str10;
            }
            if ((i & 8192) == 0) {
                this.first_trade_date = null;
            } else {
                this.first_trade_date = str11;
            }
            if ((i & 16384) == 0) {
                this.settlement_date = null;
            } else {
                this.settlement_date = str12;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$arsenal_v1_public_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (!Intrinsics.areEqual(self.product_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.product_id);
            }
            if (!Intrinsics.areEqual(self.symbol, "")) {
                output.encodeStringElement(serialDesc, 2, self.symbol);
            }
            if (!Intrinsics.areEqual(self.display_symbol, "")) {
                output.encodeStringElement(serialDesc, 3, self.display_symbol);
            }
            if (!Intrinsics.areEqual(self.description, "")) {
                output.encodeStringElement(serialDesc, 4, self.description);
            }
            if (!Intrinsics.areEqual(self.multiplier, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 5, IdlDecimalSerializer.INSTANCE, self.multiplier);
            }
            if (!Intrinsics.areEqual(self.expiration_mmy, "")) {
                output.encodeStringElement(serialDesc, 6, self.expiration_mmy);
            }
            if (!Intrinsics.areEqual(self.expiration, "")) {
                output.encodeStringElement(serialDesc, 7, self.expiration);
            }
            String str = self.customer_last_close_date;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, str);
            }
            if (self.tradability != FuturesTradabilityDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 9, FuturesTradabilityDto.Serializer.INSTANCE, self.tradability);
            }
            if (self.state != FuturesStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 10, FuturesStateDto.Serializer.INSTANCE, self.state);
            }
            String str2 = self.isin;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, StringSerializer.INSTANCE, str2);
            }
            String str3 = self.settlement_start_time;
            if (str3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, StringSerializer.INSTANCE, str3);
            }
            String str4 = self.first_trade_date;
            if (str4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, StringSerializer.INSTANCE, str4);
            }
            String str5 = self.settlement_date;
            if (str5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 14, StringSerializer.INSTANCE, str5);
            }
        }

        public Surrogate(String id, String product_id, String symbol, String display_symbol, String description, IdlDecimal multiplier, String expiration_mmy, String expiration, String str, FuturesTradabilityDto tradability, FuturesStateDto state, String str2, String str3, String str4, String str5) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(product_id, "product_id");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(display_symbol, "display_symbol");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(multiplier, "multiplier");
            Intrinsics.checkNotNullParameter(expiration_mmy, "expiration_mmy");
            Intrinsics.checkNotNullParameter(expiration, "expiration");
            Intrinsics.checkNotNullParameter(tradability, "tradability");
            Intrinsics.checkNotNullParameter(state, "state");
            this.id = id;
            this.product_id = product_id;
            this.symbol = symbol;
            this.display_symbol = display_symbol;
            this.description = description;
            this.multiplier = multiplier;
            this.expiration_mmy = expiration_mmy;
            this.expiration = expiration;
            this.customer_last_close_date = str;
            this.tradability = tradability;
            this.state = state;
            this.isin = str2;
            this.settlement_start_time = str3;
            this.first_trade_date = str4;
            this.settlement_date = str5;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, String str5, IdlDecimal idlDecimal, String str6, String str7, String str8, FuturesTradabilityDto futuresTradabilityDto, FuturesStateDto futuresStateDto, String str9, String str10, String str11, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? new IdlDecimal("") : idlDecimal, (i & 64) != 0 ? "" : str6, (i & 128) == 0 ? str7 : "", (i & 256) != 0 ? null : str8, (i & 512) != 0 ? FuturesTradabilityDto.INSTANCE.getZeroValue() : futuresTradabilityDto, (i & 1024) != 0 ? FuturesStateDto.INSTANCE.getZeroValue() : futuresStateDto, (i & 2048) != 0 ? null : str9, (i & 4096) != 0 ? null : str10, (i & 8192) != 0 ? null : str11, (i & 16384) != 0 ? null : str12);
        }

        public final String getId() {
            return this.id;
        }

        public final String getProduct_id() {
            return this.product_id;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final String getDisplay_symbol() {
            return this.display_symbol;
        }

        public final String getDescription() {
            return this.description;
        }

        public final IdlDecimal getMultiplier() {
            return this.multiplier;
        }

        public final String getExpiration_mmy() {
            return this.expiration_mmy;
        }

        public final String getExpiration() {
            return this.expiration;
        }

        public final String getCustomer_last_close_date() {
            return this.customer_last_close_date;
        }

        public final FuturesTradabilityDto getTradability() {
            return this.tradability;
        }

        public final FuturesStateDto getState() {
            return this.state;
        }

        public final String getIsin() {
            return this.isin;
        }

        public final String getSettlement_start_time() {
            return this.settlement_start_time;
        }

        public final String getFirst_trade_date() {
            return this.first_trade_date;
        }

        public final String getSettlement_date() {
            return this.settlement_date;
        }
    }

    /* compiled from: FuturesContractDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/FuturesContractDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/arsenal/proto/v1/idl/FuturesContractDto;", "Lcom/robinhood/arsenal/proto/v1/idl/FuturesContract;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/arsenal/proto/v1/idl/FuturesContractDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<FuturesContractDto, FuturesContract> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FuturesContractDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FuturesContractDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FuturesContractDto> getBinaryBase64Serializer() {
            return (KSerializer) FuturesContractDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<FuturesContract> getProtoAdapter() {
            return FuturesContract.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FuturesContractDto getZeroValue() {
            return FuturesContractDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FuturesContractDto fromProto(FuturesContract proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new FuturesContractDto(new Surrogate(proto.getId(), proto.getProduct_id(), proto.getSymbol(), proto.getDisplay_symbol(), proto.getDescription(), new IdlDecimal(proto.getMultiplier()), proto.getExpiration_mmy(), proto.getExpiration(), proto.getCustomer_last_close_date(), FuturesTradabilityDto.INSTANCE.fromProto(proto.getTradability()), FuturesStateDto.INSTANCE.fromProto(proto.getState()), proto.getIsin(), proto.getSettlement_start_time(), proto.getFirst_trade_date(), proto.getSettlement_date()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.arsenal.proto.v1.idl.FuturesContractDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FuturesContractDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new FuturesContractDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: FuturesContractDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/FuturesContractDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/arsenal/proto/v1/idl/FuturesContractDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/arsenal/proto/v1/idl/FuturesContractDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<FuturesContractDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/arsenal.public.FuturesContract", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FuturesContractDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public FuturesContractDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new FuturesContractDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: FuturesContractDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/FuturesContractDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "com.robinhood.arsenal.proto.v1.idl.FuturesContractDto";
        }
    }
}
