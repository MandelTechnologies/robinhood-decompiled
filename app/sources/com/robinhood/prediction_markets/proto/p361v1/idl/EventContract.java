package com.robinhood.prediction_markets.proto.p361v1.idl;

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

/* compiled from: EventContract.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b2\u0018\u0000 ^2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001^BÁ\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u0016\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010!\u001a\u00020\u0003\u0012\b\b\u0002\u0010\"\u001a\u00020\u001e\u0012\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#\u0012\b\b\u0002\u0010&\u001a\u00020\u001e\u0012\b\b\u0002\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0002H\u0017¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020\u001e2\b\u0010.\u001a\u0004\u0018\u00010-H\u0096\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u000fH\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0003H\u0016¢\u0006\u0004\b3\u00104JÇ\u0002\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\u0010\b\u0002\u0010\u0017\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u00162\u0010\b\u0002\u0010\u0018\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u001e2\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#2\b\b\u0002\u0010&\u001a\u00020\u001e2\b\b\u0002\u0010(\u001a\u00020'¢\u0006\u0004\b5\u00106R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00107\u001a\u0004\b8\u00104R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b9\u00104R\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b:\u00104R\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b;\u00104R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010<\u001a\u0004\b=\u0010>R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b?\u00104R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b@\u00104R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\bA\u00104R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010B\u001a\u0004\bC\u0010DR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010E\u001a\u0004\bF\u0010GR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00107\u001a\u0004\bH\u00104R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00107\u001a\u0004\bI\u00104R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00107\u001a\u0004\bJ\u00104R\u001a\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00107\u001a\u0004\bK\u00104R\"\u0010\u0017\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010L\u001a\u0004\bM\u0010NR\"\u0010\u0018\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010L\u001a\u0004\bO\u0010NR\u001a\u0010\u0019\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u00107\u001a\u0004\bP\u00104R\u001a\u0010\u001b\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010Q\u001a\u0004\bR\u0010SR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u00107\u001a\u0004\bT\u00104R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u00107\u001a\u0004\bU\u00104R\u001a\u0010\u001f\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010V\u001a\u0004\bW\u0010XR\u001c\u0010 \u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u00107\u001a\u0004\bY\u00104R\u001a\u0010!\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u00107\u001a\u0004\bZ\u00104R\u001a\u0010\"\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010V\u001a\u0004\b\"\u0010XR\u001a\u0010&\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010V\u001a\u0004\b&\u0010XR \u0010%\u001a\b\u0012\u0004\u0012\u00020$0#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010[\u001a\u0004\b\\\u0010]¨\u0006_"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/EventContract;", "Lcom/squareup/wire/Message;", "", "", "id", "event_id", "description", "symbol", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventContractTradability;", "tradability", "display_short_name", "display_long_name", "image_url", "Lcom/robinhood/prediction_markets/proto/v1/idl/Color;", ResourceTypes.COLOR, "", "exchange_source", "banner_text", "order_form_background_image_url", "order_receipt_background_image_url", "name", "j$/time/Instant", "Lcom/squareup/wire/Instant;", GovernmentIdNfcScan.expirationDateName, "open_date", "multiplier", "Lcom/robinhood/prediction_markets/proto/v1/idl/ImageStyle;", "image_style", "receipt_shortname", "tertiary_text", "", "disable_header_image_flip", "parent_event_id", "floor_strike_value", "is_team_contract", "", "Lcom/robinhood/prediction_markets/proto/v1/idl/ComboSelectedLeg;", "selected_legs", "is_combo", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/EventContractTradability;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/Color;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/ImageStyle;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/util/List;ZLokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/EventContractTradability;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/Color;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/ImageStyle;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/util/List;ZLokio/ByteString;)Lcom/robinhood/prediction_markets/proto/v1/idl/EventContract;", "Ljava/lang/String;", "getId", "getEvent_id", "getDescription", "getSymbol", "Lcom/robinhood/prediction_markets/proto/v1/idl/EventContractTradability;", "getTradability", "()Lcom/robinhood/prediction_markets/proto/v1/idl/EventContractTradability;", "getDisplay_short_name", "getDisplay_long_name", "getImage_url", "Lcom/robinhood/prediction_markets/proto/v1/idl/Color;", "getColor", "()Lcom/robinhood/prediction_markets/proto/v1/idl/Color;", "Ljava/lang/Integer;", "getExchange_source", "()Ljava/lang/Integer;", "getBanner_text", "getOrder_form_background_image_url", "getOrder_receipt_background_image_url", "getName", "Lj$/time/Instant;", "getExpiration_date", "()Lj$/time/Instant;", "getOpen_date", "getMultiplier", "Lcom/robinhood/prediction_markets/proto/v1/idl/ImageStyle;", "getImage_style", "()Lcom/robinhood/prediction_markets/proto/v1/idl/ImageStyle;", "getReceipt_shortname", "getTertiary_text", "Z", "getDisable_header_image_flip", "()Z", "getParent_event_id", "getFloor_strike_value", "Ljava/util/List;", "getSelected_legs", "()Ljava/util/List;", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class EventContract extends Message {

    @JvmField
    public static final ProtoAdapter<EventContract> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "bannerText", schemaIndex = 10, tag = 11)
    private final String banner_text;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.Color#ADAPTER", schemaIndex = 8, tag = 9)
    private final Color color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "disableHeaderImageFlip", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 20, tag = 21)
    private final boolean disable_header_image_flip;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "displayLongName", schemaIndex = 6, tag = 7)
    private final String display_long_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "displayShortName", schemaIndex = 5, tag = 6)
    private final String display_short_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "eventId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String event_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "exchangeSource", schemaIndex = 9, tag = 10)
    private final Integer exchange_source;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "expirationDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 15)
    private final Instant expiration_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "floorStrikeValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 22, tag = 23)
    private final String floor_strike_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.ImageStyle#ADAPTER", jsonName = "imageStyle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 18)
    private final ImageStyle image_style;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = MarkdownText4.TagImageUrl, schemaIndex = 7, tag = 8)
    private final String image_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isCombo", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 25, tag = 26)
    private final boolean is_combo;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isTeamContract", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 23, tag = 24)
    private final boolean is_team_contract;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 17)
    private final String multiplier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final String name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "openDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 16)
    private final Instant open_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "orderFormBackgroundImageUrl", schemaIndex = 11, tag = 12)
    private final String order_form_background_image_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "orderReceiptBackgroundImageUrl", schemaIndex = 12, tag = 13)
    private final String order_receipt_background_image_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "parentEventId", schemaIndex = 21, tag = 22)
    private final String parent_event_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "receiptShortname", schemaIndex = 18, tag = 19)
    private final String receipt_shortname;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.ComboSelectedLeg#ADAPTER", jsonName = "selectedLegs", label = WireField.Label.REPEATED, schemaIndex = 24, tag = 25)
    private final List<ComboSelectedLeg> selected_legs;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String symbol;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "tertiaryText", schemaIndex = 19, tag = 20)
    private final String tertiary_text;

    @WireField(adapter = "com.robinhood.prediction_markets.proto.v1.idl.EventContractTradability#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final EventContractTradability tradability;

    public EventContract() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, false, null, 134217727, null);
    }

    public /* synthetic */ EventContract(String str, String str2, String str3, String str4, EventContractTradability eventContractTradability, String str5, String str6, String str7, Color color, Integer num, String str8, String str9, String str10, String str11, Instant instant, Instant instant2, String str12, ImageStyle imageStyle, String str13, String str14, boolean z, String str15, String str16, boolean z2, List list, boolean z3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? EventContractTradability.EVENT_CONTRACT_TRADABILITY_UNSPECIFIED : eventContractTradability, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : color, (i & 512) != 0 ? null : num, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : str9, (i & 4096) != 0 ? null : str10, (i & 8192) != 0 ? "" : str11, (i & 16384) != 0 ? null : instant, (i & 32768) != 0 ? null : instant2, (i & 65536) != 0 ? "" : str12, (i & 131072) != 0 ? ImageStyle.IMAGE_STYLE_UNSPECIFIED : imageStyle, (i & 262144) != 0 ? null : str13, (i & 524288) != 0 ? null : str14, (i & 1048576) != 0 ? false : z, (i & 2097152) != 0 ? null : str15, (i & 4194304) == 0 ? str16 : "", (i & 8388608) != 0 ? false : z2, (i & 16777216) != 0 ? CollectionsKt.emptyList() : list, (i & 33554432) == 0 ? z3 : false, (i & 67108864) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23783newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getEvent_id() {
        return this.event_id;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final EventContractTradability getTradability() {
        return this.tradability;
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

    public final Integer getExchange_source() {
        return this.exchange_source;
    }

    public final String getBanner_text() {
        return this.banner_text;
    }

    public final String getOrder_form_background_image_url() {
        return this.order_form_background_image_url;
    }

    public final String getOrder_receipt_background_image_url() {
        return this.order_receipt_background_image_url;
    }

    public final String getName() {
        return this.name;
    }

    public final Instant getExpiration_date() {
        return this.expiration_date;
    }

    public final Instant getOpen_date() {
        return this.open_date;
    }

    public final String getMultiplier() {
        return this.multiplier;
    }

    public final ImageStyle getImage_style() {
        return this.image_style;
    }

    public final String getReceipt_shortname() {
        return this.receipt_shortname;
    }

    public final String getTertiary_text() {
        return this.tertiary_text;
    }

    public final boolean getDisable_header_image_flip() {
        return this.disable_header_image_flip;
    }

    public final String getParent_event_id() {
        return this.parent_event_id;
    }

    public final String getFloor_strike_value() {
        return this.floor_strike_value;
    }

    /* renamed from: is_team_contract, reason: from getter */
    public final boolean getIs_team_contract() {
        return this.is_team_contract;
    }

    /* renamed from: is_combo, reason: from getter */
    public final boolean getIs_combo() {
        return this.is_combo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventContract(String id, String event_id, String description, String symbol, EventContractTradability tradability, String str, String str2, String str3, Color color, Integer num, String str4, String str5, String str6, String name, Instant instant, Instant instant2, String multiplier, ImageStyle image_style, String str7, String str8, boolean z, String str9, String floor_strike_value, boolean z2, List<ComboSelectedLeg> selected_legs, boolean z3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(event_id, "event_id");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(tradability, "tradability");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(multiplier, "multiplier");
        Intrinsics.checkNotNullParameter(image_style, "image_style");
        Intrinsics.checkNotNullParameter(floor_strike_value, "floor_strike_value");
        Intrinsics.checkNotNullParameter(selected_legs, "selected_legs");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.event_id = event_id;
        this.description = description;
        this.symbol = symbol;
        this.tradability = tradability;
        this.display_short_name = str;
        this.display_long_name = str2;
        this.image_url = str3;
        this.color = color;
        this.exchange_source = num;
        this.banner_text = str4;
        this.order_form_background_image_url = str5;
        this.order_receipt_background_image_url = str6;
        this.name = name;
        this.expiration_date = instant;
        this.open_date = instant2;
        this.multiplier = multiplier;
        this.image_style = image_style;
        this.receipt_shortname = str7;
        this.tertiary_text = str8;
        this.disable_header_image_flip = z;
        this.parent_event_id = str9;
        this.floor_strike_value = floor_strike_value;
        this.is_team_contract = z2;
        this.is_combo = z3;
        this.selected_legs = Internal.immutableCopyOf("selected_legs", selected_legs);
    }

    public final List<ComboSelectedLeg> getSelected_legs() {
        return this.selected_legs;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23783newBuilder() {
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
        return Intrinsics.areEqual(unknownFields(), eventContract.unknownFields()) && Intrinsics.areEqual(this.id, eventContract.id) && Intrinsics.areEqual(this.event_id, eventContract.event_id) && Intrinsics.areEqual(this.description, eventContract.description) && Intrinsics.areEqual(this.symbol, eventContract.symbol) && this.tradability == eventContract.tradability && Intrinsics.areEqual(this.display_short_name, eventContract.display_short_name) && Intrinsics.areEqual(this.display_long_name, eventContract.display_long_name) && Intrinsics.areEqual(this.image_url, eventContract.image_url) && Intrinsics.areEqual(this.color, eventContract.color) && Intrinsics.areEqual(this.exchange_source, eventContract.exchange_source) && Intrinsics.areEqual(this.banner_text, eventContract.banner_text) && Intrinsics.areEqual(this.order_form_background_image_url, eventContract.order_form_background_image_url) && Intrinsics.areEqual(this.order_receipt_background_image_url, eventContract.order_receipt_background_image_url) && Intrinsics.areEqual(this.name, eventContract.name) && Intrinsics.areEqual(this.expiration_date, eventContract.expiration_date) && Intrinsics.areEqual(this.open_date, eventContract.open_date) && Intrinsics.areEqual(this.multiplier, eventContract.multiplier) && this.image_style == eventContract.image_style && Intrinsics.areEqual(this.receipt_shortname, eventContract.receipt_shortname) && Intrinsics.areEqual(this.tertiary_text, eventContract.tertiary_text) && this.disable_header_image_flip == eventContract.disable_header_image_flip && Intrinsics.areEqual(this.parent_event_id, eventContract.parent_event_id) && Intrinsics.areEqual(this.floor_strike_value, eventContract.floor_strike_value) && this.is_team_contract == eventContract.is_team_contract && Intrinsics.areEqual(this.selected_legs, eventContract.selected_legs) && this.is_combo == eventContract.is_combo;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.event_id.hashCode()) * 37) + this.description.hashCode()) * 37) + this.symbol.hashCode()) * 37) + this.tradability.hashCode()) * 37;
        String str = this.display_short_name;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.display_long_name;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.image_url;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Color color = this.color;
        int iHashCode5 = (iHashCode4 + (color != null ? color.hashCode() : 0)) * 37;
        Integer num = this.exchange_source;
        int iHashCode6 = (iHashCode5 + (num != null ? num.hashCode() : 0)) * 37;
        String str4 = this.banner_text;
        int iHashCode7 = (iHashCode6 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.order_form_background_image_url;
        int iHashCode8 = (iHashCode7 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.order_receipt_background_image_url;
        int iHashCode9 = (((iHashCode8 + (str6 != null ? str6.hashCode() : 0)) * 37) + this.name.hashCode()) * 37;
        Instant instant = this.expiration_date;
        int iHashCode10 = (iHashCode9 + (instant != null ? instant.hashCode() : 0)) * 37;
        Instant instant2 = this.open_date;
        int iHashCode11 = (((((iHashCode10 + (instant2 != null ? instant2.hashCode() : 0)) * 37) + this.multiplier.hashCode()) * 37) + this.image_style.hashCode()) * 37;
        String str7 = this.receipt_shortname;
        int iHashCode12 = (iHashCode11 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.tertiary_text;
        int iHashCode13 = (((iHashCode12 + (str8 != null ? str8.hashCode() : 0)) * 37) + Boolean.hashCode(this.disable_header_image_flip)) * 37;
        String str9 = this.parent_event_id;
        int iHashCode14 = ((((((((iHashCode13 + (str9 != null ? str9.hashCode() : 0)) * 37) + this.floor_strike_value.hashCode()) * 37) + Boolean.hashCode(this.is_team_contract)) * 37) + this.selected_legs.hashCode()) * 37) + Boolean.hashCode(this.is_combo);
        this.hashCode = iHashCode14;
        return iHashCode14;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("event_id=" + Internal.sanitize(this.event_id));
        arrayList.add("description=" + Internal.sanitize(this.description));
        arrayList.add("symbol=" + Internal.sanitize(this.symbol));
        arrayList.add("tradability=" + this.tradability);
        String str = this.display_short_name;
        if (str != null) {
            arrayList.add("display_short_name=" + Internal.sanitize(str));
        }
        String str2 = this.display_long_name;
        if (str2 != null) {
            arrayList.add("display_long_name=" + Internal.sanitize(str2));
        }
        String str3 = this.image_url;
        if (str3 != null) {
            arrayList.add("image_url=" + Internal.sanitize(str3));
        }
        Color color = this.color;
        if (color != null) {
            arrayList.add("color=" + color);
        }
        Integer num = this.exchange_source;
        if (num != null) {
            arrayList.add("exchange_source=" + num);
        }
        String str4 = this.banner_text;
        if (str4 != null) {
            arrayList.add("banner_text=" + Internal.sanitize(str4));
        }
        String str5 = this.order_form_background_image_url;
        if (str5 != null) {
            arrayList.add("order_form_background_image_url=" + Internal.sanitize(str5));
        }
        String str6 = this.order_receipt_background_image_url;
        if (str6 != null) {
            arrayList.add("order_receipt_background_image_url=" + Internal.sanitize(str6));
        }
        arrayList.add("name=" + Internal.sanitize(this.name));
        Instant instant = this.expiration_date;
        if (instant != null) {
            arrayList.add("expiration_date=" + instant);
        }
        Instant instant2 = this.open_date;
        if (instant2 != null) {
            arrayList.add("open_date=" + instant2);
        }
        arrayList.add("multiplier=" + Internal.sanitize(this.multiplier));
        arrayList.add("image_style=" + this.image_style);
        String str7 = this.receipt_shortname;
        if (str7 != null) {
            arrayList.add("receipt_shortname=" + Internal.sanitize(str7));
        }
        String str8 = this.tertiary_text;
        if (str8 != null) {
            arrayList.add("tertiary_text=" + Internal.sanitize(str8));
        }
        arrayList.add("disable_header_image_flip=" + this.disable_header_image_flip);
        String str9 = this.parent_event_id;
        if (str9 != null) {
            arrayList.add("parent_event_id=" + Internal.sanitize(str9));
        }
        arrayList.add("floor_strike_value=" + Internal.sanitize(this.floor_strike_value));
        arrayList.add("is_team_contract=" + this.is_team_contract);
        if (!this.selected_legs.isEmpty()) {
            arrayList.add("selected_legs=" + this.selected_legs);
        }
        arrayList.add("is_combo=" + this.is_combo);
        return CollectionsKt.joinToString$default(arrayList, ", ", "EventContract{", "}", 0, null, null, 56, null);
    }

    public final EventContract copy(String id, String event_id, String description, String symbol, EventContractTradability tradability, String display_short_name, String display_long_name, String image_url, Color color, Integer exchange_source, String banner_text, String order_form_background_image_url, String order_receipt_background_image_url, String name, Instant expiration_date, Instant open_date, String multiplier, ImageStyle image_style, String receipt_shortname, String tertiary_text, boolean disable_header_image_flip, String parent_event_id, String floor_strike_value, boolean is_team_contract, List<ComboSelectedLeg> selected_legs, boolean is_combo, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(event_id, "event_id");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(tradability, "tradability");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(multiplier, "multiplier");
        Intrinsics.checkNotNullParameter(image_style, "image_style");
        Intrinsics.checkNotNullParameter(floor_strike_value, "floor_strike_value");
        Intrinsics.checkNotNullParameter(selected_legs, "selected_legs");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new EventContract(id, event_id, description, symbol, tradability, display_short_name, display_long_name, image_url, color, exchange_source, banner_text, order_form_background_image_url, order_receipt_background_image_url, name, expiration_date, open_date, multiplier, image_style, receipt_shortname, tertiary_text, disable_header_image_flip, parent_event_id, floor_strike_value, is_team_contract, selected_legs, is_combo, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EventContract.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<EventContract>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.prediction_markets.proto.v1.idl.EventContract$Companion$ADAPTER$1
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
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getSymbol());
                }
                if (value.getTradability() != EventContractTradability.EVENT_CONTRACT_TRADABILITY_UNSPECIFIED) {
                    size += EventContractTradability.ADAPTER.encodedSizeWithTag(5, value.getTradability());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(6, value.getDisplay_short_name()) + protoAdapter.encodedSizeWithTag(7, value.getDisplay_long_name()) + protoAdapter.encodedSizeWithTag(8, value.getImage_url()) + Color.ADAPTER.encodedSizeWithTag(9, value.getColor()) + ProtoAdapter.INT32.encodedSizeWithTag(10, value.getExchange_source()) + protoAdapter.encodedSizeWithTag(11, value.getBanner_text()) + protoAdapter.encodedSizeWithTag(12, value.getOrder_form_background_image_url()) + protoAdapter.encodedSizeWithTag(13, value.getOrder_receipt_background_image_url());
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(14, value.getName());
                }
                if (value.getExpiration_date() != null) {
                    iEncodedSizeWithTag += ProtoAdapter.INSTANT.encodedSizeWithTag(15, value.getExpiration_date());
                }
                if (value.getOpen_date() != null) {
                    iEncodedSizeWithTag += ProtoAdapter.INSTANT.encodedSizeWithTag(16, value.getOpen_date());
                }
                if (!Intrinsics.areEqual(value.getMultiplier(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(17, value.getMultiplier());
                }
                if (value.getImage_style() != ImageStyle.IMAGE_STYLE_UNSPECIFIED) {
                    iEncodedSizeWithTag += ImageStyle.ADAPTER.encodedSizeWithTag(18, value.getImage_style());
                }
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(19, value.getReceipt_shortname()) + protoAdapter.encodedSizeWithTag(20, value.getTertiary_text());
                if (value.getDisable_header_image_flip()) {
                    iEncodedSizeWithTag2 += ProtoAdapter.BOOL.encodedSizeWithTag(21, Boolean.valueOf(value.getDisable_header_image_flip()));
                }
                int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter.encodedSizeWithTag(22, value.getParent_event_id());
                if (!Intrinsics.areEqual(value.getFloor_strike_value(), "")) {
                    iEncodedSizeWithTag3 += protoAdapter.encodedSizeWithTag(23, value.getFloor_strike_value());
                }
                if (value.getIs_team_contract()) {
                    iEncodedSizeWithTag3 += ProtoAdapter.BOOL.encodedSizeWithTag(24, Boolean.valueOf(value.getIs_team_contract()));
                }
                int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + ComboSelectedLeg.ADAPTER.asRepeated().encodedSizeWithTag(25, value.getSelected_legs());
                return value.getIs_combo() ? iEncodedSizeWithTag4 + ProtoAdapter.BOOL.encodedSizeWithTag(26, Boolean.valueOf(value.getIs_combo())) : iEncodedSizeWithTag4;
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
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSymbol());
                }
                if (value.getTradability() != EventContractTradability.EVENT_CONTRACT_TRADABILITY_UNSPECIFIED) {
                    EventContractTradability.ADAPTER.encodeWithTag(writer, 5, (int) value.getTradability());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 6, (int) value.getDisplay_short_name());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getDisplay_long_name());
                protoAdapter.encodeWithTag(writer, 8, (int) value.getImage_url());
                Color.ADAPTER.encodeWithTag(writer, 9, (int) value.getColor());
                ProtoAdapter.INT32.encodeWithTag(writer, 10, (int) value.getExchange_source());
                protoAdapter.encodeWithTag(writer, 11, (int) value.getBanner_text());
                protoAdapter.encodeWithTag(writer, 12, (int) value.getOrder_form_background_image_url());
                protoAdapter.encodeWithTag(writer, 13, (int) value.getOrder_receipt_background_image_url());
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    protoAdapter.encodeWithTag(writer, 14, (int) value.getName());
                }
                if (value.getExpiration_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 15, (int) value.getExpiration_date());
                }
                if (value.getOpen_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 16, (int) value.getOpen_date());
                }
                if (!Intrinsics.areEqual(value.getMultiplier(), "")) {
                    protoAdapter.encodeWithTag(writer, 17, (int) value.getMultiplier());
                }
                if (value.getImage_style() != ImageStyle.IMAGE_STYLE_UNSPECIFIED) {
                    ImageStyle.ADAPTER.encodeWithTag(writer, 18, (int) value.getImage_style());
                }
                protoAdapter.encodeWithTag(writer, 19, (int) value.getReceipt_shortname());
                protoAdapter.encodeWithTag(writer, 20, (int) value.getTertiary_text());
                if (value.getDisable_header_image_flip()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 21, (int) Boolean.valueOf(value.getDisable_header_image_flip()));
                }
                protoAdapter.encodeWithTag(writer, 22, (int) value.getParent_event_id());
                if (!Intrinsics.areEqual(value.getFloor_strike_value(), "")) {
                    protoAdapter.encodeWithTag(writer, 23, (int) value.getFloor_strike_value());
                }
                if (value.getIs_team_contract()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 24, (int) Boolean.valueOf(value.getIs_team_contract()));
                }
                ComboSelectedLeg.ADAPTER.asRepeated().encodeWithTag(writer, 25, (int) value.getSelected_legs());
                if (value.getIs_combo()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 26, (int) Boolean.valueOf(value.getIs_combo()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, EventContract value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getIs_combo()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 26, (int) Boolean.valueOf(value.getIs_combo()));
                }
                ComboSelectedLeg.ADAPTER.asRepeated().encodeWithTag(writer, 25, (int) value.getSelected_legs());
                if (value.getIs_team_contract()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 24, (int) Boolean.valueOf(value.getIs_team_contract()));
                }
                if (!Intrinsics.areEqual(value.getFloor_strike_value(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 23, (int) value.getFloor_strike_value());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 22, (int) value.getParent_event_id());
                if (value.getDisable_header_image_flip()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 21, (int) Boolean.valueOf(value.getDisable_header_image_flip()));
                }
                protoAdapter.encodeWithTag(writer, 20, (int) value.getTertiary_text());
                protoAdapter.encodeWithTag(writer, 19, (int) value.getReceipt_shortname());
                if (value.getImage_style() != ImageStyle.IMAGE_STYLE_UNSPECIFIED) {
                    ImageStyle.ADAPTER.encodeWithTag(writer, 18, (int) value.getImage_style());
                }
                if (!Intrinsics.areEqual(value.getMultiplier(), "")) {
                    protoAdapter.encodeWithTag(writer, 17, (int) value.getMultiplier());
                }
                if (value.getOpen_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 16, (int) value.getOpen_date());
                }
                if (value.getExpiration_date() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 15, (int) value.getExpiration_date());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    protoAdapter.encodeWithTag(writer, 14, (int) value.getName());
                }
                protoAdapter.encodeWithTag(writer, 13, (int) value.getOrder_receipt_background_image_url());
                protoAdapter.encodeWithTag(writer, 12, (int) value.getOrder_form_background_image_url());
                protoAdapter.encodeWithTag(writer, 11, (int) value.getBanner_text());
                ProtoAdapter.INT32.encodeWithTag(writer, 10, (int) value.getExchange_source());
                Color.ADAPTER.encodeWithTag(writer, 9, (int) value.getColor());
                protoAdapter.encodeWithTag(writer, 8, (int) value.getImage_url());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getDisplay_long_name());
                protoAdapter.encodeWithTag(writer, 6, (int) value.getDisplay_short_name());
                if (value.getTradability() != EventContractTradability.EVENT_CONTRACT_TRADABILITY_UNSPECIFIED) {
                    EventContractTradability.ADAPTER.encodeWithTag(writer, 5, (int) value.getTradability());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getDescription());
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
                ArrayList arrayList;
                ImageStyle imageStyle;
                String str;
                Intrinsics.checkNotNullParameter(reader, "reader");
                EventContractTradability eventContractTradability = EventContractTradability.EVENT_CONTRACT_TRADABILITY_UNSPECIFIED;
                ImageStyle imageStyle2 = ImageStyle.IMAGE_STYLE_UNSPECIFIED;
                ArrayList arrayList2 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                EventContractTradability eventContractTradabilityDecode = eventContractTradability;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = null;
                String strDecode7 = null;
                String strDecode8 = null;
                Color colorDecode = null;
                Integer numDecode = null;
                String strDecode9 = null;
                String strDecode10 = null;
                String strDecode11 = null;
                Instant instantDecode = null;
                Instant instantDecode2 = null;
                String strDecode12 = null;
                String strDecode13 = null;
                String strDecode14 = null;
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                boolean zBooleanValue3 = false;
                ImageStyle imageStyleDecode = imageStyle2;
                String strDecode15 = strDecode5;
                String strDecode16 = strDecode15;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new EventContract(strDecode15, strDecode16, strDecode, strDecode2, eventContractTradabilityDecode, strDecode6, strDecode7, strDecode8, colorDecode, numDecode, strDecode9, strDecode10, strDecode11, strDecode3, instantDecode, instantDecode2, strDecode4, imageStyleDecode, strDecode12, strDecode13, zBooleanValue, strDecode14, strDecode5, zBooleanValue2, arrayList2, zBooleanValue3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    switch (iNextTag) {
                        case 1:
                            arrayList = arrayList2;
                            strDecode15 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            arrayList = arrayList2;
                            strDecode16 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 3:
                            arrayList = arrayList2;
                            strDecode = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 4:
                            arrayList = arrayList2;
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 5:
                            arrayList = arrayList2;
                            imageStyle = imageStyleDecode;
                            str = strDecode15;
                            try {
                                eventContractTradabilityDecode = EventContractTradability.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            strDecode15 = str;
                            imageStyleDecode = imageStyle;
                            break;
                        case 6:
                            arrayList = arrayList2;
                            strDecode6 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 7:
                            arrayList = arrayList2;
                            strDecode7 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 8:
                            arrayList = arrayList2;
                            strDecode8 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 9:
                            arrayList = arrayList2;
                            colorDecode = Color.ADAPTER.decode(reader);
                            break;
                        case 10:
                            arrayList = arrayList2;
                            numDecode = ProtoAdapter.INT32.decode(reader);
                            break;
                        case 11:
                            arrayList = arrayList2;
                            strDecode9 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 12:
                            arrayList = arrayList2;
                            strDecode10 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 13:
                            arrayList = arrayList2;
                            strDecode11 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 14:
                            arrayList = arrayList2;
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 15:
                            arrayList = arrayList2;
                            instantDecode = ProtoAdapter.INSTANT.decode(reader);
                            break;
                        case 16:
                            arrayList = arrayList2;
                            instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                            break;
                        case 17:
                            arrayList = arrayList2;
                            strDecode4 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 18:
                            try {
                                imageStyleDecode = ImageStyle.ADAPTER.decode(reader);
                                arrayList = arrayList2;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                arrayList = arrayList2;
                                imageStyle = imageStyleDecode;
                                str = strDecode15;
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                break;
                            }
                        case 19:
                            strDecode12 = ProtoAdapter.STRING.decode(reader);
                            arrayList = arrayList2;
                            break;
                        case 20:
                            strDecode13 = ProtoAdapter.STRING.decode(reader);
                            arrayList = arrayList2;
                            break;
                        case 21:
                            zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            arrayList = arrayList2;
                            break;
                        case 22:
                            strDecode14 = ProtoAdapter.STRING.decode(reader);
                            arrayList = arrayList2;
                            break;
                        case 23:
                            strDecode5 = ProtoAdapter.STRING.decode(reader);
                            arrayList = arrayList2;
                            break;
                        case 24:
                            zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            arrayList = arrayList2;
                            break;
                        case 25:
                            arrayList2.add(ComboSelectedLeg.ADAPTER.decode(reader));
                            arrayList = arrayList2;
                            imageStyle = imageStyleDecode;
                            str = strDecode15;
                            strDecode15 = str;
                            imageStyleDecode = imageStyle;
                            break;
                        case 26:
                            zBooleanValue3 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            arrayList = arrayList2;
                            break;
                        default:
                            reader.readUnknownField(iNextTag);
                            arrayList = arrayList2;
                            imageStyle = imageStyleDecode;
                            str = strDecode15;
                            strDecode15 = str;
                            imageStyleDecode = imageStyle;
                            break;
                    }
                    arrayList2 = arrayList;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public EventContract redact(EventContract value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Color color = value.getColor();
                Color colorRedact = color != null ? Color.ADAPTER.redact(color) : null;
                Instant expiration_date = value.getExpiration_date();
                Instant instantRedact = expiration_date != null ? ProtoAdapter.INSTANT.redact(expiration_date) : null;
                Instant open_date = value.getOpen_date();
                return value.copy((50282239 & 1) != 0 ? value.id : null, (50282239 & 2) != 0 ? value.event_id : null, (50282239 & 4) != 0 ? value.description : null, (50282239 & 8) != 0 ? value.symbol : null, (50282239 & 16) != 0 ? value.tradability : null, (50282239 & 32) != 0 ? value.display_short_name : null, (50282239 & 64) != 0 ? value.display_long_name : null, (50282239 & 128) != 0 ? value.image_url : null, (50282239 & 256) != 0 ? value.color : colorRedact, (50282239 & 512) != 0 ? value.exchange_source : null, (50282239 & 1024) != 0 ? value.banner_text : null, (50282239 & 2048) != 0 ? value.order_form_background_image_url : null, (50282239 & 4096) != 0 ? value.order_receipt_background_image_url : null, (50282239 & 8192) != 0 ? value.name : null, (50282239 & 16384) != 0 ? value.expiration_date : instantRedact, (50282239 & 32768) != 0 ? value.open_date : open_date != null ? ProtoAdapter.INSTANT.redact(open_date) : null, (50282239 & 65536) != 0 ? value.multiplier : null, (50282239 & 131072) != 0 ? value.image_style : null, (50282239 & 262144) != 0 ? value.receipt_shortname : null, (50282239 & 524288) != 0 ? value.tertiary_text : null, (50282239 & 1048576) != 0 ? value.disable_header_image_flip : false, (50282239 & 2097152) != 0 ? value.parent_event_id : null, (50282239 & 4194304) != 0 ? value.floor_strike_value : null, (50282239 & 8388608) != 0 ? value.is_team_contract : false, (50282239 & 16777216) != 0 ? value.selected_legs : Internal.m26823redactElements(value.getSelected_legs(), ComboSelectedLeg.ADAPTER), (50282239 & 33554432) != 0 ? value.is_combo : false, (50282239 & 67108864) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
