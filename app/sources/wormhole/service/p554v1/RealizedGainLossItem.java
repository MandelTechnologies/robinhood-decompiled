package wormhole.service.p554v1;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.rosetta.common.Money;
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
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import p479j$.time.Instant;
import wormhole.service.p554v1.RealizedGainLossItem;

/* compiled from: RealizedGainLossItem.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b)\u0018\u0000 L2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004LMNOBÛ\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0002H\u0017¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0003H\u0016¢\u0006\u0004\b*\u0010+Já\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b/\u0010+R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u00102R\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b3\u0010+R\"\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u00106R\u001a\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b7\u0010+R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b;\u0010+R\"\u0010\u000f\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00104\u001a\u0004\b<\u00106R\u001a\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b=\u0010+R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00108\u001a\u0004\b>\u0010:R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00108\u001a\u0004\b?\u0010:R\u001a\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010.\u001a\u0004\b@\u0010+R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00108\u001a\u0004\bA\u0010:R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00108\u001a\u0004\bB\u0010:R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010C\u001a\u0004\bD\u0010ER\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010F\u001a\u0004\bG\u0010HR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010I\u001a\u0004\bJ\u0010K¨\u0006P"}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossItem;", "Lcom/squareup/wire/Message;", "", "", "id", "Lwormhole/service/v1/AssetClass;", "asset_class", "symbol", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "close_timestamp", AnalyticsStrings.BUTTON_LIST_DETAIL_DISPLAY_NAME, "Lcom/robinhood/rosetta/common/Money;", "realized_return", "realized_return_percentage", "first_execution_timestamp", "quantity", "open_average_price", "close_average_price", "detail_display_name", "opening_amount", "closing_amount", "Lwormhole/service/v1/RealizedGainLossItem$EquityOrderDetails;", "equity_order_details", "Lwormhole/service/v1/RealizedGainLossItem$OptionOrderDetails;", "option_order_details", "Lwormhole/service/v1/RealizedGainLossItem$CryptoOrderDetails;", "crypto_order_details", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Lwormhole/service/v1/AssetClass;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lwormhole/service/v1/RealizedGainLossItem$EquityOrderDetails;Lwormhole/service/v1/RealizedGainLossItem$OptionOrderDetails;Lwormhole/service/v1/RealizedGainLossItem$CryptoOrderDetails;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Lwormhole/service/v1/AssetClass;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lwormhole/service/v1/RealizedGainLossItem$EquityOrderDetails;Lwormhole/service/v1/RealizedGainLossItem$OptionOrderDetails;Lwormhole/service/v1/RealizedGainLossItem$CryptoOrderDetails;Lokio/ByteString;)Lwormhole/service/v1/RealizedGainLossItem;", "Ljava/lang/String;", "getId", "Lwormhole/service/v1/AssetClass;", "getAsset_class", "()Lwormhole/service/v1/AssetClass;", "getSymbol", "Lj$/time/Instant;", "getClose_timestamp", "()Lj$/time/Instant;", "getDisplay_name", "Lcom/robinhood/rosetta/common/Money;", "getRealized_return", "()Lcom/robinhood/rosetta/common/Money;", "getRealized_return_percentage", "getFirst_execution_timestamp", "getQuantity", "getOpen_average_price", "getClose_average_price", "getDetail_display_name", "getOpening_amount", "getClosing_amount", "Lwormhole/service/v1/RealizedGainLossItem$EquityOrderDetails;", "getEquity_order_details", "()Lwormhole/service/v1/RealizedGainLossItem$EquityOrderDetails;", "Lwormhole/service/v1/RealizedGainLossItem$OptionOrderDetails;", "getOption_order_details", "()Lwormhole/service/v1/RealizedGainLossItem$OptionOrderDetails;", "Lwormhole/service/v1/RealizedGainLossItem$CryptoOrderDetails;", "getCrypto_order_details", "()Lwormhole/service/v1/RealizedGainLossItem$CryptoOrderDetails;", "Companion", "EquityOrderDetails", "OptionOrderDetails", "CryptoOrderDetails", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class RealizedGainLossItem extends Message {

    @JvmField
    public static final ProtoAdapter<RealizedGainLossItem> ADAPTER;

    @WireField(adapter = "wormhole.service.v1.AssetClass#ADAPTER", jsonName = "assetClass", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final AssetClass asset_class;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "closeAveragePrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final Money close_average_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "closeTimestamp", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Instant close_timestamp;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "closingAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 16)
    private final Money closing_amount;

    @WireField(adapter = "wormhole.service.v1.RealizedGainLossItem$CryptoOrderDetails#ADAPTER", jsonName = "cryptoOrderDetails", oneofName = "order_details", schemaIndex = 16, tag = 17)
    private final CryptoOrderDetails crypto_order_details;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "detailDisplayName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final String detail_display_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "displayName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String display_name;

    @WireField(adapter = "wormhole.service.v1.RealizedGainLossItem$EquityOrderDetails#ADAPTER", jsonName = "equityOrderDetails", oneofName = "order_details", schemaIndex = 14, tag = 13)
    private final EquityOrderDetails equity_order_details;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "firstExecutionTimestamp", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final Instant first_execution_timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "openAveragePrice", schemaIndex = 9, tag = 10)
    private final Money open_average_price;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "openingAmount", schemaIndex = 12, tag = 15)
    private final Money opening_amount;

    @WireField(adapter = "wormhole.service.v1.RealizedGainLossItem$OptionOrderDetails#ADAPTER", jsonName = "optionOrderDetails", oneofName = "order_details", schemaIndex = 15, tag = 14)
    private final OptionOrderDetails option_order_details;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String quantity;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "realizedReturn", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Money realized_return;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "realizedReturnPercentage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String realized_return_percentage;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String symbol;

    public RealizedGainLossItem() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
    }

    public /* synthetic */ RealizedGainLossItem(String str, AssetClass assetClass, String str2, Instant instant, String str3, Money money, String str4, Instant instant2, String str5, Money money2, Money money3, String str6, Money money4, Money money5, EquityOrderDetails equityOrderDetails, OptionOrderDetails optionOrderDetails, CryptoOrderDetails cryptoOrderDetails, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? AssetClass.ASSET_CLASS_UNSPECIFIED : assetClass, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : instant, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? null : money, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? null : instant2, (i & 256) != 0 ? "" : str5, (i & 512) != 0 ? null : money2, (i & 1024) != 0 ? null : money3, (i & 2048) == 0 ? str6 : "", (i & 4096) != 0 ? null : money4, (i & 8192) != 0 ? null : money5, (i & 16384) != 0 ? null : equityOrderDetails, (i & 32768) != 0 ? null : optionOrderDetails, (i & 65536) != 0 ? null : cryptoOrderDetails, (i & 131072) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m30072newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final AssetClass getAsset_class() {
        return this.asset_class;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final Instant getClose_timestamp() {
        return this.close_timestamp;
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    public final Money getRealized_return() {
        return this.realized_return;
    }

    public final String getRealized_return_percentage() {
        return this.realized_return_percentage;
    }

    public final Instant getFirst_execution_timestamp() {
        return this.first_execution_timestamp;
    }

    public final String getQuantity() {
        return this.quantity;
    }

    public final Money getOpen_average_price() {
        return this.open_average_price;
    }

    public final Money getClose_average_price() {
        return this.close_average_price;
    }

    public final String getDetail_display_name() {
        return this.detail_display_name;
    }

    public final Money getOpening_amount() {
        return this.opening_amount;
    }

    public final Money getClosing_amount() {
        return this.closing_amount;
    }

    public final EquityOrderDetails getEquity_order_details() {
        return this.equity_order_details;
    }

    public final OptionOrderDetails getOption_order_details() {
        return this.option_order_details;
    }

    public final CryptoOrderDetails getCrypto_order_details() {
        return this.crypto_order_details;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealizedGainLossItem(String id, AssetClass asset_class, String symbol, Instant instant, String display_name, Money money, String realized_return_percentage, Instant instant2, String quantity, Money money2, Money money3, String detail_display_name, Money money4, Money money5, EquityOrderDetails equityOrderDetails, OptionOrderDetails optionOrderDetails, CryptoOrderDetails cryptoOrderDetails, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(asset_class, "asset_class");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(display_name, "display_name");
        Intrinsics.checkNotNullParameter(realized_return_percentage, "realized_return_percentage");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(detail_display_name, "detail_display_name");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.asset_class = asset_class;
        this.symbol = symbol;
        this.close_timestamp = instant;
        this.display_name = display_name;
        this.realized_return = money;
        this.realized_return_percentage = realized_return_percentage;
        this.first_execution_timestamp = instant2;
        this.quantity = quantity;
        this.open_average_price = money2;
        this.close_average_price = money3;
        this.detail_display_name = detail_display_name;
        this.opening_amount = money4;
        this.closing_amount = money5;
        this.equity_order_details = equityOrderDetails;
        this.option_order_details = optionOrderDetails;
        this.crypto_order_details = cryptoOrderDetails;
        if (Internal.countNonNull(equityOrderDetails, optionOrderDetails, cryptoOrderDetails) > 1) {
            throw new IllegalArgumentException("At most one of equity_order_details, option_order_details, crypto_order_details may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m30072newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof RealizedGainLossItem)) {
            return false;
        }
        RealizedGainLossItem realizedGainLossItem = (RealizedGainLossItem) other;
        return Intrinsics.areEqual(unknownFields(), realizedGainLossItem.unknownFields()) && Intrinsics.areEqual(this.id, realizedGainLossItem.id) && this.asset_class == realizedGainLossItem.asset_class && Intrinsics.areEqual(this.symbol, realizedGainLossItem.symbol) && Intrinsics.areEqual(this.close_timestamp, realizedGainLossItem.close_timestamp) && Intrinsics.areEqual(this.display_name, realizedGainLossItem.display_name) && Intrinsics.areEqual(this.realized_return, realizedGainLossItem.realized_return) && Intrinsics.areEqual(this.realized_return_percentage, realizedGainLossItem.realized_return_percentage) && Intrinsics.areEqual(this.first_execution_timestamp, realizedGainLossItem.first_execution_timestamp) && Intrinsics.areEqual(this.quantity, realizedGainLossItem.quantity) && Intrinsics.areEqual(this.open_average_price, realizedGainLossItem.open_average_price) && Intrinsics.areEqual(this.close_average_price, realizedGainLossItem.close_average_price) && Intrinsics.areEqual(this.detail_display_name, realizedGainLossItem.detail_display_name) && Intrinsics.areEqual(this.opening_amount, realizedGainLossItem.opening_amount) && Intrinsics.areEqual(this.closing_amount, realizedGainLossItem.closing_amount) && Intrinsics.areEqual(this.equity_order_details, realizedGainLossItem.equity_order_details) && Intrinsics.areEqual(this.option_order_details, realizedGainLossItem.option_order_details) && Intrinsics.areEqual(this.crypto_order_details, realizedGainLossItem.crypto_order_details);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.asset_class.hashCode()) * 37) + this.symbol.hashCode()) * 37;
        Instant instant = this.close_timestamp;
        int iHashCode2 = (((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.display_name.hashCode()) * 37;
        Money money = this.realized_return;
        int iHashCode3 = (((iHashCode2 + (money != null ? money.hashCode() : 0)) * 37) + this.realized_return_percentage.hashCode()) * 37;
        Instant instant2 = this.first_execution_timestamp;
        int iHashCode4 = (((iHashCode3 + (instant2 != null ? instant2.hashCode() : 0)) * 37) + this.quantity.hashCode()) * 37;
        Money money2 = this.open_average_price;
        int iHashCode5 = (iHashCode4 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.close_average_price;
        int iHashCode6 = (((iHashCode5 + (money3 != null ? money3.hashCode() : 0)) * 37) + this.detail_display_name.hashCode()) * 37;
        Money money4 = this.opening_amount;
        int iHashCode7 = (iHashCode6 + (money4 != null ? money4.hashCode() : 0)) * 37;
        Money money5 = this.closing_amount;
        int iHashCode8 = (iHashCode7 + (money5 != null ? money5.hashCode() : 0)) * 37;
        EquityOrderDetails equityOrderDetails = this.equity_order_details;
        int iHashCode9 = (iHashCode8 + (equityOrderDetails != null ? equityOrderDetails.hashCode() : 0)) * 37;
        OptionOrderDetails optionOrderDetails = this.option_order_details;
        int iHashCode10 = (iHashCode9 + (optionOrderDetails != null ? optionOrderDetails.hashCode() : 0)) * 37;
        CryptoOrderDetails cryptoOrderDetails = this.crypto_order_details;
        int iHashCode11 = iHashCode10 + (cryptoOrderDetails != null ? cryptoOrderDetails.hashCode() : 0);
        this.hashCode = iHashCode11;
        return iHashCode11;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("asset_class=" + this.asset_class);
        arrayList.add("symbol=" + Internal.sanitize(this.symbol));
        Instant instant = this.close_timestamp;
        if (instant != null) {
            arrayList.add("close_timestamp=" + instant);
        }
        arrayList.add("display_name=" + Internal.sanitize(this.display_name));
        Money money = this.realized_return;
        if (money != null) {
            arrayList.add("realized_return=" + money);
        }
        arrayList.add("realized_return_percentage=" + Internal.sanitize(this.realized_return_percentage));
        Instant instant2 = this.first_execution_timestamp;
        if (instant2 != null) {
            arrayList.add("first_execution_timestamp=" + instant2);
        }
        arrayList.add("quantity=" + Internal.sanitize(this.quantity));
        Money money2 = this.open_average_price;
        if (money2 != null) {
            arrayList.add("open_average_price=" + money2);
        }
        Money money3 = this.close_average_price;
        if (money3 != null) {
            arrayList.add("close_average_price=" + money3);
        }
        arrayList.add("detail_display_name=" + Internal.sanitize(this.detail_display_name));
        Money money4 = this.opening_amount;
        if (money4 != null) {
            arrayList.add("opening_amount=" + money4);
        }
        Money money5 = this.closing_amount;
        if (money5 != null) {
            arrayList.add("closing_amount=" + money5);
        }
        EquityOrderDetails equityOrderDetails = this.equity_order_details;
        if (equityOrderDetails != null) {
            arrayList.add("equity_order_details=" + equityOrderDetails);
        }
        OptionOrderDetails optionOrderDetails = this.option_order_details;
        if (optionOrderDetails != null) {
            arrayList.add("option_order_details=" + optionOrderDetails);
        }
        CryptoOrderDetails cryptoOrderDetails = this.crypto_order_details;
        if (cryptoOrderDetails != null) {
            arrayList.add("crypto_order_details=" + cryptoOrderDetails);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RealizedGainLossItem{", "}", 0, null, null, 56, null);
    }

    public final RealizedGainLossItem copy(String id, AssetClass asset_class, String symbol, Instant close_timestamp, String display_name, Money realized_return, String realized_return_percentage, Instant first_execution_timestamp, String quantity, Money open_average_price, Money close_average_price, String detail_display_name, Money opening_amount, Money closing_amount, EquityOrderDetails equity_order_details, OptionOrderDetails option_order_details, CryptoOrderDetails crypto_order_details, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(asset_class, "asset_class");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(display_name, "display_name");
        Intrinsics.checkNotNullParameter(realized_return_percentage, "realized_return_percentage");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(detail_display_name, "detail_display_name");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new RealizedGainLossItem(id, asset_class, symbol, close_timestamp, display_name, realized_return, realized_return_percentage, first_execution_timestamp, quantity, open_average_price, close_average_price, detail_display_name, opening_amount, closing_amount, equity_order_details, option_order_details, crypto_order_details, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(RealizedGainLossItem.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<RealizedGainLossItem>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: wormhole.service.v1.RealizedGainLossItem$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(RealizedGainLossItem value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (value.getAsset_class() != AssetClass.ASSET_CLASS_UNSPECIFIED) {
                    size += AssetClass.ADAPTER.encodedSizeWithTag(2, value.getAsset_class());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getSymbol());
                }
                if (value.getClose_timestamp() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(4, value.getClose_timestamp());
                }
                if (!Intrinsics.areEqual(value.getDisplay_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getDisplay_name());
                }
                if (value.getRealized_return() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(6, value.getRealized_return());
                }
                if (!Intrinsics.areEqual(value.getRealized_return_percentage(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getRealized_return_percentage());
                }
                if (value.getFirst_execution_timestamp() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(8, value.getFirst_execution_timestamp());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getQuantity());
                }
                ProtoAdapter<Money> protoAdapter = Money.ADAPTER;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(10, value.getOpen_average_price());
                if (value.getClose_average_price() != null) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(11, value.getClose_average_price());
                }
                if (!Intrinsics.areEqual(value.getDetail_display_name(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(12, value.getDetail_display_name());
                }
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(15, value.getOpening_amount());
                if (value.getClosing_amount() != null) {
                    iEncodedSizeWithTag2 += protoAdapter.encodedSizeWithTag(16, value.getClosing_amount());
                }
                return iEncodedSizeWithTag2 + RealizedGainLossItem.EquityOrderDetails.ADAPTER.encodedSizeWithTag(13, value.getEquity_order_details()) + RealizedGainLossItem.OptionOrderDetails.ADAPTER.encodedSizeWithTag(14, value.getOption_order_details()) + RealizedGainLossItem.CryptoOrderDetails.ADAPTER.encodedSizeWithTag(17, value.getCrypto_order_details());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, RealizedGainLossItem value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (value.getAsset_class() != AssetClass.ASSET_CLASS_UNSPECIFIED) {
                    AssetClass.ADAPTER.encodeWithTag(writer, 2, (int) value.getAsset_class());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSymbol());
                }
                if (value.getClose_timestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getClose_timestamp());
                }
                if (!Intrinsics.areEqual(value.getDisplay_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getDisplay_name());
                }
                if (value.getRealized_return() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 6, (int) value.getRealized_return());
                }
                if (!Intrinsics.areEqual(value.getRealized_return_percentage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getRealized_return_percentage());
                }
                if (value.getFirst_execution_timestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 8, (int) value.getFirst_execution_timestamp());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getQuantity());
                }
                ProtoAdapter<Money> protoAdapter = Money.ADAPTER;
                protoAdapter.encodeWithTag(writer, 10, (int) value.getOpen_average_price());
                if (value.getClose_average_price() != null) {
                    protoAdapter.encodeWithTag(writer, 11, (int) value.getClose_average_price());
                }
                if (!Intrinsics.areEqual(value.getDetail_display_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getDetail_display_name());
                }
                protoAdapter.encodeWithTag(writer, 15, (int) value.getOpening_amount());
                if (value.getClosing_amount() != null) {
                    protoAdapter.encodeWithTag(writer, 16, (int) value.getClosing_amount());
                }
                RealizedGainLossItem.EquityOrderDetails.ADAPTER.encodeWithTag(writer, 13, (int) value.getEquity_order_details());
                RealizedGainLossItem.OptionOrderDetails.ADAPTER.encodeWithTag(writer, 14, (int) value.getOption_order_details());
                RealizedGainLossItem.CryptoOrderDetails.ADAPTER.encodeWithTag(writer, 17, (int) value.getCrypto_order_details());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, RealizedGainLossItem value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                RealizedGainLossItem.CryptoOrderDetails.ADAPTER.encodeWithTag(writer, 17, (int) value.getCrypto_order_details());
                RealizedGainLossItem.OptionOrderDetails.ADAPTER.encodeWithTag(writer, 14, (int) value.getOption_order_details());
                RealizedGainLossItem.EquityOrderDetails.ADAPTER.encodeWithTag(writer, 13, (int) value.getEquity_order_details());
                if (value.getClosing_amount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 16, (int) value.getClosing_amount());
                }
                ProtoAdapter<Money> protoAdapter = Money.ADAPTER;
                protoAdapter.encodeWithTag(writer, 15, (int) value.getOpening_amount());
                if (!Intrinsics.areEqual(value.getDetail_display_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getDetail_display_name());
                }
                if (value.getClose_average_price() != null) {
                    protoAdapter.encodeWithTag(writer, 11, (int) value.getClose_average_price());
                }
                protoAdapter.encodeWithTag(writer, 10, (int) value.getOpen_average_price());
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getQuantity());
                }
                if (value.getFirst_execution_timestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 8, (int) value.getFirst_execution_timestamp());
                }
                if (!Intrinsics.areEqual(value.getRealized_return_percentage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getRealized_return_percentage());
                }
                if (value.getRealized_return() != null) {
                    protoAdapter.encodeWithTag(writer, 6, (int) value.getRealized_return());
                }
                if (!Intrinsics.areEqual(value.getDisplay_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getDisplay_name());
                }
                if (value.getClose_timestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getClose_timestamp());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSymbol());
                }
                if (value.getAsset_class() != AssetClass.ASSET_CLASS_UNSPECIFIED) {
                    AssetClass.ADAPTER.encodeWithTag(writer, 2, (int) value.getAsset_class());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RealizedGainLossItem decode(ProtoReader reader) throws IOException {
                String str;
                String str2;
                String str3;
                Intrinsics.checkNotNullParameter(reader, "reader");
                AssetClass assetClass = AssetClass.ASSET_CLASS_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                AssetClass assetClassDecode = assetClass;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                Instant instantDecode = null;
                Money moneyDecode = null;
                Instant instantDecode2 = null;
                Money moneyDecode2 = null;
                Money moneyDecode3 = null;
                Money moneyDecode4 = null;
                Money moneyDecode5 = null;
                RealizedGainLossItem.EquityOrderDetails equityOrderDetailsDecode = null;
                RealizedGainLossItem.OptionOrderDetails optionOrderDetailsDecode = null;
                RealizedGainLossItem.CryptoOrderDetails cryptoOrderDetailsDecode = null;
                String strDecode6 = strDecode5;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 2:
                                try {
                                    assetClassDecode = AssetClass.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    str = strDecode6;
                                    str2 = strDecode;
                                    str3 = strDecode2;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 3:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 4:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                continue;
                            case 5:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 6:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                continue;
                            case 7:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 8:
                                instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                                continue;
                            case 9:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 10:
                                moneyDecode2 = Money.ADAPTER.decode(reader);
                                continue;
                            case 11:
                                moneyDecode3 = Money.ADAPTER.decode(reader);
                                continue;
                            case 12:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 13:
                                equityOrderDetailsDecode = RealizedGainLossItem.EquityOrderDetails.ADAPTER.decode(reader);
                                continue;
                            case 14:
                                optionOrderDetailsDecode = RealizedGainLossItem.OptionOrderDetails.ADAPTER.decode(reader);
                                continue;
                            case 15:
                                moneyDecode4 = Money.ADAPTER.decode(reader);
                                continue;
                            case 16:
                                moneyDecode5 = Money.ADAPTER.decode(reader);
                                continue;
                            case 17:
                                cryptoOrderDetailsDecode = RealizedGainLossItem.CryptoOrderDetails.ADAPTER.decode(reader);
                                continue;
                            default:
                                reader.readUnknownField(iNextTag);
                                str = strDecode6;
                                str2 = strDecode;
                                str3 = strDecode2;
                                break;
                        }
                        strDecode6 = str;
                        strDecode2 = str3;
                        strDecode = str2;
                    } else {
                        return new RealizedGainLossItem(strDecode6, assetClassDecode, strDecode, instantDecode, strDecode2, moneyDecode, strDecode3, instantDecode2, strDecode4, moneyDecode2, moneyDecode3, strDecode5, moneyDecode4, moneyDecode5, equityOrderDetailsDecode, optionOrderDetailsDecode, cryptoOrderDetailsDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RealizedGainLossItem redact(RealizedGainLossItem value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant close_timestamp = value.getClose_timestamp();
                Instant instantRedact = close_timestamp != null ? ProtoAdapter.INSTANT.redact(close_timestamp) : null;
                Money realized_return = value.getRealized_return();
                Money moneyRedact = realized_return != null ? Money.ADAPTER.redact(realized_return) : null;
                Instant first_execution_timestamp = value.getFirst_execution_timestamp();
                Instant instantRedact2 = first_execution_timestamp != null ? ProtoAdapter.INSTANT.redact(first_execution_timestamp) : null;
                Money open_average_price = value.getOpen_average_price();
                Money moneyRedact2 = open_average_price != null ? Money.ADAPTER.redact(open_average_price) : null;
                Money close_average_price = value.getClose_average_price();
                Money moneyRedact3 = close_average_price != null ? Money.ADAPTER.redact(close_average_price) : null;
                Money opening_amount = value.getOpening_amount();
                Money moneyRedact4 = opening_amount != null ? Money.ADAPTER.redact(opening_amount) : null;
                Money closing_amount = value.getClosing_amount();
                Money moneyRedact5 = closing_amount != null ? Money.ADAPTER.redact(closing_amount) : null;
                RealizedGainLossItem.EquityOrderDetails equity_order_details = value.getEquity_order_details();
                RealizedGainLossItem.EquityOrderDetails equityOrderDetailsRedact = equity_order_details != null ? RealizedGainLossItem.EquityOrderDetails.ADAPTER.redact(equity_order_details) : null;
                RealizedGainLossItem.OptionOrderDetails option_order_details = value.getOption_order_details();
                RealizedGainLossItem.OptionOrderDetails optionOrderDetailsRedact = option_order_details != null ? RealizedGainLossItem.OptionOrderDetails.ADAPTER.redact(option_order_details) : null;
                RealizedGainLossItem.CryptoOrderDetails crypto_order_details = value.getCrypto_order_details();
                return value.copy((2391 & 1) != 0 ? value.id : null, (2391 & 2) != 0 ? value.asset_class : null, (2391 & 4) != 0 ? value.symbol : null, (2391 & 8) != 0 ? value.close_timestamp : instantRedact, (2391 & 16) != 0 ? value.display_name : null, (2391 & 32) != 0 ? value.realized_return : moneyRedact, (2391 & 64) != 0 ? value.realized_return_percentage : null, (2391 & 128) != 0 ? value.first_execution_timestamp : instantRedact2, (2391 & 256) != 0 ? value.quantity : null, (2391 & 512) != 0 ? value.open_average_price : moneyRedact2, (2391 & 1024) != 0 ? value.close_average_price : moneyRedact3, (2391 & 2048) != 0 ? value.detail_display_name : null, (2391 & 4096) != 0 ? value.opening_amount : moneyRedact4, (2391 & 8192) != 0 ? value.closing_amount : moneyRedact5, (2391 & 16384) != 0 ? value.equity_order_details : equityOrderDetailsRedact, (2391 & 32768) != 0 ? value.option_order_details : optionOrderDetailsRedact, (2391 & 65536) != 0 ? value.crypto_order_details : crypto_order_details != null ? RealizedGainLossItem.CryptoOrderDetails.ADAPTER.redact(crypto_order_details) : null, (2391 & 131072) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }

    /* compiled from: RealizedGainLossItem.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossItem$EquityOrderDetails;", "Lcom/squareup/wire/Message;", "", "instrument_id", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getInstrument_id", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class EquityOrderDetails extends Message {

        @JvmField
        public static final ProtoAdapter<EquityOrderDetails> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String instrument_id;

        /* JADX WARN: Multi-variable type inference failed */
        public EquityOrderDetails() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m30074newBuilder();
        }

        public final String getInstrument_id() {
            return this.instrument_id;
        }

        public /* synthetic */ EquityOrderDetails(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EquityOrderDetails(String instrument_id, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.instrument_id = instrument_id;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m30074newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof EquityOrderDetails)) {
                return false;
            }
            EquityOrderDetails equityOrderDetails = (EquityOrderDetails) other;
            return Intrinsics.areEqual(unknownFields(), equityOrderDetails.unknownFields()) && Intrinsics.areEqual(this.instrument_id, equityOrderDetails.instrument_id);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (unknownFields().hashCode() * 37) + this.instrument_id.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("instrument_id=" + Internal.sanitize(this.instrument_id));
            return CollectionsKt.joinToString$default(arrayList, ", ", "EquityOrderDetails{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ EquityOrderDetails copy$default(EquityOrderDetails equityOrderDetails, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = equityOrderDetails.instrument_id;
            }
            if ((i & 2) != 0) {
                byteString = equityOrderDetails.unknownFields();
            }
            return equityOrderDetails.copy(str, byteString);
        }

        public final EquityOrderDetails copy(String instrument_id, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new EquityOrderDetails(instrument_id, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EquityOrderDetails.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<EquityOrderDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: wormhole.service.v1.RealizedGainLossItem$EquityOrderDetails$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public RealizedGainLossItem.EquityOrderDetails decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new RealizedGainLossItem.EquityOrderDetails(strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(RealizedGainLossItem.EquityOrderDetails value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    return !Intrinsics.areEqual(value.getInstrument_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getInstrument_id()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, RealizedGainLossItem.EquityOrderDetails value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getInstrument_id());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, RealizedGainLossItem.EquityOrderDetails value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (Intrinsics.areEqual(value.getInstrument_id(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getInstrument_id());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public RealizedGainLossItem.EquityOrderDetails redact(RealizedGainLossItem.EquityOrderDetails value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return RealizedGainLossItem.EquityOrderDetails.copy$default(value, null, ByteString.EMPTY, 1, null);
                }
            };
        }
    }

    /* compiled from: RealizedGainLossItem.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u001aB+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0004H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J*\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossItem$OptionOrderDetails;", "Lcom/squareup/wire/Message;", "", "trade_value_multiplier", "", "underlyings", "", "Lwormhole/service/v1/RealizedGainLossItem$OptionOrderDetails$Underlying;", "unknownFields", "Lokio/ByteString;", "<init>", "(ILjava/util/List;Lokio/ByteString;)V", "getTrade_value_multiplier", "()I", "getUnderlyings", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "", "copy", "Companion", "Underlying", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OptionOrderDetails extends Message {

        @JvmField
        public static final ProtoAdapter<OptionOrderDetails> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "tradeValueMultiplier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final int trade_value_multiplier;

        @WireField(adapter = "wormhole.service.v1.RealizedGainLossItem$OptionOrderDetails$Underlying#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
        private final List<Underlying> underlyings;

        public OptionOrderDetails() {
            this(0, null, null, 7, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m30075newBuilder();
        }

        public final int getTrade_value_multiplier() {
            return this.trade_value_multiplier;
        }

        public /* synthetic */ OptionOrderDetails(int i, List list, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? CollectionsKt.emptyList() : list, (i2 & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OptionOrderDetails(int i, List<Underlying> underlyings, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(underlyings, "underlyings");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.trade_value_multiplier = i;
            this.underlyings = Internal.immutableCopyOf("underlyings", underlyings);
        }

        public final List<Underlying> getUnderlyings() {
            return this.underlyings;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m30075newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof OptionOrderDetails)) {
                return false;
            }
            OptionOrderDetails optionOrderDetails = (OptionOrderDetails) other;
            return Intrinsics.areEqual(unknownFields(), optionOrderDetails.unknownFields()) && this.trade_value_multiplier == optionOrderDetails.trade_value_multiplier && Intrinsics.areEqual(this.underlyings, optionOrderDetails.underlyings);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((unknownFields().hashCode() * 37) + Integer.hashCode(this.trade_value_multiplier)) * 37) + this.underlyings.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("trade_value_multiplier=" + this.trade_value_multiplier);
            if (!this.underlyings.isEmpty()) {
                arrayList.add("underlyings=" + this.underlyings);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "OptionOrderDetails{", "}", 0, null, null, 56, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OptionOrderDetails copy$default(OptionOrderDetails optionOrderDetails, int i, List list, ByteString byteString, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = optionOrderDetails.trade_value_multiplier;
            }
            if ((i2 & 2) != 0) {
                list = optionOrderDetails.underlyings;
            }
            if ((i2 & 4) != 0) {
                byteString = optionOrderDetails.unknownFields();
            }
            return optionOrderDetails.copy(i, list, byteString);
        }

        public final OptionOrderDetails copy(int trade_value_multiplier, List<Underlying> underlyings, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(underlyings, "underlyings");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new OptionOrderDetails(trade_value_multiplier, underlyings, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OptionOrderDetails.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<OptionOrderDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: wormhole.service.v1.RealizedGainLossItem$OptionOrderDetails$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(RealizedGainLossItem.OptionOrderDetails value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (value.getTrade_value_multiplier() != 0) {
                        size += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getTrade_value_multiplier()));
                    }
                    return size + RealizedGainLossItem.OptionOrderDetails.Underlying.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getUnderlyings());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, RealizedGainLossItem.OptionOrderDetails value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.getTrade_value_multiplier() != 0) {
                        ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getTrade_value_multiplier()));
                    }
                    RealizedGainLossItem.OptionOrderDetails.Underlying.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getUnderlyings());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, RealizedGainLossItem.OptionOrderDetails value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    RealizedGainLossItem.OptionOrderDetails.Underlying.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getUnderlyings());
                    if (value.getTrade_value_multiplier() != 0) {
                        ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getTrade_value_multiplier()));
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public RealizedGainLossItem.OptionOrderDetails decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    ArrayList arrayList = new ArrayList();
                    long jBeginMessage = reader.beginMessage();
                    int iIntValue = 0;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new RealizedGainLossItem.OptionOrderDetails(iIntValue, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                        } else if (iNextTag == 2) {
                            arrayList.add(RealizedGainLossItem.OptionOrderDetails.Underlying.ADAPTER.decode(reader));
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public RealizedGainLossItem.OptionOrderDetails redact(RealizedGainLossItem.OptionOrderDetails value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return RealizedGainLossItem.OptionOrderDetails.copy$default(value, 0, Internal.m26823redactElements(value.getUnderlyings(), RealizedGainLossItem.OptionOrderDetails.Underlying.ADAPTER), ByteString.EMPTY, 1, null);
                }
            };
        }

        /* compiled from: RealizedGainLossItem.kt */
        @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J0\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001b"}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossItem$OptionOrderDetails$Underlying;", "Lcom/squareup/wire/Message;", "", "id", "", "type", "Lwormhole/service/v1/UnderlyingType;", "symbol", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lwormhole/service/v1/UnderlyingType;Ljava/lang/String;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getType", "()Lwormhole/service/v1/UnderlyingType;", "getSymbol", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Underlying extends Message {

            @JvmField
            public static final ProtoAdapter<Underlying> ADAPTER;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final String id;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
            private final String symbol;

            @WireField(adapter = "wormhole.service.v1.UnderlyingType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
            private final UnderlyingType type;

            public Underlying() {
                this(null, null, null, null, 15, null);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m30076newBuilder();
            }

            public final String getId() {
                return this.id;
            }

            public /* synthetic */ Underlying(String str, UnderlyingType underlyingType, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? UnderlyingType.UNDERLYING_TYPE_UNSPECIFIED : underlyingType, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
            }

            public final UnderlyingType getType() {
                return this.type;
            }

            public final String getSymbol() {
                return this.symbol;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Underlying(String id, UnderlyingType type2, String str, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(type2, "type");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.id = id;
                this.type = type2;
                this.symbol = str;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m30076newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof Underlying)) {
                    return false;
                }
                Underlying underlying = (Underlying) other;
                return Intrinsics.areEqual(unknownFields(), underlying.unknownFields()) && Intrinsics.areEqual(this.id, underlying.id) && this.type == underlying.type && Intrinsics.areEqual(this.symbol, underlying.symbol);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = ((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.type.hashCode()) * 37;
                String str = this.symbol;
                int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
                this.hashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("id=" + Internal.sanitize(this.id));
                arrayList.add("type=" + this.type);
                String str = this.symbol;
                if (str != null) {
                    arrayList.add("symbol=" + Internal.sanitize(str));
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Underlying{", "}", 0, null, null, 56, null);
            }

            public static /* synthetic */ Underlying copy$default(Underlying underlying, String str, UnderlyingType underlyingType, String str2, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = underlying.id;
                }
                if ((i & 2) != 0) {
                    underlyingType = underlying.type;
                }
                if ((i & 4) != 0) {
                    str2 = underlying.symbol;
                }
                if ((i & 8) != 0) {
                    byteString = underlying.unknownFields();
                }
                return underlying.copy(str, underlyingType, str2, byteString);
            }

            public final Underlying copy(String id, UnderlyingType type2, String symbol, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(type2, "type");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new Underlying(id, type2, symbol, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Underlying.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<Underlying>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: wormhole.service.v1.RealizedGainLossItem$OptionOrderDetails$Underlying$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(RealizedGainLossItem.OptionOrderDetails.Underlying value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        int size = value.unknownFields().size();
                        if (!Intrinsics.areEqual(value.getId(), "")) {
                            size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                        }
                        if (value.getType() != UnderlyingType.UNDERLYING_TYPE_UNSPECIFIED) {
                            size += UnderlyingType.ADAPTER.encodedSizeWithTag(2, value.getType());
                        }
                        return size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getSymbol());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, RealizedGainLossItem.OptionOrderDetails.Underlying value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (!Intrinsics.areEqual(value.getId(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                        }
                        if (value.getType() != UnderlyingType.UNDERLYING_TYPE_UNSPECIFIED) {
                            UnderlyingType.ADAPTER.encodeWithTag(writer, 2, (int) value.getType());
                        }
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSymbol());
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, RealizedGainLossItem.OptionOrderDetails.Underlying value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                        protoAdapter.encodeWithTag(writer, 3, (int) value.getSymbol());
                        if (value.getType() != UnderlyingType.UNDERLYING_TYPE_UNSPECIFIED) {
                            UnderlyingType.ADAPTER.encodeWithTag(writer, 2, (int) value.getType());
                        }
                        if (Intrinsics.areEqual(value.getId(), "")) {
                            return;
                        }
                        protoAdapter.encodeWithTag(writer, 1, (int) value.getId());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public RealizedGainLossItem.OptionOrderDetails.Underlying decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        UnderlyingType underlyingTypeDecode = UnderlyingType.UNDERLYING_TYPE_UNSPECIFIED;
                        long jBeginMessage = reader.beginMessage();
                        String strDecode = "";
                        String strDecode2 = null;
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new RealizedGainLossItem.OptionOrderDetails.Underlying(strDecode, underlyingTypeDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                strDecode = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag == 2) {
                                try {
                                    underlyingTypeDecode = UnderlyingType.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            } else if (iNextTag == 3) {
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public RealizedGainLossItem.OptionOrderDetails.Underlying redact(RealizedGainLossItem.OptionOrderDetails.Underlying value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return RealizedGainLossItem.OptionOrderDetails.Underlying.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
                    }
                };
            }
        }
    }

    /* compiled from: RealizedGainLossItem.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0007H\u0016J2\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m3636d2 = {"Lwormhole/service/v1/RealizedGainLossItem$CryptoOrderDetails;", "Lcom/squareup/wire/Message;", "", "acquired", "Lwormhole/service/v1/RealizedGainLossItemComponent;", "transferred", "currency_pair_id", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lwormhole/service/v1/RealizedGainLossItemComponent;Lwormhole/service/v1/RealizedGainLossItemComponent;Ljava/lang/String;Lokio/ByteString;)V", "getAcquired", "()Lwormhole/service/v1/RealizedGainLossItemComponent;", "getTransferred", "getCurrency_pair_id", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "wormhole.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes28.dex */
    public static final class CryptoOrderDetails extends Message {

        @JvmField
        public static final ProtoAdapter<CryptoOrderDetails> ADAPTER;

        @WireField(adapter = "wormhole.service.v1.RealizedGainLossItemComponent#ADAPTER", schemaIndex = 0, tag = 1)
        private final RealizedGainLossItemComponent acquired;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "currencyPairId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final String currency_pair_id;

        @WireField(adapter = "wormhole.service.v1.RealizedGainLossItemComponent#ADAPTER", schemaIndex = 1, tag = 2)
        private final RealizedGainLossItemComponent transferred;

        public CryptoOrderDetails() {
            this(null, null, null, null, 15, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m30073newBuilder();
        }

        public final RealizedGainLossItemComponent getAcquired() {
            return this.acquired;
        }

        public final RealizedGainLossItemComponent getTransferred() {
            return this.transferred;
        }

        public final String getCurrency_pair_id() {
            return this.currency_pair_id;
        }

        public /* synthetic */ CryptoOrderDetails(RealizedGainLossItemComponent realizedGainLossItemComponent, RealizedGainLossItemComponent realizedGainLossItemComponent2, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : realizedGainLossItemComponent, (i & 2) != 0 ? null : realizedGainLossItemComponent2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CryptoOrderDetails(RealizedGainLossItemComponent realizedGainLossItemComponent, RealizedGainLossItemComponent realizedGainLossItemComponent2, String currency_pair_id, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.acquired = realizedGainLossItemComponent;
            this.transferred = realizedGainLossItemComponent2;
            this.currency_pair_id = currency_pair_id;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m30073newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof CryptoOrderDetails)) {
                return false;
            }
            CryptoOrderDetails cryptoOrderDetails = (CryptoOrderDetails) other;
            return Intrinsics.areEqual(unknownFields(), cryptoOrderDetails.unknownFields()) && Intrinsics.areEqual(this.acquired, cryptoOrderDetails.acquired) && Intrinsics.areEqual(this.transferred, cryptoOrderDetails.transferred) && Intrinsics.areEqual(this.currency_pair_id, cryptoOrderDetails.currency_pair_id);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            RealizedGainLossItemComponent realizedGainLossItemComponent = this.acquired;
            int iHashCode2 = (iHashCode + (realizedGainLossItemComponent != null ? realizedGainLossItemComponent.hashCode() : 0)) * 37;
            RealizedGainLossItemComponent realizedGainLossItemComponent2 = this.transferred;
            int iHashCode3 = ((iHashCode2 + (realizedGainLossItemComponent2 != null ? realizedGainLossItemComponent2.hashCode() : 0)) * 37) + this.currency_pair_id.hashCode();
            this.hashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            RealizedGainLossItemComponent realizedGainLossItemComponent = this.acquired;
            if (realizedGainLossItemComponent != null) {
                arrayList.add("acquired=" + realizedGainLossItemComponent);
            }
            RealizedGainLossItemComponent realizedGainLossItemComponent2 = this.transferred;
            if (realizedGainLossItemComponent2 != null) {
                arrayList.add("transferred=" + realizedGainLossItemComponent2);
            }
            arrayList.add("currency_pair_id=" + Internal.sanitize(this.currency_pair_id));
            return CollectionsKt.joinToString$default(arrayList, ", ", "CryptoOrderDetails{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ CryptoOrderDetails copy$default(CryptoOrderDetails cryptoOrderDetails, RealizedGainLossItemComponent realizedGainLossItemComponent, RealizedGainLossItemComponent realizedGainLossItemComponent2, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                realizedGainLossItemComponent = cryptoOrderDetails.acquired;
            }
            if ((i & 2) != 0) {
                realizedGainLossItemComponent2 = cryptoOrderDetails.transferred;
            }
            if ((i & 4) != 0) {
                str = cryptoOrderDetails.currency_pair_id;
            }
            if ((i & 8) != 0) {
                byteString = cryptoOrderDetails.unknownFields();
            }
            return cryptoOrderDetails.copy(realizedGainLossItemComponent, realizedGainLossItemComponent2, str, byteString);
        }

        public final CryptoOrderDetails copy(RealizedGainLossItemComponent acquired, RealizedGainLossItemComponent transferred, String currency_pair_id, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new CryptoOrderDetails(acquired, transferred, currency_pair_id, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CryptoOrderDetails.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<CryptoOrderDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: wormhole.service.v1.RealizedGainLossItem$CryptoOrderDetails$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public RealizedGainLossItem.CryptoOrderDetails decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    RealizedGainLossItemComponent realizedGainLossItemComponentDecode = null;
                    String strDecode = "";
                    RealizedGainLossItemComponent realizedGainLossItemComponentDecode2 = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new RealizedGainLossItem.CryptoOrderDetails(realizedGainLossItemComponentDecode, realizedGainLossItemComponentDecode2, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            realizedGainLossItemComponentDecode = RealizedGainLossItemComponent.ADAPTER.decode(reader);
                        } else if (iNextTag == 2) {
                            realizedGainLossItemComponentDecode2 = RealizedGainLossItemComponent.ADAPTER.decode(reader);
                        } else if (iNextTag == 3) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(RealizedGainLossItem.CryptoOrderDetails value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    ProtoAdapter<RealizedGainLossItemComponent> protoAdapter = RealizedGainLossItemComponent.ADAPTER;
                    int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(1, value.getAcquired()) + protoAdapter.encodedSizeWithTag(2, value.getTransferred());
                    return !Intrinsics.areEqual(value.getCurrency_pair_id(), "") ? iEncodedSizeWithTag + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getCurrency_pair_id()) : iEncodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, RealizedGainLossItem.CryptoOrderDetails value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    ProtoAdapter<RealizedGainLossItemComponent> protoAdapter = RealizedGainLossItemComponent.ADAPTER;
                    protoAdapter.encodeWithTag(writer, 1, (int) value.getAcquired());
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getTransferred());
                    if (!Intrinsics.areEqual(value.getCurrency_pair_id(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getCurrency_pair_id());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, RealizedGainLossItem.CryptoOrderDetails value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (!Intrinsics.areEqual(value.getCurrency_pair_id(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getCurrency_pair_id());
                    }
                    ProtoAdapter<RealizedGainLossItemComponent> protoAdapter = RealizedGainLossItemComponent.ADAPTER;
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getTransferred());
                    protoAdapter.encodeWithTag(writer, 1, (int) value.getAcquired());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public RealizedGainLossItem.CryptoOrderDetails redact(RealizedGainLossItem.CryptoOrderDetails value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    RealizedGainLossItemComponent acquired = value.getAcquired();
                    RealizedGainLossItemComponent realizedGainLossItemComponentRedact = acquired != null ? RealizedGainLossItemComponent.ADAPTER.redact(acquired) : null;
                    RealizedGainLossItemComponent transferred = value.getTransferred();
                    return RealizedGainLossItem.CryptoOrderDetails.copy$default(value, realizedGainLossItemComponentRedact, transferred != null ? RealizedGainLossItemComponent.ADAPTER.redact(transferred) : null, null, ByteString.EMPTY, 4, null);
                }
            };
        }
    }
}
