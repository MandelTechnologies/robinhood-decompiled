package com.robinhood.arsenal.proto.p281v1.idl;

import com.robinhood.android.markdown.compose.MarkdownText4;
import com.robinhood.utils.extensions.ResourceTypes;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.GovernmentIdNfcScan;
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
import p479j$.time.Instant;

/* compiled from: EventContract.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b.\u0018\u0000 X2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001XB»\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0013\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0002H\u0017¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)H\u0096\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0013H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0003H\u0016¢\u0006\u0004\b0\u00101JÁ\u0002\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0010\b\u0002\u0010\u001d\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\u0010\b\u0002\u0010\u001e\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\b\b\u0002\u0010\u001f\u001a\u00020\u00132\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010$\u001a\u00020#¢\u0006\u0004\b2\u00103R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b5\u00101R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b6\u00101R\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b7\u00101R\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b8\u00101R\u001a\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b9\u00101R\"\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\b;\u0010<R\"\u0010\f\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\b=\u0010<R\"\u0010\r\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010:\u001a\u0004\b>\u0010<R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010B\u001a\u0004\bC\u0010DR\"\u0010\u0012\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010:\u001a\u0004\bE\u0010<R\u001a\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010F\u001a\u0004\bG\u0010/R\u001a\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00104\u001a\u0004\bH\u00101R\u001a\u0010\u0016\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u00104\u001a\u0004\bI\u00101R\u001a\u0010\u0017\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u00104\u001a\u0004\bJ\u00101R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010K\u001a\u0004\bL\u0010MR\u001a\u0010\u001a\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u00104\u001a\u0004\bN\u00101R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010O\u001a\u0004\bP\u0010QR\"\u0010\u001d\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010:\u001a\u0004\bR\u0010<R\"\u0010\u001e\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010:\u001a\u0004\bS\u0010<R\u001a\u0010\u001f\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010F\u001a\u0004\bT\u0010/R\u001c\u0010 \u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u00104\u001a\u0004\bU\u00101R\u001c\u0010!\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u00104\u001a\u0004\bV\u00101R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u00104\u001a\u0004\bW\u00101¨\u0006Y"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/EventContract;", "Lcom/squareup/wire/Message;", "", "", "id", "event_id", "name", "description", "symbol", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "last_trade_date", GovernmentIdNfcScan.expirationDateName, "customer_last_close_date", "Lcom/robinhood/arsenal/proto/v1/idl/EventContractTradability;", "tradability", "Lcom/robinhood/arsenal/proto/v1/idl/EventContractState;", "state", "open_date", "", "min_contract_quantity", "display_short_name", "display_long_name", "image_url", "Lcom/robinhood/arsenal/proto/v1/idl/Color;", ResourceTypes.COLOR, "multiplier", "Lcom/robinhood/arsenal/proto/v1/idl/Payout;", "payout", "settlement_time", "resolution_time", "exchange_source", "name_prefix", "banner_text", "order_receipt_background_image_url", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/arsenal/proto/v1/idl/EventContractTradability;Lcom/robinhood/arsenal/proto/v1/idl/EventContractState;Lj$/time/Instant;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/Color;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/Payout;Lj$/time/Instant;Lj$/time/Instant;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lcom/robinhood/arsenal/proto/v1/idl/EventContractTradability;Lcom/robinhood/arsenal/proto/v1/idl/EventContractState;Lj$/time/Instant;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/Color;Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/Payout;Lj$/time/Instant;Lj$/time/Instant;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)Lcom/robinhood/arsenal/proto/v1/idl/EventContract;", "Ljava/lang/String;", "getId", "getEvent_id", "getName", "getDescription", "getSymbol", "Lj$/time/Instant;", "getLast_trade_date", "()Lj$/time/Instant;", "getExpiration_date", "getCustomer_last_close_date", "Lcom/robinhood/arsenal/proto/v1/idl/EventContractTradability;", "getTradability", "()Lcom/robinhood/arsenal/proto/v1/idl/EventContractTradability;", "Lcom/robinhood/arsenal/proto/v1/idl/EventContractState;", "getState", "()Lcom/robinhood/arsenal/proto/v1/idl/EventContractState;", "getOpen_date", "I", "getMin_contract_quantity", "getDisplay_short_name", "getDisplay_long_name", "getImage_url", "Lcom/robinhood/arsenal/proto/v1/idl/Color;", "getColor", "()Lcom/robinhood/arsenal/proto/v1/idl/Color;", "getMultiplier", "Lcom/robinhood/arsenal/proto/v1/idl/Payout;", "getPayout", "()Lcom/robinhood/arsenal/proto/v1/idl/Payout;", "getSettlement_time", "getResolution_time", "getExchange_source", "getName_prefix", "getBanner_text", "getOrder_receipt_background_image_url", "Companion", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class EventContract extends Message {

    @JvmField
    public static final ProtoAdapter<EventContract> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "bannerText", schemaIndex = 22, tag = 23)
    private final String banner_text;

    @WireField(adapter = "com.robinhood.arsenal.proto.v1.idl.Color#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 16)
    private final Color color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "customerLastCloseDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final Instant customer_last_close_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "displayLongName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final String display_long_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "displayShortName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final String display_short_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "eventId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String event_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "exchangeSource", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 20, tag = 21)
    private final int exchange_source;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "expirationDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final Instant expiration_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = MarkdownText4.TagImageUrl, label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 15)
    private final String image_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "lastTradeDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Instant last_trade_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "minContractQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final int min_contract_quantity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 17)
    private final String multiplier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "namePrefix", schemaIndex = 21, tag = 22)
    private final String name_prefix;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "openDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final Instant open_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "orderReceiptBackgroundImageUrl", schemaIndex = 23, tag = 24)
    private final String order_receipt_background_image_url;

    @WireField(adapter = "com.robinhood.arsenal.proto.v1.idl.Payout#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 18)
    private final Payout payout;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "resolutionTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 19, tag = 20)
    private final Instant resolution_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "settlementTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 18, tag = 19)
    private final Instant settlement_time;

    @WireField(adapter = "com.robinhood.arsenal.proto.v1.idl.EventContractState#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final EventContractState state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String symbol;

    @WireField(adapter = "com.robinhood.arsenal.proto.v1.idl.EventContractTradability#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final EventContractTradability tradability;

    public EventContract() {
        this(null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, 0, null, null, null, null, 33554431, null);
    }

    public /* synthetic */ EventContract(String str, String str2, String str3, String str4, String str5, Instant instant, Instant instant2, Instant instant3, EventContractTradability eventContractTradability, EventContractState eventContractState, Instant instant4, int i, String str6, String str7, String str8, Color color, String str9, Payout payout, Instant instant5, Instant instant6, int i2, String str10, String str11, String str12, ByteString byteString, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? "" : str4, (i3 & 16) != 0 ? "" : str5, (i3 & 32) != 0 ? null : instant, (i3 & 64) != 0 ? null : instant2, (i3 & 128) != 0 ? null : instant3, (i3 & 256) != 0 ? EventContractTradability.EVENT_CONTRACT_TRADABILITY_UNSPECIFIED : eventContractTradability, (i3 & 512) != 0 ? EventContractState.EVENT_CONTRACT_STATE_UNSPECIFIED : eventContractState, (i3 & 1024) != 0 ? null : instant4, (i3 & 2048) != 0 ? 0 : i, (i3 & 4096) != 0 ? "" : str6, (i3 & 8192) != 0 ? "" : str7, (i3 & 16384) != 0 ? "" : str8, (i3 & 32768) != 0 ? null : color, (i3 & 65536) == 0 ? str9 : "", (i3 & 131072) != 0 ? null : payout, (i3 & 262144) != 0 ? null : instant5, (i3 & 524288) != 0 ? null : instant6, (i3 & 1048576) != 0 ? 0 : i2, (i3 & 2097152) != 0 ? null : str10, (i3 & 4194304) != 0 ? null : str11, (i3 & 8388608) != 0 ? null : str12, (i3 & 16777216) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20127newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getEvent_id() {
        return this.event_id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final Instant getLast_trade_date() {
        return this.last_trade_date;
    }

    public final Instant getExpiration_date() {
        return this.expiration_date;
    }

    public final Instant getCustomer_last_close_date() {
        return this.customer_last_close_date;
    }

    public final EventContractTradability getTradability() {
        return this.tradability;
    }

    public final EventContractState getState() {
        return this.state;
    }

    public final Instant getOpen_date() {
        return this.open_date;
    }

    public final int getMin_contract_quantity() {
        return this.min_contract_quantity;
    }

    public final String getDisplay_short_name() {
        return this.display_short_name;
    }

    public final String getDisplay_long_name() {
        return this.display_long_name;
    }

    public final String getImage_url() {
        return this.image_url;
    }

    public final Color getColor() {
        return this.color;
    }

    public final String getMultiplier() {
        return this.multiplier;
    }

    public final Payout getPayout() {
        return this.payout;
    }

    public final Instant getSettlement_time() {
        return this.settlement_time;
    }

    public final Instant getResolution_time() {
        return this.resolution_time;
    }

    public final int getExchange_source() {
        return this.exchange_source;
    }

    public final String getName_prefix() {
        return this.name_prefix;
    }

    public final String getBanner_text() {
        return this.banner_text;
    }

    public final String getOrder_receipt_background_image_url() {
        return this.order_receipt_background_image_url;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventContract(String id, String event_id, String name, String description, String symbol, Instant instant, Instant instant2, Instant instant3, EventContractTradability tradability, EventContractState state, Instant instant4, int i, String display_short_name, String display_long_name, String image_url, Color color, String multiplier, Payout payout, Instant instant5, Instant instant6, int i2, String str, String str2, String str3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(event_id, "event_id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(tradability, "tradability");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(display_short_name, "display_short_name");
        Intrinsics.checkNotNullParameter(display_long_name, "display_long_name");
        Intrinsics.checkNotNullParameter(image_url, "image_url");
        Intrinsics.checkNotNullParameter(multiplier, "multiplier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.event_id = event_id;
        this.name = name;
        this.description = description;
        this.symbol = symbol;
        this.last_trade_date = instant;
        this.expiration_date = instant2;
        this.customer_last_close_date = instant3;
        this.tradability = tradability;
        this.state = state;
        this.open_date = instant4;
        this.min_contract_quantity = i;
        this.display_short_name = display_short_name;
        this.display_long_name = display_long_name;
        this.image_url = image_url;
        this.color = color;
        this.multiplier = multiplier;
        this.payout = payout;
        this.settlement_time = instant5;
        this.resolution_time = instant6;
        this.exchange_source = i2;
        this.name_prefix = str;
        this.banner_text = str2;
        this.order_receipt_background_image_url = str3;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20127newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof EventContract)) {
            return false;
        }
        EventContract eventContract = (EventContract) other;
        return Intrinsics.areEqual(unknownFields(), eventContract.unknownFields()) && Intrinsics.areEqual(this.id, eventContract.id) && Intrinsics.areEqual(this.event_id, eventContract.event_id) && Intrinsics.areEqual(this.name, eventContract.name) && Intrinsics.areEqual(this.description, eventContract.description) && Intrinsics.areEqual(this.symbol, eventContract.symbol) && Intrinsics.areEqual(this.last_trade_date, eventContract.last_trade_date) && Intrinsics.areEqual(this.expiration_date, eventContract.expiration_date) && Intrinsics.areEqual(this.customer_last_close_date, eventContract.customer_last_close_date) && this.tradability == eventContract.tradability && this.state == eventContract.state && Intrinsics.areEqual(this.open_date, eventContract.open_date) && this.min_contract_quantity == eventContract.min_contract_quantity && Intrinsics.areEqual(this.display_short_name, eventContract.display_short_name) && Intrinsics.areEqual(this.display_long_name, eventContract.display_long_name) && Intrinsics.areEqual(this.image_url, eventContract.image_url) && Intrinsics.areEqual(this.color, eventContract.color) && Intrinsics.areEqual(this.multiplier, eventContract.multiplier) && Intrinsics.areEqual(this.payout, eventContract.payout) && Intrinsics.areEqual(this.settlement_time, eventContract.settlement_time) && Intrinsics.areEqual(this.resolution_time, eventContract.resolution_time) && this.exchange_source == eventContract.exchange_source && Intrinsics.areEqual(this.name_prefix, eventContract.name_prefix) && Intrinsics.areEqual(this.banner_text, eventContract.banner_text) && Intrinsics.areEqual(this.order_receipt_background_image_url, eventContract.order_receipt_background_image_url);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.event_id.hashCode()) * 37) + this.name.hashCode()) * 37) + this.description.hashCode()) * 37) + this.symbol.hashCode()) * 37;
        Instant instant = this.last_trade_date;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        Instant instant2 = this.expiration_date;
        int iHashCode3 = (iHashCode2 + (instant2 != null ? instant2.hashCode() : 0)) * 37;
        Instant instant3 = this.customer_last_close_date;
        int iHashCode4 = (((((iHashCode3 + (instant3 != null ? instant3.hashCode() : 0)) * 37) + this.tradability.hashCode()) * 37) + this.state.hashCode()) * 37;
        Instant instant4 = this.open_date;
        int iHashCode5 = (((((((((iHashCode4 + (instant4 != null ? instant4.hashCode() : 0)) * 37) + Integer.hashCode(this.min_contract_quantity)) * 37) + this.display_short_name.hashCode()) * 37) + this.display_long_name.hashCode()) * 37) + this.image_url.hashCode()) * 37;
        Color color = this.color;
        int iHashCode6 = (((iHashCode5 + (color != null ? color.hashCode() : 0)) * 37) + this.multiplier.hashCode()) * 37;
        Payout payout = this.payout;
        int iHashCode7 = (iHashCode6 + (payout != null ? payout.hashCode() : 0)) * 37;
        Instant instant5 = this.settlement_time;
        int iHashCode8 = (iHashCode7 + (instant5 != null ? instant5.hashCode() : 0)) * 37;
        Instant instant6 = this.resolution_time;
        int iHashCode9 = (((iHashCode8 + (instant6 != null ? instant6.hashCode() : 0)) * 37) + Integer.hashCode(this.exchange_source)) * 37;
        String str = this.name_prefix;
        int iHashCode10 = (iHashCode9 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.banner_text;
        int iHashCode11 = (iHashCode10 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.order_receipt_background_image_url;
        int iHashCode12 = iHashCode11 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode12;
        return iHashCode12;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("event_id=" + Internal.sanitize(this.event_id));
        arrayList.add("name=" + Internal.sanitize(this.name));
        arrayList.add("description=" + Internal.sanitize(this.description));
        arrayList.add("symbol=" + Internal.sanitize(this.symbol));
        Instant instant = this.last_trade_date;
        if (instant != null) {
            arrayList.add("last_trade_date=" + instant);
        }
        Instant instant2 = this.expiration_date;
        if (instant2 != null) {
            arrayList.add("expiration_date=" + instant2);
        }
        Instant instant3 = this.customer_last_close_date;
        if (instant3 != null) {
            arrayList.add("customer_last_close_date=" + instant3);
        }
        arrayList.add("tradability=" + this.tradability);
        arrayList.add("state=" + this.state);
        Instant instant4 = this.open_date;
        if (instant4 != null) {
            arrayList.add("open_date=" + instant4);
        }
        arrayList.add("min_contract_quantity=" + this.min_contract_quantity);
        arrayList.add("display_short_name=" + Internal.sanitize(this.display_short_name));
        arrayList.add("display_long_name=" + Internal.sanitize(this.display_long_name));
        arrayList.add("image_url=" + Internal.sanitize(this.image_url));
        Color color = this.color;
        if (color != null) {
            arrayList.add("color=" + color);
        }
        arrayList.add("multiplier=" + Internal.sanitize(this.multiplier));
        Payout payout = this.payout;
        if (payout != null) {
            arrayList.add("payout=" + payout);
        }
        Instant instant5 = this.settlement_time;
        if (instant5 != null) {
            arrayList.add("settlement_time=" + instant5);
        }
        Instant instant6 = this.resolution_time;
        if (instant6 != null) {
            arrayList.add("resolution_time=" + instant6);
        }
        arrayList.add("exchange_source=" + this.exchange_source);
        String str = this.name_prefix;
        if (str != null) {
            arrayList.add("name_prefix=" + Internal.sanitize(str));
        }
        String str2 = this.banner_text;
        if (str2 != null) {
            arrayList.add("banner_text=" + Internal.sanitize(str2));
        }
        String str3 = this.order_receipt_background_image_url;
        if (str3 != null) {
            arrayList.add("order_receipt_background_image_url=" + Internal.sanitize(str3));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EventContract{", "}", 0, null, null, 56, null);
    }

    public final EventContract copy(String id, String event_id, String name, String description, String symbol, Instant last_trade_date, Instant expiration_date, Instant customer_last_close_date, EventContractTradability tradability, EventContractState state, Instant open_date, int min_contract_quantity, String display_short_name, String display_long_name, String image_url, Color color, String multiplier, Payout payout, Instant settlement_time, Instant resolution_time, int exchange_source, String name_prefix, String banner_text, String order_receipt_background_image_url, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(event_id, "event_id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(tradability, "tradability");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(display_short_name, "display_short_name");
        Intrinsics.checkNotNullParameter(display_long_name, "display_long_name");
        Intrinsics.checkNotNullParameter(image_url, "image_url");
        Intrinsics.checkNotNullParameter(multiplier, "multiplier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new EventContract(id, event_id, name, description, symbol, last_trade_date, expiration_date, customer_last_close_date, tradability, state, open_date, min_contract_quantity, display_short_name, display_long_name, image_url, color, multiplier, payout, settlement_time, resolution_time, exchange_source, name_prefix, banner_text, order_receipt_background_image_url, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EventContract.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<EventContract>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.arsenal.proto.v1.idl.EventContract$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(EventContract value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getEvent_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getEvent_id());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getName());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getSymbol());
                }
                if (value.getLast_trade_date() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(6, value.getLast_trade_date());
                }
                if (value.getExpiration_date() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(7, value.getExpiration_date());
                }
                if (value.getCustomer_last_close_date() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(8, value.getCustomer_last_close_date());
                }
                if (value.getTradability() != EventContractTradability.EVENT_CONTRACT_TRADABILITY_UNSPECIFIED) {
                    size += EventContractTradability.ADAPTER.encodedSizeWithTag(9, value.getTradability());
                }
                if (value.getState() != EventContractState.EVENT_CONTRACT_STATE_UNSPECIFIED) {
                    size += EventContractState.ADAPTER.encodedSizeWithTag(10, value.getState());
                }
                if (value.getOpen_date() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(11, value.getOpen_date());
                }
                if (value.getMin_contract_quantity() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(12, Integer.valueOf(value.getMin_contract_quantity()));
                }
                if (!Intrinsics.areEqual(value.getDisplay_short_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(13, value.getDisplay_short_name());
                }
                if (!Intrinsics.areEqual(value.getDisplay_long_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(14, value.getDisplay_long_name());
                }
                if (!Intrinsics.areEqual(value.getImage_url(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(15, value.getImage_url());
                }
                if (value.getColor() != null) {
                    size += Color.ADAPTER.encodedSizeWithTag(16, value.getColor());
                }
                if (!Intrinsics.areEqual(value.getMultiplier(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(17, value.getMultiplier());
                }
                if (value.getPayout() != null) {
                    size += Payout.ADAPTER.encodedSizeWithTag(18, value.getPayout());
                }
                if (value.getSettlement_time() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(19, value.getSettlement_time());
                }
                if (value.getResolution_time() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(20, value.getResolution_time());
                }
                if (value.getExchange_source() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(21, Integer.valueOf(value.getExchange_source()));
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return size + protoAdapter.encodedSizeWithTag(22, value.getName_prefix()) + protoAdapter.encodedSizeWithTag(23, value.getBanner_text()) + protoAdapter.encodedSizeWithTag(24, value.getOrder_receipt_background_image_url());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, EventContract value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getEvent_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getEvent_id());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getName());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getSymbol());
                }
                if (value.getLast_trade_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 6, (int) value.getLast_trade_date());
                }
                if (value.getExpiration_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 7, (int) value.getExpiration_date());
                }
                if (value.getCustomer_last_close_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 8, (int) value.getCustomer_last_close_date());
                }
                if (value.getTradability() != EventContractTradability.EVENT_CONTRACT_TRADABILITY_UNSPECIFIED) {
                    EventContractTradability.ADAPTER.encodeWithTag(writer, 9, (int) value.getTradability());
                }
                if (value.getState() != EventContractState.EVENT_CONTRACT_STATE_UNSPECIFIED) {
                    EventContractState.ADAPTER.encodeWithTag(writer, 10, (int) value.getState());
                }
                if (value.getOpen_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 11, (int) value.getOpen_date());
                }
                if (value.getMin_contract_quantity() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 12, (int) Integer.valueOf(value.getMin_contract_quantity()));
                }
                if (!Intrinsics.areEqual(value.getDisplay_short_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getDisplay_short_name());
                }
                if (!Intrinsics.areEqual(value.getDisplay_long_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 14, (int) value.getDisplay_long_name());
                }
                if (!Intrinsics.areEqual(value.getImage_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 15, (int) value.getImage_url());
                }
                if (value.getColor() != null) {
                    Color.ADAPTER.encodeWithTag(writer, 16, (int) value.getColor());
                }
                if (!Intrinsics.areEqual(value.getMultiplier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 17, (int) value.getMultiplier());
                }
                if (value.getPayout() != null) {
                    Payout.ADAPTER.encodeWithTag(writer, 18, (int) value.getPayout());
                }
                if (value.getSettlement_time() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 19, (int) value.getSettlement_time());
                }
                if (value.getResolution_time() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 20, (int) value.getResolution_time());
                }
                if (value.getExchange_source() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 21, (int) Integer.valueOf(value.getExchange_source()));
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 22, (int) value.getName_prefix());
                protoAdapter.encodeWithTag(writer, 23, (int) value.getBanner_text());
                protoAdapter.encodeWithTag(writer, 24, (int) value.getOrder_receipt_background_image_url());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, EventContract value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 24, (int) value.getOrder_receipt_background_image_url());
                protoAdapter.encodeWithTag(writer, 23, (int) value.getBanner_text());
                protoAdapter.encodeWithTag(writer, 22, (int) value.getName_prefix());
                if (value.getExchange_source() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 21, (int) Integer.valueOf(value.getExchange_source()));
                }
                if (value.getResolution_time() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 20, (int) value.getResolution_time());
                }
                if (value.getSettlement_time() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 19, (int) value.getSettlement_time());
                }
                if (value.getPayout() != null) {
                    Payout.ADAPTER.encodeWithTag(writer, 18, (int) value.getPayout());
                }
                if (!Intrinsics.areEqual(value.getMultiplier(), "")) {
                    protoAdapter.encodeWithTag(writer, 17, (int) value.getMultiplier());
                }
                if (value.getColor() != null) {
                    Color.ADAPTER.encodeWithTag(writer, 16, (int) value.getColor());
                }
                if (!Intrinsics.areEqual(value.getImage_url(), "")) {
                    protoAdapter.encodeWithTag(writer, 15, (int) value.getImage_url());
                }
                if (!Intrinsics.areEqual(value.getDisplay_long_name(), "")) {
                    protoAdapter.encodeWithTag(writer, 14, (int) value.getDisplay_long_name());
                }
                if (!Intrinsics.areEqual(value.getDisplay_short_name(), "")) {
                    protoAdapter.encodeWithTag(writer, 13, (int) value.getDisplay_short_name());
                }
                if (value.getMin_contract_quantity() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 12, (int) Integer.valueOf(value.getMin_contract_quantity()));
                }
                if (value.getOpen_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 11, (int) value.getOpen_date());
                }
                if (value.getState() != EventContractState.EVENT_CONTRACT_STATE_UNSPECIFIED) {
                    EventContractState.ADAPTER.encodeWithTag(writer, 10, (int) value.getState());
                }
                if (value.getTradability() != EventContractTradability.EVENT_CONTRACT_TRADABILITY_UNSPECIFIED) {
                    EventContractTradability.ADAPTER.encodeWithTag(writer, 9, (int) value.getTradability());
                }
                if (value.getCustomer_last_close_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 8, (int) value.getCustomer_last_close_date());
                }
                if (value.getExpiration_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 7, (int) value.getExpiration_date());
                }
                if (value.getLast_trade_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 6, (int) value.getLast_trade_date());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getName());
                }
                if (!Intrinsics.areEqual(value.getEvent_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getEvent_id());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public EventContract decode(ProtoReader reader) throws IOException {
                EventContractState eventContractState;
                String str;
                String str2;
                Intrinsics.checkNotNullParameter(reader, "reader");
                EventContractTradability eventContractTradability = EventContractTradability.EVENT_CONTRACT_TRADABILITY_UNSPECIFIED;
                EventContractState eventContractState2 = EventContractState.EVENT_CONTRACT_STATE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                EventContractTradability eventContractTradabilityDecode = eventContractTradability;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                String strDecode7 = strDecode6;
                Instant instantDecode = null;
                Instant instantDecode2 = null;
                Instant instantDecode3 = null;
                Instant instantDecode4 = null;
                Color colorDecode = null;
                Payout payoutDecode = null;
                Instant instantDecode5 = null;
                Instant instantDecode6 = null;
                String strDecode8 = null;
                String strDecode9 = null;
                String strDecode10 = null;
                int iIntValue = 0;
                int iIntValue2 = 0;
                EventContractState eventContractStateDecode = eventContractState2;
                String strDecode11 = strDecode7;
                String strDecode12 = strDecode11;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode11 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 2:
                                strDecode12 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 3:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 5:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 6:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                continue;
                            case 7:
                                instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                                continue;
                            case 8:
                                instantDecode3 = ProtoAdapter.INSTANT.decode(reader);
                                continue;
                            case 9:
                                eventContractState = eventContractStateDecode;
                                str = strDecode11;
                                str2 = strDecode12;
                                try {
                                    eventContractTradabilityDecode = EventContractTradability.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 10:
                                try {
                                    eventContractStateDecode = EventContractState.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    eventContractState = eventContractStateDecode;
                                    str = strDecode11;
                                    str2 = strDecode12;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 11:
                                instantDecode4 = ProtoAdapter.INSTANT.decode(reader);
                                continue;
                            case 12:
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                continue;
                            case 13:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 14:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 15:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 16:
                                colorDecode = Color.ADAPTER.decode(reader);
                                continue;
                            case 17:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 18:
                                payoutDecode = Payout.ADAPTER.decode(reader);
                                continue;
                            case 19:
                                instantDecode5 = ProtoAdapter.INSTANT.decode(reader);
                                continue;
                            case 20:
                                instantDecode6 = ProtoAdapter.INSTANT.decode(reader);
                                continue;
                            case 21:
                                iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                                continue;
                            case 22:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 23:
                                strDecode9 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 24:
                                strDecode10 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            default:
                                reader.readUnknownField(iNextTag);
                                eventContractState = eventContractStateDecode;
                                str = strDecode11;
                                str2 = strDecode12;
                                break;
                        }
                        eventContractStateDecode = eventContractState;
                        strDecode11 = str;
                        strDecode12 = str2;
                    } else {
                        return new EventContract(strDecode11, strDecode12, strDecode, strDecode2, strDecode3, instantDecode, instantDecode2, instantDecode3, eventContractTradabilityDecode, eventContractStateDecode, instantDecode4, iIntValue, strDecode4, strDecode5, strDecode6, colorDecode, strDecode7, payoutDecode, instantDecode5, instantDecode6, iIntValue2, strDecode8, strDecode9, strDecode10, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public EventContract redact(EventContract value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant last_trade_date = value.getLast_trade_date();
                Instant instantRedact = last_trade_date != null ? ProtoAdapter.INSTANT.redact(last_trade_date) : null;
                Instant expiration_date = value.getExpiration_date();
                Instant instantRedact2 = expiration_date != null ? ProtoAdapter.INSTANT.redact(expiration_date) : null;
                Instant customer_last_close_date = value.getCustomer_last_close_date();
                Instant instantRedact3 = customer_last_close_date != null ? ProtoAdapter.INSTANT.redact(customer_last_close_date) : null;
                Instant open_date = value.getOpen_date();
                Instant instantRedact4 = open_date != null ? ProtoAdapter.INSTANT.redact(open_date) : null;
                Color color = value.getColor();
                Color colorRedact = color != null ? Color.ADAPTER.redact(color) : null;
                Payout payout = value.getPayout();
                Payout payoutRedact = payout != null ? Payout.ADAPTER.redact(payout) : null;
                Instant settlement_time = value.getSettlement_time();
                Instant instantRedact5 = settlement_time != null ? ProtoAdapter.INSTANT.redact(settlement_time) : null;
                Instant resolution_time = value.getResolution_time();
                return value.copy((15825695 & 1) != 0 ? value.id : null, (15825695 & 2) != 0 ? value.event_id : null, (15825695 & 4) != 0 ? value.name : null, (15825695 & 8) != 0 ? value.description : null, (15825695 & 16) != 0 ? value.symbol : null, (15825695 & 32) != 0 ? value.last_trade_date : instantRedact, (15825695 & 64) != 0 ? value.expiration_date : instantRedact2, (15825695 & 128) != 0 ? value.customer_last_close_date : instantRedact3, (15825695 & 256) != 0 ? value.tradability : null, (15825695 & 512) != 0 ? value.state : null, (15825695 & 1024) != 0 ? value.open_date : instantRedact4, (15825695 & 2048) != 0 ? value.min_contract_quantity : 0, (15825695 & 4096) != 0 ? value.display_short_name : null, (15825695 & 8192) != 0 ? value.display_long_name : null, (15825695 & 16384) != 0 ? value.image_url : null, (15825695 & 32768) != 0 ? value.color : colorRedact, (15825695 & 65536) != 0 ? value.multiplier : null, (15825695 & 131072) != 0 ? value.payout : payoutRedact, (15825695 & 262144) != 0 ? value.settlement_time : instantRedact5, (15825695 & 524288) != 0 ? value.resolution_time : resolution_time != null ? ProtoAdapter.INSTANT.redact(resolution_time) : null, (15825695 & 1048576) != 0 ? value.exchange_source : 0, (15825695 & 2097152) != 0 ? value.name_prefix : null, (15825695 & 4194304) != 0 ? value.banner_text : null, (15825695 & 8388608) != 0 ? value.order_receipt_background_image_url : null, (15825695 & 16777216) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
