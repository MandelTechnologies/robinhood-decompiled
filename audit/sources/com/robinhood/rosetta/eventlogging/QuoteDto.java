package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.compose.bidask.BidAskDetails3;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
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

/* compiled from: QuoteDto.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 62\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00045678B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u008b\u0001\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\t\u0012\b\b\u0002\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u0017J\u0088\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\tJ\b\u0010(\u001a\u00020\u0002H\u0016J\b\u0010)\u001a\u00020\tH\u0016J\u0013\u0010*\u001a\u00020\u00132\b\u0010+\u001a\u0004\u0018\u00010,H\u0096\u0002J\b\u0010-\u001a\u00020.H\u0016J\u0018\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020.H\u0016J\b\u00104\u001a\u00020.H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b \u0010\u0019R\u0011\u0010\u0011\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b!\u0010\u0019R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010\u0014\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b$\u0010#R\u0011\u0010\u0015\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0019R\u0011\u0010\u0016\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0019¨\u00069"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/QuoteDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/Quote;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/QuoteDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/QuoteDto$Surrogate;)V", BidAskDetails3.ASK_PRICE, "", BidAskDetails3.ASK_SIZE, BidAskDetails3.BID_PRICE, BidAskDetails3.BID_SIZE, "last_trade_price", "last_extended_hours_trade_price", "previous_close", "adjusted_previous_close", "symbol", "trading_halted", "", "has_traded", "last_trade_price_source", "instrument_id", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;)V", "getAsk_price", "()Ljava/lang/String;", "getAsk_size", "getBid_price", "getBid_size", "getLast_trade_price", "getLast_extended_hours_trade_price", "getPrevious_close", "getAdjusted_previous_close", "getSymbol", "getTrading_halted", "()Z", "getHas_traded", "getLast_trade_price_source", "getInstrument_id", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class QuoteDto implements Dto3<Quote>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<QuoteDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<QuoteDto, Quote>> binaryBase64Serializer$delegate;
    private static final QuoteDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ QuoteDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private QuoteDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getAsk_price() {
        return this.surrogate.getAsk_price();
    }

    public final String getAsk_size() {
        return this.surrogate.getAsk_size();
    }

    public final String getBid_price() {
        return this.surrogate.getBid_price();
    }

    public final String getBid_size() {
        return this.surrogate.getBid_size();
    }

    public final String getLast_trade_price() {
        return this.surrogate.getLast_trade_price();
    }

    public final String getLast_extended_hours_trade_price() {
        return this.surrogate.getLast_extended_hours_trade_price();
    }

    public final String getPrevious_close() {
        return this.surrogate.getPrevious_close();
    }

    public final String getAdjusted_previous_close() {
        return this.surrogate.getAdjusted_previous_close();
    }

    public final String getSymbol() {
        return this.surrogate.getSymbol();
    }

    public final boolean getTrading_halted() {
        return this.surrogate.getTrading_halted();
    }

    public final boolean getHas_traded() {
        return this.surrogate.getHas_traded();
    }

    public final String getLast_trade_price_source() {
        return this.surrogate.getLast_trade_price_source();
    }

    public final String getInstrument_id() {
        return this.surrogate.getInstrument_id();
    }

    public /* synthetic */ QuoteDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? false : z, (i & 1024) == 0 ? z2 : false, (i & 2048) != 0 ? "" : str10, (i & 4096) != 0 ? "" : str11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QuoteDto(String ask_price, String ask_size, String bid_price, String bid_size, String last_trade_price, String last_extended_hours_trade_price, String previous_close, String adjusted_previous_close, String symbol, boolean z, boolean z2, String last_trade_price_source, String instrument_id) {
        this(new Surrogate(ask_price, ask_size, bid_price, bid_size, last_trade_price, last_extended_hours_trade_price, previous_close, adjusted_previous_close, symbol, z, z2, last_trade_price_source, instrument_id));
        Intrinsics.checkNotNullParameter(ask_price, "ask_price");
        Intrinsics.checkNotNullParameter(ask_size, "ask_size");
        Intrinsics.checkNotNullParameter(bid_price, "bid_price");
        Intrinsics.checkNotNullParameter(bid_size, "bid_size");
        Intrinsics.checkNotNullParameter(last_trade_price, "last_trade_price");
        Intrinsics.checkNotNullParameter(last_extended_hours_trade_price, "last_extended_hours_trade_price");
        Intrinsics.checkNotNullParameter(previous_close, "previous_close");
        Intrinsics.checkNotNullParameter(adjusted_previous_close, "adjusted_previous_close");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(last_trade_price_source, "last_trade_price_source");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
    }

    public static /* synthetic */ QuoteDto copy$default(QuoteDto quoteDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2, String str10, String str11, int i, Object obj) {
        if ((i & 1) != 0) {
            str = quoteDto.surrogate.getAsk_price();
        }
        return quoteDto.copy(str, (i & 2) != 0 ? quoteDto.surrogate.getAsk_size() : str2, (i & 4) != 0 ? quoteDto.surrogate.getBid_price() : str3, (i & 8) != 0 ? quoteDto.surrogate.getBid_size() : str4, (i & 16) != 0 ? quoteDto.surrogate.getLast_trade_price() : str5, (i & 32) != 0 ? quoteDto.surrogate.getLast_extended_hours_trade_price() : str6, (i & 64) != 0 ? quoteDto.surrogate.getPrevious_close() : str7, (i & 128) != 0 ? quoteDto.surrogate.getAdjusted_previous_close() : str8, (i & 256) != 0 ? quoteDto.surrogate.getSymbol() : str9, (i & 512) != 0 ? quoteDto.surrogate.getTrading_halted() : z, (i & 1024) != 0 ? quoteDto.surrogate.getHas_traded() : z2, (i & 2048) != 0 ? quoteDto.surrogate.getLast_trade_price_source() : str10, (i & 4096) != 0 ? quoteDto.surrogate.getInstrument_id() : str11);
    }

    public final QuoteDto copy(String ask_price, String ask_size, String bid_price, String bid_size, String last_trade_price, String last_extended_hours_trade_price, String previous_close, String adjusted_previous_close, String symbol, boolean trading_halted, boolean has_traded, String last_trade_price_source, String instrument_id) {
        Intrinsics.checkNotNullParameter(ask_price, "ask_price");
        Intrinsics.checkNotNullParameter(ask_size, "ask_size");
        Intrinsics.checkNotNullParameter(bid_price, "bid_price");
        Intrinsics.checkNotNullParameter(bid_size, "bid_size");
        Intrinsics.checkNotNullParameter(last_trade_price, "last_trade_price");
        Intrinsics.checkNotNullParameter(last_extended_hours_trade_price, "last_extended_hours_trade_price");
        Intrinsics.checkNotNullParameter(previous_close, "previous_close");
        Intrinsics.checkNotNullParameter(adjusted_previous_close, "adjusted_previous_close");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(last_trade_price_source, "last_trade_price_source");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        return new QuoteDto(new Surrogate(ask_price, ask_size, bid_price, bid_size, last_trade_price, last_extended_hours_trade_price, previous_close, adjusted_previous_close, symbol, trading_halted, has_traded, last_trade_price_source, instrument_id));
    }

    @Override // com.robinhood.idl.Dto
    public Quote toProto() {
        return new Quote(this.surrogate.getAsk_price(), this.surrogate.getAsk_size(), this.surrogate.getBid_price(), this.surrogate.getBid_size(), this.surrogate.getLast_trade_price(), this.surrogate.getLast_extended_hours_trade_price(), this.surrogate.getPrevious_close(), this.surrogate.getAdjusted_previous_close(), this.surrogate.getSymbol(), this.surrogate.getTrading_halted(), this.surrogate.getHas_traded(), this.surrogate.getLast_trade_price_source(), this.surrogate.getInstrument_id(), null, 8192, null);
    }

    public String toString() {
        return "[QuoteDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof QuoteDto) && Intrinsics.areEqual(((QuoteDto) other).surrogate, this.surrogate);
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
    /* compiled from: QuoteDto.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 P2\u00020\u0001:\u0002OPB\u0089\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012B\u0099\u0001\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0011\u0010\u0017J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\rHÆ\u0003J\t\u0010?\u001a\u00020\rHÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\u008b\u0001\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\u0013\u0010C\u001a\u00020\r2\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010E\u001a\u00020\u0014HÖ\u0001J\t\u0010F\u001a\u00020\u0003HÖ\u0001J%\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\u00002\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020MH\u0001¢\u0006\u0002\bNR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001bR\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0019\u001a\u0004\b#\u0010\u001bR\u001c\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0019\u001a\u0004\b%\u0010\u001bR\u001c\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u0019\u001a\u0004\b'\u0010\u001bR\u001c\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u0019\u001a\u0004\b)\u0010\u001bR\u001c\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u0019\u001a\u0004\b+\u0010\u001bR\u001c\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010\u0019\u001a\u0004\b-\u0010.R\u001c\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u0010\u0019\u001a\u0004\b0\u0010.R\u001c\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b1\u0010\u0019\u001a\u0004\b2\u0010\u001bR\u001c\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b3\u0010\u0019\u001a\u0004\b4\u0010\u001b¨\u0006Q"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/QuoteDto$Surrogate;", "", BidAskDetails3.ASK_PRICE, "", BidAskDetails3.ASK_SIZE, BidAskDetails3.BID_PRICE, BidAskDetails3.BID_SIZE, "last_trade_price", "last_extended_hours_trade_price", "previous_close", "adjusted_previous_close", "symbol", "trading_halted", "", "has_traded", "last_trade_price_source", "instrument_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAsk_price$annotations", "()V", "getAsk_price", "()Ljava/lang/String;", "getAsk_size$annotations", "getAsk_size", "getBid_price$annotations", "getBid_price", "getBid_size$annotations", "getBid_size", "getLast_trade_price$annotations", "getLast_trade_price", "getLast_extended_hours_trade_price$annotations", "getLast_extended_hours_trade_price", "getPrevious_close$annotations", "getPrevious_close", "getAdjusted_previous_close$annotations", "getAdjusted_previous_close", "getSymbol$annotations", "getSymbol", "getTrading_halted$annotations", "getTrading_halted", "()Z", "getHas_traded$annotations", "getHas_traded", "getLast_trade_price_source$annotations", "getLast_trade_price_source", "getInstrument_id$annotations", "getInstrument_id", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String adjusted_previous_close;
        private final String ask_price;
        private final String ask_size;
        private final String bid_price;
        private final String bid_size;
        private final boolean has_traded;
        private final String instrument_id;
        private final String last_extended_hours_trade_price;
        private final String last_trade_price;
        private final String last_trade_price_source;
        private final String previous_close;
        private final String symbol;
        private final boolean trading_halted;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, (String) null, (String) null, 8191, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2, String str10, String str11, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.ask_price;
            }
            return surrogate.copy(str, (i & 2) != 0 ? surrogate.ask_size : str2, (i & 4) != 0 ? surrogate.bid_price : str3, (i & 8) != 0 ? surrogate.bid_size : str4, (i & 16) != 0 ? surrogate.last_trade_price : str5, (i & 32) != 0 ? surrogate.last_extended_hours_trade_price : str6, (i & 64) != 0 ? surrogate.previous_close : str7, (i & 128) != 0 ? surrogate.adjusted_previous_close : str8, (i & 256) != 0 ? surrogate.symbol : str9, (i & 512) != 0 ? surrogate.trading_halted : z, (i & 1024) != 0 ? surrogate.has_traded : z2, (i & 2048) != 0 ? surrogate.last_trade_price_source : str10, (i & 4096) != 0 ? surrogate.instrument_id : str11);
        }

        @SerialName("adjustedPreviousClose")
        @JsonAnnotations2(names = {"adjusted_previous_close"})
        public static /* synthetic */ void getAdjusted_previous_close$annotations() {
        }

        @SerialName("askPrice")
        @JsonAnnotations2(names = {BidAskDetails3.ASK_PRICE})
        public static /* synthetic */ void getAsk_price$annotations() {
        }

        @SerialName("askSize")
        @JsonAnnotations2(names = {BidAskDetails3.ASK_SIZE})
        public static /* synthetic */ void getAsk_size$annotations() {
        }

        @SerialName("bidPrice")
        @JsonAnnotations2(names = {BidAskDetails3.BID_PRICE})
        public static /* synthetic */ void getBid_price$annotations() {
        }

        @SerialName("bidSize")
        @JsonAnnotations2(names = {BidAskDetails3.BID_SIZE})
        public static /* synthetic */ void getBid_size$annotations() {
        }

        @SerialName("hasTraded")
        @JsonAnnotations2(names = {"has_traded"})
        public static /* synthetic */ void getHas_traded$annotations() {
        }

        @SerialName("instrumentId")
        @JsonAnnotations2(names = {"instrument_id"})
        public static /* synthetic */ void getInstrument_id$annotations() {
        }

        @SerialName("lastExtendedHoursTradePrice")
        @JsonAnnotations2(names = {"last_extended_hours_trade_price"})
        public static /* synthetic */ void getLast_extended_hours_trade_price$annotations() {
        }

        @SerialName("lastTradePrice")
        @JsonAnnotations2(names = {"last_trade_price"})
        public static /* synthetic */ void getLast_trade_price$annotations() {
        }

        @SerialName("lastTradePriceSource")
        @JsonAnnotations2(names = {"last_trade_price_source"})
        public static /* synthetic */ void getLast_trade_price_source$annotations() {
        }

        @SerialName("previousClose")
        @JsonAnnotations2(names = {"previous_close"})
        public static /* synthetic */ void getPrevious_close$annotations() {
        }

        @SerialName("symbol")
        @JsonAnnotations2(names = {"symbol"})
        public static /* synthetic */ void getSymbol$annotations() {
        }

        @SerialName("tradingHalted")
        @JsonAnnotations2(names = {"trading_halted"})
        public static /* synthetic */ void getTrading_halted$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getAsk_price() {
            return this.ask_price;
        }

        /* renamed from: component10, reason: from getter */
        public final boolean getTrading_halted() {
            return this.trading_halted;
        }

        /* renamed from: component11, reason: from getter */
        public final boolean getHas_traded() {
            return this.has_traded;
        }

        /* renamed from: component12, reason: from getter */
        public final String getLast_trade_price_source() {
            return this.last_trade_price_source;
        }

        /* renamed from: component13, reason: from getter */
        public final String getInstrument_id() {
            return this.instrument_id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAsk_size() {
            return this.ask_size;
        }

        /* renamed from: component3, reason: from getter */
        public final String getBid_price() {
            return this.bid_price;
        }

        /* renamed from: component4, reason: from getter */
        public final String getBid_size() {
            return this.bid_size;
        }

        /* renamed from: component5, reason: from getter */
        public final String getLast_trade_price() {
            return this.last_trade_price;
        }

        /* renamed from: component6, reason: from getter */
        public final String getLast_extended_hours_trade_price() {
            return this.last_extended_hours_trade_price;
        }

        /* renamed from: component7, reason: from getter */
        public final String getPrevious_close() {
            return this.previous_close;
        }

        /* renamed from: component8, reason: from getter */
        public final String getAdjusted_previous_close() {
            return this.adjusted_previous_close;
        }

        /* renamed from: component9, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        public final Surrogate copy(String ask_price, String ask_size, String bid_price, String bid_size, String last_trade_price, String last_extended_hours_trade_price, String previous_close, String adjusted_previous_close, String symbol, boolean trading_halted, boolean has_traded, String last_trade_price_source, String instrument_id) {
            Intrinsics.checkNotNullParameter(ask_price, "ask_price");
            Intrinsics.checkNotNullParameter(ask_size, "ask_size");
            Intrinsics.checkNotNullParameter(bid_price, "bid_price");
            Intrinsics.checkNotNullParameter(bid_size, "bid_size");
            Intrinsics.checkNotNullParameter(last_trade_price, "last_trade_price");
            Intrinsics.checkNotNullParameter(last_extended_hours_trade_price, "last_extended_hours_trade_price");
            Intrinsics.checkNotNullParameter(previous_close, "previous_close");
            Intrinsics.checkNotNullParameter(adjusted_previous_close, "adjusted_previous_close");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(last_trade_price_source, "last_trade_price_source");
            Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
            return new Surrogate(ask_price, ask_size, bid_price, bid_size, last_trade_price, last_extended_hours_trade_price, previous_close, adjusted_previous_close, symbol, trading_halted, has_traded, last_trade_price_source, instrument_id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.ask_price, surrogate.ask_price) && Intrinsics.areEqual(this.ask_size, surrogate.ask_size) && Intrinsics.areEqual(this.bid_price, surrogate.bid_price) && Intrinsics.areEqual(this.bid_size, surrogate.bid_size) && Intrinsics.areEqual(this.last_trade_price, surrogate.last_trade_price) && Intrinsics.areEqual(this.last_extended_hours_trade_price, surrogate.last_extended_hours_trade_price) && Intrinsics.areEqual(this.previous_close, surrogate.previous_close) && Intrinsics.areEqual(this.adjusted_previous_close, surrogate.adjusted_previous_close) && Intrinsics.areEqual(this.symbol, surrogate.symbol) && this.trading_halted == surrogate.trading_halted && this.has_traded == surrogate.has_traded && Intrinsics.areEqual(this.last_trade_price_source, surrogate.last_trade_price_source) && Intrinsics.areEqual(this.instrument_id, surrogate.instrument_id);
        }

        public int hashCode() {
            return (((((((((((((((((((((((this.ask_price.hashCode() * 31) + this.ask_size.hashCode()) * 31) + this.bid_price.hashCode()) * 31) + this.bid_size.hashCode()) * 31) + this.last_trade_price.hashCode()) * 31) + this.last_extended_hours_trade_price.hashCode()) * 31) + this.previous_close.hashCode()) * 31) + this.adjusted_previous_close.hashCode()) * 31) + this.symbol.hashCode()) * 31) + java.lang.Boolean.hashCode(this.trading_halted)) * 31) + java.lang.Boolean.hashCode(this.has_traded)) * 31) + this.last_trade_price_source.hashCode()) * 31) + this.instrument_id.hashCode();
        }

        public String toString() {
            return "Surrogate(ask_price=" + this.ask_price + ", ask_size=" + this.ask_size + ", bid_price=" + this.bid_price + ", bid_size=" + this.bid_size + ", last_trade_price=" + this.last_trade_price + ", last_extended_hours_trade_price=" + this.last_extended_hours_trade_price + ", previous_close=" + this.previous_close + ", adjusted_previous_close=" + this.adjusted_previous_close + ", symbol=" + this.symbol + ", trading_halted=" + this.trading_halted + ", has_traded=" + this.has_traded + ", last_trade_price_source=" + this.last_trade_price_source + ", instrument_id=" + this.instrument_id + ")";
        }

        /* compiled from: QuoteDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/QuoteDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/QuoteDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return QuoteDto4.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2, String str10, String str11, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.ask_price = "";
            } else {
                this.ask_price = str;
            }
            if ((i & 2) == 0) {
                this.ask_size = "";
            } else {
                this.ask_size = str2;
            }
            if ((i & 4) == 0) {
                this.bid_price = "";
            } else {
                this.bid_price = str3;
            }
            if ((i & 8) == 0) {
                this.bid_size = "";
            } else {
                this.bid_size = str4;
            }
            if ((i & 16) == 0) {
                this.last_trade_price = "";
            } else {
                this.last_trade_price = str5;
            }
            if ((i & 32) == 0) {
                this.last_extended_hours_trade_price = "";
            } else {
                this.last_extended_hours_trade_price = str6;
            }
            if ((i & 64) == 0) {
                this.previous_close = "";
            } else {
                this.previous_close = str7;
            }
            if ((i & 128) == 0) {
                this.adjusted_previous_close = "";
            } else {
                this.adjusted_previous_close = str8;
            }
            if ((i & 256) == 0) {
                this.symbol = "";
            } else {
                this.symbol = str9;
            }
            if ((i & 512) == 0) {
                this.trading_halted = false;
            } else {
                this.trading_halted = z;
            }
            if ((i & 1024) == 0) {
                this.has_traded = false;
            } else {
                this.has_traded = z2;
            }
            if ((i & 2048) == 0) {
                this.last_trade_price_source = "";
            } else {
                this.last_trade_price_source = str10;
            }
            if ((i & 4096) == 0) {
                this.instrument_id = "";
            } else {
                this.instrument_id = str11;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.ask_price, "")) {
                output.encodeStringElement(serialDesc, 0, self.ask_price);
            }
            if (!Intrinsics.areEqual(self.ask_size, "")) {
                output.encodeStringElement(serialDesc, 1, self.ask_size);
            }
            if (!Intrinsics.areEqual(self.bid_price, "")) {
                output.encodeStringElement(serialDesc, 2, self.bid_price);
            }
            if (!Intrinsics.areEqual(self.bid_size, "")) {
                output.encodeStringElement(serialDesc, 3, self.bid_size);
            }
            if (!Intrinsics.areEqual(self.last_trade_price, "")) {
                output.encodeStringElement(serialDesc, 4, self.last_trade_price);
            }
            if (!Intrinsics.areEqual(self.last_extended_hours_trade_price, "")) {
                output.encodeStringElement(serialDesc, 5, self.last_extended_hours_trade_price);
            }
            if (!Intrinsics.areEqual(self.previous_close, "")) {
                output.encodeStringElement(serialDesc, 6, self.previous_close);
            }
            if (!Intrinsics.areEqual(self.adjusted_previous_close, "")) {
                output.encodeStringElement(serialDesc, 7, self.adjusted_previous_close);
            }
            if (!Intrinsics.areEqual(self.symbol, "")) {
                output.encodeStringElement(serialDesc, 8, self.symbol);
            }
            boolean z = self.trading_halted;
            if (z) {
                output.encodeBooleanElement(serialDesc, 9, z);
            }
            boolean z2 = self.has_traded;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 10, z2);
            }
            if (!Intrinsics.areEqual(self.last_trade_price_source, "")) {
                output.encodeStringElement(serialDesc, 11, self.last_trade_price_source);
            }
            if (Intrinsics.areEqual(self.instrument_id, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 12, self.instrument_id);
        }

        public Surrogate(String ask_price, String ask_size, String bid_price, String bid_size, String last_trade_price, String last_extended_hours_trade_price, String previous_close, String adjusted_previous_close, String symbol, boolean z, boolean z2, String last_trade_price_source, String instrument_id) {
            Intrinsics.checkNotNullParameter(ask_price, "ask_price");
            Intrinsics.checkNotNullParameter(ask_size, "ask_size");
            Intrinsics.checkNotNullParameter(bid_price, "bid_price");
            Intrinsics.checkNotNullParameter(bid_size, "bid_size");
            Intrinsics.checkNotNullParameter(last_trade_price, "last_trade_price");
            Intrinsics.checkNotNullParameter(last_extended_hours_trade_price, "last_extended_hours_trade_price");
            Intrinsics.checkNotNullParameter(previous_close, "previous_close");
            Intrinsics.checkNotNullParameter(adjusted_previous_close, "adjusted_previous_close");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(last_trade_price_source, "last_trade_price_source");
            Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
            this.ask_price = ask_price;
            this.ask_size = ask_size;
            this.bid_price = bid_price;
            this.bid_size = bid_size;
            this.last_trade_price = last_trade_price;
            this.last_extended_hours_trade_price = last_extended_hours_trade_price;
            this.previous_close = previous_close;
            this.adjusted_previous_close = adjusted_previous_close;
            this.symbol = symbol;
            this.trading_halted = z;
            this.has_traded = z2;
            this.last_trade_price_source = last_trade_price_source;
            this.instrument_id = instrument_id;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? false : z, (i & 1024) == 0 ? z2 : false, (i & 2048) != 0 ? "" : str10, (i & 4096) != 0 ? "" : str11);
        }

        public final String getAsk_price() {
            return this.ask_price;
        }

        public final String getAsk_size() {
            return this.ask_size;
        }

        public final String getBid_price() {
            return this.bid_price;
        }

        public final String getBid_size() {
            return this.bid_size;
        }

        public final String getLast_trade_price() {
            return this.last_trade_price;
        }

        public final String getLast_extended_hours_trade_price() {
            return this.last_extended_hours_trade_price;
        }

        public final String getPrevious_close() {
            return this.previous_close;
        }

        public final String getAdjusted_previous_close() {
            return this.adjusted_previous_close;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final boolean getTrading_halted() {
            return this.trading_halted;
        }

        public final boolean getHas_traded() {
            return this.has_traded;
        }

        public final String getLast_trade_price_source() {
            return this.last_trade_price_source;
        }

        public final String getInstrument_id() {
            return this.instrument_id;
        }
    }

    /* compiled from: QuoteDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/QuoteDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/QuoteDto;", "Lcom/robinhood/rosetta/eventlogging/Quote;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/QuoteDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<QuoteDto, Quote> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<QuoteDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<QuoteDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<QuoteDto> getBinaryBase64Serializer() {
            return (KSerializer) QuoteDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Quote> getProtoAdapter() {
            return Quote.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public QuoteDto getZeroValue() {
            return QuoteDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public QuoteDto fromProto(Quote proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new QuoteDto(new Surrogate(proto.getAsk_price(), proto.getAsk_size(), proto.getBid_price(), proto.getBid_size(), proto.getLast_trade_price(), proto.getLast_extended_hours_trade_price(), proto.getPrevious_close(), proto.getAdjusted_previous_close(), proto.getSymbol(), proto.getTrading_halted(), proto.getHas_traded(), proto.getLast_trade_price_source(), proto.getInstrument_id()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.QuoteDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QuoteDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new QuoteDto(null, null, null, null, null, null, null, null, null, false, false, null, null, 8191, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: QuoteDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/QuoteDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/QuoteDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/QuoteDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<QuoteDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.Quote", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, QuoteDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public QuoteDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new QuoteDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: QuoteDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/QuoteDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.QuoteDto";
        }
    }
}
