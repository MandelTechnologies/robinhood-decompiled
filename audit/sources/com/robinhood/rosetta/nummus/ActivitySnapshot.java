package com.robinhood.rosetta.nummus;

import cbc.service.p048v1.CbcTaxLotUpdateEvent;
import com.robinhood.android.instant.p160ui.InstantCashConstants;
import com.robinhood.android.matcha.p177ui.p178qr.MatchaQrCodeDuxo6;
import com.robinhood.cbc.service.tax_lot.p283v1.OrderEarmarkRequest;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.rosetta.common.RequestContext;
import com.robinhood.rosetta.nummus.ActivitySnapshot;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import org.bouncycastle.i18n.ErrorBundle;
import p479j$.time.Instant;
import rosetta.nummus.AccountType;

/* compiled from: ActivitySnapshot.kt */
@Metadata(m3635d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b>\u0018\u0000 n2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003nopBï\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\b\b\u0002\u0010(\u001a\u00020'\u0012\b\b\u0002\u0010)\u001a\u00020\u0003¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0002H\u0017¢\u0006\u0004\b,\u0010-J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010.H\u0096\u0002¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u000203H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\rH\u0016¢\u0006\u0004\b6\u00107Jõ\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010)\u001a\u00020\u0003¢\u0006\u0004\b8\u00109R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b=\u0010<R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010A\u001a\u0004\bB\u0010CR\"\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010G\u001a\u0004\bH\u00107R\u001a\u0010\u000f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010>\u001a\u0004\bI\u0010@R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010J\u001a\u0004\bK\u0010LR\u001a\u0010\u0016\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010M\u001a\u0004\bN\u0010OR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010P\u001a\u0004\bQ\u0010RR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010S\u001a\u0004\bT\u0010UR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010V\u001a\u0004\bW\u0010XR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010Y\u001a\u0004\bZ\u0010[R\u001c\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\\\u001a\u0004\b]\u0010^R\u001c\u0010\"\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010_\u001a\u0004\b`\u0010aR\u001c\u0010$\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010b\u001a\u0004\bc\u0010dR\u001c\u0010&\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010e\u001a\u0004\bf\u0010gR\u001a\u0010(\u001a\u00020'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010h\u001a\u0004\bi\u0010jR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010k\u001a\u0004\bl\u0010m¨\u0006q"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/ActivitySnapshot;", "Lcom/squareup/wire/Message;", "", "Lokio/ByteString;", "object_id", MatchaQrCodeDuxo6.USER_ID_KEY, "", "account_number", "Lcom/robinhood/rosetta/nummus/ActivitySnapshot$Type;", "type", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "", "context", "ordering_id", "", "Lcom/robinhood/rosetta/nummus/CurrencyMovement;", "currency_movements", "Lcom/robinhood/rosetta/common/RequestContext;", "request_context", "Lrosetta/nummus/AccountType;", InstantCashConstants.ACCOUNT_TYPE_KEY, "Lcom/robinhood/rosetta/nummus/CryptoOrderDetails;", "crypto_order_details", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetails;", "currency_pair_details", "Lcom/robinhood/cbc/service/tax_lot/v1/OrderEarmarkRequest;", "tax_lot_earmark_request", "Lcbc/service/v1/CbcTaxLotUpdateEvent;", "cbc_tax_lot_update_event", "Lcom/robinhood/rosetta/nummus/NewAccountDetails;", "new_account_details", "Lcom/robinhood/rosetta/nummus/DepositStatusDetails;", "deposit_status_details", "Lcom/robinhood/rosetta/nummus/AssetMigrationDetails;", "asset_migration_details", "Lcom/robinhood/rosetta/nummus/PlaceCryptoOrderErrorDetails;", "place_crypto_order_error_details", "Lcom/robinhood/rosetta/nummus/ActivitySnapshot$Region;", "region", "unknownFields", "<init>", "(Lokio/ByteString;Lokio/ByteString;JLcom/robinhood/rosetta/nummus/ActivitySnapshot$Type;Lj$/time/Instant;Ljava/lang/String;JLjava/util/List;Lcom/robinhood/rosetta/common/RequestContext;Lrosetta/nummus/AccountType;Lcom/robinhood/rosetta/nummus/CryptoOrderDetails;Lcom/robinhood/rosetta/nummus/CurrencyPairDetails;Lcom/robinhood/cbc/service/tax_lot/v1/OrderEarmarkRequest;Lcbc/service/v1/CbcTaxLotUpdateEvent;Lcom/robinhood/rosetta/nummus/NewAccountDetails;Lcom/robinhood/rosetta/nummus/DepositStatusDetails;Lcom/robinhood/rosetta/nummus/AssetMigrationDetails;Lcom/robinhood/rosetta/nummus/PlaceCryptoOrderErrorDetails;Lcom/robinhood/rosetta/nummus/ActivitySnapshot$Region;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Lokio/ByteString;Lokio/ByteString;JLcom/robinhood/rosetta/nummus/ActivitySnapshot$Type;Lj$/time/Instant;Ljava/lang/String;JLjava/util/List;Lcom/robinhood/rosetta/common/RequestContext;Lrosetta/nummus/AccountType;Lcom/robinhood/rosetta/nummus/CryptoOrderDetails;Lcom/robinhood/rosetta/nummus/CurrencyPairDetails;Lcom/robinhood/cbc/service/tax_lot/v1/OrderEarmarkRequest;Lcbc/service/v1/CbcTaxLotUpdateEvent;Lcom/robinhood/rosetta/nummus/NewAccountDetails;Lcom/robinhood/rosetta/nummus/DepositStatusDetails;Lcom/robinhood/rosetta/nummus/AssetMigrationDetails;Lcom/robinhood/rosetta/nummus/PlaceCryptoOrderErrorDetails;Lcom/robinhood/rosetta/nummus/ActivitySnapshot$Region;Lokio/ByteString;)Lcom/robinhood/rosetta/nummus/ActivitySnapshot;", "Lokio/ByteString;", "getObject_id", "()Lokio/ByteString;", "getUser_id", "J", "getAccount_number", "()J", "Lcom/robinhood/rosetta/nummus/ActivitySnapshot$Type;", "getType", "()Lcom/robinhood/rosetta/nummus/ActivitySnapshot$Type;", "Lj$/time/Instant;", "getTimestamp", "()Lj$/time/Instant;", "Ljava/lang/String;", "getContext", "getOrdering_id", "Lcom/robinhood/rosetta/common/RequestContext;", "getRequest_context", "()Lcom/robinhood/rosetta/common/RequestContext;", "Lrosetta/nummus/AccountType;", "getAccount_type", "()Lrosetta/nummus/AccountType;", "Lcom/robinhood/rosetta/nummus/CryptoOrderDetails;", "getCrypto_order_details", "()Lcom/robinhood/rosetta/nummus/CryptoOrderDetails;", "Lcom/robinhood/rosetta/nummus/CurrencyPairDetails;", "getCurrency_pair_details", "()Lcom/robinhood/rosetta/nummus/CurrencyPairDetails;", "Lcom/robinhood/cbc/service/tax_lot/v1/OrderEarmarkRequest;", "getTax_lot_earmark_request", "()Lcom/robinhood/cbc/service/tax_lot/v1/OrderEarmarkRequest;", "Lcbc/service/v1/CbcTaxLotUpdateEvent;", "getCbc_tax_lot_update_event", "()Lcbc/service/v1/CbcTaxLotUpdateEvent;", "Lcom/robinhood/rosetta/nummus/NewAccountDetails;", "getNew_account_details", "()Lcom/robinhood/rosetta/nummus/NewAccountDetails;", "Lcom/robinhood/rosetta/nummus/DepositStatusDetails;", "getDeposit_status_details", "()Lcom/robinhood/rosetta/nummus/DepositStatusDetails;", "Lcom/robinhood/rosetta/nummus/AssetMigrationDetails;", "getAsset_migration_details", "()Lcom/robinhood/rosetta/nummus/AssetMigrationDetails;", "Lcom/robinhood/rosetta/nummus/PlaceCryptoOrderErrorDetails;", "getPlace_crypto_order_error_details", "()Lcom/robinhood/rosetta/nummus/PlaceCryptoOrderErrorDetails;", "Lcom/robinhood/rosetta/nummus/ActivitySnapshot$Region;", "getRegion", "()Lcom/robinhood/rosetta/nummus/ActivitySnapshot$Region;", "Ljava/util/List;", "getCurrency_movements", "()Ljava/util/List;", "Companion", "Type", "Region", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class ActivitySnapshot extends Message {

    @JvmField
    public static final ProtoAdapter<ActivitySnapshot> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final long account_number;

    @WireField(adapter = "rosetta.nummus.AccountType#ADAPTER", jsonName = "accountType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final AccountType account_type;

    @WireField(adapter = "com.robinhood.rosetta.nummus.AssetMigrationDetails#ADAPTER", jsonName = "assetMigrationDetails", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 16, tag = 22)
    private final AssetMigrationDetails asset_migration_details;

    @WireField(adapter = "cbc.service.v1.CbcTaxLotUpdateEvent#ADAPTER", jsonName = "cbcTaxLotUpdateEvent", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 13, tag = 19)
    private final CbcTaxLotUpdateEvent cbc_tax_lot_update_event;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String context;

    @WireField(adapter = "com.robinhood.rosetta.nummus.CryptoOrderDetails#ADAPTER", jsonName = "cryptoOrderDetails", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 10, tag = 16)
    private final CryptoOrderDetails crypto_order_details;

    @WireField(adapter = "com.robinhood.rosetta.nummus.CurrencyMovement#ADAPTER", jsonName = "currencyMovements", label = WireField.Label.REPEATED, schemaIndex = 7, tag = 8)
    private final List<CurrencyMovement> currency_movements;

    @WireField(adapter = "com.robinhood.rosetta.nummus.CurrencyPairDetails#ADAPTER", jsonName = "currencyPairDetails", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 11, tag = 17)
    private final CurrencyPairDetails currency_pair_details;

    @WireField(adapter = "com.robinhood.rosetta.nummus.DepositStatusDetails#ADAPTER", jsonName = "depositStatusDetails", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 15, tag = 21)
    private final DepositStatusDetails deposit_status_details;

    @WireField(adapter = "com.robinhood.rosetta.nummus.NewAccountDetails#ADAPTER", jsonName = "newAccountDetails", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 14, tag = 20)
    private final NewAccountDetails new_account_details;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "objectId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ByteString object_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "orderingId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final long ordering_id;

    @WireField(adapter = "com.robinhood.rosetta.nummus.PlaceCryptoOrderErrorDetails#ADAPTER", jsonName = "placeCryptoOrderErrorDetails", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 17, tag = 24)
    private final PlaceCryptoOrderErrorDetails place_crypto_order_error_details;

    @WireField(adapter = "com.robinhood.rosetta.nummus.ActivitySnapshot$Region#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 18, tag = 23)
    private final Region region;

    @WireField(adapter = "com.robinhood.rosetta.common.RequestContext#ADAPTER", jsonName = "requestContext", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final RequestContext request_context;

    @WireField(adapter = "com.robinhood.cbc.service.tax_lot.v1.OrderEarmarkRequest#ADAPTER", jsonName = "taxLotEarmarkRequest", oneofName = ErrorBundle.DETAIL_ENTRY, schemaIndex = 12, tag = 18)
    private final OrderEarmarkRequest tax_lot_earmark_request;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Instant timestamp;

    @WireField(adapter = "com.robinhood.rosetta.nummus.ActivitySnapshot$Type#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Type type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "userId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final ByteString user_id;

    public ActivitySnapshot() {
        this(null, null, 0L, null, null, null, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24724newBuilder();
    }

    public final ByteString getObject_id() {
        return this.object_id;
    }

    public /* synthetic */ ActivitySnapshot(ByteString byteString, ByteString byteString2, long j, Type type2, Instant instant, String str, long j2, List list, RequestContext requestContext, AccountType accountType, CryptoOrderDetails cryptoOrderDetails, CurrencyPairDetails currencyPairDetails, OrderEarmarkRequest orderEarmarkRequest, CbcTaxLotUpdateEvent cbcTaxLotUpdateEvent, NewAccountDetails newAccountDetails, DepositStatusDetails depositStatusDetails, AssetMigrationDetails assetMigrationDetails, PlaceCryptoOrderErrorDetails placeCryptoOrderErrorDetails, Region region, ByteString byteString3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ByteString.EMPTY : byteString, (i & 2) != 0 ? ByteString.EMPTY : byteString2, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? Type.TYPE_UNSPECIFIED : type2, (i & 16) != 0 ? null : instant, (i & 32) != 0 ? "" : str, (i & 64) == 0 ? j2 : 0L, (i & 128) != 0 ? CollectionsKt.emptyList() : list, (i & 256) != 0 ? null : requestContext, (i & 512) != 0 ? AccountType.ACCOUNT_TYPE_UNSPECIFIED : accountType, (i & 1024) != 0 ? null : cryptoOrderDetails, (i & 2048) != 0 ? null : currencyPairDetails, (i & 4096) != 0 ? null : orderEarmarkRequest, (i & 8192) != 0 ? null : cbcTaxLotUpdateEvent, (i & 16384) != 0 ? null : newAccountDetails, (i & 32768) != 0 ? null : depositStatusDetails, (i & 65536) != 0 ? null : assetMigrationDetails, (i & 131072) != 0 ? null : placeCryptoOrderErrorDetails, (i & 262144) != 0 ? Region.REGION_UNSPECIFIED : region, (i & 524288) != 0 ? ByteString.EMPTY : byteString3);
    }

    public final ByteString getUser_id() {
        return this.user_id;
    }

    public final long getAccount_number() {
        return this.account_number;
    }

    public final Type getType() {
        return this.type;
    }

    public final Instant getTimestamp() {
        return this.timestamp;
    }

    public final String getContext() {
        return this.context;
    }

    public final long getOrdering_id() {
        return this.ordering_id;
    }

    public final RequestContext getRequest_context() {
        return this.request_context;
    }

    public final AccountType getAccount_type() {
        return this.account_type;
    }

    public final CryptoOrderDetails getCrypto_order_details() {
        return this.crypto_order_details;
    }

    public final CurrencyPairDetails getCurrency_pair_details() {
        return this.currency_pair_details;
    }

    public final OrderEarmarkRequest getTax_lot_earmark_request() {
        return this.tax_lot_earmark_request;
    }

    public final CbcTaxLotUpdateEvent getCbc_tax_lot_update_event() {
        return this.cbc_tax_lot_update_event;
    }

    public final NewAccountDetails getNew_account_details() {
        return this.new_account_details;
    }

    public final DepositStatusDetails getDeposit_status_details() {
        return this.deposit_status_details;
    }

    public final AssetMigrationDetails getAsset_migration_details() {
        return this.asset_migration_details;
    }

    public final PlaceCryptoOrderErrorDetails getPlace_crypto_order_error_details() {
        return this.place_crypto_order_error_details;
    }

    public final Region getRegion() {
        return this.region;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivitySnapshot(ByteString object_id, ByteString user_id, long j, Type type2, Instant instant, String context, long j2, List<CurrencyMovement> currency_movements, RequestContext requestContext, AccountType account_type, CryptoOrderDetails cryptoOrderDetails, CurrencyPairDetails currencyPairDetails, OrderEarmarkRequest orderEarmarkRequest, CbcTaxLotUpdateEvent cbcTaxLotUpdateEvent, NewAccountDetails newAccountDetails, DepositStatusDetails depositStatusDetails, AssetMigrationDetails assetMigrationDetails, PlaceCryptoOrderErrorDetails placeCryptoOrderErrorDetails, Region region, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(object_id, "object_id");
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(currency_movements, "currency_movements");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.object_id = object_id;
        this.user_id = user_id;
        this.account_number = j;
        this.type = type2;
        this.timestamp = instant;
        this.context = context;
        this.ordering_id = j2;
        this.request_context = requestContext;
        this.account_type = account_type;
        this.crypto_order_details = cryptoOrderDetails;
        this.currency_pair_details = currencyPairDetails;
        this.tax_lot_earmark_request = orderEarmarkRequest;
        this.cbc_tax_lot_update_event = cbcTaxLotUpdateEvent;
        this.new_account_details = newAccountDetails;
        this.deposit_status_details = depositStatusDetails;
        this.asset_migration_details = assetMigrationDetails;
        this.place_crypto_order_error_details = placeCryptoOrderErrorDetails;
        this.region = region;
        this.currency_movements = Internal.immutableCopyOf("currency_movements", currency_movements);
        if (Internal.countNonNull(cryptoOrderDetails, currencyPairDetails, orderEarmarkRequest, cbcTaxLotUpdateEvent, newAccountDetails, depositStatusDetails, assetMigrationDetails, placeCryptoOrderErrorDetails) > 1) {
            throw new IllegalArgumentException("At most one of crypto_order_details, currency_pair_details, tax_lot_earmark_request, cbc_tax_lot_update_event, new_account_details, deposit_status_details, asset_migration_details, place_crypto_order_error_details may be non-null");
        }
    }

    public final List<CurrencyMovement> getCurrency_movements() {
        return this.currency_movements;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24724newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ActivitySnapshot)) {
            return false;
        }
        ActivitySnapshot activitySnapshot = (ActivitySnapshot) other;
        return Intrinsics.areEqual(unknownFields(), activitySnapshot.unknownFields()) && Intrinsics.areEqual(this.object_id, activitySnapshot.object_id) && Intrinsics.areEqual(this.user_id, activitySnapshot.user_id) && this.account_number == activitySnapshot.account_number && this.type == activitySnapshot.type && Intrinsics.areEqual(this.timestamp, activitySnapshot.timestamp) && Intrinsics.areEqual(this.context, activitySnapshot.context) && this.ordering_id == activitySnapshot.ordering_id && Intrinsics.areEqual(this.currency_movements, activitySnapshot.currency_movements) && Intrinsics.areEqual(this.request_context, activitySnapshot.request_context) && this.account_type == activitySnapshot.account_type && Intrinsics.areEqual(this.crypto_order_details, activitySnapshot.crypto_order_details) && Intrinsics.areEqual(this.currency_pair_details, activitySnapshot.currency_pair_details) && Intrinsics.areEqual(this.tax_lot_earmark_request, activitySnapshot.tax_lot_earmark_request) && Intrinsics.areEqual(this.cbc_tax_lot_update_event, activitySnapshot.cbc_tax_lot_update_event) && Intrinsics.areEqual(this.new_account_details, activitySnapshot.new_account_details) && Intrinsics.areEqual(this.deposit_status_details, activitySnapshot.deposit_status_details) && Intrinsics.areEqual(this.asset_migration_details, activitySnapshot.asset_migration_details) && Intrinsics.areEqual(this.place_crypto_order_error_details, activitySnapshot.place_crypto_order_error_details) && this.region == activitySnapshot.region;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.object_id.hashCode()) * 37) + this.user_id.hashCode()) * 37) + Long.hashCode(this.account_number)) * 37) + this.type.hashCode()) * 37;
        Instant instant = this.timestamp;
        int iHashCode2 = (((((((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.context.hashCode()) * 37) + Long.hashCode(this.ordering_id)) * 37) + this.currency_movements.hashCode()) * 37;
        RequestContext requestContext = this.request_context;
        int iHashCode3 = (((iHashCode2 + (requestContext != null ? requestContext.hashCode() : 0)) * 37) + this.account_type.hashCode()) * 37;
        CryptoOrderDetails cryptoOrderDetails = this.crypto_order_details;
        int iHashCode4 = (iHashCode3 + (cryptoOrderDetails != null ? cryptoOrderDetails.hashCode() : 0)) * 37;
        CurrencyPairDetails currencyPairDetails = this.currency_pair_details;
        int iHashCode5 = (iHashCode4 + (currencyPairDetails != null ? currencyPairDetails.hashCode() : 0)) * 37;
        OrderEarmarkRequest orderEarmarkRequest = this.tax_lot_earmark_request;
        int iHashCode6 = (iHashCode5 + (orderEarmarkRequest != null ? orderEarmarkRequest.hashCode() : 0)) * 37;
        CbcTaxLotUpdateEvent cbcTaxLotUpdateEvent = this.cbc_tax_lot_update_event;
        int iHashCode7 = (iHashCode6 + (cbcTaxLotUpdateEvent != null ? cbcTaxLotUpdateEvent.hashCode() : 0)) * 37;
        NewAccountDetails newAccountDetails = this.new_account_details;
        int iHashCode8 = (iHashCode7 + (newAccountDetails != null ? newAccountDetails.hashCode() : 0)) * 37;
        DepositStatusDetails depositStatusDetails = this.deposit_status_details;
        int iHashCode9 = (iHashCode8 + (depositStatusDetails != null ? depositStatusDetails.hashCode() : 0)) * 37;
        AssetMigrationDetails assetMigrationDetails = this.asset_migration_details;
        int iHashCode10 = (iHashCode9 + (assetMigrationDetails != null ? assetMigrationDetails.hashCode() : 0)) * 37;
        PlaceCryptoOrderErrorDetails placeCryptoOrderErrorDetails = this.place_crypto_order_error_details;
        int iHashCode11 = ((iHashCode10 + (placeCryptoOrderErrorDetails != null ? placeCryptoOrderErrorDetails.hashCode() : 0)) * 37) + this.region.hashCode();
        this.hashCode = iHashCode11;
        return iHashCode11;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("object_id=" + this.object_id);
        arrayList.add("user_id=" + this.user_id);
        arrayList.add("account_number=" + this.account_number);
        arrayList.add("type=" + this.type);
        Instant instant = this.timestamp;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        arrayList.add("context=" + Internal.sanitize(this.context));
        arrayList.add("ordering_id=" + this.ordering_id);
        if (!this.currency_movements.isEmpty()) {
            arrayList.add("currency_movements=" + this.currency_movements);
        }
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            arrayList.add("request_context=" + requestContext);
        }
        arrayList.add("account_type=" + this.account_type);
        CryptoOrderDetails cryptoOrderDetails = this.crypto_order_details;
        if (cryptoOrderDetails != null) {
            arrayList.add("crypto_order_details=" + cryptoOrderDetails);
        }
        CurrencyPairDetails currencyPairDetails = this.currency_pair_details;
        if (currencyPairDetails != null) {
            arrayList.add("currency_pair_details=" + currencyPairDetails);
        }
        OrderEarmarkRequest orderEarmarkRequest = this.tax_lot_earmark_request;
        if (orderEarmarkRequest != null) {
            arrayList.add("tax_lot_earmark_request=" + orderEarmarkRequest);
        }
        CbcTaxLotUpdateEvent cbcTaxLotUpdateEvent = this.cbc_tax_lot_update_event;
        if (cbcTaxLotUpdateEvent != null) {
            arrayList.add("cbc_tax_lot_update_event=" + cbcTaxLotUpdateEvent);
        }
        NewAccountDetails newAccountDetails = this.new_account_details;
        if (newAccountDetails != null) {
            arrayList.add("new_account_details=" + newAccountDetails);
        }
        DepositStatusDetails depositStatusDetails = this.deposit_status_details;
        if (depositStatusDetails != null) {
            arrayList.add("deposit_status_details=" + depositStatusDetails);
        }
        AssetMigrationDetails assetMigrationDetails = this.asset_migration_details;
        if (assetMigrationDetails != null) {
            arrayList.add("asset_migration_details=" + assetMigrationDetails);
        }
        PlaceCryptoOrderErrorDetails placeCryptoOrderErrorDetails = this.place_crypto_order_error_details;
        if (placeCryptoOrderErrorDetails != null) {
            arrayList.add("place_crypto_order_error_details=" + placeCryptoOrderErrorDetails);
        }
        arrayList.add("region=" + this.region);
        return CollectionsKt.joinToString$default(arrayList, ", ", "ActivitySnapshot{", "}", 0, null, null, 56, null);
    }

    public final ActivitySnapshot copy(ByteString object_id, ByteString user_id, long account_number, Type type2, Instant timestamp, String context, long ordering_id, List<CurrencyMovement> currency_movements, RequestContext request_context, AccountType account_type, CryptoOrderDetails crypto_order_details, CurrencyPairDetails currency_pair_details, OrderEarmarkRequest tax_lot_earmark_request, CbcTaxLotUpdateEvent cbc_tax_lot_update_event, NewAccountDetails new_account_details, DepositStatusDetails deposit_status_details, AssetMigrationDetails asset_migration_details, PlaceCryptoOrderErrorDetails place_crypto_order_error_details, Region region, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(object_id, "object_id");
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(currency_movements, "currency_movements");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ActivitySnapshot(object_id, user_id, account_number, type2, timestamp, context, ordering_id, currency_movements, request_context, account_type, crypto_order_details, currency_pair_details, tax_lot_earmark_request, cbc_tax_lot_update_event, new_account_details, deposit_status_details, asset_migration_details, place_crypto_order_error_details, region, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ActivitySnapshot.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ActivitySnapshot>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.nummus.ActivitySnapshot$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ActivitySnapshot value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ByteString object_id = value.getObject_id();
                ByteString byteString = ByteString.EMPTY;
                if (!Intrinsics.areEqual(object_id, byteString)) {
                    size += ProtoAdapter.BYTES.encodedSizeWithTag(1, value.getObject_id());
                }
                if (!Intrinsics.areEqual(value.getUser_id(), byteString)) {
                    size += ProtoAdapter.BYTES.encodedSizeWithTag(2, value.getUser_id());
                }
                if (value.getAccount_number() != 0) {
                    size += ProtoAdapter.INT64.encodedSizeWithTag(3, Long.valueOf(value.getAccount_number()));
                }
                if (value.getType() != ActivitySnapshot.Type.TYPE_UNSPECIFIED) {
                    size += ActivitySnapshot.Type.ADAPTER.encodedSizeWithTag(4, value.getType());
                }
                if (value.getTimestamp() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(5, value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getContext(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getContext());
                }
                if (value.getOrdering_id() != 0) {
                    size += ProtoAdapter.INT64.encodedSizeWithTag(7, Long.valueOf(value.getOrdering_id()));
                }
                int iEncodedSizeWithTag = size + CurrencyMovement.ADAPTER.asRepeated().encodedSizeWithTag(8, value.getCurrency_movements());
                if (value.getRequest_context() != null) {
                    iEncodedSizeWithTag += RequestContext.ADAPTER.encodedSizeWithTag(9, value.getRequest_context());
                }
                if (value.getAccount_type() != AccountType.ACCOUNT_TYPE_UNSPECIFIED) {
                    iEncodedSizeWithTag += AccountType.ADAPTER.encodedSizeWithTag(10, value.getAccount_type());
                }
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + CryptoOrderDetails.ADAPTER.encodedSizeWithTag(16, value.getCrypto_order_details()) + CurrencyPairDetails.ADAPTER.encodedSizeWithTag(17, value.getCurrency_pair_details()) + OrderEarmarkRequest.ADAPTER.encodedSizeWithTag(18, value.getTax_lot_earmark_request()) + CbcTaxLotUpdateEvent.ADAPTER.encodedSizeWithTag(19, value.getCbc_tax_lot_update_event()) + NewAccountDetails.ADAPTER.encodedSizeWithTag(20, value.getNew_account_details()) + DepositStatusDetails.ADAPTER.encodedSizeWithTag(21, value.getDeposit_status_details()) + AssetMigrationDetails.ADAPTER.encodedSizeWithTag(22, value.getAsset_migration_details()) + PlaceCryptoOrderErrorDetails.ADAPTER.encodedSizeWithTag(24, value.getPlace_crypto_order_error_details());
                return value.getRegion() != ActivitySnapshot.Region.REGION_UNSPECIFIED ? iEncodedSizeWithTag2 + ActivitySnapshot.Region.ADAPTER.encodedSizeWithTag(23, value.getRegion()) : iEncodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ActivitySnapshot value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ByteString object_id = value.getObject_id();
                ByteString byteString = ByteString.EMPTY;
                if (!Intrinsics.areEqual(object_id, byteString)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 1, (int) value.getObject_id());
                }
                if (!Intrinsics.areEqual(value.getUser_id(), byteString)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 2, (int) value.getUser_id());
                }
                if (value.getAccount_number() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 3, (int) Long.valueOf(value.getAccount_number()));
                }
                if (value.getType() != ActivitySnapshot.Type.TYPE_UNSPECIFIED) {
                    ActivitySnapshot.Type.ADAPTER.encodeWithTag(writer, 4, (int) value.getType());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 5, (int) value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getContext(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getContext());
                }
                if (value.getOrdering_id() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 7, (int) Long.valueOf(value.getOrdering_id()));
                }
                CurrencyMovement.ADAPTER.asRepeated().encodeWithTag(writer, 8, (int) value.getCurrency_movements());
                if (value.getRequest_context() != null) {
                    RequestContext.ADAPTER.encodeWithTag(writer, 9, (int) value.getRequest_context());
                }
                if (value.getAccount_type() != AccountType.ACCOUNT_TYPE_UNSPECIFIED) {
                    AccountType.ADAPTER.encodeWithTag(writer, 10, (int) value.getAccount_type());
                }
                if (value.getRegion() != ActivitySnapshot.Region.REGION_UNSPECIFIED) {
                    ActivitySnapshot.Region.ADAPTER.encodeWithTag(writer, 23, (int) value.getRegion());
                }
                CryptoOrderDetails.ADAPTER.encodeWithTag(writer, 16, (int) value.getCrypto_order_details());
                CurrencyPairDetails.ADAPTER.encodeWithTag(writer, 17, (int) value.getCurrency_pair_details());
                OrderEarmarkRequest.ADAPTER.encodeWithTag(writer, 18, (int) value.getTax_lot_earmark_request());
                CbcTaxLotUpdateEvent.ADAPTER.encodeWithTag(writer, 19, (int) value.getCbc_tax_lot_update_event());
                NewAccountDetails.ADAPTER.encodeWithTag(writer, 20, (int) value.getNew_account_details());
                DepositStatusDetails.ADAPTER.encodeWithTag(writer, 21, (int) value.getDeposit_status_details());
                AssetMigrationDetails.ADAPTER.encodeWithTag(writer, 22, (int) value.getAsset_migration_details());
                PlaceCryptoOrderErrorDetails.ADAPTER.encodeWithTag(writer, 24, (int) value.getPlace_crypto_order_error_details());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ActivitySnapshot value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                PlaceCryptoOrderErrorDetails.ADAPTER.encodeWithTag(writer, 24, (int) value.getPlace_crypto_order_error_details());
                AssetMigrationDetails.ADAPTER.encodeWithTag(writer, 22, (int) value.getAsset_migration_details());
                DepositStatusDetails.ADAPTER.encodeWithTag(writer, 21, (int) value.getDeposit_status_details());
                NewAccountDetails.ADAPTER.encodeWithTag(writer, 20, (int) value.getNew_account_details());
                CbcTaxLotUpdateEvent.ADAPTER.encodeWithTag(writer, 19, (int) value.getCbc_tax_lot_update_event());
                OrderEarmarkRequest.ADAPTER.encodeWithTag(writer, 18, (int) value.getTax_lot_earmark_request());
                CurrencyPairDetails.ADAPTER.encodeWithTag(writer, 17, (int) value.getCurrency_pair_details());
                CryptoOrderDetails.ADAPTER.encodeWithTag(writer, 16, (int) value.getCrypto_order_details());
                if (value.getRegion() != ActivitySnapshot.Region.REGION_UNSPECIFIED) {
                    ActivitySnapshot.Region.ADAPTER.encodeWithTag(writer, 23, (int) value.getRegion());
                }
                if (value.getAccount_type() != AccountType.ACCOUNT_TYPE_UNSPECIFIED) {
                    AccountType.ADAPTER.encodeWithTag(writer, 10, (int) value.getAccount_type());
                }
                if (value.getRequest_context() != null) {
                    RequestContext.ADAPTER.encodeWithTag(writer, 9, (int) value.getRequest_context());
                }
                CurrencyMovement.ADAPTER.asRepeated().encodeWithTag(writer, 8, (int) value.getCurrency_movements());
                if (value.getOrdering_id() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 7, (int) Long.valueOf(value.getOrdering_id()));
                }
                if (!Intrinsics.areEqual(value.getContext(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getContext());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 5, (int) value.getTimestamp());
                }
                if (value.getType() != ActivitySnapshot.Type.TYPE_UNSPECIFIED) {
                    ActivitySnapshot.Type.ADAPTER.encodeWithTag(writer, 4, (int) value.getType());
                }
                if (value.getAccount_number() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 3, (int) Long.valueOf(value.getAccount_number()));
                }
                ByteString user_id = value.getUser_id();
                ByteString byteString = ByteString.EMPTY;
                if (!Intrinsics.areEqual(user_id, byteString)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 2, (int) value.getUser_id());
                }
                if (Intrinsics.areEqual(value.getObject_id(), byteString)) {
                    return;
                }
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, (int) value.getObject_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ActivitySnapshot decode(ProtoReader reader) throws IOException {
                ByteString byteString;
                AccountType accountType;
                ActivitySnapshot.Region region;
                ByteString byteString2;
                Intrinsics.checkNotNullParameter(reader, "reader");
                ByteString byteString3 = ByteString.EMPTY;
                ActivitySnapshot.Type type2 = ActivitySnapshot.Type.TYPE_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                AccountType accountType2 = AccountType.ACCOUNT_TYPE_UNSPECIFIED;
                ActivitySnapshot.Region region2 = ActivitySnapshot.Region.REGION_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                ByteString byteStringDecode = byteString3;
                long jLongValue = 0;
                Instant instantDecode = null;
                RequestContext requestContextDecode = null;
                CryptoOrderDetails cryptoOrderDetailsDecode = null;
                CurrencyPairDetails currencyPairDetailsDecode = null;
                OrderEarmarkRequest orderEarmarkRequestDecode = null;
                CbcTaxLotUpdateEvent cbcTaxLotUpdateEventDecode = null;
                NewAccountDetails newAccountDetailsDecode = null;
                DepositStatusDetails depositStatusDetailsDecode = null;
                AssetMigrationDetails assetMigrationDetailsDecode = null;
                PlaceCryptoOrderErrorDetails placeCryptoOrderErrorDetailsDecode = null;
                String strDecode = "";
                AccountType accountTypeDecode = accountType2;
                ActivitySnapshot.Region regionDecode = region2;
                long jLongValue2 = 0;
                ByteString byteStringDecode2 = byteStringDecode;
                ActivitySnapshot.Type typeDecode = type2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ActivitySnapshot(byteStringDecode, byteStringDecode2, jLongValue2, typeDecode, instantDecode, strDecode, jLongValue, arrayList, requestContextDecode, accountTypeDecode, cryptoOrderDetailsDecode, currencyPairDetailsDecode, orderEarmarkRequestDecode, cbcTaxLotUpdateEventDecode, newAccountDetailsDecode, depositStatusDetailsDecode, assetMigrationDetailsDecode, placeCryptoOrderErrorDetailsDecode, regionDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    switch (iNextTag) {
                        case 1:
                            byteStringDecode = ProtoAdapter.BYTES.decode(reader);
                            break;
                        case 2:
                            byteStringDecode2 = ProtoAdapter.BYTES.decode(reader);
                            break;
                        case 3:
                            byteString2 = byteStringDecode2;
                            jLongValue2 = ProtoAdapter.INT64.decode(reader).longValue();
                            byteStringDecode2 = byteString2;
                            break;
                        case 4:
                            byteString = byteStringDecode2;
                            accountType = accountTypeDecode;
                            region = regionDecode;
                            try {
                                typeDecode = ActivitySnapshot.Type.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            byteStringDecode2 = byteString;
                            accountTypeDecode = accountType;
                            regionDecode = region;
                            break;
                        case 5:
                            instantDecode = ProtoAdapter.INSTANT.decode(reader);
                            break;
                        case 6:
                            strDecode = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 7:
                            byteString2 = byteStringDecode2;
                            jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                            byteStringDecode2 = byteString2;
                            break;
                        case 8:
                            byteString = byteStringDecode2;
                            accountType = accountTypeDecode;
                            region = regionDecode;
                            arrayList.add(CurrencyMovement.ADAPTER.decode(reader));
                            byteStringDecode2 = byteString;
                            accountTypeDecode = accountType;
                            regionDecode = region;
                            break;
                        case 9:
                            requestContextDecode = RequestContext.ADAPTER.decode(reader);
                            break;
                        case 10:
                            byteString = byteStringDecode2;
                            accountType = accountTypeDecode;
                            region = regionDecode;
                            try {
                                accountTypeDecode = AccountType.ADAPTER.decode(reader);
                                byteStringDecode2 = byteString;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                break;
                            }
                            regionDecode = region;
                            break;
                        default:
                            switch (iNextTag) {
                                case 16:
                                    cryptoOrderDetailsDecode = CryptoOrderDetails.ADAPTER.decode(reader);
                                    continue;
                                case 17:
                                    currencyPairDetailsDecode = CurrencyPairDetails.ADAPTER.decode(reader);
                                    continue;
                                case 18:
                                    orderEarmarkRequestDecode = OrderEarmarkRequest.ADAPTER.decode(reader);
                                    continue;
                                case 19:
                                    cbcTaxLotUpdateEventDecode = CbcTaxLotUpdateEvent.ADAPTER.decode(reader);
                                    continue;
                                case 20:
                                    newAccountDetailsDecode = NewAccountDetails.ADAPTER.decode(reader);
                                    continue;
                                case 21:
                                    depositStatusDetailsDecode = DepositStatusDetails.ADAPTER.decode(reader);
                                    continue;
                                case 22:
                                    assetMigrationDetailsDecode = AssetMigrationDetails.ADAPTER.decode(reader);
                                    continue;
                                case 23:
                                    try {
                                        regionDecode = ActivitySnapshot.Region.ADAPTER.decode(reader);
                                        continue;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                        byteString = byteStringDecode2;
                                        accountType = accountTypeDecode;
                                        region = regionDecode;
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                        break;
                                    }
                                case 24:
                                    placeCryptoOrderErrorDetailsDecode = PlaceCryptoOrderErrorDetails.ADAPTER.decode(reader);
                                    continue;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    byteString = byteStringDecode2;
                                    accountType = accountTypeDecode;
                                    region = regionDecode;
                                    break;
                            }
                            byteStringDecode2 = byteString;
                            accountTypeDecode = accountType;
                            regionDecode = region;
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ActivitySnapshot redact(ActivitySnapshot value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant timestamp = value.getTimestamp();
                Instant instantRedact = timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null;
                List listM26823redactElements = Internal.m26823redactElements(value.getCurrency_movements(), CurrencyMovement.ADAPTER);
                RequestContext request_context = value.getRequest_context();
                RequestContext requestContextRedact = request_context != null ? RequestContext.ADAPTER.redact(request_context) : null;
                CryptoOrderDetails crypto_order_details = value.getCrypto_order_details();
                CryptoOrderDetails cryptoOrderDetailsRedact = crypto_order_details != null ? CryptoOrderDetails.ADAPTER.redact(crypto_order_details) : null;
                CurrencyPairDetails currency_pair_details = value.getCurrency_pair_details();
                CurrencyPairDetails currencyPairDetailsRedact = currency_pair_details != null ? CurrencyPairDetails.ADAPTER.redact(currency_pair_details) : null;
                OrderEarmarkRequest tax_lot_earmark_request = value.getTax_lot_earmark_request();
                OrderEarmarkRequest orderEarmarkRequestRedact = tax_lot_earmark_request != null ? OrderEarmarkRequest.ADAPTER.redact(tax_lot_earmark_request) : null;
                CbcTaxLotUpdateEvent cbc_tax_lot_update_event = value.getCbc_tax_lot_update_event();
                CbcTaxLotUpdateEvent cbcTaxLotUpdateEventRedact = cbc_tax_lot_update_event != null ? CbcTaxLotUpdateEvent.ADAPTER.redact(cbc_tax_lot_update_event) : null;
                NewAccountDetails new_account_details = value.getNew_account_details();
                NewAccountDetails newAccountDetailsRedact = new_account_details != null ? NewAccountDetails.ADAPTER.redact(new_account_details) : null;
                DepositStatusDetails deposit_status_details = value.getDeposit_status_details();
                DepositStatusDetails depositStatusDetailsRedact = deposit_status_details != null ? DepositStatusDetails.ADAPTER.redact(deposit_status_details) : null;
                AssetMigrationDetails asset_migration_details = value.getAsset_migration_details();
                AssetMigrationDetails assetMigrationDetailsRedact = asset_migration_details != null ? AssetMigrationDetails.ADAPTER.redact(asset_migration_details) : null;
                PlaceCryptoOrderErrorDetails place_crypto_order_error_details = value.getPlace_crypto_order_error_details();
                return value.copy((262767 & 1) != 0 ? value.object_id : null, (262767 & 2) != 0 ? value.user_id : null, (262767 & 4) != 0 ? value.account_number : 0L, (262767 & 8) != 0 ? value.type : null, (262767 & 16) != 0 ? value.timestamp : instantRedact, (262767 & 32) != 0 ? value.context : null, (262767 & 64) != 0 ? value.ordering_id : 0L, (262767 & 128) != 0 ? value.currency_movements : listM26823redactElements, (262767 & 256) != 0 ? value.request_context : requestContextRedact, (262767 & 512) != 0 ? value.account_type : null, (262767 & 1024) != 0 ? value.crypto_order_details : cryptoOrderDetailsRedact, (262767 & 2048) != 0 ? value.currency_pair_details : currencyPairDetailsRedact, (262767 & 4096) != 0 ? value.tax_lot_earmark_request : orderEarmarkRequestRedact, (262767 & 8192) != 0 ? value.cbc_tax_lot_update_event : cbcTaxLotUpdateEventRedact, (262767 & 16384) != 0 ? value.new_account_details : newAccountDetailsRedact, (262767 & 32768) != 0 ? value.deposit_status_details : depositStatusDetailsRedact, (262767 & 65536) != 0 ? value.asset_migration_details : assetMigrationDetailsRedact, (262767 & 131072) != 0 ? value.place_crypto_order_error_details : place_crypto_order_error_details != null ? PlaceCryptoOrderErrorDetails.ADAPTER.redact(place_crypto_order_error_details) : null, (262767 & 262144) != 0 ? value.region : null, (262767 & 524288) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ActivitySnapshot.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \u00152\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0015B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/ActivitySnapshot$Type;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TYPE_UNSPECIFIED", "CRYPTO_ORDER", "HOLDING_ADJUSTMENT", "CURRENCY_PAIR_UPDATE", "NEW_CRYPTO_ACCOUNT", "CRYPTO_FIRM_ORDER", "TAX_LOT_EARMARK_REQUEST", "TAX_LOT_UPDATE_EVENT", "TAX_LOT_CLEANUP", "DEPOSIT_STATUS_UPDATE", "ASSET_MIGRATION_UPDATE", "PLACE_CRYPTO_ORDER_ERROR", "Companion", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Type implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Type> ADAPTER;
        public static final Type ASSET_MIGRATION_UPDATE;
        public static final Type CRYPTO_FIRM_ORDER;
        public static final Type CRYPTO_ORDER;
        public static final Type CURRENCY_PAIR_UPDATE;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Type DEPOSIT_STATUS_UPDATE;
        public static final Type HOLDING_ADJUSTMENT;
        public static final Type NEW_CRYPTO_ACCOUNT;
        public static final Type PLACE_CRYPTO_ORDER_ERROR;
        public static final Type TAX_LOT_CLEANUP;
        public static final Type TAX_LOT_EARMARK_REQUEST;
        public static final Type TAX_LOT_UPDATE_EVENT;
        public static final Type TYPE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{TYPE_UNSPECIFIED, CRYPTO_ORDER, HOLDING_ADJUSTMENT, CURRENCY_PAIR_UPDATE, NEW_CRYPTO_ACCOUNT, CRYPTO_FIRM_ORDER, TAX_LOT_EARMARK_REQUEST, TAX_LOT_UPDATE_EVENT, TAX_LOT_CLEANUP, DEPOSIT_STATUS_UPDATE, ASSET_MIGRATION_UPDATE, PLACE_CRYPTO_ORDER_ERROR};
        }

        @JvmStatic
        public static final Type fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        private Type(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Type type2 = new Type("TYPE_UNSPECIFIED", 0, 0);
            TYPE_UNSPECIFIED = type2;
            CRYPTO_ORDER = new Type("CRYPTO_ORDER", 1, 1);
            HOLDING_ADJUSTMENT = new Type("HOLDING_ADJUSTMENT", 2, 2);
            CURRENCY_PAIR_UPDATE = new Type("CURRENCY_PAIR_UPDATE", 3, 3);
            NEW_CRYPTO_ACCOUNT = new Type("NEW_CRYPTO_ACCOUNT", 4, 4);
            CRYPTO_FIRM_ORDER = new Type("CRYPTO_FIRM_ORDER", 5, 5);
            TAX_LOT_EARMARK_REQUEST = new Type("TAX_LOT_EARMARK_REQUEST", 6, 6);
            TAX_LOT_UPDATE_EVENT = new Type("TAX_LOT_UPDATE_EVENT", 7, 7);
            TAX_LOT_CLEANUP = new Type("TAX_LOT_CLEANUP", 8, 8);
            DEPOSIT_STATUS_UPDATE = new Type("DEPOSIT_STATUS_UPDATE", 9, 9);
            ASSET_MIGRATION_UPDATE = new Type("ASSET_MIGRATION_UPDATE", 10, 10);
            PLACE_CRYPTO_ORDER_ERROR = new Type("PLACE_CRYPTO_ORDER_ERROR", 11, 11);
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(typeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Type.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Type>(orCreateKotlinClass, syntax, type2) { // from class: com.robinhood.rosetta.nummus.ActivitySnapshot$Type$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public ActivitySnapshot.Type fromValue(int value) {
                    return ActivitySnapshot.Type.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: ActivitySnapshot.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/ActivitySnapshot$Type$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/nummus/ActivitySnapshot$Type;", "fromValue", "value", "", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Type fromValue(int value) {
                switch (value) {
                    case 0:
                        return Type.TYPE_UNSPECIFIED;
                    case 1:
                        return Type.CRYPTO_ORDER;
                    case 2:
                        return Type.HOLDING_ADJUSTMENT;
                    case 3:
                        return Type.CURRENCY_PAIR_UPDATE;
                    case 4:
                        return Type.NEW_CRYPTO_ACCOUNT;
                    case 5:
                        return Type.CRYPTO_FIRM_ORDER;
                    case 6:
                        return Type.TAX_LOT_EARMARK_REQUEST;
                    case 7:
                        return Type.TAX_LOT_UPDATE_EVENT;
                    case 8:
                        return Type.TAX_LOT_CLEANUP;
                    case 9:
                        return Type.DEPOSIT_STATUS_UPDATE;
                    case 10:
                        return Type.ASSET_MIGRATION_UPDATE;
                    case 11:
                        return Type.PLACE_CRYPTO_ORDER_ERROR;
                    default:
                        return null;
                }
            }
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ActivitySnapshot.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/ActivitySnapshot$Region;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "REGION_UNSPECIFIED", CountryCode.COUNTRY_CODE_US, "EU", "Companion", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Region implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Region[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Region> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;

        /* renamed from: EU */
        public static final Region f6182EU;
        public static final Region REGION_UNSPECIFIED;

        /* renamed from: US */
        public static final Region f6183US;
        private final int value;

        private static final /* synthetic */ Region[] $values() {
            return new Region[]{REGION_UNSPECIFIED, f6183US, f6182EU};
        }

        @JvmStatic
        public static final Region fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Region> getEntries() {
            return $ENTRIES;
        }

        private Region(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Region region = new Region("REGION_UNSPECIFIED", 0, 0);
            REGION_UNSPECIFIED = region;
            f6183US = new Region(CountryCode.COUNTRY_CODE_US, 1, 1);
            f6182EU = new Region("EU", 2, 2);
            Region[] regionArr$values = $values();
            $VALUES = regionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(regionArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Region.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Region>(orCreateKotlinClass, syntax, region) { // from class: com.robinhood.rosetta.nummus.ActivitySnapshot$Region$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public ActivitySnapshot.Region fromValue(int value) {
                    return ActivitySnapshot.Region.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: ActivitySnapshot.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/nummus/ActivitySnapshot$Region$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/nummus/ActivitySnapshot$Region;", "fromValue", "value", "", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Region fromValue(int value) {
                if (value == 0) {
                    return Region.REGION_UNSPECIFIED;
                }
                if (value == 1) {
                    return Region.f6183US;
                }
                if (value != 2) {
                    return null;
                }
                return Region.f6182EU;
            }
        }

        public static Region valueOf(String str) {
            return (Region) Enum.valueOf(Region.class, str);
        }

        public static Region[] values() {
            return (Region[]) $VALUES.clone();
        }
    }
}
