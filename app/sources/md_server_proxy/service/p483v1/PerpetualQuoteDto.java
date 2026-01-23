package md_server_proxy.service.p483v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.compose.bidask.BidAskDetails3;
import com.robinhood.android.idl.common.MultibindingShard;
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
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import md_server_proxy.service.p483v1.CurrencyCodeDto;

/* compiled from: PerpetualQuoteDto.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00042134B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bc\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0006\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001eH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001eH\u0016¢\u0006\u0004\b'\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b+\u0010*R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b,\u0010*R\u0011\u0010\f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b-\u0010*R\u0011\u0010\r\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b.\u0010*R\u0011\u0010\u0013\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00065"}, m3636d2 = {"Lmd_server_proxy/service/v1/PerpetualQuoteDto;", "Lcom/robinhood/idl/MessageDto;", "Lmd_server_proxy/service/v1/PerpetualQuote;", "Landroid/os/Parcelable;", "Lmd_server_proxy/service/v1/PerpetualQuoteDto$Surrogate;", "surrogate", "<init>", "(Lmd_server_proxy/service/v1/PerpetualQuoteDto$Surrogate;)V", "Lcom/robinhood/idl/IdlDecimal;", BidAskDetails3.ASK_PRICE, BidAskDetails3.ASK_SIZE, BidAskDetails3.BID_PRICE, BidAskDetails3.BID_SIZE, "mid_price", "", "symbol", "id", "updated_at", "Lmd_server_proxy/service/v1/CurrencyCodeDto;", "currency_code", "(Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmd_server_proxy/service/v1/CurrencyCodeDto;)V", "toProto", "()Lmd_server_proxy/service/v1/PerpetualQuote;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmd_server_proxy/service/v1/PerpetualQuoteDto$Surrogate;", "getAsk_price", "()Lcom/robinhood/idl/IdlDecimal;", "getAsk_size", "getBid_price", "getBid_size", "getMid_price", "getCurrency_code", "()Lmd_server_proxy/service/v1/CurrencyCodeDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes14.dex */
public final class PerpetualQuoteDto implements Dto3<PerpetualQuote>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PerpetualQuoteDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PerpetualQuoteDto, PerpetualQuote>> binaryBase64Serializer$delegate;
    private static final PerpetualQuoteDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PerpetualQuoteDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PerpetualQuoteDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final IdlDecimal getAsk_price() {
        return this.surrogate.getAsk_price();
    }

    public final IdlDecimal getAsk_size() {
        return this.surrogate.getAsk_size();
    }

    public final IdlDecimal getBid_price() {
        return this.surrogate.getBid_price();
    }

    public final IdlDecimal getBid_size() {
        return this.surrogate.getBid_size();
    }

    public final IdlDecimal getMid_price() {
        return this.surrogate.getMid_price();
    }

    public final CurrencyCodeDto getCurrency_code() {
        return this.surrogate.getCurrency_code();
    }

    public /* synthetic */ PerpetualQuoteDto(IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, IdlDecimal idlDecimal5, String str, String str2, String str3, CurrencyCodeDto currencyCodeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal, (i & 2) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 4) != 0 ? new IdlDecimal("") : idlDecimal3, (i & 8) != 0 ? new IdlDecimal("") : idlDecimal4, (i & 16) != 0 ? new IdlDecimal("") : idlDecimal5, (i & 32) != 0 ? "" : str, (i & 64) != 0 ? "" : str2, (i & 128) != 0 ? "" : str3, (i & 256) != 0 ? CurrencyCodeDto.INSTANCE.getZeroValue() : currencyCodeDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PerpetualQuoteDto(IdlDecimal ask_price, IdlDecimal ask_size, IdlDecimal bid_price, IdlDecimal bid_size, IdlDecimal mid_price, String symbol, String id, String updated_at, CurrencyCodeDto currency_code) {
        this(new Surrogate(ask_price, ask_size, bid_price, bid_size, mid_price, symbol, id, updated_at, currency_code));
        Intrinsics.checkNotNullParameter(ask_price, "ask_price");
        Intrinsics.checkNotNullParameter(ask_size, "ask_size");
        Intrinsics.checkNotNullParameter(bid_price, "bid_price");
        Intrinsics.checkNotNullParameter(bid_size, "bid_size");
        Intrinsics.checkNotNullParameter(mid_price, "mid_price");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(updated_at, "updated_at");
        Intrinsics.checkNotNullParameter(currency_code, "currency_code");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public PerpetualQuote toProto() {
        return new PerpetualQuote(this.surrogate.getAsk_price().getStringValue(), this.surrogate.getAsk_size().getStringValue(), this.surrogate.getBid_price().getStringValue(), this.surrogate.getBid_size().getStringValue(), this.surrogate.getMid_price().getStringValue(), this.surrogate.getSymbol(), this.surrogate.getId(), this.surrogate.getUpdated_at(), (CurrencyCode) this.surrogate.getCurrency_code().toProto(), null, 512, null);
    }

    public String toString() {
        return "[PerpetualQuoteDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PerpetualQuoteDto) && Intrinsics.areEqual(((PerpetualQuoteDto) other).surrogate, this.surrogate);
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
    /* compiled from: PerpetualQuoteDto.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0083\b\u0018\u0000 A2\u00020\u0001:\u0002BAB¬\u0001\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\b\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\t\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\n\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012Bu\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010)\u0012\u0004\b,\u0010-\u001a\u0004\b*\u0010+R/\u0010\u0007\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010)\u0012\u0004\b/\u0010-\u001a\u0004\b.\u0010+R/\u0010\b\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010)\u0012\u0004\b1\u0010-\u001a\u0004\b0\u0010+R/\u0010\t\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010)\u0012\u0004\b3\u0010-\u001a\u0004\b2\u0010+R/\u0010\n\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010)\u0012\u0004\b5\u0010-\u001a\u0004\b4\u0010+R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00106\u0012\u0004\b8\u0010-\u001a\u0004\b7\u0010\"R \u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00106\u0012\u0004\b:\u0010-\u001a\u0004\b9\u0010\"R \u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00106\u0012\u0004\b<\u0010-\u001a\u0004\b;\u0010\"R \u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010=\u0012\u0004\b@\u0010-\u001a\u0004\b>\u0010?¨\u0006C"}, m3636d2 = {"Lmd_server_proxy/service/v1/PerpetualQuoteDto$Surrogate;", "", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", BidAskDetails3.ASK_PRICE, BidAskDetails3.ASK_SIZE, BidAskDetails3.BID_PRICE, BidAskDetails3.BID_SIZE, "mid_price", "", "symbol", "id", "updated_at", "Lmd_server_proxy/service/v1/CurrencyCodeDto;", "currency_code", "<init>", "(Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmd_server_proxy/service/v1/CurrencyCodeDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmd_server_proxy/service/v1/CurrencyCodeDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$md_server_proxy_service_v1_externalRelease", "(Lmd_server_proxy/service/v1/PerpetualQuoteDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/idl/IdlDecimal;", "getAsk_price", "()Lcom/robinhood/idl/IdlDecimal;", "getAsk_price$annotations", "()V", "getAsk_size", "getAsk_size$annotations", "getBid_price", "getBid_price$annotations", "getBid_size", "getBid_size$annotations", "getMid_price", "getMid_price$annotations", "Ljava/lang/String;", "getSymbol", "getSymbol$annotations", "getId", "getId$annotations", "getUpdated_at", "getUpdated_at$annotations", "Lmd_server_proxy/service/v1/CurrencyCodeDto;", "getCurrency_code", "()Lmd_server_proxy/service/v1/CurrencyCodeDto;", "getCurrency_code$annotations", "Companion", "$serializer", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final IdlDecimal ask_price;
        private final IdlDecimal ask_size;
        private final IdlDecimal bid_price;
        private final IdlDecimal bid_size;
        private final CurrencyCodeDto currency_code;
        private final String id;
        private final IdlDecimal mid_price;
        private final String symbol;
        private final String updated_at;

        public Surrogate() {
            this((IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (String) null, (String) null, (String) null, (CurrencyCodeDto) null, 511, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.ask_price, surrogate.ask_price) && Intrinsics.areEqual(this.ask_size, surrogate.ask_size) && Intrinsics.areEqual(this.bid_price, surrogate.bid_price) && Intrinsics.areEqual(this.bid_size, surrogate.bid_size) && Intrinsics.areEqual(this.mid_price, surrogate.mid_price) && Intrinsics.areEqual(this.symbol, surrogate.symbol) && Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.updated_at, surrogate.updated_at) && this.currency_code == surrogate.currency_code;
        }

        public int hashCode() {
            return (((((((((((((((this.ask_price.hashCode() * 31) + this.ask_size.hashCode()) * 31) + this.bid_price.hashCode()) * 31) + this.bid_size.hashCode()) * 31) + this.mid_price.hashCode()) * 31) + this.symbol.hashCode()) * 31) + this.id.hashCode()) * 31) + this.updated_at.hashCode()) * 31) + this.currency_code.hashCode();
        }

        public String toString() {
            return "Surrogate(ask_price=" + this.ask_price + ", ask_size=" + this.ask_size + ", bid_price=" + this.bid_price + ", bid_size=" + this.bid_size + ", mid_price=" + this.mid_price + ", symbol=" + this.symbol + ", id=" + this.id + ", updated_at=" + this.updated_at + ", currency_code=" + this.currency_code + ")";
        }

        /* compiled from: PerpetualQuoteDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmd_server_proxy/service/v1/PerpetualQuoteDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmd_server_proxy/service/v1/PerpetualQuoteDto$Surrogate;", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PerpetualQuoteDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, IdlDecimal idlDecimal5, String str, String str2, String str3, CurrencyCodeDto currencyCodeDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.ask_price = (i & 1) == 0 ? new IdlDecimal("") : idlDecimal;
            if ((i & 2) == 0) {
                this.ask_size = new IdlDecimal("");
            } else {
                this.ask_size = idlDecimal2;
            }
            if ((i & 4) == 0) {
                this.bid_price = new IdlDecimal("");
            } else {
                this.bid_price = idlDecimal3;
            }
            if ((i & 8) == 0) {
                this.bid_size = new IdlDecimal("");
            } else {
                this.bid_size = idlDecimal4;
            }
            if ((i & 16) == 0) {
                this.mid_price = new IdlDecimal("");
            } else {
                this.mid_price = idlDecimal5;
            }
            if ((i & 32) == 0) {
                this.symbol = "";
            } else {
                this.symbol = str;
            }
            if ((i & 64) == 0) {
                this.id = "";
            } else {
                this.id = str2;
            }
            if ((i & 128) == 0) {
                this.updated_at = "";
            } else {
                this.updated_at = str3;
            }
            if ((i & 256) == 0) {
                this.currency_code = CurrencyCodeDto.INSTANCE.getZeroValue();
            } else {
                this.currency_code = currencyCodeDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$md_server_proxy_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.ask_price, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 0, IdlDecimalSerializer.INSTANCE, self.ask_price);
            }
            if (!Intrinsics.areEqual(self.ask_size, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 1, IdlDecimalSerializer.INSTANCE, self.ask_size);
            }
            if (!Intrinsics.areEqual(self.bid_price, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 2, IdlDecimalSerializer.INSTANCE, self.bid_price);
            }
            if (!Intrinsics.areEqual(self.bid_size, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 3, IdlDecimalSerializer.INSTANCE, self.bid_size);
            }
            if (!Intrinsics.areEqual(self.mid_price, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 4, IdlDecimalSerializer.INSTANCE, self.mid_price);
            }
            if (!Intrinsics.areEqual(self.symbol, "")) {
                output.encodeStringElement(serialDesc, 5, self.symbol);
            }
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 6, self.id);
            }
            if (!Intrinsics.areEqual(self.updated_at, "")) {
                output.encodeStringElement(serialDesc, 7, self.updated_at);
            }
            if (self.currency_code != CurrencyCodeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 8, CurrencyCodeDto.Serializer.INSTANCE, self.currency_code);
            }
        }

        public Surrogate(IdlDecimal ask_price, IdlDecimal ask_size, IdlDecimal bid_price, IdlDecimal bid_size, IdlDecimal mid_price, String symbol, String id, String updated_at, CurrencyCodeDto currency_code) {
            Intrinsics.checkNotNullParameter(ask_price, "ask_price");
            Intrinsics.checkNotNullParameter(ask_size, "ask_size");
            Intrinsics.checkNotNullParameter(bid_price, "bid_price");
            Intrinsics.checkNotNullParameter(bid_size, "bid_size");
            Intrinsics.checkNotNullParameter(mid_price, "mid_price");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(updated_at, "updated_at");
            Intrinsics.checkNotNullParameter(currency_code, "currency_code");
            this.ask_price = ask_price;
            this.ask_size = ask_size;
            this.bid_price = bid_price;
            this.bid_size = bid_size;
            this.mid_price = mid_price;
            this.symbol = symbol;
            this.id = id;
            this.updated_at = updated_at;
            this.currency_code = currency_code;
        }

        public /* synthetic */ Surrogate(IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, IdlDecimal idlDecimal5, String str, String str2, String str3, CurrencyCodeDto currencyCodeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal, (i & 2) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 4) != 0 ? new IdlDecimal("") : idlDecimal3, (i & 8) != 0 ? new IdlDecimal("") : idlDecimal4, (i & 16) != 0 ? new IdlDecimal("") : idlDecimal5, (i & 32) != 0 ? "" : str, (i & 64) != 0 ? "" : str2, (i & 128) != 0 ? "" : str3, (i & 256) != 0 ? CurrencyCodeDto.INSTANCE.getZeroValue() : currencyCodeDto);
        }

        public final IdlDecimal getAsk_price() {
            return this.ask_price;
        }

        public final IdlDecimal getAsk_size() {
            return this.ask_size;
        }

        public final IdlDecimal getBid_price() {
            return this.bid_price;
        }

        public final IdlDecimal getBid_size() {
            return this.bid_size;
        }

        public final IdlDecimal getMid_price() {
            return this.mid_price;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final String getId() {
            return this.id;
        }

        public final String getUpdated_at() {
            return this.updated_at;
        }

        public final CurrencyCodeDto getCurrency_code() {
            return this.currency_code;
        }
    }

    /* compiled from: PerpetualQuoteDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmd_server_proxy/service/v1/PerpetualQuoteDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmd_server_proxy/service/v1/PerpetualQuoteDto;", "Lmd_server_proxy/service/v1/PerpetualQuote;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmd_server_proxy/service/v1/PerpetualQuoteDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<PerpetualQuoteDto, PerpetualQuote> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PerpetualQuoteDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PerpetualQuoteDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PerpetualQuoteDto> getBinaryBase64Serializer() {
            return (KSerializer) PerpetualQuoteDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PerpetualQuote> getProtoAdapter() {
            return PerpetualQuote.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PerpetualQuoteDto getZeroValue() {
            return PerpetualQuoteDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PerpetualQuoteDto fromProto(PerpetualQuote proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new PerpetualQuoteDto(new Surrogate(new IdlDecimal(proto.getAsk_price()), new IdlDecimal(proto.getAsk_size()), new IdlDecimal(proto.getBid_price()), new IdlDecimal(proto.getBid_size()), new IdlDecimal(proto.getMid_price()), proto.getSymbol(), proto.getId(), proto.getUpdated_at(), CurrencyCodeDto.INSTANCE.fromProto(proto.getCurrency_code())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: md_server_proxy.service.v1.PerpetualQuoteDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PerpetualQuoteDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new PerpetualQuoteDto(null, null, null, null, null, null, null, null, null, 511, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: PerpetualQuoteDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmd_server_proxy/service/v1/PerpetualQuoteDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmd_server_proxy/service/v1/PerpetualQuoteDto;", "<init>", "()V", "surrogateSerializer", "Lmd_server_proxy/service/v1/PerpetualQuoteDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<PerpetualQuoteDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/md_server_proxy.service.v1.PerpetualQuote", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PerpetualQuoteDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PerpetualQuoteDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PerpetualQuoteDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PerpetualQuoteDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmd_server_proxy/service/v1/PerpetualQuoteDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "md_server_proxy.service.v1.PerpetualQuoteDto";
        }
    }
}
