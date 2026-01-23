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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import md_server_proxy.service.p483v1.CurrencyCodeDto;

/* compiled from: TokenizedStockQuoteDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00043245B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0099\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020#H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020#H\u0016¢\u0006\u0004\b,\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-R\u0011\u0010\u000e\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u0010\u0013\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00066"}, m3636d2 = {"Lmd_server_proxy/service/v1/TokenizedStockQuoteDto;", "Lcom/robinhood/idl/MessageDto;", "Lmd_server_proxy/service/v1/TokenizedStockQuote;", "Landroid/os/Parcelable;", "Lmd_server_proxy/service/v1/TokenizedStockQuoteDto$Surrogate;", "surrogate", "<init>", "(Lmd_server_proxy/service/v1/TokenizedStockQuoteDto$Surrogate;)V", "Lcom/robinhood/idl/IdlDecimal;", BidAskDetails3.ASK_PRICE, "", "ask_time", BidAskDetails3.BID_PRICE, "bid_time", "mark_price", "symbol", "id", "updated_at", "Lmd_server_proxy/service/v1/CurrencyCodeDto;", "currency_code", "previous_close", "adjusted_previous_close", "last_trade_price", "last_non_reg_trade_price", "last_extended_hours_trade_price", "(Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmd_server_proxy/service/v1/CurrencyCodeDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;)V", "toProto", "()Lmd_server_proxy/service/v1/TokenizedStockQuote;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmd_server_proxy/service/v1/TokenizedStockQuoteDto$Surrogate;", "getMark_price", "()Lcom/robinhood/idl/IdlDecimal;", "getCurrency_code", "()Lmd_server_proxy/service/v1/CurrencyCodeDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes14.dex */
public final class TokenizedStockQuoteDto implements Dto3<TokenizedStockQuote>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<TokenizedStockQuoteDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TokenizedStockQuoteDto, TokenizedStockQuote>> binaryBase64Serializer$delegate;
    private static final TokenizedStockQuoteDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ TokenizedStockQuoteDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TokenizedStockQuoteDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final IdlDecimal getMark_price() {
        return this.surrogate.getMark_price();
    }

    public final CurrencyCodeDto getCurrency_code() {
        return this.surrogate.getCurrency_code();
    }

    public /* synthetic */ TokenizedStockQuoteDto(IdlDecimal idlDecimal, String str, IdlDecimal idlDecimal2, String str2, IdlDecimal idlDecimal3, String str3, String str4, String str5, CurrencyCodeDto currencyCodeDto, IdlDecimal idlDecimal4, IdlDecimal idlDecimal5, IdlDecimal idlDecimal6, IdlDecimal idlDecimal7, IdlDecimal idlDecimal8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? new IdlDecimal("") : idlDecimal3, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? "" : str5, (i & 256) != 0 ? CurrencyCodeDto.INSTANCE.getZeroValue() : currencyCodeDto, (i & 512) != 0 ? new IdlDecimal("") : idlDecimal4, (i & 1024) != 0 ? new IdlDecimal("") : idlDecimal5, (i & 2048) != 0 ? new IdlDecimal("") : idlDecimal6, (i & 4096) != 0 ? null : idlDecimal7, (i & 8192) != 0 ? null : idlDecimal8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TokenizedStockQuoteDto(IdlDecimal ask_price, String ask_time, IdlDecimal bid_price, String bid_time, IdlDecimal mark_price, String symbol, String id, String updated_at, CurrencyCodeDto currency_code, IdlDecimal previous_close, IdlDecimal adjusted_previous_close, IdlDecimal last_trade_price, IdlDecimal idlDecimal, IdlDecimal idlDecimal2) {
        this(new Surrogate(ask_price, ask_time, bid_price, bid_time, mark_price, symbol, id, updated_at, currency_code, previous_close, adjusted_previous_close, last_trade_price, idlDecimal, idlDecimal2));
        Intrinsics.checkNotNullParameter(ask_price, "ask_price");
        Intrinsics.checkNotNullParameter(ask_time, "ask_time");
        Intrinsics.checkNotNullParameter(bid_price, "bid_price");
        Intrinsics.checkNotNullParameter(bid_time, "bid_time");
        Intrinsics.checkNotNullParameter(mark_price, "mark_price");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(updated_at, "updated_at");
        Intrinsics.checkNotNullParameter(currency_code, "currency_code");
        Intrinsics.checkNotNullParameter(previous_close, "previous_close");
        Intrinsics.checkNotNullParameter(adjusted_previous_close, "adjusted_previous_close");
        Intrinsics.checkNotNullParameter(last_trade_price, "last_trade_price");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public TokenizedStockQuote toProto() {
        String stringValue = this.surrogate.getAsk_price().getStringValue();
        String ask_time = this.surrogate.getAsk_time();
        String stringValue2 = this.surrogate.getBid_price().getStringValue();
        String bid_time = this.surrogate.getBid_time();
        String stringValue3 = this.surrogate.getMark_price().getStringValue();
        String symbol = this.surrogate.getSymbol();
        String id = this.surrogate.getId();
        String updated_at = this.surrogate.getUpdated_at();
        CurrencyCode currencyCode = (CurrencyCode) this.surrogate.getCurrency_code().toProto();
        String stringValue4 = this.surrogate.getPrevious_close().getStringValue();
        String stringValue5 = this.surrogate.getAdjusted_previous_close().getStringValue();
        String stringValue6 = this.surrogate.getLast_trade_price().getStringValue();
        IdlDecimal last_non_reg_trade_price = this.surrogate.getLast_non_reg_trade_price();
        String stringValue7 = last_non_reg_trade_price != null ? last_non_reg_trade_price.getStringValue() : null;
        IdlDecimal last_extended_hours_trade_price = this.surrogate.getLast_extended_hours_trade_price();
        return new TokenizedStockQuote(stringValue, ask_time, stringValue2, bid_time, stringValue3, symbol, id, updated_at, currencyCode, stringValue4, stringValue5, stringValue6, stringValue7, last_extended_hours_trade_price != null ? last_extended_hours_trade_price.getStringValue() : null, null, 16384, null);
    }

    public String toString() {
        return "[TokenizedStockQuoteDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof TokenizedStockQuoteDto) && Intrinsics.areEqual(((TokenizedStockQuoteDto) other).surrogate, this.surrogate);
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
    /* compiled from: TokenizedStockQuoteDto.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b'\b\u0083\b\u0018\u0000 P2\u00020\u0001:\u0002QPB\u008f\u0002\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0017\b\u0002\u0010\t\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\u0017\b\u0002\u0010\u000b\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\u0017\b\u0002\u0010\u0011\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\u0012\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\u0013\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0019\b\u0002\u0010\u0014\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0019\b\u0002\u0010\u0015\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005¢\u0006\u0004\b\u0016\u0010\u0017B§\u0001\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0016\u0010\u001cJ'\u0010%\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010.\u0012\u0004\b1\u00102\u001a\u0004\b/\u00100R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00103\u0012\u0004\b5\u00102\u001a\u0004\b4\u0010'R/\u0010\t\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010.\u0012\u0004\b7\u00102\u001a\u0004\b6\u00100R \u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00103\u0012\u0004\b9\u00102\u001a\u0004\b8\u0010'R/\u0010\u000b\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010.\u0012\u0004\b;\u00102\u001a\u0004\b:\u00100R \u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00103\u0012\u0004\b=\u00102\u001a\u0004\b<\u0010'R \u0010\r\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00103\u0012\u0004\b?\u00102\u001a\u0004\b>\u0010'R \u0010\u000e\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00103\u0012\u0004\bA\u00102\u001a\u0004\b@\u0010'R \u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010B\u0012\u0004\bE\u00102\u001a\u0004\bC\u0010DR/\u0010\u0011\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010.\u0012\u0004\bG\u00102\u001a\u0004\bF\u00100R/\u0010\u0012\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010.\u0012\u0004\bI\u00102\u001a\u0004\bH\u00100R/\u0010\u0013\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010.\u0012\u0004\bK\u00102\u001a\u0004\bJ\u00100R1\u0010\u0014\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010.\u0012\u0004\bM\u00102\u001a\u0004\bL\u00100R1\u0010\u0015\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010.\u0012\u0004\bO\u00102\u001a\u0004\bN\u00100¨\u0006R"}, m3636d2 = {"Lmd_server_proxy/service/v1/TokenizedStockQuoteDto$Surrogate;", "", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", BidAskDetails3.ASK_PRICE, "", "ask_time", BidAskDetails3.BID_PRICE, "bid_time", "mark_price", "symbol", "id", "updated_at", "Lmd_server_proxy/service/v1/CurrencyCodeDto;", "currency_code", "previous_close", "adjusted_previous_close", "last_trade_price", "last_non_reg_trade_price", "last_extended_hours_trade_price", "<init>", "(Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmd_server_proxy/service/v1/CurrencyCodeDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmd_server_proxy/service/v1/CurrencyCodeDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$md_server_proxy_service_v1_externalRelease", "(Lmd_server_proxy/service/v1/TokenizedStockQuoteDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/idl/IdlDecimal;", "getAsk_price", "()Lcom/robinhood/idl/IdlDecimal;", "getAsk_price$annotations", "()V", "Ljava/lang/String;", "getAsk_time", "getAsk_time$annotations", "getBid_price", "getBid_price$annotations", "getBid_time", "getBid_time$annotations", "getMark_price", "getMark_price$annotations", "getSymbol", "getSymbol$annotations", "getId", "getId$annotations", "getUpdated_at", "getUpdated_at$annotations", "Lmd_server_proxy/service/v1/CurrencyCodeDto;", "getCurrency_code", "()Lmd_server_proxy/service/v1/CurrencyCodeDto;", "getCurrency_code$annotations", "getPrevious_close", "getPrevious_close$annotations", "getAdjusted_previous_close", "getAdjusted_previous_close$annotations", "getLast_trade_price", "getLast_trade_price$annotations", "getLast_non_reg_trade_price", "getLast_non_reg_trade_price$annotations", "getLast_extended_hours_trade_price", "getLast_extended_hours_trade_price$annotations", "Companion", "$serializer", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final IdlDecimal adjusted_previous_close;
        private final IdlDecimal ask_price;
        private final String ask_time;
        private final IdlDecimal bid_price;
        private final String bid_time;
        private final CurrencyCodeDto currency_code;
        private final String id;
        private final IdlDecimal last_extended_hours_trade_price;
        private final IdlDecimal last_non_reg_trade_price;
        private final IdlDecimal last_trade_price;
        private final IdlDecimal mark_price;
        private final IdlDecimal previous_close;
        private final String symbol;
        private final String updated_at;

        public Surrogate() {
            this((IdlDecimal) null, (String) null, (IdlDecimal) null, (String) null, (IdlDecimal) null, (String) null, (String) null, (String) null, (CurrencyCodeDto) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, 16383, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.ask_price, surrogate.ask_price) && Intrinsics.areEqual(this.ask_time, surrogate.ask_time) && Intrinsics.areEqual(this.bid_price, surrogate.bid_price) && Intrinsics.areEqual(this.bid_time, surrogate.bid_time) && Intrinsics.areEqual(this.mark_price, surrogate.mark_price) && Intrinsics.areEqual(this.symbol, surrogate.symbol) && Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.updated_at, surrogate.updated_at) && this.currency_code == surrogate.currency_code && Intrinsics.areEqual(this.previous_close, surrogate.previous_close) && Intrinsics.areEqual(this.adjusted_previous_close, surrogate.adjusted_previous_close) && Intrinsics.areEqual(this.last_trade_price, surrogate.last_trade_price) && Intrinsics.areEqual(this.last_non_reg_trade_price, surrogate.last_non_reg_trade_price) && Intrinsics.areEqual(this.last_extended_hours_trade_price, surrogate.last_extended_hours_trade_price);
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((((((((((this.ask_price.hashCode() * 31) + this.ask_time.hashCode()) * 31) + this.bid_price.hashCode()) * 31) + this.bid_time.hashCode()) * 31) + this.mark_price.hashCode()) * 31) + this.symbol.hashCode()) * 31) + this.id.hashCode()) * 31) + this.updated_at.hashCode()) * 31) + this.currency_code.hashCode()) * 31) + this.previous_close.hashCode()) * 31) + this.adjusted_previous_close.hashCode()) * 31) + this.last_trade_price.hashCode()) * 31;
            IdlDecimal idlDecimal = this.last_non_reg_trade_price;
            int iHashCode2 = (iHashCode + (idlDecimal == null ? 0 : idlDecimal.hashCode())) * 31;
            IdlDecimal idlDecimal2 = this.last_extended_hours_trade_price;
            return iHashCode2 + (idlDecimal2 != null ? idlDecimal2.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(ask_price=" + this.ask_price + ", ask_time=" + this.ask_time + ", bid_price=" + this.bid_price + ", bid_time=" + this.bid_time + ", mark_price=" + this.mark_price + ", symbol=" + this.symbol + ", id=" + this.id + ", updated_at=" + this.updated_at + ", currency_code=" + this.currency_code + ", previous_close=" + this.previous_close + ", adjusted_previous_close=" + this.adjusted_previous_close + ", last_trade_price=" + this.last_trade_price + ", last_non_reg_trade_price=" + this.last_non_reg_trade_price + ", last_extended_hours_trade_price=" + this.last_extended_hours_trade_price + ")";
        }

        /* compiled from: TokenizedStockQuoteDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmd_server_proxy/service/v1/TokenizedStockQuoteDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmd_server_proxy/service/v1/TokenizedStockQuoteDto$Surrogate;", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return TokenizedStockQuoteDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, IdlDecimal idlDecimal, String str, IdlDecimal idlDecimal2, String str2, IdlDecimal idlDecimal3, String str3, String str4, String str5, CurrencyCodeDto currencyCodeDto, IdlDecimal idlDecimal4, IdlDecimal idlDecimal5, IdlDecimal idlDecimal6, IdlDecimal idlDecimal7, IdlDecimal idlDecimal8, SerializationConstructorMarker serializationConstructorMarker) {
            this.ask_price = (i & 1) == 0 ? new IdlDecimal("") : idlDecimal;
            if ((i & 2) == 0) {
                this.ask_time = "";
            } else {
                this.ask_time = str;
            }
            if ((i & 4) == 0) {
                this.bid_price = new IdlDecimal("");
            } else {
                this.bid_price = idlDecimal2;
            }
            if ((i & 8) == 0) {
                this.bid_time = "";
            } else {
                this.bid_time = str2;
            }
            if ((i & 16) == 0) {
                this.mark_price = new IdlDecimal("");
            } else {
                this.mark_price = idlDecimal3;
            }
            if ((i & 32) == 0) {
                this.symbol = "";
            } else {
                this.symbol = str3;
            }
            if ((i & 64) == 0) {
                this.id = "";
            } else {
                this.id = str4;
            }
            if ((i & 128) == 0) {
                this.updated_at = "";
            } else {
                this.updated_at = str5;
            }
            if ((i & 256) == 0) {
                this.currency_code = CurrencyCodeDto.INSTANCE.getZeroValue();
            } else {
                this.currency_code = currencyCodeDto;
            }
            if ((i & 512) == 0) {
                this.previous_close = new IdlDecimal("");
            } else {
                this.previous_close = idlDecimal4;
            }
            if ((i & 1024) == 0) {
                this.adjusted_previous_close = new IdlDecimal("");
            } else {
                this.adjusted_previous_close = idlDecimal5;
            }
            if ((i & 2048) == 0) {
                this.last_trade_price = new IdlDecimal("");
            } else {
                this.last_trade_price = idlDecimal6;
            }
            if ((i & 4096) == 0) {
                this.last_non_reg_trade_price = null;
            } else {
                this.last_non_reg_trade_price = idlDecimal7;
            }
            if ((i & 8192) == 0) {
                this.last_extended_hours_trade_price = null;
            } else {
                this.last_extended_hours_trade_price = idlDecimal8;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$md_server_proxy_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.ask_price, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 0, IdlDecimalSerializer.INSTANCE, self.ask_price);
            }
            if (!Intrinsics.areEqual(self.ask_time, "")) {
                output.encodeStringElement(serialDesc, 1, self.ask_time);
            }
            if (!Intrinsics.areEqual(self.bid_price, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 2, IdlDecimalSerializer.INSTANCE, self.bid_price);
            }
            if (!Intrinsics.areEqual(self.bid_time, "")) {
                output.encodeStringElement(serialDesc, 3, self.bid_time);
            }
            if (!Intrinsics.areEqual(self.mark_price, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 4, IdlDecimalSerializer.INSTANCE, self.mark_price);
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
            if (!Intrinsics.areEqual(self.previous_close, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 9, IdlDecimalSerializer.INSTANCE, self.previous_close);
            }
            if (!Intrinsics.areEqual(self.adjusted_previous_close, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 10, IdlDecimalSerializer.INSTANCE, self.adjusted_previous_close);
            }
            if (!Intrinsics.areEqual(self.last_trade_price, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 11, IdlDecimalSerializer.INSTANCE, self.last_trade_price);
            }
            IdlDecimal idlDecimal = self.last_non_reg_trade_price;
            if (idlDecimal != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, IdlDecimalSerializer.INSTANCE, idlDecimal);
            }
            IdlDecimal idlDecimal2 = self.last_extended_hours_trade_price;
            if (idlDecimal2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, IdlDecimalSerializer.INSTANCE, idlDecimal2);
            }
        }

        public Surrogate(IdlDecimal ask_price, String ask_time, IdlDecimal bid_price, String bid_time, IdlDecimal mark_price, String symbol, String id, String updated_at, CurrencyCodeDto currency_code, IdlDecimal previous_close, IdlDecimal adjusted_previous_close, IdlDecimal last_trade_price, IdlDecimal idlDecimal, IdlDecimal idlDecimal2) {
            Intrinsics.checkNotNullParameter(ask_price, "ask_price");
            Intrinsics.checkNotNullParameter(ask_time, "ask_time");
            Intrinsics.checkNotNullParameter(bid_price, "bid_price");
            Intrinsics.checkNotNullParameter(bid_time, "bid_time");
            Intrinsics.checkNotNullParameter(mark_price, "mark_price");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(updated_at, "updated_at");
            Intrinsics.checkNotNullParameter(currency_code, "currency_code");
            Intrinsics.checkNotNullParameter(previous_close, "previous_close");
            Intrinsics.checkNotNullParameter(adjusted_previous_close, "adjusted_previous_close");
            Intrinsics.checkNotNullParameter(last_trade_price, "last_trade_price");
            this.ask_price = ask_price;
            this.ask_time = ask_time;
            this.bid_price = bid_price;
            this.bid_time = bid_time;
            this.mark_price = mark_price;
            this.symbol = symbol;
            this.id = id;
            this.updated_at = updated_at;
            this.currency_code = currency_code;
            this.previous_close = previous_close;
            this.adjusted_previous_close = adjusted_previous_close;
            this.last_trade_price = last_trade_price;
            this.last_non_reg_trade_price = idlDecimal;
            this.last_extended_hours_trade_price = idlDecimal2;
        }

        public /* synthetic */ Surrogate(IdlDecimal idlDecimal, String str, IdlDecimal idlDecimal2, String str2, IdlDecimal idlDecimal3, String str3, String str4, String str5, CurrencyCodeDto currencyCodeDto, IdlDecimal idlDecimal4, IdlDecimal idlDecimal5, IdlDecimal idlDecimal6, IdlDecimal idlDecimal7, IdlDecimal idlDecimal8, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? new IdlDecimal("") : idlDecimal3, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? "" : str5, (i & 256) != 0 ? CurrencyCodeDto.INSTANCE.getZeroValue() : currencyCodeDto, (i & 512) != 0 ? new IdlDecimal("") : idlDecimal4, (i & 1024) != 0 ? new IdlDecimal("") : idlDecimal5, (i & 2048) != 0 ? new IdlDecimal("") : idlDecimal6, (i & 4096) != 0 ? null : idlDecimal7, (i & 8192) != 0 ? null : idlDecimal8);
        }

        public final IdlDecimal getAsk_price() {
            return this.ask_price;
        }

        public final String getAsk_time() {
            return this.ask_time;
        }

        public final IdlDecimal getBid_price() {
            return this.bid_price;
        }

        public final String getBid_time() {
            return this.bid_time;
        }

        public final IdlDecimal getMark_price() {
            return this.mark_price;
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

        public final IdlDecimal getPrevious_close() {
            return this.previous_close;
        }

        public final IdlDecimal getAdjusted_previous_close() {
            return this.adjusted_previous_close;
        }

        public final IdlDecimal getLast_trade_price() {
            return this.last_trade_price;
        }

        public final IdlDecimal getLast_non_reg_trade_price() {
            return this.last_non_reg_trade_price;
        }

        public final IdlDecimal getLast_extended_hours_trade_price() {
            return this.last_extended_hours_trade_price;
        }
    }

    /* compiled from: TokenizedStockQuoteDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmd_server_proxy/service/v1/TokenizedStockQuoteDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmd_server_proxy/service/v1/TokenizedStockQuoteDto;", "Lmd_server_proxy/service/v1/TokenizedStockQuote;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmd_server_proxy/service/v1/TokenizedStockQuoteDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<TokenizedStockQuoteDto, TokenizedStockQuote> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TokenizedStockQuoteDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TokenizedStockQuoteDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TokenizedStockQuoteDto> getBinaryBase64Serializer() {
            return (KSerializer) TokenizedStockQuoteDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TokenizedStockQuote> getProtoAdapter() {
            return TokenizedStockQuote.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TokenizedStockQuoteDto getZeroValue() {
            return TokenizedStockQuoteDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TokenizedStockQuoteDto fromProto(TokenizedStockQuote proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            IdlDecimal idlDecimal = new IdlDecimal(proto.getAsk_price());
            String ask_time = proto.getAsk_time();
            IdlDecimal idlDecimal2 = new IdlDecimal(proto.getBid_price());
            String bid_time = proto.getBid_time();
            IdlDecimal idlDecimal3 = new IdlDecimal(proto.getMark_price());
            String symbol = proto.getSymbol();
            String id = proto.getId();
            String updated_at = proto.getUpdated_at();
            CurrencyCodeDto currencyCodeDtoFromProto = CurrencyCodeDto.INSTANCE.fromProto(proto.getCurrency_code());
            IdlDecimal idlDecimal4 = new IdlDecimal(proto.getPrevious_close());
            IdlDecimal idlDecimal5 = new IdlDecimal(proto.getAdjusted_previous_close());
            IdlDecimal idlDecimal6 = new IdlDecimal(proto.getLast_trade_price());
            String last_non_reg_trade_price = proto.getLast_non_reg_trade_price();
            DefaultConstructorMarker defaultConstructorMarker = null;
            IdlDecimal idlDecimal7 = last_non_reg_trade_price != null ? new IdlDecimal(last_non_reg_trade_price) : null;
            String last_extended_hours_trade_price = proto.getLast_extended_hours_trade_price();
            return new TokenizedStockQuoteDto(new Surrogate(idlDecimal, ask_time, idlDecimal2, bid_time, idlDecimal3, symbol, id, updated_at, currencyCodeDtoFromProto, idlDecimal4, idlDecimal5, idlDecimal6, idlDecimal7, last_extended_hours_trade_price != null ? new IdlDecimal(last_extended_hours_trade_price) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: md_server_proxy.service.v1.TokenizedStockQuoteDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TokenizedStockQuoteDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new TokenizedStockQuoteDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: TokenizedStockQuoteDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmd_server_proxy/service/v1/TokenizedStockQuoteDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmd_server_proxy/service/v1/TokenizedStockQuoteDto;", "<init>", "()V", "surrogateSerializer", "Lmd_server_proxy/service/v1/TokenizedStockQuoteDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<TokenizedStockQuoteDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/md_server_proxy.service.v1.TokenizedStockQuote", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TokenizedStockQuoteDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public TokenizedStockQuoteDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new TokenizedStockQuoteDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: TokenizedStockQuoteDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmd_server_proxy/service/v1/TokenizedStockQuoteDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "md_server_proxy.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "md_server_proxy.service.v1.TokenizedStockQuoteDto";
        }
    }
}
