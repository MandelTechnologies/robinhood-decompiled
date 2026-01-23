package rosetta.portfolio.p541v1;

import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.rosetta.common.Currency;
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

/* compiled from: GetAccountValueResponse.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 D2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001DB\u0091\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\b\u0010;\u001a\u00020\u0002H\u0017J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?H\u0096\u0002J\b\u0010@\u001a\u00020AH\u0016J\b\u0010B\u001a\u00020\u0004H\u0016J\u0090\u0002\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u001eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\"R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\"R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\"R\u0016\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\"R\u0016\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\"R\u0016\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\"R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\"R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\"R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\"R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\"R\u0016\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\"R\u0016\u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\"R\u0016\u0010\u0015\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\"R\u0016\u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\"R\u0016\u0010\u0017\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\"R\u0016\u0010\u0018\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\"R\u0016\u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\"R\u0016\u0010\u001a\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0016\u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\"¨\u0006E"}, m3636d2 = {"Lrosetta/portfolio/v1/GetAccountValueResponse;", "Lcom/squareup/wire/Message;", "", "url", "", "account", "start_date", "market_value", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_EQUITY, "extended_hours_market_value", "extended_hours_equity", "extended_hours_portfolio_equity", "last_core_market_value", "last_core_equity", "last_core_portfolio_equity", "excess_margin", "excess_maintenance", "excess_margin_with_uncleared_deposits", "excess_maintenance_with_uncleared_deposits", "equity_previous_close", "portfolio_equity_previous_close", "adjusted_equity_previous_close", "adjusted_portfolio_equity_previous_close", "withdrawable_amount", "unwithdrawable_deposits", "unwithdrawable_grants", "display_currency", "Lcom/robinhood/rosetta/common/Currency;", "last_core_market_value_absolute", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/Currency;Ljava/lang/String;Lokio/ByteString;)V", "getUrl", "()Ljava/lang/String;", "getAccount", "getStart_date", "getMarket_value", "getEquity", "getExtended_hours_market_value", "getExtended_hours_equity", "getExtended_hours_portfolio_equity", "getLast_core_market_value", "getLast_core_equity", "getLast_core_portfolio_equity", "getExcess_margin", "getExcess_maintenance", "getExcess_margin_with_uncleared_deposits", "getExcess_maintenance_with_uncleared_deposits", "getEquity_previous_close", "getPortfolio_equity_previous_close", "getAdjusted_equity_previous_close", "getAdjusted_portfolio_equity_previous_close", "getWithdrawable_amount", "getUnwithdrawable_deposits", "getUnwithdrawable_grants", "getDisplay_currency", "()Lcom/robinhood/rosetta/common/Currency;", "getLast_core_market_value_absolute", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class GetAccountValueResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetAccountValueResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String account;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 18)
    private final String adjusted_equity_previous_close;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 18, tag = 19)
    private final String adjusted_portfolio_equity_previous_close;

    @WireField(adapter = "com.robinhood.rosetta.common.Currency#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 22, tag = 23)
    private final Currency display_currency;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String equity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 16)
    private final String equity_previous_close;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 12, tag = 13)
    private final String excess_maintenance;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 14, tag = 15)
    private final String excess_maintenance_with_uncleared_deposits;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 11, tag = 12)
    private final String excess_margin;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 13, tag = 14)
    private final String excess_margin_with_uncleared_deposits;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 7)
    private final String extended_hours_equity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
    private final String extended_hours_market_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 7, tag = 8)
    private final String extended_hours_portfolio_equity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final String last_core_equity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String last_core_market_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 23, tag = 24)
    private final String last_core_market_value_absolute;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final String last_core_portfolio_equity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String market_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 17)
    private final String portfolio_equity_previous_close;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    private final String start_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 20, tag = 21)
    private final String unwithdrawable_deposits;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 21, tag = 22)
    private final String unwithdrawable_grants;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 19, tag = 20)
    private final String withdrawable_amount;

    public GetAccountValueResponse() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554431, null);
    }

    public /* synthetic */ GetAccountValueResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, Currency currency, String str23, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) != 0 ? null : str14, (i & 16384) != 0 ? null : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17, (i & 131072) != 0 ? "" : str18, (i & 262144) != 0 ? "" : str19, (i & 524288) != 0 ? "" : str20, (i & 1048576) != 0 ? "" : str21, (i & 2097152) != 0 ? "" : str22, (i & 4194304) != 0 ? Currency.CURRENCY_UNSPECIFIED : currency, (i & 8388608) == 0 ? str23 : "", (i & 16777216) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29924newBuilder();
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getAccount() {
        return this.account;
    }

    public final String getStart_date() {
        return this.start_date;
    }

    public final String getMarket_value() {
        return this.market_value;
    }

    public final String getEquity() {
        return this.equity;
    }

    public final String getExtended_hours_market_value() {
        return this.extended_hours_market_value;
    }

    public final String getExtended_hours_equity() {
        return this.extended_hours_equity;
    }

    public final String getExtended_hours_portfolio_equity() {
        return this.extended_hours_portfolio_equity;
    }

    public final String getLast_core_market_value() {
        return this.last_core_market_value;
    }

    public final String getLast_core_equity() {
        return this.last_core_equity;
    }

    public final String getLast_core_portfolio_equity() {
        return this.last_core_portfolio_equity;
    }

    public final String getExcess_margin() {
        return this.excess_margin;
    }

    public final String getExcess_maintenance() {
        return this.excess_maintenance;
    }

    public final String getExcess_margin_with_uncleared_deposits() {
        return this.excess_margin_with_uncleared_deposits;
    }

    public final String getExcess_maintenance_with_uncleared_deposits() {
        return this.excess_maintenance_with_uncleared_deposits;
    }

    public final String getEquity_previous_close() {
        return this.equity_previous_close;
    }

    public final String getPortfolio_equity_previous_close() {
        return this.portfolio_equity_previous_close;
    }

    public final String getAdjusted_equity_previous_close() {
        return this.adjusted_equity_previous_close;
    }

    public final String getAdjusted_portfolio_equity_previous_close() {
        return this.adjusted_portfolio_equity_previous_close;
    }

    public final String getWithdrawable_amount() {
        return this.withdrawable_amount;
    }

    public final String getUnwithdrawable_deposits() {
        return this.unwithdrawable_deposits;
    }

    public final String getUnwithdrawable_grants() {
        return this.unwithdrawable_grants;
    }

    public final Currency getDisplay_currency() {
        return this.display_currency;
    }

    public final String getLast_core_market_value_absolute() {
        return this.last_core_market_value_absolute;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAccountValueResponse(String url, String account, String str, String market_value, String equity, String str2, String str3, String str4, String last_core_market_value, String last_core_equity, String last_core_portfolio_equity, String str5, String str6, String str7, String str8, String equity_previous_close, String portfolio_equity_previous_close, String adjusted_equity_previous_close, String adjusted_portfolio_equity_previous_close, String withdrawable_amount, String unwithdrawable_deposits, String unwithdrawable_grants, Currency display_currency, String last_core_market_value_absolute, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(market_value, "market_value");
        Intrinsics.checkNotNullParameter(equity, "equity");
        Intrinsics.checkNotNullParameter(last_core_market_value, "last_core_market_value");
        Intrinsics.checkNotNullParameter(last_core_equity, "last_core_equity");
        Intrinsics.checkNotNullParameter(last_core_portfolio_equity, "last_core_portfolio_equity");
        Intrinsics.checkNotNullParameter(equity_previous_close, "equity_previous_close");
        Intrinsics.checkNotNullParameter(portfolio_equity_previous_close, "portfolio_equity_previous_close");
        Intrinsics.checkNotNullParameter(adjusted_equity_previous_close, "adjusted_equity_previous_close");
        Intrinsics.checkNotNullParameter(adjusted_portfolio_equity_previous_close, "adjusted_portfolio_equity_previous_close");
        Intrinsics.checkNotNullParameter(withdrawable_amount, "withdrawable_amount");
        Intrinsics.checkNotNullParameter(unwithdrawable_deposits, "unwithdrawable_deposits");
        Intrinsics.checkNotNullParameter(unwithdrawable_grants, "unwithdrawable_grants");
        Intrinsics.checkNotNullParameter(display_currency, "display_currency");
        Intrinsics.checkNotNullParameter(last_core_market_value_absolute, "last_core_market_value_absolute");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.url = url;
        this.account = account;
        this.start_date = str;
        this.market_value = market_value;
        this.equity = equity;
        this.extended_hours_market_value = str2;
        this.extended_hours_equity = str3;
        this.extended_hours_portfolio_equity = str4;
        this.last_core_market_value = last_core_market_value;
        this.last_core_equity = last_core_equity;
        this.last_core_portfolio_equity = last_core_portfolio_equity;
        this.excess_margin = str5;
        this.excess_maintenance = str6;
        this.excess_margin_with_uncleared_deposits = str7;
        this.excess_maintenance_with_uncleared_deposits = str8;
        this.equity_previous_close = equity_previous_close;
        this.portfolio_equity_previous_close = portfolio_equity_previous_close;
        this.adjusted_equity_previous_close = adjusted_equity_previous_close;
        this.adjusted_portfolio_equity_previous_close = adjusted_portfolio_equity_previous_close;
        this.withdrawable_amount = withdrawable_amount;
        this.unwithdrawable_deposits = unwithdrawable_deposits;
        this.unwithdrawable_grants = unwithdrawable_grants;
        this.display_currency = display_currency;
        this.last_core_market_value_absolute = last_core_market_value_absolute;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29924newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetAccountValueResponse)) {
            return false;
        }
        GetAccountValueResponse getAccountValueResponse = (GetAccountValueResponse) other;
        return Intrinsics.areEqual(unknownFields(), getAccountValueResponse.unknownFields()) && Intrinsics.areEqual(this.url, getAccountValueResponse.url) && Intrinsics.areEqual(this.account, getAccountValueResponse.account) && Intrinsics.areEqual(this.start_date, getAccountValueResponse.start_date) && Intrinsics.areEqual(this.market_value, getAccountValueResponse.market_value) && Intrinsics.areEqual(this.equity, getAccountValueResponse.equity) && Intrinsics.areEqual(this.extended_hours_market_value, getAccountValueResponse.extended_hours_market_value) && Intrinsics.areEqual(this.extended_hours_equity, getAccountValueResponse.extended_hours_equity) && Intrinsics.areEqual(this.extended_hours_portfolio_equity, getAccountValueResponse.extended_hours_portfolio_equity) && Intrinsics.areEqual(this.last_core_market_value, getAccountValueResponse.last_core_market_value) && Intrinsics.areEqual(this.last_core_equity, getAccountValueResponse.last_core_equity) && Intrinsics.areEqual(this.last_core_portfolio_equity, getAccountValueResponse.last_core_portfolio_equity) && Intrinsics.areEqual(this.excess_margin, getAccountValueResponse.excess_margin) && Intrinsics.areEqual(this.excess_maintenance, getAccountValueResponse.excess_maintenance) && Intrinsics.areEqual(this.excess_margin_with_uncleared_deposits, getAccountValueResponse.excess_margin_with_uncleared_deposits) && Intrinsics.areEqual(this.excess_maintenance_with_uncleared_deposits, getAccountValueResponse.excess_maintenance_with_uncleared_deposits) && Intrinsics.areEqual(this.equity_previous_close, getAccountValueResponse.equity_previous_close) && Intrinsics.areEqual(this.portfolio_equity_previous_close, getAccountValueResponse.portfolio_equity_previous_close) && Intrinsics.areEqual(this.adjusted_equity_previous_close, getAccountValueResponse.adjusted_equity_previous_close) && Intrinsics.areEqual(this.adjusted_portfolio_equity_previous_close, getAccountValueResponse.adjusted_portfolio_equity_previous_close) && Intrinsics.areEqual(this.withdrawable_amount, getAccountValueResponse.withdrawable_amount) && Intrinsics.areEqual(this.unwithdrawable_deposits, getAccountValueResponse.unwithdrawable_deposits) && Intrinsics.areEqual(this.unwithdrawable_grants, getAccountValueResponse.unwithdrawable_grants) && this.display_currency == getAccountValueResponse.display_currency && Intrinsics.areEqual(this.last_core_market_value_absolute, getAccountValueResponse.last_core_market_value_absolute);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.url.hashCode()) * 37) + this.account.hashCode()) * 37;
        String str = this.start_date;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.market_value.hashCode()) * 37) + this.equity.hashCode()) * 37;
        String str2 = this.extended_hours_market_value;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.extended_hours_equity;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.extended_hours_portfolio_equity;
        int iHashCode5 = (((((((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37) + this.last_core_market_value.hashCode()) * 37) + this.last_core_equity.hashCode()) * 37) + this.last_core_portfolio_equity.hashCode()) * 37;
        String str5 = this.excess_margin;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.excess_maintenance;
        int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.excess_margin_with_uncleared_deposits;
        int iHashCode8 = (iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.excess_maintenance_with_uncleared_deposits;
        int iHashCode9 = ((((((((((((((((((iHashCode8 + (str8 != null ? str8.hashCode() : 0)) * 37) + this.equity_previous_close.hashCode()) * 37) + this.portfolio_equity_previous_close.hashCode()) * 37) + this.adjusted_equity_previous_close.hashCode()) * 37) + this.adjusted_portfolio_equity_previous_close.hashCode()) * 37) + this.withdrawable_amount.hashCode()) * 37) + this.unwithdrawable_deposits.hashCode()) * 37) + this.unwithdrawable_grants.hashCode()) * 37) + this.display_currency.hashCode()) * 37) + this.last_core_market_value_absolute.hashCode();
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("url=" + Internal.sanitize(this.url));
        arrayList.add("account=" + Internal.sanitize(this.account));
        String str = this.start_date;
        if (str != null) {
            arrayList.add("start_date=" + Internal.sanitize(str));
        }
        arrayList.add("market_value=" + Internal.sanitize(this.market_value));
        arrayList.add("equity=" + Internal.sanitize(this.equity));
        String str2 = this.extended_hours_market_value;
        if (str2 != null) {
            arrayList.add("extended_hours_market_value=" + Internal.sanitize(str2));
        }
        String str3 = this.extended_hours_equity;
        if (str3 != null) {
            arrayList.add("extended_hours_equity=" + Internal.sanitize(str3));
        }
        String str4 = this.extended_hours_portfolio_equity;
        if (str4 != null) {
            arrayList.add("extended_hours_portfolio_equity=" + Internal.sanitize(str4));
        }
        arrayList.add("last_core_market_value=" + Internal.sanitize(this.last_core_market_value));
        arrayList.add("last_core_equity=" + Internal.sanitize(this.last_core_equity));
        arrayList.add("last_core_portfolio_equity=" + Internal.sanitize(this.last_core_portfolio_equity));
        String str5 = this.excess_margin;
        if (str5 != null) {
            arrayList.add("excess_margin=" + Internal.sanitize(str5));
        }
        String str6 = this.excess_maintenance;
        if (str6 != null) {
            arrayList.add("excess_maintenance=" + Internal.sanitize(str6));
        }
        String str7 = this.excess_margin_with_uncleared_deposits;
        if (str7 != null) {
            arrayList.add("excess_margin_with_uncleared_deposits=" + Internal.sanitize(str7));
        }
        String str8 = this.excess_maintenance_with_uncleared_deposits;
        if (str8 != null) {
            arrayList.add("excess_maintenance_with_uncleared_deposits=" + Internal.sanitize(str8));
        }
        arrayList.add("equity_previous_close=" + Internal.sanitize(this.equity_previous_close));
        arrayList.add("portfolio_equity_previous_close=" + Internal.sanitize(this.portfolio_equity_previous_close));
        arrayList.add("adjusted_equity_previous_close=" + Internal.sanitize(this.adjusted_equity_previous_close));
        arrayList.add("adjusted_portfolio_equity_previous_close=" + Internal.sanitize(this.adjusted_portfolio_equity_previous_close));
        arrayList.add("withdrawable_amount=" + Internal.sanitize(this.withdrawable_amount));
        arrayList.add("unwithdrawable_deposits=" + Internal.sanitize(this.unwithdrawable_deposits));
        arrayList.add("unwithdrawable_grants=" + Internal.sanitize(this.unwithdrawable_grants));
        arrayList.add("display_currency=" + this.display_currency);
        arrayList.add("last_core_market_value_absolute=" + Internal.sanitize(this.last_core_market_value_absolute));
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAccountValueResponse{", "}", 0, null, null, 56, null);
    }

    public final GetAccountValueResponse copy(String url, String account, String start_date, String market_value, String equity, String extended_hours_market_value, String extended_hours_equity, String extended_hours_portfolio_equity, String last_core_market_value, String last_core_equity, String last_core_portfolio_equity, String excess_margin, String excess_maintenance, String excess_margin_with_uncleared_deposits, String excess_maintenance_with_uncleared_deposits, String equity_previous_close, String portfolio_equity_previous_close, String adjusted_equity_previous_close, String adjusted_portfolio_equity_previous_close, String withdrawable_amount, String unwithdrawable_deposits, String unwithdrawable_grants, Currency display_currency, String last_core_market_value_absolute, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(market_value, "market_value");
        Intrinsics.checkNotNullParameter(equity, "equity");
        Intrinsics.checkNotNullParameter(last_core_market_value, "last_core_market_value");
        Intrinsics.checkNotNullParameter(last_core_equity, "last_core_equity");
        Intrinsics.checkNotNullParameter(last_core_portfolio_equity, "last_core_portfolio_equity");
        Intrinsics.checkNotNullParameter(equity_previous_close, "equity_previous_close");
        Intrinsics.checkNotNullParameter(portfolio_equity_previous_close, "portfolio_equity_previous_close");
        Intrinsics.checkNotNullParameter(adjusted_equity_previous_close, "adjusted_equity_previous_close");
        Intrinsics.checkNotNullParameter(adjusted_portfolio_equity_previous_close, "adjusted_portfolio_equity_previous_close");
        Intrinsics.checkNotNullParameter(withdrawable_amount, "withdrawable_amount");
        Intrinsics.checkNotNullParameter(unwithdrawable_deposits, "unwithdrawable_deposits");
        Intrinsics.checkNotNullParameter(unwithdrawable_grants, "unwithdrawable_grants");
        Intrinsics.checkNotNullParameter(display_currency, "display_currency");
        Intrinsics.checkNotNullParameter(last_core_market_value_absolute, "last_core_market_value_absolute");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetAccountValueResponse(url, account, start_date, market_value, equity, extended_hours_market_value, extended_hours_equity, extended_hours_portfolio_equity, last_core_market_value, last_core_equity, last_core_portfolio_equity, excess_margin, excess_maintenance, excess_margin_with_uncleared_deposits, excess_maintenance_with_uncleared_deposits, equity_previous_close, portfolio_equity_previous_close, adjusted_equity_previous_close, adjusted_portfolio_equity_previous_close, withdrawable_amount, unwithdrawable_deposits, unwithdrawable_grants, display_currency, last_core_market_value_absolute, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetAccountValueResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetAccountValueResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rosetta.portfolio.v1.GetAccountValueResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetAccountValueResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getUrl(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getUrl());
                }
                if (!Intrinsics.areEqual(value.getAccount(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAccount());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(3, value.getStart_date());
                if (!Intrinsics.areEqual(value.getMarket_value(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(4, value.getMarket_value());
                }
                if (!Intrinsics.areEqual(value.getEquity(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(5, value.getEquity());
                }
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(6, value.getExtended_hours_market_value()) + protoAdapter.encodedSizeWithTag(7, value.getExtended_hours_equity()) + protoAdapter.encodedSizeWithTag(8, value.getExtended_hours_portfolio_equity());
                if (!Intrinsics.areEqual(value.getLast_core_market_value(), "")) {
                    iEncodedSizeWithTag2 += protoAdapter.encodedSizeWithTag(9, value.getLast_core_market_value());
                }
                if (!Intrinsics.areEqual(value.getLast_core_equity(), "")) {
                    iEncodedSizeWithTag2 += protoAdapter.encodedSizeWithTag(10, value.getLast_core_equity());
                }
                if (!Intrinsics.areEqual(value.getLast_core_portfolio_equity(), "")) {
                    iEncodedSizeWithTag2 += protoAdapter.encodedSizeWithTag(11, value.getLast_core_portfolio_equity());
                }
                int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter.encodedSizeWithTag(12, value.getExcess_margin()) + protoAdapter.encodedSizeWithTag(13, value.getExcess_maintenance()) + protoAdapter.encodedSizeWithTag(14, value.getExcess_margin_with_uncleared_deposits()) + protoAdapter.encodedSizeWithTag(15, value.getExcess_maintenance_with_uncleared_deposits());
                if (!Intrinsics.areEqual(value.getEquity_previous_close(), "")) {
                    iEncodedSizeWithTag3 += protoAdapter.encodedSizeWithTag(16, value.getEquity_previous_close());
                }
                if (!Intrinsics.areEqual(value.getPortfolio_equity_previous_close(), "")) {
                    iEncodedSizeWithTag3 += protoAdapter.encodedSizeWithTag(17, value.getPortfolio_equity_previous_close());
                }
                if (!Intrinsics.areEqual(value.getAdjusted_equity_previous_close(), "")) {
                    iEncodedSizeWithTag3 += protoAdapter.encodedSizeWithTag(18, value.getAdjusted_equity_previous_close());
                }
                if (!Intrinsics.areEqual(value.getAdjusted_portfolio_equity_previous_close(), "")) {
                    iEncodedSizeWithTag3 += protoAdapter.encodedSizeWithTag(19, value.getAdjusted_portfolio_equity_previous_close());
                }
                if (!Intrinsics.areEqual(value.getWithdrawable_amount(), "")) {
                    iEncodedSizeWithTag3 += protoAdapter.encodedSizeWithTag(20, value.getWithdrawable_amount());
                }
                if (!Intrinsics.areEqual(value.getUnwithdrawable_deposits(), "")) {
                    iEncodedSizeWithTag3 += protoAdapter.encodedSizeWithTag(21, value.getUnwithdrawable_deposits());
                }
                if (!Intrinsics.areEqual(value.getUnwithdrawable_grants(), "")) {
                    iEncodedSizeWithTag3 += protoAdapter.encodedSizeWithTag(22, value.getUnwithdrawable_grants());
                }
                if (value.getDisplay_currency() != Currency.CURRENCY_UNSPECIFIED) {
                    iEncodedSizeWithTag3 += Currency.ADAPTER.encodedSizeWithTag(23, value.getDisplay_currency());
                }
                return !Intrinsics.areEqual(value.getLast_core_market_value_absolute(), "") ? iEncodedSizeWithTag3 + protoAdapter.encodedSizeWithTag(24, value.getLast_core_market_value_absolute()) : iEncodedSizeWithTag3;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetAccountValueResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getUrl(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUrl());
                }
                if (!Intrinsics.areEqual(value.getAccount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getStart_date());
                if (!Intrinsics.areEqual(value.getMarket_value(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getMarket_value());
                }
                if (!Intrinsics.areEqual(value.getEquity(), "")) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getEquity());
                }
                protoAdapter.encodeWithTag(writer, 6, (int) value.getExtended_hours_market_value());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getExtended_hours_equity());
                protoAdapter.encodeWithTag(writer, 8, (int) value.getExtended_hours_portfolio_equity());
                if (!Intrinsics.areEqual(value.getLast_core_market_value(), "")) {
                    protoAdapter.encodeWithTag(writer, 9, (int) value.getLast_core_market_value());
                }
                if (!Intrinsics.areEqual(value.getLast_core_equity(), "")) {
                    protoAdapter.encodeWithTag(writer, 10, (int) value.getLast_core_equity());
                }
                if (!Intrinsics.areEqual(value.getLast_core_portfolio_equity(), "")) {
                    protoAdapter.encodeWithTag(writer, 11, (int) value.getLast_core_portfolio_equity());
                }
                protoAdapter.encodeWithTag(writer, 12, (int) value.getExcess_margin());
                protoAdapter.encodeWithTag(writer, 13, (int) value.getExcess_maintenance());
                protoAdapter.encodeWithTag(writer, 14, (int) value.getExcess_margin_with_uncleared_deposits());
                protoAdapter.encodeWithTag(writer, 15, (int) value.getExcess_maintenance_with_uncleared_deposits());
                if (!Intrinsics.areEqual(value.getEquity_previous_close(), "")) {
                    protoAdapter.encodeWithTag(writer, 16, (int) value.getEquity_previous_close());
                }
                if (!Intrinsics.areEqual(value.getPortfolio_equity_previous_close(), "")) {
                    protoAdapter.encodeWithTag(writer, 17, (int) value.getPortfolio_equity_previous_close());
                }
                if (!Intrinsics.areEqual(value.getAdjusted_equity_previous_close(), "")) {
                    protoAdapter.encodeWithTag(writer, 18, (int) value.getAdjusted_equity_previous_close());
                }
                if (!Intrinsics.areEqual(value.getAdjusted_portfolio_equity_previous_close(), "")) {
                    protoAdapter.encodeWithTag(writer, 19, (int) value.getAdjusted_portfolio_equity_previous_close());
                }
                if (!Intrinsics.areEqual(value.getWithdrawable_amount(), "")) {
                    protoAdapter.encodeWithTag(writer, 20, (int) value.getWithdrawable_amount());
                }
                if (!Intrinsics.areEqual(value.getUnwithdrawable_deposits(), "")) {
                    protoAdapter.encodeWithTag(writer, 21, (int) value.getUnwithdrawable_deposits());
                }
                if (!Intrinsics.areEqual(value.getUnwithdrawable_grants(), "")) {
                    protoAdapter.encodeWithTag(writer, 22, (int) value.getUnwithdrawable_grants());
                }
                if (value.getDisplay_currency() != Currency.CURRENCY_UNSPECIFIED) {
                    Currency.ADAPTER.encodeWithTag(writer, 23, (int) value.getDisplay_currency());
                }
                if (!Intrinsics.areEqual(value.getLast_core_market_value_absolute(), "")) {
                    protoAdapter.encodeWithTag(writer, 24, (int) value.getLast_core_market_value_absolute());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetAccountValueResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getLast_core_market_value_absolute(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 24, (int) value.getLast_core_market_value_absolute());
                }
                if (value.getDisplay_currency() != Currency.CURRENCY_UNSPECIFIED) {
                    Currency.ADAPTER.encodeWithTag(writer, 23, (int) value.getDisplay_currency());
                }
                if (!Intrinsics.areEqual(value.getUnwithdrawable_grants(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 22, (int) value.getUnwithdrawable_grants());
                }
                if (!Intrinsics.areEqual(value.getUnwithdrawable_deposits(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 21, (int) value.getUnwithdrawable_deposits());
                }
                if (!Intrinsics.areEqual(value.getWithdrawable_amount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 20, (int) value.getWithdrawable_amount());
                }
                if (!Intrinsics.areEqual(value.getAdjusted_portfolio_equity_previous_close(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 19, (int) value.getAdjusted_portfolio_equity_previous_close());
                }
                if (!Intrinsics.areEqual(value.getAdjusted_equity_previous_close(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 18, (int) value.getAdjusted_equity_previous_close());
                }
                if (!Intrinsics.areEqual(value.getPortfolio_equity_previous_close(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 17, (int) value.getPortfolio_equity_previous_close());
                }
                if (!Intrinsics.areEqual(value.getEquity_previous_close(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 16, (int) value.getEquity_previous_close());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 15, (int) value.getExcess_maintenance_with_uncleared_deposits());
                protoAdapter.encodeWithTag(writer, 14, (int) value.getExcess_margin_with_uncleared_deposits());
                protoAdapter.encodeWithTag(writer, 13, (int) value.getExcess_maintenance());
                protoAdapter.encodeWithTag(writer, 12, (int) value.getExcess_margin());
                if (!Intrinsics.areEqual(value.getLast_core_portfolio_equity(), "")) {
                    protoAdapter.encodeWithTag(writer, 11, (int) value.getLast_core_portfolio_equity());
                }
                if (!Intrinsics.areEqual(value.getLast_core_equity(), "")) {
                    protoAdapter.encodeWithTag(writer, 10, (int) value.getLast_core_equity());
                }
                if (!Intrinsics.areEqual(value.getLast_core_market_value(), "")) {
                    protoAdapter.encodeWithTag(writer, 9, (int) value.getLast_core_market_value());
                }
                protoAdapter.encodeWithTag(writer, 8, (int) value.getExtended_hours_portfolio_equity());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getExtended_hours_equity());
                protoAdapter.encodeWithTag(writer, 6, (int) value.getExtended_hours_market_value());
                if (!Intrinsics.areEqual(value.getEquity(), "")) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getEquity());
                }
                if (!Intrinsics.areEqual(value.getMarket_value(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getMarket_value());
                }
                protoAdapter.encodeWithTag(writer, 3, (int) value.getStart_date());
                if (!Intrinsics.areEqual(value.getAccount(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getAccount());
                }
                if (Intrinsics.areEqual(value.getUrl(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getUrl());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetAccountValueResponse decode(ProtoReader reader) throws IOException {
                String str;
                String str2;
                String str3;
                Intrinsics.checkNotNullParameter(reader, "reader");
                Currency currency = Currency.CURRENCY_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Currency currencyDecode = currency;
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
                String strDecode15 = null;
                String strDecode16 = null;
                String strDecode17 = null;
                String strDecode18 = null;
                String strDecode19 = null;
                String strDecode20 = null;
                String strDecode21 = null;
                String strDecode22 = null;
                String strDecode23 = strDecode14;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode23 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 3:
                                strDecode15 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 5:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 6:
                                strDecode16 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 7:
                                strDecode17 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 8:
                                strDecode18 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 9:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 10:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 11:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 12:
                                strDecode19 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 13:
                                strDecode20 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 14:
                                strDecode21 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 15:
                                strDecode22 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 16:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 17:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 18:
                                strDecode9 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 19:
                                strDecode10 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 20:
                                strDecode11 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 21:
                                strDecode12 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 22:
                                strDecode13 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 23:
                                try {
                                    currencyDecode = Currency.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    str = strDecode23;
                                    str2 = strDecode;
                                    str3 = strDecode2;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 24:
                                strDecode14 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            default:
                                reader.readUnknownField(iNextTag);
                                str = strDecode23;
                                str2 = strDecode;
                                str3 = strDecode2;
                                break;
                        }
                        strDecode23 = str;
                        strDecode = str2;
                        strDecode2 = str3;
                    } else {
                        return new GetAccountValueResponse(strDecode23, strDecode, strDecode15, strDecode2, strDecode3, strDecode16, strDecode17, strDecode18, strDecode4, strDecode5, strDecode6, strDecode19, strDecode20, strDecode21, strDecode22, strDecode7, strDecode8, strDecode9, strDecode10, strDecode11, strDecode12, strDecode13, currencyDecode, strDecode14, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetAccountValueResponse redact(GetAccountValueResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.copy((16777215 & 1) != 0 ? value.url : null, (16777215 & 2) != 0 ? value.account : null, (16777215 & 4) != 0 ? value.start_date : null, (16777215 & 8) != 0 ? value.market_value : null, (16777215 & 16) != 0 ? value.equity : null, (16777215 & 32) != 0 ? value.extended_hours_market_value : null, (16777215 & 64) != 0 ? value.extended_hours_equity : null, (16777215 & 128) != 0 ? value.extended_hours_portfolio_equity : null, (16777215 & 256) != 0 ? value.last_core_market_value : null, (16777215 & 512) != 0 ? value.last_core_equity : null, (16777215 & 1024) != 0 ? value.last_core_portfolio_equity : null, (16777215 & 2048) != 0 ? value.excess_margin : null, (16777215 & 4096) != 0 ? value.excess_maintenance : null, (16777215 & 8192) != 0 ? value.excess_margin_with_uncleared_deposits : null, (16777215 & 16384) != 0 ? value.excess_maintenance_with_uncleared_deposits : null, (16777215 & 32768) != 0 ? value.equity_previous_close : null, (16777215 & 65536) != 0 ? value.portfolio_equity_previous_close : null, (16777215 & 131072) != 0 ? value.adjusted_equity_previous_close : null, (16777215 & 262144) != 0 ? value.adjusted_portfolio_equity_previous_close : null, (16777215 & 524288) != 0 ? value.withdrawable_amount : null, (16777215 & 1048576) != 0 ? value.unwithdrawable_deposits : null, (16777215 & 2097152) != 0 ? value.unwithdrawable_grants : null, (16777215 & 4194304) != 0 ? value.display_currency : null, (16777215 & 8388608) != 0 ? value.last_core_market_value_absolute : null, (16777215 & 16777216) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
