package com.robinhood.rosetta.eventlogging;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
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
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import rosetta.option.Direction;
import rosetta.option.OptionOrderFormSource;
import rosetta.order.OrderType;
import rosetta.order.TimeInForce;
import rosetta.order.Trigger;

/* compiled from: OptionOrderPayload.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 =2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001=B±\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u00105\u001a\u00020\u0002H\u0017J\u0013\u00106\u001a\u00020\u00132\b\u00107\u001a\u0004\u0018\u000108H\u0096\u0002J\b\u00109\u001a\u00020:H\u0016J\b\u0010;\u001a\u00020\u0004H\u0016J°\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u001bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0016\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010.R\u0016\u0010\u0015\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0016\u0010\u0017\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001fR\u0016\u0010\u0018\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001fR\u0016\u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001f¨\u0006>"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionOrderPayload;", "Lcom/squareup/wire/Message;", "", "ref_id", "", "account", "legs_str", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "stop_price", "quantity", "time_in_force", "Lrosetta/order/TimeInForce;", "trigger", "Lrosetta/order/Trigger;", "type", "Lrosetta/order/OrderType;", "direction", "Lrosetta/option/Direction;", "override_day_trade_checks", "", "override_dtbp_checks", "form_source", "Lrosetta/option/OptionOrderFormSource;", "client_bid_at_submission", "client_ask_at_submission", "trading_session", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/order/TimeInForce;Lrosetta/order/Trigger;Lrosetta/order/OrderType;Lrosetta/option/Direction;ZZLrosetta/option/OptionOrderFormSource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getRef_id", "()Ljava/lang/String;", "getAccount", "getLegs_str", "getPrice", "getStop_price", "getQuantity", "getTime_in_force", "()Lrosetta/order/TimeInForce;", "getTrigger", "()Lrosetta/order/Trigger;", "getType", "()Lrosetta/order/OrderType;", "getDirection", "()Lrosetta/option/Direction;", "getOverride_day_trade_checks", "()Z", "getOverride_dtbp_checks", "getForm_source", "()Lrosetta/option/OptionOrderFormSource;", "getClient_bid_at_submission", "getClient_ask_at_submission", "getTrading_session", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class OptionOrderPayload extends Message {

    @JvmField
    public static final ProtoAdapter<OptionOrderPayload> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String account;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "clientAskAtSubmission", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 16)
    private final String client_ask_at_submission;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "clientBidAtSubmission", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 15)
    private final String client_bid_at_submission;

    @WireField(adapter = "rosetta.option.Direction#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 11)
    private final Direction direction;

    @WireField(adapter = "rosetta.option.OptionOrderFormSource#ADAPTER", jsonName = "formSource", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 14)
    private final OptionOrderFormSource form_source;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "legsStr", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 4)
    private final String legs_str;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "overrideDayTradeChecks", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 12)
    private final boolean override_day_trade_checks;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "overrideDtbpChecks", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 13)
    private final boolean override_dtbp_checks;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 5)
    private final String price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 7)
    private final String quantity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "refId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String ref_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "stopPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 6)
    private final String stop_price;

    @WireField(adapter = "rosetta.order.TimeInForce#ADAPTER", jsonName = "timeInForce", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 8)
    private final TimeInForce time_in_force;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "tradingSession", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 17)
    private final String trading_session;

    @WireField(adapter = "rosetta.order.Trigger#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 9)
    private final Trigger trigger;

    @WireField(adapter = "rosetta.order.OrderType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 10)
    private final OrderType type;

    public OptionOrderPayload() {
        this(null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, 131071, null);
    }

    public /* synthetic */ OptionOrderPayload(String str, String str2, String str3, String str4, String str5, String str6, TimeInForce timeInForce, Trigger trigger, OrderType orderType, Direction direction, boolean z, boolean z2, OptionOrderFormSource optionOrderFormSource, String str7, String str8, String str9, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? TimeInForce.TIME_IN_FORCE_UNSPECIFIED : timeInForce, (i & 128) != 0 ? Trigger.TRIGGER_UNSPECIFIED : trigger, (i & 256) != 0 ? OrderType.ORDER_TYPE_UNSPECIFIED : orderType, (i & 512) != 0 ? Direction.DIRECTION_UNSPECIFIED : direction, (i & 1024) != 0 ? false : z, (i & 2048) == 0 ? z2 : false, (i & 4096) != 0 ? OptionOrderFormSource.OPTION_ORDER_FORM_SOURCE_UNSPECIFIED : optionOrderFormSource, (i & 8192) != 0 ? "" : str7, (i & 16384) != 0 ? "" : str8, (i & 32768) == 0 ? str9 : "", (i & 65536) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24433newBuilder();
    }

    public final String getRef_id() {
        return this.ref_id;
    }

    public final String getAccount() {
        return this.account;
    }

    public final String getLegs_str() {
        return this.legs_str;
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getStop_price() {
        return this.stop_price;
    }

    public final String getQuantity() {
        return this.quantity;
    }

    public final TimeInForce getTime_in_force() {
        return this.time_in_force;
    }

    public final Trigger getTrigger() {
        return this.trigger;
    }

    public final OrderType getType() {
        return this.type;
    }

    public final Direction getDirection() {
        return this.direction;
    }

    public final boolean getOverride_day_trade_checks() {
        return this.override_day_trade_checks;
    }

    public final boolean getOverride_dtbp_checks() {
        return this.override_dtbp_checks;
    }

    public final OptionOrderFormSource getForm_source() {
        return this.form_source;
    }

    public final String getClient_bid_at_submission() {
        return this.client_bid_at_submission;
    }

    public final String getClient_ask_at_submission() {
        return this.client_ask_at_submission;
    }

    public final String getTrading_session() {
        return this.trading_session;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionOrderPayload(String ref_id, String account, String legs_str, String price, String stop_price, String quantity, TimeInForce time_in_force, Trigger trigger, OrderType type2, Direction direction, boolean z, boolean z2, OptionOrderFormSource form_source, String client_bid_at_submission, String client_ask_at_submission, String trading_session, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(legs_str, "legs_str");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(stop_price, "stop_price");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(form_source, "form_source");
        Intrinsics.checkNotNullParameter(client_bid_at_submission, "client_bid_at_submission");
        Intrinsics.checkNotNullParameter(client_ask_at_submission, "client_ask_at_submission");
        Intrinsics.checkNotNullParameter(trading_session, "trading_session");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.ref_id = ref_id;
        this.account = account;
        this.legs_str = legs_str;
        this.price = price;
        this.stop_price = stop_price;
        this.quantity = quantity;
        this.time_in_force = time_in_force;
        this.trigger = trigger;
        this.type = type2;
        this.direction = direction;
        this.override_day_trade_checks = z;
        this.override_dtbp_checks = z2;
        this.form_source = form_source;
        this.client_bid_at_submission = client_bid_at_submission;
        this.client_ask_at_submission = client_ask_at_submission;
        this.trading_session = trading_session;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24433newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OptionOrderPayload)) {
            return false;
        }
        OptionOrderPayload optionOrderPayload = (OptionOrderPayload) other;
        return Intrinsics.areEqual(unknownFields(), optionOrderPayload.unknownFields()) && Intrinsics.areEqual(this.ref_id, optionOrderPayload.ref_id) && Intrinsics.areEqual(this.account, optionOrderPayload.account) && Intrinsics.areEqual(this.legs_str, optionOrderPayload.legs_str) && Intrinsics.areEqual(this.price, optionOrderPayload.price) && Intrinsics.areEqual(this.stop_price, optionOrderPayload.stop_price) && Intrinsics.areEqual(this.quantity, optionOrderPayload.quantity) && this.time_in_force == optionOrderPayload.time_in_force && this.trigger == optionOrderPayload.trigger && this.type == optionOrderPayload.type && this.direction == optionOrderPayload.direction && this.override_day_trade_checks == optionOrderPayload.override_day_trade_checks && this.override_dtbp_checks == optionOrderPayload.override_dtbp_checks && this.form_source == optionOrderPayload.form_source && Intrinsics.areEqual(this.client_bid_at_submission, optionOrderPayload.client_bid_at_submission) && Intrinsics.areEqual(this.client_ask_at_submission, optionOrderPayload.client_ask_at_submission) && Intrinsics.areEqual(this.trading_session, optionOrderPayload.trading_session);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((((((((((((((((((((unknownFields().hashCode() * 37) + this.ref_id.hashCode()) * 37) + this.account.hashCode()) * 37) + this.legs_str.hashCode()) * 37) + this.price.hashCode()) * 37) + this.stop_price.hashCode()) * 37) + this.quantity.hashCode()) * 37) + this.time_in_force.hashCode()) * 37) + this.trigger.hashCode()) * 37) + this.type.hashCode()) * 37) + this.direction.hashCode()) * 37) + java.lang.Boolean.hashCode(this.override_day_trade_checks)) * 37) + java.lang.Boolean.hashCode(this.override_dtbp_checks)) * 37) + this.form_source.hashCode()) * 37) + this.client_bid_at_submission.hashCode()) * 37) + this.client_ask_at_submission.hashCode()) * 37) + this.trading_session.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ref_id=" + Internal.sanitize(this.ref_id));
        arrayList.add("account=" + Internal.sanitize(this.account));
        arrayList.add("legs_str=" + Internal.sanitize(this.legs_str));
        arrayList.add("price=" + Internal.sanitize(this.price));
        arrayList.add("stop_price=" + Internal.sanitize(this.stop_price));
        arrayList.add("quantity=" + Internal.sanitize(this.quantity));
        arrayList.add("time_in_force=" + this.time_in_force);
        arrayList.add("trigger=" + this.trigger);
        arrayList.add("type=" + this.type);
        arrayList.add("direction=" + this.direction);
        arrayList.add("override_day_trade_checks=" + this.override_day_trade_checks);
        arrayList.add("override_dtbp_checks=" + this.override_dtbp_checks);
        arrayList.add("form_source=" + this.form_source);
        arrayList.add("client_bid_at_submission=" + Internal.sanitize(this.client_bid_at_submission));
        arrayList.add("client_ask_at_submission=" + Internal.sanitize(this.client_ask_at_submission));
        arrayList.add("trading_session=" + Internal.sanitize(this.trading_session));
        return CollectionsKt.joinToString$default(arrayList, ", ", "OptionOrderPayload{", "}", 0, null, null, 56, null);
    }

    public final OptionOrderPayload copy(String ref_id, String account, String legs_str, String price, String stop_price, String quantity, TimeInForce time_in_force, Trigger trigger, OrderType type2, Direction direction, boolean override_day_trade_checks, boolean override_dtbp_checks, OptionOrderFormSource form_source, String client_bid_at_submission, String client_ask_at_submission, String trading_session, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(legs_str, "legs_str");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(stop_price, "stop_price");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(form_source, "form_source");
        Intrinsics.checkNotNullParameter(client_bid_at_submission, "client_bid_at_submission");
        Intrinsics.checkNotNullParameter(client_ask_at_submission, "client_ask_at_submission");
        Intrinsics.checkNotNullParameter(trading_session, "trading_session");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new OptionOrderPayload(ref_id, account, legs_str, price, stop_price, quantity, time_in_force, trigger, type2, direction, override_day_trade_checks, override_dtbp_checks, form_source, client_bid_at_submission, client_ask_at_submission, trading_session, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OptionOrderPayload.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<OptionOrderPayload>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.OptionOrderPayload$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OptionOrderPayload value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getRef_id());
                }
                if (!Intrinsics.areEqual(value.getAccount(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAccount());
                }
                if (!Intrinsics.areEqual(value.getLegs_str(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getLegs_str());
                }
                if (!Intrinsics.areEqual(value.getPrice(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getPrice());
                }
                if (!Intrinsics.areEqual(value.getStop_price(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getStop_price());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getQuantity());
                }
                if (value.getTime_in_force() != TimeInForce.TIME_IN_FORCE_UNSPECIFIED) {
                    size += TimeInForce.ADAPTER.encodedSizeWithTag(8, value.getTime_in_force());
                }
                if (value.getTrigger() != Trigger.TRIGGER_UNSPECIFIED) {
                    size += Trigger.ADAPTER.encodedSizeWithTag(9, value.getTrigger());
                }
                if (value.getType() != OrderType.ORDER_TYPE_UNSPECIFIED) {
                    size += OrderType.ADAPTER.encodedSizeWithTag(10, value.getType());
                }
                if (value.getDirection() != Direction.DIRECTION_UNSPECIFIED) {
                    size += Direction.ADAPTER.encodedSizeWithTag(11, value.getDirection());
                }
                if (value.getOverride_day_trade_checks()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(12, java.lang.Boolean.valueOf(value.getOverride_day_trade_checks()));
                }
                if (value.getOverride_dtbp_checks()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(13, java.lang.Boolean.valueOf(value.getOverride_dtbp_checks()));
                }
                if (value.getForm_source() != OptionOrderFormSource.OPTION_ORDER_FORM_SOURCE_UNSPECIFIED) {
                    size += OptionOrderFormSource.ADAPTER.encodedSizeWithTag(14, value.getForm_source());
                }
                if (!Intrinsics.areEqual(value.getClient_bid_at_submission(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(15, value.getClient_bid_at_submission());
                }
                if (!Intrinsics.areEqual(value.getClient_ask_at_submission(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(16, value.getClient_ask_at_submission());
                }
                return !Intrinsics.areEqual(value.getTrading_session(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(17, value.getTrading_session()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OptionOrderPayload value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRef_id());
                }
                if (!Intrinsics.areEqual(value.getAccount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount());
                }
                if (!Intrinsics.areEqual(value.getLegs_str(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getLegs_str());
                }
                if (!Intrinsics.areEqual(value.getPrice(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getPrice());
                }
                if (!Intrinsics.areEqual(value.getStop_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getStop_price());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getQuantity());
                }
                if (value.getTime_in_force() != TimeInForce.TIME_IN_FORCE_UNSPECIFIED) {
                    TimeInForce.ADAPTER.encodeWithTag(writer, 8, (int) value.getTime_in_force());
                }
                if (value.getTrigger() != Trigger.TRIGGER_UNSPECIFIED) {
                    Trigger.ADAPTER.encodeWithTag(writer, 9, (int) value.getTrigger());
                }
                if (value.getType() != OrderType.ORDER_TYPE_UNSPECIFIED) {
                    OrderType.ADAPTER.encodeWithTag(writer, 10, (int) value.getType());
                }
                if (value.getDirection() != Direction.DIRECTION_UNSPECIFIED) {
                    Direction.ADAPTER.encodeWithTag(writer, 11, (int) value.getDirection());
                }
                if (value.getOverride_day_trade_checks()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 12, (int) java.lang.Boolean.valueOf(value.getOverride_day_trade_checks()));
                }
                if (value.getOverride_dtbp_checks()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 13, (int) java.lang.Boolean.valueOf(value.getOverride_dtbp_checks()));
                }
                if (value.getForm_source() != OptionOrderFormSource.OPTION_ORDER_FORM_SOURCE_UNSPECIFIED) {
                    OptionOrderFormSource.ADAPTER.encodeWithTag(writer, 14, (int) value.getForm_source());
                }
                if (!Intrinsics.areEqual(value.getClient_bid_at_submission(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 15, (int) value.getClient_bid_at_submission());
                }
                if (!Intrinsics.areEqual(value.getClient_ask_at_submission(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 16, (int) value.getClient_ask_at_submission());
                }
                if (!Intrinsics.areEqual(value.getTrading_session(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 17, (int) value.getTrading_session());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OptionOrderPayload value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getTrading_session(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 17, (int) value.getTrading_session());
                }
                if (!Intrinsics.areEqual(value.getClient_ask_at_submission(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 16, (int) value.getClient_ask_at_submission());
                }
                if (!Intrinsics.areEqual(value.getClient_bid_at_submission(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 15, (int) value.getClient_bid_at_submission());
                }
                if (value.getForm_source() != OptionOrderFormSource.OPTION_ORDER_FORM_SOURCE_UNSPECIFIED) {
                    OptionOrderFormSource.ADAPTER.encodeWithTag(writer, 14, (int) value.getForm_source());
                }
                if (value.getOverride_dtbp_checks()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 13, (int) java.lang.Boolean.valueOf(value.getOverride_dtbp_checks()));
                }
                if (value.getOverride_day_trade_checks()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 12, (int) java.lang.Boolean.valueOf(value.getOverride_day_trade_checks()));
                }
                if (value.getDirection() != Direction.DIRECTION_UNSPECIFIED) {
                    Direction.ADAPTER.encodeWithTag(writer, 11, (int) value.getDirection());
                }
                if (value.getType() != OrderType.ORDER_TYPE_UNSPECIFIED) {
                    OrderType.ADAPTER.encodeWithTag(writer, 10, (int) value.getType());
                }
                if (value.getTrigger() != Trigger.TRIGGER_UNSPECIFIED) {
                    Trigger.ADAPTER.encodeWithTag(writer, 9, (int) value.getTrigger());
                }
                if (value.getTime_in_force() != TimeInForce.TIME_IN_FORCE_UNSPECIFIED) {
                    TimeInForce.ADAPTER.encodeWithTag(writer, 8, (int) value.getTime_in_force());
                }
                if (!Intrinsics.areEqual(value.getQuantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getQuantity());
                }
                if (!Intrinsics.areEqual(value.getStop_price(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getStop_price());
                }
                if (!Intrinsics.areEqual(value.getPrice(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getPrice());
                }
                if (!Intrinsics.areEqual(value.getLegs_str(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getLegs_str());
                }
                if (!Intrinsics.areEqual(value.getAccount(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount());
                }
                if (Intrinsics.areEqual(value.getRef_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRef_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public OptionOrderPayload decode(ProtoReader reader) throws IOException {
                Trigger trigger;
                OrderType orderType;
                Direction direction;
                Intrinsics.checkNotNullParameter(reader, "reader");
                TimeInForce timeInForce = TimeInForce.TIME_IN_FORCE_UNSPECIFIED;
                Trigger trigger2 = Trigger.TRIGGER_UNSPECIFIED;
                OrderType orderType2 = OrderType.ORDER_TYPE_UNSPECIFIED;
                Direction direction2 = Direction.DIRECTION_UNSPECIFIED;
                OptionOrderFormSource optionOrderFormSource = OptionOrderFormSource.OPTION_ORDER_FORM_SOURCE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                TimeInForce timeInForceDecode = timeInForce;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                String strDecode7 = strDecode6;
                String strDecode8 = strDecode7;
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                OptionOrderFormSource optionOrderFormSourceDecode = optionOrderFormSource;
                String strDecode9 = strDecode8;
                Direction directionDecode = direction2;
                OrderType orderTypeDecode = orderType2;
                Trigger triggerDecode = trigger2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode9 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                            default:
                                reader.readUnknownField(iNextTag);
                                trigger = triggerDecode;
                                orderType = orderTypeDecode;
                                direction = directionDecode;
                                triggerDecode = trigger;
                                orderTypeDecode = orderType;
                                directionDecode = direction;
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                trigger = triggerDecode;
                                orderType = orderTypeDecode;
                                direction = directionDecode;
                                try {
                                    timeInForceDecode = TimeInForce.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                                triggerDecode = trigger;
                                orderTypeDecode = orderType;
                                directionDecode = direction;
                                break;
                            case 9:
                                trigger = triggerDecode;
                                orderType = orderTypeDecode;
                                direction = directionDecode;
                                try {
                                    triggerDecode = Trigger.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                                orderTypeDecode = orderType;
                                directionDecode = direction;
                                break;
                            case 10:
                                trigger = triggerDecode;
                                orderType = orderTypeDecode;
                                direction = directionDecode;
                                try {
                                    orderTypeDecode = OrderType.ADAPTER.decode(reader);
                                    triggerDecode = trigger;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                    break;
                                }
                                directionDecode = direction;
                                break;
                            case 11:
                                trigger = triggerDecode;
                                orderType = orderTypeDecode;
                                direction = directionDecode;
                                try {
                                    directionDecode = Direction.ADAPTER.decode(reader);
                                    triggerDecode = trigger;
                                    orderTypeDecode = orderType;
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                    break;
                                }
                            case 12:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 13:
                                zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 14:
                                try {
                                    optionOrderFormSourceDecode = OptionOrderFormSource.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                    trigger = triggerDecode;
                                    orderType = orderTypeDecode;
                                    direction = directionDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                                    break;
                                }
                            case 15:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 16:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 17:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                break;
                        }
                    } else {
                        return new OptionOrderPayload(strDecode9, strDecode, strDecode2, strDecode3, strDecode4, strDecode5, timeInForceDecode, triggerDecode, orderTypeDecode, directionDecode, zBooleanValue, zBooleanValue2, optionOrderFormSourceDecode, strDecode6, strDecode7, strDecode8, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OptionOrderPayload redact(OptionOrderPayload value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.copy((Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 1) != 0 ? value.ref_id : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 2) != 0 ? value.account : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 4) != 0 ? value.legs_str : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 8) != 0 ? value.price : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 16) != 0 ? value.stop_price : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 32) != 0 ? value.quantity : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 64) != 0 ? value.time_in_force : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 128) != 0 ? value.trigger : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 256) != 0 ? value.type : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 512) != 0 ? value.direction : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 1024) != 0 ? value.override_day_trade_checks : false, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 2048) != 0 ? value.override_dtbp_checks : false, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 4096) != 0 ? value.form_source : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 8192) != 0 ? value.client_bid_at_submission : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 16384) != 0 ? value.client_ask_at_submission : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 32768) != 0 ? value.trading_session : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 65536) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
